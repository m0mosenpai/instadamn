package X;

import com.google.common.collect.ImmutableList;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/* renamed from: X.WPv, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C70290WPv implements C1N8 {
    public static final C70290WPv A00 = new C70290WPv();

    @Override // X.C1N8
    public final /* bridge */ /* synthetic */ Object apply(Object obj) {
        C2JS A03;
        ImmutableList A06;
        C2JS A01;
        C2JS A02 = ((C2JS) obj).A02(C66685UXv.class, "pay_financial_entity_wrapper(id:$id)", 1158022666);
        if (A02 == null || (A03 = A02.A03(C66684UXu.class, "payout_records(after:$after,batch_item_id:$batch_item_id,first:$first)", 1636922197)) == null || (A06 = A03.A06(C66683UXt.class, "edges", 1387448488)) == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        Iterator<E> it = A06.iterator();
        while (it.hasNext()) {
            C2JS A032 = ((C2JS) it.next()).A03(C66682UXs.class, "node", 70020053);
            if (A032 != null && (A01 = A032.A01(UZP.class, -173343578)) != null) {
                arrayList.add(A01);
            }
        }
        return ImmutableList.copyOf((Collection) arrayList);
    }
}
