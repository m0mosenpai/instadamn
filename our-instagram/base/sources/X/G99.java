package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.react.modules.product.IgReactPurchaseExperienceBridgeModule;
import com.instagram.user.model.User;

/* loaded from: classes6.dex */
public final class G99 implements InterfaceC58152PqH {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;
    public final Object A04;
    public final Object A05;
    public final Object A06;

    public G99(int i, Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6) {
        this.A00 = i;
        this.A03 = obj6;
        this.A06 = obj3;
        this.A05 = obj5;
        this.A02 = obj2;
        this.A04 = obj;
        this.A01 = obj4;
    }

    public static void A00(InterfaceC02590Ai interfaceC02590Ai, G99 g99) {
        interfaceC02590Ai.A8R((C8d) g99.A04, "project");
        interfaceC02590Ai.A8R((EnumC33488ErN) g99.A05, "screen");
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:14:? A[RETURN, SYNTHETIC] */
    @Override // X.InterfaceC58152PqH
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onButtonClick(android.view.View r7) {
        /*
            r6 = this;
            int r0 = r6.A00
            switch(r0) {
                case 0: goto L21;
                case 1: goto L6e;
                default: goto L5;
            }
        L5:
            java.lang.Object r1 = r6.A01
            X.0iw r1 = (X.InterfaceC11380iw) r1
            java.lang.Object r0 = r6.A03
            android.content.Context r0 = (android.content.Context) r0
            java.lang.Object r2 = r6.A06
            com.instagram.common.session.UserSession r2 = (com.instagram.common.session.UserSession) r2
            java.lang.Object r3 = r6.A02
            com.instagram.save.model.SavedCollection r3 = (com.instagram.save.model.SavedCollection) r3
            java.lang.Object r5 = r6.A04
            java.util.List r5 = (java.util.List) r5
            java.lang.Object r4 = r6.A05
            java.lang.Runnable r4 = (java.lang.Runnable) r4
            X.AbstractC35260Fgu.A04(r0, r1, r2, r3, r4, r5)
        L20:
            return
        L21:
            java.lang.Object r1 = r6.A06
            com.instagram.model.mediatype.ProductType r0 = com.instagram.model.mediatype.ProductType.CLIPS
            java.lang.String r4 = "fail"
            if (r1 != r0) goto L5b
            java.lang.Object r3 = r6.A02
            X.05A r3 = (X.C05A) r3
            X.7dQ r2 = X.C167117dQ.A00
        L2f:
            r3.Egh(r2)
            java.lang.String r2 = "success"
        L34:
            java.lang.Object r1 = r6.A03
            X.0wW r1 = (X.C18920wW) r1
            java.lang.String r0 = "ig_creator_connections_events"
            X.0Ai r1 = X.AbstractC166987dD.A0f(r1, r0)
            java.lang.String r0 = "click"
            X.AbstractC31171DnF.A1B(r1, r0)
            A00(r1, r6)
            java.lang.String r0 = "status"
            r1.AAP(r0, r2)
            r1.Cht()
            boolean r0 = r2.equals(r4)
            if (r0 == 0) goto L20
            java.lang.String r0 = "Unsupported Media Type for the Creator Comment Reshare To Story"
            java.lang.IllegalArgumentException r0 = X.AbstractC166987dD.A12(r0)
            throw r0
        L5b:
            com.instagram.model.mediatype.ProductType r0 = com.instagram.model.mediatype.ProductType.FEED
            if (r1 != r0) goto L6c
            java.lang.Object r3 = r6.A02
            X.05A r3 = (X.C05A) r3
            java.lang.Object r1 = r6.A01
            r0 = 2
            X.9BK r2 = new X.9BK
            r2.<init>(r1, r0)
            goto L2f
        L6c:
            r2 = r4
            goto L34
        L6e:
            r5 = 0
            X.C14360o3.A0B(r7, r5)
            java.lang.Object r1 = r6.A03
            X.0oO r1 = (X.C14510oO) r1
            r0 = 1
            r1.A00 = r0
            java.lang.Object r3 = r6.A06
            com.instagram.common.session.UserSession r3 = (com.instagram.common.session.UserSession) r3
            java.lang.Object r4 = r6.A05
            com.instagram.user.model.User r4 = (com.instagram.user.model.User) r4
            java.lang.String r0 = r4.getId()
            java.util.List r2 = X.AbstractC166987dD.A1J(r0)
            X.FsK r1 = X.C35844FsK.A00
            X.Frs r0 = X.C35816Frs.A00
            X.FVL.A00(r0, r1, r3, r2, r5)
            java.lang.Object r1 = r6.A02
            X.0iw r1 = (X.InterfaceC11380iw) r1
            java.lang.Object r0 = r6.A04
            android.content.Context r0 = (android.content.Context) r0
            X.C35266Fh1.A02(r0, r1, r3, r4, r5)
            java.lang.Object r3 = r6.A01
            X.FeO r3 = (X.C35121FeO) r3
            java.lang.String r2 = r4.getId()
            X.0Ai r1 = X.C35121FeO.A00(r3)
            X.ErV r0 = X.EnumC33496ErV.UNDO_TOAST
            X.AbstractC31180DnO.A1G(r0, r1)
            java.lang.String r0 = "target_user_id"
            r1.AAP(r0, r2)
            X.C35121FeO.A01(r1, r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.G99.onButtonClick(android.view.View):void");
    }

    @Override // X.InterfaceC58152PqH
    public final void onDismiss() {
        int i;
        Drawable drawable;
        InterfaceC02590Ai A0f;
        switch (this.A00) {
            case 0:
                A0f = AbstractC166987dD.A0f((C18920wW) this.A03, "ig_creator_connections_events");
                AbstractC31171DnF.A1B(A0f, "dismiss");
                A00(A0f, this);
                A0f.AAP(IgReactPurchaseExperienceBridgeModule.RN_SHOP_PAY_STATUS, "success");
                break;
            case 1:
                C14510oO c14510oO = (C14510oO) this.A03;
                if (c14510oO.A00) {
                    c14510oO.A00 = false;
                    return;
                }
                C35121FeO c35121FeO = (C35121FeO) this.A01;
                User user = (User) this.A05;
                String id = user.getId();
                InterfaceC02590Ai A0f2 = AbstractC166987dD.A0f(c35121FeO.A00, "auto_confirm_action");
                A0f2.A8R(EnumC33496ErV.UNDO_TOAST, "format");
                A0f2.A8R(EnumC33497ErW.DISMISSED, "action");
                A0f2.AAP("target_user_id", id);
                A0f2.AAP("module", c35121FeO.A01);
                A0f2.Cht();
                C35266Fh1 c35266Fh1 = C35266Fh1.A00;
                UserSession userSession = (UserSession) this.A06;
                InterfaceC11380iw interfaceC11380iw = (InterfaceC11380iw) this.A02;
                String id2 = user.getId();
                Context context = (Context) this.A04;
                C35121FeO c35121FeO2 = new C35121FeO(interfaceC11380iw, userSession);
                if (!C35266Fh1.A05(userSession)) {
                    return;
                }
                int A00 = C35266Fh1.A00(userSession, c35266Fh1);
                C229419w A02 = C18U.A02(userSession, 36609583971964848L);
                if (A02 != null) {
                    i = (int) A02.BPF(C06090Tz.A04, 36609583971964848L);
                } else {
                    i = 0;
                }
                if (A00 != i || (drawable = context.getDrawable(R.drawable.ig_illustrations_qp_auto_confirm_follow_refresh)) == null) {
                    return;
                }
                C54844OMp c54844OMp = new C54844OMp(context);
                c54844OMp.A04(drawable);
                c54844OMp.A06 = C05F.A01;
                c54844OMp.A07 = AbstractC166997dE.A0p(context, 2131953367);
                c54844OMp.A05 = AbstractC166997dE.A0p(context, 2131953368);
                c54844OMp.A02(new DialogInterfaceOnClickListenerC35362Fid(c35121FeO2, interfaceC11380iw, context, userSession, id2, 2), AbstractC166997dE.A0p(context, 2131953369));
                c54844OMp.A03(new DialogInterfaceOnClickListenerC35446Fk3(id2, c35121FeO2, 5), AbstractC166997dE.A0p(context, 2131953370));
                C0fJ.A00(c54844OMp.A00());
                A0f = AbstractC166987dD.A0f(c35121FeO2.A00, "auto_confirm_action");
                A0f.A8R(EnumC33496ErV.SYSTEM_DIALOG, "format");
                A0f.A8R(EnumC33497ErW.IMPRESSION, "action");
                A0f.AAP("target_user_id", id2);
                A0f.AAP("module", c35121FeO2.A01);
                break;
                break;
            default:
                return;
        }
        A0f.Cht();
    }

    @Override // X.InterfaceC58152PqH
    public final void onShow() {
        InterfaceC02590Ai A00;
        String str;
        String str2;
        switch (this.A00) {
            case 0:
                A00 = AbstractC166987dD.A0f((C18920wW) this.A03, "ig_creator_connections_events");
                AbstractC31171DnF.A1B(A00, "impression");
                A00(A00, this);
                str = "success";
                str2 = IgReactPurchaseExperienceBridgeModule.RN_SHOP_PAY_STATUS;
                break;
            case 1:
                C35121FeO c35121FeO = (C35121FeO) this.A01;
                String A0g = AbstractC31171DnF.A0g(this.A05);
                A00 = C35121FeO.A00(c35121FeO);
                AbstractC31178DnM.A12(EnumC33496ErV.UNDO_TOAST, A00);
                A00.AAP("target_user_id", A0g);
                str = c35121FeO.A01;
                str2 = "module";
                break;
            default:
                return;
        }
        A00.AAP(str2, str);
        A00.Cht();
    }

    @Override // X.InterfaceC58152PqH
    public final /* synthetic */ void onTextClick(View view) {
    }
}
