package X;

import com.google.common.collect.ImmutableMap;
import java.util.Map;

/* renamed from: X.A6j, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C22863A6j {
    public final Exception A00;
    public final Map A01;

    public C22863A6j(Exception exc, Map map) {
        ImmutableMap copyOf;
        this.A00 = exc;
        if (map == null) {
            copyOf = null;
        } else {
            copyOf = ImmutableMap.copyOf(map);
        }
        this.A01 = copyOf;
    }
}
