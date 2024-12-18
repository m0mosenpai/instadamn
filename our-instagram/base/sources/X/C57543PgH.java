package X;

import android.app.Activity;
import android.content.Context;
import android.view.GestureDetector;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.R;
import com.facebook.catalyst.modules.cameraroll.CameraRollManager;
import com.facebook.common.dextricks.JITProfilePQR;
import com.facebook.forker.Process;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.base.IgTextView;
import com.instagram.quickpromotion.intf.QuickPromotionSlot;
import com.instagram.react.modules.base.IgReactQEModule;
import go.Seq;

/* renamed from: X.PgH, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C57543PgH extends C0YY implements InterfaceC16820sZ {
    public final int A00;
    public final Object A01;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C57543PgH(Object obj, int i) {
        super(0);
        this.A00 = i;
        this.A01 = obj;
    }

    public static C110964z8 A00(C57543PgH c57543PgH) {
        C110964z8 c110964z8 = new C110964z8();
        c110964z8.A0I((ConstraintLayout) ((PCP) c57543PgH.A01).A09.getValue());
        return c110964z8;
    }

    public static InterfaceC09390do A01(Object obj, int i) {
        return C1XM.A00(new C57543PgH(obj, i));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v16, types: [X.PlO, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v31, types: [X.2zJ, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v32, types: [X.2zJ, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v33, types: [X.2zJ, java.lang.Object] */
    @Override // X.InterfaceC16820sZ
    public final /* bridge */ /* synthetic */ Object invoke() {
        String str;
        switch (this.A00) {
            case 0:
                return C68U.A00(((NTX) this.A01).A0A, R.raw.countdown_1340ms_round_style);
            case 1:
                Context context = ((NTX) this.A01).A0A;
                return new C9RW(context, AbstractC166997dE.A0p(context, 2131969964));
            case 2:
                return ((NTU) this.A01).A07.findViewById(android.R.id.content);
            case 3:
                return MSZ.A0j(((NTU) this.A01).A07);
            case 4:
                long A00 = (long) (C18U.A00(C06090Tz.A05, ((NTK) this.A01).A05, 37157943921082437L) * 1000.0d);
                if (A00 <= 0) {
                    A00 = 3000;
                }
                return Long.valueOf(A00);
            case 5:
                C27961Xa A002 = AbstractC54912fq.A00();
                NTK ntk = (NTK) this.A01;
                Activity activity = ntk.A03;
                C14360o3.A0C(activity, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
                InterfaceC11380iw interfaceC11380iw = ntk.A04;
                UserSession userSession = ntk.A05;
                QuickPromotionSlot quickPromotionSlot = QuickPromotionSlot.A0r;
                C54922fr A0S = AbstractC31175DnJ.A0S();
                A0S.A09 = new C55152gF(ntk);
                return A002.A01((FragmentActivity) activity, interfaceC11380iw, userSession, A0S.A00(), quickPromotionSlot);
            case 6:
                return ((PCM) this.A01).A04.findViewById(R.id.bottom_sheet_contents);
            case 7:
                PCM pcm = (PCM) this.A01;
                LayoutInflater A0P = AbstractC25228BEl.A0P(pcm.A04);
                InterfaceC09390do interfaceC09390do = pcm.A06;
                int i = 0;
                View A07 = AbstractC31175DnJ.A07(A0P, MSW.A0B(interfaceC09390do), R.layout.layout_call_peek_promo_learn_more_sheet, false);
                IgTextView A0Y = AbstractC31172DnG.A0Y(A07, R.id.peek_promo_sheet_button_primary);
                pcm.A00 = A0Y;
                if (A0Y == null) {
                    str = "primaryButtonView";
                } else {
                    Ok3.A00(A0Y, 32, pcm);
                    A0Y.setVisibility(0);
                    AbstractC56952jT.A01(A0Y);
                    IgTextView A0Y2 = AbstractC31172DnG.A0Y(A07, R.id.peek_promo_sheet_button_secondary);
                    pcm.A01 = A0Y2;
                    if (A0Y2 == null) {
                        str = "secondaryButtonView";
                    } else {
                        Ok3.A00(A0Y2, 33, pcm);
                        A0Y2.setVisibility(0);
                        AbstractC56952jT.A01(A0Y2);
                        PCM.A00(pcm);
                        View A0E = MSY.A0E(interfaceC09390do);
                        C51889MwX c51889MwX = pcm.A02;
                        if (c51889MwX != null) {
                            i = c51889MwX.A00;
                        }
                        AbstractC13880nE.A0Y(A0E, i);
                        pcm.A03 = true;
                        return A07;
                    }
                }
                C14360o3.A0F(str);
                throw C00O.createAndThrow();
            case 8:
                return Double.valueOf(C18U.A00(C06090Tz.A05, ((NTQ) this.A01).A02, 37159322606174304L));
            case 9:
                return ((PCG) this.A01).A02.requireViewById(R.id.call_participant_omni_grid);
            case 10:
                PCG pcg = (PCG) this.A01;
                ViewOnTouchListenerC51475MoM viewOnTouchListenerC51475MoM = new ViewOnTouchListenerC51475MoM(AbstractC166997dE.A0L(pcg.A02));
                ((GestureDetector) viewOnTouchListenerC51475MoM.A04.getValue()).setIsLongpressEnabled(false);
                viewOnTouchListenerC51475MoM.A01 = new C56682PEa(pcg);
                viewOnTouchListenerC51475MoM.A00 = new PEY(pcg);
                return viewOnTouchListenerC51475MoM;
            case 11:
                View childAt = AbstractC31173DnH.A0F(((PCG) this.A01).A02, R.id.cowatch_playback_view_pager).getChildAt(0);
                C14360o3.A0C(childAt, AbstractC111324zv.A00(9));
                return childAt;
            case IgReactQEModule.CONFIG_KEY_OFFSET /* 12 */:
                return new C55751OpK((PCG) this.A01);
            case JITProfilePQR.HEADER_COMPRESSED_SIZE_OFFSET /* 13 */:
                PCG pcg2 = (PCG) this.A01;
                ViewOnTouchListenerC51475MoM viewOnTouchListenerC51475MoM2 = new ViewOnTouchListenerC51475MoM(AbstractC166997dE.A0L(pcg2.A02));
                viewOnTouchListenerC51475MoM2.A00 = new PEX(pcg2);
                if (!C18U.A06(C06090Tz.A05, pcg2.A03, 36314897676241825L)) {
                    return viewOnTouchListenerC51475MoM2;
                }
                viewOnTouchListenerC51475MoM2.A02 = new O5E(pcg2);
                return viewOnTouchListenerC51475MoM2;
            case 14:
                NTR ntr = (NTR) this.A01;
                UserSession userSession2 = ntr.A05;
                Activity activity2 = ntr.A03;
                return new C63002SaQ(activity2, (ViewGroup) AbstractC166987dD.A0c(AbstractC43592JPx.A08(activity2), android.R.id.content), userSession2, new SM4(activity2), new C56687PEf(ntr));
            case Process.SIGTERM /* 15 */:
                return AbstractC166987dD.A0d(((PCP) this.A01).A09).findViewById(R.id.videocall_screen_capture_saved_message);
            case 16:
                View A0J = MSZ.A0J(((PCP) this.A01).A0A);
                C14360o3.A0C(A0J, AbstractC111324zv.A00(14));
                return A0J;
            case 17:
                return C3PW.A00(((PCP) this.A01).A03, R.id.call_screen_capture_stub);
            case 18:
                return AbstractC166987dD.A0d(((PCP) this.A01).A0F).findViewById(R.id.camera_countdown_container);
            case Process.SIGSTOP /* 19 */:
                C110964z8 A003 = A00(this);
                A003.A0C(R.id.videocall_screen_capture_thumbnail, 6, 0, 6);
                A003.A0C(R.id.videocall_screen_capture_thumbnail, 7, 0, 7);
                A003.A0C(R.id.videocall_screen_capture_thumbnail, 3, 0, 3);
                A003.A0C(R.id.videocall_screen_capture_thumbnail, 4, 0, 4);
                C110964z8.A02(A003, R.id.videocall_screen_capture_thumbnail).A03.A02 = 1.0f;
                A003.A07(R.id.videocall_screen_capture_thumbnail, 1.0f);
                return A003;
            case 20:
                PCP pcp = (PCP) this.A01;
                View findViewById = pcp.A03.findViewById(R.id.videocall_screen_capture_cancel);
                Ok3.A00(findViewById, 35, pcp);
                return findViewById;
            case 21:
                return ((PCP) this.A01).A03.findViewById(R.id.selfie_flash_overlay);
            case 22:
                View A0J2 = MSZ.A0J(((PCP) this.A01).A0G);
                C14360o3.A0C(A0J2, AbstractC111324zv.A00(14));
                return A0J2;
            case 23:
                return C3PW.A00(((PCP) this.A01).A03, R.id.pre_capture_camera_countdown_container_stub);
            case 24:
                C110964z8 A004 = A00(this);
                C110964z8.A02(A004, R.id.videocall_screen_capture_thumbnail).A03.A02 = 0.3f;
                A004.A07(R.id.videocall_screen_capture_thumbnail, 0.3f);
                return A004;
            case 25:
                View findViewById2 = AbstractC166987dD.A0d(((PCP) this.A01).A09).findViewById(R.id.screen_capture_overlay_container);
                Context context2 = findViewById2.getContext();
                findViewById2.setContentDescription(AnonymousClass001.A0R(context2.getString(2131976796), context2.getString(2131976798)));
                return findViewById2;
            case 26:
                PCP pcp2 = (PCP) this.A01;
                View findViewById3 = AbstractC166987dD.A0d(pcp2.A09).findViewById(R.id.videocall_screen_capture_thumbnail);
                ViewOnTouchListenerC51475MoM viewOnTouchListenerC51475MoM3 = pcp2.A05;
                AbstractC167007dF.A1C(findViewById3);
                findViewById3.setOnTouchListener(viewOnTouchListenerC51475MoM3);
                return findViewById3;
            case 27:
                return AbstractC166987dD.A0d(((PCP) this.A01).A09).findViewById(R.id.videocall_screen_capture_tap_to_share_message);
            case 28:
                C110964z8 A005 = A00(this);
                A005.A0C(R.id.videocall_screen_capture_thumbnail, 7, R.id.videocall_screen_capture_dismissal_guideline, 6);
                return A005;
            case CameraRollManager.IMAGES_MEDIA_LATITUDE_LONGITUDE_DEPRECATED_API_LEVEL /* 29 */:
                PC2 pc2 = (PC2) this.A01;
                View view = pc2.A00;
                View A0A = AbstractC31172DnG.A0A(AbstractC25228BEl.A0P(view), (ViewGroup) view.findViewById(R.id.bottom_sheet_contents), R.layout.layout_call_screen_share_nux_sheet);
                ((C64P) A0A.findViewById(R.id.screen_share_nux_accept_button)).setPrimaryActionOnClickListener(new Ok3(pc2, 36));
                return A0A;
            case 30:
                Object systemService = ((NTN) this.A01).A01.getSystemService("media_projection");
                if (systemService != null) {
                    return systemService;
                }
                throw AbstractC166997dE.A0g();
            case 31:
                int A072 = AbstractC25225BEi.A07(C06090Tz.A05, ((NTN) this.A01).A02, 36595891616483606L);
                EnumC53142Nev[] values = EnumC53142Nev.values();
                if (A072 >= 0 && A072 < values.length) {
                    return values[A072];
                }
                return EnumC53142Nev.A04;
            case 32:
                return ((PC8) this.A01).A00.findViewById(R.id.bottom_sheet_contents);
            case 33:
                C66392zG A006 = C66362zD.A00(((PC8) this.A01).A00.getContext());
                A006.A01(NFI.A00);
                A006.A01(NFJ.A00);
                A006.A09 = true;
                return A006.A00();
            case 34:
                PC8 pc8 = (PC8) this.A01;
                RecyclerView A0B = AbstractC43592JPx.A0B(AbstractC166987dD.A0d(pc8.A05), R.id.participants_in_call_rv);
                AbstractC31174DnI.A15(pc8.A00.getContext(), A0B);
                AbstractC37304Gc5.A10(A0B, pc8.A03);
                A0B.setNestedScrollingEnabled(true);
                C70623Ez c70623Ez = new C70623Ez();
                ((C3F0) c70623Ez).A00 = false;
                A0B.setItemAnimator(c70623Ez);
                return A0B;
            case 35:
                PC8 pc82 = (PC8) this.A01;
                return AbstractC31172DnG.A0A(AbstractC25228BEl.A0P(pc82.A00), MSW.A0B(pc82.A02), R.layout.layout_people_management);
            case 36:
                return ((PC9) this.A01).A00.findViewById(R.id.bottom_sheet_contents);
            case 37:
                return AbstractC166987dD.A0d(((PC9) this.A01).A06).findViewById(R.id.settings_room_name_text);
            case 38:
                C66392zG A007 = C66362zD.A00(((PC9) this.A01).A00.getContext());
                A007.A01(new Object());
                A007.A01(new Object());
                return AbstractC31173DnH.A0R(A007, new Object());
            case 39:
                PC9 pc9 = (PC9) this.A01;
                RecyclerView recyclerView = (RecyclerView) AbstractC166987dD.A0c(AbstractC166987dD.A0d(pc9.A06), R.id.settings_rv);
                AbstractC31174DnI.A15(recyclerView.getContext(), recyclerView);
                AbstractC37304Gc5.A10(recyclerView, pc9.A04);
                return recyclerView;
            case 40:
                PC9 pc92 = (PC9) this.A01;
                return AbstractC31175DnJ.A07(AbstractC25228BEl.A0P(pc92.A00), MSW.A0B(pc92.A02), R.layout.layout_rooms_settings, false);
            case Seq.NULL_REFNUM /* 41 */:
                View view2 = (View) this.A01;
                view2.requestApplyInsets();
                return view2;
            case Seq.RefTracker.REF_OFFSET /* 42 */:
                return new PCN(((C52691NTc) this.A01).A0A);
            case 43:
                ((C52691NTc) this.A01).A0E.A05(new Object());
                return C0eB.A00;
            case 44:
                return ((C52691NTc) this.A01).A0A.findViewById(R.id.snack_bar_container);
            case 45:
                return new C3O0((ViewStub) AbstractC166987dD.A0c(((C52691NTc) this.A01).A0A, R.id.snack_bar), false);
            case JITProfilePQR.MEGA_ZIP_NAME_PREFIX_LEN /* 46 */:
                throw AbstractC166987dD.A15("toggleButton$delegate");
            case 47:
                throw AbstractC166987dD.A15("stub");
            case 48:
                throw AbstractC166987dD.A15("toggleButton$delegate");
            default:
                InterfaceC58261Ps5 interfaceC58261Ps5 = InterfaceC58261Ps5.A00;
                C52012MzG c52012MzG = (C52012MzG) this.A01;
                return interfaceC58261Ps5.ALE(c52012MzG.A02, new C55758OpR(c52012MzG));
        }
    }
}
