package X;

import android.content.Context;
import android.graphics.drawable.Drawable;

/* loaded from: classes9.dex */
public final class NHD extends AbstractC48580LeI {
    public final InterfaceC58189Pqv A00;

    public NHD(C54629OBe c54629OBe, InterfaceC58189Pqv interfaceC58189Pqv) {
        C14360o3.A0B(c54629OBe, 1);
        super.A00 = c54629OBe;
        this.A00 = interfaceC58189Pqv;
    }

    @Override // X.InterfaceC50490MQs
    public final AbstractC44335Jia AWq(Context context, Drawable drawable, EnumC46217Kct enumC46217Kct) {
        return new C45744KMx(drawable, null);
    }

    @Override // X.InterfaceC50490MQs
    public final InterfaceC58189Pqv Arg() {
        return this.A00;
    }
}
