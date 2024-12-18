package X;

/* renamed from: X.56h, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public enum EnumC1125356h {
    AUDIO(1),
    VIDEO(2),
    MIXED(3);

    public int A00;

    public static EnumC1125356h A00(int i) {
        if (i != 1) {
            if (i != 2) {
                return MIXED;
            }
            return VIDEO;
        }
        return AUDIO;
    }

    EnumC1125356h(int i) {
        this.A00 = i;
    }
}
