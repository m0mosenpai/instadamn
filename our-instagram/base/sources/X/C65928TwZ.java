package X;

/* renamed from: X.TwZ, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C65928TwZ implements InterfaceC126325nT, InterfaceC126855oP, InterfaceC126865oQ {
    public final InterfaceC126325nT A00;
    public final String A01;
    public final String A02;
    public final int A03;

    @Override // X.C4OM
    public final String AGi() {
        return this.A00.AGi();
    }

    @Override // X.InterfaceC126855oP
    public final /* bridge */ /* synthetic */ C4OM BHt() {
        return this.A00;
    }

    @Override // X.InterfaceC126325nT
    public final Class Cpm() {
        return this.A00.Cpm();
    }

    @Override // X.InterfaceC126325nT
    public final int getTypeTag() {
        return this.A03;
    }

    public C65928TwZ(InterfaceC126325nT interfaceC126325nT, String str, String str2) {
        this.A01 = str;
        this.A00 = interfaceC126325nT;
        this.A02 = str2;
        this.A03 = interfaceC126325nT.getTypeTag();
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
