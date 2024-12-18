package X;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.instagram.common.session.UserSession;

/* renamed from: X.JaU, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C43864JaU extends AbstractC66422zJ {
    public final Context A00;
    public final UserSession A01;

    @Override // X.AbstractC66422zJ
    public final /* bridge */ /* synthetic */ void bind(InterfaceC66482zP interfaceC66482zP, C3OO c3oo) {
        C14360o3.A0B(c3oo, 1);
        View view = c3oo.itemView;
        C14360o3.A0C(view, "null cannot be cast to non-null type com.instagram.creation.capture.gallery.partialpermission.GalleryPartialPermissionView");
        AbstractC46687Kl4.A00(this.A00, this.A01, (KKF) view, false, false);
    }

    @Override // X.AbstractC66422zJ
    public final Class modelClass() {
        return LZI.class;
    }

    public C43864JaU(UserSession userSession, Context context) {
        this.A01 = userSession;
        this.A00 = context;
    }

    @Override // X.AbstractC66422zJ
    public final /* bridge */ /* synthetic */ C3OO createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        return new C3OO(new KKF(AbstractC31176DnK.A04(viewGroup)));
    }
}
