package X;

import android.graphics.Bitmap;
import android.graphics.drawable.Icon;
import com.instagram.user.model.User;

/* renamed from: X.Acp, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C23595Acp implements C1NJ {
    public final /* synthetic */ A6D A00;

    @Override // X.C1NJ
    public final void DLW(InterfaceC59502nt interfaceC59502nt, int i) {
    }

    public C23595Acp(A6D a6d) {
        this.A00 = a6d;
    }

    @Override // X.C1NJ
    public final void DLP(InterfaceC59502nt interfaceC59502nt, C82183lf c82183lf) {
        User user = this.A00.A00;
        C93J.A01(null, user.getId(), user.getUsername());
    }

    @Override // X.C1NJ
    public final void Cza(InterfaceC59502nt interfaceC59502nt, C73033Pe c73033Pe) {
        Icon icon;
        Bitmap A0O = AbstractC166997dE.A0O(c73033Pe);
        A6D a6d = this.A00;
        if (A0O != null) {
            icon = Icon.createWithAdaptiveBitmap(A0O);
        } else {
            icon = null;
        }
        User user = a6d.A00;
        C93J.A01(icon, user.getId(), user.getUsername());
    }
}
