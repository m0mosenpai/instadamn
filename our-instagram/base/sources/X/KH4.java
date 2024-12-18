package X;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.facebook.R;
import com.instagram.common.ui.base.IgSimpleImageView;
import com.instagram.common.ui.base.IgTextView;
import java.text.SimpleDateFormat;
import java.util.Locale;

/* loaded from: classes8.dex */
public final class KH4 extends AbstractC66412zI {
    @Override // X.AbstractC66422zJ
    public final /* bridge */ /* synthetic */ C3OO createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        AbstractC31175DnJ.A1R(viewGroup, layoutInflater);
        return new C44715Jqy(AbstractC25226BEj.A0R(layoutInflater, viewGroup, R.layout.card_gallery_title_card_layout, false));
    }

    @Override // X.AbstractC66422zJ
    public final /* bridge */ /* synthetic */ void bind(InterfaceC66482zP interfaceC66482zP, C3OO c3oo) {
        String format;
        int i;
        int i2;
        C45209Jzp c45209Jzp = (C45209Jzp) interfaceC66482zP;
        C44715Jqy c44715Jqy = (C44715Jqy) c3oo;
        boolean A1R = AbstractC167007dF.A1R(0, c45209Jzp, c44715Jqy);
        c44715Jqy.A03.setText(c45209Jzp.A03);
        c44715Jqy.A02.setText(c45209Jzp.A02);
        Integer num = c45209Jzp.A01;
        if (num != null) {
            int intValue = num.intValue();
            IgSimpleImageView igSimpleImageView = c44715Jqy.A00;
            igSimpleImageView.setImageResource(intValue);
            igSimpleImageView.setVisibility(0);
        }
        Double d = c45209Jzp.A00;
        if (d != null) {
            double doubleValue = d.doubleValue();
            IgTextView igTextView = c44715Jqy.A01;
            Context A0L = AbstractC166997dE.A0L(igTextView);
            long j = (long) doubleValue;
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("d", Locale.getDefault());
            Long valueOf = Long.valueOf(j);
            String format2 = simpleDateFormat.format(valueOf);
            C14360o3.A07(format2);
            int parseInt = Integer.parseInt(format2);
            String format3 = new SimpleDateFormat("d", Locale.getDefault()).format(AbstractC31173DnH.A0g());
            C14360o3.A07(format3);
            int parseInt2 = Integer.parseInt(format3);
            String format4 = new SimpleDateFormat("h:mm a", Locale.getDefault()).format(valueOf);
            int i3 = parseInt - parseInt2;
            if (i3 == 0) {
                i2 = 2131958997;
            } else if (i3 == A1R) {
                i2 = 2131958998;
            } else {
                format = new SimpleDateFormat("EEE, MMM d", Locale.getDefault()).format(valueOf);
                i = 2131954937;
                String A0t = AbstractC31174DnI.A0t(A0L, format, format4, i);
                C14360o3.A0A(A0t);
                igTextView.setText(A0t);
                igTextView.setVisibility(0);
            }
            format = AbstractC166997dE.A0p(A0L, i2);
            i = 2131954936;
            String A0t2 = AbstractC31174DnI.A0t(A0L, format, format4, i);
            C14360o3.A0A(A0t2);
            igTextView.setText(A0t2);
            igTextView.setVisibility(0);
        }
    }

    @Override // X.AbstractC66422zJ
    public final Class modelClass() {
        return C45209Jzp.class;
    }
}
