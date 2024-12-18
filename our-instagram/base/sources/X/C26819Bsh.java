package X;

import android.content.Context;
import android.os.Bundle;
import android.text.Html;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;
import com.facebook.R;
import com.facebook.quicklog.reliability.UserFlowLoggerImpl;
import com.instagram.debug.devoptions.avatars.ImmersiveAvatarViewerDebugFragment;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.Bsh, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C26819Bsh extends AbstractC59962oe implements InterfaceC60072op, InterfaceC60122ou {
    public static final String __redex_internal_original_name = "CreatorInspirationHubFragment";
    public ViewPager2 A00;
    public C38925HBx A01;
    public KD0 A02;
    public C52159N6l A03;
    public C25947Bdr A04;
    public final InterfaceC09390do A05;
    public final InterfaceC09390do A06;
    public final InterfaceC09390do A07 = AbstractC60492pY.A02(this);
    public final InterfaceC09390do A08;

    @Override // X.InterfaceC60122ou
    public final void configureActionBar(InterfaceC56362iU interfaceC56362iU) {
        C14360o3.A0B(interfaceC56362iU, 0);
        interfaceC56362iU.setTitle(requireContext().getString(2131957170));
        C3LO c3lo = new C3LO();
        c3lo.A01 = R.drawable.instagram_arrow_left_pano_outline_24;
        interfaceC56362iU.Ehd(ViewOnClickListenerC28667ClF.A00(c3lo, this, 56));
        C3LO c3lo2 = new C3LO();
        c3lo2.A06 = R.drawable.instagram_new_post_pano_outline_24;
        c3lo2.A05 = 2131964503;
        ViewOnClickListenerC28667ClF.A02(c3lo2, interfaceC56362iU, this, 57);
    }

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return "creator_inspiration_hub_fragment";
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        String str;
        EnumC27427C8u enumC27427C8u;
        C14360o3.A0B(view, 0);
        super.onViewCreated(view, bundle);
        ArrayList A00 = A00(this);
        if (AbstractC167007dF.A1Z(this.A06)) {
            ViewPager2 viewPager2 = (ViewPager2) AbstractC56372iV.A01(view.requireViewById(R.id.view_pager_stub), false, false).getView();
            C25947Bdr c25947Bdr = new C25947Bdr(this, A00);
            this.A04 = c25947Bdr;
            viewPager2.setAdapter(c25947Bdr);
            viewPager2.setOffscreenPageLimit(A00.size() - 1);
            viewPager2.setUserInputEnabled(false);
            this.A00 = viewPager2;
            List A1Q = AbstractC16960so.A1Q(Integer.valueOf(R.id.creator_inspiration_hub_clips_fragment_container), Integer.valueOf(R.id.creator_inspiration_hub_audio_fragment_container), Integer.valueOf(R.id.creator_inspiration_hub_accounts_fragment_container));
            ArrayList A0q = AbstractC167017dG.A0q(A1Q);
            Iterator it = A1Q.iterator();
            while (it.hasNext()) {
                A0q.add(view.requireViewById(AbstractC167007dF.A0B(it)));
            }
            Iterator it2 = A0q.iterator();
            while (it2.hasNext()) {
                ((View) it2.next()).setVisibility(8);
            }
        }
        RecyclerView recyclerView = (RecyclerView) AbstractC166997dE.A0S(view, R.id.creator_inspiration_hub_pills);
        InterfaceC09390do interfaceC09390do = this.A05;
        C25863BcI c25863BcI = (C25863BcI) interfaceC09390do.getValue();
        Context requireContext = requireContext();
        Integer num = C05F.A00;
        Bundle bundle2 = this.mArguments;
        if (bundle2 != null) {
            str = bundle2.getString(AbstractC111324zv.A00(1256));
        } else {
            str = null;
        }
        if (!C14360o3.A0K(((C25863BcI) interfaceC09390do.getValue()).A03.getValue(), "")) {
            str = (String) ((C25863BcI) interfaceC09390do.getValue()).A03.getValue();
        } else if (str == null || str.equals("")) {
            if (C18U.A06(C06090Tz.A05, AbstractC166987dD.A0o(this.A07), 36323908517047991L)) {
                enumC27427C8u = EnumC27427C8u.A04;
            } else {
                enumC27427C8u = EnumC27427C8u.A05;
            }
            str = enumC27427C8u.A00;
        }
        c25863BcI.A01(requireContext, recyclerView, num, str, A00);
        AbstractC18560vj.A03(AbstractC25235BEs.A0S(this), new C15340po(new MC7((InterfaceC23621Ds) null, this, view, 49), ((C25863BcI) interfaceC09390do.getValue()).A03));
        Bundle bundle3 = this.mArguments;
        if (bundle3 != null && bundle3.getBoolean(AbstractC111324zv.A00(1269)) && !AbstractC25226BEj.A10(this.A08).A01.getBoolean("creator_inspiration_hub_toast_impression", false)) {
            C146106i8 c146106i8 = new C146106i8();
            c146106i8.A0D = Html.fromHtml(AbstractC166997dE.A0N(this).getString(2131957169));
            c146106i8.A01 = 5000;
            c146106i8.A0A(new C29314Cw9(this, 5));
            view.postDelayed(new D16(c146106i8), 3000L);
        }
    }

    @Override // X.AbstractC59962oe
    public final /* bridge */ /* synthetic */ AbstractC18680vv getSession() {
        return AbstractC166987dD.A0n(this.A07);
    }

    @Override // X.InterfaceC60072op
    public final boolean onBackPressed() {
        CVK A00 = CIN.A00(AbstractC166987dD.A0r(this.A07));
        String A002 = AbstractC111324zv.A00(1360);
        Long l = A00.A00;
        if (l != null) {
            ((UserFlowLoggerImpl) A00.A01.getValue()).flowEndCancel(l.longValue(), A002);
        }
        A00.A00 = null;
        return false;
    }

    public C26819Bsh() {
        C29771DBp c29771DBp = C29771DBp.A00;
        InterfaceC09390do A00 = AbstractC09440dt.A00(EnumC09460dv.A02, new D87(new D87(this, 0), 1));
        this.A05 = AbstractC25225BEi.A0a(new D87(A00, 2), c29771DBp, new C50169MDw(14, A00, null), AbstractC25225BEi.A1D(C25863BcI.class));
        this.A08 = AbstractC09440dt.A01(new D87(this, 3));
        this.A06 = C1XM.A00(C29887DGb.A00(this, 49));
    }

    public static final ArrayList A00(C26819Bsh c26819Bsh) {
        EnumC27427C8u enumC27427C8u;
        ArrayList A1E = AbstractC166987dD.A1E();
        InterfaceC09390do interfaceC09390do = c26819Bsh.A07;
        AbstractC12990ll A0o = AbstractC166987dD.A0o(interfaceC09390do);
        C06090Tz c06090Tz = C06090Tz.A05;
        if (C18U.A06(c06090Tz, A0o, 36323908517047991L)) {
            A1E.add(EnumC27427C8u.A04);
            enumC27427C8u = EnumC27427C8u.A05;
        } else {
            A1E.add(EnumC27427C8u.A05);
            enumC27427C8u = EnumC27427C8u.A04;
        }
        A1E.add(enumC27427C8u);
        if (!C18U.A06(c06090Tz, AbstractC166987dD.A0o(interfaceC09390do), 2342166917730610869L)) {
            A1E.add(EnumC27427C8u.A03);
        }
        return A1E;
    }

    /* JADX WARN: Code restructure failed: missing block: B:3:0x0009, code lost:
    
        if (r9 != 9683) goto L5;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:64:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:6:0x000e  */
    /* JADX WARN: Removed duplicated region for block: B:73:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:76:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r5v1, types: [java.util.AbstractCollection, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r5v2, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r5v7, types: [java.util.List] */
    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onActivityResult(int r8, int r9, android.content.Intent r10) {
        /*
            Method dump skipped, instructions count: 278
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C26819Bsh.onActivityResult(int, int, android.content.Intent):void");
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        int A02 = C0f9.A02(1905271897);
        super.onCreate(bundle);
        if (!AbstractC167007dF.A1Z(this.A06)) {
            this.A03 = new C52159N6l();
            this.A02 = new KD0();
            this.A01 = new C38925HBx();
        }
        C0f9.A09(-2124851143, A02);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        String str;
        int A02 = C0f9.A02(-1260925081);
        C14360o3.A0B(layoutInflater, 0);
        AbstractC12990ll A0o = AbstractC166987dD.A0o(this.A07);
        Bundle bundle2 = this.mArguments;
        if (bundle2 != null) {
            str = bundle2.getString(ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY);
        } else {
            str = null;
        }
        C14360o3.A0B(A0o, 0);
        InterfaceC02590Ai A0f = AbstractC166987dD.A0f(AbstractC12220kQ.A01(this, A0o), "instagram_organic_creator_inspiration_hub_load");
        if (A0f.isSampled()) {
            AbstractC25225BEi.A1O(A0f, "creator_inspiration_hub_fragment");
            A0f.AAP("inspiration_entry_point", str);
            AbstractC167017dG.A1C(A0f);
        }
        View inflate = layoutInflater.inflate(R.layout.creator_inspiration_hub_fragment, viewGroup, false);
        C0f9.A09(1321201329, A02);
        return inflate;
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        int A02 = C0f9.A02(-1778244377);
        super.onDestroyView();
        if (AbstractC167007dF.A1Z(this.A06)) {
            this.A00 = null;
        }
        C0f9.A09(-979681907, A02);
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onResume() {
        int A02 = C0f9.A02(-262957687);
        super.onResume();
        if (AbstractC72723Nt.A00(requireContext())) {
            AbstractC145016gM.A03(requireActivity(), this, AbstractC166987dD.A0r(this.A07), false, false);
        }
        C0f9.A09(-1928273173, A02);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onStop() {
        int A02 = C0f9.A02(1862000611);
        super.onStop();
        AbstractC145016gM.A04(requireActivity(), AbstractC166987dD.A0r(this.A07), false);
        C0f9.A09(-1240811701, A02);
    }
}
