package X;

import com.instagram.common.session.UserSession;
import com.instagram.debug.devoptions.metadata.view.ThreadMetadataOverrideFragment;
import com.instagram.model.direct.DirectThreadKey;
import java.util.Collection;
import java.util.List;
import kotlin.enums.EnumEntries;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.1jZ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C34351jZ implements InterfaceC29301b7 {
    public static final C0KV A02 = C34361ja.A00;
    public final UserSession A00;
    public final C2DS A01;

    @Override // X.InterfaceC29301b7
    public final /* bridge */ /* synthetic */ boolean CfR(C1OW c1ow, MNP mnp) {
        AbstractC29011ae abstractC29011ae = (AbstractC29011ae) c1ow;
        C14360o3.A0B(abstractC29011ae, 0);
        C14360o3.A0B(mnp, 1);
        return LCX.A01(mnp, abstractC29011ae, this.A01);
    }

    @Override // X.InterfaceC29301b7
    public final /* bridge */ /* synthetic */ void ENr(C19260xA c19260xA, InterfaceC37261GbE interfaceC37261GbE, C1OW c1ow) {
        C34331jX c34331jX = (C34331jX) c1ow;
        C14360o3.A0B(c34331jX, 0);
        C14360o3.A0B(interfaceC37261GbE, 2);
        List C7R = c34331jX.C7R();
        C14360o3.A07(C7R);
        JTa jTa = ((C1OW) c34331jX).A02;
        if (C7R.size() == 1) {
            UserSession userSession = this.A00;
            DirectThreadKey directThreadKey = (DirectThreadKey) C7R.get(0);
            List list = c34331jX.A00;
            if (list != null) {
                C44996Jvm A00 = AbstractC46912Kot.A00(jTa);
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("recommended_user_ids", new JSONArray((Collection) list));
                } catch (JSONException unused) {
                    C18950wb.A00.AEp("Error accessing Recs From Friends recommended user ids", 20134884).report();
                }
                C25621Ms A002 = LLX.A00(userSession, AbstractC47211Ktk.A00, A00, directThreadKey, jSONObject);
                A002.A05();
                EnumEntries enumEntries = C2EY.A0D;
                A002.A0B("direct_v2/threads/broadcast/generic_share/");
                A002.A9s(ThreadMetadataOverrideFragment.BUNDLE_THREAD_ID, directThreadKey.A00);
                A002.A0S(C40781ul.class, C55702hA.class);
                C1ON A0N = A002.A0N();
                A0N.A00 = new C32226EDz(new ESX(this, c34331jX), userSession, interfaceC37261GbE);
                C1GJ.A06(A0N, -5, 3, false, false);
                return;
            }
            C14360o3.A0F("recommendedUserIds");
            throw C00O.createAndThrow();
        }
        throw new IllegalArgumentException("Failed requirement.");
    }

    public C34351jZ(UserSession userSession) {
        this.A00 = userSession;
        this.A01 = AbstractC28761aE.A00(userSession);
    }
}
