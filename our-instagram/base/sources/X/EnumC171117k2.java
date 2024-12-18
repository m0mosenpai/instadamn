package X;

import com.facebook.R;
import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.7k2, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class EnumC171117k2 {
    public static final /* synthetic */ EnumEntries A02;
    public static final /* synthetic */ EnumC171117k2[] A03;
    public static final EnumC171117k2 A04;
    public static final EnumC171117k2 A05;
    public static final EnumC171117k2 A06;
    public static final EnumC171117k2 A07;
    public final int A00;
    public final int A01;

    public static EnumC171117k2 valueOf(String str) {
        return (EnumC171117k2) Enum.valueOf(EnumC171117k2.class, str);
    }

    public static EnumC171117k2[] values() {
        return (EnumC171117k2[]) A03.clone();
    }

    static {
        EnumC171117k2 enumC171117k2 = new EnumC171117k2("NEW", 0, 2131954606, R.color.badge_color);
        A05 = enumC171117k2;
        EnumC171117k2 enumC171117k22 = new EnumC171117k2("UPDATED", 1, 2131954608, R.color.primary_text_disabled_material_dark);
        A07 = enumC171117k22;
        EnumC171117k2 enumC171117k23 = new EnumC171117k2("SUGGESTED", 2, 2131954607, R.color.primary_text_disabled_material_dark);
        A06 = enumC171117k23;
        EnumC171117k2 enumC171117k24 = new EnumC171117k2("IG_ONLY", 3, 2131954605, R.color.clips_gradient_redesign_color_2);
        A04 = enumC171117k24;
        EnumC171117k2[] enumC171117k2Arr = {enumC171117k2, enumC171117k22, enumC171117k23, enumC171117k24, new EnumC171117k2("FB_ONLY", 4, 2131954604, R.color.badge_color)};
        A03 = enumC171117k2Arr;
        A02 = AbstractC12190kN.A00(enumC171117k2Arr);
    }

    public EnumC171117k2(String str, int i, int i2, int i3) {
        this.A01 = i2;
        this.A00 = i3;
    }
}
