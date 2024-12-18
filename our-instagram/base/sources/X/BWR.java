package X;

import android.content.Context;
import android.graphics.Typeface;
import com.facebook.R;
import com.facebook.common.dextricks.Constants;

/* loaded from: classes5.dex */
public final class BWR extends AbstractC51572Yf {
    public final float A00;
    public final float A01;
    public final int A02;
    public final int A03;
    public final int A04;
    public final int A05;
    public final int A06;
    public final int A07;
    public final int A08;
    public final long A09;
    public final C51722Yv A0A;
    public final String A0B;
    public final String A0C;
    public final boolean A0D;

    @Override // X.AbstractC51572Yf
    public final AbstractC50812Vc A0Y(C76223bS c76223bS) {
        long A0D;
        C14360o3.A0B(c76223bS, 0);
        float AYS = C56352iT.A0t.A03(AbstractC25228BEl.A0J(c76223bS)).AYS();
        boolean z = this.A0D;
        int i = this.A08;
        if (z) {
            A0D = AbstractC25229BEm.A0K((int) (AbstractC25228BEl.A07(c76223bS, AbstractC77623dm.A0D(c76223bS, i)) + AYS));
        } else {
            A0D = AbstractC77623dm.A0D(c76223bS, i);
        }
        C51722Yv A00 = C51722Yv.A02.A00(this.A0A);
        C2Z0 A0P = AbstractC167007dF.A0P(c76223bS.A05);
        Integer num = C05F.A08;
        C51722Yv A002 = C9CU.A00(null, num, 0, A0D);
        long A04 = AbstractC77623dm.A04(A0P);
        Integer num2 = C05F.A04;
        C51722Yv A003 = C9CU.A00(A002, num2, 0, A04);
        String str = this.A0C;
        if (str != null) {
            A003 = C9CV.A00(A003, C05F.A0N, str, 0);
        }
        Integer num3 = C05F.A01;
        C51722Yv A004 = C9CV.A00(A003, num3, false, 4);
        C30180DRl A005 = C30180DRl.A00(this, 22);
        Integer num4 = C05F.A1F;
        C51722Yv A006 = C9CV.A00(A004, num4, A005, 4);
        int i2 = this.A07;
        C2XE c2xe = A0P.A00;
        Context context = c2xe.A0C;
        int A06 = AbstractC25228BEl.A06(context, A0P, this.A06);
        long j = this.A09;
        float f = this.A01;
        Typeface create = Typeface.create("sans-serif-medium", 0);
        long A0D2 = AbstractC25229BEm.A0D();
        Integer num5 = C05F.A00;
        C77723dw A0a = AbstractC25231BEo.A0a(c2xe, null, str, 0);
        AbstractC25233BEq.A1B(A0P, A0a, A06, j);
        A0a.A0S(0);
        AbstractC25234BEr.A0o(create, A0P, A0a, A0D2);
        A0a.A0B();
        AbstractC25233BEq.A1E(A0a, num5, f, false);
        A0a.A0M(i2);
        AbstractC25234BEr.A17(A006, A0a, false);
        AbstractC25227BEk.A1J(A0P, A0a);
        C51722Yv A0Y = AbstractC25233BEq.A0Y(AbstractC25233BEq.A0Y(null, A0P, num, this.A05, 0), A0P, num2, this.A03, 0);
        String str2 = this.A0B;
        if (str2 != null) {
            A0Y = C9CV.A00(A0Y, C05F.A0N, str2, 0);
        }
        C51722Yv A007 = C9CV.A00(C9CV.A00(A0Y, num3, false, 4), num4, C30180DRl.A00(this, 23), 4);
        int A062 = AbstractC25228BEl.A06(context, A0P, this.A02);
        long A0D3 = AbstractC77623dm.A0D(A0P, this.A04);
        float f2 = this.A00;
        Typeface typeface = Typeface.SANS_SERIF;
        C77723dw A0a2 = AbstractC25231BEo.A0a(c2xe, null, str2, 0);
        AbstractC25233BEq.A1B(A0P, A0a2, A062, A0D3);
        A0a2.A0S(0);
        AbstractC25234BEr.A0o(typeface, A0P, A0a2, A0D2);
        A0a2.A0B();
        AbstractC25233BEq.A1E(A0a2, num5, f2, false);
        A0a2.A0M(3);
        AbstractC25234BEr.A17(A007, A0a2, false);
        AbstractC25227BEk.A1J(A0P, A0a2);
        return AbstractC76963ci.A03(A0P, c76223bS, A00);
    }

    public /* synthetic */ BWR(C51722Yv c51722Yv, String str, String str2, float f, float f2, int i, int i2, int i3, int i4, int i5, int i6, long j, boolean z) {
        float f3 = f2;
        float f4 = f;
        int i7 = i2;
        int i8 = i;
        int i9 = i4;
        int i10 = i3;
        int i11 = i5;
        long j2 = j;
        int i12 = (i6 & 16) != 0 ? 2 : 0;
        c51722Yv = (i6 & 64) != 0 ? null : c51722Yv;
        i8 = (i6 & 128) != 0 ? R.attr.igds_color_text_on_color : i8;
        i7 = (i6 & 256) != 0 ? R.attr.igds_color_text_on_color : i7;
        i10 = (i6 & 1024) != 0 ? R.dimen.abc_dialog_padding_material : i10;
        i9 = (i6 & C3OO.FLAG_MOVED) != 0 ? R.dimen.ab_test_media_thumbnail_preview_item_internal_padding : i9;
        i11 = (i6 & 4096) != 0 ? R.dimen.abc_dropdownitem_icon_width : i11;
        j2 = (i6 & 8192) != 0 ? AbstractC25232BEp.A0r(20.0f) : j2;
        int i13 = (i6 & Constants.LOAD_RESULT_DEX2OAT_CLASSPATH_SET) != 0 ? R.dimen.abc_text_size_menu_header_material : 0;
        boolean A1U = AbstractC25226BEj.A1U(32768 & i6, z);
        f4 = (65536 & i6) != 0 ? 1.09f : f4;
        f3 = (i6 & Constants.LOAD_RESULT_DEX2OAT_TRY_PERIODIC_PGO_COMP) != 0 ? 1.28f : f3;
        this.A0C = str;
        this.A0B = str2;
        this.A07 = i12;
        this.A0A = c51722Yv;
        this.A06 = i8;
        this.A02 = i7;
        this.A08 = i10;
        this.A05 = i9;
        this.A03 = i11;
        this.A09 = j2;
        this.A04 = i13;
        this.A0D = A1U;
        this.A01 = f4;
        this.A00 = f3;
    }
}
