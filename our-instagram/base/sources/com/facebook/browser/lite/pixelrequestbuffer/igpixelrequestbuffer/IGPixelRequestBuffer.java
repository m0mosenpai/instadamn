package com.facebook.browser.lite.pixelrequestbuffer.igpixelrequestbuffer;

import X.AbstractC08820cl;
import X.AbstractC166987dD;
import X.AbstractC166997dE;
import X.AbstractC24481Hr;
import X.AbstractC31171DnF;
import X.AbstractC31172DnG;
import X.AbstractC31173DnH;
import X.AbstractC31178DnM;
import X.AbstractC58318PtA;
import X.AbstractC58319PtB;
import X.AbstractC61278Rko;
import X.AbstractC61738Rst;
import X.AbstractC61741Rsw;
import X.AbstractC62758SPp;
import X.AnonymousClass001;
import X.AnonymousClass963;
import X.C05F;
import X.C06090Tz;
import X.C0K8;
import X.C18U;
import X.C1ON;
import X.C22930A9a;
import X.C26371Ps;
import X.C60902RbH;
import X.C62529SFg;
import X.C62530SFh;
import X.C72529Xfi;
import X.InterfaceC65614To5;
import X.PUG;
import X.SDT;
import X.SF2;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.facebook.browser.lite.util.clickid.BloomFilter;
import com.instagram.common.session.UserSession;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: classes10.dex */
public class IGPixelRequestBuffer implements InterfaceC65614To5 {
    public static final String TAG = "IgPixelRequestBuffer";
    public static final String URL_PREFIX = "facebook.com";
    public WebResourceResponse mResponse;
    public UserSession mUserSession;

    public /* synthetic */ boolean shouldBuffer(WebResourceRequest webResourceRequest) {
        return AbstractC61738Rst.A00(webResourceRequest, this);
    }

    private WebResourceResponse handleRequest(AbstractC61278Rko abstractC61278Rko) {
        try {
            throw AbstractC166987dD.A15("getIgHttpRequest");
        } catch (Exception e) {
            C0K8.A0F(TAG, "Request failed", e);
            this.mResponse = AbstractC61741Rsw.A00("Not Found", e.toString(), 404);
            return AbstractC61741Rsw.A00("OK", "", 200);
        }
    }

    @Override // X.InterfaceC65614To5
    public void maybeCallTrListeners(String str) {
        UserSession userSession = this.mUserSession;
        C06090Tz c06090Tz = C06090Tz.A05;
        if (AbstractC31178DnM.A1X(c06090Tz, userSession, 36327829821995928L)) {
            SF2 sf2 = new SF2(this.mUserSession);
            if (C18U.A06(c06090Tz, sf2.A00, 36322903494503145L)) {
                Iterator it = sf2.A01.iterator();
                while (it.hasNext()) {
                    Iterator it2 = ((C22930A9a) it.next()).A04.iterator();
                    while (it2.hasNext()) {
                        it2.next();
                    }
                }
            }
        }
    }

    public IGPixelRequestBuffer(Context context, Bundle bundle) {
        this.mUserSession = AbstractC31171DnF.A0G(bundle);
    }

    private boolean isTrRequest(WebResourceRequest webResourceRequest) {
        String method = webResourceRequest.getMethod();
        Uri url = webResourceRequest.getUrl();
        String host = url.getHost();
        String path = url.getPath();
        if (host == null || path == null || !method.equals("GET")) {
            return false;
        }
        if (!host.equalsIgnoreCase(URL_PREFIX) && !host.toLowerCase().endsWith(".facebook.com")) {
            return false;
        }
        if (!path.equals("/tr") && !path.equals("/tr/")) {
            return false;
        }
        return true;
    }

    private void updateResponse(WebResourceResponse webResourceResponse) {
        this.mResponse = webResourceResponse;
    }

    /* JADX WARN: Type inference failed for: r0v15, types: [X.0bW, java.lang.Object] */
    @Override // X.InterfaceC65614To5
    public WebResourceResponse handleRequest(WebResourceRequest webResourceRequest, AbstractC62758SPp abstractC62758SPp, SDT sdt) {
        boolean z;
        Uri A00;
        C62530SFh A04;
        String str;
        String queryParameter;
        UserSession userSession = this.mUserSession;
        String A0r = AbstractC58319PtB.A0r(webResourceRequest);
        C26371Ps A0e = AbstractC58319PtB.A0e();
        if (C18U.A06(C06090Tz.A05, userSession, 36327829822127002L) && !sdt.A01) {
            Uri url = webResourceRequest.getUrl();
            C62529SFg c62529SFg = sdt.A00;
            z = false;
            if (c62529SFg != null && (queryParameter = url.getQueryParameter(PublicKeyCredentialControllerUtility.JSON_KEY_ID)) != null) {
                try {
                    long parseLong = Long.parseLong(queryParameter);
                    C72529Xfi c72529Xfi = BloomFilter.Companion;
                    z = !new BloomFilter(BloomFilter.initHybrid0(c62529SFg.A01, c62529SFg.A00, c62529SFg.A02)).contains(parseLong);
                } catch (NumberFormatException e) {
                    C0K8.A0F("IGBufferedRequest", "Failed to parse pixel id", e);
                }
            }
        } else {
            z = false;
        }
        if (z && (A00 = AbstractC08820cl.A00(new Object(), A0r)) != null && A00.getQueryParameter("fbc") == null && (str = (A04 = abstractC62758SPp.A04(AbstractC62758SPp.A03(webResourceRequest, true))).A01) != null && !str.isEmpty()) {
            Long l = A04.A00;
            if (l == null || l.longValue() == 0) {
                l = AbstractC31173DnH.A0g();
            }
            String A0u = AnonymousClass001.A0u("fb.1.", l.toString(), ".", str);
            Uri.Builder buildUpon = A00.buildUpon();
            buildUpon.appendQueryParameter("fbc", A0u);
            A0r = AbstractC58319PtB.A0q(buildUpon);
            maybeCallTrListeners(A0r);
        }
        A0e.A02(A0r);
        A0e.A01(C05F.A0N);
        A0e.A05 = true;
        ArrayList A1E = AbstractC166987dD.A1E();
        Iterator A15 = AbstractC166997dE.A15(webResourceRequest.getRequestHeaders());
        while (A15.hasNext()) {
            Map.Entry A1K = AbstractC166987dD.A1K(A15);
            AbstractC58319PtB.A1I(AbstractC31172DnG.A17(A1K), AbstractC58318PtA.A0p(A1K), A1E);
        }
        List list = A0e.A06;
        list.clear();
        list.addAll(A1E);
        C1ON A01 = AnonymousClass963.A01(AbstractC24481Hr.A06.A00(new PUG(A0e, 1), 528676151, 2, false, true), "IGBufferedRequest", A0r);
        try {
            A01.A00 = new C60902RbH(this, 0);
            A01.run();
        } catch (Exception e2) {
            C0K8.A0F(TAG, "Request failed", e2);
            this.mResponse = AbstractC61741Rsw.A00("Not Found", e2.toString(), 404);
        }
        return AbstractC61741Rsw.A00("OK", "", 200);
    }
}
