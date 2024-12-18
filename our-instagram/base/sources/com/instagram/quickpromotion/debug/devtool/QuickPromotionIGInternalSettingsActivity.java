package com.instagram.quickpromotion.debug.devtool;

import X.AbstractC12990ll;
import X.AbstractC18680vv;
import X.AbstractC58323PtF;
import X.C0f9;
import X.C14240no;
import X.MSW;
import X.MSY;
import X.UEz;
import android.R;
import android.os.Bundle;
import com.instagram.base.activity.IgFragmentActivity;

/* loaded from: classes10.dex */
public final class QuickPromotionIGInternalSettingsActivity extends IgFragmentActivity {
    @Override // X.InterfaceC12980lk
    public final /* bridge */ /* synthetic */ AbstractC12990ll getSession() {
        return MSW.A0Q(this);
    }

    @Override // com.instagram.base.activity.IgFragmentActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        int i;
        int A00 = C0f9.A00(-190225730);
        if (!AbstractC58323PtF.A1W(this)) {
            i = 7537168;
        } else {
            super.onCreate(bundle);
            C14240no A0G = MSY.A0G(this);
            A0G.A0A(new UEz(), R.id.content);
            A0G.A00();
            i = -618988182;
        }
        C0f9.A07(i, A00);
    }

    @Override // com.instagram.base.activity.IgFragmentActivity, X.InterfaceC12980lk
    public final /* bridge */ /* synthetic */ AbstractC18680vv getSession() {
        return MSW.A0Q(this);
    }
}
