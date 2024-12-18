package X;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import com.instagram.common.session.UserSession;
import com.instagram.igds.components.peoplecell.IgdsPeopleCell;

/* renamed from: X.EYm, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C32638EYm extends AbstractC66422zJ {
    public final Fragment A00;
    public final UserSession A01;
    public final FPN A02;
    public final boolean A03;

    @Override // X.AbstractC66422zJ
    public final /* bridge */ /* synthetic */ C3OO createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        return new C31943E1x(this.A02, new IgdsPeopleCell(AbstractC31176DnK.A04(viewGroup), false));
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0048, code lost:
    
        if (r12 == null) goto L6;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v3, types: [android.view.View, X.3sV, com.instagram.igds.components.button.IgdsButton] */
    @Override // X.AbstractC66422zJ
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final /* bridge */ /* synthetic */ void bind(X.InterfaceC66482zP r24, X.C3OO r25) {
        /*
            Method dump skipped, instructions count: 273
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C32638EYm.bind(X.2zP, X.3OO):void");
    }

    public C32638EYm(Fragment fragment, UserSession userSession, FPN fpn, boolean z) {
        AbstractC167017dG.A1Q(userSession, fpn);
        this.A01 = userSession;
        this.A00 = fragment;
        this.A02 = fpn;
        this.A03 = z;
    }

    @Override // X.AbstractC66422zJ
    public final Class modelClass() {
        return C32087E8l.class;
    }
}
