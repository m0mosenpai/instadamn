package X;

import com.facebook.react.modules.toast.ToastModule;
import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.NgT, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class EnumC53231NgT {
    public static final /* synthetic */ EnumEntries A01;
    public static final /* synthetic */ EnumC53231NgT[] A02;
    public static final EnumC53231NgT A03;
    public static final EnumC53231NgT A04;
    public static final EnumC53231NgT A05;
    public static final EnumC53231NgT A06;
    public static final EnumC53231NgT A07;
    public final Integer A00;

    public static EnumC53231NgT valueOf(String str) {
        return (EnumC53231NgT) Enum.valueOf(EnumC53231NgT.class, str);
    }

    public static EnumC53231NgT[] values() {
        return (EnumC53231NgT[]) A02.clone();
    }

    static {
        EnumC53231NgT enumC53231NgT = new EnumC53231NgT("FULL", 0, 2131963445);
        A03 = enumC53231NgT;
        EnumC53231NgT enumC53231NgT2 = new EnumC53231NgT(ToastModule.DURATION_LONG_KEY, 1, 2131963445);
        A04 = enumC53231NgT2;
        EnumC53231NgT enumC53231NgT3 = new EnumC53231NgT("MEDIUM", 2, 2131963445);
        A05 = enumC53231NgT3;
        EnumC53231NgT enumC53231NgT4 = new EnumC53231NgT(ToastModule.DURATION_SHORT_KEY, 3, 2131964699);
        A06 = enumC53231NgT4;
        EnumC53231NgT enumC53231NgT5 = new EnumC53231NgT("VERY_SHORT", 4, null);
        A07 = enumC53231NgT5;
        EnumC53231NgT[] enumC53231NgTArr = {enumC53231NgT, enumC53231NgT2, enumC53231NgT3, enumC53231NgT4, enumC53231NgT5};
        A02 = enumC53231NgTArr;
        A01 = AbstractC12190kN.A00(enumC53231NgTArr);
    }

    public EnumC53231NgT(String str, int i, Integer num) {
        this.A00 = num;
    }
}
