package X;

import java.io.File;
import java.util.HashMap;

/* renamed from: X.6In, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C137096In {
    public static final C137096In A02 = new C137096In(new HashMap());
    public final HashMap A00 = new HashMap();
    public final HashMap A01;

    public final String A00(String str) {
        if (str == null) {
            return null;
        }
        C14360o3.A0B("content://com.instagram.android.tam-attachment", 1);
        if (!str.startsWith("content://com.instagram.android.tam-attachment")) {
            return null;
        }
        String A01 = LHB.A01(str);
        HashMap hashMap = this.A00;
        if (hashMap.containsKey(A01)) {
            return (String) hashMap.get(A01);
        }
        C51740MtP c51740MtP = (C51740MtP) this.A01.get(str);
        if (c51740MtP == null) {
            return null;
        }
        String str2 = c51740MtP.A00;
        C14360o3.A0B(str2, 0);
        C14360o3.A0B("content://com.instagram.android.tam-attachment", 1);
        if (str2.startsWith("content://com.instagram.android.tam-attachment")) {
            return null;
        }
        if (!c51740MtP.A01) {
            C14360o3.A0B("file://", 1);
            String str3 = str2;
            if (str2.startsWith("file://")) {
                str3 = str2.substring(7);
                C14360o3.A07(str3);
            }
            if (!new File(str3).exists()) {
                return null;
            }
        }
        C15500q5.A04(hashMap).remove(A01);
        return str2;
    }

    public final void A01(String str) {
        C14360o3.A0B(str, 0);
        HashMap hashMap = this.A01;
        if (!hashMap.containsKey(str)) {
            hashMap.put(str, new C51740MtP(str, 13, false));
        }
    }

    public final boolean A02(String str) {
        C14360o3.A0B(str, 0);
        C51740MtP c51740MtP = (C51740MtP) this.A01.get(str);
        if (c51740MtP != null) {
            String str2 = c51740MtP.A00;
            C14360o3.A0B(str2, 0);
            C14360o3.A0B("content://com.instagram.android.tam-attachment", 1);
            if (str2.startsWith("content://com.instagram.android.tam-attachment")) {
                return true;
            }
        }
        return false;
    }

    public C137096In(HashMap hashMap) {
        this.A01 = hashMap;
    }
}
