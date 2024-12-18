package X;

import android.view.View;
import android.widget.FrameLayout;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.shopping.intf.ProductDetailsPageArguments;
import java.util.Map;

/* renamed from: X.Ibk, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract class AbstractC41652Ibk {
    public static final C6BN A01(View view, C2WC c2wc, int i, int i2) {
        C14360o3.A0B(view, 1);
        view.measure(i, i2);
        return new C6BN(c2wc, null, view.getMeasuredWidth(), view.getMeasuredHeight());
    }

    public static final FrameLayout A00(View view) {
        FrameLayout frameLayout = new FrameLayout(view.getContext());
        frameLayout.setLayoutParams(new FrameLayout.LayoutParams(-1, -2));
        frameLayout.addView(view);
        frameLayout.setTag(view.getTag());
        return frameLayout;
    }

    public static final C41121IIm A02(C6FG c6fg, UserSession userSession, String str) {
        boolean A1a = AbstractC167017dG.A1a(c6fg, userSession);
        Object obj = c6fg.A01.get(R.id.bk_context_key_pdp_arguments);
        if (!Map.class.isInstance(obj)) {
            obj = null;
        }
        Map map = (Map) obj;
        C41121IIm c41121IIm = null;
        if (map != null) {
            ProductDetailsPageArguments productDetailsPageArguments = (ProductDetailsPageArguments) map.get("cpdp_mvp_bloks_pdp_arguments");
            String A1A = AbstractC166987dD.A1A("shopping_session_id", map);
            if (A1A == null) {
                A1A = AbstractC61112qZ.A00(null);
            }
            String A1A2 = AbstractC166987dD.A1A("arg_cpdp_mvp_bloks_session_id", map);
            if (productDetailsPageArguments != null && A1A2 != null) {
                c41121IIm = new C41121IIm(productDetailsPageArguments, A1A, A1A2, AbstractC37302Gc3.A1a(userSession));
            }
        }
        String A0R = AnonymousClass001.A0R("Unable to get CpdpArguments for RenderUnit ", str);
        C14360o3.A0B(A0R, A1a ? 1 : 0);
        if (c41121IIm == null) {
            AbstractC25241Le.A02("CPDP_MVP", A0R);
        }
        return c41121IIm;
    }
}
