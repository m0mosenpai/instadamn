package X;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import androidx.fragment.app.FragmentActivity;
import com.facebook.R;
import com.facebook.common.dextricks.JITProfilePQR;
import com.facebook.traffic.knob.InbandTelemetryBweEstimate;
import com.instagram.api.schemas.IGAIAgentVisibilityStatus;
import com.instagram.bloks.hosting.IgBloksScreenConfig;
import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.debug.devoptions.avatars.ImmersiveAvatarViewerDebugFragment;
import com.instagram.debug.devoptions.metadata.view.ThreadMetadataOverrideFragment;
import com.instagram.direct.fragment.sharesheet.DirectShareSheetFragment;
import com.instagram.direct.groupinvites.models.InviteLinkShareInfo;
import com.instagram.direct.model.messaginguser.MessagingUser;
import com.instagram.modal.ModalActivity;
import com.instagram.model.direct.DirectThreadKey;
import com.instagram.model.reels.Reel;
import com.instagram.react.modules.base.IgReactQEModule;
import com.instagram.ui.widget.gradientspinneravatarview.GradientSpinnerAvatarView;
import com.instagram.user.model.User;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.7J5, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C7J5 implements C7J6 {
    public final AbstractC59962oe A00;
    public final UserSession A01;
    public final InterfaceC16820sZ A02;
    public final InterfaceC11380iw A03;
    public final C7YP A04;
    public final C7YB A05;
    public final C7YJ A06;
    public final InterfaceC164937Zi A07;
    public final C7Zf A08;
    public final C7YI A09;
    public final InterfaceC165057Zu A0A;
    public final InterfaceC165497ac A0B;
    public final InterfaceC08830cm A0C;
    public final InterfaceC08830cm A0D;
    public final InterfaceC08830cm A0E;
    public final InterfaceC08830cm A0F;
    public final InterfaceC16820sZ A0G;

    public C7J5(AbstractC59962oe abstractC59962oe, InterfaceC11380iw interfaceC11380iw, UserSession userSession, C7YP c7yp, C7YB c7yb, C7YJ c7yj, InterfaceC164937Zi interfaceC164937Zi, C7Zf c7Zf, C7YI c7yi, InterfaceC165057Zu interfaceC165057Zu, InterfaceC165497ac interfaceC165497ac, InterfaceC08830cm interfaceC08830cm, InterfaceC08830cm interfaceC08830cm2, InterfaceC08830cm interfaceC08830cm3, InterfaceC08830cm interfaceC08830cm4, InterfaceC16820sZ interfaceC16820sZ, InterfaceC16820sZ interfaceC16820sZ2) {
        C14360o3.A0B(abstractC59962oe, 1);
        C14360o3.A0B(interfaceC11380iw, 3);
        C14360o3.A0B(c7yp, 4);
        C14360o3.A0B(c7yj, 5);
        C14360o3.A0B(interfaceC16820sZ, 6);
        C14360o3.A0B(c7yi, 7);
        C14360o3.A0B(interfaceC165057Zu, 8);
        C14360o3.A0B(c7Zf, 9);
        C14360o3.A0B(interfaceC164937Zi, 10);
        C14360o3.A0B(interfaceC165497ac, 11);
        C14360o3.A0B(c7yb, 12);
        C14360o3.A0B(interfaceC08830cm, 13);
        C14360o3.A0B(interfaceC08830cm3, 15);
        C14360o3.A0B(interfaceC08830cm4, 16);
        C14360o3.A0B(interfaceC16820sZ2, 17);
        this.A00 = abstractC59962oe;
        this.A01 = userSession;
        this.A03 = interfaceC11380iw;
        this.A04 = c7yp;
        this.A06 = c7yj;
        this.A02 = interfaceC16820sZ;
        this.A09 = c7yi;
        this.A0A = interfaceC165057Zu;
        this.A08 = c7Zf;
        this.A07 = interfaceC164937Zi;
        this.A0B = interfaceC165497ac;
        this.A05 = c7yb;
        this.A0C = interfaceC08830cm;
        this.A0E = interfaceC08830cm2;
        this.A0D = interfaceC08830cm3;
        this.A0F = interfaceC08830cm4;
        this.A0G = interfaceC16820sZ2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:135:0x0350, code lost:
    
        if (X.C14360o3.A0K(r4.userId, r3.BtE()) == false) goto L137;
     */
    /* JADX WARN: Removed duplicated region for block: B:64:0x01e3  */
    @Override // X.C7J6
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void Coo(android.view.View r26, android.view.View r27, android.view.View r28, android.view.View r29, android.view.View r30, android.view.View r31, android.view.View r32, android.view.View r33, android.view.View r34, android.view.View r35) {
        /*
            Method dump skipped, instructions count: 884
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C7J5.Coo(android.view.View, android.view.View, android.view.View, android.view.View, android.view.View, android.view.View, android.view.View, android.view.View, android.view.View, android.view.View):void");
    }

    @Override // X.C7J6
    public final void D5n(View view) {
        C14360o3.A0B(view, 0);
        Context requireContext = this.A00.requireContext();
        String string = requireContext.getString(2131954494);
        C14360o3.A07(string);
        C199928sw c199928sw = new C199928sw(null, requireContext.getDrawable(R.drawable.instagram_video_chat_pano_outline_24), null, new C23942Ajc(this), null, string, 0, 0, 0, false, false, false, true, false, false, false);
        String string2 = requireContext.getString(2131954493);
        C14360o3.A07(string2);
        ArrayList A1N = AbstractC16960so.A1N(c199928sw, new C199928sw(null, requireContext.getDrawable(R.drawable.instagram_call_pano_outline_24), null, new C23943Ajd(this), null, string2, 0, 0, 0, false, false, false, true, false, false, false));
        C8QJ c8qj = new C8QJ(requireContext, this.A01, null, false);
        c8qj.A02(A1N);
        c8qj.getContentView().measure(0, 0);
        view.measure(0, 0);
        c8qj.showAsDropDown(view, -(c8qj.getContentView().getMeasuredWidth() - view.getMeasuredWidth()), 0);
    }

    @Override // X.C7J6
    public final void Dso(String str) {
        InterfaceC83733oI CCa;
        C2EC Co6;
        User user;
        String str2;
        C14360o3.A0B(str, 0);
        if (!this.A0B.CQu()) {
            if (A00().C7r().CRx() && (user = (User) AbstractC001800i.A0J(A00().C7r().C7W().A0b)) != null && user.A1Q()) {
                UserSession userSession = this.A01;
                User user2 = (User) AbstractC001800i.A0J(A00().C7r().C7W().A0b);
                if (user2 != null) {
                    str2 = user2.A03.Aaj();
                } else {
                    str2 = null;
                }
                Bundle A00 = AbstractC61636Rr0.A00(new C09530e4("creator_ai_creator_igid", str2), new C09530e4("creator_ai_entry_point_extra", "thread_title_bar"));
                AbstractC59962oe abstractC59962oe = this.A00;
                new C6XJ(abstractC59962oe.requireActivity(), A00, userSession, ModalActivity.class, "creator_ai_settings").A0D(abstractC59962oe, 107);
                return;
            }
            C7YP c7yp = this.A04;
            String str3 = (String) this.A0D.get();
            if (!C7YP.A00(c7yp).C7r().CeQ()) {
                return;
            }
            if (!C7YP.A00(c7yp).C7r().CVY() && C28151Xt.A02 != null) {
                C18920wW c18920wW = c7yp.A01;
                String C7q = C7YP.A00(c7yp).C7r().C7q();
                List C7U = C7YP.A00(c7yp).C7r().C7U();
                C14360o3.A0B(c18920wW, 0);
                C75R.A05(c18920wW, null, null, "direct_entry_point", C7q, null, C7U);
            }
            UserSession userSession2 = c7yp.A02;
            InterfaceC11380iw interfaceC11380iw = c7yp.A00;
            C3o9 B90 = C7YP.A00(c7yp).C7r().B90();
            C14360o3.A07(B90);
            boolean z = c7yp.A04;
            C14360o3.A0B(interfaceC11380iw, 1);
            C18920wW A01 = AbstractC12220kQ.A01(interfaceC11380iw, userSession2);
            InterfaceC02590Ai A002 = A01.A00(A01.A00, "direct_thread_tap_details_button");
            A002.AAP(ThreadMetadataOverrideFragment.BUNDLE_THREAD_ID, JRE.A06(B90));
            A002.A7v("is_e2ee", Boolean.valueOf(JRE.A09(B90)));
            InterfaceC83733oI A05 = JRE.A05(B90);
            if (A05 != null) {
                A002.A9K("occamadillo_thread_id", AbstractC92784Dr.A01(A05));
                A002.AAP("open_thread_id", AbstractC92784Dr.A02(A05));
                A002.A7v("is_bottom_sheet_thread", Boolean.valueOf(z));
            }
            A002.AAP(ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY, str);
            A002.Cht();
            if (str3 != null) {
                Co6 = ((C2DU) AbstractC28761aE.A00(userSession2)).A0N(str3);
            } else {
                InterfaceC83713oG C7i = C7YP.A00(c7yp).C7r().C7i();
                C14360o3.A07(C7i);
                if (C7i instanceof C163787Us) {
                    InterfaceC83713oG C7i2 = C7YP.A00(c7yp).C7r().C7i();
                    C14360o3.A07(C7i2);
                    CCa = AbstractC140946Yw.A05(C7i2);
                } else {
                    C7U0 A003 = C7YP.A00(c7yp);
                    EnumC2054697t enumC2054697t = EnumC2054697t.A0k;
                    if (A003.AHB(enumC2054697t)) {
                        Co6 = C7YP.A00(c7yp).C7r().Co6();
                        if (Co6 == null) {
                            throw new IllegalStateException("Required value was null.");
                        }
                    } else {
                        AbstractC34059F1m.A00(enumC2054697t);
                        CCa = C7YP.A00(c7yp).C7r().CCa();
                    }
                }
                C7YP.A02(c7yp, CCa);
                return;
            }
            C7YP.A01(c7yp, Co6);
        }
    }

    private final C7U0 A00() {
        Object obj = this.A0C.get();
        C14360o3.A07(obj);
        return (C7U0) obj;
    }

    private final InviteLinkShareInfo A01() {
        C2EC Co6 = ((C7U0) this.A0C.get()).C7r().Co6();
        if (Co6 == null) {
            return null;
        }
        String BAY = Co6.BAY();
        String C7I = Co6.C7I();
        String C7q = Co6.C7q();
        UserSession userSession = this.A01;
        boolean A0K = C14360o3.A0K(userSession.userId, Co6.Asv());
        String Asv = Co6.Asv();
        String C7l = Co6.C7l();
        return new InviteLinkShareInfo(null, (ImageUrl) C4GQ.A00(userSession, Co6).A00, BAY, C7I, C7q, Asv, C7l, C160857It.A00(((C81663kb) Co6).A01.A0t, userSession.userId, 29), Co6.C7g(), Co6.AdZ(), Co6.BSB(), A0K, true);
    }

    @Override // X.C7J6
    public final void CvX() {
        AbstractC59962oe abstractC59962oe = this.A00;
        Context requireContext = abstractC59962oe.requireContext();
        UserSession userSession = this.A01;
        AbstractC35172FfP.A01(requireContext, abstractC59962oe.requireActivity(), this.A03, userSession, new C35252Fgl(null, userSession, A00()).A04(), C05F.A00);
    }

    @Override // X.C7J6
    public final void Czg() {
        C51702MsX c51702MsX;
        String str;
        String str2;
        InterfaceC163837Ux C7r = ((C7U0) this.A0C.get()).C7r();
        UserSession userSession = this.A01;
        if (!C98Q.A00(userSession).A00(C7r.C7i(), 69)) {
            C146106i8 c146106i8 = new C146106i8();
            c146106i8.A04();
            c146106i8.A02();
            c146106i8.A07(R.drawable.instagram_info_pano_outline_24);
            c146106i8.A0D = this.A00.requireContext().getString(2131953878);
            C41451vu.A01.E4s(new C3KD(c146106i8.A00()));
            return;
        }
        C7CO c7co = (C7CO) this.A0G.invoke();
        String str3 = null;
        if (c7co != null) {
            c51702MsX = c7co.A07();
            if (c51702MsX != null && (str2 = c51702MsX.A02) != null && c51702MsX.A00 == C05F.A0C) {
                this.A08.Cqb(str2, null);
                return;
            }
        } else {
            c51702MsX = null;
        }
        C3o9 B90 = C7r.B90();
        C14360o3.A07(B90);
        String A07 = JRE.A07(B90);
        if (!C7r.CVY()) {
            if (c51702MsX != null) {
                str3 = c51702MsX.A04;
            }
            if (str3 == null) {
                str3 = userSession.userId;
            }
            str = AbstractC28415CgL.A01(str3, C7r.BSH(), true);
            str3 = AbstractC28415CgL.A01(str3, C7r.BSH(), false);
        } else {
            str = null;
        }
        if (c51702MsX == null || A07 == null) {
            return;
        }
        FragmentActivity requireActivity = this.A00.requireActivity();
        boolean z = c51702MsX.A06;
        boolean A072 = C23031Ai.A07(AbstractC23021Ah.A00(userSession), AnonymousClass001.A0R("blend_last_invite_time_ms", A07), 1L);
        String str4 = c51702MsX.A02;
        String str5 = c51702MsX.A04;
        C7r.CVY();
        AbstractC28415CgL.A02(requireActivity, userSession, A07, str4, str5, str, str3, z, A072);
    }

    @Override // X.C7J6
    public final void D1n() {
        this.A07.ATg(true);
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x0042, code lost:
    
        if (X.C14360o3.A0K(r10.Bj3(), r8.userId) != false) goto L8;
     */
    @Override // X.C7J6
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void DUu(boolean r14) {
        /*
            Method dump skipped, instructions count: 299
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C7J5.DUu(boolean):void");
    }

    @Override // X.C7J6
    public final void Ddg(Reel reel, GradientSpinnerAvatarView gradientSpinnerAvatarView) {
        if (!this.A0B.CQu()) {
            this.A0A.Cro(reel, gradientSpinnerAvatarView);
        }
    }

    @Override // X.C7J6
    public final void Dnw(boolean z) {
        User Ba5;
        Boolean AaV;
        if (z) {
            AbstractC54148Nwk.A00(this.A01).A03(C05F.A0Y);
        }
        C2EC Co6 = ((C7U0) this.A0C.get()).C7r().Co6();
        C7T3 c7t3 = C7T3.A0G;
        if (Co6 != null) {
            if (Co6.CS1()) {
                c7t3 = C7T3.A07;
            } else {
                UserSession userSession = this.A01;
                if (MU6.A03(userSession, Co6) && (Ba5 = Co6.Ba5()) != null && (AaV = Ba5.A03.AaV()) != null && AaV.booleanValue()) {
                    c7t3 = C7T3.A06;
                } else if (Co6.C7g() == 1014 && C18U.A06(C06090Tz.A05, userSession, 36331291565638888L)) {
                    c7t3 = C7T3.A0R;
                }
            }
        }
        this.A06.A01(null, c7t3, null, false);
    }

    @Override // X.C7J6
    public final void DoE(boolean z) {
        if (z) {
            AbstractC54148Nwk.A00(this.A01).A03(C05F.A0Y);
        }
        C7T3 c7t3 = C7T3.A0F;
        C2EC Co6 = ((C7U0) this.A0C.get()).C7r().Co6();
        if (Co6 != null) {
            if (Co6.CS1()) {
                c7t3 = C7T3.A07;
            } else if (MU6.A01(this.A01, Co6)) {
                c7t3 = C7T3.A06;
            }
        }
        this.A06.A01(null, c7t3, null, true);
    }

    @Override // X.C7J6
    public final void DsS() {
        String str;
        UserSession userSession = this.A01;
        String str2 = userSession.userId;
        String BYt = A00().C7r().BYt();
        DirectThreadKey A02 = JRE.A02(A00().C7r().Afi());
        if (A02 != null) {
            str = A02.A00;
        } else {
            str = null;
        }
        if (BYt != null && str != null) {
            List Axh = A00().C7r().Axh();
            ArrayList arrayList = new ArrayList();
            if (Axh != null) {
                Iterator it = Axh.iterator();
                while (it.hasNext()) {
                    switch (((Number) ((C206419By) it.next()).A01).intValue()) {
                        case 4:
                            arrayList.add("appointment_booked");
                            break;
                        case 5:
                            arrayList.add("order_placed");
                            break;
                        case 6:
                            arrayList.add("payment_received");
                            break;
                        case 7:
                            arrayList.add("order_shipped");
                            break;
                        case 10:
                            arrayList.add("lead");
                            break;
                        case 11:
                            arrayList.add("important");
                            break;
                        case IgReactQEModule.CONFIG_KEY_OFFSET /* 12 */:
                            arrayList.add("follow_up");
                            break;
                        case JITProfilePQR.HEADER_COMPRESSED_SIZE_OFFSET /* 13 */:
                            arrayList.add("order_placed");
                            break;
                        case 14:
                            arrayList.add("lead");
                            break;
                    }
                }
            }
            if (A00().C7r().CUy() && AbstractC31235DoI.A01(userSession)) {
                arrayList.add("flag");
            }
            String join = TextUtils.join(InbandTelemetryBweEstimate.COMPACT_DEBUG_STR_DELIMITER_LEVEL_1, arrayList);
            if (!AbstractC23021Ah.A00(userSession).A1t()) {
                IgBloksScreenConfig igBloksScreenConfig = new IgBloksScreenConfig(userSession);
                igBloksScreenConfig.A0l = true;
                igBloksScreenConfig.A0R = "com.bloks.www.biig.tas.intro";
                Context requireContext = this.A00.requireContext();
                HashMap hashMap = new HashMap();
                HashMap hashMap2 = new HashMap();
                HashMap hashMap3 = new HashMap();
                BitSet bitSet = new BitSet(2);
                hashMap.put("seller_id", str2);
                bitSet.set(1);
                hashMap.put("buyer_id", BYt);
                bitSet.set(0);
                hashMap.put(ThreadMetadataOverrideFragment.BUNDLE_THREAD_ID, str);
                hashMap.put("labels_as_string", join);
                hashMap.put(ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY, "thread_view");
                if (bitSet.nextClearBit(0) >= 2) {
                    C66277U6x A022 = C66277U6x.A02("com.bloks.www.biig.tas.intro", AbstractC191768eY.A01(hashMap), hashMap2);
                    A022.A00 = -1;
                    A022.A05 = null;
                    A022.A01 = 0L;
                    A022.A06 = null;
                    A022.A03 = null;
                    A022.A02 = null;
                    A022.A04 = null;
                    A022.A08(hashMap3);
                    A022.A04(requireContext, igBloksScreenConfig);
                    AbstractC23021Ah.A00(userSession).A0P();
                } else {
                    throw new IllegalStateException(MSV.A00(13));
                }
            } else {
                HashMap hashMap4 = new HashMap();
                hashMap4.put("seller_id", str2);
                hashMap4.put("buyer_id", BYt);
                hashMap4.put(ThreadMetadataOverrideFragment.BUNDLE_THREAD_ID, str);
                hashMap4.put("labels_as_string", join);
                hashMap4.put(ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY, "thread_view");
                AbstractC34058F1l.A00(userSession).A00(this.A00.requireContext(), BYt, "IG_TAS_SCREEN_IN_THREAD", hashMap4, new C9F5(30, hashMap4, this), false);
            }
            C7P0 c7p0 = new C7P0(this.A03, userSession);
            C14360o3.A0B(str2, 1);
            C7P0.A01(null, C7P1.CLICK, C7P2.ENTRYPOINT, c7p0, BYt, str2);
        }
    }

    @Override // X.C7J6
    public final void Dxt(MessagingUser messagingUser) {
        AbstractC59962oe abstractC59962oe = this.A00;
        if (abstractC59962oe.getContext() != null) {
            C2EC Co6 = ((C7U0) this.A0C.get()).C7r().Co6();
            if (Co6 != null && Co6.CCq() != null) {
                Context context = abstractC59962oe.getContext();
                if (context != null) {
                    UserSession userSession = this.A01;
                    InterfaceC11380iw interfaceC11380iw = this.A03;
                    Long CCq = Co6.CCq();
                    if (CCq != null) {
                        FA0.A00(context, interfaceC11380iw, userSession, messagingUser, CCq.longValue());
                        return;
                    }
                    throw new IllegalStateException("Required value was null.");
                }
                throw new IllegalStateException("Required value was null.");
            }
            if (this.A0B.CQu()) {
                return;
            }
            this.A09.Cre(messagingUser, "direct_thread_user_row");
        }
    }

    private final C2EC A02() {
        C2EC Co6 = A00().C7r().Co6();
        if (Co6 != null) {
            return Co6;
        }
        throw new IllegalStateException("Required value was null.");
    }

    @Override // X.C7J6
    public final void Cw9() {
        Long l;
        List list = A00().C7r().C7W().A0b;
        boolean z = false;
        if (A00().C7r().C7W().A08 == 1014) {
            z = true;
        }
        Bundle bundle = new Bundle();
        C17P c17p = ((User) list.get(0)).A03;
        if (z) {
            String Aae = c17p.Aae();
            bundle.putString("persona_id", Aae);
            UserSession userSession = this.A01;
            C25531Mh A00 = C28484Chc.A00(new C28484Chc(userSession));
            if (((AbstractC02600Aj) A00).A00.isSampled()) {
                A00.A0k("thread_view_header_settings_button_clicked");
                if (Aae != null) {
                    l = AbstractC003100w.A0k(10, Aae);
                } else {
                    l = null;
                }
                A00.A0i(l);
                A00.Cht();
            }
            AbstractC59962oe abstractC59962oe = this.A00;
            new C6XJ(abstractC59962oe.requireActivity(), bundle, userSession, ModalActivity.class, "AI_SETTINGS").A0C(abstractC59962oe.requireActivity());
            return;
        }
        bundle.putString("creator_ai_creator_igid", c17p.Aaj());
        bundle.putString("creator_ai_entry_point_extra", "in_thread");
        UserSession userSession2 = this.A01;
        AbstractC59962oe abstractC59962oe2 = this.A00;
        new C6XJ(abstractC59962oe2.requireActivity(), bundle, userSession2, ModalActivity.class, "creator_ai_settings").A0D(abstractC59962oe2, 107);
    }

    @Override // X.C7J6
    public final void CwA() {
        IGAIAgentVisibilityStatus iGAIAgentVisibilityStatus;
        User user = (User) AbstractC001800i.A0J(A00().C7r().C7W().A0b);
        if (user != null && user.A06) {
            User user2 = (User) AbstractC001800i.A0J(A00().C7r().C7W().A0b);
            if (user2 != null) {
                iGAIAgentVisibilityStatus = user2.A03.Aai();
            } else {
                iGAIAgentVisibilityStatus = null;
            }
            if (iGAIAgentVisibilityStatus == IGAIAgentVisibilityStatus.A05) {
                C28501Zl c28501Zl = C28531Zo.A04.A02;
                UserSession userSession = this.A01;
                C2EY c2ey = C2EY.A0H;
                AbstractC59962oe abstractC59962oe = this.A00;
                C34726FRp A07 = c28501Zl.A07(abstractC59962oe, userSession, c2ey);
                A07.A06(((User) A00().C7r().C7W().A0b.get(0)).getId());
                DirectShareSheetFragment A00 = A07.A00();
                C3DN A002 = C3DN.A00.A00(abstractC59962oe.requireActivity());
                if (A002 != null) {
                    A002.A0K(A00);
                }
            }
        }
    }

    @Override // X.C7J6
    public final void CwF() {
        String str;
        Long l;
        List list = A00().C7r().C7W().A0b;
        if (A00().C7r().C7W().A13) {
            str = "meta_ai_thread_header";
        } else {
            str = "thread_header";
        }
        UserSession userSession = this.A01;
        C28484Chc c28484Chc = new C28484Chc(userSession);
        String Aae = ((User) list.get(0)).A03.Aae();
        C25531Mh A00 = C28484Chc.A00(c28484Chc);
        if (((AbstractC02600Aj) A00).A00.isSampled()) {
            A00.A0k("thread_view_bar_ai_studio_button_clicked");
            if (Aae != null) {
                l = AbstractC003100w.A0k(10, Aae);
            } else {
                l = null;
            }
            A00.A0i(l);
            A00.Cht();
        }
        AbstractC31265Don.A00();
        AbstractC35257Fgr.A00(this.A00.requireActivity(), null, userSession, str, null);
    }

    @Override // X.C7J7
    public final void Cys() {
        if (A00().C7r().CeQ()) {
            A00().C7r().C7I();
            A00().C7r().Eje();
        }
        AbstractC59962oe abstractC59962oe = this.A00;
        if (abstractC59962oe.isResumed()) {
            FragmentActivity requireActivity = abstractC59962oe.requireActivity();
            C3DN A00 = C3DN.A00.A00(requireActivity);
            if (A00 == null || !((C3DP) A00).A0h) {
                requireActivity.onBackPressed();
            }
        }
    }

    @Override // X.C7J6
    public final void DYI() {
        User user;
        User user2;
        if (A00().AHB(EnumC2054697t.A03)) {
            C2EC A02 = A02();
            FOL fol = (FOL) this.A0E.get();
            C9BW Bcb = A02.Bcb();
            if (Bcb != null) {
                EMW emw = new EMW();
                emw.A00 = Bcb;
                List list = fol.A08;
                String str = null;
                if (list != null && (user2 = (User) AbstractC001800i.A0O(list, 0)) != null) {
                    str = user2.getUsername();
                }
                emw.A02 = str;
                emw.A01 = new FPX(fol, emw);
                C189448aO c189448aO = new C189448aO(fol.A04);
                c189448aO.A1G = true;
                C189478aR A00 = c189448aO.A00();
                fol.A00 = A00;
                A00.A02(fol.A02, emw);
                if (list != null && (user = (User) AbstractC001800i.A0O(list, 0)) != null) {
                    fol.A05.A00(fol.A07.toString(), user.getId(), "persistent_menu_item");
                }
            }
        }
    }

    @Override // X.C7J6
    public final void DlQ() {
        InviteLinkShareInfo A01 = A01();
        if (A01 != null) {
            C28501Zl c28501Zl = C28531Zo.A04.A02;
            UserSession userSession = this.A01;
            C2EY c2ey = C2EY.A0S;
            AbstractC59962oe abstractC59962oe = this.A00;
            C34726FRp A07 = c28501Zl.A07(abstractC59962oe, userSession, c2ey);
            A07.A07.putParcelable("DirectShareSheetConstants.channel_invite_link", A01);
            DirectShareSheetFragment A00 = A07.A00();
            C3DN A002 = C3DN.A00.A00(abstractC59962oe.requireActivity());
            if (A002 != null) {
                A002.A0K(A00);
            }
        }
    }

    @Override // X.C7J6
    public final void DlR() {
        InviteLinkShareInfo A01 = A01();
        if (A01 != null) {
            AbstractC34835FWs.A00(this.A00.requireActivity(), this.A01, A01);
        }
    }

    @Override // X.C7J6
    public final void Dnq() {
        String str;
        if (A00().C7r().CeQ() && A00().C7r().C7I() != null) {
            boolean CX1 = A00().C7r().CX1();
            UserSession userSession = this.A01;
            if (F3W.A00(userSession, CX1)) {
                C35244Fgd.A02(this.A00.requireContext(), this.A03, userSession, "flag", "thread_view", A00().C7r().C7I());
                return;
            }
            C7U0 A00 = A00();
            EnumC2054697t enumC2054697t = EnumC2054697t.A0m;
            if (A00.AHB(enumC2054697t)) {
                InterfaceC163837Ux C7r = A00().C7r();
                AbstractC59962oe abstractC59962oe = this.A00;
                if (!AbstractC34133F4j.A00(abstractC59962oe.requireActivity(), abstractC59962oe.requireContext(), abstractC59962oe, userSession, C7r)) {
                    boolean z = !A00().C7r().CUy();
                    F5G.A00(userSession, JRE.A01(A00().C7r().B90()), z);
                    String C7I = A00().C7r().C7I();
                    if (C7I != null) {
                        C12210kP c12210kP = new C12210kP(userSession);
                        c12210kP.A01 = "direct_inbox";
                        C18920wW A002 = c12210kP.A00();
                        InterfaceC02590Ai A003 = A002.A00(A002.A00, "direct_thread_action");
                        A003.AAP(ThreadMetadataOverrideFragment.BUNDLE_THREAD_ID, C7I);
                        if (z) {
                            str = "flag";
                        } else {
                            str = "unflag";
                        }
                        A003.AAP("action", str);
                        A003.Cht();
                        return;
                    }
                    throw new IllegalStateException("Required value was null.");
                }
            }
            AbstractC34059F1m.A00(enumC2054697t);
        }
    }

    @Override // X.C7J6
    public final void DsJ() {
        InterfaceC83733oI A05 = JRE.A05(JRE.A02(A00().C7r().Afi()));
        if (A05 != null) {
            AbstractC23021Ah.A00(this.A01).A0v(AbstractC1345466e.A07(A05));
        }
    }
}
