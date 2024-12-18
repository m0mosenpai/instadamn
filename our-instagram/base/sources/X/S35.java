package X;

import com.google.common.collect.ImmutableMap;
import java.util.Iterator;

/* loaded from: classes10.dex */
public abstract class S35 {
    public static ImmutableMap A00(C2n2 values, ImmutableMap.Builder keyFunction, Iterator builder) {
        while (builder.hasNext()) {
            Object next = builder.next();
            keyFunction.put(values.apply(next), next);
        }
        try {
            return keyFunction.buildOrThrow();
        } catch (IllegalArgumentException e) {
            throw AbstractC167007dF.A0c(e.getMessage(), ". To index multiple values under a key, use Multimaps.index.");
        }
    }
}
