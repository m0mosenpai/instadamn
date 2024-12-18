package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.ui.platform.ComposeView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.base.IgSimpleImageView;
import com.instagram.common.ui.base.IgTextView;
import com.instagram.igds.components.bottombutton.IgdsBottomButtonLayout;
import com.instagram.igds.components.search.IgdsInlineSearchBox;

/* loaded from: classes8.dex */
public final class KCS extends AbstractC59962oe implements InterfaceC60072op, InterfaceC50436MOq, MQw {
    public static final String __redex_internal_original_name = "DirectAiStickerTrayFragment";
    public int A00;
    public ConstraintLayout A01;
    public ConstraintLayout A02;
    public RecyclerView A03;
    public IgSimpleImageView A04;
    public IgTextView A05;
    public IgTextView A06;
    public L6D A07;
    public C47987LJp A08;
    public IgdsBottomButtonLayout A09;
    public IgdsInlineSearchBox A0A;
    public String A0B;
    public String A0C;
    public boolean A0D;
    public ComposeView A0E;
    public ComposeView A0F;
    public C7IK A0G;
    public final InterfaceC09390do A0I;
    public final InterfaceC09390do A0J;
    public final InterfaceC09390do A0K;
    public final InterfaceC09390do A0L = AbstractC60492pY.A02(this);
    public final View.OnTouchListener A0M = new ViewOnTouchListenerC48084LQj(this, 13);
    public final View.OnClickListener A0H = ViewOnClickListenerC48072LPx.A00(this, 25);

    /* JADX WARN: Removed duplicated region for block: B:12:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:20:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void A00(X.KCS r15) {
        /*
            r8 = r15
            android.content.Context r6 = r15.requireContext()
            X.0do r1 = r15.A0L
            com.instagram.common.session.UserSession r9 = X.AbstractC166987dD.A0r(r1)
            android.view.View r0 = r15.requireView()
            r2 = 2131427936(0x7f0b0260, float:1.8477502E38)
            android.view.View r0 = r0.findViewById(r2)
            r3 = 0
            X.2iX r10 = X.AbstractC56372iV.A01(r0, r3, r3)
            X.Kvq r11 = new X.Kvq
            r11.<init>(r15)
            android.view.View$OnTouchListener r7 = r15.A0M
            java.lang.String r14 = r15.A0B
            if (r14 != 0) goto L30
            java.lang.String r0 = "bottomSheetSessionId"
        L28:
            X.C14360o3.A0F(r0)
            X.00O r0 = X.C00O.createAndThrow()
            throw r0
        L30:
            android.os.Bundle r4 = r15.requireArguments()
            java.lang.String r0 = "param_extra_initial_search_term"
            java.lang.String r5 = ""
            java.lang.String r15 = r4.getString(r0, r5)
            X.C14360o3.A07(r15)
            android.os.Bundle r4 = r8.requireArguments()
            java.lang.String r0 = "param_extra_entry_point"
            java.lang.String r0 = r4.getString(r0, r5)
            if (r0 == 0) goto L55
            X.KcO r13 = X.EnumC46186KcO.valueOf(r0)     // Catch: java.lang.IllegalArgumentException -> L52
            if (r13 != 0) goto L57
            goto L55
        L52:
            X.KcO r13 = X.EnumC46186KcO.A0L
            goto L57
        L55:
            X.KcO r13 = X.EnumC46186KcO.A0L
        L57:
            X.0do r0 = r8.A0J
            java.lang.Object r12 = r0.getValue()
            X.JmX r12 = (X.C44527JmX) r12
            X.LJp r5 = new X.LJp
            r5.<init>(r6, r7, r8, r9, r10, r11, r12, r13, r14, r15)
            r8.A08 = r5
            android.view.View r0 = r8.requireView()
            android.view.ViewStub r0 = X.AbstractC31171DnF.A07(r0, r2)
            if (r0 == 0) goto L73
            r0.inflate()
        L73:
            X.0ll r4 = X.AbstractC166987dD.A0o(r1)
            X.0Tz r2 = X.C06090Tz.A05
            r0 = 36317706586691059(0x8106c3002815f3, double:3.0308021128652825E-306)
            boolean r0 = X.C18U.A06(r2, r4, r0)
            if (r0 != 0) goto La3
            X.LJp r0 = r8.A08
            if (r0 != 0) goto L8b
            java.lang.String r0 = "uiController"
            goto L28
        L8b:
            java.lang.String r4 = r8.A0C
            X.C14360o3.A0B(r4, r3)
            X.LIg r2 = r0.A0C
            X.0sl r0 = X.C16930sl.A00
            X.LGU r1 = new X.LGU
            r1.<init>(r4, r0)
            r2.A00 = r1
            X.0sZ r0 = r2.A0A
            r0.invoke()
            X.C47972LIg.A01(r2, r1, r3)
        La3:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.KCS.A00(X.KCS):void");
    }

    @Override // X.InterfaceC50436MOq
    public final void ADq(C7IK c7ik) {
        C14360o3.A0B(c7ik, 0);
        this.A0G = c7ik;
        IgdsInlineSearchBox igdsInlineSearchBox = this.A0A;
        if (igdsInlineSearchBox != null) {
            igdsInlineSearchBox.A05(c7ik.A0E);
        }
        IgdsBottomButtonLayout igdsBottomButtonLayout = this.A09;
        if (igdsBottomButtonLayout != null) {
            igdsBottomButtonLayout.setBackgroundColor(c7ik.A09);
        }
    }

    @Override // X.MQw
    public final void DOM() {
        this.A00 = 0;
        ComposeView composeView = this.A0E;
        if (composeView != null) {
            composeView.setTranslationY(0.0f);
        }
        C05A c05a = ((C44527JmX) this.A0J.getValue()).A04;
        C45098JxS c45098JxS = (C45098JxS) c05a.getValue();
        C73 c73 = c45098JxS.A01;
        boolean z = c45098JxS.A05;
        String str = c45098JxS.A03;
        String str2 = c45098JxS.A02;
        KzF kzF = c45098JxS.A00;
        String str3 = c45098JxS.A04;
        AbstractC167007dF.A1D(c73, 0, str);
        c05a.Egh(new C45098JxS(kzF, c73, str, str2, str3, z, false));
        IgdsBottomButtonLayout igdsBottomButtonLayout = this.A09;
        if (igdsBottomButtonLayout != null) {
            igdsBottomButtonLayout.setTranslationY(0.0f);
        }
    }

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return __redex_internal_original_name;
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        C14360o3.A0B(view, 0);
        super.onViewCreated(view, bundle);
        this.A02 = (ConstraintLayout) view.requireViewById(R.id.ai_sticker_tray_container);
        this.A04 = (IgSimpleImageView) view.requireViewById(R.id.ai_sticker_tray_back_button);
        this.A09 = AbstractC31172DnG.A0j(view, R.id.ai_sticker_tray_button);
        this.A06 = AbstractC31172DnG.A0X(view, R.id.ai_sticker_tray_title_label);
        this.A05 = AbstractC31172DnG.A0X(view, R.id.ai_sticker_tray_body_label);
        this.A0A = (IgdsInlineSearchBox) view.requireViewById(R.id.ai_sticker_search_box);
        this.A0F = (ComposeView) view.requireViewById(R.id.ai_sticker_tray_top_nav_bar);
        this.A0E = (ComposeView) view.requireViewById(R.id.ai_sticker_tray_prompt_bar);
        ConstraintLayout constraintLayout = this.A02;
        if (constraintLayout != null) {
            constraintLayout.setOnTouchListener(this.A0M);
        }
        this.A0B = requireArguments().getString("param_extra_bottom_sheet_session_id", "");
        IgdsInlineSearchBox igdsInlineSearchBox = this.A0A;
        if (igdsInlineSearchBox != null) {
            igdsInlineSearchBox.A02 = new C49485Lty(this, 6);
            igdsInlineSearchBox.setOnEditTextListener(new GWH(this, 48));
        }
        IgdsInlineSearchBox igdsInlineSearchBox2 = this.A0A;
        if (igdsInlineSearchBox2 != null) {
            igdsInlineSearchBox2.setHints(new C47748L6s(requireContext(), AbstractC166987dD.A0r(this.A0L)).A00(true));
        }
        IgdsInlineSearchBox igdsInlineSearchBox3 = this.A0A;
        if (igdsInlineSearchBox3 != null) {
            igdsInlineSearchBox3.A04();
        }
        IgdsBottomButtonLayout igdsBottomButtonLayout = this.A09;
        if (igdsBottomButtonLayout != null) {
            igdsBottomButtonLayout.setVisibility(4);
        }
        IgdsBottomButtonLayout igdsBottomButtonLayout2 = this.A09;
        if (igdsBottomButtonLayout2 != null) {
            C0fQ.A00(this.A0H, igdsBottomButtonLayout2);
        }
        String string = requireArguments().getString("param_extra_initial_search_term", "");
        this.A0C = string;
        IgdsInlineSearchBox igdsInlineSearchBox4 = this.A0A;
        if (igdsInlineSearchBox4 != null) {
            igdsInlineSearchBox4.A0E.setText(string);
        }
        IgdsInlineSearchBox igdsInlineSearchBox5 = this.A0A;
        if (igdsInlineSearchBox5 != null) {
            igdsInlineSearchBox5.setSelection(AbstractC167007dF.A0A(this.A0C));
        }
        C7IK c7ik = this.A0G;
        if (c7ik != null) {
            IgdsInlineSearchBox igdsInlineSearchBox6 = this.A0A;
            if (igdsInlineSearchBox6 != null) {
                igdsInlineSearchBox6.A05(c7ik.A0E);
            }
            IgdsBottomButtonLayout igdsBottomButtonLayout3 = this.A09;
            if (igdsBottomButtonLayout3 != null) {
                igdsBottomButtonLayout3.setBackgroundColor(c7ik.A09);
            }
        }
        InterfaceC09390do interfaceC09390do = this.A0L;
        AbstractC12990ll A0o = AbstractC166987dD.A0o(interfaceC09390do);
        C06090Tz c06090Tz = C06090Tz.A05;
        if (C18U.A06(c06090Tz, A0o, 36317706586691059L)) {
            AbstractC52922bZ A0Z = AbstractC25225BEi.A0Z(this.A0J);
            Object value = interfaceC09390do.getValue();
            C14360o3.A0B(value, 0);
            AbstractC166987dD.A1Z(new MCI(A0Z, value, null, 10), AbstractC141776au.A00(A0Z));
            FragmentActivity activity = getActivity();
            if (activity != null) {
                this.A01 = (ConstraintLayout) activity.findViewById(R.id.direct_sticker_tray_root_container_background);
                new L7V(activity, AbstractC166987dD.A0r(interfaceC09390do), new C48724Lgs(1, activity, this)).A00(C18U.A04(c06090Tz, AbstractC166987dD.A0o(interfaceC09390do), 36880656540172636L));
            }
            A00(this);
            ComposeView composeView = this.A0F;
            if (composeView != null) {
                composeView.setContent(C5UA.A03(new C30190DRv(this, 32), 1914280956));
            }
            ComposeView composeView2 = this.A0E;
            if (composeView2 != null) {
                composeView2.setContent(C5UA.A03(new DSA(5, view, this), -822936460));
                IgdsInlineSearchBox igdsInlineSearchBox7 = this.A0A;
                if (igdsInlineSearchBox7 != null) {
                    igdsInlineSearchBox7.setVisibility(8);
                }
                IgSimpleImageView igSimpleImageView = this.A04;
                if (igSimpleImageView != null) {
                    igSimpleImageView.setVisibility(8);
                }
                IgTextView igTextView = this.A06;
                if (igTextView != null) {
                    igTextView.setVisibility(4);
                }
                IgTextView igTextView2 = this.A05;
                if (igTextView2 != null) {
                    igTextView2.setVisibility(4);
                    return;
                }
                return;
            }
            throw AbstractC166997dE.A0g();
        }
        IgSimpleImageView igSimpleImageView2 = this.A04;
        if (igSimpleImageView2 != null) {
            AbstractC31173DnH.A11(requireContext(), igSimpleImageView2, AbstractC31174DnI.A05(this));
        }
        IgSimpleImageView igSimpleImageView3 = this.A04;
        if (igSimpleImageView3 != null) {
            ViewOnClickListenerC48072LPx.A01(igSimpleImageView3, 26, this);
        }
        IgTextView igTextView3 = this.A06;
        if (igTextView3 != null) {
            igTextView3.setVisibility(0);
        }
        IgTextView igTextView4 = this.A05;
        if (igTextView4 == null) {
            return;
        }
        igTextView4.setVisibility(0);
    }

    @Override // X.MQw
    public final void DON(int i) {
        this.A00 = i;
        ComposeView composeView = this.A0E;
        if (composeView != null) {
            composeView.setTranslationY(-i);
        }
        C05A c05a = ((C44527JmX) this.A0J.getValue()).A04;
        C45098JxS c45098JxS = (C45098JxS) c05a.getValue();
        C73 c73 = c45098JxS.A01;
        boolean z = c45098JxS.A05;
        String str = c45098JxS.A03;
        String str2 = c45098JxS.A02;
        KzF kzF = c45098JxS.A00;
        String str3 = c45098JxS.A04;
        AbstractC167017dG.A1O(c73, str);
        c05a.Egh(new C45098JxS(kzF, c73, str, str2, str3, z, true));
        IgdsBottomButtonLayout igdsBottomButtonLayout = this.A09;
        if (igdsBottomButtonLayout != null) {
            igdsBottomButtonLayout.setTranslationY(-i);
        }
    }

    @Override // X.AbstractC59962oe
    public final /* bridge */ /* synthetic */ AbstractC18680vv getSession() {
        return AbstractC166987dD.A0n(this.A0L);
    }

    @Override // X.MQw
    public final boolean isScrolledToTop() {
        if (this.A0D) {
            C47987LJp c47987LJp = this.A08;
            if (c47987LJp == null) {
                C14360o3.A0F("uiController");
                throw C00O.createAndThrow();
            }
            if (!AbstractC110854yx.A03((LinearLayoutManager) c47987LJp.A0F.getValue())) {
                return false;
            }
        }
        return true;
    }

    @Override // X.InterfaceC60072op
    public final boolean onBackPressed() {
        L6D l6d = this.A07;
        if (l6d != null) {
            l6d.A00();
        }
        if (!C18U.A06(C06090Tz.A05, AbstractC166987dD.A0o(this.A0L), 2342171238469614949L)) {
            return true;
        }
        return false;
    }

    @Override // X.MQw
    public final void onBottomSheetPositionChanged(int i, int i2) {
        AbstractC43594JPz.A17(this.A0E, i, i2);
        AbstractC43594JPz.A17(this.A09, i, i2);
    }

    public KCS() {
        InterfaceC09390do A00 = AbstractC09440dt.A00(EnumC09460dv.A02, new C50249MHe(new C50249MHe(this, 0), 1));
        C0YZ A1D = AbstractC25225BEi.A1D(C44527JmX.class);
        this.A0J = AbstractC25225BEi.A0a(new C50249MHe(A00, 2), new C37018GSz(8, this, A00), new C37018GSz(7, A00, null), A1D);
        this.A0C = "";
        this.A0K = C1XM.A00(new C50153MDg(this, 46));
        this.A0I = C1XM.A00(new C50153MDg(this, 45));
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(518660958);
        C14360o3.A0B(layoutInflater, 0);
        View A0R = AbstractC25226BEj.A0R(layoutInflater, viewGroup, R.layout.fragment_direct_ai_sticker_picker, false);
        C0f9.A09(564070913, A02);
        return A0R;
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onDestroy() {
        int A02 = C0f9.A02(-784340908);
        super.onDestroy();
        this.A07 = null;
        C0f9.A09(668053394, A02);
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        String str;
        int A02 = C0f9.A02(-395622744);
        super.onDestroyView();
        UserSession A0r = AbstractC166987dD.A0r(this.A0L);
        Integer num = C05F.A0u;
        String str2 = this.A0B;
        if (str2 == null) {
            str = "bottomSheetSessionId";
        } else {
            LJM.A00(EnumC46271Ke3.AI_STICKER, AbstractC31171DnF.A0D(__redex_internal_original_name), A0r, null, null, num, C05F.A00, null, null, str2);
            this.A02 = null;
            this.A04 = null;
            this.A06 = null;
            this.A05 = null;
            this.A0A = null;
            this.A09 = null;
            this.A01 = null;
            this.A0F = null;
            this.A0E = null;
            this.A03 = null;
            C44527JmX c44527JmX = (C44527JmX) this.A0J.getValue();
            c44527JmX.A02.removeCallbacks(c44527JmX.A03);
            if (this.A0D) {
                C47987LJp c47987LJp = this.A08;
                if (c47987LJp == null) {
                    str = "uiController";
                } else {
                    c47987LJp.A00 = null;
                }
            }
            C0f9.A09(176214085, A02);
            return;
        }
        C14360o3.A0F(str);
        throw C00O.createAndThrow();
    }
}
