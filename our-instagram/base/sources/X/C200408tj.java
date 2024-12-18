package X;

import java.util.AbstractQueue;
import java.util.Iterator;

/* renamed from: X.8tj, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C200408tj<K, V> extends AbstractQueue<InterfaceC200438tm<K, V>> {
    public final InterfaceC200438tm A00 = new C200418tk();

    @Override // java.util.AbstractQueue, java.util.AbstractCollection, java.util.Collection
    public final void clear() {
        InterfaceC200438tm interfaceC200438tm = this.A00;
        InterfaceC200438tm BWv = interfaceC200438tm.BWv();
        while (BWv != interfaceC200438tm) {
            InterfaceC200438tm BWv2 = BWv.BWv();
            EnumC201908wN enumC201908wN = EnumC201908wN.A01;
            BWv.EZf(enumC201908wN);
            BWv.EbV(enumC201908wN);
            BWv = BWv2;
        }
        interfaceC200438tm.EZf(interfaceC200438tm);
        interfaceC200438tm.EbV(interfaceC200438tm);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object o) {
        if (((InterfaceC200438tm) o).BWv() == EnumC201908wN.A01) {
            return false;
        }
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean isEmpty() {
        InterfaceC200438tm interfaceC200438tm = this.A00;
        if (interfaceC200438tm.BWv() != interfaceC200438tm) {
            return false;
        }
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        InterfaceC200438tm interfaceC200438tm = this.A00;
        InterfaceC200438tm BWv = interfaceC200438tm.BWv();
        if (BWv == interfaceC200438tm) {
            BWv = null;
        }
        return new C214289eS(this, BWv);
    }

    @Override // java.util.Queue
    public final /* bridge */ /* synthetic */ boolean offer(Object entry) {
        InterfaceC200438tm interfaceC200438tm = (InterfaceC200438tm) entry;
        InterfaceC200438tm Bg3 = interfaceC200438tm.Bg3();
        InterfaceC200438tm BWv = interfaceC200438tm.BWv();
        Bg3.EZf(BWv);
        BWv.EbV(Bg3);
        InterfaceC200438tm interfaceC200438tm2 = this.A00;
        InterfaceC200438tm Bg32 = interfaceC200438tm2.Bg3();
        Bg32.EZf(interfaceC200438tm);
        interfaceC200438tm.EbV(Bg32);
        interfaceC200438tm.EZf(interfaceC200438tm2);
        interfaceC200438tm2.EbV(interfaceC200438tm);
        return true;
    }

    @Override // java.util.Queue
    public final /* bridge */ /* synthetic */ Object peek() {
        InterfaceC200438tm interfaceC200438tm = this.A00;
        InterfaceC200438tm BWv = interfaceC200438tm.BWv();
        if (BWv == interfaceC200438tm) {
            return null;
        }
        return BWv;
    }

    @Override // java.util.Queue
    public final /* bridge */ /* synthetic */ Object poll() {
        InterfaceC200438tm interfaceC200438tm = this.A00;
        InterfaceC200438tm BWv = interfaceC200438tm.BWv();
        if (BWv == interfaceC200438tm) {
            return null;
        }
        remove(BWv);
        return BWv;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean remove(Object o) {
        InterfaceC200438tm interfaceC200438tm = (InterfaceC200438tm) o;
        InterfaceC200438tm Bg3 = interfaceC200438tm.Bg3();
        InterfaceC200438tm BWv = interfaceC200438tm.BWv();
        Bg3.EZf(BWv);
        BWv.EbV(Bg3);
        EnumC201908wN enumC201908wN = EnumC201908wN.A01;
        interfaceC200438tm.EZf(enumC201908wN);
        interfaceC200438tm.EbV(enumC201908wN);
        if (BWv == enumC201908wN) {
            return false;
        }
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final int size() {
        InterfaceC200438tm interfaceC200438tm = this.A00;
        int i = 0;
        for (InterfaceC200438tm BWv = interfaceC200438tm.BWv(); BWv != interfaceC200438tm; BWv = BWv.BWv()) {
            i++;
        }
        return i;
    }
}
