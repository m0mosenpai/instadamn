package X;

import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import com.instagram.debug.devoptions.intf.DeveloperOptionsSection;
import java.util.List;

/* renamed from: X.LfR, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C48645LfR implements DeveloperOptionsSection {
    public static final C48645LfR A00 = new Object();

    @Override // com.instagram.debug.devoptions.intf.DeveloperOptionsSection
    public final List getItems(UserSession userSession, FragmentActivity fragmentActivity, AbstractC59962oe abstractC59962oe, AbstractC018607g abstractC018607g) {
        AbstractC167017dG.A1N(userSession, fragmentActivity);
        return AbstractC16960so.A1Q(new GHY(fragmentActivity, new FpQ(40, userSession, fragmentActivity), "[msys] Armadillo entry point"), new GHY(fragmentActivity, new LQ1(31, userSession, fragmentActivity), "[msys] ICDC"));
    }

    @Override // com.instagram.debug.devoptions.intf.DeveloperOptionsSection
    public final int getTitleRes() {
        return 2131957826;
    }
}
