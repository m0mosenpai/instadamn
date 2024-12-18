package X;

import com.instagram.common.session.UserSession;
import java.util.List;

/* loaded from: classes7.dex */
public final class HL8 extends AbstractC154286wd {
    public final /* synthetic */ IMU A00;
    public final /* synthetic */ InterfaceC43460JHy A01;

    public HL8(IMU imu, InterfaceC43460JHy interfaceC43460JHy) {
        this.A00 = imu;
        this.A01 = interfaceC43460JHy;
    }

    @Override // X.C1P1
    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        int A03 = C0f9.A03(-1513664333);
        InterfaceC40821up interfaceC40821up = (InterfaceC40821up) obj;
        int A032 = C0f9.A03(-612150321);
        IMU imu = this.A00;
        InterfaceC43448JHm interfaceC43448JHm = imu.A06;
        InterfaceC43460JHy interfaceC43460JHy = this.A01;
        IKC E3W = interfaceC43448JHm.E3W(interfaceC40821up, interfaceC43460JHy.AuB());
        imu.A02 = E3W.A06;
        UserSession userSession = imu.A05;
        boolean A06 = C18U.A06(C06090Tz.A05, userSession, 36315679359503857L);
        if (imu.A03) {
            C40948IBv c40948IBv = imu.A00;
            int size = E3W.A04.size();
            C006802i c006802i = c40948IBv.A00;
            c006802i.markerAnnotate(480321881, "MEDIA_COUNT", size);
            c006802i.markerPoint(480321881, "RESPONSE_RECEIVED");
            c006802i.markerEnd(480321881, (short) 2);
        }
        for (C38321qM c38321qM : E3W.A04) {
            if (c38321qM.CdW() && !A06) {
                InterfaceC60442pS interfaceC60442pS = imu.A08;
                C5SE c5se = new C5SE(userSession, c38321qM);
                int i = -1;
                if (c38321qM.A5M()) {
                    i = 0;
                }
                c5se.A00 = i;
                C32U.A0N(userSession, c5se, c38321qM, interfaceC60442pS, null, "delivery");
            }
        }
        E3W.A05.isEmpty();
        interfaceC43448JHm.FBx(EnumC74603Ws.A05, true);
        List list = E3W.A03;
        interfaceC43460JHy.DqV(E3W.A00, ((InterfaceC74303Vl) interfaceC40821up).getNextMaxId(), E3W.A02, E3W.A01, list);
        C0f9.A0A(1794490766, A032);
        C0f9.A0A(1889004103, A03);
    }

    @Override // X.C1P1
    public final void onFail(AbstractC115105If abstractC115105If) {
        int A03 = C0f9.A03(1855236334);
        this.A01.DFf();
        IMU imu = this.A00;
        imu.A06.FBx(EnumC74603Ws.A04, true);
        if (imu.A03) {
            imu.A00.A00.markerEnd(480321881, (short) 3);
        }
        C0f9.A0A(-522182149, A03);
    }

    @Override // X.C1P1
    public final void onFinish() {
        C0f9.A0A(-468306738, C0f9.A03(1271689728));
    }

    @Override // X.C1P1
    public final void onStart() {
        int A03 = C0f9.A03(815095105);
        this.A01.onStart();
        IMU imu = this.A00;
        if (imu.A03) {
            C006802i c006802i = imu.A00.A00;
            c006802i.markerStart(480321881);
            c006802i.markerPoint(480321881, "RESPONSE_SENT");
            c006802i.markerAnnotate(480321881, "FETCH_REASON", "LOAD_MORE");
        }
        C0f9.A0A(-510867203, A03);
    }

    @Override // X.C1P1
    public final /* bridge */ /* synthetic */ void onSuccessInBackground(Object obj) {
        int A03 = C0f9.A03(-1207652795);
        C0f9.A0A(1037095580, C0f9.A03(-10467671));
        C0f9.A0A(-752240870, A03);
    }
}
