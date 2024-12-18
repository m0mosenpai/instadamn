package X;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.LinearLayout;
import android.widget.Space;
import com.facebook.R;
import com.facebook.common.messagingui.observableverticaloffsetlayout.ObservableVerticalOffsetFrameLayout;
import com.facebook.common.messagingui.observableverticaloffsetlayout.observableverticaloffsetconstraintlayout.ObservableVerticalOffsetConstraintLayout;

/* renamed from: X.7RX, reason: invalid class name */
/* loaded from: classes3.dex */
public abstract class C7RX {
    public final C7RG A00;
    public final C7RH A01;
    public final C7RJ A02;
    public final C7RN A03;
    public final C7RC A04;
    public final C7RU A05;
    public final C7RQ A06;
    public final C7RI A07;
    public final C7RT A08;
    public final C7RK A09;
    public final C7RO A0A;
    public final C7RP A0B;
    public final C7RF A0C;
    public final C7RL A0D;
    public final C7R8 A0E;
    public final C7RR A0F;
    public final C7R9 A0G;
    public final C7RM A0H;
    public final C7RS A0I;
    public final C7RE A0J;
    public final C7RA A0K;
    public final C7RD A0L;
    public final boolean A0M;

    public final C7SP A01(ViewGroup viewGroup, AbstractC163037Ro abstractC163037Ro, C162957Rg c162957Rg, C162947Rf c162947Rf, C7QD c7qd) {
        C163047Rp c163047Rp;
        C7S0 c7s0;
        C7S3 c7s3;
        C7S6 c7s6;
        C7S8 c7s8;
        C7S9 c7s9;
        C7SA c7sa;
        C7SB c7sb;
        C7SC c7sc;
        C7SD c7sd;
        C7SE c7se;
        C7SF c7sf;
        C7SG c7sg;
        C7SH c7sh;
        C7SI c7si;
        C7SK c7sk;
        C7SL c7sl;
        C7SM c7sm;
        C7SN c7sn;
        View view;
        View view2;
        ViewStub viewStub;
        ViewStub viewStub2;
        ViewStub viewStub3;
        ViewStub viewStub4;
        ViewStub viewStub5;
        ViewStub viewStub6;
        C14360o3.A0B(viewGroup, 4);
        C7RA c7ra = this.A0K;
        C7SO c7so = null;
        if (c7ra != null) {
            c163047Rp = c7ra.A00(viewGroup);
        } else {
            c163047Rp = null;
        }
        C7RC c7rc = this.A04;
        if (c7rc != null) {
            c7s0 = new C7S0(new C57012jc((ViewStub) viewGroup.findViewById(R.id.direct_reactions_pill_stub)), c7rc.A00);
        } else {
            c7s0 = null;
        }
        if (this.A0L != null) {
            View findViewById = viewGroup.findViewById(R.id.sticker_reaction_pill);
            c7s3 = null;
            if (findViewById != null) {
                c7s3 = new C7S3(AbstractC56372iV.A01(findViewById, false, false));
            }
        } else {
            c7s3 = null;
        }
        C7RE c7re = this.A0J;
        if (c7re != null) {
            c7s6 = new C7S6(new C57012jc((ViewStub) viewGroup.findViewById(R.id.direct_comments_pill_stub)), c7re.A00);
        } else {
            c7s6 = null;
        }
        C7RF c7rf = this.A0C;
        if (c7rf != null) {
            View findViewById2 = viewGroup.findViewById(R.id.message_header_label_stub);
            if (findViewById2 instanceof ViewStub) {
                viewStub6 = (ViewStub) findViewById2;
            } else {
                viewStub6 = null;
            }
            c7s8 = new C7S8(c7rf.A00, c7rf.A01, new C57012jc(viewStub6), c7rf.A02);
        } else {
            c7s8 = null;
        }
        C7RG c7rg = this.A00;
        if (c7rg != null) {
            View requireViewById = viewGroup.requireViewById(R.id.message_footer_label);
            C14360o3.A07(requireViewById);
            c7s9 = new C7S9(c7rg.A00, new C57012jc((ViewStub) requireViewById), c7rg.A01);
        } else {
            c7s9 = null;
        }
        C7RH c7rh = this.A01;
        if (c7rh != null) {
            View findViewById3 = viewGroup.findViewById(R.id.forwarding_shortcut_button);
            if (findViewById3 instanceof ViewStub) {
                viewStub5 = (ViewStub) findViewById3;
            } else {
                viewStub5 = null;
            }
            c7sa = new C7SA(new C57012jc(viewStub5), c7rh.A00);
        } else {
            c7sa = null;
        }
        C7RI c7ri = this.A07;
        if (c7ri != null) {
            View requireViewById2 = viewGroup.requireViewById(R.id.camera_reply_shortcut_stub);
            C14360o3.A07(requireViewById2);
            c7sb = new C7SB(AbstractC56372iV.A01(requireViewById2, false, false), c7ri.A00);
        } else {
            c7sb = null;
        }
        C7RJ c7rj = this.A02;
        if (c7rj != null) {
            View requireViewById3 = viewGroup.requireViewById(R.id.share_to_story_shortcut_stub);
            C14360o3.A07(requireViewById3);
            c7sc = new C7SC(c7rj.A00, c7rj.A01, AbstractC56372iV.A01(requireViewById3, false, false), c7rj.A02);
        } else {
            c7sc = null;
        }
        C7RK c7rk = this.A09;
        if (c7rk != null) {
            View findViewById4 = viewGroup.findViewById(R.id.save_to_collection_shortcut_stub);
            if (findViewById4 instanceof ViewStub) {
                viewStub4 = (ViewStub) findViewById4;
            } else {
                viewStub4 = null;
            }
            c7sd = new C7SD(new C57012jc(viewStub4), c7rk.A00);
        } else {
            c7sd = null;
        }
        C7RL c7rl = this.A0D;
        if (c7rl != null) {
            View findViewById5 = viewGroup.findViewById(R.id.message_info_shortcut_stub);
            if (findViewById5 instanceof ViewStub) {
                viewStub3 = (ViewStub) findViewById5;
            } else {
                viewStub3 = null;
            }
            c7se = new C7SE(c7rl.A00, new C57012jc(viewStub3), c7rl.A01);
        } else {
            c7se = null;
        }
        C7RM c7rm = this.A0H;
        if (c7rm != null) {
            View findViewById6 = viewGroup.findViewById(R.id.shared_stack_creation_shortcut_button);
            if (findViewById6 instanceof ViewStub) {
                viewStub2 = (ViewStub) findViewById6;
            } else {
                viewStub2 = null;
            }
            c7sf = new C7SF(c7rm.A00, c7rm.A01, new C57012jc(viewStub2), c7rm.A02);
        } else {
            c7sf = null;
        }
        C7RN c7rn = this.A03;
        if (c7rn != null) {
            View findViewById7 = viewGroup.findViewById(R.id.three_dot_shortcut_stub);
            if (findViewById7 instanceof ViewStub) {
                viewStub = (ViewStub) findViewById7;
            } else {
                viewStub = null;
            }
            c7sg = new C7SG(c7rn.A00, new C57012jc(viewStub), c7rn.A01);
        } else {
            c7sg = null;
        }
        if (this.A0A != null) {
            View requireViewById4 = viewGroup.requireViewById(R.id.message_debug_indicator);
            C14360o3.A07(requireViewById4);
            ViewStub viewStub7 = (ViewStub) requireViewById4;
            if (viewStub7 == null) {
                viewStub7 = null;
            }
            c7sh = new C7SH(new C57012jc(viewStub7));
        } else {
            c7sh = null;
        }
        C7RP c7rp = this.A0B;
        if (c7rp != null) {
            View requireViewById5 = viewGroup.requireViewById(R.id.message_feedback_reactions);
            C14360o3.A07(requireViewById5);
            c7si = new C7SI(c7rp.A00, AbstractC56372iV.A01(requireViewById5, false, false), c7rp.A01);
        } else {
            c7si = null;
        }
        if (this.A06 != null) {
            View requireViewById6 = viewGroup.requireViewById(R.id.bulk_selector);
            C14360o3.A07(requireViewById6);
            c7sk = new C7SK(new C57012jc((ViewStub) requireViewById6));
        } else {
            c7sk = null;
        }
        C7RR c7rr = this.A0F;
        if (c7rr != null) {
            View requireViewById7 = viewGroup.requireViewById(R.id.receiver_fetch_message_debug_indicator);
            C14360o3.A07(requireViewById7);
            c7sl = new C7SL(new C57012jc((ViewStub) requireViewById7), c7rr.A00);
        } else {
            c7sl = null;
        }
        C7RS c7rs = this.A0I;
        if (c7rs != null) {
            View requireViewById8 = viewGroup.requireViewById(R.id.subscribe_shortcut_stub);
            C14360o3.A07(requireViewById8);
            c7sm = new C7SM(c7rs.A00, AbstractC56372iV.A01(requireViewById8, false, false), c7rs.A01);
        } else {
            c7sm = null;
        }
        C7RT c7rt = this.A08;
        if (c7rt != null) {
            View requireViewById9 = viewGroup.requireViewById(R.id.clips_stacks_shortcut_stub);
            C14360o3.A07(requireViewById9);
            c7sn = new C7SN(AbstractC56372iV.A01(requireViewById9, false, false), c7rt.A00);
        } else {
            c7sn = null;
        }
        if (c7rc != null) {
            view = viewGroup.requireViewById(R.id.message_reactions_pill_placeholder);
        } else {
            view = null;
        }
        if (this.A0M) {
            view2 = ((ViewStub) viewGroup.requireViewById(R.id.message_context_line_stub)).inflate();
        } else {
            view2 = null;
        }
        C7RU c7ru = this.A05;
        if (c7ru != null) {
            View requireViewById10 = viewGroup.requireViewById(R.id.edit_response_shortcut_stub);
            C14360o3.A07(requireViewById10);
            c7so = new C7SO(AbstractC56372iV.A01(requireViewById10, false, false), c7ru.A00);
        }
        return new C7SP(view, view2, c7so, c7sk, c7sb, c7sn, c7sd, abstractC163037Ro, c7sh, c7si, c7s9, c7sa, c7s8, c7se, c162957Rg, c7sl, c162947Rf, c7sf, c7sc, c7sm, c7sg, c7qd, c7s6, c163047Rp, c7s0, c7s3);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:102:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0252  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x024d  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x011a  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0122  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0241  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0129  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x0131  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0238  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x013a A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:137:0x0140  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x022f  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x0149 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:144:0x014f  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x0226  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x0158 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:152:0x0168  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x0170  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x0221  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x0177  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x017f  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x021c  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x0188 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:171:0x018e  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x0213  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x0195  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x019d  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x01fd  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x01a4  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x01ac  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x01e7  */
    /* JADX WARN: Removed duplicated region for block: B:195:0x01b3  */
    /* JADX WARN: Removed duplicated region for block: B:200:0x01c6  */
    /* JADX WARN: Removed duplicated region for block: B:205:0x01d4  */
    /* JADX WARN: Removed duplicated region for block: B:211:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:91:0x00e7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void A02(final X.C7SP r13, final X.C162777Qo r14) {
        /*
            Method dump skipped, instructions count: 722
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C7RX.A02(X.7SP, X.7Qo):void");
    }

    public C7SP A00(LayoutInflater layoutInflater, ViewGroup viewGroup, C7QD c7qd) {
        View inflate;
        if (this instanceof C7RW) {
            C7RW c7rw = (C7RW) this;
            C14360o3.A0B(viewGroup, 0);
            C14360o3.A0B(layoutInflater, 1);
            C14360o3.A0B(c7qd, 2);
            if (((Number) c7rw.A00.A1D.getValue()).longValue() > 0) {
                inflate = C50802Vb.A00(layoutInflater, new ViewGroup.LayoutParams(-1, -2), viewGroup, R.layout.common_decorated_message_root_frame_layout, R.style.DirectMessageBorderlessGroupedRedesign, false, true);
            } else {
                inflate = layoutInflater.inflate(R.layout.common_decorated_message_root_frame_layout, viewGroup, false);
            }
            C14360o3.A0C(inflate, "null cannot be cast to non-null type com.facebook.common.messagingui.observableverticaloffsetlayout.ObservableVerticalOffsetFrameLayout");
            ObservableVerticalOffsetFrameLayout observableVerticalOffsetFrameLayout = (ObservableVerticalOffsetFrameLayout) inflate;
            View requireViewById = observableVerticalOffsetFrameLayout.requireViewById(R.id.message_content_horizontal_linear_layout);
            C14360o3.A07(requireViewById);
            LinearLayout linearLayout = (LinearLayout) requireViewById;
            View requireViewById2 = observableVerticalOffsetFrameLayout.requireViewById(R.id.message_content_horizontal_placeholder_container);
            C14360o3.A07(requireViewById2);
            ViewGroup viewGroup2 = (ViewGroup) requireViewById2;
            int indexOfChild = viewGroup2.indexOfChild(viewGroup2.requireViewById(R.id.main_content_definition_placeholder));
            viewGroup2.removeViewAt(indexOfChild);
            viewGroup2.addView(c7qd.BKF(), indexOfChild);
            View requireViewById3 = observableVerticalOffsetFrameLayout.requireViewById(R.id.sender_avatar_stub);
            C14360o3.A07(requireViewById3);
            C162947Rf c162947Rf = new C162947Rf(new C57012jc((ViewStub) requireViewById3));
            C7R8 c7r8 = c7rw.A01;
            return c7rw.A01(linearLayout, new C163027Rn(linearLayout, observableVerticalOffsetFrameLayout), new C162957Rg(observableVerticalOffsetFrameLayout, c7r8.A00, c7r8.A02), c162947Rf, c7qd);
        }
        C76I c76i = (C76I) this;
        C14360o3.A0B(viewGroup, 0);
        C14360o3.A0B(layoutInflater, 1);
        C14360o3.A0B(c7qd, 2);
        View inflate2 = layoutInflater.inflate(R.layout.common_decorated_message_root, viewGroup, false);
        C14360o3.A0C(inflate2, "null cannot be cast to non-null type com.facebook.common.messagingui.observableverticaloffsetlayout.observableverticaloffsetconstraintlayout.ObservableVerticalOffsetConstraintLayout");
        ObservableVerticalOffsetConstraintLayout observableVerticalOffsetConstraintLayout = (ObservableVerticalOffsetConstraintLayout) inflate2;
        View BKF = c7qd.BKF();
        if (BKF.getLayoutParams() == null) {
            C0K8.A0E("ConstraintLayoutMessageDecorationsDefinition", "Content view has no layout params");
        } else {
            observableVerticalOffsetConstraintLayout.addView(BKF, BKF.getLayoutParams());
        }
        BKF.setTranslationZ(-2.0f);
        C7R8 c7r82 = c76i.A01;
        C162957Rg c162957Rg = new C162957Rg(observableVerticalOffsetConstraintLayout, c7r82.A00, c7r82.A02);
        C14360o3.A0B(observableVerticalOffsetConstraintLayout, 0);
        View requireViewById4 = observableVerticalOffsetConstraintLayout.requireViewById(R.id.sender_avatar_stub);
        C14360o3.A07(requireViewById4);
        C162947Rf c162947Rf2 = new C162947Rf(new C57012jc((ViewStub) requireViewById4));
        View requireViewById5 = observableVerticalOffsetConstraintLayout.requireViewById(R.id.direct_reactions_pill_spacer);
        C14360o3.A07(requireViewById5);
        return c76i.A01(observableVerticalOffsetConstraintLayout, new C207719Hb((Space) requireViewById5, observableVerticalOffsetConstraintLayout), c162957Rg, c162947Rf2, c7qd);
    }

    public C7RX(C7RU c7ru, C7RQ c7rq, C7RI c7ri, C7RT c7rt, C7RK c7rk, C7RO c7ro, C7RP c7rp, C7RG c7rg, C7RH c7rh, C7RF c7rf, C7RL c7rl, C7R8 c7r8, C7RR c7rr, C7R9 c7r9, C7RM c7rm, C7RJ c7rj, C7RS c7rs, C7RN c7rn, C7RE c7re, C7RA c7ra, C7RC c7rc, C7RD c7rd, boolean z) {
        this.A0E = c7r8;
        this.A0G = c7r9;
        this.A0K = c7ra;
        this.A04 = c7rc;
        this.A0L = c7rd;
        this.A0J = c7re;
        this.A0C = c7rf;
        this.A00 = c7rg;
        this.A01 = c7rh;
        this.A07 = c7ri;
        this.A02 = c7rj;
        this.A09 = c7rk;
        this.A0D = c7rl;
        this.A0H = c7rm;
        this.A03 = c7rn;
        this.A0A = c7ro;
        this.A0B = c7rp;
        this.A06 = c7rq;
        this.A0F = c7rr;
        this.A0I = c7rs;
        this.A08 = c7rt;
        this.A05 = c7ru;
        this.A0M = z;
    }
}
