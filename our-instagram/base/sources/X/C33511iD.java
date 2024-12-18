package X;

import com.instagram.common.session.UserSession;
import com.instagram.debug.devoptions.metadata.view.ThreadMetadataOverrideFragment;
import com.instagram.direct.request.DirectThreadApi;
import com.instagram.model.direct.DirectThreadKey;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import kotlin.enums.EnumEntries;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.1iD, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C33511iD implements InterfaceC29301b7 {
    public static final C0KV A02 = C33521iE.A00;
    public final UserSession A00;
    public final C2DS A01;

    @Override // X.InterfaceC29301b7
    public final /* bridge */ /* synthetic */ void ENr(C19260xA c19260xA, InterfaceC37261GbE interfaceC37261GbE, C1OW c1ow) {
        C1ON A00;
        C33491iB c33491iB = (C33491iB) c1ow;
        C14360o3.A0B(c33491iB, 0);
        C14360o3.A0B(interfaceC37261GbE, 2);
        if (c33491iB.C7R().size() == 1) {
            Object obj = c33491iB.C7R().get(0);
            C14360o3.A07(obj);
            DirectThreadKey directThreadKey = (DirectThreadKey) obj;
            C16030qx c16030qx = C16030qx.A02;
            UserSession userSession = this.A00;
            String A05 = c16030qx.A05(userSession.deviceSession.A06());
            if (directThreadKey.A00 == null) {
                String valueOf = String.valueOf(C0HN.A00());
                List list = directThreadKey.A02;
                if (list == null) {
                    list = C16930sl.A00;
                }
                A00 = DirectThreadApi.A0C(userSession, valueOf, null, list);
                A00.A00 = new C32521ETx(interfaceC37261GbE, this, c33491iB, directThreadKey, A05);
            } else {
                C1GJ.A03(A01(this, c33491iB, directThreadKey, A05));
                A00 = A00(interfaceC37261GbE, this, c33491iB, directThreadKey);
            }
            C1GJ.A03(A00);
            return;
        }
        throw new IllegalArgumentException("Failed requirement.");
    }

    public static final C1ON A00(InterfaceC37261GbE interfaceC37261GbE, C33511iD c33511iD, C33491iB c33491iB, DirectThreadKey directThreadKey) {
        Integer num;
        String str;
        UserSession userSession = c33511iD.A00;
        List list = directThreadKey.A02;
        if (list != null) {
            num = Integer.valueOf(list.size());
        } else {
            num = null;
        }
        String A01 = AbstractC35089Fd0.A01(c33491iB.A07().A01(userSession));
        Integer num2 = C05F.A03;
        if (num != null) {
            str = num.toString();
        } else {
            str = null;
        }
        AbstractC35088Fcz.A01(userSession, num2, "direct_send_collection_share_message_mutation_processor", str, A01);
        String str2 = c33491iB.A07().A0F;
        C14360o3.A07(str2);
        String A06 = c33491iB.A06();
        String str3 = c33491iB.A05;
        JTa jTa = ((C1OW) c33491iB).A02;
        String str4 = jTa.A04;
        L1W l1w = jTa.A00;
        boolean z = jTa.A09;
        boolean z2 = jTa.A07;
        boolean z3 = jTa.A0A;
        C25621Ms c25621Ms = new C25621Ms(userSession);
        c25621Ms.A05();
        EnumEntries enumEntries = C2EY.A0D;
        c25621Ms.A0B("direct_v2/threads/broadcast/generic_share/");
        c25621Ms.A0S(C32207EDg.class, C34793FUv.class);
        AbstractC47995LLh.A0D(c25621Ms, l1w, directThreadKey, A06, str3, str4, z, z2, z3);
        c25621Ms.A9s(ThreadMetadataOverrideFragment.BUNDLE_THREAD_ID, directThreadKey.A00);
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("fbid", str2);
        } catch (JSONException unused) {
            C0w9.A03("DirectMessageApi", "Error accessing collection id for post");
        }
        LLX.A06(c25621Ms, AbstractC47211Ktk.A0K, jSONObject);
        C1ON A0N = c25621Ms.A0N();
        A0N.A00 = new C32226EDz(new ETD(c33511iD, c33491iB, directThreadKey), userSession, interfaceC37261GbE);
        return A0N;
    }

    public static final C1ON A01(C33511iD c33511iD, C33491iB c33491iB, DirectThreadKey directThreadKey, String str) {
        Collection collection;
        UserSession userSession = c33511iD.A00;
        String str2 = userSession.userId;
        String str3 = c33491iB.A07().A0F;
        C14360o3.A07(str3);
        String str4 = directThreadKey.A00;
        if (str4 != null) {
            collection = Collections.singletonList(str4);
            C14360o3.A07(collection);
        } else {
            collection = C16930sl.A00;
        }
        C14360o3.A0B(str2, 2);
        C25621Ms c25621Ms = new C25621Ms(userSession, -2);
        c25621Ms.A05();
        c25621Ms.A0B("collections/share/");
        c25621Ms.A9s("_uuid", str);
        c25621Ms.A9s("_uid", str2);
        c25621Ms.A9s("collection_id", str3);
        c25621Ms.A9s("threads_to_share", new JSONArray(collection).toString());
        c25621Ms.A0R(EB2.class, FV0.class);
        c25621Ms.A0R = true;
        C1ON A0N = c25621Ms.A0N();
        A0N.A00 = new C32516ETs(c33511iD, c33491iB, directThreadKey);
        return A0N;
    }

    @Override // X.InterfaceC29301b7
    public final /* bridge */ /* synthetic */ boolean CfR(C1OW c1ow, MNP mnp) {
        AbstractC29011ae abstractC29011ae = (AbstractC29011ae) c1ow;
        C14360o3.A0B(abstractC29011ae, 0);
        C14360o3.A0B(mnp, 1);
        return LCX.A01(mnp, abstractC29011ae, this.A01);
    }

    public C33511iD(UserSession userSession) {
        this.A00 = userSession;
        this.A01 = AbstractC28761aE.A00(userSession);
    }
}
