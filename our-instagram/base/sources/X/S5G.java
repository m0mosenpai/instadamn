package X;

import java.util.Arrays;
import java.util.Locale;

/* loaded from: classes10.dex */
public abstract class S5G {
    public static final RuntimeException A00(String str, int i) {
        return AbstractC166987dD.A18(AbstractC58318PtA.A0o(Locale.US, "%s (id: 0x%08X name: %s)", Arrays.copyOf(new Object[]{str, Integer.valueOf(i), AbstractC12290kX.A00.getResources().getResourceName(i)}, 3)));
    }
}
