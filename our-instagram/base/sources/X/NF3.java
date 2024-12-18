package X;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.facebook.R;

/* loaded from: classes9.dex */
public final class NF3 extends AbstractC66422zJ {
    public final Context A00;

    @Override // X.AbstractC66422zJ
    public final /* bridge */ /* synthetic */ C3OO createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        AbstractC167007dF.A1K(viewGroup, layoutInflater);
        return new C51373MmY(AbstractC25227BEk.A0D(layoutInflater, viewGroup, R.layout.immersive_catch_up_filtered_item, false), this.A00);
    }

    @Override // X.AbstractC66422zJ
    public final /* bridge */ /* synthetic */ void bind(InterfaceC66482zP interfaceC66482zP, C3OO c3oo) {
        C51817MvL c51817MvL = (C51817MvL) interfaceC66482zP;
        C51373MmY c51373MmY = (C51373MmY) c3oo;
        AbstractC167017dG.A1N(c51817MvL, c51373MmY);
        c51373MmY.A04.setUrl(c51817MvL.A00, c51373MmY);
        c51373MmY.A02.setUrl(c51817MvL.A01, c51373MmY);
        c51373MmY.A01.setText(c51817MvL.A03);
        Integer num = c51817MvL.A02;
        if (num != null) {
            int intValue = num.intValue();
            AbstractC166997dE.A19(c51373MmY.A00, c51373MmY.A03, intValue);
        }
    }

    @Override // X.AbstractC66422zJ
    public final Class modelClass() {
        return C51817MvL.class;
    }

    public NF3(Context context) {
        this.A00 = context;
    }
}
