package com.instagram.fxcal.upsell.common;

import X.AbstractC149576oA;
import X.AbstractC1564470p;
import X.AbstractC23021Ah;
import X.C06090Tz;
import X.C14360o3;
import X.C149586oB;
import X.C1564370n;
import X.C1564570q;
import X.C18U;
import X.C50152MDf;
import X.InterfaceC13000lm;
import X.InterfaceC58134Ppx;
import X.InterfaceC58198Pr4;
import X.MSV;
import X.MWX;
import X.OIR;
import X.PK9;
import android.app.Activity;
import android.content.Context;
import com.facebook.common.callercontext.CallerContextable;
import com.instagram.common.session.UserSession;

/* loaded from: classes3.dex */
public final class FxIgLogoutACUpsellImpl extends AbstractC1564470p implements InterfaceC13000lm, CallerContextable {
    public static final C1564370n Companion = new Object();
    public boolean upsellShownInSession;
    public final UserSession userSession;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FxIgLogoutACUpsellImpl(UserSession userSession, Context context, String str) {
        super(context, userSession, str);
        C14360o3.A0B(userSession, 1);
        C14360o3.A0B(context, 2);
        C14360o3.A0B(str, 3);
        this.userSession = userSession;
    }

    public static final FxIgLogoutACUpsellImpl getInstance(UserSession userSession, Context context, String str) {
        return C1564370n.A00(userSession, context, str);
    }

    @Override // X.AbstractC1564470p
    public void showUpsell(InterfaceC58134Ppx interfaceC58134Ppx, Activity activity) {
        C14360o3.A0B(activity, 1);
        OIR oir = new OIR(activity, this.userSession, this);
        this.upsellShownInSession = true;
        oir.A00(interfaceC58134Ppx);
    }

    private final boolean checkClientImpressionAndMaybeSilentlyMigrateToServer() {
        if (!AbstractC23021Ah.A00(this.userSession).A01.getBoolean(MSV.A00(1199), false) && !this.upsellShownInSession) {
            return false;
        }
        MWX mwx = new MWX(this.userSession);
        if (!mwx.A02(this.entryPoint)) {
            mwx.A01(this.entryPoint);
            mwx.A00(this.entryPoint);
            return true;
        }
        return true;
    }

    private final boolean hasReachedImpressionLimit() {
        if (Boolean.valueOf(C18U.A06(C06090Tz.A06, this.userSession, 36319716628897376L)).booleanValue()) {
            return false;
        }
        return checkClientImpressionAndMaybeSilentlyMigrateToServer();
    }

    @Override // X.AbstractC1564470p
    public InterfaceC58198Pr4 getUpsellContent() {
        UserSession userSession = this.userSession;
        C14360o3.A0B(userSession, 0);
        return (PK9) userSession.A01(PK9.class, new C50152MDf(userSession, 22));
    }

    @Override // X.AbstractC1564470p
    public boolean isUpsellEligible() {
        if (!Boolean.valueOf(C18U.A06(C06090Tz.A06, this.userSession, 2342156429420398555L)).booleanValue() && !hasReachedImpressionLimit() && !isLinked() && AbstractC149576oA.A00(this.userSession).A0B(this.userSession, "IG_LOGOUT_UPSELL", true)) {
            return true;
        }
        return false;
    }

    @Override // X.InterfaceC13000lm
    public void onSessionWillEnd() {
        this.userSession.A03(FxIgLogoutACUpsellImpl.class);
    }

    @Override // X.AbstractC1564470p
    public void prefetchEligibility() {
        if (!isKillswitchEnabled()) {
            C149586oB A00 = AbstractC149576oA.A00(this.userSession);
            Context applicationContext = this.context.getApplicationContext();
            C14360o3.A07(applicationContext);
            UserSession userSession = this.userSession;
            String str = this.entryPoint;
            A00.A09(applicationContext, userSession, null, str, "IG_PROFILE_PHOTO_CHANGE_CHAINING", C1564570q.A00(str), false);
        }
    }
}
