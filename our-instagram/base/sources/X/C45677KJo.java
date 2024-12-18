package X;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.R;
import com.instagram.common.session.UserSession;

/* renamed from: X.KJo, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C45677KJo extends AbstractC66422zJ {
    public final UserSession A00;
    public final C48757LhP A01;
    public final KC6 A02;
    public final boolean A03;

    @Override // X.AbstractC66422zJ
    public final /* bridge */ /* synthetic */ C3OO createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        AbstractC31175DnJ.A1R(viewGroup, layoutInflater);
        return new C44764Jrl(AbstractC25226BEj.A0R(layoutInflater, viewGroup, R.layout.friend_map_floaty_cluster_item, false), this);
    }

    /* JADX WARN: Code restructure failed: missing block: B:48:0x0164, code lost:
    
        if (r4.length() == 0) goto L56;
     */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0131  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x015f  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x016d  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x01b6  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0233  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0156  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0217  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x021d  */
    @Override // X.AbstractC66422zJ
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final /* bridge */ /* synthetic */ void bind(X.InterfaceC66482zP r20, X.C3OO r21) {
        /*
            Method dump skipped, instructions count: 598
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C45677KJo.bind(X.2zP, X.3OO):void");
    }

    @Override // X.AbstractC66422zJ
    public final Class modelClass() {
        return C45205Jzl.class;
    }

    @Override // X.AbstractC66422zJ
    public final /* bridge */ /* synthetic */ void unbind(C3OO c3oo) {
        C44764Jrl c44764Jrl = (C44764Jrl) c3oo;
        C14360o3.A0B(c44764Jrl, 0);
        c44764Jrl.A00 = null;
        c44764Jrl.A03.clearAnimation();
        KC6 kc6 = c44764Jrl.A08.A02;
        View A06 = AbstractC31171DnF.A06(c44764Jrl);
        C47694L4b c47694L4b = kc6.A05;
        if (c47694L4b == null) {
            C14360o3.A0F("floatyClusterViewpointHelper");
            throw C00O.createAndThrow();
        }
        c47694L4b.A01.A04(A06);
        c47694L4b.A05.remove(A06);
    }

    public C45677KJo(UserSession userSession, C48757LhP c48757LhP, KC6 kc6) {
        AbstractC167017dG.A1P(userSession, c48757LhP);
        this.A00 = userSession;
        this.A01 = c48757LhP;
        this.A02 = kc6;
        this.A03 = C18U.A06(C06090Tz.A05, userSession, 2342164731595663120L);
    }
}
