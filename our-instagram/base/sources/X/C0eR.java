package X;

import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Map;

/* renamed from: X.0eR, reason: invalid class name */
/* loaded from: classes.dex */
public final class C0eR extends C07T {
    public C07S A00;
    public ArrayList A01;
    public int A02;
    public C58335PtV A03;
    public boolean A04;
    public boolean A05;
    public final WeakReference A06;
    public final C05A A07;

    public C0eR(C07X c07x) {
        this(c07x, true);
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x002f, code lost:
    
        if (r7.A04 != false) goto L13;
     */
    @Override // X.C07T
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A09(X.C07W r8) {
        /*
            r7 = this;
            r5 = 0
            X.C14360o3.A0B(r8, r5)
            java.lang.String r0 = "addObserver"
            r7.A05(r0)
            X.07S r1 = r7.A00
            X.07S r0 = X.C07S.DESTROYED
            if (r1 == r0) goto L11
            X.07S r0 = X.C07S.INITIALIZED
        L11:
            X.07a r3 = new X.07a
            r3.<init>(r0, r8)
            X.PtV r0 = r7.A03
            java.lang.Object r0 = r0.A07(r8, r3)
            if (r0 != 0) goto La1
            java.lang.ref.WeakReference r0 = r7.A06
            java.lang.Object r4 = r0.get()
            X.07X r4 = (X.C07X) r4
            if (r4 == 0) goto La1
            int r0 = r7.A02
            if (r0 != 0) goto L31
            boolean r0 = r7.A04
            r6 = 0
            if (r0 == 0) goto L32
        L31:
            r6 = 1
        L32:
            X.07S r1 = r7.A00(r8)
            int r0 = r7.A02
            int r0 = r0 + 1
            r7.A02 = r0
        L3c:
            X.07S r0 = r3.A00
            int r0 = r0.compareTo(r1)
            if (r0 >= 0) goto L96
            X.PtV r0 = r7.A03
            boolean r0 = r0.A09(r8)
            if (r0 == 0) goto L96
            X.07S r0 = r3.A00
            java.util.ArrayList r2 = r7.A01
            r2.add(r0)
            X.C14360o3.A0B(r0, r5)
            int r1 = r0.ordinal()
            r0 = 2
            if (r1 == r0) goto L80
            r0 = 3
            if (r1 == r0) goto L7d
            r0 = 1
            if (r1 == r0) goto L83
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = "no event up from "
            r1.append(r0)
            X.07S r0 = r3.A00
            r1.append(r0)
            java.lang.String r1 = r1.toString()
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        L7d:
            X.07R r0 = X.C07R.ON_RESUME
            goto L85
        L80:
            X.07R r0 = X.C07R.ON_START
            goto L85
        L83:
            X.07R r0 = X.C07R.ON_CREATE
        L85:
            r3.A00(r0, r4)
            int r0 = r2.size()
            int r0 = r0 + (-1)
            r2.remove(r0)
            X.07S r1 = r7.A00(r8)
            goto L3c
        L96:
            if (r6 != 0) goto L9b
            r7.A01()
        L9b:
            int r0 = r7.A02
            int r0 = r0 + (-1)
            r7.A02 = r0
        La1:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0eR.A09(X.07W):void");
    }

    @Override // X.C07T
    public final void A0A(C07W c07w) {
        C14360o3.A0B(c07w, 0);
        A05("removeObserver");
        this.A03.A06(c07w);
    }

    public final void A0C(C07S c07s) {
        C14360o3.A0B(c07s, 0);
        A05("setCurrentState");
        A02(c07s);
    }

    private final C07S A00(C07W c07w) {
        C07S c07s;
        C018007a c018007a;
        C58345Ptg A08 = this.A03.A08(c07w);
        C07S c07s2 = null;
        if (A08 != null && (c018007a = (C018007a) A08.getValue()) != null) {
            c07s = c018007a.A00;
        } else {
            c07s = null;
        }
        ArrayList arrayList = this.A01;
        if (!arrayList.isEmpty()) {
            c07s2 = (C07S) arrayList.get(arrayList.size() - 1);
        }
        C07S c07s3 = this.A00;
        if (c07s != null && c07s.compareTo(c07s3) < 0) {
            c07s3 = c07s;
        }
        if (c07s2 != null && c07s2.compareTo(c07s3) < 0) {
            return c07s2;
        }
        return c07s3;
    }

    private final void A01() {
        C07X c07x = (C07X) this.A06.get();
        if (c07x == null) {
            throw new IllegalStateException("LifecycleOwner of this LifecycleRegistry is already garbage collected. It is too late to change lifecycle state.");
        }
        while (true) {
            boolean A06 = A06();
            this.A05 = false;
            if (!A06) {
                C07S c07s = this.A00;
                C58345Ptg A02 = this.A03.A02();
                C14360o3.A0A(A02);
                if (c07s.compareTo(((C018007a) A02.getValue()).A00) < 0) {
                    A03(c07x);
                }
                C58345Ptg A03 = this.A03.A03();
                if (!this.A05 && A03 != null && this.A00.compareTo(((C018007a) A03.getValue()).A00) > 0) {
                    A04(c07x);
                }
            } else {
                this.A07.Egh(this.A00);
                return;
            }
        }
    }

    private final void A02(C07S c07s) {
        C07S c07s2 = this.A00;
        if (c07s2 != c07s) {
            if (c07s2 == C07S.INITIALIZED && c07s == C07S.DESTROYED) {
                StringBuilder sb = new StringBuilder();
                sb.append("State must be at least CREATED to move to ");
                sb.append(c07s);
                sb.append(", but was ");
                sb.append(this.A00);
                sb.append(" in component ");
                sb.append(this.A06.get());
                throw new IllegalStateException(sb.toString());
            }
            this.A00 = c07s;
            if (!this.A04 && this.A02 == 0) {
                this.A04 = true;
                A01();
                this.A04 = false;
                if (this.A00 == C07S.DESTROYED) {
                    this.A03 = new C58335PtV();
                    return;
                }
                return;
            }
            this.A05 = true;
        }
    }

    private final void A03(C07X c07x) {
        C74023Tq A01 = this.A03.A01();
        while (A01.hasNext() && !this.A05) {
            Map.Entry entry = (Map.Entry) A01.next();
            C14360o3.A05(entry);
            Object key = entry.getKey();
            C018007a c018007a = (C018007a) entry.getValue();
            while (c018007a.A00.compareTo(this.A00) > 0 && !this.A05 && this.A03.A09(key)) {
                C07R A00 = C07P.A00(c018007a.A00);
                if (A00 != null) {
                    C07S A002 = A00.A00();
                    ArrayList arrayList = this.A01;
                    arrayList.add(A002);
                    c018007a.A00(A00, c07x);
                    arrayList.remove(arrayList.size() - 1);
                } else {
                    StringBuilder sb = new StringBuilder();
                    sb.append("no event down from ");
                    sb.append(c018007a.A00);
                    throw new IllegalStateException(sb.toString());
                }
            }
        }
    }

    private final void A04(C07X c07x) {
        C07R c07r;
        C211611s A05 = this.A03.A05();
        while (A05.hasNext() && !this.A05) {
            Map.Entry entry = (Map.Entry) A05.next();
            Object key = entry.getKey();
            C018007a c018007a = (C018007a) entry.getValue();
            while (c018007a.A00.compareTo(this.A00) < 0 && !this.A05 && this.A03.A09(key)) {
                C07S c07s = c018007a.A00;
                ArrayList arrayList = this.A01;
                arrayList.add(c07s);
                C14360o3.A0B(c07s, 0);
                int ordinal = c07s.ordinal();
                if (ordinal != 2) {
                    if (ordinal != 3) {
                        if (ordinal != 1) {
                            StringBuilder sb = new StringBuilder();
                            sb.append("no event up from ");
                            sb.append(c018007a.A00);
                            throw new IllegalStateException(sb.toString());
                        }
                        c07r = C07R.ON_CREATE;
                    } else {
                        c07r = C07R.ON_RESUME;
                    }
                } else {
                    c07r = C07R.ON_START;
                }
                c018007a.A00(c07r, c07x);
                arrayList.remove(arrayList.size() - 1);
            }
        }
    }

    private final boolean A06() {
        C58335PtV c58335PtV = this.A03;
        if (c58335PtV.A00() != 0) {
            C58345Ptg A02 = c58335PtV.A02();
            C14360o3.A0A(A02);
            C07S c07s = ((C018007a) A02.getValue()).A00;
            C58345Ptg A03 = this.A03.A03();
            C14360o3.A0A(A03);
            C07S c07s2 = ((C018007a) A03.getValue()).A00;
            if (c07s != c07s2 || this.A00 != c07s2) {
                return false;
            }
        }
        return true;
    }

    @Override // X.C07T
    public final C07S A07() {
        return this.A00;
    }

    @Override // X.C07T
    public final AnonymousClass059 A08() {
        return new AnonymousClass059(null, this.A07);
    }

    private final void A05(String str) {
        if (AbstractC018207c.A00()) {
        } else {
            throw new IllegalStateException(AnonymousClass001.A0g("Method ", str, " must be called on the main thread"));
        }
    }

    public final void A0B(C07R c07r) {
        A05("handleLifecycleEvent");
        A02(c07r.A00());
    }

    public C0eR(C07X c07x, boolean z) {
        this.A03 = new C58335PtV();
        C07S c07s = C07S.INITIALIZED;
        this.A00 = c07s;
        this.A01 = new ArrayList();
        this.A06 = new WeakReference(c07x);
        this.A07 = new C008002u(c07s);
    }
}
