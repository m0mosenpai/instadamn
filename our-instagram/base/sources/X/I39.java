package X;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes7.dex */
public abstract /* synthetic */ class I39 {
    public static Map A00(InterfaceC110874yz interfaceC110874yz) {
        LinkedHashMap A1I = AbstractC166987dD.A1I();
        if (interfaceC110874yz.BKv() != null) {
            List<JMQ> BKv = interfaceC110874yz.BKv();
            ArrayList arrayList = null;
            if (BKv != null) {
                arrayList = AbstractC166987dD.A1E();
                for (JMQ jmq : BKv) {
                    if (jmq != null) {
                        arrayList.add(jmq.F7o());
                    }
                }
            }
            A1I.put("keywords", arrayList);
        }
        if (interfaceC110874yz.BUT() != null) {
            A1I.put("model_version", interfaceC110874yz.BUT());
        }
        return AbstractC06930Yk.A0B(A1I);
    }
}
