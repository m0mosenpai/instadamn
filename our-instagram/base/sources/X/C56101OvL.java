package X;

/* renamed from: X.OvL, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C56101OvL implements InterfaceC66482zP {
    public CharSequence A00 = "";
    public final int A01;
    public final Integer A02;

    @Override // X.InterfaceC66482zP
    public final /* bridge */ /* synthetic */ Object getKey() {
        return Integer.valueOf(this.A01);
    }

    @Override // X.InterfaceC66492zQ
    public final /* bridge */ /* synthetic */ boolean isContentSame(Object obj) {
        C56101OvL c56101OvL = (C56101OvL) obj;
        C14360o3.A0B(c56101OvL, 0);
        if (this.A01 == c56101OvL.A01 && C14360o3.A0K(this.A00, c56101OvL.A00) && C14360o3.A0K(this.A02, c56101OvL.A02)) {
            return true;
        }
        return false;
    }

    public C56101OvL(int i, Integer num) {
        this.A01 = i;
        this.A02 = num;
    }
}
