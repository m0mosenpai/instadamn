package X;

/* renamed from: X.44s, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public class C911644s extends AbstractC911744t {
    /* JADX WARN: Type inference failed for: r0v0, types: [X.44s, X.44t] */
    public static C911644s A00(Class cls) {
        return new AbstractC911744t(null, null, cls, null, null, null, 0, false);
    }

    public C911644s(Class cls) {
        super(null, C911244o.A04, cls, null, null, null, 0, false);
    }

    @Override // X.AbstractC910944l
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj != null && obj.getClass() == getClass()) {
            AbstractC911744t abstractC911744t = (AbstractC911744t) obj;
            if (((AbstractC910944l) abstractC911744t).A00 == ((AbstractC910944l) this).A00) {
                return ((AbstractC911744t) this).A01.equals(abstractC911744t.A01);
            }
        }
        return false;
    }

    @Override // X.AbstractC910944l
    public String toString() {
        StringBuilder sb = new StringBuilder(40);
        sb.append("[simple type, class ");
        sb.append(A0R());
        sb.append(']');
        return sb.toString();
    }
}
