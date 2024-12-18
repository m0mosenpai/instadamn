package X;

import android.graphics.Color;
import java.util.Arrays;
import java.util.List;

/* renamed from: X.Cc5, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C28208Cc5 {
    public final int A00;
    public final int A01;
    public final List A02;

    public final int A00() {
        return Color.parseColor(AnonymousClass001.A0D(AbstractC166997dE.A0z("%06x", Arrays.copyOf(AbstractC25228BEl.A1Y(this.A01), 1)), '#'));
    }

    public C28208Cc5(List list, int i, int i2) {
        this.A02 = list;
        this.A01 = i;
        this.A00 = i2;
    }

    public C28208Cc5() {
        this(C16930sl.A00, -1, -1);
    }
}
