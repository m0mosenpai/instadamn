package com.instagram.challenge.activity;

import X.AbstractC10360h2;
import X.AbstractC12990ll;
import X.AbstractC14490oL;
import X.AbstractC166987dD;
import X.AbstractC18680vv;
import X.AbstractC31172DnG;
import X.AbstractC31177DnL;
import X.AbstractC34034F0n;
import X.AbstractC58317Pt9;
import X.AbstractC63248Sg4;
import X.C04070Jy;
import X.C05F;
import X.C0f9;
import X.C0w9;
import X.C16V;
import X.C31650DvG;
import X.C32548EUy;
import X.C41451vu;
import X.FDQ;
import X.FEX;
import X.FI5;
import X.FTX;
import X.G06;
import X.InterfaceC11380iw;
import X.InterfaceC41501vz;
import X.TF9;
import X.U6N;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.instagram.base.activity.BaseFragmentActivity;
import java.io.IOException;
import java.util.HashMap;

/* loaded from: classes6.dex */
public class ChallengeActivity extends BaseFragmentActivity implements InterfaceC11380iw {
    public Bundle A00;
    public AbstractC10360h2 A01;
    public AbstractC18680vv A02;
    public TF9 A03;
    public String A04;
    public String A05;
    public String A06;
    public C41451vu A07;
    public Integer A08;
    public final InterfaceC41501vz A09 = C31650DvG.A00(this, 10);

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0007. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:11:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0019  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void A00() {
        /*
            Method dump skipped, instructions count: 268
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.challenge.activity.ChallengeActivity.A00():void");
    }

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return PublicKeyCredentialControllerUtility.JSON_KEY_CHALLENGE;
    }

    @Override // com.instagram.base.activity.BaseFragmentActivity
    public final void A0j(Bundle bundle) {
        if (AbstractC31177DnL.A0I(this) == null) {
            A00();
        }
    }

    @Override // android.app.Activity
    public final void finish() {
        G06 A00;
        super.finish();
        AbstractC18680vv abstractC18680vv = this.A02;
        if (abstractC18680vv != null && (A00 = FTX.A00(abstractC18680vv)) != null) {
            A00.A01();
        }
    }

    @Override // X.InterfaceC12980lk
    public final /* bridge */ /* synthetic */ AbstractC12990ll getSession() {
        return this.A02;
    }

    @Override // com.instagram.base.activity.IgFragmentActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public final void onActivityResult(int i, int i2, Intent intent) {
        String str;
        super.onActivityResult(i, i2, intent);
        if (i == 64) {
            if (i2 == -1) {
                AbstractC63248Sg4.A02(this.A01);
                HashMap A1G = AbstractC166987dD.A1G();
                A1G.put("challenge_id", this.A04);
                A1G.put("entity_id", this.A05);
                if (intent != null) {
                    String stringExtra = intent.getStringExtra(AbstractC58317Pt9.A00(949));
                    if (!TextUtils.isEmpty(stringExtra)) {
                        try {
                            FI5 parseFromJson = FDQ.parseFromJson(C16V.A00(stringExtra));
                            if (parseFromJson != null && (str = parseFromJson.A00) != null) {
                                A1G.put("age_verification_result", str);
                            }
                        } catch (IOException unused) {
                            C0w9.A03("ChallengeActivity", "Unable to parse response string");
                        }
                    }
                }
                FEX.A00(getApplicationContext(), new C32548EUy(this, 34), this.A02, C05F.A01, "challenge/", A1G);
                return;
            }
            FEX.A00(getApplicationContext(), new C32548EUy(this, 35), this.A02, C05F.A01, "challenge/rewind/", null);
            finish();
        }
    }

    @Override // com.instagram.base.activity.BaseFragmentActivity, com.instagram.base.activity.IgFragmentActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        int A00 = C0f9.A00(-1837165060);
        Bundle bundleExtra = getIntent().getBundleExtra("ChallengeFragment.arguments");
        bundleExtra.getClass();
        this.A00 = bundleExtra;
        this.A02 = AbstractC31172DnG.A0V(bundleExtra);
        this.A04 = this.A00.getString("challenge_id");
        this.A06 = this.A00.getString("user_fbid");
        this.A05 = this.A00.getString("entity_id");
        this.A01 = getSupportFragmentManager();
        this.A08 = AbstractC34034F0n.A00(getIntent().getStringExtra("ChallengeFragment.challengeType"));
        this.A03 = new TF9(this.A02);
        Context applicationContext = getApplicationContext();
        if (applicationContext != null && AbstractC14490oL.A09(applicationContext)) {
            C41451vu c41451vu = C41451vu.A01;
            c41451vu.A02(this.A09, C04070Jy.class);
            this.A07 = c41451vu;
        }
        super.onCreate(bundle);
        C0f9.A07(1893283964, A00);
    }

    @Override // com.instagram.base.activity.BaseFragmentActivity, com.instagram.base.activity.IgFragmentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onDestroy() {
        int A00 = C0f9.A00(396778084);
        super.onDestroy();
        if (isFinishing() && this.A08 == C05F.A0j) {
            U6N.A00(this.A02).A03(this.A00.getInt("ChallengeFragment.bloksAction"));
        }
        C0f9.A07(-729301537, A00);
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public final void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        Bundle bundleExtra = intent.getBundleExtra("ChallengeFragment.arguments");
        bundleExtra.getClass();
        this.A00 = bundleExtra;
        this.A04 = bundleExtra.getString("challenge_id");
        this.A06 = this.A00.getString("user_fbid");
        this.A05 = this.A00.getString("entity_id");
        this.A08 = AbstractC34034F0n.A00(intent.getStringExtra("ChallengeFragment.challengeType"));
        getSupportFragmentManager().A0x(null, 1);
        A00();
    }

    @Override // com.instagram.base.activity.IgFragmentActivity, X.InterfaceC12980lk
    public final AbstractC18680vv getSession() {
        return this.A02;
    }
}
