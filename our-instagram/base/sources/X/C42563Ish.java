package X;

/* renamed from: X.Ish, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C42563Ish implements InterfaceC101554hQ {
    public final /* synthetic */ C38P A00;

    public C42563Ish(C38P c38p) {
        this.A00 = c38p;
    }

    @Override // X.InterfaceC101554hQ
    public final void DXz() {
        JIG jig = this.A00.A07;
        if (jig == null) {
            C14360o3.A0F("videoPlayerManager");
            throw C00O.createAndThrow();
        }
        jig.E3f("peek");
    }

    @Override // X.InterfaceC101554hQ
    public final void DY1() {
        String str;
        C38P c38p = this.A00;
        JIG jig = c38p.A07;
        if (jig == null) {
            str = "videoPlayerManager";
        } else {
            jig.EKj();
            if (c38p.isResumed()) {
                C30A c30a = c38p.A0L;
                if (c30a instanceof AnonymousClass308) {
                    C38321qM A07 = ((AnonymousClass308) c30a).A07();
                    if (A07.A0C.C86() != null) {
                        C65823Tug c65823Tug = c38p.A06;
                        if (c65823Tug == null) {
                            str = "grid";
                        } else {
                            String id = A07.getId();
                            if (id != null) {
                                c65823Tug.A08(id);
                                return;
                            }
                            throw AbstractC166997dE.A0g();
                        }
                    } else {
                        return;
                    }
                } else {
                    return;
                }
            } else {
                return;
            }
        }
        C14360o3.A0F(str);
        throw C00O.createAndThrow();
    }
}
