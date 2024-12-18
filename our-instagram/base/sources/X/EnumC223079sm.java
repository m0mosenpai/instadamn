package X;

import com.facebook.R;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'A0E' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:451)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByField(EnumVisitor.java:372)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByWrappedInsn(EnumVisitor.java:337)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:322)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:262)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* renamed from: X.9sm, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class EnumC223079sm {
    public static final /* synthetic */ EnumC223079sm[] A05;
    public static final EnumC223079sm A06;
    public static final EnumC223079sm A07;
    public static final EnumC223079sm A08;
    public static final EnumC223079sm A09;
    public static final EnumC223079sm A0A;
    public static final EnumC223079sm A0B;
    public static final EnumC223079sm A0C;
    public static final EnumC223079sm A0D;
    public static final EnumC223079sm A0E;
    public static final EnumC223079sm A0F;
    public int A00 = 0;
    public boolean A01;
    public final int A02;
    public final int[] A03;
    public final int[] A04;

    public static EnumC223079sm valueOf(String str) {
        return (EnumC223079sm) Enum.valueOf(EnumC223079sm.class, str);
    }

    public static EnumC223079sm[] values() {
        return (EnumC223079sm[]) A05.clone();
    }

    static {
        int[] iArr = {AbstractC12290kX.A00.getColor(R.color.igds_creation_tools_purple), AbstractC12290kX.A00.getColor(R.color.igds_creation_tools_purple)};
        A0E = new EnumC223079sm("VIBRANT", iArr, iArr, 0, R.color.design_dark_default_color_on_background);
        int[] iArr2 = {-1, -1};
        A0C = new EnumC223079sm("SUBTLE", iArr2, iArr2, 1, R.color.sticker_subtle_light_background);
        int[] iArr3 = C50R.A01;
        A0A = new EnumC223079sm("RAINBOW", iArr3, iArr3, 2, R.color.design_dark_default_color_on_background);
        A07 = new EnumC223079sm("HERO", AbstractC23047AEd.A01(AbstractC12290kX.A00), new int[]{AbstractC167007dF.A09(AbstractC12290kX.A00, R.attr.igds_color_text_on_white), AbstractC167007dF.A09(AbstractC12290kX.A00, R.attr.igds_color_text_on_white)}, 3, R.color.design_dark_default_color_on_background);
        A06 = new EnumC223079sm("DEFAULT", new int[]{AbstractC12290kX.A00.getColor(R.color.igds_creation_tools_purple), AbstractC12290kX.A00.getColor(R.color.igds_creation_tools_purple), AbstractC12290kX.A00.getColor(R.color.igds_creation_tools_purple), AbstractC12290kX.A00.getColor(R.color.igds_creation_tools_purple), AbstractC12290kX.A00.getColor(R.color.igds_creation_tools_purple)}, new int[]{AbstractC167007dF.A09(AbstractC12290kX.A00, R.attr.igds_color_text_on_white), AbstractC167007dF.A09(AbstractC12290kX.A00, R.attr.igds_color_text_on_white)}, 4, R.color.design_dark_default_color_on_background);
        int[] iArr4 = C6RQ.A0B.A03;
        A0D = new EnumC223079sm("SUBTLE_REDESIGN", iArr4, iArr4, 5, R.color.sticker_subtle_light_background);
        A0B = new EnumC223079sm("RAINBOW_REDESIGN", iArr3, iArr3, 6, R.color.design_dark_default_color_on_background);
        A08 = new EnumC223079sm("HERO_REDESIGN", AbstractC23047AEd.A01(AbstractC12290kX.A00), new int[]{AbstractC167007dF.A09(AbstractC12290kX.A00, R.attr.igds_color_text_on_white), AbstractC167007dF.A09(AbstractC12290kX.A00, R.attr.igds_color_text_on_white)}, 7, R.color.design_dark_default_color_on_background);
        EnumC223079sm enumC223079sm = new EnumC223079sm("VIBRANT_REDESIGN", new int[]{AbstractC12290kX.A00.getColor(R.color.igds_creation_tools_purple), AbstractC12290kX.A00.getColor(R.color.igds_creation_tools_purple), AbstractC12290kX.A00.getColor(R.color.igds_creation_tools_purple), AbstractC12290kX.A00.getColor(R.color.igds_creation_tools_purple), AbstractC12290kX.A00.getColor(R.color.igds_creation_tools_purple)}, new int[]{AbstractC12290kX.A00.getColor(R.color.igds_creation_tools_purple), AbstractC12290kX.A00.getColor(R.color.igds_creation_tools_purple)}, 8, R.color.design_dark_default_color_on_background);
        A0F = enumC223079sm;
        int[] iArr5 = C6RQ.A09.A03;
        EnumC223079sm enumC223079sm2 = new EnumC223079sm("MONOTONE", iArr5, iArr5, 9, R.color.design_dark_default_color_on_background);
        A09 = enumC223079sm2;
        A05 = new EnumC223079sm[]{A0E, A0C, A0A, A07, A06, A0D, A0B, A08, enumC223079sm, enumC223079sm2};
    }

    public EnumC223079sm(String str, int[] iArr, int[] iArr2, int i, int i2) {
        this.A02 = i2;
        this.A03 = iArr;
        this.A04 = iArr2;
    }
}
