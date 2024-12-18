package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.1Hq, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C24471Hq {
    public final AbstractC12990ll A00;

    public static final void A00(C3JY c3jy) {
        C14360o3.A0B(c3jy, 0);
        C23781El A01 = c3jy.A01("IG-Set-Password-Encryption-Pub-Key");
        C23781El A012 = c3jy.A01("IG-Set-Password-Encryption-Key-Id");
        if (A01 != null && A012 != null) {
            C123435iI c123435iI = C123435iI.A01;
            if (c123435iI == null) {
                c123435iI = new C123435iI(AbstractC12290kX.A00);
                C123435iI.A01 = c123435iI;
            }
            c123435iI.A01(A01.A01, A012.A01);
        }
    }

    public final void A01(C3JY c3jy, C1QW c1qw) {
        String str;
        String str2;
        C14360o3.A0B(c3jy, 1);
        java.net.URI uri = c1qw.A09;
        if (C1QC.A01(uri)) {
            C23781El A01 = c3jy.A01("X-IG-Set-WWW-Claim");
            AbstractC12990ll abstractC12990ll = this.A00;
            C24431Hm A00 = C24431Hm.A00(abstractC12990ll);
            C14360o3.A07(A00);
            if (A01 != null) {
                String str3 = A01.A01;
                if (str3 == null) {
                    str3 = "0";
                }
                if (c3jy.A01("X-IG-ANDROID-FROM-DISK-CACHE") != null && !C1AD.A06(C06090Tz.A05, 18307336754046760L)) {
                    return;
                }
                int i = c3jy.A02;
                if (i >= 300) {
                    if (AnonymousClass001.A0O("not_acceptable_status_code_", i) != null) {
                        return;
                    }
                } else if (abstractC12990ll instanceof UserSession) {
                    String A02 = AbstractC03270Dk.A02(abstractC12990ll);
                    String str4 = "";
                    if (A02 == null) {
                        A02 = "";
                    }
                    C23781El A012 = c3jy.A01("IG-SET-IG-U-DS-USER-ID");
                    if (A012 == null || (str = A012.A01) == null) {
                        str = "";
                    }
                    String str5 = "request.uri?.path is null";
                    if (str3.equals("0")) {
                        if (C1AD.A06(C06090Tz.A05, 18307336753981223L)) {
                            String path = uri.getPath();
                            if (path != null) {
                                str5 = path;
                            }
                            str4 = AnonymousClass001.A14(" SessionUserId = ", A02, ", UserIdFromResponse = ", str, ". URL = ", str5, '.');
                        }
                        C0K8.A0E("WWW-CLAIM-HEADER-SYNC", AnonymousClass001.A0W("Attempting to put logged-out claim into UserSession. The www claim sync should be dropped. Response status code = ", str4, '.', i));
                        return;
                    }
                    if (!A02.equals(str)) {
                        C06090Tz c06090Tz = C06090Tz.A05;
                        if (C1AD.A06(c06090Tz, 18307336753981223L)) {
                            String path2 = uri.getPath();
                            if (path2 != null) {
                                str5 = path2;
                            }
                            str4 = AnonymousClass001.A14(" SessionUserId = ", A02, ", UserIdFromResponse = ", str, ". URL = ", str5, '.');
                        }
                        C0K8.A0E("WWW-CLAIM-HEADER-SYNC", AnonymousClass001.A0W("The SessionUserId is not matching with UserIdFromResponse(IG-SET-IG-U-DS-USER-ID). The www claim sync should be dropped. Response status code = ", str4, '.', i));
                        if (!C1AD.A06(c06090Tz, 2324150345967609638L)) {
                            return;
                        }
                    }
                }
                String str6 = A00.A02;
                if (!str3.equals(str6)) {
                    if (str6 != null && !str6.equals("0")) {
                        str2 = "sync3_overwrite";
                    } else {
                        str2 = "sync3_filled_empty";
                    }
                    A00.A00 = str2;
                }
                A00.A02(str3);
            }
        }
    }

    public C24471Hq(AbstractC12990ll abstractC12990ll) {
        this.A00 = abstractC12990ll;
    }
}
