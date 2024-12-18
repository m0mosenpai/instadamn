package com.instagram.urlhandlers.recentsearches;

import X.AbstractC12990ll;
import X.AbstractC18680vv;
import X.AbstractC31173DnH;
import X.AbstractC31176DnK;
import X.AbstractC35178FfV;
import X.C023409i;
import X.C0f9;
import X.C140966Yy;
import X.C14360o3;
import X.C27391Ur;
import X.C67898V1g;
import X.U0K;
import android.os.Bundle;
import com.instagram.base.activity.BaseFragmentActivity;
import com.instagram.common.session.UserSession;

/* loaded from: classes11.dex */
public final class RecentSearchesUrlHandlerActivity extends BaseFragmentActivity {
    public AbstractC18680vv A00;

    @Override // com.instagram.base.activity.BaseFragmentActivity
    public final void A0j(Bundle bundle) {
    }

    @Override // X.InterfaceC12980lk
    public final /* bridge */ /* synthetic */ AbstractC12990ll getSession() {
        return this.A00;
    }

    @Override // com.instagram.base.activity.BaseFragmentActivity, com.instagram.base.activity.IgFragmentActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        int i;
        int A00 = C0f9.A00(1299366931);
        super.onCreate(bundle);
        Bundle A07 = AbstractC31176DnK.A07(this);
        if (A07 == null) {
            finish();
            i = 1161485310;
        } else {
            AbstractC18680vv A04 = C023409i.A0A.A04(A07);
            this.A00 = A04;
            if (A04 != null && (A04 instanceof UserSession)) {
                C140966Yy A0P = AbstractC31173DnH.A0P(this, A04);
                A0P.A0D = false;
                C67898V1g c67898V1g = new C67898V1g();
                A07.putSerializable("edit_searches_type", U0K.A04);
                A07.putString("argument_parent_module_name", "recent_searches_url");
                c67898V1g.setArguments(A07);
                A0P.A0D(c67898V1g);
                A0P.A04();
            } else {
                C27391Ur A002 = AbstractC35178FfV.A00();
                AbstractC18680vv abstractC18680vv = this.A00;
                C14360o3.A0A(abstractC18680vv);
                A002.A00(this, A07, abstractC18680vv);
                finish();
            }
            i = -1383026753;
        }
        C0f9.A07(i, A00);
    }

    @Override // com.instagram.base.activity.IgFragmentActivity, X.InterfaceC12980lk
    public final AbstractC18680vv getSession() {
        return this.A00;
    }
}
