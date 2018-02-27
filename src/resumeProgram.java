public class ResumeProgram {

    String name;
    String skills;
    String education;
    String experience;

    ResumeProgram(String name, String skills, String education, String experience) {
        this.name = name;
        this.skills = skills;
        this.education = education;
        this.experience = experience;
    }

    void catagories() {
        System.out.printf("name: " + this.name + "%n   skills: %n     " + this.skills + "%n   education: %n     " + this.education + " %n   experience: %n     " + this.experience);
        System.out.println();
    }

    public static void main(String[] args) {
        System.out.println("Team: The GoGetTers");

        ResumeProgram resumeOne = new ResumeProgram(
                "Christian Walker",
                "JavaScript, HTML/CSS, React, C, Python",
                "Bachelors in Computer Engineer from Clemson University",
                "Shift Manager at Wendys %n"
        );

        ResumeProgram resumeTwo = new ResumeProgram(
                "Noelle Irvin",
                "Microsoft Office, Visio, MATLAB, SolidWorks, Visual Basic in Excel, Arduino C/C++",
                "Bachelor of Science in Biological Engineering, University of Florida",
                "Process Development Engineering Intern, RTI Surgical, Feb. 2016 - Feb. 2017 %n"
        );

        ResumeProgram resumeThree = new ResumeProgram(
                "Tawni Hollers",
                "Java, HTML, and CSS",
                "Computer Science Major at the University of North Georgia",
                "Shift Leader at a Sonic Drive-In (6 years) %n"
        );

        ResumeProgram resumeFour = new ResumeProgram(
                "NaDario M. Seays",
                "Java Development, YouTube, Learning",
                "American Intercontinental University %n     - B.S. in Information Technology, The Specialization of Software Development and analysis",
                "United States Marines %n"
        );

        ResumeProgram resumeFive = new ResumeProgram(
                "Azadeh Hashemi",
                "HTML and SQL",
                "Master of project managment from Marrymont",
                "Mercedes Benz HQ %n"
        );

        ResumeProgram resumeSix = new ResumeProgram(
                "Hunter McAfee",
                "B.S. in Biology from Southern Polytechnic State University, Minor in Chemistry %n     - General Assembly Web Development Immersive Program",
                "JavaScript, Ruby, MongoDB, Express, React, Node %n     - Ruby on Rails, Postgres",
                "Microbiology Lab Technician for 3 years at Wuxi Apptec %n     - Worked at a movie theater for 4 years during college %n"
        );

        ResumeProgram resumeSeven = new ResumeProgram(
                "Mayurbhai Maisuria",
                "Programming/Scripting Languages : Java, Python, C, Swift3, JavaScript, SQL",
                "Georgia Institute of Technology %n     Bachelor of Science in Computer Science - GPA 3.02",
                "Tutor and Student Assistance at Georgia State University %n      - Taught students CalculusII, Java, HTML5, and CSS3 Projects %n      - Implemented Web, iOS, CPU, Info Viz System, and MULE Game application %n"
        );

        resumeOne.catagories();
        resumeTwo.catagories();
        resumeThree.catagories();
        resumeFour.catagories();
        resumeFive.catagories();
        resumeSix.catagories();
        resumeSeven.catagories();

    }

}

