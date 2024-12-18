package X;

import android.content.Context;
import com.facebook.avatar.autogen.facetracker.AEFaceTrackerManager;
import com.facebook.avatar.autogen.flow.AESelfieCaptureConfig;
import com.facebook.smartcapture.facetracker.FaceTrackerModelsProvider;

/* renamed from: X.Omh, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C55601Omh implements BDZ {
    public EnumC53239Ngc A00;
    public boolean A01;
    public boolean A02;
    public final AEFaceTrackerManager A03;
    public final AESelfieCaptureConfig A04;
    public final C55013OVy A05;
    public final C05A A06;
    public final C12T A07;

    public C55601Omh(Context context, AESelfieCaptureConfig aESelfieCaptureConfig, C55013OVy c55013OVy, C12T c12t) {
        this.A04 = aESelfieCaptureConfig;
        this.A05 = c55013OVy;
        this.A07 = c12t;
        FaceTrackerModelsProvider faceTrackerModelsProvider = aESelfieCaptureConfig.A00;
        AEFaceTrackerManager aEFaceTrackerManager = AEFaceTrackerManager.faceTrackerManager;
        aEFaceTrackerManager = aEFaceTrackerManager == null ? new AEFaceTrackerManager(AbstractC166987dD.A0O(context), faceTrackerModelsProvider, null) : aEFaceTrackerManager;
        AEFaceTrackerManager.faceTrackerManager = aEFaceTrackerManager;
        AEFaceTrackerManager.delegate = this;
        this.A03 = aEFaceTrackerManager;
        this.A06 = C10E.A00(null);
        this.A01 = true;
        AbstractC25231BEo.A1I(this, AnonymousClass194.A02(c12t), 26);
    }

    @Override // X.BDZ
    public final void D1S(Exception exc) {
    }

    @Override // X.BDZ
    public final void D1W() {
    }

    @Override // X.BDZ
    public final void D1X(String str, String str2) {
    }

    @Override // X.BDZ
    public final void D1b() {
    }
}
