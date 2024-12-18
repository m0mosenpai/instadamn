package com.instagram.common.resources.downloadable.impl;

import X.AbstractC001900j;
import X.AbstractC126965oa;
import X.AbstractC166987dD;
import X.AbstractC166997dE;
import X.AbstractC53172bz;
import X.AbstractC58319PtB;
import X.AbstractC58321PtD;
import X.AnonymousClass001;
import X.C006802i;
import X.C00O;
import X.C0f9;
import X.C0fQ;
import X.C11X;
import X.C14120nc;
import X.C14360o3;
import X.C1R9;
import X.C216713t;
import X.C217313z;
import X.C25191Kx;
import X.C27101Tj;
import X.C2OD;
import X.C39721sv;
import X.ExecutorC14040nU;
import X.InterfaceC53202c2;
import X.T8G;
import X.ViewOnClickListenerC63508Sob;
import android.app.Activity;
import android.content.Intent;
import android.content.pm.PackageItemInfo;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.View;
import android.widget.TextView;
import com.facebook.R;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.Locale;

/* loaded from: classes10.dex */
public final class WaitingForStringsActivity extends Activity implements InterfaceC53202c2 {
    public static final String A0A = AbstractC58319PtB.A0t(WaitingForStringsActivity.class, "i18n");
    public View A00;
    public View A01;
    public View A02;
    public C217313z A03;
    public C1R9 A04;
    public Intent A05;
    public View A06;
    public boolean A07;
    public final View.OnClickListener A08 = ViewOnClickListenerC63508Sob.A00(this, 70);
    public volatile boolean A09;

    public static final void A00(WaitingForStringsActivity waitingForStringsActivity) {
        ListenableFuture listenableFuture;
        String str;
        View view = waitingForStringsActivity.A01;
        if (view == null) {
            str = "progressView";
        } else {
            view.setVisibility(0);
            View view2 = waitingForStringsActivity.A00;
            if (view2 == null) {
                str = "errorView";
            } else {
                view2.setVisibility(8);
                C1R9 c1r9 = waitingForStringsActivity.A04;
                if (c1r9 == null) {
                    str = "stringResourcesDelegate";
                } else {
                    synchronized (c1r9) {
                        listenableFuture = c1r9.A00;
                    }
                    if (listenableFuture == null) {
                        listenableFuture = new C25191Kx(new C39721sv(true, null));
                    }
                    C2OD.A03(new T8G(waitingForStringsActivity, 8), listenableFuture, new ExecutorC14040nU(C14120nc.A00(), 57, 3, true, false));
                    return;
                }
            }
        }
        C14360o3.A0F(str);
        throw C00O.createAndThrow();
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0048, code lost:
    
        if ("com.instagram.share.ADD_TO_STORY".equals(r2.getAction()) == false) goto L13;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void A01(com.instagram.common.resources.downloadable.impl.WaitingForStringsActivity r3) {
        /*
            android.content.Intent r0 = r3.A05
            if (r0 != 0) goto Le
            java.lang.String r0 = "returnIntent"
            X.C14360o3.A0F(r0)
            X.00O r0 = X.C00O.createAndThrow()
            throw r0
        Le:
            android.content.Intent r2 = new android.content.Intent
            r2.<init>(r0)
            int r1 = r2.getFlags()
            r0 = -268435457(0xffffffffefffffff, float:-1.5845632E29)
            r1 = r1 & r0
            r2.setFlags(r1)
            java.lang.String r1 = r2.getAction()
            r0 = 81
            java.lang.String r0 = X.MSV.A00(r0)
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L4a
            java.lang.String r1 = r2.getAction()
            r0 = 912(0x390, float:1.278E-42)
            java.lang.String r0 = X.MSV.A00(r0)
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L4a
            java.lang.String r1 = r2.getAction()
            java.lang.String r0 = "com.instagram.share.ADD_TO_STORY"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L53
        L4a:
            int r0 = r2.getFlags()
            r0 = r0 & (-2)
            r2.setFlags(r0)
        L53:
            boolean r0 = r3.A07
            if (r0 == 0) goto L5e
            X.C12260kU.A0C(r3, r2)
        L5a:
            r3.finish()
            return
        L5e:
            java.lang.String r0 = "com.instagram.android"
            r2.setPackage(r0)
            android.content.Context r0 = r3.getApplicationContext()
            X.C12260kU.A0A(r0, r2)
            goto L5a
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.common.resources.downloadable.impl.WaitingForStringsActivity.A01(com.instagram.common.resources.downloadable.impl.WaitingForStringsActivity):void");
    }

    @Override // android.app.Activity
    public final void onCreate(Bundle bundle) {
        IllegalStateException A14;
        int i;
        String str;
        String str2;
        int A09 = AbstractC58321PtD.A09(this, 1726200309);
        super.onCreate(bundle);
        getTheme().applyStyle(AbstractC53172bz.A00(), true);
        C11X A00 = C11X.A00();
        C14360o3.A07(A00);
        if (A00 instanceof C216713t) {
            C216713t c216713t = (C216713t) A00;
            C1R9 c1r9 = c216713t.A04;
            C14360o3.A0A(c1r9);
            this.A04 = c1r9;
            this.A03 = c216713t.A03;
            C27101Tj A01 = c216713t.A01();
            Intent intent = getIntent();
            if (intent != null) {
                this.A07 = intent.getBooleanExtra("from_trusted_caller", false);
                Parcelable parcelableExtra = intent.getParcelableExtra("return_intent");
                C14360o3.A0A(parcelableExtra);
                Intent intent2 = (Intent) parcelableExtra;
                this.A05 = intent2;
                if (intent2 == null) {
                    str2 = "returnIntent";
                    C14360o3.A0F(str2);
                    throw C00O.createAndThrow();
                }
                if (intent2.getExtras() != null) {
                    Bundle extras = intent2.getExtras();
                    C14360o3.A0A(extras);
                    ClassLoader A0g = AbstractC58319PtB.A0g(this);
                    if (A0g != null) {
                        extras.setClassLoader(A0g);
                    } else {
                        A14 = AbstractC166987dD.A14("getClassLoader should only return null if the class is a primitive");
                        i = -1436576493;
                    }
                }
            }
            setContentView(R.layout.ig_waiting_screen);
            this.A00 = requireViewById(R.id.loading_strings_error_view);
            this.A01 = requireViewById(R.id.loading_strings_progress_view);
            C1R9 c1r92 = this.A04;
            if (c1r92 == null) {
                str2 = "stringResourcesDelegate";
            } else {
                Locale A03 = c1r92.A03();
                C14360o3.A07(A03);
                if (A03.getLanguage().equals("cb")) {
                    A03 = new Locale("ckb", A03.getCountry());
                }
                String A19 = AbstractC166987dD.A19(A03);
                String displayName = A03.getDisplayName(A03);
                if ("fb".equals(A19)) {
                    displayName = "FB Hash";
                } else if ("qz".equals(A19)) {
                    Locale locale = new Locale("my");
                    String displayName2 = locale.getDisplayName(locale);
                    if (displayName2 != null && displayName2.length() != 0 && !displayName2.equals("မြန်မာ")) {
                        str = "ဗမာ";
                    } else {
                        str = "ျမန္မာ";
                    }
                    displayName = AnonymousClass001.A0R(str, " (Zawgyi)");
                } else if ("mp".equalsIgnoreCase(A19)) {
                    displayName = "ꯃꯅꯤꯄꯨꯔꯤ";
                }
                String A002 = AbstractC126965oa.A00(displayName);
                C14360o3.A07(A002);
                View requireViewById = requireViewById(R.id.language_pack_loading_message);
                C14360o3.A07(requireViewById);
                ((TextView) requireViewById).setText(A01.getString(R.string.res_0x7f130077_name_removed, A002));
                View requireViewById2 = requireViewById(R.id.language_pack_loading_failed_message);
                C14360o3.A07(requireViewById2);
                TextView textView = (TextView) requireViewById2;
                String A0p = AbstractC166997dE.A0p(getBaseContext(), ((PackageItemInfo) getApplicationContext().getApplicationInfo()).labelRes);
                if (AbstractC001900j.A0T(A0p)) {
                    A0p = "Instagram";
                }
                textView.setText(A01.getString(R.string.res_0x7f130076_name_removed, A002, A0p));
                View requireViewById3 = requireViewById(R.id.use_english_button);
                this.A02 = requireViewById3;
                if (requireViewById3 == null) {
                    str2 = "useEnglishButton";
                } else {
                    C0fQ.A00(this.A08, requireViewById3);
                    View requireViewById4 = requireViewById(R.id.retry_button);
                    this.A06 = requireViewById4;
                    if (requireViewById4 == null) {
                        str2 = "retryButton";
                    } else {
                        ViewOnClickListenerC63508Sob.A01(requireViewById4, 69, this);
                        A00(this);
                        C0f9.A07(-262338185, A09);
                        return;
                    }
                }
            }
            C14360o3.A0F(str2);
            throw C00O.createAndThrow();
        }
        A14 = AbstractC166987dD.A14("This activity should not be triggered when string resources are not downloadable");
        i = 521619625;
        C0f9.A07(i, A09);
        throw A14;
    }

    @Override // android.app.Activity
    public final void onPause() {
        int A00 = C0f9.A00(1181165249);
        super.onPause();
        C006802i.A0p.markerEnd(4456452, (short) 2);
        C0f9.A07(-766914221, A00);
    }

    @Override // android.app.Activity
    public final void onResume() {
        int A00 = C0f9.A00(451683083);
        super.onResume();
        C006802i.A0p.markerStart(4456452);
        C0f9.A07(-681791387, A00);
    }
}
