package X;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.SimpleImageUrl;
import com.instagram.common.ui.widget.imageview.ConstrainedImageView;
import java.util.List;

/* loaded from: classes8.dex */
public final class KIB extends AbstractC66412zI {
    public final InterfaceC11380iw A00;
    public final UserSession A01;
    public final C47339Kvo A02;
    public final String A03;

    @Override // X.AbstractC66422zJ
    public final /* bridge */ /* synthetic */ C3OO createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        AbstractC167007dF.A1K(viewGroup, layoutInflater);
        return new C44615JpL(AbstractC25227BEk.A0D(layoutInflater, viewGroup, R.layout.direct_cutout_sticker_tray_item, false));
    }

    @Override // X.AbstractC66422zJ
    public final /* bridge */ /* synthetic */ void bind(InterfaceC66482zP interfaceC66482zP, C3OO c3oo) {
        C45194Jza c45194Jza = (C45194Jza) interfaceC66482zP;
        C44615JpL c44615JpL = (C44615JpL) c3oo;
        boolean A1R = AbstractC167007dF.A1R(0, c45194Jza, c44615JpL);
        ConstrainedImageView constrainedImageView = c44615JpL.A00;
        Context context = constrainedImageView.getContext();
        C148286ly c148286ly = c45194Jza.A01;
        Integer A04 = c148286ly.A04();
        Integer num = C05F.A01;
        if (A04 == num) {
            C14360o3.A0A(context);
            constrainedImageView.setImageDrawable(new C8OT(context, context.getTheme(), this.A01, c148286ly, null));
        } else {
            constrainedImageView.setUrl(new SimpleImageUrl(c148286ly.A0H), this.A00);
        }
        AbstractC56952jT.A04(constrainedImageView, num);
        C3P9 A0s = AbstractC166987dD.A0s(constrainedImageView);
        A0s.A04 = new KKo(5, c45194Jza, this);
        UserSession userSession = this.A01;
        AbstractC47848LBr.A01(userSession, A0s);
        if (!c45194Jza.A00) {
            c45194Jza.A00 = A1R;
            List A1J = AbstractC166987dD.A1J(c148286ly.A0S);
            InterfaceC11380iw interfaceC11380iw = this.A00;
            String str = this.A03;
            AbstractC167007dF.A1D(userSession, 0, interfaceC11380iw);
            InterfaceC02590Ai A0f = AbstractC166987dD.A0f(AbstractC12220kQ.A01(interfaceC11380iw, userSession), "ig_direct_sticker_impression");
            if (A0f.isSampled()) {
                A0f.A8R(EnumC46295KeR.CUSTOM, "sticker_type");
                A0f.AAk("sticker_ids", A1J);
                A0f.AAP("bottom_sheet_session_id", str);
                A0f.Cht();
            }
        }
    }

    @Override // X.AbstractC66422zJ
    public final Class modelClass() {
        return C45194Jza.class;
    }

    public KIB(InterfaceC11380iw interfaceC11380iw, UserSession userSession, C47339Kvo c47339Kvo, String str) {
        this.A01 = userSession;
        this.A00 = interfaceC11380iw;
        this.A02 = c47339Kvo;
        this.A03 = str;
    }
}
