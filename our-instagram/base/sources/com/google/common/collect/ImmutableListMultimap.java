package com.google.common.collect;

import X.AbstractC166987dD;
import X.AbstractC43592JPx;
import X.AbstractC58318PtA;
import X.AbstractC58319PtB;
import X.AbstractC62371S8v;
import X.AbstractC63247Sg2;
import X.AnonymousClass001;
import X.C00O;
import X.C46g;
import X.C4OI;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes10.dex */
public class ImmutableListMultimap extends ImmutableMultimap implements C4OI {
    public static final long serialVersionUID = 0;

    public static EmptyImmutableListMultimap A00() {
        return EmptyImmutableListMultimap.A00;
    }

    @Override // X.C46g
    /* renamed from: A08, reason: merged with bridge method [inline-methods] */
    public final ImmutableList AXV(Object key) {
        ImmutableList immutableList = (ImmutableList) ((ImmutableMultimap) this).A01.get(key);
        if (immutableList == null) {
            return ImmutableList.of();
        }
        return immutableList;
    }

    public static ImmutableListMultimap A01(C46g multimap) {
        if (multimap.isEmpty()) {
            return A00();
        }
        if (multimap instanceof ImmutableListMultimap) {
            ImmutableListMultimap immutableListMultimap = (ImmutableListMultimap) multimap;
            if (!((ImmutableMultimap) immutableListMultimap).A01.isPartialView()) {
                return immutableListMultimap;
            }
        }
        return A02(multimap.ACe().entrySet());
    }

    public static ImmutableListMultimap A02(Collection collection) {
        if (collection.isEmpty()) {
            return A00();
        }
        ImmutableMap.Builder builder = new ImmutableMap.Builder(collection.size());
        int i = 0;
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            Map.Entry A1K = AbstractC166987dD.A1K(it);
            Object key = A1K.getKey();
            ImmutableList copyOf = ImmutableList.copyOf(AbstractC58318PtA.A0y(A1K));
            if (!copyOf.isEmpty()) {
                builder.put(key, copyOf);
                i += copyOf.size();
            }
        }
        return new ImmutableListMultimap(builder.buildOrThrow(), i);
    }

    @Deprecated
    public static final void A03() {
        throw AbstractC43592JPx.A11();
    }

    private void readObject(ObjectInputStream stream) {
        stream.defaultReadObject();
        int readInt = stream.readInt();
        if (readInt >= 0) {
            ImmutableMap.Builder A0Z = AbstractC58319PtB.A0Z();
            int i = 0;
            for (int i2 = 0; i2 < readInt; i2++) {
                Object readObject = stream.readObject();
                readObject.getClass();
                int readInt2 = stream.readInt();
                if (readInt2 > 0) {
                    ImmutableList.Builder builder = ImmutableList.builder();
                    int i3 = 0;
                    do {
                        Object readObject2 = stream.readObject();
                        readObject2.getClass();
                        builder.add(readObject2);
                        i3++;
                    } while (i3 < readInt2);
                    A0Z.put(readObject, builder.build());
                    i += readInt2;
                } else {
                    throw new InvalidObjectException(AnonymousClass001.A0O("Invalid value count ", readInt2));
                }
            }
            try {
                AbstractC62371S8v.A00.A00(this, A0Z.buildOrThrow());
                try {
                    AbstractC62371S8v.A01.A00.set(this, Integer.valueOf(i));
                    return;
                } catch (IllegalAccessException e) {
                    throw AbstractC58318PtA.A0W(e);
                }
            } catch (IllegalArgumentException e2) {
                throw new InvalidObjectException(e2.getMessage()).initCause(e2);
            }
        }
        throw new InvalidObjectException(AnonymousClass001.A0O("Invalid key count ", readInt));
    }

    private void writeObject(ObjectOutputStream stream) {
        stream.defaultWriteObject();
        AbstractC63247Sg2.A02(this, stream);
    }

    @Override // X.C46g
    @Deprecated
    public final /* bridge */ /* synthetic */ Collection EEs(Object key) {
        A03();
        throw C00O.createAndThrow();
    }

    public ImmutableListMultimap(ImmutableMap map, int size) {
        super(map, size);
    }
}
