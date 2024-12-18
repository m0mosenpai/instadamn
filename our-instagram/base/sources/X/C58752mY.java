package X;

import android.graphics.drawable.Drawable;
import java.nio.ByteBuffer;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: X.2mY, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C58752mY extends AbstractC58762mZ {
    public AbstractC56582ir A00;

    public final AbstractC56582ir A00() {
        AbstractC56582ir abstractC56582ir = this.A00;
        if (abstractC56582ir == null) {
            C58692mS c58692mS = (C58692mS) this.A02;
            ByteBuffer byteBuffer = (ByteBuffer) c58692mS.A03.get();
            if (byteBuffer == null) {
                abstractC56582ir = null;
            } else {
                AtomicReference atomicReference = c58692mS.A04;
                abstractC56582ir = (AbstractC56582ir) atomicReference.get();
                if (abstractC56582ir == null || !C1EM.A00(abstractC56582ir, null, atomicReference)) {
                    abstractC56582ir = C58692mS.A00(byteBuffer);
                }
            }
            this.A00 = abstractC56582ir;
        }
        return abstractC56582ir;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable() {
        return new C58652mO(this);
    }
}
