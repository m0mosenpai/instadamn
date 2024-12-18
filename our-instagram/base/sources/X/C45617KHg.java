package X;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.R;
import com.instagram.igds.components.banner.IgdsBanner;

/* renamed from: X.KHg, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C45617KHg extends AbstractC66412zI {
    public final L6V A00;

    @Override // X.AbstractC66422zJ
    public final /* bridge */ /* synthetic */ void bind(InterfaceC66482zP interfaceC66482zP, C3OO c3oo) {
        C45649KIm c45649KIm = (C45649KIm) interfaceC66482zP;
        C44595Jou c44595Jou = (C44595Jou) c3oo;
        AbstractC167017dG.A1N(c45649KIm, c44595Jou);
        L6V l6v = this.A00;
        boolean A1U = AbstractC167007dF.A1U(l6v);
        IgdsBanner igdsBanner = c44595Jou.A00;
        igdsBanner.setBody(c45649KIm.A01, Boolean.valueOf(A1U));
        igdsBanner.setAction(c45649KIm.A00);
        igdsBanner.A00 = new G81(l6v, 6);
    }

    @Override // X.AbstractC66422zJ
    public final Class modelClass() {
        return C45649KIm.class;
    }

    public C45617KHg(L6V l6v) {
        this.A00 = l6v;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [X.3OO, X.Jou] */
    @Override // X.AbstractC66422zJ
    public final /* bridge */ /* synthetic */ C3OO createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        AbstractC167017dG.A1N(viewGroup, layoutInflater);
        int i = C3OO.FLAG_ADAPTER_FULLUPDATE;
        View A0R = AbstractC25226BEj.A0R(layoutInflater, viewGroup, R.layout.pending_threads_banner_row, false);
        ?? c3oo = new C3OO(A0R);
        c3oo.A00 = (IgdsBanner) AbstractC166997dE.A0R(A0R, R.id.pending_threads_banner);
        return c3oo;
    }
}
