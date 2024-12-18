package X;

import android.os.Bundle;
import android.view.View;
import com.facebook.R;
import com.instagram.user.model.User;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/* loaded from: classes6.dex */
public final class EOE extends AbstractC43842Ja5 implements InterfaceC60122ou {
    public static final String __redex_internal_original_name = "SubscribedAndRecommendedCreatorListFragment";
    public C99694dm A00;
    public final InterfaceC09390do A01;
    public final InterfaceC09390do A02;
    public final FPN A03;

    @Override // X.InterfaceC60122ou
    public final void configureActionBar(InterfaceC56362iU interfaceC56362iU) {
        C14360o3.A0B(interfaceC56362iU, 0);
        AbstractC25229BEm.A1G(interfaceC56362iU, 2131974804);
    }

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return "subscribed_creator_list_fragment";
    }

    @Override // X.AbstractC43842Ja5, X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        C14360o3.A0B(view, 0);
        super.onViewCreated(view, bundle);
        C07S c07s = C07S.STARTED;
        C07X viewLifecycleOwner = getViewLifecycleOwner();
        AbstractC166987dD.A1Z(new MCM(view, viewLifecycleOwner, c07s, this, null, 39), C07Y.A00(viewLifecycleOwner));
        G7M.A00(getRecyclerView(), this, 6);
    }

    public static final void A01(EOE eoe, User user, Integer num) {
        String str;
        C31846DzE c31846DzE = (C31846DzE) eoe.A02.getValue();
        String id = user.getId();
        Iterable iterable = (Iterable) c31846DzE.A06.getValue();
        ArrayList A1E = AbstractC166987dD.A1E();
        for (Object obj : iterable) {
            if (obj instanceof C32087E8l) {
                A1E.add(obj);
            }
        }
        int i = 0;
        Iterator it = A1E.iterator();
        while (it.hasNext()) {
            if (C14360o3.A0K(((C32087E8l) it.next()).A02.getId(), id)) {
                if (i >= 0) {
                    C99694dm c99694dm = eoe.A00;
                    if (c99694dm == null) {
                        AbstractC31171DnF.A0s();
                        throw C00O.createAndThrow();
                    }
                    String A00 = A00(user);
                    String id2 = user.getId();
                    long j = i;
                    InterfaceC02590Ai A0f = AbstractC166987dD.A0f(c99694dm.A00, "fan_club_subscription_list_action");
                    AbstractC31171DnF.A1I(A0f, "subscriber_list");
                    A0f.AAP("origin", A00);
                    if (num.intValue() != 0) {
                        str = "tap_subscribe";
                    } else {
                        str = "tap_username";
                    }
                    AbstractC31171DnF.A1C(A0f, str);
                    AbstractC31178DnM.A17(A0f, id2);
                    AbstractC31175DnJ.A0z(A0f, j);
                    A0f.Cht();
                    return;
                }
                return;
            }
            i++;
        }
    }

    /* JADX WARN: Type inference failed for: r4v1, types: [X.2zJ, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v1, types: [X.2zJ, java.lang.Object] */
    @Override // X.AbstractC43842Ja5
    public final Collection getDefinitions() {
        InterfaceC09390do interfaceC09390do = this.A01;
        return AbstractC16960so.A1Q(new C32638EYm(this, AbstractC166987dD.A0r(interfaceC09390do), this.A03, C18U.A06(C06090Tz.A05, AbstractC31178DnM.A0M(interfaceC09390do), 36321563464902257L)), new Object(), new Object(), new C65721Tsu((C31846DzE) this.A02.getValue(), null, null, R.layout.fan_club_empty_view));
    }

    @Override // X.AbstractC43842Ja5
    public final L5L getRecyclerConfigBuilder() {
        return configBuilder(C37068GVd.A00);
    }

    @Override // X.AbstractC59962oe
    public final /* bridge */ /* synthetic */ AbstractC18680vv getSession() {
        return AbstractC166987dD.A0n(this.A01);
    }

    public EOE() {
        C37053GUj c37053GUj = new C37053GUj(this, 48);
        InterfaceC09390do A00 = AbstractC09440dt.A00(EnumC09460dv.A02, new C37053GUj(new C37053GUj(this, 45), 46));
        this.A02 = AbstractC25225BEi.A0a(new C37053GUj(A00, 47), c37053GUj, new C50171MDy(26, null, A00), AbstractC25225BEi.A1D(C31846DzE.class));
        this.A03 = new FPN(this);
        this.A01 = AbstractC60492pY.A02(this);
    }

    public static final String A00(User user) {
        Integer num;
        if (user.A26()) {
            num = C05F.A08;
        } else {
            num = C05F.A09;
        }
        java.util.Set set = FE3.A00;
        if (16 - num.intValue() != 0) {
            return "subscribed_list_in_follow_unconnected";
        }
        return "subscribed_list_in_follow_connected";
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        int A02 = C0f9.A02(1159835317);
        super.onCreate(bundle);
        this.A00 = AbstractC99684dl.A00(AbstractC166987dD.A0r(this.A01));
        C0f9.A09(163626943, A02);
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onResume() {
        int A02 = C0f9.A02(-2104821865);
        super.onResume();
        InterfaceC09390do interfaceC09390do = this.A02;
        ((C31846DzE) interfaceC09390do.getValue()).Chd();
        C31846DzE c31846DzE = (C31846DzE) interfaceC09390do.getValue();
        if (!c31846DzE.A00) {
            c31846DzE.A00 = true;
            AbstractC166987dD.A1Z(new MBp(c31846DzE, null, 6), AbstractC141776au.A00(c31846DzE));
        }
        ((C31846DzE) interfaceC09390do.getValue()).A03.A08.F8m(C0eB.A00);
        C0f9.A09(217731030, A02);
    }
}
