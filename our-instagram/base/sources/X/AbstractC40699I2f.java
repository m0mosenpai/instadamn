package X;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* renamed from: X.I2f, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract /* synthetic */ class AbstractC40699I2f {
    public static Map A00(InterfaceC38121pw interfaceC38121pw) {
        LinkedHashMap A1I = AbstractC166987dD.A1I();
        if (interfaceC38121pw.B1N() != null) {
            List<JMY> B1N = interfaceC38121pw.B1N();
            ArrayList arrayList = null;
            if (B1N != null) {
                arrayList = AbstractC166987dD.A1E();
                for (JMY jmy : B1N) {
                    if (jmy != null) {
                        arrayList.add(jmy.F7o());
                    }
                }
            }
            A1I.put("empty_story_state_cards", arrayList);
        }
        return AbstractC06930Yk.A0B(A1I);
    }
}
