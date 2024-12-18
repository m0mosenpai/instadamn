package X;

import android.content.Context;
import android.content.Intent;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import com.instagram.creation.fragment.EditMediaInfoFragment;
import com.instagram.tagging.activity.TaggingActivity;
import java.util.List;

/* renamed from: X.PGe, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C56736PGe implements InterfaceC57994Pne {
    public final int A00;
    public final Object A01;

    public C56736PGe(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    @Override // X.InterfaceC57994Pne
    public final void Enl() {
        C55104ObH c55104ObH;
        String str;
        switch (this.A00) {
            case 0:
                ((C23127AMf) this.A01).A06.A1C();
                return;
            case 1:
                EditMediaInfoFragment editMediaInfoFragment = (EditMediaInfoFragment) this.A01;
                Context context = editMediaInfoFragment.getContext();
                context.getClass();
                editMediaInfoFragment.A0I.getClass();
                if (EditMediaInfoFragment.A0P(editMediaInfoFragment)) {
                    editMediaInfoFragment.A0J.getClass();
                    c55104ObH = new C55104ObH(context, EnumC53319Nhv.A08);
                    C38321qM c38321qM = editMediaInfoFragment.A0I;
                    List list = editMediaInfoFragment.A1B;
                    str = null;
                    c55104ObH.A06(c38321qM, (C38321qM) list.get(editMediaInfoFragment.A0J.A03), null, editMediaInfoFragment.A0W, list, editMediaInfoFragment.A0g, null, null, editMediaInfoFragment.A0d, editMediaInfoFragment.A0e, editMediaInfoFragment.A0c);
                } else {
                    c55104ObH = new C55104ObH(context, EnumC53319Nhv.A08);
                    str = null;
                    c55104ObH.A07(editMediaInfoFragment.A0I, null, editMediaInfoFragment.A0a, editMediaInfoFragment.A0W, editMediaInfoFragment.A0b, editMediaInfoFragment.A0Z, editMediaInfoFragment.A0g, null, null);
                }
                c55104ObH.A00 = editMediaInfoFragment.A0P;
                c55104ObH.A03(editMediaInfoFragment.getSession());
                c55104ObH.A0B = true;
                c55104ObH.A0J = EditMediaInfoFragment.A0R(editMediaInfoFragment);
                c55104ObH.A04 = editMediaInfoFragment.A0I.A0C.App();
                Intent A02 = c55104ObH.A02();
                C55782hJ A00 = C55772hI.A00(editMediaInfoFragment.getSession());
                FragmentActivity activity = editMediaInfoFragment.getActivity();
                activity.getClass();
                A00.A09(activity, str);
                C12260kU.A06(editMediaInfoFragment, A02, 1001);
                return;
            case 2:
                OJZ ojz = ((C55099ObA) this.A01).A0C;
                if (AbstractC25231BEo.A1b(ojz.A04)) {
                    C193328hC A0I = AbstractC31171DnF.A0I(ojz.A00);
                    A0I.A0A(2131970056);
                    A0I.A09(2131953921);
                    AbstractC31176DnK.A1W(A0I);
                    return;
                }
                ojz.A05.invoke();
                C6WI.A01().A0U = true;
                UserSession userSession = ojz.A01;
                MX1.A00(userSession).A04("TAG_PRODUCTS_TAPPED");
                ojz.A03.A0C(EnumC39584Hdu.A06, "media_broadcast_share", AbstractC55229Oez.A0I(userSession, ojz.A02, false));
                AnonymousClass229.A01(userSession).A1Y(C81X.A2f);
                return;
            case 3:
                return;
            default:
                TaggingActivity.A0L((TaggingActivity) this.A01, EnumC53319Nhv.A08, true);
                return;
        }
    }
}
