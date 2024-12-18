package X;

import com.facebook.common.networkreachability.AndroidReachabilityListener;
import com.facebook.common.networkreachability.NetworkStateInfo;

/* renamed from: X.SxB, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C63985SxB implements NetworkStateInfo {
    public final /* synthetic */ AndroidReachabilityListener A00;

    public C63985SxB(AndroidReachabilityListener androidReachabilityListener) {
        this.A00 = androidReachabilityListener;
    }

    @Override // com.facebook.common.networkreachability.NetworkStateInfo
    public final int getNetworkState() {
        AndroidReachabilityListener androidReachabilityListener = this.A00;
        AndroidReachabilityListener androidReachabilityListener2 = AndroidReachabilityListener.$redex_init_class;
        return androidReachabilityListener.mNetworkTypeProvider.A00().A00;
    }
}
