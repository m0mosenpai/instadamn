package X;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.KbT, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class EnumC46129KbT {
    public static final /* synthetic */ EnumEntries A00;
    public static final /* synthetic */ EnumC46129KbT[] A01;
    public static final EnumC46129KbT A02;

    static {
        EnumC46129KbT enumC46129KbT = new EnumC46129KbT("USER_SESSION", 0);
        A02 = enumC46129KbT;
        EnumC46129KbT[] enumC46129KbTArr = {enumC46129KbT, new EnumC46129KbT("APP_CONTEXT", 1)};
        A01 = enumC46129KbTArr;
        A00 = AbstractC12190kN.A00(enumC46129KbTArr);
    }

    public static EnumC46129KbT valueOf(String str) {
        return (EnumC46129KbT) Enum.valueOf(EnumC46129KbT.class, str);
    }

    public static EnumC46129KbT[] values() {
        return (EnumC46129KbT[]) A01.clone();
    }

    public EnumC46129KbT(String str, int i) {
    }
}
