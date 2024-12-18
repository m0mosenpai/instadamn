package X;

/* renamed from: X.04e, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public abstract /* synthetic */ class AbstractC011604e {
    public static final InterfaceC19390xP A00(Integer num, InterfaceC19390xP interfaceC19390xP, int i) {
        if (i < 0 && i != -2) {
            if (i == -1) {
                num = C05F.A01;
                i = 0;
            } else {
                throw new IllegalArgumentException(AnonymousClass001.A0O("Buffer size should be non-negative, BUFFERED, or CONFLATED, but was ", i));
            }
        }
        if (interfaceC19390xP instanceof InterfaceC14870p1) {
            return ((InterfaceC14870p1) interfaceC19390xP).AWl(num, AnonymousClass191.A00, i);
        }
        return new AnonymousClass055(num, AnonymousClass191.A00, interfaceC19390xP, i);
    }

    public static final InterfaceC19390xP A01(C12W c12w, InterfaceC19390xP interfaceC19390xP) {
        if (c12w.get(AnonymousClass195.A00) == null) {
            if (!c12w.equals(AnonymousClass191.A00)) {
                if (interfaceC19390xP instanceof InterfaceC14870p1) {
                    return ((InterfaceC14870p1) interfaceC19390xP).AWl(C05F.A00, c12w, -3);
                }
                return new AnonymousClass055(C05F.A00, c12w, interfaceC19390xP, -3);
            }
            return interfaceC19390xP;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Flow context cannot contain job in it. Had ");
        sb.append(c12w);
        throw new IllegalArgumentException(sb.toString());
    }
}
