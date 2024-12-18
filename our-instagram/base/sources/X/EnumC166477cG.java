package X;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.7cG, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class EnumC166477cG {
    public static final /* synthetic */ EnumEntries A00;
    public static final /* synthetic */ EnumC166477cG[] A01;
    public static final EnumC166477cG A02;
    public static final EnumC166477cG A03;
    public static final EnumC166477cG A04;
    public static final EnumC166477cG A05;

    static {
        EnumC166477cG enumC166477cG = new EnumC166477cG("INITIAL_LOADING", 0);
        A04 = enumC166477cG;
        EnumC166477cG enumC166477cG2 = new EnumC166477cG("TAIL_LOADING", 1);
        A05 = enumC166477cG2;
        EnumC166477cG enumC166477cG3 = new EnumC166477cG("HEAD_LOADING", 2);
        A03 = enumC166477cG3;
        EnumC166477cG enumC166477cG4 = new EnumC166477cG("FB_FEEDBACK_ONLY", 3);
        A02 = enumC166477cG4;
        EnumC166477cG[] enumC166477cGArr = {enumC166477cG, enumC166477cG2, enumC166477cG3, enumC166477cG4};
        A01 = enumC166477cGArr;
        A00 = AbstractC12190kN.A00(enumC166477cGArr);
    }

    public static EnumC166477cG valueOf(String str) {
        return (EnumC166477cG) Enum.valueOf(EnumC166477cG.class, str);
    }

    public static EnumC166477cG[] values() {
        return (EnumC166477cG[]) A01.clone();
    }

    public EnumC166477cG(String str, int i) {
    }
}
