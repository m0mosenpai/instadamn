package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import com.instagram.common.session.UserSession;

/* loaded from: classes9.dex */
public final class NHE extends AbstractC48580LeI {
    public final UserSession A00;
    public final InterfaceC09390do A01;
    public final InterfaceC58189Pqv A02;

    public NHE(UserSession userSession, C54629OBe c54629OBe, InterfaceC58189Pqv interfaceC58189Pqv) {
        C14360o3.A0B(c54629OBe, 2);
        super.A00 = c54629OBe;
        this.A00 = userSession;
        this.A02 = interfaceC58189Pqv;
        this.A01 = AbstractC09440dt.A01(new C50156MDj(this, 40));
    }

    @Override // X.InterfaceC50490MQs
    public final AbstractC44335Jia AWq(Context context, Drawable drawable, EnumC46217Kct enumC46217Kct) {
        return new C45744KMx(drawable, null);
    }

    @Override // X.InterfaceC50490MQs
    public final InterfaceC58189Pqv Arg() {
        return this.A02;
    }
}
