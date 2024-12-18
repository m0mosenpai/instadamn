package X;

import android.app.Activity;
import android.content.ComponentCallbacks2;
import com.instagram.modal.ModalActivity;

/* renamed from: X.Eya, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC33934Eya {
    public static final Boolean A00(C6FQ c6fq) {
        C6FG c6fg = c6fq.A03;
        boolean z = true;
        if (c6fg == null) {
            return true;
        }
        ComponentCallbacks2 A00 = AbstractC13110lx.A00((Activity) c6fg.A00);
        if (A00 instanceof InterfaceC53712dA) {
            if (((InterfaceC53712dA) A00).C4u() != 0) {
                z = false;
            }
            return Boolean.valueOf(z);
        }
        if (!(A00 instanceof ModalActivity)) {
            return true;
        }
        return false;
    }
}
