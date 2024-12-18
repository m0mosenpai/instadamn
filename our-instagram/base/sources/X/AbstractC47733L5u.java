package X;

import java.text.BreakIterator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;

/* renamed from: X.L5u, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public abstract class AbstractC47733L5u {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v8, types: [X.L5u] */
    /* JADX WARN: Type inference failed for: r6v1, types: [java.util.Collection] */
    /* JADX WARN: Type inference failed for: r6v3, types: [java.util.AbstractCollection, java.util.LinkedList] */
    /* JADX WARN: Type inference failed for: r6v4, types: [java.util.AbstractCollection, java.util.LinkedList] */
    /* JADX WARN: Type inference failed for: r6v5, types: [java.util.Collection] */
    /* JADX WARN: Type inference failed for: r6v6, types: [java.util.AbstractCollection, java.util.LinkedList] */
    /* JADX WARN: Type inference failed for: r6v7 */
    /* JADX WARN: Type inference failed for: r6v8 */
    public final Collection A01(Collection collection) {
        ?? r6;
        if (this instanceof C46109Kb9) {
            C46109Kb9 c46109Kb9 = (C46109Kb9) this;
            if (collection != null) {
                r6 = new LinkedList();
                Iterator it = collection.iterator();
                while (it.hasNext()) {
                    String A1B = AbstractC166987dD.A1B(it);
                    if (A1B != null) {
                        r6.add(A1B.toLowerCase(c46109Kb9.A00));
                    }
                }
                return r6;
            }
            throw null;
        }
        if (this instanceof C46108Kb8) {
            C46108Kb8 c46108Kb8 = (C46108Kb8) this;
            if (collection != null) {
                r6 = new LinkedList();
                Iterator it2 = collection.iterator();
                while (it2.hasNext()) {
                    String A1B2 = AbstractC166987dD.A1B(it2);
                    if (A1B2 != null) {
                        BreakIterator breakIterator = c46108Kb8.A00;
                        breakIterator.setText(A1B2);
                        int first = breakIterator.first();
                        while (true) {
                            int next = breakIterator.next();
                            int i = first;
                            first = next;
                            if (next != -1) {
                                String substring = A1B2.substring(i, next);
                                if (Character.isLetterOrDigit(substring.charAt(0))) {
                                    r6.add(substring);
                                }
                            }
                        }
                    }
                }
                return r6;
            }
            throw null;
        }
        if (this instanceof C46107Kb7) {
            C46107Kb7 c46107Kb7 = (C46107Kb7) this;
            if (collection != null) {
                r6 = new LinkedList();
                Iterator it3 = collection.iterator();
                while (it3.hasNext()) {
                    String A1B3 = AbstractC166987dD.A1B(it3);
                    if (A1B3 != null) {
                        int i2 = 0;
                        while (true) {
                            int i3 = c46107Kb7.A00;
                            if (i3 + i2 <= A1B3.length()) {
                                r6.add(A1B3.substring(i2, i3 + i2));
                                i2++;
                            }
                        }
                    }
                }
                return r6;
            }
            throw null;
        }
        C46106Kb6 c46106Kb6 = (C46106Kb6) this;
        if (collection != null) {
            ArrayList A1F = AbstractC166987dD.A1F(collection);
            r6 = A1F;
            for (?? r0 : c46106Kb6.A00) {
                if (r0 != 0) {
                    r6 = r0.A01(r6);
                }
            }
            return r6;
        }
        throw null;
    }

    public static Collection A00(AbstractC47733L5u abstractC47733L5u, String str) {
        return abstractC47733L5u.A01(Arrays.asList(str));
    }
}
