package X;

import java.lang.ref.WeakReference;

/* renamed from: X.7hw, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C169827hw extends C2XE {
    public C2V9 A00;
    public C170007iF A01;
    public C169917i6 A02;
    public WeakReference A03;
    public final C169837hx A04;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C169827hw(X.C2XE r10) {
        /*
            r9 = this;
            r0 = 1
            X.C14360o3.A0B(r10, r0)
            android.content.Context r2 = r10.A0C
            X.C14360o3.A07(r2)
            X.3ab r3 = r10.A02
            X.2XU r0 = r10.A07
            if (r0 != 0) goto L20
            r6 = 0
        L10:
            r4 = 0
            r1 = r9
            r5 = r4
            r7 = r4
            r8 = r4
            r1.<init>(r2, r3, r4, r5, r6, r7, r8)
            X.7hx r0 = new X.7hx
            r0.<init>()
            r9.A04 = r0
            return
        L20:
            X.2XU r6 = X.AbstractC170427iv.A00(r0)
            goto L10
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C169827hw.<init>(X.2XE):void");
    }

    @Override // X.C2XE
    public final String A08() {
        AbstractC169857hz abstractC169857hz;
        WeakReference weakReference = this.A03;
        if (weakReference != null && (abstractC169857hz = (AbstractC169857hz) weakReference.get()) != null) {
            String str = abstractC169857hz.A03;
            C14360o3.A07(str);
            return str;
        }
        throw new IllegalStateException("getGlobalKey cannot be accessed from a SectionContext without a scope");
    }

    @Override // X.C2XE
    public final void A0A(C125975mo c125975mo) {
        AbstractC169857hz abstractC169857hz;
        C169917i6 c169917i6 = this.A02;
        WeakReference weakReference = this.A03;
        if (weakReference != null && (abstractC169857hz = (AbstractC169857hz) weakReference.get()) != null && c169917i6 != null) {
            String str = abstractC169857hz.A03;
            synchronized (c169917i6) {
                C169917i6.A05(c125975mo, c169917i6, str, true);
            }
        }
    }

    @Override // X.C2XE
    public final void A0B(C125975mo c125975mo, String str) {
        AbstractC169857hz A0E = A0E();
        C169917i6 c169917i6 = this.A02;
        if (A0E != null && c169917i6 != null) {
            if (AbstractC170667jJ.A00) {
                c169917i6.hashCode();
            }
            String str2 = A0E.A03;
            synchronized (c169917i6) {
                C169977iC c169977iC = c169917i6.A0B;
                c169977iC.A01();
                C169917i6.A05(c125975mo, c169917i6, str2, false);
                c169977iC.A02("updateState:RootBloksComponent.onNewTree", 3);
                AbstractC76113bG.A0C.addAndGet(1L);
            }
        }
    }

    @Override // X.C2XE
    public final void A0C(C125975mo c125975mo, String str) {
        AbstractC169857hz abstractC169857hz;
        WeakReference weakReference = this.A03;
        if (weakReference != null) {
            abstractC169857hz = (AbstractC169857hz) weakReference.get();
        } else {
            abstractC169857hz = null;
        }
        C169917i6 c169917i6 = this.A02;
        if (abstractC169857hz != null && c169917i6 != null) {
            if (AbstractC170667jJ.A00) {
                c169917i6.hashCode();
            }
            String str2 = abstractC169857hz.A03;
            synchronized (c169917i6) {
                C169977iC c169977iC = c169917i6.A0A;
                c169977iC.A01();
                C169917i6.A05(c125975mo, c169917i6, str2, false);
                c169977iC.A02(str, 2);
                AbstractC76113bG.A0D.addAndGet(1L);
            }
        }
    }

    public final AbstractC169857hz A0E() {
        WeakReference weakReference = this.A03;
        if (weakReference != null) {
            return (AbstractC169857hz) weakReference.get();
        }
        return null;
    }
}
