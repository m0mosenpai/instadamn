package X;

/* renamed from: X.KIm, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C45649KIm extends C4F4 {
    public final String A00;
    public final String A01;

    @Override // X.InterfaceC66492zQ
    public final /* bridge */ /* synthetic */ boolean isContentSame(Object obj) {
        C45649KIm c45649KIm = (C45649KIm) obj;
        C14360o3.A0B(c45649KIm, 0);
        if (C14360o3.A0K(this.A00, c45649KIm.A00) && C14360o3.A0K(this.A01, c45649KIm.A01)) {
            return true;
        }
        return false;
    }

    public C45649KIm(String str, String str2) {
        this.A01 = str;
        this.A00 = str2;
    }
}
