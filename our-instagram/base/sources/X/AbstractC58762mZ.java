package X;

import android.graphics.Paint;
import android.graphics.drawable.Drawable;

/* renamed from: X.2mZ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC58762mZ extends Drawable.ConstantState {
    public int A00;
    public final Paint A01;
    public final AbstractC58702mT A02;

    public AbstractC58762mZ(AbstractC58762mZ abstractC58762mZ) {
        C14360o3.A0B(abstractC58762mZ, 1);
        this.A02 = abstractC58762mZ.A02;
        this.A01 = new Paint(abstractC58762mZ.A01);
        this.A00 = abstractC58762mZ.A00;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final int getChangingConfigurations() {
        return 0;
    }

    public AbstractC58762mZ(AbstractC58702mT abstractC58702mT) {
        this.A02 = abstractC58702mT;
        this.A01 = new Paint(6);
        this.A00 = 119;
    }
}
