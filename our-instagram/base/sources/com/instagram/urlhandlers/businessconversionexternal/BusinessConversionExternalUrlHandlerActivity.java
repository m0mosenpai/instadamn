package com.instagram.urlhandlers.businessconversionexternal;

import X.AbstractC03240Dh;
import X.AbstractC12990ll;
import X.AbstractC166987dD;
import X.AbstractC166997dE;
import X.AbstractC18680vv;
import X.AbstractC31171DnF;
import X.AbstractC31173DnH;
import X.AbstractC31174DnI;
import X.AbstractC31176DnK;
import X.AbstractC35178FfV;
import X.C023409i;
import X.C03390Gq;
import X.C09Y;
import X.C0BQ;
import X.C0f9;
import X.C12260kU;
import X.C14360o3;
import X.C27391Ur;
import X.F0G;
import android.content.Intent;
import android.os.Bundle;
import com.instagram.base.activity.IgFragmentActivity;
import com.instagram.common.session.UserSession;
import com.instagram.debug.devoptions.avatars.ImmersiveAvatarViewerDebugFragment;
import com.instagram.user.model.User;

/* loaded from: classes6.dex */
public final class BusinessConversionExternalUrlHandlerActivity extends IgFragmentActivity {
    public AbstractC18680vv A00;

    @Override // X.InterfaceC12980lk
    public final /* bridge */ /* synthetic */ AbstractC12990ll getSession() {
        return this.A00;
    }

    @Override // com.instagram.base.activity.IgFragmentActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        UserSession A03;
        int A00 = C0f9.A00(-805269175);
        super.onCreate(bundle);
        AbstractC18680vv A0F = AbstractC31171DnF.A0F(this);
        Bundle A0A = AbstractC31173DnH.A0A(this);
        if (A0A != null) {
            String str = null;
            String string = A0A.getString("target_user_name", null);
            if (string != null) {
                C023409i A002 = C09Y.A00();
                synchronized (A002) {
                    User BOb = A002.A03.BOb(string);
                    String str2 = null;
                    if (BOb != null) {
                        String id = BOb.getId();
                        C03390Gq c03390Gq = A002.A05;
                        UserSession userSession = c03390Gq.A00;
                        if (userSession != null) {
                            str2 = userSession.userId;
                        }
                        if (C14360o3.A0K(id, str2)) {
                            A03 = c03390Gq.A00;
                        } else {
                            A03 = c03390Gq.A03(BOb, false);
                        }
                    } else {
                        A03 = null;
                    }
                }
                User BOb2 = C0BQ.A00(A0F).BOb(string);
                if (BOb2 != null) {
                    if (A03 != null) {
                        str = A03.userId;
                    }
                    if (AbstractC31174DnI.A1Y(BOb2, str)) {
                        A0F = A03;
                    }
                }
                throw AbstractC166987dD.A14("Invalid target user name");
            }
        }
        this.A00 = A0F;
        Bundle A07 = AbstractC31176DnK.A07(this);
        AbstractC18680vv abstractC18680vv = this.A00;
        if (!(abstractC18680vv instanceof UserSession)) {
            C27391Ur A003 = AbstractC35178FfV.A00();
            AbstractC18680vv abstractC18680vv2 = this.A00;
            C14360o3.A0A(abstractC18680vv2);
            A003.A00(this, A07, abstractC18680vv2);
        } else {
            AbstractC31171DnF.A1Q(abstractC18680vv);
            if (A07 != null) {
                AbstractC03240Dh.A00(A07, abstractC18680vv);
                F0G.A00();
                Intent A08 = AbstractC31173DnH.A08(this);
                A07.putString(ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY, "deep_link");
                A07.putInt("intro_entry_position", 0);
                AbstractC31174DnI.A1A(A08, 3, A07);
                C12260kU.A08(this, A08, 11);
                finish();
            } else {
                IllegalStateException A0g = AbstractC166997dE.A0g();
                C0f9.A07(644335758, A00);
                throw A0g;
            }
        }
        C0f9.A07(1193712406, A00);
    }

    @Override // com.instagram.base.activity.IgFragmentActivity, X.InterfaceC12980lk
    public final AbstractC18680vv getSession() {
        return this.A00;
    }
}
