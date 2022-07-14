package aj.jaiswal.firstquizapp

object Constants {

    const val USER_NAME: String = "user_name"
    const val TOTAL_QUESTIONS: String = "total_questions"
    const val CORRECT_ANSWERS: String = "correct_answers"
    fun getQuestions():ArrayList<Question>
    {
         val questionsList = ArrayList<Question>()

        val que1 = Question(
            1,"Lack of interest or pleasure in activities?",
            R.drawable.mhh,
            "hardly ever","much of the time","most of the time","all of the time",
            1
        )
        questionsList.add(que1)

        val que2 = Question(
            2,"Low mood, sadness, feeling down?",
            R.drawable.mhh,
            "hardly ever","much of the time","most of the time","all of the time",
            1
        )
        questionsList.add(que2)

        val que3 = Question(
            3,"Feeling tired, feeling fatigued, low in energy?",
            R.drawable.mhh,
            "hardly ever","much of the time","most of the time","all of the time",
            1
        )
        questionsList.add(que3)

        val que4 = Question(
            4, "Poor appetite or overeating?",
            R.drawable.mhh,
            "hardly ever", "much of the time", "most of the time", "all of the time",
            1
        )
        questionsList.add(que4)

        val que5 = Question(
            5,"Having disturbed sleep or sleeplessness?",
            R.drawable.mhh,
            "hardly ever","much of the time","most of the time","all of the time",
            1
        )
        questionsList.add(que5)

        return questionsList
    }
}