package X;

import android.content.Context;
import com.facebook.R;
import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.6r4, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class EnumC151036r4 {
    public static final /* synthetic */ EnumEntries A01;
    public static final /* synthetic */ EnumC151036r4[] A02;
    public static final EnumC151036r4 A03;
    public static final EnumC151036r4 A04;
    public static final EnumC151036r4 A05;
    public static final EnumC151036r4 A06;
    public static final EnumC151036r4 A07;
    public static final EnumC151036r4 A08;
    public static final EnumC151036r4 A09;
    public static final EnumC151036r4 A0A;
    public static final EnumC151036r4 A0B;
    public static final EnumC151036r4 A0C;
    public static final EnumC151036r4 A0D;
    public static final EnumC151036r4 A0E;
    public static final EnumC151036r4 A0F;
    public static final EnumC151036r4 A0G;
    public final int A00;

    static {
        EnumC151036r4 enumC151036r4 = new EnumC151036r4("PRIMARY", 0, 0);
        A0D = enumC151036r4;
        EnumC151036r4 enumC151036r42 = new EnumC151036r4("SECONDARY", 1, 1);
        A0F = enumC151036r42;
        EnumC151036r4 enumC151036r43 = new EnumC151036r4("DEFAULT_ON_BLACK", 2, 2);
        A0C = enumC151036r43;
        EnumC151036r4 enumC151036r44 = new EnumC151036r4("CREATION_FLOW", 3, 3);
        A03 = enumC151036r44;
        EnumC151036r4 enumC151036r45 = new EnumC151036r4("CREATION_FLOW_RED_LABEL", 4, 4);
        A0B = enumC151036r45;
        EnumC151036r4 enumC151036r46 = new EnumC151036r4("SECONDARY_ON_BLACK", 5, 5);
        A0G = enumC151036r46;
        EnumC151036r4 enumC151036r47 = new EnumC151036r4("PRIMARY_DESTRUCTIVE", 6, 6);
        A0E = enumC151036r47;
        EnumC151036r4 enumC151036r48 = new EnumC151036r4("CREATION_FLOW_DESTRUCTIVE", 7, 7);
        A08 = enumC151036r48;
        EnumC151036r4 enumC151036r49 = new EnumC151036r4("CREATION_FLOW_BLUE", 8, 8);
        A04 = enumC151036r49;
        EnumC151036r4 enumC151036r410 = new EnumC151036r4("CREATION_FLOW_NO_BG", 9, 9);
        A0A = enumC151036r410;
        EnumC151036r4 enumC151036r411 = new EnumC151036r4("CREATION_FLOW_CHANGES_BLUE", 10, 10);
        A06 = enumC151036r411;
        EnumC151036r4 enumC151036r412 = new EnumC151036r4("CREATION_FLOW_CHANGES_YELLOW", 11, 11);
        A07 = enumC151036r412;
        EnumC151036r4 enumC151036r413 = new EnumC151036r4("CREATION_FLOW_FEED_PRIMARY", 12, 12);
        A09 = enumC151036r413;
        EnumC151036r4 enumC151036r414 = new EnumC151036r4("CREATION_FLOW_BLUE_DARK_BACKGROUND_OVERRIDE", 13, 13);
        A05 = enumC151036r414;
        EnumC151036r4[] enumC151036r4Arr = {enumC151036r4, enumC151036r42, enumC151036r43, enumC151036r44, enumC151036r45, enumC151036r46, enumC151036r47, enumC151036r48, enumC151036r49, enumC151036r410, enumC151036r411, enumC151036r412, enumC151036r413, enumC151036r414};
        A02 = enumC151036r4Arr;
        A01 = AbstractC12190kN.A00(enumC151036r4Arr);
    }

    public static EnumC151036r4 valueOf(String str) {
        return (EnumC151036r4) Enum.valueOf(EnumC151036r4.class, str);
    }

    public static EnumC151036r4[] values() {
        return (EnumC151036r4[]) A02.clone();
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x0043, code lost:
    
        if (r1 != 12) goto L37;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int A00(android.content.Context r4) {
        /*
            r3 = this;
            int r1 = r3.A00
            r0 = 1
            if (r1 != r0) goto Ld
            r2 = 2130970304(0x7f0406c0, float:1.7549314E38)
        L8:
            int r0 = X.AbstractC53242c7.A0H(r4, r2)
            return r0
        Ld:
            r0 = 2
            if (r1 == r0) goto L4d
            r0 = 5
            if (r1 == r0) goto L4d
            r0 = 3
            if (r1 == r0) goto L49
            r0 = 4
            if (r1 == r0) goto L49
            r0 = 11
            if (r1 == r0) goto L49
            r0 = 10
            if (r1 == r0) goto L49
            r0 = 7
            if (r1 != r0) goto L28
            r0 = 2131100328(0x7f0602a8, float:1.7813034E38)
            return r0
        L28:
            r0 = 8
            if (r1 == r0) goto L51
            r0 = 13
            if (r1 == r0) goto L51
            r0 = 9
            if (r1 != r0) goto L38
            r0 = 2131100175(0x7f06020f, float:1.7812724E38)
            return r0
        L38:
            r0 = 0
            if (r1 == r0) goto L45
            r0 = 6
            if (r1 == r0) goto L45
            r0 = 12
            r2 = 2130970276(0x7f0406a4, float:1.7549258E38)
            if (r1 == r0) goto L8
        L45:
            r2 = 2130970275(0x7f0406a3, float:1.7549256E38)
            goto L8
        L49:
            r2 = 2130970168(0x7f040638, float:1.7549039E38)
            goto L8
        L4d:
            r2 = 2130970311(0x7f0406c7, float:1.7549329E38)
            goto L8
        L51:
            X.1QL r0 = X.C1QI.A0E()
            int r0 = X.C1QI.A05(r4, r0)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.EnumC151036r4.A00(android.content.Context):int");
    }

    public EnumC151036r4(String str, int i, int i2) {
        this.A00 = i2;
    }

    public final int A01(Context context) {
        int i;
        C1QL A0E2 = C1QI.A0E();
        int i2 = this.A00;
        if (i2 != 8 && i2 != 13) {
            if (i2 == 0) {
                i = R.attr.igds_color_text_on_white;
            } else if (i2 != 4 && i2 != 7 && i2 != 6) {
                if (i2 == 10) {
                    i = R.attr.igds_color_primary_button;
                } else if (i2 == 11) {
                    i = R.attr.igds_color_creation_tools_yellow;
                } else {
                    i = R.attr.igds_color_primary_text_on_media;
                    if (i2 == 12) {
                        i = R.attr.igds_color_primary_background;
                    }
                }
            } else {
                i = R.attr.igds_color_error_or_destructive;
            }
            return AbstractC53242c7.A0H(context, i);
        }
        return C1QI.A06(context, A0E2);
    }
}
