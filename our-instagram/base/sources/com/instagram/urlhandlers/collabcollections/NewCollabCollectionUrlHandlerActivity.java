package com.instagram.urlhandlers.collabcollections;

import X.AbstractC12990ll;
import X.AbstractC166987dD;
import X.AbstractC167017dG;
import X.AbstractC18680vv;
import X.AbstractC25227BEk;
import X.AbstractC31171DnF;
import X.AbstractC31176DnK;
import X.AbstractC31177DnL;
import X.AbstractC35178FfV;
import X.AbstractC43591JPw;
import X.C05F;
import X.C0f9;
import X.C14360o3;
import X.C16930sl;
import android.os.Bundle;
import com.instagram.base.activity.BaseFragmentActivity;
import com.instagram.common.session.UserSession;
import com.instagram.direct.messagethread.collections.model.DirectCollectionArguments;
import com.instagram.modal.ModalActivity;

/* loaded from: classes6.dex */
public final class NewCollabCollectionUrlHandlerActivity extends BaseFragmentActivity {
    @Override // com.instagram.base.activity.BaseFragmentActivity
    public final void A0j(Bundle bundle) {
    }

    @Override // X.InterfaceC12980lk
    public final /* bridge */ /* synthetic */ AbstractC12990ll getSession() {
        return AbstractC31171DnF.A0F(this);
    }

    @Override // com.instagram.base.activity.BaseFragmentActivity, com.instagram.base.activity.IgFragmentActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        String A0a;
        int A00 = C0f9.A00(43657314);
        super.onCreate(bundle);
        Bundle A07 = AbstractC31176DnK.A07(this);
        if (A07 != null && (A0a = AbstractC31171DnF.A0a(A07)) != null) {
            AbstractC18680vv A0F = AbstractC31171DnF.A0F(this);
            if (A0F instanceof UserSession) {
                if (C14360o3.A0K(AbstractC25227BEk.A0B(A0a).getHost(), "new_collab_collection")) {
                    AbstractC31177DnL.A0n(this, AbstractC167017dG.A0T("direct_collection_arguments", new DirectCollectionArguments(null, null, null, C05F.A0C, "deep_link", null, null, null, null, null, C16930sl.A00, false), AbstractC166987dD.A1L(AbstractC43591JPw.A00(112), 3)), A0F, ModalActivity.class, "direct_new_collection");
                }
            } else {
                AbstractC35178FfV.A01(this, A07, A0F);
            }
            C0f9.A07(79614365, A00);
        }
        finish();
        C0f9.A07(79614365, A00);
    }

    @Override // com.instagram.base.activity.IgFragmentActivity, X.InterfaceC12980lk
    public final AbstractC18680vv getSession() {
        return AbstractC31171DnF.A0F(this);
    }
}
