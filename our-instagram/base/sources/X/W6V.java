package X;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes11.dex */
public abstract class W6V {
    public static final List A00(List list) {
        String A07;
        android.net.Uri A03;
        String scheme;
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C2JS optionalTreeField = ((C2JS) it.next()).getOptionalTreeField(3, "entity", C59060QVs.class, -989165873);
            if (optionalTreeField != null && (A07 = optionalTreeField.A07("url")) != null && (A03 = AbstractC08820cl.A03(A07)) != null && (scheme = A03.getScheme()) != null && scheme.equalsIgnoreCase("https")) {
                arrayList.add(String.valueOf(A03));
            } else {
                throw new IllegalArgumentException("Link has to be https");
            }
        }
        return AbstractC001800i.A0a(arrayList);
    }

    public static final List A01(List list, int i, int i2) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C2JS c2js = (C2JS) it.next();
            arrayList.add(new SGC(Integer.valueOf(i), c2js.getCoercedIntField(1, "length"), c2js.A00("offset") + i2));
        }
        return AbstractC001800i.A0a(arrayList);
    }

    public static final List A02(List list, int i, boolean z) {
        android.net.Uri uri;
        String scheme;
        String A07;
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C2JS c2js = (C2JS) it.next();
            C2JS optionalTreeField = c2js.getOptionalTreeField(3, "entity", C59060QVs.class, -989165873);
            String str = null;
            if (optionalTreeField != null && (A07 = optionalTreeField.A07("url")) != null) {
                uri = AbstractC08820cl.A03(A07);
            } else {
                uri = null;
            }
            if (!z || (uri != null && (scheme = uri.getScheme()) != null && scheme.equalsIgnoreCase("https"))) {
                int coercedIntField = c2js.getCoercedIntField(1, "length");
                int A00 = c2js.A00("offset") + i;
                if (Boolean.valueOf(z).booleanValue() && uri != null) {
                    str = uri.toString();
                }
                arrayList.add(new C62901SWh(coercedIntField, A00, str));
            } else {
                throw new IllegalArgumentException("Link has to be https");
            }
        }
        return AbstractC001800i.A0a(arrayList);
    }
}
