package X;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.R;

/* loaded from: classes6.dex */
public final class EQY extends AbstractC65632xz {
    public final C24042Ale A00;

    @Override // X.InterfaceC65642y0
    public final int getViewTypeCount() {
        return 1;
    }

    public EQY(C24042Ale c24042Ale) {
        this.A00 = c24042Ale;
    }

    @Override // X.InterfaceC65642y0
    public final void bindView(int i, View view, Object obj, Object obj2) {
        int A03 = C0f9.A03(2030224100);
        C14360o3.A0B(view, 1);
        Object tag = view.getTag();
        C14360o3.A0C(tag, "null cannot be cast to non-null type com.instagram.creation.capture.quickcapture.recipientpicker.SaveStoryToHighlightsViewBinder.Holder");
        FKF fkf = (FKF) tag;
        C24042Ale c24042Ale = this.A00;
        AbstractC25230BEn.A15(1, fkf, c24042Ale);
        AbstractC166997dE.A19(fkf.A00, fkf.A02, R.drawable.instagram_story_highlight_pano_outline_24);
        ViewOnClickListenerC35679FpE.A01(fkf.A01, 46, c24042Ale);
        C0f9.A0A(-1611178061, A03);
    }

    @Override // X.InterfaceC65642y0
    public final View createView(int i, ViewGroup viewGroup) {
        int A0G = AbstractC25231BEo.A0G(viewGroup, 1898228838);
        Context context = viewGroup.getContext();
        View A0C = AbstractC31173DnH.A0C(LayoutInflater.from(context), viewGroup, R.layout.recipient_picker_save_story_to_highlights, false);
        C14360o3.A07(context);
        A0C.setTag(new FKF(A0C, context));
        C0f9.A0A(-1122529421, A0G);
        return A0C;
    }

    @Override // X.InterfaceC65642y0
    public final /* bridge */ /* synthetic */ void buildRowViewTypes(AnonymousClass306 anonymousClass306, Object obj, Object obj2) {
        AbstractC31176DnK.A1T(anonymousClass306);
    }
}
