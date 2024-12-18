package com.instagram.bugreporter.rageshakehelper;

import X.AbstractC09560e7;
import X.AbstractC12990ll;
import X.AbstractC23021Ah;
import X.AbstractC23611Dp;
import X.C0eB;
import X.C23031Ai;
import X.C2AU;
import X.InterfaceC16660sJ;
import X.InterfaceC19610xo;
import X.InterfaceC23621Ds;
import com.instagram.common.session.UserSession;
import com.instagram.react.modules.product.IgReactPurchaseExperienceBridgeModule;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.instagram.bugreporter.rageshakehelper.RageShakeSensorHelper$scheduleLogRageShakeStatus$1", f = "RageShakeSensorHelper.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes.dex */
public final class RageShakeSensorHelper$scheduleLogRageShakeStatus$1 extends AbstractC23611Dp implements InterfaceC16660sJ {
    public final /* synthetic */ C2AU A00;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RageShakeSensorHelper$scheduleLogRageShakeStatus$1(C2AU c2au, InterfaceC23621Ds interfaceC23621Ds) {
        super(1, interfaceC23621Ds);
        this.A00 = c2au;
    }

    @Override // X.C1Dr
    public final InterfaceC23621Ds create(InterfaceC23621Ds interfaceC23621Ds) {
        return new RageShakeSensorHelper$scheduleLogRageShakeStatus$1(this.A00, interfaceC23621Ds);
    }

    @Override // X.InterfaceC16660sJ
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return new RageShakeSensorHelper$scheduleLogRageShakeStatus$1(this.A00, (InterfaceC23621Ds) obj).invokeSuspend(C0eB.A00);
    }

    @Override // X.C1Dr
    public final Object invokeSuspend(Object obj) {
        AbstractC09560e7.A00(obj);
        C2AU c2au = this.A00;
        AbstractC12990ll abstractC12990ll = c2au.A06;
        if (abstractC12990ll instanceof UserSession) {
            C23031Ai A00 = AbstractC23021Ah.A00((UserSession) abstractC12990ll);
            if (C23031Ai.A07(A00, "rageshake_last_logged_enabled_timestamp", 1L)) {
                c2au.A03.A00.markEventBuilder(396374493, "").setLevel(7).annotate(IgReactPurchaseExperienceBridgeModule.RN_SHOP_PAY_STATUS, ((Boolean) A00.A69.CES(A00, C23031Ai.A8c[38])).booleanValue()).report();
                InterfaceC19610xo ARD = A00.A01.ARD();
                ARD.E7G("rageshake_last_logged_enabled_timestamp", System.currentTimeMillis());
                ARD.apply();
            }
        }
        return C0eB.A00;
    }
}
