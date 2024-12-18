package X;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.R;
import com.instagram.common.session.UserSession;

/* renamed from: X.Jee, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C44114Jee extends AbstractC44597Jow {
    public final int A00;
    public final RecyclerView A01;
    public final UserSession A02;
    public final MRG A03;
    public final C43795JYi A04;
    public final JYV A05;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C44114Jee(View view, UserSession userSession, MRG mrg) {
        super(view);
        AbstractC167017dG.A1Q(userSession, mrg);
        this.A02 = userSession;
        this.A03 = mrg;
        RecyclerView recyclerView = (RecyclerView) view;
        this.A01 = recyclerView;
        JYV jyv = new JYV(mrg);
        this.A05 = jyv;
        Context A0L = AbstractC166997dE.A0L(view);
        this.A00 = AbstractC13880nE.A0A(A0L);
        this.A04 = new C43795JYi(AbstractC25226BEj.A0R(LayoutInflater.from(A0L), null, R.layout.direct_inbox_header_pill_item, false));
        recyclerView.setAdapter(jyv);
        AbstractC37304Gc5.A0z(recyclerView, A0L.getResources().getDimensionPixelSize(R.dimen.abc_button_padding_horizontal_material) * 2, AbstractC166997dE.A04(A0L, R.dimen.abc_button_padding_horizontal_material));
        Context context = recyclerView.getContext();
        ViewGroup.MarginLayoutParams A0G = AbstractC31177DnL.A0G(recyclerView);
        C14360o3.A0A(context);
        C14360o3.A0B(context, 0);
        A0G.topMargin = AbstractC166997dE.A04(context, R.dimen.abc_button_padding_horizontal_material);
        recyclerView.setLayoutParams(A0G);
    }
}
