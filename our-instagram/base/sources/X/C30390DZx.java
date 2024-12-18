package X;

import java.util.ArrayList;
import java.util.List;

/* renamed from: X.DZx, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C30390DZx extends C0YY implements InterfaceC16620sF {
    public static final C30390DZx A00 = new C30390DZx();

    public C30390DZx() {
        super(2);
    }

    @Override // X.InterfaceC16620sF
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        C6MR c6mr = (C6MR) obj;
        C114095Cv c114095Cv = (C114095Cv) obj2;
        AbstractC167017dG.A1N(c6mr, c114095Cv);
        List list = c114095Cv.A01;
        ArrayList A0q = AbstractC25230BEn.A0q(list);
        int size = list.size();
        for (int i = 0; i < size; i++) {
            A0q.add(AbstractC28160Cb7.A00(AbstractC28160Cb7.A05, c6mr, list.get(i)));
        }
        return A0q;
    }
}
