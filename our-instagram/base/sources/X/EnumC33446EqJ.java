package X;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.EqJ, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class EnumC33446EqJ {
    public static final /* synthetic */ EnumEntries A01;
    public static final /* synthetic */ EnumC33446EqJ[] A02;
    public static final EnumC33446EqJ A03;
    public static final EnumC33446EqJ A04;
    public static final EnumC33446EqJ A05;
    public static final EnumC33446EqJ A06;
    public static final EnumC33446EqJ A07;
    public static final EnumC33446EqJ A08;
    public static final EnumC33446EqJ A09;
    public static final EnumC33446EqJ A0A;
    public final EnumC33446EqJ[] A00;

    static {
        EnumC33446EqJ enumC33446EqJ = new EnumC33446EqJ("ONE_TAP", new EnumC33446EqJ[0], 0);
        A07 = enumC33446EqJ;
        EnumC33446EqJ enumC33446EqJ2 = new EnumC33446EqJ("ONE_TAP_BACKUP", new EnumC33446EqJ[0], 1);
        A08 = enumC33446EqJ2;
        EnumC33446EqJ enumC33446EqJ3 = new EnumC33446EqJ("ALL_ONE_TAP", new EnumC33446EqJ[]{enumC33446EqJ, enumC33446EqJ2}, 2);
        A03 = enumC33446EqJ3;
        EnumC33446EqJ enumC33446EqJ4 = new EnumC33446EqJ("SMART_LOCK", new EnumC33446EqJ[0], 3);
        A0A = enumC33446EqJ4;
        EnumC33446EqJ enumC33446EqJ5 = new EnumC33446EqJ("GOOGLE", new EnumC33446EqJ[0], 4);
        A06 = enumC33446EqJ5;
        EnumC33446EqJ enumC33446EqJ6 = new EnumC33446EqJ("PROFILE", new EnumC33446EqJ[0], 5);
        A09 = enumC33446EqJ6;
        EnumC33446EqJ enumC33446EqJ7 = new EnumC33446EqJ("FX_MANI_IG_LOGGED_IN", new EnumC33446EqJ[0], 6);
        A05 = enumC33446EqJ7;
        EnumC33446EqJ enumC33446EqJ8 = new EnumC33446EqJ("CACHEABLE", new EnumC33446EqJ[]{enumC33446EqJ, enumC33446EqJ6, enumC33446EqJ4}, 7);
        A04 = enumC33446EqJ8;
        EnumC33446EqJ[] enumC33446EqJArr = {enumC33446EqJ, enumC33446EqJ2, enumC33446EqJ3, enumC33446EqJ4, enumC33446EqJ5, enumC33446EqJ6, enumC33446EqJ7, enumC33446EqJ8, new EnumC33446EqJ("ALL", new EnumC33446EqJ[]{enumC33446EqJ8, enumC33446EqJ5, enumC33446EqJ2, enumC33446EqJ4}, 8)};
        A02 = enumC33446EqJArr;
        A01 = AbstractC12190kN.A00(enumC33446EqJArr);
    }

    public static final void A00(EnumC33446EqJ enumC33446EqJ, java.util.Set set) {
        EnumC33446EqJ[] enumC33446EqJArr = enumC33446EqJ.A00;
        int length = enumC33446EqJArr.length;
        int i = 0;
        if (length == 0) {
            set.add(enumC33446EqJ);
            return;
        }
        do {
            A00(enumC33446EqJArr[i], set);
            i++;
        } while (i < length);
    }

    public static EnumC33446EqJ valueOf(String str) {
        return (EnumC33446EqJ) Enum.valueOf(EnumC33446EqJ.class, str);
    }

    public static EnumC33446EqJ[] values() {
        return (EnumC33446EqJ[]) A02.clone();
    }

    public EnumC33446EqJ(String str, EnumC33446EqJ[] enumC33446EqJArr, int i) {
        this.A00 = enumC33446EqJArr;
    }
}
