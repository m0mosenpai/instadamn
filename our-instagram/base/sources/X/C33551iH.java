package X;

import com.instagram.common.session.UserSession;
import com.instagram.debug.devoptions.metadata.view.ThreadMetadataOverrideFragment;
import com.instagram.direct.request.DirectThreadApi;
import com.instagram.model.direct.DirectThreadKey;
import com.instagram.save.model.SavedCollection;
import java.util.List;
import kotlin.enums.EnumEntries;
import org.json.JSONException;
import org.json.JSONObject;
import org.webrtc.CameraVideoCapturer;

/* renamed from: X.1iH, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C33551iH implements InterfaceC29301b7 {
    public static final C0KV A02 = C33561iI.A00;
    public final UserSession A00;
    public final InterfaceC09390do A01 = AbstractC09440dt.A00(EnumC09460dv.A02, new MHR(this, 39));

    public static final C1ON A00(C33551iH c33551iH, C33531iF c33531iF, DirectThreadKey directThreadKey) {
        UserSession userSession = c33551iH.A00;
        SavedCollection savedCollection = c33531iF.A01;
        if (savedCollection != null) {
            String str = savedCollection.A0F;
            C14360o3.A07(str);
            String A06 = c33531iF.A06();
            String str2 = c33531iF.A05;
            JTa jTa = ((C1OW) c33531iF).A02;
            String str3 = jTa.A04;
            L1W l1w = jTa.A00;
            boolean z = jTa.A09;
            boolean z2 = jTa.A07;
            boolean z3 = jTa.A0A;
            C25621Ms c25621Ms = new C25621Ms(userSession);
            c25621Ms.A05();
            EnumEntries enumEntries = C2EY.A0D;
            c25621Ms.A0B("direct_v2/threads/broadcast/generic_share/");
            c25621Ms.A0S(C32207EDg.class, C34793FUv.class);
            AbstractC47995LLh.A0D(c25621Ms, l1w, directThreadKey, A06, str2, str3, z, z2, z3);
            c25621Ms.A9s(ThreadMetadataOverrideFragment.BUNDLE_THREAD_ID, directThreadKey.A00);
            KVU kvu = AbstractC47211Ktk.A00;
            c25621Ms.A0D("share_type", CameraVideoCapturer.CameraStatistics.CAMERA_OBSERVER_PERIOD_MS);
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("ig_media_collection_id", str);
            } catch (JSONException unused) {
                C0w9.A03("DirectMessageApi", "Error accessing collection id for post");
            }
            LLX.A06(c25621Ms, AbstractC47211Ktk.A0D, jSONObject);
            return c25621Ms.A0N();
        }
        C14360o3.A0F("collection");
        throw C00O.createAndThrow();
    }

    @Override // X.InterfaceC29301b7
    public final /* bridge */ /* synthetic */ boolean CfR(C1OW c1ow, MNP mnp) {
        AbstractC29011ae abstractC29011ae = (AbstractC29011ae) c1ow;
        C14360o3.A0B(abstractC29011ae, 0);
        C14360o3.A0B(mnp, 1);
        return LCX.A01(mnp, abstractC29011ae, (C2DS) this.A01.getValue());
    }

    @Override // X.InterfaceC29301b7
    public final /* bridge */ /* synthetic */ void ENr(C19260xA c19260xA, InterfaceC37261GbE interfaceC37261GbE, C1OW c1ow) {
        C1ON A00;
        C33531iF c33531iF = (C33531iF) c1ow;
        C14360o3.A0B(c33531iF, 0);
        C14360o3.A0B(interfaceC37261GbE, 2);
        if (c33531iF.C7R().size() == 1) {
            Object obj = c33531iF.C7R().get(0);
            C14360o3.A07(obj);
            DirectThreadKey directThreadKey = (DirectThreadKey) obj;
            if (directThreadKey.A00 == null) {
                C16030qx c16030qx = C16030qx.A02;
                UserSession userSession = this.A00;
                c16030qx.A05(userSession.deviceSession.A06());
                String valueOf = String.valueOf(C0HN.A00());
                List list = directThreadKey.A02;
                if (list == null) {
                    list = C16930sl.A00;
                }
                A00 = DirectThreadApi.A0C(userSession, valueOf, null, list);
                A00.A00 = new C32518ETu(interfaceC37261GbE, this, c33531iF, directThreadKey);
            } else {
                A00 = A00(this, c33531iF, directThreadKey);
            }
            C1GJ.A03(A00);
            return;
        }
        throw new IllegalArgumentException("Failed requirement.");
    }

    public C33551iH(UserSession userSession) {
        this.A00 = userSession;
    }
}
