package X;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.facebook.R;

/* renamed from: X.Gpe, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C38111Gpe extends AbstractC66412zI {
    public final String A00;

    @Override // X.AbstractC66422zJ
    public final /* bridge */ /* synthetic */ C3OO createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        AbstractC31175DnJ.A1R(viewGroup, layoutInflater);
        View inflate = layoutInflater.inflate(R.layout.title_header, viewGroup, false);
        C14360o3.A0C(inflate, AbstractC111324zv.A00(3));
        return new C38409Guk((TextView) inflate);
    }

    @Override // X.AbstractC66422zJ
    public final /* bridge */ /* synthetic */ void bind(InterfaceC66482zP interfaceC66482zP, C3OO c3oo) {
        C38409Guk c38409Guk = (C38409Guk) c3oo;
        C14360o3.A0B(c38409Guk, 1);
        String str = this.A00;
        C14360o3.A0B(str, 0);
        c38409Guk.A00.setText(str);
    }

    @Override // X.AbstractC66422zJ
    public final Class modelClass() {
        return HKd.class;
    }

    public C38111Gpe(String str) {
        this.A00 = str;
    }
}
