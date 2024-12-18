package com.instagram.debug.devoptions.signalsplayground.util;

import X.AbstractC111324zv;
import X.AbstractC12220kQ;
import X.AbstractC166987dD;
import X.AbstractC25228BEl;
import X.AbstractC25232BEp;
import X.AbstractC25233BEq;
import X.AbstractC31171DnF;
import X.C14360o3;
import X.InterfaceC02590Ai;
import X.InterfaceC11380iw;
import com.instagram.common.session.UserSession;

/* loaded from: classes7.dex */
public final class CreatorInspirationSignalsPlaygroundLoggerUtil {
    public static final CreatorInspirationSignalsPlaygroundLoggerUtil INSTANCE = new Object();

    public final void reportFeedbackButtonClick(UserSession userSession, InterfaceC11380iw interfaceC11380iw, String str, String str2, String str3, int i) {
        C14360o3.A0B(userSession, 0);
        AbstractC25233BEq.A0w(1, interfaceC11380iw, str2, str3);
        InterfaceC02590Ai A0f = AbstractC166987dD.A0f(AbstractC12220kQ.A01(interfaceC11380iw, userSession), "ig_signals_playground_entity_feedback");
        if (A0f.isSampled()) {
            A0f.AAP("signal", str3);
            A0f.A9K(AbstractC111324zv.A00(3216), AbstractC25228BEl.A13(str2));
            A0f.A9K("numeric_score", AbstractC31171DnF.A0V(i));
            A0f.A9K("media_igid", AbstractC25233BEq.A0n(str));
            AbstractC25232BEp.A1L(A0f, "container_module", interfaceC11380iw.getModuleName());
        }
    }
}
