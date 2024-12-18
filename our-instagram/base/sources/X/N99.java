package X;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.creation.capture.quickcapture.postcreation.IngestSessionShim;
import java.util.Collections;

/* loaded from: classes9.dex */
public final class N99 extends AbstractC65632xz {
    public final Context A00;
    public final InterfaceC11380iw A01;
    public final UserSession A02;
    public final IngestSessionShim A03;
    public final C54406O2m A04;
    public final C211689Zc A05;
    public final InterfaceC58010Pnu A06;

    @Override // X.InterfaceC65642y0
    public final /* bridge */ /* synthetic */ void buildRowViewTypes(AnonymousClass306 anonymousClass306, Object obj, Object obj2) {
        anonymousClass306.A7a(0);
    }

    @Override // X.InterfaceC65642y0
    public final int getViewTypeCount() {
        return 1;
    }

    public N99(Context context, InterfaceC11380iw interfaceC11380iw, UserSession userSession, IngestSessionShim ingestSessionShim, C54406O2m c54406O2m, C211689Zc c211689Zc, InterfaceC58010Pnu interfaceC58010Pnu) {
        C18C.A0G(AbstractC43593JPy.A1Y(ingestSessionShim.A00.size()), "Blast lists only supports one media send for now");
        this.A00 = context;
        this.A02 = userSession;
        this.A06 = interfaceC58010Pnu;
        this.A03 = ingestSessionShim;
        this.A04 = c54406O2m;
        this.A05 = c211689Zc;
        this.A01 = interfaceC11380iw;
    }

    @Override // X.InterfaceC65642y0
    public final void bindView(int i, View view, Object obj, Object obj2) {
        int A03 = C0f9.A03(749869345);
        C54529O7g c54529O7g = (C54529O7g) obj;
        java.util.Set set = c54529O7g.A01;
        java.util.Set unmodifiableSet = Collections.unmodifiableSet(set);
        C14360o3.A07(unmodifiableSet);
        C34942FaS A01 = this.A06.AXK().A01(C51690MsL.A04);
        OBq oBq = (OBq) AbstractC31172DnG.A0x(view);
        P20 p20 = new P20(this, unmodifiableSet);
        C55096Ob7 c55096Ob7 = oBq.A03;
        java.util.Set unmodifiableSet2 = Collections.unmodifiableSet(set);
        C14360o3.A07(unmodifiableSet2);
        c55096Ob7.A04(A01, p20, unmodifiableSet2.size());
        TextView textView = oBq.A02;
        AbstractC31177DnL.A0r(textView.getContext(), textView, c54529O7g.A00, 2131960441);
        C0f9.A0A(286810593, A03);
    }

    @Override // X.InterfaceC65642y0
    public final View createView(int i, ViewGroup viewGroup) {
        int A03 = C0f9.A03(-164377399);
        UserSession userSession = this.A02;
        View A0A = AbstractC31172DnG.A0A(AbstractC25228BEl.A0P(viewGroup), viewGroup, R.layout.recipient_picker_blast_list_candidates);
        A0A.setTag(new OBq(A0A, userSession));
        C0f9.A0A(-691841118, A03);
        return A0A;
    }
}
