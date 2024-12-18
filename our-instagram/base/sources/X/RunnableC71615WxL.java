package X;

import androidx.fragment.app.FragmentActivity;
import com.instagram.react.modules.product.IgReactBoostPostModule;

/* renamed from: X.WxL, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class RunnableC71615WxL implements Runnable {
    public final /* synthetic */ FragmentActivity A00;
    public final /* synthetic */ IgReactBoostPostModule A01;
    public final /* synthetic */ String A02;
    public final /* synthetic */ String A03;
    public final /* synthetic */ String A04;

    public RunnableC71615WxL(FragmentActivity fragmentActivity, IgReactBoostPostModule igReactBoostPostModule, String str, String str2, String str3) {
        this.A01 = igReactBoostPostModule;
        this.A00 = fragmentActivity;
        this.A04 = str;
        this.A02 = str2;
        this.A03 = str3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C140966Yy c140966Yy = new C140966Yy(this.A00, this.A01.mUserSession);
        c140966Yy.A0E(IB5.A00(null, this.A04, this.A02, this.A03, null));
        c140966Yy.A04();
    }
}
