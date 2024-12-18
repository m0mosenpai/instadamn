package X;

import android.text.SpannableStringBuilder;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.facebook.R;
import com.instagram.common.ui.base.IgTextView;

/* renamed from: X.EWz, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C32599EWz extends AbstractC66412zI {
    @Override // X.AbstractC66422zJ
    public final /* bridge */ /* synthetic */ C3OO createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        AbstractC31175DnJ.A1R(viewGroup, layoutInflater);
        return new C31927E1h(AbstractC25226BEj.A0R(layoutInflater, viewGroup, R.layout.transparency_text_row, false));
    }

    @Override // X.AbstractC66422zJ
    public final /* bridge */ /* synthetic */ void bind(InterfaceC66482zP interfaceC66482zP, C3OO c3oo) {
        C32625EXz c32625EXz = (C32625EXz) interfaceC66482zP;
        C31927E1h c31927E1h = (C31927E1h) c3oo;
        AbstractC167017dG.A1N(c32625EXz, c31927E1h);
        IgTextView igTextView = c31927E1h.A00;
        String str = c32625EXz.A02;
        SpannableStringBuilder A0H = AbstractC25225BEi.A0H(c32625EXz.A01);
        AnonymousClass773.A05(A0H, c32625EXz.A00, str);
        AbstractC31176DnK.A1G(igTextView, A0H);
    }

    @Override // X.AbstractC66422zJ
    public final Class modelClass() {
        return C32625EXz.class;
    }
}
