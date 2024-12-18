package X;

import android.content.Context;
import androidx.recyclerview.widget.RecyclerView;
import com.instagram.common.session.UserSession;
import com.instagram.creation.capture.quickcapture.aspectratioutil.TargetViewSizeProvider;
import java.util.List;

/* renamed from: X.80c, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C1807480c implements InterfaceC191008cw {
    public int A00;
    public C190888ck A01;
    public final Context A02;
    public final UserSession A03;
    public final C190398bx A04;
    public final C80T A05;

    public C1807480c(Context context, RecyclerView recyclerView, UserSession userSession, TargetViewSizeProvider targetViewSizeProvider, C190398bx c190398bx) {
        C14360o3.A0B(context, 1);
        C14360o3.A0B(recyclerView, 3);
        this.A02 = context;
        this.A03 = userSession;
        this.A04 = c190398bx;
        this.A05 = new C80T(context, recyclerView, targetViewSizeProvider, this, true);
    }

    public final C6RC A00() {
        List list;
        C190888ck c190888ck = this.A01;
        if (c190888ck != null && (list = c190888ck.A0B) != null) {
            return (C6RC) AbstractC001800i.A0O(list, this.A00 - 1);
        }
        return null;
    }

    @Override // X.InterfaceC191008cw
    public final void DNo(int i, boolean z) {
        if (i != this.A00) {
            this.A00 = i;
            this.A04.A0e(A00());
        }
    }
}
