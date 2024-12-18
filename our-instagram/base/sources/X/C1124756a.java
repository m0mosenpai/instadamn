package X;

/* renamed from: X.56a, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1124756a {
    public NRH A00;
    public C1124956c A01;
    public NRI A02;

    public static final synchronized void A00(AbstractC1125056d abstractC1125056d, C1124756a c1124756a) {
        synchronized (c1124756a) {
            c1124756a.A01 = null;
            c1124756a.A02 = null;
            c1124756a.A00 = null;
            if (abstractC1125056d instanceof NRH) {
                c1124756a.A00 = (NRH) abstractC1125056d;
            } else if (abstractC1125056d instanceof C1124956c) {
                c1124756a.A01 = (C1124956c) abstractC1125056d;
            } else if (abstractC1125056d instanceof NRI) {
                c1124756a.A02 = (NRI) abstractC1125056d;
            } else {
                StringBuilder sb = new StringBuilder();
                sb.append("Unknown configuration type: ");
                sb.append(abstractC1125056d.getClass());
                throw new IllegalArgumentException(sb.toString());
            }
        }
    }
}
