package X;

import com.google.protobuf.UnsafeUtil;
import java.util.List;

/* loaded from: classes10.dex */
public abstract class SK6 {
    public static final SK6 A00 = new Object();
    public static final SK6 A01 = new Object();

    public final List A01(Object obj, long j) {
        if (this instanceof RYp) {
            InterfaceC65691TsD interfaceC65691TsD = (InterfaceC65691TsD) AbstractC63034Sb9.A00(obj, j);
            if (!((TZ8) interfaceC65691TsD).A00) {
                InterfaceC65691TsD Cq5 = interfaceC65691TsD.Cq5(AbstractC58320PtC.A01(interfaceC65691TsD));
                UnsafeUtil.A06(obj, j, Cq5);
                return Cq5;
            }
            return interfaceC65691TsD;
        }
        return RYq.A00(obj, 10, j);
    }
}
