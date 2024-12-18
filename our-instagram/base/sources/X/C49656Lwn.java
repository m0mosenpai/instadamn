package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import com.instagram.ui.widget.mediapicker.Folder;
import java.util.List;

/* renamed from: X.Lwn, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C49656Lwn implements InterfaceC189018Yr {
    public final /* synthetic */ Context A00;
    public final /* synthetic */ UserSession A01;
    public final /* synthetic */ C60322pF A02;

    @Override // X.InterfaceC189018Yr
    public final boolean AFb(Folder folder, List list) {
        return true;
    }

    @Override // X.InterfaceC189018Yr
    public final void Dr0(List list) {
    }

    public C49656Lwn(Context context, UserSession userSession, C60322pF c60322pF) {
        this.A00 = context;
        this.A01 = userSession;
        this.A02 = c60322pF;
    }

    @Override // X.InterfaceC189018Yr
    public final List C3y(Integer num) {
        return AbstractC43895Jb5.A00(this.A00, this.A01, this.A02).A00(new C51755Mte(AbstractC166987dD.A1J(EnumC222729sD.A05), 27));
    }
}
