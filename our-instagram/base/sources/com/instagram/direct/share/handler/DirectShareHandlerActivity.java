package com.instagram.direct.share.handler;

import X.AbstractC10360h2;
import X.AbstractC11060iN;
import X.AbstractC12990ll;
import X.AbstractC18680vv;
import X.AbstractC34770FTt;
import X.AbstractC35178FfV;
import X.C00O;
import X.C0f9;
import X.C0w9;
import X.C12260kU;
import X.C14360o3;
import X.C19280xC;
import X.C1XM;
import X.C28531Zo;
import X.C9GR;
import X.InterfaceC09390do;
import X.InterfaceC11380iw;
import X.LFS;
import X.MHI;
import android.content.Intent;
import android.os.Bundle;
import com.instagram.base.activity.IgFragmentActivity;
import com.instagram.common.session.UserSession;

/* loaded from: classes.dex */
public final class DirectShareHandlerActivity extends IgFragmentActivity implements InterfaceC11380iw {
    public UserSession A00;
    public boolean A02;
    public boolean A01 = true;
    public final InterfaceC09390do A03 = C1XM.A00(new MHI(this, 1));

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return "direct_system_share_handler";
    }

    @Override // com.instagram.base.activity.IgFragmentActivity, X.InterfaceC12980lk
    public final AbstractC18680vv getSession() {
        return (AbstractC18680vv) this.A03.getValue();
    }

    @Override // com.instagram.base.activity.IgFragmentActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public final void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i == 4919 && i2 == -1) {
            if (this.A02) {
                C9GR.A07(this, 2131973315);
            }
            if (this.A01) {
                C12260kU.A0C(this, AbstractC34770FTt.A00(this, "all", "direct-inbox", null, 67174400));
            }
        }
        finish();
    }

    @Override // com.instagram.base.activity.IgFragmentActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        int i;
        UserSession userSession;
        String str;
        int A00 = C0f9.A00(-217129551);
        super.onCreate(bundle);
        AbstractC18680vv session = getSession();
        if ((session instanceof UserSession) && (userSession = (UserSession) session) != null) {
            this.A00 = userSession;
            LFS lfs = LFS.A00;
            AbstractC10360h2 abstractC10360h2 = this.mFragments.A00.A03;
            C14360o3.A07(abstractC10360h2);
            Intent intent = getIntent();
            C14360o3.A07(intent);
            UserSession userSession2 = this.A00;
            if (userSession2 == null) {
                str = "userSession";
            } else if (lfs.A00(intent, abstractC10360h2, userSession2)) {
                i = -1611867387;
            } else {
                Intent intent2 = getIntent();
                intent2.getStringExtra("com.instagram.share.choosertarget.DirectChooserTargetService.THREAD_ID");
                String stringExtra = intent2.getStringExtra("android.intent.extra.TEXT");
                if (stringExtra == null) {
                    stringExtra = "";
                }
                if (stringExtra.length() == 0) {
                    C9GR.A00(this, getResources().getString(2131960451), "direct_share_intent_unsupported_file_type", 0);
                    C0w9.A03("DirectShareHandlerActivity", "share handler called with no content, or trying to send .txt file");
                    finish();
                } else {
                    boolean booleanExtra = intent2.getBooleanExtra("DirectShareSheetFragment.DIRECT_SHARE_INCLUDE_CANCEL_COPY_TITLE_CTAS", false);
                    boolean booleanExtra2 = intent2.getBooleanExtra("DirectPrivateStoryRecipientFragment.DIRECT_SHOULD_SHOW_MESSAGE_COMPOSER", false);
                    this.A01 = intent2.getBooleanExtra("DirectPrivateStoryRecipientFragment.DIRECT_SHOULD_LAUNCH_DIRECT_INBOX", true);
                    this.A02 = intent2.getBooleanExtra("DirectPrivateStoryRecipientFragment.DIRECT_SHOULD_TOAST_ON_SEND", false);
                    UserSession userSession3 = this.A00;
                    str = "userSession";
                    if (userSession3 != null) {
                        C28531Zo.A04.A01(this, null, userSession3, Boolean.valueOf(booleanExtra), null, stringExtra, null, null, null, booleanExtra2);
                        C19280xC A002 = C19280xC.A00(this, "direct_native_share_to_direct_text");
                        UserSession userSession4 = this.A00;
                        if (userSession4 != null) {
                            AbstractC11060iN.A00(userSession4).EHW(A002);
                        }
                    }
                }
                i = 185401583;
            }
            C14360o3.A0F(str);
            throw C00O.createAndThrow();
        }
        AbstractC35178FfV.A00().A00(this, null, getSession());
        i = 781338163;
        C0f9.A07(i, A00);
    }

    @Override // X.InterfaceC12980lk
    public final /* bridge */ /* synthetic */ AbstractC12990ll getSession() {
        return getSession();
    }
}
