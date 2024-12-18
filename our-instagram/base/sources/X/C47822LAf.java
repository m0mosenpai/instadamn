package X;

import com.instagram.api.schemas.ContentAppreciationDisclaimerType;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.LAf, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C47822LAf {
    /* JADX WARN: Type inference failed for: r1v0, types: [X.K85, X.1um, X.1ul] */
    public static K85 parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            ?? c40791um = new C40791um();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                if ("balance".equals(A0s)) {
                    c40791um.A04 = AbstractC166997dE.A0h(c16l);
                } else if ("can_send_message".equals(A0s)) {
                    c40791um.A02 = AbstractC166997dE.A0d(c16l);
                } else {
                    ArrayList arrayList = null;
                    String str = null;
                    ArrayList arrayList2 = null;
                    if ("disclaimer_type".equals(A0s)) {
                        if (c16l.A11() != C16R.A0G) {
                            str = c16l.A1P();
                        }
                        ContentAppreciationDisclaimerType contentAppreciationDisclaimerType = (ContentAppreciationDisclaimerType) ContentAppreciationDisclaimerType.A01.get(str);
                        if (contentAppreciationDisclaimerType == null) {
                            contentAppreciationDisclaimerType = ContentAppreciationDisclaimerType.A08;
                        }
                        c40791um.A00 = contentAppreciationDisclaimerType;
                    } else if ("fan_offers_info".equals(A0s)) {
                        if (c16l.A11() == C16R.A0C) {
                            arrayList2 = AbstractC166987dD.A1E();
                            while (c16l.A1J() != C16R.A08) {
                                C50627MWo parseFromJson = AbstractC33678EuS.parseFromJson(c16l);
                                if (parseFromJson != null) {
                                    arrayList2.add(parseFromJson);
                                }
                            }
                        }
                        c40791um.A06 = arrayList2;
                    } else if ("gifts".equals(A0s)) {
                        if (c16l.A11() == C16R.A0C) {
                            arrayList = AbstractC166987dD.A1E();
                            while (c16l.A1J() != C16R.A08) {
                                C45055Jwk parseFromJson2 = AbstractC46587KjQ.parseFromJson(c16l);
                                if (parseFromJson2 != null) {
                                    arrayList.add(parseFromJson2);
                                }
                            }
                        }
                        c40791um.A07 = arrayList;
                    } else if ("has_purchased_stars".equals(A0s)) {
                        c40791um.A03 = AbstractC166997dE.A0d(c16l);
                    } else if ("selected_gift_id".equals(A0s)) {
                        c40791um.A05 = AbstractC31173DnH.A0h(c16l);
                    } else {
                        C55702hA.A01(c16l, c40791um, A0s);
                    }
                }
                c16l.A0z();
            }
            Integer num = c40791um.A04;
            C14360o3.A0A(num);
            int intValue = num.intValue();
            boolean A1b = AbstractC31172DnG.A1b(c40791um.A02);
            ContentAppreciationDisclaimerType contentAppreciationDisclaimerType2 = c40791um.A00;
            C14360o3.A0A(contentAppreciationDisclaimerType2);
            List list = c40791um.A06;
            List list2 = c40791um.A07;
            C14360o3.A0A(list2);
            boolean A1b2 = AbstractC31172DnG.A1b(c40791um.A03);
            Long l = c40791um.A05;
            C14360o3.A0A(l);
            c40791um.A01 = new C45053Jwi(contentAppreciationDisclaimerType2, list, list2, intValue, l.longValue(), A1b, A1b2);
            return c40791um;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}
