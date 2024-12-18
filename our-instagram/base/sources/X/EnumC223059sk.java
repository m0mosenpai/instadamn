package X;

import com.facebook.R;
import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.9sk, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class EnumC223059sk {
    public static final /* synthetic */ EnumEntries A03;
    public static final /* synthetic */ EnumC223059sk[] A04;
    public static final EnumC223059sk A05;
    public static final EnumC223059sk A06;
    public static final EnumC223059sk A07;
    public static final EnumC223059sk A08;
    public static final EnumC223059sk A09;
    public static final EnumC223059sk A0A;
    public final int A00;
    public final int A01;
    public final String A02;

    public static EnumC223059sk valueOf(String str) {
        return (EnumC223059sk) Enum.valueOf(EnumC223059sk.class, str);
    }

    public static EnumC223059sk[] values() {
        return (EnumC223059sk[]) A04.clone();
    }

    static {
        EnumC223059sk enumC223059sk = new EnumC223059sk("BLUR", 0, 2131956010, R.drawable.transition_effects_icon_blur, "blur_transition");
        A05 = enumC223059sk;
        EnumC223059sk enumC223059sk2 = new EnumC223059sk("ZOOM", 1, 2131956016, R.drawable.transition_effects_icon_zoom, "zoom_transition");
        A0A = enumC223059sk2;
        EnumC223059sk enumC223059sk3 = new EnumC223059sk("FLARE", 2, 2131956012, R.drawable.transition_effects_icon_flare, "flare_transition");
        A06 = enumC223059sk3;
        EnumC223059sk enumC223059sk4 = new EnumC223059sk("WARP", 3, 2131956015, R.drawable.transition_effects_icon_warp, "warp_transition");
        A09 = enumC223059sk4;
        EnumC223059sk enumC223059sk5 = new EnumC223059sk("GLITCH", 4, 2131956013, R.drawable.transition_effects_icon_glitch, "glitch_transition");
        A07 = enumC223059sk5;
        EnumC223059sk enumC223059sk6 = new EnumC223059sk("SPIN", 5, 2131956014, R.drawable.transition_effects_icon_spin, "spin_transition");
        A08 = enumC223059sk6;
        EnumC223059sk[] enumC223059skArr = {enumC223059sk, enumC223059sk2, enumC223059sk3, enumC223059sk4, enumC223059sk5, enumC223059sk6};
        A04 = enumC223059skArr;
        A03 = AbstractC12190kN.A00(enumC223059skArr);
    }

    public EnumC223059sk(String str, int i, int i2, int i3, String str2) {
        this.A02 = str2;
        this.A01 = i2;
        this.A00 = i3;
    }
}
