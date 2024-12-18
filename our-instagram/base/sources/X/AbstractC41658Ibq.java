package X;

import android.app.Activity;
import android.graphics.Rect;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.widget.imageview.IgImageView;
import com.instagram.modal.TransparentModalActivity;
import com.instagram.model.reels.Reel;
import com.instagram.model.reels.ReelViewerConfig;

/* renamed from: X.Ibq, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract class AbstractC41658Ibq {
    public static final Rect A00(IgImageView igImageView) {
        C14360o3.A0B(igImageView, 0);
        int left = igImageView.getLeft();
        int top = igImageView.getTop();
        return new Rect(left, top, igImageView.getDrawable().getIntrinsicWidth() + left, igImageView.getDrawable().getIntrinsicHeight() + top);
    }

    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, X.6ab] */
    public static final void A01(Activity activity, UserSession userSession, C37771pE c37771pE, C3G2 c3g2) {
        AbstractC167017dG.A1Q(userSession, c3g2);
        Reel A0I = AbstractC37301Gc2.A0M(userSession).A0I(c37771pE, false);
        ?? obj = new Object();
        obj.A02(userSession, A0I.getId(), AbstractC166987dD.A1J(A0I));
        obj.A04 = c3g2;
        AbstractC31177DnL.A1P(obj);
        obj.A01(userSession);
        obj.A03 = ReelViewerConfig.A00();
        AbstractC31177DnL.A0n(activity, obj.A00(), userSession, TransparentModalActivity.class, AbstractC111324zv.A00(1218));
        C37947Gmp.A00.A02(userSession, A0I, c3g2);
    }

    public static final void A02(UserSession userSession, Activity activity, String str) {
        C3G2 c3g2;
        AbstractC31173DnH.A0w(activity, new EHW(), AbstractC25225BEi.A0y(userSession));
        C37947Gmp c37947Gmp = C37947Gmp.A00;
        if (str != null) {
            int hashCode = str.hashCode();
            if (hashCode != 3615) {
                if (hashCode != 563217739) {
                    if (hashCode == 595233003 && str.equals("notification")) {
                        c3g2 = C3G2.A1x;
                    }
                } else if (str.equals("qr_code")) {
                    c3g2 = C3G2.A1z;
                }
            } else if (str.equals("qp")) {
                c3g2 = C3G2.A1y;
            }
            c37947Gmp.A04(userSession, c3g2, "superlativeReel");
        }
        c3g2 = C3G2.A1w;
        c37947Gmp.A04(userSession, c3g2, "superlativeReel");
    }
}
