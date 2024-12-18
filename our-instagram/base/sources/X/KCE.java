package X;

import android.content.Context;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.paging.PagingDataAdapter;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.R;
import com.facebook.videolite.transcoder.base.composition.MediaComposition;
import com.instagram.common.session.UserSession;
import com.instagram.ui.primer.IconConfig;
import com.instagram.ui.primer.InfoItem;
import com.instagram.ui.primer.PrimerBottomSheetConfig;
import com.instagram.ui.primer.TitleIcon;
import java.io.Serializable;
import java.util.Iterator;

/* loaded from: classes8.dex */
public final class KCE extends AbstractC59962oe implements InterfaceC60072op {
    public static final String __redex_internal_original_name = "ClipsACRBrowserFragment";
    public EnumC33503Erc A00;
    public C22P A01;
    public boolean A02;
    public final C47942LFs A03;
    public final InterfaceC09390do A04;
    public final InterfaceC09390do A05;
    public final InterfaceC09390do A06;
    public final InterfaceC09390do A07;
    public final InterfaceC09390do A08;
    public final InterfaceC09390do A09;
    public final InterfaceC09390do A0A;
    public final InterfaceC09390do A0B;
    public final InterfaceC09390do A0C;
    public final InterfaceC09390do A0D;
    public final InterfaceC09390do A0E;
    public final InterfaceC09390do A0F;
    public final InterfaceC09390do A0G;
    public final InterfaceC09390do A0H;

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return "clips_acr_browser";
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        C14360o3.A0B(view, 0);
        super.onViewCreated(view, bundle);
        C57312k6 A0S = AbstractC25235BEs.A0S(this);
        C25023B5e c25023B5e = new C25023B5e(view, this, null, 7);
        AnonymousClass191 anonymousClass191 = AnonymousClass191.A00;
        AbstractC23641Du.A05(anonymousClass191, c25023B5e, A0S);
        InterfaceC09390do interfaceC09390do = this.A0F;
        interfaceC09390do.getValue();
        InterfaceC09390do interfaceC09390do2 = this.A0D;
        if (C1LE.A0G(AbstractC31175DnJ.A0K(interfaceC09390do2, 0))) {
            AbstractC166987dD.A1P(view.getContext(), AbstractC37302Gc3.A06(this.A0E), 2131955225);
        }
        RecyclerView A00 = A00(this);
        AbstractC51163Mj6 abstractC51163Mj6 = new AbstractC51163Mj6();
        AbstractC51163Mj6 abstractC51163Mj62 = new AbstractC51163Mj6();
        InterfaceC09390do interfaceC09390do3 = this.A0A;
        ((PagingDataAdapter) interfaceC09390do3.getValue()).A06(new BAO(28, abstractC51163Mj62, abstractC51163Mj6));
        A00.setAdapter(new C66422UGr(abstractC51163Mj6, (C2UU) interfaceC09390do3.getValue(), abstractC51163Mj62));
        A00.setLayoutManager((AbstractC70663Fe) this.A0B.getValue());
        View requireView = requireView();
        if (requireView.isLaidOut() && !requireView.isLayoutRequested()) {
            A00(this).A10(new Jo8((int) (A00(this).getMeasuredHeight() * 0.5625f)));
        } else {
            requireView.addOnLayoutChangeListener(new LQ9(this, 3));
        }
        JnV jnV = new JnV();
        A00(this).A0E = null;
        jnV.A07(A00(this));
        AbstractC23641Du.A05(anonymousClass191, new MBT(this, null, 46), AbstractC25235BEs.A0S(this));
        JQ0.A11(this, new B5g(this, null, 17), ((PagingDataAdapter) interfaceC09390do3.getValue()).A02);
        View requireViewById = view.requireViewById(R.id.clips_acr_browser_exit_button);
        AbstractC166997dE.A18(requireViewById.getContext(), requireViewById, 2131953583);
        ViewOnClickListenerC48063LPo.A00(requireViewById, 13, this);
        ViewOnClickListenerC48063LPo.A00(AbstractC167007dF.A0L(this.A0G), 14, this);
        JQ0.A11(this, new B5g(this, null, 18), ((C44535Jmf) interfaceC09390do.getValue()).A07);
        C47540Kz8 c47540Kz8 = (C47540Kz8) this.A04.getValue();
        UserSession userSession = c47540Kz8.A01;
        if (C18U.A06(C06090Tz.A05, userSession, 36318844750404142L)) {
            C23031Ai A002 = AbstractC23021Ah.A00(userSession);
            InterfaceC16530ry interfaceC16530ry = A002.A27;
            C0YR[] c0yrArr = C23031Ai.A8c;
            if (!AbstractC167017dG.A1b(A002, interfaceC16530ry, c0yrArr, 380) && !AbstractC23021Ah.A00(userSession).A1n()) {
                TitleIcon titleIcon = new TitleIcon(null, R.drawable.ig_illustrations_illo_camera_roll_reels_refresh);
                Context context = c47540Kz8.A00;
                PrimerBottomSheetConfig primerBottomSheetConfig = new PrimerBottomSheetConfig(titleIcon, null, null, null, null, null, null, null, "clips_acr_camera_roll_access_consent_nux", AbstractC166997dE.A0p(context, 2131955236), AbstractC166997dE.A0p(context, 2131968687), null, AbstractC16960so.A1R(new InfoItem(new IconConfig.SimpleIconConfig(R.drawable.instagram_collage_pano_outline_24), Integer.valueOf(AbstractC53242c7.A09(context)), AbstractC166997dE.A0p(context, 2131955233), null), new InfoItem(new IconConfig.SimpleIconConfig(R.drawable.instagram_music_pano_outline_24), Integer.valueOf(AbstractC53242c7.A09(context)), AbstractC166997dE.A0p(context, 2131955235), null), new InfoItem(new IconConfig.SimpleIconConfig(R.drawable.instagram_reels_pano_outline_24), Integer.valueOf(AbstractC53242c7.A09(context)), AbstractC166997dE.A0p(context, 2131955234), null)), 2131955237, false, false, false);
                C46067KaO c46067KaO = new C46067KaO(c47540Kz8, AbstractC31174DnI.A02(context));
                String A0p = AbstractC166997dE.A0p(context, 2131955232);
                SpannableStringBuilder A07 = AbstractC31178DnM.A07(context, A0p, 2131955231);
                AnonymousClass773.A05(A07, c46067KaO, A0p);
                C47947LGc c47947LGc = new C47947LGc(userSession, primerBottomSheetConfig, A07, false, false, false);
                c47947LGc.A00 = new ViewOnClickListenerC48066LPr(31, c47947LGc, c47540Kz8);
                c47947LGc.A01 = new ViewOnClickListenerC48066LPr(32, c47947LGc, c47540Kz8);
                AbstractC167007dF.A0J().post(new M3J(c47540Kz8, c47947LGc));
                C23031Ai A003 = AbstractC23021Ah.A00(userSession);
                AbstractC167007dF.A1L(A003, A003.A27, c0yrArr, 380, true);
                C22C A01 = AnonymousClass229.A01(userSession);
                InterfaceC02590Ai A0f = AbstractC166987dD.A0f(((C22F) A01).A01, MSV.A00(470));
                if (A0f.isSampled()) {
                    A0f.A8R(A01.A0J(), "camera_destination");
                    C22M c22m = ((C22F) A01).A04;
                    AbstractC166987dD.A1S(A0f, c22m.A0L);
                    AbstractC166997dE.A1N(A0f, "entity_type", 37);
                    AbstractC31171DnF.A1D(A0f, "clips_acr_browser");
                    A0f.A8R(EnumC50631MWs.A02, "surface");
                    A0f.A8R(c22m.A0A, "composition_media_type");
                    AbstractC25233BEq.A17(A0f, "composition_str_id", c22m.A0M);
                    A0f.Cht();
                }
            }
        }
        EnumC33503Erc enumC33503Erc = this.A00;
        if (enumC33503Erc != null) {
            C22C A0T = AbstractC43593JPy.A0T(interfaceC09390do2);
            InterfaceC02590Ai A0f2 = AbstractC166987dD.A0f(((C22F) A0T).A01, "ig_camera_acr_browser_impression");
            if (A0f2.isSampled()) {
                A0f2.A8R(EnumC114925Hg.CLIPS, "camera_destination");
                C22M c22m2 = ((C22F) A0T).A04;
                AbstractC166987dD.A1S(A0f2, c22m2.A0L);
                AbstractC167017dG.A1B(A0f2);
                AbstractC166997dE.A1N(A0f2, "entity_type", 37);
                A0f2.A8R(enumC33503Erc, "clips_acr_browser_entry_point");
                A0f2.A8R(EnumC50631MWs.A02, "surface");
                AbstractC43594JPz.A1B(A0f2, c22m2);
                AbstractC37302Gc3.A0t(A0f2);
                A0f2.Cht();
            }
        }
        C47788L8u A004 = Kl7.A00(AbstractC166987dD.A0r(interfaceC09390do2));
        long j = A004.A00;
        if (j != 0) {
            A004.A03.A0C("enter_acr_browser", j);
        }
    }

    public static final RecyclerView A00(KCE kce) {
        return (RecyclerView) AbstractC166987dD.A17(kce.A0H);
    }

    public static InterfaceC09390do A01(Object obj, int i) {
        return C1XM.A00(new C50151MDe(obj, i));
    }

    public static final C09530e4 A02(KCE kce) {
        C3OO A0V;
        int A1c = ((LinearLayoutManager) kce.A0B.getValue()).A1c();
        if (A1c != -1 && (A0V = A00(kce).A0V(A1c)) != null && (A0V instanceof C44767Jro)) {
            return AbstractC167007dF.A0o(A0V, A1c);
        }
        return null;
    }

    @Override // X.AbstractC59962oe
    public final /* bridge */ /* synthetic */ AbstractC18680vv getSession() {
        return AbstractC166987dD.A0n(this.A0D);
    }

    @Override // X.InterfaceC60072op
    public final boolean onBackPressed() {
        if (!this.A02) {
            C47788L8u A00 = Kl7.A00(AbstractC166987dD.A0r(this.A0D));
            long j = A00.A00;
            if (j != 0) {
                A00.A00 = A00.A03.A06(String.valueOf("cancel_back_press"), String.valueOf("back press was tapped before initial item load"), 246622982, j);
            }
            A00.A00 = 0L;
        }
        AbstractC25231BEo.A16(this);
        return true;
    }

    public KCE() {
        C50151MDe c50151MDe = new C50151MDe(this, 16);
        InterfaceC09390do A00 = AbstractC09440dt.A00(EnumC09460dv.A02, new C50151MDe(new C50151MDe(this, 12), 13));
        this.A0F = AbstractC25225BEi.A0a(new C50151MDe(A00, 14), c50151MDe, new B61(16, null, A00), AbstractC25225BEi.A1D(C44535Jmf.class));
        this.A03 = new C47942LFs();
        this.A0A = A01(this, 9);
        this.A0B = A01(this, 10);
        this.A0H = A01(this, 8);
        this.A0C = A01(this, 11);
        this.A09 = A01(this, 7);
        this.A08 = A01(this, 6);
        this.A04 = A01(this, 2);
        this.A0G = A01(this, 17);
        this.A0E = A01(this, 15);
        this.A05 = A01(this, 3);
        this.A07 = A01(this, 5);
        this.A06 = A01(this, 4);
        this.A0D = AbstractC60492pY.A02(this);
    }

    public static final void A03(KCE kce) {
        C09530e4 A02;
        C45077Jx6 c45077Jx6;
        MediaComposition mediaComposition;
        if (kce.isAdded() && kce.isVisible() && kce.isResumed() && (A02 = A02(kce)) != null) {
            C44767Jro c44767Jro = (C44767Jro) A02.A00;
            int A0A = AbstractC25229BEm.A0A(A02);
            C47942LFs c47942LFs = kce.A03;
            InterfaceC09390do interfaceC09390do = kce.A0D;
            UserSession A0r = AbstractC166987dD.A0r(interfaceC09390do);
            Context requireContext = kce.requireContext();
            AbstractC167017dG.A1O(A0r, c44767Jro);
            if (c47942LFs.A00 != A0A && (c45077Jx6 = c44767Jro.A01) != null && (mediaComposition = c45077Jx6.A01) != null) {
                C47942LFs.A00(c47942LFs);
                c47942LFs.A01(requireContext, mediaComposition, A0r, c44767Jro).A00();
                c47942LFs.A00 = A0A;
            }
            C45077Jx6 c45077Jx62 = c44767Jro.A01;
            if (c45077Jx62 != null) {
                InterfaceC09390do interfaceC09390do2 = kce.A0F;
                if (!c45077Jx62.equals(((C44535Jmf) interfaceC09390do2.getValue()).A00)) {
                    C22C A0T = AbstractC43593JPy.A0T(interfaceC09390do);
                    String A09 = AbstractC449424y.A09(c45077Jx62.A02);
                    String str = c45077Jx62.A08;
                    EnumC33503Erc enumC33503Erc = kce.A00;
                    String A0k = AbstractC31180DnO.A0k(c45077Jx62.A03);
                    InterfaceC02590Ai A0f = AbstractC166987dD.A0f(((C22F) A0T).A01, "ig_camera_acr_impression");
                    if (A0f.isSampled()) {
                        A0f.A8R(EnumC114925Hg.CLIPS, "camera_destination");
                        C22M c22m = ((C22F) A0T).A04;
                        AbstractC166987dD.A1S(A0f, c22m.A0L);
                        AbstractC167017dG.A1B(A0f);
                        if (A09 == null) {
                            A09 = "UNKNOWN";
                        }
                        A0f.AAP("acr_type", A09);
                        A0f.A8R(EnumC50631MWs.A02, "surface");
                        AbstractC166997dE.A1N(A0f, "entity_type", 37);
                        AbstractC43594JPz.A1B(A0f, c22m);
                        AbstractC37302Gc3.A0t(A0f);
                        A0f.AAP("acr_id", str);
                        A0f.A8R(enumC33503Erc, "clips_acr_browser_entry_point");
                        A0f.AAP("acr_smart_reel_type", A0k);
                        A0f.Cht();
                    }
                    if (!kce.A02) {
                        Kl7.A00(AbstractC166987dD.A0r(interfaceC09390do)).A01(false);
                        kce.A02 = true;
                    }
                    ((C44535Jmf) interfaceC09390do2.getValue()).A00 = c45077Jx62;
                }
            }
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        EnumC33503Erc enumC33503Erc;
        int A02 = C0f9.A02(1567216973);
        super.onCreate(bundle);
        Serializable serializable = requireArguments().getSerializable("CAMERA_ACR_BROWSER_ENTRY_POINT_ARGS");
        C22P c22p = null;
        if (serializable instanceof EnumC33503Erc) {
            enumC33503Erc = (EnumC33503Erc) serializable;
        } else {
            enumC33503Erc = null;
        }
        this.A00 = enumC33503Erc;
        Serializable serializable2 = requireArguments().getSerializable("CAMERA_ENTRY_POINT_ARGS");
        if (serializable2 instanceof C22P) {
            c22p = (C22P) serializable2;
        }
        this.A01 = c22p;
        C0f9.A09(1825631358, A02);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(-2065583012);
        C14360o3.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.clips_acr_browser_layout, viewGroup, false);
        C0f9.A09(-782402558, A02);
        return inflate;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onPause() {
        int A02 = C0f9.A02(830635188);
        super.onPause();
        C47942LFs c47942LFs = this.A03;
        Iterator it = c47942LFs.A01.values().iterator();
        while (it.hasNext()) {
            C55333Ogw c55333Ogw = (C55333Ogw) AbstractC166997dE.A0l(it);
            c55333Ogw.isPlaying = false;
            c55333Ogw.A01.A05();
        }
        c47942LFs.A00 = -1;
        A00(this).A15((C1I4) this.A0C.getValue());
        C47942LFs.A00(c47942LFs);
        c47942LFs.A00 = -1;
        InterfaceC09390do interfaceC09390do = this.A08;
        if (AbstractC167027dH.A01(interfaceC09390do) != 0) {
            ((C41711wL) this.A09.getValue()).A0C(AbstractC167027dH.A01(interfaceC09390do));
        }
        C0f9.A09(1342837159, A02);
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onResume() {
        int A02 = C0f9.A02(-1860705547);
        super.onResume();
        A00(this).A14((C1I4) this.A0C.getValue());
        ((C41711wL) this.A09.getValue()).A0C(4);
        A03(this);
        C0f9.A09(-1459199260, A02);
    }
}
