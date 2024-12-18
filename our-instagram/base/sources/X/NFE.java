package X;

import android.content.res.Resources;
import android.graphics.RectF;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.model.mediasize.ExtendedImageUrl;
import java.util.List;

/* loaded from: classes9.dex */
public final class NFE extends AbstractC66422zJ {
    public final InterfaceC11380iw A00;
    public final UserSession A01;
    public final C52177N7m A02;

    public NFE(InterfaceC11380iw interfaceC11380iw, UserSession userSession, C52177N7m c52177N7m) {
        C14360o3.A0B(userSession, 1);
        this.A01 = userSession;
        this.A00 = interfaceC11380iw;
        this.A02 = c52177N7m;
    }

    @Override // X.AbstractC66422zJ
    public final /* bridge */ /* synthetic */ C3OO createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        C14360o3.A0B(viewGroup, 0);
        int i = C3OO.FLAG_ADAPTER_FULLUPDATE;
        return new C51308MlV(AbstractC25226BEj.A0R(AbstractC25228BEl.A0P(viewGroup), viewGroup, R.layout.published_trial_item, false), this.A00, this.A01);
    }

    @Override // X.AbstractC66422zJ
    public final /* bridge */ /* synthetic */ void bind(InterfaceC66482zP interfaceC66482zP, C3OO c3oo) {
        ExtendedImageUrl A1o;
        List AmB;
        C51812MvG c51812MvG = (C51812MvG) interfaceC66482zP;
        C51308MlV c51308MlV = (C51308MlV) c3oo;
        boolean A1R = AbstractC167007dF.A1R(0, c51812MvG, c51308MlV);
        C52177N7m c52177N7m = this.A02;
        C14360o3.A0B(c52177N7m, A1R ? 1 : 0);
        View view = c51308MlV.A00;
        Resources resources = view.getResources();
        DisplayMetrics displayMetrics = resources.getDisplayMetrics();
        RectF rectF = AbstractC13880nE.A01;
        int applyDimension = (int) TypedValue.applyDimension(A1R ? 1 : 0, 76.0f, displayMetrics);
        C38321qM c38321qM = c51812MvG.A00;
        C38321qM c38321qM2 = c38321qM;
        if ((c38321qM.A0q() <= 0 || ((AmB = c38321qM.A0C.AmB()) != null && (c38321qM2 = (C38321qM) AbstractC001800i.A0O(AmB, 0)) != null)) && (A1o = c38321qM2.A1o(applyDimension)) != null) {
            AbstractC31172DnG.A0a(view, R.id.trial_thumbnail_image).setUrl(c51308MlV.A02, A1o, c51308MlV.A01);
        }
        ImageView A08 = AbstractC31171DnF.A08(view, R.id.play_count_logo);
        boolean A4a = c38321qM.A4a();
        int i = R.drawable.instagram_play_pano_prism_outline_24;
        if (A4a) {
            i = R.drawable.instagram_eye_pano_outline_24;
        }
        A08.setImageResource(i);
        AbstractC166987dD.A0e(view, R.id.preview_clip_play_count).setText(C84963qk.A04(resources, c38321qM.A0C.Bdm(), 1000, false, false));
        ViewOnClickListenerC55468OkN.A00(view, 16, c52177N7m, c51812MvG);
    }

    @Override // X.AbstractC66422zJ
    public final Class modelClass() {
        return C51812MvG.class;
    }
}
