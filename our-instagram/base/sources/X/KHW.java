package X;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.facebook.R;
import com.facebook.shimmer.ShimmerFrameLayout;
import com.instagram.common.session.UserSession;

/* loaded from: classes8.dex */
public final class KHW extends AbstractC66412zI {
    public final UserSession A00;

    public KHW(UserSession userSession) {
        C14360o3.A0B(userSession, 1);
        this.A00 = userSession;
    }

    @Override // X.AbstractC66422zJ
    public final /* bridge */ /* synthetic */ void bind(InterfaceC66482zP interfaceC66482zP, C3OO c3oo) {
        C44628JpY c44628JpY = (C44628JpY) c3oo;
        C14360o3.A0B(c44628JpY, 1);
        c44628JpY.A00.A02();
    }

    @Override // X.AbstractC66422zJ
    public final Class modelClass() {
        return C45638KIb.class;
    }

    /* JADX WARN: Type inference failed for: r6v0, types: [boolean] */
    @Override // X.AbstractC66422zJ
    public final /* bridge */ /* synthetic */ C3OO createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        ?? A1a = AbstractC167017dG.A1a(viewGroup, layoutInflater);
        UserSession userSession = this.A00;
        boolean A1U = AbstractC167007dF.A1U(userSession);
        View inflate = layoutInflater.inflate(R.layout.active_now_tray_shimmer_placeholder, viewGroup, A1U);
        C14360o3.A0C(inflate, "null cannot be cast to non-null type com.facebook.shimmer.ShimmerFrameLayout");
        ShimmerFrameLayout shimmerFrameLayout = (ShimmerFrameLayout) inflate;
        boolean A06 = C18U.A06(C06090Tz.A05, userSession, 36314773121469230L);
        int i = R.dimen.abc_list_item_height_large_material;
        int i2 = R.layout.active_now_tray_user_item_shimmer;
        if (A06) {
            i = R.dimen.active_now_with_status_item_width;
            i2 = R.layout.active_now_tray_with_status_user_item_shimmer;
        }
        LinearLayout A0B = AbstractC31172DnG.A0B(shimmerFrameLayout, R.id.container);
        A0B.setOrientation(A1U ? 1 : 0);
        AbstractC43593JPy.A1B(A0B, -2);
        Context A0L = AbstractC166997dE.A0L(viewGroup);
        int ceil = (int) Math.ceil(AbstractC13880nE.A0A(A0L) / AbstractC31173DnH.A00(A0L, i));
        int i3 = 1;
        if (A1a <= ceil) {
            while (true) {
                A0B.addView(layoutInflater.inflate(i2, A0B, A1U));
                if (i3 == ceil) {
                    break;
                }
                i3++;
            }
        }
        return new C44628JpY(shimmerFrameLayout);
    }
}
