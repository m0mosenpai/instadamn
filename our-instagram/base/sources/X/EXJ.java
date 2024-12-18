package X;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.facebook.R;
import com.instagram.common.session.UserSession;

/* loaded from: classes6.dex */
public final class EXJ extends AbstractC66412zI {
    public final UserSession A00;
    public final FGB A01;

    /* JADX WARN: Code restructure failed: missing block: B:70:0x019f, code lost:
    
        if (r4.A05() == r5) goto L74;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x01a1, code lost:
    
        r2 = r13.A06;
        r2.setImageResource(com.facebook.R.drawable.instagram_circle_check_pano_filled_24);
        r1 = r13.A00;
        X.AbstractC31177DnL.A0p(r1, r2, X.AbstractC53242c7.A08(r1));
        r0 = 2131972225;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x01bd, code lost:
    
        if (r4.A07 != r3) goto L83;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x01c1, code lost:
    
        if (r12.A02 == false) goto L83;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x01b9, code lost:
    
        if (r4 != null) goto L78;
     */
    @Override // X.AbstractC66422zJ
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final /* bridge */ /* synthetic */ void bind(X.InterfaceC66482zP r12, X.C3OO r13) {
        /*
            Method dump skipped, instructions count: 570
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.EXJ.bind(X.2zP, X.3OO):void");
    }

    public EXJ(UserSession userSession, FGB fgb) {
        this.A01 = fgb;
        this.A00 = userSession;
    }

    @Override // X.AbstractC66422zJ
    public final /* bridge */ /* synthetic */ C3OO createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        AbstractC167017dG.A1N(viewGroup, layoutInflater);
        int i = C3OO.FLAG_ADAPTER_FULLUPDATE;
        return new C31990E3s(AbstractC25226BEj.A0R(layoutInflater, viewGroup, R.layout.collection_row, false));
    }

    @Override // X.AbstractC66422zJ
    public final Class modelClass() {
        return C36204FyI.class;
    }
}
