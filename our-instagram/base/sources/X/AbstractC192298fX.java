package X;

import java.util.Map;

/* renamed from: X.8fX, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC192298fX {
    public static final Map A00;

    static {
        C09530e4[] c09530e4Arr = new C09530e4[28];
        System.arraycopy(new C09530e4[]{new C09530e4(new C0YZ(String.class), C3RD.A01), new C09530e4(new C0YZ(Character.TYPE), C192308fY.A00), new C09530e4(new C0YZ(char[].class), C192328fa.A00), new C09530e4(new C0YZ(Double.TYPE), C3RQ.A00), new C09530e4(new C0YZ(double[].class), C192338fb.A00), new C09530e4(new C0YZ(Float.TYPE), C3TW.A00), new C09530e4(new C0YZ(float[].class), C3TU.A00), new C09530e4(new C0YZ(Long.TYPE), C3RJ.A00), new C09530e4(new C0YZ(long[].class), C192348fc.A00), new C09530e4(new C0YZ(C192358fd.class), C192368fe.A01), new C09530e4(new C0YZ(C192378ff.class), C192388fg.A00), new C09530e4(new C0YZ(Integer.TYPE), C192398fh.A00), new C09530e4(new C0YZ(int[].class), C192418fj.A00), new C09530e4(new C0YZ(C192428fk.class), C192438fl.A01), new C09530e4(new C0YZ(C192448fm.class), C192458fn.A00), new C09530e4(new C0YZ(Short.TYPE), C192468fo.A00), new C09530e4(new C0YZ(short[].class), C192488fq.A00), new C09530e4(new C0YZ(C192498fr.class), C192508fs.A01), new C09530e4(new C0YZ(C192518ft.class), C192528fu.A00), new C09530e4(new C0YZ(Byte.TYPE), C192538fv.A00), new C09530e4(new C0YZ(byte[].class), C192558fx.A00), new C09530e4(new C0YZ(C192568fy.class), C192578fz.A01), new C09530e4(new C0YZ(C192588g0.class), C192598g1.A00), new C09530e4(new C0YZ(Boolean.TYPE), C3SL.A00), new C09530e4(new C0YZ(boolean[].class), C192608g2.A00), new C09530e4(new C0YZ(C0eB.class), C192618g3.A01), new C09530e4(new C0YZ(Void.class), C192648g6.A00)}, 0, c09530e4Arr, 0, 27);
        System.arraycopy(new C09530e4[]{new C09530e4(new C0YZ(C36J.class), C192678g9.A00)}, 0, c09530e4Arr, 27, 1);
        A00 = AbstractC06930Yk.A06(c09530e4Arr);
    }

    public static final String A00(String str) {
        String valueOf;
        if (str.length() > 0) {
            StringBuilder sb = new StringBuilder();
            char charAt = str.charAt(0);
            if (Character.isLowerCase(charAt)) {
                valueOf = AbstractC44209JgD.A00(charAt);
            } else {
                valueOf = String.valueOf(charAt);
            }
            sb.append((Object) valueOf);
            String substring = str.substring(1);
            C14360o3.A07(substring);
            sb.append(substring);
            return sb.toString();
        }
        return str;
    }
}
