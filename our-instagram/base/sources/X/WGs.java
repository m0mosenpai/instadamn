package X;

import android.content.Context;
import com.facebook.common.stringformat.StringFormatUtil;
import com.google.common.collect.ImmutableList;
import com.instagram.api.schemas.AdGeoLocationType;
import com.instagram.api.schemas.AdvantageAudienceData;
import com.instagram.api.schemas.AudienceValidationAction;
import com.instagram.api.schemas.AudienceValidationResponse;
import com.instagram.api.schemas.AudienceValidationResponseStatus;
import com.instagram.api.schemas.BoostedPostAudienceOption;
import com.instagram.api.schemas.TargetingRelaxationConstants;
import com.instagram.api.schemas.XFBTargetingAutomationAdvantageAudienceStatus;
import com.instagram.api.schemas.XIGIGBoostDestination;
import com.instagram.business.promote.model.AudienceGender;
import com.instagram.business.promote.model.AudienceGeoLocation;
import com.instagram.business.promote.model.AudienceInterest;
import com.instagram.business.promote.model.AudiencePotentialReachRating;
import com.instagram.business.promote.model.PromoteAudience;
import com.instagram.business.promote.model.PromoteAudienceInfo;
import com.instagram.business.promote.model.PromoteAudiencePotentialReach;
import com.instagram.business.promote.model.PromoteData;
import com.instagram.business.promote.model.SpecialRequirementCategory;
import com.instagram.common.session.UserSession;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;

/* loaded from: classes11.dex */
public abstract class WGs {
    public static final ImmutableList A02(PromoteAudienceInfo promoteAudienceInfo) {
        C14360o3.A0B(promoteAudienceInfo, 0);
        List list = promoteAudienceInfo.A08;
        if (list != null && !list.isEmpty()) {
            ImmutableList.Builder builder = ImmutableList.builder();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                builder.add((Object) ((AudienceInterest) it.next()).A00());
            }
            return builder.build();
        }
        return null;
    }

    public static final String A09(Context context, PromoteAudience promoteAudience) {
        List list = promoteAudience.A0A;
        if (list != null && !list.isEmpty()) {
            Object obj = list.get(0);
            if (list.size() > 1) {
                int size = list.size();
                for (int i = 1; i < size; i++) {
                    Object obj2 = list.get(i);
                    int i2 = 2131970761;
                    if (i < list.size() - 1) {
                        i2 = 2131970760;
                    }
                    obj = AbstractC31174DnI.A0t(context, obj, obj2, i2);
                }
            }
            return AbstractC167007dF.A0f(context, obj, 2131970373);
        }
        return null;
    }

    public static final String A0A(Context context, PromoteAudience promoteAudience) {
        List list = promoteAudience.A09;
        if (list != null && !list.isEmpty()) {
            String str = (String) AbstractC001800i.A0O(list, 0);
            if (list.size() > 1) {
                int size = list.size();
                for (int i = 1; i < size; i++) {
                    Object obj = list.get(i);
                    int i2 = 2131970761;
                    if (i < list.size() - 1) {
                        i2 = 2131970760;
                    }
                    str = AbstractC31174DnI.A0t(context, str, obj, i2);
                }
                return str;
            }
            return str;
        }
        return null;
    }

    public static final String A0D(Context context, List list) {
        String str;
        C14360o3.A0B(list, 1);
        if (!list.isEmpty()) {
            str = ((AudienceInterest) list.get(0)).A01();
        } else {
            str = "";
        }
        if (list.size() > 1) {
            int size = list.size();
            for (int i = 1; i < size; i++) {
                String A01 = ((AudienceInterest) list.get(i)).A01();
                int i2 = 2131970761;
                if (i < list.size() - 1) {
                    i2 = 2131970760;
                }
                str = AbstractC31174DnI.A0t(context, str, A01, i2);
            }
        }
        return str;
    }

    public static final String A0E(Context context, List list) {
        C14360o3.A0B(list, 1);
        if (!list.isEmpty()) {
            String str = ((AudienceGeoLocation) list.get(0)).A05;
            if (str != null) {
                if (list.size() > 1) {
                    int size = list.size();
                    for (int i = 1; i < size; i++) {
                        String str2 = ((AudienceGeoLocation) list.get(i)).A05;
                        if (str2 != null) {
                            int i2 = 2131970759;
                            if (i < list.size() - 1) {
                                i2 = 2131970760;
                            }
                            str = AbstractC31174DnI.A0t(context, str, str2, i2);
                        } else {
                            throw new IllegalStateException("Required value was null.");
                        }
                    }
                }
                return str;
            }
            throw new IllegalStateException("Required value was null.");
        }
        throw new IllegalStateException("Geolocations should never be null");
    }

    public static final String A0F(Context context, List list, int i, int i2) {
        int i3;
        if (list.size() > 1) {
            i3 = 2131970492;
        } else {
            i3 = 2131970494;
            if (list.get(0) == AudienceGender.A04) {
                i3 = 2131970495;
            }
        }
        String string = context.getString(2131970491, AbstractC58320PtC.A1a(AbstractC166997dE.A0p(context, i3), i, i2));
        C14360o3.A07(string);
        return string;
    }

    public static final ArrayList A0J(AdGeoLocationType adGeoLocationType, List list) {
        ArrayList A12 = AbstractC166997dE.A12(list, 0);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            AudienceGeoLocation audienceGeoLocation = (AudienceGeoLocation) it.next();
            String str = audienceGeoLocation.A06;
            AdGeoLocationType adGeoLocationType2 = audienceGeoLocation.A03;
            if (adGeoLocationType2 != null && str != null && VRX.A00(adGeoLocationType2) == adGeoLocationType) {
                A12.add(str);
            }
        }
        if (A12.isEmpty()) {
            return null;
        }
        return A12;
    }

    public static final ArrayList A0K(XIGIGBoostDestination xIGIGBoostDestination, UserSession userSession, boolean z) {
        ArrayList A12 = AbstractC166997dE.A12(userSession, 0);
        if (WGQ.A02(xIGIGBoostDestination, userSession, z) && z) {
            A12.add("FACEBOOK");
        }
        return A12;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0016, code lost:
    
        if (X.WG1.A06(r5) == false) goto L12;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final boolean A0N(com.instagram.api.schemas.XIGIGBoostDestination r3, com.instagram.business.promote.model.PromoteAudience r4, com.instagram.common.session.UserSession r5, boolean r6, boolean r7) {
        /*
            r0 = 0
            r2 = 0
            if (r7 == 0) goto L5
            return r0
        L5:
            com.instagram.api.schemas.AdvantageAudienceData r0 = r4.A02
            if (r0 == 0) goto L27
            com.instagram.api.schemas.XFBTargetingAutomationAdvantageAudienceStatus r1 = r0.AaJ()
        Ld:
            com.instagram.api.schemas.XFBTargetingAutomationAdvantageAudienceStatus r0 = com.instagram.api.schemas.XFBTargetingAutomationAdvantageAudienceStatus.A05
            if (r1 != r0) goto L18
            boolean r0 = X.WG1.A06(r5)
            r1 = 1
            if (r0 != 0) goto L19
        L18:
            r1 = 0
        L19:
            com.instagram.api.schemas.XIGIGBoostDestination r0 = com.instagram.api.schemas.XIGIGBoostDestination.A0G
            if (r3 != r0) goto L1f
            if (r6 != 0) goto L25
        L1f:
            com.instagram.api.schemas.XIGIGBoostDestination r0 = com.instagram.api.schemas.XIGIGBoostDestination.A04
            if (r3 == r0) goto L25
            if (r1 == 0) goto L26
        L25:
            r2 = 1
        L26:
            return r2
        L27:
            r1 = 0
            goto Ld
        */
        throw new UnsupportedOperationException("Method not decompiled: X.WGs.A0N(com.instagram.api.schemas.XIGIGBoostDestination, com.instagram.business.promote.model.PromoteAudience, com.instagram.common.session.UserSession, boolean, boolean):boolean");
    }

    public static final boolean A0O(PromoteAudience promoteAudience) {
        C14360o3.A0B(promoteAudience, 0);
        if (A0P(promoteAudience)) {
            return false;
        }
        Iterator it = promoteAudience.A0B.iterator();
        while (it.hasNext()) {
            if (C14360o3.A0K(((AudienceValidationResponse) it.next()).A02, "is_disabled_for_epd_targeting")) {
                return true;
            }
        }
        return false;
    }

    public static final boolean A0P(PromoteAudience promoteAudience) {
        return promoteAudience != null && BoostedPostAudienceOption.A0K == promoteAudience.A03;
    }

    public static final boolean A0Q(PromoteAudience promoteAudience, PromoteData promoteData) {
        boolean z = false;
        if (promoteAudience.A04 != TargetingRelaxationConstants.A04) {
            return false;
        }
        C14360o3.A06(promoteData.A0y);
        XIGIGBoostDestination xIGIGBoostDestination = promoteData.A0i;
        boolean z2 = promoteData.A2W;
        if (promoteData.A0C() || promoteData.A21.contains(SpecialRequirementCategory.A08)) {
            z = true;
        }
        return !A0N(xIGIGBoostDestination, promoteAudience, r4, z2, z);
    }

    public static final int A00(XIGIGBoostDestination xIGIGBoostDestination, int i) {
        if (xIGIGBoostDestination == XIGIGBoostDestination.A04 || xIGIGBoostDestination == XIGIGBoostDestination.A0G || xIGIGBoostDestination == XIGIGBoostDestination.A07) {
            return Math.max(i, 18);
        }
        return i;
    }

    public static final ImmutableList A01(PromoteAudienceInfo promoteAudienceInfo) {
        List list = promoteAudienceInfo.A06;
        if (list != null && !list.isEmpty()) {
            ImmutableList.Builder builder = ImmutableList.builder();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                builder.add((Object) ((AudienceGender) it.next()).A00);
            }
            return builder.build();
        }
        return null;
    }

    public static final AudienceValidationResponse A03(PromoteAudience promoteAudience) {
        if (promoteAudience != null) {
            for (AudienceValidationResponse audienceValidationResponse : promoteAudience.A0B) {
                if (!C14360o3.A0K(audienceValidationResponse.A02, "is_disabled_for_epd_targeting")) {
                    return audienceValidationResponse;
                }
            }
            return null;
        }
        return null;
    }

    public static final String A04(int i) {
        StringBuilder sb;
        char c;
        NumberFormat numberFormat = NumberFormat.getInstance(Locale.US);
        C14360o3.A0C(numberFormat, AbstractC58317Pt9.A00(321));
        DecimalFormat decimalFormat = (DecimalFormat) numberFormat;
        decimalFormat.applyPattern("#0.0");
        if (i >= 1000000000) {
            sb = new StringBuilder();
            sb.append(decimalFormat.format(i / 1.0E9f));
            c = 'B';
        } else if (i >= 1000000) {
            sb = new StringBuilder();
            sb.append(decimalFormat.format(i / 1000000.0f));
            c = 'M';
        } else if (i >= 10000) {
            sb = new StringBuilder();
            sb.append(decimalFormat.format(i / 1000.0f));
            c = 'K';
        } else {
            String formatStrLocaleSafe = StringFormatUtil.formatStrLocaleSafe("%,d", Integer.valueOf(i));
            C14360o3.A07(formatStrLocaleSafe);
            return formatStrLocaleSafe;
        }
        sb.append(c);
        return sb.toString();
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x0050, code lost:
    
        if (r1 != false) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0016, code lost:
    
        if (r3 == com.instagram.api.schemas.XIGIGBoostDestination.A08) goto L8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.String A05(android.content.Context r4, X.VG4 r5, com.instagram.business.promote.model.PromoteAudience r6, com.instagram.business.promote.model.PromoteData r7) {
        /*
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            boolean r0 = A0Q(r6, r7)
            com.instagram.api.schemas.XIGIGBoostDestination r3 = r7.A0i
            if (r0 == 0) goto L23
            com.instagram.api.schemas.XIGIGBoostDestination r0 = com.instagram.api.schemas.XIGIGBoostDestination.A0G
            if (r3 == r0) goto L18
            com.instagram.api.schemas.XIGIGBoostDestination r1 = com.instagram.api.schemas.XIGIGBoostDestination.A08
            r0 = 2131970392(0x7f134958, float:1.9577734E38)
            if (r3 != r1) goto L1b
        L18:
            r0 = 2131970393(0x7f134959, float:1.9577736E38)
        L1b:
            X.AbstractC31172DnG.A1D(r4, r2, r0)
        L1e:
            java.lang.String r0 = X.AbstractC166987dD.A19(r2)
            return r0
        L23:
            com.instagram.api.schemas.XIGIGBoostDestination r0 = com.instagram.api.schemas.XIGIGBoostDestination.A04
            if (r3 != r0) goto L2b
            r0 = 2131970390(0x7f134956, float:1.957773E38)
            goto L1b
        L2b:
            com.instagram.api.schemas.XIGIGBoostDestination r0 = com.instagram.api.schemas.XIGIGBoostDestination.A0G
            if (r3 == r0) goto L3b
            com.instagram.api.schemas.XIGIGBoostDestination r0 = com.instagram.api.schemas.XIGIGBoostDestination.A08
            if (r3 == r0) goto L3b
            com.instagram.api.schemas.XIGIGBoostDestination r0 = com.instagram.api.schemas.XIGIGBoostDestination.A07
            if (r3 != r0) goto L1e
            r0 = 2131970395(0x7f13495b, float:1.957774E38)
            goto L1b
        L3b:
            int r1 = r6.A01
            r0 = 18
            if (r1 >= r0) goto L47
            r0 = 2131970396(0x7f13495c, float:1.9577742E38)
            X.AbstractC31172DnG.A1D(r4, r2, r0)
        L47:
            java.util.List r0 = r6.A0A
            if (r0 == 0) goto L52
            boolean r1 = r0.isEmpty()
            r0 = 0
            if (r1 == 0) goto L53
        L52:
            r0 = 1
        L53:
            r0 = r0 ^ 1
            java.lang.String r3 = "\n"
            if (r0 == 0) goto L71
            boolean r0 = X.AbstractC68462VRs.A00(r7)
            if (r0 != 0) goto L71
            int r0 = r2.length()
            if (r0 == 0) goto L6b
            r2.append(r3)
            r2.append(r3)
        L6b:
            r0 = 2131970394(0x7f13495a, float:1.9577738E38)
            X.AbstractC31172DnG.A1D(r4, r2, r0)
        L71:
            com.instagram.api.schemas.XIGIGBoostDestination r1 = r7.A0i
            com.instagram.api.schemas.XIGIGBoostDestination r0 = com.instagram.api.schemas.XIGIGBoostDestination.A08
            if (r1 != r0) goto L1e
            boolean r0 = A0O(r6)
            if (r0 == 0) goto L1e
            int r0 = r2.length()
            if (r0 == 0) goto L89
            r2.append(r3)
            r2.append(r3)
        L89:
            r0 = 2131970391(0x7f134957, float:1.9577732E38)
            X.AbstractC31172DnG.A1D(r4, r2, r0)
            com.instagram.common.session.UserSession r0 = r7.A0y
            X.WUb r1 = X.C70399WUb.A00(r0)
            java.lang.String r0 = "ctx_epd_targeting_error"
            r1.A0I(r5, r0)
            goto L1e
        */
        throw new UnsupportedOperationException("Method not decompiled: X.WGs.A05(android.content.Context, X.VG4, com.instagram.business.promote.model.PromoteAudience, com.instagram.business.promote.model.PromoteData):java.lang.String");
    }

    public static final String A06(Context context, PromoteAudience promoteAudience) {
        XFBTargetingAutomationAdvantageAudienceStatus xFBTargetingAutomationAdvantageAudienceStatus;
        AdvantageAudienceData advantageAudienceData;
        AdvantageAudienceData advantageAudienceData2;
        Integer BTn;
        AdvantageAudienceData advantageAudienceData3 = promoteAudience.A02;
        if (advantageAudienceData3 != null) {
            xFBTargetingAutomationAdvantageAudienceStatus = advantageAudienceData3.AaJ();
        } else {
            xFBTargetingAutomationAdvantageAudienceStatus = null;
        }
        if (xFBTargetingAutomationAdvantageAudienceStatus == XFBTargetingAutomationAdvantageAudienceStatus.A04 || (advantageAudienceData = promoteAudience.A02) == null || advantageAudienceData.BTn() == null || (advantageAudienceData2 = promoteAudience.A02) == null || (BTn = advantageAudienceData2.BTn()) == null) {
            return null;
        }
        return AbstractC167007dF.A0f(context, BTn.toString(), 2131970354);
    }

    public static final String A07(Context context, PromoteAudience promoteAudience) {
        int i = promoteAudience.A01;
        int i2 = promoteAudience.A00;
        if (i != 0 && i2 != 0) {
            if (i == i2) {
                return String.valueOf(i2);
            }
            if (i2 >= 65) {
                StringBuilder sb = new StringBuilder();
                sb.append(i);
                sb.append('+');
                return sb.toString();
            }
            return context.getString(2131970360, AbstractC25228BEl.A1Z(Integer.valueOf(i), i2));
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0033, code lost:
    
        if (r2.contains(com.instagram.api.schemas.AdsTargetingGender.A05) == false) goto L8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.String A08(android.content.Context r3, com.instagram.business.promote.model.PromoteAudience r4) {
        /*
            java.util.List r2 = r4.A08
            boolean r0 = r2.isEmpty()
            if (r0 != 0) goto L18
            com.instagram.api.schemas.AdsTargetingGender r1 = com.instagram.api.schemas.AdsTargetingGender.A06
            boolean r0 = r2.contains(r1)
            if (r0 == 0) goto L20
            com.instagram.api.schemas.AdsTargetingGender r0 = com.instagram.api.schemas.AdsTargetingGender.A05
            boolean r0 = r2.contains(r0)
            if (r0 == 0) goto L20
        L18:
            r1 = 2131970361(0x7f134939, float:1.957767E38)
        L1b:
            java.lang.String r0 = X.AbstractC166997dE.A0p(r3, r1)
            return r0
        L20:
            boolean r0 = r2.contains(r1)
            if (r0 == 0) goto L2a
            r1 = 2131970370(0x7f134942, float:1.957769E38)
            goto L1b
        L2a:
            com.instagram.api.schemas.AdsTargetingGender r0 = com.instagram.api.schemas.AdsTargetingGender.A05
            boolean r0 = r2.contains(r0)
            r1 = 2131970369(0x7f134941, float:1.9577687E38)
            if (r0 != 0) goto L1b
            goto L18
        */
        throw new UnsupportedOperationException("Method not decompiled: X.WGs.A08(android.content.Context, com.instagram.business.promote.model.PromoteAudience):java.lang.String");
    }

    public static final String A0B(Context context, PromoteAudience promoteAudience, PromoteData promoteData) {
        XFBTargetingAutomationAdvantageAudienceStatus xFBTargetingAutomationAdvantageAudienceStatus;
        XFBTargetingAutomationAdvantageAudienceStatus AaJ;
        ArrayList arrayList = new ArrayList();
        String A08 = A08(context, promoteAudience);
        String A07 = A07(context, promoteAudience);
        String A0A = A0A(context, promoteAudience);
        String A09 = A09(context, promoteAudience);
        String A0C = A0C(context, promoteAudience, promoteData);
        String A06 = A06(context, promoteAudience);
        AdvantageAudienceData advantageAudienceData = promoteAudience.A02;
        String str = null;
        if (advantageAudienceData != null && (AaJ = advantageAudienceData.AaJ()) != null && AaJ.ordinal() == 2) {
            str = AbstractC167007dF.A0f(context, context.getString(2131968953), 2131970355);
        }
        AdvantageAudienceData advantageAudienceData2 = promoteAudience.A02;
        if (advantageAudienceData2 != null) {
            xFBTargetingAutomationAdvantageAudienceStatus = advantageAudienceData2.AaJ();
        } else {
            xFBTargetingAutomationAdvantageAudienceStatus = null;
        }
        if (xFBTargetingAutomationAdvantageAudienceStatus == XFBTargetingAutomationAdvantageAudienceStatus.A05) {
            arrayList = new ArrayList();
            if (str != null && str.length() != 0) {
                arrayList.add(str);
            }
            if (A0A != null && A0A.length() != 0) {
                arrayList.add(A0A);
            }
            if (A06 != null && A06.length() != 0) {
                arrayList.add(A06);
            }
            String str2 = "";
            if (A07 == null) {
                A07 = "";
            }
            if (A09 == null) {
                A09 = "";
            }
            if (A09.length() > 0) {
                str2 = AnonymousClass001.A0R(", ", A09);
            }
            String string = context.getString(2131970356, A08, A07, str2);
            C14360o3.A07(string);
            arrayList.add(string);
        } else {
            if (A07 != null && A07.length() != 0) {
                String A0t = AbstractC31174DnI.A0t(context, A08, A07, 2131970367);
                C14360o3.A07(A0t);
                arrayList.add(A0t);
            } else {
                arrayList.add(A08);
            }
            if (A0A != null && A0A.length() != 0) {
                arrayList.add(A0A);
            }
            if (A09 != null && A09.length() != 0) {
                arrayList.add(A09);
            }
            if (A0C != null && A0C.length() != 0) {
                arrayList.add(A0C);
            }
        }
        return A0I(arrayList);
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0039, code lost:
    
        if (r9.A21.contains(com.instagram.business.promote.model.SpecialRequirementCategory.A08) != false) goto L12;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.String A0C(android.content.Context r7, com.instagram.business.promote.model.PromoteAudience r8, com.instagram.business.promote.model.PromoteData r9) {
        /*
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            com.instagram.api.schemas.TargetingRelaxationConstants r1 = r8.A04
            com.instagram.api.schemas.TargetingRelaxationConstants r0 = com.instagram.api.schemas.TargetingRelaxationConstants.A04
            java.lang.String r6 = ": "
            if (r1 != r0) goto L21
            r0 = 2131970504(0x7f1349c8, float:1.957796E38)
            X.AbstractC31172DnG.A1D(r7, r5, r0)
            r5.append(r6)
            r0 = 2131968953(0x7f1343b9, float:1.9574815E38)
        L19:
            X.AbstractC31172DnG.A1D(r7, r5, r0)
        L1c:
            java.lang.String r0 = r5.toString()
            return r0
        L21:
            com.instagram.common.session.UserSession r4 = r9.A0y
            X.C14360o3.A06(r4)
            com.instagram.api.schemas.XIGIGBoostDestination r3 = r9.A0i
            boolean r2 = r9.A2W
            boolean r0 = r9.A0C()
            if (r0 != 0) goto L3b
            java.util.List r1 = r9.A21
            com.instagram.business.promote.model.SpecialRequirementCategory r0 = com.instagram.business.promote.model.SpecialRequirementCategory.A08
            boolean r1 = r1.contains(r0)
            r0 = 0
            if (r1 == 0) goto L3c
        L3b:
            r0 = 1
        L3c:
            boolean r0 = A0N(r3, r8, r4, r2, r0)
            if (r0 == 0) goto L1c
            r0 = 2131970504(0x7f1349c8, float:1.957796E38)
            X.AbstractC31172DnG.A1D(r7, r5, r0)
            r5.append(r6)
            r0 = 2131968927(0x7f13439f, float:1.9574762E38)
            goto L19
        */
        throw new UnsupportedOperationException("Method not decompiled: X.WGs.A0C(android.content.Context, com.instagram.business.promote.model.PromoteAudience, com.instagram.business.promote.model.PromoteData):java.lang.String");
    }

    public static final String A0G(AudienceValidationResponse audienceValidationResponse) {
        AudienceValidationAction audienceValidationAction;
        List list = audienceValidationResponse.A04;
        if (list != null && (audienceValidationAction = (AudienceValidationAction) AbstractC001800i.A0J(list)) != null) {
            return audienceValidationAction.getCtaText();
        }
        return null;
    }

    public static final String A0H(AudienceValidationResponse audienceValidationResponse) {
        AudienceValidationAction audienceValidationAction;
        List list = audienceValidationResponse.A04;
        if (list != null && (audienceValidationAction = (AudienceValidationAction) AbstractC001800i.A0J(list)) != null) {
            return audienceValidationAction.getUrl();
        }
        return null;
    }

    public static final String A0I(List list) {
        StringBuilder sb = new StringBuilder();
        int size = list.size();
        for (int i = 0; i < size; i++) {
            sb.append((String) list.get(i));
            if (i != list.size() - 1) {
                sb.append("\n");
            }
        }
        return AbstractC166987dD.A19(sb);
    }

    public static final boolean A0L(AudienceValidationResponse audienceValidationResponse) {
        String str;
        if (audienceValidationResponse != null) {
            str = audienceValidationResponse.A02;
        } else {
            str = null;
        }
        if (C14360o3.A0K(str, "is_disabled_for_epd_targeting") || audienceValidationResponse == null || audienceValidationResponse.A00 != AudienceValidationResponseStatus.A04) {
            return false;
        }
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0022, code lost:
    
        if (X.WG1.A06(r7) == false) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x002e, code lost:
    
        if (r2 != r6.A03) goto L24;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final boolean A0M(com.instagram.api.schemas.XIGIGBoostDestination r5, X.UQJ r6, com.instagram.common.session.UserSession r7, boolean r8, boolean r9, boolean r10) {
        /*
            com.instagram.api.schemas.XIGIGBoostDestination r0 = com.instagram.api.schemas.XIGIGBoostDestination.A0G
            if (r5 != r0) goto L6
            if (r8 != 0) goto Lc
        L6:
            com.instagram.api.schemas.XIGIGBoostDestination r0 = com.instagram.api.schemas.XIGIGBoostDestination.A04
            if (r5 != r0) goto L44
            if (r9 != 0) goto L44
        Lc:
            r5 = 1
        Ld:
            r1 = 0
            if (r6 == 0) goto L18
            com.instagram.api.schemas.AdvantageAudienceData r0 = r6.A02
            if (r0 == 0) goto L18
            com.instagram.api.schemas.XFBTargetingAutomationAdvantageAudienceStatus r1 = r0.AaJ()
        L18:
            com.instagram.api.schemas.XFBTargetingAutomationAdvantageAudienceStatus r0 = com.instagram.api.schemas.XFBTargetingAutomationAdvantageAudienceStatus.A05
            r4 = 1
            if (r1 != r0) goto L24
            boolean r0 = X.WG1.A06(r7)
            r3 = 1
            if (r0 != 0) goto L25
        L24:
            r3 = 0
        L25:
            if (r10 == 0) goto L41
            com.instagram.api.schemas.TargetingRelaxationConstants r2 = com.instagram.api.schemas.TargetingRelaxationConstants.A04
            if (r6 == 0) goto L30
            com.instagram.api.schemas.TargetingRelaxationConstants r0 = r6.A03
            r1 = 1
            if (r2 == r0) goto L31
        L30:
            r1 = 0
        L31:
            boolean r0 = X.WG1.A06(r7)
            if (r0 == 0) goto L3c
            if (r1 == 0) goto L46
        L39:
            if (r3 != 0) goto L46
        L3b:
            return r4
        L3c:
            if (r5 != 0) goto L3b
            if (r1 == 0) goto L46
            return r4
        L41:
            if (r5 == 0) goto L46
            goto L39
        L44:
            r5 = 0
            goto Ld
        L46:
            r4 = 0
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: X.WGs.A0M(com.instagram.api.schemas.XIGIGBoostDestination, X.UQJ, com.instagram.common.session.UserSession, boolean, boolean, boolean):boolean");
    }

    public static final boolean A0R(PromoteAudiencePotentialReach promoteAudiencePotentialReach) {
        AudiencePotentialReachRating audiencePotentialReachRating;
        if ((promoteAudiencePotentialReach.A00 != 0 || (promoteAudiencePotentialReach.A01 != 0 && promoteAudiencePotentialReach.A02 != 0)) && (audiencePotentialReachRating = promoteAudiencePotentialReach.A03) != null && audiencePotentialReachRating != AudiencePotentialReachRating.A06) {
            return true;
        }
        return false;
    }

    public static final boolean A0S(PromoteData promoteData, String str) {
        boolean A1a = AbstractC167017dG.A1a(promoteData, str);
        PromoteAudience promoteAudience = (PromoteAudience) promoteData.A22.get(str);
        if (promoteAudience == null) {
            return A1a;
        }
        if (!A0Q(promoteAudience, promoteData)) {
            XIGIGBoostDestination xIGIGBoostDestination = promoteData.A0i;
            if (xIGIGBoostDestination != XIGIGBoostDestination.A04 && xIGIGBoostDestination != XIGIGBoostDestination.A07) {
                if (xIGIGBoostDestination == XIGIGBoostDestination.A0G) {
                    if (!A0P(promoteAudience)) {
                        if (promoteAudience.A01 < 18) {
                            return false;
                        }
                        List list = promoteAudience.A0A;
                        if (list != null && !list.isEmpty() && !AbstractC68462VRs.A00(promoteData)) {
                            return false;
                        }
                    }
                    return true;
                }
                if (xIGIGBoostDestination != XIGIGBoostDestination.A08) {
                    return true;
                }
                if (!A0P(promoteAudience)) {
                    if (promoteAudience.A01 >= 18) {
                        List list2 = promoteAudience.A0A;
                        if (list2 != null && !list2.isEmpty() && !AbstractC68462VRs.A00(promoteData)) {
                            return false;
                        }
                    } else {
                        return false;
                    }
                }
                if (!A0O(promoteAudience)) {
                    return true;
                }
                return false;
            }
            if (A0P(promoteAudience) || promoteAudience.A01 >= 18) {
                return true;
            }
            return false;
        }
        return false;
    }
}
