package X;

import android.content.Context;
import android.os.Handler;
import androidx.recyclerview.widget.RecyclerView;
import com.instagram.common.session.UserSession;
import com.instagram.creation.capture.quickcapture.aspectratioutil.TargetViewSizeProvider;
import java.util.List;

/* renamed from: X.80S, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C80S implements InterfaceC191008cw {
    public int A00;
    public C190888ck A01;
    public boolean A02;
    public final Context A03;
    public final Handler A04;
    public final UserSession A05;
    public final C190398bx A06;
    public final C80T A07;

    public C80S(Context context, Handler handler, RecyclerView recyclerView, UserSession userSession, TargetViewSizeProvider targetViewSizeProvider, C190398bx c190398bx) {
        C14360o3.A0B(context, 1);
        C14360o3.A0B(recyclerView, 3);
        C14360o3.A0B(handler, 5);
        this.A03 = context;
        this.A05 = userSession;
        this.A04 = handler;
        this.A06 = c190398bx;
        this.A07 = new C80T(context, recyclerView, targetViewSizeProvider, this, true);
    }

    public final EnumC194908jr A00() {
        List list;
        C190888ck c190888ck = this.A01;
        Object obj = null;
        if (c190888ck == null || (list = c190888ck.A0A) == null) {
            return null;
        }
        int i = this.A00 - 1;
        if (i >= 0 && i < list.size()) {
            obj = list.get(i);
        }
        return (EnumC194908jr) obj;
    }

    @Override // X.InterfaceC191008cw
    public final void DNo(int i, boolean z) {
        if (i != this.A00) {
            this.A00 = i;
            this.A06.A0d(A00());
        }
    }
}
