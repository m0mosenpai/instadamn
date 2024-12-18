package X;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.facebook.R;

/* renamed from: X.EQa, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C32425EQa extends AbstractC65632xz {
    public final Context A00;

    @Override // X.InterfaceC65642y0
    public final int getViewTypeCount() {
        return 1;
    }

    public C32425EQa(Context context) {
        this.A00 = context;
    }

    @Override // X.InterfaceC65642y0
    public final void bindView(int i, View view, Object obj, Object obj2) {
        int A03 = C0f9.A03(-489833358);
        AbstractC167017dG.A1P(view, obj);
        Object tag = view.getTag();
        C14360o3.A0C(tag, "null cannot be cast to non-null type com.instagram.direct.e2ee.ui.menu.SecureMessageBannerItemViewBinder.Holder");
        F27.A00((C32066E6s) obj, (E1L) tag);
        C0f9.A0A(474392642, A03);
    }

    @Override // X.InterfaceC65642y0
    public final View createView(int i, ViewGroup viewGroup) {
        int A0G = AbstractC25231BEo.A0G(viewGroup, 489657562);
        View A0D = AbstractC25227BEk.A0D(AbstractC31172DnG.A09(this.A00), viewGroup, R.layout.layout_thread_detail_secure_message_learn_more, false);
        E1L e1l = new E1L(A0D);
        A0D.setTag(e1l);
        TextView textView = e1l.A00;
        C0f9.A0A(-877152216, A0G);
        return textView;
    }

    @Override // X.InterfaceC65642y0
    public final /* bridge */ /* synthetic */ void buildRowViewTypes(AnonymousClass306 anonymousClass306, Object obj, Object obj2) {
        AbstractC31176DnK.A1T(anonymousClass306);
    }
}
