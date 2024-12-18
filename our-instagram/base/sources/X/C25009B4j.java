package X;

import java.util.AbstractQueue;
import java.util.Iterator;

/* renamed from: X.B4j, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C25009B4j<K, V> extends AbstractQueue<InterfaceC200438tm<K, V>> {
    public final InterfaceC200438tm A00 = new C214179eH();

    @Override // java.util.AbstractQueue, java.util.AbstractCollection, java.util.Collection
    public final void clear() {
        InterfaceC200438tm interfaceC200438tm = this.A00;
        InterfaceC200438tm BWu = interfaceC200438tm.BWu();
        while (BWu != interfaceC200438tm) {
            InterfaceC200438tm BWu2 = BWu.BWu();
            EnumC201908wN enumC201908wN = EnumC201908wN.A01;
            BWu.EZe(enumC201908wN);
            BWu.EbU(enumC201908wN);
            BWu = BWu2;
        }
        interfaceC200438tm.EZe(interfaceC200438tm);
        interfaceC200438tm.EbU(interfaceC200438tm);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object o) {
        if (((InterfaceC200438tm) o).BWu() == EnumC201908wN.A01) {
            return false;
        }
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean isEmpty() {
        InterfaceC200438tm interfaceC200438tm = this.A00;
        return AbstractC167007dF.A1X(interfaceC200438tm.BWu(), interfaceC200438tm);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        InterfaceC200438tm interfaceC200438tm = this.A00;
        InterfaceC200438tm BWu = interfaceC200438tm.BWu();
        if (BWu == interfaceC200438tm) {
            BWu = null;
        }
        return new C214279eR(this, BWu);
    }

    @Override // java.util.Queue
    public final /* bridge */ /* synthetic */ boolean offer(Object entry) {
        InterfaceC200438tm interfaceC200438tm = (InterfaceC200438tm) entry;
        InterfaceC200438tm Bg2 = interfaceC200438tm.Bg2();
        InterfaceC200438tm BWu = interfaceC200438tm.BWu();
        Bg2.EZe(BWu);
        BWu.EbU(Bg2);
        InterfaceC200438tm interfaceC200438tm2 = this.A00;
        InterfaceC200438tm Bg22 = interfaceC200438tm2.Bg2();
        Bg22.EZe(interfaceC200438tm);
        interfaceC200438tm.EbU(Bg22);
        interfaceC200438tm.EZe(interfaceC200438tm2);
        interfaceC200438tm2.EbU(interfaceC200438tm);
        return true;
    }

    @Override // java.util.Queue
    public final /* bridge */ /* synthetic */ Object peek() {
        InterfaceC200438tm interfaceC200438tm = this.A00;
        InterfaceC200438tm BWu = interfaceC200438tm.BWu();
        if (BWu == interfaceC200438tm) {
            return null;
        }
        return BWu;
    }

    @Override // java.util.Queue
    public final /* bridge */ /* synthetic */ Object poll() {
        InterfaceC200438tm interfaceC200438tm = this.A00;
        InterfaceC200438tm BWu = interfaceC200438tm.BWu();
        if (BWu == interfaceC200438tm) {
            return null;
        }
        remove(BWu);
        return BWu;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean remove(Object o) {
        InterfaceC200438tm interfaceC200438tm = (InterfaceC200438tm) o;
        InterfaceC200438tm Bg2 = interfaceC200438tm.Bg2();
        InterfaceC200438tm BWu = interfaceC200438tm.BWu();
        Bg2.EZe(BWu);
        BWu.EbU(Bg2);
        EnumC201908wN enumC201908wN = EnumC201908wN.A01;
        interfaceC200438tm.EZe(enumC201908wN);
        interfaceC200438tm.EbU(enumC201908wN);
        if (BWu == enumC201908wN) {
            return false;
        }
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final int size() {
        InterfaceC200438tm interfaceC200438tm = this.A00;
        int i = 0;
        for (InterfaceC200438tm BWu = interfaceC200438tm.BWu(); BWu != interfaceC200438tm; BWu = BWu.BWu()) {
            i++;
        }
        return i;
    }
}
