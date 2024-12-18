package X;

import com.facebook.browser.iabcontext.IabCommonTrait;
import com.facebook.browser.lite.viewmode.IABViewModeLaunchConfig;
import java.util.Map;

/* renamed from: X.9U5, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C9U5 extends AbstractC52922bZ implements InterfaceC25210BDi {
    public final long A00;
    public final C2GS A01;
    public final IabCommonTrait A02;
    public final IABViewModeLaunchConfig A03;
    public final String A04;
    public final Map A05;
    public final long A06;
    public final android.net.Uri A07;
    public final C2GS A0A = new C2GS();
    public final C2GS A09 = new C2GS();
    public final C2GS A08 = new C2GS();

    @Override // X.InterfaceC25210BDi
    public final C2GS Aw7() {
        return this.A08;
    }

    @Override // X.InterfaceC25210BDi
    public final C2GS BHf() {
        return this.A09;
    }

    @Override // X.InterfaceC25210BDi
    public final long BZF() {
        return this.A06;
    }

    @Override // X.InterfaceC25210BDi
    public final C2GS CDn() {
        return this.A0A;
    }

    @Override // X.InterfaceC25210BDi
    public final String getSessionId() {
        return this.A04;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [X.2GT, X.2GS] */
    public C9U5(android.net.Uri uri, IabCommonTrait iabCommonTrait, IABViewModeLaunchConfig iABViewModeLaunchConfig, String str, Map map, long j, long j2) {
        this.A07 = uri;
        this.A03 = iABViewModeLaunchConfig;
        this.A02 = iabCommonTrait;
        this.A00 = j;
        this.A05 = map;
        this.A04 = str;
        this.A06 = j2;
        this.A01 = new C2GT(uri.toString());
    }
}
