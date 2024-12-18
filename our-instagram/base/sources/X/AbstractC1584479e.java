package X;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.Space;
import com.facebook.R;
import com.facebook.common.messagingui.observableverticaloffsetlayout.observableverticaloffsetconstraintlayout.ObservableVerticalOffsetConstraintLayout;
import com.instagram.common.ui.base.IgTextView;

/* renamed from: X.79e, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC1584479e extends AbstractC66422zJ {
    public final C79Z A00;
    public final C7QC A01;
    public final C7QC A02;

    @Override // X.AbstractC66422zJ
    /* renamed from: A00, reason: merged with bridge method [inline-methods] */
    public final C1585479p createViewHolder(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        C7QD c7qd;
        C7SI c7si;
        C7SH c7sh;
        C7SE c7se;
        C7SA c7sa;
        C7SC c7sc;
        C7SB c7sb;
        ViewStub viewStub;
        ViewStub viewStub2;
        ViewGroup.LayoutParams layoutParams;
        C79Z c79z = this.A00;
        C7QD ANU = this.A02.ANU(layoutInflater, viewGroup);
        C7QC c7qc = this.A01;
        if (c7qc != null) {
            c7qd = c7qc.ANU(layoutInflater, viewGroup);
        } else {
            c7qd = null;
        }
        C14360o3.A0B(viewGroup, 0);
        C14360o3.A0B(layoutInflater, 1);
        C14360o3.A0B(ANU, 2);
        View inflate = layoutInflater.inflate(R.layout.context_reply_decorated_root, viewGroup, false);
        C14360o3.A0C(inflate, "null cannot be cast to non-null type com.facebook.common.messagingui.observableverticaloffsetlayout.observableverticaloffsetconstraintlayout.ObservableVerticalOffsetConstraintLayout");
        ObservableVerticalOffsetConstraintLayout observableVerticalOffsetConstraintLayout = (ObservableVerticalOffsetConstraintLayout) inflate;
        View BKF = ANU.BKF();
        observableVerticalOffsetConstraintLayout.addView(BKF, BKF.getLayoutParams());
        if (c7qd != null) {
            View BKF2 = c7qd.BKF();
            View requireViewById = observableVerticalOffsetConstraintLayout.requireViewById(R.id.context_reply_context_message_stub);
            C14360o3.A07(requireViewById);
            View inflate2 = ((ViewStub) requireViewById).inflate();
            C14360o3.A0C(inflate2, "null cannot be cast to non-null type android.view.ViewGroup");
            ViewGroup viewGroup2 = (ViewGroup) inflate2;
            if (BKF2 != null) {
                layoutParams = BKF2.getLayoutParams();
            } else {
                layoutParams = null;
            }
            viewGroup2.addView(BKF2, layoutParams);
        }
        View requireViewById2 = observableVerticalOffsetConstraintLayout.requireViewById(R.id.message_content_shortcut_buttons_container_stub);
        C14360o3.A07(requireViewById2);
        View inflate3 = ((ViewStub) requireViewById2).inflate();
        C14360o3.A0C(inflate3, "null cannot be cast to non-null type android.view.ViewGroup");
        C7R8 c7r8 = c79z.A09;
        C162957Rg c162957Rg = new C162957Rg(observableVerticalOffsetConstraintLayout, c7r8.A00, c7r8.A02);
        C7QD A00 = AbstractC1585279n.A00(layoutInflater, observableVerticalOffsetConstraintLayout, c79z.A0B);
        C14360o3.A0C(A00, "null cannot be cast to non-null type com.instagram.direct.messagethread.senderavatar.SenderAvatarViewHolder");
        C162947Rf c162947Rf = (C162947Rf) A00;
        C163047Rp c163047Rp = (C163047Rp) AbstractC1585279n.A00(layoutInflater, observableVerticalOffsetConstraintLayout, c79z.A0E);
        C7S0 c7s0 = (C7S0) AbstractC1585279n.A00(layoutInflater, observableVerticalOffsetConstraintLayout, c79z.A0F);
        C7S3 c7s3 = (C7S3) AbstractC1585279n.A00(layoutInflater, observableVerticalOffsetConstraintLayout, c79z.A0G);
        C7S6 c7s6 = (C7S6) AbstractC1585279n.A00(layoutInflater, observableVerticalOffsetConstraintLayout, c79z.A0D);
        C7S9 c7s9 = (C7S9) AbstractC1585279n.A00(layoutInflater, observableVerticalOffsetConstraintLayout, c79z.A06);
        C7RP c7rp = c79z.A05;
        if (c7rp != null) {
            View requireViewById3 = observableVerticalOffsetConstraintLayout.requireViewById(R.id.message_feedback_reactions);
            C14360o3.A07(requireViewById3);
            c7si = new C7SI(c7rp.A00, AbstractC56372iV.A01(requireViewById3, false, false), c7rp.A01);
        } else {
            c7si = null;
        }
        C7SK c7sk = (C7SK) AbstractC1585279n.A00(layoutInflater, observableVerticalOffsetConstraintLayout, c79z.A00);
        C7SL c7sl = (C7SL) AbstractC1585279n.A00(layoutInflater, observableVerticalOffsetConstraintLayout, c79z.A0A);
        View requireViewById4 = observableVerticalOffsetConstraintLayout.requireViewById(R.id.message_context_line_stub);
        C14360o3.A07(requireViewById4);
        ViewStub viewStub3 = (ViewStub) requireViewById4;
        View requireViewById5 = observableVerticalOffsetConstraintLayout.requireViewById(R.id.message_reactions_pill_placeholder);
        C14360o3.A07(requireViewById5);
        C79Y c79y = c79z.A02;
        Context context = c79y.A00;
        InterfaceC165197a8 interfaceC165197a8 = c79y.A01;
        View findViewById = observableVerticalOffsetConstraintLayout.findViewById(R.id.direct_context_reply_context_info_text_view);
        C14360o3.A07(findViewById);
        C1585379o c1585379o = new C1585379o(context, (IgTextView) findViewById, interfaceC165197a8);
        if (c79z.A03 != null) {
            C14360o3.A0B(inflate3, 0);
            View requireViewById6 = inflate3.requireViewById(R.id.message_debug_indicator);
            C14360o3.A07(requireViewById6);
            ViewStub viewStub4 = (ViewStub) requireViewById6;
            if (viewStub4 == null) {
                viewStub4 = null;
            }
            c7sh = new C7SH(new C57012jc(viewStub4));
        } else {
            c7sh = null;
        }
        C7RL c7rl = c79z.A08;
        if (c7rl != null) {
            C14360o3.A0B(inflate3, 0);
            View findViewById2 = inflate3.findViewById(R.id.message_info_shortcut_stub);
            if (findViewById2 instanceof ViewStub) {
                viewStub2 = (ViewStub) findViewById2;
            } else {
                viewStub2 = null;
            }
            c7se = new C7SE(c7rl.A00, new C57012jc(viewStub2), c7rl.A01);
        } else {
            c7se = null;
        }
        C7RH c7rh = c79z.A07;
        if (c7rh != null) {
            C14360o3.A0B(inflate3, 0);
            View findViewById3 = inflate3.findViewById(R.id.forwarding_shortcut_button);
            if (findViewById3 instanceof ViewStub) {
                viewStub = (ViewStub) findViewById3;
            } else {
                viewStub = null;
            }
            c7sa = new C7SA(new C57012jc(viewStub), c7rh.A00);
        } else {
            c7sa = null;
        }
        C7RJ c7rj = c79z.A0C;
        if (c7rj != null) {
            C14360o3.A0B(inflate3, 0);
            View requireViewById7 = inflate3.requireViewById(R.id.share_to_story_shortcut_stub);
            C14360o3.A07(requireViewById7);
            c7sc = new C7SC(c7rj.A00, c7rj.A01, AbstractC56372iV.A01(requireViewById7, false, false), c7rj.A02);
        } else {
            c7sc = null;
        }
        C7RI c7ri = c79z.A01;
        if (c7ri != null) {
            C14360o3.A0B(inflate3, 0);
            View requireViewById8 = inflate3.requireViewById(R.id.camera_reply_shortcut_stub);
            C14360o3.A07(requireViewById8);
            c7sb = new C7SB(AbstractC56372iV.A01(requireViewById8, false, false), c7ri.A00);
        } else {
            c7sb = null;
        }
        int i = C3OO.FLAG_ADAPTER_FULLUPDATE;
        View findViewById4 = observableVerticalOffsetConstraintLayout.findViewById(R.id.direct_reactions_pill_spacer);
        C14360o3.A07(findViewById4);
        View inflate4 = viewStub3.inflate();
        C14360o3.A07(inflate4);
        return new C1585479p(inflate4, requireViewById5, (Space) findViewById4, observableVerticalOffsetConstraintLayout, c7sk, c7sb, c1585379o, c7sh, c7si, c7s9, c7sa, c7se, c162957Rg, c7sl, c162947Rf, c7sc, ANU, c7qd, c7s6, c163047Rp, c7s0, c7s3);
    }

    /* JADX WARN: Code restructure failed: missing block: B:161:0x0270, code lost:
    
        if (r13.A05 == false) goto L155;
     */
    /* JADX WARN: Removed duplicated region for block: B:100:0x017f  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0187  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x018f  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x01a5  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x01ad  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x01b5  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x01bd  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x0503  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x01c4  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x01cc  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x04fc  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x01e5  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x01f9  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x02c0  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x02d4  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x038d  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x03dd  */
    /* JADX WARN: Removed duplicated region for block: B:199:0x03eb  */
    /* JADX WARN: Removed duplicated region for block: B:202:0x03fc  */
    /* JADX WARN: Removed duplicated region for block: B:208:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:209:0x040f  */
    /* JADX WARN: Removed duplicated region for block: B:220:0x046b  */
    /* JADX WARN: Removed duplicated region for block: B:236:0x0510  */
    /* JADX WARN: Removed duplicated region for block: B:239:0x051e  */
    /* JADX WARN: Removed duplicated region for block: B:241:0x0524  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0167  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x052b  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0176  */
    @Override // X.AbstractC66422zJ
    /* renamed from: A01, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void bind(X.InterfaceC66482zP r47, X.AbstractC1585579q r48) {
        /*
            Method dump skipped, instructions count: 1381
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC1584479e.bind(X.2zP, X.79q):void");
    }

    @Override // X.AbstractC66422zJ
    public final /* bridge */ /* synthetic */ void unbind(C3OO c3oo) {
        C7SL c7sl;
        C7SK c7sk;
        C7SI c7si;
        C7SE c7se;
        C7SH c7sh;
        C7S6 c7s6;
        C7S0 c7s0;
        C163047Rp c163047Rp;
        C7QD c7qd;
        AbstractC1585579q abstractC1585579q = (AbstractC1585579q) c3oo;
        this.A02.F91(abstractC1585579q.A01);
        C7QC c7qc = this.A01;
        if (c7qc != null && (c7qd = abstractC1585579q.A00) != null) {
            c7qc.F91(c7qd);
        }
        C79Z c79z = this.A00;
        C1585479p c1585479p = (C1585479p) abstractC1585579q;
        C14360o3.A0B(c1585479p, 0);
        C162957Rg c162957Rg = c1585479p.A0D;
        c162957Rg.A0A.A01();
        c162957Rg.A06 = null;
        if (c79z.A0E != null && (c163047Rp = c1585479p.A0I) != null) {
            c163047Rp.A00();
        }
        if (c79z.A0F != null && (c7s0 = c1585479p.A0J) != null) {
            c7s0.A02();
        }
        if (c79z.A0D != null && (c7s6 = c1585479p.A0H) != null) {
            c7s6.A06.A03(8);
            c7s6.A05 = null;
        }
        if (c79z.A03 != null && (c7sh = c1585479p.A07) != null) {
            c7sh.A00.A03(8);
        }
        if (c79z.A08 != null && (c7se = c1585479p.A0C) != null) {
            c7se.A00();
        }
        if (c79z.A05 != null && (c7si = c1585479p.A09) != null) {
            C11T.A02(new C7T6(c7si));
            c7si.A02 = null;
        }
        if (c79z.A00 != null && (c7sk = c1585479p.A04) != null) {
            c7sk.A00.A03(8);
        }
        if (c79z.A0A != null && (c7sl = c1585479p.A0E) != null) {
            c7sl.A00.A03(8);
        }
        c1585479p.A08.A00 = null;
    }

    public AbstractC1584479e(C79Z c79z, C7QC c7qc, C7QC c7qc2) {
        this.A02 = c7qc;
        this.A01 = c7qc2;
        this.A00 = c79z;
    }
}
