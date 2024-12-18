package X;

import android.webkit.URLUtil;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.facebook.catalyst.modules.netinfo.NetInfoModule;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes6.dex */
public final class GP9 implements Runnable {
    public final /* synthetic */ WFQ A00;
    public final /* synthetic */ AbstractC12990ll A01;
    public final /* synthetic */ List A02;

    public GP9(WFQ wfq, AbstractC12990ll abstractC12990ll, List list) {
        this.A00 = wfq;
        this.A01 = abstractC12990ll;
        this.A02 = list;
    }

    @Override // java.lang.Runnable
    public final void run() {
        String str;
        WFQ wfq = this.A00;
        AbstractC12990ll abstractC12990ll = this.A01;
        List list = this.A02;
        C006802i c006802i = wfq.A01;
        if (c006802i != null) {
            c006802i.markerPoint(896612552, "add_nonpassword_saved_accounts_start");
            ArrayList A00 = LHJ.A00();
            ArrayList A1E = AbstractC166987dD.A1E();
            Iterator it = A00.iterator();
            int i = 0;
            while (it.hasNext()) {
                L8l l8l = (L8l) it.next();
                String A002 = l8l.A00();
                if (A002 != null && A002.length() != 0) {
                    list.add(AbstractC25232BEp.A1F("token", "", AbstractC166987dD.A1L("uid", A002), AbstractC166987dD.A1L("credential_type", NetInfoModule.CONNECTION_TYPE_NONE)));
                    if (wfq.A08) {
                        List list2 = wfq.A07;
                        C09530e4 A1L = AbstractC166987dD.A1L("uid", A002);
                        C09530e4 A1L2 = AbstractC166987dD.A1L("credential_type", NetInfoModule.CONNECTION_TYPE_NONE);
                        C09530e4 A1L3 = AbstractC166987dD.A1L("token", "");
                        C09530e4 A1L4 = AbstractC166987dD.A1L(PublicKeyCredentialControllerUtility.JSON_KEY_NAME, l8l.A01());
                        if (URLUtil.isValidUrl(l8l.A00)) {
                            str = l8l.A00;
                        } else {
                            str = null;
                        }
                        list2.add(AbstractC06930Yk.A06(A1L, A1L2, A1L3, A1L4, AbstractC166987dD.A1L("profile_pic_url", str)));
                    }
                }
                i++;
                A1E.add(WFQ.A01(A002));
            }
            C35029Fc2 c35029Fc2 = wfq.A06;
            if (i == 0) {
                c35029Fc2.A01(abstractC12990ll, NetInfoModule.CONNECTION_TYPE_NONE);
            } else {
                c35029Fc2.A03(abstractC12990ll, NetInfoModule.CONNECTION_TYPE_NONE, A1E);
                C006802i c006802i2 = wfq.A01;
                if (c006802i2 != null) {
                    c006802i2.markerAnnotate(896612552, "count_of_nonpassword_saved_accounts", i);
                }
            }
            C006802i c006802i3 = wfq.A01;
            if (c006802i3 != null) {
                c006802i3.markerPoint(896612552, "add_nonpassword_saved_accounts_end");
                return;
            }
        }
        C14360o3.A0F("qplLogger");
        throw C00O.createAndThrow();
    }
}
