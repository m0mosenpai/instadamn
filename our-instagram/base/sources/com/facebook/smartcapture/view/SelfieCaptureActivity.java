package com.facebook.smartcapture.view;

import X.AbstractC111324zv;
import X.AbstractC166987dD;
import X.AbstractC25225BEi;
import X.C00O;
import X.C05F;
import X.C0f9;
import X.C14240no;
import X.C14360o3;
import X.C210719Tt;
import X.C62576SHb;
import X.C63962Swn;
import X.C67772Uxo;
import X.EnumC61156RgH;
import X.InterfaceC65372Tj4;
import X.K5V;
import X.K5W;
import X.MSY;
import X.Q3R;
import X.Q3d;
import X.SN3;
import X.SNY;
import X.SWH;
import X.SZG;
import android.content.Intent;
import android.graphics.RectF;
import android.os.Bundle;
import android.os.SystemClock;
import android.view.InflateException;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.facebook.R;
import com.facebook.facedetection.amlfacetracker.AMLFaceTracker;
import com.facebook.smartcapture.capture.DefaultEvidenceRecorderProvider;
import com.facebook.smartcapture.config.ChallengeProvider;
import com.facebook.smartcapture.logging.InMemoryLogger;
import com.facebook.smartcapture.ui.ResourcesProgressBar;
import com.facebook.smartcapture.ui.view.ArrowHintView;
import com.google.android.material.snackbar.SnackbarContentLayout;
import java.util.ArrayList;

/* loaded from: classes10.dex */
public final class SelfieCaptureActivity extends BaseSelfieCaptureActivity implements InterfaceC65372Tj4, View.OnLayoutChangeListener {
    public FrameLayout A00;
    public C210719Tt A01;
    public SN3 A02;
    public C63962Swn A03;
    public K5W A04;
    public FrameLayout A05;

    @Override // X.InterfaceC65372Tj4
    public final void DoS(EnumC61156RgH enumC61156RgH) {
        C14360o3.A0B(enumC61156RgH, 0);
        K5W k5w = this.A04;
        String str = "cameraOverlayFragment";
        if (k5w != null) {
            if (!A01(k5w)) {
                K5V k5v = (K5V) k5w;
                ArrowHintView arrowHintView = k5v.A08;
                if (arrowHintView == null) {
                    str = "arrowHintView";
                } else {
                    arrowHintView.setCaptureState(enumC61156RgH);
                    k5v.A06 = enumC61156RgH;
                    K5V.A00(enumC61156RgH, k5v);
                    K5V.A01(enumC61156RgH, k5v, k5v.A0C);
                    HelpButton helpButton = k5v.A0A;
                    if (helpButton == null) {
                        str = "helpButton";
                    } else {
                        helpButton.A04.removeCallbacks(helpButton.A05);
                        return;
                    }
                }
            } else {
                return;
            }
        }
        C14360o3.A0F(str);
        throw C00O.createAndThrow();
    }

    public static final boolean A01(Fragment fragment) {
        if (!fragment.mRemoving && !fragment.mDetached && fragment.getActivity() != null && fragment.mView != null && fragment.isAdded()) {
            return false;
        }
        return true;
    }

    @Override // com.facebook.smartcapture.view.BaseSelfieCaptureActivity, androidx.activity.ComponentActivity, android.app.Activity
    public final void onBackPressed() {
        String str;
        C63962Swn c63962Swn = this.A03;
        if (c63962Swn == null) {
            str = "presenter";
        } else {
            if (c63962Swn.A0A == C05F.A01) {
                c63962Swn.A0A = C05F.A0N;
                C62576SHb c62576SHb = c63962Swn.A0O;
                if (c62576SHb != null) {
                    c62576SHb.A01.cancel();
                }
                C63962Swn.A01(c63962Swn);
            }
            K5W k5w = this.A04;
            if (k5w == null) {
                str = "cameraOverlayFragment";
            } else {
                k5w.A03();
                super.onBackPressed();
                return;
            }
        }
        C14360o3.A0F(str);
        throw C00O.createAndThrow();
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        if (i == i5 && i2 == i6 && i3 == i7 && i4 == i8) {
            return;
        }
        K5W k5w = this.A04;
        String str = "cameraOverlayFragment";
        if (k5w != null) {
            str = "cameraFragmentContainer";
            if (A01(k5w)) {
                return;
            }
            FrameLayout frameLayout = this.A05;
            if (frameLayout != null) {
                int i9 = i3 - i;
                int i10 = i4 - i2;
                K5V k5v = (K5V) k5w;
                FragmentActivity activity = k5v.getActivity();
                if (activity == null) {
                    return;
                }
                RectF rectF = k5v.A0K;
                C14360o3.A0B(rectF, 1);
                float dimension = activity.getResources().getDimension(R.dimen.abc_button_inset_vertical_material) + activity.getResources().getDimension(R.dimen.abc_action_bar_elevation_material);
                float dimension2 = activity.getResources().getDimension(R.dimen.audience_selector_pill_layout_height) + dimension;
                float dimension3 = activity.getResources().getDimension(R.dimen.audience_selector_pill_layout_height) + dimension;
                float f = i9;
                float min = Math.min(f - (dimension2 * 2.0f), i10 - dimension3) / 2.0f;
                float f2 = f / 2.0f;
                rectF.set(f2 - min, dimension3, f2 + min, dimension3 + min + min);
                ViewGroup.LayoutParams layoutParams = frameLayout.getLayoutParams();
                String A00 = AbstractC111324zv.A00(5);
                C14360o3.A0C(layoutParams, A00);
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                ((ViewGroup.LayoutParams) marginLayoutParams).width = (int) rectF.width();
                ((ViewGroup.LayoutParams) marginLayoutParams).height = (int) rectF.height();
                marginLayoutParams.topMargin = (int) rectF.top;
                frameLayout.requestLayout();
                LinearLayout linearLayout = k5v.A03;
                str = "messageContainer";
                if (linearLayout != null) {
                    ViewGroup.LayoutParams layoutParams2 = linearLayout.getLayoutParams();
                    C14360o3.A0C(layoutParams2, A00);
                    ((ViewGroup.MarginLayoutParams) layoutParams2).topMargin = (int) (rectF.bottom + ((int) activity.getResources().getDimension(R.dimen.ab_test_media_thumbnail_preview_item_internal_padding)));
                    LinearLayout linearLayout2 = k5v.A03;
                    if (linearLayout2 != null) {
                        linearLayout2.requestLayout();
                        ResourcesProgressBar resourcesProgressBar = k5v.A07;
                        str = "loadingView";
                        if (resourcesProgressBar != null) {
                            ViewGroup.LayoutParams layoutParams3 = resourcesProgressBar.getLayoutParams();
                            C14360o3.A0C(layoutParams3, A00);
                            ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) layoutParams3;
                            float f3 = rectF.top;
                            float f4 = f3 + ((rectF.bottom - f3) / 2.0f);
                            if (k5v.A07 != null) {
                                marginLayoutParams2.topMargin = (int) (f4 - (r0.getMeasuredHeight() / 2.0f));
                                ResourcesProgressBar resourcesProgressBar2 = k5v.A07;
                                if (resourcesProgressBar2 != null) {
                                    resourcesProgressBar2.requestLayout();
                                    EnumC61156RgH enumC61156RgH = k5v.A06;
                                    if (enumC61156RgH == null) {
                                        return;
                                    }
                                    K5V.A00(enumC61156RgH, k5v);
                                    return;
                                }
                            }
                        }
                    }
                }
            }
        }
        C14360o3.A0F(str);
        throw C00O.createAndThrow();
    }

    @Override // com.facebook.smartcapture.view.BaseSelfieCaptureActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public final void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i == 1) {
            if (i2 != -1) {
                if (i2 == 1003) {
                    onBackPressed();
                }
            } else {
                setResult(i2, intent);
                finish();
            }
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        Window window = getWindow();
        if (window != null) {
            window.addFlags(128);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0077  */
    @Override // com.facebook.smartcapture.view.BaseSelfieCaptureActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onCreate(android.os.Bundle r18) {
        /*
            Method dump skipped, instructions count: 496
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.smartcapture.view.SelfieCaptureActivity.onCreate(android.os.Bundle):void");
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onDestroy() {
        String str;
        int A00 = C0f9.A00(566402632);
        FrameLayout frameLayout = this.A00;
        if (frameLayout == null) {
            str = "parentContainer";
        } else {
            frameLayout.removeOnLayoutChangeListener(this);
            C63962Swn c63962Swn = this.A03;
            if (c63962Swn == null) {
                str = "presenter";
            } else {
                c63962Swn.A0A = C05F.A00;
                SZG szg = c63962Swn.A08;
                if (szg != null) {
                    SWH swh = szg.A07;
                    if (swh != null) {
                        AMLFaceTracker aMLFaceTracker = swh.A00;
                        AMLFaceTracker.NativePeer nativePeer = aMLFaceTracker.A00;
                        if (nativePeer != null) {
                            nativePeer.mHybridData.resetNative();
                        }
                        aMLFaceTracker.A00 = null;
                    }
                    szg.A07 = null;
                    szg.A09 = false;
                }
                super.onDestroy();
                C0f9.A07(526286750, A00);
                return;
            }
        }
        C14360o3.A0F(str);
        throw C00O.createAndThrow();
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onPause() {
        Window window;
        int A00 = C0f9.A00(2118624218);
        C63962Swn c63962Swn = this.A03;
        if (c63962Swn == null) {
            C14360o3.A0F("presenter");
            throw C00O.createAndThrow();
        }
        c63962Swn.A0L.logCaptureSessionEnd(c63962Swn.A0K.toString());
        if (c63962Swn.A0A == C05F.A01) {
            c63962Swn.A0A = C05F.A0C;
            C62576SHb c62576SHb = c63962Swn.A0O;
            if (c62576SHb != null) {
                c62576SHb.A01.cancel();
            }
            Q3d q3d = c63962Swn.A09;
            if (q3d != null) {
                q3d.A00 = false;
            }
            C63962Swn.A01(c63962Swn);
        }
        C14240no A0G = MSY.A0G(this);
        C210719Tt c210719Tt = this.A01;
        C14360o3.A0A(c210719Tt);
        A0G.A03(c210719Tt);
        A0G.A0K();
        Boolean bool = A02().A0J;
        if (bool != null && bool.booleanValue() && (window = getWindow()) != null) {
            WindowManager.LayoutParams attributes = window.getAttributes();
            attributes.screenBrightness = -1.0f;
            window.setAttributes(attributes);
        }
        super.onPause();
        C0f9.A07(478531428, A00);
    }

    @Override // com.facebook.smartcapture.view.BaseSelfieCaptureActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onResume() {
        int A00 = C0f9.A00(750965260);
        super.onResume();
        ChallengeProvider challengeProvider = A02().A05;
        if (challengeProvider == null) {
            A05("ChallengeProvider is null", null);
        } else {
            Integer num = challengeProvider.A00;
            Integer num2 = challengeProvider.A02;
            Integer num3 = challengeProvider.A01;
            C210719Tt c210719Tt = new C210719Tt();
            this.A01 = c210719Tt;
            Bundle A0b = AbstractC166987dD.A0b();
            A0b.putInt("initial_camera_facing", 1);
            if (num != null) {
                A0b.putInt("photo_quality", num.intValue());
            }
            if (num2 != null) {
                A0b.putInt("video_quality", num2.intValue());
            }
            if (num3 != null) {
                A0b.putInt("video_bitrate", num3.intValue());
            }
            A0b.putBoolean("use_camera2", false);
            c210719Tt.setArguments(A0b);
            DefaultEvidenceRecorderProvider defaultEvidenceRecorderProvider = (DefaultEvidenceRecorderProvider) A02().A04;
            String str = defaultEvidenceRecorderProvider.A04;
            long j = defaultEvidenceRecorderProvider.A01;
            String str2 = defaultEvidenceRecorderProvider.A05;
            ArrayList arrayList = defaultEvidenceRecorderProvider.A06;
            int i = defaultEvidenceRecorderProvider.A00;
            this.A02 = new SN3(defaultEvidenceRecorderProvider.A02, c210719Tt, defaultEvidenceRecorderProvider.A03, str, str2, arrayList, i, j);
            C14240no A0G = MSY.A0G(this);
            A0G.A0A(c210719Tt, R.id.camera_fragment_container);
            A0G.A0K();
        }
        C210719Tt c210719Tt2 = this.A01;
        C14360o3.A0A(c210719Tt2);
        C63962Swn c63962Swn = this.A03;
        if (c63962Swn != null) {
            c210719Tt2.A06 = AbstractC25225BEi.A16(c63962Swn);
            C210719Tt c210719Tt3 = this.A01;
            C14360o3.A0A(c210719Tt3);
            C63962Swn c63962Swn2 = this.A03;
            if (c63962Swn2 != null) {
                c210719Tt3.A07 = AbstractC25225BEi.A16(c63962Swn2);
                C210719Tt c210719Tt4 = this.A01;
                C14360o3.A0A(c210719Tt4);
                C63962Swn c63962Swn3 = this.A03;
                if (c63962Swn3 != null) {
                    c210719Tt4.A05 = AbstractC25225BEi.A16(c63962Swn3);
                    C63962Swn c63962Swn4 = this.A03;
                    if (c63962Swn4 != null) {
                        C210719Tt c210719Tt5 = this.A01;
                        C14360o3.A0A(c210719Tt5);
                        c63962Swn4.A0C = AbstractC25225BEi.A16(c210719Tt5.A00());
                        Boolean bool = A02().A0J;
                        if (bool != null && bool.booleanValue()) {
                            Window window = getWindow();
                            if (window != null) {
                                WindowManager.LayoutParams attributes = window.getAttributes();
                                attributes.screenBrightness = 1.0f;
                                window.setAttributes(attributes);
                            }
                            Boolean bool2 = A02().A0I;
                            if (bool2 != null && bool2.booleanValue()) {
                                try {
                                    FrameLayout frameLayout = this.A00;
                                    if (frameLayout == null) {
                                        C14360o3.A0F("parentContainer");
                                        throw C00O.createAndThrow();
                                    }
                                    int[] iArr = C67772Uxo.A01;
                                    C67772Uxo A002 = C67772Uxo.A00(frameLayout, frameLayout.getResources().getText(2131972855));
                                    ((SnackbarContentLayout) A002.A09.getChildAt(0)).A01.setTextColor(-1);
                                    A002.A04();
                                } catch (InflateException e) {
                                    A05("Exception thrown in rendering Snackbar!", e);
                                }
                            }
                        }
                        C63962Swn c63962Swn5 = this.A03;
                        if (c63962Swn5 != null) {
                            SN3 sn3 = this.A02;
                            C14360o3.A0A(sn3);
                            C14360o3.A0B(sn3, 0);
                            InMemoryLogger inMemoryLogger = c63962Swn5.A0K;
                            inMemoryLogger.clear();
                            Integer num4 = C05F.A00;
                            if (num4 != c63962Swn5.A0B) {
                                c63962Swn5.A0B = num4;
                                inMemoryLogger.addEntry("INITIAL").submit();
                            }
                            sn3.A02 = new SNY(sn3, c63962Swn5);
                            c63962Swn5.A0D = AbstractC25225BEi.A16(sn3);
                            c63962Swn5.A03 = 0;
                            InterfaceC65372Tj4 interfaceC65372Tj4 = (InterfaceC65372Tj4) c63962Swn5.A0P.get();
                            if (interfaceC65372Tj4 != null) {
                                interfaceC65372Tj4.DoS(c63962Swn5.A02());
                            }
                            c63962Swn5.A0A = C05F.A01;
                            Q3d q3d = c63962Swn5.A09;
                            if (q3d != null) {
                                q3d.A00 = true;
                            }
                            C62576SHb c62576SHb = c63962Swn5.A0O;
                            if (c62576SHb != null) {
                                Q3R q3r = c62576SHb.A01;
                                q3r.cancel();
                                c62576SHb.A00 = SystemClock.elapsedRealtime();
                                q3r.start();
                            }
                            c63962Swn5.A06 = 0L;
                            c63962Swn5.A0F = false;
                            C0f9.A07(165296091, A00);
                            return;
                        }
                    }
                }
            }
        }
        C14360o3.A0F("presenter");
        throw C00O.createAndThrow();
    }
}
