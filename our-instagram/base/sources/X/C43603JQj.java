package X;

import android.animation.Animator;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.common.dextricks.JITProfilePQR;
import com.facebook.forker.Process;
import com.facebook.quicklog.reliability.CancelReason;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.base.IgTextView;
import com.instagram.direct.magicmediaremix.viewmodel.MagicMediaRemixViewModel;
import com.instagram.direct.ui.countdowntimer.CountdownTimerPill;
import com.instagram.react.modules.base.IgReactQEModule;
import java.util.List;

/* renamed from: X.JQj, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C43603JQj extends C03E implements InterfaceC16820sZ {
    public final int A00;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C43603JQj(java.lang.Object r8, int r9) {
        /*
            Method dump skipped, instructions count: 260
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C43603JQj.<init>(java.lang.Object, int):void");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0002. Please report as an issue. */
    @Override // X.InterfaceC16820sZ
    public final /* bridge */ /* synthetic */ Object invoke() {
        K2T k2t;
        List list;
        Integer num;
        ViewGroup viewGroup;
        switch (this.A00) {
            case 0:
                ((InterfaceC156146zi) this.receiver).DDO();
                return C0eB.A00;
            case 1:
                return C0eB.A00;
            case 2:
                ((Drawable) this.receiver).invalidateSelf();
                return C0eB.A00;
            case 3:
                C48596LeY.A04((C48596LeY) this.receiver);
                return C0eB.A00;
            case 4:
                C48596LeY c48596LeY = (C48596LeY) this.receiver;
                C48298LYw c48298LYw = c48596LeY.A06;
                View view = c48596LeY.A00;
                if (view instanceof ViewGroup) {
                    viewGroup = (ViewGroup) view;
                } else {
                    viewGroup = null;
                }
                if (c48596LeY.A07 == null && c48298LYw != null && viewGroup != null) {
                    if (view != null) {
                        String str = "folderMenu";
                        IgTextView igTextView = c48596LeY.A03;
                        if (igTextView != null) {
                            igTextView.setVisibility(8);
                            IgTextView igTextView2 = c48596LeY.A04;
                            if (igTextView2 == null) {
                                str = "subtitleView";
                            } else {
                                igTextView2.setVisibility(8);
                            }
                        }
                        C14360o3.A0F(str);
                        throw C00O.createAndThrow();
                    }
                    C195838lR A0j = AbstractC43593JPy.A0j(viewGroup);
                    A0j.A05(c48298LYw.A00());
                    A0j.A04(AbstractC166997dE.A0p(c48298LYw.A04, 2131963124));
                    A0j.A02(2131963123);
                    A0j.A01();
                    A0j.A03(new ViewOnClickListenerC48064LPp(c48596LeY, 69));
                    c48596LeY.A07 = A0j;
                }
                return C0eB.A00;
            case 5:
            case 6:
            case 7:
            case 8:
            default:
                ((Animator) this.receiver).start();
                return C0eB.A00;
            case 9:
                AbstractC45802KPh abstractC45802KPh = (AbstractC45802KPh) this.receiver;
                if (abstractC45802KPh instanceof C45794KOz) {
                    C44462JlU.A00(((C45794KOz) abstractC45802KPh).A06).A05("GDRIVE_RESTORE_ACCOUNT_PICKER_DISMISS");
                } else if (abstractC45802KPh instanceof C45793KOy) {
                    C44462JlU.A00(((C45793KOy) abstractC45802KPh).A05).A05("GDRIVE_RESTORE_ACCOUNT_PICKER_DISMISS");
                } else {
                    boolean z = abstractC45802KPh instanceof KP0;
                    abstractC45802KPh.A0F(false);
                    KPI kpi = JQ0.A0Q(abstractC45802KPh).A03;
                    if (z) {
                        kpi.A05("GDRIVE_SETUP_ACCOUNT_PICKER_DISMISS");
                        abstractC45802KPh.A0F(false);
                    } else {
                        kpi.A05("GDRIVE_SETUP_ACCOUNT_PICKER_DISMISS");
                    }
                }
                return C0eB.A00;
            case 10:
                C47987LJp c47987LJp = (C47987LJp) this.receiver;
                C45111Jxg c45111Jxg = c47987LJp.A01;
                Integer num2 = C05F.A0C;
                if (AbstractC46753KmA.A00(c47987LJp.A09).booleanValue()) {
                    num = C05F.A01;
                } else {
                    num = num2;
                }
                C47987LJp.A01(C45111Jxg.A00(num2, num, c45111Jxg.A04, (List) c45111Jxg.A01, true), c47987LJp);
                return C0eB.A00;
            case 11:
                C47987LJp.A02((C47987LJp) this.receiver, C05F.A00, null);
                return C0eB.A00;
            case IgReactQEModule.CONFIG_KEY_OFFSET /* 12 */:
                C48733Lh1.A01((C48733Lh1) this.receiver);
                return C0eB.A00;
            case JITProfilePQR.HEADER_COMPRESSED_SIZE_OFFSET /* 13 */:
                C1570773m c1570773m = (C1570773m) this.receiver;
                C6Z0 c6z0 = c1570773m.A02;
                String str2 = c6z0.A00;
                if (str2 != null && str2.length() != 0) {
                    c6z0.A00();
                }
                c6z0.A00 = AbstractC166997dE.A0n();
                c6z0.A02();
                C1570873n c1570873n = c1570773m.A01;
                UserSession userSession = c1570873n.A03;
                if (AbstractC23021Ah.A00(userSession).A22() && C18U.A06(C06090Tz.A05, userSession, 36314021503109500L)) {
                    long j = c1570873n.A00;
                    if (j != 0) {
                        c1570873n.A02.flowEndCancel(j, CancelReason.SYSTEM_CANCELLED);
                        c1570873n.A00 = 0L;
                        c1570873n.A04.clear();
                    }
                    c1570873n.A00 = c1570873n.A02.flowStartForMarker(639238146, "direct_active_now_tray", true);
                }
                return C0eB.A00;
            case 14:
                ((C1570773m) this.receiver).A02.A00();
                return C0eB.A00;
            case Process.SIGTERM /* 15 */:
                return JR3.A02((JR3) this.receiver);
            case 16:
                C92904Eg c92904Eg = (C92904Eg) this.receiver;
                UserSession userSession2 = c92904Eg.A04;
                C06090Tz c06090Tz = C06090Tz.A05;
                if (C18U.A06(c06090Tz, userSession2, 36327254296377774L) || C18U.A06(c06090Tz, userSession2, 36329290111271160L)) {
                    InterfaceC19630xq A0x = AbstractC166987dD.A0x(userSession2);
                    int i = A0x.getInt("notes_creation_cta_variant", 0);
                    InterfaceC19610xo ARD = A0x.ARD();
                    ARD.E7D("notes_creation_cta_variant", (i + 1) % 4);
                    ARD.apply();
                    c92904Eg.A0I.Egh(AbstractC92944En.A04(AbstractC25225BEi.A0F(userSession2), userSession2, false, false, false, false, false));
                }
                if (C4AC.A0E(userSession2)) {
                    InterfaceC19610xo A0e = AbstractC31176DnK.A0e(userSession2);
                    A0e.E77("has_seen_prompt_note_flywheel_animation", false);
                    A0e.apply();
                }
                return C0eB.A00;
            case 17:
                C92904Eg c92904Eg2 = (C92904Eg) this.receiver;
                C10190gb A00 = C10190gb.A00();
                Object value = c92904Eg2.A0D.getValue();
                if (value != null) {
                    A00.A00.remove(value);
                }
                return C0eB.A00;
            case 18:
                C135976Dc.A05((C135976Dc) this.receiver);
                return C0eB.A00;
            case Process.SIGSTOP /* 19 */:
                C135976Dc c135976Dc = (C135976Dc) this.receiver;
                c135976Dc.A07.A00();
                c135976Dc.A0C.clear();
                c135976Dc.A09.clear();
                c135976Dc.A0D.clear();
                C10190gb A002 = C10190gb.A00();
                Object value2 = c135976Dc.A0E.getValue();
                if (value2 != null) {
                    A002.A00.remove(value2);
                }
                c135976Dc.A00 = null;
                c135976Dc.A01 = null;
                c135976Dc.A02 = null;
                c135976Dc.A03.clear();
                return C0eB.A00;
            case 20:
                Object value3 = ((MagicMediaRemixViewModel) ((L5G) this.receiver).A0A.getValue()).A05.getValue();
                if ((value3 instanceof K2T) && (k2t = (K2T) value3) != null && (list = k2t.A00) != null) {
                    return list;
                }
                return C16930sl.A00;
            case 21:
            case 22:
                ((C49510LuP) this.receiver).DAq();
                return C0eB.A00;
            case 23:
            case 24:
                KRC krc = (KRC) this.receiver;
                C189478aR c189478aR = krc.A00;
                if (c189478aR != null) {
                    c189478aR.A07();
                }
                KRC.A00(krc);
                return C0eB.A00;
            case 25:
                CountdownTimerPill countdownTimerPill = ((EOK) this.receiver).A06;
                if (countdownTimerPill != null) {
                    countdownTimerPill.A01();
                }
                return C0eB.A00;
            case 26:
                return Integer.valueOf(C45510KCz.A00((C45510KCz) this.receiver));
            case 27:
                C46110KbA.A02((C46110KbA) this.receiver);
                return C0eB.A00;
        }
    }
}
