package X;

import com.instagram.api.schemas.AudienceGroup;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.7kv, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C171657kv {
    /* JADX WARN: Type inference failed for: r1v1, types: [X.7ku, X.1um, X.1ul] */
    public static C171647ku parseFromJson(C16L c16l) {
        String A1P;
        C14360o3.A0B(c16l, 0);
        try {
            ?? c40791um = new C40791um();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                String A0q = c16l.A0q();
                c16l.A1J();
                if ("audience_enabled".equals(A0q)) {
                    c40791um.A04 = Boolean.valueOf(c16l.A0d());
                } else {
                    ArrayList arrayList = null;
                    if ("available_audience_groups".equals(A0q)) {
                        if (c16l.A11() == C16R.A0C) {
                            ArrayList arrayList2 = new ArrayList();
                            while (c16l.A1J() != C16R.A08) {
                                if (c16l.A11() == C16R.A0G) {
                                    A1P = null;
                                } else {
                                    A1P = c16l.A1P();
                                }
                                AudienceGroup audienceGroup = (AudienceGroup) AudienceGroup.A01.get(A1P);
                                if (audienceGroup == null) {
                                    audienceGroup = AudienceGroup.A0A;
                                }
                                arrayList2.add(audienceGroup);
                            }
                            arrayList = arrayList2;
                        }
                        c40791um.A08 = arrayList;
                    } else if ("fundraiser_enabled".equals(A0q)) {
                        c40791um.A05 = Boolean.valueOf(c16l.A0d());
                    } else if ("prompts".equals(A0q)) {
                        if (c16l.A11() == C16R.A0C) {
                            arrayList = new ArrayList();
                            while (c16l.A1J() != C16R.A08) {
                                C50679MYx parseFromJson = AbstractC225539xI.parseFromJson(c16l);
                                if (parseFromJson != null) {
                                    arrayList.add(parseFromJson);
                                }
                            }
                        }
                        c40791um.A09 = arrayList;
                    } else if ("scheduled_live_config".equals(A0q)) {
                        c40791um.A03 = AbstractC171807lB.parseFromJson(c16l);
                    } else if ("shopping_sheet_config".equals(A0q)) {
                        c40791um.A00 = AbstractC225519xG.parseFromJson(c16l);
                    } else if ("title_enabled".equals(A0q)) {
                        c40791um.A06 = Boolean.valueOf(c16l.A0d());
                    } else if ("user_pay_sheet_config".equals(A0q)) {
                        c40791um.A02 = AbstractC225529xH.parseFromJson(c16l);
                    } else if ("video_toggle_enabled".equals(A0q)) {
                        c40791um.A07 = Boolean.valueOf(c16l.A0d());
                    } else {
                        C55702hA.A01(c16l, c40791um, A0q);
                    }
                }
                c16l.A0z();
            }
            Boolean bool = c40791um.A04;
            C14360o3.A0A(bool);
            boolean booleanValue = bool.booleanValue();
            List list = c40791um.A08;
            C14360o3.A0A(list);
            Boolean bool2 = c40791um.A05;
            C14360o3.A0A(bool2);
            boolean booleanValue2 = bool2.booleanValue();
            List list2 = c40791um.A09;
            C171817lC c171817lC = c40791um.A03;
            C171867lH c171867lH = c40791um.A00;
            Boolean bool3 = c40791um.A06;
            C14360o3.A0A(bool3);
            boolean booleanValue3 = bool3.booleanValue();
            C171877lI c171877lI = c40791um.A02;
            Boolean bool4 = c40791um.A07;
            C14360o3.A0A(bool4);
            c40791um.A01 = new C171847lF(c171867lH, c171877lI, c171817lC, list, list2, booleanValue, booleanValue2, booleanValue3, bool4.booleanValue());
            return c40791um;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }
}
