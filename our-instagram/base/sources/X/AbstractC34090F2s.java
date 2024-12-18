package X;

import android.os.Bundle;
import com.instagram.common.session.UserSession;
import com.instagram.direct.capabilities.Capabilities;

/* renamed from: X.F2s, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC34090F2s {
    public static final ENA A00(UserSession userSession, Capabilities capabilities, InterfaceC83733oI interfaceC83733oI, int i, boolean z, boolean z2) {
        AbstractC167017dG.A1O(userSession, interfaceC83733oI);
        ENA ena = new ENA();
        Bundle A05 = AbstractC31178DnM.A05(userSession);
        AbstractC35077Fco.A01(A05, capabilities, interfaceC83733oI);
        A05.putInt(AbstractC43591JPw.A00(26), i);
        A05.putBoolean("DirectThreadDetailFragment.SHOULD_ALLOW_LEAVE_CONVERSATION", z);
        A05.putBoolean("DirectThreadDetailFragment.SHOULD_SHOW_PRIVACY_SETTINGS_ONLY", z2);
        ena.setArguments(A05);
        return ena;
    }
}
