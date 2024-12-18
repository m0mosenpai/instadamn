package X;

import com.facebook.R;
import java.util.AbstractMap;
import java.util.ArrayList;

/* loaded from: classes11.dex */
public abstract class VL8 {
    public static final ArrayList A00(C6FQ c6fq, C6FW c6fw) {
        String A00 = C6AN.A00(c6fw.A01());
        C6FG c6fg = c6fq.A03;
        if (c6fg != null) {
            if (AbstractC79383gk.A03()) {
                ArrayList arrayList = (ArrayList) ((AbstractMap) c6fg.A00(R.id.bk_context_key_states)).get(A00);
                if (arrayList == null) {
                    AnonymousClass630 A02 = AnonymousClass634.A02(c6fg);
                    WfF wfF = new WfF(A00);
                    A02.A07().A0T(wfF);
                    InterfaceC103384lE interfaceC103384lE = wfF.A00;
                    if (interfaceC103384lE != null && (arrayList = (ArrayList) C131845xK.A00(c6fq, C6FW.A01, interfaceC103384lE)) != null) {
                        if (AbstractC79383gk.A03()) {
                            ((AbstractMap) c6fg.A00(R.id.bk_context_key_states)).put(A00, arrayList);
                        } else {
                            throw new RuntimeException("Accessing state is only supported from the UI Thread");
                        }
                    } else {
                        throw AbstractC31175DnJ.A0V("No state initializer available for id: ", A00);
                    }
                }
                return arrayList;
            }
            throw new RuntimeException("Accessing state is only supported from the UI Thread");
        }
        throw AbstractC166997dE.A0g();
    }
}
