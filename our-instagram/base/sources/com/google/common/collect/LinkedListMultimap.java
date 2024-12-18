package com.google.common.collect;

import X.AbstractC63071Sbt;
import X.AbstractC917849c;
import X.C4OI;
import X.C61569Rps;
import X.RQI;
import X.TTR;
import X.TZN;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* loaded from: classes2.dex */
public class LinkedListMultimap extends AbstractC917849c implements C4OI, Serializable {
    public static final long serialVersionUID = 0;
    public transient int A00;
    public transient int A01;
    public transient RQI A02;
    public transient RQI A03;
    public transient Map A04 = new CompactHashMap(12);

    @Override // X.C46g
    public final void clear() {
        this.A02 = null;
        this.A03 = null;
        this.A04.clear();
        this.A01 = 0;
        this.A00++;
    }

    /* JADX WARN: Type inference failed for: r1v4, types: [X.Rps, java.lang.Object] */
    public static RQI A00(RQI rqi, LinkedListMultimap linkedListMultimap, Object obj, Object obj2) {
        RQI rqi2 = new RQI(obj, obj2);
        if (linkedListMultimap.A02 == null) {
            linkedListMultimap.A03 = rqi2;
            linkedListMultimap.A02 = rqi2;
        } else {
            if (rqi == null) {
                RQI rqi3 = linkedListMultimap.A03;
                rqi3.getClass();
                rqi3.A00 = rqi2;
                rqi2.A02 = linkedListMultimap.A03;
                linkedListMultimap.A03 = rqi2;
                C61569Rps c61569Rps = (C61569Rps) linkedListMultimap.A04.get(obj);
                if (c61569Rps != null) {
                    c61569Rps.A00++;
                    RQI rqi4 = c61569Rps.A02;
                    rqi4.A01 = rqi2;
                    rqi2.A03 = rqi4;
                    c61569Rps.A02 = rqi2;
                }
            } else {
                C61569Rps c61569Rps2 = (C61569Rps) linkedListMultimap.A04.get(obj);
                c61569Rps2.getClass();
                c61569Rps2.A00++;
                rqi2.A02 = rqi.A02;
                rqi2.A03 = rqi.A03;
                rqi2.A00 = rqi;
                rqi2.A01 = rqi;
                RQI rqi5 = rqi.A03;
                if (rqi5 == null) {
                    c61569Rps2.A01 = rqi2;
                } else {
                    rqi5.A01 = rqi2;
                }
                RQI rqi6 = rqi.A02;
                if (rqi6 == null) {
                    linkedListMultimap.A02 = rqi2;
                } else {
                    rqi6.A00 = rqi2;
                }
                rqi.A02 = rqi2;
                rqi.A03 = rqi2;
            }
            linkedListMultimap.A01++;
            return rqi2;
        }
        Map map = linkedListMultimap.A04;
        ?? obj3 = new Object();
        obj3.A01 = rqi2;
        obj3.A02 = rqi2;
        rqi2.A03 = null;
        rqi2.A01 = null;
        obj3.A00 = 1;
        map.put(obj, obj3);
        linkedListMultimap.A00++;
        linkedListMultimap.A01++;
        return rqi2;
    }

    public static void A01(RQI rqi, LinkedListMultimap linkedListMultimap) {
        RQI rqi2 = rqi.A02;
        RQI rqi3 = rqi.A00;
        if (rqi2 != null) {
            rqi2.A00 = rqi3;
        } else {
            linkedListMultimap.A02 = rqi3;
        }
        RQI rqi4 = rqi.A00;
        if (rqi4 != null) {
            rqi4.A02 = rqi2;
        } else {
            linkedListMultimap.A03 = rqi2;
        }
        if (rqi.A03 == null && rqi.A01 == null) {
            C61569Rps c61569Rps = (C61569Rps) linkedListMultimap.A04.remove(rqi.A05);
            c61569Rps.getClass();
            c61569Rps.A00 = 0;
            linkedListMultimap.A00++;
        } else {
            C61569Rps c61569Rps2 = (C61569Rps) linkedListMultimap.A04.get(rqi.A05);
            c61569Rps2.getClass();
            c61569Rps2.A00--;
            RQI rqi5 = rqi.A03;
            RQI rqi6 = rqi.A01;
            if (rqi5 == null) {
                rqi6.getClass();
                c61569Rps2.A01 = rqi6;
            } else {
                rqi5.A01 = rqi6;
            }
            RQI rqi7 = rqi.A01;
            RQI rqi8 = rqi.A03;
            if (rqi7 == null) {
                rqi8.getClass();
                c61569Rps2.A02 = rqi8;
            } else {
                rqi7.A03 = rqi8;
            }
        }
        linkedListMultimap.A01--;
    }

    public static void A02(LinkedListMultimap linkedListMultimap, Object obj) {
        TTR ttr = new TTR(linkedListMultimap, obj);
        while (ttr.hasNext()) {
            ttr.next();
            ttr.remove();
        }
    }

    @Override // X.C46g
    public final /* bridge */ /* synthetic */ Collection AXV(final Object key) {
        return new TZN(this, key);
    }

    @Override // X.C46g
    public final /* bridge */ /* synthetic */ Collection EEs(Object key) {
        TTR ttr = new TTR(this, key);
        ArrayList arrayList = new ArrayList();
        AbstractC63071Sbt.A02(arrayList, ttr);
        List unmodifiableList = Collections.unmodifiableList(arrayList);
        A02(this, key);
        return unmodifiableList;
    }

    @Override // X.C46g
    public final boolean containsKey(Object key) {
        return this.A04.containsKey(key);
    }

    @Override // X.C46g
    public final int size() {
        return this.A01;
    }

    private void readObject(ObjectInputStream stream) {
        stream.defaultReadObject();
        this.A04 = new CompactLinkedHashMap();
        int readInt = stream.readInt();
        for (int i = 0; i < readInt; i++) {
            E6z(stream.readObject(), stream.readObject());
        }
    }

    private void writeObject(ObjectOutputStream stream) {
        stream.defaultWriteObject();
        stream.writeInt(this.A01);
        for (Map.Entry entry : (List) super.ASw()) {
            stream.writeObject(entry.getKey());
            stream.writeObject(entry.getValue());
        }
    }

    @Override // X.AbstractC917849c, X.C46g
    public final /* bridge */ /* synthetic */ Collection ASw() {
        return super.ASw();
    }
}
