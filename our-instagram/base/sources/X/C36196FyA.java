package X;

/* renamed from: X.FyA, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C36196FyA implements InterfaceC66482zP {
    public final String A00;
    public final String A01;

    @Override // X.InterfaceC66492zQ
    public final /* bridge */ /* synthetic */ boolean isContentSame(Object obj) {
        C36196FyA c36196FyA = (C36196FyA) obj;
        C14360o3.A0B(c36196FyA, 0);
        if ("0".equals("0") && C14360o3.A0K(this.A01, c36196FyA.A01) && C14360o3.A0K(this.A00, c36196FyA.A00)) {
            return true;
        }
        return false;
    }

    public C36196FyA(String str, String str2) {
        AbstractC167017dG.A1R(str, str2);
        this.A01 = str;
        this.A00 = str2;
    }

    @Override // X.InterfaceC66482zP
    public final /* bridge */ /* synthetic */ Object getKey() {
        return "0";
    }
}
