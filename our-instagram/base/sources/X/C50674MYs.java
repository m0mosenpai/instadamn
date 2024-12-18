package X;

import android.content.Context;
import android.view.View;
import android.view.accessibility.AccessibilityManager;
import com.facebook.R;
import com.instagram.common.typedurl.ImageUrl;
import java.util.List;

/* renamed from: X.MYs, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C50674MYs {
    public Context A00;
    public View A01;
    public EnumC60792q3 A02;
    public InterfaceC145226gh A03;
    public C31335Dq0 A04;
    public boolean A05;
    public boolean A06;
    public boolean A07;
    public final AbstractC12990ll A08;
    public final List A09;

    public C50674MYs(Context context, AbstractC12990ll abstractC12990ll) {
        AbstractC167007dF.A1D(context, 1, abstractC12990ll);
        this.A00 = context;
        this.A08 = abstractC12990ll;
        this.A09 = AbstractC166987dD.A1E();
        this.A06 = true;
        this.A07 = true;
        this.A02 = EnumC60792q3.A02;
    }

    public final void A01(View.OnClickListener onClickListener, int i) {
        C14360o3.A0B(onClickListener, 1);
        this.A09.add(new C50676MYu(onClickListener, 1.0f, i, AbstractC53242c7.A03(this.A00)));
    }

    public final void A03(View.OnClickListener onClickListener, int i) {
        C14360o3.A0B(onClickListener, 1);
        this.A09.add(new C50676MYu(onClickListener, 1.0f, i, AbstractC53242c7.A0H(this.A00, R.attr.igds_color_primary_text)));
    }

    public final void A04(View.OnClickListener onClickListener, String str, float f) {
        C14360o3.A0B(str, 0);
        int i = R.attr.igds_color_error_or_destructive;
        Context context = this.A00;
        Object systemService = context.getSystemService("accessibility");
        if ((systemService instanceof AccessibilityManager) && AbstractC56862jK.A02((AccessibilityManager) systemService, true) && C1H6.A03()) {
            i = R.attr.igds_color_gradient_pink;
        }
        this.A09.add(new C50676MYu(onClickListener, str, f, AbstractC53242c7.A0H(context, i)));
    }

    public final void A05(View.OnClickListener onClickListener, String str, int i) {
        C14360o3.A0B(str, 0);
        this.A09.add(new C50676MYu(onClickListener, str, AbstractC53242c7.A07(this.A00), i));
    }

    public final void A08(String str) {
        this.A04 = new C31335Dq0(null, str, null);
    }

    public final void A0C(String str, String str2) {
        this.A04 = new C31335Dq0(str, str2, null);
    }

    public final void A00(int i) {
        this.A04 = new C31335Dq0(i);
    }

    public final void A02(View.OnClickListener onClickListener, int i) {
        this.A09.add(new C50676MYu(onClickListener, 1.0f, i, AbstractC53242c7.A0C(this.A00)));
    }

    public final void A06(ImageUrl imageUrl) {
        C31335Dq0 c31335Dq0 = this.A04;
        if (c31335Dq0 != null && imageUrl != null) {
            c31335Dq0.A0B = imageUrl;
        }
    }

    public final void A07(String str) {
        this.A04 = new C31335Dq0(str);
    }

    public final void A09(String str, View.OnClickListener onClickListener) {
        AbstractC167017dG.A1N(str, onClickListener);
        A04(onClickListener, str, 1.0f);
    }

    public final void A0A(String str, View.OnClickListener onClickListener) {
        AbstractC167017dG.A1N(str, onClickListener);
        this.A09.add(new C50676MYu(onClickListener, str, 1.0f, AbstractC53242c7.A0C(this.A00)));
    }

    public final void A0B(String str, View.OnClickListener onClickListener) {
        AbstractC167017dG.A1N(str, onClickListener);
        this.A09.add(new C50676MYu(onClickListener, str, 1.0f, AbstractC53242c7.A07(this.A00)));
    }
}
