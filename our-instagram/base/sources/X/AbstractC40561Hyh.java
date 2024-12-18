package X;

import com.facebook.pando.TreeUpdaterJNI;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* renamed from: X.Hyh, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract /* synthetic */ class AbstractC40561Hyh {
    public static Map A00(InterfaceC110164xl interfaceC110164xl) {
        TreeUpdaterJNI F7o;
        LinkedHashMap A1I = AbstractC166987dD.A1I();
        if (interfaceC110164xl.C6M() != null) {
            List<InterfaceC93104Fm> C6M = interfaceC110164xl.C6M();
            ArrayList A1E = AbstractC166987dD.A1E();
            for (InterfaceC93104Fm interfaceC93104Fm : C6M) {
                if (interfaceC93104Fm != null && (F7o = interfaceC93104Fm.F7o()) != null) {
                    A1E.add(F7o);
                }
            }
            A1I.put(AbstractC111324zv.A00(5476), A1E);
        }
        return AbstractC06930Yk.A0B(A1I);
    }
}
