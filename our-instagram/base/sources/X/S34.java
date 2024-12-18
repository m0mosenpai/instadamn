package X;

import com.google.common.collect.ByFunctionOrdering;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableRangeMap;
import com.google.common.collect.Maps$EntryFunction;
import com.google.common.collect.Range;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* loaded from: classes10.dex */
public abstract class S34 {
    public static ImmutableRangeMap A00(List list) {
        Range range = Range.A00;
        Collections.sort(list, new ByFunctionOrdering(Maps$EntryFunction.A00, Range.RangeLexOrdering.A00));
        ImmutableList.Builder builder = new ImmutableList.Builder(list.size());
        ImmutableList.Builder builder2 = new ImmutableList.Builder(list.size());
        for (int i = 0; i < list.size(); i++) {
            Range range2 = (Range) ((Map.Entry) list.get(i)).getKey();
            if (i > 0) {
                Range range3 = (Range) ((Map.Entry) list.get(i - 1)).getKey();
                if (range2.lowerBound.A00(range3.upperBound) <= 0 && range3.lowerBound.A00(range2.upperBound) <= 0) {
                    Range A01 = range2.A01(range3);
                    if (!A01.lowerBound.equals(A01.upperBound)) {
                        StringBuilder A1C = AbstractC166987dD.A1C();
                        A1C.append("Overlapping ranges: range ");
                        A1C.append(range3);
                        throw AbstractC37303Gc4.A0M(range2, " overlaps with entry ", A1C);
                    }
                }
            }
            builder.add((Object) range2);
            builder2.add(((Map.Entry) list.get(i)).getValue());
        }
        ImmutableRangeMap immutableRangeMap = ImmutableRangeMap.A02;
        return new ImmutableRangeMap(builder.build(), builder2.build());
    }
}
