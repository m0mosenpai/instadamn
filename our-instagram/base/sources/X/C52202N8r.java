package X;

import android.view.View;
import android.view.ViewGroup;
import com.facebook.R;

/* renamed from: X.N8r, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C52202N8r extends AbstractC65632xz {
    public C54411O2r A00;

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
        int A03 = C0f9.A03(1238266363);
        ViewOnClickListenerC55465OkK.A01(view, 26, this, obj);
        C0f9.A0A(1780919631, A03);
    }

    @Override // X.InterfaceC65642y0
    public final View createView(int i, ViewGroup viewGroup) {
        int A03 = C0f9.A03(-1816186709);
        View A0A = AbstractC31172DnG.A0A(AbstractC25228BEl.A0P(viewGroup), viewGroup, R.layout.direct_private_story_recipients_view_more_suggestions_row);
        C0f9.A0A(-1142746599, A03);
        return A0A;
    }
}
