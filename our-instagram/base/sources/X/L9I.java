package X;

import android.content.Context;
import android.content.res.Resources;
import com.facebook.R;
import java.util.List;

/* loaded from: classes8.dex */
public final class L9I {
    public Integer A03;
    public Integer A04;
    public Integer A05;
    public Integer A06;
    public Integer A08;
    public Integer A09;
    public boolean A0C;
    public final int A0H;
    public final Context A0I;
    public final String A0J;
    public final List A0K;
    public boolean A0G = false;
    public Integer A07 = C05F.A00;
    public boolean A0B = false;
    public boolean A0F = true;
    public boolean A0D = false;
    public float A00 = 0.4f;
    public int A01 = 3;
    public int A02 = 0;
    public boolean A0A = false;
    public boolean A0E = false;

    public final C89553yv A00() {
        if (this.A09 == null) {
            this.A09 = Integer.valueOf(AbstractC166987dD.A0C(this.A0I, 2));
        }
        if (this.A08 == null) {
            try {
                Context context = this.A0I;
                this.A08 = AbstractC31174DnI.A0q(context, AbstractC53242c7.A0D(context));
            } catch (Resources.NotFoundException e) {
                Context context2 = this.A0I;
                AbstractC53172bz.A03(context2, e);
                context2.getTheme().applyStyle(AbstractC53172bz.A00(), true);
                this.A08 = AbstractC31174DnI.A0q(context2, AbstractC53242c7.A0D(context2));
            }
        }
        if (this.A05 == null) {
            this.A05 = AbstractC31174DnI.A0q(this.A0I, R.color.grey_5);
        }
        if (this.A04 == null) {
            this.A04 = this.A08;
        }
        Integer num = this.A03;
        if (num == null) {
            num = AbstractC31174DnI.A0q(this.A0I, R.color.grey_5);
            this.A03 = num;
        }
        Context context3 = this.A0I;
        List list = this.A0K;
        int i = this.A0H;
        boolean z = this.A0G;
        Integer num2 = this.A07;
        boolean z2 = this.A0B;
        boolean z3 = this.A0F;
        boolean z4 = this.A0D;
        float f = this.A00;
        int intValue = this.A09.intValue();
        int intValue2 = this.A08.intValue();
        int i2 = this.A01;
        int i3 = this.A02;
        int intValue3 = this.A05.intValue();
        int intValue4 = this.A04.intValue();
        boolean z5 = this.A0A;
        int intValue5 = num.intValue();
        return AbstractC89523ys.A00(context3, null, num2, null, null, null, this.A06, null, this.A0J, list, f, i, intValue, intValue2, i2, i3, intValue3, intValue4, intValue5, z, z2, z3, z4, z5, this.A0C, this.A0E, true);
    }

    public L9I(Context context, String str, List list, int i) {
        this.A0I = context;
        this.A0K = list;
        this.A0H = i;
        this.A0J = str;
    }

    public final void A01(int i) {
        this.A09 = Integer.valueOf(i);
    }
}
