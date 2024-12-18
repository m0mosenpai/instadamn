package X;

import android.view.View;
import android.widget.TextView;
import com.facebook.R;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.common.ui.widget.imageview.IgImageView;

/* loaded from: classes6.dex */
public final class G0P implements InterfaceC69513Al {
    public final /* synthetic */ C7Y3 A00;

    public G0P(C7Y3 c7y3) {
        this.A00 = c7y3;
    }

    @Override // X.InterfaceC69513Al
    public final void DLu(View view) {
        C14360o3.A0B(view, 0);
        C7Y3 c7y3 = this.A00;
        c7y3.A02 = view;
        IgImageView A0a = AbstractC31172DnG.A0a(view, R.id.profile_picture);
        TextView A0e = AbstractC166987dD.A0e(view, R.id.channel_name);
        TextView A0e2 = AbstractC166987dD.A0e(view, R.id.channel_context);
        TextView A0e3 = AbstractC166987dD.A0e(view, R.id.channel_join_explainer);
        View findViewById = view.findViewById(R.id.background);
        C7U0 c7u0 = (C7U0) c7y3.A09.invoke();
        C7IH c7ih = (C7IH) c7y3.A0A.invoke();
        InterfaceC163837Ux C7r = c7u0.C7r();
        Object obj = C7r.Aej().A00;
        C14360o3.A06(obj);
        A0a.setUrl((ImageUrl) obj, c7y3.A06);
        A0e.setText(C7r.C7l());
        A0e2.setText(AbstractC31437Drh.A00(c7y3.A05.requireContext(), Integer.valueOf(C7r.BSB())));
        int i = c7ih.A03;
        if (i != 0) {
            A0e2.setTextColor(i);
            A0e3.setTextColor(i);
        }
        findViewById.setBackgroundColor(c7ih.A07);
    }
}
