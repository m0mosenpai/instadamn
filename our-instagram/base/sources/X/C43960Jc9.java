package X;

/* renamed from: X.Jc9, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C43960Jc9 implements InterfaceC66482zP {
    public final int A00;
    public final Integer A01;
    public final Integer A02;
    public final String A03;
    public final boolean A04;
    public final boolean A05;

    @Override // X.InterfaceC66482zP
    public final /* bridge */ /* synthetic */ Object getKey() {
        return this.A03;
    }

    @Override // X.InterfaceC66492zQ
    public final /* bridge */ /* synthetic */ boolean isContentSame(Object obj) {
        C43960Jc9 c43960Jc9 = (C43960Jc9) obj;
        C14360o3.A0B(c43960Jc9, 0);
        if (this.A02 == c43960Jc9.A02 && this.A00 == c43960Jc9.A00 && C14360o3.A0K(this.A01, c43960Jc9.A01) && this.A05 == c43960Jc9.A05 && this.A04 == c43960Jc9.A04) {
            return true;
        }
        return false;
    }

    public C43960Jc9(Integer num, Integer num2, String str, int i, boolean z, boolean z2) {
        this.A03 = str;
        this.A02 = num;
        this.A00 = i;
        this.A01 = num2;
        this.A05 = z;
        this.A04 = z2;
    }
}
