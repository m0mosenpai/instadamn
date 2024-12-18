package X;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.facebook.R;
import com.instagram.common.ui.base.IgTextView;
import java.util.Calendar;
import java.util.concurrent.TimeUnit;

/* loaded from: classes8.dex */
public final class KJD extends AbstractC66422zJ {
    @Override // X.AbstractC66422zJ
    public final /* bridge */ /* synthetic */ C3OO createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        AbstractC31175DnJ.A1R(viewGroup, layoutInflater);
        return new C44668JqD(AbstractC25226BEj.A0R(layoutInflater, viewGroup, R.layout.direct_scheduled_message_text, false));
    }

    @Override // X.AbstractC66422zJ
    public final /* bridge */ /* synthetic */ void bind(InterfaceC66482zP interfaceC66482zP, C3OO c3oo) {
        C45215Jzv c45215Jzv = (C45215Jzv) interfaceC66482zP;
        C44668JqD c44668JqD = (C44668JqD) c3oo;
        boolean A1R = AbstractC167007dF.A1R(0, c45215Jzv, c44668JqD);
        C83403nh c83403nh = c45215Jzv.A04;
        Long l = c83403nh.A1Q;
        if (l != null) {
            long longValue = l.longValue();
            IgTextView igTextView = c44668JqD.A01;
            igTextView.setText(c83403nh.A1q);
            igTextView.setTextColor(c45215Jzv.A00);
            igTextView.setBackground(c45215Jzv.A01);
            igTextView.setOnLongClickListener(c45215Jzv.A02);
            igTextView.setOnTouchListener(new C7BK(new JYK(A1R ? 1 : 0, c45215Jzv, c44668JqD), AbstractC31171DnF.A06(c44668JqD), igTextView, A1R));
            IgTextView igTextView2 = c44668JqD.A00;
            Context context = igTextView2.getContext();
            C7R2 c7r2 = c45215Jzv.A03;
            if (c7r2 != C7R2.A04 && c7r2 != C7R2.A02) {
                Calendar calendar = MX0.A02;
                C14360o3.A0A(context);
                String A00 = AbstractC34087F2p.A00(context, TimeUnit.SECONDS.toMillis(longValue));
                if (c83403nh.A0P() != null) {
                    A00 = AbstractC31174DnI.A0t(context, context.getString(2131972869), A00, 2131964621);
                }
                if (c45215Jzv.A05) {
                    A00 = AbstractC31174DnI.A0t(context, A00, context.getString(2131962077), 2131964621);
                    AbstractC31177DnL.A0q(context, igTextView2, R.attr.igds_color_error_or_destructive);
                }
                igTextView2.setText(A00);
                igTextView2.setVisibility(0);
            }
            igTextView.post(new RunnableC49867M0m(c44668JqD));
        }
    }

    @Override // X.AbstractC66422zJ
    public final Class modelClass() {
        return C45215Jzv.class;
    }
}
