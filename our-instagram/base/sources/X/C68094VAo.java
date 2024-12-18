package X;

import android.os.Bundle;
import com.instagram.common.session.UserSession;

/* renamed from: X.VAo, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C68094VAo extends AbstractC33235ElU {
    public static final String __redex_internal_original_name = "UpsellsBottomSheetFragment";
    public WES A00;
    public final InterfaceC09390do A01 = AbstractC60492pY.A02(this);
    public final C38321qM A02;
    public final InterfaceC60442pS A03;
    public final C75113Zb A04;
    public final EnumC39589Hdz A05;
    public final String A06;

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return "upsells_bottomsheet_fragment";
    }

    @Override // X.AbstractC33235ElU
    public final boolean isElevated() {
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:40:0x00f5, code lost:
    
        if (r2 != 5) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0209, code lost:
    
        r1 = r4.A04;
        r0 = 2131973602;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x01f3, code lost:
    
        if (r0 != 4) goto L40;
     */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0176  */
    @Override // X.AbstractC33235ElU, X.AbstractC59962oe, androidx.fragment.app.Fragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onViewCreated(android.view.View r16, android.os.Bundle r17) {
        /*
            Method dump skipped, instructions count: 553
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C68094VAo.onViewCreated(android.view.View, android.os.Bundle):void");
    }

    @Override // X.AbstractC59962oe
    public final /* bridge */ /* synthetic */ AbstractC18680vv getSession() {
        return (AbstractC18680vv) this.A01.getValue();
    }

    public C68094VAo(C38321qM c38321qM, InterfaceC60442pS interfaceC60442pS, C75113Zb c75113Zb, EnumC39589Hdz enumC39589Hdz, String str) {
        this.A05 = enumC39589Hdz;
        this.A06 = str;
        this.A02 = c38321qM;
        this.A04 = c75113Zb;
        this.A03 = interfaceC60442pS;
    }

    @Override // X.AbstractC33235ElU, X.AbstractC60672pq, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        int A02 = C0f9.A02(245804643);
        super.onCreate(bundle);
        UserSession userSession = (UserSession) this.A01.getValue();
        String str = this.A06;
        EnumC39589Hdz enumC39589Hdz = this.A05;
        this.A00 = new WES(userSession, this.A02, this.A03, this.A04, this, enumC39589Hdz, str);
        C0f9.A09(1595959267, A02);
    }
}
