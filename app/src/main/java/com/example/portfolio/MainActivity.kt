package com.example.portfolio

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.portfolio.ui.theme.PortfolioTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.main_activity)

    // val and var

        val buttonSkills = findViewById<Button>(R.id.skillsButton)
        val buttonWork = findViewById<Button>(R.id.workButton)
        val buttonAchivement = findViewById<Button>(R.id.achievementButton)
        val buttonEducation = findViewById<Button>(R.id.educationButton)

        buttonSkills.setOnClickListener{
        intent = Intent(this, SkillsActivity::class.java)
            startActivity(intent)
        }

        buttonWork.setOnClickListener{
            intent = Intent(this, WorkActivity::class.java)
            startActivity(intent)
        }
        buttonEducation.setOnClickListener{
            intent = Intent(this, EducationActivity::class.java)
            startActivity(intent)
        }
        buttonAchivement.setOnClickListener{
            intent = Intent(this, AchivementActivity::class.java)
            startActivity(intent)
        }


    }
}


