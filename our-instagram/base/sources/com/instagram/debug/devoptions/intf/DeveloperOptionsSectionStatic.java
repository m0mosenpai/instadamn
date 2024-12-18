package com.instagram.debug.devoptions.intf;

import X.AbstractC018607g;
import X.AbstractC59962oe;
import X.AbstractC86593tX;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import java.util.List;

/* loaded from: classes4.dex */
public class DeveloperOptionsSectionStatic {
    public static List getItems(int i, UserSession userSession, FragmentActivity fragmentActivity, AbstractC59962oe abstractC59962oe, AbstractC018607g abstractC018607g) {
        return AbstractC86593tX.A0K(i, userSession, fragmentActivity, abstractC59962oe, abstractC018607g);
    }

    public static int[] getKeys() {
        return AbstractC86593tX.A0t();
    }

    public static int getTitleRes(int i) {
        return AbstractC86593tX.A00(i);
    }
}
