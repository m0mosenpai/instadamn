package X;

/* renamed from: X.KIq, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C45653KIq extends C4F4 {
    public final int A00;
    public final C49476Ltp A01;
    public final String A02;
    public final String A03;
    public final boolean A04;
    public final boolean A05;

    @Override // X.InterfaceC66492zQ
    public final /* bridge */ /* synthetic */ boolean isContentSame(Object obj) {
        C45653KIq c45653KIq = (C45653KIq) obj;
        C14360o3.A0B(c45653KIq, 0);
        if (this.A00 == c45653KIq.A00 && C14360o3.A0K(this.A02, c45653KIq.A02) && C14360o3.A0K(this.A03, c45653KIq.A03) && this.A05 == c45653KIq.A05 && this.A04 == c45653KIq.A04) {
            return true;
        }
        return false;
    }

    public C45653KIq(C49476Ltp c49476Ltp, String str, String str2, int i, boolean z, boolean z2) {
        this.A00 = i;
        this.A02 = str;
        this.A03 = str2;
        this.A05 = z;
        this.A04 = z2;
        this.A01 = c49476Ltp;
    }
}
