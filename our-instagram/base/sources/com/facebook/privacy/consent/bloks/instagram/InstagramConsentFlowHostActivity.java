package com.facebook.privacy.consent.bloks.instagram;

import X.AbstractC12990ll;
import X.AbstractC13580mk;
import X.AbstractC166997dE;
import X.AbstractC16960so;
import X.AbstractC18680vv;
import X.AbstractC192798gL;
import X.AbstractC47895LDp;
import X.AbstractC53604NnB;
import X.AbstractC54958OSi;
import X.AbstractC56402iY;
import X.AbstractC58361Pu1;
import X.AnonymousClass001;
import X.C006802i;
import X.C00O;
import X.C023409i;
import X.C06090Tz;
import X.C09Y;
import X.C0f5;
import X.C0f9;
import X.C0fJ;
import X.C131845xK;
import X.C14240no;
import X.C14360o3;
import X.C18950wb;
import X.C192108fB;
import X.C1AD;
import X.C1ZZ;
import X.C2OD;
import X.C30D;
import X.C45127Jxw;
import X.C45530KDv;
import X.C54515O6s;
import X.C54983OTr;
import X.C57238PbM;
import X.C57591Ph3;
import X.C60930Rbk;
import X.C62862tP;
import X.C6FW;
import X.C6T2;
import X.DialogC50732Maa;
import X.InterfaceC103384lE;
import X.InterfaceC11380iw;
import X.InterfaceC16660sJ;
import X.MSY;
import X.O1R;
import X.OND;
import X.OVM;
import X.OVR;
import X.PL0;
import X.T8L;
import android.content.Intent;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import com.facebook.R;
import com.instagram.base.activity.IgFragmentActivity;
import com.instagram.common.api.base.CacheBehaviorLogger;
import java.util.AbstractCollection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* loaded from: classes9.dex */
public final class InstagramConsentFlowHostActivity extends IgFragmentActivity implements InterfaceC11380iw {
    public DialogC50732Maa A00;
    public C006802i A01;
    public AbstractC18680vv A02;
    public InterfaceC16660sJ A03 = C57591Ph3.A00;
    public String A04;

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return "InstagramConsentFlowActivity";
    }

    public static final void A01(InstagramConsentFlowHostActivity instagramConsentFlowHostActivity, String str, String str2, Throwable th) {
        Exception exc = new Exception(str2, th);
        C0f5 AEp = C18950wb.A01.AEp("ConsentUIFramework-Alaska", 817896479);
        AEp.ABW("experience_id", str);
        AEp.ABW("error_message", str2);
        AEp.report();
        C006802i c006802i = instagramConsentFlowHostActivity.A01;
        if (c006802i == null) {
            C14360o3.A0F("quickPerformanceLogger");
            throw C00O.createAndThrow();
        }
        c006802i.markerEnd(192756491, (short) 3);
        if (str != null) {
            OVR.A00.A00(str, exc);
        }
    }

    @Override // com.instagram.base.activity.IgFragmentActivity, X.InterfaceC12980lk
    public final AbstractC18680vv getSession() {
        AbstractC18680vv abstractC18680vv = this.A02;
        if (abstractC18680vv != null) {
            return abstractC18680vv;
        }
        C14360o3.A0F("session");
        throw C00O.createAndThrow();
    }

    @Override // android.app.Activity
    public final void finish() {
        if (getSupportFragmentManager().A0U.A04().size() >= 1) {
            C14240no A0G = MSY.A0G(this);
            List A04 = getSupportFragmentManager().A0U.A04();
            C14360o3.A07(A04);
            Iterator it = A04.iterator();
            while (it.hasNext()) {
                A0G.A03((Fragment) it.next());
            }
            A0G.A0H(new PL0(this));
            A0G.A01();
            return;
        }
        super.finish();
    }

    @Override // com.instagram.base.activity.IgFragmentActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public final void onActivityResult(int i, int i2, Intent intent) {
        C60930Rbk c60930Rbk;
        super.onActivityResult(i, i2, intent);
        if (C1ZZ.A00 != null && (c60930Rbk = AbstractC53604NnB.A01) != null) {
            c60930Rbk.onActivityResult(i, i2, intent);
        }
    }

    @Override // com.instagram.base.activity.IgFragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public final void onBackPressed() {
        super.onBackPressed();
        String str = this.A04;
        if (str == null) {
            C14360o3.A0F("flowInstanceId");
            throw C00O.createAndThrow();
        }
        AbstractC54958OSi.A00(str);
    }

    /* JADX WARN: Type inference failed for: r4v3, types: [com.google.common.util.concurrent.ListenableFuture, X.1Ke, java.lang.Object] */
    @Override // com.instagram.base.activity.IgFragmentActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        int i;
        C54983OTr c54983OTr;
        int A00 = C0f9.A00(1844425596);
        C09Y c09y = C023409i.A0A;
        Intent intent = getIntent();
        C14360o3.A07(intent);
        AbstractC18680vv A04 = c09y.A04(AbstractC13580mk.A00(intent));
        C14360o3.A0B(A04, 0);
        this.A02 = A04;
        super.onCreate(bundle);
        getSession();
        this.A01 = C006802i.A0p;
        setRequestedOrientation(1);
        String stringExtra = getIntent().getStringExtra("experience_id");
        if (stringExtra == null) {
            A01(this, null, "InstagramConsentFlowHostActivity created without experienceId", null);
            i = 2026159815;
        } else {
            String stringExtra2 = getIntent().getStringExtra("flow_name");
            if (stringExtra2 == null) {
                A01(this, stringExtra, "InstagramConsentFlowHostActivity created without flowName", null);
                i = -1750421292;
            } else {
                String A0T = AnonymousClass001.A0T(stringExtra, stringExtra2, '$');
                this.A04 = A0T;
                String str = "flowInstanceId";
                if (A0T != null) {
                    synchronized (OVM.A00) {
                        OVM.A01.put(A0T, this);
                    }
                    if (bundle == null) {
                        C006802i c006802i = this.A01;
                        if (c006802i == null) {
                            str = "quickPerformanceLogger";
                        } else {
                            c006802i.markerStart(192756491, "flow_name", stringExtra2);
                            String stringExtra3 = getIntent().getStringExtra("app_id");
                            if (stringExtra3 == null) {
                                A01(this, stringExtra, "InstagramConsentFlowHostActivity launching consent flow without Bloks App ID", null);
                                i = -2131909656;
                            } else {
                                String stringExtra4 = getIntent().getStringExtra(CacheBehaviorLogger.SOURCE);
                                String stringExtra5 = getIntent().getStringExtra(AbstractC58361Pu1.A01(0, 9, 38));
                                String stringExtra6 = getIntent().getStringExtra("extra_params_json");
                                DialogC50732Maa dialogC50732Maa = new DialogC50732Maa(this, this.A03, DialogC50732Maa.A02);
                                this.A00 = dialogC50732Maa;
                                C0fJ.A00(dialogC50732Maa);
                                C62862tP A01 = C62862tP.A01(null, this, this, getSession());
                                OND ond = C54983OTr.A03;
                                AbstractC18680vv session = getSession();
                                synchronized (ond) {
                                    C14360o3.A0B(session, 0);
                                    c54983OTr = (C54983OTr) session.A01(C54983OTr.class, new C57238PbM(session, 41));
                                }
                                ?? obj = new Object();
                                LinkedHashMap A002 = OND.A00(stringExtra2, stringExtra, stringExtra4, stringExtra5, stringExtra6);
                                C45127Jxw c45127Jxw = (C45127Jxw) c54983OTr.A02.get(AbstractC16960so.A1Q(stringExtra2, stringExtra3, stringExtra4, stringExtra5, stringExtra6).toString());
                                C006802i c006802i2 = c54983OTr.A00;
                                if (c45127Jxw != null) {
                                    c006802i2.markerAnnotate(192756491, "is_cache_hit", true);
                                    Object obj2 = c45127Jxw.A00;
                                    String str2 = c45127Jxw.A01;
                                    synchronized (OVR.A00) {
                                        C14360o3.A0B(str2, 0);
                                        OVR.A01.put(str2, stringExtra);
                                    }
                                    obj.set(obj2);
                                } else {
                                    c006802i2.markerAnnotate(192756491, "is_cache_hit", false);
                                    AbstractC192798gL A02 = C192108fB.A02(null, c54983OTr.A01, stringExtra3, A002);
                                    A02.A00(new C45530KDv(obj, 0));
                                    schedule(A02);
                                }
                                C2OD.A03(new T8L(A01, this, stringExtra, 1), obj, C6T2.A01);
                            }
                        }
                    }
                    int color = getColor(R.color.direct_widget_primary_background);
                    AbstractC56402iY.A02(this, color);
                    C30D.A04(this, color);
                    i = -78175406;
                }
                C14360o3.A0F(str);
                throw C00O.createAndThrow();
            }
        }
        C0f9.A07(i, A00);
    }

    @Override // com.instagram.base.activity.IgFragmentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onDestroy() {
        C54515O6s c54515O6s;
        InterfaceC103384lE interfaceC103384lE;
        int A00 = C0f9.A00(-1563994472);
        OVM ovm = OVM.A00;
        String str = this.A04;
        if (str != null) {
            synchronized (ovm) {
                OVM.A01.remove(str);
            }
            if (isFinishing()) {
                String str2 = this.A04;
                if (str2 != null) {
                    ReentrantReadWriteLock.WriteLock writeLock = AbstractC54958OSi.A02.writeLock();
                    C14360o3.A07(writeLock);
                    writeLock.lock();
                    try {
                        AbstractC54958OSi.A00.remove(str2);
                        O1R o1r = (O1R) AbstractC54958OSi.A01.remove(str2);
                        if (o1r != null && (c54515O6s = o1r.A00) != null && (interfaceC103384lE = c54515O6s.A01) != null) {
                            C131845xK.A00(c54515O6s.A00, C6FW.A01, interfaceC103384lE);
                        }
                        if (!C1AD.A06(C06090Tz.A05, 18304841377979497L)) {
                            String str3 = this.A04;
                            if (str3 != null) {
                                AbstractCollection abstractCollection = (AbstractCollection) AbstractC47895LDp.A00.remove(str3);
                                if (abstractCollection != null) {
                                    Iterator A13 = AbstractC166997dE.A13(abstractCollection);
                                    while (A13.hasNext()) {
                                        AbstractC47895LDp.A01.remove(AbstractC166997dE.A0l(A13));
                                    }
                                }
                            }
                        }
                    } finally {
                        writeLock.unlock();
                    }
                }
            }
            super.onDestroy();
            C0f9.A07(-611057952, A00);
            return;
        }
        C14360o3.A0F("flowInstanceId");
        throw C00O.createAndThrow();
    }

    @Override // X.InterfaceC12980lk
    public final /* bridge */ /* synthetic */ AbstractC12990ll getSession() {
        return getSession();
    }
}
