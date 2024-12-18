package X;

import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.View;
import com.facebook.AccessToken;
import com.facebook.common.callercontext.CallerContext;
import com.instagram.base.activity.IgFragmentActivity;
import com.instagram.common.session.UserSession;
import com.instagram.model.reels.Reel;
import java.io.File;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import org.json.JSONException;

/* renamed from: X.TFl, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C64475TFl implements InterfaceC60602pj {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;

    @Override // X.InterfaceC60602pj
    public final /* synthetic */ void onViewCreated(View view, Bundle bundle) {
    }

    public C64475TFl(int i, Object obj, Object obj2, Object obj3) {
        this.A00 = i;
        this.A01 = obj3;
        this.A03 = obj2;
        this.A02 = obj;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0002. Please report as an issue. */
    @Override // X.InterfaceC60602pj
    public final void onActivityResult(int i, int i2, Intent intent) {
        Object obj;
        Bundle bundle;
        SG0 sg0;
        InterfaceC103384lE interfaceC103384lE;
        C6FW c6fw;
        C6FQ c6fq;
        C6FW c6fw2;
        InterfaceC103384lE interfaceC103384lE2;
        C6FQ c6fq2;
        Bundle bundle2;
        SG1 sg1;
        String str;
        switch (this.A00) {
            case 0:
                if (i == 1) {
                    if (i2 == -1) {
                        AbstractC63326Sha.A02(android.net.Uri.fromFile((File) this.A03), (C6FQ) this.A02, (C6FW) this.A01);
                        obj = this.A02;
                        C6BQ.A0L((C6FQ) obj, this);
                        return;
                    } else if (i2 == 0) {
                        AbstractC63326Sha.A03((C6FQ) this.A02, (C6FW) this.A01);
                    }
                }
                ((File) this.A03).delete();
                obj = this.A02;
                C6BQ.A0L((C6FQ) obj, this);
                return;
            case 1:
                if (i == 41261) {
                    ((IgFragmentActivity) this.A01).unregisterOnActivityResultListener(this);
                    if (intent != null) {
                        bundle = intent.getExtras();
                    } else {
                        bundle = null;
                    }
                    if (i2 == -1) {
                        if (bundle != null) {
                            C62900SWg c62900SWg = (C62900SWg) this.A03;
                            LinkedHashMap A1I = AbstractC166987dD.A1I();
                            LinkedHashMap A1I2 = AbstractC166987dD.A1I();
                            C62900SWg.A00(bundle, "id_front", "front_file_path", "front_authenticity_upload_medium", A1I, A1I2);
                            C62900SWg.A00(bundle, "id_back", "back_file_path", "back_authenticity_upload_medium", A1I, A1I2);
                            Iterator A0k = AbstractC167007dF.A0k(A1I);
                            while (A0k.hasNext()) {
                                Object next = A0k.next();
                                OTB otb = c62900SWg.A00;
                                C14360o3.A0B(next, 0);
                                otb.A00.add(next);
                            }
                            LinkedHashMap A0y = AbstractC43594JPz.A0y(A1I);
                            Iterator A14 = AbstractC166997dE.A14(A1I);
                            while (A14.hasNext()) {
                                Map.Entry A1K = AbstractC166987dD.A1K(A14);
                                Object key = A1K.getKey();
                                C6BS c6bs = C6BS.A02;
                                A0y.put(key, C6BX.A00(AbstractC25227BEk.A0B(AbstractC58318PtA.A0p(A1K))).toString());
                            }
                            c6fw2 = new C6FW(AbstractC16960so.A1Q(c62900SWg.A01, A0y, A1I2));
                            interfaceC103384lE2 = c62900SWg.A03;
                            c6fq2 = c62900SWg.A02;
                            C131845xK.A00(c6fq2, c6fw2, interfaceC103384lE2);
                            return;
                        }
                        return;
                    }
                    if (i2 == 0 && (interfaceC103384lE = (sg0 = (SG0) this.A02).A02) != null) {
                        c6fw = new C6FW(AbstractC166987dD.A1J(sg0.A00));
                        c6fq = sg0.A01;
                        C131845xK.A00(c6fq, c6fw, interfaceC103384lE);
                        return;
                    }
                    return;
                }
                return;
            case 2:
                if (i == 41262) {
                    ((IgFragmentActivity) this.A01).unregisterOnActivityResultListener(this);
                    if (intent != null) {
                        bundle2 = intent.getExtras();
                    } else {
                        bundle2 = null;
                    }
                    if (i2 == -1) {
                        if (bundle2 != null) {
                            C62575SHa c62575SHa = (C62575SHa) this.A03;
                            String string = bundle2.getString("result_video_path");
                            String string2 = bundle2.getString("result_photo_path");
                            HashMap A1G = AbstractC166987dD.A1G();
                            HashMap A1G2 = AbstractC166987dD.A1G();
                            if (string2 != null) {
                                String A00 = AbstractC43591JPw.A00(1315);
                                A1G.put(A00, string2);
                                A1G2.put(A00, "SELFIE_PHOTO_NATIVE");
                            }
                            if (string != null) {
                                A1G.put("selfie_video", string);
                                A1G2.put("selfie_video", "SELFIE_VIDEO_NATIVE");
                            }
                            Iterator A0k2 = AbstractC167007dF.A0k(A1G);
                            while (A0k2.hasNext()) {
                                Object next2 = A0k2.next();
                                OTB otb2 = c62575SHa.A00;
                                C14360o3.A0B(next2, 0);
                                otb2.A00.add(next2);
                            }
                            LinkedHashMap A18 = AbstractC25225BEi.A18(AbstractC16850sd.A0L(A1G.size()));
                            Iterator A142 = AbstractC166997dE.A14(A1G);
                            while (A142.hasNext()) {
                                Map.Entry A1K2 = AbstractC166987dD.A1K(A142);
                                Object key2 = A1K2.getKey();
                                C6BS c6bs2 = C6BS.A02;
                                A18.put(key2, C6BX.A00(AbstractC25227BEk.A0B(AbstractC58318PtA.A0p(A1K2))).toString());
                            }
                            c6fw2 = new C6FW(AbstractC16960so.A1Q(c62575SHa.A01, A18, A1G2));
                            interfaceC103384lE2 = c62575SHa.A03;
                            c6fq2 = c62575SHa.A02;
                            C131845xK.A00(c6fq2, c6fw2, interfaceC103384lE2);
                            return;
                        }
                        return;
                    }
                    if (i2 == 0 && (interfaceC103384lE = (sg1 = (SG1) this.A02).A02) != null) {
                        c6fw = new C6FW(AbstractC166987dD.A1J(sg1.A00));
                        c6fq = sg1.A01;
                        C131845xK.A00(c6fq, c6fw, interfaceC103384lE);
                        return;
                    }
                    return;
                }
                return;
            case 3:
                if (i == 1005) {
                    C6FQ c6fq3 = (C6FQ) this.A01;
                    InterfaceC103384lE interfaceC103384lE3 = (InterfaceC103384lE) this.A02;
                    C6FX A0s = AbstractC25225BEi.A0s();
                    A0s.A01(((Reel) this.A03).getId());
                    A0s.A02("HIGHLIGHT");
                    AbstractC25227BEk.A1M(c6fq3, A0s, interfaceC103384lE3);
                }
                obj = this.A01;
                C6BQ.A0L((C6FQ) obj, this);
                return;
            default:
                CallerContext callerContext = C1L2.A00;
                if (i == 64206) {
                    IgFragmentActivity igFragmentActivity = (IgFragmentActivity) this.A01;
                    igFragmentActivity.unregisterOnActivityResultListener(this);
                    if (i2 == -1) {
                        String A0f = MSY.A0f(AbstractC23021Ah.A00((UserSession) this.A03), "promote_pro2pro_client_token", "");
                        if (A0f.length() != 0) {
                            AccessToken accessToken = null;
                            try {
                                accessToken = AbstractC62765SQc.A00(AbstractC58318PtA.A17(A0f));
                            } catch (JSONException unused) {
                            }
                            if (accessToken != null && (str = accessToken.A02) != null) {
                                ((SCJ) this.A02).A00.DqC(str);
                                return;
                            }
                        }
                    }
                    C9GR.A07(igFragmentActivity, 2131965776);
                    ((SCJ) this.A02).A00.DFf();
                    return;
                }
                return;
        }
    }

    @Override // X.InterfaceC60602pj
    public final /* synthetic */ void onCreate() {
    }

    @Override // X.InterfaceC60602pj
    public final /* synthetic */ void onDestroy() {
        if (4 - this.A00 == 0) {
            ((IgFragmentActivity) this.A01).unregisterOnActivityResultListener(this);
        }
    }

    @Override // X.InterfaceC60602pj
    public final void onDestroyView() {
        Object obj;
        switch (this.A00) {
            case 0:
                obj = this.A02;
                break;
            case 1:
            case 2:
            default:
                return;
            case 3:
                obj = this.A01;
                break;
        }
        C6BQ.A0L((C6FQ) obj, this);
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
