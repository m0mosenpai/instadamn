package X;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.Kbh, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class EnumC46143Kbh {
    public static final /* synthetic */ EnumEntries A00;
    public static final /* synthetic */ EnumC46143Kbh[] A01;
    public static final EnumC46143Kbh A02;
    public static final EnumC46143Kbh A03;

    static {
        EnumC46143Kbh enumC46143Kbh = new EnumC46143Kbh("GRAPHQL", 0);
        A02 = enumC46143Kbh;
        EnumC46143Kbh enumC46143Kbh2 = new EnumC46143Kbh("NATIVE", 1);
        A03 = enumC46143Kbh2;
        EnumC46143Kbh[] enumC46143KbhArr = {enumC46143Kbh, enumC46143Kbh2};
        A01 = enumC46143KbhArr;
        A00 = AbstractC12190kN.A00(enumC46143KbhArr);
    }

    public static EnumC46143Kbh valueOf(String str) {
        return (EnumC46143Kbh) Enum.valueOf(EnumC46143Kbh.class, str);
    }

    public static EnumC46143Kbh[] values() {
        return (EnumC46143Kbh[]) A01.clone();
    }

    public EnumC46143Kbh(String str, int i) {
    }
}
