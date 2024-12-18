package X;

import android.content.Context;
import android.view.View;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.DtE, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class ViewOnClickListenerC31529DtE implements View.OnClickListener {
    public final /* synthetic */ Context A00;
    public final /* synthetic */ View A01;
    public final /* synthetic */ UserSession A02;
    public final /* synthetic */ C70O A03;
    public final /* synthetic */ List A04;

    public ViewOnClickListenerC31529DtE(Context context, View view, UserSession userSession, C70O c70o, List list) {
        this.A03 = c70o;
        this.A00 = context;
        this.A02 = userSession;
        this.A04 = list;
        this.A01 = view;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int A05 = C0f9.A05(-1110772396);
        this.A03.BiC().D3z("tap_dropdown_menu", "user_profile_header");
        Context context = this.A00;
        UserSession userSession = this.A02;
        List<C73R> list = this.A04;
        View view2 = this.A01;
        ArrayList A0q = AbstractC167017dG.A0q(list);
        for (C73R c73r : list) {
            A0q.add(new C199928sw(null, null, null, new G8A(context, c73r), null, c73r.Aj7(), 0, 0, 0, false, false, false, true, false, false, false));
        }
        C8QJ A0X = AbstractC31174DnI.A0X(context, userSession, A0q, false);
        A0X.getContentView().measure(0, 0);
        A0X.showAsDropDown(view2, (-A0X.getContentView().getMeasuredWidth()) + AbstractC167017dG.A09(context), context.getResources().getDimensionPixelOffset(R.dimen.audience_lists_text_in_badge_horizontal_margin_right) * 2);
        C0f9.A0C(1642769814, A05);
    }
}
