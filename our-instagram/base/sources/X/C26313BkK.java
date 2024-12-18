package X;

import com.facebook.R;

/* renamed from: X.BkK, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C26313BkK extends AbstractC51572Yf {
    public final C51722Yv A00;
    public final Integer A01;

    @Override // X.AbstractC51572Yf
    public final AbstractC50812Vc A0Y(C76223bS c76223bS) {
        int i;
        C14360o3.A0B(c76223bS, 0);
        C51722Yv c51722Yv = this.A00;
        int intValue = this.A01.intValue();
        int i2 = 2131963924;
        if (intValue == 0) {
            i2 = 2131963925;
        }
        C9CV A0o = AbstractC25225BEi.A0o(C05F.A0N, AbstractC77623dm.A0F(c76223bS, i2), 0);
        if (c51722Yv == C51722Yv.A02) {
            c51722Yv = null;
        }
        C51722Yv A0h = AbstractC25225BEi.A0h(c51722Yv, A0o);
        C43362JEd c43362JEd = new C43362JEd(c76223bS, 44);
        C43362JEd c43362JEd2 = new C43362JEd(c76223bS, 43);
        if (intValue != 0) {
            if (intValue != 1) {
                if (intValue == 2) {
                    i = R.drawable.instagram_volume_none_pano_filled_24;
                } else {
                    throw B4Z.A00();
                }
            } else {
                i = R.drawable.instagram_volume_off_pano_filled_24;
            }
        } else {
            i = R.drawable.instagram_volume_pano_filled_24;
        }
        return new C26642Bpd(A0h, null, c43362JEd, c43362JEd2, AbstractC25228BEl.A07(c76223bS, AbstractC77623dm.A09(c76223bS)), 0.5f, i, AbstractC25228BEl.A09(c76223bS, R.color.design_dark_default_color_on_background));
    }

    public C26313BkK(C51722Yv c51722Yv, Integer num) {
        this.A01 = num;
        this.A00 = c51722Yv;
    }
}
