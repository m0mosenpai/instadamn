package X;

/* renamed from: X.8Se, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C187368Se extends AbstractC187378Sf {
    public final boolean A00;

    public final boolean equals(Object obj) {
        return this == obj || ((obj instanceof C187368Se) && this.A00 == ((C187368Se) obj).A00);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("UnSelected(canAddTransition=");
        sb.append(this.A00);
        sb.append(", canTapToCut=");
        sb.append(false);
        sb.append(')');
        return sb.toString();
    }

    public final int hashCode() {
        int i = 1237;
        if (this.A00) {
            i = 1231;
        }
        return (i * 31) + AbstractC53644Nnp.A00();
    }

    public C187368Se(boolean z) {
        this.A00 = z;
    }

    public C187368Se() {
        this(false);
    }
}
