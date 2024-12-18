package X;

/* renamed from: X.4jJ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C102424jJ extends AbstractC911744t {
    public final AbstractC910944l A00;
    public final Object A01;

    @Override // X.AbstractC910944l
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj == null || obj.getClass() != getClass()) {
            return false;
        }
        return this.A00.equals(((C102424jJ) obj).A00);
    }

    @Override // X.AbstractC910944l
    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("[array type, component type: ");
        sb.append(this.A00);
        sb.append("]");
        return sb.toString();
    }

    public C102424jJ(AbstractC910944l abstractC910944l, C911244o c911244o, Object obj, Object obj2, Object obj3, boolean z) {
        super(null, c911244o, obj.getClass(), obj2, obj3, null, abstractC910944l.hashCode(), z);
        this.A00 = abstractC910944l;
        this.A01 = obj;
    }

    @Override // X.AbstractC910944l
    public final boolean A0K() {
        if (!super.A0K() && !this.A00.A0K()) {
            return false;
        }
        return true;
    }
}
