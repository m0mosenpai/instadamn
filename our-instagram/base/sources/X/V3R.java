package X;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.widget.imageview.CircularImageView;
import com.instagram.user.model.User;

/* loaded from: classes11.dex */
public final class V3R extends AbstractC168697g3 {
    public final C68822Vcd A00;
    public final Context A01;
    public final InterfaceC11380iw A02;
    public final UserSession A03;
    public final C47732L5t A04 = new V7q(this);
    public final C68758Vbb A05;
    public final W1V A06;

    @Override // X.InterfaceC65642y0
    public final /* bridge */ /* synthetic */ void buildRowViewTypes(AnonymousClass306 anonymousClass306, Object obj, Object obj2) {
        anonymousClass306.A7a(0);
    }

    @Override // X.InterfaceC65642y0
    public final int getViewTypeCount() {
        return 1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v19, types: [X.VJT, java.lang.Object] */
    @Override // X.InterfaceC65642y0
    public final View getView(int i, View view, ViewGroup viewGroup, Object obj, Object obj2) {
        int i2;
        VJT vjt;
        C68759Vbc c68759Vbc;
        C68759Vbc c68759Vbc2;
        View view2 = view;
        int A03 = C0f9.A03(334316289);
        VJF vjf = (VJF) obj;
        C153336v2 c153336v2 = (C153336v2) obj2;
        if (view == null) {
            Context context = this.A01;
            view2 = LayoutInflater.from(context).inflate(R.layout.location_page_single_section_rounded_corner_linear_layout, viewGroup, false);
            ViewGroup viewGroup2 = (ViewGroup) view2.requireViewById(R.id.container);
            VJT vjt2 = null;
            if (vjf.A00 != null) {
                LinearLayout linearLayout = new LinearLayout(context);
                linearLayout.setTag(new C68759Vbc(linearLayout));
                viewGroup2.addView(linearLayout);
                c68759Vbc2 = (C68759Vbc) linearLayout.getTag();
            } else {
                c68759Vbc2 = null;
            }
            if (vjf.A01 != null) {
                View inflate = LayoutInflater.from(context).inflate(R.layout.location_page_business_row, viewGroup2, false);
                CircularImageView circularImageView = (CircularImageView) inflate.findViewById(R.id.profile_imageview);
                TextView textView = (TextView) inflate.findViewById(R.id.username);
                TextView textView2 = (TextView) inflate.findViewById(R.id.view_profile);
                ?? obj3 = new Object();
                obj3.A02 = circularImageView;
                obj3.A00 = textView;
                obj3.A01 = textView2;
                inflate.setTag(obj3);
                viewGroup2.addView(inflate);
                vjt2 = (VJT) inflate.getTag();
            }
            view2.setTag(new C69136ViR(viewGroup2, c68759Vbc2, vjt2));
        }
        Context context2 = this.A01;
        C69136ViR c69136ViR = (C69136ViR) AbstractC31172DnG.A0x(view2);
        if (c153336v2 == null) {
            i2 = 0;
        } else {
            i2 = c153336v2.A00;
        }
        C47732L5t c47732L5t = this.A04;
        InterfaceC11380iw interfaceC11380iw = this.A02;
        UserSession userSession = this.A03;
        W1V w1v = this.A06;
        C68758Vbb c68758Vbb = this.A05;
        IC0 ic0 = vjf.A00;
        if (ic0 != null && (c68759Vbc = c69136ViR.A01) != null) {
            AbstractC40621Hzf.A00(interfaceC11380iw, userSession, c47732L5t, c68758Vbb, c68759Vbc, ic0, i2);
        }
        User user = vjf.A01;
        if (user != null && (vjt = c69136ViR.A02) != null) {
            CircularImageView circularImageView2 = vjt.A02;
            if (circularImageView2 != null) {
                AbstractC31173DnH.A1T(interfaceC11380iw, circularImageView2, user);
            }
            TextView textView3 = vjt.A00;
            if (textView3 != null) {
                textView3.setText(user.B8y());
            }
            TextView textView4 = vjt.A01;
            if (textView4 != null) {
                AbstractC31173DnH.A19(context2.getResources(), textView4, 2131976876);
            }
            TextView textView5 = vjt.A01;
            textView5.getClass();
            WNU.A00(textView5, 48, w1v);
            CircularImageView circularImageView3 = vjt.A02;
            circularImageView3.getClass();
            WNU.A00(circularImageView3, 49, w1v);
            TextView textView6 = vjt.A00;
            textView6.getClass();
            WNU.A00(textView6, 50, w1v);
        }
        C0f9.A0A(-1259500212, A03);
        return view2;
    }

    public V3R(Context context, InterfaceC11380iw interfaceC11380iw, UserSession userSession, C68758Vbb c68758Vbb, C68822Vcd c68822Vcd, W1V w1v) {
        this.A01 = context;
        this.A05 = c68758Vbb;
        this.A02 = interfaceC11380iw;
        this.A03 = userSession;
        this.A06 = w1v;
        this.A00 = c68822Vcd;
    }
}
