package X;

import com.google.common.collect.BoundType;
import com.google.common.collect.Multisets$ImmutableEntry;
import com.google.common.collect.NaturalOrdering;
import com.google.common.collect.TreeMultiset;
import java.util.Comparator;
import java.util.Iterator;
import java.util.NavigableSet;

/* loaded from: classes10.dex */
public abstract class RQQ<E> extends AbstractC75163Zh<E> implements InterfaceC65666Tqw<E> {
    public transient InterfaceC65666Tqw A00;
    public final Comparator comparator;

    @Override // X.InterfaceC65666Tqw
    public final AbstractC62759SPq Cgb() {
        C64764TSy c64764TSy = new C64764TSy((TreeMultiset) this, 2);
        if (c64764TSy.hasNext()) {
            return (AbstractC62759SPq) c64764TSy.next();
        }
        return null;
    }

    @Override // X.InterfaceC65666Tqw
    public final AbstractC62759SPq E4b() {
        C64764TSy c64764TSy = new C64764TSy((TreeMultiset) this, 2);
        if (c64764TSy.hasNext()) {
            AbstractC62759SPq abstractC62759SPq = (AbstractC62759SPq) c64764TSy.next();
            Multisets$ImmutableEntry multisets$ImmutableEntry = new Multisets$ImmutableEntry(abstractC62759SPq.A01(), abstractC62759SPq.A00());
            c64764TSy.remove();
            return multisets$ImmutableEntry;
        }
        return null;
    }

    @Override // X.AbstractC75163Zh
    public final /* bridge */ /* synthetic */ java.util.Set A02() {
        return new RS4(this);
    }

    @Override // X.InterfaceC65666Tqw
    public final InterfaceC65666Tqw AOv() {
        InterfaceC65666Tqw interfaceC65666Tqw = this.A00;
        if (interfaceC65666Tqw == null) {
            RQr rQr = new RQr(this);
            this.A00 = rQr;
            return rQr;
        }
        return interfaceC65666Tqw;
    }

    @Override // X.InterfaceC65666Tqw, X.InterfaceC65681TrB
    public final Comparator comparator() {
        return this.comparator;
    }

    public RQQ(Comparator comparator) {
        comparator.getClass();
        this.comparator = comparator;
    }

    @Override // X.AbstractC75163Zh, X.InterfaceC75173Zi
    /* renamed from: ARL */
    public final NavigableSet ARM() {
        return (NavigableSet) super.ARM();
    }

    @Override // X.InterfaceC65666Tqw
    public final AbstractC62759SPq AVu() {
        Iterator A06 = A06();
        if (A06.hasNext()) {
            return (AbstractC62759SPq) A06.next();
        }
        return null;
    }

    @Override // X.InterfaceC65666Tqw
    public final AbstractC62759SPq E4a() {
        Iterator A06 = A06();
        if (A06.hasNext()) {
            AbstractC62759SPq abstractC62759SPq = (AbstractC62759SPq) A06.next();
            Multisets$ImmutableEntry multisets$ImmutableEntry = new Multisets$ImmutableEntry(abstractC62759SPq.A01(), abstractC62759SPq.A00());
            A06.remove();
            return multisets$ImmutableEntry;
        }
        return null;
    }

    @Override // X.InterfaceC65666Tqw
    public final InterfaceC65666Tqw Ep3(BoundType fromElement, BoundType fromBoundType, Object toElement, Object toBoundType) {
        fromElement.getClass();
        fromBoundType.getClass();
        return Epq(fromElement, toElement).CMG(fromBoundType, toBoundType);
    }

    public RQQ() {
        this(NaturalOrdering.A00);
    }
}
