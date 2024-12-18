package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.0Ia, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class EnumC03620Ia {
    public static final /* synthetic */ EnumC03620Ia[] A02;
    public static final EnumC03620Ia A03;
    public static final EnumC03620Ia A04;
    public static final EnumC03620Ia A05;
    public static final EnumC03620Ia A06;
    public final int A00;
    public final boolean A01;

    static {
        EnumC03620Ia enumC03620Ia = new EnumC03620Ia();
        A06 = enumC03620Ia;
        EnumC03620Ia enumC03620Ia2 = new EnumC03620Ia("LOW", 1, 1);
        A04 = enumC03620Ia2;
        EnumC03620Ia enumC03620Ia3 = new EnumC03620Ia("MEDIUM", 2, 2);
        A05 = enumC03620Ia3;
        EnumC03620Ia enumC03620Ia4 = new EnumC03620Ia("HIGH", 3, 3);
        A03 = enumC03620Ia4;
        A02 = new EnumC03620Ia[]{enumC03620Ia, enumC03620Ia2, enumC03620Ia3, enumC03620Ia4};
    }

    public static EnumC03620Ia valueOf(String str) {
        return (EnumC03620Ia) Enum.valueOf(EnumC03620Ia.class, str);
    }

    public static EnumC03620Ia[] values() {
        return (EnumC03620Ia[]) A02.clone();
    }

    public EnumC03620Ia(String str, int i, int i2) {
        this.A00 = i2;
        this.A01 = true;
    }

    public EnumC03620Ia() {
        this.A00 = -1;
        this.A01 = false;
    }
}
