package X;

import android.graphics.drawable.Drawable;
import com.facebook.catalyst.modules.netinfo.NetInfoModule;

/* loaded from: classes10.dex */
public final class SPH {
    public final float A00;
    public final float A01;
    public final int A02;
    public final Drawable A03;
    public final SP4 A04;
    public final Integer A05;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof SPH) {
                SPH sph = (SPH) obj;
                if (!C14360o3.A0K(this.A03, sph.A03) || this.A02 != sph.A02 || Float.compare(this.A00, sph.A00) != 0 || Float.compare(this.A01, sph.A01) != 0 || this.A05 != sph.A05 || !C14360o3.A0K(this.A04, sph.A04)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        String str;
        int A00 = AbstractC166997dE.A00(AbstractC166997dE.A00(((AbstractC167017dG.A0M(this.A03) * 31) + this.A02) * 31, this.A00), this.A01);
        int intValue = this.A05.intValue();
        switch (intValue) {
            case 1:
                str = "SHARK_FIN";
                break;
            case 2:
                str = NetInfoModule.CONNECTION_TYPE_NONE_DEPRECATED;
                break;
            default:
                str = "DEFAULT";
                break;
        }
        return ((A00 + str.hashCode() + intValue) * 31) + AbstractC166997dE.A0I(this.A04);
    }

    public SPH(Drawable drawable, SP4 sp4, Integer num, float f, float f2, int i) {
        this.A03 = drawable;
        this.A02 = i;
        this.A00 = f;
        this.A01 = f2;
        this.A05 = num;
        this.A04 = sp4;
    }

    public final String toString() {
        String str;
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append("TooltipAttributes(backgroundDrawable=");
        A1C.append(this.A03);
        A1C.append(", borderColor=");
        A1C.append(this.A02);
        A1C.append(", borderWidth=");
        A1C.append(this.A00);
        A1C.append(MSV.A00(130));
        A1C.append(this.A01);
        A1C.append(", arrowType=");
        switch (this.A05.intValue()) {
            case 1:
                str = "SHARK_FIN";
                break;
            case 2:
                str = NetInfoModule.CONNECTION_TYPE_NONE_DEPRECATED;
                break;
            default:
                str = "DEFAULT";
                break;
        }
        A1C.append(str);
        A1C.append(", shadow=");
        return AbstractC167017dG.A0o(this.A04, A1C);
    }
}
