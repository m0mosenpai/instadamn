package X;

import com.instagram.common.util.concurrent.StuckAwareDispatcherManager$3;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: X.0o9, reason: invalid class name */
/* loaded from: classes.dex */
public final class C0o9 {
    public final long A00;
    public final C13920nI A01;
    public final List A02;
    public final AtomicInteger A03;
    public final C19L A04;
    public final C213512n A05;

    public /* synthetic */ C0o9(List list, List list2, C12T c12t, C12T c12t2, long j) {
        Object obj;
        C13920nI c13920nI = C13920nI.A00;
        C14360o3.A0B(c12t, 3);
        C14360o3.A0B(c12t2, 4);
        C14360o3.A0B(c13920nI, 6);
        this.A00 = j;
        this.A01 = c13920nI;
        this.A03 = new AtomicInteger();
        this.A05 = new C213512n(true);
        ArrayList arrayList = new ArrayList(AbstractC06950Ym.A1E(list, 10));
        int i = 0;
        for (Object obj2 : list) {
            int i2 = i + 1;
            if (i < 0) {
                AbstractC16960so.A1U();
                throw C00O.createAndThrow();
            }
            int intValue = ((Number) obj2).intValue();
            if (i < list2.size()) {
                obj = list2.get(i);
            } else {
                obj = -1;
            }
            int intValue2 = ((Number) obj).intValue();
            long j2 = this.A00;
            arrayList.add(new C0o8(this.A01, this.A03, c12t, c12t2, this.A05, intValue, intValue2, j2));
            i = i2;
        }
        this.A02 = arrayList;
        C19K A02 = AnonymousClass194.A02(c12t2);
        this.A04 = A02;
        C0LN c0ln = new C0LN(this, null);
        AnonymousClass191 anonymousClass191 = AnonymousClass191.A00;
        Integer num = C05F.A00;
        AbstractC23641Du.A03(num, anonymousClass191, c0ln, A02);
        if ((arrayList instanceof Collection) && arrayList.isEmpty()) {
            return;
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            if (((C0o8) it.next()).A00 >= 0) {
                AbstractC23641Du.A03(num, anonymousClass191, new StuckAwareDispatcherManager$3(this, null), this.A04);
                return;
            }
        }
    }
}
