package X;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.Eof, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class EnumC33346Eof {
    public static final /* synthetic */ EnumEntries A00;
    public static final /* synthetic */ EnumC33346Eof[] A01;
    public static final EnumC33346Eof A02;
    public static final EnumC33346Eof A03;
    public static final EnumC33346Eof A04;
    public static final EnumC33346Eof A05;

    static {
        EnumC33346Eof enumC33346Eof = new EnumC33346Eof("IG_SEARCH", 0);
        A02 = enumC33346Eof;
        EnumC33346Eof enumC33346Eof2 = new EnumC33346Eof("THREAD_VIEW", 1);
        A03 = enumC33346Eof2;
        EnumC33346Eof enumC33346Eof3 = new EnumC33346Eof("UNIVERSAL_SEARCH", 2);
        A04 = enumC33346Eof3;
        EnumC33346Eof enumC33346Eof4 = new EnumC33346Eof("UNKNOWN", 3);
        A05 = enumC33346Eof4;
        EnumC33346Eof[] enumC33346EofArr = {enumC33346Eof, enumC33346Eof2, enumC33346Eof3, enumC33346Eof4};
        A01 = enumC33346EofArr;
        A00 = AbstractC12190kN.A00(enumC33346EofArr);
    }

    public static EnumC33346Eof valueOf(String str) {
        return (EnumC33346Eof) Enum.valueOf(EnumC33346Eof.class, str);
    }

    public static EnumC33346Eof[] values() {
        return (EnumC33346Eof[]) A01.clone();
    }

    public EnumC33346Eof(String str, int i) {
    }
}
