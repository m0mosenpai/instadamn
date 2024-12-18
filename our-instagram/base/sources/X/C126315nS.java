package X;

/* renamed from: X.5nS, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C126315nS implements InterfaceC126325nT {
    public final int A00;
    public final Class A01;
    public final String A02;

    @Override // X.C4OM
    public final String AGi() {
        return this.A02;
    }

    @Override // X.InterfaceC126325nT
    public final Class Cpm() {
        return this.A01;
    }

    @Override // X.InterfaceC126325nT
    public final int getTypeTag() {
        return this.A00;
    }

    public C126315nS(Class cls, String str, int i) {
        this.A02 = str;
        this.A01 = cls;
        this.A00 = i;
    }

    @Override // X.C4OM
    public final C4OK ACc() {
        return W6P.A00(this);
    }

    @Override // X.C4OM
    public final C4OW ACm() {
        return W6P.A01(this);
    }

    @Override // X.C4OM
    public final InterfaceC126325nT ACn() {
        return W6P.A02(this);
    }
}
