package X;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.facebook.R;
import com.instagram.common.session.UserSession;

/* loaded from: classes8.dex */
public final class KJY extends AbstractC66422zJ {
    public final UserSession A00;
    public final C47448Kxd A01;

    public KJY(UserSession userSession, C47448Kxd c47448Kxd) {
        C14360o3.A0B(userSession, 2);
        this.A01 = c47448Kxd;
        this.A00 = userSession;
    }

    @Override // X.AbstractC66422zJ
    public final /* bridge */ /* synthetic */ C3OO createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        AbstractC167007dF.A1K(viewGroup, layoutInflater);
        return new C44748JrV(AbstractC25227BEk.A0D(layoutInflater, viewGroup, R.layout.friend_map_note_update_item, false), this.A00);
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x0055, code lost:
    
        if (r0.length() == 0) goto L8;
     */
    @Override // X.AbstractC66422zJ
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final /* bridge */ /* synthetic */ void bind(X.InterfaceC66482zP r19, X.C3OO r20) {
        /*
            Method dump skipped, instructions count: 296
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.KJY.bind(X.2zP, X.3OO):void");
    }

    @Override // X.AbstractC66422zJ
    public final Class modelClass() {
        return C45211Jzr.class;
    }
}
