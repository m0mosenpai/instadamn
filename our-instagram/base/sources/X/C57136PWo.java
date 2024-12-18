package X;

import com.instagram.genai.imageutils.MaskUtilsKt;
import com.instagram.settings2.core.model.ActionButtonValue$Information;

/* renamed from: X.PWo, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C57136PWo extends C1Dq {
    public int A00;
    public int A01;
    public int A02;
    public Object A03;
    public Object A04;
    public final int A05;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C57136PWo(ActionButtonValue$Information actionButtonValue$Information, InterfaceC23621Ds interfaceC23621Ds) {
        super(interfaceC23621Ds);
        this.A05 = 2;
        this.A04 = actionButtonValue$Information;
    }

    @Override // X.C1Dr
    public final Object invokeSuspend(Object obj) {
        switch (this.A05) {
            case 0:
                this.A04 = obj;
                this.A02 |= Integer.MIN_VALUE;
                return MaskUtilsKt.A05(null, this);
            case 1:
                this.A04 = obj;
                this.A02 |= Integer.MIN_VALUE;
                return MaskUtilsKt.A06(null, this);
            default:
                this.A03 = obj;
                this.A02 |= Integer.MIN_VALUE;
                return AbstractC55145Od4.A01(this.A04, this);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C57136PWo(int i, InterfaceC23621Ds interfaceC23621Ds) {
        super(interfaceC23621Ds);
        this.A05 = i;
    }
}
