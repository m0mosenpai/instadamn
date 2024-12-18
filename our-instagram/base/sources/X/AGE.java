package X;

import android.util.LruCache;

/* loaded from: classes4.dex */
public final class AGE {
    public static AGE A04;
    public static final ACQ A05;
    public static final C9ZI A06 = new C0T6() { // from class: X.9ZI
        public final String A00 = "";
        public final String A07 = "";
        public final String A05 = "";
        public final String A06 = "";
        public final String A03 = "";
        public final String A04 = "";
        public final String A02 = "";
        public final String A01 = "";

        public final boolean equals(Object obj) {
            if (this != obj) {
                if (obj instanceof C9ZI) {
                    C9ZI c9zi = (C9ZI) obj;
                    if (!C14360o3.A0K(this.A00, c9zi.A00) || !C14360o3.A0K(this.A07, c9zi.A07) || !C14360o3.A0K(this.A05, c9zi.A05) || !C14360o3.A0K(this.A06, c9zi.A06) || !C14360o3.A0K(this.A03, c9zi.A03) || !C14360o3.A0K(this.A04, c9zi.A04) || !C14360o3.A0K(this.A02, c9zi.A02) || !C14360o3.A0K(this.A01, c9zi.A01)) {
                    }
                }
                return false;
            }
            return true;
        }

        public final int hashCode() {
            int A0K = AbstractC166997dE.A0K(this.A06, AbstractC166997dE.A0K(this.A05, AbstractC166997dE.A0K(this.A07, AbstractC166987dD.A0J(this.A00))));
            int i = (int) (0 >>> 32);
            return (AbstractC166997dE.A0K(this.A01, AbstractC166997dE.A0K(this.A02, AbstractC166997dE.A0K(this.A04, AbstractC166997dE.A0K(this.A03, (((A0K + i) * 31) + i) * 31)))) * 31) + AbstractC53644Nnp.A00();
        }
    };
    public static final java.util.Set A07;
    public C224469vX A00;
    public C224479vY A01;
    public final LruCache A03 = new C9IM(this);
    public C9ZI A02 = A06;

    /* JADX WARN: Code restructure failed: missing block: B:28:0x006b, code lost:
    
        if (r0.isEmpty() != false) goto L21;
     */
    /* JADX WARN: Type inference failed for: r0v0, types: [X.9ZI] */
    static {
        /*
            r5 = 0
            java.lang.String r2 = ""
            X.9ZI r0 = new X.9ZI
            r0.<init>()
            X.AGE.A06 = r0
            kotlin.enums.EnumEntries r0 = X.EnumC222769sH.A00
            java.util.Iterator r1 = r0.iterator()
        L10:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L26
            java.lang.Object r0 = r1.next()
            X.9sH r0 = (X.EnumC222769sH) r0
            java.lang.String r0 = r0.name()
            boolean r0 = X.C14360o3.A0K(r0, r2)
            if (r0 == 0) goto L10
        L26:
            java.lang.String r0 = ","
            java.util.List r0 = X.AbstractC167007dF.A0m(r2, r0, r5)
            if (r0 == 0) goto L6d
            java.util.ArrayList r6 = X.AbstractC166987dD.A1E()
            java.util.Iterator r4 = r0.iterator()
        L36:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L63
            java.lang.Object r3 = r4.next()
            kotlin.enums.EnumEntries r0 = X.EnumC222749sF.A00
            java.util.Iterator r2 = r0.iterator()
        L46:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L36
            java.lang.Object r1 = r2.next()
            r0 = r1
            X.9sF r0 = (X.EnumC222749sF) r0
            java.lang.String r0 = r0.name()
            boolean r0 = X.C14360o3.A0K(r0, r3)
            if (r0 == 0) goto L46
            if (r1 == 0) goto L36
            r6.add(r1)
            goto L36
        L63:
            java.util.Set r0 = X.AbstractC001800i.A0k(r6)
            boolean r1 = r0.isEmpty()
            if (r1 == 0) goto L7c
        L6d:
            X.9sF r1 = X.EnumC222749sF.A05
            X.9sF r0 = X.EnumC222749sF.A06
            X.9sF[] r0 = new X.EnumC222749sF[]{r1, r0}
            X.C14360o3.A0B(r0, r5)
            java.util.Set r0 = X.AbstractC009903n.A0K(r0)
        L7c:
            X.AGE.A07 = r0
            X.ACQ r0 = new X.ACQ
            r0.<init>()
            X.AGE.A05 = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AGE.<clinit>():void");
    }

    public AGE(C224469vX c224469vX, C224479vY c224479vY) {
        this.A01 = c224479vY;
        this.A00 = c224469vX;
    }
}
