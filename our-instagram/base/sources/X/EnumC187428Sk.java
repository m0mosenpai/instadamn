package X;

import com.facebook.R;
import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.8Sk, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class EnumC187428Sk {
    public static final /* synthetic */ EnumEntries A03;
    public static final /* synthetic */ EnumC187428Sk[] A04;
    public static final EnumC187428Sk A05;
    public static final EnumC187428Sk A06;
    public static final EnumC187428Sk A07;
    public static final EnumC187428Sk A08;
    public static final EnumC187428Sk A09;
    public static final EnumC187428Sk A0A;
    public static final EnumC187428Sk A0B;
    public static final EnumC187428Sk A0C;
    public static final EnumC187428Sk A0D;
    public float A00 = 0.0f;
    public final float A01;
    public final Integer A02;

    public EnumC187428Sk(Integer num, String str, float f, int i) {
        this.A01 = f;
        this.A02 = num;
    }

    static {
        EnumC187428Sk enumC187428Sk = new EnumC187428Sk(null, "TINY", 0.48f, 0);
        A0D = enumC187428Sk;
        EnumC187428Sk enumC187428Sk2 = new EnumC187428Sk(Integer.valueOf(R.attr.stackedTimelineSmallPreviewSize), "SMALL", 0.48f, 1);
        A0C = enumC187428Sk2;
        EnumC187428Sk enumC187428Sk3 = new EnumC187428Sk(null, "LARGE", 0.6f, 2);
        A09 = enumC187428Sk3;
        EnumC187428Sk enumC187428Sk4 = new EnumC187428Sk(null, "SIMPLIFIED_FULL", -1.0f, 3);
        A0B = enumC187428Sk4;
        EnumC187428Sk enumC187428Sk5 = new EnumC187428Sk(null, "FULL", 1.0f, 4);
        A08 = enumC187428Sk5;
        EnumC187428Sk enumC187428Sk6 = new EnumC187428Sk(null, "EDIT_MODE", 1.0f, 5);
        A07 = enumC187428Sk6;
        EnumC187428Sk enumC187428Sk7 = new EnumC187428Sk(null, "ADD_CLIP", 1.0f, 6);
        A05 = enumC187428Sk7;
        EnumC187428Sk enumC187428Sk8 = new EnumC187428Sk(null, "REPLACE_CLIP", 1.0f, 7);
        A0A = enumC187428Sk8;
        EnumC187428Sk enumC187428Sk9 = new EnumC187428Sk(null, "ADD_OR_REPLACE_MUSIC", 1.0f, 8);
        A06 = enumC187428Sk9;
        EnumC187428Sk[] enumC187428SkArr = {enumC187428Sk, enumC187428Sk2, enumC187428Sk3, enumC187428Sk4, enumC187428Sk5, enumC187428Sk6, enumC187428Sk7, enumC187428Sk8, enumC187428Sk9};
        A04 = enumC187428SkArr;
        A03 = AbstractC12190kN.A00(enumC187428SkArr);
    }

    public static EnumC187428Sk valueOf(String str) {
        return (EnumC187428Sk) Enum.valueOf(EnumC187428Sk.class, str);
    }

    public static EnumC187428Sk[] values() {
        return (EnumC187428Sk[]) A04.clone();
    }
}
