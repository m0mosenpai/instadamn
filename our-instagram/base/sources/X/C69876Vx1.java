package X;

import com.instagram.api.schemas.Challenge;
import com.instagram.api.schemas.ChallengeDetails;
import com.instagram.api.schemas.GuidanceTipResponseImpl;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.Vx1, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C69876Vx1 {
    /* JADX WARN: Type inference failed for: r2v0, types: [X.UyW, X.1um, X.1ul] */
    public static C67797UyW parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            ?? c40791um = new C40791um();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                if ("challenge_id".equals(A0s)) {
                    c40791um.A04 = AbstractC31173DnH.A0h(c16l);
                } else if (MSV.A00(96).equals(A0s)) {
                    c40791um.A02 = AbstractC39952Hnh.parseFromJson(c16l);
                } else if ("started_challenge".equals(A0s)) {
                    c40791um.A00 = VO7.parseFromJson(c16l);
                } else if ("started_challenge_details".equals(A0s)) {
                    c40791um.A01 = VO6.parseFromJson(c16l);
                } else if ("unearned_challenges".equals(A0s)) {
                    ArrayList arrayList = null;
                    if (c16l.A11() == C16R.A0C) {
                        arrayList = new ArrayList();
                        while (c16l.A1J() != C16R.A08) {
                            Challenge parseFromJson = VO7.parseFromJson(c16l);
                            if (parseFromJson != null) {
                                arrayList.add(parseFromJson);
                            }
                        }
                    }
                    c40791um.A05 = arrayList;
                } else {
                    C55702hA.A01(c16l, c40791um, A0s);
                }
                c16l.A0z();
            }
            Long l = c40791um.A04;
            C14360o3.A0A(l);
            long longValue = l.longValue();
            GuidanceTipResponseImpl guidanceTipResponseImpl = c40791um.A02;
            Challenge challenge = c40791um.A00;
            C14360o3.A0A(challenge);
            ChallengeDetails challengeDetails = c40791um.A01;
            C14360o3.A0A(challengeDetails);
            List list = c40791um.A05;
            C14360o3.A0A(list);
            c40791um.A03 = new C25992Beg(challenge, challengeDetails, guidanceTipResponseImpl, list, longValue);
            return c40791um;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }
}
