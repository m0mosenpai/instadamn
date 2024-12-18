package X;

/* renamed from: X.Ao2, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C24179Ao2 implements BCF {
    public final BCF[] A00;

    public C24179Ao2(BCF[] bcfArr) {
        C14360o3.A0B(bcfArr, 1);
        this.A00 = (BCF[]) bcfArr.clone();
    }

    @Override // X.BCF
    public final InterfaceC197178nn BGe(android.net.Uri uri) {
        for (BCF bcf : this.A00) {
            InterfaceC197178nn BGe = bcf.BGe(uri);
            if (BGe != null) {
                return BGe;
            }
        }
        return null;
    }
}
