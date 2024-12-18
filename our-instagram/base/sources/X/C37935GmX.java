package X;

/* renamed from: X.GmX, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C37935GmX implements InterfaceC62602sz {
    public final /* synthetic */ C38P A00;

    public C37935GmX(C38P c38p) {
        this.A00 = c38p;
    }

    @Override // X.InterfaceC62602sz
    public final boolean CL7() {
        C65823Tug c65823Tug = this.A00.A06;
        if (c65823Tug == null) {
            AbstractC37300Gc1.A0a();
            throw C00O.createAndThrow();
        }
        return c65823Tug.A0A();
    }

    @Override // X.InterfaceC62602sz
    public final boolean CLJ() {
        C38139Gq6 c38139Gq6;
        String str;
        C37934GmW c37934GmW = this.A00.A0E;
        if (c37934GmW == null) {
            str = "dataStore";
        } else {
            if (!c37934GmW.A08) {
                c38139Gq6 = c37934GmW.A00;
                if (c38139Gq6 == null) {
                    str = "feedNetworkSource";
                }
                return c38139Gq6.A00.A05();
            }
            c38139Gq6 = c37934GmW.A01;
            if (c38139Gq6 == null) {
                str = "nonprofiledFeedNetworkSource";
            }
            return c38139Gq6.A00.A05();
        }
        C14360o3.A0F(str);
        throw C00O.createAndThrow();
    }

    @Override // X.InterfaceC62602sz
    public final boolean CUG() {
        C37934GmW c37934GmW = this.A00.A0E;
        if (c37934GmW != null && c37934GmW.A03()) {
            return true;
        }
        return false;
    }

    @Override // X.InterfaceC62602sz
    public final void Chd() {
        C38135Gq2 c38135Gq2 = this.A00.A0J;
        if (c38135Gq2 == null) {
            C14360o3.A0F("viewController");
            throw C00O.createAndThrow();
        }
        C38135Gq2.A00(c38135Gq2, C05F.A0N, false, false, c38135Gq2.A0I, false, false);
    }

    @Override // X.InterfaceC62602sz
    public final boolean isLoading() {
        C37934GmW c37934GmW = this.A00.A0E;
        if (c37934GmW != null && c37934GmW.A04()) {
            return true;
        }
        return false;
    }

    @Override // X.InterfaceC62602sz
    public final boolean CXf() {
        if (isLoading()) {
            C65823Tug c65823Tug = this.A00.A06;
            if (c65823Tug == null) {
                AbstractC37300Gc1.A0a();
                throw C00O.createAndThrow();
            }
            return c65823Tug.A0A();
        }
        return true;
    }
}
