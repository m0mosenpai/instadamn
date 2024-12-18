package X;

import android.view.View;
import java.util.AbstractCollection;

/* renamed from: X.P5t, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C56479P5t implements InterfaceC57961Pn7 {
    public final View.OnClickListener A00;
    public final C5QE A01;
    public final Integer A02;
    public final Integer A03;
    public final Integer A04;
    public final Integer A05;
    public final Integer A06;
    public final Integer A07;
    public final String A08;
    public final String A09;
    public final InterfaceC16820sZ A0A;
    public final boolean A0B;
    public final boolean A0C;
    public final boolean A0D;
    public final boolean A0E;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C56479P5t(String str, String str2, View.OnClickListener onClickListener) {
        this(onClickListener, null, null, null, null, null, null, null, str, str2, C57381Pdf.A00, false, false, false, false);
        AbstractC167017dG.A1P(str, str2);
    }

    public static void A00(View.OnClickListener onClickListener, AbstractCollection abstractCollection, int i) {
        abstractCollection.add(new C56479P5t(onClickListener, i));
    }

    @Override // X.InterfaceC57961Pn7
    public final Integer BKE() {
        return C05F.A01;
    }

    public C56479P5t(View.OnClickListener onClickListener, int i) {
        this(onClickListener, null, null, null, Integer.valueOf(i), null, null, null, null, null, C57381Pdf.A00, false, false, false, false);
    }

    public C56479P5t(View.OnClickListener onClickListener, Integer num, int i, boolean z) {
        this(onClickListener, null, null, null, Integer.valueOf(i), num, null, null, null, null, C57381Pdf.A00, z, false, false, false);
    }

    public C56479P5t(View.OnClickListener onClickListener, C5QE c5qe, Integer num, Integer num2, Integer num3, Integer num4, Integer num5, Integer num6, String str, String str2, InterfaceC16820sZ interfaceC16820sZ, boolean z, boolean z2, boolean z3, boolean z4) {
        this.A03 = num;
        this.A02 = num2;
        this.A06 = num3;
        this.A00 = onClickListener;
        this.A05 = num4;
        this.A04 = num5;
        this.A0C = z;
        this.A0B = z2;
        this.A09 = str;
        this.A08 = str2;
        this.A01 = c5qe;
        this.A07 = num6;
        this.A0A = interfaceC16820sZ;
        this.A0E = z3;
        this.A0D = z4;
    }

    public C56479P5t(View.OnClickListener onClickListener, int i, boolean z) {
        this(onClickListener, null, null, null, Integer.valueOf(i), null, null, null, null, null, C57381Pdf.A00, false, z, false, false);
    }

    public C56479P5t(View.OnClickListener onClickListener, C5QE c5qe, int i) {
        this(onClickListener, c5qe, null, null, Integer.valueOf(i), null, null, null, null, null, C57381Pdf.A00, false, false, false, false);
    }

    public C56479P5t(View.OnClickListener onClickListener, Integer num, int i) {
        this(onClickListener, null, null, null, Integer.valueOf(i), num, null, null, null, null, C57381Pdf.A00, false, false, false, false);
    }
}
