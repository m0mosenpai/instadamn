package X;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.base.IgSimpleImageView;
import com.instagram.igds.components.mediabutton.IgdsMediaButton;
import com.instagram.save.api.SaveApiUtil;

/* renamed from: X.8PF, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C8PF extends AbstractC52922bZ {
    public final void A00(Activity activity, Context context, C24H c24h, UserSession userSession, IgSimpleImageView igSimpleImageView, C38321qM c38321qM, InterfaceC60442pS interfaceC60442pS, IgdsMediaButton igdsMediaButton, EnumC77213d7 enumC77213d7) {
        String str;
        String str2;
        C14360o3.A0B(userSession, 7);
        C14360o3.A0B(c24h, 8);
        if (c38321qM != null) {
            c38321qM.Ed3(enumC77213d7);
            SaveApiUtil.A05(activity, context, userSession, c38321qM, interfaceC60442pS, enumC77213d7, 0);
            C22C A01 = AnonymousClass229.A01(userSession);
            String A2u = c38321qM.A2u();
            if (A2u != null) {
                EnumC77213d7 enumC77213d72 = EnumC77213d7.A04;
                if (enumC77213d7 == enumC77213d72) {
                    str = "TEMPLATE_LANDING_PAGE_SAVE_TAP";
                } else {
                    str = "TEMPLATE_LANDING_PAGE_UNSAVE_TAP";
                }
                A01.A1X(c24h, A2u, str);
                boolean z = false;
                if (igSimpleImageView != null) {
                    int i = R.drawable.instagram_save_pano_outline_24;
                    if (enumC77213d7 == enumC77213d72) {
                        i = R.drawable.instagram_save_pano_filled_24;
                    }
                    igSimpleImageView.setImageDrawable(context.getDrawable(i));
                } else if (igdsMediaButton != null) {
                    if (enumC77213d7 == enumC77213d72) {
                        z = true;
                    }
                    Resources resources = context.getResources();
                    int i2 = 2131955557;
                    if (z) {
                        i2 = 2131972790;
                    }
                    igdsMediaButton.setLabel(resources.getString(i2));
                }
                if (enumC77213d7 == enumC77213d72) {
                    str2 = "Added to saved";
                } else {
                    str2 = "Removed from saved";
                }
                C9GR.A03(context, str2, null, 0);
                Intent intent = new Intent();
                intent.putExtra(MSV.A00(702), true);
                activity.setResult(-1, intent);
                return;
            }
            throw new IllegalStateException("Required value was null.");
        }
    }
}
