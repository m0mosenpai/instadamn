package X;

import android.content.Context;
import com.facebook.caa.shared.passkey.igconfig.IGContextProvider;
import com.fbpay.w3c.security.SecurityProviderEphemeral;
import com.instagram.debug.devoptions.avatars.ImmersiveAvatarViewerDebugFragment;
import java.util.BitSet;
import java.util.Map;

/* renamed from: X.Vw0, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public abstract class AbstractC69814Vw0 {
    public static final void A00(Context context, Integer num, Map map, InterfaceC16660sJ interfaceC16660sJ, InterfaceC16620sF interfaceC16620sF, InterfaceC16620sF interfaceC16620sF2) {
        String str;
        C14360o3.A0B(num, 1);
        C62862tP A00 = IGContextProvider.A00(context);
        if (A00 != null) {
            C69101Vhr c69101Vhr = new C69101Vhr();
            switch (num.intValue()) {
                case 0:
                    str = "bloks_shell_test";
                    break;
                case 1:
                    str = "payments_autofill";
                    break;
                default:
                    str = "encrypted_backups";
                    break;
            }
            Map map2 = c69101Vhr.A02;
            map2.put(ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY, str);
            BitSet bitSet = c69101Vhr.A00;
            bitSet.set(0);
            map2.put("prf_input_first", null);
            C66237U5h c66237U5h = new C66237U5h(new C71681WyZ(7, c69101Vhr, interfaceC16620sF));
            Map map3 = c69101Vhr.A01;
            map3.put("on_flow_success", c66237U5h);
            map3.put("on_flow_error", new C66237U5h(new C71681WyZ(6, c69101Vhr, interfaceC16620sF2)));
            map3.put("on_flow_cancel", new C66237U5h(new C71681WyZ(5, c69101Vhr, interfaceC16660sJ)));
            if (!map.isEmpty()) {
                map2.put("logging_params", map);
            }
            C36026FvO c36026FvO = new C36026FvO(1);
            if (bitSet.nextClearBit(0) >= 1) {
                C69618VsL c69618VsL = new C69618VsL("com.bloks.www.bloks.caa.passkey.creation.async");
                c69618VsL.A04 = AbstractC191768eY.A01(map2);
                c69618VsL.A03 = map3;
                c69618VsL.A02 = c36026FvO;
                c69618VsL.A00(context, A00);
                return;
            }
            throw new IllegalStateException("Missing Required Props");
        }
    }

    public static final void A01(Context context, String str, Map map, java.util.Set set, InterfaceC16820sZ interfaceC16820sZ, InterfaceC16820sZ interfaceC16820sZ2, InterfaceC16820sZ interfaceC16820sZ3, InterfaceC16660sJ interfaceC16660sJ, InterfaceC16620sF interfaceC16620sF) {
        C62862tP A00 = IGContextProvider.A00(context);
        if (A00 != null) {
            ((SNN) SecurityProviderEphemeral.A00.invoke()).A01(new X5C(context, A00, str, map, set, interfaceC16820sZ2, interfaceC16820sZ3, interfaceC16820sZ, interfaceC16660sJ, interfaceC16620sF));
        }
    }
}
