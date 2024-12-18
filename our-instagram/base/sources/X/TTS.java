package X;

import java.util.ListIterator;

/* loaded from: classes10.dex */
public abstract class TTS implements ListIterator, InterfaceC15590qF {
    public int A00;
    public int A01;

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        if (this instanceof Q5o) {
            Q5o q5o = (Q5o) this;
            Q5o.A00(q5o);
            C64937TaD c64937TaD = q5o.A03;
            c64937TaD.add(((TTS) q5o).A00, obj);
            ((TTS) q5o).A00++;
            ((TTS) q5o).A01 = c64937TaD.size();
            q5o.A00 = c64937TaD.A0O();
            q5o.A01 = -1;
            Q5o.A01(q5o);
            return;
        }
        throw AbstractC58321PtD.A10();
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final boolean hasNext() {
        return AbstractC167007dF.A1Q(this.A00, this.A01);
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return AbstractC167007dF.A1O(this.A00);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.ListIterator, java.util.Iterator
    public final Object next() {
        Q5n q5n;
        Object[] objArr;
        int i;
        Q5m q5m;
        if (this instanceof Q5n) {
            Q5n q5n2 = (Q5n) this;
            if (q5n2.hasNext()) {
                int i2 = ((TTS) q5n2).A00 & 31;
                Object obj = q5n2.A02[q5n2.A00 - 1];
                C14360o3.A0C(obj, "null cannot be cast to non-null type kotlin.Array<E of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableList.TrieIterator>");
                Object obj2 = ((Object[]) obj)[i2];
                int i3 = ((TTS) q5n2).A00 + 1;
                ((TTS) q5n2).A00 = i3;
                if (i3 == ((TTS) q5n2).A01) {
                    q5n2.A01 = true;
                } else {
                    int i4 = 0;
                    while (((i3 >> i4) & 31) == 0) {
                        i4 += 5;
                    }
                    if (i4 > 0) {
                        Q5n.A00(q5n2, i3, ((q5n2.A00 - 1) - (i4 / 5)) + 1);
                        return obj2;
                    }
                }
                return obj2;
            }
            throw AbstractC58318PtA.A13();
        }
        if (this instanceof Q5l) {
            Q5l q5l = (Q5l) this;
            if (q5l.hasNext()) {
                ((TTS) q5l).A00++;
                return q5l.A00;
            }
            throw AbstractC58318PtA.A13();
        }
        if (this instanceof Q5o) {
            Q5o q5o = (Q5o) this;
            Q5o.A00(q5o);
            if (q5o.hasNext()) {
                i = ((TTS) q5o).A00;
                q5o.A01 = i;
                q5n = q5o.A02;
                if (q5n == null) {
                    Object[] objArr2 = q5o.A03.A04;
                    ((TTS) q5o).A00 = i + 1;
                    return objArr2[i];
                }
                if (q5n.hasNext()) {
                    ((TTS) q5o).A00 = i + 1;
                    return q5n.next();
                }
                objArr = q5o.A03.A04;
                q5m = q5o;
            } else {
                throw AbstractC58318PtA.A13();
            }
        } else if (this instanceof Q5m) {
            Q5m q5m2 = (Q5m) this;
            if (q5m2.hasNext()) {
                q5n = q5m2.A00;
                if (q5n.hasNext()) {
                    ((TTS) q5m2).A00++;
                    return q5n.next();
                }
                objArr = q5m2.A01;
                i = ((TTS) q5m2).A00;
                q5m = q5m2;
            } else {
                throw AbstractC58318PtA.A13();
            }
        } else {
            Q5k q5k = (Q5k) this;
            if (q5k.hasNext()) {
                Object[] objArr3 = q5k.A00;
                int i5 = ((TTS) q5k).A00;
                ((TTS) q5k).A00 = i5 + 1;
                return objArr3[i5];
            }
            throw AbstractC58318PtA.A13();
        }
        ((TTS) q5m).A00 = i + 1;
        return objArr[i - ((TTS) q5n).A01];
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.A00;
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.A00 - 1;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final void remove() {
        if (this instanceof Q5o) {
            Q5o q5o = (Q5o) this;
            Q5o.A00(q5o);
            int i = q5o.A01;
            if (i != -1) {
                C64937TaD c64937TaD = q5o.A03;
                c64937TaD.remove(i);
                int i2 = q5o.A01;
                if (i2 < ((TTS) q5o).A00) {
                    ((TTS) q5o).A00 = i2;
                }
                ((TTS) q5o).A01 = c64937TaD.size();
                q5o.A00 = c64937TaD.A0O();
                q5o.A01 = -1;
                Q5o.A01(q5o);
                return;
            }
            throw AbstractC58318PtA.A0Z();
        }
        throw AbstractC58321PtD.A10();
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        if (this instanceof Q5o) {
            Q5o q5o = (Q5o) this;
            Q5o.A00(q5o);
            int i = q5o.A01;
            if (i != -1) {
                C64937TaD c64937TaD = q5o.A03;
                c64937TaD.set(i, obj);
                q5o.A00 = c64937TaD.A0O();
                Q5o.A01(q5o);
                return;
            }
            throw AbstractC58318PtA.A0Z();
        }
        throw AbstractC58321PtD.A10();
    }
}
