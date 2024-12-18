package X;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;

/* renamed from: X.3rb, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C85463rb extends AbstractC51572Yf {
    public static final int[][] A05 = {new int[]{R.attr.state_enabled, R.attr.state_selected}, new int[]{R.attr.state_enabled, R.attr.state_pressed}, new int[]{-16842910}, new int[0]};
    public final int A00;
    public final int A01;
    public final ImageView.ScaleType A02;
    public final C51722Yv A03;
    public final Integer A04;

    @Override // X.AbstractC51572Yf
    public final AbstractC50812Vc A0Y(C76223bS c76223bS) {
        int i;
        int i2;
        C14360o3.A0B(c76223bS, 0);
        final Integer num = this.A04;
        if (num != null) {
            i = num.intValue();
            i2 = num.intValue();
        } else {
            i = this.A00;
            i2 = i;
        }
        final int i3 = this.A00;
        final int i4 = this.A01;
        C2XE c2xe = c76223bS.A05;
        final C2XH c2xh = c2xe.A0D;
        C14360o3.A07(c2xh);
        final Context context = c2xe.A0C;
        C14360o3.A07(context);
        AbstractC85593ro abstractC85593ro = new AbstractC85593ro(context, c2xh, num, i4, i3) { // from class: X.3rn
            public final int A00;
            public final int A01;
            public final Configuration A02;
            public final Integer A03;

            @Override // X.C2VB
            /* renamed from: CTy */
            public final boolean CTz(InterfaceC85603rp interfaceC85603rp) {
                C85583rn c85583rn;
                C14360o3.A0B(interfaceC85603rp, 0);
                if (this == interfaceC85603rp || ((interfaceC85603rp instanceof C85583rn) && (c85583rn = (C85583rn) interfaceC85603rp) != null && c85583rn.A01 == this.A01 && C14360o3.A0K(c85583rn.A02, this.A02) && c85583rn.A00 == this.A00 && C14360o3.A0K(c85583rn.A03, this.A03))) {
                    return true;
                }
                return false;
            }

            {
                Drawable drawable;
                Configuration configuration = new Configuration(context.getResources().getConfiguration());
                if (i4 != 0 && (drawable = c2xh.A00.getDrawable(i4)) != null) {
                    super.A00 = drawable;
                    this.A01 = i4;
                    this.A02 = configuration;
                    this.A03 = num;
                    this.A00 = i3;
                    return;
                }
                throw new IllegalArgumentException(AnonymousClass001.A0R(AbstractC111324zv.A00(624), Integer.toHexString(i4)));
            }
        };
        abstractC85593ro.setTintList(new ColorStateList(A05, new int[]{i, i2, i3, i3}));
        ImageView.ScaleType scaleType = this.A02;
        C51722Yv c51722Yv = this.A03;
        C80403iV A03 = C80393iU.A03(c2xe);
        A03.A0D(abstractC85593ro);
        A03.A0E(scaleType);
        A03.A0C();
        AbstractC77743dy.A00(A03, c51722Yv);
        return A03.A0A();
    }

    public C85463rb(ImageView.ScaleType scaleType, C51722Yv c51722Yv, Integer num, int i, int i2) {
        this.A01 = i;
        this.A00 = i2;
        this.A04 = num;
        this.A02 = scaleType;
        this.A03 = c51722Yv;
    }
}
