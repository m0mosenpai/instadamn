package X;

import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.facebook.R;

/* renamed from: X.HHr, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C39067HHr extends AbstractC66412zI {
    @Override // X.AbstractC66422zJ
    public final /* bridge */ /* synthetic */ C3OO createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        View inflate = AbstractC25231BEo.A0O(viewGroup).inflate(R.layout.product_feed_section_empty_state_text, viewGroup, false);
        C14360o3.A0C(inflate, AbstractC111324zv.A00(3));
        return new C38417Gus((TextView) inflate);
    }

    @Override // X.AbstractC66422zJ
    public final /* bridge */ /* synthetic */ void bind(InterfaceC66482zP interfaceC66482zP, C3OO c3oo) {
        H78 h78 = (H78) interfaceC66482zP;
        C38417Gus c38417Gus = (C38417Gus) c3oo;
        AbstractC167017dG.A1N(h78, c38417Gus);
        TextView textView = c38417Gus.A00;
        Resources resources = textView.getResources();
        C14360o3.A07(resources);
        textView.setText(VSL.A00(resources, h78.A00));
    }

    @Override // X.AbstractC66422zJ
    public final Class modelClass() {
        return H78.class;
    }
}
