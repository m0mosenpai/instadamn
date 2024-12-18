package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.instagram.common.typedurl.ImageUrl;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes6.dex */
public final class GPA implements Runnable {
    public final /* synthetic */ WFQ A00;
    public final /* synthetic */ AbstractC12990ll A01;
    public final /* synthetic */ List A02;

    public GPA(WFQ wfq, AbstractC12990ll abstractC12990ll, List list) {
        this.A00 = wfq;
        this.A01 = abstractC12990ll;
        this.A02 = list;
    }

    @Override // java.lang.Runnable
    public final void run() {
        String str;
        String str2;
        WFQ wfq = this.A00;
        AbstractC12990ll abstractC12990ll = this.A01;
        List list = this.A02;
        C006802i c006802i = wfq.A01;
        if (c006802i != null) {
            c006802i.markerPoint(896612552, "add_nonce_and_local_auth_account_start");
            ArrayList A06 = C83743oJ.A01(abstractC12990ll).A06(abstractC12990ll);
            ArrayList A1E = AbstractC166987dD.A1E();
            Iterator it = A06.iterator();
            int i = 0;
            while (it.hasNext()) {
                C83803oP c83803oP = (C83803oP) it.next();
                list.add(AbstractC25232BEp.A1F("account_type", "nonce", AbstractC166987dD.A1L("uid", c83803oP.A06), AbstractC166987dD.A1L("token", c83803oP.A05)));
                list.add(AbstractC25232BEp.A1F("token", c83803oP.A02(), AbstractC166987dD.A1L("uid", c83803oP.A06), AbstractC166987dD.A1L("credential_type", "local_auth")));
                if (wfq.A08) {
                    List list2 = wfq.A07;
                    C09530e4 A1L = AbstractC166987dD.A1L("uid", c83803oP.A06);
                    C09530e4 A1L2 = AbstractC166987dD.A1L("token", c83803oP.A05);
                    C09530e4 A1L3 = AbstractC166987dD.A1L("account_type", "nonce");
                    ImageUrl imageUrl = c83803oP.A02;
                    if (imageUrl != null) {
                        str = imageUrl.getUrl();
                    } else {
                        str = null;
                    }
                    list2.add(AbstractC06930Yk.A06(A1L, A1L2, A1L3, AbstractC166987dD.A1L("profile_pic_url", str), AbstractC166987dD.A1L(PublicKeyCredentialControllerUtility.JSON_KEY_NAME, c83803oP.A07)));
                    C09530e4 A1L4 = AbstractC166987dD.A1L("uid", c83803oP.A06);
                    C09530e4 A1L5 = AbstractC166987dD.A1L("credential_type", "local_auth");
                    C09530e4 A1L6 = AbstractC166987dD.A1L("token", c83803oP.A02());
                    ImageUrl imageUrl2 = c83803oP.A02;
                    if (imageUrl2 != null) {
                        str2 = imageUrl2.getUrl();
                    } else {
                        str2 = null;
                    }
                    list2.add(AbstractC06930Yk.A06(A1L4, A1L5, A1L6, AbstractC166987dD.A1L("profile_pic_url", str2), AbstractC166987dD.A1L(PublicKeyCredentialControllerUtility.JSON_KEY_NAME, c83803oP.A07)));
                }
                i++;
                String str3 = c83803oP.A06;
                C14360o3.A0A(str3);
                A1E.add(str3);
            }
            C35029Fc2 c35029Fc2 = wfq.A06;
            if (i == 0) {
                c35029Fc2.A01(abstractC12990ll, "nonce");
                c35029Fc2.A01(abstractC12990ll, "local_auth");
            } else {
                c35029Fc2.A03(abstractC12990ll, "nonce", A1E);
                c35029Fc2.A03(abstractC12990ll, "local_auth", A1E);
                C006802i c006802i2 = wfq.A01;
                if (c006802i2 != null) {
                    c006802i2.markerAnnotate(896612552, "count_of_nonce_and_local_accounts", i);
                }
            }
            C006802i c006802i3 = wfq.A01;
            if (c006802i3 != null) {
                c006802i3.markerPoint(896612552, "add_nonce_and_local_auth_account_end");
                return;
            }
        }
        C14360o3.A0F("qplLogger");
        throw C00O.createAndThrow();
    }
}
