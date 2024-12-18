package X;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.facebook.R;

/* renamed from: X.HEn, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C38985HEn extends AbstractC65632xz {
    @Override // X.InterfaceC65642y0
    public final /* bridge */ /* synthetic */ void buildRowViewTypes(AnonymousClass306 anonymousClass306, Object obj, Object obj2) {
        AbstractC167007dF.A1K(anonymousClass306, obj);
        anonymousClass306.A7b(0, obj, 0);
    }

    @Override // X.InterfaceC65642y0
    public final int getViewTypeCount() {
        return 1;
    }

    @Override // X.InterfaceC65642y0
    public final void bindView(int i, View view, Object obj, Object obj2) {
        int A03 = C0f9.A03(723797583);
        AbstractC167017dG.A1P(view, obj);
        IFF iff = (IFF) obj;
        C14360o3.A0B(iff, 1);
        Object tag = view.getTag();
        if (tag != null) {
            IFH ifh = (IFH) tag;
            ifh.A01.setText(iff.A01);
            TextView textView = ifh.A00;
            CharSequence charSequence = iff.A00;
            textView.setText(charSequence);
            AbstractC31176DnK.A1G(textView, charSequence);
            C0f9.A0A(-1191980627, A03);
            return;
        }
        throw AbstractC166997dE.A0g();
    }

    @Override // X.InterfaceC65642y0
    public final View createView(int i, ViewGroup viewGroup) {
        int A0G = AbstractC25231BEo.A0G(viewGroup, 2135529451);
        View A0C = AbstractC31173DnH.A0C(AbstractC25228BEl.A0P(viewGroup), viewGroup, R.layout.catalog_inline_title_layout, false);
        A0C.setTag(new IFH(A0C));
        C0f9.A0A(496505020, A0G);
        return A0C;
    }
}
