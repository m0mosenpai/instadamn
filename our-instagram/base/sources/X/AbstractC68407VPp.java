package X;

import androidx.fragment.app.FragmentActivity;
import com.instagram.bloks.hosting.IgBloksScreenConfig;
import java.util.ArrayList;
import java.util.Map;

/* renamed from: X.VPp, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public abstract class AbstractC68407VPp {
    public static final Object A00(C6FQ c6fq, C6FW c6fw) {
        String A0I;
        int A03;
        InterfaceC08430c6 interfaceC08430c6;
        C102884kP A0F = AbstractC31175DnJ.A0F(c6fw, 0);
        Object A02 = c6fw.A02();
        C14360o3.A0C(A02, AbstractC111324zv.A00(15));
        C1338462s c1338462s = (C1338462s) A02;
        c6fw.A03(2);
        if (c6fq.A03 == null || A0F == null || (A0I = A0F.A0I()) == null || -1 == (A03 = A0F.A03(40, -1))) {
            return null;
        }
        Map map = (Map) C131845xK.A00(c6fq, C6FW.A01, A0F.A0A());
        if (map == null) {
            return null;
        }
        C66273U6s c66273U6s = new C66273U6s(null, null, null, null, null, null, null, null, null, new ArrayList(), map, null, null, -1, A03, -1L, -1L, false, false);
        IgBloksScreenConfig igBloksScreenConfig = new IgBloksScreenConfig(C6BQ.A0A(C6BQ.A09(c6fq)));
        igBloksScreenConfig.A0S = A0I;
        String A0J = A0F.A0J();
        FragmentActivity A032 = C6BQ.A03(C6BQ.A09(c6fq));
        C68109VBs c68109VBs = new C68109VBs(C05F.A0C);
        C191778eZ A04 = igBloksScreenConfig.A04();
        C14360o3.A0B(A032, 0);
        InterfaceC018407e interfaceC018407e = (InterfaceC72040XGi) C66224U4u.A01(A032);
        if ((interfaceC018407e instanceof C0SG) && (interfaceC08430c6 = (C0SG) interfaceC018407e) != null) {
            InterfaceC72040XGi interfaceC72040XGi = (InterfaceC72040XGi) interfaceC08430c6;
            XBU Bdi = interfaceC72040XGi.Bdi(EnumC68125VCj.A02);
            C14360o3.A0C(Bdi, "null cannot be cast to non-null type com.bloks.foa.cds.bottomsheet.intf.CdsBloksBottomSheetBehavior");
            interfaceC72040XGi.EH2(WGI.A01(A032, c66273U6s, (C66209U4f) Bdi, c1338462s, A04, A0I), c68109VBs, A0J);
            return null;
        }
        throw new IllegalStateException("Cannot replace without an existing bottom sheet.");
    }
}
