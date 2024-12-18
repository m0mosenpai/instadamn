package X;

/* renamed from: X.4vd, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC109134vd {
    public static final C3PO A00(int i) {
        for (C3PO c3po : C3PO.values()) {
            Integer num = c3po.A00;
            if (num != null && num.intValue() == i) {
                return c3po;
            }
        }
        return null;
    }

    public static final C3PO A01(String str) {
        for (C3PO c3po : C3PO.values()) {
            if (C14360o3.A0K(c3po.A01, str)) {
                return c3po;
            }
        }
        throw new UnsupportedOperationException(AnonymousClass001.A0R("cannot find find audience mode for string: ", str));
    }
}
