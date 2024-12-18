package X;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import androidx.fragment.app.FragmentActivity;
import com.facebook.R;
import com.instagram.react.activity.IgReactActivity;

/* renamed from: X.TGn, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C64501TGn implements InterfaceC65532Tm2 {
    public C53S A01;
    public Integer A02;
    public String A03;
    public String A04;
    public String A05;
    public String A06;
    public String A07;
    public boolean A08;
    public boolean A09;
    public Bundle A0B;
    public final AbstractC12990ll A0C;
    public boolean A0A = false;
    public int A00 = 1;

    public final C64501TGn A00(Bundle bundle) {
        if (this.A05 != null) {
            this.A0B.putBundle("params", bundle);
            return this;
        }
        this.A0B = bundle;
        return this;
    }

    public final C64501TGn A01(String str) {
        C18C.A0G(AbstractC25229BEm.A1Z(this.A04), "Route name and app key cannot be both set");
        this.A05 = str;
        Bundle A0b = AbstractC166987dD.A0b();
        A0b.putString("routeName", str);
        A0b.putBundle("params", this.A0B);
        this.A04 = "FacebookAppRouteHandler";
        this.A0B = A0b;
        return this;
    }

    public final boolean A02(Context context) {
        Intent A08 = MSW.A08(context, IgReactActivity.class);
        Integer num = this.A02;
        if (num != null) {
            A08.addFlags(num.intValue());
        }
        A08.putExtras(AEf());
        if (this.A08 && C2U7.A00) {
            A08.putExtra("IgReactActivity.EXTRA_ACTIVITY_ANIMATION", new int[]{R.anim.fragment_slide_left_enter, R.anim.fragment_slide_left_exit, R.anim.fragment_slide_right_enter, R.anim.fragment_slide_right_exit});
        }
        C05290Qb A07 = C12260kU.A00.A07();
        C0OK c0ok = A07.A01;
        Intent A0C = c0ok.A0C(context, A08, A07.A02);
        if (A0C == null) {
            return false;
        }
        if (A0C.hasExtra("_ci_")) {
            A0C.removeExtra("_ci_");
        }
        C07980bI.A03(context, A07);
        if (C0P5.A01(context, A0C)) {
            c0ok.A01.EH9("Warning: launching intent with a non-Activity Context requires FLAG_ACTIVITY_NEW_TASK, or the Android Runtime will throw a AndroidRuntimeException. Adding the flag to prevent a crash. This might lead to unexpected behavior with the back button. Please pass in an Activity Context.");
        }
        context.startActivity(A0C);
        return true;
    }

    public C64501TGn(AbstractC12990ll abstractC12990ll, String str) {
        this.A0C = abstractC12990ll;
        this.A04 = str;
    }

    @Override // X.InterfaceC65532Tm2
    public final Bundle AEf() {
        String A0R;
        Bundle A0b = AbstractC166987dD.A0b();
        AbstractC31175DnJ.A0r(A0b, this.A0C);
        String str = this.A07;
        if (str != null) {
            A0b.putString("IgReactFragment.ARGUMENT_TITLE", str);
        }
        String str2 = this.A06;
        if (str2 != null) {
            A0b.putString("IgReactFragment.TTI_EVENT_NAME", str2);
        }
        A0b.putBoolean("IgReactFragment.ARGUMENT_LOGO_AS_TITLE", this.A0A);
        A0b.putString("IgReactFragment.ARGUMENT_APP_KEY", this.A04);
        A0b.putBoolean("IgReactFragment.ARGUMENT_IS_FULLSCREEN", this.A09);
        A0b.putBoolean("IgReactFragment.ARGUMENT_IS_MODAL", false);
        Bundle bundle = this.A0B;
        if (bundle != null) {
            A0b.putBundle(MSV.A00(349), bundle);
        }
        if (!TextUtils.isEmpty(this.A03)) {
            A0R = this.A03;
        } else {
            if (bundle != null && !TextUtils.isEmpty(bundle.getString("routeName"))) {
                A0R = AnonymousClass001.A0R("react_", bundle.getString("routeName"));
            }
            A0b.putBoolean("IgReactFragment.ARGUMENT_SHOULD_HIDE_MAIN_TAB", false);
            A0b.putInt("IgReactFragment.ARGUMENT_ORIENTATION", this.A00);
            A0b.putBoolean("IgReactFragment.ARGUMENT_IS_INLINE_NAV_BAR_ENABLED", false);
            return A0b;
        }
        A0b.putString("IgReactFragment.ARGUMENT_ANALYTICS_MODULE", A0R);
        A0b.putBoolean("IgReactFragment.ARGUMENT_SHOULD_HIDE_MAIN_TAB", false);
        A0b.putInt("IgReactFragment.ARGUMENT_ORIENTATION", this.A00);
        A0b.putBoolean("IgReactFragment.ARGUMENT_IS_INLINE_NAV_BAR_ENABLED", false);
        return A0b;
    }

    @Override // X.InterfaceC65532Tm2
    public final C140966Yy EqV(FragmentActivity fragmentActivity) {
        AbstractC27401Ut.getInstance().getFragmentFactory();
        Bundle AEf = AEf();
        Rb1 rb1 = new Rb1();
        rb1.setArguments(AEf);
        C140966Yy c140966Yy = new C140966Yy(fragmentActivity, this.A0C);
        c140966Yy.A0E(rb1);
        c140966Yy.A07 = this.A01;
        String str = this.A05;
        if (str == null) {
            str = this.A04;
        }
        c140966Yy.A0C = str;
        return c140966Yy;
    }

    public C64501TGn(AbstractC12990ll abstractC12990ll) {
        this.A0C = abstractC12990ll;
    }
}
