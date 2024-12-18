package com.instagram.zero.cma;

import X.AbstractC001800i;
import X.AbstractC102584jr;
import X.AbstractC166987dD;
import X.AbstractC25225BEi;
import X.AbstractC31174DnI;
import X.AbstractC40691uc;
import X.AbstractC58317Pt9;
import X.C0K8;
import X.C14360o3;
import X.C16930sl;
import X.C1AT;
import X.C1AV;
import X.C1R0;
import X.C26691Qy;
import X.C26701Qz;
import X.C29892DGg;
import X.C2JS;
import X.C40701ud;
import X.C60461Qzn;
import X.C60462Qzo;
import X.C60463Qzp;
import X.C62723SNn;
import X.C90143zv;
import X.EnumC53125Ned;
import X.InterfaceC19630xq;
import X.MSX;
import X.OBL;
import com.google.common.collect.ImmutableList;
import com.instagram.common.session.UserSession;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes9.dex */
public final class CampaignAPITokenFetcher {
    public final InterfaceC19630xq A00;
    public final OBL A01;
    public final HashMap A02;
    public final UserSession A03;
    public final C40701ud A04;

    public CampaignAPITokenFetcher(UserSession userSession) {
        C14360o3.A0B(userSession, 1);
        this.A03 = userSession;
        this.A02 = AbstractC166987dD.A1G();
        this.A04 = AbstractC40691uc.A01(userSession);
        this.A00 = AbstractC31174DnI.A0g(C1AT.A01(userSession), C1AV.A3e, this);
        this.A01 = (OBL) userSession.A01(OBL.class, new C29892DGg(userSession, 23));
    }

    private final C1R0 A00(C60463Qzp c60463Qzp) {
        String valueOf = String.valueOf(c60463Qzp.A0C("token_hash"));
        String A07 = c60463Qzp.A07(AbstractC58317Pt9.A00(710));
        List A0a = AbstractC001800i.A0a(MSX.A0D(c60463Qzp, C60462Qzo.class, "rewrite_rules", 6, -1774761223));
        ArrayList A1E = AbstractC166987dD.A1E();
        Iterator it = A0a.iterator();
        while (it.hasNext()) {
            C2JS A0l = AbstractC25225BEi.A0l(it);
            try {
                A1E.add(new C26691Qy(String.valueOf(A0l.A07("matcher")), String.valueOf(A0l.A08("replacer"))));
            } catch (C90143zv e) {
                C0K8.A0G("Zero_CampaignAPITokenFetcher", "Invalid rewrite rule", e);
            }
        }
        ArrayList A0U = AbstractC001800i.A0U(A1E);
        C16930sl c16930sl = C16930sl.A00;
        ImmutableList requiredCompactedStringListField = c60463Qzp.getRequiredCompactedStringListField(3, "features");
        C14360o3.A07(requiredCompactedStringListField);
        Set A0k = AbstractC001800i.A0k(requiredCompactedStringListField);
        int A00 = c60463Qzp.A00("ttl");
        long currentTimeMillis = System.currentTimeMillis();
        int coercedIntField = c60463Qzp.getCoercedIntField(1, "carrier_id");
        ImmutableList requiredCompactedStringListField2 = c60463Qzp.getRequiredCompactedStringListField(7, "enabled_wallet_defs_keys");
        C14360o3.A07(requiredCompactedStringListField2);
        Set A0k2 = AbstractC001800i.A0k(requiredCompactedStringListField2);
        int coercedIntField2 = c60463Qzp.getCoercedIntField(8, "zero_cms_fetch_interval_seconds");
        List A0a2 = AbstractC001800i.A0a(MSX.A0D(c60463Qzp, C60461Qzn.class, "carrier_signal_config", 9, 567577443));
        ArrayList A1E2 = AbstractC166987dD.A1E();
        Iterator it2 = A0a2.iterator();
        while (it2.hasNext()) {
            C2JS A0l2 = AbstractC25225BEi.A0l(it2);
            A1E2.add(new C62723SNn(String.valueOf(A0l2.A08("key")), String.valueOf(A0l2.A07("url")), A0l2.A00("cooldown")));
        }
        return new C1R0(new C26701Qz(A1E2), valueOf, A07, null, null, c60463Qzp.getOptionalStringField(10, "eligibility_hash"), A0U, c16930sl, A0k, A0k2, A00, coercedIntField, coercedIntField2, currentTimeMillis);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0174  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0186  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x018f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object A01(com.instagram.zero.cma.CampaignAPITokenFetcher r23, X.InterfaceC23621Ds r24) {
        /*
            Method dump skipped, instructions count: 711
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.zero.cma.CampaignAPITokenFetcher.A01(com.instagram.zero.cma.CampaignAPITokenFetcher, X.1Ds):java.lang.Object");
    }

    public final C1R0 A02(EnumC53125Ned enumC53125Ned) {
        HashMap hashMap = this.A02;
        C1R0 c1r0 = (C1R0) hashMap.get(enumC53125Ned);
        if (c1r0 == null) {
            String string = this.A00.getString(enumC53125Ned.toString(), null);
            synchronized (this) {
                if (string != null) {
                    try {
                        c1r0 = AbstractC102584jr.A00(new JSONObject(string));
                        hashMap.put(enumC53125Ned, c1r0);
                    } catch (JSONException e) {
                        C0K8.A0F("Zero_CampaignAPITokenFetcher", "Token parsing failure", e);
                    }
                }
                c1r0 = null;
            }
        }
        return c1r0;
    }
}
