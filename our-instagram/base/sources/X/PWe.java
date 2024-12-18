package X;

import com.instagram.genai.imageutils.MaskUtilsKt;

/* loaded from: classes9.dex */
public final class PWe extends C1Dq {
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public int A05;
    public Object A06;
    public Object A07;
    public Object A08;
    public Object A09;
    public boolean A0A;
    public final int A0B;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PWe(int i, InterfaceC23621Ds interfaceC23621Ds) {
        super(interfaceC23621Ds);
        this.A0B = i;
    }

    @Override // X.C1Dr
    public final Object invokeSuspend(Object obj) {
        int i = this.A0B;
        this.A09 = obj;
        this.A00 |= Integer.MIN_VALUE;
        if (i != 0) {
            return MaskUtilsKt.A0D(this, null, 0, 0, 0);
        }
        return MaskUtilsKt.A0C(this, null, 0, 0, 0);
    }
}
