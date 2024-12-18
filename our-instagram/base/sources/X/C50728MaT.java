package X;

import com.facebook.videolite.instagram.VideoIngestionStep;

/* renamed from: X.MaT, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C50728MaT implements XE9 {
    public final C47Z A00;
    public final /* synthetic */ VideoIngestionStep A01;

    @Override // X.XE9
    public final void Dbk(float f) {
    }

    @Override // X.XE9
    public final void onStart() {
    }

    public C50728MaT(VideoIngestionStep videoIngestionStep, C47Z c47z) {
        this.A01 = videoIngestionStep;
        this.A00 = c47z;
    }

    @Override // X.XE9
    public final /* bridge */ /* synthetic */ void D22(Object obj) {
        Exception exc = (Exception) obj;
        C14360o3.A0B(exc, 0);
        VideoIngestionStep videoIngestionStep = this.A01;
        synchronized (videoIngestionStep) {
            videoIngestionStep.A00 = exc;
        }
    }

    @Override // X.XE9
    public final /* bridge */ /* synthetic */ void DG3(Object obj) {
        Exception exc = (Exception) obj;
        C14360o3.A0B(exc, 0);
        VideoIngestionStep videoIngestionStep = this.A01;
        synchronized (videoIngestionStep) {
            videoIngestionStep.A00 = exc;
        }
    }

    @Override // X.XE9
    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        C69570VrZ c69570VrZ = (C69570VrZ) obj;
        C14360o3.A0B(c69570VrZ, 0);
        C47Z c47z = this.A00;
        c47z.A1T.A04 = AbstractC31177DnL.A06();
        if (c69570VrZ.A00 == EnumC68130VCo.A02) {
            String str = ((W63) AbstractC166997dE.A16(c69570VrZ.A01.A02).next()).A05;
            c47z.A3v = str;
            if (VideoIngestionStep.A02(this.A01.A02, c47z)) {
                c47z.A2I = AbstractC25228BEl.A13(str);
            }
            c47z.A0O();
        }
    }
}
