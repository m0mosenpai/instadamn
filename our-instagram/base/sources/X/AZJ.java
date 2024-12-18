package X;

/* loaded from: classes4.dex */
public final class AZJ implements InterfaceC1809280u {
    public final /* synthetic */ C196518mh A00;

    public AZJ(C196518mh c196518mh) {
        this.A00 = c196518mh;
    }

    @Override // X.InterfaceC1809280u
    public final void DIE() {
        InterfaceC175597rZ interfaceC175597rZ = this.A00.A02;
        if (interfaceC175597rZ == null) {
            C14360o3.A0F("renderController");
            throw C00O.createAndThrow();
        }
        interfaceC175597rZ.DIE();
    }
}
