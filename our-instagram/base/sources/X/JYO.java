package X;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.facebook.R;
import com.instagram.common.session.UserSession;

/* loaded from: classes8.dex */
public final class JYO extends AbstractC66412zI {
    public final Context A00;
    public final UserSession A01;
    public final C43993Jcg A02;

    @Override // X.AbstractC66422zJ
    public final /* bridge */ /* synthetic */ C3OO createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        View inflate;
        boolean A1R = AbstractC167007dF.A1R(0, viewGroup, layoutInflater);
        UserSession userSession = this.A01;
        if (AbstractC25225BEi.A07(AbstractC25225BEi.A0j(userSession, 0), userSession, 36609807310264289L) > 0) {
            inflate = C50802Vb.A00(layoutInflater, new ViewGroup.LayoutParams(-1, -2), viewGroup, R.layout.layout_header_with_action_text, 0, false, A1R);
        } else {
            inflate = layoutInflater.inflate(R.layout.layout_header_with_action_text, viewGroup, false);
        }
        int i = C3OO.FLAG_ADAPTER_FULLUPDATE;
        C14360o3.A0A(inflate);
        return new C44108JeY(inflate);
    }

    @Override // X.AbstractC66422zJ
    public final /* bridge */ /* synthetic */ void bind(InterfaceC66482zP interfaceC66482zP, C3OO c3oo) {
        Context context;
        C51u A00;
        JTN jtn = (JTN) interfaceC66482zP;
        C44108JeY c44108JeY = (C44108JeY) c3oo;
        AbstractC167007dF.A1K(jtn, c44108JeY);
        c44108JeY.A03.setText(jtn.A01);
        TextView textView = c44108JeY.A04;
        AbstractC56952jT.A01(textView);
        ImageView imageView = c44108JeY.A02;
        AbstractC56952jT.A04(imageView, C05F.A15);
        if (jtn.A02) {
            textView.setVisibility(8);
            ViewOnClickListenerC48072LPx.A01(c44108JeY.A00, 48, this);
            boolean A06 = C18U.A06(C06090Tz.A06, this.A01, 36322237774833741L);
            ImageView imageView2 = c44108JeY.A01;
            int i = R.drawable.instagram_x_pano_outline_8;
            if (A06) {
                i = R.drawable.instagram_x_pano_outline_12;
            }
            imageView2.setImageResource(i);
            imageView2.setVisibility(0);
            return;
        }
        UserSession userSession = this.A01;
        C43777JXq A002 = JYM.A00(userSession, EnumC132075xi.A0E);
        if (A002 != null && A002.A08.get()) {
            context = this.A00;
            A00 = AbstractC43738JVx.A00(AbstractC166997dE.A0M(context), jtn.A00, A002.A09.get(), A002.A0A.get());
        } else {
            context = this.A00;
            A00 = AbstractC43710JUv.A00(context, userSession, jtn.A00);
        }
        textView.setText((String) A00.A02);
        ViewOnClickListenerC48072LPx.A01(textView, 49, this);
        c44108JeY.A01.setVisibility(8);
        AbstractC166987dD.A1O(context, textView, C1QI.A01(context));
        textView.setVisibility(0);
        if (C18U.A06(C06090Tz.A05, userSession, 36329298700812539L) && !AbstractC14480oK.A01(context)) {
            imageView.setVisibility(0);
            ViewOnClickListenerC48072LPx.A01(imageView, 50, this);
        } else {
            imageView.setVisibility(8);
        }
    }

    @Override // X.AbstractC66422zJ
    public final Class modelClass() {
        return JTN.class;
    }

    public JYO(Context context, UserSession userSession, C43993Jcg c43993Jcg) {
        this.A00 = context;
        this.A01 = userSession;
        this.A02 = c43993Jcg;
    }
}
