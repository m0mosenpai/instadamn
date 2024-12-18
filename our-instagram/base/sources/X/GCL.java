package X;

import android.content.Context;
import com.facebook.common.callercontext.CallerContext;
import com.facebook.common.callercontext.CallerContextable;
import com.instagram.common.session.UserSession;

/* loaded from: classes6.dex */
public final class GCL implements C5OV, CallerContextable {
    public static final String __redex_internal_original_name = "SupportResourcesCsomFilter";
    public final Context A00;
    public final UserSession A01;

    @Override // X.C5OV
    public final boolean E3b(C5OW c5ow) {
        if (AbstractC49092Nc.A00(this.A01).A00(CallerContext.A00(GCL.class), "ig_android_linking_cache_ig_to_fb_cross_communication") && AbstractC14490oL.A0I(this.A00, "com.facebook.orca", 293)) {
            return true;
        }
        return false;
    }

    public GCL(Context context, UserSession userSession) {
        this.A00 = context;
        this.A01 = userSession;
    }
}
