package com.instagram.fx.access.sso;

import X.AbstractC001800i;
import X.AbstractC09440dt;
import X.AbstractC12990ll;
import X.AbstractC141776au;
import X.AbstractC166987dD;
import X.AbstractC31172DnG;
import X.AbstractC52922bZ;
import X.C14360o3;
import X.C2GT;
import X.E6N;
import X.GU2;
import X.GU3;
import X.GU4;
import X.GU5;
import X.GU6;
import X.InterfaceC09390do;
import X.MCM;
import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import java.util.List;

/* loaded from: classes6.dex */
public final class FxSsoViewModel extends AbstractC52922bZ {
    public final InterfaceC09390do A02 = AbstractC09440dt.A01(GU4.A00);
    public final InterfaceC09390do A03 = AbstractC09440dt.A01(GU5.A00);
    public final InterfaceC09390do A00 = AbstractC09440dt.A01(GU2.A00);
    public final InterfaceC09390do A01 = AbstractC09440dt.A01(GU3.A00);
    public final InterfaceC09390do A04 = AbstractC09440dt.A01(GU6.A00);

    public final void A03(Context context, Bundle bundle, AbstractC12990ll abstractC12990ll) {
        C14360o3.A0B(abstractC12990ll, 0);
        AbstractC166987dD.A1Z(new MCM(abstractC12990ll, context, bundle, this, null, 45), AbstractC141776au.A00(this));
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x0289  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x01ef  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x0240  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object A00(android.content.Context r25, android.os.Bundle r26, X.AbstractC12990ll r27, com.instagram.fx.access.sso.FxSsoViewModel r28, X.InterfaceC23621Ds r29) {
        /*
            Method dump skipped, instructions count: 684
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.fx.access.sso.FxSsoViewModel.A00(android.content.Context, android.os.Bundle, X.0ll, com.instagram.fx.access.sso.FxSsoViewModel, X.1Ds):java.lang.Object");
    }

    public static boolean A01(FxSsoViewModel fxSsoViewModel) {
        return TextUtils.isEmpty((CharSequence) ((C2GT) fxSsoViewModel.A00.getValue()).A02());
    }

    public final String A02() {
        List list;
        E6N e6n;
        C2GT A0F = AbstractC31172DnG.A0F(this.A02);
        if (A0F != null && (list = (List) A0F.A02()) != null && (e6n = (E6N) AbstractC001800i.A0J(list)) != null) {
            return e6n.A04;
        }
        return null;
    }
}
