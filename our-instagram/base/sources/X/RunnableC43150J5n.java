package X;

import android.graphics.drawable.Drawable;
import com.instagram.common.ui.widget.imageview.IgImageView;
import com.instagram.creation.capture.quickcapture.superlativesticker.model.SuperlativeMentionSticker;
import com.instagram.user.model.User;

/* renamed from: X.J5n, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class RunnableC43150J5n implements Runnable {
    public final /* synthetic */ Drawable A00;
    public final /* synthetic */ C41181vS A01;
    public final /* synthetic */ C140486Xc A02;
    public final /* synthetic */ User A03;

    public RunnableC43150J5n(Drawable drawable, C41181vS c41181vS, C140486Xc c140486Xc, User user) {
        this.A00 = drawable;
        this.A03 = user;
        this.A01 = c41181vS;
        this.A02 = c140486Xc;
    }

    @Override // java.lang.Runnable
    public final void run() {
        User user;
        if (this.A00 != null && (user = this.A03) != null) {
            C41618Ib8 c41618Ib8 = this.A01.A0E;
            c41618Ib8.getClass();
            InterfaceC09390do interfaceC09390do = this.A02.A02;
            c41618Ib8.A00(new SuperlativeMentionSticker(AbstractC41658Ibq.A00((IgImageView) interfaceC09390do.getValue()), user, AbstractC166987dD.A0d(interfaceC09390do).getRotation(), 1.0f, 16));
        }
    }
}
