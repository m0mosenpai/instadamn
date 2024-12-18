package X;

import com.google.common.collect.ImmutableList;
import java.lang.ref.Reference;
import java.util.Collection;
import java.util.Deque;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;

/* renamed from: X.FaW, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C34946FaW {
    public final Deque A00 = new LinkedList();
    public final Map A01 = AbstractC166987dD.A1G();
    public final java.util.Set A02 = AbstractC166987dD.A1H();

    public static void A00(C34946FaW c34946FaW) {
        ImmutableList copyOf = ImmutableList.copyOf((Collection) c34946FaW.A00);
        Iterator it = c34946FaW.A02.iterator();
        while (it.hasNext()) {
            C34482FHu c34482FHu = (C34482FHu) ((Reference) it.next()).get();
            if (c34482FHu != null) {
                C14360o3.A0B(copyOf, 0);
                FQZ fqz = c34482FHu.A00;
                fqz.A08.A00(fqz.A06.A00(fqz.A04, copyOf));
                C35132FeZ.A01(fqz.A03);
            }
        }
    }
}
