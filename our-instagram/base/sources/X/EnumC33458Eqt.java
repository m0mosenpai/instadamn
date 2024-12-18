package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.Eqt, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class EnumC33458Eqt implements InterfaceC02530Ab {
    public static final /* synthetic */ EnumC33458Eqt[] A01;
    public static final EnumC33458Eqt A02;
    public final long A00 = 1;

    static {
        EnumC33458Eqt enumC33458Eqt = new EnumC33458Eqt();
        A02 = enumC33458Eqt;
        A01 = new EnumC33458Eqt[]{enumC33458Eqt};
    }

    public static EnumC33458Eqt valueOf(String str) {
        return (EnumC33458Eqt) Enum.valueOf(EnumC33458Eqt.class, str);
    }

    public static EnumC33458Eqt[] values() {
        return (EnumC33458Eqt[]) A01.clone();
    }

    @Override // X.InterfaceC02530Ab
    public final /* bridge */ /* synthetic */ Object getValue() {
        return Long.valueOf(this.A00);
    }
}
