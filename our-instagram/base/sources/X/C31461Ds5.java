package X;

/* renamed from: X.Ds5, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C31461Ds5 implements InterfaceC66482zP {
    public final String A00;
    public final String A01;
    public final String A02;

    @Override // X.InterfaceC66492zQ
    public final /* bridge */ /* synthetic */ boolean isContentSame(Object obj) {
        C31461Ds5 c31461Ds5 = (C31461Ds5) obj;
        C14360o3.A0B(c31461Ds5, 0);
        return C14360o3.A0K(this.A01, c31461Ds5.A01);
    }

    public C31461Ds5(String str, String str2, String str3) {
        this.A01 = str;
        this.A02 = str2;
        this.A00 = str3;
    }

    @Override // X.InterfaceC66482zP
    public final /* bridge */ /* synthetic */ Object getKey() {
        return this.A01;
    }
}
