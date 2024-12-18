package X;

import android.content.Context;
import com.facebook.phonenumbers.PhoneNumberUtil;
import com.facebook.react.views.webview.ReactWebViewManager;
import com.instagram.phonenumber.model.CountryCodeData;
import java.io.IOException;
import java.io.StringWriter;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.zip.CRC32;

/* renamed from: X.FdA, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC35099FdA {
    public static final boolean A02(String str, String str2) {
        String str3;
        if (str == null) {
            return str2 == null;
        }
        int length = str.length() - 1;
        int i = 0;
        boolean z = false;
        while (i <= length) {
            int i2 = length;
            if (!z) {
                i2 = i;
            }
            boolean A1b = AbstractC31179DnN.A1b(str, i2);
            if (!z) {
                if (!A1b) {
                    z = true;
                } else {
                    i++;
                }
            } else {
                if (!A1b) {
                    break;
                }
                length--;
            }
        }
        String A0g = AbstractC31177DnL.A0g(str, length, i);
        if (str2 != null) {
            int length2 = str2.length() - 1;
            int i3 = 0;
            boolean z2 = false;
            while (i3 <= length2) {
                int i4 = length2;
                if (!z2) {
                    i4 = i3;
                }
                boolean A1b2 = AbstractC31179DnN.A1b(str2, i4);
                if (!z2) {
                    if (!A1b2) {
                        z2 = true;
                    } else {
                        i3++;
                    }
                } else {
                    if (!A1b2) {
                        break;
                    }
                    length2--;
                }
            }
            str3 = AbstractC31177DnL.A0g(str2, length2, i3);
        } else {
            str3 = null;
        }
        return C14360o3.A0K(A0g, str3);
    }

    public static final long A00(String str) {
        if (str == null) {
            return 0L;
        }
        CRC32 crc32 = new CRC32();
        int length = str.length() - 1;
        int i = 0;
        boolean z = false;
        while (i <= length) {
            int i2 = length;
            if (!z) {
                i2 = i;
            }
            boolean A19 = AbstractC167027dH.A19(str, i2);
            if (!z) {
                if (!A19) {
                    z = true;
                } else {
                    i++;
                }
            } else {
                if (!A19) {
                    break;
                }
                length--;
            }
        }
        String A0g = AbstractC31177DnL.A0g(str, length, i);
        Charset forName = Charset.forName(ReactWebViewManager.HTML_ENCODING);
        C14360o3.A07(forName);
        byte[] bytes = A0g.getBytes(forName);
        C14360o3.A07(bytes);
        crc32.update(bytes);
        return crc32.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v14, types: [java.lang.Object, X.FMa] */
    /* JADX WARN: Type inference failed for: r3v4, types: [java.lang.Object, X.FMa] */
    public static final String A01(Context context, CountryCodeData countryCodeData, String str, String str2, List list, List list2) {
        AbstractC167017dG.A1N(context, countryCodeData);
        ArrayList A1E = AbstractC166987dD.A1E();
        ArrayList A1E2 = AbstractC166987dD.A1E();
        if (!list.isEmpty()) {
            int size = list.size();
            for (int i = 0; i < size; i++) {
                AbstractC33622EtY abstractC33622EtY = (AbstractC33622EtY) list.get(i);
                String str3 = abstractC33622EtY.A02;
                String str4 = null;
                if (str3 != null) {
                    try {
                        str4 = String.valueOf(PhoneNumberUtil.A01(context).A0F(str3, countryCodeData.A00).A02);
                    } catch (C40f unused) {
                    }
                }
                String str5 = abstractC33622EtY.A01;
                long A00 = A00(str4);
                boolean A1N = AbstractC167007dF.A1N(i);
                boolean A02 = A02(str, str4);
                ?? obj = new Object();
                obj.A01 = str5;
                obj.A00 = A00;
                obj.A03 = A1N;
                obj.A02 = A02;
                A1E.add(obj);
            }
        }
        if (!list2.isEmpty()) {
            int size2 = list2.size();
            for (int i2 = 0; i2 < size2; i2++) {
                AbstractC33622EtY abstractC33622EtY2 = (AbstractC33622EtY) list2.get(i2);
                String str6 = abstractC33622EtY2.A01;
                long A002 = A00(abstractC33622EtY2.A02);
                boolean A1N2 = AbstractC167007dF.A1N(i2);
                boolean A022 = A02(str2, abstractC33622EtY2.A02);
                ?? obj2 = new Object();
                obj2.A01 = str6;
                obj2.A00 = A002;
                obj2.A03 = A1N2;
                obj2.A02 = A022;
                A1E2.add(obj2);
            }
        }
        try {
            StringWriter stringWriter = new StringWriter();
            C17z A0S = AbstractC167007dF.A0S(stringWriter);
            C16V.A03(A0S, "p");
            Iterator it = A1E.iterator();
            while (it.hasNext()) {
                C34591FMa c34591FMa = (C34591FMa) it.next();
                if (c34591FMa != null) {
                    AbstractC34341FCj.A00(A0S, c34591FMa);
                }
            }
            A0S.A0Z();
            C16V.A03(A0S, "e");
            Iterator it2 = A1E2.iterator();
            while (it2.hasNext()) {
                C34591FMa c34591FMa2 = (C34591FMa) it2.next();
                if (c34591FMa2 != null) {
                    AbstractC34341FCj.A00(A0S, c34591FMa2);
                }
            }
            A0S.A0Z();
            return AbstractC167017dG.A0l(A0S, stringWriter);
        } catch (IOException unused2) {
            return "";
        }
    }
}
