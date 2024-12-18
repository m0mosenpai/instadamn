package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import com.facebook.R;
import com.facebook.pando.PandoGraphQLRequest;
import com.instagram.common.session.UserSession;
import com.instagram.direct.request.graphql.IGDDetectAndTranslateTextMessageQueryResponseImpl;
import com.instagram.model.direct.messageid.MessageIdentifier;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes6.dex */
public final class G3P implements InterfaceC37207GaI {
    public final C7U0 A00;
    public final FPH A01;
    public final C33092Eiu A02;
    public final InterfaceC83733oI A03;
    public final C23031Ai A04;
    public final InterfaceC09390do A05 = AbstractC09440dt.A01(C37029GTl.A00);
    public final InterfaceC16820sZ A06;
    public final InterfaceC11380iw A07;
    public final UserSession A08;

    @Override // X.InterfaceC37207GaI
    public final boolean APD() {
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x001a  */
    @Override // X.InterfaceC37207GaI
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.text.SpannableString BVr(android.content.Context r5, X.InterfaceC164947Zj r6, com.instagram.model.direct.messageid.MessageIdentifier r7, java.lang.Integer r8, int r9) {
        /*
            r4 = this;
            r3 = 0
            r2 = 2
            r1 = 1
            int r0 = r8.intValue()
            if (r0 == r3) goto L2e
            if (r0 == r1) goto L32
            if (r0 == r2) goto L2a
            java.lang.String r2 = ""
        Lf:
            X.C14360o3.A0A(r2)
            android.text.SpannableStringBuilder r1 = X.AbstractC25225BEi.A0H(r2)
            java.lang.Integer r0 = X.C05F.A0C
            if (r8 == r0) goto L22
            X.Eex r0 = new X.Eex
            r0.<init>(r4, r7, r8, r9)
            X.AnonymousClass773.A05(r1, r0, r2)
        L22:
            android.text.SpannableString r0 = android.text.SpannableString.valueOf(r1)
            X.C14360o3.A07(r0)
            return r0
        L2a:
            r0 = 2131959936(0x7f132080, float:1.9556527E38)
            goto L35
        L2e:
            r0 = 2131959862(0x7f132036, float:1.9556376E38)
            goto L35
        L32:
            r0 = 2131959865(0x7f132039, float:1.9556382E38)
        L35:
            java.lang.String r2 = r5.getString(r0)
            goto Lf
        */
        throw new UnsupportedOperationException("Method not decompiled: X.G3P.BVr(android.content.Context, X.7Zj, com.instagram.model.direct.messageid.MessageIdentifier, java.lang.Integer, int):android.text.SpannableString");
    }

    @Override // X.InterfaceC37207GaI
    public final void Dtc(MessageIdentifier messageIdentifier, Integer num) {
        if (!AbstractC31172DnG.A1a(this.A04.A01, AbstractC111324zv.A00(2264))) {
            Context context = (Context) this.A06.invoke();
            if (context != null) {
                FPH fph = this.A01;
                InterfaceC83733oI interfaceC83733oI = this.A03;
                InterfaceC02590Ai A0f = AbstractC166987dD.A0f(fph.A00, "direct_message_translation_nux_impression");
                if (A0f.isSampled()) {
                    AbstractC31171DnF.A1H(A0f, AbstractC31177DnL.A0f(interfaceC83733oI));
                    AbstractC31175DnJ.A17(A0f, "long_press");
                }
                ME4 me4 = new ME4(9, messageIdentifier, this, num);
                C54844OMp c54844OMp = new C54844OMp(context);
                c54844OMp.A07 = AbstractC166997dE.A0p(context, 2131959930);
                c54844OMp.A05 = AbstractC166997dE.A0p(context, 2131959929);
                c54844OMp.A06 = C05F.A01;
                Drawable drawable = context.getDrawable(R.drawable.ig_illustrations_illo_translate_refresh);
                if (drawable != null) {
                    c54844OMp.A04(drawable);
                    c54844OMp.A0B = true;
                    c54844OMp.A02(DialogInterfaceOnClickListenerC35452Fk9.A00(me4, 62), c54844OMp.A0E.getString(2131968948));
                    c54844OMp.A03(null, AbstractC166997dE.A0p(context, 2131954754));
                    c54844OMp.A01();
                    return;
                }
                throw AbstractC25227BEk.A0n();
            }
            return;
        }
        A00(this, messageIdentifier, num);
    }

    @Override // X.InterfaceC37207GaI
    public final void F8Y(C7TT c7tt, List list, boolean z, boolean z2) {
    }

    @Override // X.InterfaceC37207GaI
    public final void onDestroy() {
    }

    public static final void A00(G3P g3p, MessageIdentifier messageIdentifier, Integer num) {
        String str = messageIdentifier.A01;
        InterfaceC163557Ts BT6 = g3p.A00.BT6();
        C160787Im BT7 = BT6.BT7(str);
        if (BT7 != null) {
            Integer num2 = C05F.A00;
            if (num != num2 && !C1580877s.A02(BT7)) {
                C83403nh c83403nh = BT7.A0e;
                C14360o3.A07(c83403nh);
                String A00 = C1Q2.A00();
                WeakReference A16 = AbstractC25225BEi.A16(g3p.A06.invoke());
                C33092Eiu c33092Eiu = g3p.A02;
                List<C83403nh> A1J = AbstractC166987dD.A1J(c83403nh);
                L3R l3r = new L3R(g3p, BT7, c83403nh, A00, A16);
                ArrayList A0q = AbstractC167017dG.A0q(A1J);
                for (C83403nh c83403nh2 : A1J) {
                    C2JO c2jo = new C2JO();
                    c2jo.A09(c83403nh2.A1q, "content");
                    c2jo.A09(c83403nh2.A0h(), "item_id");
                    A0q.add(c2jo);
                }
                C2JO c2jo2 = new C2JO();
                c2jo2.A05(AbstractC43591JPw.A00(313), A0q);
                c2jo2.A09(C1Q2.A00(), AbstractC43591JPw.A00(475));
                C2JM A0b = AbstractC25225BEi.A0b();
                C2JM A0b2 = AbstractC25225BEi.A0b();
                A0b.A00(c2jo2, "input");
                PandoGraphQLRequest pandoGraphQLRequest = new PandoGraphQLRequest(AbstractC25225BEi.A0c(), "IGDDetectAndTranslateTextMessageQuery", A0b.getParamsCopy(), A0b2.getParamsCopy(), IGDDetectAndTranslateTextMessageQueryResponseImpl.class, false, null, 0, null, "xig_igd_detect_and_translate_text_message_query", AbstractC166987dD.A1E());
                C40701ud A01 = AbstractC40691uc.A01(c33092Eiu.A00);
                G3P g3p2 = l3r.A00;
                ((Handler) g3p2.A05.getValue()).post(new GPP(g3p2, l3r.A01, l3r.A02));
                C19L c19l = ((C4A7) c33092Eiu).A01;
                AbstractC23641Du.A03(num2, AnonymousClass191.A00, new MCI(A01, l3r, pandoGraphQLRequest, null, 17), c19l);
                return;
            }
            BT6.EZ9(num, str, false);
            BT7.A0b = true;
        }
    }

    public G3P(InterfaceC11380iw interfaceC11380iw, UserSession userSession, C7U0 c7u0, C33092Eiu c33092Eiu, InterfaceC16820sZ interfaceC16820sZ) {
        this.A06 = interfaceC16820sZ;
        this.A08 = userSession;
        this.A02 = c33092Eiu;
        this.A00 = c7u0;
        this.A07 = interfaceC11380iw;
        this.A04 = AbstractC23021Ah.A00(userSession);
        this.A01 = new FPH(interfaceC11380iw, userSession);
        this.A03 = AbstractC31174DnI.A0V(c7u0).A0P;
    }
}
