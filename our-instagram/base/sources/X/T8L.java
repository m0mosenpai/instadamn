package X;

import android.content.Intent;
import androidx.activity.result.ActivityResult;
import com.facebook.privacy.consent.bloks.instagram.InstagramConsentFlowHostActivity;
import java.io.File;
import java.io.IOException;
import java.util.Map;

/* loaded from: classes10.dex */
public final class T8L implements C2JL {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final String A03;

    public T8L(Object obj, Object obj2, String str, int i) {
        this.A00 = i;
        this.A01 = obj;
        this.A02 = obj2;
        this.A03 = str;
    }

    @Override // X.C2JL
    public final void onFailure(Throwable th) {
        switch (this.A00) {
            case 0:
                C14360o3.A0B(th, 0);
                Intent A0I = AbstractC58323PtF.A0I(AbstractC31171DnF.A04(), "result_operation_type", "refresh_access_token", th);
                C14360o3.A07(A0I);
                ((C00V) this.A01).Cv1(new ActivityResult(0, A0I));
                C62920SXc.A00.A00((InterfaceC02550Ad) this.A02, C05F.A0u, this.A03, th.getMessage(), C2Ql.A00(th), null, 0L);
                return;
            case 1:
                C14360o3.A0B(th, 0);
                InstagramConsentFlowHostActivity instagramConsentFlowHostActivity = (InstagramConsentFlowHostActivity) this.A02;
                if (!instagramConsentFlowHostActivity.isDestroyed()) {
                    DialogC50732Maa dialogC50732Maa = instagramConsentFlowHostActivity.A00;
                    if (dialogC50732Maa == null) {
                        C14360o3.A0F("loadingDialog");
                        throw C00O.createAndThrow();
                    }
                    dialogC50732Maa.dismiss();
                }
                InstagramConsentFlowHostActivity.A01(instagramConsentFlowHostActivity, this.A03, "Error in InstagramConsentFlowHostActivity.launchBloksAction()", th);
                return;
            case 2:
                InterfaceC103384lE interfaceC103384lE = (InterfaceC103384lE) this.A02;
                C6FX A0s = AbstractC25225BEi.A0s();
                A0s.A01(null);
                C131845xK.A00((C6FQ) this.A01, A0s.A00(), interfaceC103384lE);
                return;
            default:
                return;
        }
    }

    @Override // X.C2JL
    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        C2JS c2js;
        String str;
        Intent putExtra;
        C00V c00v;
        int i;
        int intValue;
        C2JS A0k;
        String str2;
        Map map;
        switch (this.A00) {
            case 0:
                AnonymousClass436 anonymousClass436 = (AnonymousClass436) obj;
                Integer num = null;
                if (anonymousClass436 != null && (A0k = AbstractC25225BEi.A0k(anonymousClass436)) != null) {
                    c2js = A0k.getOptionalTreeField(0, "xfb_oauth_account_linking_renew_access_token(auth_integration_id:$oauth_integration_id)", C59046QVe.class, -549311167);
                    if (c2js != null) {
                        str = c2js.getOptionalStringField(0, "access_token");
                        num = Integer.valueOf(c2js.getCoercedIntField(1, "expiry_time"));
                        if (c2js == null && str != null && num != null && (intValue = num.intValue()) != 0) {
                            putExtra = AbstractC58322PtE.A0F("result_operation_type", "refresh_access_token").putExtra("access_token", str).putExtra("access_token_expiry_time", intValue);
                            C14360o3.A07(putExtra);
                            c00v = (C00V) this.A01;
                            i = -1;
                        } else {
                            putExtra = AbstractC58322PtE.A0F("result_operation_type", "refresh_access_token").putExtra("error", "NULL_ACCESS_TOKEN_OR_EXPIRY");
                            C14360o3.A07(putExtra);
                            c00v = (C00V) this.A01;
                            i = 0;
                        }
                        c00v.Cv1(new ActivityResult(i, putExtra));
                        C62920SXc.A00.A00((InterfaceC02550Ad) this.A02, C05F.A0u, this.A03, null, null, null, 0L);
                        return;
                    }
                } else {
                    c2js = null;
                }
                str = null;
                if (c2js == null) {
                }
                putExtra = AbstractC58322PtE.A0F("result_operation_type", "refresh_access_token").putExtra("error", "NULL_ACCESS_TOKEN_OR_EXPIRY");
                C14360o3.A07(putExtra);
                c00v = (C00V) this.A01;
                i = 0;
                c00v.Cv1(new ActivityResult(i, putExtra));
                C62920SXc.A00.A00((InterfaceC02550Ad) this.A02, C05F.A0u, this.A03, null, null, null, 0L);
                return;
            case 1:
                C66246U5q c66246U5q = (C66246U5q) obj;
                InstagramConsentFlowHostActivity instagramConsentFlowHostActivity = (InstagramConsentFlowHostActivity) this.A02;
                if (!instagramConsentFlowHostActivity.isDestroyed()) {
                    DialogC50732Maa dialogC50732Maa = instagramConsentFlowHostActivity.A00;
                    if (dialogC50732Maa == null) {
                        str2 = "loadingDialog";
                        C14360o3.A0F(str2);
                        throw C00O.createAndThrow();
                    }
                    dialogC50732Maa.dismiss();
                }
                if (c66246U5q != null) {
                    AbstractC33787EwD.A00((C62862tP) this.A01, c66246U5q);
                }
                C006802i c006802i = instagramConsentFlowHostActivity.A01;
                if (c006802i == null) {
                    str2 = "quickPerformanceLogger";
                    C14360o3.A0F(str2);
                    throw C00O.createAndThrow();
                }
                c006802i.markerEnd(192756491, (short) 2);
                return;
            case 2:
                InterfaceC103384lE interfaceC103384lE = (InterfaceC103384lE) this.A02;
                C6FX A0s = AbstractC25225BEi.A0s();
                if (obj != null) {
                    map = AbstractC167007dF.A0n(this.A03, obj);
                } else {
                    map = null;
                }
                A0s.A01(map);
                C131845xK.A00((C6FQ) this.A01, A0s.A00(), interfaceC103384lE);
                return;
            default:
                try {
                    C185278Js.A0H.put(this.A03, ((File) this.A01).getCanonicalPath());
                } catch (IOException unused) {
                }
                AbstractC25225BEi.A1U(this.A02, obj);
                return;
        }
    }
}
