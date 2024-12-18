package X;

import android.os.Bundle;
import android.view.View;
import com.facebook.R;
import com.instagram.igds.components.checkbox.IgdsCheckBox;
import com.instagram.igds.components.search.IgdsInlineSearchBox;
import com.instagram.mediakit.model.MediaKitSectionType;
import com.instagram.user.model.User;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.NUw, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C52733NUw extends ELn implements InterfaceC58279PsX {
    public static final String __redex_internal_original_name = "MediaKitProfilePickerFragment";
    public String A00;
    public final InterfaceC09390do A01;
    public final InterfaceC09390do A03;
    public final InterfaceC09390do A02 = AbstractC60492pY.A02(this);
    public final InterfaceC09390do A04 = C57546PgK.A01(this, 47);

    @Override // X.InterfaceC60122ou
    public final void configureActionBar(InterfaceC56362iU interfaceC56362iU) {
        String string;
        C14360o3.A0B(interfaceC56362iU, 0);
        int size = MSW.A1A(((C50978Mfl) this.A03.getValue()).A0B).size();
        if (size > 0) {
            string = getString(2131966739, AbstractC25228BEl.A1Y(size));
        } else {
            string = getString(2131966728);
        }
        C14360o3.A07(string);
        interfaceC56362iU.Ehk(string);
        C3LO A0B = AbstractC31171DnF.A0B();
        A0B.A0K = getString(2131968535);
        AbstractC31176DnK.A1B(new ViewOnClickListenerC55456OkA(this, 13), A0B, interfaceC56362iU);
        interfaceC56362iU.ARk(0, false);
    }

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return "MediaKitAudiencePickerFragment";
    }

    @Override // X.InterfaceC60072op
    public final boolean onBackPressed() {
        return false;
    }

    @Override // X.ELn, X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        C14360o3.A0B(view, 0);
        super.onViewCreated(view, bundle);
        ((IgdsInlineSearchBox) view.requireViewById(R.id.search_box)).setHint(2131966727);
        AbstractC166997dE.A0S(view, R.id.audience_picker_disclaimer_text).setVisibility(8);
        A0A().A00 = new C34624FNh(requireContext(), "", "", R.drawable.ig_illustrations_qp_search_refresh, false);
        A0A().A03(requireContext(), null, EnumC153216up.A06);
        C07S c07s = C07S.STARTED;
        C07X viewLifecycleOwner = getViewLifecycleOwner();
        AbstractC166987dD.A1Z(new PZP(viewLifecycleOwner, c07s, this, null, 31), C07Y.A00(viewLifecycleOwner));
    }

    @Override // X.InterfaceC58279PsX
    public final C54780OIu BOh() {
        return (C54780OIu) this.A04.getValue();
    }

    @Override // X.GYQ
    public final void Cuc(C31335Dq0 c31335Dq0) {
        C50978Mfl c50978Mfl = (C50978Mfl) this.A03.getValue();
        C05A c05a = c50978Mfl.A0C;
        C05A c05a2 = c50978Mfl.A0B;
        java.util.Set A0n = AbstractC001800i.A0n(AbstractC31172DnG.A0w(c05a2), AbstractC31172DnG.A0w(c05a));
        Iterator it = A0n.iterator();
        while (it.hasNext()) {
            ((C32069E6v) it.next()).A01 = false;
        }
        c05a.Egh(AbstractC166987dD.A1F(A0n));
        c05a2.Egh(C16930sl.A00);
    }

    @Override // X.AbstractC59962oe
    public final /* bridge */ /* synthetic */ AbstractC18680vv getSession() {
        return AbstractC166987dD.A0n(this.A02);
    }

    public C52733NUw() {
        C57247PbV c57247PbV = new C57247PbV(this, 1);
        C57546PgK c57546PgK = new C57546PgK(this, 48);
        EnumC09460dv enumC09460dv = EnumC09460dv.A02;
        InterfaceC09390do A00 = C57546PgK.A00(c57546PgK, enumC09460dv, 49);
        this.A03 = AbstractC25225BEi.A0a(new C57247PbV(A00, 0), c57247PbV, C57535Pg9.A00(null, A00, 37), AbstractC25225BEi.A1D(C50978Mfl.class));
        this.A01 = C57546PgK.A00(this, enumC09460dv, 46);
    }

    @Override // X.ELn
    public final void A0D(IgdsCheckBox igdsCheckBox, C32069E6v c32069E6v) {
        ArrayList arrayList;
        int i;
        AbstractC167017dG.A1N(c32069E6v, igdsCheckBox);
        boolean z = !igdsCheckBox.isChecked();
        C50978Mfl c50978Mfl = (C50978Mfl) this.A03.getValue();
        boolean z2 = !igdsCheckBox.isChecked();
        String id = c32069E6v.A02.getId();
        if (z2) {
            int size = MSW.A1A(c50978Mfl.A0B).size();
            int i2 = c50978Mfl.A07.A00;
            if (size >= i2) {
                PZM.A01(c50978Mfl, new C54423O3d(i2), AbstractC141776au.A00(c50978Mfl), 27);
                return;
            }
        }
        c32069E6v.A01 = z2;
        C05A c05a = c50978Mfl.A0B;
        ArrayList A1F = AbstractC166987dD.A1F((Collection) c05a.getValue());
        C05A c05a2 = c50978Mfl.A0C;
        ArrayList A1F2 = AbstractC166987dD.A1F((Collection) c05a2.getValue());
        if (z2) {
            A1F.add(c32069E6v);
            arrayList = A1F2;
            i = 40;
        } else {
            A1F2.add(c32069E6v);
            arrayList = A1F;
            i = 41;
        }
        C50361MLn c50361MLn = new C50361MLn(id, i);
        ArrayList A1E = AbstractC166987dD.A1E();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            if (AbstractC25231BEo.A1a(next, c50361MLn)) {
                A1E.add(next);
            }
        }
        Iterator it2 = A1E.iterator();
        while (it2.hasNext()) {
            arrayList.remove(it2.next());
        }
        c05a.Egh(A1F);
        c05a2.Egh(A1F2);
        igdsCheckBox.setChecked(z);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v16, types: [java.util.AbstractCollection, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r0v9, types: [X.0sl] */
    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        Object obj;
        Object obj2;
        int A02 = C0f9.A02(-1661468390);
        super.onCreate(bundle);
        this.A00 = AbstractC153636vY.A01(requireArguments(), "section_id");
        C50978Mfl c50978Mfl = (C50978Mfl) this.A03.getValue();
        String str = this.A00;
        if (str == null) {
            C14360o3.A0F("sectionId");
            throw C00O.createAndThrow();
        }
        Iterator it = c50978Mfl.A06.A02.A04.iterator();
        while (true) {
            if (it.hasNext()) {
                obj = it.next();
                if (C14360o3.A0K(((C51850Mvs) obj).A03, str)) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        C51850Mvs c51850Mvs = (C51850Mvs) obj;
        c50978Mfl.A01 = AbstractC25229BEm.A1Z(c51850Mvs);
        if (c51850Mvs == null) {
            C51850Mvs A00 = OZE.A00(MediaKitSectionType.A04, str, "");
            String str2 = A00.A03;
            String str3 = A00.A04;
            MediaKitSectionType mediaKitSectionType = A00.A01;
            AbstractC167017dG.A0x();
            c51850Mvs = new C51850Mvs(null, mediaKitSectionType, "", str2, str3, null, null);
        }
        c50978Mfl.A00 = c51850Mvs;
        C05A c05a = c50978Mfl.A0B;
        List list = c51850Mvs.A05;
        if (list != null) {
            obj2 = AbstractC167017dG.A0q(list);
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                obj2.add(new C32069E6v((User) it2.next(), true, true));
            }
        } else {
            obj2 = C16930sl.A00;
        }
        c05a.Egh(obj2);
        c50978Mfl.A02.A02(((C2DU) c50978Mfl.A04).A0C.A09(EnumC46982Dm.A04), new PKD(c50978Mfl, 2));
        C0f9.A09(1096425238, A02);
    }
}
