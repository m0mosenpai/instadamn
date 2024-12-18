package X;

import android.util.Base64;
import android.util.JsonWriter;
import com.instagram.debug.devoptions.metadata.view.ThreadMetadataOverrideFragment;
import java.io.IOException;
import java.io.StringWriter;
import java.util.LinkedHashMap;

/* loaded from: classes8.dex */
public final class MMK extends C0YY implements InterfaceC16600sD {
    public final /* synthetic */ long A00;
    public final /* synthetic */ C6CC A01;
    public final /* synthetic */ String A02;
    public final /* synthetic */ String A03;
    public final /* synthetic */ String A04;
    public final /* synthetic */ String A05;
    public final /* synthetic */ InterfaceC16660sJ A06;
    public final /* synthetic */ boolean A07;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MMK(C6CC c6cc, String str, String str2, String str3, String str4, InterfaceC16660sJ interfaceC16660sJ, long j, boolean z) {
        super(4);
        this.A01 = c6cc;
        this.A05 = str;
        this.A04 = str2;
        this.A02 = str3;
        this.A00 = j;
        this.A03 = str4;
        this.A07 = z;
        this.A06 = interfaceC16660sJ;
    }

    @Override // X.InterfaceC16600sD
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        byte[] bArr = (byte[]) obj;
        byte[] bArr2 = (byte[]) obj2;
        String str = (String) obj3;
        long A0N = AbstractC166987dD.A0N(obj4);
        boolean A1R = AbstractC167007dF.A1R(0, bArr, bArr2);
        C14360o3.A0B(str, 2);
        C6CC c6cc = this.A01;
        String str2 = this.A05;
        String str3 = this.A04;
        String str4 = this.A02;
        long j = this.A00;
        String str5 = this.A03;
        boolean z = this.A07;
        C6CD c6cd = C6CC.A03;
        LinkedHashMap A1I = AbstractC166987dD.A1I();
        A1I.put("backup_id", str);
        A1I.put("attachment_index_key", C6CC.A00(C6CC.A01(AbstractC43592JPx.A13(str, str4)), "attachment_key_scope", bArr));
        A1I.put("backup_ent_fbid", AbstractC25227BEk.A0o());
        A1I.put("delivery_object_id", str4);
        A1I.put(AbstractC70143W6w.A01(0, 9, 101), Long.valueOf(A0N));
        A1I.put("mailbox_partial_id", C6CC.A00(str, "mailbox_id_scope", bArr));
        A1I.put("media_type", str5);
        A1I.put("product_type", "igd");
        A1I.put("salt_partial_id", C6CC.A00(str3, "attachment_token_salt_scope", bArr));
        String str6 = "";
        A1I.put("sort_key", "");
        A1I.put("salt_partial_access_token", C6CC.A00(C6CC.A01(AbstractC43592JPx.A13(str3, str4)), "attachment_token_salt_scope", bArr));
        A1I.put("salt_partial_attachment_index_key", C6CC.A00(C6CC.A01(AbstractC43592JPx.A13(str, str4)), "attachment_key_salt_scope", bArr));
        A1I.put("raw_identifiers", AbstractC25232BEp.A1F("timestamp", Long.valueOf(j), AbstractC166987dD.A1L("otid", str3), AbstractC166987dD.A1L("server_thread_key", str2)));
        A1I.put(ThreadMetadataOverrideFragment.BUNDLE_THREAD_ID, str2);
        A1I.put("message_partial_id", C6CC.A00(str3, "message_id_scope", bArr));
        A1I.put("thread_partial_id", C6CC.A00(str2, "thread_id_scope", bArr));
        A1I.put("raw_tokens", AbstractC25233BEq.A0p("mailbox_root_key", Base64.encodeToString(bArr2, 2), AbstractC166987dD.A1L("ocmf_client_state_blob", Base64.encodeToString(bArr, 2))));
        A1I.put("isOpenEB", Boolean.valueOf(z));
        try {
            StringWriter stringWriter = new StringWriter();
            JsonWriter jsonWriter = new JsonWriter(stringWriter);
            jsonWriter.beginObject();
            C6CC.A02(jsonWriter, c6cc, A1I);
            jsonWriter.endObject();
            jsonWriter.close();
            str6 = stringWriter.toString();
        } catch (IOException e) {
            C0K8.A0F("IgMailboxEncryptedBackups", AbstractC111324zv.A00(3617), e);
        }
        C25621Ms A0c = AbstractC167017dG.A0c(c6cc.A02);
        A0c.A0B("direct_v2/restoration_cdn_url/");
        A0c.A9s("payload", str6);
        C1ON A0e = AbstractC25227BEk.A0e(A0c, K8I.class, LCN.class);
        A0e.A00 = new C45545KEk(str2, str3, str4, str5, this.A06, j, z);
        C1GJ.A06(A0e, 494878689, 3, A1R, A1R);
        return C0eB.A00;
    }
}
