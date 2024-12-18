package X;

import com.instagram.common.gallery.Medium;

/* renamed from: X.9kM, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C217899kM extends C6RO {
    public int A00;
    public int A01;
    public Medium A02;

    public C217899kM(Medium medium, int i, int i2) {
        C14360o3.A0B(medium, 1);
        this.A02 = medium;
        this.A01 = i;
        this.A00 = i2;
    }

    public final Medium A00() {
        Medium medium = this.A02;
        if (medium != null) {
            return medium;
        }
        C14360o3.A0F("medium");
        throw C00O.createAndThrow();
    }

    @Override // X.C5NL
    public final C5NG BlQ() {
        C148276lx c148276lx = C148276lx.A0a;
        C148276lx A00 = AbstractC148296lz.A00();
        C5NG A0V = AbstractC167007dF.A0V();
        AbstractC166987dD.A1V(A00, A0V);
        A0V.A01(super.A00);
        return A0V;
    }

    @Override // X.C5NL
    public final Integer CBq() {
        return C05F.A03;
    }

    public C217899kM() {
    }
}
