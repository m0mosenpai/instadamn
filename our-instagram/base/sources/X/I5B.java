package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* loaded from: classes7.dex */
public abstract /* synthetic */ class I5B {
    public static Map A00(InterfaceC43547JLh interfaceC43547JLh) {
        LinkedHashMap A1I = AbstractC166987dD.A1I();
        if (interfaceC43547JLh.AnG() != null) {
            A1I.put("charity_user", interfaceC43547JLh.AnG().A07());
        }
        if (interfaceC43547JLh.Bin() != null) {
            A1I.put("prompt_title", interfaceC43547JLh.Bin());
        }
        return AbstractC06930Yk.A0B(A1I);
    }
}
