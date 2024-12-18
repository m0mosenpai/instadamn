package X;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes7.dex */
public abstract /* synthetic */ class I5F {
    public static Map A00(InterfaceC43549JLj interfaceC43549JLj) {
        LinkedHashMap A1I = AbstractC166987dD.A1I();
        if (interfaceC43549JLj.Ayw() != null) {
            List<InterfaceC43548JLi> Ayw = interfaceC43549JLj.Ayw();
            ArrayList arrayList = null;
            if (Ayw != null) {
                arrayList = AbstractC166987dD.A1E();
                for (InterfaceC43548JLi interfaceC43548JLi : Ayw) {
                    if (interfaceC43548JLi != null) {
                        arrayList.add(interfaceC43548JLi.F7o());
                    }
                }
            }
            A1I.put("donations", arrayList);
        }
        if (interfaceC43549JLj.BPp() != null) {
            A1I.put("max_id", interfaceC43549JLj.BPp());
        }
        if (interfaceC43549JLj.BUs() != null) {
            A1I.put("more_available", interfaceC43549JLj.BUs());
        }
        return AbstractC06930Yk.A0B(A1I);
    }
}
