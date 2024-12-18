package X;

import android.text.StaticLayout;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;

/* renamed from: X.Vri, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C69579Vri {
    public final int A00;
    public final StaticLayout A01;
    public final List A02;

    public final String toString() {
        String format = String.format(Locale.US, "ChunkedPhrase[chunks=%s]", Arrays.copyOf(new Object[]{this.A02}, 1));
        C14360o3.A07(format);
        return format;
    }

    public C69579Vri(StaticLayout staticLayout, List list, int i) {
        this.A02 = list;
        this.A01 = staticLayout;
        this.A00 = i;
    }
}
