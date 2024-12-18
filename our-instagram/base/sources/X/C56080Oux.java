package X;

/* renamed from: X.Oux, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C56080Oux implements InterfaceC66482zP {
    public final String A00;

    public C56080Oux(String str) {
        C14360o3.A0B(str, 1);
        this.A00 = str;
    }

    @Override // X.InterfaceC66482zP
    public final /* bridge */ /* synthetic */ Object getKey() {
        return this.A00;
    }

    @Override // X.InterfaceC66492zQ
    public final /* bridge */ /* synthetic */ boolean isContentSame(Object obj) {
        C56080Oux c56080Oux = (C56080Oux) obj;
        C14360o3.A0B(c56080Oux, 0);
        return C14360o3.A0K(this.A00, c56080Oux.A00);
    }
}
