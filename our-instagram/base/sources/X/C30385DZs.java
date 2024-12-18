package X;

import java.util.ArrayList;
import java.util.List;

/* renamed from: X.DZs, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C30385DZs extends C0YY implements InterfaceC16620sF {
    public static final C30385DZs A00 = new C30385DZs();

    public C30385DZs() {
        super(2);
    }

    @Override // X.InterfaceC16620sF
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        C6MR c6mr = (C6MR) obj;
        List list = (List) obj2;
        AbstractC167017dG.A1N(c6mr, list);
        ArrayList A0q = AbstractC25230BEn.A0q(list);
        int size = list.size();
        for (int i = 0; i < size; i++) {
            A0q.add(AbstractC28160Cb7.A00(AbstractC28160Cb7.A01, c6mr, list.get(i)));
        }
        return A0q;
    }
}
