package X;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.NeQ, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public class EnumC53113NeQ {
    public static final /* synthetic */ EnumEntries A00;
    public static final /* synthetic */ EnumC53113NeQ[] A01;
    public static final EnumC53113NeQ A02;
    public static final EnumC53113NeQ A03;

    static {
        EnumC53113NeQ enumC53113NeQ = new EnumC53113NeQ("THREE", 0);
        A03 = enumC53113NeQ;
        EnumC53113NeQ enumC53113NeQ2 = new EnumC53113NeQ("SIX", 1);
        A02 = enumC53113NeQ2;
        EnumC53113NeQ[] enumC53113NeQArr = {enumC53113NeQ, enumC53113NeQ2, new NHH()};
        A01 = enumC53113NeQArr;
        A00 = AbstractC12190kN.A00(enumC53113NeQArr);
    }

    public static EnumC53113NeQ valueOf(String str) {
        return (EnumC53113NeQ) Enum.valueOf(EnumC53113NeQ.class, str);
    }

    public static EnumC53113NeQ[] values() {
        return (EnumC53113NeQ[]) A01.clone();
    }

    public EnumC53113NeQ(String str, int i) {
    }
}
