package X;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.facebook.R;
import com.instagram.common.session.UserSession;

/* loaded from: classes9.dex */
public final class OBq {
    public final View A00;
    public final ImageView A01;
    public final TextView A02;
    public final C55096Ob7 A03;

    public OBq(View view, UserSession userSession) {
        this.A01 = AbstractC31171DnF.A08(view, R.id.icon);
        this.A02 = AbstractC166997dE.A0T(view, R.id.candidate_names);
        View requireViewById = view.requireViewById(R.id.blast_list_candidates_container);
        this.A00 = requireViewById;
        this.A03 = new C55096Ob7(requireViewById, userSession, C05F.A0Y);
    }
}
