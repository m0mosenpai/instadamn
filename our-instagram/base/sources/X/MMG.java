package X;

import com.instagram.common.gallery.Medium;

/* loaded from: classes8.dex */
public final class MMG extends C0YY implements InterfaceC16620sF {
    public static final MMG A00 = new MMG();

    public MMG() {
        super(2);
    }

    @Override // X.InterfaceC16620sF
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        C194878jo c194878jo;
        float f;
        Medium medium = (Medium) obj;
        Medium medium2 = (Medium) obj2;
        int i = 1;
        if (medium.Cff()) {
            i = -1;
        } else if (!medium2.Cff()) {
            float A002 = medium.A00();
            float A003 = medium2.A00();
            if (A002 != A003 && (c194878jo = medium.A0F) != null) {
                float f2 = c194878jo.A00;
                if (f2 > 0.0f) {
                    C194878jo c194878jo2 = medium2.A0F;
                    if (c194878jo2 != null) {
                        f = c194878jo2.A00;
                    } else {
                        f = 0.0f;
                    }
                    i = Float.compare(f, f2);
                }
            }
            i = Float.compare(AbstractC166987dD.A01(0.5625f, A002), AbstractC166987dD.A01(0.5625f, A003));
        }
        return Integer.valueOf(i);
    }
}
