package X;

import android.graphics.RectF;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import com.facebook.R;

/* renamed from: X.4fz, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C100874fz extends AbstractC51572Yf {
    public final C85083qw A00;
    public final C75113Zb A01;
    public final boolean A02;
    public final int A03;
    public final C76623c7 A04;
    public final Integer A05;
    public final Integer A06;

    public C100874fz(C85083qw c85083qw, C76623c7 c76623c7, C75113Zb c75113Zb, Integer num, Integer num2, int i, boolean z) {
        C14360o3.A0B(c76623c7, 1);
        C14360o3.A0B(c75113Zb, 2);
        this.A04 = c76623c7;
        this.A01 = c75113Zb;
        this.A00 = c85083qw;
        this.A03 = i;
        this.A02 = z;
        this.A05 = num;
        this.A06 = num2;
    }

    @Override // X.AbstractC51572Yf
    public final AbstractC50812Vc A0Y(C76223bS c76223bS) {
        C14360o3.A0B(c76223bS, 0);
        C100884g0 c100884g0 = (C100884g0) AbstractC77183d4.A00(c76223bS, new C206939Dy(this, 29), new Object[]{this.A04.A00.getId()});
        C75113Zb c75113Zb = this.A01;
        C2XI A00 = AbstractC77273dD.A00(c76223bS, c75113Zb, C100904g2.A00, 4, true);
        AbstractC77313dH.A00(c76223bS, new C9FA(41, this, AbstractC77183d4.A00(c76223bS, new C9FA(42, this, c76223bS), new Object[0])), new Object[]{new Object()});
        int i = c75113Zb.A09;
        int i2 = this.A03;
        Integer num = this.A05;
        Integer num2 = this.A06;
        DisplayMetrics displayMetrics = c76223bS.A05.A0C.getResources().getDisplayMetrics();
        RectF rectF = AbstractC13880nE.A01;
        C75933ay c75933ay = C51722Yv.A02;
        C51722Yv c51722Yv = new C51722Yv(new C51722Yv(null, new C9CU(C05F.A04, 0, ((int) TypedValue.applyDimension(1, 20.0f, displayMetrics)) | 9221401712017801216L)), new C9CV(C05F.A0D, Integer.valueOf(R.id.carousel_page_indicator), 4));
        Integer num3 = C05F.A0N;
        return new AnonymousClass415(A00, new C51722Yv(new C51722Yv(c51722Yv, new C9CV(num3, true, 4)), new C9CU(num3, 0, AbstractC77623dm.A0D(c76223bS, R.dimen.abc_list_item_height_large_material))), c100884g0, num, num2, i, i2);
    }
}
