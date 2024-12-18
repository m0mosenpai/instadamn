package X;

import com.facebook.android.instantexperiences.autofill.model.AddressAutofillData;
import com.facebook.android.instantexperiences.autofill.model.BrowserExtensionsAutofillData;
import com.facebook.android.instantexperiences.autofill.model.EmailAutofillData;
import com.facebook.android.instantexperiences.autofill.model.NameAutofillData;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: classes10.dex */
public final class SZQ {
    public static final ArrayList A00(Map map) {
        ArrayList A12 = AbstractC166997dE.A12(map, 0);
        Iterator it = AbstractC31171DnF.A0k(EmailAutofillData.A00).iterator();
        while (it.hasNext()) {
            Object next = it.next();
            List A122 = AbstractC43592JPx.A12(next, map);
            if (A122 != null) {
                for (Object obj : A122) {
                    AbstractC167017dG.A1P(next, obj);
                    BrowserExtensionsAutofillData browserExtensionsAutofillData = new BrowserExtensionsAutofillData();
                    browserExtensionsAutofillData.A00.put(next, obj);
                    A12.add(browserExtensionsAutofillData);
                }
            }
        }
        return A12;
    }

    /* JADX WARN: Type inference failed for: r0v6, types: [com.facebook.android.instantexperiences.autofill.model.BrowserExtensionsAutofillData, java.lang.Object] */
    public final ArrayList A01(Map map) {
        Object obj;
        HashMap A11 = AbstractC31174DnI.A11(map, 0);
        Iterator it = AbstractC31171DnF.A0k(AddressAutofillData.A00).iterator();
        while (it.hasNext()) {
            Object next = it.next();
            List A12 = AbstractC43592JPx.A12(next, map);
            if (A12 == null) {
                A12 = C16930sl.A00;
            }
            if (!A12.isEmpty() && (obj = A12.get(0)) != null) {
                A11.put(next, obj);
            }
        }
        String A0h = AbstractC31171DnF.A0h("address-line1", A11);
        Object obj2 = A11.get("street-address");
        if (A0h != null) {
            StringBuilder A0s = AbstractC58318PtA.A0s(A0h);
            String A0h2 = AbstractC31171DnF.A0h("address-line2", A11);
            if (A0h2 != null && A0h2.length() != 0) {
                if (A0s.length() > 0) {
                    A0s.append(" ");
                }
                A0s.append(A0h2);
            }
            String A0h3 = AbstractC31171DnF.A0h("address-line3", A11);
            if (A0h3 != null && A0h3.length() != 0) {
                if (A0s.length() > 0) {
                    A0s.append(" ");
                }
                A0s.append(A0h3);
            }
            A11.put("street-address", A0s.toString());
        } else if (obj2 != null) {
            A11.put("address-line1", obj2);
            A11.remove("address-line2");
            A11.remove("address-line3");
        }
        ArrayList A1E = AbstractC166987dD.A1E();
        if (!A11.isEmpty()) {
            ?? obj3 = new Object();
            obj3.A00 = A11;
            A1E.add(obj3);
        }
        return A1E;
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [com.facebook.android.instantexperiences.autofill.model.BrowserExtensionsAutofillData, java.lang.Object] */
    public final ArrayList A02(Map map) {
        Object obj;
        HashMap A11 = AbstractC31174DnI.A11(map, 0);
        Iterator it = AbstractC31171DnF.A0k(NameAutofillData.A00).iterator();
        while (it.hasNext()) {
            Object next = it.next();
            List A12 = AbstractC43592JPx.A12(next, map);
            if (A12 == null) {
                A12 = C16930sl.A00;
            }
            if (!A12.isEmpty() && (obj = A12.get(0)) != null) {
                A11.put(next, obj);
            }
        }
        ArrayList A1E = AbstractC166987dD.A1E();
        if (!A11.isEmpty()) {
            ?? obj2 = new Object();
            obj2.A00 = A11;
            A1E.add(obj2);
        }
        return A1E;
    }
}
