package X;

import com.instagram.common.lispy.lang.BloksScript;
import java.util.HashSet;
import java.util.List;
import java.util.Map;

/* loaded from: classes11.dex */
public abstract class VL9 {
    public static final Object A00(C6FQ c6fq, C6FW c6fw) {
        int intValue;
        String A0d = AbstractC31177DnL.A0d(c6fw);
        C69103Vht c69103Vht = (C69103Vht) C6AM.A00(c6fq).A06.get(A0d);
        if (c69103Vht != null) {
            Integer num = c69103Vht.A01;
            if (num != null && (intValue = num.intValue()) != 0) {
                A0d = C66208U4e.A00(C05F.A00, A0d, c6fq.A0D, intValue);
            }
            Map map = c6fq.A0F;
            if (map != null) {
                C69748Vui c69748Vui = (C69748Vui) map.get(A0d);
                if (c69748Vui == null) {
                    C136396Fs c136396Fs = new C136396Fs(new HashSet());
                    C6FG c6fg = c6fq.A03;
                    InterfaceC103384lE interfaceC103384lE = c6fq.A08;
                    List list = c6fq.A0D;
                    Map map2 = c6fq.A0E;
                    AnonymousClass632 anonymousClass632 = c6fq.A04;
                    InterfaceC103074ki interfaceC103074ki = c6fq.A01;
                    C63162tt c63162tt = c6fq.A06;
                    String str = c6fq.A0B;
                    C6FQ c6fq2 = new C6FQ(c6fq.A02, c6fg, (C6FG) c6fq.A0C.get(), anonymousClass632, c136396Fs, c63162tt, interfaceC103384lE, interfaceC103074ki, c6fq.A09, str, c6fq.A0A, list, map2, map);
                    BloksScript A00 = c69103Vht.A00.A00(null, null);
                    if (A00 instanceof InterfaceC103374lD) {
                        A00.ASn(c6fq2.A00);
                    }
                    c69748Vui = new C69748Vui(C131845xK.A00(c6fq2, C6FW.A01, A00), c136396Fs.A00);
                    map.put(A0d, c69748Vui);
                }
                InterfaceC136406Ft interfaceC136406Ft = c6fq.A05;
                if (interfaceC136406Ft != null) {
                    interfaceC136406Ft.A7t(c69748Vui.A01);
                }
                return c69748Vui.A00;
            }
            BloksScript A002 = c69103Vht.A00.A00(null, null);
            if (A002 instanceof InterfaceC103374lD) {
                A002.ASn(c6fq.A00);
            }
            return C131845xK.A00(c6fq, C6FW.A01, A002);
        }
        throw AbstractC167007dF.A0c(AnonymousClass001.A0g("Value for referenced id ", A0d, " not found! "), AbstractC111324zv.A00(1380));
    }
}
