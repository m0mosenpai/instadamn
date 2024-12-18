package X;

import com.instagram.creation.activity.MediaCaptureActivity;

/* renamed from: X.OxK, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C56211OxK implements InterfaceC58030PoG {
    public final /* synthetic */ MediaCaptureActivity A00;
    public final /* synthetic */ C47Z A01;
    public final /* synthetic */ boolean A02;

    @Override // X.InterfaceC58030PoG
    public final /* synthetic */ void AGo() {
    }

    public C56211OxK(MediaCaptureActivity mediaCaptureActivity, C47Z c47z, boolean z) {
        this.A00 = mediaCaptureActivity;
        this.A01 = c47z;
        this.A02 = z;
    }

    @Override // X.InterfaceC58030PoG
    public final void AGm() {
        final C47Z c47z = this.A01;
        String str = c47z.A3Z;
        MediaCaptureActivity mediaCaptureActivity = this.A00;
        if (str == null) {
            final String A02 = AbstractC15860qg.A02();
            A02.getClass();
            String E4J = MSX.A0L(mediaCaptureActivity).E4J();
            final boolean z = this.A02;
            AbstractC15860qg.A04(E4J, A02, AbstractC25225BEi.A16(new InterfaceC15850qf() { // from class: X.Ox6
                @Override // X.InterfaceC15850qf
                public final void DYY(boolean z2) {
                    C56211OxK c56211OxK = C56211OxK.this;
                    C47Z c47z2 = c47z;
                    String str2 = A02;
                    boolean z3 = z;
                    if (z2) {
                        c47z2.A3Z = str2;
                        MediaCaptureActivity mediaCaptureActivity2 = c56211OxK.A00;
                        C40121td c40121td = mediaCaptureActivity2.A0B;
                        c47z2.A5U = true;
                        c47z2.A5S = true;
                        c40121td.A05.A04();
                        MX1.A01(mediaCaptureActivity2.A04).A00();
                        mediaCaptureActivity2.runOnUiThread(new RunnableC56977PPs(mediaCaptureActivity2, z3));
                        return;
                    }
                    MX1.A01(c56211OxK.A00.A04).A08("captureCompleted(): failure in saving photo draft");
                }
            }));
            return;
        }
        C40121td c40121td = mediaCaptureActivity.A0B;
        c47z.A5U = true;
        c47z.A5S = true;
        c40121td.A05.A04();
        MX1.A01(mediaCaptureActivity.A04).A00();
        mediaCaptureActivity.runOnUiThread(new RunnableC56977PPs(mediaCaptureActivity, this.A02));
    }
}
