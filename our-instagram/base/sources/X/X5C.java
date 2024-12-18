package X;

import android.content.Context;
import com.instagram.debug.devoptions.avatars.ImmersiveAvatarViewerDebugFragment;
import java.util.BitSet;
import java.util.Map;

/* loaded from: classes11.dex */
public final class X5C extends C0YY implements InterfaceC16660sJ {
    public final /* synthetic */ Context A00;
    public final /* synthetic */ InterfaceC62872tQ A01;
    public final /* synthetic */ String A02;
    public final /* synthetic */ Map A03;
    public final /* synthetic */ java.util.Set A04;
    public final /* synthetic */ InterfaceC16820sZ A05;
    public final /* synthetic */ InterfaceC16820sZ A06;
    public final /* synthetic */ InterfaceC16820sZ A07;
    public final /* synthetic */ InterfaceC16660sJ A08;
    public final /* synthetic */ InterfaceC16620sF A09;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public X5C(Context context, InterfaceC62872tQ interfaceC62872tQ, String str, Map map, java.util.Set set, InterfaceC16820sZ interfaceC16820sZ, InterfaceC16820sZ interfaceC16820sZ2, InterfaceC16820sZ interfaceC16820sZ3, InterfaceC16660sJ interfaceC16660sJ, InterfaceC16620sF interfaceC16620sF) {
        super(1);
        this.A04 = set;
        this.A02 = str;
        this.A07 = interfaceC16820sZ;
        this.A09 = interfaceC16620sF;
        this.A05 = interfaceC16820sZ2;
        this.A06 = interfaceC16820sZ3;
        this.A03 = map;
        this.A00 = context;
        this.A01 = interfaceC62872tQ;
        this.A08 = interfaceC16660sJ;
    }

    @Override // X.InterfaceC16660sJ
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        C2IE c2ie = (C2IE) obj;
        C14360o3.A0B(c2ie, 0);
        AbstractC53594Nn1.A00 = c2ie.A00();
        C65076Td9 c65076Td9 = new C65076Td9(23, this.A08, c2ie);
        C69100Vhq c69100Vhq = new C69100Vhq();
        Map map = c69100Vhq.A02;
        map.put(ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY, "payments_autofill");
        BitSet bitSet = c69100Vhq.A00;
        bitSet.set(0);
        java.util.Set set = this.A04;
        if (!set.isEmpty()) {
            map.put("allowable_credentials", set);
        }
        map.put("credit_card_id", this.A02);
        map.put("prf_input_first", null);
        C66237U5h c66237U5h = new C66237U5h(new C71681WyZ(4, c69100Vhq, this.A07));
        Map map2 = c69100Vhq.A01;
        map2.put("on_flow_success", c66237U5h);
        map2.put("on_flow_error", new C66237U5h(new C71681WyZ(2, c69100Vhq, this.A09)));
        map2.put("on_flow_cancel", new C66237U5h(new C71681WyZ(1, c69100Vhq, this.A05)));
        map2.put("on_flow_no_available_credentials", new C66237U5h(new C71681WyZ(3, c69100Vhq, this.A06)));
        map2.put("on_entry_point_payments_autofill_success", new C66237U5h(new C71681WyZ(0, c69100Vhq, c65076Td9)));
        Map map3 = this.A03;
        if (!map3.isEmpty()) {
            map.put("logging_params", map3);
        }
        Context context = this.A00;
        InterfaceC62872tQ interfaceC62872tQ = this.A01;
        C36026FvO c36026FvO = new C36026FvO(0);
        if (bitSet.nextClearBit(0) >= 1) {
            C69618VsL c69618VsL = new C69618VsL("com.bloks.www.bloks.caa.passkey.assertion.async");
            c69618VsL.A04 = AbstractC191768eY.A01(map);
            c69618VsL.A03 = map2;
            c69618VsL.A02 = c36026FvO;
            c69618VsL.A00(context, interfaceC62872tQ);
            return C0eB.A00;
        }
        throw new IllegalStateException("Missing Required Props");
    }
}
