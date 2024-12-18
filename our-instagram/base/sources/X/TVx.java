package X;

import java.security.cert.CertificateParsingException;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLException;
import javax.net.ssl.SSLSession;

/* loaded from: classes10.dex */
public final class TVx implements HostnameVerifier {
    public static final TVx A00 = new Object();

    @Override // javax.net.ssl.HostnameVerifier
    public final boolean verify(String str, SSLSession sSLSession) {
        try {
            return A01(str, (X509Certificate) sSLSession.getPeerCertificates()[0]);
        } catch (SSLException unused) {
            return false;
        }
    }

    public final boolean A01(String str, X509Certificate x509Certificate) {
        int length;
        if (AbstractC31175DnJ.A1Z(str, AbstractC63404SjZ.A03)) {
            List A002 = A00(x509Certificate, 7);
            int size = A002.size();
            for (int i = 0; i < size; i++) {
                if (!str.equalsIgnoreCase(AbstractC25226BEj.A1I(A002, i))) {
                }
            }
            return false;
        }
        Locale locale = Locale.US;
        String lowerCase = str.toLowerCase(locale);
        Iterator it = A00(x509Certificate, 2).iterator();
        while (it.hasNext()) {
            String A1B = AbstractC166987dD.A1B(it);
            String str2 = lowerCase;
            if (lowerCase != null && lowerCase.length() != 0 && !lowerCase.startsWith(".") && !lowerCase.endsWith("..") && A1B != null && A1B.length() != 0 && !A1B.startsWith(".") && !A1B.endsWith("..")) {
                if (!lowerCase.endsWith(".")) {
                    str2 = AnonymousClass001.A0C(lowerCase, '.');
                }
                if (!A1B.endsWith(".")) {
                    A1B = AnonymousClass001.A0C(A1B, '.');
                }
                String lowerCase2 = A1B.toLowerCase(locale);
                if (!lowerCase2.contains("*")) {
                    if (str2.equals(lowerCase2)) {
                    }
                } else if (lowerCase2.startsWith("*.") && lowerCase2.indexOf(42, 1) == -1 && (length = str2.length()) >= lowerCase2.length() && !"*.".equals(lowerCase2)) {
                    String substring = lowerCase2.substring(1);
                    if (str2.endsWith(substring)) {
                        int length2 = length - substring.length();
                        if (length2 > 0 && str2.lastIndexOf(46, length2 - 1) != -1) {
                        }
                    } else {
                        continue;
                    }
                }
            }
        }
        return false;
        return true;
    }

    public static List A00(X509Certificate x509Certificate, int i) {
        Number number;
        Object obj;
        ArrayList A1E = AbstractC166987dD.A1E();
        try {
            Collection<List<?>> subjectAlternativeNames = x509Certificate.getSubjectAlternativeNames();
            if (subjectAlternativeNames == null) {
                return Collections.emptyList();
            }
            for (List<?> list : subjectAlternativeNames) {
                if (list != null && list.size() >= 2 && (number = (Number) AbstractC166987dD.A16(list)) != null && number.intValue() == i && (obj = list.get(1)) != null) {
                    A1E.add(obj);
                }
            }
            return A1E;
        } catch (CertificateParsingException unused) {
            return Collections.emptyList();
        }
    }
}
