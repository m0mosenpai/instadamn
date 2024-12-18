package X;

import com.hisi.perfhub.PerfHub;

/* loaded from: classes12.dex */
public final class Y0x {
    public static C15M A02;
    public static C15N A03;
    public final PerfHub A00;
    public final Object A01;

    static {
        C15M c15m = new C15M("com.hisi.perfhub.PerfHub");
        A02 = c15m;
        A03 = c15m.A02("perfEvent", Integer.TYPE, String.class, int[].class);
    }

    public final int A00(int i, int... iArr) {
        PerfHub perfHub = this.A00;
        if (perfHub != null) {
            return perfHub.perfEvent(i, "", iArr);
        }
        return A03.A00(new Object[]{Integer.valueOf(i), "", iArr}, this.A01);
    }

    public Y0x() {
        C15M c15m = A02;
        if (c15m.A03) {
            this.A00 = new PerfHub();
            return;
        }
        Class cls = c15m.A01;
        Object obj = null;
        if (cls != null) {
            try {
                obj = cls.newInstance();
            } catch (Throwable unused) {
            }
        }
        this.A01 = obj;
    }
}
