package X;

import com.instagram.common.session.UserSession;
import com.instagram.direct.armadilloexpress.transportpayload.AddMessageContent;
import com.instagram.direct.armadilloexpress.transportpayload.CommonMediaTransport;
import com.instagram.direct.armadilloexpress.transportpayload.Media;
import com.instagram.direct.armadilloexpress.transportpayload.TransportPayload;
import com.instagram.direct.armadilloexpress.transportpayload.Voice;
import com.instagram.model.direct.DirectThreadKey;
import java.util.Collections;
import java.util.List;

/* renamed from: X.1eg, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C31371eg implements InterfaceC29301b7, InterfaceC31091eE {
    public static final C0KV A04 = new C0KV() { // from class: X.1eh
        @Override // X.C0KV
        public final /* bridge */ /* synthetic */ Object AXR(UserSession userSession) {
            int A03 = C0f9.A03(-1090337871);
            int A032 = C0f9.A03(24534046);
            C31371eg c31371eg = new C31371eg(userSession);
            C0f9.A0A(-1208288289, A032);
            C0f9.A0A(2066383458, A03);
            return c31371eg;
        }
    };
    public final UserSession A00;
    public final C2DS A01;
    public final InterfaceC09390do A02;
    public final InterfaceC09390do A03 = AbstractC09440dt.A01(new InterfaceC16820sZ() { // from class: X.M8j
        @Override // X.InterfaceC16820sZ
        public final Object invoke() {
            UserSession userSession = C31371eg.this.A00;
            return C70343Ds.A00(AbstractC25225BEi.A0F(userSession), userSession);
        }
    });

    @Override // X.InterfaceC29301b7
    public final /* bridge */ /* synthetic */ void ENr(C19260xA c19260xA, InterfaceC37261GbE interfaceC37261GbE, C1OW c1ow) {
        C31351ee c31351ee = (C31351ee) c1ow;
        UserSession userSession = this.A00;
        LHD.A00(c19260xA, userSession, interfaceC37261GbE, c31351ee, this, (DirectThreadKey) c31351ee.C7R().get(0), C25A.A00(userSession), AnonymousClass257.A00(userSession), c31351ee.A01.A07);
    }

    @Override // X.InterfaceC31091eE
    public final /* bridge */ /* synthetic */ void AJE(InterfaceC37261GbE interfaceC37261GbE, C1OW c1ow, C47Z c47z) {
        C45538KEd c45538KEd;
        String str;
        CommonMediaTransport A03;
        int i;
        float f;
        C31351ee c31351ee = (C31351ee) c1ow;
        List C7R = c31351ee.C7R();
        boolean z = true;
        if (C7R.size() != 1) {
            z = false;
        }
        C18C.A0E(z);
        if (c47z.A5D) {
            C47627L1m c47627L1m = (C47627L1m) this.A02.getValue();
            C49239Lpu c49239Lpu = new C49239Lpu(interfaceC37261GbE);
            String str2 = c31351ee.A01.A07;
            C14360o3.A07(str2);
            UserSession userSession = c47627L1m.A00;
            C47Z A032 = C25A.A00(userSession).A03(str2);
            if (A032 == null) {
                c47627L1m.A02.A04(null, 7200, c31351ee.A06());
                c49239Lpu.DUq(AbstractC47202Ktb.A02, null);
                return;
            }
            String str3 = A032.A2N;
            if (str3 != null && (A03 = LLT.A03(str3)) != null) {
                C45377K6k A00 = CommonMediaTransport.A00(A03);
                A00.A06("audio/mp4");
                CommonMediaTransport commonMediaTransport = (CommonMediaTransport) A00.A02();
                if (commonMediaTransport != null) {
                    C45378K6l c45378K6l = (C45378K6l) Voice.DEFAULT_INSTANCE.A0I();
                    c45378K6l.A04();
                    Voice voice = (Voice) c45378K6l.A00;
                    voice.mediaTransport_ = commonMediaTransport;
                    voice.bitField0_ |= 1;
                    Integer A002 = c31351ee.A01.A00();
                    int i2 = 0;
                    if (A002 != null) {
                        i = A002.intValue();
                    } else {
                        i = 0;
                    }
                    c45378K6l.A04();
                    Voice voice2 = (Voice) c45378K6l.A00;
                    voice2.bitField0_ |= 2;
                    voice2.duration_ = i;
                    Integer A01 = c31351ee.A01.A01();
                    if (A01 != null) {
                        i2 = A01.intValue();
                    }
                    c45378K6l.A04();
                    Voice voice3 = (Voice) c45378K6l.A00;
                    voice3.bitField0_ |= 4;
                    voice3.waveformSamplingFrequencyHz_ = i2;
                    List<Float> A033 = c31351ee.A01.A03();
                    if (A033 != null) {
                        for (Float f2 : A033) {
                            if (C14360o3.A0I(f2, 0.0f)) {
                                f = 1.0E-8f;
                            } else if (!C14360o3.A0I(f2, 1.0f)) {
                                C14360o3.A0A(f2);
                                c45378K6l.A06(f2.floatValue());
                            } else {
                                f = 0.9999999f;
                            }
                            f2 = Float.valueOf(f);
                            C14360o3.A0A(f2);
                            c45378K6l.A06(f2.floatValue());
                        }
                    }
                    AbstractC60877RXa A0I = Media.DEFAULT_INSTANCE.A0I();
                    A0I.A04();
                    Media media = (Media) A0I.A00;
                    RYn A02 = c45378K6l.A02();
                    A02.getClass();
                    media.media_ = A02;
                    media.mediaCase_ = 2;
                    RYn A022 = A0I.A02();
                    if (A022 != null) {
                        C45376K6j A003 = AddMessageContent.A00();
                        A003.A04();
                        AddMessageContent addMessageContent = (AddMessageContent) A003.A00;
                        addMessageContent.addMessageContent_ = A022;
                        addMessageContent.addMessageContentCase_ = 5;
                        AddMessageContent addMessageContent2 = (AddMessageContent) A003.A02();
                        LGK lgk = LGK.A00;
                        C14360o3.A0A(addMessageContent2);
                        TransportPayload A012 = lgk.A01(userSession, addMessageContent2, null, null, c31351ee);
                        C4G2 c4g2 = c31351ee.A01;
                        C14360o3.A07(c4g2);
                        C49240Lpv A004 = LCY.A00(userSession, commonMediaTransport, c4g2, c49239Lpu);
                        C47977LIp c47977LIp = c47627L1m.A01;
                        List C7R2 = c31351ee.C7R();
                        C14360o3.A07(C7R2);
                        Object A0I2 = AbstractC001800i.A0I(C7R2);
                        C14360o3.A07(A0I2);
                        c47977LIp.A02(A012, A004, c31351ee, (DirectThreadKey) A0I2, 3);
                        return;
                    }
                    c49239Lpu.DUq(AbstractC47202Ktb.A00, null);
                    return;
                }
            }
            LAA laa = c47627L1m.A02;
            String A06 = c31351ee.A06();
            List singletonList = Collections.singletonList(0L);
            C14360o3.A07(singletonList);
            laa.A04(singletonList, 7200, A06);
            c49239Lpu.DUq(AbstractC47202Ktb.A00, null);
            return;
        }
        DirectThreadKey directThreadKey = (DirectThreadKey) C7R.get(0);
        String A062 = c31351ee.A06();
        C4G2 c4g22 = c31351ee.A01;
        JTa jTa = ((C1OW) c31351ee).A02;
        if (Boolean.TRUE.equals(jTa.A01)) {
            UserSession userSession2 = this.A00;
            C14360o3.A0B(userSession2, 0);
            C14360o3.A0B(directThreadKey, 2);
            c45538KEd = new C45538KEd(userSession2, directThreadKey);
        } else {
            c45538KEd = null;
        }
        UserSession userSession3 = this.A00;
        String str4 = c31351ee.A05;
        boolean z2 = jTa.A09;
        String str5 = jTa.A04;
        L1W l1w = jTa.A00;
        boolean z3 = jTa.A07;
        boolean z4 = jTa.A0A;
        String str6 = c47z.A3t;
        List A034 = c4g22.A03();
        A034.getClass();
        Integer A013 = c4g22.A01();
        A013.getClass();
        Long l = c47z.A2I;
        AnonymousClass442 anonymousClass442 = c31351ee.A00;
        Boolean bool = jTa.A01;
        C25621Ms c25621Ms = new C25621Ms(userSession3);
        c25621Ms.A09(C05F.A01);
        if (l != null) {
            str = "direct_v2/threads/broadcast/voice_attachment/";
        } else {
            str = "direct_v2/threads/broadcast/share_voice/";
        }
        c25621Ms.A0E = str;
        c25621Ms.A0S(C40781ul.class, C55702hA.class);
        AbstractC47995LLh.A0D(c25621Ms, l1w, directThreadKey, A062, str4, str5, z2, z3, z4);
        c25621Ms.A9s("upload_id", str6);
        c25621Ms.A9s("waveform", AnonymousClass001.A0g("[", C71473Il.A00(',').A02(A034), "]"));
        c25621Ms.A9s("waveform_sampling_frequency_hz", String.valueOf(A013));
        if (l != null) {
            c25621Ms.A9s("attachment_fbid", l.toString());
        }
        if (anonymousClass442 != null) {
            c25621Ms.A9s("replied_to_action_source", anonymousClass442.A0Q);
            c25621Ms.A9s("replied_to_client_context", anonymousClass442.A0R);
            c25621Ms.A9s("replied_to_item_id", anonymousClass442.A0T);
            c25621Ms.A9s("replied_to_target_type", anonymousClass442.A0F.A00);
            c25621Ms.A9s("replied_to_user_id", anonymousClass442.A0U);
        }
        if (bool != null) {
            c25621Ms.A0I("should_xpost", bool.booleanValue());
        }
        C1ON A0N = c25621Ms.A0N();
        A0N.A00 = new C32226EDz(c45538KEd, userSession3, interfaceC37261GbE);
        C1GJ.A03(A0N);
    }

    @Override // X.InterfaceC29301b7
    public final /* bridge */ /* synthetic */ boolean CfR(C1OW c1ow, MNP mnp) {
        return LCX.A01(mnp, (AbstractC29011ae) c1ow, this.A01);
    }

    public C31371eg(final UserSession userSession) {
        this.A00 = userSession;
        this.A01 = AbstractC28761aE.A00(userSession);
        this.A02 = AbstractC09440dt.A01(new InterfaceC16820sZ() { // from class: X.M8i
            @Override // X.InterfaceC16820sZ
            public final Object invoke() {
                UserSession userSession2 = UserSession.this;
                return new C47627L1m(userSession2, AbstractC46925Kp6.A00(userSession2));
            }
        });
    }
}
