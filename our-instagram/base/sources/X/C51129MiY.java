package X;

import android.view.ViewGroup;
import android.widget.TextView;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import java.util.List;

/* renamed from: X.MiY, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C51129MiY extends C2UU {
    public final List A00 = AbstractC166987dD.A1E();
    public final InterfaceC16660sJ A01;
    public final UserSession A02;

    @Override // X.C2UU
    public final /* bridge */ /* synthetic */ C3OO onCreateViewHolder(ViewGroup viewGroup, int i) {
        C14360o3.A0B(viewGroup, 0);
        C51314Mlb c51314Mlb = new C51314Mlb(OOz.A00(viewGroup));
        C138586Po A00 = AbstractC138576Pn.A00(1.0f, viewGroup.getResources().getDimensionPixelSize(R.dimen.abc_edit_text_inset_top_material), false);
        A00.setTintList(C02G.A02(viewGroup.getContext(), R.color.suggestion_text_color_selector));
        c51314Mlb.A01.setImageDrawable(A00);
        return c51314Mlb;
    }

    @Override // X.C2UU
    public final /* bridge */ /* synthetic */ void onBindViewHolder(C3OO c3oo, int i) {
        C51314Mlb c51314Mlb = (C51314Mlb) c3oo;
        C14360o3.A0B(c51314Mlb, 0);
        JIN A00 = ((C38061Goo) this.A00.get(i)).A00();
        if (A00 != null) {
            TextView textView = c51314Mlb.A02;
            String displayArtist = A00.getDisplayArtist();
            String str = "";
            if (displayArtist == null) {
                displayArtist = "";
            }
            String title = A00.getTitle();
            if (title != null) {
                str = title;
            }
            textView.setText(C92604Cu.A04(displayArtist, str));
            ViewOnClickListenerC55464OkJ.A01(c51314Mlb.A00, 70, this, A00);
        }
    }

    public C51129MiY(InterfaceC16660sJ interfaceC16660sJ, UserSession userSession) {
        this.A01 = interfaceC16660sJ;
        this.A02 = userSession;
    }

    @Override // X.C2UU
    public final int getItemCount() {
        int A03 = C0f9.A03(26359441);
        int size = this.A00.size();
        C0f9.A0A(1009613520, A03);
        return size;
    }
}
