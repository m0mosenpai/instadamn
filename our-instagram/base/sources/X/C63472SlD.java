package X;

import android.os.Parcelable;
import java.lang.reflect.Array;

/* renamed from: X.SlD, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C63472SlD implements Parcelable.Creator {
    public final int A00;
    public final Object A01;

    public static C63472SlD A00(Class cls) {
        return new C63472SlD(cls, 1);
    }

    public C63472SlD(Class cls, int i) {
        this.A00 = i;
        if (i != 0) {
            this.A01 = cls;
        } else {
            this.A01 = cls;
        }
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:44:0x00e0. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0148 A[Catch: Exception -> 0x037e, Exception -> 0x0404, NoSuchMethodException -> 0x040c, TryCatch #0 {Exception -> 0x037e, blocks: (B:40:0x00bb, B:42:0x00cc, B:43:0x00d6, B:44:0x00e0, B:55:0x00e3, B:67:0x00e7, B:70:0x0101, B:71:0x00f3, B:73:0x0105, B:75:0x010b, B:77:0x0113, B:79:0x0119, B:81:0x0123, B:82:0x012b, B:83:0x012f, B:85:0x0133, B:87:0x0139, B:88:0x0142, B:90:0x0148, B:91:0x013e, B:93:0x0153, B:96:0x016d, B:97:0x015f, B:99:0x0172, B:102:0x0186, B:103:0x017a, B:105:0x018b, B:108:0x019f, B:109:0x0193, B:111:0x01a4, B:113:0x01ac, B:116:0x01b6, B:118:0x01bc, B:119:0x01c5, B:122:0x01d9, B:123:0x01cd, B:124:0x01c1, B:126:0x01de, B:128:0x01e6, B:131:0x01f0, B:133:0x01f8, B:136:0x0204, B:138:0x020a, B:139:0x0213, B:142:0x0227, B:143:0x021b, B:144:0x020f, B:145:0x01fe, B:147:0x022c, B:150:0x0240, B:151:0x0234, B:153:0x0245, B:156:0x0259, B:157:0x024d, B:159:0x025e, B:162:0x0272, B:163:0x0266, B:165:0x0277, B:167:0x0283, B:169:0x0288, B:170:0x029f, B:172:0x02a8, B:176:0x02b9, B:177:0x02d0, B:179:0x02d9, B:181:0x02e5, B:183:0x02ee, B:185:0x02ff, B:187:0x0311, B:190:0x0325, B:191:0x0319, B:45:0x032a, B:47:0x0336, B:49:0x0338, B:54:0x035b, B:58:0x034e, B:61:0x036f, B:62:0x037d), top: B:39:0x00bb }] */
    @Override // android.os.Parcelable.Creator
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object createFromParcel(android.os.Parcel r25) {
        /*
            Method dump skipped, instructions count: 1106
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C63472SlD.createFromParcel(android.os.Parcel):java.lang.Object");
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        if (this.A00 != 0) {
            return (Object[]) Array.newInstance((Class<?>) this.A01, i);
        }
        return new Object[i];
    }
}
