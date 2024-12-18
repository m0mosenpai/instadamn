package com.instagram.fxcal.upsell.common;

import X.AbstractC149576oA;
import X.AbstractC1564470p;
import X.AbstractC167027dH;
import X.C14360o3;
import X.C53977Nto;
import X.C57262Pbk;
import X.InterfaceC13000lm;
import X.InterfaceC58134Ppx;
import X.InterfaceC58198Pr4;
import X.OIR;
import android.app.Activity;
import android.content.Context;
import com.facebook.common.callercontext.CallerContextable;
import com.instagram.common.session.UserSession;

/* loaded from: classes9.dex */
public final class FxIgExampleDialogACUpsellImpl extends AbstractC1564470p implements InterfaceC13000lm, CallerContextable {
    public static final C53977Nto Companion = new Object();
    public final UserSession userSession;

    @Override // X.AbstractC1564470p
    public void showUpsell(InterfaceC58134Ppx interfaceC58134Ppx, Activity activity) {
        C14360o3.A0B(activity, 1);
        new OIR(activity, this.userSession, this).A00(interfaceC58134Ppx);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [X.Pr4, java.lang.Object] */
    @Override // X.AbstractC1564470p
    public InterfaceC58198Pr4 getUpsellContent() {
        return new Object();
    }

    @Override // X.AbstractC1564470p
    public boolean isUpsellEligible() {
        return AbstractC149576oA.A00(this.userSession).A0B(this.userSession, this.entryPoint, true);
    }

    @Override // X.InterfaceC13000lm
    public void onSessionWillEnd() {
        this.userSession.A03(FxIgLogoutACUpsellImpl.class);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FxIgExampleDialogACUpsellImpl(UserSession userSession, Context context, String str) {
        super(context, userSession, str);
        AbstractC167027dH.A13(userSession, context, str);
        this.userSession = userSession;
    }

    public static final FxIgExampleDialogACUpsellImpl getInstance(UserSession userSession, Context context, String str) {
        AbstractC167027dH.A12(userSession, context, str);
        return (FxIgExampleDialogACUpsellImpl) userSession.A01(FxIgExampleDialogACUpsellImpl.class, new C57262Pbk(context, userSession, str, 18));
    }
}
