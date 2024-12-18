package X;

import android.os.Parcelable;
import android.util.SparseArray;

/* renamed from: X.0DC, reason: invalid class name */
/* loaded from: classes.dex */
public abstract class C0DC {
    public static final C03720In A07 = new C03720In("LifecycleCodeCallbacksHolder");
    public static final Object A08 = "N/A";
    public final C0D6 A01;
    public final C0D8 A02;
    public final String A04;
    public final C0Cz A05;
    public final C0H5 A06;
    public final Object A03 = new Object();
    public final SparseArray A00 = new SparseArray();

    public abstract Parcelable A00(Object obj);

    public abstract boolean A02(AbstractC05460Qv abstractC05460Qv, EnumC05430Qs enumC05430Qs, int i);

    public abstract boolean A04(AbstractC05380Qm abstractC05380Qm, Object obj);

    public final void A01(Object obj, int i, Object obj2) {
        C0DA c0da;
        InterfaceC03680Ii A02;
        Parcelable parcelable;
        int length;
        String str;
        Object obj3 = obj;
        if (obj == null) {
            obj3 = "";
        }
        C03720In c03720In = A07;
        String str2 = this.A04;
        Integer valueOf = Integer.valueOf(i);
        synchronized (this.A03) {
            c0da = (C0DA) this.A00.get(i, null);
        }
        if (c0da != null) {
            C03740Ip c03740Ip = C10900i1.A04;
            if (c03740Ip.A03 != null) {
                A02 = C03740Ip.A01(c03740Ip, AbstractC05380Qm.class, null, 0, 0);
            } else {
                A02 = C03740Ip.A02(c03740Ip, AbstractC05380Qm.class);
            }
            C10900i1 c10900i1 = (C10900i1) A02;
            AbstractC05460Qv Aor = c0da.Aor();
            try {
                if (c0da.CsA()) {
                    parcelable = A00(obj2);
                } else {
                    parcelable = null;
                }
                C0Cx[] Ajr = c0da.Ajr(parcelable, Aor, c10900i1);
                if (Ajr != null && (length = Ajr.length) != 0 && c10900i1.A03) {
                    AbstractC05380Qm abstractC05380Qm = (AbstractC05380Qm) c10900i1.A00;
                    if (abstractC05380Qm == null) {
                        if (parcelable != null) {
                            str = "Y";
                        } else {
                            str = "N";
                        }
                        c03720In.A08("Can't call hooks for %s %s with code %d since we failed to get the parsed result. Has Client Transaction: %s \n\t Lifecycle Code: %s  \n\t State: %s", str2, obj3, valueOf, str, Aor, c0da.BN9());
                    } else {
                        AbstractC03770Is.A02(A04(abstractC05380Qm, obj2), 1);
                        int i2 = 0;
                        while (i2 < length) {
                            int i3 = i2 + 1;
                            try {
                                Ajr[i2].D1A(abstractC05380Qm);
                            } catch (Error | RuntimeException e) {
                                e.getMessage();
                            }
                            i2 = i3;
                        }
                    }
                }
            } finally {
                c10900i1.A01(false);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:112:0x022d, code lost:
    
        if (r9 != false) goto L104;
     */
    /* JADX WARN: Removed duplicated region for block: B:87:0x01b9  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x01d5 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:94:0x017c A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:95:0x01d8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean A03(X.AbstractC05450Qu r35, X.C0Cx r36, final X.EnumC05430Qs r37) {
        /*
            Method dump skipped, instructions count: 616
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0DC.A03(X.0Qu, X.0Cx, X.0Qs):boolean");
    }

    public C0DC(C0Cz c0Cz, C0D6 c0d6, C0D8 c0d8, C0H5 c0h5, String str) {
        this.A04 = str;
        this.A06 = c0h5;
        this.A05 = c0Cz;
        this.A01 = c0d6;
        this.A02 = c0d8;
    }
}
