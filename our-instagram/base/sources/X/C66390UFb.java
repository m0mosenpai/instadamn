package X;

import android.os.Bundle;
import android.util.SparseArray;
import android.view.ContextThemeWrapper;
import androidx.fragment.app.Fragment;
import com.facebookpay.fulfillmentoption.model.FulfillmentOptionComponent;
import com.facebookpay.logging.LoggingContext;
import java.util.List;

/* renamed from: X.UFb, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C66390UFb extends AbstractC52922bZ implements InterfaceC71988XEb {
    public LoggingContext A00;
    public Integer A01;
    public Integer A02;
    public final C58252li A03;
    public final C2GS A04;
    public final C2GS A05 = new C2GT(C63406Sjd.A04(C16930sl.A00));
    public final C2GS A06;
    public final C2GS A07;
    public final C2GS A08;
    public final C2GS A09;
    public final InterfaceC58362lv A0A;
    public final UFS A0B;
    public final C2GS A0C;
    public final InterfaceC58362lv A0D;
    public final InterfaceC58362lv A0E;

    @Override // X.InterfaceC71988XEb
    public final void ARF(Bundle bundle, ContextThemeWrapper contextThemeWrapper, Fragment fragment, C63406Sjd c63406Sjd) {
    }

    @Override // X.InterfaceC71988XEb
    public final void D6l(Bundle bundle, ContextThemeWrapper contextThemeWrapper, Fragment fragment, C63406Sjd c63406Sjd) {
    }

    @Override // X.InterfaceC71988XEb
    public final void EJu() {
    }

    @Override // X.InterfaceC71988XEb
    public final void Epg() {
    }

    @Override // X.InterfaceC71988XEb
    public final void FBD(SparseArray sparseArray) {
    }

    public static final String A00(C66390UFb c66390UFb) {
        C69074VhP c69074VhP;
        FulfillmentOptionComponent fulfillmentOptionComponent;
        C63406Sjd c63406Sjd = (C63406Sjd) c66390UFb.A03.A02();
        if (c63406Sjd != null && (c69074VhP = (C69074VhP) c63406Sjd.A01) != null && (fulfillmentOptionComponent = (FulfillmentOptionComponent) c69074VhP.A01) != null) {
            return fulfillmentOptionComponent.A02();
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:40:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0155  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void A01(X.C66390UFb r28, java.util.List r29) {
        /*
            Method dump skipped, instructions count: 422
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C66390UFb.A01(X.UFb, java.util.List):void");
    }

    public final boolean A02() {
        int i;
        C63406Sjd c63406Sjd;
        List list;
        EnumC68120VCd enumC68120VCd;
        C2GS c2gs = this.A04;
        C63406Sjd c63406Sjd2 = (C63406Sjd) c2gs.A02();
        if (c63406Sjd2 != null && (enumC68120VCd = c63406Sjd2.A00) != null) {
            i = enumC68120VCd.ordinal();
        } else {
            i = -1;
        }
        if (i != 0 || (c63406Sjd = (C63406Sjd) c2gs.A02()) == null || (list = (List) c63406Sjd.A01) == null || list.isEmpty() || list.size() != 1) {
            return false;
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0065  */
    @Override // X.InterfaceC71988XEb
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void AGw(android.os.Bundle r17, android.view.ContextThemeWrapper r18, androidx.fragment.app.Fragment r19, X.C63406Sjd r20) {
        /*
            Method dump skipped, instructions count: 241
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C66390UFb.AGw(android.os.Bundle, android.view.ContextThemeWrapper, androidx.fragment.app.Fragment, X.Sjd):void");
    }

    @Override // X.InterfaceC71988XEb
    public final C2GS Aup() {
        return this.A0C;
    }

    @Override // X.InterfaceC71988XEb
    public final C2GT EMy() {
        C2GS c2gs = this.A05;
        C14360o3.A0C(c2gs, "null cannot be cast to non-null type androidx.lifecycle.LiveData<com.fbpay.util.resource.FBPayResource<kotlin.collections.List<com.fbpay.util.resource.FBPayResource<com.facebookpay.common.recyclerview.adapteritems.BaseCheckoutItem>>>>");
        return c2gs;
    }

    @Override // X.InterfaceC71988XEb
    public final /* synthetic */ boolean EiA() {
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [X.2GT, X.2GS] */
    /* JADX WARN: Type inference failed for: r0v8, types: [X.2GT, X.2GS] */
    /* JADX WARN: Type inference failed for: r5v0, types: [X.2GT, X.2GS] */
    public C66390UFb(UFS ufs) {
        this.A0B = ufs;
        C2GS c2gs = new C2GS();
        this.A08 = c2gs;
        this.A02 = C05F.A00;
        this.A06 = new C2GS();
        this.A09 = new C2GS();
        this.A04 = new C2GS();
        ?? c2gt = new C2GT(C63406Sjd.A03(null));
        this.A07 = c2gt;
        C58252li c58252li = new C58252li();
        this.A03 = c58252li;
        this.A0C = new C2GT(EnumC68138VCz.A02);
        C70302WQh c70302WQh = new C70302WQh(this, 54);
        this.A0D = c70302WQh;
        C70302WQh c70302WQh2 = new C70302WQh(this, 56);
        this.A0E = c70302WQh2;
        this.A0A = new C70302WQh(this, 55);
        c58252li.A0E(c2gs, c70302WQh);
        c58252li.A0E(c2gt, c70302WQh2);
    }
}
