package X;

import com.google.common.collect.MapMakerInternalMap;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.concurrent.atomic.AtomicReferenceArray;

/* renamed from: X.5Nc, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC116005Nc implements Iterator {
    public int A00;
    public int A01 = -1;
    public C18P A02;
    public MapMakerInternalMap.Segment A03;
    public C116015Nd A04;
    public C116015Nd A05;
    public AtomicReferenceArray A06;
    public final /* synthetic */ MapMakerInternalMap A07;

    /* JADX WARN: Code restructure failed: missing block: B:31:0x003a, code lost:
    
        continue;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A00() {
        /*
            r3 = this;
            r0 = 0
            r3.A05 = r0
            X.18P r0 = r3.A02
            if (r0 == 0) goto L3a
        L7:
            X.18P r0 = r0.BWo()
            r3.A02 = r0
            if (r0 == 0) goto L3a
            boolean r0 = r3.A01(r0)
            if (r0 != 0) goto L69
            X.18P r0 = r3.A02
            goto L7
        L18:
            int r2 = r3.A00
            if (r2 < 0) goto L69
            com.google.common.collect.MapMakerInternalMap r0 = r3.A07
            com.google.common.collect.MapMakerInternalMap$Segment[] r1 = r0.A06
            int r0 = r2 + (-1)
            r3.A00 = r0
            r0 = r1[r2]
            r3.A03 = r0
            int r0 = r0.count
            if (r0 == 0) goto L18
            com.google.common.collect.MapMakerInternalMap$Segment r0 = r3.A03
            java.util.concurrent.atomic.AtomicReferenceArray r0 = r0.table
            r3.A06 = r0
            int r0 = r0.length()
            int r0 = r0 + (-1)
            r3.A01 = r0
        L3a:
            int r2 = r3.A01
            if (r2 < 0) goto L18
            java.util.concurrent.atomic.AtomicReferenceArray r1 = r3.A06
            int r0 = r2 + (-1)
            r3.A01 = r0
            java.lang.Object r0 = r1.get(r2)
            X.18P r0 = (X.C18P) r0
            r3.A02 = r0
            if (r0 == 0) goto L3a
            boolean r0 = r3.A01(r0)
            if (r0 != 0) goto L69
            X.18P r0 = r3.A02
            if (r0 == 0) goto L3a
        L58:
            X.18P r0 = r0.BWo()
            r3.A02 = r0
            if (r0 == 0) goto L3a
            boolean r0 = r3.A01(r0)
            if (r0 != 0) goto L69
            X.18P r0 = r3.A02
            goto L58
        L69:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC116005Nc.A00():void");
    }

    public AbstractC116005Nc(final MapMakerInternalMap this$0) {
        this.A07 = this$0;
        this.A00 = this$0.A06.length - 1;
        A00();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.A05 == null) {
            return false;
        }
        return true;
    }

    @Override // java.util.Iterator
    public Object next() {
        boolean z = this instanceof C129075sS;
        C116015Nd c116015Nd = this.A05;
        if (z) {
            if (c116015Nd != null) {
                this.A04 = c116015Nd;
                A00();
                return getValue();
            }
            throw new NoSuchElementException();
        }
        if (c116015Nd != null) {
            this.A04 = c116015Nd;
            A00();
            return this.A04;
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.Iterator
    public final void remove() {
        boolean z = false;
        if (this.A04 != null) {
            z = true;
        }
        C18C.A0H(z, AbstractC58317Pt9.A00(316));
        this.A07.remove(getKey());
        this.A04 = null;
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [X.5Nd] */
    public final boolean A01(C18P entry) {
        boolean z;
        final Object value;
        try {
            final Object key = entry.getKey();
            final MapMakerInternalMap mapMakerInternalMap = this.A07;
            if (entry.getKey() != null && (value = entry.getValue()) != null) {
                this.A05 = new AbstractC918149h(key, value) { // from class: X.5Nd
                    public Object A00;
                    public final Object A01;

                    {
                        this.A01 = key;
                        this.A00 = value;
                    }

                    @Override // X.AbstractC918149h, java.util.Map.Entry
                    public final boolean equals(Object object) {
                        if (!(object instanceof Map.Entry)) {
                            return false;
                        }
                        Map.Entry entry2 = (Map.Entry) object;
                        if (!this.A01.equals(entry2.getKey()) || !this.A00.equals(entry2.getValue())) {
                            return false;
                        }
                        return true;
                    }

                    @Override // X.AbstractC918149h, java.util.Map.Entry
                    public final Object getKey() {
                        return this.A01;
                    }

                    @Override // X.AbstractC918149h, java.util.Map.Entry
                    public final Object getValue() {
                        return this.A00;
                    }

                    @Override // X.AbstractC918149h, java.util.Map.Entry
                    public final int hashCode() {
                        return this.A01.hashCode() ^ this.A00.hashCode();
                    }

                    @Override // X.AbstractC918149h, java.util.Map.Entry
                    public final Object setValue(Object newValue) {
                        V put = MapMakerInternalMap.this.put(this.A01, newValue);
                        this.A00 = newValue;
                        return put;
                    }
                };
                z = true;
            } else {
                z = false;
            }
            return z;
        } finally {
            this.A03.A05();
        }
    }
}
