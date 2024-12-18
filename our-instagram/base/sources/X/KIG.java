package X;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.facebook.R;
import com.instagram.common.session.UserSession;

/* loaded from: classes8.dex */
public final class KIG extends AbstractC66412zI {
    public final Context A00;
    public final UserSession A01;
    public final L5W A02;
    public final C49081Ln7 A03;
    public final AnonymousClass988 A04;
    public final C7IM A05;

    public KIG(Context context, UserSession userSession, L5W l5w, C49081Ln7 c49081Ln7, AnonymousClass988 anonymousClass988, C7IM c7im) {
        C14360o3.A0B(userSession, 3);
        this.A02 = l5w;
        this.A03 = c49081Ln7;
        this.A01 = userSession;
        this.A00 = context;
        this.A04 = anonymousClass988;
        this.A05 = c7im;
    }

    @Override // X.AbstractC66422zJ
    public final /* bridge */ /* synthetic */ C3OO createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        AbstractC167007dF.A1K(viewGroup, layoutInflater);
        int A00 = AbstractC47114Ks9.A00(viewGroup);
        int i = C3OO.FLAG_ADAPTER_FULLUPDATE;
        UserSession userSession = this.A01;
        C14360o3.A0B(userSession, 0);
        boolean A01 = LC3.A01(userSession);
        int i2 = R.layout.card_gallery_card_base_legacy_layout;
        if (A01) {
            i2 = R.layout.card_gallery_card_base_layout;
        }
        return new C44774Jrv(this.A00, AbstractC25226BEj.A0R(layoutInflater, viewGroup, i2, false), userSession, this.A02, this.A03, this.A04, this.A05, A00);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0081, code lost:
    
        if (X.AbstractC167007dF.A1Z(r7.A0d) != r4) goto L15;
     */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.AbstractC66422zJ
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final /* bridge */ /* synthetic */ void bind(X.InterfaceC66482zP r26, X.C3OO r27) {
        /*
            Method dump skipped, instructions count: 419
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.KIG.bind(X.2zP, X.3OO):void");
    }

    @Override // X.AbstractC66422zJ
    public final Class modelClass() {
        return KQ8.class;
    }
}
