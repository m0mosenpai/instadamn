package X;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Pair;
import com.facebook.proxygen.LigerSamplePolicy;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.GoogleApiAvailability;
import com.google.android.gms.common.api.internal.BasePendingResult;
import com.google.android.gms.location.LocationRequest;
import com.google.android.gms.location.LocationServices;
import com.google.android.gms.location.LocationSettingsRequest;
import com.instagram.common.api.base.CacheBehaviorLogger;
import com.instagram.common.session.UserSession;
import com.instagram.debug.devoptions.avatars.ImmersiveAvatarViewerDebugFragment;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.concurrent.locks.ReentrantLock;

/* renamed from: X.Rbk, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C60930Rbk extends AbstractC60592pi implements InterfaceC60602pj, C69E, C69G {
    public AbstractC1335861e A00;
    public boolean A01 = false;
    public C62535SFm A02;
    public final Activity A03;
    public final SKQ A04;
    public final C62474SDb A05;
    public final InterfaceC65454TkQ A06;
    public final String A07;
    public final String A08;

    @Override // X.C69F
    public final void D75(Bundle bundle) {
    }

    @Override // X.C69F
    public final void D7H(int i) {
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [X.01p, java.util.Map] */
    /* JADX WARN: Type inference failed for: r2v4, types: [X.01p, X.0yX, java.util.Map] */
    /* JADX WARN: Type inference failed for: r3v1, types: [X.01p, java.util.Map] */
    /* JADX WARN: Type inference failed for: r4v0, types: [X.01p, X.0yX, java.util.Map] */
    public C60930Rbk(Activity activity, UserSession userSession, InterfaceC65454TkQ interfaceC65454TkQ, String str, String str2) {
        this.A03 = activity;
        this.A06 = interfaceC65454TkQ;
        this.A08 = str;
        this.A07 = str2;
        C61W c61w = null;
        HashSet A1H = AbstractC166987dD.A1H();
        HashSet A1H2 = AbstractC166987dD.A1H();
        ?? c005001p = new C005001p(0);
        ?? c005001p2 = new C005001p(0);
        GoogleApiAvailability googleApiAvailability = GoogleApiAvailability.A00;
        C61U c61u = AbstractC62396S9v.A00;
        ArrayList A1E = AbstractC166987dD.A1E();
        ArrayList A1E2 = AbstractC166987dD.A1E();
        Looper mainLooper = activity.getMainLooper();
        String packageName = activity.getPackageName();
        String A0h = MSY.A0h(activity);
        A1E.add(this);
        A1E2.add(this);
        C61W c61w2 = LocationServices.A00;
        C3U5.A03(c61w2, "Api must not be null");
        c005001p2.put(c61w2, null);
        C3U5.A03(c61w2.A00, "Base client builder must not be null");
        List emptyList = Collections.emptyList();
        A1H2.addAll(emptyList);
        A1H.addAll(emptyList);
        C3U5.A08(!c005001p2.isEmpty(), "must call addApi() to add at least one API");
        C69I c69i = C69I.A00;
        C61W c61w3 = AbstractC62396S9v.A04;
        C1340363l c1340363l = new C1340363l(c005001p2.containsKey(c61w3) ? (C69I) c005001p2.get(c61w3) : c69i, packageName, A0h, c005001p, A1H);
        Map map = c1340363l.A04;
        ?? c005001p3 = new C005001p(0);
        ?? c005001p4 = new C005001p(0);
        ArrayList A1E3 = AbstractC166987dD.A1E();
        for (C61W c61w4 : c005001p2.keySet()) {
            Object obj = c005001p2.get(c61w4);
            boolean A1W = AbstractC167007dF.A1W(map.get(c61w4));
            AbstractC43592JPx.A1W(c61w4, c005001p3, A1W);
            T50 t50 = new T50(c61w4, A1W);
            A1E3.add(t50);
            C61U c61u2 = c61w4.A00;
            C3U5.A02(c61u2);
            InterfaceC1340663q A00 = c61u2.A00(activity, mainLooper, t50, t50, c1340363l, obj);
            c005001p4.put(c61w4.A01, A00);
            if (A00.E6l()) {
                if (c61w == null) {
                    c61w = c61w4;
                } else {
                    throw AbstractC58319PtB.A0k(c61w4.A02, " cannot be used with ", c61w.A02);
                }
            }
        }
        if (c61w != null) {
            Object[] objArr = {c61w.A02};
            if (!A1H.equals(A1H2)) {
                throw AbstractC58319PtB.A0l("Must not set scopes in GoogleApiClient.Builder when using %s. Set account in GoogleSignInOptions.Builder instead.", objArr);
            }
        }
        C60650RGb c60650RGb = new C60650RGb(activity, mainLooper, googleApiAvailability, c61u, c1340363l, A1E3, A1E, A1E2, c005001p3, c005001p4, new ReentrantLock(), -1, C60650RGb.A00(c005001p4.values(), true));
        java.util.Set set = AbstractC1335861e.A00;
        synchronized (set) {
            set.add(c60650RGb);
        }
        this.A00 = c60650RGb;
        C14360o3.A0B(userSession, 0);
        this.A05 = ((SCV) userSession.A01(SCV.class, new C50152MDf(userSession, 46))).A00;
        this.A04 = ((SCU) userSession.A01(SCU.class, new C50152MDf(userSession, 45))).A00;
    }

    public final C62535SFm A01() {
        C62535SFm c62535SFm = this.A02;
        if (c62535SFm == null) {
            C62535SFm c62535SFm2 = new C62535SFm(this.A07, AbstractC166997dE.A0o(), this.A08);
            this.A02 = c62535SFm2;
            return c62535SFm2;
        }
        return c62535SFm;
    }

    public final void A02() {
        if (!this.A01) {
            C62474SDb c62474SDb = this.A05;
            C62535SFm A01 = A01();
            Map map = c62474SDb.A01;
            map.put(AbstractC31187DnW.A00(), A01.A01);
            map.put(CacheBehaviorLogger.SOURCE, A01.A02);
            map.put(ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY, A01.A00);
            map.put("location_service_always", "unset");
            SKQ skq = this.A04;
            skq.A00.A00("gms_ls_upsell_requested", new C64910TZk(skq, A00(this)), "gms_ls_upsell");
            AbstractC1335861e abstractC1335861e = this.A00;
            abstractC1335861e.A08();
            LocationRequest locationRequest = new LocationRequest();
            locationRequest.A00(10000L);
            locationRequest.A07 = true;
            locationRequest.A04 = LigerSamplePolicy.CERT_DATA_SAMPLE_WEIGHT;
            locationRequest.A01 = 100;
            ArrayList A1E = AbstractC166987dD.A1E();
            A1E.add(locationRequest);
            C60655RGh c60655RGh = new C60655RGh(abstractC1335861e, new LocationSettingsRequest(null, A1E, true, false));
            abstractC1335861e.A06(c60655RGh);
            T57 t57 = new T57(this);
            synchronized (c60655RGh.A07) {
                C3U5.A09(!c60655RGh.A0C, "Result has already been consumed.");
                if (!c60655RGh.A02) {
                    if (AbstractC167007dF.A1N((c60655RGh.A0A.getCount() > 0L ? 1 : (c60655RGh.A0A.getCount() == 0L ? 0 : -1)))) {
                        AbstractC166997dE.A1H(c60655RGh.A06, new Pair(t57, BasePendingResult.A00(c60655RGh)), 1);
                    } else {
                        ((BasePendingResult) c60655RGh).A00 = t57;
                    }
                }
            }
        }
    }

    @Override // X.C69H
    public final void D7D(ConnectionResult connectionResult) {
        this.A06.D2r(C05F.A0Y);
        this.A04.A00(A00(this), "UNKNOWN_FAILURE");
        this.A05.A01.clear();
    }

    @Override // X.AbstractC60592pi, X.InterfaceC60602pj
    public final void onActivityResult(int i, int i2, Intent intent) {
        Integer num;
        C62474SDb c62474SDb;
        String str;
        String str2;
        if (this.A01 && i == 5005) {
            this.A01 = false;
            if (i2 == -1) {
                num = C05F.A00;
                c62474SDb = this.A05;
                str = "ls_dialog_click";
            } else {
                num = C05F.A01;
                c62474SDb = this.A05;
                str = "ls_dialog_dismiss";
            }
            Map map = c62474SDb.A01;
            if ("local_search".equals(map.get(CacheBehaviorLogger.SOURCE))) {
                c62474SDb.A00.A00(str, new C64910TZk(c62474SDb, map), "browse");
            }
            this.A06.D2r(num);
            SKQ skq = this.A04;
            String A00 = A00(this);
            if (num.intValue() != 0) {
                str2 = "DIALOG_CANCEL";
            } else {
                str2 = "DIALOG_SUCCESS";
            }
            skq.A00(A00, str2);
            map.clear();
        }
    }

    public static String A00(C60930Rbk c60930Rbk) {
        if (TextUtils.isEmpty(c60930Rbk.A01().A02)) {
            return "surface_location_upsell_fragment";
        }
        return c60930Rbk.A01().A02;
    }
}
