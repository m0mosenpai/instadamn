package X;

/* renamed from: X.4xv, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC110254xv {
    public static final InterfaceC08100bW A00 = new C1QF("IgSecureUriParser").A00;

    public static final int A00(InterfaceC222716g interfaceC222716g) {
        String queryParameter;
        Integer A0j;
        android.net.Uri A01 = AbstractC08820cl.A01(A00, interfaceC222716g.CDP());
        if (A01 == null || (queryParameter = A01.getQueryParameter("se")) == null || (A0j = AbstractC003100w.A0j(queryParameter, 10)) == null) {
            return -1;
        }
        return A0j.intValue();
    }
}
