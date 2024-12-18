package X;

import android.content.Context;
import androidx.fragment.app.Fragment;
import com.instagram.common.session.UserSession;
import com.instagram.model.reels.Reel;
import com.instagram.reels.store.ReelStore;

/* loaded from: classes6.dex */
public final class ETH extends C1P1 {
    public final /* synthetic */ Context A00;
    public final /* synthetic */ C105824pt A01;
    public final /* synthetic */ C145386gx A02;

    public ETH(Context context, C105824pt c105824pt, C145386gx c145386gx) {
        this.A02 = c145386gx;
        this.A01 = c105824pt;
        this.A00 = context;
    }

    @Override // X.C1P1
    public final void onFail(AbstractC115105If abstractC115105If) {
        int A03 = C0f9.A03(-1754961761);
        C145386gx c145386gx = this.A02;
        C145386gx.A00(c145386gx);
        Fragment fragment = (Fragment) c145386gx.A05.get();
        if (fragment != null && fragment.getContext() != null) {
            C9GR.A0F(this.A00, "live_archive_delete_fail", 2131965313);
        }
        C0f9.A0A(-1106827437, A03);
    }

    @Override // X.C1P1
    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        int A03 = C0f9.A03(932672812);
        int A032 = C0f9.A03(-1301570479);
        C145386gx c145386gx = this.A02;
        C145386gx.A00(c145386gx);
        Fragment fragment = (Fragment) c145386gx.A05.get();
        if (fragment != null && fragment.getContext() != null) {
            C105824pt c105824pt = this.A01;
            Context context = this.A00;
            UserSession userSession = c145386gx.A01;
            if (userSession == null) {
                AbstractC31171DnF.A0y();
                throw C00O.createAndThrow();
            }
            ReelStore A033 = ReelStore.A03(userSession);
            String str = c105824pt.A0X;
            str.getClass();
            Reel A0M = A033.A0M(str);
            if (A0M != null) {
                c145386gx.A04.Blw().A02(A0M);
            }
            C9GR.A07(context, 2131965315);
            c145386gx.A04.CqT();
        }
        C0f9.A0A(1968342755, A032);
        C0f9.A0A(-609324540, A03);
    }
}
