package X;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.9rt, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class EnumC222529rt {
    public static final /* synthetic */ EnumEntries A01;
    public static final /* synthetic */ EnumC222529rt[] A02;
    public static final EnumC222529rt A03;
    public static final EnumC222529rt A04;
    public final String A00;

    static {
        EnumC222529rt enumC222529rt = new EnumC222529rt() { // from class: X.9k9
        };
        A03 = enumC222529rt;
        EnumC222529rt enumC222529rt2 = new EnumC222529rt() { // from class: X.9kA
        };
        A04 = enumC222529rt2;
        EnumC222529rt[] enumC222529rtArr = {enumC222529rt, enumC222529rt2, new EnumC222529rt() { // from class: X.9kB
        }};
        A02 = enumC222529rtArr;
        A01 = AbstractC12190kN.A00(enumC222529rtArr);
    }

    public static EnumC222529rt[] values() {
        return (EnumC222529rt[]) A02.clone();
    }

    public final int A00(int i) {
        if (this instanceof C217789kB) {
            return 0;
        }
        if (!(this instanceof C217769k9)) {
            return i;
        }
        return AbstractC13950nL.A04(i);
    }

    public final int A01(int i) {
        if (this instanceof C217779kA) {
            return AbstractC13950nL.A04(i);
        }
        return i;
    }

    public EnumC222529rt(String str, int i, String str2) {
        this.A00 = str2;
    }
}
