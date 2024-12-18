package X;

/* renamed from: X.5AY, reason: invalid class name */
/* loaded from: classes3.dex */
public abstract class C5AY extends C58J {
    public C58J A00;
    public final int A01 = AbstractC114275Dr.A01(this);

    public final void A0F(C58K c58k) {
        String obj;
        C58J c58j = (C58J) c58k;
        C58J c58j2 = c58j.A03;
        boolean z = false;
        if (c58j2 != c58k) {
            z = true;
        }
        C58J c58j3 = null;
        if (z) {
            if (c58k instanceof C58J) {
                c58j3 = c58j.A04;
            }
            if (c58j2 == this.A03 && C14360o3.A0K(c58j3, this)) {
                return;
            } else {
                throw new IllegalStateException("Cannot delegate to an already delegated node");
            }
        }
        if (!(!c58j2.A08)) {
            obj = "Cannot delegate to an already attached node";
        } else {
            c58j2.A06(this.A03);
            int i = super.A01;
            int A02 = AbstractC114275Dr.A02(c58j2);
            c58j2.A01 = A02;
            int i2 = super.A01;
            int i3 = A02 & 2;
            if (i3 != 0 && (i2 & 2) != 0 && !(this instanceof C5DW)) {
                StringBuilder sb = new StringBuilder();
                sb.append("Delegating to multiple LayoutModifierNodes without the delegating node implementing LayoutModifierNode itself is not allowed.\nDelegating Node: ");
                sb.append(this);
                sb.append("\nDelegate Node: ");
                sb.append(c58j2);
                obj = sb.toString();
            } else {
                c58j2.A02 = this.A00;
                this.A00 = c58j2;
                c58j2.A04 = this;
                A00(i2 | A02, false);
                if (!this.A08) {
                    return;
                }
                if (i3 != 0 && (i & 2) == 0) {
                    C59S c59s = AbstractC114335Dx.A02(this).A0W;
                    this.A03.A07(null);
                    c59s.A06();
                } else {
                    A07(this.A05);
                }
                c58j2.A08();
                c58j2.A0C();
                AbstractC114275Dr.A03(c58j2);
                return;
            }
        }
        AbstractC28290Cdc.A01(obj);
        throw C00O.createAndThrow();
    }

    private final void A00(int i, boolean z) {
        int i2;
        int i3 = super.A01;
        super.A01 = i;
        if (i3 != i) {
            C58J c58j = this.A03;
            if (c58j == this) {
                super.A00 = i;
            }
            if (this.A08) {
                C58J c58j2 = this;
                do {
                    i |= c58j2.A01;
                    c58j2.A01 = i;
                    if (c58j2 == c58j) {
                        break;
                    } else {
                        c58j2 = c58j2.A04;
                    }
                } while (c58j2 != null);
                if (z && c58j2 == c58j) {
                    i = AbstractC114275Dr.A02(c58j);
                    c58j.A01 = i;
                }
                if (c58j2 != null) {
                    C58J c58j3 = c58j2.A02;
                    if (c58j3 != null) {
                        i2 = c58j3.A00;
                    } else {
                        i2 = 0;
                    }
                    int i4 = i | i2;
                    do {
                        i4 |= c58j2.A01;
                        c58j2.A00 = i4;
                        c58j2 = c58j2.A04;
                    } while (c58j2 != null);
                }
            }
        }
    }

    @Override // X.C58J
    public final void A09() {
        for (C58J c58j = this.A00; c58j != null; c58j = c58j.A02) {
            c58j.A09();
        }
        super.A09();
    }

    @Override // X.C58J
    public final void A0C() {
        for (C58J c58j = this.A00; c58j != null; c58j = c58j.A02) {
            c58j.A0C();
        }
        super.A0C();
    }

    public final void A0G(C58K c58k) {
        C58J c58j = null;
        for (C58J c58j2 = this.A00; c58j2 != null; c58j2 = c58j2.A02) {
            if (c58j2 == c58k) {
                if (c58j2.A08) {
                    AbstractC114275Dr.A05(c58j2, -1, 2);
                    c58j2.A0D();
                    c58j2.A09();
                }
                c58j2.A06(c58j2);
                c58j2.A00 = 0;
                C58J c58j3 = c58j2.A02;
                if (c58j == null) {
                    this.A00 = c58j3;
                } else {
                    c58j.A02 = c58j3;
                }
                c58j2.A02 = null;
                c58j2.A04 = null;
                int i = super.A01;
                int A02 = AbstractC114275Dr.A02(this);
                A00(A02, true);
                if (this.A08 && (i & 2) != 0 && (A02 & 2) == 0) {
                    C59S c59s = AbstractC114335Dx.A02(this).A0W;
                    this.A03.A07(null);
                    c59s.A06();
                    return;
                }
                return;
            }
            c58j = c58j2;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Could not find delegate: ");
        sb.append(c58k);
        throw new IllegalStateException(sb.toString());
    }

    @Override // X.C58J
    public final void A08() {
        super.A08();
        for (C58J c58j = this.A00; c58j != null; c58j = c58j.A02) {
            c58j.A07(this.A05);
            if (!c58j.A08) {
                c58j.A08();
            }
        }
    }

    @Override // X.C58J
    public final void A0B() {
        super.A0B();
        for (C58J c58j = this.A00; c58j != null; c58j = c58j.A02) {
            c58j.A0B();
        }
    }

    @Override // X.C58J
    public final void A0D() {
        super.A0D();
        for (C58J c58j = this.A00; c58j != null; c58j = c58j.A02) {
            c58j.A0D();
        }
    }
}
