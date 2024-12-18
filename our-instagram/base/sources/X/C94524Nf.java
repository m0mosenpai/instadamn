package X;

/* renamed from: X.4Nf, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C94524Nf extends C0T6 implements InterfaceC94534Ng {
    public final long A00;
    public final C4NJ A01;
    public final C94554Ni A02;
    public final C94544Nh A03;

    public C94524Nf(C4NJ c4nj) {
        C94554Ni c94554Ni;
        C14360o3.A0B(c4nj, 1);
        this.A01 = c4nj;
        this.A03 = new C94544Nh(c4nj.A08);
        C4NZ c4nz = c4nj.A07;
        if (c4nz != null) {
            c94554Ni = new C94554Ni(c4nz);
        } else {
            c94554Ni = null;
        }
        this.A02 = c94554Ni;
        this.A00 = c4nj.A01;
    }

    public final boolean equals(Object obj) {
        return this == obj || ((obj instanceof C94524Nf) && C14360o3.A0K(this.A01, ((C94524Nf) obj).A01));
    }

    public final int hashCode() {
        return this.A01.hashCode();
    }
}
