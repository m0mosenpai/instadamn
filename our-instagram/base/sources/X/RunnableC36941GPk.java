package X;

import android.graphics.Bitmap;
import android.view.ViewGroup;
import android.widget.TextView;
import com.facebook.R;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.common.ui.widget.imageview.CircularImageView;
import com.instagram.user.model.User;

/* renamed from: X.GPk, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class RunnableC36941GPk implements Runnable {
    public final /* synthetic */ FO2 A00;
    public final /* synthetic */ C34968Fas A01;
    public final /* synthetic */ User A02;

    public RunnableC36941GPk(FO2 fo2, C34968Fas c34968Fas, User user) {
        this.A01 = c34968Fas;
        this.A00 = fo2;
        this.A02 = user;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C34968Fas c34968Fas = this.A01;
        ViewGroup viewGroup = c34968Fas.A05;
        if (viewGroup != null) {
            CircularImageView A0U = AbstractC31176DnK.A0U(viewGroup, R.id.avatar_picture);
            ViewGroup viewGroup2 = c34968Fas.A05;
            if (viewGroup2 != null) {
                TextView A0N = AbstractC167007dF.A0N(viewGroup2, R.id.user_id);
                ViewGroup viewGroup3 = c34968Fas.A05;
                if (viewGroup3 != null) {
                    TextView A0N2 = AbstractC167007dF.A0N(viewGroup3, R.id.user_name);
                    FO2 fo2 = this.A00;
                    A0U.setImageBitmap(fo2.A00);
                    A0U.setStrokeAlpha(A0U.A00);
                    Bitmap bitmap = fo2.A00;
                    User user = this.A02;
                    ImageUrl Bhu = user.Bhu();
                    InterfaceC11380iw interfaceC11380iw = c34968Fas.A08;
                    A0U.setImageDrawable(c34968Fas.A00);
                    if (bitmap != null) {
                        A0U.setImageBitmap(bitmap);
                    } else {
                        A0U.setUrl(Bhu, interfaceC11380iw);
                    }
                    AbstractC31173DnH.A1F(A0N, user);
                    A0N2.setText(user.getFullName());
                    return;
                }
            }
        }
        C14360o3.A0F("sceneRoot");
        throw C00O.createAndThrow();
    }
}
