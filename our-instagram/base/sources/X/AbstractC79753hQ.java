package X;

import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;

/* renamed from: X.3hQ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC79753hQ {
    public static final StringBuilder A01(Context context, Resources resources, InterfaceC11380iw interfaceC11380iw, UserSession userSession, C38321qM c38321qM, C57332k8 c57332k8, boolean z) {
        String str;
        C14360o3.A0B(context, 0);
        C14360o3.A0B(userSession, 1);
        C14360o3.A0B(c38321qM, 2);
        C14360o3.A0B(resources, 3);
        C14360o3.A0B(interfaceC11380iw, 6);
        User A2E = c38321qM.A2E(userSession);
        if (A2E != null) {
            str = A2E.B8y();
        } else {
            str = "";
        }
        String AXw = c38321qM.A0C.AXw();
        return A02(context, resources, userSession, c38321qM, c57332k8, AbstractC76193bO.A02(userSession, c38321qM, c38321qM), A00(c38321qM), str, AXw, interfaceC11380iw.getModuleName(), z);
    }

    public static final StringBuilder A02(Context context, Resources resources, UserSession userSession, C38321qM c38321qM, C57332k8 c57332k8, C3YE c3ye, Integer num, String str, String str2, String str3, boolean z) {
        int i;
        Object[] objArr;
        String str4;
        String str5;
        int i2;
        Object[] objArr2;
        int i3;
        C14360o3.A0B(c3ye, 9);
        C14360o3.A0B(str3, 10);
        StringBuilder sb = new StringBuilder();
        if (c38321qM != null) {
            if (c38321qM.CdW()) {
                i3 = 2131966147;
            } else if (c38321qM.A6H()) {
                i3 = 2131966149;
            }
            sb.append(resources.getString(i3));
            sb.append(' ');
        }
        if (num != null) {
            int intValue = num.intValue();
            if (intValue != 0) {
                if (intValue != 1) {
                    if (intValue != 3) {
                        if (intValue == 4) {
                            i = 2131971705;
                            if (str2 != null) {
                                i = 2131971706;
                                objArr = new Object[]{str, str2};
                            }
                        }
                    } else {
                        i = 2131966108;
                        if (str2 != null) {
                            i = 2131966109;
                            objArr = new Object[]{str2};
                        }
                    }
                    objArr = new Object[]{str};
                } else {
                    if (c3ye == C3YE.A03) {
                        str5 = resources.getString(2131972098);
                    } else {
                        str5 = "";
                    }
                    C14360o3.A0A(str5);
                    StringBuilder sb2 = new StringBuilder();
                    if (str2 != null) {
                        sb2.append(str5);
                        i2 = 2131976695;
                        objArr2 = new Object[]{str, str2};
                    } else {
                        sb2.append(str5);
                        i2 = 2131976694;
                        objArr2 = new Object[]{str};
                    }
                    sb2.append(resources.getString(i2, objArr2));
                    str4 = sb2.toString();
                    AbstractC56932jR.A09(str4, sb, false);
                }
            } else {
                i = 2131964278;
                if (str2 != null) {
                    i = 2131964279;
                    objArr = new Object[]{str, str2};
                }
                objArr = new Object[]{str};
            }
            str4 = resources.getString(i, objArr);
            AbstractC56932jR.A09(str4, sb, false);
        }
        A03(context, userSession, c38321qM, c57332k8, str3, sb, z);
        return sb;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0028  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0055  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void A03(android.content.Context r7, com.instagram.common.session.UserSession r8, X.C38321qM r9, X.C57332k8 r10, java.lang.String r11, java.lang.StringBuilder r12, boolean r13) {
        /*
            r4 = 1
            if (r9 == 0) goto L61
            boolean r0 = X.C77153d1.A00(r8, r9)
            if (r0 == 0) goto L73
            if (r10 == 0) goto L73
            X.3dQ r0 = X.C77403dQ.A00
            java.util.List r0 = r0.A06(r8, r9)
            if (r0 == 0) goto L73
            boolean r0 = r0.isEmpty()
            r0 = r0 ^ 1
            if (r0 != r4) goto L73
            java.lang.CharSequence r0 = r10.A0F(r7, r9, r11)
        L1f:
            X.AbstractC56932jR.A09(r0, r12, r4)
        L22:
            int r0 = r9.A0s()
            if (r0 == 0) goto L4f
            android.content.res.Resources r6 = r7.getResources()
            X.C14360o3.A07(r6)
            int r5 = r9.A0s()
            r3 = 0
            r2 = 2131820870(0x7f110146, float:1.9274467E38)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r5)
            r0 = 10000(0x2710, float:1.4013E-41)
            java.lang.String r0 = X.C84963qk.A04(r6, r1, r0, r3, r3)
            java.lang.Object[] r0 = new java.lang.Object[]{r0}
            java.lang.String r0 = r6.getQuantityString(r2, r5, r0)
            X.C14360o3.A07(r0)
            X.AbstractC56932jR.A09(r0, r12, r4)
        L4f:
            boolean r0 = r9.Cff()
            if (r0 == 0) goto L61
            long r2 = r9.A1B()
            double r0 = (double) r2
            java.lang.String r0 = X.C23831Eq.A03(r7, r0)
            X.AbstractC56932jR.A09(r0, r12, r4)
        L61:
            if (r13 == 0) goto L72
            if (r9 == 0) goto L72
            X.3qg r0 = r9.A1V()
            if (r0 == 0) goto L72
            java.lang.String r0 = r0.A0e
            if (r0 == 0) goto L72
            X.AbstractC56932jR.A09(r0, r12, r4)
        L72:
            return
        L73:
            boolean r0 = X.C77153d1.A00(r8, r9)
            if (r0 != 0) goto L22
            android.content.res.Resources r1 = r7.getResources()
            X.C14360o3.A07(r1)
            int r0 = r9.A0w()
            java.lang.String r0 = X.AbstractC74053Tw.A00(r1, r0)
            goto L1f
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC79753hQ.A03(android.content.Context, com.instagram.common.session.UserSession, X.1qM, X.2k8, java.lang.String, java.lang.StringBuilder, boolean):void");
    }

    public static final void A04(View view, UserSession userSession, C38321qM c38321qM, int i) {
        int i2;
        Object[] objArr;
        C14360o3.A0B(userSession, 0);
        C14360o3.A0B(c38321qM, 2);
        Resources resources = view.getResources();
        User A2E = c38321qM.A2E(userSession);
        if (A2E != null) {
            String B8y = A2E.B8y();
            String AXw = c38321qM.A0C.AXw();
            int intValue = A00(c38321qM).intValue();
            if (intValue != 0) {
                if (intValue != 1) {
                    if (intValue == 3) {
                        i2 = 2131965268;
                        if (AXw != null) {
                            i2 = 2131965269;
                            objArr = new Object[]{B8y, AXw, Integer.valueOf(i + 1)};
                        }
                        objArr = new Object[]{B8y, Integer.valueOf(i + 1)};
                    } else {
                        return;
                    }
                } else {
                    i2 = 2131965272;
                    if (AXw != null) {
                        i2 = 2131965273;
                        objArr = new Object[]{B8y, AXw, Integer.valueOf(i + 1)};
                    }
                    objArr = new Object[]{B8y, Integer.valueOf(i + 1)};
                }
            } else {
                i2 = 2131965264;
                if (AXw != null) {
                    i2 = 2131965265;
                    objArr = new Object[]{B8y, AXw, Integer.valueOf(i + 1)};
                }
                objArr = new Object[]{B8y, Integer.valueOf(i + 1)};
            }
            view.setContentDescription(resources.getString(i2, objArr));
            return;
        }
        throw new IllegalStateException("Required value was null.");
    }

    public static final void A05(View view, UserSession userSession, C38321qM c38321qM, int i, int i2) {
        String quantityString;
        int i3;
        Object[] objArr;
        int i4 = 0;
        Resources resources = view.getResources();
        User A2E = c38321qM.A2E(userSession);
        if (A2E != null) {
            String B8y = A2E.B8y();
            String AXw = c38321qM.A0C.AXw();
            int intValue = A00(c38321qM).intValue();
            if (intValue != 2) {
                if (intValue != 0) {
                    if (intValue != 1) {
                        if (intValue != 3) {
                            if (intValue == 4) {
                                i3 = 2131963300;
                                if (AXw != null) {
                                    i3 = 2131963301;
                                    objArr = new Object[]{B8y, AXw, Integer.valueOf(i + 1), Integer.valueOf(i2 + 1)};
                                }
                                objArr = new Object[]{B8y, Integer.valueOf(i + 1), Integer.valueOf(i2 + 1)};
                            } else {
                                throw new RuntimeException();
                            }
                        } else {
                            i3 = 2131963298;
                            if (AXw != null) {
                                i3 = 2131963299;
                                objArr = new Object[]{B8y, AXw, Integer.valueOf(i + 1), Integer.valueOf(i2 + 1)};
                            }
                            objArr = new Object[]{B8y, Integer.valueOf(i + 1), Integer.valueOf(i2 + 1)};
                        }
                    } else {
                        i3 = 2131963303;
                        if (AXw != null) {
                            i3 = 2131963304;
                            objArr = new Object[]{B8y, AXw, Integer.valueOf(i + 1), Integer.valueOf(i2 + 1)};
                        }
                        objArr = new Object[]{B8y, Integer.valueOf(i + 1), Integer.valueOf(i2 + 1)};
                    }
                } else {
                    i3 = 2131963296;
                    if (AXw != null) {
                        i3 = 2131963297;
                        objArr = new Object[]{B8y, AXw, Integer.valueOf(i + 1), Integer.valueOf(i2 + 1)};
                    }
                    objArr = new Object[]{B8y, Integer.valueOf(i + 1), Integer.valueOf(i2 + 1)};
                }
            } else {
                User A2E2 = c38321qM.A2E(userSession);
                if (A2E2 != null) {
                    String B8y2 = A2E2.B8y();
                    int A0p = c38321qM.A0p();
                    for (int i5 = 0; i5 < A0p; i5++) {
                        C38321qM A1e = c38321qM.A1e(i5);
                        if (A1e != null) {
                            if (A1e.Cff()) {
                                i4++;
                            }
                        } else {
                            throw new IllegalStateException("Required value was null.");
                        }
                    }
                    int i6 = A0p - i4;
                    if (A0p == i4) {
                        i3 = 2131963294;
                    } else if (A0p == i6) {
                        i3 = 2131963293;
                    } else if (i6 == 1) {
                        if (i4 >= 1) {
                            quantityString = resources.getQuantityString(R.plurals.grid_carousel_one_photo_n_videos, i4, Integer.valueOf(i4), B8y2, Integer.valueOf(i + 1), Integer.valueOf(i2 + 1));
                            view.setContentDescription(quantityString);
                        }
                        i3 = 2131963295;
                        objArr = new Object[]{Integer.valueOf(i6), Integer.valueOf(i4), B8y2, Integer.valueOf(i + 1), Integer.valueOf(i2 + 1)};
                    } else {
                        if (i6 >= 1 && i4 == 1) {
                            quantityString = resources.getQuantityString(R.plurals.grid_carousel_n_photos_one_video, i6, Integer.valueOf(i6), B8y2, Integer.valueOf(i + 1), Integer.valueOf(i2 + 1));
                            view.setContentDescription(quantityString);
                        }
                        i3 = 2131963295;
                        objArr = new Object[]{Integer.valueOf(i6), Integer.valueOf(i4), B8y2, Integer.valueOf(i + 1), Integer.valueOf(i2 + 1)};
                    }
                    objArr = new Object[]{Integer.valueOf(A0p), B8y2, Integer.valueOf(i + 1), Integer.valueOf(i2 + 1)};
                } else {
                    throw new IllegalStateException("Required value was null.");
                }
            }
            quantityString = resources.getString(i3, objArr);
            view.setContentDescription(quantityString);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x003b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void A06(android.view.View r12, com.instagram.common.session.UserSession r13, X.C38321qM r14, X.C38321qM r15, X.C57332k8 r16, java.lang.String r17, java.lang.String r18, int r19, int r20, boolean r21) {
        /*
            r3 = 0
            r7 = 3
            r6 = 1
            X.C14360o3.A0B(r14, r7)
            r0 = 9
            r9 = r18
            X.C14360o3.A0B(r9, r0)
            android.content.res.Resources r4 = r12.getResources()
            X.1rF r0 = r14.A0C
            java.lang.String r5 = r0.AXw()
            java.lang.Integer r2 = A00(r14)
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            boolean r0 = r14.CdW()
            r1 = 32
            if (r0 == 0) goto L80
            r0 = 2131966147(0x7f1338c3, float:1.9569124E38)
        L2b:
            java.lang.String r0 = r4.getString(r0)
            r10.append(r0)
            r10.append(r1)
        L35:
            int r0 = r2.intValue()
            if (r0 == r6) goto L6c
            if (r0 != r7) goto L58
            r2 = 2131954837(0x7f130c95, float:1.9546185E38)
            if (r5 == 0) goto L75
            r2 = 2131954838(0x7f130c96, float:1.9546187E38)
        L45:
            java.lang.Integer r1 = java.lang.Integer.valueOf(r19)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r20)
        L4d:
            java.lang.Object[] r0 = new java.lang.Object[]{r1, r0, r5}
            java.lang.String r0 = r4.getString(r2, r0)
            X.AbstractC56932jR.A09(r0, r10, r3)
        L58:
            android.content.Context r5 = r12.getContext()
            X.C14360o3.A07(r5)
            r6 = r13
            r7 = r15
            r8 = r16
            r11 = r21
            A03(r5, r6, r7, r8, r9, r10, r11)
            r12.setContentDescription(r10)
            return
        L6c:
            r2 = 2131954840(0x7f130c98, float:1.954619E38)
            if (r5 == 0) goto L75
            r2 = 2131954841(0x7f130c99, float:1.9546193E38)
            goto L45
        L75:
            java.lang.Integer r1 = java.lang.Integer.valueOf(r19)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r20)
            r5 = r17
            goto L4d
        L80:
            boolean r0 = r14.A6H()
            if (r0 == 0) goto L35
            r0 = 2131974901(0x7f135af5, float:1.958688E38)
            goto L2b
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC79753hQ.A06(android.view.View, com.instagram.common.session.UserSession, X.1qM, X.1qM, X.2k8, java.lang.String, java.lang.String, int, int, boolean):void");
    }

    public static final Integer A00(C38321qM c38321qM) {
        if (c38321qM.A5g()) {
            return C05F.A00;
        }
        if (c38321qM.A5P()) {
            return C05F.A0Y;
        }
        if (c38321qM.Cff()) {
            return C05F.A01;
        }
        if (c38321qM.A5M()) {
            return C05F.A0C;
        }
        return C05F.A0N;
    }
}
