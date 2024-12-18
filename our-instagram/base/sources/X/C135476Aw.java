package X;

import java.util.Arrays;

/* renamed from: X.6Aw, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C135476Aw {
    public static final EnumC135486Ax A04 = EnumC135486Ax.ROW;
    public static final EnumC135496Ay A05 = EnumC135496Ay.FLEX_START;
    public static final EnumC135506Az A02 = EnumC135506Az.STRETCH;
    public static final C6B0 A03 = C6B0.STRETCH;
    public static final C6B1 A06 = C6B1.NO_WRAP;
    public float[] A01 = new float[0];
    public int A00 = 0;

    public static void A00(C135476Aw c135476Aw, int i) {
        int i2 = c135476Aw.A00 + i;
        float[] fArr = c135476Aw.A01;
        int length = fArr.length;
        if (i2 > length) {
            int i3 = length * 2;
            if (i3 < i2) {
                i3 += i2 - i3;
            }
            c135476Aw.A01 = Arrays.copyOf(fArr, i3);
        }
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:5:0x0021. Please report as an issue. */
    public final String toString() {
        Object obj;
        String str;
        StringBuilder sb = new StringBuilder();
        int i = 0;
        while (i < this.A00) {
            Integer[] A00 = C05F.A00(11);
            float[] fArr = this.A01;
            switch (A00[(int) fArr[i]].intValue()) {
                case 0:
                    int i2 = (int) fArr[i + 1];
                    if (i2 != 0) {
                        if (i2 != 1) {
                            if (i2 == 2) {
                                obj = EnumC222579ry.RTL;
                            } else {
                                throw new IllegalArgumentException(AnonymousClass001.A0O("Unknown enum value: ", i2));
                            }
                        } else {
                            obj = EnumC222579ry.LTR;
                        }
                    } else {
                        obj = EnumC222579ry.INHERIT;
                    }
                    str = "  direction: ";
                    sb.append(str);
                    sb.append(obj);
                    sb.append("\n");
                    i += 2;
                case 1:
                    int i3 = (int) fArr[i + 1];
                    if (i3 != 0) {
                        if (i3 != 1) {
                            if (i3 != 2) {
                                if (i3 == 3) {
                                    obj = EnumC135486Ax.COLUMN_REVERSE;
                                } else {
                                    throw new IllegalArgumentException(AnonymousClass001.A0O("Unknown enum value: ", i3));
                                }
                            } else {
                                obj = EnumC135486Ax.COLUMN;
                            }
                        } else {
                            obj = EnumC135486Ax.ROW_REVERSE;
                        }
                    } else {
                        obj = EnumC135486Ax.ROW;
                    }
                    str = "  flexDirection: ";
                    sb.append(str);
                    sb.append(obj);
                    sb.append("\n");
                    i += 2;
                case 2:
                    int i4 = (int) fArr[i + 1];
                    if (i4 != 0) {
                        if (i4 != 1) {
                            if (i4 != 2) {
                                if (i4 != 3) {
                                    if (i4 != 4) {
                                        if (i4 == 5) {
                                            obj = EnumC135496Ay.SPACE_EVENLY;
                                        } else {
                                            throw new IllegalArgumentException(AnonymousClass001.A0O("Unknown enum value: ", i4));
                                        }
                                    } else {
                                        obj = EnumC135496Ay.SPACE_AROUND;
                                    }
                                } else {
                                    obj = EnumC135496Ay.SPACE_BETWEEN;
                                }
                            } else {
                                obj = EnumC135496Ay.FLEX_END;
                            }
                        } else {
                            obj = EnumC135496Ay.CENTER;
                        }
                    } else {
                        obj = EnumC135496Ay.FLEX_START;
                    }
                    str = "  justifyContent: ";
                    sb.append(str);
                    sb.append(obj);
                    sb.append("\n");
                    i += 2;
                case 3:
                    obj = EnumC135506Az.values()[(int) this.A01[i + 1]];
                    str = "  alignContent: ";
                    sb.append(str);
                    sb.append(obj);
                    sb.append("\n");
                    i += 2;
                case 4:
                    obj = C6B0.values()[(int) this.A01[i + 1]];
                    str = "  alignItems: ";
                    sb.append(str);
                    sb.append(obj);
                    sb.append("\n");
                    i += 2;
                case 5:
                    obj = C6B1.values()[(int) this.A01[i + 1]];
                    str = "  flexWrap: ";
                    sb.append(str);
                    sb.append(obj);
                    sb.append("\n");
                    i += 2;
                case 6:
                    obj = EnumC53104NeH.values()[(int) this.A01[i + 1]];
                    str = "  overflow: ";
                    sb.append(str);
                    sb.append(obj);
                    sb.append("\n");
                    i += 2;
                case 7:
                    Integer A01 = C6BG.A01((int) fArr[i + 1]);
                    float f = fArr[i + 2];
                    sb.append("  padding");
                    sb.append(C6BG.A02(A01));
                    sb.append(": ");
                    sb.append(f);
                    sb.append("\n");
                    i += 3;
                case 8:
                    Integer A012 = C6BG.A01((int) fArr[i + 1]);
                    float f2 = fArr[i + 2];
                    sb.append("  padding");
                    sb.append(C6BG.A02(A012));
                    sb.append(": ");
                    sb.append(f2);
                    sb.append("%\n");
                    i += 3;
                case 9:
                    Integer A013 = C6BG.A01((int) fArr[i + 1]);
                    float f3 = fArr[i + 2];
                    sb.append("  border");
                    sb.append(C6BG.A02(A013));
                    sb.append(": ");
                    sb.append(f3);
                    sb.append("\n");
                    i += 3;
                case 10:
                    float f4 = fArr[i + 1];
                    sb.append(" pointScalingFactor: ");
                    sb.append(f4);
                    sb.append("\n");
            }
        }
        if (sb.length() > 0) {
            return AnonymousClass001.A0g("{\n", sb.toString(), "}");
        }
        return "";
    }
}
