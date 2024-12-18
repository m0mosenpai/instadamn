package X;

import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import com.facebook.R;
import com.instagram.common.session.UserSession;

/* renamed from: X.Gtj, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C38347Gtj extends C110814yt {
    public final /* synthetic */ Context A00;
    public final /* synthetic */ UserSession A01;

    @Override // X.C110814yt
    public final int A07() {
        return -1;
    }

    @Override // X.C110814yt
    public final int A0A(int i) {
        return 100;
    }

    @Override // X.C110814yt
    public final int A0C(View view, int i) {
        C14360o3.A0B(view, 0);
        int A0C = super.A0C(view, i);
        Resources resources = this.A00.getResources();
        boolean A00 = C25371Lr.A00(AbstractC25351Lp.A00(this.A01));
        int i2 = R.dimen.abc_control_corner_material;
        if (A00) {
            i2 = R.dimen.audience_lists_text_in_badge_horizontal_margin_right;
        }
        return A0C + resources.getDimensionPixelSize(i2);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C38347Gtj(Context context, UserSession userSession) {
        super(context);
        this.A00 = context;
        this.A01 = userSession;
    }
}
