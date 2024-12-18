package X;

import android.app.Activity;
import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.method.LinkMovementMethod;
import android.widget.TextView;
import com.facebook.R;
import com.instagram.api.schemas.SellerShoppableFeedType;
import com.instagram.base.activity.IgFragmentActivity;
import com.instagram.common.session.UserSession;
import com.instagram.model.business.Address;
import com.instagram.model.business.ProfileAddressData;
import com.instagram.user.model.User;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.72a, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC1567472a {
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0001. Please report as an issue. */
    public static EnumC151426rk A01(Context context, UserSession userSession, User user, int i, boolean z) {
        switch (i) {
            case 0:
                if (z) {
                    return EnumC151426rk.MESSAGE;
                }
                return null;
            case 1:
                if (z && AbstractC1566171j.A05(user)) {
                    return EnumC151426rk.SUPPORT;
                }
                return null;
            case 2:
                if (user.A03.B4t() != null && user.A1v()) {
                    return EnumC151426rk.CALL_TO_ACTION;
                }
                return null;
            case 3:
                if (z && A0A(userSession, user)) {
                    return EnumC151426rk.SHOP;
                }
                return null;
            case 4:
                if (!TextUtils.isEmpty(user.A03.Bj9())) {
                    if (user.A0K() == C05F.A01) {
                        return EnumC151426rk.CALL;
                    }
                    return EnumC151426rk.TEXT;
                }
                return null;
            case 5:
                if (user.A2J()) {
                    return EnumC151426rk.NATIVE_CALL;
                }
                return null;
            case 6:
                if (!TextUtils.isEmpty(user.A03.Bj6())) {
                    return EnumC151426rk.EMAIL;
                }
                return null;
            case 7:
            default:
                return null;
            case 8:
                if (z && A09(userSession, user)) {
                    return EnumC151426rk.DONATE;
                }
                return null;
            case 9:
                if (A08(context, userSession, user)) {
                    return EnumC151426rk.WHATSAPP;
                }
                return null;
        }
    }

    public static void A07(Context context, TextView textView, AbstractC12990ll abstractC12990ll, String str, String str2, String str3) {
        int color = context.getColor(AbstractC53242c7.A09(context));
        int color2 = context.getColor(AbstractC53242c7.A0H(context, R.attr.textColorBoldLink));
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str2);
        String A01 = AbstractC63260SgI.A01(context, str3);
        C14360o3.A0B(A01, 3);
        AnonymousClass773.A05(spannableStringBuilder, new C33248Eli(context, abstractC12990ll, null, A01, color2), str);
        textView.setText(spannableStringBuilder);
        textView.setMovementMethod(LinkMovementMethod.getInstance());
        textView.setTextColor(color);
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x0011, code lost:
    
        if (r4.A1v() == false) goto L9;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int A00(android.content.Context r2, com.instagram.common.session.UserSession r3, com.instagram.user.model.User r4, boolean r5, boolean r6) {
        /*
            if (r4 != 0) goto L4
            r1 = 0
        L3:
            return r1
        L4:
            X.17P r0 = r4.A03
            java.lang.String r0 = r0.B4t()
            if (r0 == 0) goto L13
            boolean r0 = r4.A1v()
            r1 = 1
            if (r0 != 0) goto L14
        L13:
            r1 = 0
        L14:
            X.17P r0 = r4.A03
            java.lang.String r0 = r0.Bj6()
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L22
            int r1 = r1 + 1
        L22:
            X.17P r0 = r4.A03
            java.lang.String r0 = r0.Bj9()
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L30
            int r1 = r1 + 1
        L30:
            boolean r0 = A08(r2, r3, r4)
            if (r0 == 0) goto L38
            int r1 = r1 + 1
        L38:
            if (r5 == 0) goto L42
            boolean r0 = A0B(r4)
            if (r0 == 0) goto L42
            int r1 = r1 + 1
        L42:
            if (r6 == 0) goto L5c
            boolean r0 = A0A(r3, r4)
            if (r0 == 0) goto L4c
            int r1 = r1 + 1
        L4c:
            boolean r0 = A09(r3, r4)
            if (r0 == 0) goto L54
            int r1 = r1 + 1
        L54:
            boolean r0 = X.AbstractC1566171j.A05(r4)
            if (r0 == 0) goto L5c
            int r1 = r1 + 1
        L5c:
            boolean r0 = r4.A2J()
            if (r0 == 0) goto L3
            int r1 = r1 + 1
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC1567472a.A00(android.content.Context, com.instagram.common.session.UserSession, com.instagram.user.model.User, boolean, boolean):int");
    }

    public static Address A02(Context context, User user) {
        String A05 = A05(context, user.A03.AZq(), user.A03.CIk(), user.A03.Ani());
        if (!TextUtils.isEmpty(A05) && !TextUtils.isEmpty(user.A03.Ani())) {
            return new Address(user.A03.AZq(), user.A03.Ani(), user.A03.Anh(), user.A03.CIk(), A05);
        }
        return null;
    }

    public static Integer A03(Context context, User user, List list) {
        C5JN AZo = user.A03.AZo();
        if (AZo == null) {
            return null;
        }
        int i = 0;
        if (AZo.CSv() == null || !AZo.CSv().booleanValue()) {
            Integer BPx = AZo.BPx();
            Integer BXe = AZo.BXe();
            if (BPx == null || BXe == null) {
                return null;
            }
            int intValue = BXe.intValue();
            ArrayList arrayList = new ArrayList();
            Address A02 = A02(context, user);
            if (A02 != null) {
                arrayList.add(new ProfileAddressData(null, null, "primary", A02.A04, A02.A00, A02.A01, A02.A02, null));
            }
            arrayList.addAll(A06(user));
            HashMap hashMap = new HashMap();
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ProfileAddressData profileAddressData = (ProfileAddressData) it.next();
                hashMap.put(profileAddressData.A02, profileAddressData);
            }
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                ProfileAddressData profileAddressData2 = (ProfileAddressData) it2.next();
                String str = profileAddressData2.A02;
                if (str != null) {
                    if (hashMap.containsKey(str)) {
                        ProfileAddressData profileAddressData3 = (ProfileAddressData) hashMap.get(str);
                        if (profileAddressData3 != null) {
                            String str2 = profileAddressData3.A04;
                            String str3 = null;
                            if (C14360o3.A0K(str2, "0")) {
                                str2 = null;
                            }
                            String str4 = profileAddressData2.A04;
                            if (!C14360o3.A0K(str4, "0")) {
                                str3 = str4;
                            }
                            String str5 = profileAddressData2.A03;
                            String str6 = "";
                            if (str5 == null) {
                                str5 = "";
                            }
                            String str7 = profileAddressData3.A03;
                            if (str7 == null) {
                                str7 = "";
                            }
                            if (str5.equals(str7)) {
                                if (str3 == null) {
                                    str3 = "";
                                }
                                if (str2 == null) {
                                    str2 = "";
                                }
                                if (str3.equals(str2)) {
                                    String str8 = profileAddressData2.A08;
                                    if (str8 == null) {
                                        str8 = "";
                                    }
                                    String str9 = profileAddressData3.A08;
                                    if (str9 != null) {
                                        str6 = str9;
                                    }
                                    if (!str8.equals(str6)) {
                                    }
                                }
                            }
                        }
                    }
                }
                intValue++;
            }
            int intValue2 = BPx.intValue();
            if (intValue < intValue2) {
                i = intValue2 - intValue;
            }
        }
        return Integer.valueOf(i);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static String A04(Activity activity) {
        UserSession userSession;
        String str;
        if (activity instanceof InterfaceC37222GaX) {
            AbstractC18680vv session = ((IgFragmentActivity) ((InterfaceC37222GaX) activity)).getSession();
            if (!(session instanceof UserSession) || (userSession = (UserSession) session) == null || (str = userSession.userId) == null) {
                return "0";
            }
            return str;
        }
        return null;
    }

    public static ArrayList A06(User user) {
        ArrayList arrayList = new ArrayList();
        List<InterfaceC37278GbV> AZk = user.A03.AZk();
        if (AZk != null) {
            for (InterfaceC37278GbV interfaceC37278GbV : AZk) {
                arrayList.add(new ProfileAddressData(interfaceC37278GbV.BMH(), interfaceC37278GbV.BPG(), interfaceC37278GbV.AZj(), interfaceC37278GbV.AZq(), interfaceC37278GbV.Anh(), interfaceC37278GbV.Ani(), interfaceC37278GbV.CIl(), interfaceC37278GbV.BIO()));
            }
        }
        return arrayList;
    }

    public static boolean A0B(User user) {
        if (TextUtils.isEmpty(user.A03.AZq()) && TextUtils.isEmpty(user.A03.Ani()) && TextUtils.isEmpty(user.A03.CIk())) {
            return false;
        }
        return true;
    }

    public static boolean A0C(User user) {
        Boolean Bo3;
        boolean z = (!TextUtils.isEmpty(user.A03.Bj6())) ^ (!TextUtils.isEmpty(user.A03.Bj9()));
        if (C2E7.A03(user) && user.A1d() && z && user.A03.B7S() != null && user.A03.B7S().intValue() < 100000 && (Bo3 = user.A03.Bo3()) != null && Bo3.booleanValue()) {
            return true;
        }
        return false;
    }

    public static String A05(Context context, String str, String str2, String str3) {
        int i;
        Object[] objArr;
        if (TextUtils.isEmpty(str3)) {
            return "";
        }
        boolean isEmpty = TextUtils.isEmpty(str);
        boolean isEmpty2 = TextUtils.isEmpty(str2);
        if (isEmpty) {
            if (isEmpty2) {
                return str3;
            }
            context.getClass();
            i = 2131974111;
            objArr = new Object[]{str3, str2};
        } else {
            context.getClass();
            if (isEmpty2) {
                i = 2131974110;
                objArr = new Object[]{str, str3};
            } else {
                i = 2131962965;
                objArr = new Object[]{str, str3, str2};
            }
        }
        return context.getString(i, objArr);
    }

    public static boolean A08(Context context, UserSession userSession, User user) {
        if (C2TN.A04(userSession, user)) {
            return user.A1a();
        }
        if (user.A1a() && Boolean.TRUE.equals(user.A03.Bvd())) {
            if (AbstractC14490oL.A0G(context) || AbstractC14490oL.A0J(context.getPackageManager(), "com.whatsapp.w4b")) {
                return true;
            }
            return false;
        }
        return false;
    }

    public static boolean A09(UserSession userSession, User user) {
        Boolean BB1;
        if (user.A1y() && (BB1 = user.A03.BB1()) != null && BB1.booleanValue()) {
            if (WE6.A03(user) || WE6.A02(userSession)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public static boolean A0A(UserSession userSession, User user) {
        if ((user.A0A() == SellerShoppableFeedType.A07 && C18U.A06(C06090Tz.A05, userSession, 36317500425639204L)) || (AbstractC1566271k.A0A(userSession, user) != C05F.A0N && !AbstractC1566271k.A0S(userSession, user))) {
            return false;
        }
        return true;
    }
}
