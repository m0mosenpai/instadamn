package com.instagram.liteprovider;

import X.AbstractC06950Ym;
import X.AbstractC12990ll;
import X.AbstractC226009yJ;
import X.C00O;
import X.C023409i;
import X.C03190Dc;
import X.C08730cb;
import X.C0BQ;
import X.C0K8;
import X.C14360o3;
import X.C17110t6;
import X.C18Y;
import X.C1F8;
import X.C1FA;
import X.C1U4;
import X.C1UM;
import X.InterfaceC02900Bo;
import android.content.ContentProvider;
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.MatrixCursor;
import android.net.Uri;
import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.user.model.User;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public final class FirstPartyUserValuesLiteProvider extends ContentProvider {
    public static final String[] A03 = {"COL_USERNAME", "COL_FULL_NAME", "COL_SESSION_ID", "COL_PROFILE_PHOTO_URL", "COL_IS_BUSINESS", "COL_LINKED_FBID", "COL_DEVICE_FAMILY_APP_ID", "COL_SSO_SETTINGS_CACHE", "COL_USER_ID"};
    public AbstractC12990ll A00;
    public UserSession A01;
    public User A02;

    @Override // android.content.ContentProvider
    public final boolean onCreate() {
        return true;
    }

    private final MatrixCursor A00() {
        String string;
        User user = this.A02;
        String str = "currentUser";
        if (user != null) {
            String username = user.getUsername();
            User user2 = this.A02;
            if (user2 != null) {
                String id = user2.getId();
                User user3 = this.A02;
                if (user3 != null) {
                    String fullName = user3.A03.getFullName();
                    User user4 = this.A02;
                    if (user4 != null) {
                        String valueOf = String.valueOf(user4.CQw());
                        User user5 = this.A02;
                        if (user5 != null) {
                            ImageUrl Bhu = user5.Bhu();
                            UserSession userSession = this.A01;
                            if (userSession == null) {
                                str = "userSession";
                            } else {
                                String str2 = C1F8.A00(userSession).A04;
                                if (str2 == null) {
                                    return null;
                                }
                                String url = Bhu.getUrl();
                                Context context = getContext();
                                if (context == null) {
                                    string = "";
                                } else {
                                    C1UM A00 = C1U4.A00(context).A00("XE_ACCESS_LIBRARY_DATA");
                                    C14360o3.A07(A00);
                                    string = A00.getString("sso_settings_v2", null);
                                }
                                MatrixCursor matrixCursor = new MatrixCursor(A03);
                                matrixCursor.addRow(new String[]{username, fullName, str2, url, valueOf, null, null, string, id});
                                return matrixCursor;
                            }
                        }
                    }
                }
            }
        }
        C14360o3.A0F(str);
        throw C00O.createAndThrow();
    }

    @Override // android.content.ContentProvider
    public final int delete(Uri uri, String str, String[] strArr) {
        throw new UnsupportedOperationException();
    }

    @Override // android.content.ContentProvider
    public final String getType(Uri uri) {
        throw new UnsupportedOperationException();
    }

    @Override // android.content.ContentProvider
    public final Uri insert(Uri uri, ContentValues contentValues) {
        throw new UnsupportedOperationException();
    }

    @Override // android.content.ContentProvider
    public final int update(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        throw new UnsupportedOperationException();
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x000e, code lost:
    
        if (r3.isEmpty() != false) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final android.database.MatrixCursor A01() {
        /*
            X.C83743oJ.A00()
            java.util.List r3 = X.C83743oJ.A03()
            if (r3 == 0) goto L10
            boolean r1 = r3.isEmpty()
            r0 = 0
            if (r1 == 0) goto L11
        L10:
            r0 = 1
        L11:
            r7 = 0
            if (r0 != 0) goto L45
            java.lang.String[] r0 = com.instagram.liteprovider.FirstPartyUserValuesLiteProvider.A03
            android.database.MatrixCursor r2 = new android.database.MatrixCursor
            r2.<init>(r0)
            java.util.Iterator r1 = r3.iterator()
        L1f:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L44
            java.lang.Object r0 = r1.next()
            X.3oP r0 = (X.C83803oP) r0
            java.lang.String r3 = r0.A03()
            com.instagram.common.typedurl.ImageUrl r6 = r0.A00()
            java.lang.String r5 = r0.A01()
            java.lang.String r4 = ""
            r8 = r7
            r9 = r7
            r10 = r7
            java.lang.Object[] r0 = new java.lang.Object[]{r3, r4, r5, r6, r7, r8, r9, r10}
            r2.addRow(r0)
            goto L1f
        L44:
            return r2
        L45:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.liteprovider.FirstPartyUserValuesLiteProvider.A01():android.database.MatrixCursor");
    }

    private final void A02() {
        if (!C03190Dc.A01(getContext()) && !AbstractC226009yJ.A00(getContext())) {
            C0K8.A0C("FirstPartyUserValuesLiteProvider", "Component access not allowed.");
            throw new SecurityException("Component access not allowed.");
        }
    }

    @Override // android.content.ContentProvider
    public final Cursor query(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        String str3;
        boolean z;
        String str4;
        A02();
        C18Y c18y = C18Y.A01;
        synchronized (c18y) {
            while (!c18y.A00) {
                try {
                    c18y.wait();
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        }
        this.A00 = C023409i.A0A.A05(this);
        if (strArr2 != null) {
            if (1 < strArr2.length) {
                str3 = strArr2[1];
            } else {
                str3 = null;
            }
        } else {
            str3 = null;
        }
        if (String.valueOf(str3) == null) {
            str4 = "instanceKey";
        } else {
            if (C14360o3.A0K(str, "name='saved_session_info'")) {
                return A01();
            }
            AbstractC12990ll abstractC12990ll = this.A00;
            if (abstractC12990ll == null) {
                str4 = "session";
            } else {
                if (!(abstractC12990ll instanceof UserSession)) {
                    z = false;
                } else {
                    UserSession userSession = (UserSession) abstractC12990ll;
                    this.A01 = userSession;
                    if (userSession == null) {
                        str4 = "userSession";
                    } else {
                        this.A02 = C08730cb.A00(userSession).A00();
                        z = true;
                    }
                }
                if (!z) {
                    return null;
                }
                if (C14360o3.A0K(str, "all_session_info")) {
                    UserSession userSession2 = this.A01;
                    str4 = "userSession";
                    if (userSession2 != null) {
                        InterfaceC02900Bo A00 = C0BQ.A00(userSession2);
                        User user = this.A02;
                        if (user == null) {
                            str4 = "currentUser";
                        } else {
                            List A032 = ((C17110t6) A00).A02.A03(user);
                            if (A032 == null || !(!A032.isEmpty())) {
                                return null;
                            }
                            MatrixCursor A002 = A00();
                            UserSession userSession3 = this.A01;
                            if (userSession3 != null) {
                                C1FA A003 = C1F8.A00(userSession3);
                                ArrayList arrayList = new ArrayList(AbstractC06950Ym.A1E(A032, 10));
                                Iterator it = A032.iterator();
                                while (it.hasNext()) {
                                    arrayList.add(((User) it.next()).getId());
                                }
                                List A01 = A003.A01(arrayList);
                                if (A002 != null) {
                                    int size = A032.size();
                                    for (int i = 0; i < size; i++) {
                                        User user2 = (User) A032.get(i);
                                        String username = user2.getUsername();
                                        String fullName = user2.A03.getFullName();
                                        String valueOf = String.valueOf(user2.CQw());
                                        ImageUrl Bhu = user2.Bhu();
                                        String str5 = (String) A01.get(i);
                                        if (str5 != null && str5.length() != 0) {
                                            A002.addRow(new String[]{username, fullName, str5, Bhu.getUrl(), valueOf, null, null, null});
                                        }
                                    }
                                }
                                return A002;
                            }
                        }
                    }
                } else {
                    return A00();
                }
            }
        }
        C14360o3.A0F(str4);
        throw C00O.createAndThrow();
    }
}
