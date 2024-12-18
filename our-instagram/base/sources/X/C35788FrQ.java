package X;

import android.os.Bundle;
import com.facebook.common.callercontext.CallerContext;
import com.facebook.common.callercontext.CallerContextable;
import com.instagram.debug.devoptions.avatars.ImmersiveAvatarViewerDebugFragment;
import com.instagram.model.business.BusinessInfo;
import com.instagram.registration.model.RegFlowExtras;

/* renamed from: X.FrQ, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C35788FrQ implements CallerContextable {
    public static final CallerContext A0B = CallerContext.A00(C35788FrQ.class);
    public static final String __redex_internal_original_name = "BusinessConversionDataContext";
    public C31505Dsp A00;
    public EBH A01;
    public BusinessInfo A02;
    public BusinessInfo A03;
    public RegFlowExtras A04;
    public String A05;
    public boolean A06;
    public boolean A07;
    public final int A08;
    public final String A09;
    public final AbstractC12990ll A0A;

    public C35788FrQ(Bundle bundle, AbstractC12990ll abstractC12990ll) {
        AbstractC167017dG.A1P(abstractC12990ll, bundle);
        this.A0A = abstractC12990ll;
        this.A09 = AbstractC31173DnH.A0k(bundle, ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY);
        this.A08 = bundle.getInt("intro_entry_position");
        bundle.getString("target_page_id");
        bundle.getString("fb_user_id");
        bundle.getString("suma_sign_up_page_name");
        bundle.getString("upsell_fb_user_id");
        bundle.getString("upsell_page_id");
        bundle.getBoolean("sign_up_megaphone_entry", false);
    }
}
