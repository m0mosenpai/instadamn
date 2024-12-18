package X;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.R;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.common.ui.base.IgTextView;
import com.instagram.user.model.User;

/* renamed from: X.N8x, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C52208N8x extends AbstractC65632xz {
    public final InterfaceC11380iw A00;
    public final C24042Ale A01;

    @Override // X.InterfaceC65642y0
    public final int getViewTypeCount() {
        return 1;
    }

    @Override // X.InterfaceC65642y0
    public final void bindView(int i, View view, Object obj, Object obj2) {
        ImageUrl Bhu;
        int i2;
        int A03 = C0f9.A03(1133932270);
        C14360o3.A0B(view, 1);
        Object tag = view.getTag();
        C14360o3.A0C(tag, "null cannot be cast to non-null type com.instagram.creation.capture.quickcapture.recipientpicker.OpalRowViewBinder.Holder");
        C54668OCu c54668OCu = (C54668OCu) tag;
        InterfaceC11380iw interfaceC11380iw = this.A00;
        C14360o3.A0C(obj, "null cannot be cast to non-null type com.instagram.creation.capture.quickcapture.recipientpicker.OpalRowViewModel");
        Ov8 ov8 = (Ov8) obj;
        C24042Ale c24042Ale = this.A01;
        C14360o3.A0B(c54668OCu, 0);
        AbstractC25233BEq.A0v(1, interfaceC11380iw, ov8, c24042Ale);
        View view2 = c54668OCu.A00;
        ViewOnClickListenerC55457OkB.A01(view2, 21, c24042Ale);
        Context A0L = AbstractC166997dE.A0L(view2);
        User A01 = C17060sy.A01.A01(ov8.A00);
        InterfaceC109984xS BYy = A01.A03.BYy();
        if (BYy != null) {
            Bhu = AbstractC25225BEi.A0t(BYy.Bhz());
        } else {
            Bhu = A01.Bhu();
        }
        String username = A01.getUsername();
        MSX.A0t();
        if (BYy != null) {
            i2 = BYy.BsV();
        } else {
            i2 = 1;
        }
        String A0r = AbstractC25231BEo.A0r(A0L.getResources(), AbstractC43744JWe.A01(A0L.getResources(), Integer.valueOf(i2), true), R.plurals.opal_post_selection_subtitle, i2);
        c54668OCu.A03.setUrl(Bhu, interfaceC11380iw);
        c54668OCu.A04.setChecked(ov8.A01);
        c54668OCu.A01.setText(username);
        IgTextView igTextView = c54668OCu.A02;
        igTextView.setVisibility(0);
        igTextView.setText(A0r);
        C0f9.A0A(520022158, A03);
    }

    public C52208N8x(InterfaceC11380iw interfaceC11380iw, C24042Ale c24042Ale) {
        this.A01 = c24042Ale;
        this.A00 = interfaceC11380iw;
    }

    @Override // X.InterfaceC65642y0
    public final View createView(int i, ViewGroup viewGroup) {
        int A0G = AbstractC25231BEo.A0G(viewGroup, -1121539643);
        Context context = viewGroup.getContext();
        View A0C = AbstractC31173DnH.A0C(LayoutInflater.from(context), viewGroup, R.layout.recipient_picker_add_to_story, false);
        C14360o3.A07(context);
        A0C.setTag(new C54668OCu(A0C));
        C0f9.A0A(-1035432406, A0G);
        return A0C;
    }

    @Override // X.InterfaceC65642y0
    public final /* bridge */ /* synthetic */ void buildRowViewTypes(AnonymousClass306 anonymousClass306, Object obj, Object obj2) {
        AbstractC31176DnK.A1T(anonymousClass306);
    }
}
