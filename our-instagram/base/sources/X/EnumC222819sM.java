package X;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.9sM, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class EnumC222819sM {
    public static final /* synthetic */ EnumEntries A01;
    public static final /* synthetic */ EnumC222819sM[] A02;
    public static final EnumC222819sM A03;
    public static final EnumC222819sM A04;
    public final C178087vh A00;

    static {
        EnumC222819sM enumC222819sM = new EnumC222819sM(InterfaceC178667we.A00, "CAMERA", 0);
        A03 = enumC222819sM;
        EnumC222819sM enumC222819sM2 = new EnumC222819sM(BEN.A00, "INPUT_COMPONENT", 1);
        A04 = enumC222819sM2;
        EnumC222819sM[] enumC222819sMArr = {enumC222819sM, enumC222819sM2};
        A02 = enumC222819sMArr;
        A01 = AbstractC12190kN.A00(enumC222819sMArr);
    }

    public static EnumC222819sM valueOf(String str) {
        return (EnumC222819sM) Enum.valueOf(EnumC222819sM.class, str);
    }

    public static EnumC222819sM[] values() {
        return (EnumC222819sM[]) A02.clone();
    }

    public EnumC222819sM(C178087vh c178087vh, String str, int i) {
        this.A00 = c178087vh;
    }
}
