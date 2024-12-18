package X;

import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.widget.ImageView;
import androidx.fragment.app.Fragment;
import com.facebook.R;
import com.instagram.common.session.UserSession;

/* loaded from: classes8.dex */
public abstract class LBO {
    public static final void A00(Activity activity, Context context, Fragment fragment, InterfaceC193488hT interfaceC193488hT, UserSession userSession) {
        C14360o3.A0B(userSession, 0);
        C14360o3.A0B(interfaceC193488hT, 4);
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(R.dimen.audio_translations_language_list_cell_row_height);
        C189088Yy c189088Yy = new C189088Yy(activity, AbstractC018607g.A00(fragment), null, EnumC188968Ym.A02, userSession, new C45683KJu(0, new C8SF(context, userSession, C05F.A00, dimensionPixelSize, dimensionPixelSize, false), interfaceC193488hT), Integer.MAX_VALUE, 0, -1L, -1L, true, false, false);
        c189088Yy.A01 = 1;
        c189088Yy.A01(null);
    }

    public static final void A01(Context context, Bitmap bitmap, ImageView imageView) {
        AbstractC167017dG.A1P(imageView, bitmap);
        imageView.setImageDrawable(new C193568hb(context, bitmap, AbstractC167017dG.A07(context), AbstractC167017dG.A06(context), AbstractC166987dD.A0C(context, 34), 0, false));
    }
}
