package X;

import android.animation.TimeInterpolator;

/* loaded from: classes11.dex */
public final class VKE {
    public int A00;
    public int A01;
    public long A02;
    public long A03;
    public TimeInterpolator A04;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof VKE) {
            VKE vke = (VKE) obj;
            if (this.A02 == vke.A02 && this.A03 == vke.A03 && this.A00 == vke.A00 && this.A01 == vke.A01) {
                TimeInterpolator timeInterpolator = this.A04;
                if (timeInterpolator == null) {
                    timeInterpolator = AbstractC153306uz.A02;
                }
                Class<?> cls = timeInterpolator.getClass();
                TimeInterpolator timeInterpolator2 = vke.A04;
                if (timeInterpolator2 == null) {
                    timeInterpolator2 = AbstractC153306uz.A02;
                }
                return cls.equals(timeInterpolator2.getClass());
            }
        }
        return false;
    }

    public final int hashCode() {
        long j = this.A02;
        int A07 = AbstractC167007dF.A07(this.A03, ((int) (j ^ (j >>> 32))) * 31);
        TimeInterpolator timeInterpolator = this.A04;
        if (timeInterpolator == null) {
            timeInterpolator = AbstractC153306uz.A02;
        }
        return ((AbstractC166997dE.A0J(timeInterpolator.getClass(), A07) + this.A00) * 31) + this.A01;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append('\n');
        sb.append(MSY.A0h(this));
        sb.append('{');
        AbstractC58318PtA.A1T(sb, System.identityHashCode(this));
        sb.append(" delay: ");
        sb.append(this.A02);
        sb.append(" duration: ");
        sb.append(this.A03);
        sb.append(" interpolator: ");
        TimeInterpolator timeInterpolator = this.A04;
        if (timeInterpolator == null) {
            timeInterpolator = AbstractC153306uz.A02;
        }
        sb.append(timeInterpolator.getClass());
        sb.append(" repeatCount: ");
        sb.append(this.A00);
        sb.append(" repeatMode: ");
        sb.append(this.A01);
        return AbstractC166997dE.A0x("}\n", sb);
    }
}
