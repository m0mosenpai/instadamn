package X;

import com.facebook.catalyst.modules.netinfo.NetInfoModule;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.Xcm, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class EnumC72399Xcm {
    public static final /* synthetic */ EnumC72399Xcm[] A01;
    public static final EnumC72399Xcm A02;
    public final String A00;

    static {
        EnumC72399Xcm A00 = A00("UNSET_OR_UNRECOGNIZED_ENUM_VALUE", 0);
        A02 = A00;
        EnumC72399Xcm A002 = A00("BLUE_COMMENT", 1);
        EnumC72399Xcm A003 = A00("BOLD", 2);
        EnumC72399Xcm A004 = A00("CODE", 3);
        EnumC72399Xcm A005 = A00("COPYABLE", 4);
        EnumC72399Xcm A006 = A00("EXPANDABLE", 5);
        EnumC72399Xcm A007 = A00("EXPANDABLEBODY", 6);
        EnumC72399Xcm A008 = A00("EXPANDABLECONTAINER", 7);
        EnumC72399Xcm A009 = A00("EXPANDABLESUMMARY", 8);
        EnumC72399Xcm A0010 = A00("EXPANDABLETITLE", 9);
        EnumC72399Xcm A0011 = A00("HEADLINE1", 10);
        EnumC72399Xcm A0012 = A00("HEADLINE2", 11);
        EnumC72399Xcm A0013 = A00("HEADLINE3", 12);
        EnumC72399Xcm A0014 = A00("HEADLINE4", 13);
        EnumC72399Xcm A0015 = A00("HORIZONTALRULER", 14);
        EnumC72399Xcm A0016 = A00("ITALIC", 15);
        EnumC72399Xcm A0017 = A00("LIGHTSTRIKETHROUGH", 16);
        EnumC72399Xcm A0018 = A00("LINEBREAK", 17);
        EnumC72399Xcm A0019 = A00("LISTITEM", 18);
        EnumC72399Xcm A0020 = A00("MEDIUM_WEIGHT", 19);
        EnumC72399Xcm A0021 = A00(NetInfoModule.CONNECTION_TYPE_NONE_DEPRECATED, 20);
        EnumC72399Xcm A0022 = A00("ORDEREDLIST", 21);
        EnumC72399Xcm A0023 = A00("PARAGRAPH", 22);
        EnumC72399Xcm A0024 = A00("PRE", 23);
        EnumC72399Xcm A0025 = A00("QUOTE", 24);
        EnumC72399Xcm A0026 = A00("SELECTION_ANCHOR", 25);
        EnumC72399Xcm A0027 = A00("SELECTION_FOCUS", 26);
        EnumC72399Xcm[] enumC72399XcmArr = new EnumC72399Xcm[37];
        System.arraycopy(new EnumC72399Xcm[]{A00("SEMIBOLD", 27), A00("SPOILER", 28), A00("STRIKETHROUGH", 29), A00("SUBSCRIPT", 30), A00("SUPERSCRIPT", 31), A00("TABLE", 32), A00("TABLEDATA", 33), A00("TABLEROW", 34), A00("UNDERLINE", 35), A00("UNORDEREDLIST", 36)}, AbstractC31175DnJ.A1b(new EnumC72399Xcm[]{A00, A002, A003, A004, A005, A006, A007, A008, A009, A0010, A0011, A0012, A0013, A0014, A0015, A0016, A0017, A0018, A0019, A0020, A0021, A0022, A0023, A0024, A0025, A0026, A0027}, enumC72399XcmArr) ? 1 : 0, enumC72399XcmArr, 27, 10);
        A01 = enumC72399XcmArr;
    }

    public static EnumC72399Xcm A00(String str, int i) {
        return new EnumC72399Xcm(str, i, str);
    }

    public static EnumC72399Xcm valueOf(String str) {
        return (EnumC72399Xcm) Enum.valueOf(EnumC72399Xcm.class, str);
    }

    public static EnumC72399Xcm[] values() {
        return (EnumC72399Xcm[]) A01.clone();
    }

    public EnumC72399Xcm(String str, int i, String str2) {
        this.A00 = str2;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.A00;
    }
}
