package X;

import android.content.Context;
import com.facebook.catalyst.modules.cameraroll.CameraRollManager;
import com.facebook.catalyst.modules.netinfo.NetInfoModule;
import com.facebook.common.dextricks.JITProfilePQR;
import com.facebook.forker.Process;
import com.facebook.msys.mca.MailboxFutureImpl;
import com.facebook.msys.mci.PlatformLogger;
import com.facebook.msys.mci.TraceInfo;
import com.google.common.collect.ImmutableList;
import com.google.common.util.concurrent.ListenableFuture;
import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.direct.capabilities.Capabilities;
import com.instagram.direct.model.mentions.SendMentionData$MentionData;
import com.instagram.direct.msys.mailbox.core.mutation.MsysVoiceMessageSender$sendSecureVoiceMessage$1;
import com.instagram.model.direct.DirectShareTarget;
import com.instagram.model.direct.DirectThreadKey;
import com.instagram.model.direct.gifs.DirectAnimatedMedia;
import com.instagram.model.direct.messageid.MessageIdentifier;
import com.instagram.model.direct.stickerstore.DirectStoreSticker;
import com.instagram.model.direct.threadkey.impl.MsysThreadId;
import com.instagram.model.mediasize.ExtendedImageUrl;
import com.instagram.pendingmedia.model.ClipInfo;
import com.instagram.realtimeclient.GraphQLSubscriptionID;
import com.instagram.user.model.User;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.Jf4, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C44139Jf4 implements C7TH, InterfaceC13000lm {
    public final C41761wQ A00;
    public final UserSession A01;
    public final InterfaceC09390do A02;

    public C44139Jf4(UserSession userSession) {
        C14360o3.A0B(userSession, 1);
        this.A01 = userSession;
        this.A00 = AbstractC31174DnI.A0S();
        this.A02 = AbstractC09440dt.A01(new C50160MDn(this, 25));
    }

    @Override // X.C7TH
    public final C42221xC AGU(C3o9 c3o9, String str) {
        C14360o3.A0B(str, 1);
        C6JY A00 = A00(this);
        Long A13 = AbstractC25228BEl.A13(str);
        return AbstractC43593JPy.A0N(AbstractC43593JPy.A0M(new C43597JQd(A13, 50), A00.A02).A0K(new JQI(17)), "rxmailbox_delete_message");
    }

    @Override // X.C7TH
    public final synchronized boolean BJs() {
        throw JQ0.A0d();
    }

    @Override // X.C7TH
    public final synchronized Integer CIY() {
        throw JQ0.A0d();
    }

    @Override // X.C7TH
    public final void EN1(Context context, UserSession userSession, C148286ly c148286ly, AnonymousClass442 anonymousClass442, C3o9 c3o9, String str, boolean z) {
    }

    @Override // X.C7TH
    public final void EN3(Context context, UserSession userSession, AnonymousClass442 anonymousClass442, DirectAnimatedMedia directAnimatedMedia, InterfaceC83713oG interfaceC83713oG, String str, String str2, List list, boolean z) {
        AbstractC25229BEm.A1I(directAnimatedMedia, 2, userSession);
        if ((interfaceC83713oG instanceof InterfaceC2056098k) && context != null) {
            C7UR c7ur = C7UR.A0A;
            C7US.A00(context).A05(new C49470Ltj(userSession, this, directAnimatedMedia, interfaceC83713oG), directAnimatedMedia.A02.A09);
        }
    }

    @Override // X.C7TH
    public final void EN8(Context context, UserSession userSession, C148286ly c148286ly, AnonymousClass442 anonymousClass442, C3o9 c3o9, String str, List list, boolean z) {
        AbstractC167017dG.A1N(context, userSession);
        C14360o3.A0B(c148286ly, 4);
        C7UR c7ur = C7UR.A0A;
        C7US.A00(context).A05(new C49471Ltk(userSession, c148286ly, anonymousClass442, this, c3o9), c148286ly.A0H.getUrl());
    }

    @Override // X.C7TH
    public final void ENI(Context context, UserSession userSession, C148286ly c148286ly, AnonymousClass442 anonymousClass442, C3o9 c3o9, String str, boolean z) {
    }

    @Override // X.C7TH
    public final void ENK(InterfaceC83713oG interfaceC83713oG, String str, String str2, String str3) {
        C14360o3.A0B(interfaceC83713oG, 0);
        AbstractC166987dD.A1Z(new C50125MBz(this, interfaceC83713oG, str2, str, null, 11), AbstractC24771Iv.A01(626572521, 3));
    }

    @Override // X.C7TH
    public final void ENO(L7G l7g, AnonymousClass442 anonymousClass442, C47588Kzy c47588Kzy, C3o9 c3o9, Integer num, Integer num2, Long l, String str, String str2, String str3, String str4, List list, boolean z) {
        A01(anonymousClass442, this, c3o9, str, str3, list);
    }

    @Override // X.C7TH
    public final void ENS(DirectShareTarget directShareTarget, String str, String str2, String str3, boolean z) {
    }

    @Override // X.C7TH
    public final void ENY(Capabilities capabilities, C3o9 c3o9, String str, String str2, String str3, String str4, String str5) {
        String str6 = null;
        if (str != null) {
            C41761wQ c41761wQ = this.A00;
            C6JY A00 = A00(this);
            long parseLong = Long.parseLong(str);
            ImmutableList immutableList = C83863oV.A03;
            String A14 = AbstractC25225BEi.A14();
            C42221xC c42221xC = A00.A00;
            c41761wQ.A02(AbstractC43593JPy.A0N(AbstractC43593JPy.A0M(new C48368Lai(false, "❤", A14, str6, parseLong), c42221xC), "rxmailbox_add_reaction_message"), C49764LyX.A00);
        }
    }

    @Override // X.C7TH
    public final void ENb(EnumC159397Cz enumC159397Cz, C45059Jwo c45059Jwo, L1W l1w, C2EY c2ey, C3o9 c3o9, String str, String str2, String str3, String str4, String str5, String str6, String str7, long j, boolean z, boolean z2) {
        AbstractC167007dF.A1K(c3o9, str);
        String str8 = null;
        if (z) {
            str8 = str3;
        }
        if (str7 != null) {
            ((C7X3) this.A02.getValue()).A03(str7, false);
        }
        C41761wQ c41761wQ = this.A00;
        C6JY A00 = A00(this);
        long parseLong = Long.parseLong(str);
        Boolean A0n = AbstractC43593JPy.A0n(str4, GraphQLSubscriptionID.INAPP_NOTIFICATION_TYPE_DEFAULT);
        String A14 = AbstractC25225BEi.A14();
        c41761wQ.A02(AbstractC43593JPy.A0N(AbstractC43593JPy.A0M(new C48368Lai(A0n, str8, A14, str7, parseLong), A00.A00), "rxmailbox_add_reaction_message"), C49765LyY.A00);
    }

    @Override // X.C7TH
    public final void ENo(Context context, UserSession userSession, C3o9 c3o9, JIN jin, String str, boolean z) {
    }

    @Override // X.C7TH
    public final void ENu(ImageUrl imageUrl, DirectShareTarget directShareTarget, ExtendedImageUrl extendedImageUrl, User user, String str, String str2, String str3, String str4, String str5, String str6, String str7, long j, boolean z) {
    }

    @Override // X.C7TH
    public final void ENv(ImageUrl imageUrl, DirectShareTarget directShareTarget, ExtendedImageUrl extendedImageUrl, User user, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, long j, boolean z) {
        C41761wQ c41761wQ = this.A00;
        C6JY A00 = A00(this);
        InterfaceC83713oG A01 = directShareTarget.A01();
        C14360o3.A0C(A01, "null cannot be cast to non-null type com.instagram.model.direct.threadkey.impl.MsysThreadTarget");
        c41761wQ.A02(A00.A0B((InterfaceC2056098k) A01, C05F.A01, C05F.A0Y, str4, null, false), C49766LyZ.A00);
    }

    @Override // X.C7TH
    public final ListenableFuture ENz(C9CK c9ck, C26086BgF c26086BgF, AnonymousClass442 anonymousClass442, C47588Kzy c47588Kzy, C3o9 c3o9, C47Z c47z, C183978Ee c183978Ee, String str, String str2, String str3, String str4, List list, boolean z) {
        C14360o3.A0B(c3o9, 0);
        String str5 = null;
        if (anonymousClass442 != null) {
            str5 = anonymousClass442.A0T;
        }
        UserSession userSession = this.A01;
        LWT A00 = ((L6O) userSession.A01(L6O.class, MHJ.A00(userSession, 1))).A00(JRE.A03(c3o9), c183978Ee, AbstractC37302Gc3.A0V(str5), str, str3);
        LCU.A00(A00, (C7X3) this.A02.getValue(), str3);
        return A00;
    }

    @Override // X.C7TH
    public final void EO1(C9CK c9ck, C26086BgF c26086BgF, AnonymousClass442 anonymousClass442, C47588Kzy c47588Kzy, C3o9 c3o9, C47Z c47z, C183978Ee c183978Ee, String str, String str2, String str3, String str4, List list, boolean z) {
        String str5 = anonymousClass442 != null ? anonymousClass442.A0T : null;
        UserSession userSession = this.A01;
        ((L6O) userSession.A01(L6O.class, MHJ.A00(userSession, 1))).A00(JRE.A03(c3o9), c183978Ee, AbstractC37302Gc3.A0V(str5), str, str3);
    }

    @Override // X.C7TH
    public final void EO2(DirectShareTarget directShareTarget, String str, String str2, String str3, boolean z) {
    }

    @Override // X.C7TH
    public final void EO9(DirectShareTarget directShareTarget, String str, String str2, String str3, boolean z) {
    }

    @Override // X.C7TH
    public final void EOL(InterfaceC83713oG interfaceC83713oG, String str, String str2, long j) {
    }

    @Override // X.C7TH
    public final void EOR(L7G l7g, AnonymousClass442 anonymousClass442, C47588Kzy c47588Kzy, C3o9 c3o9, Integer num, Integer num2, Long l, String str, String str2, String str3, String str4, List list, boolean z) {
        A01(anonymousClass442, this, c3o9, str, str3, list);
    }

    @Override // X.C7TH
    public final String EOY(Context context, L7G l7g, AnonymousClass442 anonymousClass442, C47588Kzy c47588Kzy, C3o9 c3o9, Integer num, String str, String str2, String str3, String str4, String str5, boolean z) {
        Integer num2 = null;
        int A06 = AbstractC167007dF.A06(1, c3o9, str);
        MsysThreadId A03 = JRE.A03(c3o9);
        C41761wQ c41761wQ = this.A00;
        C2EY c2ey = C2EY.A1i;
        boolean z2 = false;
        C14360o3.A0B(A03, 0);
        C6JY A00 = A00(this);
        InterfaceC2056098k A032 = AbstractC140946Yw.A03(A03);
        String str6 = null;
        Long A0W = AbstractC37302Gc3.A0W(null);
        if (anonymousClass442 != null) {
            str6 = anonymousClass442.A0T;
        }
        C42221xC A0M = AbstractC43593JPy.A0M(new C48379Lat(A00, c2ey, num2, num2, A0W, str, str6, str3, z2), C6JY.A01(A00, A032));
        AbstractC25229BEm.A1Y((C7X3) this.A02.getValue());
        c41761wQ.A02(AbstractC43592JPx.A0R(A0M), new C49796Lz3(context, str5, A06));
        return null;
    }

    @Override // X.C7TH
    public final C42221xC EOa(C50679MYx c50679MYx, L7G l7g, AnonymousClass442 anonymousClass442, C47588Kzy c47588Kzy, DirectShareTarget directShareTarget, C2EY c2ey, InterfaceC83713oG interfaceC83713oG, Integer num, Integer num2, Integer num3, Integer num4, Integer num5, Long l, String str, String str2, String str3, String str4, String str5, String str6, String str7, List list, boolean z, boolean z2, boolean z3, boolean z4) {
        boolean z5 = false;
        Integer num6 = null;
        C14360o3.A0B(interfaceC83713oG, 0);
        C6JY A00 = A00(this);
        InterfaceC2056098k A03 = AbstractC140946Yw.A03(interfaceC83713oG);
        String str8 = null;
        Long A0W = AbstractC37302Gc3.A0W(str6);
        if (anonymousClass442 != null) {
            str8 = anonymousClass442.A0T;
        }
        C42221xC A0M = AbstractC43593JPy.A0M(new C48379Lat(A00, c2ey, num6, num6, A0W, str, str8, str3, z5), C6JY.A01(A00, A03));
        C7X3 c7x3 = (C7X3) this.A02.getValue();
        boolean A1Y = AbstractC25229BEm.A1Y(c7x3);
        if (str6 != null) {
            c7x3.A03(str6, A1Y);
            return C43597JQd.A02(C42221xC.A09(Integer.valueOf(A1Y ? 1 : 0)).A0R(new C49796Lz3(str6, c7x3, 3)), new C50261MHq(A0M, 21), 62).A0R(new C49796Lz3(str6, c7x3, 4));
        }
        return A0M;
    }

    @Override // X.C7TH
    public final C42221xC EOb(L7G l7g, AnonymousClass442 anonymousClass442, C47588Kzy c47588Kzy, DirectShareTarget directShareTarget, C2EY c2ey, InterfaceC83713oG interfaceC83713oG, Integer num, Integer num2, String str, String str2, String str3, String str4, String str5, String str6, List list, boolean z, boolean z2) {
        Integer num3 = null;
        C6JY A00 = A00(this);
        InterfaceC2056098k A03 = AbstractC140946Yw.A03(interfaceC83713oG);
        String str7 = null;
        Long A0W = AbstractC37302Gc3.A0W(null);
        if (anonymousClass442 != null) {
            str7 = anonymousClass442.A0T;
        }
        C42221xC A0M = AbstractC43593JPy.A0M(new C48379Lat(A00, c2ey, num3, num3, A0W, str, str7, str3, z2), C6JY.A01(A00, A03));
        AbstractC25229BEm.A1Y((C7X3) this.A02.getValue());
        return A0M;
    }

    @Override // X.C7TH
    public final void EOd(L7G l7g, AnonymousClass442 anonymousClass442, SendMentionData$MentionData sendMentionData$MentionData, C47588Kzy c47588Kzy, C3o9 c3o9, Integer num, Integer num2, Long l, String str, String str2, String str3, String str4, List list, List list2, boolean z) {
        A01(anonymousClass442, this, c3o9, str, str3, list2);
    }

    @Override // X.C7TH
    public final ListenableFuture EOh(C9CK c9ck, C26086BgF c26086BgF, AnonymousClass442 anonymousClass442, C47588Kzy c47588Kzy, C3o9 c3o9, ClipInfo clipInfo, C47Z c47z, String str, String str2, String str3, String str4, String str5, List list, boolean z) {
        AbstractC167017dG.A1O(c3o9, clipInfo);
        String str6 = null;
        if (anonymousClass442 != null) {
            str6 = anonymousClass442.A0T;
        }
        UserSession userSession = this.A01;
        C60787RSy A00 = ((C47752L6w) userSession.A01(C47752L6w.class, new C50160MDn(userSession, 26))).A00(JRE.A03(c3o9), clipInfo, AbstractC37302Gc3.A0V(str6), str, str2, str4);
        LCU.A00(A00, (C7X3) this.A02.getValue(), str4);
        return A00;
    }

    @Override // X.C7TH
    public final void EOj(C9CK c9ck, C26086BgF c26086BgF, AnonymousClass442 anonymousClass442, C47588Kzy c47588Kzy, C3o9 c3o9, ClipInfo clipInfo, C47Z c47z, String str, String str2, String str3, String str4, String str5, List list, boolean z) {
        C14360o3.A0B(clipInfo, 2);
        String str6 = null;
        if (anonymousClass442 != null) {
            str6 = anonymousClass442.A0T;
        }
        UserSession userSession = this.A01;
        ((C47752L6w) userSession.A01(C47752L6w.class, new C50160MDn(userSession, 26))).A00(JRE.A03(c3o9), clipInfo, AbstractC37302Gc3.A0V(str6), str, str2, str4);
    }

    @Override // X.C7TH
    public final C42221xC EOl(InterfaceC83713oG interfaceC83713oG, C183978Ee c183978Ee, Long l, String str, String str2, boolean z) {
        boolean A1b = AbstractC43593JPy.A1b(str);
        if (interfaceC83713oG instanceof MsysThreadId) {
            Integer A00 = AbstractC46879KoM.A00(str);
            if (A00 != null) {
                return A00(this).A0A((InterfaceC2056098k) interfaceC83713oG, c183978Ee, A00, l, null, A1b);
            }
            throw AbstractC31175DnJ.A0V("Null ephemeralityType. ViewMode: ", str);
        }
        throw AbstractC166987dD.A1D(AbstractC167017dG.A0n(interfaceC83713oG, "Unsupported thread target for sendVisualMessageRx: ", AbstractC166987dD.A1C()));
    }

    @Override // X.C7TH
    public final ListenableFuture EOm(AnonymousClass442 anonymousClass442, C3o9 c3o9, L33 l33, String str, String str2, String str3, List list, boolean z) {
        C14360o3.A0B(c3o9, 0);
        MsysThreadId A03 = JRE.A03(c3o9);
        UserSession userSession = this.A01;
        C47392Kwh c47392Kwh = (C47392Kwh) userSession.A01(C47392Kwh.class, MHJ.A00(userSession, 3));
        long j = A03.A00;
        Long A01 = AbstractC92784Dr.A01(A03);
        C19K A012 = AbstractC24771Iv.A01(1615100382, 3);
        InterfaceC16620sF msysVoiceMessageSender$sendSecureVoiceMessage$1 = new MsysVoiceMessageSender$sendSecureVoiceMessage$1(anonymousClass442, c47392Kwh, l33, A01, str2, str, str3, null, j);
        AnonymousClass191 anonymousClass191 = AnonymousClass191.A00;
        Integer num = C05F.A00;
        C50374MMb c50374MMb = new C50374MMb(AbstractC23651Dv.A01(anonymousClass191, A012));
        c50374MMb.A0W(num, c50374MMb, msysVoiceMessageSender$sendSecureVoiceMessage$1);
        LWT lwt = c50374MMb.A00;
        LCU.A00(lwt, (C7X3) this.A02.getValue(), str3);
        return lwt;
    }

    @Override // X.C7TH
    public final void EOq(DirectShareTarget directShareTarget, String str, String str2, String str3, boolean z) {
    }

    @Override // X.C7TH
    public final synchronized void EWd(boolean z) {
        throw JQ0.A0d();
    }

    @Override // X.C7TH
    public final synchronized void EhS(Integer num) {
        throw JQ0.A0d();
    }

    public static C6JY A00(C44139Jf4 c44139Jf4) {
        return C6JW.A00(c44139Jf4.A01, "MsysSendMessageManager").A00;
    }

    public static final void A01(AnonymousClass442 anonymousClass442, C44139Jf4 c44139Jf4, C3o9 c3o9, String str, String str2, List list) {
        ArrayList arrayList;
        int i;
        Integer valueOf;
        Integer num;
        if (list != null) {
            arrayList = AbstractC166987dD.A1E();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                C206179Ba c206179Ba = (C206179Ba) it.next();
                HashMap A1G = AbstractC166987dD.A1G();
                A1G.put("mention_id", Long.valueOf(AbstractC25232BEp.A0t((Number) c206179Ba.A04)));
                A1G.put("mention_offset", Integer.valueOf(c206179Ba.A02));
                A1G.put("mention_length", Integer.valueOf(c206179Ba.A01));
                int i2 = c206179Ba.A03;
                int i3 = 1;
                String A00 = AbstractC111324zv.A00(234);
                if (i2 == 1) {
                    i3 = 2;
                } else if (i2 != 3) {
                    i3 = -1;
                    if (i2 == 0) {
                        i3 = 0;
                    }
                }
                AbstractC166997dE.A1U(A00, A1G, i3);
                arrayList.add(A1G);
            }
        } else {
            arrayList = null;
        }
        C2EY c2ey = C2EY.A1i;
        AbstractC46873KoG abstractC46873KoG = AbstractC46873KoG.$redex_init_class;
        int ordinal = c2ey.ordinal();
        switch (ordinal) {
            case Process.SIGTERM /* 15 */:
            case 18:
            case Process.SIGSTOP /* 19 */:
                i = 1011;
                valueOf = Integer.valueOf(i);
                break;
            case 28:
            case CameraRollManager.IMAGES_MEDIA_LATITUDE_LONGITUDE_DEPRECATED_API_LEVEL /* 29 */:
                i = 1007;
                valueOf = Integer.valueOf(i);
                break;
            case JITProfilePQR.MEGA_ZIP_NAME_PREFIX_LEN /* 46 */:
            case 49:
                i = 1005;
                valueOf = Integer.valueOf(i);
                break;
            default:
                valueOf = null;
                break;
        }
        switch (ordinal) {
            case Process.SIGTERM /* 15 */:
            case 18:
            case Process.SIGSTOP /* 19 */:
            case 28:
            case CameraRollManager.IMAGES_MEDIA_LATITUDE_LONGITUDE_DEPRECATED_API_LEVEL /* 29 */:
            case JITProfilePQR.MEGA_ZIP_NAME_PREFIX_LEN /* 46 */:
            case 49:
                num = 7;
                break;
            default:
                num = null;
                break;
        }
        String str3 = null;
        EnumC46253KdV enumC46253KdV = EnumC46253KdV.A0W;
        ImmutableList of = ImmutableList.of((Object) EnumC46254KdW.A0d);
        C14360o3.A07(of);
        C44921JuZ A002 = AbstractC46871KoE.A00(enumC46253KdV, of);
        String A14 = AbstractC25225BEi.A14();
        UserSession userSession = c44139Jf4.A01;
        long j = JRE.A03(c3o9).A00;
        if (anonymousClass442 != null) {
            str3 = anonymousClass442.A0T;
        }
        Long A01 = AbstractC92784Dr.A01(JRE.A03(c3o9));
        LFD.A00(userSession).A02(null, AbstractC25233BEq.A0n(str3), null, AbstractC46872KoF.A00(userSession, num, null, valueOf, null, A01, null, false), str, str2, A14, A002.A00.toString(), arrayList, j, false);
    }

    @Override // X.C7TH
    public final String EOZ(AnonymousClass442 anonymousClass442, C3o9 c3o9, String str, String str2, String str3, boolean z) {
        C14360o3.A0B(str, 1);
        return EOY(null, null, null, null, c3o9, null, str, NetInfoModule.CONNECTION_TYPE_NONE, "push_notification_action", null, null, false);
    }

    /* JADX WARN: Type inference failed for: r3v0, types: [com.google.common.util.concurrent.ListenableFuture, java.lang.Object] */
    @Override // X.C7TH
    public final ListenableFuture F9r(AbstractC46511KiA abstractC46511KiA, C3o9 c3o9, String str) {
        if (abstractC46511KiA instanceof KWg) {
            ?? obj = new Object();
            UserSession userSession = this.A01;
            long j = ((KWg) abstractC46511KiA).A00;
            K3a A01 = LIu.A01(userSession);
            InterfaceExecutorC135866Co A0C = AbstractC43592JPx.A0C(A01, 0);
            MailboxFutureImpl A0D = AbstractC43592JPx.A0D(A0C);
            int A00 = AbstractC1346866s.A00(A0D);
            TraceInfo A012 = AbstractC1346866s.A01(A0D, "MailboxTam", "runTamClientMessageUnsend");
            if (!A0C.ELJ(new LVJ(A0D, A01, A00, 6, j))) {
                A0D.cancel(false);
                AbstractC1346866s.A02(A00);
                AbstractC1346866s.A03(A012, "MailboxTam", "runTamClientMessageUnsend");
            }
            PlatformLogger.platformEventLog(5);
            A0D.addResultCallback(new JVL((Object) obj, 28));
            return obj;
        }
        throw AbstractC31172DnG.A0u();
    }

    @Override // X.InterfaceC13000lm
    public final void onSessionWillEnd() {
        this.A00.A01();
    }

    @Override // X.C7TH
    public final void AGT(InterfaceC11380iw interfaceC11380iw, C83403nh c83403nh, DirectThreadKey directThreadKey) {
        throw JQ0.A0d();
    }

    @Override // X.C7TH
    public final void EKv(Context context, InterfaceC11380iw interfaceC11380iw, C83403nh c83403nh, DirectThreadKey directThreadKey) {
        throw JQ0.A0d();
    }

    @Override // X.C7TH
    public final C42221xC EKw(C3o9 c3o9, String str) {
        C6JY A00 = A00(this);
        Long A13 = AbstractC25228BEl.A13(str);
        return AbstractC43593JPy.A0N(AbstractC43593JPy.A0M(new C43597JQd(A13, 51), A00.A02), "rxmailbox_retry_message");
    }

    @Override // X.C7TH
    public final void ELt(C3o9 c3o9, String str) {
        throw JQ0.A0d();
    }

    @Override // X.C7TH
    public final void ENa(C47588Kzy c47588Kzy, C3o9 c3o9, String str, boolean z) {
        throw JQ0.A0d();
    }

    @Override // X.C7TH
    public final C42221xC ENg(C47588Kzy c47588Kzy, MessageIdentifier messageIdentifier, C3o9 c3o9, String str, List list, boolean z) {
        throw JQ0.A0d();
    }

    @Override // X.C7TH
    public final C42221xC ENn(C26086BgF c26086BgF, C47588Kzy c47588Kzy, C3o9 c3o9, String str, String str2, String str3, List list, boolean z) {
        throw JQ0.A0d();
    }

    @Override // X.C7TH
    public final void ENs(DirectThreadKey directThreadKey, DirectAnimatedMedia directAnimatedMedia, InterfaceC83713oG interfaceC83713oG, ExtendedImageUrl extendedImageUrl, String str, String str2, String str3, long j) {
        throw JQ0.A0d();
    }

    @Override // X.C7TH
    public final void ENt(C148286ly c148286ly, DirectThreadKey directThreadKey, ExtendedImageUrl extendedImageUrl, String str, String str2, String str3, long j) {
        throw JQ0.A0d();
    }

    @Override // X.C7TH
    public final void EO6(AnonymousClass442 anonymousClass442, C3o9 c3o9, String str, String str2, String str3, String str4, String str5) {
        throw JQ0.A0d();
    }

    @Override // X.C7TH
    public final void EOT(AnonymousClass442 anonymousClass442, DirectStoreSticker directStoreSticker, InterfaceC83713oG interfaceC83713oG, String str) {
        throw JQ0.A0d();
    }

    @Override // X.C7TH
    public final void EOc(L7G l7g, AnonymousClass442 anonymousClass442, C47588Kzy c47588Kzy, C3o9 c3o9, Integer num, Integer num2, String str, String str2, String str3, String str4, String str5, List list, boolean z) {
        throw JQ0.A0d();
    }

    @Override // X.C7TH
    public final C42221xC EOk(InterfaceC83713oG interfaceC83713oG, ClipInfo clipInfo, Long l, String str, String str2) {
        boolean A1U = AbstractC167007dF.A1U(str);
        if (interfaceC83713oG instanceof MsysThreadId) {
            Integer A00 = AbstractC46879KoM.A00(str);
            if (A00 != null) {
                C6JY A002 = A00(this);
                String str3 = null;
                return AbstractC43593JPy.A0M(new C48377Lar(A002, clipInfo, A00, l, str3, str3, A1U), C6JY.A01(A002, (InterfaceC2056098k) interfaceC83713oG));
            }
            throw AbstractC31175DnJ.A0V("Null ephemeralityType. ViewMode: ", str);
        }
        throw AbstractC166987dD.A1D(AbstractC167017dG.A0n(interfaceC83713oG, "Unsupported thread target for sendVisualMessageRx: ", AbstractC166987dD.A1C()));
    }

    @Override // X.C7TH
    public final void EOn(AnonymousClass442 anonymousClass442, C3o9 c3o9, L33 l33, String str, String str2, String str3, List list, boolean z) {
        MsysThreadId A03 = JRE.A03(c3o9);
        UserSession userSession = this.A01;
        C47392Kwh c47392Kwh = (C47392Kwh) userSession.A01(C47392Kwh.class, MHJ.A00(userSession, 3));
        long j = A03.A00;
        Long A01 = AbstractC92784Dr.A01(A03);
        C19K A012 = AbstractC24771Iv.A01(1615100382, 3);
        InterfaceC16620sF msysVoiceMessageSender$sendSecureVoiceMessage$1 = new MsysVoiceMessageSender$sendSecureVoiceMessage$1(anonymousClass442, c47392Kwh, l33, A01, str2, str, str3, null, j);
        AnonymousClass191 anonymousClass191 = AnonymousClass191.A00;
        Integer num = C05F.A00;
        C50374MMb c50374MMb = new C50374MMb(AbstractC23651Dv.A01(anonymousClass191, A012));
        c50374MMb.A0W(num, c50374MMb, msysVoiceMessageSender$sendSecureVoiceMessage$1);
    }

    @Override // X.C7TH
    public final void F9o(C3o9 c3o9, String str) {
        throw JQ0.A0d();
    }
}
