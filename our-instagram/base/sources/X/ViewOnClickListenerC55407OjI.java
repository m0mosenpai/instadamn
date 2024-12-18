package X;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import com.instagram.common.session.UserSession;
import com.instagram.leadgen.core.model.LeadGenProfileContentInfo;
import com.instagram.leadgen.core.model.LeadGenTrustSignalsPayload;
import com.instagram.user.model.UpcomingEvent;
import java.util.ArrayList;

/* renamed from: X.OjI, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class ViewOnClickListenerC55407OjI implements View.OnClickListener {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final boolean A03;

    public ViewOnClickListenerC55407OjI(int i, Object obj, Object obj2, boolean z) {
        this.A00 = i;
        this.A02 = obj2;
        this.A03 = z;
        this.A01 = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int A05;
        int i;
        String str;
        String str2;
        String str3;
        LeadGenTrustSignalsPayload leadGenTrustSignalsPayload;
        String str4;
        switch (this.A00) {
            case 0:
                A05 = C0f9.A05(1634034367);
                String pollId = ((InterfaceC101404gy) this.A02).getPollId();
                if (pollId != null) {
                    ((InterfaceC16620sF) this.A01).invoke(pollId, Boolean.valueOf(this.A03));
                }
                i = 1475141085;
                break;
            case 1:
                A05 = C0f9.A05(-1915966966);
                P18 p18 = (P18) this.A02;
                AnonymousClass229.A01(p18.A05).A1C(p18.A01, p18.A02);
                p18.A06.DJC(p18.A08, (ArrayList) this.A01, this.A03);
                i = -971657656;
                break;
            case 2:
                A05 = C0f9.A05(-1589876204);
                UserSession userSession = (UserSession) this.A02;
                boolean z = this.A03;
                C22C A01 = AnonymousClass229.A01(userSession);
                if (z) {
                    str = "RESUME_DRAFT_EXIT_DIALOG_CANCEL";
                } else {
                    str = "EXIT_DIALOG_CANCEL";
                }
                A01.A1m(str);
                View.OnClickListener onClickListener = (View.OnClickListener) this.A01;
                if (onClickListener != null) {
                    onClickListener.onClick(view);
                }
                i = 1999142777;
                break;
            case 3:
                A05 = AbstractC43593JPy.A03(view, -1403223801);
                UserSession userSession2 = (UserSession) this.A02;
                boolean z2 = this.A03;
                C22C A012 = AnonymousClass229.A01(userSession2);
                if (z2) {
                    str2 = "RESUME_DRAFT_EXIT_DIALOG_DISCARD_EDITS";
                } else {
                    str2 = "EXIT_DIALOG_START_OVER";
                }
                A012.A1m(str2);
                ((View.OnClickListener) this.A01).onClick(view);
                i = 2052666814;
                break;
            case 4:
                A05 = AbstractC43593JPy.A03(view, 516654137);
                UserSession userSession3 = (UserSession) this.A02;
                boolean z3 = this.A03;
                C22C A013 = AnonymousClass229.A01(userSession3);
                if (z3) {
                    str3 = "RESUME_DRAFT_EXIT_DIALOG_SAVE_DRAFT";
                } else {
                    str3 = "EXIT_DIALOG_SAVE_DRAFT";
                }
                A013.A1m(str3);
                View.OnClickListener onClickListener2 = (View.OnClickListener) this.A01;
                if (onClickListener2 != null) {
                    onClickListener2.onClick(view);
                }
                i = -1073067288;
                break;
            case 5:
                A05 = C0f9.A05(-1589610755);
                AbstractC52562NNi abstractC52562NNi = (AbstractC52562NNi) this.A02;
                NOW A0d = MSW.A0d(abstractC52562NNi);
                String A00 = AbstractC52562NNi.A00(abstractC52562NNi);
                boolean z4 = this.A03;
                LeadGenProfileContentInfo leadGenProfileContentInfo = (LeadGenProfileContentInfo) A0d.A0b.getValue();
                if (leadGenProfileContentInfo != null && (leadGenTrustSignalsPayload = leadGenProfileContentInfo.A01) != null) {
                    EnumC53274NhC A002 = leadGenTrustSignalsPayload.A00();
                    String str5 = A002.A02;
                    if (str5 == null) {
                        str5 = A002.toString();
                    }
                    C54976OTi c54976OTi = A0d.A0M;
                    if (z4) {
                        str4 = "business_profile_header_click";
                    } else {
                        str4 = "business_profile_header_click_disabled";
                    }
                    InterfaceC58268PsC.A00(C54976OTi.A00(c54976OTi, A00, str5), c54976OTi.A00, c54976OTi.A01, "lead_gen_multi_step_consumer_questions", str4);
                }
                if (z4) {
                    LeadGenProfileContentInfo leadGenProfileContentInfo2 = (LeadGenProfileContentInfo) this.A01;
                    String A003 = AbstractC52562NNi.A00(abstractC52562NNi);
                    C52573NNt c52573NNt = (C52573NNt) abstractC52562NNi;
                    AbstractC50522MSa.A11(AbstractC50522MSa.A0J(c52573NNt), c52573NNt);
                    Bundle A0b = AbstractC166987dD.A0b();
                    A0b.putAll(c52573NNt.mArguments);
                    A0b.putParcelable("arg_profile_content_info", leadGenProfileContentInfo2);
                    A0b.putString("arg_form_page_type", A003);
                    C52120N4t c52120N4t = new C52120N4t();
                    c52120N4t.setArguments(A0b);
                    C189448aO A0y = AbstractC25225BEi.A0y(MSW.A0e(c52573NNt.A04).A0H);
                    A0y.A0T = new PHV(c52120N4t, 0);
                    A0y.A0U = new C56759PHb(A003, c52573NNt, 0);
                    AbstractC31177DnL.A14(c52573NNt, c52120N4t, A0y);
                }
                i = -564364794;
                break;
            case 6:
                A05 = C0f9.A05(1232953412);
                if (this.A03) {
                    ((C97T) this.A01).A00(AbstractC31172DnG.A07(this.A02));
                } else {
                    C52776NXh c52776NXh = (C52776NXh) this.A02;
                    OHF ohf = c52776NXh.A05;
                    if (ohf != null) {
                        ohf.A00("old_build_manual_update");
                        C97T c97t = (C97T) this.A01;
                        Context requireContext = c52776NXh.requireContext();
                        c97t.A01(requireContext, AbstractC14490oL.A09(requireContext));
                    } else {
                        C14360o3.A0F("dogfoodingRageshakeLogger");
                        throw C00O.createAndThrow();
                    }
                }
                i = 1453514356;
                break;
            case 7:
                A05 = C0f9.A05(526312481);
                C55037OZj c55037OZj = (C55037OZj) this.A02;
                AnonymousClass229.A01(c55037OZj.A03).A1Y(C81X.A05);
                C55037OZj.A01(c55037OZj, (UpcomingEvent) this.A01, this.A03);
                i = 1177271860;
                break;
            default:
                C56255Oy2 c56255Oy2 = (C56255Oy2) this.A01;
                AbstractC54896OPr.A01(c56255Oy2.A09, c56255Oy2.A0B, c56255Oy2.A0C, (ArrayList) this.A02, this.A03);
                return;
        }
        C0f9.A0C(i, A05);
    }
}
