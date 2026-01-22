package step3;

public class Customer3 {
        public String name;
        public String email;
        public String grade; // 등급
        public int totalSpent; // 누적 금액

    public Customer3(String name, String email, int totalSpent){
            this.name = name;
            this.email = email;
            this.totalSpent = totalSpent;
            this.grade = calculateGrade(totalSpent); // 금액에 맞춰 등급 계산하기
        }

        public String calculateGrade ( int spent){
            if (spent >= 2000000) return "플래티넘";
            if (spent >= 1000000) return "골드";
            if (spent >= 500000) return "실버";
            return "브론즈";
        }

}
