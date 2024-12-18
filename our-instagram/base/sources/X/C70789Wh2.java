package X;

/* renamed from: X.Wh2, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C70789Wh2 implements InterfaceC66482zP {
    public final Tx0 A00;
    public final String A01;

    public C70789Wh2(Tx0 tx0, String str) {
        C14360o3.A0B(str, 1);
        this.A01 = str;
        this.A00 = tx0;
    }

    @Override // X.InterfaceC66482zP
    public final /* bridge */ /* synthetic */ Object getKey() {
        return this.A01;
    }

    @Override // X.InterfaceC66492zQ
    public final /* bridge */ /* synthetic */ boolean isContentSame(Object obj) {
        C70789Wh2 c70789Wh2 = (C70789Wh2) obj;
        C14360o3.A0B(c70789Wh2, 0);
        return C14360o3.A0K(this.A01, c70789Wh2.A01);
    }
}
