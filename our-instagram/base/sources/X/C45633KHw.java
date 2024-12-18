package X;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.facebook.R;
import java.util.List;

/* renamed from: X.KHw, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C45633KHw extends AbstractC66412zI {
    public final Context A00;
    public final C43850JaE A01;

    public C45633KHw(Context context, C43850JaE c43850JaE) {
        C14360o3.A0B(c43850JaE, 2);
        this.A00 = context;
        this.A01 = c43850JaE;
    }

    @Override // X.AbstractC66422zJ
    public final /* bridge */ /* synthetic */ C3OO createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        AbstractC167007dF.A1K(viewGroup, layoutInflater);
        return new C44685JqU(AbstractC25227BEk.A0D(layoutInflater, viewGroup, R.layout.folder_row, false));
    }

    @Override // X.AbstractC66422zJ
    public final /* bridge */ /* synthetic */ void bind(InterfaceC66482zP interfaceC66482zP, C3OO c3oo) {
        C43874Jae c43874Jae = (C43874Jae) interfaceC66482zP;
        C44685JqU c44685JqU = (C44685JqU) c3oo;
        AbstractC167017dG.A1N(c43874Jae, c44685JqU);
        c44685JqU.A02.setText(c43874Jae.A00.getName());
        int i = 0;
        TextView textView = c44685JqU.A01;
        textView.setVisibility(8);
        textView.setText((CharSequence) null);
        View view = c44685JqU.A00;
        ViewOnClickListenerC48068LPt.A00(view, this, c44685JqU, c43874Jae, 4);
        List list = (List) this.A01.A00.A01.A02();
        if (list == null) {
            list = C16930sl.A00;
        }
        if (c43874Jae.equals(AbstractC001800i.A0L(list))) {
            i = AbstractC167017dG.A0F(this.A00);
        }
        AbstractC13880nE.A0U(view, i);
    }

    @Override // X.AbstractC66422zJ
    public final Class modelClass() {
        return C43874Jae.class;
    }
}
