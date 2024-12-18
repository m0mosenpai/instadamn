package X;

import com.google.common.collect.ImmutableMap;
import java.util.Map;

/* renamed from: X.1z2, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C43331z2 {
    public final ImmutableMap A00;
    public final boolean A01;

    public C43331z2(Map map, boolean z) {
        ImmutableMap immutableMap;
        this.A01 = z;
        if (map != null) {
            immutableMap = ImmutableMap.copyOf(map);
        } else {
            immutableMap = null;
        }
        this.A00 = immutableMap;
    }
}
