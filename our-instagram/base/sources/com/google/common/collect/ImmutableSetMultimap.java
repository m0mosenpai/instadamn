package com.google.common.collect;

import X.AbstractC58317Pt9;
import X.AbstractC62371S8v;
import X.AbstractC63247Sg2;
import X.AnonymousClass001;
import X.C1LC;
import X.C1RF;
import X.C62648SKh;
import X.InterfaceC917949d;
import X.RRP;
import X.RSU;
import X.S7V;
import com.google.common.collect.ImmutableMap;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* loaded from: classes2.dex */
public class ImmutableSetMultimap extends ImmutableMultimap implements InterfaceC917949d {
    public static final long serialVersionUID = 0;
    public transient ImmutableSet A00;
    public final transient ImmutableSet A01;

    /* loaded from: classes10.dex */
    public final class EntrySet<K, V> extends ImmutableSet<Map.Entry<K, V>> {
        public final transient ImmutableSetMultimap A00;

        @Override // com.google.common.collect.ImmutableCollection
        public final boolean A0B() {
            return false;
        }

        @Override // com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection
        public final boolean contains(Object object) {
            if (object instanceof Map.Entry) {
                Map.Entry entry = (Map.Entry) object;
                return this.A00.AJj(entry.getKey(), entry.getValue());
            }
            return false;
        }

        @Override // com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
        public final C1LC iterator() {
            return new RSU(this.A00);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final int size() {
            return ((ImmutableMultimap) this.A00).A00;
        }

        public EntrySet(ImmutableSetMultimap multimap) {
            this.A00 = multimap;
        }

        @Override // com.google.common.collect.ImmutableSet, com.google.common.collect.ImmutableCollection
        public Object writeReplace() {
            return super.writeReplace();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public final /* bridge */ /* synthetic */ Iterator iterator() {
            return new RSU(this.A00);
        }
    }

    @Override // X.C46g
    /* renamed from: A08, reason: merged with bridge method [inline-methods] */
    public final ImmutableSet AXV(Object key) {
        Object obj = ((ImmutableMultimap) this).A01.get(key);
        ImmutableSet immutableSet = this.A01;
        if (obj == null) {
            if (immutableSet != null) {
                obj = immutableSet;
            } else {
                throw new NullPointerException(AbstractC58317Pt9.A00(465));
            }
        }
        return (ImmutableSet) obj;
    }

    @Override // com.google.common.collect.ImmutableMultimap, X.AbstractC917849c, X.C46g
    public final /* bridge */ /* synthetic */ Collection ASw() {
        ImmutableSet immutableSet = this.A00;
        if (immutableSet == null) {
            EntrySet entrySet = new EntrySet(this);
            this.A00 = entrySet;
            return entrySet;
        }
        return immutableSet;
    }

    @Override // X.InterfaceC917949d
    /* renamed from: ASx */
    public final /* bridge */ /* synthetic */ Set ASw() {
        ImmutableSet immutableSet = this.A00;
        if (immutableSet == null) {
            EntrySet entrySet = new EntrySet(this);
            this.A00 = entrySet;
            return entrySet;
        }
        return immutableSet;
    }

    @Override // X.C46g
    @Deprecated
    public final /* bridge */ /* synthetic */ Collection EEs(Object key) {
        throw new UnsupportedOperationException();
    }

    public ImmutableSetMultimap(ImmutableMap immutableMap, int i) {
        super(immutableMap, i);
        this.A01 = RegularImmutableSet.A03;
    }

    public static ImmutableSetMultimap A00(Collection collection) {
        if (collection.isEmpty()) {
            return EmptyImmutableSetMultimap.A00;
        }
        ImmutableMap.Builder builder = new ImmutableMap.Builder(collection.size());
        int i = 0;
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            Object key = entry.getKey();
            ImmutableSet A03 = ImmutableSet.A03((Collection) entry.getValue());
            if (!A03.isEmpty()) {
                builder.put(key, A03);
                i += A03.size();
            }
        }
        return new ImmutableSetMultimap(builder.buildOrThrow(), i);
    }

    private void readObject(ObjectInputStream stream) {
        Object A06;
        C1RF rrp;
        stream.defaultReadObject();
        Comparator comparator = (Comparator) stream.readObject();
        int readInt = stream.readInt();
        if (readInt >= 0) {
            ImmutableMap.Builder builder = new ImmutableMap.Builder(4);
            int i = 0;
            for (int i2 = 0; i2 < readInt; i2++) {
                Object readObject = stream.readObject();
                readObject.getClass();
                int readInt2 = stream.readInt();
                if (readInt2 > 0) {
                    if (comparator == null) {
                        rrp = new C1RF();
                    } else {
                        rrp = new RRP(comparator);
                    }
                    int i3 = 0;
                    do {
                        Object readObject2 = stream.readObject();
                        readObject2.getClass();
                        rrp.A04(readObject2);
                        i3++;
                    } while (i3 < readInt2);
                    ImmutableSet build = rrp.build();
                    if (build.size() == readInt2) {
                        builder.put(readObject, build);
                        i += readInt2;
                    } else {
                        StringBuilder sb = new StringBuilder();
                        sb.append("Duplicate key-value pairs exist for key ");
                        sb.append(readObject);
                        throw new InvalidObjectException(sb.toString());
                    }
                } else {
                    throw new InvalidObjectException(AnonymousClass001.A0O(AbstractC58317Pt9.A00(578), readInt2));
                }
            }
            try {
                AbstractC62371S8v.A00.A00(this, builder.buildOrThrow());
                try {
                    AbstractC62371S8v.A01.A00.set(this, Integer.valueOf(i));
                    C62648SKh c62648SKh = S7V.A00;
                    if (comparator == null) {
                        A06 = RegularImmutableSet.A03;
                    } else {
                        A06 = ImmutableSortedSet.A06(comparator);
                    }
                    c62648SKh.A00(this, A06);
                    return;
                } catch (IllegalAccessException e) {
                    throw new AssertionError(e);
                }
            } catch (IllegalArgumentException e2) {
                throw new InvalidObjectException(e2.getMessage()).initCause(e2);
            }
        }
        throw new InvalidObjectException(AnonymousClass001.A0O(AbstractC58317Pt9.A00(577), readInt));
    }

    private void writeObject(ObjectOutputStream stream) {
        Comparator comparator;
        stream.defaultWriteObject();
        ImmutableSet immutableSet = this.A01;
        if (immutableSet instanceof ImmutableSortedSet) {
            comparator = ((ImmutableSortedSet) immutableSet).comparator();
        } else {
            comparator = null;
        }
        stream.writeObject(comparator);
        AbstractC63247Sg2.A02(this, stream);
    }
}
