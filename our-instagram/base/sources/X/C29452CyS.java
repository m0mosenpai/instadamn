package X;

import java.lang.ref.WeakReference;

/* renamed from: X.CyS, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C29452CyS implements JI7 {
    public C4E5 A00;
    public final String A01;
    public final String A02;
    public final String A03;
    public final String A04;
    public final WeakReference A05;

    public C29452CyS(C4E5 c4e5, InterfaceC58972mv interfaceC58972mv, String str, String str2, String str3, String str4) {
        AbstractC25233BEq.A0x(2, c4e5, str2, str3);
        this.A00 = c4e5;
        this.A03 = str;
        this.A04 = str2;
        this.A01 = str3;
        this.A02 = str4;
        this.A05 = AbstractC25225BEi.A16(interfaceC58972mv);
    }

    @Override // X.JI7
    public final InterfaceC58972mv BXB() {
        return (InterfaceC58972mv) this.A05.get();
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
        return this.A02;
    }

    @Override // X.JI7
    public final String BSb() {
        return this.A03;
    }

    @Override // X.JI7
    public final String getModuleName() {
        return this.A04;
    }
}
