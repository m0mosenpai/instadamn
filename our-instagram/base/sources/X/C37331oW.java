package X;

import android.app.Activity;
import android.content.Context;
import android.location.Location;
import com.facebook.systrace.Systrace;
import com.instagram.common.session.UserSession;
import com.instagram.friendmap.configs.FriendMapLaunchConfig;
import com.instagram.modal.ModalActivity;

/* renamed from: X.1oW, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C37331oW extends AbstractC37341oX {
    public Location A00;

    @Override // X.AbstractC37341oX
    public final void A01(Activity activity, UserSession userSession, FriendMapLaunchConfig friendMapLaunchConfig) {
        C14360o3.A0B(userSession, 0);
        C14360o3.A0B(activity, 1);
        if (AbstractC1565371b.A00(userSession)) {
            AbstractC35176FfT.A02(activity, userSession, "friends_map");
        } else {
            if (!C3LA.A05(userSession, true)) {
                return;
            }
            C6XJ c6xj = new C6XJ(activity, AbstractC61636Rr0.A00(new C09530e4("arg_friend_map_launch_config", friendMapLaunchConfig)), userSession, ModalActivity.class, "friend_map");
            c6xj.A07();
            c6xj.A0C(activity);
        }
    }

    @Override // X.AbstractC37341oX
    public final void A03(UserSession userSession) {
        C06090Tz c06090Tz = C06090Tz.A06;
        if (C3LA.A05(userSession, C18U.A06(c06090Tz, userSession, 36321722383017758L)) && C18U.A06(c06090Tz, userSession, 2342164731595597583L)) {
            if (C3LA.A04(userSession)) {
                A00(new C50355MLh(userSession, 12), userSession);
            } else {
                AbstractC92954Eo.A00(userSession).A09(null, null, C106854rm.A00, false, false);
            }
        }
    }

    @Override // X.AbstractC37341oX
    public final void A04(UserSession userSession, Integer num) {
        if (C3LA.A05(userSession, false) && AbstractC106864rn.A00(userSession, num)) {
            A00(new C9FO(39, this, num, userSession), userSession);
        }
    }

    private final void A00(InterfaceC16660sJ interfaceC16660sJ, UserSession userSession) {
        Location lastLocation;
        C1VW c1vw = C1VW.A00;
        if (c1vw == null) {
            lastLocation = this.A00;
        } else {
            lastLocation = c1vw.getLastLocation(userSession, "FriendMapPluginImpl");
            boolean A00 = AbstractC103794ly.A00(lastLocation);
            if (lastLocation == null || !A00) {
                interfaceC16660sJ.invoke(null);
                c1vw.requestLocationUpdates(userSession, new C23971Ak6(this, interfaceC16660sJ), "FRIEND_MAP", true);
                return;
            }
        }
        interfaceC16660sJ.invoke(lastLocation);
    }

    @Override // X.AbstractC37341oX
    public final void A02(Context context, UserSession userSession, Integer num, InterfaceC16620sF interfaceC16620sF, int i) {
        if (Systrace.A0E(1L)) {
            C0fO.A01("FriendMap.generateFriendMapStaticImageUrl", 1597367046);
        }
        try {
            A00(new MID(context, userSession, this, interfaceC16620sF, i), userSession);
            if (Systrace.A0E(1L)) {
                C0fO.A00(1961470950);
            }
        } catch (Throwable th) {
            if (Systrace.A0E(1L)) {
                C0fO.A00(-1892125550);
            }
            throw th;
        }
    }
}
