package X;

import android.view.View;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;

/* loaded from: classes6.dex */
public final class GA3 implements GZH {
    public final C31250DoY A00;

    @Override // X.GZH
    public final void AJb(View view, MUD mud, EnumC33370Ep3 enumC33370Ep3, C5HW c5hw, int i) {
        C14360o3.A0B(c5hw, 0);
        C31250DoY c31250DoY = this.A00;
        String A09 = c5hw.A09("media_id");
        if (A09 != null) {
            FragmentActivity fragmentActivity = c31250DoY.A05;
            UserSession userSession = c31250DoY.A0A;
            C14360o3.A0B(fragmentActivity, 0);
            C14360o3.A0B(userSession, 1);
            AbstractC54121NwJ.A00(fragmentActivity, userSession, A09, true);
        }
    }

    public GA3(C31250DoY c31250DoY) {
        this.A00 = c31250DoY;
    }

    @Override // X.GZH
    public final boolean AFW(EnumC33370Ep3 enumC33370Ep3, C5HW c5hw, int i) {
        AbstractC167017dG.A1N(c5hw, enumC33370Ep3);
        if (c5hw.A00 == 1643) {
            if (enumC33370Ep3 == EnumC33370Ep3.A02 || enumC33370Ep3 == EnumC33370Ep3.A04) {
                return true;
            }
            return false;
        }
        return false;
    }
}
