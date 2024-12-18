package X;

import android.content.Context;
import android.content.Intent;
import android.os.BaseBundle;
import android.os.Bundle;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.facebook.proxygen.TraceFieldType;
import com.instagram.common.api.base.CacheBehaviorLogger;

/* renamed from: X.FhD, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC35278FhD {
    public static int A02(int[] iArr) {
        return iArr[0];
    }

    public static Intent A1a(Context context, String str, char[] cArr, int i) {
        Bundle A0C = AbstractC31174DnI.A0C();
        Intent intent = null;
        int[] A09 = AbstractC35268Fh3.A09(A0C, "user_name", cArr, 0);
        if (A09 != null) {
            int i2 = A09[0];
            int i3 = A09[1];
            if (i3 >= 1 && i3 <= 3) {
                A0C.putString("user_name", AbstractC31171DnF.A0i(cArr, 0, i2));
                if (AbstractC35268Fh3.A08("/profilecard", cArr, i2)) {
                    int i4 = i2 + 12;
                    if (i4 < i) {
                        Intent A02 = AbstractC35268Fh3.A02(context, "com.instagram.urlhandlers.profilecard.ProfilecardUrlHandlerActivity", str, cArr, i4);
                        if (A02 != null) {
                            A02.putExtra("matched_pattern", "instagram://{user_name}/profilecard");
                            A02.putExtra("access_scope", "PUBLIC");
                            A02.putExtra("enforce_scope", true);
                            A1m(A02);
                            A02.putExtra("app_set", "[]");
                            return A02;
                        }
                    } else {
                        intent = AbstractC35268Fh3.A00(context, A0C, "com.instagram.urlhandlers.profilecard.ProfilecardUrlHandlerActivity", str);
                        if (intent != null) {
                            intent.putExtra("matched_pattern", "instagram://{user_name}/profilecard");
                            intent.putExtra("access_scope", "PUBLIC");
                            intent.putExtra("enforce_scope", true);
                            A1m(intent);
                            intent.putExtra("app_set", "[]");
                            return intent;
                        }
                    }
                }
            } else {
                throw A1k(i3);
            }
        }
        return intent;
    }

    public static Bundle A1i(Bundle bundle) {
        if (bundle == null) {
            return new Bundle(2);
        }
        return bundle;
    }

    public static int A00(String str, int i) {
        return str.indexOf(38, i);
    }

    public static int A01(String str, int i) {
        return str.indexOf(61, i);
    }

    public static Intent A03(Context context, Bundle bundle, String str) {
        return AbstractC35268Fh3.A00(context, bundle, "com.instagram.urlhandlers.infocenter.InfoCenterExternalUrlHandlerActivity", str);
    }

    public static Intent A04(Context context, Bundle bundle, String str) {
        return AbstractC35268Fh3.A00(context, bundle, "com.instagram.urlhandlers.igtv.IGTVExternalUrlHandlerActivity", str);
    }

    public static Intent A05(Context context, Bundle bundle, String str) {
        return AbstractC35268Fh3.A00(context, bundle, "com.instagram.urlhandlers.mediakit.MediaKitExternalUrlHandlerActivity", str);
    }

    public static Intent A06(Context context, Bundle bundle, String str) {
        return AbstractC35268Fh3.A00(context, bundle, "com.instagram.urlhandlers.creatoronboarding.CreatorOnboardingUrlHandlerActivity", str);
    }

    public static Intent A07(Context context, Bundle bundle, String str) {
        return AbstractC35268Fh3.A00(context, bundle, "com.instagram.urlhandlers.clips.ClipsUrlHandlerActivity", str);
    }

    public static Intent A08(Context context, Bundle bundle, String str) {
        return AbstractC35268Fh3.A00(context, bundle, "com.instagram.urlhandlers.passwordreset.PasswordResetExternalUrlHandlerActivity", str);
    }

    public static Intent A09(Context context, Bundle bundle, String str) {
        return AbstractC35268Fh3.A00(context, bundle, "com.instagram.urlhandlers.live.LiveExternalUrlHandlerActivity", str);
    }

    public static Intent A0A(Context context, Bundle bundle, String str) {
        return AbstractC35268Fh3.A00(context, bundle, "com.instagram.urlhandlers.media.MediaExternalUrlHandlerActivity", str);
    }

    public static Intent A0B(Context context, Bundle bundle, String str) {
        return AbstractC35268Fh3.A00(context, bundle, "com.instagram.urlhandlers.igme.IgMeExternalUrlHandlerActivity", str);
    }

    public static Intent A0C(Context context, Bundle bundle, String str) {
        return AbstractC35268Fh3.A00(context, bundle, "com.instagram.urlhandlers.guides.GuidesExternalUrlHandlerActivity", str);
    }

    public static Intent A0D(Context context, Bundle bundle, String str) {
        return AbstractC35268Fh3.A00(context, bundle, "com.instagram.urlhandlers.familycenter.FamilyCenterUrlHandlerActivity", str);
    }

    public static Intent A0E(Context context, Bundle bundle, String str) {
        return AbstractC35268Fh3.A00(context, bundle, "com.instagram.urlhandlers.directgroupinvite.DirectGroupInviteHandlerActivity", str);
    }

    public static Intent A0F(Context context, Bundle bundle, String str) {
        return AbstractC35268Fh3.A00(context, bundle, "com.instagram.urlhandlers.exploreexternal.ExploreExternalUrlHandlerActivity", str);
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x004f, code lost:
    
        if (r6 != null) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0062, code lost:
    
        if (r6 != null) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x009d, code lost:
    
        if (r2 != '?') goto L48;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static android.content.Intent A0J(android.content.Context r13, java.lang.String r14, char[] r15, int r16) {
        /*
            Method dump skipped, instructions count: 372
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC35278FhD.A0J(android.content.Context, java.lang.String, char[], int):android.content.Intent");
    }

    /* JADX WARN: Code restructure failed: missing block: B:115:0x0171, code lost:
    
        if (r6 != null) goto L117;
     */
    /* JADX WARN: Code restructure failed: missing block: B:119:0x0184, code lost:
    
        if (r6 != null) goto L117;
     */
    /* JADX WARN: Code restructure failed: missing block: B:147:0x01d5, code lost:
    
        if (r2 != '?') goto L150;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x00a3, code lost:
    
        if (r6 != null) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x00b6, code lost:
    
        if (r6 != null) goto L51;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static android.content.Intent A0K(android.content.Context r12, java.lang.String r13, char[] r14, int r15) {
        /*
            Method dump skipped, instructions count: 562
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC35278FhD.A0K(android.content.Context, java.lang.String, char[], int):android.content.Intent");
    }

    /* JADX WARN: Code restructure failed: missing block: B:135:0x0193, code lost:
    
        if (r2 != '?') goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0061, code lost:
    
        if (r2 != '?') goto L33;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static android.content.Intent A0L(android.content.Context r13, java.lang.String r14, char[] r15, int r16) {
        /*
            Method dump skipped, instructions count: 636
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC35278FhD.A0L(android.content.Context, java.lang.String, char[], int):android.content.Intent");
    }

    /* JADX WARN: Code restructure failed: missing block: B:123:0x0173, code lost:
    
        if (r0 != '?') goto L122;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static android.content.Intent A0M(android.content.Context r14, java.lang.String r15, char[] r16, int r17) {
        /*
            Method dump skipped, instructions count: 720
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC35278FhD.A0M(android.content.Context, java.lang.String, char[], int):android.content.Intent");
    }

    /* JADX WARN: Code restructure failed: missing block: B:38:0x007d, code lost:
    
        if (r2 != '?') goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x0115, code lost:
    
        if (r11 != false) goto L77;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:47:0x00b8. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00c3 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00c1 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static android.content.Intent A0N(android.content.Context r12, java.lang.String r13, char[] r14, int r15) {
        /*
            Method dump skipped, instructions count: 348
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC35278FhD.A0N(android.content.Context, java.lang.String, char[], int):android.content.Intent");
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x0053, code lost:
    
        if (r6 != null) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0066, code lost:
    
        if (r6 != null) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x0119, code lost:
    
        if (r0 != '?') goto L90;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static android.content.Intent A0O(android.content.Context r9, java.lang.String r10, char[] r11, int r12) {
        /*
            Method dump skipped, instructions count: 374
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC35278FhD.A0O(android.content.Context, java.lang.String, char[], int):android.content.Intent");
    }

    /* JADX WARN: Code restructure failed: missing block: B:74:0x00e9, code lost:
    
        if (r2 != '?') goto L76;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static android.content.Intent A0P(android.content.Context r10, java.lang.String r11, char[] r12, int r13) {
        /*
            Method dump skipped, instructions count: 351
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC35278FhD.A0P(android.content.Context, java.lang.String, char[], int):android.content.Intent");
    }

    /* JADX WARN: Code restructure failed: missing block: B:140:0x0461, code lost:
    
        if (r3 != '?') goto L323;
     */
    /* JADX WARN: Code restructure failed: missing block: B:273:0x022f, code lost:
    
        if (r3 != '?') goto L323;
     */
    /* JADX WARN: Code restructure failed: missing block: B:372:0x0357, code lost:
    
        if (r3 != '?') goto L323;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static android.content.Intent A0Q(android.content.Context r15, java.lang.String r16, char[] r17, int r18) {
        /*
            Method dump skipped, instructions count: 1376
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC35278FhD.A0Q(android.content.Context, java.lang.String, char[], int):android.content.Intent");
    }

    /* JADX WARN: Code restructure failed: missing block: B:138:0x00d3, code lost:
    
        if (r2 != null) goto L60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:141:0x00e3, code lost:
    
        if (r2 != null) goto L60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x0154, code lost:
    
        if (r2 != '?') goto L102;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static android.content.Intent A0R(android.content.Context r14, java.lang.String r15, char[] r16, int r17) {
        /*
            Method dump skipped, instructions count: 500
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC35278FhD.A0R(android.content.Context, java.lang.String, char[], int):android.content.Intent");
    }

    /* JADX WARN: Code restructure failed: missing block: B:96:0x0123, code lost:
    
        if (r0 != '?') goto L98;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static android.content.Intent A0S(android.content.Context r10, java.lang.String r11, char[] r12, int r13) {
        /*
            Method dump skipped, instructions count: 402
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC35278FhD.A0S(android.content.Context, java.lang.String, char[], int):android.content.Intent");
    }

    public static Intent A0T(Context context, String str, char[] cArr, int i) {
        String str2;
        String substring;
        boolean z;
        Intent A00;
        String str3;
        String str4;
        String substring2;
        String str5;
        Intent intent = null;
        Bundle bundle = null;
        intent = null;
        intent = null;
        if (19 < i) {
            char c = cArr[19];
            if (c != '/') {
                if (c != 'a') {
                    if (c != 'o') {
                        if (c == 'r' && 20 < i) {
                            char c2 = cArr[20];
                            if (c2 != 'e') {
                                if (c2 == 'i' && 21 < i && cArr[21] == 'v' && 22 < i && cArr[22] == 'a' && 23 < i && cArr[23] == 'c' && 24 < i && cArr[24] == 'y' && 25 < i && cArr[25] == '/' && (26 >= i || cArr[26] != '?')) {
                                    if (AbstractC35268Fh3.A08("bundle", cArr, 26)) {
                                        if (32 < i) {
                                            z = true;
                                            A00 = AbstractC35268Fh3.A03(context, "com.instagram.urlhandlers.privacybundle.PrivacyBundleUrlHandlerActivity", str, cArr, 32);
                                            if (A00 != null) {
                                                str4 = "http://www.instagram.com/privacy/bundle";
                                                A00.putExtra("matched_pattern", str4);
                                                A00.putExtra("access_scope", "SAME_APP");
                                                A00.putExtra("enforce_scope", z);
                                                A1m(A00);
                                                A00.putExtra("app_set", "[]");
                                                return A00;
                                            }
                                        } else {
                                            z = true;
                                            A00 = AbstractC35268Fh3.A00(context, null, "com.instagram.urlhandlers.privacybundle.PrivacyBundleUrlHandlerActivity", str);
                                            if (A00 != null) {
                                                str3 = "http://www.instagram.com/privacy/bundle";
                                                A00.putExtra("matched_pattern", str3);
                                                A00.putExtra("access_scope", "SAME_APP");
                                                A00.putExtra("enforce_scope", z);
                                                A1m(A00);
                                                A00.putExtra("app_set", "[]");
                                                return A00;
                                            }
                                            return A00;
                                        }
                                    }
                                    return null;
                                }
                            } else if (21 < i && cArr[21] == 'f' && 22 < i && cArr[22] == 'e' && 23 < i && cArr[23] == 'r' && 24 < i && cArr[24] == 'r' && 25 < i && cArr[25] == 'e' && 26 < i && cArr[26] == 'd' && 27 < i && cArr[27] == '_' && 28 < i && cArr[28] == 'b' && 29 < i && cArr[29] == 'u' && 30 < i && cArr[30] == 's' && 31 < i && cArr[31] == 'i' && 32 < i && cArr[32] == 'n' && 33 < i && cArr[33] == 'e' && 34 < i && cArr[34] == 's' && 35 < i && cArr[35] == 's' && 36 < i && cArr[36] == 'e' && 37 < i && cArr[37] == 's' && 38 < i && cArr[38] == '/' && (39 >= i || cArr[39] != '?')) {
                                if (!AbstractC35268Fh3.A08("link_account/", cArr, 39)) {
                                    return null;
                                }
                                Bundle A0C = AbstractC31174DnI.A0C();
                                A00 = null;
                                int[] A09 = AbstractC35268Fh3.A09(A0C, "consent_flow_name", cArr, 52);
                                if (A09 != null) {
                                    int i2 = 0;
                                    int i3 = A09[0];
                                    int i4 = A09[1];
                                    if (i4 >= 1 && i4 <= 3) {
                                        AbstractC35268Fh3.A07(A0C, "consent_flow_name", cArr, 52, i3);
                                        if (i > i3) {
                                            int i5 = i3 + 1;
                                            char c3 = cArr[i3];
                                            if (c3 == '/') {
                                                c3 = cArr[i5];
                                                i5++;
                                            }
                                            if (c3 == '?') {
                                                int i6 = i - i5;
                                                String A0i = AbstractC31171DnF.A0i(cArr, i5, i6);
                                                int i7 = 0;
                                                while (true) {
                                                    if (i2 < i6) {
                                                        int A01 = A01(A0i, i2);
                                                        if (A01 < 0) {
                                                            break;
                                                        }
                                                        String substring3 = A0i.substring(i2, A01);
                                                        int A002 = A00(A0i, A01);
                                                        int i8 = A01 + 1;
                                                        if (A002 > 0) {
                                                            substring2 = A0i.substring(i8, A002);
                                                            i2 = A002 + 1;
                                                        } else {
                                                            substring2 = A0i.substring(i8);
                                                            i2 = A0i.length();
                                                        }
                                                        if (!substring3.equals(CacheBehaviorLogger.SOURCE)) {
                                                            str5 = "extra_params";
                                                            if (!substring3.equals("extra_params")) {
                                                                bundle = A1j(substring3, substring2, bundle);
                                                            } else {
                                                                i7 |= 1;
                                                            }
                                                        } else {
                                                            i7 |= 2;
                                                            str5 = "partnership_name";
                                                        }
                                                        A0C.putString(str5, substring2);
                                                    } else if ((i7 | 2) == i7 && (A00 = AbstractC35268Fh3.A00(context, A0C, "com.instagram.urlhandlers.bwp.AmazonAccountLinkingUrlHandlerActivity", str)) != null) {
                                                        A1o(A00, "http://www.instagram.com/preferred_businesses/link_account/{consent_flow_name}?source={partnership_name}&extra_params={?extra_params}");
                                                        A00.putExtra("enforce_scope", true);
                                                        A1m(A00);
                                                        A00.putExtra("app_set", "[]");
                                                        return A00;
                                                    }
                                                }
                                            }
                                        }
                                    } else {
                                        throw A1k(i4);
                                    }
                                }
                                return A00;
                            }
                        }
                    } else if (20 < i && cArr[20] == 'r' && 21 < i && cArr[21] == 't' && 22 < i && cArr[22] == 'f' && 23 < i && cArr[23] == 'o' && 24 < i && cArr[24] == 'l' && 25 < i && cArr[25] == 'i' && 26 < i && cArr[26] == 'o' && 27 < i && cArr[27] == '/' && (28 >= i || cArr[28] != '?')) {
                        Bundle A0C2 = AbstractC31174DnI.A0C();
                        A00 = null;
                        int[] A092 = AbstractC35268Fh3.A09(A0C2, "short_code", cArr, 28);
                        if (A092 != null) {
                            int A02 = A02(A092);
                            int i9 = A092[1];
                            if (i9 >= 1 && i9 <= 3) {
                                AbstractC35268Fh3.A07(A0C2, "short_code", cArr, 28, A02);
                                if (i <= A02 && (A00 = A05(context, A0C2, str)) != null) {
                                    A1o(A00, "http://www.instagram.com/portfolio/{short_code}");
                                    A00.putExtra("enforce_scope", true);
                                    A1m(A00);
                                    A00.putExtra("app_set", "[]");
                                    return A00;
                                }
                            } else {
                                throw A1k(i9);
                            }
                        }
                        return A00;
                    }
                } else {
                    z = true;
                    if (20 < i && cArr[20] == 'r' && 21 < i && cArr[21] == 'e' && 22 < i && cArr[22] == 'n' && 23 < i && cArr[23] == 't' && 24 < i && cArr[24] == 'a' && 25 < i && cArr[25] == 'l' && 26 < i && cArr[26] == '/' && (27 >= i || cArr[27] != '?')) {
                        if (AbstractC35268Fh3.A08("access/education", cArr, 27)) {
                            if (43 < i) {
                                A00 = AbstractC35268Fh3.A03(context, "com.instagram.urlhandlers.parentalaccesseducation.ParentalAccessEducationUrlHandlerActivity", str, cArr, 43);
                                if (A00 != null) {
                                    str4 = "http://www.instagram.com/parental/access/education";
                                    A00.putExtra("matched_pattern", str4);
                                    A00.putExtra("access_scope", "SAME_APP");
                                    A00.putExtra("enforce_scope", z);
                                    A1m(A00);
                                    A00.putExtra("app_set", "[]");
                                    return A00;
                                }
                            } else {
                                A00 = AbstractC35268Fh3.A00(context, null, "com.instagram.urlhandlers.parentalaccesseducation.ParentalAccessEducationUrlHandlerActivity", str);
                                if (A00 != null) {
                                    str3 = "http://www.instagram.com/parental/access/education";
                                    A00.putExtra("matched_pattern", str3);
                                    A00.putExtra("access_scope", "SAME_APP");
                                    A00.putExtra("enforce_scope", z);
                                    A1m(A00);
                                    A00.putExtra("app_set", "[]");
                                    return A00;
                                }
                                return A00;
                            }
                        }
                        return null;
                    }
                }
            } else if (20 >= i || cArr[20] != '?') {
                Bundle A0C3 = AbstractC31174DnI.A0C();
                int[] A093 = AbstractC35268Fh3.A09(A0C3, "media_id", cArr, 20);
                if (A093 != null) {
                    int A022 = A02(A093);
                    int i10 = A093[1];
                    if (i10 >= 1 && i10 <= 3) {
                        AbstractC35268Fh3.A07(A0C3, "media_id", cArr, 20, A022);
                        if (i <= A022) {
                            intent = A0A(context, A0C3, str);
                            if (intent != null) {
                                str2 = "http://www.instagram.com/p/{media_id}";
                                intent.putExtra("matched_pattern", str2);
                                intent.putExtra("access_scope", "PUBLIC");
                                intent.putExtra("enforce_scope", true);
                                A1m(intent);
                                intent.putExtra("app_set", "[]");
                            }
                        } else {
                            int i11 = A022 + 1;
                            char c4 = cArr[A022];
                            if (c4 == '/') {
                                c4 = cArr[i11];
                                i11++;
                            }
                            if (c4 == '?') {
                                int i12 = i - i11;
                                String A0i2 = AbstractC31171DnF.A0i(cArr, i11, i12);
                                Bundle bundle2 = null;
                                int i13 = 0;
                                while (true) {
                                    if (i13 < i12) {
                                        int A012 = A01(A0i2, i13);
                                        if (A012 < 0) {
                                            break;
                                        }
                                        String substring4 = A0i2.substring(i13, A012);
                                        int A003 = A00(A0i2, A012);
                                        int i14 = A012 + 1;
                                        if (A003 > 0) {
                                            substring = A0i2.substring(i14, A003);
                                            i13 = A003 + 1;
                                        } else {
                                            substring = A0i2.substring(i14);
                                            i13 = A0i2.length();
                                        }
                                        String str6 = "extra";
                                        if (!substring4.equals("extra")) {
                                            str6 = "comment_id";
                                            if (!substring4.equals("comment_id")) {
                                                bundle2 = A1j(substring4, substring, bundle2);
                                            }
                                        }
                                        A0C3.putString(str6, substring);
                                    } else {
                                        intent = A0A(context, A0C3, str);
                                        if (intent != null) {
                                            str2 = "http://www.instagram.com/p/{media_id}?comment_id={?comment_id}";
                                        }
                                    }
                                }
                            }
                        }
                    } else {
                        throw A1k(i10);
                    }
                }
                return intent;
            }
        }
        return A1A(context, str, cArr, i);
    }

    /* JADX WARN: Code restructure failed: missing block: B:252:0x0282, code lost:
    
        if (r0 != '?') goto L192;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x00f6, code lost:
    
        if (r10 != null) goto L74;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x0109, code lost:
    
        if (r10 != null) goto L74;
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x0423, code lost:
    
        if (r0 != '?') goto L307;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static android.content.Intent A0U(android.content.Context r16, java.lang.String r17, char[] r18, int r19) {
        /*
            Method dump skipped, instructions count: 1274
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC35278FhD.A0U(android.content.Context, java.lang.String, char[], int):android.content.Intent");
    }

    /* JADX WARN: Code restructure failed: missing block: B:193:0x0268, code lost:
    
        if (r9 != null) goto L191;
     */
    /* JADX WARN: Code restructure failed: missing block: B:196:0x027b, code lost:
    
        if (r9 != null) goto L191;
     */
    /* JADX WARN: Code restructure failed: missing block: B:246:0x02ee, code lost:
    
        if (r9 != null) goto L233;
     */
    /* JADX WARN: Code restructure failed: missing block: B:250:0x0306, code lost:
    
        if (r9 != null) goto L233;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x00d5, code lost:
    
        if (r9 != null) goto L63;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x00ef, code lost:
    
        if (r9 != null) goto L63;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static android.content.Intent A0V(android.content.Context r20, java.lang.String r21, char[] r22, int r23) {
        /*
            Method dump skipped, instructions count: 892
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC35278FhD.A0V(android.content.Context, java.lang.String, char[], int):android.content.Intent");
    }

    /* JADX WARN: Code restructure failed: missing block: B:50:0x00a0, code lost:
    
        if (r1 != '?') goto L52;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static android.content.Intent A0W(android.content.Context r15, java.lang.String r16, char[] r17, int r18) {
        /*
            Method dump skipped, instructions count: 426
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC35278FhD.A0W(android.content.Context, java.lang.String, char[], int):android.content.Intent");
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x002b, code lost:
    
        if (r1 != '?') goto L13;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static android.content.Intent A0X(android.content.Context r16, java.lang.String r17, char[] r18, int r19) {
        /*
            Method dump skipped, instructions count: 311
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC35278FhD.A0X(android.content.Context, java.lang.String, char[], int):android.content.Intent");
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0035, code lost:
    
        if (r1 != '?') goto L16;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static android.content.Intent A0Y(android.content.Context r16, java.lang.String r17, char[] r18, int r19) {
        /*
            Method dump skipped, instructions count: 321
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC35278FhD.A0Y(android.content.Context, java.lang.String, char[], int):android.content.Intent");
    }

    /* JADX WARN: Code restructure failed: missing block: B:56:0x00a9, code lost:
    
        if (r3 != '?') goto L58;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static android.content.Intent A0Z(android.content.Context r10, java.lang.String r11, char[] r12, int r13) {
        /*
            Method dump skipped, instructions count: 304
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC35278FhD.A0Z(android.content.Context, java.lang.String, char[], int):android.content.Intent");
    }

    /* JADX WARN: Code restructure failed: missing block: B:59:0x00b1, code lost:
    
        if (r0 != '?') goto L61;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static android.content.Intent A0a(android.content.Context r10, java.lang.String r11, char[] r12, int r13) {
        /*
            Method dump skipped, instructions count: 312
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC35278FhD.A0a(android.content.Context, java.lang.String, char[], int):android.content.Intent");
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x004f, code lost:
    
        if (r6 != null) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0062, code lost:
    
        if (r6 != null) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x009d, code lost:
    
        if (r2 != '?') goto L48;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static android.content.Intent A0b(android.content.Context r13, java.lang.String r14, char[] r15, int r16) {
        /*
            Method dump skipped, instructions count: 372
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC35278FhD.A0b(android.content.Context, java.lang.String, char[], int):android.content.Intent");
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0055, code lost:
    
        if (r2 != '?') goto L28;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:35:0x008c. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0097 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0095 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static android.content.Intent A0c(android.content.Context r10, java.lang.String r11, char[] r12, int r13) {
        /*
            Method dump skipped, instructions count: 296
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC35278FhD.A0c(android.content.Context, java.lang.String, char[], int):android.content.Intent");
    }

    /* JADX WARN: Code restructure failed: missing block: B:115:0x0171, code lost:
    
        if (r5 != null) goto L117;
     */
    /* JADX WARN: Code restructure failed: missing block: B:119:0x0184, code lost:
    
        if (r5 != null) goto L117;
     */
    /* JADX WARN: Code restructure failed: missing block: B:147:0x01d5, code lost:
    
        if (r2 != '?') goto L150;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x00a3, code lost:
    
        if (r5 != null) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x00b6, code lost:
    
        if (r5 != null) goto L51;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static android.content.Intent A0d(android.content.Context r12, java.lang.String r13, char[] r14, int r15) {
        /*
            Method dump skipped, instructions count: 583
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC35278FhD.A0d(android.content.Context, java.lang.String, char[], int):android.content.Intent");
    }

    /* JADX WARN: Code restructure failed: missing block: B:135:0x0193, code lost:
    
        if (r2 != '?') goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0061, code lost:
    
        if (r2 != '?') goto L33;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static android.content.Intent A0e(android.content.Context r13, java.lang.String r14, char[] r15, int r16) {
        /*
            Method dump skipped, instructions count: 636
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC35278FhD.A0e(android.content.Context, java.lang.String, char[], int):android.content.Intent");
    }

    /* JADX WARN: Code restructure failed: missing block: B:123:0x0173, code lost:
    
        if (r0 != '?') goto L122;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static android.content.Intent A0f(android.content.Context r14, java.lang.String r15, char[] r16, int r17) {
        /*
            Method dump skipped, instructions count: 720
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC35278FhD.A0f(android.content.Context, java.lang.String, char[], int):android.content.Intent");
    }

    /* JADX WARN: Code restructure failed: missing block: B:57:0x00ab, code lost:
    
        if (r0 != '?') goto L59;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static android.content.Intent A0g(android.content.Context r9, java.lang.String r10, char[] r11, int r12) {
        /*
            Method dump skipped, instructions count: 281
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC35278FhD.A0g(android.content.Context, java.lang.String, char[], int):android.content.Intent");
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x002a, code lost:
    
        if (r1 != '?') goto L13;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static android.content.Intent A0h(android.content.Context r15, java.lang.String r16, char[] r17, int r18) {
        /*
            Method dump skipped, instructions count: 308
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC35278FhD.A0h(android.content.Context, java.lang.String, char[], int):android.content.Intent");
    }

    /* JADX WARN: Code restructure failed: missing block: B:128:0x0171, code lost:
    
        if (r7 != null) goto L114;
     */
    /* JADX WARN: Code restructure failed: missing block: B:140:0x0197, code lost:
    
        if (r0 != '?') goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0075, code lost:
    
        if (r0 != '?') goto L38;
     */
    /* JADX WARN: Removed duplicated region for block: B:180:0x0220  */
    /* JADX WARN: Removed duplicated region for block: B:206:0x026e  */
    /* JADX WARN: Removed duplicated region for block: B:210:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static android.content.Intent A0i(android.content.Context r14, java.lang.String r15, char[] r16, int r17) {
        /*
            Method dump skipped, instructions count: 657
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC35278FhD.A0i(android.content.Context, java.lang.String, char[], int):android.content.Intent");
    }

    /* JADX WARN: Code restructure failed: missing block: B:57:0x00bf, code lost:
    
        if (r1 != '?') goto L59;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static android.content.Intent A0j(android.content.Context r19, java.lang.String r20, char[] r21, int r22) {
        /*
            Method dump skipped, instructions count: 651
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC35278FhD.A0j(android.content.Context, java.lang.String, char[], int):android.content.Intent");
    }

    /* JADX WARN: Code restructure failed: missing block: B:148:0x01b8, code lost:
    
        if (r14 != false) goto L132;
     */
    /* JADX WARN: Code restructure failed: missing block: B:224:0x0288, code lost:
    
        if (r8 != null) goto L198;
     */
    /* JADX WARN: Code restructure failed: missing block: B:401:0x0411, code lost:
    
        if (r0 != '?') goto L321;
     */
    /* JADX WARN: Code restructure failed: missing block: B:542:0x0590, code lost:
    
        if (r0 != '?') goto L95;
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x0120, code lost:
    
        if (r0 != '?') goto L95;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:102:0x015b. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:551:0x05ca. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0166 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0164 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:231:0x02b2  */
    /* JADX WARN: Removed duplicated region for block: B:555:0x05d5 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:559:0x05d3 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static android.content.Intent A0k(android.content.Context r17, java.lang.String r18, char[] r19, int r20) {
        /*
            Method dump skipped, instructions count: 1788
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC35278FhD.A0k(android.content.Context, java.lang.String, char[], int):android.content.Intent");
    }

    /* JADX WARN: Code restructure failed: missing block: B:176:0x0214, code lost:
    
        if (r2 != '?') goto L152;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x007e, code lost:
    
        if (r0 != '?') goto L42;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static android.content.Intent A0l(android.content.Context r13, java.lang.String r14, char[] r15, int r16) {
        /*
            Method dump skipped, instructions count: 678
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC35278FhD.A0l(android.content.Context, java.lang.String, char[], int):android.content.Intent");
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:47:0x00c0. Please report as an issue. */
    public static Intent A0m(Context context, String str, char[] cArr, int i) {
        String str2;
        String substring;
        String str3;
        String substring2;
        String str4;
        if (19 < i && cArr[19] == '/' && (20 >= i || cArr[20] != '?')) {
            Bundle A0C = AbstractC31174DnI.A0C();
            Bundle bundle = null;
            int[] A09 = AbstractC35268Fh3.A09(A0C, "VALUE", cArr, 20);
            Intent intent = null;
            if (A09 == null) {
                return null;
            }
            int i2 = A09[0];
            int i3 = A09[1];
            if (i3 >= 1 && i3 <= 3) {
                AbstractC35268Fh3.A07(A0C, "VALUE", cArr, 20, i2);
                if (i <= i2) {
                    intent = A0E(context, A0C, str);
                    if (intent != null) {
                        str2 = "https://www.instagram.com/j/{VALUE}";
                        intent.putExtra("matched_pattern", str2);
                        intent.putExtra("access_scope", "PUBLIC");
                        intent.putExtra("enforce_scope", true);
                        A1m(intent);
                        intent.putExtra("app_set", "[]");
                    }
                    return intent;
                }
                int i4 = i2 + 1;
                char c = cArr[i2];
                if (c == '/') {
                    int[] A092 = AbstractC35268Fh3.A09(A0C, "content", cArr, i4);
                    if (A092 != null) {
                        int i5 = A092[0];
                        int i6 = A092[1];
                        if (i6 >= 1 && i6 <= 3) {
                            AbstractC35268Fh3.A07(A0C, "content", cArr, i4, i5);
                            if (i <= i5) {
                                intent = A0E(context, A0C, str);
                                if (intent != null) {
                                    str2 = "https://www.instagram.com/j/{VALUE}/{content}";
                                    intent.putExtra("matched_pattern", str2);
                                    intent.putExtra("access_scope", "PUBLIC");
                                    intent.putExtra("enforce_scope", true);
                                    A1m(intent);
                                    intent.putExtra("app_set", "[]");
                                }
                            } else {
                                int i7 = i5 + 1;
                                char c2 = cArr[i5];
                                if (c2 == '/') {
                                    c2 = cArr[i7];
                                    i7++;
                                }
                                if (c2 == '?') {
                                    int i8 = i - i7;
                                    String A0i = AbstractC31171DnF.A0i(cArr, i7, i8);
                                    int i9 = 0;
                                    while (true) {
                                        if (i9 < i8) {
                                            int A01 = A01(A0i, i9);
                                            if (A01 >= 0) {
                                                String substring3 = A0i.substring(i9, A01);
                                                int A00 = A00(A0i, A01);
                                                int i10 = A01 + 1;
                                                if (A00 > 0) {
                                                    substring2 = A0i.substring(i10, A00);
                                                    i9 = A00 + 1;
                                                } else {
                                                    substring2 = A0i.substring(i10);
                                                    i9 = A0i.length();
                                                }
                                                switch (substring3.hashCode()) {
                                                    case -1281232384:
                                                        if (!A1y(substring3)) {
                                                            bundle = A1j(substring3, substring2, bundle);
                                                            break;
                                                        } else {
                                                            str4 = PublicKeyCredentialControllerUtility.JSON_KEY_ID;
                                                            A0C.putString(str4, substring2);
                                                            break;
                                                        }
                                                    case 115:
                                                        if (!A1x(substring3)) {
                                                            bundle = A1j(substring3, substring2, bundle);
                                                            break;
                                                        } else {
                                                            str4 = CacheBehaviorLogger.SOURCE;
                                                            A0C.putString(str4, substring2);
                                                            break;
                                                        }
                                                    case 3230707:
                                                        if (!substring3.equals("igsh")) {
                                                            bundle = A1j(substring3, substring2, bundle);
                                                            break;
                                                        } else {
                                                            str4 = "share_id";
                                                            A0C.putString(str4, substring2);
                                                            break;
                                                        }
                                                    default:
                                                        bundle = A1j(substring3, substring2, bundle);
                                                        break;
                                                }
                                            }
                                        } else {
                                            intent = A0E(context, A0C, str);
                                            if (intent != null) {
                                                str2 = "https://www.instagram.com/j/{VALUE}/{content}?s={?source}&fbclid={?id}";
                                            }
                                        }
                                    }
                                }
                            }
                        } else {
                            throw A1k(i6);
                        }
                    }
                    return intent;
                }
                if (c == '?') {
                    int i11 = i - i4;
                    String A0i2 = AbstractC31171DnF.A0i(cArr, i4, i11);
                    int i12 = 0;
                    while (true) {
                        if (i12 < i11) {
                            int A012 = A01(A0i2, i12);
                            if (A012 < 0) {
                                break;
                            }
                            String substring4 = A0i2.substring(i12, A012);
                            int A002 = A00(A0i2, A012);
                            int i13 = A012 + 1;
                            if (A002 > 0) {
                                substring = A0i2.substring(i13, A002);
                                i12 = A002 + 1;
                            } else {
                                substring = A0i2.substring(i13);
                                i12 = A0i2.length();
                            }
                            if (!A1y(substring4)) {
                                if (!A1x(substring4)) {
                                    bundle = A1j(substring4, substring, bundle);
                                } else {
                                    str3 = CacheBehaviorLogger.SOURCE;
                                }
                            } else {
                                str3 = PublicKeyCredentialControllerUtility.JSON_KEY_ID;
                            }
                            A0C.putString(str3, substring);
                        } else {
                            intent = A0E(context, A0C, str);
                            if (intent != null) {
                                str2 = "https://www.instagram.com/j/{VALUE}?s={?source}&fbclid={?id}";
                            }
                        }
                    }
                }
                return intent;
            }
            throw A1k(i3);
        }
        return A1V(context, str, cArr, i);
    }

    /* JADX WARN: Code restructure failed: missing block: B:137:0x00d3, code lost:
    
        if (r2 != null) goto L60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:140:0x00e3, code lost:
    
        if (r2 != null) goto L60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x0154, code lost:
    
        if (r2 != '?') goto L102;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static android.content.Intent A0o(android.content.Context r14, java.lang.String r15, char[] r16, int r17) {
        /*
            Method dump skipped, instructions count: 493
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC35278FhD.A0o(android.content.Context, java.lang.String, char[], int):android.content.Intent");
    }

    /* JADX WARN: Code restructure failed: missing block: B:96:0x0123, code lost:
    
        if (r0 != '?') goto L98;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static android.content.Intent A0p(android.content.Context r10, java.lang.String r11, char[] r12, int r13) {
        /*
            Method dump skipped, instructions count: 394
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC35278FhD.A0p(android.content.Context, java.lang.String, char[], int):android.content.Intent");
    }

    public static Intent A0q(Context context, String str, char[] cArr, int i) {
        String str2;
        String substring;
        boolean z;
        Intent A00;
        String str3;
        String str4;
        String substring2;
        String str5;
        Intent intent = null;
        Bundle bundle = null;
        intent = null;
        intent = null;
        if (19 < i) {
            char c = cArr[19];
            if (c != '/') {
                if (c != 'a') {
                    if (c != 'o') {
                        if (c == 'r' && 20 < i) {
                            char c2 = cArr[20];
                            if (c2 != 'e') {
                                if (c2 == 'i' && 21 < i && cArr[21] == 'v' && 22 < i && cArr[22] == 'a' && 23 < i && cArr[23] == 'c' && 24 < i && cArr[24] == 'y' && 25 < i && cArr[25] == '/' && (26 >= i || cArr[26] != '?')) {
                                    if (AbstractC35268Fh3.A08("bundle", cArr, 26)) {
                                        if (32 < i) {
                                            z = true;
                                            A00 = AbstractC35268Fh3.A03(context, "com.instagram.urlhandlers.privacybundle.PrivacyBundleUrlHandlerActivity", str, cArr, 32);
                                            if (A00 != null) {
                                                str4 = "https://www.instagram.com/privacy/bundle";
                                                A00.putExtra("matched_pattern", str4);
                                                A00.putExtra("access_scope", "SAME_APP");
                                                A00.putExtra("enforce_scope", z);
                                                A1m(A00);
                                                A00.putExtra("app_set", "[]");
                                                return A00;
                                            }
                                        } else {
                                            z = true;
                                            A00 = AbstractC35268Fh3.A00(context, null, "com.instagram.urlhandlers.privacybundle.PrivacyBundleUrlHandlerActivity", str);
                                            if (A00 != null) {
                                                str3 = "https://www.instagram.com/privacy/bundle";
                                                A00.putExtra("matched_pattern", str3);
                                                A00.putExtra("access_scope", "SAME_APP");
                                                A00.putExtra("enforce_scope", z);
                                                A1m(A00);
                                                A00.putExtra("app_set", "[]");
                                                return A00;
                                            }
                                            return A00;
                                        }
                                    }
                                    return null;
                                }
                            } else if (21 < i && cArr[21] == 'f' && 22 < i && cArr[22] == 'e' && 23 < i && cArr[23] == 'r' && 24 < i && cArr[24] == 'r' && 25 < i && cArr[25] == 'e' && 26 < i && cArr[26] == 'd' && 27 < i && cArr[27] == '_' && 28 < i && cArr[28] == 'b' && 29 < i && cArr[29] == 'u' && 30 < i && cArr[30] == 's' && 31 < i && cArr[31] == 'i' && 32 < i && cArr[32] == 'n' && 33 < i && cArr[33] == 'e' && 34 < i && cArr[34] == 's' && 35 < i && cArr[35] == 's' && 36 < i && cArr[36] == 'e' && 37 < i && cArr[37] == 's' && 38 < i && cArr[38] == '/' && (39 >= i || cArr[39] != '?')) {
                                if (!AbstractC35268Fh3.A08("link_account/", cArr, 39)) {
                                    return null;
                                }
                                Bundle A0C = AbstractC31174DnI.A0C();
                                A00 = null;
                                int[] A09 = AbstractC35268Fh3.A09(A0C, "consent_flow_name", cArr, 52);
                                if (A09 != null) {
                                    int i2 = 0;
                                    int i3 = A09[0];
                                    int i4 = A09[1];
                                    if (i4 >= 1 && i4 <= 3) {
                                        AbstractC35268Fh3.A07(A0C, "consent_flow_name", cArr, 52, i3);
                                        if (i > i3) {
                                            int i5 = i3 + 1;
                                            char c3 = cArr[i3];
                                            if (c3 == '/') {
                                                c3 = cArr[i5];
                                                i5++;
                                            }
                                            if (c3 == '?') {
                                                int i6 = i - i5;
                                                String A0i = AbstractC31171DnF.A0i(cArr, i5, i6);
                                                int i7 = 0;
                                                while (true) {
                                                    if (i2 < i6) {
                                                        int A01 = A01(A0i, i2);
                                                        if (A01 < 0) {
                                                            break;
                                                        }
                                                        String substring3 = A0i.substring(i2, A01);
                                                        int A002 = A00(A0i, A01);
                                                        int i8 = A01 + 1;
                                                        if (A002 > 0) {
                                                            substring2 = A0i.substring(i8, A002);
                                                            i2 = A002 + 1;
                                                        } else {
                                                            substring2 = A0i.substring(i8);
                                                            i2 = A0i.length();
                                                        }
                                                        if (!substring3.equals(CacheBehaviorLogger.SOURCE)) {
                                                            str5 = "extra_params";
                                                            if (!substring3.equals("extra_params")) {
                                                                bundle = A1j(substring3, substring2, bundle);
                                                            } else {
                                                                i7 |= 1;
                                                            }
                                                        } else {
                                                            i7 |= 2;
                                                            str5 = "partnership_name";
                                                        }
                                                        A0C.putString(str5, substring2);
                                                    } else if ((i7 | 2) == i7 && (A00 = AbstractC35268Fh3.A00(context, A0C, "com.instagram.urlhandlers.bwp.AmazonAccountLinkingUrlHandlerActivity", str)) != null) {
                                                        A1o(A00, "https://www.instagram.com/preferred_businesses/link_account/{consent_flow_name}?source={partnership_name}&extra_params={?extra_params}");
                                                        A00.putExtra("enforce_scope", true);
                                                        A1m(A00);
                                                        A00.putExtra("app_set", "[]");
                                                        return A00;
                                                    }
                                                }
                                            }
                                        }
                                    } else {
                                        throw A1k(i4);
                                    }
                                }
                                return A00;
                            }
                        }
                    } else if (20 < i && cArr[20] == 'r' && 21 < i && cArr[21] == 't' && 22 < i && cArr[22] == 'f' && 23 < i && cArr[23] == 'o' && 24 < i && cArr[24] == 'l' && 25 < i && cArr[25] == 'i' && 26 < i && cArr[26] == 'o' && 27 < i && cArr[27] == '/' && (28 >= i || cArr[28] != '?')) {
                        Bundle A0C2 = AbstractC31174DnI.A0C();
                        A00 = null;
                        int[] A092 = AbstractC35268Fh3.A09(A0C2, "short_code", cArr, 28);
                        if (A092 != null) {
                            int A02 = A02(A092);
                            int i9 = A092[1];
                            if (i9 >= 1 && i9 <= 3) {
                                AbstractC35268Fh3.A07(A0C2, "short_code", cArr, 28, A02);
                                if (i <= A02 && (A00 = A05(context, A0C2, str)) != null) {
                                    A1o(A00, "https://www.instagram.com/portfolio/{short_code}");
                                    A00.putExtra("enforce_scope", true);
                                    A1m(A00);
                                    A00.putExtra("app_set", "[]");
                                    return A00;
                                }
                            } else {
                                throw A1k(i9);
                            }
                        }
                        return A00;
                    }
                } else {
                    z = true;
                    if (20 < i && cArr[20] == 'r' && 21 < i && cArr[21] == 'e' && 22 < i && cArr[22] == 'n' && 23 < i && cArr[23] == 't' && 24 < i && cArr[24] == 'a' && 25 < i && cArr[25] == 'l' && 26 < i && cArr[26] == '/' && (27 >= i || cArr[27] != '?')) {
                        if (AbstractC35268Fh3.A08("access/education", cArr, 27)) {
                            if (43 < i) {
                                A00 = AbstractC35268Fh3.A03(context, "com.instagram.urlhandlers.parentalaccesseducation.ParentalAccessEducationUrlHandlerActivity", str, cArr, 43);
                                if (A00 != null) {
                                    str4 = "https://www.instagram.com/parental/access/education";
                                    A00.putExtra("matched_pattern", str4);
                                    A00.putExtra("access_scope", "SAME_APP");
                                    A00.putExtra("enforce_scope", z);
                                    A1m(A00);
                                    A00.putExtra("app_set", "[]");
                                    return A00;
                                }
                            } else {
                                A00 = AbstractC35268Fh3.A00(context, null, "com.instagram.urlhandlers.parentalaccesseducation.ParentalAccessEducationUrlHandlerActivity", str);
                                if (A00 != null) {
                                    str3 = "https://www.instagram.com/parental/access/education";
                                    A00.putExtra("matched_pattern", str3);
                                    A00.putExtra("access_scope", "SAME_APP");
                                    A00.putExtra("enforce_scope", z);
                                    A1m(A00);
                                    A00.putExtra("app_set", "[]");
                                    return A00;
                                }
                                return A00;
                            }
                        }
                        return null;
                    }
                }
            } else if (20 >= i || cArr[20] != '?') {
                Bundle A0C3 = AbstractC31174DnI.A0C();
                int[] A093 = AbstractC35268Fh3.A09(A0C3, "media_id", cArr, 20);
                if (A093 != null) {
                    int A022 = A02(A093);
                    int i10 = A093[1];
                    if (i10 >= 1 && i10 <= 3) {
                        AbstractC35268Fh3.A07(A0C3, "media_id", cArr, 20, A022);
                        if (i <= A022) {
                            intent = A0A(context, A0C3, str);
                            if (intent != null) {
                                str2 = "https://www.instagram.com/p/{media_id}";
                                intent.putExtra("matched_pattern", str2);
                                intent.putExtra("access_scope", "PUBLIC");
                                intent.putExtra("enforce_scope", true);
                                A1m(intent);
                                intent.putExtra("app_set", "[]");
                            }
                        } else {
                            int i11 = A022 + 1;
                            char c4 = cArr[A022];
                            if (c4 == '/') {
                                c4 = cArr[i11];
                                i11++;
                            }
                            if (c4 == '?') {
                                int i12 = i - i11;
                                String A0i2 = AbstractC31171DnF.A0i(cArr, i11, i12);
                                Bundle bundle2 = null;
                                int i13 = 0;
                                while (true) {
                                    if (i13 < i12) {
                                        int A012 = A01(A0i2, i13);
                                        if (A012 < 0) {
                                            break;
                                        }
                                        String substring4 = A0i2.substring(i13, A012);
                                        int A003 = A00(A0i2, A012);
                                        int i14 = A012 + 1;
                                        if (A003 > 0) {
                                            substring = A0i2.substring(i14, A003);
                                            i13 = A003 + 1;
                                        } else {
                                            substring = A0i2.substring(i14);
                                            i13 = A0i2.length();
                                        }
                                        String str6 = "extra";
                                        if (!substring4.equals("extra")) {
                                            str6 = "comment_id";
                                            if (!substring4.equals("comment_id")) {
                                                bundle2 = A1j(substring4, substring, bundle2);
                                            }
                                        }
                                        A0C3.putString(str6, substring);
                                    } else {
                                        intent = A0A(context, A0C3, str);
                                        if (intent != null) {
                                            str2 = "https://www.instagram.com/p/{media_id}?comment_id={?comment_id}";
                                        }
                                    }
                                }
                            }
                        }
                    } else {
                        throw A1k(i10);
                    }
                }
                return intent;
            }
        }
        return A1V(context, str, cArr, i);
    }

    /* JADX WARN: Code restructure failed: missing block: B:298:0x0397, code lost:
    
        if (r0 != '?') goto L255;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0073, code lost:
    
        if (r0 != '?') goto L37;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static android.content.Intent A0r(android.content.Context r17, java.lang.String r18, char[] r19, int r20) {
        /*
            Method dump skipped, instructions count: 1289
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC35278FhD.A0r(android.content.Context, java.lang.String, char[], int):android.content.Intent");
    }

    /* JADX WARN: Code restructure failed: missing block: B:337:0x0406, code lost:
    
        if (r1 != null) goto L324;
     */
    /* JADX WARN: Code restructure failed: missing block: B:340:0x0415, code lost:
    
        if (r1 != null) goto L324;
     */
    /* JADX WARN: Code restructure failed: missing block: B:390:0x04b5, code lost:
    
        if (r1 != null) goto L380;
     */
    /* JADX WARN: Code restructure failed: missing block: B:395:0x04c8, code lost:
    
        if (r1 != null) goto L380;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x00e0, code lost:
    
        if (r1 != null) goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x00f6, code lost:
    
        if (r1 != null) goto L64;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static android.content.Intent A0s(android.content.Context r18, java.lang.String r19, char[] r20, int r21) {
        /*
            Method dump skipped, instructions count: 1439
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC35278FhD.A0s(android.content.Context, java.lang.String, char[], int):android.content.Intent");
    }

    /* JADX WARN: Code restructure failed: missing block: B:178:0x0238, code lost:
    
        if (r2 != '?') goto L165;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x004b, code lost:
    
        if (r1 != '?') goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x029a, code lost:
    
        A1q(r10, r0);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static android.content.Intent A0t(android.content.Context r16, java.lang.String r17, char[] r18, int r19) {
        /*
            Method dump skipped, instructions count: 675
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC35278FhD.A0t(android.content.Context, java.lang.String, char[], int):android.content.Intent");
    }

    /* JADX WARN: Code restructure failed: missing block: B:50:0x00a0, code lost:
    
        if (r1 != '?') goto L52;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static android.content.Intent A0u(android.content.Context r15, java.lang.String r16, char[] r17, int r18) {
        /*
            Method dump skipped, instructions count: 426
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC35278FhD.A0u(android.content.Context, java.lang.String, char[], int):android.content.Intent");
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x006b, code lost:
    
        if (r2 != '?') goto L34;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static android.content.Intent A0v(android.content.Context r14, java.lang.String r15, char[] r16, int r17) {
        /*
            Method dump skipped, instructions count: 298
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC35278FhD.A0v(android.content.Context, java.lang.String, char[], int):android.content.Intent");
    }

    /* JADX WARN: Code restructure failed: missing block: B:278:0x0333, code lost:
    
        if (r2 != '?') goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:341:0x047e, code lost:
    
        if (r2 != '?') goto L327;
     */
    /* JADX WARN: Code restructure failed: missing block: B:393:0x03db, code lost:
    
        if (r2 != '?') goto L327;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x00bc, code lost:
    
        if (r2 != '?') goto L58;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:65:0x00fd. Please report as an issue. */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static android.content.Intent A0x(android.content.Context r20, java.lang.String r21, char[] r22, int r23) {
        /*
            Method dump skipped, instructions count: 1388
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC35278FhD.A0x(android.content.Context, java.lang.String, char[], int):android.content.Intent");
    }

    /* JADX WARN: Code restructure failed: missing block: B:121:0x0184, code lost:
    
        switch(r12) {
            case 0: goto L472;
            case 1: goto L471;
            case 2: goto L470;
            case 3: goto L469;
            default: goto L474;
        };
     */
    /* JADX WARN: Code restructure failed: missing block: B:123:0x018c, code lost:
    
        r11 = r11 | 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:124:0x0197, code lost:
    
        r9 = A1i(r9);
        r9.putString("VALUE", r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:128:0x018f, code lost:
    
        r11 = r11 | 8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:130:0x0192, code lost:
    
        r11 = r11 | 4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:132:0x0195, code lost:
    
        r11 = r11 | 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:134:0x0187, code lost:
    
        r5 = A1j(r3, r2, r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:137:0x01bd, code lost:
    
        if (r0 == false) goto L113;
     */
    /* JADX WARN: Code restructure failed: missing block: B:241:0x0431, code lost:
    
        if (r8 != null) goto L323;
     */
    /* JADX WARN: Code restructure failed: missing block: B:284:0x05a2, code lost:
    
        if (r2 != '?') goto L434;
     */
    /* JADX WARN: Code restructure failed: missing block: B:363:0x037d, code lost:
    
        if (r9 != null) goto L266;
     */
    /* JADX WARN: Code restructure failed: missing block: B:367:0x038f, code lost:
    
        if (r9 != null) goto L266;
     */
    /* JADX WARN: Code restructure failed: missing block: B:466:0x04e2, code lost:
    
        if (r2 != '?') goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x00d9, code lost:
    
        if (r2 != '?') goto L66;
     */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0162  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x01c9 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:247:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static android.content.Intent A15(android.content.Context r19, java.lang.String r20, char[] r21, int r22) {
        /*
            Method dump skipped, instructions count: 1574
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC35278FhD.A15(android.content.Context, java.lang.String, char[], int):android.content.Intent");
    }

    /* JADX WARN: Code restructure failed: missing block: B:268:0x03b4, code lost:
    
        if (r2 != '?') goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:407:0x04c3, code lost:
    
        if (r2 != '?') goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:508:0x05de, code lost:
    
        if (r2 != '?') goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x00b0, code lost:
    
        if (r0 != '?') goto L59;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:517:0x061b. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:521:0x0626 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:525:0x0624 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static android.content.Intent A16(android.content.Context r18, java.lang.String r19, char[] r20, int r21) {
        /*
            Method dump skipped, instructions count: 1780
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC35278FhD.A16(android.content.Context, java.lang.String, char[], int):android.content.Intent");
    }

    /* JADX WARN: Code restructure failed: missing block: B:153:0x04b5, code lost:
    
        if (r1 != '?') goto L347;
     */
    /* JADX WARN: Code restructure failed: missing block: B:242:0x0229, code lost:
    
        if (r2 != null) goto L157;
     */
    /* JADX WARN: Code restructure failed: missing block: B:245:0x0233, code lost:
    
        if (r2 != null) goto L157;
     */
    /* JADX WARN: Code restructure failed: missing block: B:302:0x02e0, code lost:
    
        if (r2 != '?') goto L347;
     */
    /* JADX WARN: Code restructure failed: missing block: B:390:0x03de, code lost:
    
        if (r2 != '?') goto L347;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x00dc, code lost:
    
        if (r2 != null) goto L67;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x00f6, code lost:
    
        if (r2 != null) goto L67;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:79:0x0131. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:113:0x017c A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:73:0x010f  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x013f A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:87:0x013c A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static android.content.Intent A17(android.content.Context r17, java.lang.String r18, char[] r19, int r20) {
        /*
            Method dump skipped, instructions count: 1408
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC35278FhD.A17(android.content.Context, java.lang.String, char[], int):android.content.Intent");
    }

    public static Intent A18(Context context, String str, char[] cArr, int i) {
        Bundle A0C = AbstractC31174DnI.A0C();
        Intent intent = null;
        int[] A09 = AbstractC35268Fh3.A09(A0C, "deeplink", cArr, 22);
        if (A09 != null) {
            int A02 = A02(A09);
            int i2 = A09[1];
            if (i2 >= 1 && i2 <= 3) {
                AbstractC35268Fh3.A07(A0C, "deeplink", cArr, 22, A02);
                if (i <= A02 && (intent = AbstractC35268Fh3.A00(context, A0C, "com.instagram.urlhandlers.mdpmap.MdpInstagramUniversalDeeplinkRedirectionActivity", str)) != null) {
                    A1q(intent, "http://instagram.com/linking/{deeplink}");
                }
            } else {
                throw A1k(i2);
            }
        }
        return intent;
    }

    public static Intent A19(Context context, String str, char[] cArr, int i) {
        String str2;
        String substring;
        Bundle A0C = AbstractC31174DnI.A0C();
        Bundle bundle = null;
        int[] A09 = AbstractC35268Fh3.A09(A0C, "clip_id", cArr, 20);
        Intent intent = null;
        if (A09 == null) {
            return null;
        }
        int A02 = A02(A09);
        int i2 = A09[1];
        if (i2 >= 1 && i2 <= 3) {
            AbstractC35268Fh3.A07(A0C, "clip_id", cArr, 20, A02);
            if (i <= A02) {
                intent = A07(context, A0C, str);
                if (intent != null) {
                    str2 = "http://instagram.com/reels/{clip_id}";
                    intent.putExtra("matched_pattern", str2);
                    intent.putExtra("access_scope", "PUBLIC");
                    intent.putExtra("enforce_scope", true);
                    A1m(intent);
                    intent.putExtra("app_set", "[]");
                }
                return intent;
            }
            int i3 = A02 + 1;
            char c = cArr[A02];
            if (c == '/') {
                c = cArr[i3];
                i3++;
            }
            if (c == '?') {
                int i4 = i - i3;
                String A0i = AbstractC31171DnF.A0i(cArr, i3, i4);
                int i5 = 0;
                while (true) {
                    if (i5 < i4) {
                        int A01 = A01(A0i, i5);
                        if (A01 < 0) {
                            break;
                        }
                        String substring2 = A0i.substring(i5, A01);
                        int A00 = A00(A0i, A01);
                        int i6 = A01 + 1;
                        if (A00 > 0) {
                            substring = A0i.substring(i6, A00);
                            i5 = A00 + 1;
                        } else {
                            substring = A0i.substring(i6);
                            i5 = A0i.length();
                        }
                        bundle = A1f(A0C, bundle, substring2, substring);
                    } else {
                        intent = A07(context, A0C, str);
                        if (intent != null) {
                            str2 = "http://instagram.com/reels/{clip_id}?extra={?extra}";
                        }
                    }
                }
            }
            return intent;
        }
        throw A1k(i2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:168:0x01f6, code lost:
    
        if (r1 != null) goto L318;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static android.content.Intent A1A(android.content.Context r18, java.lang.String r19, char[] r20, int r21) {
        /*
            Method dump skipped, instructions count: 1316
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC35278FhD.A1A(android.content.Context, java.lang.String, char[], int):android.content.Intent");
    }

    public static Intent A1B(Context context, String str, char[] cArr, int i) {
        Bundle A0C = AbstractC31174DnI.A0C();
        Intent intent = null;
        int[] A09 = AbstractC35268Fh3.A09(A0C, "deeplink", cArr, 26);
        if (A09 != null) {
            int A02 = A02(A09);
            int i2 = A09[1];
            if (i2 >= 1 && i2 <= 3) {
                AbstractC35268Fh3.A07(A0C, "deeplink", cArr, 26, A02);
                if (i <= A02 && (intent = AbstractC35268Fh3.A00(context, A0C, "com.instagram.urlhandlers.mdpmap.MdpInstagramUniversalDeeplinkRedirectionActivity", str)) != null) {
                    A1q(intent, "http://www.instagram.com/linking/{deeplink}");
                }
            } else {
                throw A1k(i2);
            }
        }
        return intent;
    }

    public static Intent A1C(Context context, String str, char[] cArr, int i) {
        String str2;
        String substring;
        String substring2;
        Bundle A0C = AbstractC31174DnI.A0C();
        Bundle bundle = null;
        int[] A09 = AbstractC35268Fh3.A09(A0C, "explore_type", cArr, 30);
        if (A09 != null) {
            int i2 = A09[0];
            int i3 = A09[1];
            if (i3 >= 1 && i3 <= 3) {
                AbstractC35268Fh3.A07(A0C, "explore_type", cArr, 30, i2);
                if (i > i2) {
                    int i4 = i2 + 1;
                    if (cArr[i2] == '/') {
                        int[] A092 = AbstractC35268Fh3.A09(A0C, "explore_param", cArr, i4);
                        Intent intent = null;
                        if (A092 != null) {
                            int i5 = A092[0];
                            int i6 = A092[1];
                            if (i6 >= 1 && i6 <= 3) {
                                AbstractC35268Fh3.A07(A0C, "explore_param", cArr, i4, i5);
                                if (i <= i5) {
                                    intent = A0F(context, A0C, str);
                                    if (intent != null) {
                                        str2 = "http://applink.instagram.com/explore/{explore_type}/{explore_param}";
                                        intent.putExtra("matched_pattern", str2);
                                        intent.putExtra("access_scope", "PUBLIC");
                                        intent.putExtra("enforce_scope", true);
                                        A1m(intent);
                                        intent.putExtra("app_set", "[]");
                                    }
                                } else {
                                    int i7 = i5 + 1;
                                    char c = cArr[i5];
                                    if (c == '/') {
                                        int[] A093 = AbstractC35268Fh3.A09(A0C, "dummy", cArr, i7);
                                        if (A093 != null) {
                                            int i8 = A093[0];
                                            int i9 = A093[1];
                                            if (i9 >= 1 && i9 <= 3) {
                                                AbstractC35268Fh3.A07(A0C, "dummy", cArr, i7, i8);
                                                if (i <= i8) {
                                                    intent = A0F(context, A0C, str);
                                                    if (intent != null) {
                                                        str2 = "http://applink.instagram.com/explore/{explore_type}/{explore_param}/{dummy}";
                                                        intent.putExtra("matched_pattern", str2);
                                                        intent.putExtra("access_scope", "PUBLIC");
                                                        intent.putExtra("enforce_scope", true);
                                                        A1m(intent);
                                                        intent.putExtra("app_set", "[]");
                                                    }
                                                } else {
                                                    int i10 = i8 + 1;
                                                    char c2 = cArr[i8];
                                                    if (c2 == '/') {
                                                        c2 = cArr[i10];
                                                        i10++;
                                                    }
                                                    if (c2 == '?') {
                                                        int i11 = i - i10;
                                                        String A0i = AbstractC31171DnF.A0i(cArr, i10, i11);
                                                        int i12 = 0;
                                                        while (true) {
                                                            if (i12 < i11) {
                                                                int A01 = A01(A0i, i12);
                                                                if (A01 < 0) {
                                                                    break;
                                                                }
                                                                String substring3 = A0i.substring(i12, A01);
                                                                int A00 = A00(A0i, A01);
                                                                int i13 = A01 + 1;
                                                                if (A00 > 0) {
                                                                    substring2 = A0i.substring(i13, A00);
                                                                    i12 = A00 + 1;
                                                                } else {
                                                                    substring2 = A0i.substring(i13);
                                                                    i12 = A0i.length();
                                                                }
                                                                bundle = A1f(A0C, bundle, substring3, substring2);
                                                            } else {
                                                                intent = A0F(context, A0C, str);
                                                                if (intent != null) {
                                                                    str2 = "http://applink.instagram.com/explore/{explore_type}/{explore_param}/{dummy}?extra={?extra}";
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            } else {
                                                throw A1k(i9);
                                            }
                                        }
                                    } else if (c == '?') {
                                        int i14 = i - i7;
                                        String A0i2 = AbstractC31171DnF.A0i(cArr, i7, i14);
                                        int i15 = 0;
                                        while (true) {
                                            if (i15 < i14) {
                                                int A012 = A01(A0i2, i15);
                                                if (A012 < 0) {
                                                    break;
                                                }
                                                String substring4 = A0i2.substring(i15, A012);
                                                int A002 = A00(A0i2, A012);
                                                int i16 = A012 + 1;
                                                if (A002 > 0) {
                                                    substring = A0i2.substring(i16, A002);
                                                    i15 = A002 + 1;
                                                } else {
                                                    substring = A0i2.substring(i16);
                                                    i15 = A0i2.length();
                                                }
                                                bundle = A1f(A0C, bundle, substring4, substring);
                                            } else {
                                                intent = A0F(context, A0C, str);
                                                if (intent != null) {
                                                    str2 = "http://applink.instagram.com/explore/{explore_type}/{explore_param}?extra={?extra}";
                                                }
                                            }
                                        }
                                    }
                                }
                            } else {
                                throw A1k(i6);
                            }
                        }
                        return intent;
                    }
                }
            } else {
                throw A1k(i3);
            }
        }
        return null;
    }

    public static Intent A1D(Context context, String str, char[] cArr, int i) {
        String str2;
        String substring;
        Bundle A0C = AbstractC31174DnI.A0C();
        Bundle bundle = null;
        int[] A09 = AbstractC35268Fh3.A09(A0C, "clip_id", cArr, 24);
        Intent intent = null;
        if (A09 == null) {
            return null;
        }
        int A02 = A02(A09);
        int i2 = A09[1];
        if (i2 >= 1 && i2 <= 3) {
            AbstractC35268Fh3.A07(A0C, "clip_id", cArr, 24, A02);
            if (i <= A02) {
                intent = A07(context, A0C, str);
                if (intent != null) {
                    str2 = "http://www.instagram.com/reels/{clip_id}";
                    intent.putExtra("matched_pattern", str2);
                    intent.putExtra("access_scope", "PUBLIC");
                    intent.putExtra("enforce_scope", true);
                    A1m(intent);
                    intent.putExtra("app_set", "[]");
                }
                return intent;
            }
            int i3 = A02 + 1;
            char c = cArr[A02];
            if (c == '/') {
                c = cArr[i3];
                i3++;
            }
            if (c == '?') {
                int i4 = i - i3;
                String A0i = AbstractC31171DnF.A0i(cArr, i3, i4);
                int i5 = 0;
                while (true) {
                    if (i5 < i4) {
                        int A01 = A01(A0i, i5);
                        if (A01 < 0) {
                            break;
                        }
                        String substring2 = A0i.substring(i5, A01);
                        int A00 = A00(A0i, A01);
                        int i6 = A01 + 1;
                        if (A00 > 0) {
                            substring = A0i.substring(i6, A00);
                            i5 = A00 + 1;
                        } else {
                            substring = A0i.substring(i6);
                            i5 = A0i.length();
                        }
                        bundle = A1f(A0C, bundle, substring2, substring);
                    } else {
                        intent = A07(context, A0C, str);
                        if (intent != null) {
                            str2 = "http://www.instagram.com/reels/{clip_id}?extra={?extra}";
                        }
                    }
                }
            }
            return intent;
        }
        throw A1k(i2);
    }

    public static Intent A1E(Context context, String str, char[] cArr, int i) {
        Intent intent;
        String str2;
        String str3;
        String str4;
        String str5;
        String substring;
        String substring2;
        String str6;
        String substring3;
        Intent intent2;
        String str7;
        String substring4;
        String str8;
        String str9;
        String str10;
        String str11;
        String str12;
        String str13;
        String str14;
        String substring5;
        int i2;
        String substring6;
        String str15;
        String substring7;
        String str16;
        String substring8;
        Bundle A0C = AbstractC31174DnI.A0C();
        Bundle bundle = null;
        Intent intent3 = null;
        int[] A09 = AbstractC35268Fh3.A09(A0C, "user_name", cArr, 22);
        if (A09 != null) {
            int i3 = A09[0];
            int i4 = A09[1];
            if (i4 >= 1 && i4 <= 3) {
                AbstractC35268Fh3.A07(A0C, "user_name", cArr, 22, i3);
                if (i > i3) {
                    int i5 = i3 + 1;
                    if (cArr[i3] == '/' && i5 < i) {
                        int i6 = i5 + 1;
                        char c = cArr[i5];
                        if (c != 'g') {
                            if (c != 'l') {
                                if (c != 'p') {
                                    if (c != 'r') {
                                        if (c == 't' && AbstractC35268Fh3.A08("v/", cArr, i6)) {
                                            int i7 = i6 + 2;
                                            int[] A092 = AbstractC35268Fh3.A09(A0C, "tv_id", cArr, i7);
                                            intent2 = null;
                                            if (A092 != null) {
                                                int i8 = A092[0];
                                                int i9 = A092[1];
                                                if (i9 >= 1 && i9 <= 3) {
                                                    AbstractC35268Fh3.A07(A0C, "tv_id", cArr, i7, i8);
                                                    if (i <= i8) {
                                                        intent2 = A04(context, A0C, str);
                                                        if (intent2 != null) {
                                                            str16 = "https://applink.instagram.com/{user_name}/tv/{tv_id}";
                                                            intent2.putExtra("matched_pattern", str16);
                                                            intent2.putExtra("access_scope", "PUBLIC");
                                                            intent2.putExtra("enforce_scope", true);
                                                            A1m(intent2);
                                                            intent2.putExtra("app_set", "[]");
                                                        }
                                                        return intent2;
                                                    }
                                                    int i10 = i8 + 1;
                                                    char c2 = cArr[i8];
                                                    if (c2 == '/') {
                                                        c2 = cArr[i10];
                                                        i10++;
                                                    }
                                                    if (c2 == '?') {
                                                        int i11 = i - i10;
                                                        String A0i = AbstractC31171DnF.A0i(cArr, i10, i11);
                                                        int i12 = 0;
                                                        while (true) {
                                                            if (i12 < i11) {
                                                                int A01 = A01(A0i, i12);
                                                                if (A01 < 0) {
                                                                    break;
                                                                }
                                                                String substring9 = A0i.substring(i12, A01);
                                                                int A00 = A00(A0i, A01);
                                                                int i13 = A01 + 1;
                                                                if (A00 > 0) {
                                                                    substring8 = A0i.substring(i13, A00);
                                                                    i12 = A00 + 1;
                                                                } else {
                                                                    substring8 = A0i.substring(i13);
                                                                    i12 = A0i.length();
                                                                }
                                                                bundle = A1e(A0C, bundle, substring9, substring8);
                                                            } else {
                                                                intent2 = A04(context, A0C, str);
                                                                if (intent2 != null) {
                                                                    str16 = "https://applink.instagram.com/{user_name}/tv/{tv_id}?igid={?extra}";
                                                                }
                                                            }
                                                        }
                                                    }
                                                    return intent2;
                                                }
                                                throw A1k(i9);
                                            }
                                        }
                                    } else if (AbstractC35268Fh3.A08("eel", cArr, i6) && (i2 = i6 + 3) < i) {
                                        int i14 = i2 + 1;
                                        char c3 = cArr[i2];
                                        if (c3 != '/') {
                                            if (c3 == 's' && i14 < i) {
                                                int i15 = i14 + 1;
                                                if (cArr[i14] == '/' && (i15 >= i || cArr[i15] != '?')) {
                                                    int[] A093 = AbstractC35268Fh3.A09(A0C, "clip_id", cArr, i15);
                                                    intent2 = null;
                                                    if (A093 != null) {
                                                        int i16 = A093[0];
                                                        int i17 = A093[1];
                                                        if (i17 >= 1 && i17 <= 3) {
                                                            AbstractC35268Fh3.A07(A0C, "clip_id", cArr, i15, i16);
                                                            if (i <= i16) {
                                                                intent2 = A07(context, A0C, str);
                                                                if (intent2 != null) {
                                                                    str15 = "https://applink.instagram.com/{user_name}/reels/{clip_id}";
                                                                    intent2.putExtra("matched_pattern", str15);
                                                                    intent2.putExtra("access_scope", "PUBLIC");
                                                                    intent2.putExtra("enforce_scope", true);
                                                                    A1m(intent2);
                                                                    intent2.putExtra("app_set", "[]");
                                                                    return intent2;
                                                                }
                                                                return intent2;
                                                            }
                                                            int i18 = i16 + 1;
                                                            char c4 = cArr[i16];
                                                            if (c4 == '/') {
                                                                c4 = cArr[i18];
                                                                i18++;
                                                            }
                                                            if (c4 == '?') {
                                                                int i19 = i - i18;
                                                                String A0i2 = AbstractC31171DnF.A0i(cArr, i18, i19);
                                                                int i20 = 0;
                                                                while (true) {
                                                                    if (i20 < i19) {
                                                                        int A012 = A01(A0i2, i20);
                                                                        if (A012 < 0) {
                                                                            break;
                                                                        }
                                                                        String substring10 = A0i2.substring(i20, A012);
                                                                        int A002 = A00(A0i2, A012);
                                                                        int i21 = A012 + 1;
                                                                        if (A002 > 0) {
                                                                            substring7 = A0i2.substring(i21, A002);
                                                                            i20 = A002 + 1;
                                                                        } else {
                                                                            substring7 = A0i2.substring(i21);
                                                                            i20 = A0i2.length();
                                                                        }
                                                                        bundle = A1f(A0C, bundle, substring10, substring7);
                                                                    } else {
                                                                        intent2 = A07(context, A0C, str);
                                                                        if (intent2 != null) {
                                                                            str15 = "https://applink.instagram.com/{user_name}/reels/{clip_id}?extra={?extra}";
                                                                        }
                                                                    }
                                                                }
                                                                intent2.putExtra("matched_pattern", str15);
                                                                intent2.putExtra("access_scope", "PUBLIC");
                                                                intent2.putExtra("enforce_scope", true);
                                                                A1m(intent2);
                                                                intent2.putExtra("app_set", "[]");
                                                                return intent2;
                                                            }
                                                            return intent2;
                                                        }
                                                        throw A1k(i17);
                                                    }
                                                }
                                            }
                                        } else if (i14 >= i || cArr[i14] != '?') {
                                            int[] A094 = AbstractC35268Fh3.A09(A0C, "clip_id", cArr, i14);
                                            intent2 = null;
                                            if (A094 != null) {
                                                int i22 = A094[0];
                                                int i23 = A094[1];
                                                if (i23 >= 1 && i23 <= 3) {
                                                    AbstractC35268Fh3.A07(A0C, "clip_id", cArr, i14, i22);
                                                    str8 = "app_set";
                                                    str9 = "enforce_scope";
                                                    str10 = "PUBLIC";
                                                    str11 = "access_scope";
                                                    str12 = "matched_pattern";
                                                    str13 = "[]";
                                                    if (i <= i22) {
                                                        intent2 = A07(context, A0C, str);
                                                        if (intent2 != null) {
                                                            str14 = "https://applink.instagram.com/{user_name}/reel/{clip_id}";
                                                            intent2.putExtra(str12, str14);
                                                            intent2.putExtra(str11, str10);
                                                            intent2.putExtra(str9, true);
                                                            A1m(intent2);
                                                            intent2.putExtra(str8, str13);
                                                            return intent2;
                                                        }
                                                        return intent2;
                                                    }
                                                    int i24 = i22 + 1;
                                                    char c5 = cArr[i22];
                                                    if (c5 == '/') {
                                                        c5 = cArr[i24];
                                                        i24++;
                                                    }
                                                    if (c5 == '?') {
                                                        int i25 = i - i24;
                                                        String A0i3 = AbstractC31171DnF.A0i(cArr, i24, i25);
                                                        int i26 = 0;
                                                        while (true) {
                                                            if (i26 < i25) {
                                                                int A013 = A01(A0i3, i26);
                                                                if (A013 < 0) {
                                                                    break;
                                                                }
                                                                String substring11 = A0i3.substring(i26, A013);
                                                                int A003 = A00(A0i3, A013);
                                                                int i27 = A013 + 1;
                                                                if (A003 > 0) {
                                                                    substring6 = A0i3.substring(i27, A003);
                                                                    i26 = A003 + 1;
                                                                } else {
                                                                    substring6 = A0i3.substring(i27);
                                                                    i26 = A0i3.length();
                                                                }
                                                                bundle = A1f(A0C, bundle, substring11, substring6);
                                                            } else {
                                                                intent2 = A07(context, A0C, str);
                                                                if (intent2 != null) {
                                                                    str14 = "https://applink.instagram.com/{user_name}/reel/{clip_id}?extra={?extra}";
                                                                }
                                                            }
                                                        }
                                                    }
                                                    return intent2;
                                                }
                                                throw A1k(i23);
                                            }
                                        }
                                    }
                                } else if (i6 < i) {
                                    int i28 = i6 + 1;
                                    char c6 = cArr[i6];
                                    if (c6 != '/') {
                                        if (c6 == 'o' && AbstractC35268Fh3.A08("rtfolio/", cArr, i28)) {
                                            int i29 = i28 + 8;
                                            intent2 = null;
                                            int[] A095 = AbstractC35268Fh3.A09(A0C, "short_code", cArr, i29);
                                            if (A095 != null) {
                                                int i30 = A095[0];
                                                int i31 = A095[1];
                                                if (i31 >= 1 && i31 <= 3) {
                                                    AbstractC35268Fh3.A07(A0C, "short_code", cArr, i29, i30);
                                                    if (i <= i30 && (intent2 = A05(context, A0C, str)) != null) {
                                                        str7 = "https://applink.instagram.com/{user_name}/portfolio/{short_code}";
                                                        A1q(intent2, str7);
                                                        return intent2;
                                                    }
                                                } else {
                                                    throw A1k(i31);
                                                }
                                            }
                                            return intent2;
                                        }
                                    } else if (i28 >= i || cArr[i28] != '?') {
                                        int[] A096 = AbstractC35268Fh3.A09(A0C, "media_id", cArr, i28);
                                        intent2 = null;
                                        if (A096 != null) {
                                            int i32 = A096[0];
                                            int i33 = A096[1];
                                            if (i33 >= 1 && i33 <= 3) {
                                                AbstractC35268Fh3.A07(A0C, "media_id", cArr, i28, i32);
                                                str8 = "app_set";
                                                str9 = "enforce_scope";
                                                str10 = "PUBLIC";
                                                str11 = "access_scope";
                                                str12 = "matched_pattern";
                                                str13 = "[]";
                                                if (i <= i32) {
                                                    intent2 = A0A(context, A0C, str);
                                                    if (intent2 != null) {
                                                        str14 = "https://applink.instagram.com/{user_name}/p/{media_id}";
                                                        intent2.putExtra(str12, str14);
                                                        intent2.putExtra(str11, str10);
                                                        intent2.putExtra(str9, true);
                                                        A1m(intent2);
                                                        intent2.putExtra(str8, str13);
                                                        return intent2;
                                                    }
                                                    return intent2;
                                                }
                                                int i34 = i32 + 1;
                                                char c7 = cArr[i32];
                                                if (c7 == '/') {
                                                    c7 = cArr[i34];
                                                    i34++;
                                                }
                                                if (c7 == '?') {
                                                    int i35 = i - i34;
                                                    String A0i4 = AbstractC31171DnF.A0i(cArr, i34, i35);
                                                    int i36 = 0;
                                                    while (true) {
                                                        if (i36 < i35) {
                                                            int A014 = A01(A0i4, i36);
                                                            if (A014 < 0) {
                                                                break;
                                                            }
                                                            String substring12 = A0i4.substring(i36, A014);
                                                            int A004 = A00(A0i4, A014);
                                                            int i37 = A014 + 1;
                                                            if (A004 > 0) {
                                                                substring5 = A0i4.substring(i37, A004);
                                                                i36 = A004 + 1;
                                                            } else {
                                                                substring5 = A0i4.substring(i37);
                                                                i36 = A0i4.length();
                                                            }
                                                            bundle = A1f(A0C, bundle, substring12, substring5);
                                                        } else {
                                                            intent2 = A0A(context, A0C, str);
                                                            if (intent2 != null) {
                                                                str14 = "https://applink.instagram.com/{user_name}/p/{media_id}?extra={?extra}";
                                                            }
                                                        }
                                                    }
                                                }
                                                return intent2;
                                            }
                                            throw A1k(i33);
                                        }
                                    }
                                }
                            } else if (AbstractC35268Fh3.A08("ive", cArr, i6)) {
                                int i38 = i6 + 3;
                                if (i38 < i) {
                                    int i39 = i38 + 1;
                                    char c8 = cArr[i38];
                                    if (c8 != '/') {
                                        if (c8 != '?') {
                                            return null;
                                        }
                                    } else if (i39 < i && cArr[i39] == '?') {
                                        i39++;
                                    } else {
                                        int[] A097 = AbstractC35268Fh3.A09(A0C, TraceFieldType.BroadcastId, cArr, i39);
                                        intent = null;
                                        if (A097 != null) {
                                            int i40 = A097[0];
                                            int i41 = A097[1];
                                            if (i41 >= 1 && i41 <= 3) {
                                                AbstractC35268Fh3.A07(A0C, TraceFieldType.BroadcastId, cArr, i39, i40);
                                                str2 = "app_set";
                                                str3 = "enforce_scope";
                                                str4 = "[]";
                                                if (i <= i40) {
                                                    intent = A09(context, A0C, str);
                                                    if (intent != null) {
                                                        str6 = "https://applink.instagram.com/{user_name}/live/{broadcast_id}";
                                                        intent.putExtra("matched_pattern", str6);
                                                        intent.putExtra("access_scope", "PUBLIC");
                                                    }
                                                    return intent;
                                                }
                                                int i42 = i40 + 1;
                                                char c9 = cArr[i40];
                                                if (c9 == '/') {
                                                    c9 = cArr[i42];
                                                    i42++;
                                                }
                                                if (c9 == '?') {
                                                    int i43 = i - i42;
                                                    String A0i5 = AbstractC31171DnF.A0i(cArr, i42, i43);
                                                    int i44 = 0;
                                                    while (true) {
                                                        if (i44 < i43) {
                                                            int A015 = A01(A0i5, i44);
                                                            if (A015 < 0) {
                                                                break;
                                                            }
                                                            String substring13 = A0i5.substring(i44, A015);
                                                            int A005 = A00(A0i5, A015);
                                                            int i45 = A015 + 1;
                                                            if (A005 > 0) {
                                                                substring3 = A0i5.substring(i45, A005);
                                                                i44 = A005 + 1;
                                                            } else {
                                                                substring3 = A0i5.substring(i45);
                                                                i44 = A0i5.length();
                                                            }
                                                            bundle = A1f(A0C, bundle, substring13, substring3);
                                                        } else {
                                                            intent = A09(context, A0C, str);
                                                            if (intent != null) {
                                                                str6 = "https://applink.instagram.com/{user_name}/live/{broadcast_id}?extra={?extra}";
                                                            }
                                                        }
                                                    }
                                                }
                                                return intent;
                                                intent.putExtra(str3, true);
                                                A1m(intent);
                                                intent.putExtra(str2, str4);
                                                return intent;
                                            }
                                            throw A1k(i41);
                                        }
                                    }
                                    int i46 = i - i39;
                                    String A0i6 = AbstractC31171DnF.A0i(cArr, i39, i46);
                                    intent2 = null;
                                    int i47 = 0;
                                    while (true) {
                                        if (i47 < i46) {
                                            int A016 = A01(A0i6, i47);
                                            if (A016 < 0) {
                                                break;
                                            }
                                            String substring14 = A0i6.substring(i47, A016);
                                            int A006 = A00(A0i6, A016);
                                            int i48 = A016 + 1;
                                            if (A006 > 0) {
                                                substring4 = A0i6.substring(i48, A006);
                                                i47 = A006 + 1;
                                            } else {
                                                substring4 = A0i6.substring(i48);
                                                i47 = A0i6.length();
                                            }
                                            bundle = A1f(A0C, bundle, substring14, substring4);
                                        } else {
                                            intent2 = A09(context, A0C, str);
                                            if (intent2 != null) {
                                                str7 = "https://applink.instagram.com/{user_name}/live?extra={?extra}";
                                            }
                                        }
                                    }
                                    return intent2;
                                }
                                intent3 = A09(context, A0C, str);
                                if (intent3 != null) {
                                    A1q(intent3, "https://applink.instagram.com/{user_name}/live");
                                    return intent3;
                                }
                            }
                        } else if (AbstractC35268Fh3.A08("uide/", cArr, i6)) {
                            int i49 = i6 + 5;
                            int[] A098 = AbstractC35268Fh3.A09(A0C, "id_or_title", cArr, i49);
                            intent = null;
                            if (A098 != null) {
                                int i50 = A098[0];
                                int i51 = A098[1];
                                if (i51 >= 1 && i51 <= 3) {
                                    AbstractC35268Fh3.A07(A0C, "id_or_title", cArr, i49, i50);
                                    str2 = "app_set";
                                    str3 = "enforce_scope";
                                    str4 = "[]";
                                    if (i <= i50) {
                                        intent = A0C(context, A0C, str);
                                        if (intent != null) {
                                            str5 = "https://applink.instagram.com/{user_name}/guide/{id_or_title}";
                                            intent.putExtra("matched_pattern", str5);
                                            intent.putExtra("access_scope", "PUBLIC");
                                        }
                                        return intent;
                                    }
                                    int i52 = i50 + 1;
                                    char c10 = cArr[i50];
                                    if (c10 == '/') {
                                        int[] A099 = AbstractC35268Fh3.A09(A0C, "guide_id", cArr, i52);
                                        if (A099 != null) {
                                            int i53 = A099[0];
                                            int i54 = A099[1];
                                            if (i54 >= 1 && i54 <= 3) {
                                                AbstractC35268Fh3.A07(A0C, "guide_id", cArr, i52, i53);
                                                if (i <= i53) {
                                                    intent = A0C(context, A0C, str);
                                                    if (intent != null) {
                                                        str5 = "https://applink.instagram.com/{user_name}/guide/{id_or_title}/{guide_id}";
                                                        intent.putExtra("matched_pattern", str5);
                                                        intent.putExtra("access_scope", "PUBLIC");
                                                    }
                                                } else {
                                                    int i55 = i53 + 1;
                                                    char c11 = cArr[i53];
                                                    if (c11 == '/') {
                                                        c11 = cArr[i55];
                                                        i55++;
                                                    }
                                                    if (c11 == '?') {
                                                        int i56 = i - i55;
                                                        String A0i7 = AbstractC31171DnF.A0i(cArr, i55, i56);
                                                        int i57 = 0;
                                                        while (true) {
                                                            if (i57 < i56) {
                                                                int A017 = A01(A0i7, i57);
                                                                if (A017 < 0) {
                                                                    break;
                                                                }
                                                                String substring15 = A0i7.substring(i57, A017);
                                                                int A007 = A00(A0i7, A017);
                                                                int i58 = A017 + 1;
                                                                if (A007 > 0) {
                                                                    substring2 = A0i7.substring(i58, A007);
                                                                    i57 = A007 + 1;
                                                                } else {
                                                                    substring2 = A0i7.substring(i58);
                                                                    i57 = A0i7.length();
                                                                }
                                                                bundle = A1g(A0C, bundle, substring15, "igshid", substring2);
                                                            } else {
                                                                intent = A0C(context, A0C, str);
                                                                if (intent != null) {
                                                                    str5 = "https://applink.instagram.com/{user_name}/guide/{id_or_title}/{guide_id}?igshid={?igshid}";
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            } else {
                                                throw A1k(i54);
                                            }
                                        }
                                        return intent;
                                    }
                                    if (c10 == '?') {
                                        int i59 = i - i52;
                                        String A0i8 = AbstractC31171DnF.A0i(cArr, i52, i59);
                                        int i60 = 0;
                                        while (true) {
                                            if (i60 < i59) {
                                                int A018 = A01(A0i8, i60);
                                                if (A018 < 0) {
                                                    break;
                                                }
                                                String substring16 = A0i8.substring(i60, A018);
                                                int A008 = A00(A0i8, A018);
                                                int i61 = A018 + 1;
                                                if (A008 > 0) {
                                                    substring = A0i8.substring(i61, A008);
                                                    i60 = A008 + 1;
                                                } else {
                                                    substring = A0i8.substring(i61);
                                                    i60 = A0i8.length();
                                                }
                                                bundle = A1g(A0C, bundle, substring16, "igshid", substring);
                                            } else {
                                                intent = A0C(context, A0C, str);
                                                if (intent != null) {
                                                    str5 = "https://applink.instagram.com/{user_name}/guide/{id_or_title}?igshid={?igshid}";
                                                }
                                            }
                                        }
                                        intent.putExtra("matched_pattern", str5);
                                        intent.putExtra("access_scope", "PUBLIC");
                                    }
                                    return intent;
                                    intent.putExtra(str3, true);
                                    A1m(intent);
                                    intent.putExtra(str2, str4);
                                    return intent;
                                }
                                throw A1k(i51);
                            }
                        }
                    }
                }
                return intent3;
            }
            throw A1k(i4);
        }
        return null;
    }

    public static Intent A1F(Context context, String str, char[] cArr, int i) {
        String str2;
        String substring;
        String substring2;
        Bundle A0C = AbstractC31174DnI.A0C();
        Bundle bundle = null;
        int[] A09 = AbstractC35268Fh3.A09(A0C, "explore_type", cArr, 30);
        if (A09 != null) {
            int i2 = A09[0];
            int i3 = A09[1];
            if (i3 >= 1 && i3 <= 3) {
                AbstractC35268Fh3.A07(A0C, "explore_type", cArr, 30, i2);
                if (i > i2) {
                    int i4 = i2 + 1;
                    if (cArr[i2] == '/') {
                        int[] A092 = AbstractC35268Fh3.A09(A0C, "explore_param", cArr, i4);
                        Intent intent = null;
                        if (A092 != null) {
                            int i5 = A092[0];
                            int i6 = A092[1];
                            if (i6 >= 1 && i6 <= 3) {
                                AbstractC35268Fh3.A07(A0C, "explore_param", cArr, i4, i5);
                                if (i <= i5) {
                                    intent = A0F(context, A0C, str);
                                    if (intent != null) {
                                        str2 = "https://applink.instagram.com/explore/{explore_type}/{explore_param}";
                                        intent.putExtra("matched_pattern", str2);
                                        intent.putExtra("access_scope", "PUBLIC");
                                        intent.putExtra("enforce_scope", true);
                                        A1m(intent);
                                        intent.putExtra("app_set", "[]");
                                    }
                                } else {
                                    int i7 = i5 + 1;
                                    char c = cArr[i5];
                                    if (c == '/') {
                                        int[] A093 = AbstractC35268Fh3.A09(A0C, "dummy", cArr, i7);
                                        if (A093 != null) {
                                            int i8 = A093[0];
                                            int i9 = A093[1];
                                            if (i9 >= 1 && i9 <= 3) {
                                                AbstractC35268Fh3.A07(A0C, "dummy", cArr, i7, i8);
                                                if (i <= i8) {
                                                    intent = A0F(context, A0C, str);
                                                    if (intent != null) {
                                                        str2 = "https://applink.instagram.com/explore/{explore_type}/{explore_param}/{dummy}";
                                                        intent.putExtra("matched_pattern", str2);
                                                        intent.putExtra("access_scope", "PUBLIC");
                                                        intent.putExtra("enforce_scope", true);
                                                        A1m(intent);
                                                        intent.putExtra("app_set", "[]");
                                                    }
                                                } else {
                                                    int i10 = i8 + 1;
                                                    char c2 = cArr[i8];
                                                    if (c2 == '/') {
                                                        c2 = cArr[i10];
                                                        i10++;
                                                    }
                                                    if (c2 == '?') {
                                                        int i11 = i - i10;
                                                        String A0i = AbstractC31171DnF.A0i(cArr, i10, i11);
                                                        int i12 = 0;
                                                        while (true) {
                                                            if (i12 < i11) {
                                                                int A01 = A01(A0i, i12);
                                                                if (A01 < 0) {
                                                                    break;
                                                                }
                                                                String substring3 = A0i.substring(i12, A01);
                                                                int A00 = A00(A0i, A01);
                                                                int i13 = A01 + 1;
                                                                if (A00 > 0) {
                                                                    substring2 = A0i.substring(i13, A00);
                                                                    i12 = A00 + 1;
                                                                } else {
                                                                    substring2 = A0i.substring(i13);
                                                                    i12 = A0i.length();
                                                                }
                                                                bundle = A1f(A0C, bundle, substring3, substring2);
                                                            } else {
                                                                intent = A0F(context, A0C, str);
                                                                if (intent != null) {
                                                                    str2 = "https://applink.instagram.com/explore/{explore_type}/{explore_param}/{dummy}?extra={?extra}";
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            } else {
                                                throw A1k(i9);
                                            }
                                        }
                                    } else if (c == '?') {
                                        int i14 = i - i7;
                                        String A0i2 = AbstractC31171DnF.A0i(cArr, i7, i14);
                                        int i15 = 0;
                                        while (true) {
                                            if (i15 < i14) {
                                                int A012 = A01(A0i2, i15);
                                                if (A012 < 0) {
                                                    break;
                                                }
                                                String substring4 = A0i2.substring(i15, A012);
                                                int A002 = A00(A0i2, A012);
                                                int i16 = A012 + 1;
                                                if (A002 > 0) {
                                                    substring = A0i2.substring(i16, A002);
                                                    i15 = A002 + 1;
                                                } else {
                                                    substring = A0i2.substring(i16);
                                                    i15 = A0i2.length();
                                                }
                                                bundle = A1f(A0C, bundle, substring4, substring);
                                            } else {
                                                intent = A0F(context, A0C, str);
                                                if (intent != null) {
                                                    str2 = "https://applink.instagram.com/explore/{explore_type}/{explore_param}?extra={?extra}";
                                                }
                                            }
                                        }
                                    }
                                }
                            } else {
                                throw A1k(i6);
                            }
                        }
                        return intent;
                    }
                }
            } else {
                throw A1k(i3);
            }
        }
        return null;
    }

    public static Intent A1G(Context context, String str, char[] cArr, int i) {
        String str2;
        String substring;
        Bundle A0C = AbstractC31174DnI.A0C();
        Bundle bundle = null;
        int[] A09 = AbstractC35268Fh3.A09(A0C, "clip_id", cArr, 28);
        Intent intent = null;
        if (A09 == null) {
            return null;
        }
        int A02 = A02(A09);
        int i2 = A09[1];
        if (i2 >= 1 && i2 <= 3) {
            AbstractC35268Fh3.A07(A0C, "clip_id", cArr, 28, A02);
            if (i <= A02) {
                intent = A07(context, A0C, str);
                if (intent != null) {
                    str2 = "https://applink.instagram.com/reels/{clip_id}";
                    intent.putExtra("matched_pattern", str2);
                    intent.putExtra("access_scope", "PUBLIC");
                    intent.putExtra("enforce_scope", true);
                    A1m(intent);
                    intent.putExtra("app_set", "[]");
                }
                return intent;
            }
            int i3 = A02 + 1;
            char c = cArr[A02];
            if (c == '/') {
                c = cArr[i3];
                i3++;
            }
            if (c == '?') {
                int i4 = i - i3;
                String A0i = AbstractC31171DnF.A0i(cArr, i3, i4);
                int i5 = 0;
                while (true) {
                    if (i5 < i4) {
                        int A01 = A01(A0i, i5);
                        if (A01 < 0) {
                            break;
                        }
                        String substring2 = A0i.substring(i5, A01);
                        int A00 = A00(A0i, A01);
                        int i6 = A01 + 1;
                        if (A00 > 0) {
                            substring = A0i.substring(i6, A00);
                            i5 = A00 + 1;
                        } else {
                            substring = A0i.substring(i6);
                            i5 = A0i.length();
                        }
                        bundle = A1f(A0C, bundle, substring2, substring);
                    } else {
                        intent = A07(context, A0C, str);
                        if (intent != null) {
                            str2 = "https://applink.instagram.com/reels/{clip_id}?extra={?extra}";
                        }
                    }
                }
            }
            return intent;
        }
        throw A1k(i2);
    }

    public static Intent A1H(Context context, String str, char[] cArr, int i) {
        String str2;
        String substring;
        String substring2;
        String substring3;
        String substring4;
        String substring5;
        String substring6;
        String substring7;
        Bundle A0C = AbstractC31174DnI.A0C();
        Bundle bundle = null;
        int[] A09 = AbstractC35268Fh3.A09(A0C, "action", cArr, 27);
        Intent intent = null;
        if (A09 == null) {
            return null;
        }
        int i2 = A09[0];
        int i3 = A09[1];
        if (i3 >= 1 && i3 <= 3) {
            AbstractC35268Fh3.A07(A0C, "action", cArr, 27, i2);
            if (i <= i2) {
                intent = A0D(context, A0C, str);
                if (intent != null) {
                    str2 = "https://familycenter.instagram.com/{action}";
                    intent.putExtra("matched_pattern", str2);
                    intent.putExtra("access_scope", "PUBLIC");
                    intent.putExtra("enforce_scope", true);
                    A1m(intent);
                    intent.putExtra("app_set", "[]");
                }
                return intent;
            }
            int i4 = i2 + 1;
            char c = cArr[i2];
            if (c == '/') {
                int[] A092 = AbstractC35268Fh3.A09(A0C, PublicKeyCredentialControllerUtility.JSON_KEY_ID, cArr, i4);
                if (A092 != null) {
                    int i5 = A092[0];
                    int i6 = A092[1];
                    if (i6 >= 1 && i6 <= 3) {
                        AbstractC35268Fh3.A07(A0C, PublicKeyCredentialControllerUtility.JSON_KEY_ID, cArr, i4, i5);
                        if (i <= i5) {
                            intent = A0D(context, A0C, str);
                            if (intent != null) {
                                str2 = "https://familycenter.instagram.com/{action}/{id}";
                                intent.putExtra("matched_pattern", str2);
                                intent.putExtra("access_scope", "PUBLIC");
                                intent.putExtra("enforce_scope", true);
                                A1m(intent);
                                intent.putExtra("app_set", "[]");
                            }
                        } else {
                            int i7 = i5 + 1;
                            char c2 = cArr[i5];
                            if (c2 == '/') {
                                int[] A093 = AbstractC35268Fh3.A09(A0C, "extra1", cArr, i7);
                                if (A093 != null) {
                                    int i8 = A093[0];
                                    int i9 = A093[1];
                                    if (i9 >= 1 && i9 <= 3) {
                                        AbstractC35268Fh3.A07(A0C, "extra1", cArr, i7, i8);
                                        if (i <= i8) {
                                            intent = A0D(context, A0C, str);
                                            if (intent != null) {
                                                str2 = "https://familycenter.instagram.com/{action}/{id}/{extra1}";
                                                intent.putExtra("matched_pattern", str2);
                                                intent.putExtra("access_scope", "PUBLIC");
                                                intent.putExtra("enforce_scope", true);
                                                A1m(intent);
                                                intent.putExtra("app_set", "[]");
                                            }
                                        } else {
                                            int i10 = i8 + 1;
                                            char c3 = cArr[i8];
                                            if (c3 == '/') {
                                                int[] A094 = AbstractC35268Fh3.A09(A0C, "extra2", cArr, i10);
                                                if (A094 != null) {
                                                    int i11 = A094[0];
                                                    int i12 = A094[1];
                                                    if (i12 >= 1 && i12 <= 3) {
                                                        AbstractC35268Fh3.A07(A0C, "extra2", cArr, i10, i11);
                                                        if (i <= i11) {
                                                            intent = A0D(context, A0C, str);
                                                            if (intent != null) {
                                                                str2 = "https://familycenter.instagram.com/{action}/{id}/{extra1}/{extra2}";
                                                                intent.putExtra("matched_pattern", str2);
                                                                intent.putExtra("access_scope", "PUBLIC");
                                                                intent.putExtra("enforce_scope", true);
                                                                A1m(intent);
                                                                intent.putExtra("app_set", "[]");
                                                            }
                                                        } else {
                                                            int i13 = i11 + 1;
                                                            char c4 = cArr[i11];
                                                            if (c4 == '/') {
                                                                int[] A095 = AbstractC35268Fh3.A09(A0C, "extra3", cArr, i13);
                                                                if (A095 != null) {
                                                                    int i14 = A095[0];
                                                                    int i15 = A095[1];
                                                                    if (i15 >= 1 && i15 <= 3) {
                                                                        AbstractC35268Fh3.A07(A0C, "extra3", cArr, i13, i14);
                                                                        if (i <= i14) {
                                                                            intent = A0D(context, A0C, str);
                                                                            if (intent != null) {
                                                                                str2 = "https://familycenter.instagram.com/{action}/{id}/{extra1}/{extra2}/{extra3}";
                                                                                intent.putExtra("matched_pattern", str2);
                                                                                intent.putExtra("access_scope", "PUBLIC");
                                                                                intent.putExtra("enforce_scope", true);
                                                                                A1m(intent);
                                                                                intent.putExtra("app_set", "[]");
                                                                            }
                                                                        } else {
                                                                            int i16 = i14 + 1;
                                                                            char c5 = cArr[i14];
                                                                            if (c5 == '/') {
                                                                                int[] A096 = AbstractC35268Fh3.A09(A0C, "extra4", cArr, i16);
                                                                                if (A096 != null) {
                                                                                    int i17 = A096[0];
                                                                                    int i18 = A096[1];
                                                                                    if (i18 >= 1 && i18 <= 3) {
                                                                                        AbstractC35268Fh3.A07(A0C, "extra4", cArr, i16, i17);
                                                                                        if (i <= i17) {
                                                                                            intent = A0D(context, A0C, str);
                                                                                            if (intent != null) {
                                                                                                str2 = "https://familycenter.instagram.com/{action}/{id}/{extra1}/{extra2}/{extra3}/{extra4}";
                                                                                                intent.putExtra("matched_pattern", str2);
                                                                                                intent.putExtra("access_scope", "PUBLIC");
                                                                                                intent.putExtra("enforce_scope", true);
                                                                                                A1m(intent);
                                                                                                intent.putExtra("app_set", "[]");
                                                                                            }
                                                                                        } else {
                                                                                            int i19 = i17 + 1;
                                                                                            char c6 = cArr[i17];
                                                                                            if (c6 == '/') {
                                                                                                int[] A097 = AbstractC35268Fh3.A09(A0C, "extra5", cArr, i19);
                                                                                                if (A097 != null) {
                                                                                                    int i20 = A097[0];
                                                                                                    int i21 = A097[1];
                                                                                                    if (i21 >= 1 && i21 <= 3) {
                                                                                                        AbstractC35268Fh3.A07(A0C, "extra5", cArr, i19, i20);
                                                                                                        if (i <= i20) {
                                                                                                            intent = A0D(context, A0C, str);
                                                                                                            if (intent != null) {
                                                                                                                str2 = "https://familycenter.instagram.com/{action}/{id}/{extra1}/{extra2}/{extra3}/{extra4}/{extra5}";
                                                                                                                intent.putExtra("matched_pattern", str2);
                                                                                                                intent.putExtra("access_scope", "PUBLIC");
                                                                                                                intent.putExtra("enforce_scope", true);
                                                                                                                A1m(intent);
                                                                                                                intent.putExtra("app_set", "[]");
                                                                                                            }
                                                                                                        } else {
                                                                                                            int i22 = i20 + 1;
                                                                                                            char c7 = cArr[i20];
                                                                                                            if (c7 == '/') {
                                                                                                                c7 = cArr[i22];
                                                                                                                i22++;
                                                                                                            }
                                                                                                            if (c7 == '?') {
                                                                                                                int i23 = i - i22;
                                                                                                                String A0i = AbstractC31171DnF.A0i(cArr, i22, i23);
                                                                                                                int i24 = 0;
                                                                                                                while (true) {
                                                                                                                    if (i24 < i23) {
                                                                                                                        int A01 = A01(A0i, i24);
                                                                                                                        if (A01 < 0) {
                                                                                                                            break;
                                                                                                                        }
                                                                                                                        String substring8 = A0i.substring(i24, A01);
                                                                                                                        int A00 = A00(A0i, A01);
                                                                                                                        int i25 = A01 + 1;
                                                                                                                        if (A00 > 0) {
                                                                                                                            substring7 = A0i.substring(i25, A00);
                                                                                                                            i24 = A00 + 1;
                                                                                                                        } else {
                                                                                                                            substring7 = A0i.substring(i25);
                                                                                                                            i24 = A0i.length();
                                                                                                                        }
                                                                                                                        bundle = A1g(A0C, bundle, substring8, "p", substring7);
                                                                                                                    } else {
                                                                                                                        intent = A0D(context, A0C, str);
                                                                                                                        if (intent != null) {
                                                                                                                            str2 = "https://familycenter.instagram.com/{action}/{id}/{extra1}/{extra2}/{extra3}/{extra4}/{extra5}/?p={?p}";
                                                                                                                        }
                                                                                                                    }
                                                                                                                }
                                                                                                            }
                                                                                                        }
                                                                                                    } else {
                                                                                                        throw A1k(i21);
                                                                                                    }
                                                                                                }
                                                                                            } else if (c6 == '?') {
                                                                                                int i26 = i - i19;
                                                                                                String A0i2 = AbstractC31171DnF.A0i(cArr, i19, i26);
                                                                                                int i27 = 0;
                                                                                                while (true) {
                                                                                                    if (i27 < i26) {
                                                                                                        int A012 = A01(A0i2, i27);
                                                                                                        if (A012 < 0) {
                                                                                                            break;
                                                                                                        }
                                                                                                        String substring9 = A0i2.substring(i27, A012);
                                                                                                        int A002 = A00(A0i2, A012);
                                                                                                        int i28 = A012 + 1;
                                                                                                        if (A002 > 0) {
                                                                                                            substring6 = A0i2.substring(i28, A002);
                                                                                                            i27 = A002 + 1;
                                                                                                        } else {
                                                                                                            substring6 = A0i2.substring(i28);
                                                                                                            i27 = A0i2.length();
                                                                                                        }
                                                                                                        bundle = A1g(A0C, bundle, substring9, "p", substring6);
                                                                                                    } else {
                                                                                                        intent = A0D(context, A0C, str);
                                                                                                        if (intent != null) {
                                                                                                            str2 = "https://familycenter.instagram.com/{action}/{id}/{extra1}/{extra2}/{extra3}/{extra4}/?p={?p}";
                                                                                                        }
                                                                                                    }
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                    } else {
                                                                                        throw A1k(i18);
                                                                                    }
                                                                                }
                                                                            } else if (c5 == '?') {
                                                                                int i29 = i - i16;
                                                                                String A0i3 = AbstractC31171DnF.A0i(cArr, i16, i29);
                                                                                int i30 = 0;
                                                                                while (true) {
                                                                                    if (i30 < i29) {
                                                                                        int A013 = A01(A0i3, i30);
                                                                                        if (A013 < 0) {
                                                                                            break;
                                                                                        }
                                                                                        String substring10 = A0i3.substring(i30, A013);
                                                                                        int A003 = A00(A0i3, A013);
                                                                                        int i31 = A013 + 1;
                                                                                        if (A003 > 0) {
                                                                                            substring5 = A0i3.substring(i31, A003);
                                                                                            i30 = A003 + 1;
                                                                                        } else {
                                                                                            substring5 = A0i3.substring(i31);
                                                                                            i30 = A0i3.length();
                                                                                        }
                                                                                        bundle = A1g(A0C, bundle, substring10, "p", substring5);
                                                                                    } else {
                                                                                        intent = A0D(context, A0C, str);
                                                                                        if (intent != null) {
                                                                                            str2 = "https://familycenter.instagram.com/{action}/{id}/{extra1}/{extra2}/{extra3}/?p={?p}";
                                                                                        }
                                                                                    }
                                                                                }
                                                                            }
                                                                        }
                                                                    } else {
                                                                        throw A1k(i15);
                                                                    }
                                                                }
                                                            } else if (c4 == '?') {
                                                                int i32 = i - i13;
                                                                String A0i4 = AbstractC31171DnF.A0i(cArr, i13, i32);
                                                                int i33 = 0;
                                                                while (true) {
                                                                    if (i33 < i32) {
                                                                        int A014 = A01(A0i4, i33);
                                                                        if (A014 < 0) {
                                                                            break;
                                                                        }
                                                                        String substring11 = A0i4.substring(i33, A014);
                                                                        int A004 = A00(A0i4, A014);
                                                                        int i34 = A014 + 1;
                                                                        if (A004 > 0) {
                                                                            substring4 = A0i4.substring(i34, A004);
                                                                            i33 = A004 + 1;
                                                                        } else {
                                                                            substring4 = A0i4.substring(i34);
                                                                            i33 = A0i4.length();
                                                                        }
                                                                        bundle = A1g(A0C, bundle, substring11, "p", substring4);
                                                                    } else {
                                                                        intent = A0D(context, A0C, str);
                                                                        if (intent != null) {
                                                                            str2 = "https://familycenter.instagram.com/{action}/{id}/{extra1}/{extra2}/?p={?p}";
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    } else {
                                                        throw A1k(i12);
                                                    }
                                                }
                                            } else if (c3 == '?') {
                                                int i35 = i - i10;
                                                String A0i5 = AbstractC31171DnF.A0i(cArr, i10, i35);
                                                int i36 = 0;
                                                while (true) {
                                                    if (i36 < i35) {
                                                        int A015 = A01(A0i5, i36);
                                                        if (A015 < 0) {
                                                            break;
                                                        }
                                                        String substring12 = A0i5.substring(i36, A015);
                                                        int A005 = A00(A0i5, A015);
                                                        int i37 = A015 + 1;
                                                        if (A005 > 0) {
                                                            substring3 = A0i5.substring(i37, A005);
                                                            i36 = A005 + 1;
                                                        } else {
                                                            substring3 = A0i5.substring(i37);
                                                            i36 = A0i5.length();
                                                        }
                                                        bundle = A1g(A0C, bundle, substring12, "p", substring3);
                                                    } else {
                                                        intent = A0D(context, A0C, str);
                                                        if (intent != null) {
                                                            str2 = "https://familycenter.instagram.com/{action}/{id}/{extra1}/?p={?p}";
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    } else {
                                        throw A1k(i9);
                                    }
                                }
                            } else if (c2 == '?') {
                                int i38 = i - i7;
                                String A0i6 = AbstractC31171DnF.A0i(cArr, i7, i38);
                                int i39 = 0;
                                while (true) {
                                    if (i39 < i38) {
                                        int A016 = A01(A0i6, i39);
                                        if (A016 < 0) {
                                            break;
                                        }
                                        String substring13 = A0i6.substring(i39, A016);
                                        int A006 = A00(A0i6, A016);
                                        int i40 = A016 + 1;
                                        if (A006 > 0) {
                                            substring2 = A0i6.substring(i40, A006);
                                            i39 = A006 + 1;
                                        } else {
                                            substring2 = A0i6.substring(i40);
                                            i39 = A0i6.length();
                                        }
                                        bundle = A1g(A0C, bundle, substring13, "p", substring2);
                                    } else {
                                        intent = A0D(context, A0C, str);
                                        if (intent != null) {
                                            str2 = "https://familycenter.instagram.com/{action}/{id}/?p={?p}";
                                        }
                                    }
                                }
                            }
                        }
                    } else {
                        throw A1k(i6);
                    }
                }
                return intent;
            }
            if (c == '?') {
                int i41 = i - i4;
                String A0i7 = AbstractC31171DnF.A0i(cArr, i4, i41);
                int i42 = 0;
                while (true) {
                    if (i42 < i41) {
                        int A017 = A01(A0i7, i42);
                        if (A017 < 0) {
                            break;
                        }
                        String substring14 = A0i7.substring(i42, A017);
                        int A007 = A00(A0i7, A017);
                        int i43 = A017 + 1;
                        if (A007 > 0) {
                            substring = A0i7.substring(i43, A007);
                            i42 = A007 + 1;
                        } else {
                            substring = A0i7.substring(i43);
                            i42 = A0i7.length();
                        }
                        bundle = A1g(A0C, bundle, substring14, "entrypoint", substring);
                    } else {
                        intent = A0D(context, A0C, str);
                        if (intent != null) {
                            str2 = "https://familycenter.instagram.com/{action}?entrypoint={?entrypoint}";
                        }
                    }
                }
            }
            return intent;
        }
        throw A1k(i3);
    }

    public static Intent A1I(Context context, String str, char[] cArr, int i) {
        String str2;
        String substring;
        int i2;
        int[] A09;
        String substring2;
        Bundle A0C = AbstractC31174DnI.A0C();
        Bundle bundle = null;
        int[] A092 = AbstractC35268Fh3.A09(A0C, "short_code", cArr, 6);
        Intent intent = null;
        if (A092 == null) {
            return null;
        }
        int i3 = A092[0];
        int i4 = A092[1];
        if (i4 >= 1 && i4 <= 3) {
            AbstractC35268Fh3.A07(A0C, "short_code", cArr, 6, i3);
            if (i <= i3) {
                intent = A0B(context, A0C, str);
                if (intent != null) {
                    str2 = "https://ig.me/{short_code}";
                    intent.putExtra("matched_pattern", str2);
                    intent.putExtra("access_scope", "PUBLIC");
                    intent.putExtra("enforce_scope", true);
                    A1m(intent);
                    intent.putExtra("app_set", "[]");
                }
                return intent;
            }
            int i5 = i3 + 1;
            char c = cArr[i3];
            if (c == '/') {
                if (AbstractC35268Fh3.A08("p/", cArr, i5) && (A09 = AbstractC35268Fh3.A09(A0C, "media_id", cArr, (i2 = i5 + 2))) != null) {
                    int i6 = A09[0];
                    int i7 = A09[1];
                    if (i7 >= 1 && i7 <= 3) {
                        AbstractC35268Fh3.A07(A0C, "media_id", cArr, i2, i6);
                        if (i <= i6) {
                            intent = A0B(context, A0C, str);
                            if (intent != null) {
                                str2 = "https://ig.me/{short_code}/p/{media_id}";
                                intent.putExtra("matched_pattern", str2);
                                intent.putExtra("access_scope", "PUBLIC");
                                intent.putExtra("enforce_scope", true);
                                A1m(intent);
                                intent.putExtra("app_set", "[]");
                            }
                        } else {
                            int i8 = i6 + 1;
                            char c2 = cArr[i6];
                            if (c2 == '/') {
                                c2 = cArr[i8];
                                i8++;
                            }
                            if (c2 == '?') {
                                int i9 = i - i8;
                                String A0i = AbstractC31171DnF.A0i(cArr, i8, i9);
                                int i10 = 0;
                                while (true) {
                                    if (i10 < i9) {
                                        int A01 = A01(A0i, i10);
                                        if (A01 < 0) {
                                            break;
                                        }
                                        String substring3 = A0i.substring(i10, A01);
                                        int A00 = A00(A0i, A01);
                                        int i11 = A01 + 1;
                                        if (A00 > 0) {
                                            substring2 = A0i.substring(i11, A00);
                                            i10 = A00 + 1;
                                        } else {
                                            substring2 = A0i.substring(i11);
                                            i10 = A0i.length();
                                        }
                                        bundle = A1f(A0C, bundle, substring3, substring2);
                                    } else {
                                        intent = A0B(context, A0C, str);
                                        if (intent != null) {
                                            str2 = "https://ig.me/{short_code}/p/{media_id}?extra={?extra}";
                                        }
                                    }
                                }
                            }
                        }
                    } else {
                        throw A1k(i7);
                    }
                }
                return intent;
            }
            if (c == '?') {
                int i12 = i - i5;
                String A0i2 = AbstractC31171DnF.A0i(cArr, i5, i12);
                int i13 = 0;
                while (true) {
                    if (i13 < i12) {
                        int A012 = A01(A0i2, i13);
                        if (A012 < 0) {
                            break;
                        }
                        String substring4 = A0i2.substring(i13, A012);
                        int A002 = A00(A0i2, A012);
                        int i14 = A012 + 1;
                        if (A002 > 0) {
                            substring = A0i2.substring(i14, A002);
                            i13 = A002 + 1;
                        } else {
                            substring = A0i2.substring(i14);
                            i13 = A0i2.length();
                        }
                        bundle = A1f(A0C, bundle, substring4, substring);
                    } else {
                        intent = A0B(context, A0C, str);
                        if (intent != null) {
                            str2 = "https://ig.me/{short_code}?extra={?extra}";
                        }
                    }
                }
            }
            return intent;
        }
        throw A1k(i4);
    }

    public static Intent A1J(Context context, String str, char[] cArr, int i) {
        Bundle A0C = AbstractC31174DnI.A0C();
        Intent intent = null;
        int[] A09 = AbstractC35268Fh3.A09(A0C, "any", cArr, 18);
        if (A09 != null) {
            int A02 = A02(A09);
            int i2 = A09[1];
            if (i2 >= 1 && i2 <= 3) {
                AbstractC35268Fh3.A07(A0C, "any", cArr, 18, A02);
                if (i <= A02 && (intent = AbstractC35268Fh3.A00(context, A0C, "com.instagram.urlhandlers.avatareditor.AvatarEditorUrlHandlerActivity", str)) != null) {
                    A1q(intent, "https://ig.me/avatar/edit/{any}");
                }
            } else {
                throw A1k(i2);
            }
        }
        return intent;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:41:0x00b0. Please report as an issue. */
    public static Intent A1K(Context context, String str, char[] cArr, int i) {
        String str2;
        String substring;
        String str3;
        String substring2;
        String str4;
        Bundle A0C = AbstractC31174DnI.A0C();
        Bundle bundle = null;
        int[] A09 = AbstractC35268Fh3.A09(A0C, "VALUE", cArr, 14);
        Intent intent = null;
        if (A09 == null) {
            return null;
        }
        int i2 = A09[0];
        int i3 = A09[1];
        if (i3 >= 1 && i3 <= 3) {
            AbstractC35268Fh3.A07(A0C, "VALUE", cArr, 14, i2);
            if (i <= i2) {
                intent = A0E(context, A0C, str);
                if (intent != null) {
                    str2 = "https://ig.me/channel/{VALUE}";
                    intent.putExtra("matched_pattern", str2);
                    intent.putExtra("access_scope", "PUBLIC");
                    intent.putExtra("enforce_scope", true);
                    A1m(intent);
                    intent.putExtra("app_set", "[]");
                }
                return intent;
            }
            int i4 = i2 + 1;
            char c = cArr[i2];
            if (c == '/') {
                int[] A092 = AbstractC35268Fh3.A09(A0C, "content", cArr, i4);
                if (A092 != null) {
                    int i5 = A092[0];
                    int i6 = A092[1];
                    if (i6 >= 1 && i6 <= 3) {
                        AbstractC35268Fh3.A07(A0C, "content", cArr, i4, i5);
                        if (i <= i5) {
                            intent = A0E(context, A0C, str);
                            if (intent != null) {
                                str2 = "https://ig.me/channel/{VALUE}/{content}";
                                intent.putExtra("matched_pattern", str2);
                                intent.putExtra("access_scope", "PUBLIC");
                                intent.putExtra("enforce_scope", true);
                                A1m(intent);
                                intent.putExtra("app_set", "[]");
                            }
                        } else {
                            int i7 = i5 + 1;
                            char c2 = cArr[i5];
                            if (c2 == '/') {
                                c2 = cArr[i7];
                                i7++;
                            }
                            if (c2 == '?') {
                                int i8 = i - i7;
                                String A0i = AbstractC31171DnF.A0i(cArr, i7, i8);
                                int i9 = 0;
                                while (true) {
                                    if (i9 < i8) {
                                        int A01 = A01(A0i, i9);
                                        if (A01 >= 0) {
                                            String substring3 = A0i.substring(i9, A01);
                                            int A00 = A00(A0i, A01);
                                            int i10 = A01 + 1;
                                            if (A00 > 0) {
                                                substring2 = A0i.substring(i10, A00);
                                                i9 = A00 + 1;
                                            } else {
                                                substring2 = A0i.substring(i10);
                                                i9 = A0i.length();
                                            }
                                            switch (substring3.hashCode()) {
                                                case -1281232384:
                                                    if (!A1y(substring3)) {
                                                        bundle = A1j(substring3, substring2, bundle);
                                                        break;
                                                    } else {
                                                        str4 = PublicKeyCredentialControllerUtility.JSON_KEY_ID;
                                                        A0C.putString(str4, substring2);
                                                        break;
                                                    }
                                                case 115:
                                                    if (!A1x(substring3)) {
                                                        bundle = A1j(substring3, substring2, bundle);
                                                        break;
                                                    } else {
                                                        str4 = CacheBehaviorLogger.SOURCE;
                                                        A0C.putString(str4, substring2);
                                                        break;
                                                    }
                                                case 3230707:
                                                    if (!substring3.equals("igsh")) {
                                                        bundle = A1j(substring3, substring2, bundle);
                                                        break;
                                                    } else {
                                                        str4 = "share_id";
                                                        A0C.putString(str4, substring2);
                                                        break;
                                                    }
                                                default:
                                                    bundle = A1j(substring3, substring2, bundle);
                                                    break;
                                            }
                                        }
                                    } else {
                                        intent = A0E(context, A0C, str);
                                        if (intent != null) {
                                            str2 = "https://ig.me/channel/{VALUE}/{content}?s={?source}&fbclid={?id}";
                                        }
                                    }
                                }
                            }
                        }
                    } else {
                        throw A1k(i6);
                    }
                }
                return intent;
            }
            if (c == '?') {
                int i11 = i - i4;
                String A0i2 = AbstractC31171DnF.A0i(cArr, i4, i11);
                int i12 = 0;
                while (true) {
                    if (i12 < i11) {
                        int A012 = A01(A0i2, i12);
                        if (A012 < 0) {
                            break;
                        }
                        String substring4 = A0i2.substring(i12, A012);
                        int A002 = A00(A0i2, A012);
                        int i13 = A012 + 1;
                        if (A002 > 0) {
                            substring = A0i2.substring(i13, A002);
                            i12 = A002 + 1;
                        } else {
                            substring = A0i2.substring(i13);
                            i12 = A0i2.length();
                        }
                        if (!A1y(substring4)) {
                            if (!A1x(substring4)) {
                                bundle = A1j(substring4, substring, bundle);
                            } else {
                                str3 = CacheBehaviorLogger.SOURCE;
                            }
                        } else {
                            str3 = PublicKeyCredentialControllerUtility.JSON_KEY_ID;
                        }
                        A0C.putString(str3, substring);
                    } else {
                        intent = A0E(context, A0C, str);
                        if (intent != null) {
                            str2 = "https://ig.me/channel/{VALUE}?s={?source}&fbclid={?id}";
                        }
                    }
                }
            }
            return intent;
        }
        throw A1k(i3);
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:41:0x00b0. Please report as an issue. */
    public static Intent A1L(Context context, String str, char[] cArr, int i) {
        String str2;
        String substring;
        String str3;
        String substring2;
        String str4;
        Bundle A0C = AbstractC31174DnI.A0C();
        Bundle bundle = null;
        int[] A09 = AbstractC35268Fh3.A09(A0C, "VALUE", cArr, 8);
        Intent intent = null;
        if (A09 == null) {
            return null;
        }
        int i2 = A09[0];
        int i3 = A09[1];
        if (i3 >= 1 && i3 <= 3) {
            AbstractC35268Fh3.A07(A0C, "VALUE", cArr, 8, i2);
            if (i <= i2) {
                intent = A0E(context, A0C, str);
                if (intent != null) {
                    str2 = "https://ig.me/j/{VALUE}";
                    intent.putExtra("matched_pattern", str2);
                    intent.putExtra("access_scope", "PUBLIC");
                    intent.putExtra("enforce_scope", true);
                    A1m(intent);
                    intent.putExtra("app_set", "[]");
                }
                return intent;
            }
            int i4 = i2 + 1;
            char c = cArr[i2];
            if (c == '/') {
                int[] A092 = AbstractC35268Fh3.A09(A0C, "content", cArr, i4);
                if (A092 != null) {
                    int i5 = A092[0];
                    int i6 = A092[1];
                    if (i6 >= 1 && i6 <= 3) {
                        AbstractC35268Fh3.A07(A0C, "content", cArr, i4, i5);
                        if (i <= i5) {
                            intent = A0E(context, A0C, str);
                            if (intent != null) {
                                str2 = "https://ig.me/j/{VALUE}/{content}";
                                intent.putExtra("matched_pattern", str2);
                                intent.putExtra("access_scope", "PUBLIC");
                                intent.putExtra("enforce_scope", true);
                                A1m(intent);
                                intent.putExtra("app_set", "[]");
                            }
                        } else {
                            int i7 = i5 + 1;
                            char c2 = cArr[i5];
                            if (c2 == '/') {
                                c2 = cArr[i7];
                                i7++;
                            }
                            if (c2 == '?') {
                                int i8 = i - i7;
                                String A0i = AbstractC31171DnF.A0i(cArr, i7, i8);
                                int i9 = 0;
                                while (true) {
                                    if (i9 < i8) {
                                        int A01 = A01(A0i, i9);
                                        if (A01 >= 0) {
                                            String substring3 = A0i.substring(i9, A01);
                                            int A00 = A00(A0i, A01);
                                            int i10 = A01 + 1;
                                            if (A00 > 0) {
                                                substring2 = A0i.substring(i10, A00);
                                                i9 = A00 + 1;
                                            } else {
                                                substring2 = A0i.substring(i10);
                                                i9 = A0i.length();
                                            }
                                            switch (substring3.hashCode()) {
                                                case -1281232384:
                                                    if (!A1y(substring3)) {
                                                        bundle = A1j(substring3, substring2, bundle);
                                                        break;
                                                    } else {
                                                        str4 = PublicKeyCredentialControllerUtility.JSON_KEY_ID;
                                                        A0C.putString(str4, substring2);
                                                        break;
                                                    }
                                                case 115:
                                                    if (!A1x(substring3)) {
                                                        bundle = A1j(substring3, substring2, bundle);
                                                        break;
                                                    } else {
                                                        str4 = CacheBehaviorLogger.SOURCE;
                                                        A0C.putString(str4, substring2);
                                                        break;
                                                    }
                                                case 3230707:
                                                    if (!substring3.equals("igsh")) {
                                                        bundle = A1j(substring3, substring2, bundle);
                                                        break;
                                                    } else {
                                                        str4 = "share_id";
                                                        A0C.putString(str4, substring2);
                                                        break;
                                                    }
                                                default:
                                                    bundle = A1j(substring3, substring2, bundle);
                                                    break;
                                            }
                                        }
                                    } else {
                                        intent = A0E(context, A0C, str);
                                        if (intent != null) {
                                            str2 = "https://ig.me/j/{VALUE}/{content}?s={?source}&fbclid={?id}";
                                        }
                                    }
                                }
                            }
                        }
                    } else {
                        throw A1k(i6);
                    }
                }
                return intent;
            }
            if (c == '?') {
                int i11 = i - i4;
                String A0i2 = AbstractC31171DnF.A0i(cArr, i4, i11);
                int i12 = 0;
                while (true) {
                    if (i12 < i11) {
                        int A012 = A01(A0i2, i12);
                        if (A012 < 0) {
                            break;
                        }
                        String substring4 = A0i2.substring(i12, A012);
                        int A002 = A00(A0i2, A012);
                        int i13 = A012 + 1;
                        if (A002 > 0) {
                            substring = A0i2.substring(i13, A002);
                            i12 = A002 + 1;
                        } else {
                            substring = A0i2.substring(i13);
                            i12 = A0i2.length();
                        }
                        if (!A1y(substring4)) {
                            if (!A1x(substring4)) {
                                bundle = A1j(substring4, substring, bundle);
                            } else {
                                str3 = CacheBehaviorLogger.SOURCE;
                            }
                        } else {
                            str3 = PublicKeyCredentialControllerUtility.JSON_KEY_ID;
                        }
                        A0C.putString(str3, substring);
                    } else {
                        intent = A0E(context, A0C, str);
                        if (intent != null) {
                            str2 = "https://ig.me/j/{VALUE}?s={?source}&fbclid={?id}";
                        }
                    }
                }
            }
            return intent;
        }
        throw A1k(i3);
    }

    public static Intent A1M(Context context, String str, char[] cArr, int i) {
        Intent intent;
        String str2;
        String str3;
        String substring;
        String substring2;
        String str4;
        Intent A09;
        String str5;
        String str6;
        String substring3;
        String substring4;
        String substring5;
        int i2;
        String substring6;
        String substring7;
        int i3;
        int[] A092;
        String substring8;
        Bundle A0C = AbstractC31174DnI.A0C();
        Bundle bundle = null;
        int[] A093 = AbstractC35268Fh3.A09(A0C, "user_name", cArr, 14);
        if (A093 != null) {
            int i4 = A093[0];
            int i5 = A093[1];
            if (i5 >= 1 && i5 <= 3) {
                AbstractC35268Fh3.A07(A0C, "user_name", cArr, 14, i4);
                if (i > i4) {
                    int i6 = i4 + 1;
                    if (cArr[i4] == '/' && i6 < i) {
                        int i7 = i6 + 1;
                        char c = cArr[i6];
                        if (c != 'g') {
                            str2 = "[]";
                            if (c != 'l') {
                                if (c != 'p') {
                                    if (c != 'r') {
                                        if (c == 't') {
                                            intent = null;
                                            if (AbstractC35268Fh3.A08("v/", cArr, i7) && (A092 = AbstractC35268Fh3.A09(A0C, "tv_id", cArr, (i3 = i7 + 2))) != null) {
                                                int i8 = A092[0];
                                                int i9 = A092[1];
                                                if (i9 >= 1 && i9 <= 3) {
                                                    AbstractC35268Fh3.A07(A0C, "tv_id", cArr, i3, i8);
                                                    if (i <= i8) {
                                                        intent = A04(context, A0C, str);
                                                        if (intent != null) {
                                                            str6 = "https://instagram.com/{user_name}/tv/{tv_id}";
                                                            intent.putExtra("matched_pattern", str6);
                                                            intent.putExtra("access_scope", "PUBLIC");
                                                            intent.putExtra("enforce_scope", true);
                                                            A1m(intent);
                                                            str4 = "app_set";
                                                        }
                                                        return intent;
                                                    }
                                                    int i10 = i8 + 1;
                                                    char c2 = cArr[i8];
                                                    if (c2 == '/') {
                                                        c2 = cArr[i10];
                                                        i10++;
                                                    }
                                                    if (c2 == '?') {
                                                        int i11 = i - i10;
                                                        String A0i = AbstractC31171DnF.A0i(cArr, i10, i11);
                                                        int i12 = 0;
                                                        while (true) {
                                                            if (i12 < i11) {
                                                                int A01 = A01(A0i, i12);
                                                                if (A01 < 0) {
                                                                    break;
                                                                }
                                                                String substring9 = A0i.substring(i12, A01);
                                                                int A00 = A00(A0i, A01);
                                                                int i13 = A01 + 1;
                                                                if (A00 > 0) {
                                                                    substring8 = A0i.substring(i13, A00);
                                                                    i12 = A00 + 1;
                                                                } else {
                                                                    substring8 = A0i.substring(i13);
                                                                    i12 = A0i.length();
                                                                }
                                                                bundle = A1e(A0C, bundle, substring9, substring8);
                                                            } else {
                                                                intent = A04(context, A0C, str);
                                                                if (intent != null) {
                                                                    str6 = "https://instagram.com/{user_name}/tv/{tv_id}?igid={?extra}";
                                                                }
                                                            }
                                                        }
                                                    }
                                                    return intent;
                                                }
                                                throw A1k(i9);
                                            }
                                            return null;
                                        }
                                        return null;
                                    }
                                    if (AbstractC35268Fh3.A08("eel", cArr, i7) && (i2 = i7 + 3) < i) {
                                        int i14 = i2 + 1;
                                        char c3 = cArr[i2];
                                        if (c3 != '/') {
                                            if (c3 == 's' && i14 < i) {
                                                int i15 = i14 + 1;
                                                if (cArr[i14] == '/') {
                                                    if (i15 >= i || cArr[i15] != '?') {
                                                        intent = null;
                                                        int[] A094 = AbstractC35268Fh3.A09(A0C, "clip_id", cArr, i15);
                                                        if (A094 != null) {
                                                            int i16 = A094[0];
                                                            int i17 = A094[1];
                                                            if (i17 >= 1 && i17 <= 3) {
                                                                AbstractC35268Fh3.A07(A0C, "clip_id", cArr, i15, i16);
                                                                if (i > i16) {
                                                                    int i18 = i16 + 1;
                                                                    char c4 = cArr[i16];
                                                                    if (c4 == '/') {
                                                                        c4 = cArr[i18];
                                                                        i18++;
                                                                    }
                                                                    if (c4 == '?') {
                                                                        int i19 = i - i18;
                                                                        String A0i2 = AbstractC31171DnF.A0i(cArr, i18, i19);
                                                                        int i20 = 0;
                                                                        while (true) {
                                                                            if (i20 < i19) {
                                                                                int A012 = A01(A0i2, i20);
                                                                                if (A012 < 0) {
                                                                                    break;
                                                                                }
                                                                                String substring10 = A0i2.substring(i20, A012);
                                                                                int A002 = A00(A0i2, A012);
                                                                                int i21 = A012 + 1;
                                                                                if (A002 > 0) {
                                                                                    substring7 = A0i2.substring(i21, A002);
                                                                                    i20 = A002 + 1;
                                                                                } else {
                                                                                    substring7 = A0i2.substring(i21);
                                                                                    i20 = A0i2.length();
                                                                                }
                                                                                bundle = A1f(A0C, bundle, substring10, substring7);
                                                                            } else {
                                                                                intent = A07(context, A0C, str);
                                                                                if (intent != null) {
                                                                                    str6 = "https://instagram.com/{user_name}/reels/{clip_id}?extra={?extra}";
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            } else {
                                                                throw A1k(i17);
                                                            }
                                                        }
                                                        return intent;
                                                    }
                                                    return null;
                                                }
                                                return null;
                                            }
                                            return null;
                                        }
                                        if (i14 >= i || cArr[i14] != '?') {
                                            int[] A095 = AbstractC35268Fh3.A09(A0C, "clip_id", cArr, i14);
                                            intent = null;
                                            if (A095 != null) {
                                                int i22 = A095[0];
                                                int i23 = A095[1];
                                                if (i23 >= 1 && i23 <= 3) {
                                                    AbstractC35268Fh3.A07(A0C, "clip_id", cArr, i14, i22);
                                                    if (i <= i22) {
                                                        intent = A07(context, A0C, str);
                                                        if (intent != null) {
                                                            str6 = "https://instagram.com/{user_name}/reel/{clip_id}";
                                                            intent.putExtra("matched_pattern", str6);
                                                            intent.putExtra("access_scope", "PUBLIC");
                                                            intent.putExtra("enforce_scope", true);
                                                            A1m(intent);
                                                            str4 = "app_set";
                                                        }
                                                        return intent;
                                                    }
                                                    int i24 = i22 + 1;
                                                    char c5 = cArr[i22];
                                                    if (c5 == '/') {
                                                        c5 = cArr[i24];
                                                        i24++;
                                                    }
                                                    if (c5 == '?') {
                                                        int i25 = i - i24;
                                                        String A0i3 = AbstractC31171DnF.A0i(cArr, i24, i25);
                                                        int i26 = 0;
                                                        while (true) {
                                                            if (i26 < i25) {
                                                                int A013 = A01(A0i3, i26);
                                                                if (A013 < 0) {
                                                                    break;
                                                                }
                                                                String substring11 = A0i3.substring(i26, A013);
                                                                int A003 = A00(A0i3, A013);
                                                                int i27 = A013 + 1;
                                                                if (A003 > 0) {
                                                                    substring6 = A0i3.substring(i27, A003);
                                                                    i26 = A003 + 1;
                                                                } else {
                                                                    substring6 = A0i3.substring(i27);
                                                                    i26 = A0i3.length();
                                                                }
                                                                bundle = A1f(A0C, bundle, substring11, substring6);
                                                            } else {
                                                                intent = A07(context, A0C, str);
                                                                if (intent != null) {
                                                                    str6 = "https://instagram.com/{user_name}/reel/{clip_id}?extra={?extra}";
                                                                }
                                                            }
                                                        }
                                                    }
                                                    return intent;
                                                }
                                                throw A1k(i23);
                                            }
                                        }
                                        return null;
                                    }
                                    return null;
                                }
                                if (i7 < i) {
                                    int i28 = i7 + 1;
                                    char c6 = cArr[i7];
                                    if (c6 != '/') {
                                        if (c6 != 'o') {
                                            if (c6 == 'r' && AbstractC35268Fh3.A08("ofilecard", cArr, i28)) {
                                                int i29 = i28 + 9;
                                                str5 = "https://instagram.com/{user_name}/profilecard";
                                                if (i29 < i) {
                                                    Intent A02 = AbstractC35268Fh3.A02(context, "com.instagram.urlhandlers.profilecard.ProfilecardUrlHandlerActivity", str, cArr, i29);
                                                    if (A02 != null) {
                                                        A02.putExtra("matched_pattern", "https://instagram.com/{user_name}/profilecard");
                                                        A02.putExtra("access_scope", "PUBLIC");
                                                        A02.putExtra("enforce_scope", true);
                                                        A1m(A02);
                                                        A02.putExtra("app_set", "[]");
                                                        return A02;
                                                    }
                                                } else {
                                                    A09 = AbstractC35268Fh3.A00(context, A0C, "com.instagram.urlhandlers.profilecard.ProfilecardUrlHandlerActivity", str);
                                                    if (A09 == null) {
                                                        return A09;
                                                    }
                                                    A09.putExtra("matched_pattern", str5);
                                                    A09.putExtra("access_scope", "PUBLIC");
                                                    A09.putExtra("enforce_scope", true);
                                                    A1m(A09);
                                                    A09.putExtra("app_set", "[]");
                                                    return A09;
                                                }
                                            } else {
                                                return null;
                                            }
                                        } else {
                                            if (AbstractC35268Fh3.A08("rtfolio/", cArr, i28)) {
                                                int i30 = i28 + 8;
                                                intent = null;
                                                int[] A096 = AbstractC35268Fh3.A09(A0C, "short_code", cArr, i30);
                                                if (A096 != null) {
                                                    int i31 = A096[0];
                                                    int i32 = A096[1];
                                                    if (i32 >= 1 && i32 <= 3) {
                                                        AbstractC35268Fh3.A07(A0C, "short_code", cArr, i30, i31);
                                                        if (i <= i31 && (intent = A05(context, A0C, str)) != null) {
                                                            str6 = "https://instagram.com/{user_name}/portfolio/{short_code}";
                                                            intent.putExtra("matched_pattern", str6);
                                                            intent.putExtra("access_scope", "PUBLIC");
                                                            intent.putExtra("enforce_scope", true);
                                                            A1m(intent);
                                                            str4 = "app_set";
                                                        }
                                                    } else {
                                                        throw A1k(i32);
                                                    }
                                                }
                                                return intent;
                                            }
                                            return null;
                                        }
                                    } else {
                                        if (i28 >= i || cArr[i28] != '?') {
                                            int[] A097 = AbstractC35268Fh3.A09(A0C, "media_id", cArr, i28);
                                            intent = null;
                                            if (A097 != null) {
                                                int i33 = A097[0];
                                                int i34 = A097[1];
                                                if (i34 >= 1 && i34 <= 3) {
                                                    AbstractC35268Fh3.A07(A0C, "media_id", cArr, i28, i33);
                                                    if (i <= i33) {
                                                        intent = A0A(context, A0C, str);
                                                        if (intent != null) {
                                                            str6 = "https://instagram.com/{user_name}/p/{media_id}";
                                                            intent.putExtra("matched_pattern", str6);
                                                            intent.putExtra("access_scope", "PUBLIC");
                                                            intent.putExtra("enforce_scope", true);
                                                            A1m(intent);
                                                            str4 = "app_set";
                                                        }
                                                        return intent;
                                                    }
                                                    int i35 = i33 + 1;
                                                    char c7 = cArr[i33];
                                                    if (c7 == '/') {
                                                        c7 = cArr[i35];
                                                        i35++;
                                                    }
                                                    if (c7 == '?') {
                                                        int i36 = i - i35;
                                                        String A0i4 = AbstractC31171DnF.A0i(cArr, i35, i36);
                                                        int i37 = 0;
                                                        while (true) {
                                                            if (i37 < i36) {
                                                                int A014 = A01(A0i4, i37);
                                                                if (A014 < 0) {
                                                                    break;
                                                                }
                                                                String substring12 = A0i4.substring(i37, A014);
                                                                int A004 = A00(A0i4, A014);
                                                                int i38 = A014 + 1;
                                                                if (A004 > 0) {
                                                                    substring5 = A0i4.substring(i38, A004);
                                                                    i37 = A004 + 1;
                                                                } else {
                                                                    substring5 = A0i4.substring(i38);
                                                                    i37 = A0i4.length();
                                                                }
                                                                bundle = A1f(A0C, bundle, substring12, substring5);
                                                            } else {
                                                                intent = A0A(context, A0C, str);
                                                                if (intent != null) {
                                                                    str6 = "https://instagram.com/{user_name}/p/{media_id}?extra={?extra}";
                                                                }
                                                            }
                                                        }
                                                    }
                                                    return intent;
                                                }
                                                throw A1k(i34);
                                            }
                                            return null;
                                        }
                                        return null;
                                    }
                                }
                                return null;
                            }
                            intent = null;
                            if (!AbstractC35268Fh3.A08("ive", cArr, i7)) {
                                return null;
                            }
                            int i39 = i7 + 3;
                            if (i39 < i) {
                                int i40 = i39 + 1;
                                char c8 = cArr[i39];
                                if (c8 != '/') {
                                    if (c8 != '?') {
                                        return null;
                                    }
                                } else if (i40 < i && cArr[i40] == '?') {
                                    i40++;
                                } else {
                                    int[] A098 = AbstractC35268Fh3.A09(A0C, TraceFieldType.BroadcastId, cArr, i40);
                                    if (A098 != null) {
                                        int i41 = A098[0];
                                        int i42 = A098[1];
                                        if (i42 >= 1 && i42 <= 3) {
                                            AbstractC35268Fh3.A07(A0C, TraceFieldType.BroadcastId, cArr, i40, i41);
                                            if (i <= i41) {
                                                intent = A09(context, A0C, str);
                                                if (intent != null) {
                                                    str6 = "https://instagram.com/{user_name}/live/{broadcast_id}";
                                                    intent.putExtra("matched_pattern", str6);
                                                    intent.putExtra("access_scope", "PUBLIC");
                                                    intent.putExtra("enforce_scope", true);
                                                    A1m(intent);
                                                    str4 = "app_set";
                                                }
                                                return intent;
                                            }
                                            int i43 = i41 + 1;
                                            char c9 = cArr[i41];
                                            if (c9 == '/') {
                                                c9 = cArr[i43];
                                                i43++;
                                            }
                                            if (c9 == '?') {
                                                int i44 = i - i43;
                                                String A0i5 = AbstractC31171DnF.A0i(cArr, i43, i44);
                                                int i45 = 0;
                                                while (true) {
                                                    if (i45 < i44) {
                                                        int A015 = A01(A0i5, i45);
                                                        if (A015 < 0) {
                                                            break;
                                                        }
                                                        String substring13 = A0i5.substring(i45, A015);
                                                        int A005 = A00(A0i5, A015);
                                                        int i46 = A015 + 1;
                                                        if (A005 > 0) {
                                                            substring3 = A0i5.substring(i46, A005);
                                                            i45 = A005 + 1;
                                                        } else {
                                                            substring3 = A0i5.substring(i46);
                                                            i45 = A0i5.length();
                                                        }
                                                        bundle = A1f(A0C, bundle, substring13, substring3);
                                                    } else {
                                                        intent = A09(context, A0C, str);
                                                        if (intent != null) {
                                                            str6 = "https://instagram.com/{user_name}/live/{broadcast_id}?extra={?extra}";
                                                        }
                                                    }
                                                }
                                            }
                                            return intent;
                                        }
                                        throw A1k(i42);
                                    }
                                    return null;
                                }
                                int i47 = i - i40;
                                String A0i6 = AbstractC31171DnF.A0i(cArr, i40, i47);
                                int i48 = 0;
                                while (true) {
                                    if (i48 < i47) {
                                        int A016 = A01(A0i6, i48);
                                        if (A016 < 0) {
                                            break;
                                        }
                                        String substring14 = A0i6.substring(i48, A016);
                                        int A006 = A00(A0i6, A016);
                                        int i49 = A016 + 1;
                                        if (A006 > 0) {
                                            substring4 = A0i6.substring(i49, A006);
                                            i48 = A006 + 1;
                                        } else {
                                            substring4 = A0i6.substring(i49);
                                            i48 = A0i6.length();
                                        }
                                        bundle = A1f(A0C, bundle, substring14, substring4);
                                    } else {
                                        intent = A09(context, A0C, str);
                                        if (intent != null) {
                                            str6 = "https://instagram.com/{user_name}/live?extra={?extra}";
                                        }
                                    }
                                }
                                return intent;
                            }
                            A09 = A09(context, A0C, str);
                            if (A09 != null) {
                                str5 = "https://instagram.com/{user_name}/live";
                                A09.putExtra("matched_pattern", str5);
                                A09.putExtra("access_scope", "PUBLIC");
                                A09.putExtra("enforce_scope", true);
                                A1m(A09);
                                A09.putExtra("app_set", "[]");
                                return A09;
                            }
                            return A09;
                            intent.putExtra(str4, str2);
                            return intent;
                        }
                        if (AbstractC35268Fh3.A08("uide/", cArr, i7)) {
                            int i50 = i7 + 5;
                            int[] A099 = AbstractC35268Fh3.A09(A0C, "id_or_title", cArr, i50);
                            intent = null;
                            if (A099 != null) {
                                int i51 = A099[0];
                                int i52 = A099[1];
                                if (i52 >= 1 && i52 <= 3) {
                                    AbstractC35268Fh3.A07(A0C, "id_or_title", cArr, i50, i51);
                                    str2 = "[]";
                                    if (i <= i51) {
                                        intent = A0C(context, A0C, str);
                                        if (intent != null) {
                                            str3 = "https://instagram.com/{user_name}/guide/{id_or_title}";
                                            intent.putExtra("matched_pattern", str3);
                                            intent.putExtra("access_scope", "PUBLIC");
                                            intent.putExtra("enforce_scope", true);
                                            A1m(intent);
                                            str4 = "app_set";
                                        }
                                        return intent;
                                    }
                                    int i53 = i51 + 1;
                                    char c10 = cArr[i51];
                                    if (c10 == '/') {
                                        int[] A0910 = AbstractC35268Fh3.A09(A0C, "guide_id", cArr, i53);
                                        if (A0910 != null) {
                                            int i54 = A0910[0];
                                            int i55 = A0910[1];
                                            if (i55 >= 1 && i55 <= 3) {
                                                AbstractC35268Fh3.A07(A0C, "guide_id", cArr, i53, i54);
                                                if (i <= i54) {
                                                    intent = A0C(context, A0C, str);
                                                    if (intent != null) {
                                                        str3 = "https://instagram.com/{user_name}/guide/{id_or_title}/{guide_id}";
                                                        intent.putExtra("matched_pattern", str3);
                                                        intent.putExtra("access_scope", "PUBLIC");
                                                        intent.putExtra("enforce_scope", true);
                                                        A1m(intent);
                                                        str4 = "app_set";
                                                    }
                                                } else {
                                                    int i56 = i54 + 1;
                                                    char c11 = cArr[i54];
                                                    if (c11 == '/') {
                                                        c11 = cArr[i56];
                                                        i56++;
                                                    }
                                                    if (c11 == '?') {
                                                        int i57 = i - i56;
                                                        String A0i7 = AbstractC31171DnF.A0i(cArr, i56, i57);
                                                        int i58 = 0;
                                                        while (true) {
                                                            if (i58 < i57) {
                                                                int A017 = A01(A0i7, i58);
                                                                if (A017 < 0) {
                                                                    break;
                                                                }
                                                                String substring15 = A0i7.substring(i58, A017);
                                                                int A007 = A00(A0i7, A017);
                                                                int i59 = A017 + 1;
                                                                if (A007 > 0) {
                                                                    substring2 = A0i7.substring(i59, A007);
                                                                    i58 = A007 + 1;
                                                                } else {
                                                                    substring2 = A0i7.substring(i59);
                                                                    i58 = A0i7.length();
                                                                }
                                                                bundle = A1g(A0C, bundle, substring15, "igshid", substring2);
                                                            } else {
                                                                intent = A0C(context, A0C, str);
                                                                if (intent != null) {
                                                                    str3 = "https://instagram.com/{user_name}/guide/{id_or_title}/{guide_id}?igshid={?igshid}";
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            } else {
                                                throw A1k(i55);
                                            }
                                        }
                                        return intent;
                                    }
                                    if (c10 == '?') {
                                        int i60 = i - i53;
                                        String A0i8 = AbstractC31171DnF.A0i(cArr, i53, i60);
                                        int i61 = 0;
                                        while (true) {
                                            if (i61 < i60) {
                                                int A018 = A01(A0i8, i61);
                                                if (A018 < 0) {
                                                    break;
                                                }
                                                String substring16 = A0i8.substring(i61, A018);
                                                int A008 = A00(A0i8, A018);
                                                int i62 = A018 + 1;
                                                if (A008 > 0) {
                                                    substring = A0i8.substring(i62, A008);
                                                    i61 = A008 + 1;
                                                } else {
                                                    substring = A0i8.substring(i62);
                                                    i61 = A0i8.length();
                                                }
                                                bundle = A1g(A0C, bundle, substring16, "igshid", substring);
                                            } else {
                                                intent = A0C(context, A0C, str);
                                                if (intent != null) {
                                                    str3 = "https://instagram.com/{user_name}/guide/{id_or_title}?igshid={?igshid}";
                                                }
                                            }
                                        }
                                    }
                                    return intent;
                                    intent.putExtra(str4, str2);
                                    return intent;
                                }
                                throw A1k(i52);
                            }
                            return null;
                        }
                    }
                }
            } else {
                throw A1k(i5);
            }
        }
        return null;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:22:0x0062. Please report as an issue. */
    public static Intent A1N(Context context, String str, char[] cArr, int i) {
        String substring;
        Bundle A0C = AbstractC31174DnI.A0C();
        Intent intent = null;
        int[] A09 = AbstractC35268Fh3.A09(A0C, "effect_id", cArr, 17);
        if (A09 != null) {
            int A02 = A02(A09);
            int i2 = A09[1];
            if (i2 >= 1 && i2 <= 3) {
                AbstractC35268Fh3.A07(A0C, "effect_id", cArr, 17, A02);
                if (i > A02) {
                    int i3 = A02 + 1;
                    char c = cArr[A02];
                    if (c == '/') {
                        c = cArr[i3];
                        i3++;
                    }
                    if (c == '?') {
                        int i4 = i - i3;
                        String A0i = AbstractC31171DnF.A0i(cArr, i3, i4);
                        Bundle bundle = null;
                        int i5 = 0;
                        int i6 = 0;
                        while (true) {
                            if (i5 < i4) {
                                int A01 = A01(A0i, i5);
                                if (A01 >= 0) {
                                    String substring2 = A0i.substring(i5, A01);
                                    int A00 = A00(A0i, A01);
                                    int i7 = A01 + 1;
                                    if (A00 > 0) {
                                        substring = A0i.substring(i7, A00);
                                        i5 = A00 + 1;
                                    } else {
                                        substring = A0i.substring(i7);
                                        i5 = A0i.length();
                                    }
                                    switch (substring2.hashCode()) {
                                        case -1468661111:
                                            if (!substring2.equals("effect_id")) {
                                                bundle = A1j(substring2, substring, bundle);
                                            } else {
                                                i6 |= 2;
                                                A0C.putString("effect_id", substring);
                                            }
                                        case -934358473:
                                            if (!substring2.equals("rev_id")) {
                                                bundle = A1j(substring2, substring, bundle);
                                            } else {
                                                i6 |= 4;
                                                A0C.putString("rev_id", substring);
                                            }
                                        case 3173:
                                            if (!substring2.equals("ch")) {
                                                bundle = A1j(substring2, substring, bundle);
                                            } else {
                                                i6 |= 1;
                                                A0C.putString("ch", substring);
                                            }
                                        case 114148:
                                            if (!substring2.equals("src")) {
                                                bundle = A1j(substring2, substring, bundle);
                                            } else if (!substring.equals("vc")) {
                                                break;
                                            } else {
                                                i6 |= 8;
                                            }
                                        case 2071166924:
                                            if (!substring2.equals("utm_source")) {
                                                bundle = A1j(substring2, substring, bundle);
                                            } else {
                                                i6 |= 16;
                                                A0C.putString("utm_source", substring);
                                            }
                                        default:
                                            bundle = A1j(substring2, substring, bundle);
                                    }
                                }
                            } else if ((i6 | 8) == i6 && (intent = AbstractC35268Fh3.A00(context, A0C, "com.instagram.urlhandlers.rtceffect.RtcEffectUrlHandlerActivity", str)) != null) {
                                A1q(intent, "https://instagram.com/ar/{effect_id}/?effect_id={?effect_id}&utm_source={?utm_source}&ch={?ch}&rev_id={?rev_id}&src=vc");
                                return intent;
                            }
                        }
                    }
                }
            } else {
                throw A1k(i2);
            }
        }
        return intent;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:41:0x00b0. Please report as an issue. */
    public static Intent A1O(Context context, String str, char[] cArr, int i) {
        String str2;
        String substring;
        String str3;
        String substring2;
        String str4;
        Bundle A0C = AbstractC31174DnI.A0C();
        Bundle bundle = null;
        int[] A09 = AbstractC35268Fh3.A09(A0C, "VALUE", cArr, 22);
        Intent intent = null;
        if (A09 == null) {
            return null;
        }
        int i2 = A09[0];
        int i3 = A09[1];
        if (i3 >= 1 && i3 <= 3) {
            AbstractC35268Fh3.A07(A0C, "VALUE", cArr, 22, i2);
            if (i <= i2) {
                intent = A0E(context, A0C, str);
                if (intent != null) {
                    str2 = "https://instagram.com/channel/{VALUE}";
                    intent.putExtra("matched_pattern", str2);
                    intent.putExtra("access_scope", "PUBLIC");
                    intent.putExtra("enforce_scope", true);
                    A1m(intent);
                    intent.putExtra("app_set", "[]");
                }
                return intent;
            }
            int i4 = i2 + 1;
            char c = cArr[i2];
            if (c == '/') {
                int[] A092 = AbstractC35268Fh3.A09(A0C, "content", cArr, i4);
                if (A092 != null) {
                    int i5 = A092[0];
                    int i6 = A092[1];
                    if (i6 >= 1 && i6 <= 3) {
                        AbstractC35268Fh3.A07(A0C, "content", cArr, i4, i5);
                        if (i <= i5) {
                            intent = A0E(context, A0C, str);
                            if (intent != null) {
                                str2 = "https://instagram.com/channel/{VALUE}/{content}";
                                intent.putExtra("matched_pattern", str2);
                                intent.putExtra("access_scope", "PUBLIC");
                                intent.putExtra("enforce_scope", true);
                                A1m(intent);
                                intent.putExtra("app_set", "[]");
                            }
                        } else {
                            int i7 = i5 + 1;
                            char c2 = cArr[i5];
                            if (c2 == '/') {
                                c2 = cArr[i7];
                                i7++;
                            }
                            if (c2 == '?') {
                                int i8 = i - i7;
                                String A0i = AbstractC31171DnF.A0i(cArr, i7, i8);
                                int i9 = 0;
                                while (true) {
                                    if (i9 < i8) {
                                        int A01 = A01(A0i, i9);
                                        if (A01 >= 0) {
                                            String substring3 = A0i.substring(i9, A01);
                                            int A00 = A00(A0i, A01);
                                            int i10 = A01 + 1;
                                            if (A00 > 0) {
                                                substring2 = A0i.substring(i10, A00);
                                                i9 = A00 + 1;
                                            } else {
                                                substring2 = A0i.substring(i10);
                                                i9 = A0i.length();
                                            }
                                            switch (substring3.hashCode()) {
                                                case -1281232384:
                                                    if (!A1y(substring3)) {
                                                        bundle = A1j(substring3, substring2, bundle);
                                                        break;
                                                    } else {
                                                        str4 = PublicKeyCredentialControllerUtility.JSON_KEY_ID;
                                                        A0C.putString(str4, substring2);
                                                        break;
                                                    }
                                                case 115:
                                                    if (!A1x(substring3)) {
                                                        bundle = A1j(substring3, substring2, bundle);
                                                        break;
                                                    } else {
                                                        str4 = CacheBehaviorLogger.SOURCE;
                                                        A0C.putString(str4, substring2);
                                                        break;
                                                    }
                                                case 3230707:
                                                    if (!substring3.equals("igsh")) {
                                                        bundle = A1j(substring3, substring2, bundle);
                                                        break;
                                                    } else {
                                                        str4 = "share_id";
                                                        A0C.putString(str4, substring2);
                                                        break;
                                                    }
                                                default:
                                                    bundle = A1j(substring3, substring2, bundle);
                                                    break;
                                            }
                                        }
                                    } else {
                                        intent = A0E(context, A0C, str);
                                        if (intent != null) {
                                            str2 = "https://instagram.com/channel/{VALUE}/{content}?s={?source}&fbclid={?id}";
                                        }
                                    }
                                }
                            }
                        }
                    } else {
                        throw A1k(i6);
                    }
                }
                return intent;
            }
            if (c == '?') {
                int i11 = i - i4;
                String A0i2 = AbstractC31171DnF.A0i(cArr, i4, i11);
                int i12 = 0;
                while (true) {
                    if (i12 < i11) {
                        int A012 = A01(A0i2, i12);
                        if (A012 < 0) {
                            break;
                        }
                        String substring4 = A0i2.substring(i12, A012);
                        int A002 = A00(A0i2, A012);
                        int i13 = A012 + 1;
                        if (A002 > 0) {
                            substring = A0i2.substring(i13, A002);
                            i12 = A002 + 1;
                        } else {
                            substring = A0i2.substring(i13);
                            i12 = A0i2.length();
                        }
                        if (!A1y(substring4)) {
                            if (!A1x(substring4)) {
                                bundle = A1j(substring4, substring, bundle);
                            } else {
                                str3 = CacheBehaviorLogger.SOURCE;
                            }
                        } else {
                            str3 = PublicKeyCredentialControllerUtility.JSON_KEY_ID;
                        }
                        A0C.putString(str3, substring);
                    } else {
                        intent = A0E(context, A0C, str);
                        if (intent != null) {
                            str2 = "https://instagram.com/channel/{VALUE}?s={?source}&fbclid={?id}";
                        }
                    }
                }
            }
            return intent;
        }
        throw A1k(i3);
    }

    public static Intent A1P(Context context, String str, char[] cArr, int i) {
        String str2;
        String substring;
        String substring2;
        Bundle A0C = AbstractC31174DnI.A0C();
        Bundle bundle = null;
        int[] A09 = AbstractC35268Fh3.A09(A0C, "explore_type", cArr, 22);
        if (A09 != null) {
            int i2 = A09[0];
            int i3 = A09[1];
            if (i3 >= 1 && i3 <= 3) {
                AbstractC35268Fh3.A07(A0C, "explore_type", cArr, 22, i2);
                if (i > i2) {
                    int i4 = i2 + 1;
                    if (cArr[i2] == '/') {
                        int[] A092 = AbstractC35268Fh3.A09(A0C, "explore_param", cArr, i4);
                        Intent intent = null;
                        if (A092 != null) {
                            int i5 = A092[0];
                            int i6 = A092[1];
                            if (i6 >= 1 && i6 <= 3) {
                                AbstractC35268Fh3.A07(A0C, "explore_param", cArr, i4, i5);
                                if (i <= i5) {
                                    intent = A0F(context, A0C, str);
                                    if (intent != null) {
                                        str2 = "https://instagram.com/explore/{explore_type}/{explore_param}";
                                        intent.putExtra("matched_pattern", str2);
                                        intent.putExtra("access_scope", "PUBLIC");
                                        intent.putExtra("enforce_scope", true);
                                        A1m(intent);
                                        intent.putExtra("app_set", "[]");
                                    }
                                } else {
                                    int i7 = i5 + 1;
                                    char c = cArr[i5];
                                    if (c == '/') {
                                        int[] A093 = AbstractC35268Fh3.A09(A0C, "dummy", cArr, i7);
                                        if (A093 != null) {
                                            int i8 = A093[0];
                                            int i9 = A093[1];
                                            if (i9 >= 1 && i9 <= 3) {
                                                AbstractC35268Fh3.A07(A0C, "dummy", cArr, i7, i8);
                                                if (i <= i8) {
                                                    intent = A0F(context, A0C, str);
                                                    if (intent != null) {
                                                        str2 = "https://instagram.com/explore/{explore_type}/{explore_param}/{dummy}";
                                                        intent.putExtra("matched_pattern", str2);
                                                        intent.putExtra("access_scope", "PUBLIC");
                                                        intent.putExtra("enforce_scope", true);
                                                        A1m(intent);
                                                        intent.putExtra("app_set", "[]");
                                                    }
                                                } else {
                                                    int i10 = i8 + 1;
                                                    char c2 = cArr[i8];
                                                    if (c2 == '/') {
                                                        c2 = cArr[i10];
                                                        i10++;
                                                    }
                                                    if (c2 == '?') {
                                                        int i11 = i - i10;
                                                        String A0i = AbstractC31171DnF.A0i(cArr, i10, i11);
                                                        int i12 = 0;
                                                        while (true) {
                                                            if (i12 < i11) {
                                                                int A01 = A01(A0i, i12);
                                                                if (A01 < 0) {
                                                                    break;
                                                                }
                                                                String substring3 = A0i.substring(i12, A01);
                                                                int A00 = A00(A0i, A01);
                                                                int i13 = A01 + 1;
                                                                if (A00 > 0) {
                                                                    substring2 = A0i.substring(i13, A00);
                                                                    i12 = A00 + 1;
                                                                } else {
                                                                    substring2 = A0i.substring(i13);
                                                                    i12 = A0i.length();
                                                                }
                                                                bundle = A1f(A0C, bundle, substring3, substring2);
                                                            } else {
                                                                intent = A0F(context, A0C, str);
                                                                if (intent != null) {
                                                                    str2 = "https://instagram.com/explore/{explore_type}/{explore_param}/{dummy}?extra={?extra}";
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            } else {
                                                throw A1k(i9);
                                            }
                                        }
                                    } else if (c == '?') {
                                        int i14 = i - i7;
                                        String A0i2 = AbstractC31171DnF.A0i(cArr, i7, i14);
                                        int i15 = 0;
                                        while (true) {
                                            if (i15 < i14) {
                                                int A012 = A01(A0i2, i15);
                                                if (A012 < 0) {
                                                    break;
                                                }
                                                String substring4 = A0i2.substring(i15, A012);
                                                int A002 = A00(A0i2, A012);
                                                int i16 = A012 + 1;
                                                if (A002 > 0) {
                                                    substring = A0i2.substring(i16, A002);
                                                    i15 = A002 + 1;
                                                } else {
                                                    substring = A0i2.substring(i16);
                                                    i15 = A0i2.length();
                                                }
                                                bundle = A1f(A0C, bundle, substring4, substring);
                                            } else {
                                                intent = A0F(context, A0C, str);
                                                if (intent != null) {
                                                    str2 = "https://instagram.com/explore/{explore_type}/{explore_param}?extra={?extra}";
                                                }
                                            }
                                        }
                                    }
                                }
                            } else {
                                throw A1k(i6);
                            }
                        }
                        return intent;
                    }
                }
            } else {
                throw A1k(i3);
            }
        }
        return null;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:41:0x00b0. Please report as an issue. */
    public static Intent A1Q(Context context, String str, char[] cArr, int i) {
        String str2;
        String substring;
        String str3;
        String substring2;
        String str4;
        Bundle A0C = AbstractC31174DnI.A0C();
        Bundle bundle = null;
        int[] A09 = AbstractC35268Fh3.A09(A0C, "VALUE", cArr, 16);
        Intent intent = null;
        if (A09 == null) {
            return null;
        }
        int i2 = A09[0];
        int i3 = A09[1];
        if (i3 >= 1 && i3 <= 3) {
            AbstractC35268Fh3.A07(A0C, "VALUE", cArr, 16, i2);
            if (i <= i2) {
                intent = A0E(context, A0C, str);
                if (intent != null) {
                    str2 = "https://instagram.com/j/{VALUE}";
                    intent.putExtra("matched_pattern", str2);
                    intent.putExtra("access_scope", "PUBLIC");
                    intent.putExtra("enforce_scope", true);
                    A1m(intent);
                    intent.putExtra("app_set", "[]");
                }
                return intent;
            }
            int i4 = i2 + 1;
            char c = cArr[i2];
            if (c == '/') {
                int[] A092 = AbstractC35268Fh3.A09(A0C, "content", cArr, i4);
                if (A092 != null) {
                    int i5 = A092[0];
                    int i6 = A092[1];
                    if (i6 >= 1 && i6 <= 3) {
                        AbstractC35268Fh3.A07(A0C, "content", cArr, i4, i5);
                        if (i <= i5) {
                            intent = A0E(context, A0C, str);
                            if (intent != null) {
                                str2 = "https://instagram.com/j/{VALUE}/{content}";
                                intent.putExtra("matched_pattern", str2);
                                intent.putExtra("access_scope", "PUBLIC");
                                intent.putExtra("enforce_scope", true);
                                A1m(intent);
                                intent.putExtra("app_set", "[]");
                            }
                        } else {
                            int i7 = i5 + 1;
                            char c2 = cArr[i5];
                            if (c2 == '/') {
                                c2 = cArr[i7];
                                i7++;
                            }
                            if (c2 == '?') {
                                int i8 = i - i7;
                                String A0i = AbstractC31171DnF.A0i(cArr, i7, i8);
                                int i9 = 0;
                                while (true) {
                                    if (i9 < i8) {
                                        int A01 = A01(A0i, i9);
                                        if (A01 >= 0) {
                                            String substring3 = A0i.substring(i9, A01);
                                            int A00 = A00(A0i, A01);
                                            int i10 = A01 + 1;
                                            if (A00 > 0) {
                                                substring2 = A0i.substring(i10, A00);
                                                i9 = A00 + 1;
                                            } else {
                                                substring2 = A0i.substring(i10);
                                                i9 = A0i.length();
                                            }
                                            switch (substring3.hashCode()) {
                                                case -1281232384:
                                                    if (!A1y(substring3)) {
                                                        bundle = A1j(substring3, substring2, bundle);
                                                        break;
                                                    } else {
                                                        str4 = PublicKeyCredentialControllerUtility.JSON_KEY_ID;
                                                        A0C.putString(str4, substring2);
                                                        break;
                                                    }
                                                case 115:
                                                    if (!A1x(substring3)) {
                                                        bundle = A1j(substring3, substring2, bundle);
                                                        break;
                                                    } else {
                                                        str4 = CacheBehaviorLogger.SOURCE;
                                                        A0C.putString(str4, substring2);
                                                        break;
                                                    }
                                                case 3230707:
                                                    if (!substring3.equals("igsh")) {
                                                        bundle = A1j(substring3, substring2, bundle);
                                                        break;
                                                    } else {
                                                        str4 = "share_id";
                                                        A0C.putString(str4, substring2);
                                                        break;
                                                    }
                                                default:
                                                    bundle = A1j(substring3, substring2, bundle);
                                                    break;
                                            }
                                        }
                                    } else {
                                        intent = A0E(context, A0C, str);
                                        if (intent != null) {
                                            str2 = "https://instagram.com/j/{VALUE}/{content}?s={?source}&fbclid={?id}";
                                        }
                                    }
                                }
                            }
                        }
                    } else {
                        throw A1k(i6);
                    }
                }
                return intent;
            }
            if (c == '?') {
                int i11 = i - i4;
                String A0i2 = AbstractC31171DnF.A0i(cArr, i4, i11);
                int i12 = 0;
                while (true) {
                    if (i12 < i11) {
                        int A012 = A01(A0i2, i12);
                        if (A012 < 0) {
                            break;
                        }
                        String substring4 = A0i2.substring(i12, A012);
                        int A002 = A00(A0i2, A012);
                        int i13 = A012 + 1;
                        if (A002 > 0) {
                            substring = A0i2.substring(i13, A002);
                            i12 = A002 + 1;
                        } else {
                            substring = A0i2.substring(i13);
                            i12 = A0i2.length();
                        }
                        if (!A1y(substring4)) {
                            if (!A1x(substring4)) {
                                bundle = A1j(substring4, substring, bundle);
                            } else {
                                str3 = CacheBehaviorLogger.SOURCE;
                            }
                        } else {
                            str3 = PublicKeyCredentialControllerUtility.JSON_KEY_ID;
                        }
                        A0C.putString(str3, substring);
                    } else {
                        intent = A0E(context, A0C, str);
                        if (intent != null) {
                            str2 = "https://instagram.com/j/{VALUE}?s={?source}&fbclid={?id}";
                        }
                    }
                }
            }
            return intent;
        }
        throw A1k(i3);
    }

    public static Intent A1R(Context context, String str, char[] cArr, int i) {
        Bundle A0C = AbstractC31174DnI.A0C();
        Intent intent = null;
        int[] A09 = AbstractC35268Fh3.A09(A0C, "deeplink", cArr, 22);
        if (A09 != null) {
            int A02 = A02(A09);
            int i2 = A09[1];
            if (i2 >= 1 && i2 <= 3) {
                AbstractC35268Fh3.A07(A0C, "deeplink", cArr, 22, A02);
                if (i <= A02 && (intent = AbstractC35268Fh3.A00(context, A0C, "com.instagram.urlhandlers.mdpmap.MdpInstagramUniversalDeeplinkRedirectionActivity", str)) != null) {
                    A1q(intent, "https://instagram.com/linking/{deeplink}");
                }
            } else {
                throw A1k(i2);
            }
        }
        return intent;
    }

    public static Intent A1S(Context context, String str, char[] cArr, int i) {
        String str2;
        String substring;
        Bundle A0C = AbstractC31174DnI.A0C();
        Bundle bundle = null;
        int[] A09 = AbstractC35268Fh3.A09(A0C, "clip_id", cArr, 20);
        Intent intent = null;
        if (A09 == null) {
            return null;
        }
        int A02 = A02(A09);
        int i2 = A09[1];
        if (i2 >= 1 && i2 <= 3) {
            AbstractC35268Fh3.A07(A0C, "clip_id", cArr, 20, A02);
            if (i <= A02) {
                intent = A07(context, A0C, str);
                if (intent != null) {
                    str2 = "https://instagram.com/reels/{clip_id}";
                    intent.putExtra("matched_pattern", str2);
                    intent.putExtra("access_scope", "PUBLIC");
                    intent.putExtra("enforce_scope", true);
                    A1m(intent);
                    intent.putExtra("app_set", "[]");
                }
                return intent;
            }
            int i3 = A02 + 1;
            char c = cArr[A02];
            if (c == '/') {
                c = cArr[i3];
                i3++;
            }
            if (c == '?') {
                int i4 = i - i3;
                String A0i = AbstractC31171DnF.A0i(cArr, i3, i4);
                int i5 = 0;
                while (true) {
                    if (i5 < i4) {
                        int A01 = A01(A0i, i5);
                        if (A01 < 0) {
                            break;
                        }
                        String substring2 = A0i.substring(i5, A01);
                        int A00 = A00(A0i, A01);
                        int i6 = A01 + 1;
                        if (A00 > 0) {
                            substring = A0i.substring(i6, A00);
                            i5 = A00 + 1;
                        } else {
                            substring = A0i.substring(i6);
                            i5 = A0i.length();
                        }
                        bundle = A1f(A0C, bundle, substring2, substring);
                    } else {
                        intent = A07(context, A0C, str);
                        if (intent != null) {
                            str2 = "https://instagram.com/reels/{clip_id}?extra={?extra}";
                        }
                    }
                }
            }
            return intent;
        }
        throw A1k(i2);
    }

    public static Intent A1T(Context context, String str, char[] cArr, int i) {
        Bundle A0C = AbstractC31174DnI.A0C();
        Intent intent = null;
        int[] A09 = AbstractC35268Fh3.A09(A0C, "any", cArr, 18);
        if (A09 != null) {
            int A02 = A02(A09);
            int i2 = A09[1];
            if (i2 >= 1 && i2 <= 3) {
                AbstractC35268Fh3.A07(A0C, "any", cArr, 18, A02);
                if (i <= A02 && (intent = AbstractC35268Fh3.A00(context, A0C, "com.instagram.urlhandlers.avatareditor.AvatarEditorUrlHandlerActivity", str)) != null) {
                    A1q(intent, "http://ig.me/avatar/edit/{any}");
                }
            } else {
                throw A1k(i2);
            }
        }
        return intent;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:41:0x00b0. Please report as an issue. */
    public static Intent A1U(Context context, String str, char[] cArr, int i) {
        String str2;
        String substring;
        String str3;
        String substring2;
        String str4;
        Bundle A0C = AbstractC31174DnI.A0C();
        Bundle bundle = null;
        int[] A09 = AbstractC35268Fh3.A09(A0C, "VALUE", cArr, 14);
        Intent intent = null;
        if (A09 == null) {
            return null;
        }
        int i2 = A09[0];
        int i3 = A09[1];
        if (i3 >= 1 && i3 <= 3) {
            AbstractC35268Fh3.A07(A0C, "VALUE", cArr, 14, i2);
            if (i <= i2) {
                intent = A0E(context, A0C, str);
                if (intent != null) {
                    str2 = "http://ig.me/channel/{VALUE}";
                    intent.putExtra("matched_pattern", str2);
                    intent.putExtra("access_scope", "PUBLIC");
                    intent.putExtra("enforce_scope", true);
                    A1m(intent);
                    intent.putExtra("app_set", "[]");
                }
                return intent;
            }
            int i4 = i2 + 1;
            char c = cArr[i2];
            if (c == '/') {
                int[] A092 = AbstractC35268Fh3.A09(A0C, "content", cArr, i4);
                if (A092 != null) {
                    int i5 = A092[0];
                    int i6 = A092[1];
                    if (i6 >= 1 && i6 <= 3) {
                        AbstractC35268Fh3.A07(A0C, "content", cArr, i4, i5);
                        if (i <= i5) {
                            intent = A0E(context, A0C, str);
                            if (intent != null) {
                                str2 = "http://ig.me/channel/{VALUE}/{content}";
                                intent.putExtra("matched_pattern", str2);
                                intent.putExtra("access_scope", "PUBLIC");
                                intent.putExtra("enforce_scope", true);
                                A1m(intent);
                                intent.putExtra("app_set", "[]");
                            }
                        } else {
                            int i7 = i5 + 1;
                            char c2 = cArr[i5];
                            if (c2 == '/') {
                                c2 = cArr[i7];
                                i7++;
                            }
                            if (c2 == '?') {
                                int i8 = i - i7;
                                String A0i = AbstractC31171DnF.A0i(cArr, i7, i8);
                                int i9 = 0;
                                while (true) {
                                    if (i9 < i8) {
                                        int A01 = A01(A0i, i9);
                                        if (A01 >= 0) {
                                            String substring3 = A0i.substring(i9, A01);
                                            int A00 = A00(A0i, A01);
                                            int i10 = A01 + 1;
                                            if (A00 > 0) {
                                                substring2 = A0i.substring(i10, A00);
                                                i9 = A00 + 1;
                                            } else {
                                                substring2 = A0i.substring(i10);
                                                i9 = A0i.length();
                                            }
                                            switch (substring3.hashCode()) {
                                                case -1281232384:
                                                    if (!A1y(substring3)) {
                                                        bundle = A1j(substring3, substring2, bundle);
                                                        break;
                                                    } else {
                                                        str4 = PublicKeyCredentialControllerUtility.JSON_KEY_ID;
                                                        A0C.putString(str4, substring2);
                                                        break;
                                                    }
                                                case 115:
                                                    if (!A1x(substring3)) {
                                                        bundle = A1j(substring3, substring2, bundle);
                                                        break;
                                                    } else {
                                                        str4 = CacheBehaviorLogger.SOURCE;
                                                        A0C.putString(str4, substring2);
                                                        break;
                                                    }
                                                case 3230707:
                                                    if (!substring3.equals("igsh")) {
                                                        bundle = A1j(substring3, substring2, bundle);
                                                        break;
                                                    } else {
                                                        str4 = "share_id";
                                                        A0C.putString(str4, substring2);
                                                        break;
                                                    }
                                                default:
                                                    bundle = A1j(substring3, substring2, bundle);
                                                    break;
                                            }
                                        }
                                    } else {
                                        intent = A0E(context, A0C, str);
                                        if (intent != null) {
                                            str2 = "http://ig.me/channel/{VALUE}/{content}?s={?source}&fbclid={?id}";
                                        }
                                    }
                                }
                            }
                        }
                    } else {
                        throw A1k(i6);
                    }
                }
                return intent;
            }
            if (c == '?') {
                int i11 = i - i4;
                String A0i2 = AbstractC31171DnF.A0i(cArr, i4, i11);
                int i12 = 0;
                while (true) {
                    if (i12 < i11) {
                        int A012 = A01(A0i2, i12);
                        if (A012 < 0) {
                            break;
                        }
                        String substring4 = A0i2.substring(i12, A012);
                        int A002 = A00(A0i2, A012);
                        int i13 = A012 + 1;
                        if (A002 > 0) {
                            substring = A0i2.substring(i13, A002);
                            i12 = A002 + 1;
                        } else {
                            substring = A0i2.substring(i13);
                            i12 = A0i2.length();
                        }
                        if (!A1y(substring4)) {
                            if (!A1x(substring4)) {
                                bundle = A1j(substring4, substring, bundle);
                            } else {
                                str3 = CacheBehaviorLogger.SOURCE;
                            }
                        } else {
                            str3 = PublicKeyCredentialControllerUtility.JSON_KEY_ID;
                        }
                        A0C.putString(str3, substring);
                    } else {
                        intent = A0E(context, A0C, str);
                        if (intent != null) {
                            str2 = "http://ig.me/channel/{VALUE}?s={?source}&fbclid={?id}";
                        }
                    }
                }
            }
            return intent;
        }
        throw A1k(i3);
    }

    public static Intent A1V(Context context, String str, char[] cArr, int i) {
        Intent intent;
        String str2;
        String str3;
        String substring;
        String substring2;
        String str4;
        Intent A09;
        String str5;
        String str6;
        String substring3;
        String substring4;
        String substring5;
        int i2;
        String substring6;
        String substring7;
        int i3;
        int[] A092;
        String substring8;
        Bundle A0C = AbstractC31174DnI.A0C();
        Bundle bundle = null;
        int[] A093 = AbstractC35268Fh3.A09(A0C, "user_name", cArr, 18);
        if (A093 != null) {
            int i4 = A093[0];
            int i5 = A093[1];
            if (i5 >= 1 && i5 <= 3) {
                AbstractC35268Fh3.A07(A0C, "user_name", cArr, 18, i4);
                if (i > i4) {
                    int i6 = i4 + 1;
                    if (cArr[i4] == '/' && i6 < i) {
                        int i7 = i6 + 1;
                        char c = cArr[i6];
                        if (c != 'g') {
                            str2 = "[]";
                            if (c != 'l') {
                                if (c != 'p') {
                                    if (c != 'r') {
                                        if (c == 't') {
                                            intent = null;
                                            if (AbstractC35268Fh3.A08("v/", cArr, i7) && (A092 = AbstractC35268Fh3.A09(A0C, "tv_id", cArr, (i3 = i7 + 2))) != null) {
                                                int i8 = A092[0];
                                                int i9 = A092[1];
                                                if (i9 >= 1 && i9 <= 3) {
                                                    AbstractC35268Fh3.A07(A0C, "tv_id", cArr, i3, i8);
                                                    if (i <= i8) {
                                                        intent = A04(context, A0C, str);
                                                        if (intent != null) {
                                                            str6 = "https://www.instagram.com/{user_name}/tv/{tv_id}";
                                                            intent.putExtra("matched_pattern", str6);
                                                            intent.putExtra("access_scope", "PUBLIC");
                                                            intent.putExtra("enforce_scope", true);
                                                            A1m(intent);
                                                            str4 = "app_set";
                                                        }
                                                        return intent;
                                                    }
                                                    int i10 = i8 + 1;
                                                    char c2 = cArr[i8];
                                                    if (c2 == '/') {
                                                        c2 = cArr[i10];
                                                        i10++;
                                                    }
                                                    if (c2 == '?') {
                                                        int i11 = i - i10;
                                                        String A0i = AbstractC31171DnF.A0i(cArr, i10, i11);
                                                        int i12 = 0;
                                                        while (true) {
                                                            if (i12 < i11) {
                                                                int A01 = A01(A0i, i12);
                                                                if (A01 < 0) {
                                                                    break;
                                                                }
                                                                String substring9 = A0i.substring(i12, A01);
                                                                int A00 = A00(A0i, A01);
                                                                int i13 = A01 + 1;
                                                                if (A00 > 0) {
                                                                    substring8 = A0i.substring(i13, A00);
                                                                    i12 = A00 + 1;
                                                                } else {
                                                                    substring8 = A0i.substring(i13);
                                                                    i12 = A0i.length();
                                                                }
                                                                bundle = A1e(A0C, bundle, substring9, substring8);
                                                            } else {
                                                                intent = A04(context, A0C, str);
                                                                if (intent != null) {
                                                                    str6 = "https://www.instagram.com/{user_name}/tv/{tv_id}?igid={?extra}";
                                                                }
                                                            }
                                                        }
                                                    }
                                                    return intent;
                                                }
                                                throw A1k(i9);
                                            }
                                            return null;
                                        }
                                        return null;
                                    }
                                    if (AbstractC35268Fh3.A08("eel", cArr, i7) && (i2 = i7 + 3) < i) {
                                        int i14 = i2 + 1;
                                        char c3 = cArr[i2];
                                        if (c3 != '/') {
                                            if (c3 == 's' && i14 < i) {
                                                int i15 = i14 + 1;
                                                if (cArr[i14] == '/') {
                                                    if (i15 >= i || cArr[i15] != '?') {
                                                        int[] A094 = AbstractC35268Fh3.A09(A0C, "clip_id", cArr, i15);
                                                        intent = null;
                                                        if (A094 != null) {
                                                            int i16 = A094[0];
                                                            int i17 = A094[1];
                                                            if (i17 >= 1 && i17 <= 3) {
                                                                AbstractC35268Fh3.A07(A0C, "clip_id", cArr, i15, i16);
                                                                if (i <= i16) {
                                                                    intent = A07(context, A0C, str);
                                                                    if (intent != null) {
                                                                        str6 = "https://www.instagram.com/{user_name}/reels/{clip_id}";
                                                                        intent.putExtra("matched_pattern", str6);
                                                                        intent.putExtra("access_scope", "PUBLIC");
                                                                        intent.putExtra("enforce_scope", true);
                                                                        A1m(intent);
                                                                        str4 = "app_set";
                                                                    }
                                                                    return intent;
                                                                }
                                                                int i18 = i16 + 1;
                                                                char c4 = cArr[i16];
                                                                if (c4 == '/') {
                                                                    c4 = cArr[i18];
                                                                    i18++;
                                                                }
                                                                if (c4 == '?') {
                                                                    int i19 = i - i18;
                                                                    String A0i2 = AbstractC31171DnF.A0i(cArr, i18, i19);
                                                                    int i20 = 0;
                                                                    while (true) {
                                                                        if (i20 < i19) {
                                                                            int A012 = A01(A0i2, i20);
                                                                            if (A012 < 0) {
                                                                                break;
                                                                            }
                                                                            String substring10 = A0i2.substring(i20, A012);
                                                                            int A002 = A00(A0i2, A012);
                                                                            int i21 = A012 + 1;
                                                                            if (A002 > 0) {
                                                                                substring7 = A0i2.substring(i21, A002);
                                                                                i20 = A002 + 1;
                                                                            } else {
                                                                                substring7 = A0i2.substring(i21);
                                                                                i20 = A0i2.length();
                                                                            }
                                                                            bundle = A1f(A0C, bundle, substring10, substring7);
                                                                        } else {
                                                                            intent = A07(context, A0C, str);
                                                                            if (intent != null) {
                                                                                str6 = "https://www.instagram.com/{user_name}/reels/{clip_id}?extra={?extra}";
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                                return intent;
                                                            }
                                                            throw A1k(i17);
                                                        }
                                                        return null;
                                                    }
                                                    return null;
                                                }
                                                return null;
                                            }
                                            return null;
                                        }
                                        if (i14 >= i || cArr[i14] != '?') {
                                            int[] A095 = AbstractC35268Fh3.A09(A0C, "clip_id", cArr, i14);
                                            intent = null;
                                            if (A095 != null) {
                                                int i22 = A095[0];
                                                int i23 = A095[1];
                                                if (i23 >= 1 && i23 <= 3) {
                                                    AbstractC35268Fh3.A07(A0C, "clip_id", cArr, i14, i22);
                                                    if (i <= i22) {
                                                        intent = A07(context, A0C, str);
                                                        if (intent != null) {
                                                            str6 = "https://www.instagram.com/{user_name}/reel/{clip_id}";
                                                            intent.putExtra("matched_pattern", str6);
                                                            intent.putExtra("access_scope", "PUBLIC");
                                                            intent.putExtra("enforce_scope", true);
                                                            A1m(intent);
                                                            str4 = "app_set";
                                                        }
                                                        return intent;
                                                    }
                                                    int i24 = i22 + 1;
                                                    char c5 = cArr[i22];
                                                    if (c5 == '/') {
                                                        c5 = cArr[i24];
                                                        i24++;
                                                    }
                                                    if (c5 == '?') {
                                                        int i25 = i - i24;
                                                        String A0i3 = AbstractC31171DnF.A0i(cArr, i24, i25);
                                                        int i26 = 0;
                                                        while (true) {
                                                            if (i26 < i25) {
                                                                int A013 = A01(A0i3, i26);
                                                                if (A013 < 0) {
                                                                    break;
                                                                }
                                                                String substring11 = A0i3.substring(i26, A013);
                                                                int A003 = A00(A0i3, A013);
                                                                int i27 = A013 + 1;
                                                                if (A003 > 0) {
                                                                    substring6 = A0i3.substring(i27, A003);
                                                                    i26 = A003 + 1;
                                                                } else {
                                                                    substring6 = A0i3.substring(i27);
                                                                    i26 = A0i3.length();
                                                                }
                                                                bundle = A1f(A0C, bundle, substring11, substring6);
                                                            } else {
                                                                intent = A07(context, A0C, str);
                                                                if (intent != null) {
                                                                    str6 = "https://www.instagram.com/{user_name}/reel/{clip_id}?extra={?extra}";
                                                                }
                                                            }
                                                        }
                                                    }
                                                    return intent;
                                                }
                                                throw A1k(i23);
                                            }
                                        }
                                        return null;
                                    }
                                    return null;
                                }
                                if (i7 < i) {
                                    int i28 = i7 + 1;
                                    char c6 = cArr[i7];
                                    if (c6 != '/') {
                                        if (c6 != 'o') {
                                            if (c6 == 'r' && AbstractC35268Fh3.A08("ofilecard", cArr, i28)) {
                                                int i29 = i28 + 9;
                                                str5 = "https://www.instagram.com/{user_name}/profilecard";
                                                if (i29 < i) {
                                                    Intent A02 = AbstractC35268Fh3.A02(context, "com.instagram.urlhandlers.profilecard.ProfilecardUrlHandlerActivity", str, cArr, i29);
                                                    if (A02 != null) {
                                                        A02.putExtra("matched_pattern", "https://www.instagram.com/{user_name}/profilecard");
                                                        A02.putExtra("access_scope", "PUBLIC");
                                                        A02.putExtra("enforce_scope", true);
                                                        A1m(A02);
                                                        A02.putExtra("app_set", "[]");
                                                        return A02;
                                                    }
                                                } else {
                                                    A09 = AbstractC35268Fh3.A00(context, A0C, "com.instagram.urlhandlers.profilecard.ProfilecardUrlHandlerActivity", str);
                                                    if (A09 == null) {
                                                        return A09;
                                                    }
                                                    A09.putExtra("matched_pattern", str5);
                                                    A09.putExtra("access_scope", "PUBLIC");
                                                    A09.putExtra("enforce_scope", true);
                                                    A1m(A09);
                                                    A09.putExtra("app_set", "[]");
                                                    return A09;
                                                }
                                            } else {
                                                return null;
                                            }
                                        } else {
                                            if (AbstractC35268Fh3.A08("rtfolio/", cArr, i28)) {
                                                int i30 = i28 + 8;
                                                intent = null;
                                                int[] A096 = AbstractC35268Fh3.A09(A0C, "short_code", cArr, i30);
                                                if (A096 != null) {
                                                    int i31 = A096[0];
                                                    int i32 = A096[1];
                                                    if (i32 >= 1 && i32 <= 3) {
                                                        AbstractC35268Fh3.A07(A0C, "short_code", cArr, i30, i31);
                                                        if (i <= i31 && (intent = A05(context, A0C, str)) != null) {
                                                            str6 = "https://www.instagram.com/{user_name}/portfolio/{short_code}";
                                                            intent.putExtra("matched_pattern", str6);
                                                            intent.putExtra("access_scope", "PUBLIC");
                                                            intent.putExtra("enforce_scope", true);
                                                            A1m(intent);
                                                            str4 = "app_set";
                                                        }
                                                    } else {
                                                        throw A1k(i32);
                                                    }
                                                }
                                                return intent;
                                            }
                                            return null;
                                        }
                                    } else {
                                        if (i28 >= i || cArr[i28] != '?') {
                                            int[] A097 = AbstractC35268Fh3.A09(A0C, "media_id", cArr, i28);
                                            intent = null;
                                            if (A097 != null) {
                                                int i33 = A097[0];
                                                int i34 = A097[1];
                                                if (i34 >= 1 && i34 <= 3) {
                                                    AbstractC35268Fh3.A07(A0C, "media_id", cArr, i28, i33);
                                                    if (i <= i33) {
                                                        intent = A0A(context, A0C, str);
                                                        if (intent != null) {
                                                            str6 = "https://www.instagram.com/{user_name}/p/{media_id}";
                                                            intent.putExtra("matched_pattern", str6);
                                                            intent.putExtra("access_scope", "PUBLIC");
                                                            intent.putExtra("enforce_scope", true);
                                                            A1m(intent);
                                                            str4 = "app_set";
                                                        }
                                                        return intent;
                                                    }
                                                    int i35 = i33 + 1;
                                                    char c7 = cArr[i33];
                                                    if (c7 == '/') {
                                                        c7 = cArr[i35];
                                                        i35++;
                                                    }
                                                    if (c7 == '?') {
                                                        int i36 = i - i35;
                                                        String A0i4 = AbstractC31171DnF.A0i(cArr, i35, i36);
                                                        int i37 = 0;
                                                        while (true) {
                                                            if (i37 < i36) {
                                                                int A014 = A01(A0i4, i37);
                                                                if (A014 < 0) {
                                                                    break;
                                                                }
                                                                String substring12 = A0i4.substring(i37, A014);
                                                                int A004 = A00(A0i4, A014);
                                                                int i38 = A014 + 1;
                                                                if (A004 > 0) {
                                                                    substring5 = A0i4.substring(i38, A004);
                                                                    i37 = A004 + 1;
                                                                } else {
                                                                    substring5 = A0i4.substring(i38);
                                                                    i37 = A0i4.length();
                                                                }
                                                                bundle = A1f(A0C, bundle, substring12, substring5);
                                                            } else {
                                                                intent = A0A(context, A0C, str);
                                                                if (intent != null) {
                                                                    str6 = "https://www.instagram.com/{user_name}/p/{media_id}?extra={?extra}";
                                                                }
                                                            }
                                                        }
                                                    }
                                                    return intent;
                                                }
                                                throw A1k(i34);
                                            }
                                            return null;
                                        }
                                        return null;
                                    }
                                }
                                return null;
                            }
                            intent = null;
                            if (!AbstractC35268Fh3.A08("ive", cArr, i7)) {
                                return null;
                            }
                            int i39 = i7 + 3;
                            if (i39 < i) {
                                int i40 = i39 + 1;
                                char c8 = cArr[i39];
                                if (c8 != '/') {
                                    if (c8 != '?') {
                                        return null;
                                    }
                                } else if (i40 < i && cArr[i40] == '?') {
                                    i40++;
                                } else {
                                    int[] A098 = AbstractC35268Fh3.A09(A0C, TraceFieldType.BroadcastId, cArr, i40);
                                    if (A098 != null) {
                                        int i41 = A098[0];
                                        int i42 = A098[1];
                                        if (i42 >= 1 && i42 <= 3) {
                                            AbstractC35268Fh3.A07(A0C, TraceFieldType.BroadcastId, cArr, i40, i41);
                                            if (i <= i41) {
                                                intent = A09(context, A0C, str);
                                                if (intent != null) {
                                                    str6 = "https://www.instagram.com/{user_name}/live/{broadcast_id}";
                                                    intent.putExtra("matched_pattern", str6);
                                                    intent.putExtra("access_scope", "PUBLIC");
                                                    intent.putExtra("enforce_scope", true);
                                                    A1m(intent);
                                                    str4 = "app_set";
                                                }
                                                return intent;
                                            }
                                            int i43 = i41 + 1;
                                            char c9 = cArr[i41];
                                            if (c9 == '/') {
                                                c9 = cArr[i43];
                                                i43++;
                                            }
                                            if (c9 == '?') {
                                                int i44 = i - i43;
                                                String A0i5 = AbstractC31171DnF.A0i(cArr, i43, i44);
                                                int i45 = 0;
                                                while (true) {
                                                    if (i45 < i44) {
                                                        int A015 = A01(A0i5, i45);
                                                        if (A015 < 0) {
                                                            break;
                                                        }
                                                        String substring13 = A0i5.substring(i45, A015);
                                                        int A005 = A00(A0i5, A015);
                                                        int i46 = A015 + 1;
                                                        if (A005 > 0) {
                                                            substring3 = A0i5.substring(i46, A005);
                                                            i45 = A005 + 1;
                                                        } else {
                                                            substring3 = A0i5.substring(i46);
                                                            i45 = A0i5.length();
                                                        }
                                                        bundle = A1f(A0C, bundle, substring13, substring3);
                                                    } else {
                                                        intent = A09(context, A0C, str);
                                                        if (intent != null) {
                                                            str6 = "https://www.instagram.com/{user_name}/live/{broadcast_id}?extra={?extra}";
                                                        }
                                                    }
                                                }
                                            }
                                            return intent;
                                        }
                                        throw A1k(i42);
                                    }
                                    return null;
                                }
                                int i47 = i - i40;
                                String A0i6 = AbstractC31171DnF.A0i(cArr, i40, i47);
                                int i48 = 0;
                                while (true) {
                                    if (i48 < i47) {
                                        int A016 = A01(A0i6, i48);
                                        if (A016 < 0) {
                                            break;
                                        }
                                        String substring14 = A0i6.substring(i48, A016);
                                        int A006 = A00(A0i6, A016);
                                        int i49 = A016 + 1;
                                        if (A006 > 0) {
                                            substring4 = A0i6.substring(i49, A006);
                                            i48 = A006 + 1;
                                        } else {
                                            substring4 = A0i6.substring(i49);
                                            i48 = A0i6.length();
                                        }
                                        bundle = A1f(A0C, bundle, substring14, substring4);
                                    } else {
                                        intent = A09(context, A0C, str);
                                        if (intent != null) {
                                            str6 = "https://www.instagram.com/{user_name}/live?extra={?extra}";
                                        }
                                    }
                                }
                                return intent;
                            }
                            A09 = A09(context, A0C, str);
                            if (A09 != null) {
                                str5 = "https://www.instagram.com/{user_name}/live";
                                A09.putExtra("matched_pattern", str5);
                                A09.putExtra("access_scope", "PUBLIC");
                                A09.putExtra("enforce_scope", true);
                                A1m(A09);
                                A09.putExtra("app_set", "[]");
                                return A09;
                            }
                            return A09;
                            intent.putExtra(str4, str2);
                            return intent;
                        }
                        if (AbstractC35268Fh3.A08("uide/", cArr, i7)) {
                            int i50 = i7 + 5;
                            int[] A099 = AbstractC35268Fh3.A09(A0C, "id_or_title", cArr, i50);
                            intent = null;
                            if (A099 != null) {
                                int i51 = A099[0];
                                int i52 = A099[1];
                                if (i52 >= 1 && i52 <= 3) {
                                    AbstractC35268Fh3.A07(A0C, "id_or_title", cArr, i50, i51);
                                    str2 = "[]";
                                    if (i <= i51) {
                                        intent = A0C(context, A0C, str);
                                        if (intent != null) {
                                            str3 = "https://www.instagram.com/{user_name}/guide/{id_or_title}";
                                            intent.putExtra("matched_pattern", str3);
                                            intent.putExtra("access_scope", "PUBLIC");
                                            intent.putExtra("enforce_scope", true);
                                            A1m(intent);
                                            str4 = "app_set";
                                        }
                                        return intent;
                                    }
                                    int i53 = i51 + 1;
                                    char c10 = cArr[i51];
                                    if (c10 == '/') {
                                        int[] A0910 = AbstractC35268Fh3.A09(A0C, "guide_id", cArr, i53);
                                        if (A0910 != null) {
                                            int i54 = A0910[0];
                                            int i55 = A0910[1];
                                            if (i55 >= 1 && i55 <= 3) {
                                                AbstractC35268Fh3.A07(A0C, "guide_id", cArr, i53, i54);
                                                if (i <= i54) {
                                                    intent = A0C(context, A0C, str);
                                                    if (intent != null) {
                                                        str3 = "https://www.instagram.com/{user_name}/guide/{id_or_title}/{guide_id}";
                                                        intent.putExtra("matched_pattern", str3);
                                                        intent.putExtra("access_scope", "PUBLIC");
                                                        intent.putExtra("enforce_scope", true);
                                                        A1m(intent);
                                                        str4 = "app_set";
                                                    }
                                                } else {
                                                    int i56 = i54 + 1;
                                                    char c11 = cArr[i54];
                                                    if (c11 == '/') {
                                                        c11 = cArr[i56];
                                                        i56++;
                                                    }
                                                    if (c11 == '?') {
                                                        int i57 = i - i56;
                                                        String A0i7 = AbstractC31171DnF.A0i(cArr, i56, i57);
                                                        int i58 = 0;
                                                        while (true) {
                                                            if (i58 < i57) {
                                                                int A017 = A01(A0i7, i58);
                                                                if (A017 < 0) {
                                                                    break;
                                                                }
                                                                String substring15 = A0i7.substring(i58, A017);
                                                                int A007 = A00(A0i7, A017);
                                                                int i59 = A017 + 1;
                                                                if (A007 > 0) {
                                                                    substring2 = A0i7.substring(i59, A007);
                                                                    i58 = A007 + 1;
                                                                } else {
                                                                    substring2 = A0i7.substring(i59);
                                                                    i58 = A0i7.length();
                                                                }
                                                                bundle = A1g(A0C, bundle, substring15, "igshid", substring2);
                                                            } else {
                                                                intent = A0C(context, A0C, str);
                                                                if (intent != null) {
                                                                    str3 = "https://www.instagram.com/{user_name}/guide/{id_or_title}/{guide_id}?igshid={?igshid}";
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            } else {
                                                throw A1k(i55);
                                            }
                                        }
                                        return intent;
                                    }
                                    if (c10 == '?') {
                                        int i60 = i - i53;
                                        String A0i8 = AbstractC31171DnF.A0i(cArr, i53, i60);
                                        int i61 = 0;
                                        while (true) {
                                            if (i61 < i60) {
                                                int A018 = A01(A0i8, i61);
                                                if (A018 < 0) {
                                                    break;
                                                }
                                                String substring16 = A0i8.substring(i61, A018);
                                                int A008 = A00(A0i8, A018);
                                                int i62 = A018 + 1;
                                                if (A008 > 0) {
                                                    substring = A0i8.substring(i62, A008);
                                                    i61 = A008 + 1;
                                                } else {
                                                    substring = A0i8.substring(i62);
                                                    i61 = A0i8.length();
                                                }
                                                bundle = A1g(A0C, bundle, substring16, "igshid", substring);
                                            } else {
                                                intent = A0C(context, A0C, str);
                                                if (intent != null) {
                                                    str3 = "https://www.instagram.com/{user_name}/guide/{id_or_title}?igshid={?igshid}";
                                                }
                                            }
                                        }
                                        intent.putExtra("matched_pattern", str3);
                                        intent.putExtra("access_scope", "PUBLIC");
                                        intent.putExtra("enforce_scope", true);
                                        A1m(intent);
                                        str4 = "app_set";
                                    }
                                    return intent;
                                    intent.putExtra(str4, str2);
                                    return intent;
                                }
                                throw A1k(i52);
                            }
                            return null;
                        }
                    }
                }
            } else {
                throw A1k(i5);
            }
        }
        return null;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:22:0x0062. Please report as an issue. */
    public static Intent A1W(Context context, String str, char[] cArr, int i) {
        String substring;
        Bundle A0C = AbstractC31174DnI.A0C();
        Intent intent = null;
        int[] A09 = AbstractC35268Fh3.A09(A0C, "effect_id", cArr, 21);
        if (A09 != null) {
            int A02 = A02(A09);
            int i2 = A09[1];
            if (i2 >= 1 && i2 <= 3) {
                AbstractC35268Fh3.A07(A0C, "effect_id", cArr, 21, A02);
                if (i > A02) {
                    int i3 = A02 + 1;
                    char c = cArr[A02];
                    if (c == '/') {
                        c = cArr[i3];
                        i3++;
                    }
                    if (c == '?') {
                        int i4 = i - i3;
                        String A0i = AbstractC31171DnF.A0i(cArr, i3, i4);
                        Bundle bundle = null;
                        int i5 = 0;
                        int i6 = 0;
                        while (true) {
                            if (i5 < i4) {
                                int A01 = A01(A0i, i5);
                                if (A01 >= 0) {
                                    String substring2 = A0i.substring(i5, A01);
                                    int A00 = A00(A0i, A01);
                                    int i7 = A01 + 1;
                                    if (A00 > 0) {
                                        substring = A0i.substring(i7, A00);
                                        i5 = A00 + 1;
                                    } else {
                                        substring = A0i.substring(i7);
                                        i5 = A0i.length();
                                    }
                                    switch (substring2.hashCode()) {
                                        case -1468661111:
                                            if (!substring2.equals("effect_id")) {
                                                bundle = A1j(substring2, substring, bundle);
                                            } else {
                                                i6 |= 2;
                                                A0C.putString("effect_id", substring);
                                            }
                                        case -934358473:
                                            if (!substring2.equals("rev_id")) {
                                                bundle = A1j(substring2, substring, bundle);
                                            } else {
                                                i6 |= 4;
                                                A0C.putString("rev_id", substring);
                                            }
                                        case 3173:
                                            if (!substring2.equals("ch")) {
                                                bundle = A1j(substring2, substring, bundle);
                                            } else {
                                                i6 |= 1;
                                                A0C.putString("ch", substring);
                                            }
                                        case 114148:
                                            if (!substring2.equals("src")) {
                                                bundle = A1j(substring2, substring, bundle);
                                            } else if (!substring.equals("vc")) {
                                                break;
                                            } else {
                                                i6 |= 8;
                                            }
                                        case 2071166924:
                                            if (!substring2.equals("utm_source")) {
                                                bundle = A1j(substring2, substring, bundle);
                                            } else {
                                                i6 |= 16;
                                                A0C.putString("utm_source", substring);
                                            }
                                        default:
                                            bundle = A1j(substring2, substring, bundle);
                                    }
                                }
                            } else if ((i6 | 8) == i6 && (intent = AbstractC35268Fh3.A00(context, A0C, "com.instagram.urlhandlers.rtceffect.RtcEffectUrlHandlerActivity", str)) != null) {
                                A1q(intent, "https://www.instagram.com/ar/{effect_id}/?effect_id={?effect_id}&utm_source={?utm_source}&ch={?ch}&rev_id={?rev_id}&src=vc");
                                return intent;
                            }
                        }
                    }
                }
            } else {
                throw A1k(i2);
            }
        }
        return intent;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:41:0x00b0. Please report as an issue. */
    public static Intent A1X(Context context, String str, char[] cArr, int i) {
        String str2;
        String substring;
        String str3;
        String substring2;
        String str4;
        Bundle A0C = AbstractC31174DnI.A0C();
        Bundle bundle = null;
        int[] A09 = AbstractC35268Fh3.A09(A0C, "VALUE", cArr, 26);
        Intent intent = null;
        if (A09 == null) {
            return null;
        }
        int i2 = A09[0];
        int i3 = A09[1];
        if (i3 >= 1 && i3 <= 3) {
            AbstractC35268Fh3.A07(A0C, "VALUE", cArr, 26, i2);
            if (i <= i2) {
                intent = A0E(context, A0C, str);
                if (intent != null) {
                    str2 = "https://www.instagram.com/channel/{VALUE}";
                    intent.putExtra("matched_pattern", str2);
                    intent.putExtra("access_scope", "PUBLIC");
                    intent.putExtra("enforce_scope", true);
                    A1m(intent);
                    intent.putExtra("app_set", "[]");
                }
                return intent;
            }
            int i4 = i2 + 1;
            char c = cArr[i2];
            if (c == '/') {
                int[] A092 = AbstractC35268Fh3.A09(A0C, "content", cArr, i4);
                if (A092 != null) {
                    int i5 = A092[0];
                    int i6 = A092[1];
                    if (i6 >= 1 && i6 <= 3) {
                        AbstractC35268Fh3.A07(A0C, "content", cArr, i4, i5);
                        if (i <= i5) {
                            intent = A0E(context, A0C, str);
                            if (intent != null) {
                                str2 = "https://www.instagram.com/channel/{VALUE}/{content}";
                                intent.putExtra("matched_pattern", str2);
                                intent.putExtra("access_scope", "PUBLIC");
                                intent.putExtra("enforce_scope", true);
                                A1m(intent);
                                intent.putExtra("app_set", "[]");
                            }
                        } else {
                            int i7 = i5 + 1;
                            char c2 = cArr[i5];
                            if (c2 == '/') {
                                c2 = cArr[i7];
                                i7++;
                            }
                            if (c2 == '?') {
                                int i8 = i - i7;
                                String A0i = AbstractC31171DnF.A0i(cArr, i7, i8);
                                int i9 = 0;
                                while (true) {
                                    if (i9 < i8) {
                                        int A01 = A01(A0i, i9);
                                        if (A01 >= 0) {
                                            String substring3 = A0i.substring(i9, A01);
                                            int A00 = A00(A0i, A01);
                                            int i10 = A01 + 1;
                                            if (A00 > 0) {
                                                substring2 = A0i.substring(i10, A00);
                                                i9 = A00 + 1;
                                            } else {
                                                substring2 = A0i.substring(i10);
                                                i9 = A0i.length();
                                            }
                                            switch (substring3.hashCode()) {
                                                case -1281232384:
                                                    if (!A1y(substring3)) {
                                                        bundle = A1j(substring3, substring2, bundle);
                                                        break;
                                                    } else {
                                                        str4 = PublicKeyCredentialControllerUtility.JSON_KEY_ID;
                                                        A0C.putString(str4, substring2);
                                                        break;
                                                    }
                                                case 115:
                                                    if (!A1x(substring3)) {
                                                        bundle = A1j(substring3, substring2, bundle);
                                                        break;
                                                    } else {
                                                        str4 = CacheBehaviorLogger.SOURCE;
                                                        A0C.putString(str4, substring2);
                                                        break;
                                                    }
                                                case 3230707:
                                                    if (!substring3.equals("igsh")) {
                                                        bundle = A1j(substring3, substring2, bundle);
                                                        break;
                                                    } else {
                                                        str4 = "share_id";
                                                        A0C.putString(str4, substring2);
                                                        break;
                                                    }
                                                default:
                                                    bundle = A1j(substring3, substring2, bundle);
                                                    break;
                                            }
                                        }
                                    } else {
                                        intent = A0E(context, A0C, str);
                                        if (intent != null) {
                                            str2 = "https://www.instagram.com/channel/{VALUE}/{content}?s={?source}&fbclid={?id}";
                                        }
                                    }
                                }
                            }
                        }
                    } else {
                        throw A1k(i6);
                    }
                }
                return intent;
            }
            if (c == '?') {
                int i11 = i - i4;
                String A0i2 = AbstractC31171DnF.A0i(cArr, i4, i11);
                int i12 = 0;
                while (true) {
                    if (i12 < i11) {
                        int A012 = A01(A0i2, i12);
                        if (A012 < 0) {
                            break;
                        }
                        String substring4 = A0i2.substring(i12, A012);
                        int A002 = A00(A0i2, A012);
                        int i13 = A012 + 1;
                        if (A002 > 0) {
                            substring = A0i2.substring(i13, A002);
                            i12 = A002 + 1;
                        } else {
                            substring = A0i2.substring(i13);
                            i12 = A0i2.length();
                        }
                        if (!A1y(substring4)) {
                            if (!A1x(substring4)) {
                                bundle = A1j(substring4, substring, bundle);
                            } else {
                                str3 = CacheBehaviorLogger.SOURCE;
                            }
                        } else {
                            str3 = PublicKeyCredentialControllerUtility.JSON_KEY_ID;
                        }
                        A0C.putString(str3, substring);
                    } else {
                        intent = A0E(context, A0C, str);
                        if (intent != null) {
                            str2 = "https://www.instagram.com/channel/{VALUE}?s={?source}&fbclid={?id}";
                        }
                    }
                }
            }
            return intent;
        }
        throw A1k(i3);
    }

    public static Intent A1Y(Context context, String str, char[] cArr, int i) {
        Bundle A0C = AbstractC31174DnI.A0C();
        Intent intent = null;
        int[] A09 = AbstractC35268Fh3.A09(A0C, "deeplink", cArr, 26);
        if (A09 != null) {
            int A02 = A02(A09);
            int i2 = A09[1];
            if (i2 >= 1 && i2 <= 3) {
                AbstractC35268Fh3.A07(A0C, "deeplink", cArr, 26, A02);
                if (i <= A02 && (intent = AbstractC35268Fh3.A00(context, A0C, "com.instagram.urlhandlers.mdpmap.MdpInstagramUniversalDeeplinkRedirectionActivity", str)) != null) {
                    A1q(intent, "https://www.instagram.com/linking/{deeplink}");
                }
            } else {
                throw A1k(i2);
            }
        }
        return intent;
    }

    public static Intent A1Z(Context context, String str, char[] cArr, int i) {
        String str2;
        String substring;
        Bundle A0C = AbstractC31174DnI.A0C();
        Bundle bundle = null;
        int[] A09 = AbstractC35268Fh3.A09(A0C, "clip_id", cArr, 24);
        Intent intent = null;
        if (A09 == null) {
            return null;
        }
        int A02 = A02(A09);
        int i2 = A09[1];
        if (i2 >= 1 && i2 <= 3) {
            AbstractC35268Fh3.A07(A0C, "clip_id", cArr, 24, A02);
            if (i <= A02) {
                intent = A07(context, A0C, str);
                if (intent != null) {
                    str2 = "https://www.instagram.com/reels/{clip_id}";
                    intent.putExtra("matched_pattern", str2);
                    intent.putExtra("access_scope", "PUBLIC");
                    intent.putExtra("enforce_scope", true);
                    A1m(intent);
                    intent.putExtra("app_set", "[]");
                }
                return intent;
            }
            int i3 = A02 + 1;
            char c = cArr[A02];
            if (c == '/') {
                c = cArr[i3];
                i3++;
            }
            if (c == '?') {
                int i4 = i - i3;
                String A0i = AbstractC31171DnF.A0i(cArr, i3, i4);
                int i5 = 0;
                while (true) {
                    if (i5 < i4) {
                        int A01 = A01(A0i, i5);
                        if (A01 < 0) {
                            break;
                        }
                        String substring2 = A0i.substring(i5, A01);
                        int A00 = A00(A0i, A01);
                        int i6 = A01 + 1;
                        if (A00 > 0) {
                            substring = A0i.substring(i6, A00);
                            i5 = A00 + 1;
                        } else {
                            substring = A0i.substring(i6);
                            i5 = A0i.length();
                        }
                        bundle = A1f(A0C, bundle, substring2, substring);
                    } else {
                        intent = A07(context, A0C, str);
                        if (intent != null) {
                            str2 = "https://www.instagram.com/reels/{clip_id}?extra={?extra}";
                        }
                    }
                }
            }
            return intent;
        }
        throw A1k(i2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:168:0x01f6, code lost:
    
        if (r1 != null) goto L318;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static android.content.Intent A1b(android.content.Context r18, java.lang.String r19, char[] r20, int r21) {
        /*
            Method dump skipped, instructions count: 1316
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC35278FhD.A1b(android.content.Context, java.lang.String, char[], int):android.content.Intent");
    }

    public static Intent A1c(Context context, String str, char[] cArr, int i) {
        Intent intent;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        String str8;
        String substring;
        String substring2;
        String str9;
        Intent intent2;
        String str10;
        String substring3;
        String substring4;
        String substring5;
        String str11;
        int i2;
        String substring6;
        String str12;
        String substring7;
        String str13;
        String substring8;
        Bundle A0C = AbstractC31174DnI.A0C();
        Bundle bundle = null;
        int[] A09 = AbstractC35268Fh3.A09(A0C, "user_name", cArr, 22);
        Intent intent3 = null;
        if (A09 == null) {
            return null;
        }
        int i3 = A09[0];
        int i4 = A09[1];
        if (i4 >= 1 && i4 <= 3) {
            AbstractC35268Fh3.A07(A0C, "user_name", cArr, 22, i3);
            if (i > i3) {
                int i5 = i3 + 1;
                if (cArr[i3] == '/' && i5 < i) {
                    int i6 = i5 + 1;
                    char c = cArr[i5];
                    if (c != 'g') {
                        str2 = "app_set";
                        str3 = "enforce_scope";
                        str4 = "PUBLIC";
                        str5 = "access_scope";
                        str6 = "matched_pattern";
                        str7 = "[]";
                        if (c != 'l') {
                            if (c != 'p') {
                                if (c != 'r') {
                                    if (c == 't' && AbstractC35268Fh3.A08("v/", cArr, i6)) {
                                        int i7 = i6 + 2;
                                        int[] A092 = AbstractC35268Fh3.A09(A0C, "tv_id", cArr, i7);
                                        intent2 = null;
                                        if (A092 != null) {
                                            int i8 = A092[0];
                                            int i9 = A092[1];
                                            if (i9 >= 1 && i9 <= 3) {
                                                AbstractC35268Fh3.A07(A0C, "tv_id", cArr, i7, i8);
                                                if (i <= i8) {
                                                    intent2 = A04(context, A0C, str);
                                                    if (intent2 != null) {
                                                        str13 = "http://applink.instagram.com/{user_name}/tv/{tv_id}";
                                                        intent2.putExtra("matched_pattern", str13);
                                                        intent2.putExtra("access_scope", "PUBLIC");
                                                        intent2.putExtra("enforce_scope", true);
                                                        A1m(intent2);
                                                        intent2.putExtra("app_set", "[]");
                                                    }
                                                    return intent2;
                                                }
                                                int i10 = i8 + 1;
                                                char c2 = cArr[i8];
                                                if (c2 == '/') {
                                                    c2 = cArr[i10];
                                                    i10++;
                                                }
                                                if (c2 == '?') {
                                                    int i11 = i - i10;
                                                    String A0i = AbstractC31171DnF.A0i(cArr, i10, i11);
                                                    int i12 = 0;
                                                    while (true) {
                                                        if (i12 < i11) {
                                                            int A01 = A01(A0i, i12);
                                                            if (A01 < 0) {
                                                                break;
                                                            }
                                                            String substring9 = A0i.substring(i12, A01);
                                                            int A00 = A00(A0i, A01);
                                                            int i13 = A01 + 1;
                                                            if (A00 > 0) {
                                                                substring8 = A0i.substring(i13, A00);
                                                                i12 = A00 + 1;
                                                            } else {
                                                                substring8 = A0i.substring(i13);
                                                                i12 = A0i.length();
                                                            }
                                                            bundle = A1e(A0C, bundle, substring9, substring8);
                                                        } else {
                                                            intent2 = A04(context, A0C, str);
                                                            if (intent2 != null) {
                                                                str13 = "http://applink.instagram.com/{user_name}/tv/{tv_id}?igid={?extra}";
                                                            }
                                                        }
                                                    }
                                                }
                                                return intent2;
                                            }
                                            throw A1k(i9);
                                        }
                                    }
                                } else if (AbstractC35268Fh3.A08("eel", cArr, i6) && (i2 = i6 + 3) < i) {
                                    int i14 = i2 + 1;
                                    char c3 = cArr[i2];
                                    if (c3 != '/') {
                                        if (c3 == 's') {
                                            if (i14 < i) {
                                                int i15 = i14 + 1;
                                                if (cArr[i14] == '/' && (i15 >= i || cArr[i15] != '?')) {
                                                    int[] A093 = AbstractC35268Fh3.A09(A0C, "clip_id", cArr, i15);
                                                    intent = null;
                                                    if (A093 != null) {
                                                        int i16 = A093[0];
                                                        int i17 = A093[1];
                                                        if (i17 >= 1 && i17 <= 3) {
                                                            AbstractC35268Fh3.A07(A0C, "clip_id", cArr, i15, i16);
                                                            if (i <= i16) {
                                                                intent = A07(context, A0C, str);
                                                                if (intent != null) {
                                                                    str12 = "http://applink.instagram.com/{user_name}/reels/{clip_id}";
                                                                    intent.putExtra("matched_pattern", str12);
                                                                    intent.putExtra("access_scope", "PUBLIC");
                                                                    intent.putExtra("enforce_scope", true);
                                                                    A1m(intent);
                                                                    intent.putExtra("app_set", "[]");
                                                                }
                                                                return intent;
                                                            }
                                                            int i18 = i16 + 1;
                                                            char c4 = cArr[i16];
                                                            if (c4 == '/') {
                                                                c4 = cArr[i18];
                                                                i18++;
                                                            }
                                                            if (c4 == '?') {
                                                                int i19 = i - i18;
                                                                String A0i2 = AbstractC31171DnF.A0i(cArr, i18, i19);
                                                                int i20 = 0;
                                                                while (true) {
                                                                    if (i20 < i19) {
                                                                        int A012 = A01(A0i2, i20);
                                                                        if (A012 < 0) {
                                                                            break;
                                                                        }
                                                                        String substring10 = A0i2.substring(i20, A012);
                                                                        int A002 = A00(A0i2, A012);
                                                                        int i21 = A012 + 1;
                                                                        if (A002 > 0) {
                                                                            substring7 = A0i2.substring(i21, A002);
                                                                            i20 = A002 + 1;
                                                                        } else {
                                                                            substring7 = A0i2.substring(i21);
                                                                            i20 = A0i2.length();
                                                                        }
                                                                        bundle = A1f(A0C, bundle, substring10, substring7);
                                                                    } else {
                                                                        intent = A07(context, A0C, str);
                                                                        if (intent != null) {
                                                                            str12 = "http://applink.instagram.com/{user_name}/reels/{clip_id}?extra={?extra}";
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                            return intent;
                                                        }
                                                        throw A1k(i17);
                                                    }
                                                }
                                            } else {
                                                intent3 = A07(context, A0C, str);
                                                if (intent3 != null) {
                                                    str9 = "http://applink.instagram.com/{user_name}/reels";
                                                    intent3.putExtra("matched_pattern", str9);
                                                    intent3.putExtra("access_scope", "PUBLIC");
                                                    intent3.putExtra("enforce_scope", true);
                                                    A1m(intent3);
                                                    intent3.putExtra("app_set", "[]");
                                                    return intent3;
                                                }
                                            }
                                        }
                                    } else if (i14 >= i || cArr[i14] != '?') {
                                        int[] A094 = AbstractC35268Fh3.A09(A0C, "clip_id", cArr, i14);
                                        intent = null;
                                        if (A094 != null) {
                                            int i22 = A094[0];
                                            int i23 = A094[1];
                                            if (i23 >= 1 && i23 <= 3) {
                                                AbstractC35268Fh3.A07(A0C, "clip_id", cArr, i14, i22);
                                                if (i <= i22) {
                                                    intent = A07(context, A0C, str);
                                                    if (intent != null) {
                                                        str11 = "http://applink.instagram.com/{user_name}/reel/{clip_id}";
                                                        intent.putExtra("matched_pattern", str11);
                                                        intent.putExtra("access_scope", "PUBLIC");
                                                        intent.putExtra("enforce_scope", true);
                                                        A1m(intent);
                                                        intent.putExtra("app_set", "[]");
                                                        return intent;
                                                    }
                                                    return intent;
                                                }
                                                int i24 = i22 + 1;
                                                char c5 = cArr[i22];
                                                if (c5 == '/') {
                                                    c5 = cArr[i24];
                                                    i24++;
                                                }
                                                if (c5 == '?') {
                                                    int i25 = i - i24;
                                                    String A0i3 = AbstractC31171DnF.A0i(cArr, i24, i25);
                                                    int i26 = 0;
                                                    while (true) {
                                                        if (i26 < i25) {
                                                            int A013 = A01(A0i3, i26);
                                                            if (A013 < 0) {
                                                                break;
                                                            }
                                                            String substring11 = A0i3.substring(i26, A013);
                                                            int A003 = A00(A0i3, A013);
                                                            int i27 = A013 + 1;
                                                            if (A003 > 0) {
                                                                substring6 = A0i3.substring(i27, A003);
                                                                i26 = A003 + 1;
                                                            } else {
                                                                substring6 = A0i3.substring(i27);
                                                                i26 = A0i3.length();
                                                            }
                                                            bundle = A1f(A0C, bundle, substring11, substring6);
                                                        } else {
                                                            intent = A07(context, A0C, str);
                                                            if (intent != null) {
                                                                str11 = "http://applink.instagram.com/{user_name}/reel/{clip_id}?extra={?extra}";
                                                            }
                                                        }
                                                    }
                                                }
                                                return intent;
                                            }
                                            throw A1k(i23);
                                        }
                                    }
                                }
                            } else if (i6 < i) {
                                int i28 = i6 + 1;
                                char c6 = cArr[i6];
                                if (c6 != '/') {
                                    if (c6 == 'o' && AbstractC35268Fh3.A08("rtfolio/", cArr, i28)) {
                                        int i29 = i28 + 8;
                                        intent = null;
                                        int[] A095 = AbstractC35268Fh3.A09(A0C, "short_code", cArr, i29);
                                        if (A095 != null) {
                                            int i30 = A095[0];
                                            int i31 = A095[1];
                                            if (i31 >= 1 && i31 <= 3) {
                                                AbstractC35268Fh3.A07(A0C, "short_code", cArr, i29, i30);
                                                if (i <= i30 && (intent = A05(context, A0C, str)) != null) {
                                                    str11 = "http://applink.instagram.com/{user_name}/portfolio/{short_code}";
                                                    intent.putExtra("matched_pattern", str11);
                                                    intent.putExtra("access_scope", "PUBLIC");
                                                    intent.putExtra("enforce_scope", true);
                                                    A1m(intent);
                                                    intent.putExtra("app_set", "[]");
                                                    return intent;
                                                }
                                            } else {
                                                throw A1k(i31);
                                            }
                                        }
                                        return intent;
                                    }
                                } else if (i28 >= i || cArr[i28] != '?') {
                                    int[] A096 = AbstractC35268Fh3.A09(A0C, "media_id", cArr, i28);
                                    intent = null;
                                    if (A096 != null) {
                                        int i32 = A096[0];
                                        int i33 = A096[1];
                                        if (i33 >= 1 && i33 <= 3) {
                                            AbstractC35268Fh3.A07(A0C, "media_id", cArr, i28, i32);
                                            if (i <= i32) {
                                                intent = A0A(context, A0C, str);
                                                if (intent != null) {
                                                    str8 = "http://applink.instagram.com/{user_name}/p/{media_id}";
                                                    intent.putExtra(str6, str8);
                                                    intent.putExtra(str5, str4);
                                                    intent.putExtra(str3, true);
                                                    A1m(intent);
                                                    intent.putExtra(str2, str7);
                                                    return intent;
                                                }
                                                return intent;
                                            }
                                            int i34 = i32 + 1;
                                            char c7 = cArr[i32];
                                            if (c7 == '/') {
                                                c7 = cArr[i34];
                                                i34++;
                                            }
                                            if (c7 == '?') {
                                                int i35 = i - i34;
                                                String A0i4 = AbstractC31171DnF.A0i(cArr, i34, i35);
                                                int i36 = 0;
                                                while (true) {
                                                    if (i36 < i35) {
                                                        int A014 = A01(A0i4, i36);
                                                        if (A014 < 0) {
                                                            break;
                                                        }
                                                        String substring12 = A0i4.substring(i36, A014);
                                                        int A004 = A00(A0i4, A014);
                                                        int i37 = A014 + 1;
                                                        if (A004 > 0) {
                                                            substring5 = A0i4.substring(i37, A004);
                                                            i36 = A004 + 1;
                                                        } else {
                                                            substring5 = A0i4.substring(i37);
                                                            i36 = A0i4.length();
                                                        }
                                                        bundle = A1f(A0C, bundle, substring12, substring5);
                                                    } else {
                                                        intent = A0A(context, A0C, str);
                                                        if (intent != null) {
                                                            str8 = "http://applink.instagram.com/{user_name}/p/{media_id}?extra={?extra}";
                                                        }
                                                    }
                                                }
                                            }
                                            return intent;
                                        }
                                        throw A1k(i33);
                                    }
                                }
                            }
                        } else if (AbstractC35268Fh3.A08("ive", cArr, i6)) {
                            int i38 = i6 + 3;
                            if (i38 < i) {
                                int i39 = i38 + 1;
                                char c8 = cArr[i38];
                                if (c8 != '/') {
                                    if (c8 != '?') {
                                        return null;
                                    }
                                } else if (i39 < i && cArr[i39] == '?') {
                                    i39++;
                                } else {
                                    int[] A097 = AbstractC35268Fh3.A09(A0C, TraceFieldType.BroadcastId, cArr, i39);
                                    intent2 = null;
                                    if (A097 != null) {
                                        int i40 = A097[0];
                                        int i41 = A097[1];
                                        if (i41 >= 1 && i41 <= 3) {
                                            AbstractC35268Fh3.A07(A0C, TraceFieldType.BroadcastId, cArr, i39, i40);
                                            if (i <= i40) {
                                                intent2 = A09(context, A0C, str);
                                                if (intent2 != null) {
                                                    str10 = "http://applink.instagram.com/{user_name}/live/{broadcast_id}";
                                                    intent2.putExtra("matched_pattern", str10);
                                                    intent2.putExtra("access_scope", "PUBLIC");
                                                    intent2.putExtra("enforce_scope", true);
                                                    A1m(intent2);
                                                    intent2.putExtra("app_set", "[]");
                                                    return intent2;
                                                }
                                                return intent2;
                                            }
                                            int i42 = i40 + 1;
                                            char c9 = cArr[i40];
                                            if (c9 == '/') {
                                                c9 = cArr[i42];
                                                i42++;
                                            }
                                            if (c9 == '?') {
                                                int i43 = i - i42;
                                                String A0i5 = AbstractC31171DnF.A0i(cArr, i42, i43);
                                                int i44 = 0;
                                                while (true) {
                                                    if (i44 < i43) {
                                                        int A015 = A01(A0i5, i44);
                                                        if (A015 < 0) {
                                                            break;
                                                        }
                                                        String substring13 = A0i5.substring(i44, A015);
                                                        int A005 = A00(A0i5, A015);
                                                        int i45 = A015 + 1;
                                                        if (A005 > 0) {
                                                            substring3 = A0i5.substring(i45, A005);
                                                            i44 = A005 + 1;
                                                        } else {
                                                            substring3 = A0i5.substring(i45);
                                                            i44 = A0i5.length();
                                                        }
                                                        bundle = A1f(A0C, bundle, substring13, substring3);
                                                    } else {
                                                        intent2 = A09(context, A0C, str);
                                                        if (intent2 != null) {
                                                            str10 = "http://applink.instagram.com/{user_name}/live/{broadcast_id}?extra={?extra}";
                                                        }
                                                    }
                                                }
                                            }
                                            return intent2;
                                        }
                                        throw A1k(i41);
                                    }
                                }
                                int i46 = i - i39;
                                String A0i6 = AbstractC31171DnF.A0i(cArr, i39, i46);
                                intent = null;
                                int i47 = 0;
                                while (true) {
                                    if (i47 < i46) {
                                        int A016 = A01(A0i6, i47);
                                        if (A016 < 0) {
                                            break;
                                        }
                                        String substring14 = A0i6.substring(i47, A016);
                                        int A006 = A00(A0i6, A016);
                                        int i48 = A016 + 1;
                                        if (A006 > 0) {
                                            substring4 = A0i6.substring(i48, A006);
                                            i47 = A006 + 1;
                                        } else {
                                            substring4 = A0i6.substring(i48);
                                            i47 = A0i6.length();
                                        }
                                        bundle = A1f(A0C, bundle, substring14, substring4);
                                    } else {
                                        intent = A09(context, A0C, str);
                                        if (intent != null) {
                                            str8 = "http://applink.instagram.com/{user_name}/live?extra={?extra}";
                                        }
                                    }
                                }
                                intent.putExtra(str6, str8);
                                intent.putExtra(str5, str4);
                                intent.putExtra(str3, true);
                                A1m(intent);
                                intent.putExtra(str2, str7);
                                return intent;
                            }
                            intent3 = A09(context, A0C, str);
                            if (intent3 != null) {
                                str9 = "http://applink.instagram.com/{user_name}/live";
                                intent3.putExtra("matched_pattern", str9);
                                intent3.putExtra("access_scope", "PUBLIC");
                                intent3.putExtra("enforce_scope", true);
                                A1m(intent3);
                                intent3.putExtra("app_set", "[]");
                                return intent3;
                            }
                        }
                    } else if (AbstractC35268Fh3.A08("uide/", cArr, i6)) {
                        int i49 = i6 + 5;
                        int[] A098 = AbstractC35268Fh3.A09(A0C, "id_or_title", cArr, i49);
                        intent = null;
                        if (A098 != null) {
                            int i50 = A098[0];
                            int i51 = A098[1];
                            if (i51 >= 1 && i51 <= 3) {
                                AbstractC35268Fh3.A07(A0C, "id_or_title", cArr, i49, i50);
                                str2 = "app_set";
                                str3 = "enforce_scope";
                                str4 = "PUBLIC";
                                str5 = "access_scope";
                                str6 = "matched_pattern";
                                str7 = "[]";
                                if (i <= i50) {
                                    intent = A0C(context, A0C, str);
                                    if (intent != null) {
                                        str8 = "http://applink.instagram.com/{user_name}/guide/{id_or_title}";
                                        intent.putExtra(str6, str8);
                                        intent.putExtra(str5, str4);
                                        intent.putExtra(str3, true);
                                        A1m(intent);
                                        intent.putExtra(str2, str7);
                                        return intent;
                                    }
                                    return intent;
                                }
                                int i52 = i50 + 1;
                                char c10 = cArr[i50];
                                if (c10 == '/') {
                                    int[] A099 = AbstractC35268Fh3.A09(A0C, "guide_id", cArr, i52);
                                    if (A099 != null) {
                                        int i53 = A099[0];
                                        int i54 = A099[1];
                                        if (i54 >= 1 && i54 <= 3) {
                                            AbstractC35268Fh3.A07(A0C, "guide_id", cArr, i52, i53);
                                            if (i <= i53) {
                                                intent = A0C(context, A0C, str);
                                                if (intent != null) {
                                                    str8 = "http://applink.instagram.com/{user_name}/guide/{id_or_title}/{guide_id}";
                                                    intent.putExtra(str6, str8);
                                                    intent.putExtra(str5, str4);
                                                    intent.putExtra(str3, true);
                                                    A1m(intent);
                                                    intent.putExtra(str2, str7);
                                                    return intent;
                                                }
                                            } else {
                                                int i55 = i53 + 1;
                                                char c11 = cArr[i53];
                                                if (c11 == '/') {
                                                    c11 = cArr[i55];
                                                    i55++;
                                                }
                                                if (c11 == '?') {
                                                    int i56 = i - i55;
                                                    String A0i7 = AbstractC31171DnF.A0i(cArr, i55, i56);
                                                    int i57 = 0;
                                                    while (true) {
                                                        if (i57 < i56) {
                                                            int A017 = A01(A0i7, i57);
                                                            if (A017 < 0) {
                                                                break;
                                                            }
                                                            String substring15 = A0i7.substring(i57, A017);
                                                            int A007 = A00(A0i7, A017);
                                                            int i58 = A017 + 1;
                                                            if (A007 > 0) {
                                                                substring2 = A0i7.substring(i58, A007);
                                                                i57 = A007 + 1;
                                                            } else {
                                                                substring2 = A0i7.substring(i58);
                                                                i57 = A0i7.length();
                                                            }
                                                            bundle = A1g(A0C, bundle, substring15, "igshid", substring2);
                                                        } else {
                                                            intent = A0C(context, A0C, str);
                                                            if (intent != null) {
                                                                str8 = "http://applink.instagram.com/{user_name}/guide/{id_or_title}/{guide_id}?igshid={?igshid}";
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        } else {
                                            throw A1k(i54);
                                        }
                                    }
                                    return intent;
                                }
                                if (c10 == '?') {
                                    int i59 = i - i52;
                                    String A0i8 = AbstractC31171DnF.A0i(cArr, i52, i59);
                                    int i60 = 0;
                                    while (true) {
                                        if (i60 < i59) {
                                            int A018 = A01(A0i8, i60);
                                            if (A018 < 0) {
                                                break;
                                            }
                                            String substring16 = A0i8.substring(i60, A018);
                                            int A008 = A00(A0i8, A018);
                                            int i61 = A018 + 1;
                                            if (A008 > 0) {
                                                substring = A0i8.substring(i61, A008);
                                                i60 = A008 + 1;
                                            } else {
                                                substring = A0i8.substring(i61);
                                                i60 = A0i8.length();
                                            }
                                            bundle = A1g(A0C, bundle, substring16, "igshid", substring);
                                        } else {
                                            intent = A0C(context, A0C, str);
                                            if (intent != null) {
                                                str8 = "http://applink.instagram.com/{user_name}/guide/{id_or_title}?igshid={?igshid}";
                                            }
                                        }
                                    }
                                }
                                return intent;
                            }
                            throw A1k(i51);
                        }
                    }
                }
            }
            return intent3;
        }
        throw A1k(i4);
    }

    public static Intent A1d(Context context, String str, char[] cArr, int i) {
        String str2;
        String substring;
        String substring2;
        Bundle A0C = AbstractC31174DnI.A0C();
        Bundle bundle = null;
        int[] A09 = AbstractC35268Fh3.A09(A0C, "explore_type", cArr, 22);
        if (A09 != null) {
            int i2 = A09[0];
            int i3 = A09[1];
            if (i3 >= 1 && i3 <= 3) {
                AbstractC35268Fh3.A07(A0C, "explore_type", cArr, 22, i2);
                if (i > i2) {
                    int i4 = i2 + 1;
                    if (cArr[i2] == '/') {
                        int[] A092 = AbstractC35268Fh3.A09(A0C, "explore_param", cArr, i4);
                        Intent intent = null;
                        if (A092 != null) {
                            int i5 = A092[0];
                            int i6 = A092[1];
                            if (i6 >= 1 && i6 <= 3) {
                                AbstractC35268Fh3.A07(A0C, "explore_param", cArr, i4, i5);
                                if (i <= i5) {
                                    intent = A0F(context, A0C, str);
                                    if (intent != null) {
                                        str2 = "http://instagram.com/explore/{explore_type}/{explore_param}";
                                        intent.putExtra("matched_pattern", str2);
                                        intent.putExtra("access_scope", "PUBLIC");
                                        intent.putExtra("enforce_scope", true);
                                        A1m(intent);
                                        intent.putExtra("app_set", "[]");
                                    }
                                } else {
                                    int i7 = i5 + 1;
                                    char c = cArr[i5];
                                    if (c == '/') {
                                        int[] A093 = AbstractC35268Fh3.A09(A0C, "dummy", cArr, i7);
                                        if (A093 != null) {
                                            int i8 = A093[0];
                                            int i9 = A093[1];
                                            if (i9 >= 1 && i9 <= 3) {
                                                AbstractC35268Fh3.A07(A0C, "dummy", cArr, i7, i8);
                                                if (i <= i8) {
                                                    intent = A0F(context, A0C, str);
                                                    if (intent != null) {
                                                        str2 = "http://instagram.com/explore/{explore_type}/{explore_param}/{dummy}";
                                                        intent.putExtra("matched_pattern", str2);
                                                        intent.putExtra("access_scope", "PUBLIC");
                                                        intent.putExtra("enforce_scope", true);
                                                        A1m(intent);
                                                        intent.putExtra("app_set", "[]");
                                                    }
                                                } else {
                                                    int i10 = i8 + 1;
                                                    char c2 = cArr[i8];
                                                    if (c2 == '/') {
                                                        c2 = cArr[i10];
                                                        i10++;
                                                    }
                                                    if (c2 == '?') {
                                                        int i11 = i - i10;
                                                        String A0i = AbstractC31171DnF.A0i(cArr, i10, i11);
                                                        int i12 = 0;
                                                        while (true) {
                                                            if (i12 < i11) {
                                                                int A01 = A01(A0i, i12);
                                                                if (A01 < 0) {
                                                                    break;
                                                                }
                                                                String substring3 = A0i.substring(i12, A01);
                                                                int A00 = A00(A0i, A01);
                                                                int i13 = A01 + 1;
                                                                if (A00 > 0) {
                                                                    substring2 = A0i.substring(i13, A00);
                                                                    i12 = A00 + 1;
                                                                } else {
                                                                    substring2 = A0i.substring(i13);
                                                                    i12 = A0i.length();
                                                                }
                                                                bundle = A1f(A0C, bundle, substring3, substring2);
                                                            } else {
                                                                intent = A0F(context, A0C, str);
                                                                if (intent != null) {
                                                                    str2 = "http://instagram.com/explore/{explore_type}/{explore_param}/{dummy}?extra={?extra}";
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            } else {
                                                throw A1k(i9);
                                            }
                                        }
                                    } else if (c == '?') {
                                        int i14 = i - i7;
                                        String A0i2 = AbstractC31171DnF.A0i(cArr, i7, i14);
                                        int i15 = 0;
                                        while (true) {
                                            if (i15 < i14) {
                                                int A012 = A01(A0i2, i15);
                                                if (A012 < 0) {
                                                    break;
                                                }
                                                String substring4 = A0i2.substring(i15, A012);
                                                int A002 = A00(A0i2, A012);
                                                int i16 = A012 + 1;
                                                if (A002 > 0) {
                                                    substring = A0i2.substring(i16, A002);
                                                    i15 = A002 + 1;
                                                } else {
                                                    substring = A0i2.substring(i16);
                                                    i15 = A0i2.length();
                                                }
                                                bundle = A1f(A0C, bundle, substring4, substring);
                                            } else {
                                                intent = A0F(context, A0C, str);
                                                if (intent != null) {
                                                    str2 = "http://instagram.com/explore/{explore_type}/{explore_param}?extra={?extra}";
                                                }
                                            }
                                        }
                                    }
                                }
                            } else {
                                throw A1k(i6);
                            }
                        }
                        return intent;
                    }
                }
            } else {
                throw A1k(i3);
            }
        }
        return null;
    }

    public static Bundle A1e(BaseBundle baseBundle, Bundle bundle, String str, String str2) {
        if (!str.equals("igid")) {
            Bundle A05 = AbstractC35268Fh3.A05(str, str2, bundle);
            if (A05 != null) {
                return A05;
            }
        } else {
            baseBundle.putString("extra", str2);
        }
        return bundle;
    }

    public static Bundle A1f(BaseBundle baseBundle, Bundle bundle, String str, String str2) {
        if (!str.equals("extra")) {
            Bundle A05 = AbstractC35268Fh3.A05(str, str2, bundle);
            if (A05 != null) {
                return A05;
            }
        } else {
            baseBundle.putString("extra", str2);
        }
        return bundle;
    }

    public static Bundle A1h(Bundle bundle) {
        if (bundle == null) {
            return new Bundle(2);
        }
        return bundle;
    }

    public static IllegalStateException A1k(int i) {
        return new IllegalStateException(AnonymousClass001.A0O("Unexpected templateType: ", i));
    }

    public static void A1l(Intent intent) {
        intent.putExtra("access_domains", "[]");
        intent.putExtra("fragment_type", 248);
        intent.putExtra("access_fbpermissions", "[]");
        intent.putExtra("app_set", "[]");
    }

    public static void A1m(Intent intent) {
        intent.putExtra("access_domains", "[]");
        intent.putExtra("fragment_type", 248);
        intent.putExtra("access_fbpermissions", "[]");
    }

    public static void A1n(Intent intent) {
        intent.putExtra("access_domains", "[]");
        intent.putExtra("fragment_type", 248);
        intent.putExtra("access_fbpermissions", "[]");
        intent.putExtra("app_set", "[]");
    }

    public static void A1o(Intent intent, String str) {
        intent.putExtra("matched_pattern", str);
        intent.putExtra("access_scope", "PUBLIC");
    }

    public static void A1p(Intent intent, String str) {
        intent.putExtra("matched_pattern", str);
        intent.putExtra("access_scope", "SAME_APP");
    }

    public static void A1q(Intent intent, String str) {
        intent.putExtra("matched_pattern", str);
        intent.putExtra("access_scope", "PUBLIC");
        intent.putExtra("enforce_scope", true);
        intent.putExtra("access_domains", "[]");
        intent.putExtra("fragment_type", 248);
        intent.putExtra("access_fbpermissions", "[]");
        intent.putExtra("app_set", "[]");
    }

    public static void A1r(Intent intent, String str) {
        intent.putExtra("matched_pattern", str);
        intent.putExtra("access_scope", "PUBLIC");
        intent.putExtra("enforce_scope", true);
    }

    public static void A1s(Intent intent, String str) {
        intent.putExtra("matched_pattern", str);
        intent.putExtra("access_scope", "SAME_APP");
        intent.putExtra("enforce_scope", true);
    }

    public static void A1t(Intent intent, String str) {
        intent.putExtra("matched_pattern", str);
        intent.putExtra("access_scope", "SAME_APP");
        intent.putExtra("enforce_scope", true);
        intent.putExtra("access_domains", "[]");
        intent.putExtra("fragment_type", 248);
        intent.putExtra("access_fbpermissions", "[]");
        intent.putExtra("app_set", "[]");
    }

    public static void A1u(Intent intent, String str) {
        intent.putExtra("access_scope", str);
        intent.putExtra("enforce_scope", true);
        intent.putExtra("access_domains", "[]");
        intent.putExtra("fragment_type", 248);
        intent.putExtra("access_fbpermissions", "[]");
    }

    public static void A1v(Intent intent, String str) {
        intent.putExtra("access_scope", str);
        intent.putExtra("enforce_scope", true);
    }

    public static void A1w(Intent intent, String str) {
        intent.putExtra("access_scope", str);
        intent.putExtra("enforce_scope", true);
        intent.putExtra("access_domains", "[]");
        intent.putExtra("fragment_type", 248);
        intent.putExtra("access_fbpermissions", "[]");
        intent.putExtra("app_set", "[]");
    }

    public static boolean A1x(String str) {
        return str.equals("s");
    }

    public static boolean A1y(String str) {
        return str.equals("fbclid");
    }

    public static boolean A1z(String str, char[] cArr) {
        return AbstractC35268Fh3.A08(str, cArr, 24);
    }

    public static Bundle A1g(BaseBundle baseBundle, Bundle bundle, String str, String str2, String str3) {
        if (!str.equals(str2)) {
            Bundle A05 = AbstractC35268Fh3.A05(str, str3, bundle);
            if (A05 != null) {
                return A05;
            }
        } else {
            baseBundle.putString(str2, str3);
        }
        return bundle;
    }

    public static Bundle A1j(String str, String str2, Bundle bundle) {
        Bundle A05 = AbstractC35268Fh3.A05(str, str2, bundle);
        if (A05 != null) {
            return A05;
        }
        return bundle;
    }

    /* JADX WARN: Code restructure failed: missing block: B:192:0x09f1, code lost:
    
        if (r5 != '?') goto L764;
     */
    /* JADX WARN: Code restructure failed: missing block: B:242:0x0a87, code lost:
    
        r5.putExtra("matched_pattern", r0);
        r3 = "PUBLIC";
     */
    /* JADX WARN: Code restructure failed: missing block: B:289:0x024f, code lost:
    
        if (r5 != '?') goto L764;
     */
    /* JADX WARN: Code restructure failed: missing block: B:319:0x060a, code lost:
    
        r5.putExtra("matched_pattern", r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:371:0x0351, code lost:
    
        if (r5 != '?') goto L556;
     */
    /* JADX WARN: Code restructure failed: missing block: B:459:0x0423, code lost:
    
        if (r5 != '?') goto L764;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x009a, code lost:
    
        if (r2 != null) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:547:0x0608, code lost:
    
        if (r5 == null) goto L556;
     */
    /* JADX WARN: Code restructure failed: missing block: B:550:0x0615, code lost:
    
        if (r5 == null) goto L802;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x00bc, code lost:
    
        if (r2 != null) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:573:0x084b, code lost:
    
        if (r5 != '?') goto L764;
     */
    /* JADX WARN: Code restructure failed: missing block: B:737:0x0620, code lost:
    
        if (r2 != null) goto L486;
     */
    /* JADX WARN: Code restructure failed: missing block: B:740:0x0631, code lost:
    
        if (r2 != null) goto L486;
     */
    /* JADX WARN: Code restructure failed: missing block: B:806:0x06f6, code lost:
    
        if (r3 != '?') goto L556;
     */
    /* JADX WARN: Code restructure failed: missing block: B:868:0x079e, code lost:
    
        if (r5 != '?') goto L764;
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x012e, code lost:
    
        if (r2 != null) goto L97;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x0138, code lost:
    
        if (r2 != null) goto L97;
     */
    /* JADX WARN: Removed duplicated region for block: B:638:0x090c  */
    /* JADX WARN: Removed duplicated region for block: B:654:0x0942 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static android.content.Intent A0z(android.content.Context r19, java.lang.String r20, char[] r21, int r22) {
        /*
            Method dump skipped, instructions count: 2768
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC35278FhD.A0z(android.content.Context, java.lang.String, char[], int):android.content.Intent");
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: CFG modification limit reached, blocks count: 8432
        	at jadx.core.dex.visitors.blocks.BlockProcessor.processBlocksTree(BlockProcessor.java:64)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.visit(BlockProcessor.java:44)
        */
    public static android.content.Intent A0I(android.content.Context r27, java.lang.String r28, char[] r29) {
        /*
            Method dump skipped, instructions count: 27196
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC35278FhD.A0I(android.content.Context, java.lang.String, char[]):android.content.Intent");
    }

    /* JADX WARN: Code restructure failed: missing block: B:1010:0x0a3c, code lost:
    
        if (r3 != '?') goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:1098:0x0b1b, code lost:
    
        if (r3 != '?') goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:1186:0x0c10, code lost:
    
        if (r3 != '?') goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:1333:0x0dae, code lost:
    
        if (r3 != '?') goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:1421:0x0ede, code lost:
    
        if (r3 != '?') goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:1480:0x128c, code lost:
    
        if (r4 != null) goto L1362;
     */
    /* JADX WARN: Code restructure failed: missing block: B:1643:0x1227, code lost:
    
        if (r4 != null) goto L1329;
     */
    /* JADX WARN: Code restructure failed: missing block: B:1758:0x1474, code lost:
    
        if (r2 != '?') goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:1849:0x1564, code lost:
    
        if (r2 != '?') goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:273:0x0272, code lost:
    
        if (r0 != '?') goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:314:0x02e3, code lost:
    
        if (r0 != '?') goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0074, code lost:
    
        if (r2 != '?') goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:429:0x1197, code lost:
    
        if (r4 != null) goto L1286;
     */
    /* JADX WARN: Code restructure failed: missing block: B:461:0x047d, code lost:
    
        if (r3 != '?') goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:583:0x0554, code lost:
    
        if (r3 != '?') goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:672:0x0657, code lost:
    
        if (r3 != '?') goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:866:0x087d, code lost:
    
        if (r4 != null) goto L614;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:1195:0x0c51. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:49:0x00ba. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:1199:0x0c5f A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:1203:0x0c5c A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:433:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static android.content.Intent A11(android.content.Context r20, java.lang.String r21, char[] r22, int r23) {
        /*
            Method dump skipped, instructions count: 5796
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC35278FhD.A11(android.content.Context, java.lang.String, char[], int):android.content.Intent");
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: CFG modification limit reached, blocks count: 7483
        	at jadx.core.dex.visitors.blocks.BlockProcessor.processBlocksTree(BlockProcessor.java:64)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.visit(BlockProcessor.java:44)
        */
    public static android.content.Intent A0G(android.content.Context r28, java.lang.String r29) {
        /*
            Method dump skipped, instructions count: 28418
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC35278FhD.A0G(android.content.Context, java.lang.String):android.content.Intent");
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: CFG modification limit reached, blocks count: 7687
        	at jadx.core.dex.visitors.blocks.BlockProcessor.processBlocksTree(BlockProcessor.java:64)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.visit(BlockProcessor.java:44)
        */
    public static android.content.Intent A0H(android.content.Context r23, java.lang.String r24, char[] r25) {
        /*
            Method dump skipped, instructions count: 27828
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC35278FhD.A0H(android.content.Context, java.lang.String, char[]):android.content.Intent");
    }

    /* JADX WARN: Code restructure failed: missing block: B:101:0x1310, code lost:
    
        if (r11 == null) goto L98;
     */
    /* JADX WARN: Code restructure failed: missing block: B:1040:0x0b2f, code lost:
    
        if (r2 != '?') goto L1440;
     */
    /* JADX WARN: Code restructure failed: missing block: B:1148:0x0c4f, code lost:
    
        if (r2 != '?') goto L1440;
     */
    /* JADX WARN: Code restructure failed: missing block: B:1228:0x0d36, code lost:
    
        if (r2 != '?') goto L1440;
     */
    /* JADX WARN: Code restructure failed: missing block: B:129:0x1363, code lost:
    
        if (r2 != '?') goto L1440;
     */
    /* JADX WARN: Code restructure failed: missing block: B:1339:0x0eba, code lost:
    
        if (r2 != '?') goto L1440;
     */
    /* JADX WARN: Code restructure failed: missing block: B:1407:0x0fb8, code lost:
    
        if (r2 != '?') goto L1440;
     */
    /* JADX WARN: Code restructure failed: missing block: B:1487:0x10cb, code lost:
    
        if (r2 != '?') goto L1248;
     */
    /* JADX WARN: Code restructure failed: missing block: B:1519:0x11ed, code lost:
    
        A1p(r11, r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:251:0x023e, code lost:
    
        if (r2 != '?') goto L1440;
     */
    /* JADX WARN: Code restructure failed: missing block: B:304:0x02d6, code lost:
    
        if (r20 != false) goto L218;
     */
    /* JADX WARN: Code restructure failed: missing block: B:310:0x0f69, code lost:
    
        r11.putExtra("matched_pattern", r0);
        r11.putExtra("access_scope", r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:409:0x0405, code lost:
    
        if (r15 != false) goto L309;
     */
    /* JADX WARN: Code restructure failed: missing block: B:530:0x0555, code lost:
    
        if (r2 != '?') goto L1440;
     */
    /* JADX WARN: Code restructure failed: missing block: B:668:0x0710, code lost:
    
        if (r2 != '?') goto L1440;
     */
    /* JADX WARN: Code restructure failed: missing block: B:769:0x082c, code lost:
    
        if (r2 != '?') goto L1440;
     */
    /* JADX WARN: Code restructure failed: missing block: B:830:0x08ed, code lost:
    
        if (r2 != '?') goto L1440;
     */
    /* JADX WARN: Code restructure failed: missing block: B:918:0x09e1, code lost:
    
        if (r2 != '?') goto L1440;
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x012b, code lost:
    
        if (r11 == null) goto L1440;
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x012d, code lost:
    
        r11.putExtra("matched_pattern", r2);
        r11.putExtra("access_scope", r0);
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:260:0x0278. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:264:0x0283 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:268:0x0281 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:378:0x03b2  */
    /* JADX WARN: Removed duplicated region for block: B:405:0x0400 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static android.content.Intent A0w(android.content.Context r19, java.lang.String r20, char[] r21, int r22) {
        /*
            Method dump skipped, instructions count: 5204
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC35278FhD.A0w(android.content.Context, java.lang.String, char[], int):android.content.Intent");
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: CFG modification limit reached, blocks count: 2342
        	at jadx.core.dex.visitors.blocks.BlockProcessor.processBlocksTree(BlockProcessor.java:64)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.visit(BlockProcessor.java:44)
        */
    public static android.content.Intent A13(android.content.Context r21, java.lang.String r22, char[] r23, int r24) {
        /*
            Method dump skipped, instructions count: 7056
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC35278FhD.A13(android.content.Context, java.lang.String, char[], int):android.content.Intent");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:1122:0x0c07, code lost:
    
        if (r5 != '?') goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:1186:0x0cc2, code lost:
    
        if (r5 != null) goto L954;
     */
    /* JADX WARN: Code restructure failed: missing block: B:1250:0x0d80, code lost:
    
        if (r0 != '?') goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:1291:0x0e23, code lost:
    
        if (r5 != null) goto L1054;
     */
    /* JADX WARN: Code restructure failed: missing block: B:1429:0x10d2, code lost:
    
        if (r5 != '?') goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:1547:0x126a, code lost:
    
        if (r5 != null) goto L1389;
     */
    /* JADX WARN: Code restructure failed: missing block: B:195:0x04fd, code lost:
    
        if (r5 != null) goto L393;
     */
    /* JADX WARN: Code restructure failed: missing block: B:219:0x0286, code lost:
    
        if (r5 != '?') goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:473:0x0577, code lost:
    
        if (r5 != '?') goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:734:0x077e, code lost:
    
        if (r5 != '?') goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:876:0x0971, code lost:
    
        if (r5 != '?') goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x108d, code lost:
    
        if (r5 != null) goto L1256;
     */
    /* JADX WARN: Code restructure failed: missing block: B:979:0x0a7b, code lost:
    
        if (r5 != '?') goto L39;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:37:0x008f. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:200:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:98:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static android.content.Intent A0n(android.content.Context r27, java.lang.String r28, char[] r29, int r30) {
        /*
            Method dump skipped, instructions count: 4848
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC35278FhD.A0n(android.content.Context, java.lang.String, char[], int):android.content.Intent");
    }

    /* JADX WARN: Code restructure failed: missing block: B:1078:0x0b64, code lost:
    
        if (r7 != '?') goto L83;
     */
    /* JADX WARN: Code restructure failed: missing block: B:1119:0x0bfc, code lost:
    
        if (r7 != '?') goto L1062;
     */
    /* JADX WARN: Code restructure failed: missing block: B:1194:0x0cd2, code lost:
    
        if (r7 != '?') goto L1062;
     */
    /* JADX WARN: Code restructure failed: missing block: B:1263:0x0da1, code lost:
    
        if (r7 != '?') goto L1062;
     */
    /* JADX WARN: Code restructure failed: missing block: B:174:0x0e72, code lost:
    
        if (r7 != '?') goto L1062;
     */
    /* JADX WARN: Code restructure failed: missing block: B:300:0x024d, code lost:
    
        if (r6 != null) goto L174;
     */
    /* JADX WARN: Code restructure failed: missing block: B:331:0x02a3, code lost:
    
        if (r7 != '?') goto L1062;
     */
    /* JADX WARN: Code restructure failed: missing block: B:435:0x03be, code lost:
    
        if (r7 != '?') goto L83;
     */
    /* JADX WARN: Code restructure failed: missing block: B:532:0x04f3, code lost:
    
        if (r7 != '?') goto L1062;
     */
    /* JADX WARN: Code restructure failed: missing block: B:577:0x0583, code lost:
    
        if (r7 != '?') goto L1062;
     */
    /* JADX WARN: Code restructure failed: missing block: B:627:0x0629, code lost:
    
        if (r7 != '?') goto L1062;
     */
    /* JADX WARN: Code restructure failed: missing block: B:704:0x0711, code lost:
    
        if (r7 != '?') goto L1062;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x0105, code lost:
    
        if (r7 != '?') goto L83;
     */
    /* JADX WARN: Code restructure failed: missing block: B:831:0x088b, code lost:
    
        if (r6 != '?') goto L83;
     */
    /* JADX WARN: Code restructure failed: missing block: B:917:0x0994, code lost:
    
        if (r6 != '?') goto L83;
     */
    /* JADX WARN: Code restructure failed: missing block: B:982:0x0a3e, code lost:
    
        if (r6 != '?') goto L83;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static android.content.Intent A0y(android.content.Context r21, java.lang.String r22, char[] r23, int r24) {
        /*
            Method dump skipped, instructions count: 4008
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC35278FhD.A0y(android.content.Context, java.lang.String, char[], int):android.content.Intent");
    }

    /* JADX WARN: Code restructure failed: missing block: B:136:0x01b0, code lost:
    
        if (r6 != '?') goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:239:0x0ab5, code lost:
    
        if (r8 == null) goto L739;
     */
    /* JADX WARN: Code restructure failed: missing block: B:240:0x0ab7, code lost:
    
        r8.putExtra(r0, r6);
        r8.putExtra(r9, r12);
        r8.putExtra(r10, true);
        A1m(r8);
        r8.putExtra(r11, r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:241:0x0ac8, code lost:
    
        return r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:244:0x0acf, code lost:
    
        if (r8 == null) goto L833;
     */
    /* JADX WARN: Code restructure failed: missing block: B:268:0x02fc, code lost:
    
        if (r6 != '?') goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0084, code lost:
    
        if (r6 != '?') goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:371:0x0431, code lost:
    
        if (r6 != '?') goto L739;
     */
    /* JADX WARN: Code restructure failed: missing block: B:456:0x09a0, code lost:
    
        if (r6 != '?') goto L739;
     */
    /* JADX WARN: Code restructure failed: missing block: B:634:0x0591, code lost:
    
        if (r6 != '?') goto L432;
     */
    /* JADX WARN: Code restructure failed: missing block: B:669:0x0b07, code lost:
    
        A1t(r7, r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:670:0x0b0a, code lost:
    
        return r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:743:0x06b9, code lost:
    
        if (r6 != '?') goto L432;
     */
    /* JADX WARN: Code restructure failed: missing block: B:812:0x0776, code lost:
    
        if (r6 != '?') goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:910:0x089a, code lost:
    
        if (r6 != '?') goto L739;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static android.content.Intent A10(android.content.Context r21, java.lang.String r22, char[] r23, int r24) {
        /*
            Method dump skipped, instructions count: 2902
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC35278FhD.A10(android.content.Context, java.lang.String, char[], int):android.content.Intent");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:1070:0x08c9, code lost:
    
        if (r0 != '?') goto L759;
     */
    /* JADX WARN: Code restructure failed: missing block: B:280:0x0191, code lost:
    
        if (r0 != '?') goto L759;
     */
    /* JADX WARN: Code restructure failed: missing block: B:355:0x0251, code lost:
    
        if (r3 != null) goto L186;
     */
    /* JADX WARN: Code restructure failed: missing block: B:409:0x02de, code lost:
    
        if (r3 != null) goto L237;
     */
    /* JADX WARN: Code restructure failed: missing block: B:459:0x047c, code lost:
    
        if (r14 != null) goto L838;
     */
    /* JADX WARN: Code restructure failed: missing block: B:465:0x0a6c, code lost:
    
        if (r14 != null) goto L838;
     */
    /* JADX WARN: Code restructure failed: missing block: B:481:0x04aa, code lost:
    
        if (r0 != '?') goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x00ad, code lost:
    
        if (r0 != '?') goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:579:0x0a05, code lost:
    
        if (r0 != '?') goto L759;
     */
    /* JADX WARN: Code restructure failed: missing block: B:622:0x0327, code lost:
    
        if (r0 != '?') goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:677:0x034d, code lost:
    
        if (r0 != '?') goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:742:0x0605, code lost:
    
        if (r0 != '?') goto L759;
     */
    /* JADX WARN: Code restructure failed: missing block: B:806:0x06a3, code lost:
    
        if (r0 != '?') goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:906:0x03ce, code lost:
    
        if (r0 != '?') goto L759;
     */
    /* JADX WARN: Code restructure failed: missing block: B:969:0x0a97, code lost:
    
        if (r23 != false) goto L803;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:219:0x00dd. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:839:0x0704  */
    /* JADX WARN: Removed duplicated region for block: B:859:0x0748  */
    /* JADX WARN: Removed duplicated region for block: B:862:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static android.content.Intent A12(android.content.Context r24, java.lang.String r25, char[] r26, int r27) {
        /*
            Method dump skipped, instructions count: 3416
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC35278FhD.A12(android.content.Context, java.lang.String, char[], int):android.content.Intent");
    }

    /* JADX WARN: Code restructure failed: missing block: B:259:0x0677, code lost:
    
        if (r8 != null) goto L505;
     */
    /* JADX WARN: Code restructure failed: missing block: B:260:0x0679, code lost:
    
        r8.putExtra(r0, r2);
        r8.putExtra(r10, r13);
        r8.putExtra(r11, true);
        A1m(r8);
        r8.putExtra(r12, r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:261:0x068a, code lost:
    
        return r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:263:0x0694, code lost:
    
        if (r8 != null) goto L505;
     */
    /* JADX WARN: Code restructure failed: missing block: B:332:0x038d, code lost:
    
        if (r0 != '?') goto L565;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x008f, code lost:
    
        if (r0 != '?') goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:485:0x055b, code lost:
    
        if (r0 != '?') goto L565;
     */
    /* JADX WARN: Code restructure failed: missing block: B:568:0x0725, code lost:
    
        if (r0 != '?') goto L565;
     */
    /* JADX WARN: Code restructure failed: missing block: B:609:0x0794, code lost:
    
        if (r13 != false) goto L597;
     */
    /* JADX WARN: Removed duplicated region for block: B:686:0x07f3  */
    /* JADX WARN: Removed duplicated region for block: B:706:0x0831  */
    /* JADX WARN: Removed duplicated region for block: B:710:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static android.content.Intent A14(android.content.Context r18, java.lang.String r19, char[] r20, int r21) {
        /*
            Method dump skipped, instructions count: 2140
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC35278FhD.A14(android.content.Context, java.lang.String, char[], int):android.content.Intent");
    }
}
