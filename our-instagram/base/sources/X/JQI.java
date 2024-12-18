package X;

import com.facebook.catalyst.modules.cameraroll.CameraRollManager;
import com.facebook.common.dextricks.JITProfilePQR;
import com.facebook.forker.Process;
import com.facebook.msys.mca.Mailbox;
import com.facebook.msys.mca.MailboxFeature;
import com.facebook.msys.mca.MailboxFutureImpl;
import com.facebook.msys.mca.MailboxNullable;
import com.facebook.msys.mci.NetworkUtils;
import com.instagram.direct.model.messaginguser.MessagingUser;
import com.instagram.react.modules.base.IgReactQEModule;
import java.util.ArrayList;

/* loaded from: classes8.dex */
public final class JQI implements C6D2 {
    public final int A00;

    public JQI(int i) {
        this.A00 = i;
    }

    @Override // X.C6D2
    public final /* bridge */ /* synthetic */ Object apply(Object obj) {
        switch (this.A00) {
            case 0:
                LAI lai = (LAI) obj;
                C14360o3.A0B(lai, 0);
                C47967LIb c47967LIb = lai.A00;
                LK0 lk0 = new LK0();
                K3W k3w = c47967LIb.A02;
                InterfaceExecutorC135866Co ASj = k3w.mMailboxApiHandleMetaProvider.ASj(2);
                MailboxFutureImpl mailboxFutureImpl = new MailboxFutureImpl(ASj);
                if (!ASj.ELJ(new JVY(2, mailboxFutureImpl, true, k3w))) {
                    mailboxFutureImpl.cancel(false);
                }
                mailboxFutureImpl.addResultCallback(new JRS(lk0, 10));
                lk0.A04(LST.A00);
                return C0eB.A00;
            case 1:
                C137766Ly c137766Ly = C137766Ly.A0L;
                return C42221xC.A07(new C43645JSd(obj, 0), AbstractC137146It.A00("load_pending_thread_unread_count"));
            case 2:
                C137766Ly c137766Ly2 = C137766Ly.A0L;
                return C42221xC.A07(new C43645JSd(obj, 2), AbstractC137146It.A00("load_thread_themes_list"));
            case 3:
            case 24:
            default:
                return new C137266Jf((Mailbox) obj);
            case 4:
                return new MailboxFeature((AbstractC135836Cl) obj);
            case 5:
                return new MailboxFeature((AbstractC135836Cl) obj);
            case 6:
                return new MailboxFeature((AbstractC135836Cl) obj);
            case 7:
                return new MailboxFeature((AbstractC135836Cl) obj);
            case 8:
                return new MailboxFeature((AbstractC135836Cl) obj);
            case 9:
                return new MailboxFeature((AbstractC135836Cl) obj);
            case 10:
                return new MailboxFeature((AbstractC135836Cl) obj);
            case 11:
                return new MailboxFeature((AbstractC135836Cl) obj);
            case IgReactQEModule.CONFIG_KEY_OFFSET /* 12 */:
                C137766Ly c137766Ly3 = C137766Ly.A0L;
                return C42221xC.A07(new C43645JSd(obj, 1), AbstractC137146It.A00("load_pending_thread_count"));
            case JITProfilePQR.HEADER_COMPRESSED_SIZE_OFFSET /* 13 */:
                return new MailboxFeature((AbstractC135836Cl) obj);
            case 14:
                return new MailboxFeature((AbstractC135836Cl) obj);
            case Process.SIGTERM /* 15 */:
                AbstractC1345065z abstractC1345065z = K3Z.A00;
                return new MailboxFeature(new C137266Jf((Mailbox) obj));
            case 16:
                InterfaceC132965zL interfaceC132965zL = (InterfaceC132965zL) obj;
                if (interfaceC132965zL instanceof C48496Lcn) {
                    return new C48496Lcn(AbstractC132975zM.A00(interfaceC132965zL));
                }
                return new C132955zK(AbstractC132975zM.A01(interfaceC132965zL));
            case 17:
                boolean z = false;
                if (((MailboxNullable) obj).value != null) {
                    z = true;
                }
                return Boolean.valueOf(z);
            case 18:
                return C42221xC.A07(new C43645JSd(obj, 5), AbstractC137146It.A00("load_cutover_thread_list"));
            case Process.SIGSTOP /* 19 */:
                return C42221xC.A07(new C43645JSd(obj, 6), AbstractC137146It.A00("mailbox_insert_rtc_e2ee_admin_messages"));
            case 20:
                return C42221xC.A07(new C43645JSd(obj, 4), AbstractC137146It.A00("mailbox_insert_rtc_e2ee_call_xma_messages"));
            case 21:
                Object[] objArr = (Object[]) obj;
                C14360o3.A0B(objArr, 0);
                ArrayList arrayList = new ArrayList(objArr.length);
                for (Object obj2 : objArr) {
                    C14360o3.A0C(obj2, "null cannot be cast to non-null type com.instagram.direct.model.messaginguser.MessagingUser");
                    Long l = ((MessagingUser) obj2).A02;
                    if (l != null) {
                        arrayList.add(l);
                    } else {
                        throw new IllegalStateException("create_secure_thread: RecipientUser has no EIMU.");
                    }
                }
                return arrayList;
            case 22:
                AbstractC1345065z abstractC1345065z2 = K3a.A00;
                return new MailboxFeature(new C137266Jf((Mailbox) obj));
            case 23:
                AbstractC1345065z abstractC1345065z3 = C1345666g.A00;
                return new MailboxFeature(new C137266Jf((Mailbox) obj));
            case 25:
                return new C43997Jck(obj);
            case 26:
                return ((C43618JRb) obj).A00;
            case 27:
                return obj;
            case 28:
                return C42221xC.A08(((C43617JRa) obj).A01);
            case CameraRollManager.IMAGES_MEDIA_LATITUDE_LONGITUDE_DEPRECATED_API_LEVEL /* 29 */:
                return ((C43617JRa) obj).A00;
            case 30:
                obj.toString();
                return obj;
            case 31:
                String sandboxDomain = NetworkUtils.getSandboxDomain();
                if (sandboxDomain == null) {
                    return "";
                }
                return sandboxDomain;
        }
    }
}
