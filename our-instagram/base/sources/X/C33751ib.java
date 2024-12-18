package X;

import com.instagram.common.session.UserSession;
import com.instagram.direct.send.mutation.armadilloexpresstransport.ArmadilloExpressNoteReplySender;
import com.instagram.model.direct.DirectThreadKey;
import com.instagram.pendingmedia.store.PendingMediaStore;
import com.instagram.pendingmedia.store.PendingMediaStoreSerializer;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;
import org.webrtc.CameraVideoCapturer;

/* renamed from: X.1ib, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C33751ib implements InterfaceC29301b7, InterfaceC31091eE {
    public static final C0KV A03 = C33761ic.A00;
    public final UserSession A00;
    public final C2DS A01;
    public final InterfaceC09390do A02 = AbstractC09440dt.A01(new MHR(this, 28));

    @Override // X.InterfaceC31091eE
    public final /* bridge */ /* synthetic */ void AJE(InterfaceC37261GbE interfaceC37261GbE, C1OW c1ow, C47Z c47z) {
        C33731iZ c33731iZ = (C33731iZ) c1ow;
        C14360o3.A0B(c33731iZ, 0);
        C14360o3.A0B(c47z, 1);
        C14360o3.A0B(interfaceC37261GbE, 2);
        List C7R = c33731iZ.C7R();
        C14360o3.A07(C7R);
        DirectThreadKey directThreadKey = (DirectThreadKey) AbstractC001800i.A0I(C7R);
        UserSession userSession = this.A00;
        C14360o3.A0A(directThreadKey);
        if (AbstractC159387Cy.A07(userSession, c33731iZ, directThreadKey)) {
            ArmadilloExpressNoteReplySender armadilloExpressNoteReplySender = (ArmadilloExpressNoteReplySender) this.A02.getValue();
            C19L c19l = armadilloExpressNoteReplySender.A02;
            AbstractC23641Du.A05(AnonymousClass191.A00, new C50119MBt(c33731iZ, interfaceC37261GbE, armadilloExpressNoteReplySender, null, 25), c19l);
            return;
        }
        Long l = c47z.A2I;
        if (l != null) {
            long longValue = l.longValue();
            C44996Jvm A00 = AbstractC46912Kot.A00(((C1OW) c33731iZ).A02);
            Long valueOf = Long.valueOf(c33731iZ.A07().A00);
            Long valueOf2 = Long.valueOf(longValue);
            String str = c33731iZ.A02;
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("note_igid", String.valueOf(valueOf));
                jSONObject.put("attachment_idx", String.valueOf(valueOf2));
                jSONObject.put("message_item_type", "media");
                if (str != null) {
                    jSONObject.put("audio_cluster_id", str);
                }
            } catch (JSONException unused) {
                C0w9.A03("DirectMessageApi", "Error forming json for note reply");
            }
            C25621Ms A002 = LLX.A00(userSession, AbstractC47211Ktk.A03, A00, directThreadKey, jSONObject);
            A002.A0D("share_type", CameraVideoCapturer.CameraStatistics.CAMERA_OBSERVER_PERIOD_MS);
            A002.A0S(C40781ul.class, C55702hA.class);
            C1ON A0N = A002.A0N();
            A0N.A00 = AbstractC46987Kq6.A00(userSession, interfaceC37261GbE);
            C1GJ.A03(A0N);
            return;
        }
        throw new IllegalStateException("Required value was null.");
    }

    @Override // X.InterfaceC29301b7
    public final /* bridge */ /* synthetic */ void ENr(C19260xA c19260xA, InterfaceC37261GbE interfaceC37261GbE, C1OW c1ow) {
        C33731iZ c33731iZ = (C33731iZ) c1ow;
        C14360o3.A0B(c33731iZ, 0);
        C14360o3.A0B(c19260xA, 1);
        C14360o3.A0B(interfaceC37261GbE, 2);
        UserSession userSession = this.A00;
        PendingMediaStore A00 = C25A.A00(userSession);
        PendingMediaStoreSerializer A002 = AnonymousClass257.A00(userSession);
        String str = c33731iZ.BSj().A06;
        if (str != null) {
            List C7R = c33731iZ.C7R();
            C14360o3.A07(C7R);
            LHD.A00(c19260xA, userSession, interfaceC37261GbE, c33731iZ, this, (DirectThreadKey) AbstractC001800i.A0I(C7R), A00, A002, str);
            return;
        }
        throw new IllegalStateException("Required value was null.");
    }

    @Override // X.InterfaceC29301b7
    public final /* bridge */ /* synthetic */ boolean CfR(C1OW c1ow, MNP mnp) {
        AbstractC29011ae abstractC29011ae = (AbstractC29011ae) c1ow;
        C14360o3.A0B(abstractC29011ae, 0);
        C14360o3.A0B(mnp, 1);
        return LCX.A01(mnp, abstractC29011ae, this.A01);
    }

    public C33751ib(UserSession userSession) {
        this.A00 = userSession;
        this.A01 = AbstractC28761aE.A00(userSession);
    }
}
