package X;

import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.contentnotes.domain.immersivereply.ContentNotesImmersiveReplyContent;
import com.instagram.contentnotes.ui.immersivereply.ImmersiveReplyControlMenuViewBinder;
import com.instagram.ui.text.backinterceptedittext.BackInterceptEditText;
import com.instagram.ui.widget.bouncyufibutton.IgBouncyUfiButtonImageView;

/* renamed from: X.BrX, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C26750BrX extends AbstractC59962oe {
    public static final String __redex_internal_original_name = "ContentNotesImmersiveReplyFragment";
    public CT8 A00;
    public final InterfaceC11380iw A01;
    public final InterfaceC09390do A02;
    public final InterfaceC09390do A03;
    public final InterfaceC09390do A04;
    public final InterfaceC09390do A06;
    public final InterfaceC09390do A07;
    public final InterfaceC09390do A08;
    public final InterfaceC09390do A09;
    public final InterfaceC09390do A0A;
    public final InterfaceC09390do A0B;
    public final InterfaceC09390do A0C;
    public final InterfaceC09390do A0E;
    public final InterfaceC09390do A0D = AbstractC60492pY.A02(this);
    public final InterfaceC09390do A05 = C29889DGd.A00(this, 44);

    public static final void A02(C26750BrX c26750BrX) {
        C00M onBackPressedDispatcher;
        C57312k6 A0S;
        InterfaceC16620sF mc8;
        CT8 ct8 = c26750BrX.A00;
        if (ct8 != null && C28425CgX.A00.A03(AbstractC166987dD.A0r(c26750BrX.A0D))) {
            C25854Bc9 c25854Bc9 = (C25854Bc9) c26750BrX.A08.getValue();
            String str = C25861BcG.A00(c26750BrX).A02.A08;
            C14360o3.A0B(str, 0);
            C47527Kyu c47527Kyu = new C47527Kyu(c25854Bc9, str);
            C011504d A00 = AbstractC009003e.A00(ct8.A02);
            if (A00 != null && A00.A00.A0I(8)) {
                FragmentActivity activity = c26750BrX.getActivity();
                if (activity != null) {
                    A0S = AbstractC25235BEs.A0S(c26750BrX);
                    mc8 = new MCP(ct8, activity, c26750BrX, c47527Kyu, null, 39);
                } else {
                    return;
                }
            } else {
                A0S = AbstractC25235BEs.A0S(c26750BrX);
                mc8 = new MC8(c47527Kyu, c26750BrX, ct8, null, 36);
            }
            AbstractC166987dD.A1Z(mc8, A0S);
            return;
        }
        FragmentActivity activity2 = c26750BrX.getActivity();
        if (activity2 == null || (onBackPressedDispatcher = activity2.getOnBackPressedDispatcher()) == null) {
            return;
        }
        onBackPressedDispatcher.A04();
    }

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return __redex_internal_original_name;
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        View view2;
        String A0r;
        long j;
        C14360o3.A0B(view, 0);
        super.onViewCreated(view, bundle);
        View A0S = AbstractC166997dE.A0S(view, R.id.immersive_reply_fragment);
        ViewOnClickListenerC28667ClF.A01(A0S, 29, this);
        FragmentActivity activity = getActivity();
        if (activity != null) {
            view2 = activity.findViewById(R.id.layout_container_parent);
        } else {
            view2 = null;
        }
        C28425CgX c28425CgX = C28425CgX.A00;
        InterfaceC09390do interfaceC09390do = this.A0D;
        if (!c28425CgX.A03(AbstractC166987dD.A0r(interfaceC09390do))) {
            int A09 = AbstractC167007dF.A09(getContext(), R.attr.igds_color_dimmer);
            if (view2 != null) {
                view2.setBackgroundColor(A09);
            }
        }
        View A0S2 = AbstractC166997dE.A0S(view, R.id.immersive_reply_three_dot_menu);
        ImmersiveReplyControlMenuViewBinder immersiveReplyControlMenuViewBinder = (ImmersiveReplyControlMenuViewBinder) this.A03.getValue();
        UserSession userSession = immersiveReplyControlMenuViewBinder.A02;
        C06090Tz c06090Tz = C06090Tz.A05;
        if (!C18U.A06(c06090Tz, userSession, 36323096769407966L)) {
            A0S2.setVisibility(8);
        } else {
            A0S2.setVisibility(0);
            C0fQ.A00(new ViewOnClickListenerC28668ClG(18, A0S2, immersiveReplyControlMenuViewBinder), A0S2);
        }
        BackInterceptEditText backInterceptEditText = (BackInterceptEditText) AbstractC166997dE.A0S(view, R.id.reply_edit_text);
        boolean z = C25861BcG.A00(this).A0F;
        Resources A0N = AbstractC166997dE.A0N(this);
        if (z) {
            A0r = A0N.getString(2131956722);
        } else {
            A0r = AbstractC166997dE.A0r(A0N, C25861BcG.A00(this).A06, 2131956723);
        }
        backInterceptEditText.setHint(A0r);
        backInterceptEditText.setOnBackCallback(new C29889DGd(this, 46));
        backInterceptEditText.addTextChangedListener(new C28580CjL(AbstractC166987dD.A0r(interfaceC09390do), C25861BcG.A00(this)));
        View A0S3 = AbstractC166997dE.A0S(view, R.id.reply_note_bubble);
        Object value = this.A0B.getValue();
        C07S c07s = C07S.STARTED;
        C07X viewLifecycleOwner = getViewLifecycleOwner();
        C57312k6 A00 = C07Y.A00(viewLifecycleOwner);
        JTH jth = new JTH(value, this, A0S3, c07s, viewLifecycleOwner, (InterfaceC23621Ds) null, 27);
        AnonymousClass191 anonymousClass191 = AnonymousClass191.A00;
        AbstractC23641Du.A05(anonymousClass191, jth, A00);
        View A0S4 = AbstractC166997dE.A0S(view, R.id.reply_mimicry_bubble);
        View A0S5 = AbstractC166997dE.A0S(view, R.id.immersive_reply_container);
        TextView textView = (TextView) AbstractC166997dE.A0S(view, R.id.context_text_view);
        View A0S6 = AbstractC166997dE.A0S(view, R.id.group_reply_recipients_container);
        View findViewById = A0S5.findViewById(R.id.note_quick_reply_message_container);
        ViewGroup viewGroup = (ViewGroup) AbstractC166997dE.A0S(view, R.id.quick_emoji_reply_container);
        C14360o3.A0A(findViewById);
        CT8 ct8 = new CT8(view2, A0S, A0S5, A0S3, textView, findViewById, A0S4, A0S6, backInterceptEditText);
        this.A00 = ct8;
        C29206CuB c29206CuB = new C29206CuB(this, AbstractC166987dD.A0r(interfaceC09390do), (C27822COl) A00(this).A07.getValue(), ct8, AbstractC25235BEs.A0S(this), C25861BcG.A00(this).A0G, C25861BcG.A00(this).A0H);
        C07X viewLifecycleOwner2 = getViewLifecycleOwner();
        AbstractC23641Du.A05(anonymousClass191, new JTH(c29206CuB, this, A0S4, c07s, viewLifecycleOwner2, (InterfaceC23621Ds) null, 26), C07Y.A00(viewLifecycleOwner2));
        C47530Kyx c47530Kyx = (C47530Kyx) this.A06.getValue();
        ContentNotesImmersiveReplyContent A002 = C25861BcG.A00(this);
        boolean A1R = AbstractC167007dF.A1R(0, textView, A002);
        if (A002.A0F) {
            textView.setVisibility(8);
        } else {
            String str = A002.A06;
            if (str.length() == 0) {
                str = A002.A0A;
            }
            String string = textView.getResources().getString(2131956747, str, A002.A09);
            C14360o3.A07(string);
            SpannableStringBuilder A0H = AbstractC25225BEi.A0H(string);
            A0H.setSpan(new C46061KaI(c47530Kyx, AbstractC53242c7.A0F(textView.getContext(), R.attr.textColorOnMedia)), 0, AbstractC167007dF.A0A(str), 33);
            textView.setText(SpannableString.valueOf(A0H));
            AbstractC25227BEk.A11(textView);
        }
        boolean z2 = C25861BcG.A00(this).A0F;
        AbstractC12990ll A0o = AbstractC166987dD.A0o(interfaceC09390do);
        if (z2) {
            C14360o3.A0B(A0o, 0);
            j = 36328164830493980L;
        } else {
            C14360o3.A0B(A0o, 0);
            j = 36323096769866725L;
        }
        if (C18U.A06(c06090Tz, A0o, j)) {
            Object value2 = this.A0A.getValue();
            int dimensionPixelSize = AbstractC166997dE.A0N(this).getDimensionPixelSize(R.dimen.asset_picker_section_title_horizontal_padding);
            int A06 = AbstractC167017dG.A06(requireContext());
            UserSession A0r2 = AbstractC166987dD.A0r(interfaceC09390do);
            AbstractC167007dF.A1F(viewGroup, 0, A0r2);
            viewGroup.setVisibility(0);
            AbstractC47991LKc.A03(viewGroup, this, A0r2, new C25344BJn(value2, 21), dimensionPixelSize, A06);
            backInterceptEditText.addTextChangedListener(new C55346Oi6(viewGroup, 2));
        }
        ViewGroup viewGroup2 = (ViewGroup) AbstractC166997dE.A0R(view, R.id.row_thread_composer_send_button_container);
        Object value3 = this.A0C.getValue();
        C14360o3.A0B(viewGroup2, 0);
        C0fQ.A00(new ViewOnClickListenerC28665ClD(5, viewGroup2, backInterceptEditText, value3), viewGroup2);
        C148396m9 c148396m9 = new C148396m9(viewGroup2);
        Context A0L = AbstractC166997dE.A0L(viewGroup2);
        c148396m9.A00(C1QI.A0B(A0L, null).getDefaultColor(), false);
        c148396m9.A02.getDrawable().setTint(C1QI.A0C(A0L, null).getDefaultColor());
        backInterceptEditText.addTextChangedListener(new LO2(c148396m9, A1R ? 1 : 0));
        C07X viewLifecycleOwner3 = getViewLifecycleOwner();
        AbstractC23641Du.A05(anonymousClass191, new MC8(c07s, this, viewLifecycleOwner3, null, 35), C07Y.A00(viewLifecycleOwner3));
        IgBouncyUfiButtonImageView igBouncyUfiButtonImageView = (IgBouncyUfiButtonImageView) AbstractC166997dE.A0R(view, R.id.note_like_button);
        if (C25861BcG.A00(this).A0F) {
            igBouncyUfiButtonImageView.setVisibility(8);
        } else {
            C48766LhZ c48766LhZ = new C48766LhZ(this, 0);
            C25861BcG A003 = A00(this);
            C05A c05a = A003.A0B;
            C4F0 c4f0 = A003.A02;
            ContentNotesImmersiveReplyContent contentNotesImmersiveReplyContent = A003.A03;
            AbstractC166997dE.A1Y(c05a, c4f0.A04(contentNotesImmersiveReplyContent.A02.A08, contentNotesImmersiveReplyContent.A07));
            AbstractC23641Du.A05(anonymousClass191, new MBT(A003, null, 40), AbstractC141776au.A00(A003));
            ((L8P) this.A07.getValue()).A01(null, igBouncyUfiButtonImageView);
            C07S c07s2 = C07S.RESUMED;
            C07X viewLifecycleOwner4 = getViewLifecycleOwner();
            AbstractC23641Du.A05(anonymousClass191, new JTH(c48766LhZ, this, igBouncyUfiButtonImageView, c07s2, viewLifecycleOwner4, (InterfaceC23621Ds) null, 25), C07Y.A00(viewLifecycleOwner4));
            backInterceptEditText.addTextChangedListener(new VBB(0, igBouncyUfiButtonImageView, this));
        }
        if (C25861BcG.A00(this).A0F) {
            CQE cqe = (CQE) this.A04.getValue();
            A0S6.setVisibility(0);
            RecyclerView recyclerView = (RecyclerView) A0S6.requireViewById(R.id.group_reply_recipients_recycler_view);
            Context context = recyclerView.getContext();
            LinearLayoutManager linearLayoutManager = new LinearLayoutManager(context);
            linearLayoutManager.A1o(0);
            recyclerView.setLayoutManager(linearLayoutManager);
            recyclerView.A10(new C3YB(0, context.getResources().getDimensionPixelSize(R.dimen.abc_button_inset_vertical_material)));
            recyclerView.setAdapter((C2UU) AbstractC166987dD.A17(cqe.A01));
            recyclerView.setVisibility(0);
        }
        int i = 8;
        if (C28425CgX.A00()) {
            C29208CuD c29208CuD = new C29208CuD(AbstractC166987dD.A0r(interfaceC09390do), C25861BcG.A00(this).A01, (CTu) A00(this).A04.getValue(), ct8, new C27984CVh(requireActivity(), C25861BcG.A00(this).A0H), C25861BcG.A00(this).A0F);
            View view3 = ct8.A07;
            if (!C25861BcG.A00(this).A0F) {
                i = 4;
            }
            view3.setVisibility(i);
            if (c28425CgX.A03(AbstractC166987dD.A0r(interfaceC09390do))) {
                ct8.A06.setVisibility(4);
            }
            ct8.A08.requestFocus();
            VSR.A00(ct8.A02, ct8.A00, (C3I9) AbstractC166987dD.A17(this.A05), c29208CuD);
            new C011904h(requireActivity().getWindow().getDecorView(), requireActivity().getWindow()).A00.A03(8);
        } else {
            View view4 = ct8.A07;
            if (!C25861BcG.A00(this).A0F) {
                i = 0;
            }
            view4.setVisibility(i);
            View view5 = ct8.A02;
            View view6 = ct8.A01;
            C3I9 c3i9 = (C3I9) AbstractC166987dD.A17(this.A05);
            C50260MHp c50260MHp = new C50260MHp(this, 6);
            C14360o3.A0B(c3i9, 2);
            view6.requestFocus();
            c3i9.A9e(new C70826Whj(0, view5, c50260MHp));
            F3X.A00(ct8.A08);
            AbstractC23641Du.A05(anonymousClass191, new MBT(this, null, 41), AbstractC25235BEs.A0S(this));
        }
        AbstractC25651Mw.A00(AbstractC166987dD.A0o(interfaceC09390do)).E4s(new C3IJ(AbstractC25229BEm.A0f(this.A02).A08));
        C07X viewLifecycleOwner5 = getViewLifecycleOwner();
        AbstractC23641Du.A05(anonymousClass191, new MC8(c07s, this, viewLifecycleOwner5, null, 37), C07Y.A00(viewLifecycleOwner5));
        C07X viewLifecycleOwner6 = getViewLifecycleOwner();
        AbstractC23641Du.A05(anonymousClass191, new MC8(c07s, this, viewLifecycleOwner6, null, 38), C07Y.A00(viewLifecycleOwner6));
    }

    public static final C25861BcG A00(C26750BrX c26750BrX) {
        return (C25861BcG) c26750BrX.A0E.getValue();
    }

    public static final C60962qK A01(C26750BrX c26750BrX) {
        InterfaceC09390do interfaceC09390do = c26750BrX.A02;
        return AbstractC60952qJ.A01(AbstractC25229BEm.A0f(interfaceC09390do).A04, ((ContentNotesImmersiveReplyContent) interfaceC09390do.getValue()).A0D, ((ContentNotesImmersiveReplyContent) interfaceC09390do.getValue()).A0E);
    }

    @Override // X.AbstractC59962oe
    public final /* bridge */ /* synthetic */ AbstractC18680vv getSession() {
        return AbstractC166987dD.A0n(this.A0D);
    }

    public C26750BrX() {
        C50156MDj A1E = AbstractC25225BEi.A1E(this, 6);
        C50156MDj A1E2 = AbstractC25225BEi.A1E(this, 3);
        EnumC09460dv enumC09460dv = EnumC09460dv.A02;
        InterfaceC09390do A00 = AbstractC09440dt.A00(enumC09460dv, AbstractC25225BEi.A1E(A1E2, 4));
        this.A0E = AbstractC25225BEi.A0a(AbstractC25225BEi.A1E(A00, 5), A1E, C29899DGn.A00(null, A00, 39), AbstractC25225BEi.A1D(C25861BcG.class));
        this.A02 = DH6.A01(this, "note_content", enumC09460dv, 27);
        this.A09 = C29889DGd.A00(this, 48);
        this.A0B = C1XM.A00(AbstractC25225BEi.A1E(this, 0));
        this.A03 = C29889DGd.A00(this, 42);
        this.A06 = C29889DGd.A00(this, 45);
        this.A07 = C1XM.A00(DBD.A00);
        this.A0C = C1XM.A00(AbstractC25225BEi.A1E(this, 1));
        this.A0A = C29889DGd.A00(this, 49);
        this.A04 = C29889DGd.A00(this, 43);
        this.A08 = AbstractC25225BEi.A0a(AbstractC25225BEi.A1E(this, 2), new C29889DGd(this, 47), C29899DGn.A00(null, this, 38), AbstractC25225BEi.A1D(C25854Bc9.class));
        this.A01 = new C19270xB(__redex_internal_original_name);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        int A02 = C0f9.A02(1219971196);
        super.onCreate(bundle);
        ((C3I9) AbstractC166987dD.A17(this.A05)).Dnr(requireActivity());
        ((C25854Bc9) this.A08.getValue()).A00(AbstractC25229BEm.A0f(this.A02).A08);
        C0f9.A09(-1761642376, A02);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(911930905);
        C14360o3.A0B(layoutInflater, 0);
        C28425CgX.A00.A02(getActivity(), AbstractC166987dD.A0r(this.A0D), C25861BcG.A00(this).A0H);
        View inflate = layoutInflater.inflate(R.layout.content_notes_immersive_reply_fragment, viewGroup, false);
        C0f9.A09(1973851314, A02);
        return inflate;
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onDestroy() {
        int A02 = C0f9.A02(-1633050650);
        if (!((CT4) A00(this).A08.getValue()).A01 && !C28425CgX.A00.A03(AbstractC166987dD.A0r(this.A0D))) {
            ((C25854Bc9) this.A08.getValue()).A01(AbstractC25229BEm.A0f(this.A02).A08, null);
        }
        super.onDestroy();
        C0f9.A09(-651286905, A02);
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        int A02 = C0f9.A02(-2127023854);
        this.A00 = null;
        super.onDestroyView();
        C0f9.A09(-1494675934, A02);
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onResume() {
        int A02 = C0f9.A02(-243049877);
        super.onResume();
        if (((C27935CSu) A00(this).A05.getValue()).A01) {
            CT8 ct8 = this.A00;
            if (ct8 != null) {
                F3X.A00(ct8.A08);
            }
            ((C27935CSu) A00(this).A05.getValue()).A01 = false;
        }
        C0f9.A09(-490838786, A02);
    }
}
