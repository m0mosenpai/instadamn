package X;

/* renamed from: X.3HH, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C3HH extends AbstractC66542zW {
    public final /* synthetic */ C3HE A00;

    public C3HH(C3HE c3he) {
        this.A00 = c3he;
    }

    @Override // X.AbstractC66542zW
    public final int A02() {
        return this.A00.A03.size();
    }

    @Override // X.AbstractC66542zW
    public final int A03() {
        return this.A00.A04.size();
    }

    @Override // X.AbstractC66542zW
    public final boolean A04(int i, int i2) {
        C3HE c3he = this.A00;
        Object obj = c3he.A04.get(i);
        Object obj2 = c3he.A03.get(i2);
        if (obj != null) {
            if (obj2 != null) {
                return c3he.A01.A04.A00.areContentsTheSame(obj, obj2);
            }
        } else if (obj2 == null) {
            return true;
        }
        throw new AssertionError();
    }

    @Override // X.AbstractC66542zW
    public final boolean A05(int i, int i2) {
        C3HE c3he = this.A00;
        Object obj = c3he.A04.get(i);
        Object obj2 = c3he.A03.get(i2);
        if (obj != null) {
            if (obj2 != null) {
                return c3he.A01.A04.A00.areItemsTheSame(obj, obj2);
            }
            return false;
        }
        if (obj2 == null) {
            return true;
        }
        return false;
    }
}
