package X;

import java.util.ArrayList;
import java.util.List;

/* loaded from: classes4.dex */
public final class B8I extends C0YY implements InterfaceC16820sZ {
    public static final B8I A00 = new B8I();

    public B8I() {
        super(0);
    }

    @Override // X.InterfaceC16820sZ
    public final /* bridge */ /* synthetic */ Object invoke() {
        List list;
        list = ALx.A02;
        ArrayList A0q = AbstractC167017dG.A0q(list);
        int i = 0;
        for (Object obj : list) {
            int i2 = i + 1;
            if (i < 0) {
                AbstractC16960so.A1U();
                throw C00O.createAndThrow();
            }
            A0q.add(AbstractC167027dH.A0K((String) obj, i));
            i = i2;
        }
        return A0q.toArray(new C148336m3[0]);
    }
}
