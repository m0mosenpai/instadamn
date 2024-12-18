package X;

import android.view.View;
import androidx.fragment.app.FragmentActivity;
import com.instagram.profile.fragment.UserDetailFragment;
import com.instagram.profile.intf.UserDetailLaunchConfig;
import com.instagram.user.model.FollowStatus;
import com.instagram.user.model.User;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: X.Dr1, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C31397Dr1 implements InterfaceC42271xH {
    public final /* synthetic */ UserDetailFragment A00;

    public C31397Dr1(UserDetailFragment userDetailFragment) {
        this.A00 = userDetailFragment;
    }

    @Override // X.InterfaceC42271xH
    public final /* bridge */ /* synthetic */ boolean A79(Object obj) {
        return AbstractC31177DnL.A1Y(this.A00, ((C3MC) obj).A01);
    }

    @Override // X.InterfaceC41501vz
    public final /* bridge */ /* synthetic */ void onEvent(Object obj) {
        C33607EtJ c33607EtJ;
        C71L c71l;
        View view;
        UserDetailLaunchConfig userDetailLaunchConfig;
        int A03 = C0f9.A03(597827306);
        int A032 = C0f9.A03(-1380651116);
        FollowStatus followStatus = ((C3MC) obj).A00;
        int ordinal = followStatus.ordinal();
        boolean z = true;
        if (ordinal != 3) {
            if (ordinal == 4) {
                UserDetailFragment userDetailFragment = this.A00;
                userDetailFragment.A0v.A01();
                User user = userDetailFragment.A10.A03;
                if (user != null && (userDetailLaunchConfig = userDetailFragment.A1E) != null && userDetailLaunchConfig.A0Y && !userDetailFragment.A1n) {
                    userDetailFragment.A1n = true;
                    if (AbstractC177607uu.A00 != null) {
                        user.getUsername();
                    }
                }
                FragmentActivity activity = userDetailFragment.getActivity();
                User user2 = userDetailFragment.A10.A03;
                if (activity != null && C1VN.A00 != null && user2 != null && Boolean.FALSE.equals(user2.A0J())) {
                    AbstractC31282Dp4.A00().A00(activity, userDetailFragment.A0I, "711162477494006", AbstractC47112Ks7.A00(user2.getId()));
                }
                if (userDetailFragment.A1i && userDetailFragment.A0M != null && (c71l = userDetailFragment.A0O) != null && (view = c71l.A02) != null && userDetailFragment.A1m) {
                    c71l.A03(view);
                }
            }
        } else {
            UserDetailFragment userDetailFragment2 = this.A00;
            C34943FaT c34943FaT = userDetailFragment2.A0u;
            if (c34943FaT != null) {
                C31365DqU c31365DqU = userDetailFragment2.A32;
                CopyOnWriteArrayList copyOnWriteArrayList = c34943FaT.A00;
                synchronized (copyOnWriteArrayList) {
                    c33607EtJ = (C33607EtJ) c34943FaT.A02.get();
                    Throwable th = (Throwable) c34943FaT.A01.get();
                    if (c33607EtJ == null && th == null) {
                        copyOnWriteArrayList.add(c31365DqU);
                    }
                }
                if (c33607EtJ != null) {
                    c31365DqU.A00(c33607EtJ.A00);
                }
            }
        }
        C70S c70s = this.A00.A11;
        if (followStatus != FollowStatus.A05) {
            z = false;
        }
        c70s.A02(z);
        C0f9.A0A(-418258499, A032);
        C0f9.A0A(-284564577, A03);
    }
}
