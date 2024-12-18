package X;

import java.util.Map;

/* renamed from: X.NgH, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public enum EnumC53219NgH {
    VERBOSE(0),
    INFO(1),
    WARNING(2),
    ERROR(3),
    /* JADX INFO: Fake field, exist only in values array */
    FATAL(4);

    public static final Map A01 = AbstractC166987dD.A1G();
    public final int A00;

    static {
        for (EnumC53219NgH enumC53219NgH : values()) {
            AbstractC25227BEk.A1O(enumC53219NgH, A01, enumC53219NgH.A00);
        }
    }

    EnumC53219NgH(int i) {
        this.A00 = i;
    }
}
