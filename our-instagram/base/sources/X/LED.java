package X;

import java.util.List;

/* loaded from: classes8.dex */
public final class LED {
    public final Number A00;
    public final List A01;

    public LED(Number number, List list) {
        this.A01 = list;
        this.A00 = number;
    }

    public LED() {
        this(null, null);
    }
}
