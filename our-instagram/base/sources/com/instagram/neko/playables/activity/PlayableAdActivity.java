package com.instagram.neko.playables.activity;

import X.AbstractC12990ll;
import X.AbstractC166987dD;
import X.AbstractC166997dE;
import X.AbstractC18680vv;
import X.AbstractC25231BEo;
import X.AbstractC31173DnH;
import X.C140966Yy;
import X.C1XM;
import X.C57245PbT;
import X.InterfaceC09390do;
import X.Rb4;
import android.os.Bundle;
import com.instagram.base.activity.BaseFragmentActivity;

/* loaded from: classes9.dex */
public final class PlayableAdActivity extends BaseFragmentActivity {
    public final InterfaceC09390do A00 = C1XM.A00(new C57245PbT(this, 16));
    public final InterfaceC09390do A01 = C1XM.A00(new C57245PbT(this, 17));

    @Override // X.InterfaceC12980lk
    public final /* bridge */ /* synthetic */ AbstractC12990ll getSession() {
        return AbstractC166987dD.A0o(this.A01);
    }

    @Override // com.instagram.base.activity.BaseFragmentActivity
    public final void A0j(Bundle bundle) {
        Bundle A0A = AbstractC31173DnH.A0A(this);
        if (A0A != null) {
            Rb4 rb4 = new Rb4();
            rb4.setArguments(A0A);
            C140966Yy A0c = AbstractC25231BEo.A0c(this, this.A01);
            A0c.A0D(rb4);
            A0c.A0D = false;
            A0c.A0G = true;
            A0c.A04();
            return;
        }
        throw AbstractC166997dE.A0g();
    }

    @Override // com.instagram.base.activity.IgFragmentActivity, X.InterfaceC12980lk
    public final /* bridge */ /* synthetic */ AbstractC18680vv getSession() {
        return AbstractC166987dD.A0n(this.A01);
    }
}
