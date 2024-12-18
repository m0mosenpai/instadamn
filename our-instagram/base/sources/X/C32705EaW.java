package X;

import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.Html;
import android.view.View;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.direct.capabilities.Capabilities;
import com.instagram.direct.fragment.permanentmedia.DirectAggregatedMediaViewerController;
import com.instagram.modal.ModalActivity;
import com.instagram.model.direct.messageid.MessageIdentifier;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* renamed from: X.EaW, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C32705EaW extends AbstractC32707EaY implements InterfaceC60072op {
    public static final String __redex_internal_original_name = "DirectStackCardGalleryFragment";
    public C34700FQl A00;
    public MessageIdentifier A01;
    public C6WQ A02;
    public String A03;
    public String A04;
    public String A06;
    public boolean A09;
    public ArrayList A05 = AbstractC166987dD.A1E();
    public List A08 = AbstractC166987dD.A1E();
    public List A07 = AbstractC166987dD.A1E();
    public final InterfaceC41501vz A0A = C31650DvG.A00(this, 17);

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return "direct_individual_stack_card_gallery_fragment";
    }

    /* JADX WARN: Type inference failed for: r4v0, types: [X.0oO, java.lang.Object] */
    @Override // X.AbstractC32707EaY, X.EOJ, X.AbstractC43842Ja5, X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        List list;
        boolean z;
        List list2;
        String str;
        String str2;
        String str3;
        String string;
        ArrayList parcelableArrayList;
        ArrayList parcelableArrayList2;
        C14360o3.A0B(view, 0);
        super.onViewCreated(view, bundle);
        Bundle bundle2 = this.mArguments;
        if (bundle2 != null && (parcelableArrayList2 = bundle2.getParcelableArrayList("card_gallery_recipients")) != null) {
            list = AbstractC001800i.A0a(parcelableArrayList2);
        } else {
            list = C16930sl.A00;
        }
        this.A08 = list;
        Bundle bundle3 = this.mArguments;
        if (bundle3 != null) {
            z = bundle3.getBoolean("removed_clips_collaborators_from_chat");
        } else {
            z = false;
        }
        this.A09 = z;
        Bundle bundle4 = this.mArguments;
        if (bundle4 != null && (parcelableArrayList = bundle4.getParcelableArrayList(AbstractC111324zv.A00(1913))) != null) {
            list2 = AbstractC001800i.A0a(parcelableArrayList);
        } else {
            list2 = C16930sl.A00;
        }
        this.A07 = list2;
        Bundle bundle5 = this.mArguments;
        String str4 = null;
        if (bundle5 != null) {
            str = bundle5.getString(AbstractC111324zv.A00(3122));
        } else {
            str = null;
        }
        this.A06 = str;
        Bundle bundle6 = this.mArguments;
        if (bundle6 != null) {
            str2 = bundle6.getString("surface");
        } else {
            str2 = null;
        }
        this.A04 = str2;
        Bundle bundle7 = this.mArguments;
        if (bundle7 != null) {
            str3 = bundle7.getString("card_gallery_sender_id");
        } else {
            str3 = null;
        }
        this.A03 = str3;
        ?? obj = new Object();
        obj.A00 = true;
        Bundle bundle8 = this.mArguments;
        if (bundle8 != null) {
            str4 = AbstractC31171DnF.A0b(bundle8);
        }
        if (str4 != null) {
            Bundle bundle9 = this.mArguments;
            if (bundle9 != null && (string = bundle9.getString("client_context")) != null) {
                this.A01 = new MessageIdentifier(str4, string);
                AbstractC25651Mw.A00(AbstractC166987dD.A0r(this.A0S)).A01(this.A0A, C160937Jc.class);
                AbstractC31174DnI.A1E(this, A0E().A03, new C50372MLz(36, obj, this, view, bundle), 14);
                return;
            }
            throw AbstractC166987dD.A14("Required value was null.");
        }
        throw AbstractC166987dD.A14("Required value was null.");
    }

    public static final void A01(Bundle bundle, C32705EaW c32705EaW) {
        InterfaceC09390do interfaceC09390do = c32705EaW.A0S;
        UserSession A0r = AbstractC166987dD.A0r(interfaceC09390do);
        C14360o3.A0C(c32705EaW.A0G(), "null cannot be cast to non-null type com.instagram.model.direct.threadkey.intf.UnifiedThreadKey");
        C7IR c7ir = new C7IR(A0r, new C7IP(bundle, "shared_stacks", "DirectMediaCardUtils", null), null, AbstractC165967bO.A00(AbstractC166987dD.A0r(interfaceC09390do)), C37051GUh.A00(c32705EaW, 36), C37051GUh.A00(c32705EaW, 37), new C31575Du3(c32705EaW, 5), C37020GTc.A00, C37021GTd.A00);
        KCY A01 = KCY.A0t.A01(AbstractC166987dD.A0r(interfaceC09390do), JRE.A00(c32705EaW.A0G()), c32705EaW.A0G());
        C48685LgF c48685LgF = new C48685LgF(0, c32705EaW, C7FB.A00(c32705EaW.requireContext(), AbstractC166987dD.A0r(interfaceC09390do), new G3U(c32705EaW, c7ir)));
        DirectAggregatedMediaViewerController directAggregatedMediaViewerController = ((AbstractC32707EaY) c32705EaW).A00;
        if (directAggregatedMediaViewerController != null) {
            A01.A04(null, c48685LgF, directAggregatedMediaViewerController, null, null, null, AbstractC166997dE.A0N(c32705EaW).getString(2131959852), AbstractC25225BEi.A07(C06090Tz.A05, AbstractC166987dD.A0r(interfaceC09390do), 36597905958571078L), 0, false, false, true);
            AnonymousClass989 anonymousClass989 = AnonymousClass988.A1Z;
            UserSession A0r2 = AbstractC166987dD.A0r(interfaceC09390do);
            Parcelable.Creator creator = Capabilities.CREATOR;
            A01.ADq(AbstractC86593tX.A06(c32705EaW.requireContext(), anonymousClass989.A00(A0r2, AbstractC2054797v.A00(C16930sl.A00))).A07);
            AbstractC31176DnK.A0x(c32705EaW.getActivity(), A01, C3DN.A00);
            return;
        }
        C14360o3.A0F("directAggregatedMediaViewerController");
        throw C00O.createAndThrow();
    }

    @Override // X.EOJ
    public final void A0L(InterfaceC56362iU interfaceC56362iU) {
        if (C14360o3.A0K(this.A04, "stacks") && !C7NG.A00(((EOJ) this).A01)) {
            String str = this.A03;
            InterfaceC09390do interfaceC09390do = this.A0S;
            if (AbstractC31171DnF.A1W(AbstractC166987dD.A0r(interfaceC09390do), str)) {
                if (C18U.A06(C06090Tz.A05, AbstractC166987dD.A0r(interfaceC09390do), 36316430978912637L)) {
                    C34700FQl c34700FQl = this.A00;
                    if (c34700FQl == null) {
                        C14360o3.A0F("sharedStacksLogger");
                        throw C00O.createAndThrow();
                    }
                    c34700FQl.A00("stack_grid_view");
                    C3LO A0B = AbstractC31171DnF.A0B();
                    A0B.A06 = R.drawable.instagram_users_pano_outline_24;
                    A0B.A05 = 2131966899;
                    AbstractC31176DnK.A1B(ViewOnClickListenerC35681FpG.A00(this, 30), A0B, interfaceC56362iU);
                }
            }
        }
        super.A0L(interfaceC56362iU);
    }

    public static final void A02(C32705EaW c32705EaW) {
        Dz7 A0E = c32705EaW.A0E();
        C37051GUh A00 = C37051GUh.A00(c32705EaW, 32);
        String str = A0E.A09.A00;
        if (str != null) {
            AbstractC166987dD.A1Z(new MC9(A0E, A00, str, (InterfaceC23621Ds) null, 36), AbstractC141776au.A00(A0E));
        }
        C146106i8 A0K = AbstractC31171DnF.A0K();
        AbstractC25226BEj.A1N(c32705EaW.requireContext(), A0K, 2131973835);
        A0K.A06();
        AbstractC25233BEq.A1F(A0K);
    }

    public static final void A03(C32705EaW c32705EaW) {
        C22P c22p;
        c32705EaW.A0D();
        if (C14360o3.A0K(c32705EaW.A04, "stacks")) {
            c22p = C22P.A0y;
        } else {
            c22p = C22P.A0x;
        }
        Bundle A00 = AbstractC86593tX.A0C(c22p).A00();
        A00.putParcelableArrayList(MSV.A00(39), c32705EaW.A05);
        A00.putParcelableArrayList(AbstractC111324zv.A00(1548), AbstractC166987dD.A1F(c32705EaW.A08));
        A00.putParcelableArrayList(MSV.A00(148), AbstractC166987dD.A1F(c32705EaW.A07));
        A00.putString(MSV.A00(150), c32705EaW.A06);
        A00.putBoolean(MSV.A00(149), c32705EaW.A09);
        A00.putBoolean(AbstractC111324zv.A00(604), true);
        A00.putSerializable(MSV.A00(17), C5JK.A05);
        C6XJ A02 = C6XJ.A02(c32705EaW.getActivity(), A00, AbstractC166987dD.A0r(c32705EaW.A0S), ModalActivity.class, "clips_camera");
        AbstractC31179DnN.A1S(A02);
        A02.A0A(c32705EaW.getActivity(), 9587);
    }

    @Override // X.EOJ, X.AbstractC43842Ja5
    public final Collection getDefinitions() {
        Collection definitions = super.getDefinitions();
        ArrayList A1E = AbstractC166987dD.A1E();
        A1E.addAll(definitions);
        A1E.add(new C45634KHx(C07Y.A00(this), AbstractC166987dD.A0r(this.A0S)));
        return AbstractC001800i.A0a(A1E);
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i == 9587) {
            if (i2 == 9683) {
                C35221FgE.A01(requireContext(), AbstractC166987dD.A0r(this.A0S));
                return;
            }
            if (i2 != 9685) {
                return;
            }
            String A0p = AbstractC166997dE.A0p(requireActivity(), 2131974368);
            C146106i8 A0K = AbstractC31171DnF.A0K();
            A0K.A0D = Html.fromHtml(A0p);
            A0K.A06();
            AbstractC25233BEq.A1F(A0K);
        }
    }

    @Override // X.InterfaceC60072op
    public final boolean onBackPressed() {
        return A0N();
    }

    @Override // X.AbstractC32707EaY, X.EOJ, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        int A02 = C0f9.A02(-1787979642);
        super.onCreate(bundle);
        this.A00 = new C34700FQl(AbstractC166987dD.A0r(this.A0S));
        C0f9.A09(-35429554, A02);
    }

    @Override // X.AbstractC32707EaY, X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        int A02 = C0f9.A02(693218762);
        super.onDestroyView();
        AbstractC25651Mw.A00(AbstractC166987dD.A0r(this.A0S)).A02(this.A0A, C160937Jc.class);
        C0f9.A09(-1245561969, A02);
    }

    @Override // X.EOJ, androidx.fragment.app.Fragment
    public final void onPause() {
        int A02 = C0f9.A02(1591628566);
        super.onPause();
        AbstractC25651Mw.A00(AbstractC166987dD.A0r(this.A0S)).A02(this.A0A, C160937Jc.class);
        C0f9.A09(-161789646, A02);
    }

    @Override // X.EOJ, X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onResume() {
        int A02 = C0f9.A02(-392282586);
        super.onResume();
        AbstractC25651Mw.A00(AbstractC166987dD.A0r(this.A0S)).A01(this.A0A, C160937Jc.class);
        C0f9.A09(-1879267833, A02);
    }
}
