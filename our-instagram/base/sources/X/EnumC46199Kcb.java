package X;

import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.Kcb, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class EnumC46199Kcb {
    public static final Map A01;
    public static final /* synthetic */ EnumEntries A02;
    public static final /* synthetic */ EnumC46199Kcb[] A03;
    public static final EnumC46199Kcb A04;
    public static final EnumC46199Kcb A05;
    public static final EnumC46199Kcb A06;
    public static final EnumC46199Kcb A07;
    public final int A00;

    static {
        EnumC46199Kcb enumC46199Kcb = new EnumC46199Kcb("Anyone", 0, 0);
        A05 = enumC46199Kcb;
        EnumC46199Kcb enumC46199Kcb2 = new EnumC46199Kcb("AccountsYouFollow", 1, 1);
        A04 = enumC46199Kcb2;
        EnumC46199Kcb enumC46199Kcb3 = new EnumC46199Kcb("MentionedOnly", 2, 2);
        A06 = enumC46199Kcb3;
        EnumC46199Kcb enumC46199Kcb4 = new EnumC46199Kcb("ParentPostAuthorOnly", 3, 3);
        A07 = enumC46199Kcb4;
        EnumC46199Kcb[] enumC46199KcbArr = {enumC46199Kcb, enumC46199Kcb2, enumC46199Kcb3, enumC46199Kcb4};
        A03 = enumC46199KcbArr;
        A02 = AbstractC12190kN.A00(enumC46199KcbArr);
        EnumC46199Kcb[] values = values();
        LinkedHashMap A18 = AbstractC25225BEi.A18(AbstractC167017dG.A01(values.length));
        for (EnumC46199Kcb enumC46199Kcb5 : values) {
            AbstractC25227BEk.A1O(enumC46199Kcb5, A18, enumC46199Kcb5.A00);
        }
        A01 = A18;
    }

    public static EnumC46199Kcb valueOf(String str) {
        return (EnumC46199Kcb) Enum.valueOf(EnumC46199Kcb.class, str);
    }

    public static EnumC46199Kcb[] values() {
        return (EnumC46199Kcb[]) A03.clone();
    }

    public EnumC46199Kcb(String str, int i, int i2) {
        this.A00 = i2;
    }
}
