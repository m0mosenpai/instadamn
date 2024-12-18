package X;

import com.facebook.R;
import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.7mv, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class EnumC172837mv implements InterfaceC120325cX {
    public static final /* synthetic */ EnumEntries A06;
    public static final /* synthetic */ EnumC172837mv[] A07;
    public static final EnumC172837mv A08;
    public static final EnumC172837mv A0A;
    public static final EnumC172837mv A0C;
    public static final EnumC172837mv A0G;
    public static final EnumC172837mv A0I;
    public final int A00;
    public final int A01;
    public final int A02;
    public final int A03;
    public final AbstractC154146wP A04;
    public final String A05;
    public static final EnumC172837mv A0F = new EnumC172837mv(null, "TWO_BY_ONE", "two_by_one", 0, 2131964831, R.drawable.instagram_layout_2_vert_outline_44, 2, 2);
    public static final EnumC172837mv A0E = new EnumC172837mv(null, "ONE_BY_TWO", "one_by_two", 1, 2131964830, R.drawable.instagram_layout_2_horiz_outline_44, 2, 1);
    public static final EnumC172837mv A09 = new EnumC172837mv(new AbstractC154146wP() { // from class: X.7mw
        @Override // X.AbstractC154146wP
        public final int A03(int i) {
            return i == 0 ? 2 : 1;
        }
    }, "ONE_AND_TWO", "one_and_two", 2, 2131964825, R.drawable.instagram_layout_1_and_2_outline_44, 3, 2);
    public static final EnumC172837mv A0D = new EnumC172837mv(null, "ONE_BY_THREE", "one_by_three", 3, 2131964829, R.drawable.instagram_layout_3_horiz_outline_44, 3, 1);
    public static final EnumC172837mv A0H = new EnumC172837mv(null, "TWO_BY_TWO", "two_by_two", 4, 2131964833, R.drawable.instagram_layout_4_grid_outline_44, 4, 2);
    public static final EnumC172837mv A0B = new EnumC172837mv(null, "ONE_BY_FOUR", "one_by_four", 5, 2131964827, R.drawable.instagram_layout_3_horiz_outline_44, 4, 1);

    public static EnumC172837mv valueOf(String str) {
        return (EnumC172837mv) Enum.valueOf(EnumC172837mv.class, str);
    }

    public static EnumC172837mv[] values() {
        return (EnumC172837mv[]) A07.clone();
    }

    @Override // X.InterfaceC120325cX
    public final String getId() {
        return this.A05;
    }

    static {
        EnumC172837mv enumC172837mv = new EnumC172837mv(new AbstractC154146wP() { // from class: X.7mx
            @Override // X.AbstractC154146wP
            public final int A03(int i) {
                return i == 0 ? 2 : 1;
            }
        }, "ONE_AND_FOUR", "one_and_four", 6, 2131964824, R.drawable.instagram_layout_1_and_2_outline_44, 5, 2);
        A08 = enumC172837mv;
        EnumC172837mv enumC172837mv2 = new EnumC172837mv(null, "ONE_BY_FIVE", "one_by_five", 7, 2131964826, R.drawable.instagram_layout_3_horiz_outline_44, 5, 1);
        A0A = enumC172837mv2;
        EnumC172837mv enumC172837mv3 = new EnumC172837mv(null, "TWO_BY_THREE", "two_by_three", 8, 2131964832, R.drawable.instagram_layout_6_grid_outline_44, 6, 2);
        A0G = enumC172837mv3;
        EnumC172837mv enumC172837mv4 = new EnumC172837mv(null, "ONE_BY_SIX", "one_by_six", 9, 2131964828, R.drawable.instagram_layout_3_horiz_outline_44, 6, 1);
        A0C = enumC172837mv4;
        EnumC172837mv enumC172837mv5 = new EnumC172837mv(null, "UNSET", "unset", 10, 0, 0, 1, 1);
        A0I = enumC172837mv5;
        EnumC172837mv[] enumC172837mvArr = {A0F, A0E, A09, A0D, A0H, A0B, enumC172837mv, enumC172837mv2, enumC172837mv3, enumC172837mv4, enumC172837mv5};
        A07 = enumC172837mvArr;
        A06 = AbstractC12190kN.A00(enumC172837mvArr);
    }

    public EnumC172837mv(AbstractC154146wP abstractC154146wP, String str, String str2, int i, int i2, int i3, int i4, int i5) {
        this.A05 = str2;
        this.A01 = i2;
        this.A02 = i3;
        this.A03 = i4;
        this.A00 = i5;
        this.A04 = abstractC154146wP;
    }
}
