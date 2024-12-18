package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import com.instagram.creation.base.ui.ConstrainedTextureView;
import com.instagram.ui.widget.framelayout.MediaFrameLayout;

/* renamed from: X.Kku, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public abstract class AbstractC46677Kku {
    public static C9KJ A00(Context context, UserSession userSession, L2T l2t, C47Z c47z, float f) {
        C9KJ c9kj = new C9KJ(context, userSession, l2t.A02, "feed", true, false);
        l2t.A01 = c9kj;
        c9kj.A08(c47z, 0);
        MediaFrameLayout mediaFrameLayout = l2t.A03;
        mediaFrameLayout.removeView(l2t.A00);
        C9KK c9kk = new C9KK(context, userSession, c47z.A1D, "feed", true, C18U.A06(AbstractC25225BEi.A0j(userSession, 0), userSession, 36318157557864416L));
        int i = c47z.A0H;
        int i2 = c47z.A0G;
        c9kk.A01 = i;
        c9kk.A00 = i2;
        C9KJ c9kj2 = l2t.A01;
        C14360o3.A0B(c9kj2, 0);
        c9kk.A07 = c9kj2;
        C14360o3.A0B(context, 0);
        ConstrainedTextureView constrainedTextureView = new ConstrainedTextureView(context);
        c9kk.A03 = constrainedTextureView;
        l2t.A00 = constrainedTextureView;
        constrainedTextureView.setSurfaceTextureListener(c9kk);
        l2t.A00.setAspectRatio(f);
        mediaFrameLayout.addView(l2t.A00, 0);
        mediaFrameLayout.A00 = f;
        U7F u7f = new U7F();
        C9KJ c9kj3 = l2t.A01;
        ConstrainedTextureView constrainedTextureView2 = l2t.A00;
        u7f.A00 = 50.0f;
        mediaFrameLayout.setOnTouchListener(u7f);
        u7f.A02 = new C48579LeH(c9kj3, mediaFrameLayout, constrainedTextureView2);
        return l2t.A01;
    }
}
