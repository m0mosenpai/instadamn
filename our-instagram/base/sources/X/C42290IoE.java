package X;

/* renamed from: X.IoE, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C42290IoE implements InterfaceC66482zP {
    public final String A00;

    public C42290IoE(String str) {
        C14360o3.A0B(str, 1);
        this.A00 = str;
    }

    @Override // X.InterfaceC66492zQ
    public final boolean isContentSame(Object obj) {
        return true;
    }

    @Override // X.InterfaceC66482zP
    public final /* bridge */ /* synthetic */ Object getKey() {
        return this.A00;
    }
}
