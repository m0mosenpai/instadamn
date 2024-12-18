package X;

import java.lang.ref.WeakReference;

/* renamed from: X.CyR, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C29451CyR implements JI7 {
    public C4E5 A00;
    public final String A01;
    public final String A02;
    public final String A03;
    public final WeakReference A04;

    public C29451CyR(C4E5 c4e5, InterfaceC58972mv interfaceC58972mv, String str, String str2, String str3) {
        AbstractC167007dF.A1F(str2, 3, str3);
        C14360o3.A0B(c4e5, 7);
        this.A02 = str;
        this.A03 = str2;
        this.A01 = str3;
        this.A00 = c4e5;
        this.A04 = AbstractC25225BEi.A16(interfaceC58972mv);
    }

    @Override // X.JI7
    public final InterfaceC58972mv BXB() {
        return (InterfaceC58972mv) this.A04.get();
    }

    @Override // X.JI7
    public final String Aq2() {
        return this.A01;
    }

    @Override // X.JI7
    public final C4E5 Aq8() {
        return this.A00;
    }

    @Override // X.JI7
    public final String BAV() {
        return this.A01;
    }

    @Override // X.JI7
    public final String BSb() {
        return this.A02;
    }

    @Override // X.JI7
    public final String getModuleName() {
        return this.A03;
    }
}
