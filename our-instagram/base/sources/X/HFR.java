package X;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;

/* loaded from: classes7.dex */
public final class HFR extends AbstractC65632xz {
    public final Context A00;
    public final InterfaceC11380iw A01;
    public final UserSession A02;
    public final C41186IKz A03;

    @Override // X.AbstractC65632xz, X.InterfaceC65642y0
    public final int getIdentifier(int i, Object obj, Object obj2) {
        C14360o3.A0B(obj, 1);
        return ((User) obj).getId().hashCode();
    }

    @Override // X.AbstractC65632xz, X.InterfaceC65642y0
    public final int getViewModelHash(int i, Object obj, Object obj2) {
        return Integer.MIN_VALUE;
    }

    @Override // X.InterfaceC65642y0
    public final int getViewTypeCount() {
        return 1;
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0093, code lost:
    
        if (r1 != null) goto L19;
     */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00eb  */
    @Override // X.InterfaceC65642y0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void bindView(int r16, android.view.View r17, java.lang.Object r18, java.lang.Object r19) {
        /*
            Method dump skipped, instructions count: 318
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.HFR.bindView(int, android.view.View, java.lang.Object, java.lang.Object):void");
    }

    @Override // X.InterfaceC65642y0
    public final /* bridge */ /* synthetic */ void buildRowViewTypes(AnonymousClass306 anonymousClass306, Object obj, Object obj2) {
        ((Number) obj2).intValue();
        AbstractC31176DnK.A1T(anonymousClass306);
    }

    public HFR(Context context, InterfaceC11380iw interfaceC11380iw, UserSession userSession, C41186IKz c41186IKz) {
        this.A00 = context;
        this.A02 = userSession;
        this.A01 = interfaceC11380iw;
        this.A03 = c41186IKz;
    }

    @Override // X.InterfaceC65642y0
    public final View createView(int i, ViewGroup viewGroup) {
        int A0G = AbstractC25231BEo.A0G(viewGroup, 1247217487);
        ViewGroup viewGroup2 = (ViewGroup) AbstractC31175DnJ.A07(LayoutInflater.from(this.A00), viewGroup, R.layout.creator_inspiration_hub_account_fragment_row_user, false);
        viewGroup2.setTag(new C41122IIn(viewGroup2));
        C0f9.A0A(-1746104579, A0G);
        return viewGroup2;
    }
}
