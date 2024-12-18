package X;

import android.app.Activity;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.view.View;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.modal.ModalActivity;
import com.instagram.modal.TransparentModalActivity;

/* loaded from: classes6.dex */
public abstract class FAK {
    public static final void A00(Activity activity, Bundle bundle, UserSession userSession, String str, boolean z) {
        C6XJ A0L;
        C14360o3.A0B(userSession, 0);
        boolean A1a = AbstractC31175DnJ.A1a(str);
        if (activity != null) {
            InterfaceC200458to interfaceC200458to = ((C70803WhJ) userSession.A01(C70803WhJ.class, C57397Pdv.A00)).A00;
            if (interfaceC200458to.BFG(str) == null) {
                View rootView = activity.getWindow().getDecorView().getRootView();
                C14360o3.A07(rootView);
                rootView.setDrawingCacheEnabled(A1a);
                Bitmap drawingCache = rootView.getDrawingCache();
                C0fK.A03(drawingCache);
                Bitmap createBitmap = Bitmap.createBitmap(drawingCache);
                C14360o3.A07(createBitmap);
                rootView.setDrawingCacheEnabled(false);
                ((C200448tn) interfaceC200458to).A00.put(str, createBitmap);
            }
        }
        if (z && C2U7.A00 && !AbstractC31171DnF.A1V(userSession, str)) {
            A0L = AbstractC31171DnF.A0L(activity, bundle, userSession, TransparentModalActivity.class, "profile_card");
            A0L.A0J = C6XJ.A0Q;
            A0L.A0H = A1a;
            A0L.A0J = new int[]{R.anim.modal_zoom_enter, 0, 0, R.anim.modal_zoom_exit};
        } else {
            A0L = AbstractC31171DnF.A0L(activity, bundle, userSession, ModalActivity.class, "profile_card");
            A0L.A0J = C6XJ.A0Q;
            A0L.A0H = A1a;
        }
        A0L.A0C(activity);
    }
}
