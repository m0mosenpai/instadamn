package X;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.facebook.R;

/* renamed from: X.Lwz, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C49668Lwz implements YPv {
    public final /* synthetic */ C51622Yk A00;

    @Override // X.YPv
    public final /* bridge */ /* synthetic */ Object AEb(Object obj) {
        C51622Yk c51622Yk = this.A00;
        ViewGroup A0F = AbstractC31173DnH.A0F(c51622Yk.A0G, R.id.content);
        View view = c51622Yk.A0I.A01;
        view.getClass();
        A0F.addView(view);
        return null;
    }

    @Override // X.YPv
    public final /* bridge */ /* synthetic */ Object AEc(Object obj) {
        AbstractC31171DnF.A14(AbstractC166997dE.A0T(this.A00.A0G, R.id.content));
        return null;
    }

    @Override // X.YPv
    public final /* bridge */ /* synthetic */ Object AEy(Object obj) {
        View requireViewById = this.A00.A0G.requireViewById(R.id.content);
        TextView A0T = AbstractC166997dE.A0T(requireViewById, R.id.tooltip_bold_text);
        TextView A0T2 = AbstractC166997dE.A0T(requireViewById, R.id.tooltip_plain_text);
        AbstractC31171DnF.A14(A0T);
        A0T2.setText((CharSequence) null);
        return null;
    }

    public C49668Lwz(C51622Yk c51622Yk) {
        this.A00 = c51622Yk;
    }

    @Override // X.YPv
    public final /* bridge */ /* synthetic */ Object AEu(Object obj) {
        return null;
    }

    @Override // X.YPv
    public final /* bridge */ /* synthetic */ Object AEv(Object obj) {
        return null;
    }

    @Override // X.YPv
    public final /* bridge */ /* synthetic */ Object AEw(Object obj) {
        return null;
    }

    @Override // X.YPv
    public final /* bridge */ /* synthetic */ Object AEx(Object obj) {
        return null;
    }
}
