package com.duk.lab.android.camera;

import android.app.Fragment;
import android.content.res.Configuration;
import android.os.Build;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.FrameLayout;

import com.duk.lab.android.R;

/**
 * Created by Duk on 2016-12-15.
 */

public class CameraViewFragment extends Fragment {

    private CameraPreview mCameraView;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        Log.i("test_duk", "onCreateView");
        super.onCreateView(inflater, container, savedInstanceState);

        View view = inflater.inflate(R.layout.camera_view, container, false);
        FrameLayout cameraViewLayout = (FrameLayout) view.findViewById(R.id.cameraViewLayout);
        mCameraView = new CameraPreview(getActivity());
        FrameLayout.LayoutParams params = new FrameLayout.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT);
        cameraViewLayout.addView(mCameraView, params);

        return view;
    }

    @Override
    public void onConfigurationChanged(Configuration newConfig) {
        super.onConfigurationChanged(newConfig);
        Log.i("test_duk", "onConfigurationChanged newConfig=" + newConfig);
    }
}
