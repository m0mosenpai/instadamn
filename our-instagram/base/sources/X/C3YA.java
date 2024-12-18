package X;

import android.content.Context;
import android.view.View;
import android.view.ViewStub;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.R;
import com.instagram.common.session.UserSession;

/* renamed from: X.3YA, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C3YA {
    public double A00;
    public final RecyclerView A01;
    public final UserSession A02;

    public C3YA(ViewStub viewStub, UserSession userSession) {
        C14360o3.A0B(viewStub, 1);
        this.A02 = userSession;
        this.A00 = 3.3d;
        View inflate = viewStub.inflate();
        C14360o3.A0C(inflate, "null cannot be cast to non-null type androidx.recyclerview.widget.RecyclerView");
        RecyclerView recyclerView = (RecyclerView) inflate;
        this.A01 = recyclerView;
        int A00 = A00(this);
        double d = this.A00;
        C14360o3.A07(this.A01.getContext());
        AbstractC13880nE.A0W(recyclerView, (int) ((((AbstractC13890nF.A01(r0) - ((Math.floor(d) + 1.0d) * A00)) / d) / 1.0d) + (A00 * 2)));
        AbstractC13880nE.A0j(recyclerView, A00, A00);
        recyclerView.setLayoutManager(new LinearLayoutManager(recyclerView.getContext(), 0, false));
        recyclerView.A10(new C3YB(A00, A00));
    }

    public static final int A00(C3YA c3ya) {
        Context context = c3ya.A01.getContext();
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(R.dimen.abc_button_padding_horizontal_material);
        if (C18U.A06(C06090Tz.A05, c3ya.A02, 36323040933718910L)) {
            int dimensionPixelSize2 = context.getResources().getDimensionPixelSize(R.dimen.abc_edit_text_inset_top_material);
            c3ya.A00 = 3.4d;
            return dimensionPixelSize2;
        }
        return dimensionPixelSize;
    }
}
