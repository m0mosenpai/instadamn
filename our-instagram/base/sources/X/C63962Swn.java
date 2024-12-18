package X;

import android.content.Context;
import android.os.SystemClock;
import com.facebook.common.dextricks.OptSvcAnalyticsStore;
import com.facebook.smartcapture.capture.SelfieEvidence;
import com.facebook.smartcapture.config.ChallengeProvider;
import com.facebook.smartcapture.facetracker.FaceTrackerModelsProvider;
import com.facebook.smartcapture.facetracker.FaceTrackerProvider;
import com.facebook.smartcapture.flow.SelfieCaptureConfig;
import com.facebook.smartcapture.logging.InMemoryLogger;
import com.facebook.smartcapture.logging.SelfieCaptureLogger;
import com.facebook.smartcapture.view.SelfieCaptureActivity;
import java.lang.ref.WeakReference;

/* renamed from: X.Swn, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C63962Swn implements BDZ, BBN {
    public float A00;
    public float A01;
    public int A02;
    public int A03;
    public int A04;
    public int A05;
    public long A06;
    public EnumC61156RgH A07;
    public SZG A08;
    public Q3d A09;
    public Integer A0A;
    public Integer A0B;
    public WeakReference A0C;
    public WeakReference A0D;
    public boolean A0E;
    public boolean A0F;
    public int A0G;
    public final long A0H;
    public final ChallengeProvider A0I;
    public final SelfieCaptureConfig A0J;
    public final InMemoryLogger A0K;
    public final SelfieCaptureLogger A0L;
    public final SJN A0M;
    public final SG2 A0N;
    public final C62576SHb A0O;
    public final WeakReference A0P;
    public final WeakReference A0Q;

    @Override // X.BDZ
    public final void D1S(Exception exc) {
        C14360o3.A0B(exc, 0);
        this.A0L.logError("Selfie presenter: camera error", exc);
    }

    @Override // X.BDZ
    public final void D1X(String str, String str2) {
    }

    @Override // X.BDZ
    public final void D1b() {
    }

    /* JADX WARN: Removed duplicated region for block: B:65:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0153  */
    @Override // X.BBN
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onPreviewFrame(X.C72816Xnf r26) {
        /*
            Method dump skipped, instructions count: 484
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C63962Swn.onPreviewFrame(X.Xnf):void");
    }

    public C63962Swn(Context context, SN3 sn3, ChallengeProvider challengeProvider, SelfieCaptureConfig selfieCaptureConfig, SelfieCaptureLogger selfieCaptureLogger, InterfaceC65372Tj4 interfaceC65372Tj4) {
        AbstractC167007dF.A1H(challengeProvider, 2, selfieCaptureLogger);
        this.A0I = challengeProvider;
        this.A0J = selfieCaptureConfig;
        this.A0L = selfieCaptureLogger;
        WeakReference A16 = AbstractC25225BEi.A16(interfaceC65372Tj4);
        this.A0P = A16;
        this.A0K = new InMemoryLogger(selfieCaptureLogger);
        WeakReference A162 = AbstractC25225BEi.A16(context);
        this.A0Q = A162;
        this.A0D = AbstractC25225BEi.A16(sn3);
        this.A0A = C05F.A00;
        this.A0G = -1;
        C62576SHb c62576SHb = null;
        this.A0C = AbstractC25225BEi.A16(null);
        FaceTrackerProvider faceTrackerProvider = selfieCaptureConfig.A0A;
        FaceTrackerModelsProvider faceTrackerModelsProvider = selfieCaptureConfig.A09;
        if (faceTrackerProvider != null && faceTrackerModelsProvider != null) {
            this.A08 = new SZG(faceTrackerModelsProvider, faceTrackerProvider, selfieCaptureLogger, A162, A16);
            this.A09 = new Q3d(this);
        } else {
            this.A08 = null;
            this.A09 = null;
        }
        this.A0N = new SG2();
        this.A0H = 300L;
        this.A0M = new SJN();
        if (AbstractC31177DnL.A1b(this.A0J.A0F)) {
            K5W k5w = ((SelfieCaptureActivity) interfaceC65372Tj4).A04;
            if (k5w == null) {
                C14360o3.A0F("cameraOverlayFragment");
                throw C00O.createAndThrow();
            }
            c62576SHb = new C62576SHb(this, ((K5V) k5w).A0N);
        }
        this.A0O = c62576SHb;
    }

    public static final void A00(C63962Swn c63962Swn) {
        int i = c63962Swn.A0G;
        int i2 = c63962Swn.A03;
        if (i != i2) {
            c63962Swn.A0G = i2;
            InMemoryLogger.LogEntryBuilder addEntry = c63962Swn.A0K.addEntry("CHALLENGE_STEP_CHANGE");
            addEntry.put("index", c63962Swn.A03);
            addEntry.put(OptSvcAnalyticsStore.LOGGING_KEY_STEP, c63962Swn.A02().A00);
            addEntry.submit();
        }
    }

    public static final void A01(C63962Swn c63962Swn) {
        if (c63962Swn.A0F) {
            c63962Swn.A0F = false;
            SN3 sn3 = (SN3) c63962Swn.A0D.get();
            if (sn3 != null) {
                if (sn3.A0E != null) {
                    sn3.A0A.A00().A02();
                    return;
                }
                SelfieEvidence selfieEvidence = new SelfieEvidence(sn3.A03, null, null, null, null, null, sn3.A0D, null);
                sn3.A01 = selfieEvidence;
                SNY sny = sn3.A02;
                if (sny == null) {
                    return;
                }
                C14360o3.A0A(selfieEvidence);
                sny.A00(selfieEvidence);
            }
        }
    }

    public final EnumC61156RgH A02() {
        return (EnumC61156RgH) AbstractC31172DnG.A19(this.A0I.A03).get(this.A03);
    }

    @Override // X.BDZ
    public final void D1W() {
        InterfaceC65372Tj4 interfaceC65372Tj4 = (InterfaceC65372Tj4) this.A0P.get();
        if (interfaceC65372Tj4 != null) {
            K5W k5w = ((SelfieCaptureActivity) interfaceC65372Tj4).A04;
            if (k5w == null) {
                C14360o3.A0F("cameraOverlayFragment");
                throw C00O.createAndThrow();
            }
            if (!SelfieCaptureActivity.A01(k5w)) {
                K5V k5v = (K5V) k5w;
                k5v.A0L.postDelayed(new RunnableC49822LzT(k5v), 500L);
            }
        }
        C62576SHb c62576SHb = this.A0O;
        if (c62576SHb != null) {
            Q3R q3r = c62576SHb.A01;
            q3r.cancel();
            c62576SHb.A00 = SystemClock.elapsedRealtime();
            q3r.start();
        }
        Integer num = C05F.A01;
        if (num != this.A0B) {
            this.A0B = num;
            this.A0K.addEntry("CHALLENGE_STARTED").submit();
        }
    }
}
