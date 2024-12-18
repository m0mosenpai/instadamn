package X;

/* renamed from: X.0vI, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC18310vI {
    public static final void A0r(Appendable appendable, Object obj, InterfaceC16660sJ interfaceC16660sJ) {
        if (interfaceC16660sJ != null) {
            obj = interfaceC16660sJ.invoke(obj);
        } else if (obj != null && !(obj instanceof CharSequence)) {
            if (obj instanceof Character) {
                appendable.append(((Character) obj).charValue());
                return;
            }
            obj = String.valueOf(obj);
        }
        appendable.append((CharSequence) obj);
    }
}
