package X;

import android.content.Context;
import android.content.Intent;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.instagram.base.activity.BaseFragmentActivity;
import com.instagram.base.activity.IgFragmentActivity;
import com.instagram.fxcal.browser.FxChromeCustomTabsActivity;

/* loaded from: classes6.dex */
public abstract class FT1 {
    public static final Object A00(C6FQ c6fq, C6FW c6fw) {
        String A0d = AbstractC31177DnL.A0d(c6fw);
        InterfaceC103384lE A0I = AbstractC31175DnJ.A0I(c6fw, 2);
        Fragment A02 = C6BQ.A02(c6fq);
        FragmentActivity A04 = C6BQ.A04(c6fq);
        AbstractC12990ll A0B = C6BQ.A0B(c6fq);
        if ((A04 instanceof BaseFragmentActivity) || (C18U.A06(C06090Tz.A05, A0B, 2342167171133616062L) && (A04 instanceof IgFragmentActivity))) {
            IgFragmentActivity igFragmentActivity = (IgFragmentActivity) A04;
            igFragmentActivity.registerOnActivityResultListener(new C60929Rbj(5, A0I, c6fq, A04));
            Context A0O = AbstractC166987dD.A0O(igFragmentActivity);
            C14360o3.A0B(A0B, 1);
            C14360o3.A0B(A0d, 2);
            Intent intent = new Intent(A0O, (Class<?>) FxChromeCustomTabsActivity.class);
            intent.putExtra("url_param", A0d);
            AbstractC31175DnJ.A0o(intent, A0B);
            C12260kU.A08(A04, intent, 2884);
            return null;
        }
        if (A02 == null) {
            return null;
        }
        C6BQ.A0K(c6fq, new EVL(c6fq, A0I, 3));
        Context requireContext = A02.requireContext();
        C14360o3.A0B(A0B, 1);
        C14360o3.A0B(A0d, 2);
        Intent intent2 = new Intent(requireContext, (Class<?>) FxChromeCustomTabsActivity.class);
        intent2.putExtra("url_param", A0d);
        AbstractC31175DnJ.A0o(intent2, A0B);
        C12260kU.A06(A02, intent2, 2884);
        return null;
    }

    public static final void A01(Intent intent, C6FQ c6fq, InterfaceC103384lE interfaceC103384lE, int i) {
        String str;
        android.net.Uri uri;
        String str2 = null;
        if (intent != null) {
            str = intent.getStringExtra(AbstractC58317Pt9.A00(189));
        } else {
            str = null;
        }
        if (!AbstractC13670mt.A0B(str)) {
            if (str != null) {
                uri = AbstractC08820cl.A03(str);
            } else {
                throw AbstractC166997dE.A0g();
            }
        } else {
            uri = null;
        }
        C6FX A0s = AbstractC25225BEi.A0s();
        if (i == -1 && uri != null) {
            str2 = uri.toString();
        }
        A0s.A01(str2);
        AbstractC25227BEk.A1M(c6fq, A0s, interfaceC103384lE);
    }
}
