package X;

import com.google.common.collect.ImmutableCollection;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.ImmutableSortedSet;
import com.google.common.collect.RegularImmutableSortedSet;
import java.util.Comparator;

/* loaded from: classes10.dex */
public final class RRP extends C1RF {
    public final Comparator A00;

    public static RegularImmutableSortedSet A02(RRP rrp) {
        RegularImmutableSortedSet A07 = ImmutableSortedSet.A07(rrp.A00, rrp.A02, ((C1RG) rrp).A00);
        ((C1RG) rrp).A00 = A07.size();
        rrp.A01 = true;
        return A07;
    }

    public RRP(Comparator comparator) {
        comparator.getClass();
        this.A00 = comparator;
    }

    @Override // X.C1RF
    public final /* bridge */ /* synthetic */ C1RF A04(Object element) {
        super.A04(element);
        return this;
    }

    @Override // X.C1RF
    /* renamed from: A05 */
    public final /* bridge */ /* synthetic */ ImmutableSet build() {
        return A02(this);
    }

    public final void A08(Object... elements) {
        super.A07(elements);
    }

    @Override // X.C1RF, X.AbstractC24851Je
    public final /* bridge */ /* synthetic */ AbstractC24851Je add(Object element) {
        super.A04(element);
        return this;
    }

    @Override // X.C1RF, X.AbstractC24851Je
    public final /* bridge */ /* synthetic */ ImmutableCollection build() {
        return A02(this);
    }
}
