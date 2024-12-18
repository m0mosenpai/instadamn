package X;

import android.content.Context;
import android.graphics.RenderEffect;
import android.graphics.Shader;
import android.os.Build;
import android.view.View;
import android.view.ViewStub;
import com.facebook.R;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.common.ui.widget.imageview.IgImageView;

/* renamed from: X.JXj, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C43770JXj implements InterfaceC11380iw {
    public static final String __redex_internal_original_name = "DirectInboxPlayPileButtonHolder";
    public Context A00;
    public View A01;
    public View A02;
    public View A03;
    public final ViewStub A04;

    public C43770JXj(ViewStub viewStub) {
        C14360o3.A0B(viewStub, 1);
        this.A04 = viewStub;
    }

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return "direct_inbox_play_pile_button_holder";
    }

    public static final void A00(ImageUrl imageUrl, ImageUrl imageUrl2, C43770JXj c43770JXj, boolean z) {
        AbstractC167007dF.A0w(c43770JXj.A01);
        View view = c43770JXj.A02;
        if (view != null) {
            IgImageView A0T = AbstractC167007dF.A0T(view, R.id.media);
            if (imageUrl != null) {
                A0T.setUrl(imageUrl, c43770JXj);
            }
            if (!z) {
                View view2 = c43770JXj.A03;
                if (view2 != null) {
                    view2.setVisibility(4);
                    return;
                }
                return;
            }
            if (imageUrl2 == null) {
                return;
            }
            View view3 = c43770JXj.A03;
            if (view3 != null) {
                IgImageView A0T2 = AbstractC167007dF.A0T(view3, R.id.secondary_media);
                A0T2.setUrl(imageUrl2, c43770JXj);
                if (Build.VERSION.SDK_INT < 31) {
                    return;
                }
                A0T2.setRenderEffect(RenderEffect.createBlurEffect(20.0f, 20.0f, Shader.TileMode.CLAMP));
                return;
            }
            throw AbstractC166987dD.A14("Required value was null.");
        }
        throw AbstractC166987dD.A14("Required value was null.");
    }
}
