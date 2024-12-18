package X;

import com.facebook.common.callercontext.CallerContext;
import com.facebook.proxygen.TraceFieldType;
import com.google.common.collect.ImmutableList;
import com.instagram.common.session.UserSession;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.enums.EnumEntries;

/* renamed from: X.8tE, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC200098tE {
    public static final C9BE A00(UserSession userSession) {
        C14360o3.A0B(userSession, 0);
        C46552Bt A00 = AbstractC46542Bs.A00(userSession);
        boolean A03 = C196068lw.A03(C196068lw.A00(userSession).A00(CallerContext.A01("CLNoticeManager")));
        boolean z = false;
        if (C08730cb.A00(userSession).A00().A0M() == C05F.A01) {
            z = true;
        }
        return new C9BE(0, z, A03, C196008lp.A00(userSession), C196218mC.A00(userSession), C200108tF.A06(userSession), A00.A0C(), C200088tD.A00(userSession));
    }

    public static final OMW A01(UserSession userSession, C201848wH c201848wH, C200028t6 c200028t6, String str) {
        EnumC53321Nhx enumC53321Nhx;
        EnumC53381NjW enumC53381NjW;
        C14360o3.A0B(str, 1);
        C14360o3.A0B(c200028t6, 3);
        EnumC46582Bw enumC46582Bw = EnumC46582Bw.A0Z;
        if (c201848wH.getOptionalEnumField(2, "variant", enumC46582Bw) == EnumC46582Bw.A0Q) {
            C0K8.A0C("CLNoticeManager", AnonymousClass001.A0R(str, ": No available notice variant"));
            c200028t6.A03((short) 2);
            return null;
        }
        EnumEntries enumEntries = EnumC53321Nhx.A01;
        Enum optionalEnumField = c201848wH.getOptionalEnumField(2, "variant", enumC46582Bw);
        EnumC53321Nhx[] values = EnumC53321Nhx.values();
        int length = values.length;
        int i = 0;
        while (true) {
            if (i < length) {
                enumC53321Nhx = values[i];
                if (enumC53321Nhx.A00 == optionalEnumField) {
                    break;
                }
                i++;
            } else {
                enumC53321Nhx = null;
                break;
            }
        }
        if (enumC53321Nhx == null) {
            StringBuilder sb = new StringBuilder();
            sb.append("Unsupported notice variant: ");
            sb.append(optionalEnumField);
            sb.append('.');
            C0K8.A0C("NoticeVariant", sb.toString());
            C0K8.A0C("CLNoticeManager", "Unexpected Failure: Unsupported notice variant on the client");
            Enum optionalEnumField2 = c201848wH.getOptionalEnumField(2, "variant", enumC46582Bw);
            StringBuilder sb2 = new StringBuilder();
            sb2.append("unmapped_variant:");
            sb2.append(optionalEnumField2);
            c200028t6.A01(TraceFieldType.FailureReason, sb2.toString());
            c200028t6.A03((short) 3);
            return null;
        }
        ImmutableList requiredCompactedEnumListField = c201848wH.getRequiredCompactedEnumListField(3, "client_rules", EnumC53322Nhz.UNSET_OR_UNRECOGNIZED_ENUM_VALUE);
        C14360o3.A07(requiredCompactedEnumListField);
        ArrayList arrayList = new ArrayList(AbstractC06950Ym.A1E(requiredCompactedEnumListField, 10));
        Iterator<E> it = requiredCompactedEnumListField.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            EnumC53381NjW enumC53381NjW2 = EnumC53381NjW.A0G;
            C14360o3.A0A(next);
            C14360o3.A0B(next, 0);
            EnumC53381NjW[] values2 = EnumC53381NjW.values();
            int length2 = values2.length;
            int i2 = 0;
            while (true) {
                if (i2 < length2) {
                    enumC53381NjW = values2[i2];
                    if (enumC53381NjW.A00 != next) {
                        i2++;
                    }
                } else {
                    enumC53381NjW = EnumC53381NjW.A0G;
                    break;
                }
            }
            arrayList.add(enumC53381NjW);
        }
        c201848wH.getOptionalStringField(4, "bloks_app_id");
        OMW A01 = enumC53321Nhx.A01(userSession, c201848wH.getOptionalStringField(4, "bloks_app_id"), arrayList);
        c200028t6.A01("notice_variant", A01.A03());
        c200028t6.A03((short) 2);
        return A01;
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x007d, code lost:
    
        r1 = new java.lang.StringBuilder();
        r1.append("Failed Eligibility Rule: ");
        r1.append(r6);
        X.C0K8.A0C("NoticeVariantConfig", r1.toString());
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0091, code lost:
    
        if (r18 == null) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0093, code lost:
    
        r1 = java.lang.String.valueOf(r6.A00);
        X.C14360o3.A0B(r1, 0);
        r0 = X.AnonymousClass001.A0R("failed_eligibility_rule:", r1);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final boolean A02(X.C82G r15, X.C206319Bo r16, com.instagram.common.session.UserSession r17, X.C200028t6 r18, X.OMW r19, java.lang.String r20) {
        /*
            r3 = 0
            r13 = 1
            r0 = 2
            X.C14360o3.A0B(r15, r0)
            java.util.List r0 = r19.A04()
            java.lang.String r5 = "NoticeVariantConfig"
            java.util.Iterator r12 = r0.iterator()
        L10:
            boolean r0 = r12.hasNext()
            java.lang.String r2 = "failure_reason"
            r4 = r18
            r1 = r17
            if (r0 == 0) goto La8
            java.lang.Object r6 = r12.next()
            X.NjW r6 = (X.EnumC53381NjW) r6
            r0 = r16
            boolean r11 = r6.A03(r0, r1)
            java.lang.String r10 = X.AbstractC201118ut.A00(r15)
            java.lang.String r9 = r19.A03()
            if (r11 != 0) goto La6
            java.lang.String r8 = r6.A02(r0, r1)
        L36:
            X.0wW r7 = X.AbstractC12220kQ.A02(r1)
            java.lang.String r1 = "cxp_notice_client_rule"
            X.0kM r0 = r7.A00
            X.0Ai r7 = r7.A00(r0, r1)
            boolean r0 = r7.isSampled()
            if (r0 == 0) goto L7b
            if (r10 == 0) goto L7b
            if (r9 == 0) goto L7b
            X.Nhz r1 = r6.A00
            if (r1 == 0) goto L7b
            java.lang.String r0 = "client_session_id"
            r14 = r20
            r7.AAP(r0, r14)
            java.lang.String r0 = "entrypoint"
            r7.AAP(r0, r10)
            java.lang.String r0 = "variant"
            r7.AAP(r0, r9)
            java.lang.String r1 = r1.toString()
            java.lang.String r0 = "rule"
            r7.AAP(r0, r1)
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r11)
            java.lang.String r0 = "rule_result"
            r7.A7v(r0, r1)
            java.lang.String r0 = "reason"
            r7.AAP(r0, r8)
            r7.Cht()
        L7b:
            if (r11 != 0) goto L10
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = "Failed Eligibility Rule: "
            r1.append(r0)
            r1.append(r6)
            java.lang.String r0 = r1.toString()
            X.C0K8.A0C(r5, r0)
            if (r18 == 0) goto La5
            X.Nhz r0 = r6.A00
            java.lang.String r1 = java.lang.String.valueOf(r0)
            X.C14360o3.A0B(r1, r3)
            java.lang.String r0 = "failed_eligibility_rule:"
            java.lang.String r0 = X.AnonymousClass001.A0R(r0, r1)
        La2:
            r4.A01(r2, r0)
        La5:
            return r3
        La6:
            r8 = 0
            goto L36
        La8:
            X.82H r0 = r19.A01()
            boolean r0 = X.C197838ou.A03(r15, r0, r1)
            if (r0 != 0) goto Lbc
            java.lang.String r0 = "Failed Eligibility: Shared Config Checks"
            X.C0K8.A0C(r5, r0)
            if (r18 == 0) goto La5
            java.lang.String r0 = "impression_cooldown"
            goto La2
        Lbc:
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC200098tE.A02(X.82G, X.9Bo, com.instagram.common.session.UserSession, X.8t6, X.OMW, java.lang.String):boolean");
    }
}
