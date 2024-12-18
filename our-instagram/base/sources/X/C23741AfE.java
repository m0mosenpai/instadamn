package X;

import android.os.Bundle;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import com.instagram.debug.devoptions.avatars.ImmersiveAvatarViewerDebugFragment;
import com.instagram.modal.ModalActivity;

/* renamed from: X.AfE, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C23741AfE implements InterfaceC184728Hn {
    public final int A00;
    public final Object A01;

    public C23741AfE(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    @Override // X.InterfaceC184728Hn
    public final boolean D3S() {
        switch (this.A00) {
            case 0:
                C81Z c81z = ((C81Y) this.A01).A00;
                UserSession userSession = c81z.A0Q;
                C8HI c8hi = c81z.A0k;
                AbstractC50677MYv.A0H(userSession, c8hi.A0N());
                c8hi.A0Z(null, null);
                return true;
            case 1:
                C208769Lk c208769Lk = (C208769Lk) this.A01;
                C208769Lk.A02(new AOD(c208769Lk, 2), c208769Lk);
                return true;
            case 2:
                C1821585z c1821585z = ((C42397Ipy) this.A01).A03;
                FragmentActivity activity = c1821585z.A0A.getActivity();
                if (activity == null) {
                    return true;
                }
                Bundle A0b = AbstractC166987dD.A0b();
                A0b.putString(ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY, "shopping_camera");
                A0b.putString(AbstractC111324zv.A00(256), "instagram_shopping_camera");
                A0b.putString("shopping_session_id", c1821585z.A0G);
                new C6XJ(activity, A0b, c1821585z.A0B, ModalActivity.class, AbstractC111324zv.A00(5324)).A0C(activity.getApplicationContext());
                return true;
            default:
                AM2.A01((AM2) this.A01, true);
                return true;
        }
    }
}
