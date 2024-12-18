package X;

import android.content.Context;
import android.os.Bundle;
import com.facebook.proxygen.TraceFieldType;
import com.instagram.common.session.UserSession;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.ElT, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C33234ElT extends AbstractC33235ElU implements InterfaceC60442pS, InterfaceC60122ou {
    public static final String __redex_internal_original_name = "PushNotificationOptionsRedesignFragment";
    public AbstractC10360h2 A01;
    public UserSession A02;
    public AbstractC28641a0 A03;
    public C35033Fc6 A04;
    public String A05;
    public String A07;
    public boolean A06 = false;
    public int A00 = 0;
    public final FPR A08 = new FPR(this);

    @Override // X.InterfaceC60442pS
    public final boolean isOrganicEligible() {
        return true;
    }

    @Override // X.InterfaceC60442pS
    public final boolean isSponsoredEligible() {
        return false;
    }

    public static void A02(EnumC47122Ee enumC47122Ee, FPR fpr, C33234ElT c33234ElT, String str, String str2, boolean z) {
        fpr.A00(str, str2, "radio");
        if (!AbstractC14480oK.A01(c33234ElT.requireContext())) {
            C92I.A07(c33234ElT.requireContext());
            return;
        }
        if (z) {
            return;
        }
        AbstractC28641a0 abstractC28641a0 = c33234ElT.A03;
        if (abstractC28641a0 != null && ((C2DP) abstractC28641a0).A05.A00() && c33234ElT.A05.equals("instagram_direct")) {
            return;
        }
        C92I.A08(c33234ElT.requireContext(), enumC47122Ee);
    }

    public static void A03(C33234ElT c33234ElT) {
        C33111EjF c33111EjF = new C33111EjF(c33234ElT.A01, c33234ElT, c33234ElT.A08, 1);
        C1ON A00 = FXB.A00(c33234ElT.A02, c33234ElT.A05);
        A00.A00 = c33111EjF;
        c33234ElT.schedule(A00);
    }

    public static void A04(String str, List list) {
        if (str != null && !str.equals("")) {
            list.add(new C35246Fgf(str));
        }
    }

    @Override // X.InterfaceC60122ou
    public final void configureActionBar(InterfaceC56362iU interfaceC56362iU) {
        AbstractC31175DnJ.A1I(interfaceC56362iU, this.A07);
    }

    public static String A00(FPR fpr, C33234ElT c33234ElT, List list, List list2) {
        boolean z;
        ArrayList A1E = AbstractC166987dD.A1E();
        String str = ((E6O) list.get(0)).A01;
        Iterator it = list.iterator();
        String str2 = "off";
        while (it.hasNext()) {
            E6O e6o = (E6O) it.next();
            String str3 = e6o.A02;
            if (str3 == null) {
                str3 = "off";
            }
            if (Boolean.TRUE.equals(e6o.A00)) {
                str2 = str3;
            }
            C35124FeR.A00(str3, e6o.A03, A1E);
        }
        EnumC47122Ee A03 = C92I.A03(c33234ElT.getContext(), c33234ElT.A02, str);
        Context requireContext = c33234ElT.requireContext();
        C14360o3.A0B(A03, 1);
        Boolean A00 = AbstractC47112Ed.A00(requireContext, A03, false);
        if (A03 != EnumC47122Ee.A0c && A00 != null && !Boolean.TRUE.equals(A00)) {
            z = false;
            AbstractC28641a0 abstractC28641a0 = c33234ElT.A03;
            if (abstractC28641a0 == null || !((C2DP) abstractC28641a0).A05.A00() || !c33234ElT.A05.equals("instagram_direct")) {
                str2 = "off";
            }
        } else {
            z = true;
        }
        list2.add(new C34960Fak(new C35751Fqj(A03, fpr, c33234ElT, str, A1E, z), str2, A1E));
        return str;
    }

    public static String A01(FPR fpr, C33234ElT c33234ElT, List list, List list2) {
        String str = ((E6O) AbstractC166987dD.A16(list)).A01;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            E6O e6o = (E6O) it.next();
            String str2 = e6o.A03;
            Boolean bool = e6o.A00;
            bool.getClass();
            list2.add(new C36731GHa(new C55517OlA(c33234ElT, fpr, str, 1), str2, bool.booleanValue()));
        }
        return str;
    }

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return this.A05;
    }

    @Override // X.AbstractC59962oe
    public final AbstractC18680vv getSession() {
        return this.A02;
    }

    @Override // X.AbstractC33235ElU, X.AbstractC60672pq, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        AbstractC28641a0 abstractC28641a0;
        int A02 = C0f9.A02(-1435794278);
        super.onCreate(bundle);
        this.A02 = AbstractC31176DnK.A0S(this);
        Bundle requireArguments = requireArguments();
        this.A05 = AbstractC31173DnH.A0j(requireArguments, TraceFieldType.ContentType);
        this.A07 = AbstractC31173DnH.A0j(requireArguments, AbstractC58317Pt9.A00(333));
        this.A06 = requireArguments.getBoolean("scroll_to_video_chat");
        if (this.A07.equals(AbstractC111324zv.A00(3663))) {
            this.A07 = AbstractC166997dE.A0N(this).getString(2131965304);
        }
        this.A01 = this.mFragmentManager;
        this.A04 = new C35033Fc6(this.A02, this);
        if (AbstractC28641a0.A00 != null) {
            abstractC28641a0 = C2DJ.A00(this.A02);
        } else {
            abstractC28641a0 = null;
        }
        this.A03 = abstractC28641a0;
        C0f9.A09(452227114, A02);
    }

    @Override // X.AbstractC60672pq, X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onResume() {
        int A02 = C0f9.A02(1137205713);
        super.onResume();
        A03(this);
        C0f9.A09(-2037051738, A02);
    }
}
