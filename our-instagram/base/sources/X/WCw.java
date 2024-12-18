package X;

import android.content.Context;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import com.facebookpay.logging.LoggingContext;
import com.instagram.bloks.hosting.IgBloksScreenConfig;
import java.util.BitSet;
import java.util.List;
import java.util.Map;

/* loaded from: classes11.dex */
public final class WCw {
    public static final WCw A00 = new Object();

    /* JADX WARN: Multi-variable type inference failed */
    public final void A01(Context context, Fragment fragment, VEY vey, LoggingContext loggingContext, List list, List list2, InterfaceC16660sJ interfaceC16660sJ, InterfaceC16660sJ interfaceC16660sJ2, boolean z) {
        C14360o3.A0B(loggingContext, 2);
        IgBloksScreenConfig igBloksScreenConfig = new IgBloksScreenConfig(C023409i.A0A.A08(C2FP.A00()));
        C65076Td9 c65076Td9 = new C65076Td9(fragment, interfaceC16660sJ, 40);
        C65076Td9 c65076Td92 = new C65076Td9(fragment, interfaceC16660sJ2, 41);
        C69292Vl0 c69292Vl0 = new C69292Vl0(context);
        String str = loggingContext.A02;
        Map map = c69292Vl0.A03;
        map.put("upl_session_id", str);
        BitSet bitSet = c69292Vl0.A01;
        bitSet.set(2);
        map.put("apply_incentive", new C66237U5h(new C71681WyZ(9, c69292Vl0, c65076Td9)));
        bitSet.set(0);
        map.put("remove_incentive", new C66237U5h(new C71681WyZ(10, c69292Vl0, c65076Td92)));
        bitSet.set(1);
        map.put("show_promocode_input", Boolean.valueOf(z));
        if ((!list.isEmpty()) && !list.isEmpty()) {
            map.put("available_offers", list);
        }
        if ((!list2.isEmpty()) && !list2.isEmpty()) {
            map.put("applied_offer_ids", list2);
        }
        if (bitSet.nextClearBit(0) >= 3) {
            C66277U6x c66277U6x = new C66277U6x(AbstractC191768eY.A01(c69292Vl0.A04), map, "com.bloks.www.ecp.incentive.offer-selection");
            AbstractC31178DnM.A1M(c66277U6x, 719983200);
            c66277U6x.A03 = null;
            c66277U6x.A02 = null;
            c66277U6x.A04 = null;
            c66277U6x.A08(c69292Vl0.A02);
            C72743Nv A03 = c66277U6x.A03(c69292Vl0.A00, igBloksScreenConfig);
            C67752UxP c67752UxP = (C67752UxP) fragment;
            InterfaceC16530ry interfaceC16530ry = c67752UxP.A0D;
            C0YR[] c0yrArr = C67752UxP.A0X;
            AbstractC167007dF.A1L(c67752UxP, interfaceC16530ry, c0yrArr, 19, false);
            AbstractC31171DnF.A1S(c67752UxP, null, c67752UxP.A0E, c0yrArr, 1);
            AbstractC31171DnF.A1S(c67752UxP, null, c67752UxP.A0R, c0yrArr, 6);
            AbstractC31171DnF.A1S(c67752UxP, vey.A00, c67752UxP.A0G, c0yrArr, 2);
            AbstractC31171DnF.A1S(c67752UxP, new WNN(new C57549PgN(c67752UxP, 46), 7), c67752UxP.A0H, c0yrArr, 11);
            C14360o3.A0A(A03);
            C14360o3.A0B(A03, 1);
            AbstractC167007dF.A0J().post(new RunnableC71600Www(A03, (InterfaceC72028XFq) fragment, true, false));
            return;
        }
        throw new IllegalStateException("Missing Required Props");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void A00(Bundle bundle, Fragment fragment, String str, boolean z, boolean z2) {
        AbstractC167007dF.A0J().post(new RunnableC71600Www(C2FP.A01().A01(bundle, str), (InterfaceC72028XFq) fragment, z, z2));
    }
}
