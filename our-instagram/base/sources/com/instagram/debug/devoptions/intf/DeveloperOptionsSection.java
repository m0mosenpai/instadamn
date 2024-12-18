package com.instagram.debug.devoptions.intf;

import X.AbstractC018607g;
import X.AbstractC59962oe;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import java.util.List;

/* loaded from: classes6.dex */
public interface DeveloperOptionsSection {
    List getItems(UserSession userSession, FragmentActivity fragmentActivity, AbstractC59962oe abstractC59962oe, AbstractC018607g abstractC018607g);

    int getTitleRes();
}
