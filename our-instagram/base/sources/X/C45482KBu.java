package X;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.R;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: X.KBu, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C45482KBu extends AbstractC59962oe implements InterfaceC60122ou {
    public static final String __redex_internal_original_name = "CreatorInspirationHubTopAudioFragment";
    public C45507KCw A00;
    public C45507KCw A01;
    public C45507KCw A02;
    public C45507KCw A03;
    public ArrayList A04;
    public final InterfaceC09390do A05;
    public final InterfaceC09390do A06 = AbstractC60492pY.A02(this);

    @Override // X.InterfaceC60122ou
    public final void configureActionBar(InterfaceC56362iU interfaceC56362iU) {
        String A0q;
        C14360o3.A0B(interfaceC56362iU, 0);
        interfaceC56362iU.EkS(true);
        Bundle bundle = this.mArguments;
        if (bundle == null || (A0q = bundle.getString(AbstractC58317Pt9.A00(333))) == null) {
            A0q = AbstractC166997dE.A0q(AbstractC166997dE.A0N(this), 2131957174);
        }
        interfaceC56362iU.setTitle(A0q);
        C3LO c3lo = new C3LO();
        c3lo.A02(C05F.A0Y);
        AbstractC31176DnK.A1B(new ViewOnClickListenerC48071LPw(this, 1), c3lo, interfaceC56362iU);
    }

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return "creator_inspiration_hub_top_audio_fragment";
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        String str;
        C14360o3.A0B(view, 0);
        super.onViewCreated(view, bundle);
        RecyclerView recyclerView = (RecyclerView) AbstractC166997dE.A0S(view, R.id.creator_inspiration_hub_top_audio_pills);
        ArrayList A1E = AbstractC166987dD.A1E();
        ArrayList arrayList = this.A04;
        if (arrayList != null) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                Object next = it.next();
                EnumC46314Kek enumC46314Kek = EnumC46314Kek.A05;
                if (!C14360o3.A0K(next, "trending")) {
                    enumC46314Kek = EnumC46314Kek.A04;
                    if (!C14360o3.A0K(next, "popular_with_your_followers")) {
                        if (C14360o3.A0K(next, "trending_with_similar_accounts")) {
                            enumC46314Kek = EnumC46314Kek.A06;
                        } else {
                            enumC46314Kek = EnumC46314Kek.A03;
                            if (C14360o3.A0K(next, "original_audio")) {
                            }
                        }
                    }
                }
                A1E.add(enumC46314Kek);
            }
        }
        InterfaceC09390do interfaceC09390do = this.A05;
        C25863BcI c25863BcI = (C25863BcI) interfaceC09390do.getValue();
        Context requireContext = requireContext();
        Integer num = C05F.A01;
        Bundle bundle2 = this.mArguments;
        if (bundle2 == null || (str = bundle2.getString("list_type_id")) == null) {
            str = "trending";
        }
        c25863BcI.A01(requireContext, recyclerView, num, str, A1E);
        JQ0.A11(this, new C50119MBt(this, view, null, 2), ((C25863BcI) interfaceC09390do.getValue()).A03);
    }

    public static C45507KCw A01(C45482KBu c45482KBu, String str) {
        c45482KBu.A06.getValue();
        Bundle A00 = c45482KBu.A00(str);
        C45507KCw c45507KCw = new C45507KCw();
        c45507KCw.setArguments(A00);
        return c45507KCw;
    }

    @Override // X.AbstractC59962oe
    public final /* bridge */ /* synthetic */ AbstractC18680vv getSession() {
        return AbstractC166987dD.A0n(this.A06);
    }

    public C45482KBu() {
        MF8 mf8 = MF8.A00;
        InterfaceC09390do A00 = AbstractC09440dt.A00(EnumC09460dv.A02, new D87(new D87(this, 12), 13));
        this.A05 = AbstractC25225BEi.A0a(new D87(A00, 14), mf8, new C50169MDw(18, A00, null), AbstractC25225BEi.A1D(C25863BcI.class));
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0031, code lost:
    
        if (X.C18U.A06(X.C06090Tz.A05, X.AbstractC31178DnM.A0M(r5.A06), 36328302268726723L) == false) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final android.os.Bundle A00(java.lang.String r6) {
        /*
            r5 = this;
            android.os.Bundle r4 = X.AbstractC166987dD.A0b()
            X.8BO r1 = X.C8BO.A05
            java.lang.String r0 = "music_selection_source"
            r4.putSerializable(r0, r1)
            X.HdL r1 = X.EnumC39549HdL.A03
            java.lang.String r0 = "trend_report_entrypoint"
            r4.putSerializable(r0, r1)
            java.lang.String r0 = "list_type_id"
            r4.putString(r0, r6)
            java.lang.String r0 = "trending"
            boolean r0 = X.C14360o3.A0K(r6, r0)
            if (r0 == 0) goto L33
            X.0do r0 = r5.A06
            X.0ll r3 = X.AbstractC31178DnM.A0M(r0)
            X.0Tz r2 = X.C06090Tz.A05
            r0 = 36328302268726723(0x81106600053dc3, double:3.0375028648500234E-306)
            boolean r0 = X.C18U.A06(r2, r3, r0)
            r1 = 1
            if (r0 != 0) goto L34
        L33:
            r1 = 0
        L34:
            java.lang.String r0 = "should_show_trending_rank_change"
            r4.putBoolean(r0, r1)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C45482KBu.A00(java.lang.String):android.os.Bundle");
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        ArrayList<String> arrayList;
        int A02 = C0f9.A02(-348671386);
        super.onCreate(bundle);
        Bundle bundle2 = this.mArguments;
        if (bundle2 != null) {
            arrayList = bundle2.getStringArrayList("audio_sections");
        } else {
            arrayList = null;
        }
        this.A04 = arrayList;
        if (arrayList != null) {
            Iterator A13 = AbstractC166997dE.A13(arrayList);
            while (A13.hasNext()) {
                String str = (String) AbstractC166997dE.A0l(A13);
                if (C14360o3.A0K(str, "trending")) {
                    this.A02 = A01(this, str);
                } else if (C14360o3.A0K(str, "popular_with_your_followers")) {
                    this.A01 = A01(this, str);
                } else if (C14360o3.A0K(str, "trending_with_similar_accounts")) {
                    this.A03 = A01(this, str);
                } else if (C14360o3.A0K(str, "original_audio")) {
                    this.A00 = A01(this, str);
                }
                InterfaceC02590Ai A0f = AbstractC166987dD.A0f(AbstractC12220kQ.A01(this, AbstractC31178DnM.A0M(this.A06)), "instagram_organic_audio_trending_tab_impression");
                if (A0f.isSampled()) {
                    AbstractC25225BEi.A1O(A0f, "creator_inspiration_hub_top_audio_fragment");
                    A0f.A9K("container_id", AbstractC167007dF.A0d());
                    AbstractC37302Gc3.A0t(A0f);
                    A0f.AAP("trending_tab_category", str);
                    A0f.Cht();
                }
            }
        }
        C0f9.A09(1164207539, A02);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(-1863030995);
        C14360o3.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.creator_inspiration_hub_top_audio_fragment, viewGroup, false);
        C0f9.A09(-1362753275, A02);
        return inflate;
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onResume() {
        int A02 = C0f9.A02(-1046567932);
        super.onResume();
        if (AbstractC72723Nt.A00(requireContext())) {
            AbstractC145016gM.A03(requireActivity(), this, AbstractC166987dD.A0r(this.A06), false, false);
        }
        C0f9.A09(-1514269967, A02);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onStop() {
        int A02 = C0f9.A02(1945336291);
        super.onStop();
        AbstractC145016gM.A04(requireActivity(), AbstractC166987dD.A0r(this.A06), false);
        C0f9.A09(1499454789, A02);
    }
}
