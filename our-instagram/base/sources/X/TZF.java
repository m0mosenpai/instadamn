package X;

import java.util.AbstractMap;
import java.util.Collection;
import java.util.NavigableMap;
import java.util.SortedMap;

/* loaded from: classes10.dex */
public abstract class TZF<K, V> extends AbstractMap<K, V> {
    public transient Collection A00;
    public transient java.util.Set A01;
    public transient java.util.Set A02;

    @Override // java.util.AbstractMap, java.util.Map
    public final java.util.Set entrySet() {
        java.util.Set set = this.A01;
        if (set == null) {
            if (this instanceof RRx) {
                set = new RRn((RRx) this);
            } else if (this instanceof RRk) {
                RRw rRw = (RRw) this;
                set = AbstractC103614ld.A04(rRw.A00, rRw.A01.entrySet());
            } else if (this instanceof RRj) {
                set = new RQw((RRj) this);
            } else if (this instanceof RRv) {
                set = new C60766RRp((RRv) this);
            } else {
                set = new RRo((RRy) this);
            }
            this.A01 = set;
        }
        return set;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public java.util.Set keySet() {
        java.util.Set rsf;
        java.util.Set set = this.A02;
        if (set == null) {
            if (this instanceof RRk) {
                RRk rRk = (RRk) this;
                rsf = AbstractC103614ld.A04(rRk.A00, ((RRw) rRk).A01.keySet());
            } else if (this instanceof RRj) {
                rsf = new RRr((RRj) this);
            } else if (this instanceof RRv) {
                rsf = new RRq((RRv) this);
            } else if (this instanceof RQ5) {
                RQ5 rq5 = (RQ5) this;
                if (rq5 instanceof RQ9) {
                    RQ9 rq9 = (RQ9) rq5;
                    rsf = new RQ7(rq9.A00, (NavigableMap) ((SortedMap) rq9.A00));
                } else {
                    rsf = new RQ8(rq5.A01, (SortedMap) rq5.A00);
                }
                set = rsf;
                this.A02 = rsf;
            } else {
                rsf = new RSF(this);
            }
            set = rsf;
            this.A02 = rsf;
        }
        return set;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Collection values() {
        Collection collection = this.A00;
        if (collection == null) {
            if (this instanceof RRw) {
                RRw rRw = (RRw) this;
                collection = new RRu(rRw.A00, rRw, rRw.A01);
            } else if (this instanceof RRv) {
                collection = new RRt((RRv) this);
            } else {
                collection = new C64890TYq(this);
            }
            this.A00 = collection;
        }
        return collection;
    }
}
