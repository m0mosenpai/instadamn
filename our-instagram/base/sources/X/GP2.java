package X;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;

/* loaded from: classes6.dex */
public final class GP2 implements Runnable {
    public final /* synthetic */ HDI A00;
    public final /* synthetic */ String A01;

    public GP2(HDI hdi, String str) {
        this.A00 = hdi;
        this.A01 = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        HDI hdi = this.A00;
        FragmentActivity requireActivity = hdi.requireActivity();
        C14360o3.A0C(requireActivity, "null cannot be cast to non-null type com.instagram.base.activity.BaseFragmentActivity");
        Fragment A0Q = requireActivity.getSupportFragmentManager().A0Q(HDI.class.getCanonicalName());
        FragmentActivity requireActivity2 = hdi.requireActivity();
        InterfaceC09390do interfaceC09390do = hdi.A0K;
        C140966Yy A0c = AbstractC25231BEo.A0c(requireActivity2, interfaceC09390do);
        if (A0Q != null) {
            A0c.A0C(A0Q);
        }
        C31368DqX.A02(A0c, AbstractC166987dD.A0r(interfaceC09390do), AbstractC31364DqT.A02(), AbstractC31402Dr6.A01(AbstractC166987dD.A0r(interfaceC09390do), this.A01, "short_url_to_profile", "feed_short_url"));
    }
}
