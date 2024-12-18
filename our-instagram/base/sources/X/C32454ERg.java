package X;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.facebook.R;
import com.instagram.common.session.UserSession;

/* renamed from: X.ERg, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C32454ERg extends AbstractC65632xz {
    public final Context A00;
    public final EQ9 A01;
    public final InterfaceC11380iw A02;
    public final UserSession A03;

    @Override // X.InterfaceC65642y0
    public final /* bridge */ /* synthetic */ void buildRowViewTypes(AnonymousClass306 anonymousClass306, Object obj, Object obj2) {
        anonymousClass306.A7a(0);
    }

    @Override // X.InterfaceC65642y0
    public final int getViewTypeCount() {
        return 1;
    }

    public C32454ERg(Context context, EQ9 eq9, InterfaceC11380iw interfaceC11380iw, UserSession userSession) {
        this.A03 = userSession;
        this.A00 = context;
        this.A02 = interfaceC11380iw;
        this.A01 = eq9;
    }

    @Override // X.InterfaceC65642y0
    public final void bindView(int i, View view, Object obj, Object obj2) {
        int A03 = C0f9.A03(-413219306);
        if (view.getTag() == null) {
            C0f9.A0A(798105432, A03);
        } else {
            view.getTag();
            throw AbstractC166987dD.A15("getPagePhotoRowData");
        }
    }

    @Override // X.InterfaceC65642y0
    public final View createView(int i, ViewGroup viewGroup) {
        int A03 = C0f9.A03(134369530);
        Context context = this.A00;
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setLayoutParams(new LinearLayout.LayoutParams(-1, -2, 1.0f));
        linearLayout.setOrientation(1);
        View A0A = AbstractC31172DnG.A0A(LayoutInflater.from(context), linearLayout, R.layout.page_row_with_preview);
        A0A.setTag(new FNL(A0A));
        linearLayout.addView(A0A);
        FNL fnl = (FNL) A0A.getTag();
        if (fnl != null) {
            linearLayout.setTag(new C34402FEs(fnl));
        }
        C0f9.A0A(139403945, A03);
        return linearLayout;
    }
}
