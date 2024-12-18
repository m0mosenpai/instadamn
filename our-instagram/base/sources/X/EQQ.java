package X;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;

/* loaded from: classes6.dex */
public final class EQQ extends AbstractC65632xz {
    public Context A00;
    public InterfaceC11380iw A01;
    public UserSession A02;
    public InterfaceC37297Gby A03;
    public C31538DtO A04;

    @Override // X.InterfaceC65642y0
    public final /* bridge */ /* synthetic */ void buildRowViewTypes(AnonymousClass306 anonymousClass306, Object obj, Object obj2) {
        anonymousClass306.A7a(0);
    }

    @Override // X.InterfaceC65642y0
    public final int getViewTypeCount() {
        return 1;
    }

    @Override // X.InterfaceC65642y0
    public final void bindView(int i, View view, Object obj, Object obj2) {
        int A03 = C0f9.A03(-878483092);
        C31579Du7 c31579Du7 = (C31579Du7) AbstractC31172DnG.A0x(view);
        InterfaceC37297Gby interfaceC37297Gby = this.A03;
        AbstractC31578Du6.A01(null, this.A00, this.A01, this.A02, null, (User) obj, null, null, interfaceC37297Gby, c31579Du7, this.A04, false, false, false, false);
        C0f9.A0A(33580013, A03);
    }

    @Override // X.InterfaceC65642y0
    public final View createView(int i, ViewGroup viewGroup) {
        int A03 = C0f9.A03(1078982866);
        View A00 = AbstractC31578Du6.A00(viewGroup.getContext(), viewGroup);
        C0f9.A0A(-1388797242, A03);
        return A00;
    }
}
