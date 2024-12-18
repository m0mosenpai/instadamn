package X;

import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.text.method.LinkMovementMethod;
import android.text.method.MovementMethod;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.R;
import com.instagram.igds.components.textcell.IgdsListCell;

/* renamed from: X.N4w, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C52123N4w extends AbstractC59962oe {
    public static final String __redex_internal_original_name = "LimitsPlusWhoToLimitBottomsheetFragment";
    public boolean A00;
    public boolean A01;
    public boolean A02;
    public final InterfaceC09390do A03;
    public final InterfaceC09390do A04;

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return "limitsplus_who_fragment";
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        C124545kG c124545kG;
        C14360o3.A0B(view, 0);
        super.onViewCreated(view, bundle);
        A00(view, this);
        C50898MeT c50898MeT = (C50898MeT) this.A04.getValue();
        InterfaceC124555kH interfaceC124555kH = (InterfaceC124555kH) AbstractC50523MSb.A0C(c50898MeT.A00.A01).A02;
        if (interfaceC124555kH != null) {
            C05A c05a = c50898MeT.A01;
            do {
                c124545kG = (C124545kG) interfaceC124555kH;
            } while (!C50634MWv.A00(c05a.getValue(), c05a, c124545kG.A01, c124545kG.A00, c124545kG.A02));
        }
        C07S c07s = C07S.STARTED;
        C07X viewLifecycleOwner = getViewLifecycleOwner();
        AbstractC166987dD.A1Z(new C57169PZn(view, viewLifecycleOwner, c07s, this, null, 46), C07Y.A00(viewLifecycleOwner));
    }

    @Override // X.AbstractC59962oe
    public final /* bridge */ /* synthetic */ AbstractC18680vv getSession() {
        return AbstractC166987dD.A0n(this.A03);
    }

    public C52123N4w() {
        C57511Pfl c57511Pfl = new C57511Pfl(this, 22);
        InterfaceC09390do A00 = AbstractC09440dt.A00(EnumC09460dv.A02, new C57511Pfl(new C57511Pfl(this, 19), 20));
        this.A04 = AbstractC25225BEi.A0a(new C57511Pfl(A00, 21), c57511Pfl, new C29895DGj(3, null, A00), AbstractC25225BEi.A1D(C50898MeT.class));
        this.A03 = AbstractC60492pY.A02(this);
    }

    public static final void A00(View view, C52123N4w c52123N4w) {
        String A0v;
        int i;
        IgdsListCell igdsListCell = (IgdsListCell) AbstractC166987dD.A0c(view, R.id.limits_plus_close_friends_row);
        EnumC53237Nga enumC53237Nga = EnumC53237Nga.A08;
        igdsListCell.setTextCellType(enumC53237Nga);
        igdsListCell.setChecked(c52123N4w.A00);
        AbstractC31180DnO.A1D(c52123N4w, igdsListCell, 2131965160);
        C08730cb c08730cb = C17060sy.A01;
        InterfaceC09390do interfaceC09390do = c52123N4w.A03;
        if (!AbstractC31176DnK.A0g(c08730cb, interfaceC09390do).A1j()) {
            A0v = AbstractC25227BEk.A0v(c52123N4w, 2131965168);
            i = 2131965169;
        } else {
            A0v = AbstractC25227BEk.A0v(c52123N4w, 2131965159);
            i = 2131965158;
        }
        String string = c52123N4w.getString(i);
        NY0 ny0 = new NY0(c52123N4w, AbstractC25233BEq.A04(c52123N4w));
        SpannableStringBuilder A0H = AbstractC25225BEi.A0H(AnonymousClass001.A0B(string));
        AnonymousClass773.A04(A0H, ny0, A0v);
        igdsListCell.A0H(A0H);
        C55519OlD.A02(igdsListCell, c52123N4w, 26);
        MovementMethod linkMovementMethod = LinkMovementMethod.getInstance();
        C14360o3.A07(linkMovementMethod);
        igdsListCell.A0B(linkMovementMethod);
        IgdsListCell igdsListCell2 = (IgdsListCell) AbstractC166987dD.A0c(view, R.id.limits_plus_recent_followers_row);
        igdsListCell2.setTextCellType(enumC53237Nga);
        igdsListCell2.setChecked(c52123N4w.A01);
        AbstractC31180DnO.A1D(c52123N4w, igdsListCell2, 2131965219);
        int i2 = 2131965216;
        if (AbstractC166997dE.A0c(C06090Tz.A05, AbstractC166987dD.A0o(interfaceC09390do), 36326219209258745L).booleanValue()) {
            i2 = 2131965217;
        }
        igdsListCell2.A0H(AbstractC25227BEk.A0v(c52123N4w, i2));
        C55519OlD.A02(igdsListCell2, c52123N4w, 27);
        IgdsListCell igdsListCell3 = (IgdsListCell) AbstractC166987dD.A0c(view, R.id.limits_plus_non_followers_row);
        igdsListCell3.setTextCellType(enumC53237Nga);
        igdsListCell3.setChecked(c52123N4w.A02);
        AbstractC31180DnO.A1D(c52123N4w, igdsListCell3, 2131965215);
        C55519OlD.A02(igdsListCell3, c52123N4w, 28);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        int A02 = C0f9.A02(1843993596);
        super.onCreate(bundle);
        C0f9.A09(-423675807, A02);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(522721886);
        C14360o3.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.limits_plus_who_to_limit_fragment_layout, viewGroup, false);
        C0f9.A09(-453106958, A02);
        return inflate;
    }
}
