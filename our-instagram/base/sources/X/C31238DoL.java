package X;

import com.facebook.common.callercontext.CallerContext;
import com.facebook.common.callercontext.CallerContextable;
import com.instagram.accountlinking.model.AccountFamily;
import com.instagram.common.session.UserSession;

/* renamed from: X.DoL, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C31238DoL implements CallerContextable {
    public static final CallerContext A00 = CallerContext.A00(C31238DoL.class);
    public static final String __redex_internal_original_name = "FxCalFlowGating";

    public static final boolean A00(AbstractC12990ll abstractC12990ll) {
        String A02;
        C14360o3.A0B(abstractC12990ll, 0);
        if (!(abstractC12990ll instanceof UserSession) || AbstractC49092Nc.A00((UserSession) abstractC12990ll).A00(A00, "ig_android_linking_cache_fx_internal") || (A02 = AbstractC03270Dk.A02(abstractC12990ll)) == null) {
            return false;
        }
        C2049995m A01 = C2049995m.A01(abstractC12990ll);
        if (!A01.A06(A02)) {
            return false;
        }
        AccountFamily accountFamily = (AccountFamily) A01.A02.get(A02);
        accountFamily.getClass();
        if (accountFamily.A04.size() <= 1) {
            return false;
        }
        return true;
    }
}
