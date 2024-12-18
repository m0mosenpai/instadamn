package X;

import com.instagram.common.session.UserSession;
import com.instagram.direct.send.mutation.armadilloexpresstransport.ArmadilloExpressNoteReplySender;
import com.instagram.model.direct.DirectThreadKey;
import org.json.JSONException;
import org.json.JSONObject;
import org.webrtc.CameraVideoCapturer;

/* renamed from: X.1ij, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C33831ij implements InterfaceC29301b7 {
    public static final C0KV A03 = C33841ik.A00;
    public final UserSession A00;
    public final C2DS A01;
    public final InterfaceC09390do A02 = AbstractC09440dt.A01(new MHR(this, 25));

    @Override // X.InterfaceC29301b7
    public final /* bridge */ /* synthetic */ boolean CfR(C1OW c1ow, MNP mnp) {
        AbstractC29011ae abstractC29011ae = (AbstractC29011ae) c1ow;
        C14360o3.A0B(abstractC29011ae, 0);
        C14360o3.A0B(mnp, 1);
        return LCX.A01(mnp, abstractC29011ae, this.A01);
    }

    @Override // X.InterfaceC29301b7
    public final /* bridge */ /* synthetic */ void ENr(C19260xA c19260xA, InterfaceC37261GbE interfaceC37261GbE, C1OW c1ow) {
        C33811ih c33811ih = (C33811ih) c1ow;
        C14360o3.A0B(c33811ih, 0);
        C14360o3.A0B(c19260xA, 1);
        C14360o3.A0B(interfaceC37261GbE, 2);
        Object obj = c33811ih.C7R().get(0);
        C14360o3.A07(obj);
        DirectThreadKey directThreadKey = (DirectThreadKey) obj;
        UserSession userSession = this.A00;
        if (AbstractC159387Cy.A07(userSession, c33811ih, directThreadKey)) {
            ArmadilloExpressNoteReplySender armadilloExpressNoteReplySender = (ArmadilloExpressNoteReplySender) this.A02.getValue();
            C19L c19l = armadilloExpressNoteReplySender.A02;
            AbstractC23641Du.A05(AnonymousClass191.A00, new MCL(c33811ih, interfaceC37261GbE, armadilloExpressNoteReplySender, null, 12), c19l);
            C162337Ov.A0U(c19260xA);
            return;
        }
        C44996Jvm A00 = AbstractC46912Kot.A00(((C1OW) c33811ih).A02);
        Long valueOf = Long.valueOf(c33811ih.A07().A00);
        String str = c33811ih.A07().A05;
        if (str != null) {
            boolean z = c33811ih.A07().A06;
            boolean z2 = c33811ih.A07().A07;
            String str2 = c33811ih.A01;
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("note_igid", String.valueOf(valueOf));
                jSONObject.put("sticker_id", str);
                jSONObject.put("is_random", z);
                jSONObject.put("is_sticker", z2);
                jSONObject.put("message_item_type", "animated_media");
                if (str2 != null) {
                    jSONObject.put("audio_cluster_id", str2);
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

    public C33831ij(UserSession userSession) {
        this.A00 = userSession;
        this.A01 = AbstractC28761aE.A00(userSession);
    }
}
