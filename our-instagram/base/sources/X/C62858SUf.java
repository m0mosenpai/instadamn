package X;

import java.util.AbstractList;
import java.util.AbstractMap;
import java.util.AbstractSet;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Deque;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.NavigableMap;
import java.util.NavigableSet;
import java.util.Queue;
import java.util.SortedMap;
import java.util.SortedSet;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.ConcurrentNavigableMap;
import java.util.concurrent.ConcurrentSkipListMap;

/* renamed from: X.SUf, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C62858SUf {
    public static final HashMap A00;
    public static final HashMap A01;

    static {
        HashMap A1G = AbstractC166987dD.A1G();
        AbstractC58318PtA.A1P(Collection.class, ArrayList.class, A1G);
        AbstractC58318PtA.A1P(List.class, ArrayList.class, A1G);
        AbstractC58318PtA.A1P(java.util.Set.class, HashSet.class, A1G);
        A1G.put(SortedSet.class.getName(), TreeSet.class);
        A1G.put(Queue.class.getName(), LinkedList.class);
        AbstractC58318PtA.A1P(AbstractList.class, ArrayList.class, A1G);
        AbstractC58318PtA.A1P(AbstractSet.class, HashSet.class, A1G);
        AbstractC58318PtA.A1P(Deque.class, LinkedList.class, A1G);
        AbstractC58318PtA.A1P(NavigableSet.class, TreeSet.class, A1G);
        A00 = A1G;
        HashMap A1G2 = AbstractC166987dD.A1G();
        AbstractC58318PtA.A1P(Map.class, LinkedHashMap.class, A1G2);
        AbstractC58318PtA.A1P(AbstractMap.class, LinkedHashMap.class, A1G2);
        A1G2.put(ConcurrentMap.class.getName(), ConcurrentHashMap.class);
        A1G2.put(SortedMap.class.getName(), TreeMap.class);
        AbstractC58318PtA.A1P(NavigableMap.class, TreeMap.class, A1G2);
        A1G2.put(ConcurrentNavigableMap.class.getName(), ConcurrentSkipListMap.class);
        A01 = A1G2;
    }
}
