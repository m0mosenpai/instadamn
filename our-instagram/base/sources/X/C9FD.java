package X;

import androidx.compose.ui.platform.AndroidComposeView;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;

/* renamed from: X.9FD, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C9FD extends C0YY implements InterfaceC16620sF {
    public final int A00;
    public final int A01;
    public final Object A02;
    public final Object A03;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C9FD(int i, int i2, Object obj, Object obj2) {
        super(2);
        this.A00 = i2;
        this.A02 = obj;
        this.A01 = i;
        this.A03 = obj2;
    }

    @Override // X.InterfaceC16620sF
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        C5Tl c5Tl = (C5Tl) obj;
        Number number = (Number) obj2;
        switch (this.A00) {
            case 0:
                if ((number.intValue() & 3) == 2 && c5Tl.Bxj()) {
                    c5Tl.Em9();
                    break;
                } else {
                    if (C0fH.A02()) {
                        C0fH.A01(172607435, "androidx.compose.foundation.lazy.layout.SkippableItem.<anonymous> (LazyLayoutItemContentFactory.kt:135)");
                    }
                    ((C6O2) this.A02).A6q(c5Tl, this.A03, this.A01, 0);
                    if (C0fH.A02()) {
                        C0fH.A00(-1897517118);
                        break;
                    }
                }
                break;
            case 1:
                number.intValue();
                ((C5TR) this.A03).A01(c5Tl, this.A02, AbstractC128295qy.A00(this.A01) | 1);
                break;
            case 2:
                number.intValue();
                AndroidCompositionLocals_androidKt.A00(c5Tl, (AndroidComposeView) this.A03, (InterfaceC16620sF) this.A02, AbstractC128295qy.A00(this.A01 | 1));
                break;
            default:
                number.intValue();
                C5WR.A0z(c5Tl, (C118125Vw) this.A03, (InterfaceC16620sF) this.A02, AbstractC128295qy.A00(this.A01 | 1));
                break;
        }
        return C0eB.A00;
    }
}
