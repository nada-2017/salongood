package com.example.salon1.Model;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Customer {
  
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
  
    @NotEmpty(message = "Name is required")
    @Size(min = 2)
    @Column(columnDefinition = "varchar(20) check ( length(name) > 2 )")
    private String name;
  
    @Pattern(regexp = "\\b(?:Female|Male)\\b",message = "Gender Not Valid")
    @Column(columnDefinition = "varchar(10) not null check(genre='Female' or genre='Male')")
    private String gender;
  
    @NotNull(message = "Age is required")
    @Positive
    @Column(columnDefinition ="int not null")
    private Integer age;
  
    @NotNull(message = "Phone Number is required")
    @Positive
    @Column(columnDefinition ="int not null")
    private Integer phoneNumber;
  
    @NotEmpty(message = "Email is required")
    @Email(message = "Invalid Email",regexp = "^[\\w-\\.]+@([\\w-]+\\.)+[\\w-]{2,4}$")
    
    @Column(columnDefinition = "varchar(40) unique")
    private String email;
}
