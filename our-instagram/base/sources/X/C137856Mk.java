package X;

import androidx.compose.ui.Modifier;

/* renamed from: X.6Mk, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C137856Mk implements InterfaceC118895a6, InterfaceC137866Ml {
    public static final C137876Mm A05 = new InterfaceC137886Mn() { // from class: X.6Mm
        @Override // X.InterfaceC137886Mn
        public final boolean BC7() {
            return false;
        }
    };
    public final C6M3 A00;
    public final C6MF A01;
    public final InterfaceC137836Mi A02;
    public final AnonymousClass583 A03;
    public final boolean A04;

    /* JADX WARN: Code restructure failed: missing block: B:32:0x0027, code lost:
    
        if (r1 == r0) goto L21;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final boolean A00(X.C6MG r4, X.C137856Mk r5, int r6) {
        /*
            r1 = 5
            r0 = 0
            if (r6 != r1) goto L5
            r0 = 1
        L5:
            r2 = 1
            if (r0 != 0) goto L1e
            r0 = 6
            if (r6 == r0) goto L1e
            r0 = 3
            if (r6 == r0) goto L23
            r0 = 4
            if (r6 == r0) goto L23
            if (r6 == r2) goto L45
            r0 = 2
            if (r6 == r0) goto L45
            java.lang.String r1 = "Lazy list does not support beyond bounds layout for the specified direction"
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        L1e:
            X.6M3 r1 = r5.A00
            X.6M3 r0 = X.C6M3.Horizontal
            goto L27
        L23:
            X.6M3 r1 = r5.A00
            X.6M3 r0 = X.C6M3.Vertical
        L27:
            if (r1 != r0) goto L45
        L29:
            r3 = 0
            if (r2 != 0) goto L3f
            boolean r0 = A01(r5, r6)
            r2 = 1
            if (r0 == 0) goto L40
            int r1 = r4.A00
            X.6Mi r0 = r5.A02
            int r0 = r0.getItemCount()
            int r0 = r0 - r2
            if (r1 >= r0) goto L3f
        L3e:
            r3 = 1
        L3f:
            return r3
        L40:
            int r0 = r4.A01
            if (r0 <= 0) goto L3f
            goto L3e
        L45:
            r2 = 0
            goto L29
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C137856Mk.A00(X.6MG, X.6Mk, int):boolean");
    }

    public static final boolean A01(C137856Mk c137856Mk, int i) {
        boolean z = false;
        if (i == 1) {
            z = true;
        }
        if (z) {
            return false;
        }
        if (i != 2) {
            if (i != 5) {
                if (i != 6) {
                    boolean z2 = false;
                    if (i == 3) {
                        z2 = true;
                    }
                    if (z2) {
                        int ordinal = c137856Mk.A03.ordinal();
                        if (ordinal != 0) {
                            if (ordinal != 1) {
                                throw new RuntimeException();
                            }
                        }
                    } else if (i == 4) {
                        int ordinal2 = c137856Mk.A03.ordinal();
                        if (ordinal2 != 0) {
                            if (ordinal2 != 1) {
                                throw new RuntimeException();
                            }
                        }
                    } else {
                        throw new IllegalStateException("Lazy list does not support beyond bounds layout for the specified direction");
                    }
                }
                if (c137856Mk.A04) {
                    return false;
                }
            }
            return c137856Mk.A04;
        }
        return true;
    }

    @Override // androidx.compose.ui.Modifier
    public final /* synthetic */ boolean ABA(InterfaceC16660sJ interfaceC16660sJ) {
        return C5X5.A00(this, interfaceC16660sJ);
    }

    @Override // androidx.compose.ui.Modifier
    public final /* synthetic */ Modifier Eq3(Modifier modifier) {
        return C58m.A00(this, modifier);
    }

    @Override // X.InterfaceC118895a6
    public final C114175De BKT() {
        return BJP.A00;
    }

    @Override // X.InterfaceC118895a6
    public final /* bridge */ /* synthetic */ Object getValue() {
        return this;
    }

    public C137856Mk(C6M3 c6m3, C6MF c6mf, InterfaceC137836Mi interfaceC137836Mi, AnonymousClass583 anonymousClass583, boolean z) {
        this.A02 = interfaceC137836Mi;
        this.A01 = c6mf;
        this.A04 = z;
        this.A03 = anonymousClass583;
        this.A00 = c6m3;
    }

    @Override // androidx.compose.ui.Modifier
    public final /* synthetic */ Object AWJ(Object obj, InterfaceC16620sF interfaceC16620sF) {
        return interfaceC16620sF.invoke(obj, this);
    }
}
