package X;

import com.facebook.react.modules.intent.IntentModule;
import com.instagram.react.modules.base.IgReactQEModule;
import java.util.List;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* renamed from: X.WyZ, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C71681WyZ implements InterfaceC09250da, InterfaceC16660sJ {
    public final int A00;
    public final Object A01;
    public final Object A02;

    public C71681WyZ(int i, Object obj, Object obj2) {
        this.A00 = i;
        this.A01 = obj;
        this.A02 = obj2;
    }

    @Override // X.InterfaceC16660sJ
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        C69634Vsb c69634Vsb;
        C16930sl c16930sl;
        SerialDescriptor descriptor;
        String str;
        switch (this.A00) {
            case 1:
            case 3:
            case 4:
                ((InterfaceC16820sZ) this.A02).invoke();
                return null;
            case 2:
            case 6:
            case 7:
                InterfaceC16620sF interfaceC16620sF = (InterfaceC16620sF) this.A02;
                List list = ((C6FW) obj).A00;
                interfaceC16620sF.invoke(list.get(0), list.get(1));
                return null;
            case 5:
            case 8:
            case 9:
            case 10:
            default:
                ((InterfaceC16660sJ) this.A02).invoke(MSY.A0a((C6FW) obj));
                return null;
            case 11:
                C3R9 c3r9 = (C3R9) this.A01;
                C3R9 c3r92 = (C3R9) this.A02;
                c69634Vsb = (C69634Vsb) obj;
                C14360o3.A0B(c69634Vsb, 2);
                SerialDescriptor descriptor2 = c3r9.getDescriptor();
                c16930sl = C16930sl.A00;
                c69634Vsb.A00("key", c16930sl, descriptor2);
                descriptor = c3r92.getDescriptor();
                str = IntentModule.EXTRA_MAP_KEY_FOR_VALUE;
                break;
            case IgReactQEModule.CONFIG_KEY_OFFSET /* 12 */:
                C3R9 c3r93 = (C3R9) this.A01;
                C3R9 c3r94 = (C3R9) this.A02;
                c69634Vsb = (C69634Vsb) obj;
                C14360o3.A0B(c69634Vsb, 2);
                SerialDescriptor descriptor3 = c3r93.getDescriptor();
                c16930sl = C16930sl.A00;
                c69634Vsb.A00("first", c16930sl, descriptor3);
                descriptor = c3r94.getDescriptor();
                str = "second";
                break;
        }
        c69634Vsb.A00(str, c16930sl, descriptor);
        return C0eB.A00;
    }
}
