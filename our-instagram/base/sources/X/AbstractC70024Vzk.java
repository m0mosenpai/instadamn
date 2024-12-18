package X;

import java.util.Arrays;
import java.util.List;

/* renamed from: X.Vzk, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public abstract class AbstractC70024Vzk {
    public static final List A00 = Arrays.asList("en", "es", "fr", "de", "it");

    public static int A00(C4BF c4bf) {
        List list = c4bf.A07;
        if (list == null || list.size() <= 0) {
            return 0;
        }
        return ((C4BB) list.get(0)).A02.A0E;
    }
}
