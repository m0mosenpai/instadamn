package X;

import com.instagram.common.session.UserSession;
import com.instagram.common.ui.base.IgTextView;
import com.instagram.quickpromotion.intf.QuickPromotionSlot;

/* loaded from: classes11.dex */
public class V9N extends C64842wi {
    public IgTextView A00;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Type inference failed for: r6v0, types: [X.2gX, java.lang.Object] */
    public V9N(AbstractC59962oe abstractC59962oe, InterfaceC11380iw interfaceC11380iw, UserSession userSession, QuickPromotionSlot quickPromotionSlot) {
        super(abstractC59962oe, null, abstractC59962oe, userSession, C70974Wli.A00, new Object(), quickPromotionSlot, new C64832wh(abstractC59962oe, interfaceC11380iw, userSession));
        AbstractC37302Gc3.A1U(userSession, quickPromotionSlot);
        AbstractC54912fq.A00();
        FAZ();
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0054, code lost:
    
        if (r0 != null) goto L11;
     */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0041  */
    @Override // X.AbstractC55352ga, X.InterfaceC55362gb
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void Dco(X.C4NL r5, java.lang.Integer r6, java.util.Map r7) {
        /*
            r4 = this;
            r0 = 0
            X.C14360o3.A0B(r5, r0)
            r0 = 1
            X.4NJ r5 = (X.C4NJ) r5
            int r3 = r6.intValue()
            if (r3 == r0) goto L47
            r0 = 2
            if (r3 == r0) goto L4c
            java.lang.String r2 = "QuickPromotionDebugHelper"
            switch(r3) {
                case 1: goto L44;
                case 2: goto L15;
                case 3: goto L44;
                default: goto L15;
            }
        L15:
            java.lang.String r0 = "view"
        L17:
            java.lang.Object[] r1 = new java.lang.Object[]{r0}
            java.lang.String r0 = "%s ActionType should not be handled in onQuickPromotionClick"
            X.C0K8.A0O(r2, r0, r1)
        L20:
            java.lang.String r0 = "action not set"
        L22:
            switch(r3) {
                case 1: goto L3b;
                case 2: goto L3e;
                case 3: goto L41;
                default: goto L25;
            }
        L25:
            java.lang.String r2 = "VIEW"
        L27:
            java.lang.String r1 = " action url: "
            java.lang.String r1 = X.AnonymousClass001.A0g(r2, r1, r0)
            com.instagram.common.ui.base.IgTextView r0 = r4.A00
            if (r0 != 0) goto L57
            java.lang.String r0 = "actionDescriptionView"
            X.C14360o3.A0F(r0)
            X.00O r0 = X.C00O.createAndThrow()
            throw r0
        L3b:
            java.lang.String r2 = "PRIMARY"
            goto L27
        L3e:
            java.lang.String r2 = "SECONDARY"
            goto L27
        L41:
            java.lang.String r2 = "DISMISS"
            goto L27
        L44:
            java.lang.String r0 = "click"
            goto L17
        L47:
            X.4NM r0 = r5.A08
            X.4NV r0 = r0.A01
            goto L50
        L4c:
            X.4NM r0 = r5.A08
            X.4NV r0 = r0.A02
        L50:
            if (r0 == 0) goto L20
            java.lang.String r0 = r0.A03
            if (r0 == 0) goto L20
            goto L22
        L57:
            r0.setText(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.V9N.Dco(X.4NL, java.lang.Integer, java.util.Map):void");
    }

    @Override // X.AbstractC55352ga, X.InterfaceC55362gb
    public final void Dcq(C4NL c4nl) {
    }

    @Override // X.AbstractC55352ga, X.InterfaceC55362gb
    public final void DiZ() {
    }

    @Override // X.AbstractC55352ga, X.InterfaceC55362gb
    public void Dcp(C4NL c4nl) {
        IgTextView igTextView = this.A00;
        if (igTextView == null) {
            C14360o3.A0F("actionDescriptionView");
            throw C00O.createAndThrow();
        }
        igTextView.setText("DISMISS action");
    }
}
