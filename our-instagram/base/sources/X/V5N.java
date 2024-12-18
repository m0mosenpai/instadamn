package X;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.facebook.R;
import com.instagram.common.session.UserSession;

/* loaded from: classes11.dex */
public final class V5N extends AbstractC66412zI {
    public final Context A00;
    public final InterfaceC11380iw A01;
    public final UserSession A02;
    public final C68820Vcb A03;

    public V5N(Context context, InterfaceC11380iw interfaceC11380iw, UserSession userSession, C68820Vcb c68820Vcb) {
        C14360o3.A0B(userSession, 2);
        this.A00 = context;
        this.A02 = userSession;
        this.A03 = c68820Vcb;
        this.A01 = interfaceC11380iw;
    }

    @Override // X.AbstractC66422zJ
    public final /* bridge */ /* synthetic */ C3OO createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        AbstractC167007dF.A1K(viewGroup, layoutInflater);
        int i = C3OO.FLAG_ADAPTER_FULLUPDATE;
        UserSession userSession = this.A02;
        return new UJZ(AbstractC25226BEj.A0R(layoutInflater, viewGroup, R.layout.row_places_map, false), this.A01, userSession);
    }

    /* JADX WARN: Removed duplicated region for block: B:55:0x0108  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x012f  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0151  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x01bd  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x017a  */
    @Override // X.AbstractC66422zJ
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final /* bridge */ /* synthetic */ void bind(X.InterfaceC66482zP r24, X.C3OO r25) {
        /*
            Method dump skipped, instructions count: 463
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.V5N.bind(X.2zP, X.3OO):void");
    }

    @Override // X.AbstractC66422zJ
    public final Class modelClass() {
        return C70801WhH.class;
    }
}
