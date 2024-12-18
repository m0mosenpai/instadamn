package X;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.R;
import com.instagram.igds.components.headline.IgdsHeadline;

/* renamed from: X.EQx, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C32445EQx extends AbstractC65632xz {
    public final Context A00;

    @Override // X.InterfaceC65642y0
    public final int getViewTypeCount() {
        return 1;
    }

    public C32445EQx(Context context) {
        this.A00 = context;
    }

    @Override // X.InterfaceC65642y0
    public final void bindView(int i, View view, Object obj, Object obj2) {
        C51753Mtc c51753Mtc;
        int A03 = C0f9.A03(-435472866);
        if (view != null && obj != null && C51753Mtc.A00(obj, 23) && (c51753Mtc = (C51753Mtc) obj) != null) {
            Object tag = view.getTag();
            C14360o3.A0C(tag, "null cannot be cast to non-null type com.instagram.wellbeing.reporting.common.adapter.BottomSheetHeadlineViewBinder.Holder");
            IgdsHeadline igdsHeadline = (IgdsHeadline) AbstractC166997dE.A0R(((FI1) tag).A00, R.id.headline);
            igdsHeadline.setHeadline(c51753Mtc.A01);
            Number number = (Number) c51753Mtc.A02;
            if (number != null) {
                igdsHeadline.setBody(number.intValue());
            }
        }
        C0f9.A0A(-1496187299, A03);
    }

    @Override // X.InterfaceC65642y0
    public final View createView(int i, ViewGroup viewGroup) {
        int A03 = C0f9.A03(-1531599388);
        LayoutInflater from = LayoutInflater.from(this.A00);
        C14360o3.A0A(from);
        C14360o3.A0B(from, 0);
        View A0C = AbstractC31173DnH.A0C(from, viewGroup, R.layout.reporting_bottom_sheet_headline_row, false);
        A0C.setTag(new FI1(A0C));
        C0f9.A0A(1729857402, A03);
        return A0C;
    }

    @Override // X.InterfaceC65642y0
    public final /* bridge */ /* synthetic */ void buildRowViewTypes(AnonymousClass306 anonymousClass306, Object obj, Object obj2) {
        AbstractC31180DnO.A1S(anonymousClass306);
    }
}
