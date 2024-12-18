package X;

import android.content.Context;
import androidx.lifecycle.OnLifecycleEvent;
import com.instagram.common.gallery.model.GalleryItem;
import com.instagram.common.session.UserSession;
import java.util.List;

/* renamed from: X.Lwl, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C49654Lwl implements InterfaceC189068Yw, InterfaceC188988Yo, C07W {
    public final C189058Yv A00;
    public final C0UO A01;
    public final C8SF A02;
    public final C189028Ys A03;
    public final C05A A04;

    public C49654Lwl(Context context, C07T c07t, AbstractC018607g abstractC018607g, UserSession userSession) {
        EnumC188968Ym enumC188968Ym;
        AbstractC167027dH.A0a(1, userSession, context, abstractC018607g, c07t);
        C008002u A0o = AbstractC31171DnF.A0o();
        this.A04 = A0o;
        this.A01 = AbstractC208910l.A02(A0o);
        int i = AbstractC167007dF.A0K(context).widthPixels / 3;
        C8SF c8sf = new C8SF(context, userSession, C05F.A00, i, i, false);
        this.A02 = c8sf;
        if (C18U.A06(C06090Tz.A05, userSession, 36316267771269331L)) {
            enumC188968Ym = EnumC188968Ym.A02;
        } else {
            enumC188968Ym = EnumC188968Ym.A06;
        }
        C188958Yl c188958Yl = new C188958Yl(abstractC018607g, c8sf);
        c188958Yl.A07 = this;
        c188958Yl.A03 = enumC188968Ym;
        c188958Yl.A0B = true;
        c188958Yl.A09 = true;
        c188958Yl.A0B = true;
        C189028Ys c189028Ys = new C189028Ys(c188958Yl);
        this.A03 = c189028Ys;
        this.A00 = new C189058Yv(context, null, this, c189028Ys);
        c07t.A09(this);
    }

    @Override // X.InterfaceC188988Yo
    public final void DEP(Exception exc) {
    }

    @Override // X.InterfaceC188988Yo
    public final void DS1(C189058Yv c189058Yv, List list, List list2, int i) {
        C14360o3.A0B(list2, 2);
        EYj(AbstractC166987dD.A1F(list2), this.A00.A01.getName());
    }

    @Override // X.InterfaceC189068Yw
    public final void EYj(List list, String str) {
        C14360o3.A0B(list, 0);
        this.A04.Egh(list);
    }

    @Override // X.InterfaceC189068Yw
    public final void EdU(GalleryItem galleryItem, boolean z, boolean z2) {
    }

    @OnLifecycleEvent(C07R.ON_PAUSE)
    public final void onPause() {
        this.A00.A08();
    }

    @OnLifecycleEvent(C07R.ON_RESUME)
    public final void onResume() {
        this.A00.A09();
    }

    @Override // X.InterfaceC189068Yw
    public final List ANA() {
        return AbstractC166987dD.A1E();
    }
}
