package X;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.Editable;
import android.text.SpannableStringBuilder;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.R;
import com.facebook.graphql.calls.GraphQlCallInput;
import com.facebook.pando.PandoGraphQLRequest;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.base.IgEditText;
import com.instagram.common.ui.base.IgTextView;
import com.instagram.debug.devoptions.avatars.ImmersiveAvatarViewerDebugFragment;
import com.instagram.direct.fragment.writewithai.PromptPills;
import com.instagram.direct.fragment.writewithai.RewriteTextBubbleViewPager;
import com.instagram.igds.components.mediabutton.IgdsMediaButton;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes8.dex */
public final class KBZ extends AbstractC59962oe {
    public static final String __redex_internal_original_name = "WriteWithAIFragment";
    public int A00;
    public int A02;
    public IgEditText A03;
    public IgTextView A04;
    public IgTextView A05;
    public InterfaceC60152ox A06;
    public C3I9 A07;
    public C7F3 A08;
    public PromptPills A09;
    public RewriteTextBubbleViewPager A0A;
    public C47812L9u A0B;
    public L1P A0C;
    public IgdsMediaButton A0D;
    public List A0F;
    public List A0G;
    public boolean A0H;
    public boolean A0I;
    public boolean A0J;
    public boolean A0K;
    public final String A0L;
    public final InterfaceC09390do A0N;
    public final String A0O;
    public int A01 = -1;
    public final InterfaceC09390do A0M = AbstractC60492pY.A02(this);
    public String A0E = "";

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        int i;
        String[] strArr;
        String str;
        Integer[] numArr;
        int i2;
        String str2;
        Drawable mutate;
        Drawable mutate2;
        String str3;
        String string;
        RewriteTextBubbleViewPager rewriteTextBubbleViewPager;
        Drawable mutate3;
        Drawable mutate4;
        EnumC33519Ers enumC33519Ers;
        C14360o3.A0B(view, 0);
        super.onViewCreated(view, bundle);
        InterfaceC09390do interfaceC09390do = this.A0M;
        this.A08 = new C7F3(AbstractC166987dD.A0r(interfaceC09390do));
        Bundle bundle2 = this.mArguments;
        if (bundle2 != null) {
            this.A0K = bundle2.getBoolean(AbstractC111324zv.A00(3925));
            this.A0J = bundle2.getBoolean("arg_is_e2ee");
            this.A0E = AbstractC31172DnG.A13(bundle2, AbstractC111324zv.A00(1930));
            this.A0H = bundle2.getBoolean(AbstractC111324zv.A00(3923));
        }
        Bundle bundle3 = this.mArguments;
        boolean z = false;
        if (bundle3 != null) {
            i = bundle3.getInt(AbstractC111324zv.A00(3924));
        } else {
            i = 0;
        }
        this.A00 = i;
        C7F3 c7f3 = this.A08;
        if (c7f3 != null) {
            boolean z2 = this.A0K;
            boolean z3 = this.A0J;
            String str4 = this.A0E;
            String str5 = this.A0L;
            boolean z4 = this.A0H;
            C25531Mh A0H = AbstractC31172DnG.A0H(c7f3);
            EnumC72433Xdd A00 = C7F3.A00(z3, z2);
            if (z4) {
                enumC33519Ers = EnumC33519Ers.A0K;
            } else {
                enumC33519Ers = EnumC33519Ers.A0L;
            }
            if (AbstractC25226BEj.A1Z(A0H)) {
                A0H.A0Z(27);
                A0H.A0X(1);
                A0H.A0M(enumC33519Ers, ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY);
                JQ0.A15(A00, A0H, str4, z3);
                A0H.A0R("creation_session_id", str5);
                A0H.Cht();
            }
        }
        Context context = view.getContext();
        if ((context.getResources().getConfiguration().uiMode & 48) == 32) {
            z = true;
        }
        this.A0I = z;
        View requireViewById = view.requireViewById(R.id.cancel_nav_button_text);
        if (requireViewById != null) {
            ViewOnClickListenerC48072LPx.A01(requireViewById, 45, this);
        }
        IgTextView A0X = AbstractC31172DnG.A0X(view, R.id.apply_nav_button_text);
        this.A04 = A0X;
        if (A0X != null) {
            ViewOnClickListenerC48072LPx.A01(A0X, 46, this);
        }
        Drawable drawable = context.getDrawable(R.drawable.instagram_arrow_right_pano_filled_24);
        Drawable drawable2 = context.getDrawable(R.drawable.instagram_arrow_cw_pano_outline_24);
        if (drawable2 != null && (mutate4 = drawable2.mutate()) != null) {
            AbstractC25228BEl.A1H(PorterDuff.Mode.SRC_IN, mutate4, -16777216);
        }
        if (drawable != null && (mutate3 = drawable.mutate()) != null) {
            AbstractC25228BEl.A1H(PorterDuff.Mode.SRC_IN, mutate3, -1);
        }
        View requireViewById2 = view.requireViewById(R.id.rewrite_text_view_pager);
        C14360o3.A0C(requireViewById2, "null cannot be cast to non-null type com.instagram.direct.fragment.writewithai.RewriteTextBubbleViewPager");
        RewriteTextBubbleViewPager rewriteTextBubbleViewPager2 = (RewriteTextBubbleViewPager) requireViewById2;
        this.A0A = rewriteTextBubbleViewPager2;
        if (rewriteTextBubbleViewPager2 != null) {
            rewriteTextBubbleViewPager2.setApplyReWrite(new C37058GUs(this, 16));
        }
        RewriteTextBubbleViewPager rewriteTextBubbleViewPager3 = this.A0A;
        if (rewriteTextBubbleViewPager3 != null) {
            rewriteTextBubbleViewPager3.setBotResponseFeedbackController(new LEU(context, this, AbstractC166987dD.A0r(interfaceC09390do)));
        }
        RewriteTextBubbleViewPager rewriteTextBubbleViewPager4 = this.A0A;
        if (rewriteTextBubbleViewPager4 != null) {
            rewriteTextBubbleViewPager4.A01 = new C48725Lgt(this);
        }
        Bundle bundle4 = this.mArguments;
        if (bundle4 != null && (string = bundle4.getString(AbstractC111324zv.A00(3922))) != null && (rewriteTextBubbleViewPager = this.A0A) != null) {
            rewriteTextBubbleViewPager.A0T(null, string, null, "", string);
        }
        RewriteTextBubbleViewPager rewriteTextBubbleViewPager5 = this.A0A;
        if (rewriteTextBubbleViewPager5 != null) {
            rewriteTextBubbleViewPager5.setScrollMode(EnumC74213Va.A02);
        }
        this.A0B = new C47812L9u(context, AbstractC166997dE.A0S(view, R.id.text_bubble_container), AbstractC166987dD.A0r(interfaceC09390do), this.A0A);
        this.A03 = (IgEditText) view.requireViewById(R.id.custom_prompt);
        AbstractC12990ll A0o = AbstractC166987dD.A0o(interfaceC09390do);
        C06090Tz c06090Tz = C06090Tz.A05;
        if (C18U.A06(c06090Tz, A0o, 36323448956005633L)) {
            AbstractC166987dD.A1Z(new MBo(this, null, 49), AbstractC25229BEm.A0a(this));
            C44520JmQ c44520JmQ = (C44520JmQ) this.A0N.getValue();
            c44520JmQ.A00 = C0eM.A1H(c44520JmQ.A03).listIterator();
            c44520JmQ.A01.post(c44520JmQ.A02);
            IgEditText igEditText = this.A03;
            if (igEditText != null) {
                ViewOnClickListenerC48066LPr.A00(igEditText, 55, drawable2, this);
            }
        }
        IgdsMediaButton igdsMediaButton = (IgdsMediaButton) view.requireViewById(R.id.apply_custom_prompt_button);
        this.A0D = igdsMediaButton;
        if (igdsMediaButton != null) {
            igdsMediaButton.setSize(EnumC151046r5.A04);
        }
        IgdsMediaButton igdsMediaButton2 = this.A0D;
        IgEditText igEditText2 = this.A03;
        if (igEditText2 != null) {
            A04(this, this.A00);
            this.A06 = new C48548Ldl(this, 6);
            C3I8 A01 = C3I7.A01(igEditText2, false, true);
            this.A07 = A01;
            A01.A9e(this.A06);
            C3I9 c3i9 = this.A07;
            if (c3i9 != null) {
                c3i9.Dnr(requireActivity());
            }
            igEditText2.requestFocus();
        }
        IgEditText igEditText3 = this.A03;
        if (igEditText3 != null) {
            igEditText3.addTextChangedListener(new WKW(0, drawable2, drawable, this));
        }
        IgdsMediaButton igdsMediaButton3 = this.A0D;
        if (igdsMediaButton3 != null) {
            ViewOnClickListenerC48068LPt.A00(igdsMediaButton3, this, igdsMediaButton2, drawable2, 12);
        }
        this.A09 = (PromptPills) view.requireViewById(R.id.write_with_ai_model_prompt_selections);
        char c = 4;
        if (C18U.A06(c06090Tz, AbstractC166987dD.A0o(interfaceC09390do), 36323448956071170L)) {
            strArr = new String[8];
            strArr[0] = requireContext().getString(2131972349);
            strArr[1] = requireContext().getString(2131965987);
            strArr[2] = requireContext().getString(2131952305);
            strArr[3] = requireContext().getString(2131952350);
            strArr[4] = requireContext().getString(2131965991);
            strArr[5] = requireContext().getString(2131965992);
            strArr[6] = requireContext().getString(2131962657);
            c = 7;
            str = requireContext().getString(2131965993);
        } else {
            strArr = new String[5];
            strArr[0] = "Rephrase";
            strArr[1] = "Make funnier";
            strArr[2] = "Shorten";
            strArr[3] = "Make supportive";
            str = "Add emojis";
        }
        strArr[c] = str;
        this.A0G = AbstractC16960so.A1Q(strArr);
        int i3 = 4;
        if (C18U.A06(c06090Tz, AbstractC166987dD.A0o(interfaceC09390do), 36323448956071170L)) {
            numArr = new Integer[8];
            AbstractC25235BEs.A1R(numArr, R.drawable.instagram_edit_pano_filled_24, 0);
            AbstractC25235BEs.A1R(numArr, R.drawable.instagram_face1_pano_filled_24, 1);
            AbstractC25235BEs.A1R(numArr, R.drawable.instagram_face2_gen_ai_pano_filled_24, 2);
            AbstractC25235BEs.A1R(numArr, R.drawable.instagram_cheese_pano_filled_24, 3);
            AbstractC25235BEs.A1R(numArr, R.drawable.instagram_face7_pano_filled_24, 4);
            AbstractC25235BEs.A1R(numArr, R.drawable.instagram_scissors_pano_filled_24, 5);
            AbstractC25235BEs.A1R(numArr, R.drawable.instagram_search_pano_filled_24, 6);
            i3 = 7;
            i2 = R.drawable.instagram_heart_pano_filled_24;
        } else {
            numArr = new Integer[5];
            AbstractC25235BEs.A1R(numArr, R.drawable.instagram_rotate_pano_outline_24, 0);
            AbstractC25235BEs.A1R(numArr, R.drawable.instagram_face1_pano_outline_24, 1);
            AbstractC25235BEs.A1R(numArr, R.drawable.instagram_scissors_pano_outline_24, 2);
            AbstractC25235BEs.A1R(numArr, R.drawable.instagram_heart_pano_outline_24, 3);
            i2 = R.drawable.instagram_face_filter_pano_outline_24;
        }
        AbstractC25235BEs.A1R(numArr, i2, i3);
        this.A0F = AbstractC16960so.A1Q(numArr);
        List list = this.A0G;
        if (list == null) {
            str3 = "prompts";
        } else {
            ArrayList A0q = AbstractC167017dG.A0q(list);
            int i4 = 0;
            for (Object obj : list) {
                int i5 = i4 + 1;
                if (i4 < 0) {
                    AbstractC16960so.A1U();
                    throw C00O.createAndThrow();
                }
                String str6 = (String) obj;
                List list2 = this.A0F;
                if (list2 == null) {
                    str3 = "promptIcons";
                } else {
                    A0q.add(new C32071E6x(str6, AbstractC31176DnK.A01(list2, i4), 11));
                    i4 = i5;
                }
            }
            PromptPills promptPills = this.A09;
            if (promptPills != null) {
                promptPills.setPills(A0q, this.A01, new C50363MLp(23, drawable2, this));
            }
            if (this.A0I) {
                IgTextView igTextView = this.A04;
                if (igTextView != null) {
                    igTextView.setTextColor(-1);
                }
                Drawable drawable3 = context.getDrawable(R.drawable.text_view_rounded_corner_dark_mode);
                IgEditText igEditText4 = this.A03;
                if (igEditText4 != null) {
                    igEditText4.setBackground(drawable3);
                }
                if (drawable2 != null && (mutate2 = drawable2.mutate()) != null) {
                    AbstractC25228BEl.A1H(PorterDuff.Mode.SRC_IN, mutate2, -1);
                }
                if (drawable != null && (mutate = drawable.mutate()) != null) {
                    AbstractC25228BEl.A1H(PorterDuff.Mode.SRC_IN, mutate, -16777216);
                }
            }
            if (AbstractC25230BEn.A0l(interfaceC09390do).A01.getBoolean("has_seen_write_with_ai_disclaimer_igd", false)) {
                if (C18U.A06(c06090Tz, AbstractC166987dD.A0o(interfaceC09390do), 36323448955743487L)) {
                    RewriteTextBubbleViewPager rewriteTextBubbleViewPager6 = this.A0A;
                    if (rewriteTextBubbleViewPager6 == null || (str2 = rewriteTextBubbleViewPager6.getTextToRewriteFromCurrentPage()) == null) {
                        str2 = "";
                    }
                    IgEditText igEditText5 = this.A03;
                    if (igEditText5 != null) {
                        igEditText5.setText(AbstractC25225BEi.A0H(requireContext().getString(2131972349)));
                    }
                    C47812L9u c47812L9u = this.A0B;
                    if (c47812L9u != null) {
                        C37058GUs c37058GUs = new C37058GUs(this, 14);
                        C50359MLl c50359MLl = new C50359MLl(this, 34);
                        UserSession userSession = c47812L9u.A05;
                        C40701ud A012 = AbstractC40691uc.A01(userSession);
                        C04060Jx c04060Jx = GraphQlCallInput.A02;
                        C0CA A0T = AbstractC25227BEk.A0T(c04060Jx, "REPHRASE", "modifier_type");
                        C0CA.A00(A0T, Integer.valueOf(AbstractC25225BEi.A07(c06090Tz, userSession, 36604923932644529L)), "num_options");
                        C0CA A0T2 = AbstractC25227BEk.A0T(c04060Jx, "IG_DIRECT", "caller");
                        C0CA.A00(A0T2, str2, "content");
                        C0CA.A00(A0T2, "IGD__THREAD__WRITE_WITH_AI", "entrypoint");
                        A0T2.A0E(A0T, "plugin_request_options");
                        C2JM A0b = AbstractC25225BEi.A0b();
                        PandoGraphQLRequest pandoGraphQLRequest = new PandoGraphQLRequest(AbstractC25233BEq.A0H(A0T2, A0b, "params"), "GenAIWriteWithAIQuery", A0b.getParamsCopy(), AbstractC25225BEi.A0b().getParamsCopy(), C59462Qex.class, false, null, 0, null, "xfb_genai_write_with_ai_query", AbstractC166987dD.A1E());
                        c47812L9u.A00.A02("REPHRASE");
                        c47812L9u.A00();
                        A012.ATW(new C48147LSw(c47812L9u, c37058GUs, c50359MLl, 4), new C28913CpN(c37058GUs, c50359MLl, c47812L9u, str2, 0), pandoGraphQLRequest, new ExecutorC14110nb(1316683298));
                        return;
                    }
                    return;
                }
                return;
            }
            View A0U = AbstractC167017dG.A0U(view, R.id.meta_ai_nux_disclaimer);
            C14360o3.A0C(A0U, "null cannot be cast to non-null type com.instagram.common.ui.base.IgTextView");
            IgTextView igTextView2 = (IgTextView) A0U;
            this.A05 = igTextView2;
            if (igTextView2 != null) {
                AbstractC25227BEk.A11(igTextView2);
            }
            C46061KaI c46061KaI = new C46061KaI(this, AbstractC25233BEq.A04(this));
            String A0p = AbstractC166997dE.A0p(context, 2131958919);
            SpannableStringBuilder A0H2 = AbstractC25225BEi.A0H(context.getString(2131958920));
            AnonymousClass773.A04(A0H2, c46061KaI, A0p);
            IgTextView igTextView3 = this.A05;
            if (igTextView3 != null) {
                igTextView3.setText(A0H2);
            }
            AbstractC31177DnL.A1N(AbstractC25230BEn.A0l(interfaceC09390do).A01, "has_seen_write_with_ai_disclaimer_igd", true);
            return;
        }
        C14360o3.A0F(str3);
        throw C00O.createAndThrow();
    }

    public static final void A00(Drawable drawable, KBZ kbz, IgdsMediaButton igdsMediaButton) {
        Editable editable;
        String str;
        EnumC33519Ers enumC33519Ers;
        if (igdsMediaButton != null && igdsMediaButton.isEnabled()) {
            C7F3 c7f3 = kbz.A08;
            if (c7f3 != null) {
                boolean z = kbz.A0K;
                boolean z2 = kbz.A0J;
                String str2 = kbz.A0E;
                String str3 = kbz.A0L;
                boolean z3 = kbz.A0H;
                C25531Mh A0H = AbstractC31172DnG.A0H(c7f3);
                EnumC72433Xdd A00 = C7F3.A00(z2, z);
                if (z3) {
                    enumC33519Ers = EnumC33519Ers.A0K;
                } else {
                    enumC33519Ers = EnumC33519Ers.A0L;
                }
                if (AbstractC25226BEj.A1Z(A0H)) {
                    A0H.A0Z(27);
                    A0H.A0X(0);
                    A0H.A0R("selected_item", "generate");
                    A0H.A0M(enumC33519Ers, ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY);
                    JQ0.A15(A00, A0H, str2, z2);
                    A0H.A0R("creation_session_id", str3);
                    A0H.Cht();
                }
            }
            A02(kbz);
            IgEditText igEditText = kbz.A03;
            String str4 = null;
            if (igEditText != null) {
                editable = igEditText.getText();
            } else {
                editable = null;
            }
            String valueOf = String.valueOf(editable);
            RewriteTextBubbleViewPager rewriteTextBubbleViewPager = kbz.A0A;
            if (rewriteTextBubbleViewPager != null) {
                str = rewriteTextBubbleViewPager.getAppliedPromptOfCurrentPage();
            } else {
                str = null;
            }
            boolean A0K = C14360o3.A0K(str, valueOf);
            RewriteTextBubbleViewPager rewriteTextBubbleViewPager2 = kbz.A0A;
            if (A0K) {
                if (rewriteTextBubbleViewPager2 != null) {
                    str4 = rewriteTextBubbleViewPager2.getTextToRewriteFromOriginalPage();
                }
            } else if (rewriteTextBubbleViewPager2 != null) {
                str4 = rewriteTextBubbleViewPager2.getTextToRewriteFromCurrentPage();
            }
            C47812L9u c47812L9u = kbz.A0B;
            if (c47812L9u != null) {
                c47812L9u.A02(str4, valueOf, new C50170MDx(11, drawable, kbz), new C50359MLl(kbz, 36), true);
            }
        }
    }

    public static final void A01(KBZ kbz) {
        String str;
        EnumC33519Ers enumC33519Ers;
        C7F3 c7f3 = kbz.A08;
        if (c7f3 != null) {
            boolean z = kbz.A0K;
            boolean z2 = kbz.A0J;
            String str2 = kbz.A0E;
            String str3 = kbz.A0L;
            boolean z3 = kbz.A0H;
            C25531Mh A0H = AbstractC31172DnG.A0H(c7f3);
            if (z3) {
                enumC33519Ers = EnumC33519Ers.A0K;
            } else {
                enumC33519Ers = EnumC33519Ers.A0L;
            }
            EnumC72433Xdd A00 = C7F3.A00(z2, z);
            if (AbstractC25226BEj.A1Z(A0H)) {
                A0H.A0Z(27);
                A0H.A0X(0);
                A0H.A0R("selected_item", "apply");
                A0H.A0M(enumC33519Ers, ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY);
                JQ0.A15(A00, A0H, str2, z2);
                A0H.A0R("creation_session_id", str3);
                A0H.Cht();
            }
        }
        L1P l1p = kbz.A0C;
        if (l1p != null) {
            PromptPills promptPills = kbz.A09;
            if (promptPills != null && !promptPills.isEnabled()) {
                return;
            }
            RewriteTextBubbleViewPager rewriteTextBubbleViewPager = kbz.A0A;
            if (rewriteTextBubbleViewPager == null || (str = rewriteTextBubbleViewPager.getTextToRewriteFromCurrentPage()) == null) {
                str = "";
            }
            l1p.A01.invoke(str);
            l1p.A02.A00 = true;
            C189478aR c189478aR = l1p.A00.A00;
            if (c189478aR == null) {
                return;
            }
            c189478aR.A07();
        }
    }

    public static final void A02(KBZ kbz) {
        PromptPills promptPills = kbz.A09;
        if (promptPills != null) {
            promptPills.setEnabled(false);
        }
        PromptPills promptPills2 = kbz.A09;
        if (promptPills2 != null) {
            promptPills2.setAlpha(0.6f);
        }
        IgdsMediaButton igdsMediaButton = kbz.A0D;
        if (igdsMediaButton != null) {
            igdsMediaButton.setEnabled(false);
        }
        IgdsMediaButton igdsMediaButton2 = kbz.A0D;
        if (igdsMediaButton2 != null) {
            igdsMediaButton2.setAlpha(0.5f);
        }
        IgTextView igTextView = kbz.A04;
        if (igTextView != null) {
            igTextView.setEnabled(false);
        }
        IgTextView igTextView2 = kbz.A04;
        if (igTextView2 != null) {
            igTextView2.setAlpha(0.5f);
        }
    }

    public static final void A03(KBZ kbz) {
        PromptPills promptPills = kbz.A09;
        if (promptPills != null) {
            promptPills.setEnabled(true);
        }
        PromptPills promptPills2 = kbz.A09;
        if (promptPills2 != null) {
            promptPills2.setAlpha(1.0f);
        }
        IgdsMediaButton igdsMediaButton = kbz.A0D;
        if (igdsMediaButton != null) {
            igdsMediaButton.setEnabled(true);
        }
        IgdsMediaButton igdsMediaButton2 = kbz.A0D;
        if (igdsMediaButton2 != null) {
            igdsMediaButton2.setAlpha(1.0f);
        }
        IgTextView igTextView = kbz.A04;
        if (igTextView != null) {
            igTextView.setEnabled(true);
        }
        IgTextView igTextView2 = kbz.A04;
        if (igTextView2 != null) {
            igTextView2.setAlpha(1.0f);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v2, types: [X.6cX, java.lang.Object] */
    public final void A06(Drawable drawable) {
        IgdsMediaButton igdsMediaButton = this.A0D;
        if (igdsMediaButton != null) {
            igdsMediaButton.setButtonStyle(EnumC151036r4.A0A);
        }
        IgdsMediaButton igdsMediaButton2 = this.A0D;
        if (igdsMediaButton2 != 0) {
            ?? obj = new Object();
            obj.A01 = drawable;
            igdsMediaButton2.setStartAddOn(obj, null);
        }
        IgdsMediaButton igdsMediaButton3 = this.A0D;
        if (igdsMediaButton3 != null) {
            igdsMediaButton3.setPadding(0, 0, 0, 0);
        }
    }

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return this.A0O;
    }

    @Override // X.AbstractC59962oe
    public final /* bridge */ /* synthetic */ AbstractC18680vv getSession() {
        return AbstractC166987dD.A0n(this.A0M);
    }

    public KBZ() {
        InterfaceC09390do A00 = AbstractC09440dt.A00(EnumC09460dv.A02, new C37058GUs(new C37058GUs(this, 17), 18));
        C0YZ A1D = AbstractC25225BEi.A1D(C44520JmQ.class);
        this.A0N = AbstractC25225BEi.A0a(new C37058GUs(A00, 19), new C50170MDx(13, A00, this), new C50170MDx(12, null, A00), A1D);
        this.A0O = "write_with_ai_bottom_sheet_fragment";
        this.A0L = AbstractC25231BEo.A0p();
    }

    public static final void A04(KBZ kbz, int i) {
        double d;
        double A00 = (AbstractC13890nF.A00(kbz.requireContext()) * 0.95d) - i;
        RewriteTextBubbleViewPager rewriteTextBubbleViewPager = kbz.A0A;
        if (i == 0) {
            if (rewriteTextBubbleViewPager != null) {
                d = 0.6d;
            } else {
                return;
            }
        } else if (rewriteTextBubbleViewPager == null) {
            return;
        } else {
            d = 0.4d;
        }
        rewriteTextBubbleViewPager.setTextBubbleMaxHeight((int) (A00 * d));
    }

    public static final void A05(KBZ kbz, String str) {
        if (kbz.isAdded()) {
            C146106i8 A0X = AbstractC31173DnH.A0X(str);
            A0X.A02();
            A0X.A04();
            A0X.A07(R.drawable.instagram_report_pano_outline_24);
            A0X.A0O = true;
            A0X.A02 = kbz.A02;
            AbstractC25233BEq.A1F(A0X);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(-1840166696);
        C14360o3.A0B(layoutInflater, 0);
        View A0R = AbstractC25226BEj.A0R(layoutInflater, viewGroup, R.layout.write_with_ai_prompt, false);
        C0f9.A09(997779596, A02);
        return A0R;
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        int A02 = C0f9.A02(-1681850013);
        super.onDestroyView();
        this.A03 = null;
        this.A09 = null;
        this.A0D = null;
        this.A0C = null;
        this.A0A = null;
        this.A0B = null;
        C3I9 c3i9 = this.A07;
        if (c3i9 != null) {
            c3i9.onStop();
        }
        C3I9 c3i92 = this.A07;
        if (c3i92 != null) {
            c3i92.EFx(this.A06);
        }
        C0f9.A09(-991382011, A02);
    }
}
