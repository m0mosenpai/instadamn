package X;

import com.instagram.api.schemas.AFI_TYPE;
import com.instagram.common.session.UserSession;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;

/* renamed from: X.Hjq, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract class AbstractC39720Hjq {
    public static final C82373m0 A00(AFI_TYPE afi_type, InterfaceC106394qt interfaceC106394qt, UserSession userSession, C38321qM c38321qM, Integer num, int i, long j) {
        InterfaceC106354qp CCS;
        String A07;
        Long A0k;
        List Bjh = interfaceC106394qt.Bjh();
        if (Bjh != null && (CCS = interfaceC106394qt.CCS()) != null && (A07 = AbstractC41071vF.A07(userSession, c38321qM)) != null && (A0k = AbstractC003100w.A0k(10, A07)) != null) {
            long longValue = A0k.longValue();
            String A0F = AbstractC41071vF.A0F(userSession, c38321qM);
            if (A0F != null) {
                C09530e4 A1L = AbstractC166987dD.A1L("is_iaa_eligible", String.valueOf(AbstractC41071vF.A0O(userSession, c38321qM)));
                String CB2 = interfaceC106394qt.CB2();
                if (CB2 == null) {
                    CB2 = "";
                }
                HashMap A02 = AbstractC06930Yk.A02(AbstractC25229BEm.A1b("trigger_condition", CB2, A1L));
                byte[] bytes = A0F.getBytes(C15W.A05);
                C14360o3.A07(bytes);
                String A19 = AbstractC166987dD.A19(UUID.nameUUIDFromBytes(bytes));
                HashMap hashMap = new HashMap(A02);
                ArrayList A0i = AbstractC167007dF.A0i(Bjh);
                Iterator it = Bjh.iterator();
                while (it.hasNext()) {
                    AbstractC37302Gc3.A1Z(A0i, it);
                }
                C38621GyO c38621GyO = new C38621GyO(afi_type, CCS.Eqd(), A19, hashMap, A0i);
                String str = c38621GyO.A02;
                AFI_TYPE afi_type2 = c38621GyO.A00;
                HashMap hashMap2 = c38621GyO.A03;
                List list = c38621GyO.A04;
                InterfaceC106354qp interfaceC106354qp = c38621GyO.A01;
                HashMap hashMap3 = new HashMap(hashMap2);
                ArrayList A0i2 = AbstractC167007dF.A0i(list);
                Iterator it2 = list.iterator();
                while (it2.hasNext()) {
                    AbstractC37302Gc3.A1Z(A0i2, it2);
                }
                C42710Iv5 c42710Iv5 = new C42710Iv5(new C38608GyB(new C38621GyO(afi_type2, interfaceC106354qp.Eqd(), str, hashMap3, A0i2), longValue, true));
                c42710Iv5.A00 = i;
                c42710Iv5.A05 = A0F;
                c42710Iv5.A02 = c38321qM;
                c42710Iv5.A04 = num;
                c42710Iv5.A01 = j;
                C3XG c3xg = new C3XG(c42710Iv5, C1XV.A06, c42710Iv5.getId());
                EnumC73363Qm enumC73363Qm = EnumC73363Qm.A05;
                C671831j c671831j = new C671831j(null, null, null, 0, 0, 0, 0, 0, 16383, false, false, false, false);
                c671831j.A0B(i + 1);
                String A00 = C1EP.A00();
                C1EP.A00();
                return new C82373m0(new C9CB(C1EN.A0N, A00), c3xg, enumC73363Qm, c671831j);
            }
            return null;
        }
        return null;
    }
}
