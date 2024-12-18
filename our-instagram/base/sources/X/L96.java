package X;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* loaded from: classes8.dex */
public final class L96 {
    public C45083JxD A00;
    public AbstractC47733L5u A01;
    public final C47737L5y A02;
    public final AbstractC47733L5u A03;
    public final Lock A04;
    public final Comparator A05;
    public final Lock A06;

    public final LTT A00(Integer num, String str, boolean z) {
        Lock lock;
        C45038JwT c45038JwT;
        Lock lock2;
        int i;
        Object next;
        if (this.A00 != null) {
            boolean A1X = AbstractC167007dF.A1X(num, C05F.A01);
            if (z) {
                lock = this.A06;
            } else {
                lock = this.A04;
            }
            lock.lock();
            if (A1X) {
                if (str.length() <= 60) {
                    Collection A00 = AbstractC47733L5u.A00(this.A03, str);
                    C14360o3.A07(A00);
                    ArrayList<Collection> A0q = AbstractC167017dG.A0q(A00);
                    Iterator it = A00.iterator();
                    while (it.hasNext()) {
                        A0q.add(AbstractC47733L5u.A00(new C46107Kb7(), (String) it.next()));
                    }
                    C47737L5y c47737L5y = this.A02;
                    HashMap A1G = AbstractC166987dD.A1G();
                    for (Collection collection : A0q) {
                        C14360o3.A0B(collection, 0);
                        C47943LFx c47943LFx = c47737L5y.A00;
                        Iterator it2 = collection.iterator();
                        while (true) {
                            if (it2.hasNext()) {
                                Object next2 = it2.next();
                                if (c47943LFx != null) {
                                    C14360o3.A0B(next2, 0);
                                    c47943LFx = (C47943LFx) c47943LFx.A02.get(next2);
                                }
                            } else if (c47943LFx != null) {
                                ArrayList A1E = AbstractC166987dD.A1E();
                                C47943LFx.A00(c47943LFx, A1E);
                                Iterator it3 = A1E.iterator();
                                while (it3.hasNext()) {
                                    Object next3 = it3.next();
                                    if (!A1G.containsKey(next3)) {
                                        AbstractC166997dE.A1U(next3, A1G, 0);
                                    }
                                    AbstractC166997dE.A1U(next3, A1G, AbstractC167017dG.A0K(AbstractC31171DnF.A0W(next3, A1G)) + 1);
                                }
                            }
                        }
                    }
                    Iterator A14 = AbstractC166997dE.A14(A1G);
                    c45038JwT = null;
                    if (!A14.hasNext()) {
                        next = null;
                    } else {
                        next = A14.next();
                        if (A14.hasNext()) {
                            int A04 = AbstractC43593JPy.A04((Map.Entry) next);
                            do {
                                Object next4 = A14.next();
                                int A042 = AbstractC43593JPy.A04((Map.Entry) next4);
                                if (A04 < A042) {
                                    next = next4;
                                    A04 = A042;
                                }
                            } while (A14.hasNext());
                        }
                    }
                    Map.Entry entry = (Map.Entry) next;
                    if (entry != null && AbstractC43593JPy.A04(entry) / A0q.size() >= 0.7d) {
                        LinkedHashMap A1I = AbstractC166987dD.A1I();
                        Iterator A142 = AbstractC166997dE.A14(A1G);
                        while (A142.hasNext()) {
                            Map.Entry A1K = AbstractC166987dD.A1K(A142);
                            if (AbstractC43593JPy.A04(A1K) == AbstractC43593JPy.A04(entry)) {
                                AbstractC43594JPz.A1S(A1I, A1K);
                            }
                        }
                        Iterator A0l = AbstractC167007dF.A0l(A1I);
                        if (A0l.hasNext()) {
                            Object next5 = A0l.next();
                            if (A0l.hasNext()) {
                                int i2 = ((C45038JwT) next5).A01;
                                do {
                                    Object next6 = A0l.next();
                                    int i3 = ((C45038JwT) next6).A01;
                                    if (i2 < i3) {
                                        next5 = next6;
                                        i2 = i3;
                                    }
                                } while (A0l.hasNext());
                            }
                            c45038JwT = (C45038JwT) next5;
                        } else {
                            throw new NoSuchElementException();
                        }
                    }
                }
            } else {
                Collection A01 = A01(str, z);
                C47737L5y c47737L5y2 = this.A02;
                Comparator comparator = this.A05;
                boolean A1R = AbstractC167007dF.A1R(0, A01, comparator);
                C47943LFx c47943LFx2 = c47737L5y2.A00;
                Iterator it4 = A01.iterator();
                while (true) {
                    c45038JwT = null;
                    if (it4.hasNext()) {
                        Object next7 = it4.next();
                        if (c47943LFx2 == null || c47943LFx2.A01 == A1R) {
                            break;
                        }
                        C14360o3.A0B(next7, 0);
                        c47943LFx2 = (C47943LFx) c47943LFx2.A02.get(next7);
                    } else if (c47943LFx2 != null) {
                        C47497KyQ c47497KyQ = new C47497KyQ(comparator);
                        c47943LFx2.A01(c47497KyQ);
                        c45038JwT = c47497KyQ.A00;
                        if (c45038JwT == null) {
                            throw new IllegalStateException();
                        }
                    }
                }
            }
            if (z) {
                lock2 = this.A06;
            } else {
                lock2 = this.A04;
            }
            lock2.unlock();
            if (c45038JwT != null) {
                int i4 = c45038JwT.A01;
                C45083JxD c45083JxD = this.A00;
                if (c45083JxD != null) {
                    i = c45083JxD.A01;
                } else {
                    i = 0;
                }
                if (i4 >= i) {
                    return new LTT(c45038JwT);
                }
            }
        }
        return null;
    }

    public final Collection A01(String str, boolean z) {
        if (z) {
            AbstractC47733L5u abstractC47733L5u = this.A01;
            if (abstractC47733L5u != null) {
                Collection A00 = AbstractC47733L5u.A00(abstractC47733L5u, str);
                C14360o3.A07(A00);
                return A00;
            }
        } else {
            Lock lock = this.A04;
            lock.lock();
            AbstractC47733L5u abstractC47733L5u2 = this.A01;
            if (abstractC47733L5u2 != null) {
                Collection A002 = AbstractC47733L5u.A00(abstractC47733L5u2, str);
                lock.unlock();
                C14360o3.A0A(A002);
                return A002;
            }
        }
        C14360o3.A0F("analyzer");
        throw C00O.createAndThrow();
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, java.util.Comparator] */
    /* JADX WARN: Type inference failed for: r1v2, types: [X.Kb6, X.L5u, java.lang.Object] */
    public L96() {
        ReentrantReadWriteLock reentrantReadWriteLock = new ReentrantReadWriteLock();
        this.A06 = reentrantReadWriteLock.readLock();
        this.A04 = reentrantReadWriteLock.writeLock();
        this.A05 = new Object();
        this.A02 = new C47737L5y();
        AbstractC47733L5u[] abstractC47733L5uArr = {new C46109Kb9(), new C46108Kb8()};
        ?? obj = new Object();
        obj.A00 = Arrays.asList(abstractC47733L5uArr);
        this.A03 = obj;
    }
}
