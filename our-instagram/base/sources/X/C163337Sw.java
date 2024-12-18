package X;

import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.facebook.R;
import com.instagram.common.ui.widget.imageview.CircularImageView;
import com.instagram.igds.components.button.IgdsButton;
import java.util.Collections;
import java.util.List;

/* renamed from: X.7Sw, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C163337Sw implements C7QC {
    public final InterfaceC165247aD A00;
    public final C7YK A01;
    public final C7YL A02;
    public final C162907Rb A03;

    @Override // X.C7QC
    public final /* bridge */ /* synthetic */ C7QD ANU(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        C14360o3.A0B(viewGroup, 0);
        C14360o3.A0B(layoutInflater, 1);
        View inflate = layoutInflater.inflate(R.layout.direct_video_call_item, viewGroup, false);
        C14360o3.A0A(inflate);
        C43713JUy c43713JUy = new C43713JUy(inflate, this.A01, this.A02, (InterfaceC165507ad) this.A00);
        this.A03.A00(c43713JUy);
        return c43713JUy;
    }

    @Override // X.C7QC
    public final /* bridge */ /* synthetic */ void F91(C7QD c7qd) {
        C14360o3.A0B(c7qd, 0);
        this.A03.A01(c7qd);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.C7QC
    public final /* bridge */ /* synthetic */ void ADy(C7QD c7qd, InterfaceC129555tK interfaceC129555tK) {
        View.OnClickListener loj;
        GradientDrawable gradientDrawable;
        TextView textView;
        C43713JUy c43713JUy = (C43713JUy) c7qd;
        JVV jvv = (JVV) interfaceC129555tK;
        C14360o3.A0B(c43713JUy, 0);
        C14360o3.A0B(jvv, 1);
        C7QL c7ql = jvv.A03;
        View view = c43713JUy.A02;
        Object value = c7ql.A05.getValue();
        if (value != null) {
            boolean z = true;
            AbstractC1580577p.A06((Drawable) value, view, c7ql, true);
            C7IM c7im = c7ql.A03;
            int A01 = AbstractC162737Qk.A01(c7im, false);
            TextView textView2 = c43713JUy.A05;
            textView2.setText(jvv.A08);
            textView2.setTextColor(A01);
            String str = jvv.A07;
            TextView textView3 = c43713JUy.A03;
            if (str != null) {
                textView3.setText(str);
                textView3.setTextColor(A01);
                textView3.setVisibility(0);
            } else {
                textView3.setVisibility(8);
            }
            if (jvv.A0B) {
                if (!jvv.A09 && C1QI.A0E().A00) {
                    IgdsButton igdsButton = c43713JUy.A08;
                    igdsButton.setText(jvv.A05);
                    loj = new LOI(c43713JUy);
                    textView = igdsButton;
                } else {
                    TextView textView4 = c43713JUy.A04;
                    textView4.setText(jvv.A05);
                    textView4.setTextColor(A01);
                    Drawable background = textView4.getBackground();
                    if ((background instanceof GradientDrawable) && (gradientDrawable = (GradientDrawable) background) != null) {
                        gradientDrawable.setColor(c7im.A04.A0P);
                    }
                    loj = new LOJ(c43713JUy);
                    textView = textView4;
                }
                C0fQ.A00(loj, textView);
                textView.setVisibility(0);
            }
            CircularImageView circularImageView = c43713JUy.A07;
            circularImageView.setImageDrawable(jvv.A01);
            circularImageView.setBackgroundColor(jvv.A00);
            boolean z2 = ((AbstractC129515tG) jvv).A00.BPA().A0X;
            C3PF c3pf = c43713JUy.A06;
            if (z2) {
                c3pf.A01 = true;
            } else {
                if (jvv.A04 == null) {
                    z = false;
                }
                c3pf.A01 = !z;
            }
            c43713JUy.A00 = jvv;
            this.A03.A02(c43713JUy, jvv);
            return;
        }
        throw new IllegalStateException("Required value was null.");
    }

    public C163337Sw(InterfaceC165247aD interfaceC165247aD, C7YK c7yk, C7YL c7yl, AnonymousClass988 anonymousClass988) {
        this.A00 = interfaceC165247aD;
        this.A01 = c7yk;
        this.A02 = c7yl;
        List singletonList = Collections.singletonList(AbstractC1575875s.A00(new C162897Ra((InterfaceC165207a9) interfaceC165247aD), new C7Q6() { // from class: X.7Sx
            @Override // X.C7Q6
            public final /* bridge */ /* synthetic */ boolean DT4(MotionEvent motionEvent, Object obj, Object obj2) {
                JVV jvv = (JVV) obj;
                C43713JUy c43713JUy = (C43713JUy) obj2;
                C14360o3.A0B(jvv, 0);
                C14360o3.A0B(c43713JUy, 1);
                c43713JUy.A00(jvv);
                return true;
            }
        }, interfaceC165247aD, anonymousClass988));
        C14360o3.A07(singletonList);
        this.A03 = new C162907Rb(singletonList);
    }
}
