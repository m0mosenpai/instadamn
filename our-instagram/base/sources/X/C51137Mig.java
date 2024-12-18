package X;

import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.R;
import com.instagram.common.typedurl.ImageUrl;
import java.util.List;

/* renamed from: X.Mig, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C51137Mig extends C2UU {
    public final Activity A00;
    public final InterfaceC60442pS A01;
    public final NOX A02;
    public final List A03;

    public C51137Mig(Activity activity, InterfaceC60442pS interfaceC60442pS, NOX nox, List list) {
        C14360o3.A0B(nox, 3);
        this.A00 = activity;
        this.A01 = interfaceC60442pS;
        this.A02 = nox;
        this.A03 = list;
    }

    @Override // X.C2UU
    public final /* bridge */ /* synthetic */ C3OO onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new C51330Mlr(AbstractC25226BEj.A0R(AbstractC25231BEo.A0O(viewGroup), viewGroup, R.layout.lead_ads_multi_submit_row, false));
    }

    @Override // X.C2UU
    public final /* bridge */ /* synthetic */ void onBindViewHolder(C3OO c3oo, int i) {
        C51330Mlr c51330Mlr = (C51330Mlr) c3oo;
        C14360o3.A0B(c51330Mlr, 0);
        P2Q p2q = (P2Q) this.A03.get(i);
        c51330Mlr.A01.setText(p2q.A04);
        c51330Mlr.A02.setText(p2q.A06);
        ImageUrl imageUrl = p2q.A01;
        if (imageUrl != null) {
            c51330Mlr.A03.setUrl(imageUrl, AbstractC31171DnF.A0D("lead_ads_multi_submit_adapter"));
        }
        View view = c51330Mlr.A00;
        ViewOnClickListenerC55455Ok9.A01(view, 55, c51330Mlr);
        c51330Mlr.A04.setOnCheckedChangeListener(new C35732FqF(this, i, 2));
        view.setOnLongClickListener(new ViewOnLongClickListenerC55477OkW(this, i));
    }

    @Override // X.C2UU
    public final int getItemCount() {
        int A03 = C0f9.A03(-1718445486);
        int size = this.A03.size();
        C0f9.A0A(-1335478755, A03);
        return size;
    }
}
