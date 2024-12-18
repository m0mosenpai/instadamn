package X;

/* renamed from: X.Ops, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C55783Ops implements InterfaceC71894X9b {
    public final /* synthetic */ C55208OeM A00;

    public C55783Ops(C55208OeM c55208OeM) {
        this.A00 = c55208OeM;
    }

    @Override // X.InterfaceC71894X9b
    public final void DZC(EnumC222789sJ enumC222789sJ, EnumC222789sJ enumC222789sJ2) {
        AbstractC167017dG.A1N(enumC222789sJ, enumC222789sJ2);
        EnumC222789sJ enumC222789sJ3 = EnumC222789sJ.ERROR;
        if (enumC222789sJ2 == enumC222789sJ3 && enumC222789sJ == enumC222789sJ3) {
            return;
        }
        C55208OeM c55208OeM = this.A00;
        InterfaceC58028PoE interfaceC58028PoE = c55208OeM.A06;
        if (interfaceC58028PoE != null) {
            interfaceC58028PoE.DZC(enumC222789sJ, enumC222789sJ2);
        }
        if (enumC222789sJ2 != EnumC222789sJ.RELEASED) {
            return;
        }
        c55208OeM.A04 = null;
    }
}
