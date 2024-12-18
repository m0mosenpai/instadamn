package X;

import com.instagram.genai.imageutils.MaskUtilsKt;

/* loaded from: classes9.dex */
public final class PWU extends C1Dq {
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public Object A04;
    public Object A05;
    public Object A06;
    public boolean A07;
    public final int A08;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PWU(int i, InterfaceC23621Ds interfaceC23621Ds) {
        super(interfaceC23621Ds);
        this.A08 = i;
    }

    @Override // X.C1Dr
    public final Object invokeSuspend(Object obj) {
        int i = this.A08;
        this.A06 = obj;
        this.A03 |= Integer.MIN_VALUE;
        if (i != 0) {
            return MaskUtilsKt.A02(null, null, null, this);
        }
        return MaskUtilsKt.A03(null, null, this);
    }
}
