package X;

import com.facebook.odin.model.FeatureData;
import com.facebook.odin.model.OdinContext;
import com.facebook.odin.model.Type;
import com.instagram.common.session.UserSession;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: X.Ooa, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C55708Ooa implements InterfaceC73623Ro {
    public final UserSession A00;
    public final C73633Rp A01;
    public static final Map A03 = AbstractC167017dG.A0u("last_story_session_end_timestamp", "3354", AbstractC166987dD.A1L("recent_time_on_story", "3341"), AbstractC166987dD.A1L("item_consumed_in_story_session", "3347"), AbstractC166987dD.A1L("ad_consumed_in_story_session", "3349"));
    public static final Map A04 = AbstractC25232BEp.A1F("last_story_session_end_timestamp", "3353", AbstractC166987dD.A1L("item_consumed_in_story_session", "3346"), AbstractC166987dD.A1L("ad_consumed_in_story_session", "3348"));
    public static final Map A02 = AbstractC167017dG.A0u(95, "3345", AbstractC166987dD.A1L(5, "3342"), AbstractC166987dD.A1L(20, "3343"), AbstractC166987dD.A1L(50, "3344"));

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v0, types: [java.util.AbstractCollection, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r5v2, types: [X.0sl] */
    @Override // X.InterfaceC73623Ro
    public final C3SN ATr(OdinContext odinContext) {
        Object A1E;
        C3SN E8E = ((C3SZ) this.A01.A01.getValue()).E8E(AbstractC16960so.A1Q("recent_time_on_story", "item_consumed_in_story_session", "ad_consumed_in_story_session", "last_story_session_end_timestamp"), 0);
        if (!E8E.A02) {
            C55078OaY.A00(null, AnonymousClass001.A0R("Fail to read all records for story prefetch source from signal store, error: ", E8E.A01));
            A1E = C16930sl.A00;
        } else {
            Map map = (Map) E8E.A00;
            A1E = AbstractC166987dD.A1E();
            Iterator A15 = AbstractC166997dE.A15(map);
            while (A15.hasNext()) {
                Map.Entry A1K = AbstractC166987dD.A1K(A15);
                String A17 = AbstractC31172DnG.A17(A1K);
                List A19 = MSW.A19(A1K);
                try {
                    if (C14360o3.A0K(A17, "last_story_session_end_timestamp")) {
                        ArrayList A1E2 = AbstractC166987dD.A1E();
                        long currentTimeMillis = System.currentTimeMillis();
                        Iterator it = A19.iterator();
                        while (it.hasNext()) {
                            long A07 = MSY.A07(it);
                            long j = currentTimeMillis - A07;
                            AbstractC166997dE.A1X(A1E2, j);
                            if (j <= 0) {
                                C55078OaY.A00(null, AnonymousClass001.A0Y("Wrong time since last story session value, currentTimestampMs is : ", ", sessionEndRecordMs: ", '}', currentTimeMillis, A07));
                            }
                        }
                        A19 = A1E2;
                    }
                    if (A19.isEmpty()) {
                        C55078OaY.A00(null, AnonymousClass001.A0R("Empty signal list for calculating feature, signal ID ", A17));
                    } else {
                        ArrayList A1E3 = AbstractC166987dD.A1E();
                        String str = (String) A03.get(A17);
                        if (str != null) {
                            C3R9[] c3r9Arr = FeatureData.A0E;
                            Type type = Type.A06;
                            Iterator it2 = A19.iterator();
                            long j2 = 0;
                            while (it2.hasNext()) {
                                j2 += MSY.A07(it2);
                            }
                            A1E3.add(new FeatureData(type, str, null, null, j2 / A19.size(), 16372, 0L));
                        }
                        String str2 = (String) A04.get(A17);
                        if (str2 != null) {
                            C3R9[] c3r9Arr2 = FeatureData.A0E;
                            A1E3.add(AbstractC50522MSa.A0O(Type.A09, str2, A19, A19.size()));
                        }
                        A1E.addAll(A1E3);
                        if (C14360o3.A0K(A17, "recent_time_on_story")) {
                            ArrayList A1E4 = AbstractC166987dD.A1E();
                            List A0Z = AbstractC001800i.A0Z(A19);
                            Iterator A152 = AbstractC166997dE.A15(A02);
                            while (A152.hasNext()) {
                                Map.Entry A1K2 = AbstractC166987dD.A1K(A152);
                                int A0H = AbstractC166987dD.A0H(A1K2.getKey());
                                String str3 = (String) A1K2.getValue();
                                int A0B = AbstractC50522MSa.A0B(A0Z, A0H);
                                C3R9[] c3r9Arr3 = FeatureData.A0E;
                                A1E4.add(AbstractC50522MSa.A0O(Type.A09, str3, A0Z, A0B));
                            }
                            A1E.addAll(A1E4);
                        }
                    }
                } catch (Exception e) {
                    C55078OaY.A00(null, AbstractC166997dE.A0y("Error while extracting features, error message ", e));
                }
            }
        }
        return MSZ.A0O(A1E);
    }

    @Override // X.InterfaceC73623Ro
    public final String getId() {
        return "StoryPrefetchV2";
    }

    public C55708Ooa(UserSession userSession, C73633Rp c73633Rp) {
        AbstractC167017dG.A1P(c73633Rp, userSession);
        this.A01 = c73633Rp;
        this.A00 = userSession;
    }
}
