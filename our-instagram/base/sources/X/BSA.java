package X;

import com.facebook.litho.annotations.Comparable;
import com.facebook.litho.annotations.Prop;

/* loaded from: classes5.dex */
public final class BSA extends AbstractC50792Va {

    @Comparable(type = 0)
    @Prop(optional = true, resType = EnumC27347C5c.DIMEN_OFFSET)
    public float A00;

    @Comparable(type = 0)
    @Prop(optional = true, resType = EnumC27347C5c.DIMEN_OFFSET)
    public float A01;

    @Comparable(type = 3)
    @Prop(optional = true, resType = EnumC27347C5c.COLOR)
    public int A02;

    @Comparable(type = 3)
    @Prop(optional = true, resType = EnumC27347C5c.COLOR)
    public int A03;

    @Comparable(type = 3)
    @Prop(optional = true, resType = EnumC27347C5c.DIMEN_OFFSET)
    public int A04;

    @Comparable(type = 3)
    @Prop(optional = true, resType = EnumC27347C5c.COLOR)
    public int A05;

    @Comparable(type = 3)
    @Prop(optional = true, resType = EnumC27347C5c.COLOR)
    public int A06;

    @Comparable(type = 10)
    @Prop(optional = false, resType = EnumC27347C5c.NONE)
    public AbstractC50812Vc A07;

    @Comparable(type = 3)
    @Prop(optional = true, resType = EnumC27347C5c.NONE)
    public boolean A08;

    @Comparable(type = 3)
    @Prop(optional = true, resType = EnumC27347C5c.NONE)
    public boolean A09;

    @Comparable(type = 3)
    @Prop(optional = true, resType = EnumC27347C5c.NONE)
    public boolean A0A;

    @Comparable(type = 3)
    @Prop(optional = true, resType = EnumC27347C5c.NONE)
    public boolean A0B;

    @Comparable(type = 3)
    @Prop(optional = true, resType = EnumC27347C5c.NONE)
    public boolean A0C;

    public BSA() {
        super("Card");
        this.A02 = -1;
        this.A03 = Integer.MIN_VALUE;
        this.A00 = -1.0f;
        this.A01 = -1.0f;
        this.A04 = -1;
        this.A05 = 50331648;
        this.A06 = 922746880;
        this.A0C = false;
    }

    @Override // X.AbstractC50812Vc
    public final Object[] A0X() {
        Integer valueOf = Integer.valueOf(this.A02);
        Integer valueOf2 = Integer.valueOf(this.A03);
        AbstractC50812Vc abstractC50812Vc = this.A07;
        Float valueOf3 = Float.valueOf(this.A00);
        Boolean valueOf4 = Boolean.valueOf(this.A08);
        Boolean valueOf5 = Boolean.valueOf(this.A09);
        Boolean valueOf6 = Boolean.valueOf(this.A0A);
        Boolean valueOf7 = Boolean.valueOf(this.A0B);
        Float valueOf8 = Float.valueOf(this.A01);
        Integer valueOf9 = Integer.valueOf(this.A04);
        Integer valueOf10 = Integer.valueOf(this.A05);
        Float valueOf11 = Float.valueOf(-1.0f);
        return new Object[]{valueOf, null, null, valueOf2, abstractC50812Vc, valueOf3, valueOf4, valueOf5, valueOf6, valueOf7, valueOf8, valueOf9, valueOf10, valueOf11, valueOf11, Integer.valueOf(this.A06), AbstractC25227BEk.A0o(), Boolean.valueOf(this.A0C)};
    }

    /* JADX WARN: Code restructure failed: missing block: B:51:0x0174, code lost:
    
        if (r9 == false) goto L55;
     */
    /* JADX WARN: Type inference failed for: r15v6, types: [X.Bji, X.3dx] */
    /* JADX WARN: Type inference failed for: r3v2, types: [X.Bje, X.3dx] */
    /* JADX WARN: Type inference failed for: r3v5, types: [X.Bjf, X.3dx] */
    @Override // X.AbstractC50792Va
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.AbstractC50812Vc A0c(X.C2XE r29) {
        /*
            Method dump skipped, instructions count: 524
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.BSA.A0c(X.2XE):X.2Vc");
    }

    @Override // X.AbstractC50812Vc
    public final /* bridge */ /* synthetic */ AbstractC50812Vc A0P() {
        AbstractC50812Vc abstractC50812Vc;
        BSA bsa = (BSA) super.A0P();
        AbstractC50812Vc abstractC50812Vc2 = bsa.A07;
        if (abstractC50812Vc2 != null) {
            abstractC50812Vc = abstractC50812Vc2.A0P();
        } else {
            abstractC50812Vc = null;
        }
        bsa.A07 = abstractC50812Vc;
        return bsa;
    }
}
