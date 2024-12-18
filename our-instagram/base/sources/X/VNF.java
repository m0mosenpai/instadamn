package X;

import com.facebookpay.expresscheckout.repositoryimpl.ECPRepositoryImpl;
import java.util.LinkedHashMap;

/* loaded from: classes11.dex */
public abstract class VNF {
    public static final LinkedHashMap A00(java.util.Set set) {
        ECPRepositoryImpl eCPRepositoryImpl = C2FP.A01().A08;
        C62735SOb c62735SOb = new C62735SOb(null, "1302814060304063");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        VD8 vd8 = VD8.A03;
        if (set.contains(vd8)) {
            AbstractC43592JPx.A1W(vd8, linkedHashMap, ((T2O) eCPRepositoryImpl.A07.getValue()).A0F(c62735SOb));
        }
        VD8 vd82 = VD8.A05;
        if (set.contains(vd82)) {
            AbstractC43592JPx.A1W(vd82, linkedHashMap, ((T2O) eCPRepositoryImpl.A07.getValue()).A0H(c62735SOb));
        }
        VD8 vd83 = VD8.A02;
        if (set.contains(vd83)) {
            AbstractC43592JPx.A1W(vd83, linkedHashMap, ((T2M) eCPRepositoryImpl.A09.getValue()).A06(c62735SOb));
        }
        VD8 vd84 = VD8.A04;
        if (set.contains(vd84)) {
            AbstractC43592JPx.A1W(vd84, linkedHashMap, ((T2O) eCPRepositoryImpl.A07.getValue()).A0G(c62735SOb));
        }
        VD8 vd85 = VD8.A06;
        if (set.contains(vd85)) {
            AbstractC43592JPx.A1W(vd85, linkedHashMap, ((T2N) eCPRepositoryImpl.A08.getValue()).A0C(c62735SOb, null));
        }
        VD8 vd86 = VD8.A07;
        if (set.contains(vd86)) {
            AbstractC43592JPx.A1W(vd86, linkedHashMap, ((T2N) eCPRepositoryImpl.A08.getValue()).A0C(c62735SOb, VDW.A03));
        }
        VD8 vd87 = VD8.A08;
        if (set.contains(vd87)) {
            AbstractC43592JPx.A1W(vd87, linkedHashMap, ((T2N) eCPRepositoryImpl.A08.getValue()).A0C(c62735SOb, VDW.A05));
        }
        return linkedHashMap;
    }
}
