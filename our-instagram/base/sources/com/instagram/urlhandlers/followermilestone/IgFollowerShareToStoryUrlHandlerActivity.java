package com.instagram.urlhandlers.followermilestone;

import X.AbstractC111324zv;
import X.AbstractC12990ll;
import X.AbstractC166987dD;
import X.AbstractC166997dE;
import X.AbstractC167007dF;
import X.AbstractC18680vv;
import X.AbstractC25227BEk;
import X.AbstractC31171DnF;
import X.AbstractC31173DnH;
import X.AbstractC31176DnK;
import X.AbstractC35178FfV;
import X.AbstractC70197WGf;
import X.AbstractC917048o;
import X.C023409i;
import X.C09Y;
import X.C0f9;
import X.C0fK;
import X.C14360o3;
import X.C18950wb;
import X.C50472Tr;
import X.C9GR;
import X.G0G;
import android.graphics.Bitmap;
import android.os.Bundle;
import com.facebook.R;
import com.instagram.base.activity.BaseFragmentActivity;
import com.instagram.common.session.UserSession;
import com.instagram.modal.TransparentModalActivity;
import java.io.IOException;

/* loaded from: classes6.dex */
public final class IgFollowerShareToStoryUrlHandlerActivity extends BaseFragmentActivity {
    public String A00;
    public boolean A01 = true;

    @Override // com.instagram.base.activity.BaseFragmentActivity
    public final void A0j(Bundle bundle) {
    }

    @Override // com.instagram.base.activity.IgFragmentActivity, X.InterfaceC12980lk
    public final AbstractC18680vv getSession() {
        C09Y c09y = C023409i.A0A;
        Bundle A07 = AbstractC31176DnK.A07(this);
        if (A07 != null) {
            return c09y.A04(A07);
        }
        throw AbstractC166997dE.A0g();
    }

    public static final void A00(Bitmap bitmap, Bundle bundle, UserSession userSession, IgFollowerShareToStoryUrlHandlerActivity igFollowerShareToStoryUrlHandlerActivity) {
        Bitmap A00;
        int dimensionPixelSize = igFollowerShareToStoryUrlHandlerActivity.getResources().getDimensionPixelSize(R.dimen.achievements_achievement_image_size);
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        if (igFollowerShareToStoryUrlHandlerActivity.A01) {
            C0fK.A03(bitmap);
            A00 = Bitmap.createBitmap(bitmap, 0, dimensionPixelSize, width, height - dimensionPixelSize);
        } else {
            int dimensionPixelSize2 = igFollowerShareToStoryUrlHandlerActivity.getResources().getDimensionPixelSize(R.dimen.achievement_details_image_height_v2);
            A00 = C0fK.A00(bitmap, dimensionPixelSize2, dimensionPixelSize2, true);
        }
        C14360o3.A0A(A00);
        try {
            bundle.putString(AbstractC111324zv.A00(1731), AbstractC917048o.A02(A00));
            AbstractC31173DnH.A0v(igFollowerShareToStoryUrlHandlerActivity, bundle, userSession, TransparentModalActivity.class, AbstractC111324zv.A00(2395));
            igFollowerShareToStoryUrlHandlerActivity.finish();
        } catch (IOException e) {
            AbstractC167007dF.A15(C18950wb.A01.AEp("IgFollowerShareToStoryUrlHandlerActivity", 817892933), "IgFollowerShareToStoryUrlHandlerActivity", "Failed to save achievement icon to disk", e);
            C9GR.A0C(igFollowerShareToStoryUrlHandlerActivity, "shareToStory_unknown_error_occurred");
        }
    }

    @Override // com.instagram.base.activity.BaseFragmentActivity, com.instagram.base.activity.IgFragmentActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        int i;
        int A00 = C0f9.A00(2049051584);
        super.onCreate(bundle);
        if (bundle != null) {
            i = -1532947863;
        } else {
            Bundle A07 = AbstractC31176DnK.A07(this);
            if (A07 == null) {
                finish();
                i = -936582956;
            } else {
                String A0a = AbstractC31171DnF.A0a(A07);
                if (A0a == null) {
                    finish();
                    i = -1347555745;
                } else {
                    AbstractC18680vv session = getSession();
                    if (!(session instanceof UserSession)) {
                        AbstractC35178FfV.A01(this, A07, session);
                    } else {
                        this.A00 = AbstractC25227BEk.A0B(A0a).getQueryParameter("followers");
                        Bundle A0b = AbstractC166987dD.A0b();
                        int[] iArr = {getColor(R.color.igds_sticker_text_vibrant_gradient_purple), AbstractC167007dF.A09(this, R.attr.igds_color_gradient_lavender), AbstractC167007dF.A09(this, R.attr.igds_color_gradient_pink)};
                        AbstractC70197WGf.A07(this, new G0G(2, A0b, this, session), C50472Tr.A01(), iArr, new int[]{0, 0, 0, 1}, 0.2f);
                    }
                    i = -1409887793;
                }
            }
        }
        C0f9.A07(i, A00);
    }

    @Override // X.InterfaceC12980lk
    public final /* bridge */ /* synthetic */ AbstractC12990ll getSession() {
        return getSession();
    }
}
