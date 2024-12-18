package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes11.dex */
public final class VHW implements InterfaceC02530Ab {
    public static final /* synthetic */ VHW[] A01;
    public static final VHW A02;
    public final String A00 = "location";

    static {
        VHW vhw = new VHW();
        A02 = vhw;
        A01 = new VHW[]{vhw};
    }

    public static VHW valueOf(String str) {
        return (VHW) Enum.valueOf(VHW.class, str);
    }

    public static VHW[] values() {
        return (VHW[]) A01.clone();
    }

    @Override // X.InterfaceC02530Ab
    public final /* bridge */ /* synthetic */ Object getValue() {
        return this.A00;
    }
}
