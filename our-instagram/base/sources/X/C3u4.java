package X;

import com.facebook.litho.LithoView;
import com.instagram.common.session.UserSession;
import java.lang.ref.WeakReference;

/* renamed from: X.3u4, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C3u4 {
    public static final C3u4 A00 = new Object();

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0055, code lost:
    
        if (r32 == false) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x005b, code lost:
    
        if (r33 == false) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x005d, code lost:
    
        r18 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x005f, code lost:
    
        A00(r5, r20, r21, r22, r23, r24, r26, r27, r28, r29, r30, r31, r17, r18);
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0070, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0059, code lost:
    
        if (r34 == false) goto L25;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A01(com.instagram.common.session.UserSession r20, X.InterfaceC904941j r21, X.C86493tM r22, X.C39G r23, X.InterfaceC80043ht r24, X.C3WA r25, X.InterfaceC60442pS r26, X.C75113Zb r27, X.InterfaceC60682pr r28, java.lang.ref.WeakReference r29, X.InterfaceC16820sZ r30, int r31, boolean r32, boolean r33, boolean r34) {
        /*
            r19 = this;
            r4 = 0
            r2 = 1
            r0 = 7
            r9 = r23
            X.C14360o3.A0B(r9, r0)
            r1 = 8
            r10 = r24
            X.C14360o3.A0B(r10, r1)
            r8 = r22
            r3 = r25
            if (r22 != 0) goto L1d
            com.facebook.litho.LithoView r0 = r3.A01
            if (r0 == 0) goto L1c
            r0.setVisibility(r1)
        L1c:
            return
        L1d:
            com.facebook.litho.LithoView r5 = r3.A01
            if (r5 != 0) goto L30
            android.view.ViewStub r0 = r3.A00
            android.view.View r5 = r0.inflate()
            java.lang.String r0 = "null cannot be cast to non-null type com.facebook.litho.LithoView"
            X.C14360o3.A0C(r5, r0)
            com.facebook.litho.LithoView r5 = (com.facebook.litho.LithoView) r5
            r3.A01 = r5
        L30:
            if (r5 == 0) goto L71
            r18 = 0
            r5.setVisibility(r4)
            X.3Zb r0 = r3.A02
            r12 = r27
            if (r0 == 0) goto L4b
            boolean r0 = r0.equals(r12)
            if (r0 != 0) goto L4b
            X.3Zb r1 = r3.A02
            if (r1 == 0) goto L4b
            r0 = 0
            r1.A0M(r3, r0, r2)
        L4b:
            r3.A02 = r12
            r0 = 0
            r12.A0L(r3, r0, r2)
            if (r34 != 0) goto L57
            r17 = 1
            if (r32 != 0) goto L5b
        L57:
            r17 = 0
            if (r34 != 0) goto L5f
        L5b:
            if (r33 == 0) goto L5f
            r18 = 1
        L5f:
            r6 = r20
            r7 = r21
            r11 = r26
            r13 = r28
            r14 = r29
            r15 = r30
            r16 = r31
            A00(r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18)
            return
        L71:
            java.lang.String r1 = "Required value was null."
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C3u4.A01(com.instagram.common.session.UserSession, X.41j, X.3tM, X.39G, X.3ht, X.3WA, X.2pS, X.3Zb, X.2pr, java.lang.ref.WeakReference, X.0sZ, int, boolean, boolean, boolean):void");
    }

    public static final void A00(LithoView lithoView, UserSession userSession, InterfaceC904941j interfaceC904941j, C86493tM c86493tM, C39G c39g, InterfaceC80043ht interfaceC80043ht, InterfaceC60442pS interfaceC60442pS, C75113Zb c75113Zb, InterfaceC60682pr interfaceC60682pr, WeakReference weakReference, InterfaceC16820sZ interfaceC16820sZ, int i, boolean z, boolean z2) {
        boolean z3 = c75113Zb.A2Y;
        C207149Et c207149Et = new C207149Et(lithoView, userSession, interfaceC904941j, c86493tM, c39g, interfaceC80043ht, interfaceC60442pS, c75113Zb, interfaceC60682pr, weakReference, interfaceC16820sZ, i, 0);
        int i2 = c75113Zb.A0A;
        C207149Et c207149Et2 = new C207149Et(lithoView, userSession, interfaceC904941j, c86493tM, c39g, interfaceC80043ht, interfaceC60442pS, c75113Zb, interfaceC60682pr, weakReference, interfaceC16820sZ, i, 1);
        lithoView.setComponentAsync(new C25523BQl(new C206209Bd(new C9E0(c75113Zb, 27), new C9EB(c75113Zb, 15), new C9EB(c75113Zb, 16), 3), null, userSession, C68P.A00(userSession), interfaceC904941j, c86493tM, c39g, interfaceC80043ht, interfaceC60442pS, c75113Zb, interfaceC60682pr, weakReference, DBB.A00, interfaceC16820sZ, C30061DMv.A00, c207149Et, c207149Et2, i, i2, z, z2, z3, false));
    }
}
