package X;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.facebook.R;
import com.instagram.common.ui.base.IgSimpleImageView;
import com.instagram.model.direct.DirectSearchPrompt;
import com.instagram.model.direct.DirectSearchResult;
import java.util.List;

/* renamed from: X.Dzo, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C31882Dzo extends C2UU {
    public List A00 = C16930sl.A00;
    public final Context A01;
    public final FG3 A02;
    public final InterfaceC132405yL A03;
    public final boolean A04;

    @Override // X.C2UU
    public final void onBindViewHolder(C3OO c3oo, int i) {
        int i2;
        C14360o3.A0B(c3oo, 0);
        if (c3oo instanceof E3B) {
            this.A03.Dqk(AbstractC31171DnF.A06(c3oo), null, (DirectSearchResult) this.A00.get(i), "direct_user_search", 40, -1, i, -1, false);
            Context context = this.A01;
            boolean z = this.A04;
            E3B e3b = (E3B) c3oo;
            DirectSearchPrompt directSearchPrompt = (DirectSearchPrompt) this.A00.get(i);
            AbstractC167017dG.A1R(e3b, directSearchPrompt);
            TextView textView = e3b.A02;
            textView.setText(directSearchPrompt.A03);
            AbstractC13880nE.A0a(textView, 0);
            IgSimpleImageView igSimpleImageView = e3b.A03;
            EnumC50680MYy enumC50680MYy = directSearchPrompt.A00;
            if (z) {
                i2 = R.drawable.messenger_icons_gen_ai_ring_16;
            } else {
                int ordinal = enumC50680MYy.ordinal();
                i2 = R.drawable.instagram_gen_ai_pano_filled_24;
                if (ordinal == 0) {
                    i2 = R.drawable.instagram_photo_gen_ai_pano_outline_24;
                }
            }
            igSimpleImageView.setImageResource(i2);
            AbstractC13880nE.A0V(igSimpleImageView, AbstractC167017dG.A04(context));
            e3b.A01 = directSearchPrompt;
            e3b.A00 = i;
        }
    }

    @Override // X.C2UU
    public final C3OO onCreateViewHolder(ViewGroup viewGroup, int i) {
        C14360o3.A0B(viewGroup, 0);
        Context context = this.A01;
        FG3 fg3 = this.A02;
        View A0D = AbstractC25227BEk.A0D(LayoutInflater.from(context), viewGroup, R.layout.pill_search_keyword, false);
        E3B e3b = new E3B(A0D);
        ViewOnClickListenerC35687FpM.A00(A0D, 66, fg3, e3b);
        AbstractC13880nE.A0k(A0D, context.getResources().getDimensionPixelSize(R.dimen.abc_action_bar_elevation_material), 0, AbstractC166997dE.A04(context, R.dimen.abc_action_bar_elevation_material), 0);
        return e3b;
    }

    public C31882Dzo(Context context, FG3 fg3, InterfaceC132405yL interfaceC132405yL, boolean z) {
        this.A01 = context;
        this.A04 = z;
        this.A02 = fg3;
        this.A03 = interfaceC132405yL;
    }

    @Override // X.C2UU
    public final int getItemCount() {
        int A03 = C0f9.A03(-180251761);
        int size = this.A00.size();
        C0f9.A0A(412257414, A03);
        return size;
    }
}
