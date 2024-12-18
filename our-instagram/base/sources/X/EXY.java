package X;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.facebook.R;
import com.instagram.common.session.UserSession;

/* loaded from: classes6.dex */
public final class EXY extends AbstractC66412zI {
    public final Context A00;
    public final InterfaceC11380iw A01;
    public final UserSession A02;
    public final InterfaceC37168GZf A03;

    /* JADX WARN: Code restructure failed: missing block: B:17:0x00d7, code lost:
    
        if (X.C14360o3.A0K(r1, "secure_group") != false) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0078, code lost:
    
        if (X.C14360o3.A0K(r1, "secure_group") != false) goto L8;
     */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.AbstractC66422zJ
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final /* bridge */ /* synthetic */ void bind(X.InterfaceC66482zP r23, X.C3OO r24) {
        /*
            Method dump skipped, instructions count: 240
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.EXY.bind(X.2zP, X.3OO):void");
    }

    @Override // X.AbstractC66422zJ
    public final /* bridge */ /* synthetic */ C3OO createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        int i = C3OO.FLAG_ADAPTER_FULLUPDATE;
        return new C31984E3m(AbstractC31172DnG.A0A(layoutInflater, viewGroup, R.layout.direct_inbox_search_row_layout));
    }

    public EXY(Context context, InterfaceC11380iw interfaceC11380iw, UserSession userSession, InterfaceC37168GZf interfaceC37168GZf) {
        this.A00 = context;
        this.A03 = interfaceC37168GZf;
        this.A01 = interfaceC11380iw;
        this.A02 = userSession;
    }

    @Override // X.AbstractC66422zJ
    public final Class modelClass() {
        return C36207FyL.class;
    }
}
