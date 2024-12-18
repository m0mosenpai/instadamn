package X;

import android.content.Context;
import com.instagram.api.schemas.SubmittedSubPostManageType;
import com.instagram.common.session.UserSession;
import java.util.List;

/* renamed from: X.IbI, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C41627IbI {
    public final UserSession A00;

    public C41627IbI(UserSession userSession) {
        C14360o3.A0B(userSession, 1);
        this.A00 = userSession;
    }

    public static final void A00(Context context, C38321qM c38321qM, C41627IbI c41627IbI, boolean z) {
        String str;
        if (c38321qM != null) {
            Object[] objArr = {c38321qM.A2u()};
            if (z) {
                str = "media/%s/enable_open_carousel/";
            } else {
                str = "media/%s/disable_open_carousel/";
            }
            String A06 = AbstractC13670mt.A06(str, objArr);
            C25621Ms A0c = AbstractC167017dG.A0c(c41627IbI.A00);
            A0c.A0B(A06);
            C1ON A0Q = AbstractC31177DnL.A0Q(A0c);
            A0Q.A00 = new C52220N9j(0, context, c41627IbI, c38321qM, z);
            C1GJ.A03(A0Q);
        }
    }

    public final void A01(SubmittedSubPostManageType submittedSubPostManageType, C1P1 c1p1, String str, String str2, List list) {
        String str3;
        String A0b;
        String str4;
        List A0m;
        if (str != null && (A0m = AbstractC167007dF.A0m(str, "_", 0)) != null) {
            str3 = (String) AbstractC001800i.A0J(A0m);
        } else {
            str3 = null;
        }
        C25621Ms A0c = AbstractC167017dG.A0c(this.A00);
        A0c.A0B("media/manage_submitted_sub_post/");
        A0c.A0P(null, H9I.class, IOS.class, false);
        A0c.A9s("manage_type", submittedSubPostManageType.A00);
        if (list != null) {
            if (list.size() <= 1 && submittedSubPostManageType == SubmittedSubPostManageType.A07) {
                A0b = (String) AbstractC001800i.A0J(list);
                str4 = "media_id";
            } else {
                A0b = AbstractC31175DnJ.A0b(list);
                str4 = "media_id_list";
            }
            A0c.A9s(str4, A0b);
        }
        if (str3 != null) {
            A0c.A9s("parent_media_id", str3);
        }
        if (submittedSubPostManageType == SubmittedSubPostManageType.A05 || submittedSubPostManageType == SubmittedSubPostManageType.A04) {
            A0c.A0D("camera_entry_point", 617);
            A0c.A9s(MSV.A00(424), str2);
        }
        C1ON A0N = A0c.A0N();
        A0N.A00 = c1p1;
        C1GJ.A03(A0N);
    }

    public final void A02(C1P1 c1p1, EnumC46210Kcm enumC46210Kcm, String str, String str2) {
        AbstractC167017dG.A1N(str, enumC46210Kcm);
        C14360o3.A0B(c1p1, 3);
        C25621Ms A0M = AbstractC31177DnL.A0M(this.A00);
        A0M.A0B("feed/async_get_carousel_pending_children_for_parent/");
        A0M.A9s("parent_media_id", str);
        AbstractC37304Gc5.A1B(A0M, "filter_type", enumC46210Kcm.A01, str2);
        C1ON A0e = AbstractC25227BEk.A0e(A0M, C38855H9d.class, C41249INp.class);
        A0e.A00 = c1p1;
        C1GJ.A03(A0e);
    }
}
