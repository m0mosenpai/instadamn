package X;

import android.view.View;
import android.view.ViewGroup;
import com.facebook.R;

/* renamed from: X.HEp, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C38987HEp extends AbstractC65632xz {
    public final JG0 A00;

    @Override // X.InterfaceC65642y0
    public final int getViewTypeCount() {
        return 2;
    }

    public C38987HEp(JG0 jg0) {
        this.A00 = jg0;
    }

    @Override // X.InterfaceC65642y0
    public final void bindView(int i, View view, Object obj, Object obj2) {
        int A03 = C0f9.A03(-141766213);
        AbstractC167007dF.A1D(view, 1, obj);
        IEW iew = (IEW) obj;
        if (i != 0) {
            if (i == 1) {
                ViewOnClickListenerC42034Ik3.A00(view, 16, iew, this);
                AbstractC166997dE.A0T(view, R.id.notice_text_view).setText(iew.A01);
            } else {
                IllegalStateException A14 = AbstractC166987dD.A14("Unsupported view type");
                C0f9.A0A(-553548781, A03);
                throw A14;
            }
        } else {
            AbstractC166997dE.A0T(view, R.id.sponsored_debug_text_view).setText(iew.A00);
            ViewOnClickListenerC42032Ik1.A01(view, 20, this);
        }
        C0f9.A0A(1803836534, A03);
    }

    @Override // X.InterfaceC65642y0
    public final /* bridge */ /* synthetic */ void buildRowViewTypes(AnonymousClass306 anonymousClass306, Object obj, Object obj2) {
        AbstractC31176DnK.A1T(anonymousClass306);
        anonymousClass306.A7a(1);
    }

    @Override // X.InterfaceC65642y0
    public final View createView(int i, ViewGroup viewGroup) {
        View A0R;
        int i2;
        int A03 = C0f9.A03(-1883444173);
        C14360o3.A0B(viewGroup, 1);
        if (i != 0) {
            if (i == 1) {
                A0R = AbstractC25226BEj.A0R(AbstractC25228BEl.A0P(viewGroup), viewGroup, R.layout.row_feed_notice, false);
                i2 = -1977510036;
            } else {
                IllegalStateException A14 = AbstractC166987dD.A14("Unsupported view type");
                C0f9.A0A(-1228129201, A03);
                throw A14;
            }
        } else {
            A0R = AbstractC25226BEj.A0R(AbstractC25228BEl.A0P(viewGroup), viewGroup, R.layout.row_feed_sponsored_debug, false);
            i2 = 247423807;
        }
        C0f9.A0A(i2, A03);
        return A0R;
    }
}
