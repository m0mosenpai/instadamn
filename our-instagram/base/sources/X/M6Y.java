package X;

import android.graphics.drawable.Drawable;
import com.instagram.creation.capture.quickcapture.superlativesticker.model.SuperlativeMentionSticker;
import com.instagram.user.model.User;

/* loaded from: classes8.dex */
public final class M6Y implements Runnable {
    public final /* synthetic */ Drawable A00;
    public final /* synthetic */ C41181vS A01;
    public final /* synthetic */ C140516Xf A02;
    public final /* synthetic */ User A03;

    public M6Y(Drawable drawable, C41181vS c41181vS, C140516Xf c140516Xf, User user) {
        this.A00 = drawable;
        this.A03 = user;
        this.A01 = c41181vS;
        this.A02 = c140516Xf;
    }

    @Override // java.lang.Runnable
    public final void run() {
        User user;
        if (this.A00 != null && (user = this.A03) != null) {
            C41618Ib8 c41618Ib8 = this.A01.A0E;
            c41618Ib8.getClass();
            InterfaceC09390do interfaceC09390do = this.A02.A03;
            c41618Ib8.A00(new SuperlativeMentionSticker(AbstractC41658Ibq.A00(AbstractC43592JPx.A0V(interfaceC09390do)), user, AbstractC166987dD.A0d(interfaceC09390do).getRotation(), 1.0f, 16));
        }
    }
}
