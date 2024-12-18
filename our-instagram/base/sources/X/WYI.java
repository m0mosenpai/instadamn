package X;

/* loaded from: classes11.dex */
public final class WYI implements C4BQ {
    public final /* synthetic */ C4SS A00;
    public final /* synthetic */ C95934Tc A01;

    public WYI(C4SS c4ss, C95934Tc c95934Tc) {
        this.A01 = c95934Tc;
        this.A00 = c4ss;
    }

    @Override // X.C4BQ
    public final void CmU(String str) {
        String str2 = this.A00.A0K.A0G;
        if (str2 != null) {
            this.A01.A0A.callback(new C97144Xz(str2, "MEDIA_CODEC_RENDERER_UPGRADE", AbstractC111324zv.A00(319), str));
        }
    }
}
