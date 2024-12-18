package X;

import java.util.ArrayList;
import java.util.List;

/* renamed from: X.8PC, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C8PC extends C0YY implements InterfaceC16660sJ {
    public static final C8PC A00 = new C8PC();

    public C8PC() {
        super(1);
    }

    @Override // X.InterfaceC16660sJ
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        List<AbstractC193598he> list = (List) obj;
        ArrayList arrayList = new ArrayList();
        if (list != null) {
            for (AbstractC193598he abstractC193598he : list) {
                int i = abstractC193598he.A00;
                if (i == 3 || i == 2) {
                    arrayList.add(abstractC193598he.A00());
                }
            }
        }
        return arrayList;
    }
}
