package X;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.facebook.R;
import com.instagram.model.direct.DirectSearchPrompt;
import com.instagram.model.direct.DirectSearchResult;
import java.util.List;

/* renamed from: X.Dzq, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C31884Dzq extends C2UU {
    public int A00;
    public List A01 = C16930sl.A00;
    public final Context A02;
    public final FG2 A03;
    public final InterfaceC132405yL A04;
    public final boolean A05;

    @Override // X.C2UU
    public final void onBindViewHolder(C3OO c3oo, int i) {
        C14360o3.A0B(c3oo, 0);
        if (c3oo instanceof E3A) {
            this.A04.Dqk(AbstractC31171DnF.A06(c3oo), null, (DirectSearchResult) this.A01.get(i), "direct_user_search", 40, i % 3, i, -1, false);
            E3A e3a = (E3A) c3oo;
            DirectSearchPrompt directSearchPrompt = (DirectSearchPrompt) this.A01.get(i);
            int i2 = this.A00;
            AbstractC167007dF.A1K(e3a, directSearchPrompt);
            TextView textView = e3a.A02;
            String str = directSearchPrompt.A01;
            textView.setText(str);
            textView.setContentDescription(textView.getContext().getString(2131966451, Integer.valueOf(i + 1), Integer.valueOf(i2), str));
            e3a.A03.setText(directSearchPrompt.A03);
            e3a.A01 = directSearchPrompt;
            e3a.A00 = i;
        }
    }

    @Override // X.C2UU
    public final C3OO onCreateViewHolder(ViewGroup viewGroup, int i) {
        C14360o3.A0B(viewGroup, 0);
        Context context = this.A02;
        boolean z = this.A05;
        FG2 fg2 = this.A03;
        View A0D = AbstractC25227BEk.A0D(LayoutInflater.from(context), viewGroup, R.layout.meta_ai_pill_keyword, false);
        E3A e3a = new E3A(A0D);
        AbstractC13350mL.A00(A0D, new C57751Pje(17, fg2, e3a), C36H.A03(C36G.A09, 1));
        if (!z) {
            e3a.A02.setVisibility(8);
        }
        return e3a;
    }

    public C31884Dzq(Context context, FG2 fg2, InterfaceC132405yL interfaceC132405yL, boolean z) {
        this.A02 = context;
        this.A05 = z;
        this.A03 = fg2;
        this.A04 = interfaceC132405yL;
    }

    @Override // X.C2UU
    public final int getItemCount() {
        int A03 = C0f9.A03(-1705617213);
        int size = this.A01.size();
        C0f9.A0A(-1607989954, A03);
        return size;
    }
}
