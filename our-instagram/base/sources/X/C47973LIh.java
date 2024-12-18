package X;

import android.content.Context;
import android.text.Layout;
import android.view.ContextThemeWrapper;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.facebook.R;
import com.instagram.api.schemas.IGAIAgentType;
import com.instagram.common.session.UserSession;
import com.instagram.ui.widget.framelayout.MediaFrameLayout;
import java.util.Collections;

/* renamed from: X.LIh, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C47973LIh {
    public View A00;
    public final Context A01;
    public final ViewGroup A02;
    public final IGAIAgentType A03;
    public final InterfaceC11380iw A04;
    public final UserSession A05;
    public final C7IZ A06;
    public final C98K A07;
    public final AnonymousClass988 A08;
    public final C160787Im A09;
    public final C7IM A0A;
    public final C49079Ln5 A0B;
    public final boolean A0C;
    public final C19L A0D;

    public static final void A01(Context context, View view) {
        view.measure(0, 0);
        TextView A0e = AbstractC166987dD.A0e(view, R.id.direct_text_message_text_view);
        A0e.setText(AbstractC25225BEi.A0H(AbstractC85253rG.A00(AbstractC43592JPx.A07(A0e.getText()), new C57482kN(Layout.Alignment.ALIGN_NORMAL, A0e.getPaint(), null, A0e.getLineSpacingExtra(), A0e.getLineSpacingMultiplier(), (A0e.getMeasuredWidth() - A0e.getCompoundPaddingLeft()) - A0e.getCompoundPaddingRight(), false), "…", (int) ((AbstractC13890nF.A00(context) * 0.4d) / A0e.getLineHeight()))));
    }

    public static View A00(InterfaceC66482zP interfaceC66482zP, AbstractC162927Rd abstractC162927Rd, C47973LIh c47973LIh) {
        C7SP createViewHolder = abstractC162927Rd.createViewHolder(c47973LIh.A06.A00, c47973LIh.A02);
        C14360o3.A07(createViewHolder);
        abstractC162927Rd.bind(interfaceC66482zP, createViewHolder);
        View view = createViewHolder.itemView;
        C14360o3.A06(view);
        return view;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0011. Please report as an issue. */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v23, types: [android.view.View] */
    /* JADX WARN: Type inference failed for: r4v5, types: [X.7Rd, X.7T5] */
    /* JADX WARN: Type inference failed for: r6v2, types: [java.lang.Object, X.Llf] */
    public final View A02() {
        View A06;
        int i;
        View A062;
        int i2;
        MediaFrameLayout mediaFrameLayout;
        C160787Im c160787Im = this.A09;
        C83403nh c83403nh = c160787Im.A0e;
        C2EY c2ey = c83403nh.A10;
        C14360o3.A07(c2ey);
        AbstractC46996KqF abstractC46996KqF = AbstractC46996KqF.$redex_init_class;
        switch (c2ey.ordinal()) {
            case 2:
            case 11:
            case 98:
                C49079Ln5 c49079Ln5 = this.A0B;
                AnonymousClass988 anonymousClass988 = this.A08;
                InterfaceC11380iw interfaceC11380iw = this.A04;
                UserSession userSession = this.A05;
                AbstractC162927Rd abstractC162927Rd = new AbstractC162927Rd(AbstractC22704A0a.A00(interfaceC11380iw, userSession, anonymousClass988), new C158907Bc(c49079Ln5, anonymousClass988, Collections.emptyList()));
                String A0i = c83403nh.A0i();
                Context context = this.A01;
                C7IM c7im = this.A0A;
                IGAIAgentType iGAIAgentType = this.A03;
                A062 = A00(new AnonymousClass784(C7QZ.A02(context, iGAIAgentType, userSession, c160787Im, c7im), C1580677q.A02(context, userSession, this.A07, anonymousClass988, c160787Im, c7im), A0i), abstractC162927Rd, this);
                A01(context, A062);
                i2 = R.id.direct_text_message_text_view;
                mediaFrameLayout = A062.findViewById(i2);
                this.A00 = mediaFrameLayout;
                return A062;
            case 3:
                Context context2 = this.A01;
                UserSession userSession2 = this.A05;
                C49079Ln5 c49079Ln52 = this.A0B;
                AnonymousClass988 anonymousClass9882 = this.A08;
                InterfaceC11380iw interfaceC11380iw2 = this.A04;
                C7A5 A00 = AbstractC1586379y.A00(context2, interfaceC11380iw2, userSession2, AbstractC22704A0a.A00(interfaceC11380iw2, userSession2, anonymousClass9882), c49079Ln52, anonymousClass9882);
                String A0i2 = c83403nh.A0i();
                C43700JUl c43700JUl = C43702JUn.A05;
                C7IM c7im2 = this.A0A;
                A062 = A00(new C43704JUp(C7QZ.A02(context2, this.A03, userSession2, c160787Im, c7im2), c43700JUl.A00(context2, interfaceC11380iw2, userSession2, anonymousClass9882, c160787Im, c7im2), A0i2), A00, this);
                MediaFrameLayout mediaFrameLayout2 = (MediaFrameLayout) AbstractC166987dD.A0c(A062, R.id.media_container);
                mediaFrameLayout = mediaFrameLayout2;
                if (this.A0C) {
                    mediaFrameLayout2.A03 = true;
                    mediaFrameLayout = mediaFrameLayout2;
                }
                this.A00 = mediaFrameLayout;
                return A062;
            case 14:
                AnonymousClass988 anonymousClass9883 = this.A08;
                InterfaceC11380iw interfaceC11380iw3 = this.A04;
                UserSession userSession3 = this.A05;
                ?? abstractC162927Rd2 = new AbstractC162927Rd(AbstractC22704A0a.A00(interfaceC11380iw3, userSession3, anonymousClass9883), new C1579977j(userSession3, this.A0B, anonymousClass9883, null, false, true));
                String A0i3 = c83403nh.A0i();
                int i3 = C3OO.FLAG_ADAPTER_FULLUPDATE;
                Context context3 = this.A01;
                C7IM c7im3 = this.A0A;
                C43705JUq c43705JUq = new C43705JUq(C7QZ.A02(context3, this.A03, userSession3, c160787Im, c7im3), AbstractC43698JUi.A00(new ContextThemeWrapper(context3, c7im3.A01), userSession3, new C7QL(anonymousClass9883, c7im3, C2EY.A1m, AbstractC09440dt.A01(MGE.A00), false, false, false, false, false, false), anonymousClass9883, c160787Im), A0i3);
                C7SP createViewHolder = abstractC162927Rd2.createViewHolder(this.A06.A00, this.A02);
                abstractC162927Rd2.bind(createViewHolder, c43705JUq);
                A062 = AbstractC31171DnF.A06(createViewHolder);
                i2 = R.id.message_content_voice_bubble_container;
                mediaFrameLayout = A062.findViewById(i2);
                this.A00 = mediaFrameLayout;
                return A062;
            case 20:
            case 21:
                C49079Ln5 c49079Ln53 = this.A0B;
                AnonymousClass988 anonymousClass9884 = this.A08;
                InterfaceC11380iw interfaceC11380iw4 = this.A04;
                UserSession userSession4 = this.A05;
                C77Y A002 = C77Y.A00(interfaceC11380iw4, userSession4, AbstractC22704A0a.A00(interfaceC11380iw4, userSession4, anonymousClass9884), c49079Ln53, anonymousClass9884, null, false);
                String A0i4 = c83403nh.A0i();
                C1582378i c1582378i = new C1582378i(null, false ? 1 : 0, false ? 1 : 0, 3);
                Context context4 = this.A01;
                C7IM c7im4 = this.A0A;
                A062 = A00(new C1576676a(C7QZ.A02(context4, this.A03, userSession4, c160787Im, c7im4), c1582378i.A01(context4, userSession4, C7QK.A04(userSession4, anonymousClass9884, c160787Im, c7im4, c83403nh.A10, AbstractC09440dt.A01(new MHI(this, 28))), anonymousClass9884, c160787Im), A0i4), A002, this);
                i2 = R.id.message_content_generic_xma_container;
                mediaFrameLayout = A062.findViewById(i2);
                this.A00 = mediaFrameLayout;
                return A062;
            case 57:
                AnonymousClass988 anonymousClass9885 = this.A08;
                C7R8 c7r8 = new C7R8(null, anonymousClass9885);
                InterfaceC11380iw interfaceC11380iw5 = this.A04;
                C49079Ln5 c49079Ln54 = this.A0B;
                UserSession userSession5 = this.A05;
                C7R9 c7r9 = new C7R9(interfaceC11380iw5, userSession5, c49079Ln54);
                Context context5 = this.A01;
                C79Z c79z = new C79Z(null, null, new C79Y(context5, c49079Ln54), null, anonymousClass9885, null, null, null, null, c7r8, null, c7r9, null, null, null, null, null, false);
                C18A A003 = AnonymousClass189.A00(userSession5);
                if (c83403nh.A1Q()) {
                    C45930KUh A004 = C45930KUh.A00.A00(interfaceC11380iw5, userSession5, c79z, c49079Ln54, anonymousClass9885, null, false);
                    final AnonymousClass795 anonymousClass795 = new AnonymousClass795(this.A07);
                    C48944Lkq c48944Lkq = new C48944Lkq();
                    C79L c79l = new C79L() { // from class: X.LjS
                        @Override // X.C79L
                        public final CharSequence AXg(Context context6, UserSession userSession6, AnonymousClass988 anonymousClass9886, C160787Im c160787Im2, C18A c18a) {
                            return AnonymousClass795.A0G(context6, userSession6, c160787Im2);
                        }
                    };
                    C45265K1t c45265K1t = (C45265K1t) new C1584879i(new C48804LiC(anonymousClass795, 1), new C48862LjE(anonymousClass795, 1), c79l, c48944Lkq).AWm(context5, userSession5, anonymousClass9885, c160787Im, this.A0A, A003, false);
                    C1585479p createViewHolder2 = A004.createViewHolder(this.A06.A00, this.A02);
                    C14360o3.A0A(c45265K1t);
                    A004.bind(createViewHolder2, c45265K1t);
                    View A063 = AbstractC31171DnF.A06(createViewHolder2);
                    AbstractC167007dF.A0x(A063.findViewById(R.id.message_status));
                    A01(context5, A063);
                    this.A00 = A063.findViewById(R.id.direct_text_message_text_view);
                    return A063;
                }
                C162427Pf c162427Pf = C162417Pe.A01;
                if (c162427Pf.A04(c83403nh)) {
                    A06 = A00(new Object().AWm(context5, userSession5, anonymousClass9885, c160787Im, this.A0A, AnonymousClass189.A00(userSession5), false), AbstractC46817KnC.A00(context5, interfaceC11380iw5, userSession5, null, new C219969ni(new C7R8(null, anonymousClass9885)), c49079Ln54, anonymousClass9885), this);
                    i = R.id.prompt_xma_message_container;
                } else if (c162427Pf.A05(c83403nh)) {
                    C45902KTf A005 = AbstractC46819KnE.A00(interfaceC11380iw5, new C79Z(null, null, new C79Y(context5, c49079Ln54), null, anonymousClass9885, null, null, null, null, new C7R8(null, anonymousClass9885), null, new C7R9(interfaceC11380iw5, userSession5, c49079Ln54), null, null, null, null, null, false), c49079Ln54, anonymousClass9885);
                    AnonymousClass795 anonymousClass7952 = new AnonymousClass795(this.A07);
                    C48942Lko c48942Lko = new C48942Lko();
                    C79L c79l2 = anonymousClass7952.A0B;
                    InterfaceC66482zP AWm = new C1584879i(new C48804LiC(anonymousClass7952, 3), new C48862LjE(anonymousClass7952, 2), c79l2, c48942Lko, false, 0).AWm(context5, userSession5, anonymousClass9885, c160787Im, this.A0A, AnonymousClass189.A00(userSession5), false);
                    C1585479p createViewHolder3 = A005.createViewHolder(this.A06.A00, this.A02);
                    A005.bind(AWm, createViewHolder3);
                    A06 = AbstractC31171DnF.A06(createViewHolder3);
                    i = R.id.message_content;
                } else {
                    C2EY c2ey2 = c83403nh.A10;
                    C14360o3.A07(c2ey2);
                    AbstractC166987dD.A1T(C18950wb.A01, AbstractC167017dG.A0n(c2ey2, "Unknown message type for share message to story: ", AbstractC166987dD.A1C()), 20134884);
                    return null;
                }
                this.A00 = A06.findViewById(i);
                AbstractC167007dF.A0x(A06.findViewById(R.id.message_status));
                return A06;
            case 69:
                Context context6 = this.A01;
                UserSession userSession6 = this.A05;
                InterfaceC11380iw interfaceC11380iw6 = this.A04;
                C49079Ln5 c49079Ln55 = this.A0B;
                AnonymousClass988 anonymousClass9886 = this.A08;
                KIQ A006 = AbstractC46815KnA.A00(context6, interfaceC11380iw6, userSession6, null, c49079Ln55, anonymousClass9886);
                String A0i5 = c83403nh.A0i();
                C1582378i c1582378i2 = new C1582378i(null, false ? 1 : 0, false ? 1 : 0, 3);
                C7IM c7im5 = this.A0A;
                K0K k0k = new K0K(new C1576676a(C7QZ.A02(context6, this.A03, userSession6, c160787Im, c7im5), c1582378i2.A01(context6, userSession6, AbstractC43594JPz.A0Y(userSession6, anonymousClass9886, c160787Im, c7im5, c83403nh), anonymousClass9886, c160787Im), A0i5));
                C44742JrP createViewHolder4 = A006.createViewHolder(this.A06.A00, this.A02);
                A006.bind(createViewHolder4, k0k);
                A062 = AbstractC31171DnF.A06(createViewHolder4);
                i2 = R.id.poll_message_container;
                mediaFrameLayout = A062.findViewById(i2);
                this.A00 = mediaFrameLayout;
                return A062;
            default:
                AbstractC166987dD.A1T(C18950wb.A01, AbstractC167017dG.A0n(c2ey, "Unknown message type for share message to story: ", AbstractC166987dD.A1C()), 20134884);
                return null;
        }
    }

    public C47973LIh(Context context, ViewGroup viewGroup, IGAIAgentType iGAIAgentType, InterfaceC11380iw interfaceC11380iw, UserSession userSession, C7IZ c7iz, AnonymousClass988 anonymousClass988, C160787Im c160787Im, C7IM c7im, C19L c19l, boolean z) {
        this.A01 = context;
        this.A05 = userSession;
        this.A09 = c160787Im;
        this.A08 = anonymousClass988;
        this.A02 = viewGroup;
        this.A06 = c7iz;
        this.A0A = c7im;
        this.A04 = interfaceC11380iw;
        this.A0C = z;
        this.A0D = c19l;
        this.A03 = iGAIAgentType;
        this.A0B = new C49079Ln5(userSession, c19l);
        Context context2 = AbstractC12290kX.A00;
        C14360o3.A07(context2);
        this.A07 = new C98K(C50252MHh.A01(context2, 24));
    }
}
