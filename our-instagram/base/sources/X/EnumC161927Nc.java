package X;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.7Nc, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class EnumC161927Nc {
    public static final /* synthetic */ EnumEntries A00;
    public static final /* synthetic */ EnumC161927Nc[] A01;
    public static final EnumC161927Nc A02;
    public static final EnumC161927Nc A03;
    public static final EnumC161927Nc A04;
    public static final EnumC161927Nc A05;
    public static final EnumC161927Nc A06;
    public static final EnumC161927Nc A07;
    public static final EnumC161927Nc A08;
    public static final EnumC161927Nc A09;

    static {
        EnumC161927Nc enumC161927Nc = new EnumC161927Nc("UNSPECIFIED", 0);
        A08 = enumC161927Nc;
        EnumC161927Nc enumC161927Nc2 = new EnumC161927Nc("LLM_OUTPUT", 1);
        A02 = enumC161927Nc2;
        EnumC161927Nc enumC161927Nc3 = new EnumC161927Nc("SEND_QUERY", 2);
        A05 = enumC161927Nc3;
        EnumC161927Nc enumC161927Nc4 = new EnumC161927Nc("START_TYPING", 3);
        A06 = enumC161927Nc4;
        EnumC161927Nc enumC161927Nc5 = new EnumC161927Nc("STOP_TYPING", 4);
        A07 = enumC161927Nc5;
        EnumC161927Nc enumC161927Nc6 = new EnumC161927Nc("VIDEO_ABOUT_TO_FINISH", 5);
        A09 = enumC161927Nc6;
        EnumC161927Nc enumC161927Nc7 = new EnumC161927Nc("LLM_STREAMING_FINISHED", 6);
        A04 = enumC161927Nc7;
        EnumC161927Nc enumC161927Nc8 = new EnumC161927Nc("LLM_STREAMING", 7);
        A03 = enumC161927Nc8;
        EnumC161927Nc[] enumC161927NcArr = {enumC161927Nc, enumC161927Nc2, enumC161927Nc3, enumC161927Nc4, enumC161927Nc5, enumC161927Nc6, enumC161927Nc7, enumC161927Nc8};
        A01 = enumC161927NcArr;
        A00 = AbstractC12190kN.A00(enumC161927NcArr);
    }

    public static EnumC161927Nc valueOf(String str) {
        return (EnumC161927Nc) Enum.valueOf(EnumC161927Nc.class, str);
    }

    public static EnumC161927Nc[] values() {
        return (EnumC161927Nc[]) A01.clone();
    }

    public EnumC161927Nc(String str, int i) {
    }
}
