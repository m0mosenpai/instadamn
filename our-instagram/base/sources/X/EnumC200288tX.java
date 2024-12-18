package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.8tX, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class EnumC200288tX implements InterfaceC200298tY {
    public static final /* synthetic */ EnumC200288tX[] A00;
    public static final EnumC200288tX A01;

    @Override // X.InterfaceC200298tY
    public final void Den(C201938wQ notification) {
    }

    static {
        EnumC200288tX enumC200288tX = new EnumC200288tX();
        A01 = enumC200288tX;
        A00 = new EnumC200288tX[]{enumC200288tX};
    }

    public static EnumC200288tX valueOf(String name) {
        return (EnumC200288tX) Enum.valueOf(EnumC200288tX.class, name);
    }

    public static EnumC200288tX[] values() {
        return (EnumC200288tX[]) A00.clone();
    }
}
