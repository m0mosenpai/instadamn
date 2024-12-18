package com.instagram.fxcal.browser;

import X.AbstractC001800i;
import X.AbstractC001900j;
import X.AbstractC08820cl;
import X.AbstractC12990ll;
import X.AbstractC166987dD;
import X.AbstractC18680vv;
import X.AbstractC25225BEi;
import X.AbstractC25227BEk;
import X.AbstractC31171DnF;
import X.AbstractC31180DnO;
import X.AbstractC58318PtA;
import X.C0f9;
import X.C14360o3;
import X.C16930sl;
import X.C31460Ds4;
import X.C62662SKw;
import X.C63165SeP;
import android.app.ActivityOptions;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageItemInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.Bundle;
import com.facebook.R;
import com.instagram.base.activity.BaseFragmentActivity;
import java.util.List;

/* loaded from: classes10.dex */
public final class FxChromeCustomTabsActivity extends BaseFragmentActivity {
    public boolean A00 = true;

    @Override // com.instagram.base.activity.BaseFragmentActivity
    public final void A0j(Bundle bundle) {
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public final void onNewIntent(Intent intent) {
        C14360o3.A0B(intent, 0);
        super.onNewIntent(intent);
        AbstractC31180DnO.A0y(this, AbstractC31171DnF.A04().putExtra("KEY_URL", intent.getStringExtra("key_uri")));
    }

    @Override // X.InterfaceC12980lk
    public final /* bridge */ /* synthetic */ AbstractC12990ll getSession() {
        return AbstractC31171DnF.A0F(this);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v0, types: [java.util.AbstractCollection, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r10v1, types: [java.util.List, java.lang.Iterable] */
    /* JADX WARN: Type inference failed for: r10v2, types: [X.0sl] */
    @Override // com.instagram.base.activity.BaseFragmentActivity, com.instagram.base.activity.IgFragmentActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        String scheme;
        List<ResolveInfo> queryIntentActivities;
        ?? A1E;
        String str;
        int A00 = C0f9.A00(434210020);
        super.onCreate(bundle);
        String stringExtra = getIntent().getStringExtra("url_param");
        if (stringExtra != null) {
            try {
                if (!AbstractC001900j.A0T(stringExtra) && (scheme = AbstractC08820cl.A03(stringExtra).getScheme()) != null && scheme.equals("https")) {
                    C63165SeP c63165SeP = new C63165SeP();
                    Intent intent = c63165SeP.A01;
                    intent.putExtra("android.support.customtabs.extra.TITLE_VISIBILITY", 1);
                    c63165SeP.A00 = ActivityOptions.makeCustomAnimation(this, R.anim.modal_slide_up_enter, R.anim.modal_empty_animation);
                    intent.putExtra("android.support.customtabs.extra.EXIT_ANIMATION_BUNDLE", ActivityOptions.makeCustomAnimation(this, R.anim.modal_empty_animation, R.anim.modal_slide_down_exit).toBundle());
                    intent.putExtra("android.support.customtabs.extra.ENABLE_URLBAR_HIDING", true);
                    C62662SKw A01 = c63165SeP.A01();
                    if (AbstractC25225BEi.A1Y("com.opera.browser,com.sec.android.app.sbrowser,com.android.chrome")) {
                        Intent intent2 = A01.A00;
                        Context baseContext = getBaseContext();
                        C14360o3.A07(baseContext);
                        List A0Q = AbstractC001900j.A0Q("com.opera.browser,com.sec.android.app.sbrowser,com.android.chrome", new char[]{','}, 0);
                        PackageManager packageManager = baseContext.getPackageManager();
                        if (packageManager == null) {
                            A1E = C16930sl.A00;
                        } else {
                            Uri A0B = AbstractC25227BEk.A0B(stringExtra);
                            PackageManager packageManager2 = baseContext.getPackageManager();
                            if (packageManager2 == null) {
                                queryIntentActivities = C16930sl.A00;
                            } else {
                                queryIntentActivities = packageManager2.queryIntentActivities(AbstractC58318PtA.A0D(A0B), 0);
                                C14360o3.A07(queryIntentActivities);
                            }
                            A1E = AbstractC166987dD.A1E();
                            for (ResolveInfo resolveInfo : queryIntentActivities) {
                                Intent A04 = AbstractC31171DnF.A04();
                                A04.setAction("android.support.customtabs.action.CustomTabsService");
                                A04.setPackage(((PackageItemInfo) resolveInfo.activityInfo).packageName);
                                if (packageManager.resolveService(A04, 0) != null) {
                                    A1E.add(resolveInfo);
                                }
                            }
                        }
                        if (A1E.isEmpty()) {
                            str = null;
                        } else {
                            str = ((PackageItemInfo) ((ResolveInfo) AbstractC001800i.A0I(AbstractC001800i.A0g(A1E, new C31460Ds4(A0Q, 12)))).activityInfo).packageName;
                        }
                        intent2.setPackage(str);
                    }
                    A01.A00(this, AbstractC08820cl.A03(stringExtra));
                    C0f9.A07(-368703283, A00);
                    return;
                }
            } catch (Exception unused) {
                setResult(0);
                finish();
                C0f9.A07(773692474, A00);
                return;
            }
        }
        setResult(0);
        finish();
        C0f9.A07(-389693660, A00);
    }

    @Override // com.instagram.base.activity.BaseFragmentActivity, com.instagram.base.activity.IgFragmentActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onResume() {
        int A00 = C0f9.A00(788667379);
        super.onResume();
        if (!this.A00) {
            setResult(0);
            finish();
        }
        this.A00 = false;
        C0f9.A07(1608035570, A00);
    }

    @Override // com.instagram.base.activity.IgFragmentActivity, X.InterfaceC12980lk
    public final AbstractC18680vv getSession() {
        return AbstractC31171DnF.A0F(this);
    }
}
