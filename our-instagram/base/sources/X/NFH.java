package X;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.creation.base.ui.ConstrainedTextureView;
import com.instagram.ui.widget.framelayout.MediaFrameLayout;

/* loaded from: classes9.dex */
public final class NFH extends AbstractC66422zJ {
    public final float A00;
    public final int A01;
    public final int A02;
    public final Context A03;
    public final UserSession A04;
    public final O2W A05;

    public NFH(Context context, UserSession userSession, O2W o2w, float f, int i, int i2) {
        C14360o3.A0B(userSession, 2);
        this.A03 = context;
        this.A04 = userSession;
        this.A05 = o2w;
        this.A02 = i;
        this.A01 = i2;
        this.A00 = f;
    }

    @Override // X.AbstractC66422zJ
    public final /* bridge */ /* synthetic */ void bind(InterfaceC66482zP interfaceC66482zP, C3OO c3oo) {
        C56081Ouy c56081Ouy = (C56081Ouy) interfaceC66482zP;
        C51312MlZ c51312MlZ = (C51312MlZ) c3oo;
        boolean A1a = AbstractC167017dG.A1a(c56081Ouy, c51312MlZ);
        O2W o2w = this.A05;
        float f = this.A00;
        Context context = this.A03;
        UserSession userSession = this.A04;
        AbstractC25233BEq.A0x(2, o2w, context, userSession);
        C47Z c47z = c56081Ouy.A00;
        String str = c47z.A33;
        int i = c47z.A0H;
        int i2 = c47z.A0G;
        C55942Osa c55942Osa = new C55942Osa(c51312MlZ);
        boolean z = C1NC.A02;
        C14120nc.A00().ATO(new C52385NGg(c55942Osa, str, i, i2));
        C9KJ c9kj = new C9KJ(context, userSession, null, "feed", false, false);
        c51312MlZ.A00 = c9kj;
        C9KK c9kk = new C9KK(context, userSession, c47z.A1D, "feed", A1a, C18U.A06(C06090Tz.A05, userSession, 36318157557864416L));
        c9kj.A08(c47z, 0);
        int i3 = c47z.A0H;
        int i4 = c47z.A0G;
        c9kk.A01 = i3;
        c9kk.A00 = i4;
        c9kk.A07 = c9kj;
        ConstrainedTextureView constrainedTextureView = c51312MlZ.A02;
        constrainedTextureView.setSurfaceTextureListener(c9kk);
        constrainedTextureView.setAspectRatio(f);
        c9kk.A03 = constrainedTextureView;
        MediaFrameLayout mediaFrameLayout = c51312MlZ.A03;
        ViewOnClickListenerC55464OkJ.A01(mediaFrameLayout, 65, c51312MlZ, o2w);
        mediaFrameLayout.A00 = f;
    }

    @Override // X.AbstractC66422zJ
    public final Class modelClass() {
        return C56081Ouy.class;
    }

    @Override // X.AbstractC66422zJ
    public final /* bridge */ /* synthetic */ C3OO createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        AbstractC167017dG.A1N(viewGroup, layoutInflater);
        int i = this.A02;
        int i2 = this.A01;
        View inflate = layoutInflater.inflate(R.layout.share_video_media_preview_layout, viewGroup, false);
        C14360o3.A0C(inflate, "null cannot be cast to non-null type com.instagram.ui.widget.framelayout.MediaFrameLayout");
        MediaFrameLayout mediaFrameLayout = (MediaFrameLayout) inflate;
        MSY.A10(mediaFrameLayout, i, i2);
        Object A0Q = AbstractC37303Gc4.A0Q(mediaFrameLayout, new C51312MlZ(mediaFrameLayout));
        C14360o3.A0C(A0Q, "null cannot be cast to non-null type com.instagram.creation.fragment.sharepreview.ShareVideoMediaPreviewViewBinder.Companion.Holder");
        return (C3OO) A0Q;
    }
}
