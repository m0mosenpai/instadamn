package X;

import com.facebook.catalyst.modules.netinfo.NetInfoModule;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.Xcp, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class EnumC72402Xcp {
    public static final /* synthetic */ EnumC72402Xcp[] A01;
    public static final EnumC72402Xcp A02;
    public final String A00;

    static {
        EnumC72402Xcp A00 = A00("UNSET_OR_UNRECOGNIZED_ENUM_VALUE", 0);
        A02 = A00;
        EnumC72402Xcp A002 = A00("BLUE_COMMENT", 1);
        EnumC72402Xcp A003 = A00("BOLD", 2);
        EnumC72402Xcp A004 = A00("CODE", 3);
        EnumC72402Xcp A005 = A00("COPYABLE", 4);
        EnumC72402Xcp A006 = A00("EXPANDABLE", 5);
        EnumC72402Xcp A007 = A00("EXPANDABLEBODY", 6);
        EnumC72402Xcp A008 = A00("EXPANDABLECONTAINER", 7);
        EnumC72402Xcp A009 = A00("EXPANDABLESUMMARY", 8);
        EnumC72402Xcp A0010 = A00("EXPANDABLETITLE", 9);
        EnumC72402Xcp A0011 = A00("HEADLINE1", 10);
        EnumC72402Xcp A0012 = A00("HEADLINE2", 11);
        EnumC72402Xcp A0013 = A00("HEADLINE3", 12);
        EnumC72402Xcp A0014 = A00("HEADLINE4", 13);
        EnumC72402Xcp A0015 = A00("HORIZONTALRULER", 14);
        EnumC72402Xcp A0016 = A00("ITALIC", 15);
        EnumC72402Xcp A0017 = A00("LIGHTSTRIKETHROUGH", 16);
        EnumC72402Xcp A0018 = A00("LINEBREAK", 17);
        EnumC72402Xcp A0019 = A00("LISTITEM", 18);
        EnumC72402Xcp A0020 = A00("MEDIUM_WEIGHT", 19);
        EnumC72402Xcp A0021 = A00(NetInfoModule.CONNECTION_TYPE_NONE_DEPRECATED, 20);
        EnumC72402Xcp A0022 = A00("ORDEREDLIST", 21);
        EnumC72402Xcp A0023 = A00("PARAGRAPH", 22);
        EnumC72402Xcp A0024 = A00("PRE", 23);
        EnumC72402Xcp A0025 = A00("QUOTE", 24);
        EnumC72402Xcp A0026 = A00("SELECTION_ANCHOR", 25);
        EnumC72402Xcp A0027 = A00("SELECTION_FOCUS", 26);
        EnumC72402Xcp[] enumC72402XcpArr = new EnumC72402Xcp[37];
        System.arraycopy(new EnumC72402Xcp[]{A00("SEMIBOLD", 27), A00("SPOILER", 28), A00("STRIKETHROUGH", 29), A00("SUBSCRIPT", 30), A00("SUPERSCRIPT", 31), A00("TABLE", 32), A00("TABLEDATA", 33), A00("TABLEROW", 34), A00("UNDERLINE", 35), A00("UNORDEREDLIST", 36)}, AbstractC31175DnJ.A1b(new EnumC72402Xcp[]{A00, A002, A003, A004, A005, A006, A007, A008, A009, A0010, A0011, A0012, A0013, A0014, A0015, A0016, A0017, A0018, A0019, A0020, A0021, A0022, A0023, A0024, A0025, A0026, A0027}, enumC72402XcpArr) ? 1 : 0, enumC72402XcpArr, 27, 10);
        A01 = enumC72402XcpArr;
    }

    public static EnumC72402Xcp A00(String str, int i) {
        return new EnumC72402Xcp(str, i, str);
    }

    public static EnumC72402Xcp valueOf(String str) {
        return (EnumC72402Xcp) Enum.valueOf(EnumC72402Xcp.class, str);
    }

    public static EnumC72402Xcp[] values() {
        return (EnumC72402Xcp[]) A01.clone();
    }

    public EnumC72402Xcp(String str, int i, String str2) {
        this.A00 = str2;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.A00;
    }
}
