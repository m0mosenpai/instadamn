package X;

import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import com.facebook.R;

/* renamed from: X.BoT, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C26570BoT extends AbstractC51572Yf {
    public final float A00;
    public final float A01;
    public final int A02;
    public final int A03;
    public final String A04;
    public final String A05;
    public final String A06;
    public final String A07;
    public final InterfaceC16660sJ A08;
    public static final long A0A = Double.doubleToRawLongBits(5.0d);
    public static final long A0C = Double.doubleToRawLongBits(27.26d);
    public static final long A09 = Double.doubleToRawLongBits(10.22d);
    public static final long A0B = Double.doubleToRawLongBits(6.82d);
    public static final float[] A0H = {0.0f, 0.0f, 50.0f, 50.0f, 50.0f, 50.0f, 0.0f, 0.0f};
    public static final float[] A0I = {0.0f, 0.0f, 50.0f, 50.0f, 0.0f, 0.0f, 0.0f, 0.0f};
    public static final float[] A0G = {0.0f, 0.0f, 0.0f, 0.0f, 50.0f, 50.0f, 0.0f, 0.0f};
    public static final float[] A0E = {50.0f, 50.0f, 0.0f, 0.0f, 0.0f, 0.0f, 50.0f, 50.0f};
    public static final float[] A0F = {50.0f, 50.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f};
    public static final float[] A0D = {0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 50.0f, 50.0f};
    public static final float[] A0K = {50.0f, 50.0f, 50.0f, 50.0f, 50.0f, 50.0f, 50.0f, 50.0f};
    public static final float[] A0L = {50.0f, 50.0f, 50.0f, 50.0f, 0.0f, 0.0f, 0.0f, 0.0f};
    public static final float[] A0J = {0.0f, 0.0f, 0.0f, 0.0f, 50.0f, 50.0f, 50.0f, 50.0f};
    public static final int[] A0M = {Color.parseColor("#80000000"), Color.parseColor("#4D000000"), Color.parseColor("#33000000"), Color.parseColor("#26000000"), Color.parseColor("#1F000000"), Color.parseColor("#15000000"), Color.parseColor("#0C000000"), Color.parseColor("#08000000"), Color.parseColor("#04000000"), Color.parseColor("#02000000"), Color.parseColor("#01000000"), Color.parseColor("#00000000")};

    public C26570BoT(String str, String str2, String str3, String str4, InterfaceC16660sJ interfaceC16660sJ, float f, float f2, int i, int i2) {
        C14360o3.A0B(interfaceC16660sJ, 5);
        this.A06 = str;
        this.A07 = str2;
        this.A04 = str3;
        this.A05 = str4;
        this.A08 = interfaceC16660sJ;
        this.A02 = i;
        this.A03 = i2;
        this.A00 = f;
        this.A01 = f2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v1, types: [X.Bjd, X.3dx] */
    /* JADX WARN: Type inference failed for: r13v1, types: [X.Bjd, X.3dx] */
    @Override // X.AbstractC51572Yf
    public final AbstractC50812Vc A0Y(C76223bS c76223bS) {
        float[] fArr;
        C14360o3.A0B(c76223bS, 0);
        Object A00 = AbstractC77183d4.A00(c76223bS, C29890DGe.A00(this, 18), new Object[0]);
        Object A002 = AbstractC77183d4.A00(c76223bS, C29890DGe.A00(this, 17), new Object[0]);
        float f = this.A00;
        float f2 = f * 0.2f;
        C51722Yv c51722Yv = (C51722Yv) AbstractC77183d4.A00(c76223bS, C29896DGk.A00(c76223bS, this, 10), new Object[0]);
        C75933ay c75933ay = C51722Yv.A02;
        long A092 = AbstractC25225BEi.A09(f);
        Integer num = C05F.A01;
        C51722Yv c51722Yv2 = null;
        Object[] objArr = 0;
        C51722Yv A003 = C9CU.A00(null, num, 0, A092);
        float f3 = this.A01;
        long A093 = AbstractC25225BEi.A09(f3);
        Integer num2 = C05F.A00;
        C51722Yv A004 = C9CU.A00(A003, num2, 0, A093);
        C2Z0 A12 = AbstractC25232BEp.A12(c76223bS);
        C2XE ArD = A12.ArD();
        C26660Bpv c26660Bpv = new C26660Bpv();
        ?? abstractC77733dx = new AbstractC77733dx(c26660Bpv, ArD, 0);
        abstractC77733dx.A00 = c26660Bpv;
        abstractC77733dx.A01 = ArD;
        abstractC77733dx.A00.A00 = AbstractC08820cl.A03(this.A07);
        C2XH c2xh = abstractC77733dx.A02;
        int A005 = c2xh.A00(f);
        AbstractC50792Va abstractC50792Va = abstractC77733dx.A00;
        abstractC50792Va.A0a().A0F(A005);
        abstractC50792Va.A0a().A0L(c2xh.A00(f3));
        C27771Wf c27771Wf = C27771Wf.A0b;
        C27811Wj A006 = C1X4.A00(c27771Wf);
        InterfaceC27851Wn interfaceC27851Wn = InterfaceC27851Wn.A01;
        A006.A0H = interfaceC27851Wn;
        int i = this.A03;
        boolean z = false;
        int i2 = 1;
        boolean A1N = AbstractC167007dF.A1N(i);
        int i3 = this.A02;
        if (i == i3 - 1) {
            z = true;
        }
        if (i3 == 1) {
            fArr = A0K;
        } else if (A1N) {
            fArr = A0E;
        } else {
            if (z) {
                fArr = A0H;
            }
            C27771Wf c27771Wf2 = new C27771Wf(A006);
            C26660Bpv c26660Bpv2 = abstractC77733dx.A00;
            c26660Bpv2.A01 = c27771Wf2;
            c26660Bpv2.A03 = "ReelComponent";
            EnumC77933eL enumC77933eL = EnumC77933eL.ABSOLUTE;
            abstractC77733dx.A09(enumC77933eL);
            abstractC77733dx.A03();
            C26660Bpv c26660Bpv3 = abstractC77733dx.A00;
            C14360o3.A07(c26660Bpv3);
            A12.A00(c26660Bpv3);
            C3e8 c3e8 = C3e8.SPACE_BETWEEN;
            C51722Yv A15 = AbstractC25232BEp.A15(AbstractC25234BEr.A0N(null, num, num2, 100.0f, 0), C05F.A0Y, enumC77933eL);
            C2Z0 A13 = AbstractC25232BEp.A13(A12);
            long A094 = AbstractC25225BEi.A09(f2);
            C51722Yv A007 = C9CV.A00(C9CU.A00(AbstractC25233BEq.A0T(null, AbstractC25225BEi.A0n(num, 0, A094), num2, 100.0f, 0), C05F.A0u, 0, A09), num2, A00, 4);
            C2XE c2xe = A13.A00;
            C2Z0 A0P = AbstractC167007dF.A0P(c2xe);
            long doubleToRawLongBits = Double.doubleToRawLongBits(20.447999954223633d);
            C51722Yv A008 = C9CU.A00(C9CU.A00(null, num, 0, doubleToRawLongBits), num2, 0, doubleToRawLongBits);
            long j = A0A;
            Integer num3 = C05F.A09;
            C51722Yv A009 = C9CU.A00(A008, num3, 0, j);
            C2XE c2xe2 = A0P.A00;
            C2Z0 A0P2 = AbstractC167007dF.A0P(c2xe2);
            C2XE ArD2 = A0P2.ArD();
            C26660Bpv c26660Bpv4 = new C26660Bpv();
            ?? abstractC77733dx2 = new AbstractC77733dx(c26660Bpv4, ArD2, 0);
            abstractC77733dx2.A00 = c26660Bpv4;
            abstractC77733dx2.A01 = ArD2;
            abstractC77733dx2.A00.A00 = AbstractC08820cl.A03(this.A05);
            C2XH c2xh2 = abstractC77733dx2.A02;
            int A0010 = c2xh2.A00(20.448f);
            AbstractC50792Va abstractC50792Va2 = abstractC77733dx2.A00;
            abstractC50792Va2.A0a().A0F(A0010);
            abstractC50792Va2.A0a().A0L(c2xh2.A00(20.448f));
            C27811Wj A0011 = C1X4.A00(c27771Wf);
            A0011.A0H = interfaceC27851Wn;
            A0011.A0J = C59182nJ.A04;
            C27771Wf c27771Wf3 = new C27771Wf(A0011);
            C26660Bpv c26660Bpv5 = abstractC77733dx2.A00;
            c26660Bpv5.A01 = c27771Wf3;
            c26660Bpv5.A03 = "ReelComponent";
            abstractC77733dx2.A03();
            C26660Bpv c26660Bpv6 = abstractC77733dx2.A00;
            C14360o3.A07(c26660Bpv6);
            AbstractC25230BEn.A1H(c26660Bpv6, A0P2, A0P, A009);
            C51722Yv A0012 = C9CU.A00(null, num3, 0, j);
            AbstractC25231BEo.A1A(new C26567BoQ(c51722Yv2, objArr == true ? 1 : 0, C88.A0S, this.A04, C05F.A1I, i2, 240), AbstractC167007dF.A0P(c2xe2), A0P, A0012);
            A13.A00(AbstractC76963ci.A0H(A0P, A13, A007));
            C51722Yv A0013 = C9CV.A00(AbstractC25233BEq.A0T(null, AbstractC25225BEi.A0n(num, 0, A094), num2, 100.0f, 0), num2, A002, 4);
            C2Z0 A0P3 = AbstractC167007dF.A0P(c2xe);
            long j2 = A0C;
            C51722Yv A0014 = C9CU.A00(C9CU.A00(null, num, 0, j2), num2, 0, j2);
            long j3 = A0B;
            C51722Yv A0E2 = AbstractC25234BEr.A0E(A0014, AbstractC25227BEk.A0a(0, j3), 0, j3);
            C2Z0 A132 = AbstractC25232BEp.A13(A0P3);
            Drawable A0E3 = AbstractC77623dm.A0E(A132, R.drawable.instagram_reels_filled_32);
            ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER_CROP;
            C80403iV A03 = C80393iU.A03(A132.ArD());
            A03.A0D(A0E3);
            A03.A0E(scaleType);
            A03.A0C();
            AbstractC25230BEn.A1H(A03.A0A(), A132, A0P3, A0E2);
            A13.A00(AbstractC76963ci.A0E(A0P3, A13, A0013));
            return new C26555BoE(AbstractC25227BEk.A0V(AbstractC76963ci.A07(A13, A12, A15, null, c3e8), A12, c76223bS, A004), c51722Yv, new C29472Cym(num, num, num), C29890DGe.A00(this, 16), null);
        }
        A006.A0J = new C59182nJ(fArr, 0.0f, false, false);
        C27771Wf c27771Wf22 = new C27771Wf(A006);
        C26660Bpv c26660Bpv22 = abstractC77733dx.A00;
        c26660Bpv22.A01 = c27771Wf22;
        c26660Bpv22.A03 = "ReelComponent";
        EnumC77933eL enumC77933eL2 = EnumC77933eL.ABSOLUTE;
        abstractC77733dx.A09(enumC77933eL2);
        abstractC77733dx.A03();
        C26660Bpv c26660Bpv32 = abstractC77733dx.A00;
        C14360o3.A07(c26660Bpv32);
        A12.A00(c26660Bpv32);
        C3e8 c3e82 = C3e8.SPACE_BETWEEN;
        C51722Yv A152 = AbstractC25232BEp.A15(AbstractC25234BEr.A0N(null, num, num2, 100.0f, 0), C05F.A0Y, enumC77933eL2);
        C2Z0 A133 = AbstractC25232BEp.A13(A12);
        long A0942 = AbstractC25225BEi.A09(f2);
        C51722Yv A0072 = C9CV.A00(C9CU.A00(AbstractC25233BEq.A0T(null, AbstractC25225BEi.A0n(num, 0, A0942), num2, 100.0f, 0), C05F.A0u, 0, A09), num2, A00, 4);
        C2XE c2xe3 = A133.A00;
        C2Z0 A0P4 = AbstractC167007dF.A0P(c2xe3);
        long doubleToRawLongBits2 = Double.doubleToRawLongBits(20.447999954223633d);
        C51722Yv A0082 = C9CU.A00(C9CU.A00(null, num, 0, doubleToRawLongBits2), num2, 0, doubleToRawLongBits2);
        long j4 = A0A;
        Integer num32 = C05F.A09;
        C51722Yv A0092 = C9CU.A00(A0082, num32, 0, j4);
        C2XE c2xe22 = A0P4.A00;
        C2Z0 A0P22 = AbstractC167007dF.A0P(c2xe22);
        C2XE ArD22 = A0P22.ArD();
        C26660Bpv c26660Bpv42 = new C26660Bpv();
        ?? abstractC77733dx22 = new AbstractC77733dx(c26660Bpv42, ArD22, 0);
        abstractC77733dx22.A00 = c26660Bpv42;
        abstractC77733dx22.A01 = ArD22;
        abstractC77733dx22.A00.A00 = AbstractC08820cl.A03(this.A05);
        C2XH c2xh22 = abstractC77733dx22.A02;
        int A00102 = c2xh22.A00(20.448f);
        AbstractC50792Va abstractC50792Va22 = abstractC77733dx22.A00;
        abstractC50792Va22.A0a().A0F(A00102);
        abstractC50792Va22.A0a().A0L(c2xh22.A00(20.448f));
        C27811Wj A00112 = C1X4.A00(c27771Wf);
        A00112.A0H = interfaceC27851Wn;
        A00112.A0J = C59182nJ.A04;
        C27771Wf c27771Wf32 = new C27771Wf(A00112);
        C26660Bpv c26660Bpv52 = abstractC77733dx22.A00;
        c26660Bpv52.A01 = c27771Wf32;
        c26660Bpv52.A03 = "ReelComponent";
        abstractC77733dx22.A03();
        C26660Bpv c26660Bpv62 = abstractC77733dx22.A00;
        C14360o3.A07(c26660Bpv62);
        AbstractC25230BEn.A1H(c26660Bpv62, A0P22, A0P4, A0092);
        C51722Yv A00122 = C9CU.A00(null, num32, 0, j4);
        AbstractC25231BEo.A1A(new C26567BoQ(c51722Yv2, objArr == true ? 1 : 0, C88.A0S, this.A04, C05F.A1I, i2, 240), AbstractC167007dF.A0P(c2xe22), A0P4, A00122);
        A133.A00(AbstractC76963ci.A0H(A0P4, A133, A0072));
        C51722Yv A00132 = C9CV.A00(AbstractC25233BEq.A0T(null, AbstractC25225BEi.A0n(num, 0, A0942), num2, 100.0f, 0), num2, A002, 4);
        C2Z0 A0P32 = AbstractC167007dF.A0P(c2xe3);
        long j22 = A0C;
        C51722Yv A00142 = C9CU.A00(C9CU.A00(null, num, 0, j22), num2, 0, j22);
        long j32 = A0B;
        C51722Yv A0E22 = AbstractC25234BEr.A0E(A00142, AbstractC25227BEk.A0a(0, j32), 0, j32);
        C2Z0 A1322 = AbstractC25232BEp.A13(A0P32);
        Drawable A0E32 = AbstractC77623dm.A0E(A1322, R.drawable.instagram_reels_filled_32);
        ImageView.ScaleType scaleType2 = ImageView.ScaleType.CENTER_CROP;
        C80403iV A032 = C80393iU.A03(A1322.ArD());
        A032.A0D(A0E32);
        A032.A0E(scaleType2);
        A032.A0C();
        AbstractC25230BEn.A1H(A032.A0A(), A1322, A0P32, A0E22);
        A133.A00(AbstractC76963ci.A0E(A0P32, A133, A00132));
        return new C26555BoE(AbstractC25227BEk.A0V(AbstractC76963ci.A07(A133, A12, A152, null, c3e82), A12, c76223bS, A004), c51722Yv, new C29472Cym(num, num, num), C29890DGe.A00(this, 16), null);
    }
}
