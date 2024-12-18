package X;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import com.instagram.common.gallery.Medium;
import com.instagram.common.session.UserSession;
import com.instagram.creation.capture.quickcapture.controller.magicmediaremix.MagicMediaRemixEditController;
import com.instagram.ui.widget.interactive.InteractiveDrawableContainer;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.Aia, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C23907Aia implements InterfaceC50491MQt {
    public final /* synthetic */ MagicMediaRemixEditController A00;

    @Override // X.InterfaceC50491MQt
    public final /* synthetic */ void CoY() {
    }

    @Override // X.InterfaceC50491MQt
    public final void DkK(int i) {
    }

    public C23907Aia(MagicMediaRemixEditController magicMediaRemixEditController) {
        this.A00 = magicMediaRemixEditController;
    }

    @Override // X.InterfaceC50491MQt
    public final EnumC188968Ym B9N() {
        return EnumC188968Ym.A05;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC50491MQt
    public final void DmN(Medium medium, String str) {
        Object obj;
        Drawable c217729k5;
        MagicMediaRemixEditController magicMediaRemixEditController = this.A00;
        C81J c81j = magicMediaRemixEditController.A0B;
        if (c81j.A27 != null) {
            C66362zD c66362zD = magicMediaRemixEditController.A06;
            InterfaceC66442zL interfaceC66442zL = c66362zD.A04;
            Object obj2 = interfaceC66442zL.AuX().get(magicMediaRemixEditController.A00);
            C14360o3.A0C(obj2, "null cannot be cast to non-null type com.instagram.direct.magicmediaremix.viewmodel.MagicMediaRemixMediaSelectorItemViewModel");
            C23633AdS c23633AdS = (C23633AdS) obj2;
            C183688Ct c183688Ct = magicMediaRemixEditController.A0A;
            InteractiveDrawableContainer interactiveDrawableContainer = c183688Ct.A1t;
            List interactiveDrawables = interactiveDrawableContainer.getInteractiveDrawables();
            C14360o3.A07(interactiveDrawables);
            Iterator it = interactiveDrawables.iterator();
            while (true) {
                if (it.hasNext()) {
                    obj = it.next();
                    if (C14360o3.A0K(AbstractC166997dE.A0u(((C9LJ) ((BD4) obj)).A0B), c23633AdS.A01)) {
                        break;
                    }
                } else {
                    obj = null;
                    break;
                }
            }
            BD4 bd4 = (BD4) obj;
            if (bd4 != null) {
                Drawable drawable = ((C9LJ) bd4).A0B;
                if (drawable instanceof InterfaceC25211BDj) {
                    Object C4x = bd4.C4x();
                    C14360o3.A0C(C4x, AbstractC111324zv.A00(4994));
                    C8FC c8fc = (C8FC) C4x;
                    interactiveDrawableContainer.A0Q(drawable);
                    if (drawable instanceof C220819p5) {
                        C220819p5 c220819p5 = (C220819p5) drawable;
                        c217729k5 = new C220819p5(magicMediaRemixEditController.A03, medium, c220819p5.A04, c220819p5.A05, c220819p5.A03, c220819p5.A01, c220819p5.A02, c220819p5.A07, c220819p5.A06);
                    } else {
                        double intrinsicWidth = drawable.getIntrinsicWidth();
                        double intrinsicHeight = drawable.getIntrinsicHeight();
                        Bitmap A00 = LKb.A00(medium, Double.valueOf(intrinsicWidth / intrinsicHeight));
                        C148276lx c148276lx = C148276lx.A0a;
                        C148276lx A02 = AbstractC148296lz.A02(A00, intrinsicWidth, intrinsicHeight, intrinsicWidth / magicMediaRemixEditController.A01);
                        UserSession userSession = magicMediaRemixEditController.A07;
                        Context context = magicMediaRemixEditController.A03;
                        InterfaceC25211BDj interfaceC25211BDj = (InterfaceC25211BDj) drawable;
                        c217729k5 = new C217729k5(context, new C202588xc(context, A02.A00, userSession, (C148286ly) AbstractC166987dD.A16(A02.A0O), A02.A00(), A02.A06, AbstractC111324zv.A00(419)), userSession, A02, interfaceC25211BDj.Btf(), interfaceC25211BDj.Btg(), interfaceC25211BDj.Bte(), interfaceC25211BDj.Btc(), interfaceC25211BDj.Btd());
                    }
                    c183688Ct.A0i(c217729k5, c8fc);
                    String A0u = AbstractC166997dE.A0u(c217729k5);
                    KZD kzd = magicMediaRemixEditController.A0D;
                    String A0R = AnonymousClass001.A0R(medium.A0X, c81j.A2X);
                    C14360o3.A0B(A0R, 0);
                    kzd.A05.put(A0R, A0u);
                    int i = magicMediaRemixEditController.A00;
                    Bitmap A002 = LKb.A00(medium, null);
                    Object obj3 = interfaceC66442zL.AuX().get(i);
                    C14360o3.A0C(obj3, "null cannot be cast to non-null type com.instagram.direct.magicmediaremix.viewmodel.MagicMediaRemixMediaSelectorItemViewModel");
                    C23633AdS c23633AdS2 = (C23633AdS) obj3;
                    c23633AdS2.A00 = A002;
                    if (A0u != null) {
                        c23633AdS2.A01 = A0u;
                    }
                    c66362zD.notifyItemChanged(i);
                }
            }
        }
    }
}
