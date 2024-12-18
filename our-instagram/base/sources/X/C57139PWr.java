package X;

import androidx.paging.SeparatorState;
import androidx.paging.SeparatorsKt;

/* renamed from: X.PWr, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C57139PWr extends C1Dq {
    public int A00;
    public int A01;
    public int A02;
    public Object A03;
    public Object A04;
    public Object A05;
    public Object A06;
    public Object A07;
    public Object A08;
    public final int A09 = 1;

    public C57139PWr(InterfaceC23621Ds interfaceC23621Ds) {
        super(interfaceC23621Ds);
    }

    @Override // X.C1Dr
    public final Object invokeSuspend(Object obj) {
        if (this.A09 != 0) {
            this.A08 = obj;
            this.A02 |= Integer.MIN_VALUE;
            return SeparatorsKt.A00(null, this, null);
        }
        this.A07 = obj;
        this.A02 |= Integer.MIN_VALUE;
        return ((SeparatorState) this.A08).A03(null, this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C57139PWr(SeparatorState separatorState, InterfaceC23621Ds interfaceC23621Ds) {
        super(interfaceC23621Ds);
        this.A08 = separatorState;
    }
}
