package X;

import android.graphics.Bitmap;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.facebook.R;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.common.ui.widget.imageview.CircularImageView;
import com.instagram.common.ui.widget.imageview.IgImageView;
import com.instagram.user.model.User;

/* renamed from: X.GPl, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class RunnableC36942GPl implements Runnable {
    public final /* synthetic */ FO2 A00;
    public final /* synthetic */ C34968Fas A01;
    public final /* synthetic */ User A02;

    public RunnableC36942GPl(FO2 fo2, C34968Fas c34968Fas, User user) {
        this.A01 = c34968Fas;
        this.A00 = fo2;
        this.A02 = user;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C34968Fas c34968Fas = this.A01;
        ViewGroup viewGroup = c34968Fas.A05;
        if (viewGroup != null) {
            View findViewById = viewGroup.findViewById(R.id.avatar_picture);
            if (findViewById != null) {
                IgImageView igImageView = (IgImageView) findViewById;
                ViewGroup viewGroup2 = c34968Fas.A05;
                if (viewGroup2 != null) {
                    CircularImageView A0U = AbstractC31176DnK.A0U(viewGroup2, R.id.small_avatar_picture);
                    ViewGroup viewGroup3 = c34968Fas.A05;
                    if (viewGroup3 != null) {
                        TextView A0N = AbstractC167007dF.A0N(viewGroup3, R.id.user_preview_id);
                        A0U.setStrokeAlpha(A0U.A00);
                        FO2 fo2 = this.A00;
                        Bitmap bitmap = fo2.A00;
                        User user = this.A02;
                        ImageUrl Bhu = user.Bhu();
                        InterfaceC11380iw interfaceC11380iw = c34968Fas.A08;
                        igImageView.setImageDrawable(c34968Fas.A00);
                        if (bitmap != null) {
                            igImageView.setImageBitmap(bitmap);
                        } else {
                            igImageView.setUrl(Bhu, interfaceC11380iw);
                        }
                        Bitmap bitmap2 = fo2.A00;
                        ImageUrl Bhu2 = user.Bhu();
                        A0U.setImageDrawable(c34968Fas.A00);
                        if (bitmap2 != null) {
                            A0U.setImageBitmap(bitmap2);
                        } else {
                            A0U.setUrl(Bhu2, interfaceC11380iw);
                        }
                        AbstractC31173DnH.A1F(A0N, user);
                        return;
                    }
                }
            } else {
                throw AbstractC166997dE.A0g();
            }
        }
        C14360o3.A0F("sceneRoot");
        throw C00O.createAndThrow();
    }
}
