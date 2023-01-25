DROP TABLE IF EXISTS TBL_USER;
CREATE TABLE TBL_USER (
                           id INT   PRIMARY KEY,
                           userid VARCHAR(250) NOT NULL,
                           PSWD VARCHAR(250) NOT NULL);


DROP TABLE IF EXISTS TBL_EXPENSE;
CREATE TABLE TBL_EXPENSE(
                            id INT   PRIMARY KEY,
                            userid VARCHAR(250) NOT NULL,
                            PARENT_CONTR VARCHAR(250) NOT NULL,
                            SALARY_MONTHLY VARCHAR(250) NOT NULL,
                            current_month VARCHAR (3)  NULL,
                            FOOD_EXPENSE INTEGER NULL,
                            SCHOOL_EXPENSE INTEGER NULL,
                            GAS INTEGER NULL,
                            MISC_EXPENSE INTEGER NULL,
                            total_income INTEGER NULL,
                                total_expense INTEGER NULL,
                            budget_status VARCHAR(250) NULL
);