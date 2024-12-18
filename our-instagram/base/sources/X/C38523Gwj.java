package X;

import android.view.View;
import android.widget.TextView;
import com.facebook.R;
import com.instagram.igds.components.button.IgdsButton;

/* renamed from: X.Gwj, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C38523Gwj extends C3OO implements C33R {
    public final TextView A00;
    public final TextView A01;
    public final IgdsButton A02;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C38523Gwj(View view) {
        super(view);
        C14360o3.A0B(view, 1);
        this.A01 = AbstractC25230BEn.A0Q(view, R.id.title);
        this.A00 = AbstractC25230BEn.A0Q(view, R.id.subtitle);
        this.A02 = (IgdsButton) AbstractC166987dD.A0c(view, R.id.action_button);
    }

    @Override // X.C33R
    public final void DSJ(C75113Zb c75113Zb, int i) {
        C14360o3.A0B(c75113Zb, 0);
        if (i == 21) {
            AbstractC40632Hzq.A00(this, c75113Zb);
        }
    }
}
