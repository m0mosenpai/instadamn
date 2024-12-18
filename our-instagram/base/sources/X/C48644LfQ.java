package X;

import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import com.instagram.debug.devoptions.intf.DeveloperOptionsSection;
import java.util.List;

/* renamed from: X.LfQ, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C48644LfQ implements DeveloperOptionsSection {
    public static final C48644LfQ A00 = new Object();

    @Override // com.instagram.debug.devoptions.intf.DeveloperOptionsSection
    public final List getItems(UserSession userSession, FragmentActivity fragmentActivity, AbstractC59962oe abstractC59962oe, AbstractC018607g abstractC018607g) {
        AbstractC167017dG.A1N(userSession, fragmentActivity);
        if (C6CE.A00(userSession).A00()) {
            return AbstractC166987dD.A1J(new GHY(fragmentActivity, new ViewOnClickListenerC48066LPr(45, fragmentActivity, userSession), 2131958551));
        }
        return C16930sl.A00;
    }

    @Override // com.instagram.debug.devoptions.intf.DeveloperOptionsSection
    public final int getTitleRes() {
        return 2131958550;
    }
}
