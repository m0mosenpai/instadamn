package com.instagram.urlhandlers.adslider;

import X.AbstractC06930Yk;
import X.AbstractC111324zv;
import X.AbstractC12990ll;
import X.AbstractC166987dD;
import X.AbstractC18680vv;
import X.AbstractC25227BEk;
import X.AbstractC31171DnF;
import X.AbstractC31172DnG;
import X.AbstractC35178FfV;
import X.AnonymousClass637;
import X.C0f9;
import X.C14360o3;
import X.C16920sk;
import X.C35756Fqt;
import X.C63719SsZ;
import X.VRA;
import X.WTY;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import com.instagram.base.activity.BaseFragmentActivity;
import com.instagram.common.session.UserSession;
import java.util.BitSet;
import java.util.LinkedHashMap;

/* loaded from: classes6.dex */
public final class AdSliderUrlhandlerActivity extends BaseFragmentActivity {
    @Override // com.instagram.base.activity.BaseFragmentActivity
    public final void A0j(Bundle bundle) {
    }

    @Override // X.InterfaceC12980lk
    public final /* bridge */ /* synthetic */ AbstractC12990ll getSession() {
        return AbstractC31171DnF.A0F(this);
    }

    @Override // com.instagram.base.activity.BaseFragmentActivity, com.instagram.base.activity.IgFragmentActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        int i;
        Bundle A08;
        int A00 = C0f9.A00(-1599862962);
        super.onCreate(bundle);
        C35756Fqt.A00(getSupportFragmentManager(), this, 2);
        Intent intent = getIntent();
        if (intent != null && (A08 = AbstractC31172DnG.A08(intent)) != null) {
            AbstractC18680vv A0F = AbstractC31171DnF.A0F(this);
            if (!(A0F instanceof UserSession)) {
                AbstractC35178FfV.A01(this, A08, A0F);
            } else {
                String A0a = AbstractC31171DnF.A0a(A08);
                if (A0a == null) {
                    finish();
                    i = -354986765;
                } else {
                    Uri A0B = AbstractC25227BEk.A0B(A0a);
                    String A12 = AbstractC31172DnG.A12(A0B);
                    if (A12 == null) {
                        A12 = "unknown";
                    }
                    String queryParameter = A0B.getQueryParameter("media_id");
                    LinkedHashMap A1I = AbstractC166987dD.A1I();
                    BitSet A0j = AbstractC31171DnF.A0j(0);
                    A1I.put("entrypoint", A12);
                    A1I.put("media_id", queryParameter);
                    if (A0j.nextClearBit(0) >= 0) {
                        C16920sk c16920sk = C16920sk.A00;
                        C14360o3.A0C(c16920sk, "null cannot be cast to non-null type kotlin.collections.Map<K of kotlin.collections.MapsKt__MapsKt.emptyMap, V of kotlin.collections.MapsKt__MapsKt.emptyMap>");
                        C63719SsZ c63719SsZ = new C63719SsZ(AbstractC111324zv.A00(2096), null, null, AbstractC06930Yk.A0B(A1I), c16920sk, 719983200, 0L, true);
                        AnonymousClass637 A002 = VRA.A00(A0F, false);
                        WTY wty = new WTY(null, null, null, null);
                        C14360o3.A0B(A002, 1);
                        c63719SsZ.E2V(this, wty, A002);
                    } else {
                        throw AbstractC31172DnG.A0v();
                    }
                }
            }
            i = 1216218926;
        } else {
            finish();
            i = 1867198547;
        }
        C0f9.A07(i, A00);
    }

    @Override // com.instagram.base.activity.IgFragmentActivity, X.InterfaceC12980lk
    public final AbstractC18680vv getSession() {
        return AbstractC31171DnF.A0F(this);
    }
}
