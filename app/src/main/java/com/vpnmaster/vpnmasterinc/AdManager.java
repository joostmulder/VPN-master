package com.vpnmaster.vpnmasterinc;

import android.app.Activity;
import android.content.Context;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.FullScreenContentCallback;
import com.google.android.gms.ads.OnPaidEventListener;
import com.google.android.gms.ads.ResponseInfo;
import com.google.android.gms.ads.interstitial.InterstitialAd;

public class AdManager {
    static InterstitialAd ad;
    private Context ctx;

    public AdManager(Context ctx) {
        this.ctx = ctx;
        createAd();
    }

    public void createAd() {
        ad = new InterstitialAd() {
            @NonNull
            @Override
            public String getAdUnitId() {
                return null;
            }

            @Override
            public void show(@NonNull Activity activity) {

            }

            @Override
            public void setFullScreenContentCallback(@Nullable FullScreenContentCallback fullScreenContentCallback) {

            }

            @Nullable
            @Override
            public FullScreenContentCallback getFullScreenContentCallback() {
                return null;
            }

            @Override
            public void setImmersiveMode(boolean b) {

            }

            @NonNull
            @Override
            public ResponseInfo getResponseInfo() {
                return null;
            }

            @Override
            public void setOnPaidEventListener(@Nullable OnPaidEventListener onPaidEventListener) {

            }

            @Nullable
            @Override
            public OnPaidEventListener getOnPaidEventListener() {
                return null;
            }
        };
        //ad.setAdUnitId(MainActivity.admob_interstitial_id);

        final AdRequest adRequest = new AdRequest.Builder().build();


        //ad.loadAd(adRequest);
    }

    public InterstitialAd getAd() {
        return ad;
    }
}