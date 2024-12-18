package X;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.KcG, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class EnumC46178KcG {
    public static final /* synthetic */ EnumEntries A00;
    public static final /* synthetic */ EnumC46178KcG[] A01;
    public static final EnumC46178KcG A02;
    public static final EnumC46178KcG A03;
    public static final EnumC46178KcG A04;
    public static final EnumC46178KcG A05;
    public static final EnumC46178KcG A06;
    public static final EnumC46178KcG A07;
    public static final EnumC46178KcG A08;

    static {
        EnumC46178KcG enumC46178KcG = new EnumC46178KcG("AudioEvent", 0);
        A02 = enumC46178KcG;
        EnumC46178KcG enumC46178KcG2 = new EnumC46178KcG("TextEvent", 1);
        A06 = enumC46178KcG2;
        EnumC46178KcG enumC46178KcG3 = new EnumC46178KcG("GalleryStickerEvent", 2);
        A05 = enumC46178KcG3;
        EnumC46178KcG enumC46178KcG4 = new EnumC46178KcG("FilterEvent", 3);
        A04 = enumC46178KcG4;
        EnumC46178KcG enumC46178KcG5 = new EnumC46178KcG("EditToolEvent", 4);
        A03 = enumC46178KcG5;
        EnumC46178KcG enumC46178KcG6 = new EnumC46178KcG("VideoTrimEvent", 5);
        A08 = enumC46178KcG6;
        EnumC46178KcG enumC46178KcG7 = new EnumC46178KcG("VideoCoverPhotoEvent", 6);
        A07 = enumC46178KcG7;
        EnumC46178KcG[] enumC46178KcGArr = {enumC46178KcG, enumC46178KcG2, enumC46178KcG3, enumC46178KcG4, enumC46178KcG5, enumC46178KcG6, enumC46178KcG7};
        A01 = enumC46178KcGArr;
        A00 = AbstractC12190kN.A00(enumC46178KcGArr);
    }

    public static EnumC46178KcG valueOf(String str) {
        return (EnumC46178KcG) Enum.valueOf(EnumC46178KcG.class, str);
    }

    public static EnumC46178KcG[] values() {
        return (EnumC46178KcG[]) A01.clone();
    }

    public EnumC46178KcG(String str, int i) {
    }
}
