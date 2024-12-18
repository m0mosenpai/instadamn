package X;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.5wb, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class EnumC131445wb {
    public static final /* synthetic */ EnumEntries A00;
    public static final /* synthetic */ EnumC131445wb[] A01;
    public static final EnumC131445wb A02;
    public static final EnumC131445wb A03;
    public static final EnumC131445wb A04;
    public static final EnumC131445wb A05;
    public static final EnumC131445wb A06;
    public static final EnumC131445wb A07;

    static {
        EnumC131445wb enumC131445wb = new EnumC131445wb("INNER_TEXT", 0);
        A02 = enumC131445wb;
        EnumC131445wb enumC131445wb2 = new EnumC131445wb("READY_TO_SHOOT", 1);
        A04 = enumC131445wb2;
        EnumC131445wb enumC131445wb3 = new EnumC131445wb("READY_TO_SHOOT_MULTI_CAPTURE", 2);
        A05 = enumC131445wb3;
        EnumC131445wb enumC131445wb4 = new EnumC131445wb("RECORD_VIDEO_REQUESTED", 3);
        A07 = enumC131445wb4;
        EnumC131445wb enumC131445wb5 = new EnumC131445wb("RECORDING_VIDEO", 4);
        A06 = enumC131445wb5;
        EnumC131445wb enumC131445wb6 = new EnumC131445wb("PHOTO_CAPTURE_IN_PROGRESS", 5);
        A03 = enumC131445wb6;
        EnumC131445wb[] enumC131445wbArr = {enumC131445wb, enumC131445wb2, enumC131445wb3, enumC131445wb4, enumC131445wb5, enumC131445wb6};
        A01 = enumC131445wbArr;
        A00 = AbstractC12190kN.A00(enumC131445wbArr);
    }

    public static EnumC131445wb valueOf(String str) {
        return (EnumC131445wb) Enum.valueOf(EnumC131445wb.class, str);
    }

    public static EnumC131445wb[] values() {
        return (EnumC131445wb[]) A01.clone();
    }

    public EnumC131445wb(String str, int i) {
    }
}
