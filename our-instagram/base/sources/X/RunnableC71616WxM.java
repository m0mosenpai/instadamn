package X;

import androidx.fragment.app.FragmentActivity;
import com.instagram.react.modules.product.IgReactBoostPostModule;

/* renamed from: X.WxM, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class RunnableC71616WxM implements Runnable {
    public final /* synthetic */ FragmentActivity A00;
    public final /* synthetic */ IgReactBoostPostModule A01;
    public final /* synthetic */ String A02;
    public final /* synthetic */ String A03;
    public final /* synthetic */ String A04;

    public RunnableC71616WxM(FragmentActivity fragmentActivity, IgReactBoostPostModule igReactBoostPostModule, String str, String str2, String str3) {
        this.A01 = igReactBoostPostModule;
        this.A00 = fragmentActivity;
        this.A03 = str;
        this.A04 = str2;
        this.A02 = str3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C140966Yy c140966Yy = new C140966Yy(this.A00, this.A01.mUserSession);
        AbstractC65702TsY.A0q();
        String str = this.A03;
        String str2 = this.A04;
        String str3 = this.A02;
        AbstractC25233BEq.A0v(0, str, str2, str3);
        c140966Yy.A0E(AbstractC65703TsZ.A12(str, null, str3, str2));
        c140966Yy.A04();
    }
}
