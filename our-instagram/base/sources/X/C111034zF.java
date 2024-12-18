package X;

/* renamed from: X.4zF, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C111034zF extends C0T6 implements InterfaceC111044zG {
    public final C38321qM A00;
    public final Integer A01;

    public C111034zF(C38321qM c38321qM, Integer num) {
        C14360o3.A0B(c38321qM, 1);
        this.A00 = c38321qM;
        this.A01 = num;
    }

    @Override // X.InterfaceC111044zG
    public final InterfaceC111044zG E8p(C1DY c1dy) {
        return this;
    }

    @Override // X.InterfaceC111044zG
    public final C111034zF Erx(C1DY c1dy) {
        return this;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C111034zF) {
                C111034zF c111034zF = (C111034zF) obj;
                if (!C14360o3.A0K(this.A00, c111034zF.A00) || !C14360o3.A0K(this.A01, c111034zF.A01)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int hashCode = this.A00.hashCode() * 31;
        Integer num = this.A01;
        return hashCode + (num == null ? 0 : num.hashCode());
    }

    @Override // X.InterfaceC111044zG
    public final C38321qM BQN() {
        return this.A00;
    }

    @Override // X.InterfaceC111044zG
    public final Integer CBl() {
        return this.A01;
    }
}
