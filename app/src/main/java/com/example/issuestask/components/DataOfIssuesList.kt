package com.example.issuestask.components


class DataOfIssuesList {
    companion object {
        fun getDataItemInCard(): List<Issue> {
            return listOf(
                Issue("Bump pyarrow from 7...", "2023-11-9, 23:00 PM"),
                Issue("Français", "2023-11-2, 9:38 AM"),
                Issue("Bump werkzeug from...", "2023-10-25, 18:52 PM"),
                Issue("Bump urllib3 from 1.2...", "2023-10-17, 22:59 PM"),
                Issue("ORQA fine tuning with...", "2023-10-9, 15:53 PM"),
                Issue("Bump pillow from 9.2...", "2023-10-4, 0:35 AM"),
                Issue("Bump pyarrow from 7...", "2023-11-9, 23:00 PM"),
                Issue("Français", "2023-11-2, 9:38 AM"),
                Issue("Bump werkzeug from...", "2023-10-25, 18:52 PM"),
                Issue("Bump urllib3 from 1.2...", "2023-10-17, 22:59 PM"),
                Issue("ORQA fine tuning with...", "2023-10-9, 15:53 PM"),
                Issue("Bump pillow from 9.2...", "2023-10-4, 0:35 AM")
            )
        }
    }
}
