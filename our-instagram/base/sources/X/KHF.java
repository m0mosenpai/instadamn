package X;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.R;

/* loaded from: classes8.dex */
public final class KHF extends AbstractC66412zI {
    @Override // X.AbstractC66422zJ
    public final /* bridge */ /* synthetic */ void bind(InterfaceC66482zP interfaceC66482zP, C3OO c3oo) {
        int i;
        LZW lzw = (LZW) interfaceC66482zP;
        C44679JqO c44679JqO = (C44679JqO) c3oo;
        AbstractC167017dG.A1N(lzw, c44679JqO);
        String str = lzw.A01;
        Integer num = lzw.A00;
        if (num != null) {
            i = JQ0.A07(c44679JqO.A00, num.intValue());
        } else {
            i = 0;
        }
        c44679JqO.A00.setPadding(i, 0, i, 0);
        c44679JqO.A01.setText(str);
    }

    @Override // X.AbstractC66422zJ
    public final Class modelClass() {
        return LZW.class;
    }

    @Override // X.AbstractC66422zJ
    public final /* bridge */ /* synthetic */ C3OO createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        AbstractC167017dG.A1N(viewGroup, layoutInflater);
        View A0D = AbstractC25227BEk.A0D(layoutInflater, viewGroup, R.layout.row_iglive_post_live_subtitle, false);
        A0D.setTag(new C44679JqO(A0D));
        Object tag = A0D.getTag();
        if (tag instanceof C44679JqO) {
            return (C3OO) tag;
        }
        return null;
    }
}
