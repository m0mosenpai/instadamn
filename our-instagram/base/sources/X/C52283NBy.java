package X;

/* renamed from: X.NBy, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C52283NBy extends AbstractC61132qb {
    public final InterfaceC58268PsC A00;
    public final String A01;

    public C52283NBy(InterfaceC58268PsC interfaceC58268PsC, String str) {
        C14360o3.A0B(interfaceC58268PsC, 2);
        this.A01 = str;
        this.A00 = interfaceC58268PsC;
    }

    @Override // X.AbstractC61132qb
    public final /* bridge */ /* synthetic */ AbstractC52922bZ create() {
        return new C50992Mfz(new O88(this.A00, this.A01));
    }
}
