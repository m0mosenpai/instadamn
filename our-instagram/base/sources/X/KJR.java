package X;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.widget.imageview.IgImageView;

/* loaded from: classes8.dex */
public final class KJR extends AbstractC66422zJ {
    public final C006802i A00;
    public final UserSession A01;

    @Override // X.AbstractC66422zJ
    public final /* bridge */ /* synthetic */ C3OO createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        AbstractC31175DnJ.A1R(viewGroup, layoutInflater);
        View inflate = layoutInflater.inflate(R.layout.ai_sticker_grid_item, viewGroup, false);
        if (inflate != null) {
            return new C44606JpC((IgImageView) inflate);
        }
        throw AbstractC166987dD.A15(AbstractC111324zv.A00(21));
    }

    @Override // X.AbstractC66422zJ
    public final /* bridge */ /* synthetic */ void bind(InterfaceC66482zP interfaceC66482zP, C3OO c3oo) {
        C45207Jzn c45207Jzn = (C45207Jzn) interfaceC66482zP;
        C44606JpC c44606JpC = (C44606JpC) c3oo;
        boolean A1a = AbstractC167017dG.A1a(c45207Jzn, c44606JpC);
        IgImageView igImageView = c44606JpC.A00;
        UserSession userSession = this.A01;
        Context context = igImageView.getContext();
        C148286ly c148286ly = c45207Jzn.A02;
        C202588xc c202588xc = new C202588xc(context, null, userSession, c148286ly, EnumC150226pU.A04, null, AbstractC111324zv.A00(1907));
        c202588xc.A04();
        igImageView.setImageDrawable(c202588xc);
        this.A00.markerEnd(31792419, (short) 2);
        KKo.A00(AbstractC166987dD.A0s(igImageView), c45207Jzn, this, A1a ? 1 : 0);
        C22C A01 = AnonymousClass229.A01(userSession);
        String str = c148286ly.A0S;
        Long A0V = AbstractC31171DnF.A0V(c45207Jzn.A00);
        String str2 = c45207Jzn.A03;
        InterfaceC02590Ai A0f = AbstractC166987dD.A0f(((C22F) A01).A01, "ig_camera_sticker_impression");
        C22M c22m = ((C22F) A01).A04;
        String str3 = c22m.A0L;
        if (A0f.isSampled() && str3 != null) {
            A0f.A8R(EnumC114925Hg.STORY, "camera_destination");
            AbstractC166987dD.A1S(A0f, str3);
            AbstractC167017dG.A1B(A0f);
            A0f.AAP("sticker_id", str);
            AbstractC166997dE.A1N(A0f, "sticker_source", 8);
            AbstractC166997dE.A1N(A0f, "entity_type", A1a ? 1 : 0);
            A0f.A8R(c22m.A0C, "surface");
            A0f.AAP("sticker_tray_session_id", c22m.A0U);
            A0f.AAP("browse_session_id", str2);
            AbstractC43594JPz.A1B(A0f, c22m);
            AbstractC37302Gc3.A0t(A0f);
            A0f.A9K("position", A0V);
            A0f.A8R(VHl.A02, "sticker_type");
            A0f.Cht();
        }
    }

    @Override // X.AbstractC66422zJ
    public final Class modelClass() {
        return C45207Jzn.class;
    }

    public KJR(C006802i c006802i, UserSession userSession) {
        this.A01 = userSession;
        this.A00 = c006802i;
    }
}
