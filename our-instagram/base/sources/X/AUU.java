package X;

import com.facebook.browser.iabcontext.IabCommonTrait;
import com.facebook.browser.lite.viewmode.IABViewModeLaunchConfig;
import java.util.Map;

/* loaded from: classes4.dex */
public final class AUU implements InterfaceC52932ba {
    public final long A00;
    public final long A01;
    public final android.net.Uri A02;
    public final IabCommonTrait A03;
    public final IABViewModeLaunchConfig A04;
    public final String A05;
    public final boolean A06;

    @Override // X.InterfaceC52932ba
    public final /* synthetic */ AbstractC52922bZ create(InterfaceC16510rw interfaceC16510rw, AbstractC52972be abstractC52972be) {
        return AbstractC53002bh.A00(this, abstractC52972be, interfaceC16510rw);
    }

    @Override // X.InterfaceC52932ba
    public final AbstractC52922bZ create(Class cls) {
        Map A0E;
        C14360o3.A0B(cls, 0);
        if (cls.isAssignableFrom(C9U5.class)) {
            boolean z = this.A06;
            if (z) {
                A0E = AbstractC167007dF.A0n("isUsingUnifiedLauncher", Boolean.valueOf(z));
            } else {
                A0E = AbstractC06930Yk.A0E();
            }
            android.net.Uri uri = this.A02;
            IABViewModeLaunchConfig iABViewModeLaunchConfig = this.A04;
            return new C9U5(uri, this.A03, iABViewModeLaunchConfig, this.A05, A0E, this.A01, this.A00);
        }
        throw AbstractC166987dD.A12(AbstractC167017dG.A0n(cls, AbstractC58317Pt9.A00(74), AbstractC166987dD.A1C()));
    }

    public AUU(android.net.Uri uri, IabCommonTrait iabCommonTrait, IABViewModeLaunchConfig iABViewModeLaunchConfig, String str, long j, long j2, boolean z) {
        this.A05 = str;
        this.A00 = j;
        this.A02 = uri;
        this.A04 = iABViewModeLaunchConfig;
        this.A03 = iabCommonTrait;
        this.A01 = j2;
        this.A06 = z;
    }

    @Override // X.InterfaceC52932ba
    public final /* synthetic */ AbstractC52922bZ create(Class cls, AbstractC52972be abstractC52972be) {
        C14360o3.A0B(cls, 1);
        return create(cls);
    }
}
