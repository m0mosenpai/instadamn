package X;

import android.view.View;
import com.instagram.common.gallery.Medium;

/* renamed from: X.Ldd, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C48540Ldd implements C3PE {
    public final int A00;
    public final Object A01;

    public C48540Ldd(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    @Override // X.C3PE
    public final void DQY(View view) {
        switch (this.A00) {
            case 0:
                C9V3.A00((C9V3) this.A01);
                return;
            case 1:
            case 2:
            default:
                return;
            case 3:
                C187318Ry c187318Ry = (C187318Ry) this.A01;
                if (c187318Ry == null) {
                    return;
                }
                c187318Ry.A0T.DkG();
                return;
        }
    }

    @Override // X.C3PE
    public final boolean DsE(View view) {
        String str;
        switch (this.A00) {
            case 2:
                C44770Jrr c44770Jrr = (C44770Jrr) this.A01;
                int i = C3OO.FLAG_ADAPTER_FULLUPDATE;
                Medium medium = c44770Jrr.A01;
                if (medium != null && medium.A03 >= 5000) {
                    KD2 kd2 = c44770Jrr.A05.A03.A02;
                    C8A7 c8a7 = kd2.A01;
                    if (c8a7 == null) {
                        str = "gallerySelectionViewModel";
                    } else {
                        c8a7.A02(C05F.A0Y, AbstractC166987dD.A1J(medium), false, true, false);
                        C8BF c8bf = kd2.A00;
                        if (c8bf == null) {
                            str = "musicBrowserViewModel";
                        } else {
                            c8bf.A01 = true;
                            return false;
                        }
                    }
                    C14360o3.A0F(str);
                    throw C00O.createAndThrow();
                }
                return false;
            case 3:
                C187318Ry c187318Ry = (C187318Ry) this.A01;
                if (c187318Ry == null) {
                    return true;
                }
                c187318Ry.A0T.DkG();
                return true;
            case 4:
                C14360o3.A0B(view, 0);
                ((InterfaceC156156zj) this.A01).D8A(view);
                return true;
            case 5:
                ((InterfaceC156146zi) this.A01).DDO();
                return true;
            default:
                C9V3 c9v3 = (C9V3) this.A01;
                C195608l0 c195608l0 = c9v3.A00;
                if (c195608l0 != null) {
                    AbstractC226549zC.A00(c9v3, c195608l0, c9v3.A0B);
                    return true;
                }
                return true;
        }
    }
}
