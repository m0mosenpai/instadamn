package X;

/* renamed from: X.3fT, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C78613fT {
    public final long A00;

    public static final int A00(long j) {
        return AbstractC78623fU.A00((int) j).A01(j);
    }

    public static final int A02(long j) {
        return AbstractC78623fU.A00((int) j).A00(j);
    }

    public static final boolean A05(long j) {
        if (AbstractC78623fU.A00((int) j).A01(j) == Integer.MAX_VALUE) {
            return false;
        }
        return true;
    }

    public static final boolean A07(long j) {
        AbstractC78423f8 A00 = AbstractC78623fU.A00((int) j);
        if (A00.A01(j) != A00.A00(j)) {
            return false;
        }
        return true;
    }

    public static final int A01(long j) {
        return AbstractC78623fU.A00((int) (j >>> 32)).A02(j);
    }

    public static final int A03(long j) {
        return AbstractC78623fU.A00((int) (j >>> 32)).A03(j);
    }

    public static String A04(long j) {
        Object valueOf;
        AbstractC78423f8 A00 = AbstractC78623fU.A00((int) (j >>> 32));
        int A02 = A00.A02(j);
        Object obj = "Infinity";
        if (A02 == Integer.MAX_VALUE) {
            valueOf = "Infinity";
        } else {
            valueOf = Integer.valueOf(A02);
        }
        AbstractC78423f8 A002 = AbstractC78623fU.A00((int) j);
        int A01 = A002.A01(j);
        if (A01 != Integer.MAX_VALUE) {
            obj = Integer.valueOf(A01);
        }
        StringBuilder sb = new StringBuilder();
        sb.append("SizeConstraints[minWidth = ");
        sb.append(A00.A03(j));
        sb.append(AbstractC111324zv.A00(3406));
        sb.append(valueOf);
        sb.append(AbstractC111324zv.A00(3408));
        sb.append(A002.A00(j));
        sb.append(AbstractC111324zv.A00(3405));
        sb.append(obj);
        sb.append(']');
        return sb.toString();
    }

    public static final boolean A06(long j) {
        if (AbstractC78623fU.A00((int) (j >>> 32)).A02(j) == Integer.MAX_VALUE) {
            return false;
        }
        return true;
    }

    public static final boolean A08(long j) {
        AbstractC78423f8 A00 = AbstractC78623fU.A00((int) (j >>> 32));
        if (A00.A02(j) != A00.A03(j)) {
            return false;
        }
        return true;
    }

    public final boolean equals(Object obj) {
        long j = this.A00;
        if (!(obj instanceof C78613fT) || j != ((C78613fT) obj).A00) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        long j = this.A00;
        return (int) (j ^ (j >>> 32));
    }

    public final String toString() {
        return A04(this.A00);
    }
}
