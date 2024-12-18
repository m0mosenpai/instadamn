package X;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.base.IgTextView;

/* loaded from: classes6.dex */
public final class ER7 extends AbstractC65632xz {
    public final UserSession A00;
    public final C24042Ale A01;

    @Override // X.InterfaceC65642y0
    public final int getViewTypeCount() {
        return 1;
    }

    public ER7(UserSession userSession, C24042Ale c24042Ale) {
        this.A00 = userSession;
        this.A01 = c24042Ale;
    }

    @Override // X.InterfaceC65642y0
    public final void bindView(int i, View view, Object obj, Object obj2) {
        int A0G = AbstractC25231BEo.A0G(view, -1607033080);
        Object tag = view.getTag();
        C14360o3.A0C(tag, "null cannot be cast to non-null type com.instagram.creation.capture.quickcapture.recipientpicker.AudienceListsRowViewBinder.Holder");
        C34579FLo c34579FLo = (C34579FLo) tag;
        C24042Ale c24042Ale = this.A01;
        C14360o3.A0C(obj, "null cannot be cast to non-null type com.instagram.creation.capture.quickcapture.recipientpicker.AudienceListsRowViewModel");
        C36193Fy7 c36193Fy7 = (C36193Fy7) obj;
        AbstractC25233BEq.A0v(0, c34579FLo, c24042Ale, c36193Fy7);
        int i2 = c36193Fy7.A00;
        IgTextView igTextView = c34579FLo.A01;
        if (i2 > 0) {
            igTextView.setText(AbstractC167017dG.A0k(c34579FLo.A00.getResources(), i2, R.plurals.recipient_picker_audience_lists_count));
        } else {
            igTextView.setText(2131971572);
        }
        ViewOnClickListenerC35679FpE.A01(c34579FLo.A00, 42, c24042Ale);
        C0f9.A0A(-1540328331, A0G);
    }

    @Override // X.InterfaceC65642y0
    public final View createView(int i, ViewGroup viewGroup) {
        int A0G = AbstractC25231BEo.A0G(viewGroup, 1424894495);
        C14360o3.A0B(this.A00, 0);
        Context context = viewGroup.getContext();
        View A0C = AbstractC31173DnH.A0C(LayoutInflater.from(context), viewGroup, R.layout.recipient_picker_audience_lists, false);
        C14360o3.A07(context);
        A0C.setTag(new C34579FLo(context, A0C));
        C0f9.A0A(1793537881, A0G);
        return A0C;
    }

    @Override // X.InterfaceC65642y0
    public final /* bridge */ /* synthetic */ void buildRowViewTypes(AnonymousClass306 anonymousClass306, Object obj, Object obj2) {
        AbstractC31176DnK.A1T(anonymousClass306);
    }
}
