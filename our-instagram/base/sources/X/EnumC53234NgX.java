package X;

import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.NgX, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class EnumC53234NgX {
    public static final Map A01;
    public static final /* synthetic */ EnumEntries A02;
    public static final /* synthetic */ EnumC53234NgX[] A03;
    public static final EnumC53234NgX A04;
    public static final EnumC53234NgX A05;
    public static final EnumC53234NgX A06;
    public static final EnumC53234NgX A07;
    public static final EnumC53234NgX A08;
    public final int A00;

    static {
        EnumC53234NgX enumC53234NgX = new EnumC53234NgX("READ_ONLY", 0, 1);
        A08 = enumC53234NgX;
        EnumC53234NgX enumC53234NgX2 = new EnumC53234NgX("GENERIC_READ_ONLY_BLOCK", 1, 2);
        A04 = enumC53234NgX2;
        EnumC53234NgX enumC53234NgX3 = new EnumC53234NgX("MESSAGE_SEND", 2, 4);
        A05 = enumC53234NgX3;
        EnumC53234NgX enumC53234NgX4 = new EnumC53234NgX("MESSENGER_ONLY_ACCOUNTS_READ_ONLY_BLOCK", 3, 8);
        A07 = enumC53234NgX4;
        EnumC53234NgX enumC53234NgX5 = new EnumC53234NgX("MESSAGE_SEND_PRIVATE", 4, 16);
        A06 = enumC53234NgX5;
        EnumC53234NgX[] enumC53234NgXArr = {enumC53234NgX, enumC53234NgX2, enumC53234NgX3, enumC53234NgX4, enumC53234NgX5, new EnumC53234NgX("MESSAGE_SEND_PUBLIC", 5, 32)};
        A03 = enumC53234NgXArr;
        C020508b A00 = AbstractC12190kN.A00(enumC53234NgXArr);
        A02 = A00;
        LinkedHashMap A18 = AbstractC25225BEi.A18(AbstractC37302Gc3.A01(AbstractC06950Ym.A1E(A00, 10)));
        for (Object obj : A00) {
            AbstractC25227BEk.A1O(obj, A18, ((EnumC53234NgX) obj).A00);
        }
        A01 = A18;
    }

    public static EnumC53234NgX valueOf(String str) {
        return (EnumC53234NgX) Enum.valueOf(EnumC53234NgX.class, str);
    }

    public static EnumC53234NgX[] values() {
        return (EnumC53234NgX[]) A03.clone();
    }

    public EnumC53234NgX(String str, int i, int i2) {
        this.A00 = i2;
    }
}
