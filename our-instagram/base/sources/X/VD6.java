package X;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes11.dex */
public final class VD6 {
    public static final /* synthetic */ EnumEntries A00;
    public static final /* synthetic */ VD6[] A01;
    public static final VD6 A02;
    public static final VD6 A03;
    public static final VD6 A04;
    public static final VD6 A05;
    public static final VD6 A06;
    public static final VD6 A07;
    public static final VD6 A08;

    public static VD6 valueOf(String str) {
        return (VD6) Enum.valueOf(VD6.class, str);
    }

    public static VD6[] values() {
        return (VD6[]) A01.clone();
    }

    static {
        VD6 vd6 = new VD6("NOT_STARTED", 0);
        A05 = vd6;
        VD6 vd62 = new VD6("SEND_START_STREAM", 1);
        A07 = vd62;
        VD6 vd63 = new VD6("TRANSFER", 2);
        A08 = vd63;
        VD6 vd64 = new VD6("SEND_END_STREAM", 3);
        A06 = vd64;
        VD6 vd65 = new VD6("DONE", 4);
        A03 = vd65;
        VD6 vd66 = new VD6("CANCELED", 5);
        A02 = vd66;
        VD6 vd67 = new VD6("FAILED", 6);
        A04 = vd67;
        VD6[] vd6Arr = {vd6, vd62, vd63, vd64, vd65, vd66, vd67};
        A01 = vd6Arr;
        A00 = AbstractC12190kN.A00(vd6Arr);
    }

    public VD6(String str, int i) {
    }
}
