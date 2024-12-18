package X;

import java.io.IOException;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: X.14M, reason: invalid class name */
/* loaded from: classes.dex */
public final class C14M {
    public static C14M A01;
    public static InterfaceC09390do A02;
    public static boolean A03;
    public static final C14O A04 = new C14O() { // from class: X.14N
        public final String A00;

        @Override // X.C14O
        public final void E43(C1QW c1qw, String str) {
            String host = c1qw.A09.getHost();
            if (host != null && host.equalsIgnoreCase(this.A00)) {
                c1qw.A01("Referer", "android.instagram.com");
            }
        }

        {
            String host = AbstractC08820cl.A03("https://maps.googleapis.com/maps/api/staticmap?").getHost();
            host.getClass();
            this.A00 = host;
        }
    };
    public final List A00 = Arrays.asList(A04, C1NW.A00);

    public static C1JO A01(AbstractC12990ll abstractC12990ll) {
        if (abstractC12990ll != null && C18U.A06(C06090Tz.A05, abstractC12990ll, 36322336558819488L)) {
            return new C1JO(abstractC12990ll);
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Integer] */
    /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r1v5, types: [X.4J5, X.4J4] */
    /* JADX WARN: Type inference failed for: r9v0, types: [X.4J3] */
    public static C4J7 A02(C4J3 c4j3, C1QW c1qw, C1QY c1qy, C2n4 c2n4, C14M c14m, Map map) {
        C23781El A012;
        if (map != null) {
            for (Map.Entry entry : map.entrySet()) {
                c1qw.A01((String) entry.getKey(), (String) entry.getValue());
            }
        }
        A04(c1qw, c14m, c2n4.A07);
        C26461Qb c26461Qb = new C26461Qb(c1qw, c1qy);
        C23311Bt A00 = C23311Bt.A00();
        C1QW c1qw2 = c26461Qb.A02;
        ?? r1 = c1qw2.A07;
        if (r1 != C05F.A00) {
            boolean z = C23311Bt.A00;
            C26581Qn c26581Qn = new C26581Qn(c1qw2.A09, z);
            C13080lu A002 = AbstractC13090lv.A00("SyncHttpService.sendRequest");
            try {
                try {
                    InterfaceC27191Tt A022 = C1C6.A00().A02(c26581Qn, c1qw2, c26461Qb.A03);
                    c26461Qb.A01(new C1U0(A00, A022));
                    r1 = new C4J4(c26581Qn, A00, A022, z);
                    if (c4j3 != 0) {
                        c4j3.DgE(r1);
                    }
                    A002.close();
                    A002 = AbstractC13090lv.A00("SyncHttpService.waitForResponse");
                    try {
                        C26581Qn.A00(c26581Qn);
                        IOException iOException = c26581Qn.A09;
                        if (iOException == null) {
                            if (c4j3 != 0) {
                                c4j3.DL1(r1);
                            }
                            c26581Qn.A00.getClass();
                            C3JY c3jy = c26581Qn.A00;
                            A002.close();
                            InterfaceC26481Qd A003 = c3jy.A00();
                            if (A003 != null) {
                                long j = -1;
                                if (c3jy.A01("Content-Range") != null && (A012 = c3jy.A01("Content-Range")) != null) {
                                    String str = A012.A01;
                                    try {
                                        j = Long.parseLong(str.split("/")[1]);
                                    } catch (NumberFormatException unused) {
                                        C0w9.A03("IgDownloader", AnonymousClass001.A0R("failed to parse content-range ", str));
                                    }
                                }
                                return new C4J7(c3jy, A003, c26461Qb, c14m, j);
                            }
                            throw new IOException(AnonymousClass001.A0O("response doesn't have body, status code : ", c3jy.A02));
                        }
                        throw iOException;
                    } catch (Throwable th) {
                        throw th;
                    }
                } finally {
                    A002.close();
                }
            } catch (Throwable th2) {
                Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(r1, th2);
                throw r1;
            }
        }
        throw new IllegalArgumentException("SyncHttpService doesn't support HEAD request.  It will create a deadlock with no response data callback");
    }

    public static C14M A03() {
        C14M c14m;
        if (A03) {
            synchronized (C14M.class) {
                c14m = A01;
                if (c14m == null) {
                    c14m = (C14M) A02.getValue();
                    A01 = c14m;
                }
            }
            return c14m;
        }
        return A01;
    }

    public static void A04(C1QW c1qw, C14M c14m, String str) {
        Iterator it = c14m.A00.iterator();
        while (it.hasNext()) {
            ((C14O) it.next()).E43(c1qw, str);
        }
    }

    public static synchronized void A05(C14M c14m) {
        synchronized (C14M.class) {
            if (A01 == null) {
                A01 = c14m;
            }
        }
    }

    public static C1QW A00(C1JP c1jp, InterfaceC222716g interfaceC222716g) {
        interfaceC222716g.CDP();
        C26371Ps c26371Ps = new C26371Ps(c1jp);
        c26371Ps.A02(interfaceC222716g.CDP());
        c26371Ps.A01(C05F.A0N);
        return c26371Ps.A00();
    }

    public final InterfaceC27191Tt A06(InterfaceC26491Qe interfaceC26491Qe, C1QY c1qy, C2n4 c2n4, AbstractC12990ll abstractC12990ll) {
        C1QW A00 = A00(A01(abstractC12990ll), c2n4);
        A04(A00, this, c2n4.A07);
        return C1C6.A00().A02(interfaceC26491Qe, A00, c1qy);
    }

    public final C4J7 A07(C4J3 c4j3, C1QY c1qy, C2n4 c2n4, AbstractC12990ll abstractC12990ll, Map map, long j, long j2) {
        Object obj;
        C1QW A00 = A00(A01(abstractC12990ll), c2n4);
        if (j >= 0) {
            Long valueOf = Long.valueOf(j);
            if (j2 >= 0) {
                obj = Long.valueOf(j2);
            } else {
                obj = "";
            }
            A00.A01("Range", AbstractC13670mt.A06("bytes=%s-%s", valueOf, obj));
            if (j2 >= 0) {
                A00.A01("Size-Bytes", String.valueOf((j2 - j) + 1));
            }
        }
        return A02(c4j3, A00, c1qy, c2n4, this, map);
    }

    public final C4J7 A08(C1QY c1qy, C2n4 c2n4, AbstractC12990ll abstractC12990ll) {
        return A02(null, A00(A01(abstractC12990ll), c2n4), c1qy, c2n4, this, null);
    }
}
