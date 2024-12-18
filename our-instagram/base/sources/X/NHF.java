package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import com.instagram.common.session.UserSession;
import com.instagram.creation.photo.edit.effectfilter.PhotoFilter;

/* loaded from: classes9.dex */
public final class NHF extends AbstractC48580LeI {
    public PhotoFilter A00;
    public final UserSession A01;
    public final InterfaceC58189Pqv A02;

    @Override // X.InterfaceC50490MQs
    public final InterfaceC58189Pqv Arg() {
        return this.A02;
    }

    public NHF(UserSession userSession, C54629OBe c54629OBe, InterfaceC58189Pqv interfaceC58189Pqv) {
        super.A00 = c54629OBe;
        this.A01 = userSession;
        this.A02 = interfaceC58189Pqv;
    }

    @Override // X.InterfaceC50490MQs
    public final AbstractC44335Jia AWq(Context context, Drawable drawable, EnumC46217Kct enumC46217Kct) {
        String upperCase = context.getResources().getString(2131968449).toUpperCase(context.getResources().getConfiguration().locale);
        if (!super.A00.A03) {
            upperCase = null;
        }
        return new C45744KMx(drawable, upperCase);
    }
}
