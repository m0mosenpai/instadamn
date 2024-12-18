package X;

/* renamed from: X.Fxu, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C36180Fxu implements InterfaceC66482zP {
    public final String A00;

    public C36180Fxu(String str) {
        C14360o3.A0B(str, 1);
        this.A00 = str;
    }

    @Override // X.InterfaceC66492zQ
    public final boolean isContentSame(Object obj) {
        return C14360o3.A0K(this.A00, obj);
    }

    @Override // X.InterfaceC66482zP
    public final Object getKey() {
        return this.A00;
    }
}
