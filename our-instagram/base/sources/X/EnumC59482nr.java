package X;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.2nr, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class EnumC59482nr {
    public static final /* synthetic */ EnumEntries A00;
    public static final /* synthetic */ EnumC59482nr[] A01;
    public static final EnumC59482nr A02;
    public static final EnumC59482nr A03;
    public static final EnumC59482nr A04;
    public static final EnumC59482nr A05;
    public static final EnumC59482nr A06;

    static {
        EnumC59482nr enumC59482nr = new EnumC59482nr("MINI_PREVIEW_IMAGE", 0);
        A04 = enumC59482nr;
        EnumC59482nr enumC59482nr2 = new EnumC59482nr("PARTIAL_PROGRESSIVE_IMAGE", 1);
        A06 = enumC59482nr2;
        EnumC59482nr enumC59482nr3 = new EnumC59482nr("FULL_IMAGE", 2);
        A03 = enumC59482nr3;
        EnumC59482nr enumC59482nr4 = new EnumC59482nr("FALL_BACK_IMAGE", 3);
        A02 = enumC59482nr4;
        EnumC59482nr enumC59482nr5 = new EnumC59482nr("NO_IMAGE", 4);
        A05 = enumC59482nr5;
        EnumC59482nr[] enumC59482nrArr = {enumC59482nr, enumC59482nr2, enumC59482nr3, enumC59482nr4, enumC59482nr5};
        A01 = enumC59482nrArr;
        A00 = AbstractC12190kN.A00(enumC59482nrArr);
    }

    public static EnumC59482nr valueOf(String str) {
        return (EnumC59482nr) Enum.valueOf(EnumC59482nr.class, str);
    }

    public static EnumC59482nr[] values() {
        return (EnumC59482nr[]) A01.clone();
    }

    public EnumC59482nr(String str, int i) {
    }
}
