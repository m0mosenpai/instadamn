package X;

import com.instagram.api.schemas.InspirationSignalType;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* renamed from: X.Hpf, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract /* synthetic */ class AbstractC40053Hpf {
    public static Map A00(InterfaceC43508JJu interfaceC43508JJu) {
        LinkedHashMap A1I = AbstractC166987dD.A1I();
        if (interfaceC43508JJu.BxK() != null) {
            List<InspirationSignalType> BxK = interfaceC43508JJu.BxK();
            ArrayList A0q = AbstractC167017dG.A0q(BxK);
            for (InspirationSignalType inspirationSignalType : BxK) {
                C14360o3.A0B(inspirationSignalType, 0);
                A0q.add(inspirationSignalType.A00);
            }
            A1I.put("signal_types", A0q);
        }
        return AbstractC06930Yk.A0B(A1I);
    }
}
