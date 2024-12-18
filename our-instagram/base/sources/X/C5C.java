package X;

import java.util.ArrayList;
import java.util.List;

/* loaded from: classes5.dex */
public final class C5C extends C5E {
    @Override // X.C5E
    public final List A0I() {
        ArrayList A0U = AbstractC001800i.A0U(super.A0I());
        int i = 2;
        if (AbstractC28342CeU.A02(this.A0H)) {
            i = 3;
        }
        int A0H = A0H() * i;
        int size = A0U.size() % A0H;
        if (size != 0) {
            A0U = AbstractC166987dD.A1F(A0U);
            int i2 = A0H - size;
            for (int i3 = 0; i3 < i2; i3++) {
                A0U.add(new C5B(AnonymousClass001.A0O("placeholder_", i3)));
            }
        }
        return A0U;
    }
}
