package X;

import java.util.Iterator;
import java.util.List;

/* renamed from: X.NsL, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public abstract class AbstractC53889NsL {
    public static final int A00(List list, int i) {
        if (list != null && i >= 0) {
            int i2 = 0;
            Iterator it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                InterfaceC50490MQs interfaceC50490MQs = (InterfaceC50490MQs) it.next();
                C14360o3.A0C(interfaceC50490MQs, "null cannot be cast to non-null type com.instagram.creation.base.ui.feedcolorfilterpicker.FilterEffectInfo");
                C54629OBe c54629OBe = ((AbstractC48580LeI) interfaceC50490MQs).A00;
                boolean z = c54629OBe.A02;
                if (c54629OBe.A00 == i) {
                    if (!z) {
                        return i2;
                    }
                } else if (!z) {
                    i2++;
                }
            }
        }
        return -1;
    }
}
