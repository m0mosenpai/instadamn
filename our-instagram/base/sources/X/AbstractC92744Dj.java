package X;

import com.instagram.common.session.UserSession;
import java.util.HashSet;
import java.util.Stack;

/* renamed from: X.4Dj, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC92744Dj {
    public boolean A00;
    public final InterfaceC11380iw A01;
    public final UserSession A02;
    public final java.util.Set A05 = new HashSet();
    public final Stack A06 = new Stack();
    public final java.util.Set A04 = new HashSet();
    public final java.util.Set A03 = new HashSet();

    /* JADX WARN: Code restructure failed: missing block: B:7:0x0015, code lost:
    
        if ((!r7.A05.isEmpty()) == false) goto L9;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void A01(final X.AbstractC92744Dj r7, final X.C92724Dh r8, final java.lang.String r9) {
        /*
            r0 = r7
            X.4Di r0 = (X.C92734Di) r0
            int r1 = r0.A00
            r0 = 0
            if (r1 != 0) goto L9
            r0 = 1
        L9:
            r2 = 0
            if (r0 == 0) goto L17
            java.util.Set r0 = r7.A05
            boolean r0 = r0.isEmpty()
            r0 = r0 ^ 1
            r1 = 1
            if (r0 != 0) goto L18
        L17:
            r1 = 0
        L18:
            java.util.Set r4 = r7.A05
            int r0 = r4.size()
            r3 = 7
            if (r0 < r3) goto L22
            r2 = 1
        L22:
            if (r1 != 0) goto L26
            if (r2 == 0) goto L74
        L26:
            boolean r0 = r7.A00
            if (r0 != 0) goto L74
            r0 = 1
            r7.A00 = r0
            java.util.Set r2 = r7.A04
            r2.clear()
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
        L37:
            java.util.Stack r1 = r7.A06
            boolean r0 = r1.isEmpty()
            if (r0 != 0) goto L56
            int r0 = r2.size()
            if (r0 >= r3) goto L56
            java.lang.Object r0 = r1.pop()
            r4.remove(r0)
            X.C14360o3.A0A(r0)
            r2.add(r0)
            r6.add(r0)
            goto L37
        L56:
            X.5sQ r3 = new X.5sQ
            r5 = r9
            r3.<init>()
            java.util.Set r0 = r7.A03
            r0.add(r3)
            com.instagram.common.session.UserSession r1 = r7.A02
            X.1OU r0 = X.C1OU.$redex_init_class
            X.3G7 r1 = X.C3G6.A00(r1)
            X.0iw r0 = r7.A01
            java.lang.String r4 = r0.getModuleName()
            X.3G5 r2 = X.C3G5.A05
            r1.A05(r2, r3, r4, r5, r6)
        L74:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC92744Dj.A01(X.4Dj, X.4Dh, java.lang.String):void");
    }

    public AbstractC92744Dj(InterfaceC11380iw interfaceC11380iw, UserSession userSession) {
        this.A02 = userSession;
        this.A01 = interfaceC11380iw;
    }
}
