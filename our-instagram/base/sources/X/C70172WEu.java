package X;

import android.content.Context;
import android.telephony.PhoneNumberUtils;
import android.text.SpannableStringBuilder;
import com.instagram.api.schemas.XIGIGBoostCallToAction;
import com.instagram.api.schemas.XIGIGBoostDestination;
import com.instagram.business.promote.model.PromoteData;
import com.instagram.common.session.UserSession;
import com.instagram.react.modules.base.IgReactQEModule;
import com.instagram.user.model.User;
import java.util.regex.Matcher;

/* renamed from: X.WEu, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C70172WEu {
    public final String A03(Context context, XIGIGBoostCallToAction xIGIGBoostCallToAction, PromoteData promoteData, C66359UCf c66359UCf, String str) {
        C14360o3.A0B(c66359UCf, 4);
        if (xIGIGBoostCallToAction == null) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        if (str != null) {
            sb.append(A02(str));
        }
        sb.append("\n");
        W6g.A02(context, xIGIGBoostCallToAction, sb, 2131970633);
        if (c66359UCf.isChecked() && WGQ.A04(promoteData)) {
            int i = 2131968953;
            if (promoteData.A1x.isEmpty()) {
                i = 2131968927;
            }
            String string = context.getString(i);
            C14360o3.A0A(string);
            sb.append("\n");
            AbstractC31172DnG.A1D(context, sb, 2131970637);
            sb.append(": ");
            sb.append(string);
        }
        return sb.toString();
    }

    public final String A04(Context context, XIGIGBoostCallToAction xIGIGBoostCallToAction, PromoteData promoteData, C66359UCf c66359UCf, String str) {
        C14360o3.A0B(c66359UCf, 4);
        if (str != null && xIGIGBoostCallToAction != null) {
            StringBuilder sb = new StringBuilder(A02(str));
            sb.append("\n");
            W6g.A02(context, xIGIGBoostCallToAction, sb, 2131970633);
            if (c66359UCf.isChecked() && WGQ.A04(promoteData)) {
                int i = 2131968953;
                if (promoteData.A1x.isEmpty()) {
                    i = 2131968927;
                }
                String string = context.getString(i);
                C14360o3.A0A(string);
                sb.append("\n");
                AbstractC31172DnG.A1D(context, sb, 2131970637);
                sb.append(": ");
                sb.append(string);
            }
            return sb.toString();
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0061  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String A06(android.content.Context r8, com.instagram.business.promote.model.PromoteData r9, java.lang.String r10, java.lang.String r11, java.util.List r12, java.util.Set r13, boolean r14) {
        /*
            r7 = this;
            r0 = 2
            X.C14360o3.A0B(r10, r0)
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>(r10)
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            java.util.Iterator r6 = r12.iterator()
        L12:
            boolean r0 = r6.hasNext()
            r3 = 1
            r4 = 0
            if (r0 == 0) goto L31
            java.lang.Object r3 = r6.next()
            r1 = r3
            com.instagram.api.schemas.InstagramProfileCallToActionDestinations r1 = (com.instagram.api.schemas.InstagramProfileCallToActionDestinations) r1
            boolean r0 = X.WGQ.A08(r9, r4)
            if (r0 != 0) goto L2d
            boolean r0 = X.WGQ.A00(r1, r9)
            if (r0 == 0) goto L12
        L2d:
            r5.add(r3)
            goto L12
        L31:
            boolean r0 = r5.isEmpty()
            if (r0 != 0) goto L69
            if (r14 == 0) goto L6e
            int r0 = r5.size()
            if (r0 != r3) goto L6e
            java.lang.Object r1 = r5.get(r4)
            com.instagram.api.schemas.InstagramProfileCallToActionDestinations r0 = com.instagram.api.schemas.InstagramProfileCallToActionDestinations.A0A
            if (r1 != r0) goto L6e
            boolean r1 = r13.contains(r0)
            if (r11 == 0) goto L69
            r0 = 2131970629(0x7f134a45, float:1.9578214E38)
            if (r1 == 0) goto L55
            r0 = 2131970628(0x7f134a44, float:1.9578212E38)
        L55:
            java.lang.String r1 = X.AbstractC166997dE.A0p(r8, r0)
            r0 = 32
            java.lang.String r1 = X.AnonymousClass001.A0T(r1, r11, r0)
        L5f:
            if (r1 == 0) goto L69
            java.lang.String r0 = "\n"
            r2.append(r0)
            r2.append(r1)
        L69:
            java.lang.String r0 = X.AbstractC166987dD.A19(r2)
            return r0
        L6e:
            r0 = 2131970601(0x7f134a29, float:1.9578158E38)
            java.lang.String r1 = X.AbstractC166997dE.A0p(r8, r0)
            boolean r0 = r13.isEmpty()
            if (r0 == 0) goto L89
            r0 = 2131968927(0x7f13439f, float:1.9574762E38)
        L7e:
            java.lang.String r11 = r8.getString(r0)
        L82:
            java.lang.String r0 = " | "
            java.lang.String r1 = X.AnonymousClass001.A0g(r1, r0, r11)
            goto L5f
        L89:
            int r0 = r13.size()
            if (r0 != r3) goto L98
            com.instagram.api.schemas.InstagramProfileCallToActionDestinations r0 = com.instagram.api.schemas.InstagramProfileCallToActionDestinations.A0A
            boolean r0 = r13.contains(r0)
            if (r0 == 0) goto L98
            goto L82
        L98:
            r0 = 2131968953(0x7f1343b9, float:1.9574815E38)
            goto L7e
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C70172WEu.A06(android.content.Context, com.instagram.business.promote.model.PromoteData, java.lang.String, java.lang.String, java.util.List, java.util.Set, boolean):java.lang.String");
    }

    public static final SpannableStringBuilder A00(Context context, XIGIGBoostCallToAction xIGIGBoostCallToAction, UserSession userSession, User user) {
        new SpannableStringBuilder();
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(AbstractC07900bA.A01(context.getResources(), new String[]{WUZ.A00.A05(context, null, userSession), user.getUsername()}, 2131954051));
        if (xIGIGBoostCallToAction != null) {
            String string = context.getString(W6g.A00(xIGIGBoostCallToAction));
            spannableStringBuilder.append((CharSequence) "\n");
            spannableStringBuilder.append((CharSequence) AbstractC07900bA.A01(context.getResources(), new String[]{string}, 2131970595));
        }
        return spannableStringBuilder;
    }

    public static final XIGIGBoostCallToAction A01(PromoteData promoteData) {
        String name;
        XIGIGBoostCallToAction valueOf;
        String name2;
        XIGIGBoostCallToAction valueOf2;
        XIGIGBoostDestination xIGIGBoostDestination = promoteData.A0i;
        if (xIGIGBoostDestination != null) {
            switch (xIGIGBoostDestination.ordinal()) {
                case 1:
                    XIGIGBoostCallToAction xIGIGBoostCallToAction = promoteData.A0e;
                    if (xIGIGBoostCallToAction == null || (name2 = xIGIGBoostCallToAction.name()) == null || (valueOf2 = XIGIGBoostCallToAction.valueOf(name2)) == null) {
                        return XIGIGBoostCallToAction.A0J;
                    }
                    return valueOf2;
                case 2:
                case 10:
                    XIGIGBoostCallToAction xIGIGBoostCallToAction2 = promoteData.A0b;
                    if (xIGIGBoostCallToAction2 == null) {
                        throw new IllegalStateException("When destination is website, CTA can not be null");
                    }
                    return xIGIGBoostCallToAction2;
                case 3:
                case 6:
                case 9:
                case 11:
                default:
                    throw new Throwable("Unknown destination type");
                case 4:
                    XIGIGBoostCallToAction xIGIGBoostCallToAction3 = promoteData.A0d;
                    if (xIGIGBoostCallToAction3 == null) {
                        throw new IllegalStateException("When destination is lead gen, CTA can not be null");
                    }
                    return xIGIGBoostCallToAction3;
                case 5:
                case IgReactQEModule.CONFIG_KEY_OFFSET /* 12 */:
                    XIGIGBoostCallToAction xIGIGBoostCallToAction4 = promoteData.A0e;
                    if (xIGIGBoostCallToAction4 == null || (name = xIGIGBoostCallToAction4.name()) == null || (valueOf = XIGIGBoostCallToAction.valueOf(name)) == null) {
                        return XIGIGBoostCallToAction.A0W;
                    }
                    return valueOf;
                case 7:
                    return XIGIGBoostCallToAction.A0N;
                case 8:
                    return XIGIGBoostCallToAction.A0T;
            }
        }
        throw new IllegalStateException("Unknown destination type");
    }

    public static final String A02(String str) {
        Matcher matcher = WUZ.A01.matcher(str);
        C14360o3.A07(matcher);
        if (matcher.matches()) {
            str = matcher.group(3);
            if (str != null) {
                Matcher matcher2 = WUZ.A02.matcher(str);
                if (matcher2.find() && (str = matcher2.group(1)) == null) {
                    throw new IllegalStateException("Required value was null.");
                }
            } else {
                throw new IllegalStateException("Required value was null.");
            }
        }
        return str;
    }

    public final String A05(Context context, XIGIGBoostCallToAction xIGIGBoostCallToAction, UserSession userSession) {
        String str;
        C208059Im c208059Im;
        String A00;
        A9M A01 = C97F.A01(C97F.A00(WUZ.class), userSession);
        if (A01 == null || (c208059Im = A01.A00) == null || (A00 = c208059Im.A00(C97F.A00(WUZ.class), userSession)) == null || (str = PhoneNumberUtils.formatNumber(A00, C1Q2.A02().getCountry())) == null) {
            str = "";
        }
        StringBuilder sb = new StringBuilder(str);
        if (xIGIGBoostCallToAction != null) {
            sb.append("\n");
            W6g.A02(context, xIGIGBoostCallToAction, sb, 2131970595);
        }
        String obj = sb.toString();
        C14360o3.A0A(obj);
        return obj;
    }
}
