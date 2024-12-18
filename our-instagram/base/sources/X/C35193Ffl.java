package X;

import com.instagram.nux.aymh.responsehandlers.HandlerExecutorAndBuilder;

/* renamed from: X.Ffl, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C35193Ffl {
    public static final C35193Ffl A00 = new Object();

    public static final HandlerExecutorAndBuilder A00(FOE foe) {
        C36559GAj c36559GAj;
        C57752Pjf c57752Pjf = new C57752Pjf(foe, 22);
        HandlerExecutorAndBuilder handlerExecutorAndBuilder = new HandlerExecutorAndBuilder();
        c57752Pjf.invoke(handlerExecutorAndBuilder);
        AbstractC115105If abstractC115105If = (AbstractC115105If) FWH.A00(foe.A05, C37080GVp.A00);
        if (abstractC115105If instanceof C115095Ie) {
            c36559GAj = AbstractC34919Fa5.A07;
        } else if (abstractC115105If instanceof C115115Ig) {
            if (AbstractC31525Dt9.A03(abstractC115105If).A03) {
                c36559GAj = AbstractC34919Fa5.A01;
            } else {
                Integer num = foe.A03.A01;
                if (num != C05F.A0C && num != C05F.A0Y && num != C05F.A0N) {
                    c36559GAj = AbstractC34919Fa5.A08;
                } else {
                    c36559GAj = AbstractC34919Fa5.A06;
                }
            }
        } else {
            throw B4Z.A00();
        }
        C14360o3.A0B(c36559GAj, 0);
        handlerExecutorAndBuilder.A03(c36559GAj);
        return handlerExecutorAndBuilder;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0028, code lost:
    
        if (r0 != false) goto L12;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final com.instagram.nux.aymh.responsehandlers.HandlerExecutorAndBuilder A01(X.FOE r4) {
        /*
            com.instagram.nux.aymh.responsehandlers.HandlerExecutorAndBuilder r3 = A00(r4)
            X.3NY r2 = r4.A05
            X.GVp r1 = X.C37080GVp.A00
            java.lang.Object r0 = X.FWH.A00(r2, r1)
            boolean r0 = r0 instanceof X.C115115Ig
            java.lang.Object r1 = X.FWH.A00(r2, r1)
            X.5If r1 = (X.AbstractC115105If) r1
            if (r0 == 0) goto L34
            X.FQc r1 = X.AbstractC31525Dt9.A03(r1)
            boolean r0 = r4.A07
            if (r0 != 0) goto L2a
            boolean r0 = r1.A02
            if (r0 != 0) goto L2a
            boolean r0 = r1.A05
            if (r0 != 0) goto L2a
            boolean r0 = r1.A06
        L28:
            if (r0 == 0) goto L33
        L2a:
            X.GAj r1 = X.AbstractC34919Fa5.A09
            r0 = 0
            X.C14360o3.A0B(r1, r0)
            r3.A03(r1)
        L33:
            return r3
        L34:
            boolean r0 = r1 instanceof X.C115095Ie
            if (r0 == 0) goto L33
            X.5Ie r1 = (X.C115095Ie) r1
            java.lang.Throwable r0 = r1.A00
            boolean r0 = r0 instanceof X.GS3
            goto L28
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C35193Ffl.A01(X.FOE):com.instagram.nux.aymh.responsehandlers.HandlerExecutorAndBuilder");
    }
}
