package X;

import java.util.ArrayList;
import java.util.Map;

/* renamed from: X.JcP, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C43976JcP {
    public final Map A00;

    public C43976JcP(AbstractC43964JcD... abstractC43964JcDArr) {
        ArrayList A17 = AbstractC25225BEi.A17(23);
        int i = 0;
        do {
            AbstractC43964JcD abstractC43964JcD = abstractC43964JcDArr[i];
            A17.add(new C09530e4(abstractC43964JcD.A00, abstractC43964JcD));
            i++;
        } while (i < 23);
        this.A00 = AbstractC06930Yk.A08(A17);
    }
}
