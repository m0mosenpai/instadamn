package X;

import com.instagram.common.session.UserSession;
import com.instagram.direct.send.mutation.armadilloexpresstransport.ArmadilloExpressNoteReplySender;
import com.instagram.model.direct.DirectThreadKey;
import com.instagram.pendingmedia.store.PendingMediaStore;
import com.instagram.pendingmedia.store.PendingMediaStoreSerializer;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.1if, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C33791if implements InterfaceC29301b7, InterfaceC31091eE {
    public static final C0KV A03 = C33801ig.A00;
    public final UserSession A00;
    public final C2DS A01;
    public final InterfaceC09390do A02 = AbstractC09440dt.A01(new MHR(this, 26));

    @Override // X.InterfaceC29301b7
    public final /* bridge */ /* synthetic */ void ENr(C19260xA c19260xA, InterfaceC37261GbE interfaceC37261GbE, C1OW c1ow) {
        C33771id c33771id = (C33771id) c1ow;
        C14360o3.A0B(c33771id, 0);
        C14360o3.A0B(c19260xA, 1);
        C14360o3.A0B(interfaceC37261GbE, 2);
        UserSession userSession = this.A00;
        PendingMediaStore A00 = C25A.A00(userSession);
        PendingMediaStoreSerializer A002 = AnonymousClass257.A00(userSession);
        String str = c33771id.A00.A07;
        C14360o3.A07(str);
        LHD.A00(c19260xA, userSession, interfaceC37261GbE, c33771id, this, (DirectThreadKey) c33771id.C7R().get(0), A00, A002, str);
    }

    @Override // X.InterfaceC31091eE
    public final /* bridge */ /* synthetic */ void AJE(InterfaceC37261GbE interfaceC37261GbE, C1OW c1ow, C47Z c47z) {
        C33771id c33771id = (C33771id) c1ow;
        C14360o3.A0B(c33771id, 0);
        C14360o3.A0B(c47z, 1);
        C14360o3.A0B(interfaceC37261GbE, 2);
        List C7R = c33771id.C7R();
        C14360o3.A07(C7R);
        DirectThreadKey directThreadKey = (DirectThreadKey) AbstractC001800i.A0I(C7R);
        UserSession userSession = this.A00;
        C14360o3.A0A(directThreadKey);
        if (AbstractC159387Cy.A07(userSession, c33771id, directThreadKey)) {
            ArmadilloExpressNoteReplySender armadilloExpressNoteReplySender = (ArmadilloExpressNoteReplySender) this.A02.getValue();
            C19L c19l = armadilloExpressNoteReplySender.A02;
            AbstractC23641Du.A05(AnonymousClass191.A00, new C50119MBt(c33771id, interfaceC37261GbE, armadilloExpressNoteReplySender, null, 24), c19l);
            return;
        }
        String valueOf = String.valueOf(c47z.A2I);
        C44996Jvm A00 = AbstractC46912Kot.A00(((C1OW) c33771id).A02);
        String str = c33771id.A07().A03;
        String str2 = c33771id.A07().A07;
        String str3 = c33771id.A07().A04;
        String str4 = c33771id.A03;
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("note_igid", str);
            jSONObject.put("attachment_idx", valueOf);
            jSONObject.put("waveform_data", str2);
            jSONObject.put("sampling_frequency_hz", str3);
            jSONObject.put("message_item_type", "voice_media");
            if (str4 != null) {
                jSONObject.put("audio_cluster_id", str4);
            }
        } catch (JSONException unused) {
            C0w9.A03("DirectMessageApi", "Error forming json for note reply");
        }
        C25621Ms A002 = LLX.A00(userSession, AbstractC47211Ktk.A0M, A00, directThreadKey, jSONObject);
        A002.A0D("share_type", 135);
        A002.A0S(C40781ul.class, C55702hA.class);
        C1ON A0N = A002.A0N();
        A0N.A00 = AbstractC46987Kq6.A00(userSession, interfaceC37261GbE);
        C1GJ.A03(A0N);
    }

    @Override // X.InterfaceC29301b7
    public final /* bridge */ /* synthetic */ boolean CfR(C1OW c1ow, MNP mnp) {
        AbstractC29011ae abstractC29011ae = (AbstractC29011ae) c1ow;
        C14360o3.A0B(abstractC29011ae, 0);
        C14360o3.A0B(mnp, 1);
        return LCX.A01(mnp, abstractC29011ae, this.A01);
    }

    public C33791if(UserSession userSession) {
        this.A00 = userSession;
        this.A01 = AbstractC28761aE.A00(userSession);
    }
}
