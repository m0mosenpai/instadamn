package X;

import java.util.Collections;
import java.util.Map;

/* renamed from: X.0sd, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC16850sd extends AbstractC09990gB {
    public static final int A0L(int i) {
        if (i < 0) {
            return i;
        }
        if (i < 3) {
            return i + 1;
        }
        if (i < 1073741824) {
            return (int) ((i / 0.75f) + 1.0f);
        }
        return Integer.MAX_VALUE;
    }

    public static final Map A0M(C09530e4 c09530e4) {
        C14360o3.A0B(c09530e4, 0);
        Map singletonMap = Collections.singletonMap(c09530e4.A00, c09530e4.A01);
        C14360o3.A07(singletonMap);
        return singletonMap;
    }

    public static final C06860Yd A0N(Map map) {
        C14360o3.A0B(map, 0);
        C06860Yd c06860Yd = (C06860Yd) map;
        c06860Yd.A05();
        c06860Yd.A08 = true;
        if (c06860Yd.size() <= 0) {
            C06860Yd c06860Yd2 = C06860Yd.A0D;
            C14360o3.A0C(c06860Yd2, "null cannot be cast to non-null type kotlin.collections.Map<K of kotlin.collections.builders.MapBuilder, V of kotlin.collections.builders.MapBuilder>");
            return c06860Yd2;
        }
        return c06860Yd;
    }
}
