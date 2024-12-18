package X;

import android.content.Context;
import android.view.View;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.widget.imageview.IgImageView;
import java.util.ArrayList;

/* loaded from: classes9.dex */
public final class OUY {
    public final int A00;
    public final View A01;
    public final ArrayList A02;
    public final InterfaceC09390do A03;
    public final InterfaceC09390do A04;
    public final InterfaceC09390do A05;
    public final InterfaceC09390do A06;
    public final InterfaceC09390do A07;
    public final InterfaceC09390do A08;
    public final int[] A09;
    public final int[] A0A;
    public final Context A0B;
    public final InterfaceC09390do A0C;

    public OUY(View view, AbstractC59962oe abstractC59962oe, UserSession userSession) {
        C14360o3.A0B(userSession, 2);
        this.A01 = view;
        C57530Pg4 A00 = C57530Pg4.A00(abstractC59962oe, userSession, 0);
        InterfaceC09390do A01 = C57542PgG.A01(new C57542PgG(abstractC59962oe, 9), EnumC09460dv.A02, 10);
        this.A08 = AbstractC25225BEi.A0a(new C57542PgG(A01, 11), A00, C57532Pg6.A00(null, A01, 49), AbstractC25225BEi.A1D(C50938Mf7.class));
        Context context = view.getContext();
        this.A0B = context;
        this.A00 = AbstractC167017dG.A0A(context);
        this.A07 = C57542PgG.A00(this, 14);
        this.A05 = C57542PgG.A00(this, 12);
        this.A03 = C57542PgG.A00(this, 6);
        this.A04 = C57542PgG.A00(this, 8);
        this.A0C = C57542PgG.A00(this, 7);
        this.A06 = C57542PgG.A00(this, 13);
        Integer num = C05F.A00;
        ArrayList A1M = AbstractC16960so.A1M(new O99(R.id.live_invite_button, num), new O99(R.id.iglive_header_avatar_text_container, C05F.A0N), new O99(R.id.iglive_face_filter_button, C05F.A0C), new O99(R.id.qa_mode_button, num));
        this.A02 = A1M;
        this.A0A = new int[]{MSX.A02(context), AbstractC167007dF.A09(context, R.attr.igds_color_secondary_button_on_media), AbstractC167007dF.A09(context, R.attr.igds_color_secondary_button_on_media), AbstractC167007dF.A09(context, R.attr.igds_color_secondary_button_on_media), AbstractC167007dF.A09(context, R.attr.igds_color_secondary_button_on_media), AbstractC167007dF.A09(context, R.attr.igds_color_secondary_button_on_media), AbstractC167007dF.A09(context, R.attr.igds_color_secondary_button_on_media)};
        this.A09 = new int[]{MSX.A02(context), AbstractC167007dF.A09(context, R.attr.igds_color_secondary_button_on_media), AbstractC167007dF.A09(context, R.attr.igds_color_secondary_button_on_media), AbstractC167007dF.A09(context, R.attr.igds_color_secondary_button_on_media), AbstractC167007dF.A09(context, R.attr.igds_color_secondary_button_on_media)};
        ((C50938Mf7) this.A08.getValue()).A00 = A1M.size();
        Ok4.A00(AbstractC167007dF.A0L(this.A03), 37, this);
        AbstractC37301Gc2.A0w(abstractC59962oe.getViewLifecycleOwner(), ((C50938Mf7) this.A08.getValue()).A01, C57755Pji.A02(this, 11), 26);
    }

    public static final IgImageView A00(OUY ouy) {
        return (IgImageView) AbstractC166987dD.A17(ouy.A0C);
    }
}
