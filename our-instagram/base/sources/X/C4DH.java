package X;

/* renamed from: X.4DH, reason: invalid class name */
/* loaded from: classes2.dex */
public abstract class C4DH {
    public static final int A00;

    static {
        Object c09540e5;
        int i;
        try {
            String property = System.getProperty("kotlinx.serialization.json.pool.size");
            C14360o3.A07(property);
            c09540e5 = AbstractC003100w.A0j(property, 10);
        } catch (Throwable th) {
            c09540e5 = new C09540e5(th);
        }
        if (c09540e5 instanceof C09540e5) {
            c09540e5 = null;
        }
        Number number = (Number) c09540e5;
        if (number != null) {
            i = number.intValue();
        } else {
            i = 2097152;
        }
        A00 = i;
    }
}
