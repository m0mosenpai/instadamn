package com.google.common.collect;

import X.AbstractC24841Jd;
import X.AbstractC38301qK;
import X.AbstractC58318PtA;
import X.AbstractC63247Sg2;
import X.C18C;
import X.C62648SKh;
import X.C62649SKi;
import X.C63393SjH;
import X.C64759TSt;
import X.C64764TSy;
import X.InterfaceC65666Tqw;
import X.RQQ;
import X.RSL;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Comparator;
import java.util.Iterator;

/* loaded from: classes10.dex */
public final class TreeMultiset<E> extends RQQ<E> implements Serializable {
    public static final long serialVersionUID = 1;
    public final transient GeneralRange A00;
    public final transient C63393SjH A01;
    public final transient C62649SKi A02;

    /* JADX WARN: $VALUES field not found */
    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* loaded from: classes10.dex */
    public abstract class Aggregate {
        public static final Aggregate A01 = new Aggregate() { // from class: com.google.common.collect.TreeMultiset.Aggregate.1
        };
        public static final Aggregate A00 = new Aggregate() { // from class: com.google.common.collect.TreeMultiset.Aggregate.2
        };

        public final long A00(C63393SjH root) {
            if (this instanceof AnonymousClass2) {
                if (root != null) {
                    return root.A00;
                }
                return 0L;
            }
            if (root != null) {
                return root.A03;
            }
            return 0L;
        }

        public Aggregate(String $enum$name, int $enum$ordinal) {
        }
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [X.SKi, java.lang.Object] */
    public TreeMultiset(Comparator comparator) {
        super(comparator);
        BoundType boundType = BoundType.OPEN;
        this.A00 = new GeneralRange(boundType, boundType, null, null, comparator, false, false);
        C63393SjH c63393SjH = new C63393SjH();
        this.A01 = c63393SjH;
        c63393SjH.A07 = c63393SjH;
        c63393SjH.A05 = c63393SjH;
        this.A02 = new Object();
    }

    @Override // X.AbstractC75163Zh
    public final Iterator A05() {
        return new RSL(new C64764TSy(this, 1), 2);
    }

    @Override // X.AbstractC75163Zh
    public final Iterator A06() {
        return new C64764TSy(this, 1);
    }

    @Override // X.InterfaceC75173Zi
    public final int AL0(Object element) {
        try {
            C63393SjH c63393SjH = (C63393SjH) this.A02.A00;
            if (this.A00.A01(element) && c63393SjH != null) {
                return c63393SjH.A08(element, this.comparator);
            }
        } catch (ClassCastException | NullPointerException unused) {
        }
        return 0;
    }

    private long A00(Aggregate aggr, C63393SjH node) {
        int i;
        long j;
        long A00;
        int i2;
        if (node == null) {
            return 0L;
        }
        Comparator comparator = this.comparator;
        GeneralRange generalRange = this.A00;
        int compare = comparator.compare(generalRange.upperEndpoint, node.A08);
        if (compare > 0) {
            return A00(aggr, node.A06);
        }
        if (compare == 0) {
            int ordinal = generalRange.upperBoundType.ordinal();
            if (ordinal != 0) {
                if (ordinal == 1) {
                    return aggr.A00(node.A06);
                }
                throw AbstractC58318PtA.A0V();
            }
            if (aggr instanceof Aggregate.AnonymousClass2) {
                i2 = 1;
            } else {
                i2 = node.A01;
            }
            j = i2;
            A00 = aggr.A00(node.A06);
        } else {
            long A002 = aggr.A00(node.A06);
            if (aggr instanceof Aggregate.AnonymousClass2) {
                i = 1;
            } else {
                i = node.A01;
            }
            j = A002 + i;
            A00 = A00(aggr, node.A04);
        }
        return j + A00;
    }

    private long A01(Aggregate aggr, C63393SjH node) {
        int i;
        long j;
        long A01;
        int i2;
        if (node == null) {
            return 0L;
        }
        Comparator comparator = this.comparator;
        GeneralRange generalRange = this.A00;
        int compare = comparator.compare(generalRange.lowerEndpoint, node.A08);
        if (compare < 0) {
            return A01(aggr, node.A04);
        }
        if (compare == 0) {
            int ordinal = generalRange.lowerBoundType.ordinal();
            if (ordinal != 0) {
                if (ordinal == 1) {
                    return aggr.A00(node.A04);
                }
                throw AbstractC58318PtA.A0V();
            }
            if (aggr instanceof Aggregate.AnonymousClass2) {
                i2 = 1;
            } else {
                i2 = node.A01;
            }
            j = i2;
            A01 = aggr.A00(node.A04);
        } else {
            long A00 = aggr.A00(node.A04);
            if (aggr instanceof Aggregate.AnonymousClass2) {
                i = 1;
            } else {
                i = node.A01;
            }
            j = A00 + i;
            A01 = A01(aggr, node.A06);
        }
        return j + A01;
    }

    private void readObject(ObjectInputStream stream) {
        stream.defaultReadObject();
        Object readObject = stream.readObject();
        readObject.getClass();
        Comparator comparator = (Comparator) readObject;
        AbstractC63247Sg2.A00(RQQ.class, "comparator").A00(this, comparator);
        C62648SKh A00 = AbstractC63247Sg2.A00(TreeMultiset.class, "range");
        BoundType boundType = BoundType.OPEN;
        A00.A00(this, new GeneralRange(boundType, boundType, null, null, comparator, false, false));
        AbstractC63247Sg2.A00(TreeMultiset.class, "rootReference").A00(this, new Object());
        C63393SjH c63393SjH = new C63393SjH();
        AbstractC63247Sg2.A00(TreeMultiset.class, "header").A00(this, c63393SjH);
        c63393SjH.A07 = c63393SjH;
        c63393SjH.A05 = c63393SjH;
        int readInt = stream.readInt();
        for (int i = 0; i < readInt; i++) {
            A04(stream.readObject(), stream.readInt());
        }
    }

    @Override // X.AbstractC75163Zh
    public final int A03() {
        Aggregate aggregate = Aggregate.A00;
        C63393SjH c63393SjH = (C63393SjH) this.A02.A00;
        long A00 = aggregate.A00(c63393SjH);
        GeneralRange generalRange = this.A00;
        if (generalRange.hasLowerBound) {
            A00 -= A01(aggregate, c63393SjH);
        }
        if (generalRange.hasUpperBound) {
            A00 -= A00(aggregate, c63393SjH);
        }
        return AbstractC38301qK.A02(A00);
    }

    @Override // X.AbstractC75163Zh
    public final int A04(Object element, int occurrences) {
        AbstractC24841Jd.A00(occurrences, "occurrences");
        if (occurrences == 0) {
            return AL0(element);
        }
        C18C.A0E(this.A00.A01(element));
        C62649SKi c62649SKi = this.A02;
        C63393SjH c63393SjH = (C63393SjH) c62649SKi.A00;
        if (c63393SjH == null) {
            this.comparator.compare(element, element);
            C63393SjH c63393SjH2 = new C63393SjH(element, occurrences);
            C63393SjH c63393SjH3 = this.A01;
            c63393SjH3.A07 = c63393SjH2;
            c63393SjH2.A05 = c63393SjH3;
            c63393SjH2.A07 = c63393SjH3;
            c63393SjH3.A05 = c63393SjH2;
            c62649SKi.A00(c63393SjH, c63393SjH2);
            return 0;
        }
        int[] iArr = new int[1];
        c62649SKi.A00(c63393SjH, c63393SjH.A0A(element, this.comparator, iArr, occurrences));
        return iArr[0];
    }

    @Override // X.InterfaceC65666Tqw
    public final InterfaceC65666Tqw CMG(BoundType upperBound, Object boundType) {
        return new TreeMultiset(this.A00.A00(new GeneralRange(BoundType.OPEN, upperBound, null, boundType, this.comparator, false, true)), this.A01, this.A02);
    }

    @Override // X.AbstractC75163Zh, X.InterfaceC75173Zi
    public final int EEe(Object element, int occurrences) {
        AbstractC24841Jd.A00(occurrences, "occurrences");
        C62649SKi c62649SKi = this.A02;
        C63393SjH c63393SjH = (C63393SjH) c62649SKi.A00;
        int[] iArr = new int[1];
        try {
            if (this.A00.A01(element) && c63393SjH != null) {
                c62649SKi.A00(c63393SjH, c63393SjH.A0B(element, this.comparator, iArr, occurrences));
                return iArr[0];
            }
        } catch (ClassCastException | NullPointerException unused) {
        }
        return 0;
    }

    @Override // X.InterfaceC75173Zi
    public final boolean ESE(Object element, int oldCount, int newCount) {
        AbstractC24841Jd.A00(oldCount, "oldCount");
        C18C.A0E(this.A00.A01(element));
        C62649SKi c62649SKi = this.A02;
        C63393SjH c63393SjH = (C63393SjH) c62649SKi.A00;
        if (c63393SjH == null) {
            return false;
        }
        int[] iArr = new int[1];
        c62649SKi.A00(c63393SjH, c63393SjH.A0C(element, this.comparator, iArr, oldCount));
        if (iArr[0] != oldCount) {
            return false;
        }
        return true;
    }

    @Override // X.InterfaceC65666Tqw
    public final InterfaceC65666Tqw Epq(BoundType lowerBound, Object boundType) {
        return new TreeMultiset(this.A00.A00(new GeneralRange(lowerBound, BoundType.OPEN, boundType, null, this.comparator, true, false)), this.A01, this.A02);
    }

    @Override // X.AbstractC75163Zh, java.util.AbstractCollection, java.util.Collection
    public final void clear() {
        GeneralRange generalRange = this.A00;
        if (!generalRange.hasLowerBound && !generalRange.hasUpperBound) {
            C63393SjH c63393SjH = this.A01;
            C63393SjH c63393SjH2 = c63393SjH.A07;
            c63393SjH2.getClass();
            while (true) {
                C63393SjH c63393SjH3 = c63393SjH2;
                if (c63393SjH2 != c63393SjH) {
                    c63393SjH2 = c63393SjH2.A07;
                    c63393SjH2.getClass();
                    c63393SjH3.A01 = 0;
                    c63393SjH3.A04 = null;
                    c63393SjH3.A06 = null;
                    c63393SjH3.A05 = null;
                    c63393SjH3.A07 = null;
                } else {
                    c63393SjH.A07 = c63393SjH;
                    c63393SjH.A05 = c63393SjH;
                    this.A02.A00 = null;
                    return;
                }
            }
        } else {
            C64764TSy c64764TSy = new C64764TSy(this, 1);
            while (c64764TSy.hasNext()) {
                c64764TSy.next();
                c64764TSy.remove();
            }
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, X.InterfaceC75173Zi
    public final int size() {
        Aggregate aggregate = Aggregate.A01;
        C63393SjH c63393SjH = (C63393SjH) this.A02.A00;
        long A00 = aggregate.A00(c63393SjH);
        GeneralRange generalRange = this.A00;
        if (generalRange.hasLowerBound) {
            A00 -= A01(aggregate, c63393SjH);
        }
        if (generalRange.hasUpperBound) {
            A00 -= A00(aggregate, c63393SjH);
        }
        return AbstractC38301qK.A02(A00);
    }

    private void writeObject(ObjectOutputStream stream) {
        stream.defaultWriteObject();
        stream.writeObject(ARM().comparator());
        AbstractC63247Sg2.A03(this, stream);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return new C64759TSt(this, entrySet().iterator());
    }

    public TreeMultiset(GeneralRange rootReference, C63393SjH range, C62649SKi endLink) {
        super(rootReference.comparator);
        this.A02 = endLink;
        this.A00 = rootReference;
        this.A01 = range;
    }
}
