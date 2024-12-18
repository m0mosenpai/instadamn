package X;

import android.content.Context;
import com.facebook.common.time.AwakeTimeSinceBootClock;
import com.instagram.common.session.UserSession;

/* renamed from: X.6oE, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC149616oE extends AbstractC69603Au {
    public final int A00;
    public final C69613Av A01;

    @Override // X.AbstractC69603Au
    public final int A01() {
        return this.A00;
    }

    public void A0L() {
        this.A01.A05();
    }

    public final void A0M() {
        if (super.A01) {
            A0A(AwakeTimeSinceBootClock.INSTANCE.now(), (short) 4);
        }
        A09(AwakeTimeSinceBootClock.INSTANCE.now());
        this.A01.A08(null);
    }

    public AbstractC149616oE(Context context, UserSession userSession, int i) {
        super(userSession);
        this.A00 = i;
        this.A01 = A02("animation_component");
        A0B(context);
    }
}
