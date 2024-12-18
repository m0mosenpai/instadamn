package X;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.Executor;

/* renamed from: X.0Le, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C04380Le implements C0Gd {
    public final Executor A03;
    public final Object A00 = new Object();
    public final Random A02 = new Random();
    public final List A01 = new ArrayList();

    /* JADX WARN: Type inference failed for: r0v15, types: [java.lang.Object, X.0P6] */
    public static synchronized void A00(C04380Le c04380Le, String str, String str2, Throwable th) {
        synchronized (c04380Le) {
            if (!C0P2.A01) {
                List list = c04380Le.A01;
                if (list.size() < 100) {
                    C0K8.A0P("lacrima", "Soft error detector missing: %s %s, delaying", str, str2);
                    ?? obj = new Object();
                    obj.A00 = str;
                    obj.A01 = str2;
                    obj.A02 = th;
                    list.add(obj);
                } else {
                    C0K8.A0P("lacrima", "Soft error detector missing: %s %s, skipping", str, str2);
                }
            } else {
                List<C0P6> list2 = c04380Le.A01;
                if (!list2.isEmpty()) {
                    C0K8.A0P("lacrima", "Sending pending soft errors... [%d]", Integer.valueOf(list2.size()));
                    for (C0P6 c0p6 : list2) {
                        synchronized (c04380Le.A00) {
                            try {
                            } catch (Throwable th2) {
                                throw th2;
                            }
                        }
                        if (C0P2.A01) {
                            C0P2.A00(c0p6.A00, c0p6.A01, c0p6.A02);
                        }
                    }
                }
                synchronized (c04380Le.A00) {
                    try {
                    } catch (Throwable th3) {
                        throw th3;
                    }
                }
                if (C0P2.A01) {
                    C0P2.A00(str, str2, th);
                }
            }
        }
    }

    @Override // X.C0Gd
    public final void EHD(String str, Integer num, String str2) {
        EHC(num, str, str2, null);
    }

    @Override // X.C0Gd
    public final void EmR(String str, Throwable th, int i) {
        String message = th.getMessage();
        if (message == null) {
            message = "Empty cause message";
        }
        EmT(str, message, 1, th);
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0008, code lost:
    
        if (r5 == X.C05F.A0j) goto L6;
     */
    @Override // X.C0Gd
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void EHC(java.lang.Integer r5, java.lang.String r6, java.lang.String r7, java.lang.Throwable r8) {
        /*
            r4 = this;
            java.lang.Integer r0 = X.C05F.A1I
            if (r5 == r0) goto La
            java.lang.Integer r0 = X.C05F.A0j
            r3 = 1000(0x3e8, float:1.401E-42)
            if (r5 != r0) goto Lb
        La:
            r3 = 1
        Lb:
            java.lang.String r2 = "IMPACT_"
            int r0 = r5.intValue()
            switch(r0) {
                case 1: goto L20;
                case 2: goto L23;
                case 3: goto L26;
                case 4: goto L29;
                case 5: goto L2c;
                case 6: goto L2f;
                case 7: goto L32;
                case 8: goto L35;
                case 9: goto L38;
                default: goto L14;
            }
        L14:
            java.lang.String r1 = "LOGGING"
        L16:
            java.lang.String r0 = "::"
            java.lang.String r0 = X.AnonymousClass001.A0u(r2, r1, r0, r6)
            r4.EmT(r0, r7, r3, r8)
            return
        L20:
            java.lang.String r1 = "MEDIUM_SEVERITY"
            goto L16
        L23:
            java.lang.String r1 = "HIGH_SEVERITY"
            goto L16
        L26:
            java.lang.String r1 = "EXTREME_SEVERITY"
            goto L16
        L29:
            java.lang.String r1 = "CRASH_LIKE"
            goto L16
        L2c:
            java.lang.String r1 = "FAIL_FUNCTIONAL"
            goto L16
        L2f:
            java.lang.String r1 = "FAIL_CONTENT_CREATION"
            goto L16
        L32:
            java.lang.String r1 = "PRIVACY"
            goto L16
        L35:
            java.lang.String r1 = "LEGACY"
            goto L16
        L38:
            java.lang.String r1 = "LEGACY_FAIL_HARDER"
            goto L16
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C04380Le.EHC(java.lang.Integer, java.lang.String, java.lang.String, java.lang.Throwable):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0039, code lost:
    
        if ((java.lang.System.currentTimeMillis() - r0.longValue()) >= r8.A03) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x008e, code lost:
    
        if ((r13 % java.lang.Math.min(r8.A00, r2)) != 0) goto L34;
     */
    @Override // X.C0Gd
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void EHm(java.lang.Throwable r23) {
        /*
            Method dump skipped, instructions count: 467
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C04380Le.EHm(java.lang.Throwable):void");
    }

    @Override // X.C0Gd
    public final void EmM(final C0Gf c0Gf) {
        final Throwable th;
        if (this.A02.nextInt(Math.max(1, c0Gf.A00)) == 0) {
            C0Ge c0Ge = c0Gf.A01;
            if (c0Ge.get() == null) {
                th = new Exception(AnonymousClass001.A0g(c0Gf.A02, " | ", c0Gf.A03), null);
            } else {
                th = (Throwable) c0Ge.get();
            }
            if (C0M4.A00 != 4) {
                this.A03.execute(new Runnable() { // from class: X.0P3
                    @Override // java.lang.Runnable
                    public final void run() {
                        C04380Le c04380Le = this;
                        C0Gf c0Gf2 = c0Gf;
                        C04380Le.A00(c04380Le, c0Gf2.A02, c0Gf2.A03, th);
                    }
                });
            }
        }
    }

    @Override // X.C0Gd
    public final void EmN(String str, String str2) {
        C03360Gh c03360Gh = new C03360Gh();
        c03360Gh.A01 = str;
        c03360Gh.A02 = str2;
        EmM(new C0Gf(c03360Gh));
    }

    @Override // X.C0Gd
    public final void EmO(String str, String str2, int i) {
        C03360Gh c03360Gh = new C03360Gh();
        c03360Gh.A01 = str;
        c03360Gh.A02 = str2;
        c03360Gh.A00 = i;
        EmM(new C0Gf(c03360Gh));
    }

    @Override // X.C0Gd
    public final void EmP(String str, String str2, Throwable th) {
        C03360Gh c03360Gh = new C03360Gh();
        c03360Gh.A01 = str;
        c03360Gh.A02 = str2;
        c03360Gh.A03 = th;
        EmM(new C0Gf(c03360Gh));
    }

    @Override // X.C0Gd
    public final void EmT(String str, String str2, int i, Throwable th) {
        C03360Gh c03360Gh = new C03360Gh();
        c03360Gh.A01 = str;
        c03360Gh.A02 = str2;
        c03360Gh.A03 = th;
        c03360Gh.A00 = i;
        EmM(new C0Gf(c03360Gh));
    }

    @Override // X.C0Gd
    public final void EmW(String str, String str2) {
        EHD(str, C05F.A1I, str2);
    }

    @Override // X.C0Gd
    public final void EmX(String str, String str2, Throwable th) {
        EHC(C05F.A1I, str, "Choreographer reflection failed.", th);
    }

    @Override // X.C0Gd
    public final void EmY(String str, Throwable th) {
        String str2;
        Integer num = C05F.A1I;
        if (th.getMessage() != null) {
            str2 = th.getMessage();
        } else {
            str2 = "";
        }
        EHC(num, str, str2, th);
    }

    public C04380Le(Executor executor) {
        this.A03 = executor;
    }

    @Override // X.C0Gd
    public final void EmQ(String str, Throwable th) {
        String message = th.getMessage();
        if (message == null) {
            message = "Empty cause message";
        }
        EmP(str, message, th);
    }
}
