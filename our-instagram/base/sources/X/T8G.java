package X;

import android.content.Intent;
import com.facebook.oauthaccountlinking.OAuthAccountLinkingActivityBase;
import com.facebook.papaya.client.platform.PlatformRichJobSchedulingGuard;
import com.facebook.smartcapture.download.IgVoltronAndNmlModulesDownloader;
import com.instagram.common.resources.downloadable.impl.WaitingForStringsActivity;

/* loaded from: classes10.dex */
public final class T8G implements C2JL {
    public final int A00;
    public final Object A01;

    public T8G(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0002. Please report as an issue. */
    @Override // X.C2JL
    public final void onFailure(Throwable th) {
        OAuthAccountLinkingActivityBase oAuthAccountLinkingActivityBase;
        Integer num;
        Class<IgVoltronAndNmlModulesDownloader> cls;
        Object[] objArr;
        char c;
        switch (this.A00) {
            case 0:
                C14360o3.A0B(th, 0);
                Intent A0I = AbstractC58323PtF.A0I(AbstractC31171DnF.A04(), "result_operation_type", "new_access_token", th);
                C14360o3.A07(A0I);
                oAuthAccountLinkingActivityBase = (OAuthAccountLinkingActivityBase) this.A01;
                oAuthAccountLinkingActivityBase.setResult(0, A0I);
                num = C05F.A0Y;
                OAuthAccountLinkingActivityBase.A00(oAuthAccountLinkingActivityBase, num, null, th.getMessage(), C2Ql.A00(th));
                oAuthAccountLinkingActivityBase.finish();
                return;
            case 1:
                C14360o3.A0B(th, 0);
                Intent A0I2 = AbstractC58323PtF.A0I(AbstractC31171DnF.A04(), "result_operation_type", "new_access_token", th);
                C14360o3.A07(A0I2);
                oAuthAccountLinkingActivityBase = (OAuthAccountLinkingActivityBase) this.A01;
                oAuthAccountLinkingActivityBase.setResult(0, A0I2);
                num = C05F.A0j;
                OAuthAccountLinkingActivityBase.A00(oAuthAccountLinkingActivityBase, num, null, th.getMessage(), C2Ql.A00(th));
                oAuthAccountLinkingActivityBase.finish();
                return;
            case 2:
                ((PlatformRichJobSchedulingGuard) this.A01).A01();
                return;
            case 3:
                InterfaceC19610xo ARD = ((SYS) this.A01).A00.A00.A01.ARD();
                ARD.E77("PHONEID_APP_DEVICEID_SYNCED", false);
                ARD.apply();
                SYS.A02.set(false);
                return;
            case 4:
                C14360o3.A0B(th, 0);
                cls = IgVoltronAndNmlModulesDownloader.class;
                objArr = new Object[3];
                objArr[0] = "model";
                objArr[1] = 1;
                c = 2;
                objArr[c] = th;
                C0K8.A09(cls, "Failed to download model %s:%d", objArr);
                ((InterfaceC65500TlP) this.A01).DBk();
                return;
            case 5:
                C14360o3.A0B(th, 0);
                cls = IgVoltronAndNmlModulesDownloader.class;
                objArr = new Object[3];
                objArr[0] = "ocr2go_credit_card_models";
                c = 2;
                objArr[1] = 2;
                objArr[c] = th;
                C0K8.A09(cls, "Failed to download model %s:%d", objArr);
                ((InterfaceC65500TlP) this.A01).DBk();
                return;
            case 6:
                ((InterfaceC65508Tld) this.A01).DcL(null, null, th);
                return;
            case 7:
            default:
                return;
            case 8:
                C14360o3.A0B(th, 0);
                C0K8.A0F(WaitingForStringsActivity.A0A, "Failed to fetch string from server.", th);
                C006802i.A0p.markerEnd(4456452, (short) 3);
                WaitingForStringsActivity waitingForStringsActivity = (WaitingForStringsActivity) this.A01;
                waitingForStringsActivity.runOnUiThread(new TP0(waitingForStringsActivity, th));
                return;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:141:0x01b3, code lost:
    
        if (r2 != null) goto L73;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0006. Please report as an issue. */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v29, types: [java.util.AbstractMap, java.util.EnumMap] */
    @Override // X.C2JL
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final /* bridge */ /* synthetic */ void onSuccess(java.lang.Object r22) {
        /*
            Method dump skipped, instructions count: 900
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.T8G.onSuccess(java.lang.Object):void");
    }
}
