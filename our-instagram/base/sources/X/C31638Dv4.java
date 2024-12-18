package X;

import android.text.SpannableStringBuilder;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.TextView;
import com.facebook.R;

/* renamed from: X.Dv4, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C31638Dv4 extends AbstractC66412zI {
    @Override // X.AbstractC66422zJ
    public final /* bridge */ /* synthetic */ C3OO createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        AbstractC31175DnJ.A1R(viewGroup, layoutInflater);
        return new E2L(AbstractC25226BEj.A0R(layoutInflater, viewGroup, R.layout.layout_general_folder_banner, false));
    }

    @Override // X.AbstractC66422zJ
    public final /* bridge */ /* synthetic */ void bind(InterfaceC66482zP interfaceC66482zP, C3OO c3oo) {
        C31612Due c31612Due = (C31612Due) interfaceC66482zP;
        E2L e2l = (E2L) c3oo;
        AbstractC167017dG.A1N(c31612Due, e2l);
        e2l.A02.setText(c31612Due.A03);
        SpannableStringBuilder append = AbstractC25225BEi.A0H(c31612Due.A02).append((CharSequence) " ");
        C14360o3.A07(append);
        int length = append.length();
        append.append((CharSequence) c31612Due.A01);
        append.setSpan(new KXT(c31612Due, AbstractC31173DnH.A01(e2l.A00)), length, append.length(), 33);
        TextView textView = e2l.A01;
        AbstractC25227BEk.A11(textView);
        textView.setText(append);
    }

    @Override // X.AbstractC66422zJ
    public final Class modelClass() {
        return C31612Due.class;
    }
}
