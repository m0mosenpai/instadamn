package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.viewpager2.widget.ViewPager2;
import com.facebook.R;
import com.google.android.material.tabs.TabLayout;
import com.instagram.mediakit.model.MediaKitSectionType;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/* loaded from: classes9.dex */
public final class N5W extends AbstractC59962oe implements InterfaceC60122ou, InterfaceC58279PsX {
    public static final String __redex_internal_original_name = "MediaKitMediaPickerTabFragment";
    public View A00;
    public ViewPager2 A01;
    public TabLayout A02;
    public C66362zD A03;
    public C51392Mmx A04;
    public OEV A05;
    public InterfaceC154386wo A06;
    public final InterfaceC09390do A07;
    public final InterfaceC09390do A08;
    public final InterfaceC09390do A0A;
    public final InterfaceC09390do A0B;
    public final InterfaceC09390do A0C = C57546PgK.A01(this, 39);
    public final InterfaceC09390do A09 = AbstractC25225BEi.A0a(new C57546PgK(this, 41), new C57546PgK(this, 40), C57535Pg9.A00(null, this, 35), AbstractC25225BEi.A1D(C51053Mh7.class));

    public final void A01(String str) {
        C14360o3.A0B(str, 0);
        C51052Mh6.A01((C51052Mh6) this.A0B.getValue(), new C50361MLn(str, 39));
    }

    @Override // X.InterfaceC60122ou
    public final void configureActionBar(InterfaceC56362iU interfaceC56362iU) {
        C14360o3.A0B(interfaceC56362iU, 0);
        EnumC53194Nfq enumC53194Nfq = (EnumC53194Nfq) this.A08.getValue();
        InterfaceC09390do interfaceC09390do = this.A0B;
        interfaceC56362iU.Ehk(A00(enumC53194Nfq, this, ((C51052Mh6) interfaceC09390do.getValue()).A02().size()));
        C3LO A0B = AbstractC31171DnF.A0B();
        A0B.A0K = getString(2131968535);
        AbstractC31176DnK.A1B(new ViewOnClickListenerC55456OkA(this, 11), A0B, interfaceC56362iU);
        interfaceC56362iU.ARk(0, ((C51052Mh6) interfaceC09390do.getValue()).A04());
    }

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return "MediaKitSelectMediaTabFragment";
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0071  */
    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onViewCreated(android.view.View r17, android.os.Bundle r18) {
        /*
            Method dump skipped, instructions count: 362
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.N5W.onViewCreated(android.view.View, android.os.Bundle):void");
    }

    @Override // X.InterfaceC58279PsX
    public final C54780OIu BOh() {
        return (C54780OIu) this.A0C.getValue();
    }

    @Override // X.AbstractC59962oe
    public final /* bridge */ /* synthetic */ AbstractC18680vv getSession() {
        return AbstractC166987dD.A0n(this.A0A);
    }

    public N5W() {
        C57546PgK c57546PgK = new C57546PgK(this, 45);
        C57546PgK c57546PgK2 = new C57546PgK(this, 42);
        EnumC09460dv enumC09460dv = EnumC09460dv.A02;
        InterfaceC09390do A00 = C57546PgK.A00(c57546PgK2, enumC09460dv, 43);
        this.A0B = AbstractC25225BEi.A0a(new C57546PgK(A00, 44), c57546PgK, C57535Pg9.A00(null, A00, 36), AbstractC25225BEi.A1D(C51052Mh6.class));
        this.A07 = C57546PgK.A00(this, enumC09460dv, 37);
        this.A0A = AbstractC60492pY.A02(this);
        this.A08 = C57546PgK.A01(this, 38);
    }

    public static final String A00(EnumC53194Nfq enumC53194Nfq, N5W n5w, int i) {
        String string;
        if (enumC53194Nfq.ordinal() == 0) {
            if (i > 0) {
                string = n5w.getString(2131966810, AbstractC25228BEl.A1Y(i));
            } else {
                string = n5w.getString(2131966807);
            }
            C14360o3.A0A(string);
            return string;
        }
        return AbstractC25227BEk.A0v(n5w, 2131966725);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        C51052Mh6 c51052Mh6;
        Object obj;
        int i;
        Object obj2;
        int A02 = C0f9.A02(-1320205925);
        super.onCreate(bundle);
        this.A05 = OPO.A01(AbstractC166987dD.A0r(this.A0A));
        int ordinal = ((EnumC53194Nfq) this.A08.getValue()).ordinal();
        if (ordinal != 0) {
            if (ordinal == 1) {
                c51052Mh6 = (C51052Mh6) this.A0B.getValue();
                Object value = MSW.A0l(this.A09).A0K.getValue();
                C14360o3.A0B(value, 0);
                i = 21;
                obj2 = value;
            } else {
                throw B4Z.A00();
            }
        } else {
            String A01 = AbstractC153636vY.A01(requireArguments(), "section_id");
            C51052Mh6 c51052Mh62 = (C51052Mh6) this.A0B.getValue();
            c51052Mh6 = c51052Mh62;
            ArrayList arrayList = MSW.A0l(this.A09).A07.A02.A04;
            C14360o3.A0B(arrayList, 1);
            boolean z = true;
            if (!(arrayList instanceof Collection) || !arrayList.isEmpty()) {
                Iterator it = arrayList.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    } else if (C51850Mvs.A00(A01, it)) {
                        z = false;
                        break;
                    }
                }
            }
            c51052Mh62.A01 = z;
            Iterator it2 = arrayList.iterator();
            while (true) {
                if (it2.hasNext()) {
                    obj = it2.next();
                    if (C14360o3.A0K(((C51850Mvs) obj).A03, A01)) {
                        break;
                    }
                } else {
                    obj = null;
                    break;
                }
            }
            C51850Mvs c51850Mvs = (C51850Mvs) obj;
            if (c51850Mvs == null) {
                if (A01 != null) {
                    C51850Mvs A00 = OZE.A00(MediaKitSectionType.A06, A01, "");
                    String str = A00.A03;
                    String str2 = A00.A04;
                    MediaKitSectionType mediaKitSectionType = A00.A01;
                    C16930sl c16930sl = C16930sl.A00;
                    C14360o3.A0B(c16930sl, 1);
                    AbstractC37302Gc3.A0n();
                    ArrayList A0q = AbstractC167017dG.A0q(c16930sl);
                    Iterator it3 = c16930sl.iterator();
                    while (it3.hasNext()) {
                        A0q.add(it3.next());
                    }
                    c51850Mvs = Nv9.A00(Nv8.A00(new C51849Mvr(A0q, false).A00, false), mediaKitSectionType, "", str, str2, null, null);
                } else {
                    throw AbstractC166997dE.A0g();
                }
            }
            c51052Mh62.A00 = c51850Mvs;
            i = 22;
            obj2 = c51052Mh62;
        }
        C51052Mh6.A01(c51052Mh6, C57745PjY.A00(obj2, i));
        C0f9.A09(412922839, A02);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(807159595);
        C14360o3.A0B(layoutInflater, 0);
        View A0R = AbstractC25226BEj.A0R(layoutInflater, viewGroup, R.layout.media_kit_media_picker_tab_fragment, false);
        C0f9.A09(-1084706316, A02);
        return A0R;
    }
}
