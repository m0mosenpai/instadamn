package X;

import java.security.cert.Certificate;
import java.security.cert.CertificateParsingException;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLException;
import javax.net.ssl.SSLSession;

/* renamed from: X.0dp, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C09400dp implements HostnameVerifier {
    public final boolean A01(String str, X509Certificate x509Certificate) {
        boolean z;
        int length;
        int length2;
        C14360o3.A0B(str, 0);
        C14360o3.A0B(x509Certificate, 1);
        if (AbstractC09420dr.A00.A08(str)) {
            List A00 = A00(x509Certificate, 7);
            String A002 = AbstractC09420dr.A00(str);
            z = false;
            if (!(A00 instanceof Collection) || !A00.isEmpty()) {
                Iterator it = A00.iterator();
                while (it.hasNext()) {
                    if (C14360o3.A0K(A002, AbstractC09420dr.A00((String) it.next()))) {
                        return true;
                    }
                }
            }
        } else {
            List<String> A003 = A00(x509Certificate, 2);
            if (AbstractC09420dr.A02(str)) {
                Locale locale = Locale.US;
                C14360o3.A08(locale);
                str = str.toLowerCase(locale);
                C14360o3.A07(str);
            }
            z = false;
            if ((A003 instanceof Collection) && A003.isEmpty()) {
                return false;
            }
            for (String str2 : A003) {
                String str3 = str;
                if (str.length() != 0 && !str.startsWith(".") && !str.endsWith("..") && str2 != null && str2.length() != 0 && !str2.startsWith(".") && !str2.endsWith("..")) {
                    if (!str.endsWith(".")) {
                        str3 = AnonymousClass001.A0C(str, '.');
                    }
                    if (!str2.endsWith(".")) {
                        str2 = AnonymousClass001.A0C(str2, '.');
                    }
                    if (AbstractC09420dr.A02(str2)) {
                        Locale locale2 = Locale.US;
                        C14360o3.A08(locale2);
                        str2 = str2.toLowerCase(locale2);
                        C14360o3.A07(str2);
                    }
                    if (!AbstractC001900j.A0a(str2, "*", false)) {
                        if (C14360o3.A0K(str3, str2)) {
                            return true;
                        }
                    } else if (AbstractC002300n.A0h(str2, "*.", false) && AbstractC001900j.A04(str2, '*', 1) == -1 && (length = str3.length()) >= str2.length() && !"*.".equals(str2)) {
                        String substring = str2.substring(1);
                        C14360o3.A07(substring);
                        if (str3.endsWith(substring) && ((length2 = length - substring.length()) <= 0 || AbstractC001900j.A05(str3, '.', length2 - 1) == -1)) {
                            return true;
                        }
                    }
                }
            }
        }
        return z;
    }

    @Override // javax.net.ssl.HostnameVerifier
    public final boolean verify(String str, SSLSession sSLSession) {
        C14360o3.A0B(str, 0);
        C14360o3.A0B(sSLSession, 1);
        if (!AbstractC09420dr.A02(str)) {
            return false;
        }
        try {
            Certificate certificate = sSLSession.getPeerCertificates()[0];
            C14360o3.A0C(certificate, "null cannot be cast to non-null type java.security.cert.X509Certificate");
            return A01(str, (X509Certificate) certificate);
        } catch (SSLException unused) {
            return false;
        }
    }

    public static final List A00(X509Certificate x509Certificate, int i) {
        Object obj;
        try {
            Collection<List<?>> subjectAlternativeNames = x509Certificate.getSubjectAlternativeNames();
            if (subjectAlternativeNames == null) {
                return C16930sl.A00;
            }
            ArrayList arrayList = new ArrayList();
            for (List<?> list : subjectAlternativeNames) {
                if (list != null && list.size() >= 2 && C14360o3.A0K(list.get(0), Integer.valueOf(i)) && (obj = list.get(1)) != null) {
                    arrayList.add(obj);
                }
            }
            return arrayList;
        } catch (CertificateParsingException unused) {
            return C16930sl.A00;
        }
    }
}
