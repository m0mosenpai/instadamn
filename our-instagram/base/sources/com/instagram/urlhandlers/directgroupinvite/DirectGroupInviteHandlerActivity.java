package com.instagram.urlhandlers.directgroupinvite;

import X.AbstractC001800i;
import X.AbstractC003100w;
import X.AbstractC03270Dk;
import X.AbstractC12990ll;
import X.AbstractC166987dD;
import X.AbstractC18680vv;
import X.AbstractC25227BEk;
import X.AbstractC25651Mw;
import X.AbstractC31171DnF;
import X.AbstractC31172DnG;
import X.AbstractC31176DnK;
import X.AbstractC31178DnM;
import X.AbstractC31179DnN;
import X.AbstractC35186Ffe;
import X.C0f9;
import X.C14360o3;
import X.C36065Fw1;
import X.C36155FxU;
import X.C36881nl;
import X.InterfaceC41501vz;
import android.net.Uri;
import android.os.Bundle;
import com.instagram.base.activity.BaseFragmentActivity;
import com.instagram.common.session.UserSession;
import java.util.List;

/* loaded from: classes6.dex */
public final class DirectGroupInviteHandlerActivity extends BaseFragmentActivity {
    public UserSession A00;
    public final InterfaceC41501vz A01 = new C36155FxU(this, 22);

    @Override // com.instagram.base.activity.BaseFragmentActivity
    public final void A0j(Bundle bundle) {
    }

    @Override // com.instagram.base.activity.BaseFragmentActivity
    public final boolean A0m() {
        return false;
    }

    @Override // android.app.Activity
    public final void finish() {
        super.finish();
        overridePendingTransition(0, 0);
    }

    @Override // X.InterfaceC12980lk
    public final /* bridge */ /* synthetic */ AbstractC12990ll getSession() {
        return this.A00;
    }

    @Override // com.instagram.base.activity.BaseFragmentActivity, com.instagram.base.activity.IgFragmentActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        int i;
        String string;
        String str;
        Integer num;
        String str2;
        int A00 = C0f9.A00(-322875276);
        super.onCreate(bundle);
        overridePendingTransition(0, 0);
        Bundle A07 = AbstractC31176DnK.A07(this);
        if (A07 != null && (string = A07.getString("original_url")) != null && string.length() != 0) {
            UserSession A002 = AbstractC03270Dk.A00(AbstractC31172DnG.A0V(A07));
            this.A00 = A002;
            String string2 = A07.getString("original_url");
            if (string2 != null && string2.length() != 0) {
                Uri A0B = AbstractC25227BEk.A0B(string2);
                String host = A0B.getHost();
                String A003 = AbstractC35186Ffe.A00(A0B);
                List<String> pathSegments = A0B.getPathSegments();
                if (!AbstractC35186Ffe.A03(A0B)) {
                    str = null;
                } else {
                    C14360o3.A0A(pathSegments);
                    str = (String) AbstractC001800i.A0O(pathSegments, 2);
                }
                String A01 = AbstractC35186Ffe.A01(A0B, "s");
                String A012 = AbstractC35186Ffe.A01(A0B, "st");
                String A013 = AbstractC35186Ffe.A01(A0B, "cid");
                String A014 = AbstractC35186Ffe.A01(A0B, "fbclid");
                String A015 = AbstractC35186Ffe.A01(A0B, "scid");
                String A016 = AbstractC35186Ffe.A01(A0B, "x");
                if (A003 != null) {
                    Bundle A0b = AbstractC166987dD.A0b();
                    A0b.putString("group_invite_key", A003);
                    A0b.putString("group_invite_content_key", str);
                    AbstractC31178DnM.A0q(A0B, A0b, host);
                    if (A01 != null) {
                        A0b.putString("group_invite_source_key", A01);
                    }
                    if (A012 != null) {
                        A0b.putString("group_invite_subtype_key", A012);
                    }
                    if (A013 != null) {
                        A0b.putString("group_invite_creator_id_key", A013);
                    }
                    if (A014 != null) {
                        A0b.putString("group_invite_source_key", "channel_link_sticker");
                    }
                    if (A015 != null) {
                        A0b.putString("group_invite_sc_invite_id_key", A015);
                    }
                    if (A016 != null) {
                        A0b.putString("group_invite_message_id_key", A016);
                    }
                    A07.putAll(A0b);
                    C14360o3.A0B(A002, 1);
                    String string3 = A07.getString("group_invite_key");
                    String string4 = A07.getString("group_invite_content_key");
                    String string5 = A07.getString("group_invite_source_key");
                    String string6 = A07.getString("group_invite_subtype_key");
                    if (string6 != null) {
                        num = AbstractC003100w.A0i(string6);
                    } else {
                        num = null;
                    }
                    String string7 = A07.getString("group_invite_creator_id_key");
                    String string8 = A07.getString("group_invite_sc_invite_id_key");
                    String string9 = A07.getString("group_invite_message_id_key");
                    if (string3 != null) {
                        if (string5 == null) {
                            str2 = "fbapp_direct_link";
                        } else {
                            str2 = string5;
                        }
                        C36881nl A017 = C36881nl.A01(this, AbstractC31171DnF.A0D("DirectUrlHandler"), A002, str2);
                        AbstractC31179DnN.A1R(A017, string3);
                        A017.A0T = string3;
                        A017.A0R = string4;
                        A017.A0U = string5;
                        A017.A0S = string7;
                        A017.A0E = num;
                        A017.A0V = string8;
                        A017.A0X = string9;
                        A017.A06();
                    }
                    AbstractC25651Mw.A00(A002).A01(this.A01, C36065Fw1.class);
                    i = -99225056;
                } else {
                    finish();
                    i = -693494808;
                }
            } else {
                finish();
                i = -1092698936;
            }
        } else {
            finish();
            i = 1474522772;
        }
        C0f9.A07(i, A00);
    }

    @Override // com.instagram.base.activity.BaseFragmentActivity, com.instagram.base.activity.IgFragmentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onDestroy() {
        int A00 = C0f9.A00(957787030);
        super.onDestroy();
        UserSession userSession = this.A00;
        if (userSession != null) {
            AbstractC25651Mw.A00(userSession).A02(this.A01, C36065Fw1.class);
        }
        this.A00 = null;
        C0f9.A07(1344151975, A00);
    }

    @Override // com.instagram.base.activity.IgFragmentActivity, X.InterfaceC12980lk
    public final /* bridge */ /* synthetic */ AbstractC18680vv getSession() {
        return this.A00;
    }
}
