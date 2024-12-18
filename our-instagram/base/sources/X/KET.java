package X;

import android.view.View;
import android.view.ViewGroup;
import com.instagram.common.session.UserSession;

/* loaded from: classes8.dex */
public final class KET extends AbstractC65632xz {
    public final UserSession A00;
    public final MR8 A01;

    @Override // X.InterfaceC65642y0
    public final /* bridge */ /* synthetic */ void buildRowViewTypes(AnonymousClass306 anonymousClass306, Object obj, Object obj2) {
        anonymousClass306.A7a(0);
    }

    @Override // X.InterfaceC65642y0
    public final int getViewTypeCount() {
        return 1;
    }

    public KET(UserSession userSession, MR8 mr8) {
        this.A01 = mr8;
        this.A00 = userSession;
    }

    @Override // X.InterfaceC65642y0
    public final void bindView(int i, View view, Object obj, Object obj2) {
        int A03 = C0f9.A03(-1181240020);
        view.getTag().getClass();
        JYW jyw = (JYW) view.getTag();
        JY5.A01(this.A00, this.A01, jyw, (JTJ) obj);
        C0f9.A0A(-782430793, A03);
    }

    @Override // X.InterfaceC65642y0
    public final View createView(int i, ViewGroup viewGroup) {
        int A03 = C0f9.A03(-139570275);
        View A00 = JY5.A00(AbstractC25228BEl.A0P(viewGroup), viewGroup, this.A00);
        C0f9.A0A(1361028152, A03);
        return A00;
    }
}
