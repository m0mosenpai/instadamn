package X;

import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.View;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.facebook.proxygen.LigerSamplePolicy;
import com.instagram.adshistory.fragment.RecentAdActivityFragment;
import com.instagram.base.activity.IgFragmentActivity;
import com.instagram.common.session.UserSession;
import java.util.HashMap;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.Inz, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C42275Inz implements InterfaceC60602pj {
    public final int A00;
    public final Object A01;
    public final Object A02;

    public C42275Inz(int i, Object obj, Object obj2) {
        this.A00 = i;
        this.A02 = obj;
        this.A01 = obj2;
    }

    @Override // X.InterfaceC60602pj
    public final /* synthetic */ void onActivityResult(int i, int i2, Intent intent) {
        switch (this.A00) {
            case 1:
                if (i2 != -1) {
                    return;
                }
                C35024Fbx c35024Fbx = (C35024Fbx) this.A02;
                IgFragmentActivity igFragmentActivity = (IgFragmentActivity) this.A01;
                c35024Fbx.A01(AbstractC166987dD.A0O(igFragmentActivity), null, i, -1);
                igFragmentActivity.onBackPressed();
                return;
            case 2:
            default:
                return;
            case 3:
                IgFragmentActivity igFragmentActivity2 = (IgFragmentActivity) this.A01;
                igFragmentActivity2.unregisterOnActivityResultListener(this);
                if (intent == null) {
                    return;
                }
                C63397SjR c63397SjR = (C63397SjR) this.A02;
                long longExtra = intent.getLongExtra(AbstractC111324zv.A00(143), 0L);
                C1VN c1vn = C1VN.A00;
                if (c1vn == null) {
                    return;
                }
                C58877QEn c58877QEn = c63397SjR.A1L;
                Bundle bundle = c58877QEn.A00;
                String A00 = AbstractC58317Pt9.A00(204);
                if (bundle.getString(A00) == null) {
                    return;
                }
                Bundle bundle2 = c58877QEn.A00;
                String A002 = AbstractC58317Pt9.A00(206);
                if (bundle2.getString(A002) == null || c58877QEn.A00.getString("TrackingInfo.ARG_ADVERTISER_NAME", null) == null || longExtra < LigerSamplePolicy.CERT_DATA_SAMPLE_WEIGHT) {
                    return;
                }
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("ad_id", c58877QEn.A00.getString(A00));
                    jSONObject.put("advertiser_name", c58877QEn.A00.getString("TrackingInfo.ARG_ADVERTISER_NAME", null));
                    HashMap A1G = AbstractC166987dD.A1G();
                    A1G.put("ad_id", c58877QEn.A00.getString(A00));
                    A1G.put("ad_tracking_token", c58877QEn.A00.getString(A002));
                    A1G.put("iab_dwell_time", String.valueOf(longExtra));
                    UserSession userSession = c63397SjR.A1K;
                    String obj = jSONObject.toString();
                    C25621Ms A0D = AbstractC31179DnN.A0D(userSession);
                    A0D.A0B("survey/get/");
                    A0D.A9s(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, "landing_page_quality_survey");
                    AbstractC37303Gc4.A15(A0D);
                    A0D.A0H("extra_data_token", obj);
                    C1ON A0e = AbstractC25227BEk.A0e(A0D, C38896HAs.class, C41708Ide.class);
                    C37460Gee.A00(A0e, A1G, c63397SjR, c1vn, 5);
                    igFragmentActivity2.schedule(A0e);
                    return;
                } catch (JSONException unused) {
                    return;
                }
        }
    }

    @Override // X.InterfaceC60602pj
    public final /* synthetic */ void onCreate() {
    }

    @Override // X.InterfaceC60602pj
    public final /* synthetic */ void onDestroy() {
        if (2 - this.A00 == 0) {
            ((C25671My) this.A01).A02((InterfaceC41501vz) this.A02, C57452kK.class);
        }
    }

    @Override // X.InterfaceC60602pj
    public final /* synthetic */ void onDestroyView() {
    }

    @Override // X.InterfaceC60602pj
    public final /* synthetic */ void onPause() {
    }

    @Override // X.InterfaceC60602pj
    public final /* synthetic */ void onResume() {
    }

    @Override // X.InterfaceC60602pj
    public final /* synthetic */ void onStart() {
    }

    @Override // X.InterfaceC60602pj
    public final /* synthetic */ void onStop() {
    }

    @Override // X.InterfaceC60602pj
    public final void onViewCreated(View view, Bundle bundle) {
        if (this.A00 == 0) {
            C14360o3.A0B(view, 0);
            C57112jm c57112jm = ((RecentAdActivityFragment) this.A02).A03;
            if (c57112jm == null) {
                C14360o3.A0F("viewpointManager");
                throw C00O.createAndThrow();
            }
            c57112jm.A08(view, (AbstractC56982jZ) this.A01, new InterfaceC57142jp[0]);
        }
    }

    @Override // X.InterfaceC60602pj
    public final /* synthetic */ void ADK(View view) {
    }

    @Override // X.InterfaceC60602pj
    public final /* synthetic */ void D8S(View view) {
    }

    @Override // X.InterfaceC60602pj
    public final /* synthetic */ void onConfigurationChanged(Configuration configuration) {
    }

    @Override // X.InterfaceC60602pj
    public final /* synthetic */ void onSaveInstanceState(Bundle bundle) {
    }

    @Override // X.InterfaceC60602pj
    public final /* synthetic */ void onViewStateRestored(Bundle bundle) {
    }
}
