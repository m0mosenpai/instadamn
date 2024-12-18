package com.facebook.smartcapture.view;

import X.AbstractC001800i;
import X.AbstractC166987dD;
import X.AbstractC166997dE;
import X.AbstractC167007dF;
import X.AbstractC16960so;
import X.AbstractC25225BEi;
import X.AbstractC43591JPw;
import X.AbstractC43592JPx;
import X.AbstractC43594JPz;
import X.AbstractC58318PtA;
import X.AbstractC58319PtB;
import X.C00O;
import X.C0f9;
import X.C0fX;
import X.C14240no;
import X.C14360o3;
import X.C176877tj;
import X.C177447ue;
import X.C44427JkQ;
import X.C62428SBd;
import X.C62634SJr;
import X.C63196Sey;
import X.C64094SzB;
import X.C69274Vki;
import X.InterfaceC1814282u;
import X.InterfaceC65547TmM;
import X.InterfaceC65581TnK;
import X.K5D;
import X.K5I;
import X.MO1;
import X.MSY;
import X.RunnableC49927M2u;
import X.RunnableC49977M4s;
import X.S1L;
import X.S5Q;
import X.TL7;
import X.TO9;
import X.XQ2;
import X.XQ3;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Outline;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewOutlineProvider;
import android.widget.FrameLayout;
import android.widget.ProgressBar;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.facebook.R;
import com.facebook.smartcapture.camera.DialogTexts;
import com.facebook.smartcapture.camera.sizesetter.FixedSizes;
import com.facebook.smartcapture.docauth.CaptureState;
import com.facebook.smartcapture.docauth.DocAuthManager;
import com.facebook.smartcapture.flow.IdCaptureConfig;
import com.facebook.smartcapture.logging.CancelReason;
import com.facebook.smartcapture.logging.IdCaptureLogger;
import com.facebook.smartcapture.logging.IdCaptureStep;
import com.facebook.smartcapture.logging.InMemoryLogger;
import com.facebook.smartcapture.ui.PhotoRequirementsView;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;

/* loaded from: classes10.dex */
public final class IdCaptureActivity extends IdCaptureBaseActivity implements InterfaceC1814282u, InterfaceC65547TmM, MO1 {
    public static final C62634SJr A07 = new Object();
    public Uri A00;
    public FrameLayout A01;
    public InterfaceC65581TnK A02;
    public C64094SzB A03;
    public K5I A04;
    public boolean A05;
    public boolean A06;

    @Override // X.InterfaceC1814282u
    public final void DEf(Exception exc) {
        C14360o3.A0B(exc, 0);
        A02().logError("Camera initialization error", exc);
    }

    @Override // X.InterfaceC1814282u
    public final void DM7(C177447ue c177447ue) {
        C176877tj c176877tj;
        InterfaceC65581TnK interfaceC65581TnK = this.A02;
        C176877tj c176877tj2 = null;
        if (interfaceC65581TnK != null) {
            c176877tj = interfaceC65581TnK.Bfw();
        } else {
            c176877tj = null;
        }
        InterfaceC65581TnK interfaceC65581TnK2 = this.A02;
        if (interfaceC65581TnK2 != null) {
            c176877tj2 = interfaceC65581TnK2.Bd7();
        }
        if (c176877tj != null && c176877tj2 != null) {
            IdCaptureLogger A02 = A02();
            int i = c176877tj.A02;
            int i2 = c176877tj.A01;
            int i3 = c176877tj2.A02;
            int i4 = c176877tj2.A01;
            FrameLayout frameLayout = this.A01;
            C14360o3.A0A(frameLayout);
            int width = frameLayout.getWidth();
            FrameLayout frameLayout2 = this.A01;
            C14360o3.A0A(frameLayout2);
            A02.logCameraInitialize(i, i2, i3, i4, width, frameLayout2.getHeight());
        }
    }

    @Override // X.InterfaceC65547TmM
    public final void ETQ(boolean z) {
        K5I k5i = this.A04;
        C14360o3.A0A(k5i);
        K5D k5d = (K5D) k5i;
        ProgressBar progressBar = k5d.A06;
        C14360o3.A0A(progressBar);
        progressBar.post(new TO9(k5d, z));
    }

    @Override // X.InterfaceC65547TmM
    public final void EeO(boolean z, boolean z2) {
        K5I k5i = this.A04;
        C14360o3.A0A(k5i);
        K5D k5d = (K5D) k5i;
        FragmentActivity activity = k5d.getActivity();
        if (activity != null) {
            activity.runOnUiThread(new RunnableC49977M4s(k5d, z, z2));
        }
    }

    @Override // X.InterfaceC65547TmM
    public final void EeP(boolean z) {
        K5I k5i = this.A04;
        C14360o3.A0A(k5i);
        K5D k5d = (K5D) k5i;
        ProgressBar progressBar = k5d.A08;
        C14360o3.A0A(progressBar);
        progressBar.post(new RunnableC49927M2u(k5d, z));
    }

    private final String A00(String str) {
        Map BFB = BFB();
        LinkedHashMap A1I = AbstractC166987dD.A1I();
        Iterator A15 = AbstractC166997dE.A15(BFB);
        while (A15.hasNext()) {
            Map.Entry A1K = AbstractC166987dD.A1K(A15);
            if (str.equals(A1K.getValue())) {
                AbstractC43594JPz.A1S(A1I, A1K);
            }
        }
        if (A1I.isEmpty()) {
            return "";
        }
        return AbstractC166997dE.A0q(getResources(), AbstractC166987dD.A0H(AbstractC001800i.A09(A1I.keySet())));
    }

    @Override // X.MO1
    public final void D2P() {
        A02().logFlowCancel(CancelReason.CAPTURE_STEP_BACK_BUTTON);
        super.onBackPressed();
    }

    @Override // com.facebook.smartcapture.view.IdCaptureBaseActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public final void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i == 1 && i2 == -1) {
            if (intent != null) {
                this.A00 = intent.getData();
            }
            C64094SzB c64094SzB = this.A03;
            if (c64094SzB == null) {
                C14360o3.A0F("presenter");
                throw C00O.createAndThrow();
            }
            c64094SzB.A02();
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        getWindow().addFlags(128);
    }

    @Override // com.facebook.smartcapture.view.IdCaptureBaseActivity, androidx.activity.ComponentActivity, android.app.Activity
    public final void onBackPressed() {
        Fragment A0O = getSupportFragmentManager().A0O(R.id.capture_overlay_fragment_container);
        if (A0O instanceof K5D) {
            K5D k5d = (K5D) A0O;
            PhotoRequirementsView photoRequirementsView = k5d.A0C;
            C14360o3.A0A(photoRequirementsView);
            if (photoRequirementsView.A02) {
                PhotoRequirementsView photoRequirementsView2 = k5d.A0C;
                C14360o3.A0A(photoRequirementsView2);
                C44427JkQ c44427JkQ = photoRequirementsView2.A01;
                if (c44427JkQ != null) {
                    c44427JkQ.A00();
                    photoRequirementsView2.A01 = null;
                }
                photoRequirementsView2.A02 = false;
                return;
            }
        }
        A02().logFlowCancel(CancelReason.SYSTEM_BACK_BUTTON);
        super.onBackPressed();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v3, types: [X.XQ3] */
    @Override // com.facebook.smartcapture.view.IdCaptureBaseActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        Bundle A0b;
        XQ2 xq2;
        int A00 = C0f9.A00(2107200659);
        super.onCreate(bundle);
        setContentView(R.layout.capture_activity);
        View findViewById = findViewById(R.id.camera_fragment_container);
        if (findViewById != null) {
            final FrameLayout frameLayout = (FrameLayout) findViewById;
            this.A01 = frameLayout;
            if (frameLayout != null) {
                frameLayout.setOutlineProvider(new ViewOutlineProvider() { // from class: X.9TX
                    @Override // android.view.ViewOutlineProvider
                    public final void getOutline(View view, Outline outline) {
                        boolean A1R = AbstractC167007dF.A1R(0, view, outline);
                        this.getTheme().resolveAttribute(R.attr.sc_capture_camera_corner_radius, new TypedValue(), A1R);
                        outline.setRoundRect(0, 0, view.getWidth(), view.getHeight(), TypedValue.complexToDimensionPixelSize(r2.data, AbstractC167007dF.A0K(frameLayout.getContext())));
                    }
                });
                frameLayout.setClipToOutline(true);
            }
            IdCaptureConfig A01 = A01();
            S5Q s5q = this.A08;
            this.A03 = new C64094SzB(this, new DocAuthManager(this, A01(), A02()), super.A01, A01, A02(), this, s5q);
            AbstractC43592JPx.A08(this).post(new TL7(this));
            if (super.A05 == IdCaptureStep.INITIAL) {
                A02().logFlowStart();
            }
            if (this.A07 == null) {
                A02().logError("IdCaptureUi is null", null);
            } else {
                try {
                    if (A01().A0K) {
                        DialogTexts dialogTexts = new DialogTexts(A00("__external__permissions_title"), A00("__external__id_permissions_explanation"), AbstractC166997dE.A0q(getResources(), android.R.string.ok), AbstractC166997dE.A0q(getResources(), android.R.string.cancel), A00("__external__permissions_title"), A00("__external__id_permissions_in_settings_explanation"), A00("__external__id_permissions_in_settings_ok_button"), AbstractC166997dE.A0q(getResources(), android.R.string.cancel));
                        ?? xq3 = new XQ3();
                        FixedSizes fixedSizes = A01().A04;
                        A0b = AbstractC166987dD.A0b();
                        A0b.putParcelable("fixed_photo_size", fixedSizes);
                        A0b.putParcelable("texts", dialogTexts);
                        xq2 = xq3;
                    } else {
                        XQ2 xq22 = new XQ2();
                        FixedSizes fixedSizes2 = A01().A04;
                        A0b = AbstractC166987dD.A0b();
                        A0b.putInt("initial_camera_facing", 0);
                        A0b.putParcelable("fixed_photo_size", fixedSizes2);
                        xq2 = xq22;
                    }
                    xq2.setArguments(A0b);
                    C64094SzB c64094SzB = this.A03;
                    if (c64094SzB == null) {
                        C14360o3.A0F("presenter");
                        throw C00O.createAndThrow();
                    }
                    xq2.EQo(c64094SzB.A0A);
                    xq2.EZw(this);
                    C14360o3.A0A(this.A07);
                    K5I k5i = (K5I) K5D.class.newInstance();
                    C14240no A0G = MSY.A0G(this);
                    A0G.A0A(xq2, R.id.camera_fragment_container);
                    A0G.A0A(k5i, R.id.capture_overlay_fragment_container);
                    A0G.A00();
                    this.A02 = xq2;
                    this.A04 = k5i;
                } catch (IllegalAccessException | InstantiationException e) {
                    IdCaptureLogger A02 = A02();
                    String message = e.getMessage();
                    C14360o3.A0A(message);
                    A02.logError(message, e);
                }
            }
            this.A06 = A01().A0L;
            this.A05 = A01().A0H;
            Resources resources = super.A00;
            C14360o3.A0A(this.A04);
            List A1Q = AbstractC16960so.A1Q(Integer.valueOf(R.string.res_0x7f130030_name_removed), Integer.valueOf(R.string.res_0x7f130016_name_removed), Integer.valueOf(R.string.res_0x7f130085_name_removed));
            if (resources != null) {
                try {
                    if (S1L.A00(resources)) {
                        Configuration configuration = new Configuration(AbstractC58319PtB.A08(this));
                        configuration.setLocale(Locale.ENGLISH);
                        Resources resources2 = createConfigurationContext(configuration).getResources();
                        C14360o3.A07(resources2);
                        Iterator it = A1Q.iterator();
                        while (it.hasNext()) {
                            int A0B = AbstractC167007dF.A0B(it);
                            String A0q = AbstractC166997dE.A0q(resources, A0B);
                            String A0q2 = AbstractC166997dE.A0q(resources2, A0B);
                            if (A0q.equals(A0q2)) {
                                String language = resources.getConfiguration().locale.getLanguage();
                                C14360o3.A07(language);
                                HashMap A1G = AbstractC166987dD.A1G();
                                A1G.put("str", A0q2);
                                A1G.put("lang", language);
                                A02().logEvent("locale_mismatch", A1G);
                            }
                        }
                    }
                } catch (Throwable th) {
                    Log.e("SCPUtil", th.toString());
                }
            }
            C0f9.A07(-1074289496, A00);
            return;
        }
        throw AbstractC166987dD.A14("Required View not found. Your layout is missing the ID requested.");
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onPause() {
        int A00 = C0f9.A00(-507326034);
        super.onPause();
        C64094SzB c64094SzB = this.A03;
        if (c64094SzB == null) {
            C14360o3.A0F("presenter");
            throw C00O.createAndThrow();
        }
        c64094SzB.A0A.cleanupJNI();
        C69274Vki c69274Vki = c64094SzB.A06;
        if (c69274Vki != null) {
            SensorManager sensorManager = c69274Vki.A00;
            if (sensorManager != null) {
                C0fX.A00(c69274Vki.A03, sensorManager);
            }
            WeakReference weakReference = c69274Vki.A01;
            if (weakReference != null) {
                weakReference.clear();
            }
            c69274Vki.A00 = null;
            c69274Vki.A01 = null;
        }
        c64094SzB.A0G.disable();
        c64094SzB.A0E.logCaptureSessionEnd(c64094SzB.A0F.toString());
        C0f9.A07(-1931083044, A00);
    }

    @Override // com.facebook.smartcapture.view.IdCaptureBaseActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onResume() {
        Map A12;
        int A00 = C0f9.A00(1082468860);
        super.onResume();
        C64094SzB c64094SzB = this.A03;
        if (c64094SzB == null) {
            C14360o3.A0F("presenter");
            throw C00O.createAndThrow();
        }
        InMemoryLogger inMemoryLogger = c64094SzB.A0F;
        inMemoryLogger.clear();
        inMemoryLogger.addEntry(CaptureState.INITIAL.getText()).submit();
        C63196Sey c63196Sey = c64094SzB.A0C;
        if (c63196Sey.A03() || !c64094SzB.A08) {
            DocAuthManager docAuthManager = c64094SzB.A0A;
            boolean z = c64094SzB.A08;
            synchronized (c63196Sey) {
                A12 = AbstractC58318PtA.A12(c63196Sey.A07);
            }
            docAuthManager.initJNI(false, z, A12);
        }
        c64094SzB.A03();
        c64094SzB.A0G.enable();
        Context context = (Context) c64094SzB.A0J.get();
        C69274Vki c69274Vki = c64094SzB.A06;
        if (c69274Vki != null && context != null) {
            C62428SBd c62428SBd = c64094SzB.A0H;
            C14360o3.A0B(c62428SBd, 1);
            Object systemService = context.getSystemService("sensor");
            C14360o3.A0C(systemService, AbstractC43591JPw.A00(432));
            SensorManager sensorManager = (SensorManager) systemService;
            c69274Vki.A00 = sensorManager;
            C14360o3.A0A(sensorManager);
            SensorEventListener sensorEventListener = c69274Vki.A03;
            SensorManager sensorManager2 = c69274Vki.A00;
            C14360o3.A0A(sensorManager2);
            C0fX.A01(sensorManager2.getDefaultSensor(1), sensorEventListener, sensorManager, 2);
            c69274Vki.A01 = AbstractC25225BEi.A16(c62428SBd);
            c69274Vki.A02 = true;
        }
        C0f9.A07(946695725, A00);
    }
}
