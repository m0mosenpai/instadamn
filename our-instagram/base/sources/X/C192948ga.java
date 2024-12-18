package X;

import android.util.JsonReader;
import java.io.StringReader;

/* renamed from: X.8ga, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C192948ga {
    public C102794kG A00;
    public String A01;

    public static C192948ga A00(InterfaceC102764kD interfaceC102764kD) {
        String str;
        C192948ga A00 = AbstractC192958gb.A00(null, interfaceC102764kD);
        if (A00 != null && (str = A00.A01) != null) {
            C192928gY c192928gY = new C192928gY(new JsonReader(new StringReader(str)));
            c192928gY.Csy();
            return AbstractC192958gb.A00(null, c192928gY);
        }
        return A00;
    }
}
