import java.util.Scanner;
class StudentService{
                long id=1L;
                int age;
                long phNumber;
                String sName;
                String sGender;
                String sEmailId;
                String sCourse;
                String sQualification;
                String sPassword;
                Student studentList[]= new Student[30];
                Scanner scan=new Scanner(System.in);
                int idx=0;
                
                
       void addStudentDetails(){
               if(idx<30){
                Student std=new Student();
                scan.nextLine();
                System.out.println("Enter student name");
                sName=scan.nextLine();
                System.out.println("Enter student age");
                age=scan.nextInt();
                scan.nextLine();
                System.out.println("Enter student gender");
                sGender=scan.nextLine();
                System.out.println("Enter student qualification");
                sQualification=scan.nextLine();
                System.out.println("Enter student course name");
                sCourse=scan.nextLine();
                System.out.println("Enter student email id");
                sEmailId=scan.nextLine();
                System.out.println("Enter student phone number");
                phNumber=scan.nextLong();
                System.out.println("Enter student Email ID password");
                scan.nextLine();
                sPassword=scan.nextLine();
                
                std.studentName=sName;
                std.studentId=id;
                std.studentAge=age;
                std.phoneNumber=phNumber;
                std.gender=sGender;
                std.courseName=sCourse;
                std.qualification=sQualification;
                std.emailId=sEmailId;
                std.password=sPassword;
                
                studentList[idx]=std;
                idx++;
                id++;
               }
               else{
                    System.out.println("*********Storage Full************");
                   }
             }

       void displayDetails(){
                       if(idx>0){
                                 
                                  for(int i=0;i<idx;i++){
                                                studentList[i].displayStudentDetails();
                                   }
                                 }
                
                       else{
                               System.out.println("##############There is no student details##############");
                           }
           }

         
      void searchByNames(){
                if(idx>0){
                int c=0;
                String name;
                System.out.println("Enter student name to search");
                scan.nextLine();
                name=scan.nextLine();
                for(int i=0;i<idx;i++){
                               if(studentList[i].studentName.equalsIgnoreCase(name))
                                           {
                                            studentList[i].displayStudentDetails();
                                            c++;
                                            break;
                                 }
                    }

                   if (c==0){
                              System.out.println("############There is no student with name "+name+"###############");
                            } 
                }
                else{
                      System.out.println("#############There is no student details#############");
                    }
       }
   

      void searchById(){
                   if(idx>0){
                              int num;
                              System.out.println("Enter student ID to search");
                              num=scan.nextInt();
                            if((num>0)  &&  (num<31)){
                              studentList[num-1].displayStudentDetails();
                              }
                            else{
                                  System.out.println("############There is no student with ID number"+num+"#############");
                                 }
                            }
                   else{
                         System.out.println("##############There is no student details##############");
                       }
              }       

       void searchByAge(){
                       if(idx>0){
                                 int sAge,c=0;
                                 System.out.println("Enter age to find the similar age grouped students");
                                 sAge=scan.nextInt();
                                 for(int i=0;i<idx;i++){
                                              if(studentList[i].studentAge==sAge){
                                                     studentList[i].displayStudentDetails();
                                                     c++;
                                               }
                                    }
                                 if(c>0){
                                            System.out.println("There are "+c+" students with age "+sAge);
                                        }
                                 else{
                                         System.out.println("###########There are no student details found of age "+sAge+" ############");
                                   }
                        }

                       else{
                            System.out.println("#############There is no student deatils##############");
                           }
              }


        void searchByGender(){
                              if(idx>0){
                                          int c=0;
                                          String g;
                                          System.out.println("Enter gender to search");
                                          scan.nextLine();
                                          g=scan.nextLine();
                                          for(int i=0;i<idx;i++){
                                                         if(studentList[i].gender.equalsIgnoreCase(g)){
                                                                          studentList[i].displayStudentDetails();
                                                                          c++;
                                                                    }
                                             }
                                           if(c>0){
                                                    System.out.println("\nThere are "+c+" "+g+" students");
                                                  }
                                           else{
                                                    System.out.println("\n############There are no student details found with "+g+" gender#############");
                                               }
                                }
                              else{
                                    System.out.println("\n#############There is no student deatils################");
                                  }
   
                 }
   
        void searchByCourse(){
                               if(idx>0){
                                         int c=0;
                                         String crs;
                                         System.out.println("Enter course name to search");
                                         scan.nextLine();
                                         crs=scan.nextLine();
                                         for(int i=0;i<idx;i++){
                                                       if(studentList[i].courseName.equalsIgnoreCase(crs)){
                                                                     studentList[i].displayStudentDetails();
                                                                     c++;
                                                                }
                                                }
                                         if(c>0){
                                                   System.out.println("There are "+c+" students, who choosed "+crs+" course");
                                                }
                                         else{
                                               System.out.println("############There are no student details found with "+crs+" course############");
                                             }
                                }
                               else{
                                      System.out.println("#############There is no student details###############");
                                    }
            }

       void searchByQualification(){
                                      if(idx>0){
                                                 int c=0;
                                                 String q;
                                                 System.out.println("Enter qualification to search");
                                                 scan.nextLine();
                                                 q=scan.nextLine();
                                                 for(int i=0;i<idx;i++){
                                                             if(studentList[i].qualification.equalsIgnoreCase(q)){
                                                                    studentList[i].displayStudentDetails();
                                                                    c++;
                                                               }
                                                     }
                                                 if(c>0){
                                                          System.out.println("There are "+c+" students who qualified "+q);
                                                        }
                                                 else{
                                                          System.out.println("############There are no student details found with "+q+" Qualification############");
                                                     }
                                         }
                                      else{
                                             System.out.println("##############There is no student details################");
                                           }
                                           
               }

       void login(){   
                      if(idx>0){
                        int c=0;
                        String passWord,mailId;
                        scan.nextLine();
                        System.out.println("Enter your Email ID ");
                        mailId=scan.nextLine();
                        for(int i=0;i<idx;i++){
                                           if(studentList[i].emailId.equalsIgnoreCase(mailId)){
                                                              c++;
                                                              System.out.println("Enter your password");
                                                              passWord=scan.nextLine();
                                                              if(studentList[i].password.equals(passWord)){
                                                                    System.out.println("\nLogin Successful\n\nWelcome To Tech Mahindra Smart Academy");
                                                                    System.out.println("\nStudent ID  :  "+studentList[i].studentId);
                                                                    System.out.println("\nStudent Name  :  "+studentList[i].studentName);
                                                                    System.out.println("\nStudent Qualification  :  "+studentList[i].qualification); 
                                                                    System.out.println("\nElected course  :  "+studentList[i].courseName);
                                                                    System.out.println("\nStudent phone number  :  "+studentList[i].phoneNumber);                
                                                                 }
                                                              else{ 
                                                                    System.out.println("#############Sorry you have entered incorrect password#############");
                                                                   }                                                            
                                                              break;
                                               }
                          }
                         if(c==0){
                                   System.out.println("##############Sorry you have entered incorrect mail ID##############");
                                 }
                      }
                     else{
                            System.out.println("################There is no student details################");
                         }
           }


      void editDetails(){
                                   if(idx>0){
                                                   int id,n;
                                                   System.out.println("Enter your ID number");
                                                   id=scan.nextInt();
                                                   if(id<=idx){
                                                   System.out.println("Enter 1 to change name");
                                                   System.out.println("Enter 2 to change gender");
                                                   System.out.println("Enter 3 to change phone number");
                                                   System.out.println("Enter 4 to change qualification");
                                                   System.out.println("Enter 5 to change email id");
                                                   System.out.println("Enter 6 to change age");
                                                   System.out.println("Enter your choice");
                                                   n=scan.nextInt();
                                                   switch(n){
                                                                     case 1:
                                                                                  for(int i=0;i<idx;i++){
                                                                                                        if(studentList[i].studentId==id){
                                                                                                                                 System.out.println("Enter your Name");
								scan.nextLine();
                                                                                                                                 String a=scan.nextLine();
                                                                                                                                 studentList[i].studentName=a;
                                                                                                                                 System.out.println("Successfully updated");
                                                                                                               }
                                                                                                        
                                                                                          }break;

                                                                       case 2:
                                                                                  for(int i=0;i<idx;i++){
                                                                                                        if(studentList[i].studentId==id){
                                                                                                                                 System.out.println("Enter your gender");
								scan.nextLine();
                                                                                                                                 String a=scan.nextLine();
                                                                                                                                 studentList[i].gender=a;
                                                                                                                                 System.out.println("Successfully updated");
                                                                                                                                 break;
                                                                                                               }
                                                                                                       
                                                                                          }break;
                                                                            case 3:
                                                                                  for(int i=0;i<idx;i++){
                                                                                                        if(studentList[i].studentId==id){
                                                                                                                                 System.out.println("Enter your phone number");
                                                                                                                                 long a=scan.nextInt();
                                                                                                                                 studentList[i].phoneNumber=a;
                                                                                                                                 System.out.println("Successfully updated");
                                                                                                                                 break;
                                                                                                               }
                                                                                                        
                                                                                          }break;
                                                                           case 4:
                                                                                  for(int i=0;i<idx;i++){
                                                                                                        if(studentList[i].studentId==id){
                                                                                                                                 System.out.println("Enter your Qualification");
								scan.nextLine();
                                                                                                                                 String a=scan.nextLine();
                                                                                                                                 studentList[i].qualification=a;
                                                                                                                                 System.out.println("Successfully updated");
                                                                                                                                 break;
                                                                                                               }
                                                                                                       
                                                                                          }break;
                                                                          case 5:
                                                                                  for(int i=0;i<idx;i++){
                                                                                                        if(studentList[i].studentId==id){
                                                                                                                                 System.out.println("Enter your Email Id");
								scan.nextLine();
                                                                                                                                 String a=scan.nextLine();
                                                                                                                                 studentList[i].emailId=a;
                                                                                                                                 System.out.println("Successfully updated");
                                                                 				 break;
                                                                                                               }
                                                                                                      
                                                                                          }break;
                                                                         case 6:
                                                                                  for(int i=0;i<idx;i++){
                                                                                                        if(studentList[i].studentId==id){
                                                                                                                                 System.out.println("Enter your Age");
                                                                                                                                 int a=scan.nextInt();
                                                                                                                                 studentList[i].studentAge=a;
                                                                                                                                 System.out.println("Successfully updated");
								 break;
                                                                                                               }
                                                                                                       
                                                                                          }break;
                                                                          default:System.out.println("####Entered a wrong input#####");
                                                    }
                                        }
                                   else{
                                              System.out.println("There is no student with ID number "+id);
                                           }
                            }
                                  else{
                                           System.out.println("#######There is no student details########");
                                         }
          }

        void deleteDetails(){
                              if(idx>0){
                                      int sid,c=0;
                                      System.out.println("Enter student ID");
                                      sid=scan.nextInt();
                                      if(sid==idx){
                                                  c++;
                                                }
                                     else{          
                                      for(int i=sid;i<idx;i++){
                                                                   studentList[i-1]=studentList[i];
                                                                   studentList[i-1].studentId=i;
                                                                   c++;                                                       
                                          }}
                                  if(c>0){
                                           System.out.println("Successfully Deleted");
                                           idx--;
                                           id--;
                                         }
                                   else{
                                            System.out.println("Student ID not found");
			               }       
                               }
                              else{
                                   System.out.println("##########There is no student details###########");
                                  }
                              
           }   


       
      void menu(){
                 while(true){
                         System.out.println("\n===================Student Management System=====================\n");
                         System.out.println("Enter 1 to add student details\n");
                         System.out.println("Enter 2 to display the student deatils\n");
                         System.out.println("Enter 3 to find the student details by Name\n");
                         System.out.println("Enter 4 to find the student details by ID number\n");
                         System.out.println("Enter 5 to find the student details based on their age\n");
                         System.out.println("Enter 6 to find the student details based on their gender\n");
                         System.out.println("Enter 7 to find the student details based on their course elected\n");
                         System.out.println("Enter 8 to find the student details based on their qualification\n");
                         System.out.println("Enter 9 to login with your mail ID and password\n");
                         System.out.println("Enter 10 to Edit your details\n");
                         System.out.println("Enter 11 to delete details of the student\n");
                         System.out.println("Enter 0 to Exit from menu\n");
                         int choice;
                         System.out.println("Enter your choice");
                         choice=scan.nextInt();
                         
                         switch(choice){
                                         case 1:addStudentDetails();break;
                                         case 2:displayDetails();break;
                                         case 3:searchByNames();break;
                                         case 4:searchById();break;
                                         case 5:searchByAge();break;
                                         case 6:searchByGender();break;
                                         case 7:searchByCourse();break;
                                         case 8:searchByQualification();break;
                                         case 9:login();break;
                                         case 10:editDetails();break;
                                         case 11:deleteDetails();break;
                                         case 0:System.exit(0);
                                         default:System.out.println("!!!!!!!!!!!!!!!Sorry you have entered a wrong input!!!!!!!!!!!!!!!!!!!!!!");
                                        }
                        }
          }
}
                                            
                                                           