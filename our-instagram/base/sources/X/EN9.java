package X;

import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.base.IgEditText;
import com.instagram.direct.inbox.clipsinteractionreply.ClipsInteractionReplySheetContent;
import com.instagram.modal.ModalActivity;

/* loaded from: classes6.dex */
public final class EN9 extends AbstractC59962oe implements C7OC {
    public static final String __redex_internal_original_name = "ClipsInteractionReplyFragment";
    public IgEditText A00;
    public ClipsInteractionReplySheetContent A01;
    public C1DX A02;
    public C18A A03;
    public InterfaceC16820sZ A04;
    public InterfaceC16820sZ A05;
    public FQP A06;
    public final InterfaceC09390do A07 = AbstractC60492pY.A02(this);

    @Override // X.C7OC
    public final void DDL(Drawable drawable, View view, C148336m3 c148336m3) {
        C14360o3.A0B(c148336m3, 0);
        IgEditText igEditText = this.A00;
        if (igEditText != null) {
            igEditText.append(c148336m3.A02);
        }
    }

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return "clips_interaction_reply_sheet";
    }

    public static final void A01(EN9 en9) {
        InterfaceC16820sZ interfaceC16820sZ = en9.A04;
        if (interfaceC16820sZ != null) {
            interfaceC16820sZ.invoke();
        }
        InterfaceC09390do interfaceC09390do = en9.A07;
        UserSession A0r = AbstractC166987dD.A0r(interfaceC09390do);
        ClipsInteractionReplySheetContent clipsInteractionReplySheetContent = en9.A01;
        if (clipsInteractionReplySheetContent == null) {
            C14360o3.A0F("content");
            throw C00O.createAndThrow();
        }
        C31368DqX A01 = AbstractC31402Dr6.A01(A0r, clipsInteractionReplySheetContent.A04, "clips_social_context_bubble_action_sheet", "clips_interaction_reply_sheet");
        AbstractC12990ll A0o = AbstractC166987dD.A0o(interfaceC09390do);
        AbstractC31171DnF.A0L(en9.getActivity(), AbstractC31364DqT.A00(A01, interfaceC09390do), A0o, ModalActivity.class, "profile").A0C(en9.getActivity());
    }

    @Override // X.AbstractC59962oe
    public final /* bridge */ /* synthetic */ AbstractC18680vv getSession() {
        return AbstractC166987dD.A0n(this.A07);
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x001e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final android.text.SpannableStringBuilder A00(android.content.Context r7, com.instagram.api.schemas.SocialContextType r8) {
        /*
            r6 = this;
            int r4 = r8.ordinal()
            java.lang.String r3 = "clips_viewer"
            r1 = 9
            r0 = 3
            r2 = 0
            java.lang.String r5 = "content"
            if (r4 == r1) goto L71
            if (r4 == r0) goto L5e
            r0 = 7
            if (r4 != r0) goto L84
            r3 = 2131962740(0x7f132b74, float:1.9562214E38)
        L16:
            android.content.res.Resources r1 = X.AbstractC166997dE.A0N(r6)
            com.instagram.direct.inbox.clipsinteractionreply.ClipsInteractionReplySheetContent r0 = r6.A01
            if (r0 == 0) goto L8b
            java.lang.String r0 = r0.A03
            java.lang.String r0 = X.AbstractC166997dE.A0r(r1, r0, r3)
            X.C14360o3.A07(r0)
            android.text.SpannableStringBuilder r4 = X.AbstractC25225BEi.A0H(r0)
            X.3dN r1 = new X.3dN
            r1.<init>()
            com.instagram.direct.inbox.clipsinteractionreply.ClipsInteractionReplySheetContent r0 = r6.A01
            if (r0 == 0) goto L8b
            java.lang.String r0 = r0.A03
            int r0 = X.AbstractC167007dF.A0A(r0)
            r3 = 18
            r4.setSpan(r1, r2, r0, r3)
            int r0 = X.AbstractC31174DnI.A03(r7)
            android.text.style.ForegroundColorSpan r2 = new android.text.style.ForegroundColorSpan
            r2.<init>(r0)
            com.instagram.direct.inbox.clipsinteractionreply.ClipsInteractionReplySheetContent r0 = r6.A01
            if (r0 == 0) goto L8b
            java.lang.String r0 = r0.A03
            int r1 = X.AbstractC167007dF.A0A(r0)
            java.lang.String r0 = r4.toString()
            int r0 = X.AbstractC167007dF.A0A(r0)
            r4.setSpan(r2, r1, r0, r3)
            return r4
        L5e:
            com.instagram.direct.inbox.clipsinteractionreply.ClipsInteractionReplySheetContent r0 = r6.A01
            if (r0 == 0) goto L8b
            java.lang.String r0 = r0.A06
            boolean r0 = X.AbstractC002300n.A0h(r0, r3, r2)
            r3 = 2131962436(0x7f132a44, float:1.9561597E38)
            if (r0 == 0) goto L16
            r3 = 2131956489(0x7f131309, float:1.9549535E38)
            goto L16
        L71:
            com.instagram.direct.inbox.clipsinteractionreply.ClipsInteractionReplySheetContent r0 = r6.A01
            if (r0 == 0) goto L8b
            java.lang.String r0 = r0.A06
            boolean r0 = X.AbstractC002300n.A0h(r0, r3, r2)
            r3 = 2131962486(0x7f132a76, float:1.9561699E38)
            if (r0 == 0) goto L16
            r3 = 2131965114(0x7f1334ba, float:1.9567029E38)
            goto L16
        L84:
            java.lang.String r0 = "Invalid social context type"
            java.lang.IllegalArgumentException r0 = X.AbstractC166987dD.A12(r0)
            throw r0
        L8b:
            X.C14360o3.A0F(r5)
            X.00O r0 = X.C00O.createAndThrow()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.EN9.A00(android.content.Context, com.instagram.api.schemas.SocialContextType):android.text.SpannableStringBuilder");
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        ClipsInteractionReplySheetContent clipsInteractionReplySheetContent;
        int A02 = C0f9.A02(-1207615792);
        super.onCreate(bundle);
        Bundle bundle2 = this.mArguments;
        if (bundle2 != null && (clipsInteractionReplySheetContent = (ClipsInteractionReplySheetContent) bundle2.getParcelable("REPLY_CONTENT")) != null) {
            this.A01 = clipsInteractionReplySheetContent;
            InterfaceC09390do interfaceC09390do = this.A07;
            this.A03 = AbstractC31176DnK.A0h(interfaceC09390do);
            this.A02 = AbstractC31176DnK.A0Z(interfaceC09390do);
            this.A06 = new FQP(AbstractC166987dD.A0r(interfaceC09390do), this);
            C0f9.A09(637977856, A02);
            return;
        }
        IllegalStateException A0g = AbstractC166997dE.A0g();
        C0f9.A09(2007953496, A02);
        throw A0g;
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x012b  */
    @Override // androidx.fragment.app.Fragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.view.View onCreateView(android.view.LayoutInflater r14, android.view.ViewGroup r15, android.os.Bundle r16) {
        /*
            Method dump skipped, instructions count: 390
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.EN9.onCreateView(android.view.LayoutInflater, android.view.ViewGroup, android.os.Bundle):android.view.View");
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onDestroy() {
        int A02 = C0f9.A02(-1874704985);
        super.onDestroy();
        this.A00 = null;
        C0f9.A09(-415389867, A02);
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        int A02 = C0f9.A02(319578320);
        super.onDestroyView();
        C0f9.A09(-1175263848, A02);
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onResume() {
        int A02 = C0f9.A02(1819146639);
        super.onResume();
        IgEditText igEditText = this.A00;
        if (igEditText != null) {
            igEditText.requestFocus();
            AbstractC13880nE.A0S(igEditText);
        }
        C0f9.A09(-1687060867, A02);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onStart() {
        int A02 = C0f9.A02(-1537702151);
        super.onStart();
        IgEditText igEditText = this.A00;
        if (igEditText != null) {
            igEditText.requestFocus();
            if (igEditText.hasWindowFocus()) {
                if (igEditText.isFocused()) {
                    AbstractC13880nE.A0N(igEditText);
                }
            } else {
                igEditText.getViewTreeObserver().addOnWindowFocusChangeListener(new LR5(igEditText, 0));
            }
        }
        C0f9.A09(-599424667, A02);
    }
}
