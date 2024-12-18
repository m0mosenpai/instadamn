package X;

/* loaded from: classes11.dex */
public final class WZP implements InterfaceC71894X9b {
    public final /* synthetic */ WZG A00;

    public WZP(WZG wzg) {
        this.A00 = wzg;
    }

    @Override // X.InterfaceC71894X9b
    public final void DZC(EnumC222789sJ enumC222789sJ, EnumC222789sJ enumC222789sJ2) {
        InterfaceC71894X9b interfaceC71894X9b;
        AbstractC167017dG.A1N(enumC222789sJ, enumC222789sJ2);
        EnumC222789sJ enumC222789sJ3 = EnumC222789sJ.ERROR;
        if (enumC222789sJ2 != enumC222789sJ3) {
            if ((enumC222789sJ == enumC222789sJ3 && enumC222789sJ2 == EnumC222789sJ.RELEASED) || (interfaceC71894X9b = this.A00.A02) == null) {
                return;
            }
            interfaceC71894X9b.DZC(enumC222789sJ, enumC222789sJ2);
        }
    }
}
