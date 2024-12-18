package X;

/* renamed from: X.Wh1, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C70788Wh1 implements InterfaceC66482zP {
    public final int A00;
    public final String A01;

    public C70788Wh1(int i, String str) {
        C14360o3.A0B(str, 2);
        this.A00 = i;
        this.A01 = str;
    }

    @Override // X.InterfaceC66482zP
    public final /* bridge */ /* synthetic */ Object getKey() {
        return this.A01;
    }

    @Override // X.InterfaceC66492zQ
    public final /* bridge */ /* synthetic */ boolean isContentSame(Object obj) {
        C70788Wh1 c70788Wh1 = (C70788Wh1) obj;
        C14360o3.A0B(c70788Wh1, 0);
        return C14360o3.A0K(this.A01, c70788Wh1.A01);
    }
}
