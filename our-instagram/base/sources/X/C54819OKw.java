package X;

import android.content.Context;
import com.facebook.fbwebrtc.multiway.RtcMessageBody;
import com.facebook.fbwebrtc.multiway.RtcMessageHeader;
import com.facebook.hyperthrift.HyperThriftBase;
import com.instagram.common.session.UserSession;
import com.instagram.model.rtc.RtcIgNotification;
import com.instagram.rtc.signaling.models.RtcConnectionEntity;
import com.instagram.video.common.events.IgRtcEventHeader;
import kotlin.Deprecated;

/* renamed from: X.OKw, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C54819OKw {
    public final Context A00;
    public final UserSession A01;
    public final O4R A02;
    public final OHP A03;
    public final C54556O8i A04;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v10, types: [com.facebook.hyperthrift.HyperThriftBase, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v2, types: [com.facebook.hyperthrift.HyperThriftBase, com.facebook.fbwebrtc.multiway.RtcMessageBody, java.lang.Object] */
    public final void A00(RtcConnectionEntity.RtcCallConnectionEntity rtcCallConnectionEntity, String str, InterfaceC16660sJ interfaceC16660sJ) {
        String str2;
        String str3;
        short s;
        C14360o3.A0B(str, 1);
        if (rtcCallConnectionEntity.A08.intValue() == 1) {
            RtcIgNotification rtcIgNotification = rtcCallConnectionEntity.A04;
            String str4 = null;
            if (rtcIgNotification != null) {
                str3 = rtcIgNotification.A05;
                str4 = rtcIgNotification.A06;
            } else {
                str3 = null;
            }
            IgRtcEventHeader igRtcEventHeader = rtcCallConnectionEntity.A06;
            if (str3 == null && str4 == null) {
                if (igRtcEventHeader != null) {
                    OHP ohp = this.A03;
                    C54556O8i c54556O8i = this.A04;
                    Object A0R = AnonymousClass001.A0R("mqtt: ", str);
                    Object[] objArr = new Object[25];
                    AbstractC25235BEs.A1R(objArr, 2, 0);
                    Object obj = igRtcEventHeader.A04;
                    if (obj == null) {
                        obj = HyperThriftBase.A02;
                    }
                    objArr[4] = obj;
                    Object obj2 = igRtcEventHeader.A00;
                    if (obj2 == null) {
                        obj2 = HyperThriftBase.A02;
                    }
                    objArr[12] = obj2;
                    Object obj3 = igRtcEventHeader.A03;
                    if (obj3 == null) {
                        obj3 = HyperThriftBase.A02;
                    }
                    objArr[1] = obj3;
                    Object obj4 = igRtcEventHeader.A05;
                    if (obj4 == null) {
                        obj4 = HyperThriftBase.A02;
                    }
                    objArr[2] = obj4;
                    Integer num = igRtcEventHeader.A01;
                    if (num != null) {
                        s = (short) num.intValue();
                    } else {
                        s = 0;
                    }
                    Object valueOf = Short.valueOf(s);
                    if (valueOf == null) {
                        valueOf = HyperThriftBase.A02;
                    }
                    objArr[3] = valueOf;
                    long j = c54556O8i.A00;
                    c54556O8i.A00 = 1 + j;
                    Object valueOf2 = Long.valueOf(j);
                    if (valueOf2 == null) {
                        valueOf2 = HyperThriftBase.A02;
                    }
                    RtcMessageHeader A0N = AbstractC50522MSa.A0N(valueOf2, objArr, 7);
                    Object[] objArr2 = new Object[30];
                    if (A0R == null) {
                        A0R = HyperThriftBase.A02;
                    }
                    Object[] A01 = HyperThriftBase.Builder.A01(new Object[]{0, A0R});
                    ?? obj5 = new Object();
                    obj5.A02("com.facebook.fbwebrtc.multiway.HangupRequest", A01);
                    objArr2[4] = obj5;
                    Object[] A012 = HyperThriftBase.Builder.A01(objArr2);
                    ?? obj6 = new Object();
                    obj6.A02("com.facebook.fbwebrtc.multiway.RtcMessageBody", A012);
                    ohp.A00(new C30189DRu(interfaceC16660sJ, 40), ((OX7) c54556O8i.A01.getValue()).A04(new C51759Mti((RtcMessageBody) obj6, A0N)));
                    return;
                }
                str2 = "Can't decline incoming call. eventHeader and rtcMessage are missing.";
            } else {
                A01(str3, str4, str, interfaceC16660sJ);
                return;
            }
        } else {
            str2 = "Can't decline incoming call. Incorrect signalling protocol.";
        }
        C0K8.A0E("RtcSignalingShim", str2);
        interfaceC16660sJ.invoke(false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v7, types: [com.facebook.hyperthrift.HyperThriftBase, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v2, types: [com.facebook.hyperthrift.HyperThriftBase, com.facebook.fbwebrtc.multiway.RtcMessageBody, java.lang.Object] */
    @Deprecated(message = "use APIs with CallConnectionEntity")
    public final void A01(String str, String str2, String str3, InterfaceC16660sJ interfaceC16660sJ) {
        C51759Mti A02;
        if (str == null && str2 == null) {
            C0K8.A0E("RtcSignalingShim", "Can't decline incoming call. VideoCallId and rtcMessage are missing.");
            AbstractC25227BEk.A1Q(interfaceC16660sJ, false);
            return;
        }
        OHP ohp = this.A03;
        C54556O8i c54556O8i = this.A04;
        InterfaceC09390do interfaceC09390do = c54556O8i.A01;
        OX7 ox7 = (OX7) interfaceC09390do.getValue();
        if (str != null) {
            A02 = ox7.A01(str);
        } else if (str2 != null) {
            A02 = ox7.A02(str2);
        } else {
            throw AbstractC166997dE.A0g();
        }
        HyperThriftBase hyperThriftBase = (HyperThriftBase) A02.A01;
        Object[] objArr = new Object[25];
        AbstractC25235BEs.A1R(objArr, 2, 0);
        Object A00 = hyperThriftBase.A00(4);
        if (A00 == null) {
            A00 = HyperThriftBase.A02;
        }
        objArr[4] = A00;
        Object A002 = hyperThriftBase.A00(12);
        if (A002 == null) {
            A002 = HyperThriftBase.A02;
        }
        objArr[12] = A002;
        Object A003 = hyperThriftBase.A00(1);
        if (A003 == null) {
            A003 = HyperThriftBase.A02;
        }
        objArr[1] = A003;
        Object A004 = hyperThriftBase.A00(2);
        if (A004 == null) {
            A004 = HyperThriftBase.A02;
        }
        objArr[2] = A004;
        Object A005 = hyperThriftBase.A00(17);
        if (A005 == null) {
            A005 = HyperThriftBase.A02;
        }
        objArr[17] = A005;
        long j = c54556O8i.A00;
        c54556O8i.A00 = 1 + j;
        Object valueOf = Long.valueOf(j);
        if (valueOf == null) {
            valueOf = HyperThriftBase.A02;
        }
        objArr[7] = valueOf;
        RtcMessageHeader A0N = AbstractC50522MSa.A0N((short) 0, objArr, 3);
        Object[] objArr2 = new Object[30];
        Object[] A01 = HyperThriftBase.Builder.A01(new Object[]{0, str3});
        ?? obj = new Object();
        obj.A02("com.facebook.fbwebrtc.multiway.HangupRequest", A01);
        objArr2[4] = obj;
        Object[] A012 = HyperThriftBase.Builder.A01(objArr2);
        ?? obj2 = new Object();
        obj2.A02("com.facebook.fbwebrtc.multiway.RtcMessageBody", A012);
        ohp.A00(new C30189DRu(interfaceC16660sJ, 39), ((OX7) interfaceC09390do.getValue()).A04(new C51759Mti((RtcMessageBody) obj2, A0N)));
    }

    public /* synthetic */ C54819OKw(Context context, UserSession userSession) {
        OHP ohp = new OHP(userSession);
        C54556O8i c54556O8i = new C54556O8i(context);
        O4R o4r = new O4R(userSession);
        this.A00 = context;
        this.A01 = userSession;
        this.A03 = ohp;
        this.A04 = c54556O8i;
        this.A02 = o4r;
    }
}
