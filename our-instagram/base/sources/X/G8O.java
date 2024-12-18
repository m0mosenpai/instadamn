package X;

import android.app.Activity;
import android.content.Context;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import androidx.fragment.app.FragmentActivity;
import com.instagram.comments.model.ChannelRepliesNotifData;
import com.instagram.common.session.UserSession;
import com.instagram.modal.ModalActivity;
import com.instagram.realtimeclient.GraphQLSubscriptionID;
import com.instagram.user.model.User;

/* loaded from: classes6.dex */
public final class G8O implements GZB {
    public final int A00;
    public final Object A01;
    public final Object A02;

    @Override // X.GZB
    public final void onDismiss() {
    }

    public G8O(int i, Object obj, Object obj2) {
        this.A00 = i;
        this.A02 = obj2;
        this.A01 = obj;
    }

    @Override // X.GZB
    public final void D3J(Context context) {
        C34996FbT c34996FbT;
        String A00;
        C36881nl A01;
        if (this.A00 != 0) {
            C34570FLe c34570FLe = (C34570FLe) this.A02;
            UserSession userSession = c34570FLe.A01;
            AbstractC25228BEl.A1G((Activity) this.A01, AbstractC31364DqT.A02().A01(userSession, AbstractC31402Dr6.A03(userSession, userSession.userId, AbstractC111324zv.A00(216), c34570FLe.A02)), userSession, ModalActivity.class, "profile");
            return;
        }
        FragmentActivity A07 = AbstractC31179DnN.A07();
        if (A07 == null || (A00 = (c34996FbT = (C34996FbT) this.A01).A00(PublicKeyCredentialControllerUtility.JSON_KEY_ID)) == null) {
            return;
        }
        if (c34996FbT.A00("media_id") != null) {
            C36507G8f c36507G8f = (C36507G8f) this.A02;
            String A002 = c34996FbT.A00("media_id");
            if (A002 != null) {
                String A003 = c34996FbT.A00("x");
                String A004 = c34996FbT.A00("target_comment_id");
                String A005 = c34996FbT.A00("media_owner_id");
                String A006 = c34996FbT.A00("media_owner_profile_pic_url");
                A01 = C36881nl.A01(A07, AbstractC31171DnF.A0D("inapp_notification"), c36507G8f.A00, "in_app_notification");
                A01.A0A(A00);
                A01.A0X = A003;
                A01.A04 = new ChannelRepliesNotifData(A002, A004, A005, A006);
            } else {
                throw AbstractC166997dE.A0g();
            }
        } else {
            if (c34996FbT.A00("notif_recipient_id") == null) {
                return;
            }
            C36507G8f c36507G8f2 = (C36507G8f) this.A02;
            String A007 = c34996FbT.A00("notif_recipient_id");
            if (A007 != null) {
                UserSession userSession2 = c36507G8f2.A00;
                if (AbstractC31172DnG.A1Z(userSession2, A007)) {
                    A01 = C36881nl.A01(A07, AbstractC31171DnF.A0D("inapp_notification"), userSession2, "watch_receipt_inapp_notification");
                    A01.A0A(A00);
                } else {
                    InterfaceC02900Bo A008 = C0BQ.A00(userSession2);
                    User BOa = A008.BOa(A007);
                    if (BOa == null || !A008.AGB(A07, userSession2, BOa)) {
                        return;
                    }
                    A008.E45(A07, AbstractC34770FTt.A01(A07, A007, A00, null, "DirectUrlHandler", null, null), userSession2, BOa, GraphQLSubscriptionID.INAPP_NOTIFICATION_TYPE_WATCH_RECEIPTS);
                    return;
                }
            } else {
                throw AbstractC166997dE.A0g();
            }
        }
        A01.A06();
    }
}
