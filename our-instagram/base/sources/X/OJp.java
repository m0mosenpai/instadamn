package X;

import android.view.View;
import android.widget.EditText;
import androidx.fragment.app.Fragment;
import com.facebook.R;
import com.instagram.common.session.UserSession;

/* loaded from: classes9.dex */
public final class OJp {
    public AnonymousClass195 A00;
    public final View A01;
    public final EditText A02;
    public final AbstractC59962oe A03;
    public final UserSession A04;
    public final C190588cG A05;
    public final EnumC142806cg A06;
    public final InterfaceC09390do A07;
    public final InterfaceC09390do A08;
    public final InterfaceC169517hR A09;

    public OJp(View view, AbstractC59962oe abstractC59962oe, UserSession userSession, EnumC142806cg enumC142806cg) {
        C14360o3.A0B(userSession, 2);
        this.A03 = abstractC59962oe;
        this.A04 = userSession;
        this.A01 = view;
        this.A06 = enumC142806cg;
        C57555PgT c57555PgT = new C57555PgT(this, 6);
        InterfaceC09390do A01 = C57555PgT.A01(new C57555PgT(abstractC59962oe, 3), EnumC09460dv.A02, 4);
        this.A08 = AbstractC25225BEi.A0a(new C57555PgT(A01, 5), c57555PgT, C57530Pg4.A00(null, A01, 17), AbstractC25225BEi.A1D(C50939Mf8.class));
        C169127gl A00 = AbstractC169097gi.A00(null, userSession, new C61972ry(abstractC59962oe.requireContext(), AbstractC018607g.A00(abstractC59962oe), null), new C36695GFq(this, 7), "coefficient_besties_list_ranking", AbstractC166987dD.A1J(AbstractC166997dE.A0Y(userSession)), true);
        A00.EYJ(new C36681GFb(this, 8));
        this.A09 = A00;
        C190588cG c190588cG = new C190588cG(abstractC59962oe, userSession, new C70858WiO(this, 1), A00);
        c190588cG.setHasStableIds(true);
        this.A05 = c190588cG;
        this.A07 = C57555PgT.A00(this, 2);
        View requireViewById = view.requireViewById(R.id.comment_composer_edit_text);
        EditText editText = (EditText) requireViewById;
        editText.addTextChangedListener(new NG3(this, 3));
        C14360o3.A07(requireViewById);
        this.A02 = editText;
        if (enumC142806cg != EnumC142806cg.A05) {
            A00(abstractC59962oe);
        }
    }

    public final void A00(Fragment fragment) {
        InterfaceC09390do interfaceC09390do = this.A08;
        AbstractC37301Gc2.A0w(fragment.getViewLifecycleOwner(), ((C50939Mf8) interfaceC09390do.getValue()).A00, C57755Pji.A02(this, 22), 30);
        this.A00 = AbstractC50522MSa.A0s(fragment, new PZN(fragment, this, null, 13), ((C50939Mf8) interfaceC09390do.getValue()).A06);
    }
}
