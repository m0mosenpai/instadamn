package X;

import android.content.Context;
import android.os.Bundle;
import android.text.Editable;
import android.view.ViewGroup;
import android.widget.EditText;
import com.facebook.R;
import com.instagram.api.schemas.PollType;
import com.instagram.api.schemas.StoryPollColorType;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.EJl, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C32276EJl extends AbstractC59962oe implements InterfaceC60122ou {
    public static final String __redex_internal_original_name = "CommentPollCreationFragment";
    public int A00;
    public ViewGroup A01;
    public EditText A02;
    public ArrayList A03;
    public boolean A04;
    public boolean A05;
    public final List A06;
    public final InterfaceC09390do A07;
    public final InterfaceC09390do A08;
    public final InterfaceC09390do A09;

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return "comment_poll_creation";
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x00a7, code lost:
    
        if (r5 < r18.A03.size()) goto L14;
     */
    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onViewCreated(android.view.View r19, android.os.Bundle r20) {
        /*
            Method dump skipped, instructions count: 457
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C32276EJl.onViewCreated(android.view.View, android.os.Bundle):void");
    }

    public static final void A01(C32276EJl c32276EJl) {
        Editable editable;
        StoryPollColorType storyPollColorType;
        CharSequence hint;
        String obj;
        C31795DyF c31795DyF = (C31795DyF) c32276EJl.A07.getValue();
        Context requireContext = c32276EJl.requireContext();
        EditText editText = c32276EJl.A02;
        if (editText != null) {
            editable = editText.getText();
        } else {
            editable = null;
        }
        String A1A = AbstractC25228BEl.A1A(String.valueOf(editable));
        Context requireContext2 = c32276EJl.requireContext();
        ViewGroup viewGroup = c32276EJl.A01;
        ArrayList A1E = AbstractC166987dD.A1E();
        if (viewGroup != null) {
            int childCount = viewGroup.getChildCount();
            for (int i = 0; i < childCount; i++) {
                EditText editText2 = (EditText) viewGroup.getChildAt(i).findViewById(R.id.option_row_edit_text);
                C14360o3.A0A(editText2);
                if (!AbstractC35050FcN.A02(editText2)) {
                    hint = editText2.getText();
                } else if (!C14360o3.A0K(editText2.getHint(), requireContext2.getString(2131969720))) {
                    hint = editText2.getHint();
                }
                if (hint != null && (obj = hint.toString()) != null) {
                    A1E.add(new C101374gu(Float.valueOf(0.0f), 0, obj));
                }
            }
        }
        int A01 = AbstractC31176DnK.A01(AbstractC31171DnF.A0n(c32276EJl.A08), c32276EJl.A00);
        new C1DY((C1DV) new C37761pD(null), 6, false);
        if (A01 == AbstractC53242c7.A0H(requireContext, R.attr.igds_color_gradient_pink)) {
            storyPollColorType = StoryPollColorType.A0A;
        } else if (A01 == AbstractC53242c7.A0H(requireContext, R.attr.igds_color_gradient_lavender)) {
            storyPollColorType = StoryPollColorType.A08;
        } else if (A01 == AbstractC53242c7.A0H(requireContext, R.attr.igds_color_gradient_purple)) {
            storyPollColorType = StoryPollColorType.A0B;
        } else if (A01 == R.color.activator_card_progress_bad) {
            storyPollColorType = StoryPollColorType.A09;
        } else if (A01 == R.color.igds_active_badge) {
            storyPollColorType = StoryPollColorType.A07;
        } else if (A01 == AbstractC53242c7.A0H(requireContext, R.attr.igds_color_gradient_blue)) {
            storyPollColorType = StoryPollColorType.A05;
        } else {
            storyPollColorType = StoryPollColorType.A04;
        }
        C101394gx A00 = AbstractC34282FAc.A00(PollType.A04, null, storyPollColorType, false, true, false, null, null, null, null, 0, null, null, A1A, null, A1E);
        c31795DyF.A00.A0B(AbstractC33671EuL.A00(C35104Fe6.A00().A00, A00));
        String str = A00.A0D;
        if (str != null) {
            c31795DyF.A01.Egh(str);
        }
        AbstractC25226BEj.A1Q(c32276EJl);
    }

    @Override // X.AbstractC59962oe
    public final /* bridge */ /* synthetic */ AbstractC18680vv getSession() {
        return AbstractC166987dD.A0n(this.A09);
    }

    public C32276EJl() {
        C0YZ A1D = AbstractC25225BEi.A1D(C31795DyF.class);
        this.A07 = AbstractC25225BEi.A0a(new C29906DGu(this, 6), new C29906DGu(this, 7), new D8L(13, null, this), A1D);
        this.A09 = AbstractC60492pY.A02(this);
        this.A08 = AbstractC09440dt.A01(new C29906DGu(this, 5));
        this.A06 = AbstractC166987dD.A1E();
        this.A03 = AbstractC166987dD.A1E();
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x003c, code lost:
    
        if (r4 == false) goto L9;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final com.instagram.common.ui.base.IgLinearLayout A00(X.C32276EJl r9, java.lang.String r10, int r11, boolean r12) {
        /*
            android.view.LayoutInflater r2 = X.AbstractC31175DnJ.A06(r9)
            r1 = 2131624608(0x7f0e02a0, float:1.88764E38)
            android.view.ViewGroup r0 = r9.A01
            r6 = 0
            android.view.View r8 = r2.inflate(r1, r0, r6)
            r0 = 12
            java.lang.String r0 = X.MSV.A00(r0)
            X.C14360o3.A0C(r8, r0)
            com.instagram.common.ui.base.IgLinearLayout r8 = (com.instagram.common.ui.base.IgLinearLayout) r8
            r0 = 2131437388(0x7f0b274c, float:1.8496673E38)
            android.view.View r7 = r8.findViewById(r0)
            android.widget.EditText r7 = (android.widget.EditText) r7
            r5 = r11
            if (r10 == 0) goto L94
            r7.setText(r10)
        L28:
            X.C14360o3.A0A(r7)
            boolean r0 = X.AbstractC35050FcN.A02(r7)
            r3 = 1
            r4 = r0 ^ 1
            r2 = 2131437937(0x7f0b2971, float:1.8497787E38)
            android.view.View r1 = r8.findViewById(r2)
            if (r11 <= r3) goto L3e
            r0 = 0
            if (r4 != 0) goto L40
        L3e:
            r0 = 8
        L40:
            r1.setVisibility(r0)
            android.content.Context r1 = r9.requireContext()
            if (r12 != 0) goto L90
            r0 = 2131231471(0x7f0802ef, float:1.8079024E38)
        L4c:
            android.graphics.drawable.Drawable r0 = r1.getDrawable(r0)
            if (r0 == 0) goto L9f
            r8.setBackground(r0)
            r0 = 2131437936(0x7f0b2970, float:1.8497785E38)
            android.view.View r1 = r8.findViewById(r0)
            r0 = 30
            X.ViewOnClickListenerC35679FpE.A01(r1, r0, r7)
            android.view.View r0 = r8.findViewById(r2)
            X.Fnz r4 = new X.Fnz
            r4.<init>(r5, r6, r7, r8, r9)
            X.C0fQ.A00(r4, r0)
            if (r12 == 0) goto L78
            X.9qJ r2 = new X.9qJ
            r2.<init>(r7, r3)
        L74:
            r7.addTextChangedListener(r2)
            return r8
        L78:
            X.VBA r2 = new X.VBA
            r2.<init>()
            X.9qJ r0 = new X.9qJ
            r0.<init>(r7, r3)
            java.util.List r1 = r2.A00
            r1.add(r0)
            X.Em4 r0 = new X.Em4
            r0.<init>(r7, r9, r8, r11)
            r1.add(r0)
            goto L74
        L90:
            r0 = 2131231470(0x7f0802ee, float:1.8079022E38)
            goto L4c
        L94:
            android.content.Context r0 = r9.requireContext()
            X.C14360o3.A0A(r7)
            X.AbstractC35050FcN.A00(r0, r7, r11, r12)
            goto L28
        L9f:
            java.lang.IllegalStateException r0 = X.AbstractC166997dE.A0g()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C32276EJl.A00(X.EJl, java.lang.String, int, boolean):com.instagram.common.ui.base.IgLinearLayout");
    }

    @Override // X.InterfaceC60122ou
    public final void configureActionBar(InterfaceC56362iU interfaceC56362iU) {
        C35197Ffp A00 = C35197Ffp.A00(interfaceC56362iU);
        C35197Ffp.A02(AbstractC166997dE.A0N(this), A00, 2131952341);
        C31722DwR.A01(ViewOnClickListenerC35679FpE.A00(this, 28), interfaceC56362iU, A00);
        AbstractC31176DnK.A1C(ViewOnClickListenerC35679FpE.A00(this, 29), AbstractC31176DnK.A0I(), interfaceC56362iU);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        int A02 = C0f9.A02(-46115024);
        super.onCreate(bundle);
        Bundle requireArguments = requireArguments();
        ArrayList<String> stringArrayList = requireArguments.getStringArrayList("args_poll_options_text_list");
        if (stringArrayList == null) {
            stringArrayList = AbstractC166987dD.A1E();
        }
        this.A03 = stringArrayList;
        List A0n = AbstractC31171DnF.A0n(this.A08);
        Context requireContext = requireContext();
        StoryPollColorType storyPollColorType = (StoryPollColorType) StoryPollColorType.A01.get(requireArguments.getString("args_selected_poll_type_color"));
        if (storyPollColorType == null) {
            storyPollColorType = StoryPollColorType.A0C;
        }
        this.A00 = A0n.indexOf(Integer.valueOf(CFU.A00(requireContext, storyPollColorType)));
        this.A04 = requireArguments.getBoolean(MSV.A00(178), false);
        this.A05 = requireArguments.getBoolean("args_caption_is_poll_question", false);
        C0f9.A09(2063787434, A02);
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0014, code lost:
    
        if (r1 != false) goto L6;
     */
    @Override // androidx.fragment.app.Fragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.view.View onCreateView(android.view.LayoutInflater r5, android.view.ViewGroup r6, android.os.Bundle r7) {
        /*
            r4 = this;
            r0 = -649791456(0xffffffffd944f820, float:-3.4651195E15)
            int r3 = X.C0f9.A02(r0)
            r2 = 0
            X.C14360o3.A0B(r5, r2)
            boolean r0 = r4.A04
            if (r0 != 0) goto L16
            boolean r1 = r4.A05
            r0 = 2131624607(0x7f0e029f, float:1.8876398E38)
            if (r1 == 0) goto L19
        L16:
            r0 = 2131624428(0x7f0e01ec, float:1.8876035E38)
        L19:
            android.view.View r1 = X.AbstractC25226BEj.A0R(r5, r6, r0, r2)
            r0 = 1553066677(0x5c91eab5, float:3.2857548E17)
            X.C0f9.A09(r0, r3)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C32276EJl.onCreateView(android.view.LayoutInflater, android.view.ViewGroup, android.os.Bundle):android.view.View");
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        int A02 = C0f9.A02(-1580115329);
        super.onDestroyView();
        this.A01 = null;
        this.A02 = null;
        C0f9.A09(408792230, A02);
    }
}
