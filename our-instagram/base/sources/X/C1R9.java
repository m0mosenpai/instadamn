package X;

import android.content.Context;
import android.content.res.Resources;
import com.facebook.R;
import com.google.common.util.concurrent.SettableFuture;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: X.1R9, reason: invalid class name */
/* loaded from: classes.dex */
public final class C1R9 {
    public static C1R9 A0F;
    public SettableFuture A00;
    public final Context A01;
    public final Resources A02;
    public final C1R6 A03;
    public final C1R8 A04;
    public final C217313z A05;
    public final C217013w A06;
    public volatile AbstractC12990ll A0C;
    public volatile boolean A0D;
    public final AtomicReference A09 = new AtomicReference();
    public volatile boolean A0E = true;
    public final AtomicReference A08 = new AtomicReference();
    public final AtomicReference A0B = new AtomicReference();
    public final AtomicReference A07 = new AtomicReference();
    public final C1RE A0A = new C1RE(new InterfaceC08830cm() { // from class: X.1RB
        @Override // X.InterfaceC08830cm
        public final /* bridge */ /* synthetic */ Object get() {
            return C1R9.this.A01;
        }
    }, new InterfaceC08830cm() { // from class: X.1RC
        @Override // X.InterfaceC08830cm
        public final /* bridge */ /* synthetic */ Object get() {
            return AbstractC23881Ey.A00();
        }
    }, new InterfaceC08830cm() { // from class: X.1RD
        @Override // X.InterfaceC08830cm
        public final /* bridge */ /* synthetic */ Object get() {
            return C1R9.this.A04;
        }
    });

    /* JADX WARN: Removed duplicated region for block: B:56:0x00bd  */
    /* JADX WARN: Type inference failed for: r0v33, types: [X.2At, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.util.List A00(X.C1R9 r5, int r6) {
        /*
            Method dump skipped, instructions count: 234
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1R9.A00(X.1R9, int):java.util.List");
    }

    public static void A01(C1R9 c1r9) {
        c1r9.A08.set(null);
        C1RE c1re = c1r9.A0A;
        synchronized (c1re) {
            c1re.A00 = null;
            c1re.A02.set(null);
            C1U7 c1u7 = (C1U7) c1re.A01.get();
            if (c1u7 != null) {
                c1u7.A03 = null;
                c1u7.A04 = null;
            }
        }
        c1r9.A0B.set(null);
        c1r9.A07.set(null);
        c1r9.A04();
    }

    public final String A02(int i) {
        String A00;
        if (((-65536) & i) == R.string.res_0x7f130000_name_removed) {
            for (C1U8 c1u8 : A00(this, i)) {
                if (c1u8 != null && (A00 = c1u8.A00(i, 0)) != null) {
                    return A00;
                }
            }
            try {
                String string = this.A02.getString(i);
                this.A04.A00(i, "arsc");
                return string;
            } catch (Resources.NotFoundException e) {
                this.A04.A00(i, "unknown");
                throw e;
            }
        }
        return this.A02.getString(i);
    }

    public final Locale A03() {
        Locale locale = (Locale) this.A09.get();
        if (locale == null) {
            return this.A06.AcO();
        }
        return locale;
    }

    public final boolean A05() {
        if (this.A0E) {
            boolean A00 = this.A03.A00(A03());
            boolean z = false;
            if (this.A08.get() != null) {
                z = true;
            }
            if (A00) {
                return z;
            }
        }
        return true;
    }

    public C1R9(Context context, Resources resources, C1R6 c1r6, C1R8 c1r8, C217313z c217313z, AbstractC12990ll abstractC12990ll, C217013w c217013w) {
        this.A0D = false;
        this.A04 = c1r8;
        this.A01 = context;
        this.A02 = resources;
        this.A06 = c217013w;
        this.A05 = c217313z;
        this.A03 = c1r6;
        this.A0C = abstractC12990ll;
        this.A09.set(this.A06.AcO());
        A04();
        this.A0D = true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x0029, code lost:
    
        if (((java.util.Set) r1).contains(r4.toString()) != false) goto L8;
     */
    /* JADX WARN: Type inference failed for: r0v13, types: [java.lang.Object, com.google.common.util.concurrent.SettableFuture] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A04() {
        /*
            r8 = this;
            java.util.Locale r4 = r8.A03()
            X.1R6 r3 = r8.A03
            boolean r0 = r3.A00(r4)
            if (r0 != 0) goto L2b
            r0 = 0
            X.C14360o3.A0B(r4, r0)
            X.13l r0 = r3.A00
            X.13k r0 = (X.C215813k) r0
            java.lang.String r2 = "Required value was null."
            X.13n r0 = r0.A00
            java.lang.Object r1 = r0.get()
            if (r1 == 0) goto L93
            java.util.Set r1 = (java.util.Set) r1
            java.lang.String r0 = r4.toString()
            boolean r1 = r1.contains(r0)
            r0 = 0
            if (r1 == 0) goto L2c
        L2b:
            r0 = 1
        L2c:
            r8.A0E = r0
            r1 = r8
            java.util.Locale r0 = r8.A03()
            boolean r0 = r3.A00(r0)
            if (r0 == 0) goto L7d
            java.util.concurrent.atomic.AtomicReference r0 = r8.A08
            java.lang.Object r0 = r0.get()
            if (r0 != 0) goto L89
            monitor-enter(r1)
            com.google.common.util.concurrent.SettableFuture r0 = r8.A00     // Catch: java.lang.Throwable -> L78
            if (r0 == 0) goto L4c
            boolean r0 = r0.isDone()     // Catch: java.lang.Throwable -> L78
            if (r0 == 0) goto L53
        L4c:
            com.google.common.util.concurrent.SettableFuture r0 = new com.google.common.util.concurrent.SettableFuture     // Catch: java.lang.Throwable -> L78
            r0.<init>()     // Catch: java.lang.Throwable -> L78
            r8.A00 = r0     // Catch: java.lang.Throwable -> L78
        L53:
            java.util.Locale r0 = r8.A03()     // Catch: java.lang.Throwable -> L7a
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Throwable -> L7a
            X.1RL r5 = new X.1RL     // Catch: java.lang.Throwable -> L7a
            r5.<init>(r8, r0)     // Catch: java.lang.Throwable -> L7a
            android.content.Context r3 = r8.A01     // Catch: java.lang.Throwable -> L7a
            X.0ll r6 = r8.A0C     // Catch: java.lang.Throwable -> L7a
            java.util.Locale r7 = r8.A03()     // Catch: java.lang.Throwable -> L7a
            X.1R8 r4 = r8.A04     // Catch: java.lang.Throwable -> L7a
            com.instagram.common.resources.downloadable.impl.LanguagePackLoader r2 = new com.instagram.common.resources.downloadable.impl.LanguagePackLoader     // Catch: java.lang.Throwable -> L7a
            r2.<init>(r3, r4, r5, r6, r7)     // Catch: java.lang.Throwable -> L7a
            X.0nS r0 = X.C14120nc.A00()     // Catch: java.lang.Throwable -> L7a
            r0.ATO(r2)     // Catch: java.lang.Throwable -> L7a
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L7a
            goto L89
        L78:
            r0 = move-exception
            throw r0     // Catch: java.lang.Throwable -> L7a
        L7a:
            r0 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L7a
            throw r0
        L7d:
            java.util.concurrent.atomic.AtomicReference r1 = r8.A08
            java.lang.Object r0 = r1.get()
            if (r0 == 0) goto L89
            r0 = 0
            r1.set(r0)
        L89:
            X.1RE r1 = r8.A0A
            java.util.Locale r0 = r8.A03()
            r1.A01(r0)
            return
        L93:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1R9.A04():void");
    }
}
