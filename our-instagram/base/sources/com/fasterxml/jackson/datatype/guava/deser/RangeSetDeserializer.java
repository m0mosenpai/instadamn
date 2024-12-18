package com.fasterxml.jackson.datatype.guava.deser;

import X.AbstractC166987dD;
import X.AbstractC58318PtA;
import X.AbstractC910944l;
import X.AnonymousClass469;
import X.C05F;
import X.C1126556v;
import X.C16L;
import X.C18C;
import X.C64749TSi;
import X.C90173zy;
import X.C910844k;
import X.C911244o;
import X.InterfaceC102474jf;
import X.InterfaceC65620ToB;
import X.MSX;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.google.common.collect.Cut;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableRangeSet;
import com.google.common.collect.Range;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes10.dex */
public class RangeSetDeserializer extends JsonDeserializer implements InterfaceC102474jf {
    public AbstractC910944l A00;

    @Override // com.fasterxml.jackson.databind.JsonDeserializer
    public final /* bridge */ /* synthetic */ Object A0D(C16L c16l, AnonymousClass469 anonymousClass469) {
        C64749TSi c64749TSi;
        Cut cut;
        Cut cut2;
        AbstractC910944l abstractC910944l = this.A00;
        if (abstractC910944l != null) {
            Iterable<Range> iterable = (Iterable) anonymousClass469.A0B(null, abstractC910944l).A0D(c16l, anonymousClass469);
            ImmutableRangeSet immutableRangeSet = ImmutableRangeSet.A01;
            ArrayList A1E = AbstractC166987dD.A1E();
            for (Range range : iterable) {
                C18C.A0A(range, "range must not be empty, but was %s", !range.lowerBound.equals(range.upperBound));
                A1E.add(range);
            }
            ImmutableList.Builder builder = new ImmutableList.Builder(A1E.size());
            Range range2 = Range.A00;
            Collections.sort(A1E, Range.RangeLexOrdering.A00);
            Iterator it = A1E.iterator();
            if (it instanceof C64749TSi) {
                c64749TSi = (C64749TSi) it;
            } else {
                c64749TSi = new C64749TSi(it);
            }
            while (c64749TSi.hasNext()) {
                Range range3 = (Range) c64749TSi.next();
                while (c64749TSi.hasNext()) {
                    if (!c64749TSi.A01) {
                        c64749TSi.A00 = c64749TSi.A02.next();
                        c64749TSi.A01 = true;
                    }
                    Range range4 = (Range) c64749TSi.A00;
                    if (range3.lowerBound.A00(range4.upperBound) <= 0 && range4.lowerBound.A00(range3.upperBound) <= 0) {
                        Range A01 = range3.A01(range4);
                        C18C.A09(range3, range4, "Overlapping ranges not permitted but found %s overlapping %s", A01.lowerBound.equals(A01.upperBound));
                        Range range5 = (Range) c64749TSi.next();
                        int A00 = range3.lowerBound.A00(range5.lowerBound);
                        int A002 = range3.upperBound.A00(range5.upperBound);
                        if (A00 <= 0) {
                            if (A002 < 0) {
                                if (A00 < 0) {
                                    cut = range3.lowerBound;
                                    cut2 = range5.upperBound;
                                    range5 = new Range(cut, cut2);
                                }
                                range3 = range5;
                            }
                        } else {
                            if (A002 > 0) {
                                cut = range5.lowerBound;
                                cut2 = range3.upperBound;
                                range5 = new Range(cut, cut2);
                            }
                            range3 = range5;
                        }
                    }
                    builder.add((Object) range3);
                }
                builder.add((Object) range3);
            }
            ImmutableList build = builder.build();
            if (build.isEmpty()) {
                return ImmutableRangeSet.A02;
            }
            if (build.size() == 1) {
                Iterator<E> it2 = build.iterator();
                Object next = it2.next();
                if (!it2.hasNext()) {
                    if (next.equals(Range.A00)) {
                        return ImmutableRangeSet.A01;
                    }
                } else {
                    StringBuilder A1C = AbstractC166987dD.A1C();
                    A1C.append("expected one element but was: <");
                    A1C.append(next);
                    int i = 0;
                    while (it2.hasNext()) {
                        AbstractC58318PtA.A1S(A1C);
                        A1C.append(it2.next());
                        i++;
                        if (i >= 4) {
                            break;
                        }
                    }
                    if (it2.hasNext()) {
                        A1C.append(", ...");
                    }
                    throw AbstractC166987dD.A12(MSX.A0l(A1C, '>'));
                }
            }
            return new ImmutableRangeSet(build);
        }
        throw new C90173zy(c16l, "RangeSetJsonSerializer was not contextualized (no deserialize target type). You need to specify the generic type down to the generic parameter of RangeSet.");
    }

    @Override // com.fasterxml.jackson.databind.JsonDeserializer
    public final Integer A0I() {
        return C05F.A01;
    }

    /* JADX WARN: Type inference failed for: r5v0, types: [com.fasterxml.jackson.datatype.guava.deser.RangeSetDeserializer, java.lang.Object, com.fasterxml.jackson.databind.JsonDeserializer] */
    @Override // X.InterfaceC102474jf
    public final JsonDeserializer ALr(InterfaceC65620ToB interfaceC65620ToB, AnonymousClass469 anonymousClass469) {
        AbstractC910944l abstractC910944l;
        C1126556v c1126556v = anonymousClass469.A00;
        if (c1126556v == null) {
            abstractC910944l = null;
        } else {
            abstractC910944l = (AbstractC910944l) c1126556v.A01;
        }
        AbstractC910944l A07 = abstractC910944l.A07(0);
        if (A07 == null) {
            return this;
        }
        ?? obj = new Object();
        C910844k A05 = anonymousClass469.A05();
        obj.A00 = A05.A0A(A05.A04(A05.A06(null, C911244o.A02(Range.class, new AbstractC910944l[]{A07}), Range.class)), List.class);
        return obj;
    }
}
