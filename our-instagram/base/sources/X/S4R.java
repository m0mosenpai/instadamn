package X;

import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Map;

/* loaded from: classes10.dex */
public abstract class S4R {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v0, types: [X.SEA, java.lang.Object] */
    public static Object A00(C6FQ c6fq, C6FW c6fw) {
        String str = (String) c6fw.A02();
        Map map = (Map) c6fw.A00();
        InterfaceC103384lE A0I = AbstractC31175DnJ.A0I(c6fw, 3);
        InterfaceC103384lE A0I2 = AbstractC31175DnJ.A0I(c6fw, 4);
        Collection collection = (Collection) c6fw.A03(5);
        C63346Si2 A01 = C63174SeZ.A01();
        HashSet A0k = AbstractC31171DnF.A0k(collection);
        ?? obj = new Object();
        obj.A00 = map;
        obj.A01 = A0k;
        java.util.Set emptySet = Collections.emptySet();
        SXG A00 = SXG.A0A.A00(A01, obj, str, Collections.emptyMap(), emptySet);
        C60623REi A03 = AbstractC63245Sfz.A03(C2FP.A04(), C2FP.A06(), A00);
        AbstractC63144Sdq.A02(A03);
        C63406Sjd.A0B(((AbstractC63144Sdq) A03).A03, new C63626SqY(c6fq, A0I, A0I2, 15));
        return null;
    }
}
