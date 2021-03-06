package com.photo_editor_android_ui;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.photoeditorsdkui.PhotoEditorActivity;

public class MainActivity extends MediaActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    protected void onPhotoTaken() {
        Intent intent = new Intent(MainActivity.this, PhotoEditorActivity.class);
        intent.putExtra("selectedImagePath", selectedImagePath);
        startActivity(intent);
    }

    public void openEditor(View view) {
        openGallery();
    }

    public void openCamera(View view) {
        startCameraActivity();
    }
}
