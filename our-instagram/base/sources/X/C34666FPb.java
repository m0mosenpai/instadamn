package X;

import android.app.Activity;
import android.graphics.Bitmap;
import com.facebook.R;
import com.instagram.api.schemas.FanClubInfoDict;
import com.instagram.api.schemas.ReelAutoArchiveSettingStr;
import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.model.reels.Reel;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.FPb, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C34666FPb {
    public final /* synthetic */ C3B7 A00;
    public final /* synthetic */ List A01;

    public C34666FPb(C3B7 c3b7, List list) {
        this.A00 = c3b7;
        this.A01 = list;
    }

    public final void A00(Bitmap bitmap) {
        EnumC76383bi enumC76383bi;
        boolean z;
        ImageUrl imageUrl;
        C3B7 c3b7 = this.A00;
        List list = this.A01;
        C3B7.A03(c3b7, list);
        Activity activity = c3b7.A01;
        UserSession userSession = c3b7.A03;
        String str = c3b7.A07;
        C08730cb c08730cb = C17060sy.A01;
        if (AbstractC31171DnF.A0T(userSession, c08730cb).BlR() == ReelAutoArchiveSettingStr.A07 && !activity.isFinishing() && !activity.isDestroyed() && !C18U.A06(C06090Tz.A05, userSession, 36319068088703905L)) {
            CSP csp = new CSP(activity, bitmap, userSession, str);
            C0fJ.A00(csp.A01);
            C1GJ.A03(AbstractC1571873x.A02(null, csp.A03, true, false));
        }
        ArrayList A03 = c3b7.A05.A0C.A03(list);
        C41181vS c41181vS = null;
        if (!A03.isEmpty()) {
            List A0O = ((Reel) A03.get(0)).A0O(userSession);
            if (!A0O.isEmpty()) {
                c41181vS = (C41181vS) A0O.get(AbstractC25226BEj.A05(A0O));
            }
        }
        C34612FMv c34612FMv = new C34612FMv(userSession, activity, str);
        if (c41181vS != null) {
            enumC76383bi = c41181vS.A0B();
        } else {
            enumC76383bi = null;
        }
        boolean A1X = AbstractC167007dF.A1X(enumC76383bi, EnumC76383bi.A07);
        boolean z2 = c34612FMv.A03.A01.getBoolean("has_seen_auto_save_to_exclusive_highlight_dialog", false);
        UserSession userSession2 = c34612FMv.A01;
        FanClubInfoDict A0M = AbstractC31172DnG.A0M(c08730cb.A01(userSession2));
        if (A0M != null) {
            z = AbstractC166997dE.A1Z(A0M.AeJ(), true);
        } else {
            z = false;
        }
        if (A1X && z && !z2) {
            C99694dm c99694dm = c34612FMv.A02;
            String str2 = userSession2.userId;
            C14360o3.A0B(str2, 1);
            InterfaceC02590Ai A0f = AbstractC166987dD.A0f(c99694dm.A00, "ig_fan_club_creator_auto_add_highlights_alert_seen");
            AbstractC31171DnF.A1I(A0f, "profile");
            AbstractC31178DnM.A17(A0f, str2);
            A0f.Cht();
            Activity activity2 = c34612FMv.A00;
            C193328hC A0H = AbstractC31171DnF.A0H(activity2);
            int dimensionPixelSize = activity2.getResources().getDimensionPixelSize(R.dimen.appreciation_reels_grid_item_width);
            if (bitmap == null) {
                imageUrl = AbstractC166997dE.A0Y(userSession2).Bhu();
            } else {
                imageUrl = null;
            }
            C89533yt c89533yt = new C89533yt(imageUrl, c34612FMv.A04, dimensionPixelSize, 0, 0, 0);
            if (bitmap != null) {
                c89533yt.A01(bitmap);
            }
            A0H.A0k(c89533yt);
            A0H.A0A(2131962148);
            A0H.A09(2131962146);
            A0H.A0s(false);
            A0H.A0t(false);
            DialogInterfaceOnClickListenerC35454FkB.A02(A0H, c34612FMv, 1, 2131961124);
            AbstractC31176DnK.A16(DialogInterfaceOnClickListenerC35454FkB.A00(c34612FMv, 2), A0H, 2131962147);
        }
    }
}
