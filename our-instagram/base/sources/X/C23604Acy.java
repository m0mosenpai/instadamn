package X;

/* renamed from: X.Acy, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C23604Acy implements InterfaceC58028PoE {
    public final /* synthetic */ BDN A00;

    @Override // X.InterfaceC58028PoE
    public final void DZ5(long j) {
    }

    @Override // X.InterfaceC58028PoE
    public final void DZC(EnumC222789sJ enumC222789sJ, EnumC222789sJ enumC222789sJ2) {
        C14360o3.A0B(enumC222789sJ2, 1);
        if (enumC222789sJ2 == EnumC222789sJ.PLAYBACK_COMPLETE) {
            this.A00.onCompletion();
        }
        if (enumC222789sJ2 == EnumC222789sJ.READY) {
            this.A00.DaT();
        }
        if (enumC222789sJ2 == EnumC222789sJ.ERROR) {
            this.A00.DE2();
        }
    }

    public C23604Acy(BDN bdn) {
        this.A00 = bdn;
    }
}
