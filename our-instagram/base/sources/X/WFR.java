package X;

import android.app.Activity;
import androidx.fragment.app.FragmentActivity;
import com.facebook.R;
import com.instagram.api.schemas.ErrorIdentifier;
import com.instagram.api.schemas.XIGIGBoostDestination;
import com.instagram.bloks.hosting.IgBloksScreenConfig;
import com.instagram.business.promote.model.PromoteData;
import com.instagram.common.session.UserSession;
import com.instagram.debug.devoptions.avatars.ImmersiveAvatarViewerDebugFragment;
import com.instagram.user.model.User;
import java.util.HashMap;

/* loaded from: classes11.dex */
public final class WFR {
    public static final void A02(UserSession userSession, FragmentActivity fragmentActivity) {
        C140966Yy A0N = AbstractC31174DnI.A0N(AbstractC155756z4.A00().A02().A09(ErrorIdentifier.A18, userSession), fragmentActivity, userSession);
        A0N.A0D = false;
        A0N.A04();
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0032, code lost:
    
        if (r3 == null) goto L15;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final boolean A03(android.content.Context r5, com.instagram.business.promote.model.PromoteData r6) {
        /*
            r0 = 1
            X.C14360o3.A0B(r6, r0)
            r0 = 2131964933(0x7f133405, float:1.9566662E38)
            java.lang.String r5 = X.AbstractC166997dE.A0p(r5, r0)
            com.instagram.leadgen.core.api.LeadForm r0 = r6.A16
            r4 = 0
            if (r0 == 0) goto L34
            java.util.List r0 = r0.A05
            if (r0 == 0) goto L34
            java.util.Iterator r2 = r0.iterator()
        L18:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L34
            java.lang.Object r3 = r2.next()
            r1 = r3
            com.instagram.leadgen.core.api.LeadGenInfoFieldData r1 = (com.instagram.leadgen.core.api.LeadGenInfoFieldData) r1
            boolean r0 = r1.A02
            if (r0 != 0) goto L18
            java.lang.String r0 = r1.A00
            boolean r0 = r5.equalsIgnoreCase(r0)
            if (r0 == 0) goto L18
            r2 = 1
            if (r3 != 0) goto L35
        L34:
            r2 = 0
        L35:
            com.instagram.api.schemas.XIGIGBoostDestination r1 = r6.A0i
            com.instagram.api.schemas.XIGIGBoostDestination r0 = com.instagram.api.schemas.XIGIGBoostDestination.A07
            if (r1 != r0) goto L3e
            if (r2 == 0) goto L3e
            r4 = 1
        L3e:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: X.WFR.A03(android.content.Context, com.instagram.business.promote.model.PromoteData):boolean");
    }

    public static final HashMap A00(android.net.Uri uri) {
        String queryParameter = uri.getQueryParameter("media_id");
        String queryParameter2 = uri.getQueryParameter("channel_id");
        String queryParameter3 = uri.getQueryParameter("tip_id");
        String queryParameter4 = uri.getQueryParameter("is_aymt_tip");
        HashMap A0r = AbstractC167017dG.A0r(ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY, "deeplink");
        if (queryParameter != null) {
            A0r.put("media_id", queryParameter);
        }
        if (queryParameter2 != null) {
            A0r.put("channel_id", queryParameter2);
        }
        if (queryParameter3 != null) {
            A0r.put("tip_id", queryParameter3);
        }
        if (queryParameter4 != null) {
            A0r.put("is_aymt_tip", queryParameter4);
        }
        return A0r;
    }

    public final void A04(Activity activity, PromoteData promoteData, InterfaceC16820sZ interfaceC16820sZ) {
        if (promoteData.A0i == XIGIGBoostDestination.A07) {
            UserSession userSession = promoteData.A0y;
            C14360o3.A06(userSession);
            if (C18U.A06(C06090Tz.A05, userSession, 36319600664649270L) && activity != null) {
                C193328hC c193328hC = new C193328hC(activity);
                c193328hC.A0A(2131965036);
                c193328hC.A09(2131965034);
                c193328hC.A0j(activity.getDrawable(R.drawable.ig_illustrations_qp_info_refresh));
                c193328hC.A0F(DialogInterfaceOnClickListenerC70216WHx.A00);
                AbstractC31176DnK.A16(new WHP(interfaceC16820sZ, 34), c193328hC, 2131965035);
            }
        }
    }

    public static final void A01(FragmentActivity fragmentActivity, AbstractC12990ll abstractC12990ll, String str, HashMap hashMap) {
        FragmentActivity fragmentActivity2 = (FragmentActivity) AbstractC54852fj.A00();
        if (fragmentActivity2 != null) {
            fragmentActivity.finish();
        }
        C72743Nv A02 = W6d.A02(new IgBloksScreenConfig(abstractC12990ll), C66277U6x.A01(str, hashMap));
        if (fragmentActivity2 != null) {
            fragmentActivity = fragmentActivity2;
        }
        AbstractC31177DnL.A16(A02, fragmentActivity, abstractC12990ll);
    }

    public final void A05(FragmentActivity fragmentActivity, UserSession userSession, String str, String str2) {
        String str3;
        AbstractC167017dG.A1O(str, userSession);
        HashMap A0r = AbstractC167017dG.A0r(ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY, "promotion_manager_view_all_leads");
        int length = str2.length();
        if (length > 0) {
            A0r.put("media_id", str2);
            A0r.put(ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY, "promotion_manager_view_media_leads");
        }
        User A0Y = AbstractC166997dE.A0Y(userSession);
        Boolean CTD = A0Y.A03.CTD();
        if (CTD != null && CTD.booleanValue()) {
            String BMg = A0Y.A03.BMg();
            if (BMg == null) {
                BMg = "";
            }
            if (BMg.equals("com.bloks.www.ig.smb.lead_gen.subpage") && length > 0) {
                str3 = "com.bloks.www.ig.smb.lead_gen.all_lead_opportunities";
            } else {
                str3 = A0Y.A03.BMg();
                if (str3 == null) {
                    str3 = "";
                }
            }
        } else {
            str3 = "com.bloks.www.ig.smb.services.lead_gen.all_leads";
        }
        C72743Nv A02 = W6d.A02(new IgBloksScreenConfig(userSession), C66277U6x.A01(str3, A0r));
        C140966Yy c140966Yy = new C140966Yy(fragmentActivity, userSession);
        c140966Yy.A0A = str;
        c140966Yy.A0D(A02);
        c140966Yy.A04();
    }
}
