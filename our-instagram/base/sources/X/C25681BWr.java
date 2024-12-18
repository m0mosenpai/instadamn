package X;

import com.facebook.common.dextricks.JITProfilePQR;
import com.facebook.forker.Process;
import com.facebook.litho.annotations.Comparable;
import com.facebook.litho.annotations.Prop;
import java.util.Collections;
import java.util.List;

/* renamed from: X.BWr, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C25681BWr extends AbstractC50792Va {

    @Comparable(type = 3)
    @Prop(optional = true, resType = EnumC27347C5c.DIMEN_SIZE)
    public int A00;

    @Comparable(type = 3)
    @Prop(optional = true, resType = EnumC27347C5c.NONE)
    public int A01;

    @Comparable(type = JITProfilePQR.HEADER_COMPRESSED_SIZE_OFFSET)
    @Prop(optional = true, resType = EnumC27347C5c.NONE)
    public C3F1 A02;

    @Comparable(type = 10)
    @Prop(optional = true, resType = EnumC27347C5c.NONE)
    public AbstractC50812Vc A03;

    @Comparable(type = 10)
    @Prop(optional = true, resType = EnumC27347C5c.NONE)
    public AbstractC50812Vc A04;

    @Comparable(type = 10)
    @Prop(optional = true, resType = EnumC27347C5c.NONE)
    public AbstractC50812Vc A05;
    public C51422Xp A06;
    public C51422Xp A07;
    public C51422Xp A08;

    @Comparable(type = Process.SIGTERM)
    @Prop(optional = false, resType = EnumC27347C5c.NONE)
    public AbstractC169857hz A09;

    @Comparable(type = JITProfilePQR.HEADER_COMPRESSED_SIZE_OFFSET)
    @Prop(optional = true, resType = EnumC27347C5c.NONE)
    public C26668Bq3 A0A;

    @Comparable(type = JITProfilePQR.HEADER_COMPRESSED_SIZE_OFFSET)
    @Prop(optional = true, resType = EnumC27347C5c.NONE)
    public InterfaceC169817hv A0B;

    @Comparable(type = 5)
    @Prop(optional = true, resType = EnumC27347C5c.NONE, varArg = "itemDecoration")
    public List A0C;

    @Comparable(type = 5)
    @Prop(optional = true, resType = EnumC27347C5c.NONE, varArg = "onScrollListener")
    public List A0D;

    @Comparable(type = 3)
    @Prop(optional = true, resType = EnumC27347C5c.NONE)
    public boolean A0E;

    @Comparable(type = 3)
    @Prop(optional = true, resType = EnumC27347C5c.NONE)
    public boolean A0F;

    @Override // X.AbstractC50792Va
    public final boolean A10() {
        return true;
    }

    @Override // X.AbstractC50792Va
    public final boolean A12() {
        return true;
    }

    public C25681BWr() {
        super("RecyclerCollectionComponent");
        this.A02 = CNL.A00;
        this.A0C = Collections.emptyList();
        this.A0D = Collections.emptyList();
        this.A01 = 0;
        this.A0B = CNL.A01;
    }

    @Override // X.AbstractC50812Vc
    public final Object[] A0X() {
        Object[] objArr = new Object[49];
        Boolean A0b = AbstractC166997dE.A0b();
        System.arraycopy(new Object[]{null, false, false, 0, false, A0b, A0b, false, Boolean.valueOf(this.A0E), null, this.A03, this.A04, this.A0A, Integer.valueOf(this.A00), false, Boolean.valueOf(this.A0F), false, A0b, A0b, A0b, A0b, A0b, this.A02, this.A0C, null, 0, null}, 0, objArr, 0, 27);
        System.arraycopy(new Object[]{this.A05, A0b, this.A0D, Integer.valueOf(this.A01), this.A0B, null, null, AbstractC25227BEk.A0o(), null, -12425294, 0, 0, this.A09, null, null, false, false, null, null, 0, null, false}, 0, objArr, 27, 22);
        return objArr;
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x007c, code lost:
    
        if (r0 != false) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0067, code lost:
    
        if (r0 != null) goto L9;
     */
    @Override // X.AbstractC50792Va
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.AbstractC50812Vc A0c(X.C2XE r49) {
        /*
            Method dump skipped, instructions count: 389
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C25681BWr.A0c(X.2XE):X.2Vc");
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [X.2Vo, java.lang.Object] */
    @Override // X.AbstractC50792Va
    public final /* bridge */ /* synthetic */ AbstractC50922Vo A0g() {
        return new Object();
    }

    @Override // X.AbstractC50792Va
    public final Object A0h(C2V9 c2v9, Object obj) {
        if (c2v9.A01 == -1048037474) {
            C51372Xk.A02(c2v9.A00.A00, (C27861CPy) obj);
        }
        return null;
    }

    @Override // X.AbstractC50792Va
    public final void A0q(C2XE c2xe, C2XM c2xm) {
        AbstractC25230BEn.A1I(c2xe, this.A08, this, c2xm);
        AbstractC25230BEn.A1I(c2xe, this.A07, this, c2xm);
        AbstractC25230BEn.A1I(c2xe, this.A06, this, c2xm);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v2, types: [X.7iD] */
    @Override // X.AbstractC50792Va
    public final void A0x(C2XE c2xe, AbstractC50922Vo abstractC50922Vo) {
        C2V3 A00;
        C26666Bq1 c26666Bq1 = (C26666Bq1) abstractC50922Vo;
        AbstractC169857hz abstractC169857hz = this.A09;
        InterfaceC169817hv interfaceC169817hv = this.A0B;
        C26668Bq3 c26668Bq3 = this.A0A;
        InterfaceC169817hv interfaceC169817hv2 = CNL.A01;
        C169777hr BlG = interfaceC169817hv.BlG();
        InterfaceC170457iy BMU = interfaceC169817hv.BMU(c2xe);
        C170417iu c170417iu = BlG.A00;
        C2V3 c2v3 = c170417iu.A03;
        if (c2v3 == null) {
            c2v3 = c2xe.A02.A01;
        }
        C170437iw c170437iw = new C170437iw();
        boolean z = c170417iu.A09;
        boolean z2 = c170417iu.A07;
        C170937jk c170937jk = c170417iu.A04;
        Integer num = c170417iu.A06;
        boolean z3 = c170417iu.A0B;
        boolean z4 = c170417iu.A0A;
        int i = c170417iu.A01;
        boolean z5 = c170417iu.A08;
        float f = c170417iu.A00;
        Boolean bool = c170417iu.A05;
        boolean z6 = c170417iu.A0C;
        int i2 = c170417iu.A02;
        A00 = C2V3.A00(null, c2v3, null, null, null, null, null, null, -1, 31, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false);
        boolean z7 = A00.A0P;
        C2VF c2vf = A00.A02;
        C2V6 c2v6 = A00.A03;
        C2V8 c2v8 = A00.A01;
        Integer num2 = A00.A05;
        boolean z8 = A00.A0X;
        String str = A00.A07;
        boolean z9 = A00.A00;
        boolean z10 = A00.A09;
        boolean z11 = A00.A0J;
        boolean z12 = A00.A0C;
        boolean z13 = A00.A0A;
        boolean z14 = A00.A0L;
        boolean z15 = A00.A0S;
        Integer num3 = A00.A06;
        boolean z16 = A00.A0E;
        boolean z17 = A00.A0G;
        InterfaceC16660sJ interfaceC16660sJ = A00.A08;
        boolean z18 = A00.A0W;
        boolean z19 = A00.A0I;
        boolean z20 = A00.A0F;
        boolean z21 = A00.A0H;
        c170437iw.A07 = new C170417iu(AbstractC75743af.A00(c2v8, A00, c2vf, c2v6, num2, num3, str, interfaceC16660sJ, z10, z13, z12, A00.A0D, z16, z20, z17, z21, z9, z19, z11, z14, AbstractC167007dF.A1M(c2v3.A0M ? 1 : 0), A00.A0N, z7, z15, z18, z8), c170937jk, bool, num, f, i, i2, z, z2, z3, z4, z5, z6);
        c170437iw.A04 = BMU;
        C7i4 c7i4 = new C7i4(c170437iw.A00(c2xe));
        C169827hw c169827hw = new C169827hw(c2xe);
        AbstractC61802rh By2 = interfaceC169817hv.By2();
        String str2 = abstractC169857hz.A09;
        if (str2 == null) {
            str2 = "";
        }
        C169917i6 c169917i6 = new C169917i6(c169827hw, c7i4, str2);
        C26668Bq3 c26668Bq32 = c26668Bq3;
        if (c26668Bq3 == null) {
            c26668Bq32 = new C169987iD();
        }
        c26668Bq32.A00 = c169917i6;
        C28170CbH c28170CbH = new C28170CbH(c2xe, c26668Bq32);
        c169917i6.A05 = c28170CbH;
        AYO ayo = new AYO(c169917i6);
        C2Z5 c2z5 = c7i4.A00;
        C170647jH c170647jH = c2z5.A0Y;
        synchronized (c170647jH) {
            c170647jH.A07.add(ayo);
        }
        c2z5.A0E = false;
        C6H c6h = C6H.LOADING;
        if (By2 != null) {
            c26666Bq1.A00 = By2;
        }
        c26666Bq1.A01 = c169917i6;
        c26666Bq1.A03 = c28170CbH;
        c26666Bq1.A05 = c7i4;
        c26666Bq1.A02 = c6h;
        c26666Bq1.A04 = c26668Bq32;
        c26666Bq1.A06 = BMU;
    }

    @Override // X.AbstractC50812Vc
    public final /* bridge */ /* synthetic */ AbstractC50812Vc A0P() {
        AbstractC50812Vc abstractC50812Vc;
        AbstractC50812Vc abstractC50812Vc2;
        AbstractC50812Vc abstractC50812Vc3;
        C25681BWr c25681BWr = (C25681BWr) super.A0P();
        AbstractC50812Vc abstractC50812Vc4 = c25681BWr.A03;
        AbstractC169857hz abstractC169857hz = null;
        if (abstractC50812Vc4 != null) {
            abstractC50812Vc = abstractC50812Vc4.A0P();
        } else {
            abstractC50812Vc = null;
        }
        c25681BWr.A03 = abstractC50812Vc;
        AbstractC50812Vc abstractC50812Vc5 = c25681BWr.A04;
        if (abstractC50812Vc5 != null) {
            abstractC50812Vc2 = abstractC50812Vc5.A0P();
        } else {
            abstractC50812Vc2 = null;
        }
        c25681BWr.A04 = abstractC50812Vc2;
        AbstractC50812Vc abstractC50812Vc6 = c25681BWr.A05;
        if (abstractC50812Vc6 != null) {
            abstractC50812Vc3 = abstractC50812Vc6.A0P();
        } else {
            abstractC50812Vc3 = null;
        }
        c25681BWr.A05 = abstractC50812Vc3;
        AbstractC169857hz abstractC169857hz2 = c25681BWr.A09;
        if (abstractC169857hz2 != null) {
            abstractC169857hz = abstractC169857hz2.A04(false);
        }
        c25681BWr.A09 = abstractC169857hz;
        return c25681BWr;
    }

    @Override // X.AbstractC50792Va
    public final void A0n(C2XE c2xe) {
        C2Z7 c2z7 = ((C26666Bq1) AbstractC25233BEq.A0M(c2xe)).A05;
        InterfaceC169817hv interfaceC169817hv = CNL.A01;
        c2z7.detach();
    }
}
