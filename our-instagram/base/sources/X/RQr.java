package X;

import com.google.common.collect.BoundType;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.NavigableSet;

/* loaded from: classes10.dex */
public final class RQr extends AbstractC60758RQk implements InterfaceC65666Tqw {
    public transient Comparator A00;
    public transient NavigableSet A01;
    public transient java.util.Set A02;
    public final /* synthetic */ RQQ A03;

    public RQr(final RQQ this$0) {
        this.A03 = this$0;
    }

    @Override // X.AbstractC451425u
    public final /* bridge */ /* synthetic */ Object A00() {
        return this.A03;
    }

    @Override // X.AbstractC451325t
    public final /* bridge */ /* synthetic */ Collection A01() {
        return this.A03;
    }

    @Override // X.InterfaceC65666Tqw
    public final InterfaceC65666Tqw AOv() {
        return this.A03;
    }

    @Override // X.InterfaceC75173Zi
    /* renamed from: ARL, reason: merged with bridge method [inline-methods] */
    public final NavigableSet ARM() {
        NavigableSet navigableSet = this.A01;
        if (navigableSet == null) {
            RS4 rs4 = new RS4(this);
            this.A01 = rs4;
            return rs4;
        }
        return navigableSet;
    }

    @Override // X.InterfaceC65666Tqw
    public final AbstractC62759SPq AVu() {
        return this.A03.Cgb();
    }

    @Override // X.InterfaceC65666Tqw
    public final InterfaceC65666Tqw CMG(BoundType toElement, Object boundType) {
        return this.A03.Epq(toElement, boundType).AOv();
    }

    @Override // X.InterfaceC65666Tqw
    public final AbstractC62759SPq Cgb() {
        return this.A03.AVu();
    }

    @Override // X.InterfaceC65666Tqw
    public final AbstractC62759SPq E4a() {
        return this.A03.E4b();
    }

    @Override // X.InterfaceC65666Tqw
    public final AbstractC62759SPq E4b() {
        return this.A03.E4a();
    }

    @Override // X.InterfaceC65666Tqw
    public final InterfaceC65666Tqw Ep3(BoundType fromElement, BoundType fromBoundType, Object toElement, Object toBoundType) {
        return this.A03.Ep3(fromBoundType, fromElement, toBoundType, toElement).AOv();
    }

    @Override // X.InterfaceC65666Tqw
    public final InterfaceC65666Tqw Epq(BoundType fromElement, Object boundType) {
        return this.A03.CMG(fromElement, boundType).AOv();
    }

    @Override // X.InterfaceC65666Tqw, X.InterfaceC65681TrB
    public final Comparator comparator() {
        Comparator comparator = this.A00;
        if (comparator == null) {
            C4VF A01 = C4VF.A00(this.A03.comparator).A01();
            this.A00 = A01;
            return A01;
        }
        return comparator;
    }

    @Override // X.InterfaceC75173Zi
    public final java.util.Set entrySet() {
        java.util.Set set = this.A02;
        if (set == null) {
            RS6 rs6 = new RS6(this);
            this.A02 = rs6;
            return rs6;
        }
        return set;
    }

    @Override // X.AbstractC451325t, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        InterfaceC65666Tqw AOv = this.A03.AOv();
        return new C64759TSt(AOv, AOv.entrySet().iterator());
    }

    @Override // X.AbstractC451325t, java.util.Collection
    public final Object[] toArray(Object[] array) {
        return C1LH.A01(this, array);
    }

    @Override // X.AbstractC451425u
    public final String toString() {
        return entrySet().toString();
    }

    public RQr() {
    }

    @Override // X.AbstractC451325t, java.util.Collection
    public final Object[] toArray() {
        return toArray(new Object[size()]);
    }
}
