package X;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.facebook.R;

/* renamed from: X.Buw, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C26955Buw extends AbstractC65632xz {
    @Override // X.InterfaceC65642y0
    public final /* bridge */ /* synthetic */ void buildRowViewTypes(AnonymousClass306 anonymousClass306, Object obj, Object obj2) {
        C14360o3.A0B(anonymousClass306, 0);
        anonymousClass306.A7a(0);
    }

    @Override // X.InterfaceC65642y0
    public final int getViewTypeCount() {
        return 1;
    }

    @Override // X.InterfaceC65642y0
    public final void bindView(int i, View view, Object obj, Object obj2) {
        int A0G = AbstractC25231BEo.A0G(view, -1265008369);
        Object tag = view.getTag();
        C14360o3.A0C(tag, "null cannot be cast to non-null type com.instagram.creation.capture.assetpicker.StickerDropNewSectionViewBinder.Holder");
        C27825COo c27825COo = (C27825COo) tag;
        C14360o3.A0B(c27825COo, 0);
        TextView textView = c27825COo.A00;
        AbstractC166987dD.A1P(textView.getContext(), textView, 2131974411);
        C0f9.A0A(-1712404330, A0G);
    }

    @Override // X.InterfaceC65642y0
    public final View createView(int i, ViewGroup viewGroup) {
        int A0G = AbstractC25231BEo.A0G(viewGroup, 90513408);
        View inflate = AbstractC25228BEl.A0P(viewGroup).inflate(R.layout.layout_sticker_drop_new_section, viewGroup, false);
        C14360o3.A0A(inflate);
        inflate.setTag(new C27825COo(inflate));
        C0f9.A0A(1471176569, A0G);
        return inflate;
    }
}
