package X;

import android.app.Activity;
import com.instagram.bloks.hosting.IgBloksScreenConfig;
import com.instagram.react.modules.product.IgReactBloksNavigationModule;
import java.util.HashMap;

/* loaded from: classes10.dex */
public final class TRE implements Runnable {
    public final /* synthetic */ Activity A00;
    public final /* synthetic */ IgReactBloksNavigationModule A01;
    public final /* synthetic */ String A02;
    public final /* synthetic */ String A03;
    public final /* synthetic */ HashMap A04;

    public TRE(Activity activity, IgReactBloksNavigationModule igReactBloksNavigationModule, String str, String str2, HashMap hashMap) {
        this.A01 = igReactBloksNavigationModule;
        this.A02 = str;
        this.A04 = hashMap;
        this.A00 = activity;
        this.A03 = str2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C66277U6x A01 = C66277U6x.A01(this.A02, this.A04);
        Activity activity = this.A00;
        IgBloksScreenConfig igBloksScreenConfig = new IgBloksScreenConfig(this.A01.mSession);
        igBloksScreenConfig.A0U = this.A03;
        igBloksScreenConfig.A0P = C05F.A01;
        A01.A04(activity, igBloksScreenConfig);
    }
}
