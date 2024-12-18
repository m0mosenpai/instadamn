package X;

import android.content.Context;
import com.instagram.common.session.UserSession;

/* loaded from: classes4.dex */
public abstract class ACE {
    public boolean A00;
    public final Context A01;
    public final C194808jg A02;
    public final UserSession A03;

    public abstract boolean A01();

    public final String A00() {
        if (this instanceof C9PD) {
            return ((C9PD) this).A01;
        }
        if (this instanceof C217709k3) {
            return AbstractC166997dE.A0q(this.A01.getResources(), 2131974410);
        }
        return AbstractC166997dE.A0p(this.A01, 2131964230);
    }

    public ACE(Context context, UserSession userSession, C194808jg c194808jg) {
        this.A02 = c194808jg;
        this.A03 = userSession;
        this.A01 = context;
    }
}
