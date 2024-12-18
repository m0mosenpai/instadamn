package X;

import android.content.Context;
import com.facebook.fbwebrtc.multiway.RtcMessageBody;
import com.facebook.fbwebrtc.multiway.RtcMessageHeader;
import com.facebook.hyperthrift.HyperThriftBase;
import com.instagram.common.session.UserSession;
import com.instagram.model.rtc.RtcIgNotification;
import com.instagram.rtc.signaling.models.RtcConnectionEntity;
import com.instagram.video.common.events.IgRtcEventHeader;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.Pjj, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C57756Pjj extends C0YY implements InterfaceC16620sF {
    public final /* synthetic */ InterfaceC58275PsT A00;
    public final /* synthetic */ RtcConnectionEntity.RtcCallConnectionEntity A01;
    public final /* synthetic */ C1WB A02;
    public final /* synthetic */ String A03;
    public final /* synthetic */ String A04;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C57756Pjj(InterfaceC58275PsT interfaceC58275PsT, RtcConnectionEntity.RtcCallConnectionEntity rtcCallConnectionEntity, C1WB c1wb, String str, String str2) {
        super(2);
        this.A01 = rtcCallConnectionEntity;
        this.A02 = c1wb;
        this.A00 = interfaceC58275PsT;
        this.A04 = str;
        this.A03 = str2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v2, types: [com.facebook.hyperthrift.HyperThriftBase, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v4, types: [com.facebook.hyperthrift.HyperThriftBase, com.facebook.fbwebrtc.multiway.RtcMessageBody, java.lang.Object] */
    @Override // X.InterfaceC16620sF
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        String str;
        String str2;
        C51759Mti A02;
        C81663kb c81663kb;
        String str3;
        List list;
        UserSession userSession = (UserSession) obj;
        C14360o3.A0B(userSession, 0);
        RtcConnectionEntity.RtcCallConnectionEntity rtcCallConnectionEntity = this.A01;
        if (rtcCallConnectionEntity != null) {
            C1WB c1wb = this.A02;
            InterfaceC58275PsT interfaceC58275PsT = this.A00;
            String str4 = this.A04;
            String str5 = this.A03;
            C3ES A00 = c1wb.A06.A00(AbstractC166987dD.A0O(c1wb.A01), userSession);
            MIP mip = new MIP(c1wb, rtcCallConnectionEntity, userSession, str4, str5, 3);
            java.util.Set<C56140Ow0> keySet = A00.A08.A00.A06.keySet();
            C14360o3.A07(keySet);
            for (C56140Ow0 c56140Ow0 : keySet) {
                Context context = c56140Ow0.A00;
                if (C56140Ow0.A00(context)) {
                    String str6 = rtcCallConnectionEntity.A0J;
                    ArrayList arrayList = null;
                    if (str6 != null) {
                        c81663kb = ((C2DU) C2JD.A00(c56140Ow0.A01)).A0N(str6);
                    } else {
                        c81663kb = null;
                    }
                    if (rtcCallConnectionEntity.A0N) {
                        if (c81663kb != null) {
                            str3 = c81663kb.C7l();
                            List BSH = c81663kb.BSH();
                            ArrayList A0i = AbstractC167007dF.A0i(BSH);
                            Iterator it = BSH.iterator();
                            while (it.hasNext()) {
                                A0i.add(AbstractC76433bn.A00(AbstractC25226BEj.A15(it)));
                            }
                            list = AbstractC001800i.A0X(A0i);
                            List BSH2 = c81663kb.BSH();
                            arrayList = AbstractC167007dF.A0i(BSH2);
                            Iterator it2 = BSH2.iterator();
                            while (it2.hasNext()) {
                                arrayList.add(AbstractC25226BEj.A15(it2).B8y());
                            }
                        } else {
                            str3 = null;
                            list = null;
                        }
                    } else {
                        str3 = null;
                        list = null;
                    }
                    OWH owh = OWH.A00;
                    UserSession userSession2 = c56140Ow0.A01;
                    if (str6 == null) {
                        str6 = "";
                    }
                    String str7 = rtcCallConnectionEntity.A0B;
                    String str8 = rtcCallConnectionEntity.A0C;
                    if (str8 == null) {
                        str8 = "";
                    }
                    String str9 = str6;
                    owh.A01(context, userSession2, str9, str7, str8, str3, list, arrayList, 2, !rtcCallConnectionEntity.A0L ? 1 : 0, rtcCallConnectionEntity.A00 * 1000);
                }
            }
            C54819OKw c54819OKw = (C54819OKw) A00.A0C.getValue();
            C9E2 c9e2 = new C9E2(mip, 1);
            Integer num = rtcCallConnectionEntity.A08;
            if (num == C05F.A01) {
                RtcIgNotification rtcIgNotification = rtcCallConnectionEntity.A04;
                String str10 = null;
                if (rtcIgNotification != null) {
                    str2 = rtcIgNotification.A05;
                    str10 = rtcIgNotification.A06;
                } else {
                    str2 = null;
                }
                IgRtcEventHeader igRtcEventHeader = rtcCallConnectionEntity.A06;
                if (str2 == null && str10 == null) {
                    if (igRtcEventHeader == null) {
                        str = "Can't confirm the call ring. eventHeader and rtcMessage are missing.";
                    }
                } else {
                    OHP ohp = c54819OKw.A03;
                    C54556O8i c54556O8i = c54819OKw.A04;
                    InterfaceC09390do interfaceC09390do = c54556O8i.A01;
                    OX7 ox7 = (OX7) interfaceC09390do.getValue();
                    if (str2 != null) {
                        A02 = ox7.A01(str2);
                    } else if (str10 != null) {
                        A02 = ox7.A02(str10);
                    } else {
                        throw AbstractC166997dE.A0g();
                    }
                    Object[] A01 = HyperThriftBase.Builder.A01(AbstractC25228BEl.A1Y(0));
                    ?? obj3 = new Object();
                    obj3.A02("com.facebook.fbwebrtc.multiway.RingResponse", A01);
                    Object[] A012 = HyperThriftBase.Builder.A01(((HyperThriftBase) A02.A01).A01);
                    long j = c54556O8i.A00;
                    c54556O8i.A00 = 1 + j;
                    Object valueOf = Long.valueOf(j);
                    if (valueOf == null) {
                        valueOf = HyperThriftBase.A02;
                    }
                    A012[7] = valueOf;
                    RtcMessageHeader A0N = AbstractC50522MSa.A0N(200, A012, 5);
                    Object[] objArr = new Object[30];
                    objArr[7] = obj3;
                    Object[] A013 = HyperThriftBase.Builder.A01(objArr);
                    ?? obj4 = new Object();
                    obj4.A02("com.facebook.fbwebrtc.multiway.RtcMessageBody", A013);
                    ohp.A00(new C30189DRu(c9e2, 37), ((OX7) interfaceC09390do.getValue()).A04(new C51759Mti((RtcMessageBody) obj4, A0N)));
                }
                interfaceC58275PsT.AIo("alert_ack_notification");
            } else if (num == C05F.A00) {
                str = "Can't confirm the call ring. videoCallId is missing.";
            } else {
                str = "Can't confirm the call ring. Incorrect signalling protocol.";
            }
            C0K8.A0E("RtcSignalingShim", str);
            c9e2.invoke(false);
            interfaceC58275PsT.AIo("alert_ack_notification");
        }
        return C0eB.A00;
    }
}
