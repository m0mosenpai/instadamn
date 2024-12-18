package X;

import com.facebook.R;

/* renamed from: X.VpW, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C69501VpW {
    public final C69753Vuo A00(InterfaceC72013XFb interfaceC72013XFb, VFR vfr) {
        VEP vep;
        int ordinal = vfr.ordinal();
        int i = 9;
        switch (ordinal) {
            case 2:
            case 5:
            case 6:
                break;
            case 3:
            case 4:
            default:
                i = 11;
                break;
            case 7:
                i = 8;
                break;
        }
        switch (ordinal) {
            case 2:
            case 5:
            case 6:
                vep = VEP.A0V;
                break;
            case 3:
            case 4:
            default:
                vep = VEP.A0U;
                break;
            case 7:
                vep = VEP.A0W;
                break;
        }
        return new C69753Vuo(new C70514WZv(Integer.valueOf(i), null, R.drawable.status_background_drawable, 0), interfaceC72013XFb, vep);
    }
}
