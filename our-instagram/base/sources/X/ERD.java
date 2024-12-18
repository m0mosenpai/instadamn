package X;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.facebook.R;

/* loaded from: classes6.dex */
public final class ERD extends AbstractC65632xz {
    public final Context A00;
    public final InterfaceC37175GZm A01;

    @Override // X.InterfaceC65642y0
    public final /* bridge */ /* synthetic */ void buildRowViewTypes(AnonymousClass306 anonymousClass306, Object obj, Object obj2) {
        anonymousClass306.A7a(0);
    }

    @Override // X.InterfaceC65642y0
    public final int getViewTypeCount() {
        return 1;
    }

    public ERD(Context context, InterfaceC37175GZm interfaceC37175GZm) {
        this.A00 = context;
        this.A01 = interfaceC37175GZm;
    }

    @Override // X.InterfaceC65642y0
    public final void bindView(int i, View view, Object obj, Object obj2) {
        String A0p;
        int A03 = C0f9.A03(-1062104488);
        Context context = this.A00;
        C34455FGt c34455FGt = (C34455FGt) AbstractC31172DnG.A0x(view);
        FJL fjl = (FJL) obj;
        InterfaceC37175GZm interfaceC37175GZm = this.A01;
        AbstractC167017dG.A1P(c34455FGt, fjl);
        TextView textView = c34455FGt.A00;
        if (textView != null) {
            if (context != null) {
                if (interfaceC37175GZm != null) {
                    if (fjl.A01.intValue() != 0) {
                        Integer num = fjl.A00;
                        if (num == null || (A0p = AbstractC167007dF.A0f(context, num, 2131973177)) == null) {
                            A0p = AbstractC166997dE.A0p(context, 2131973168);
                        }
                        textView.setText(A0p);
                    } else {
                        AbstractC166987dD.A1P(context, textView, 2131973176);
                        AbstractC13880nE.A0U(textView, AbstractC167017dG.A09(context));
                    }
                    ViewOnClickListenerC31591DuJ.A00(textView, 57, fjl, interfaceC37175GZm);
                    C0f9.A0A(-1671602748, A03);
                    return;
                }
                throw AbstractC166987dD.A14("Required value was null.");
            }
            throw AbstractC166987dD.A14("Required value was null.");
        }
        throw AbstractC166987dD.A14("Required value was null.");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [X.FGt, java.lang.Object] */
    @Override // X.InterfaceC65642y0
    public final View createView(int i, ViewGroup viewGroup) {
        int A03 = C0f9.A03(-2077552562);
        View A0C = AbstractC25227BEk.A0C(LayoutInflater.from(this.A00), R.layout.row_newsfeed_view_all);
        C14360o3.A07(A0C);
        ?? obj = new Object();
        obj.A00 = AbstractC166997dE.A0T(A0C, R.id.see_all_button);
        A0C.setTag(obj);
        C0f9.A0A(434896144, A03);
        return A0C;
    }
}
