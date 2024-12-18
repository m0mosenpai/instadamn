package X;

import android.view.View;
import android.view.ViewGroup;
import com.facebook.R;

/* loaded from: classes8.dex */
public final class KEP extends AbstractC65632xz {
    public final C24042Ale A00;

    @Override // X.InterfaceC65642y0
    public final int getViewTypeCount() {
        return 1;
    }

    public KEP(C24042Ale c24042Ale) {
        this.A00 = c24042Ale;
    }

    @Override // X.InterfaceC65642y0
    public final void bindView(int i, View view, Object obj, Object obj2) {
        int A03 = C0f9.A03(-1284411135);
        C14360o3.A0B(view, 1);
        Object tag = view.getTag();
        C14360o3.A0C(tag, "null cannot be cast to non-null type com.instagram.creation.capture.quickcapture.recipientpicker.MessageRowViewBinder.Holder");
        L14 l14 = (L14) tag;
        C24042Ale c24042Ale = this.A00;
        AbstractC25230BEn.A15(1, l14, c24042Ale);
        C0fQ.A00(new ViewOnClickListenerC55457OkB(c24042Ale, 20), l14.A00);
        l14.A01.setImageResource(R.drawable.instagram_direct_pano_outline_16);
        l14.A02.setText(2131966348);
        C0f9.A0A(378881820, A03);
    }

    @Override // X.InterfaceC65642y0
    public final View createView(int i, ViewGroup viewGroup) {
        int A0G = AbstractC25231BEo.A0G(viewGroup, 1361031303);
        View A0C = AbstractC31173DnH.A0C(AbstractC25228BEl.A0P(viewGroup), viewGroup, R.layout.recipient_picker_share_to_destination_row, false);
        A0C.setTag(new L14(A0C));
        C0f9.A0A(1036470691, A0G);
        return A0C;
    }

    @Override // X.InterfaceC65642y0
    public final /* bridge */ /* synthetic */ void buildRowViewTypes(AnonymousClass306 anonymousClass306, Object obj, Object obj2) {
        AbstractC31176DnK.A1T(anonymousClass306);
    }
}
