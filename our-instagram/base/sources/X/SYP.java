package X;

import android.content.Context;
import com.facebook.android.instantexperiences.autofill.model.TelephoneAutofillData;
import com.facebook.phonenumbers.PhoneNumberUtil;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: classes10.dex */
public final class SYP {
    public static final SZQ A02 = new Object();
    public final Context A00;
    public final String A01;

    public SYP(Context context, String str) {
        C14360o3.A0B(str, 2);
        this.A00 = context;
        this.A01 = str;
    }

    public final ArrayList A00(Map map) {
        StringBuilder A0s;
        Object obj;
        HashMap A11 = AbstractC31174DnI.A11(map, 0);
        Iterator it = AbstractC31171DnF.A0k(TelephoneAutofillData.A01).iterator();
        while (it.hasNext()) {
            Object next = it.next();
            List A12 = AbstractC43592JPx.A12(next, map);
            if (A12 == null) {
                A12 = C16930sl.A00;
            }
            if (A12.isEmpty()) {
                obj = null;
            } else {
                obj = A12.get(0);
            }
            if (obj != null) {
                A11.put(next, obj);
            }
        }
        String A0h = AbstractC31171DnF.A0h("tel", A11);
        if (A0h == null) {
            String A0h2 = AbstractC31171DnF.A0h("tel-country-code", A11);
            if (A0h2 == null) {
                A0s = AbstractC166987dD.A1C();
            } else {
                String A01 = new C11L("0*").A01(A0h2, "");
                if (A01.length() != 0 && !AbstractC43592JPx.A1a("+", 1, A01)) {
                    A01 = AnonymousClass001.A0D(A01, '+');
                }
                A0s = AbstractC58318PtA.A0s(A01);
            }
            String A0h3 = AbstractC31171DnF.A0h("tel-national", A11);
            if (A0h3 == null) {
                String A0h4 = AbstractC31171DnF.A0h("tel-area-code", A11);
                A0h3 = AbstractC31171DnF.A0h("tel-local", A11);
                if (A0h4 != null && A0h3 != null) {
                    A0s.append(A0h4);
                } else {
                    String A0h5 = AbstractC31171DnF.A0h("tel-local-prefix", A11);
                    A0h3 = AbstractC31171DnF.A0h("tel-local-suffix", A11);
                    if (A0h4 != null && A0h5 != null && A0h3 != null) {
                        A0s.append(A0h4);
                        A0s.append(A0h5);
                    }
                    A0h = AbstractC166987dD.A19(A0s);
                }
            }
            A0s.append(A0h3);
            A0h = AbstractC166987dD.A19(A0s);
        }
        ArrayList A1E = AbstractC166987dD.A1E();
        PhoneNumberUtil A012 = PhoneNumberUtil.A01(this.A00);
        C14360o3.A07(A012);
        String str = this.A01;
        TelephoneAutofillData telephoneAutofillData = null;
        if (!AbstractC167007dF.A1N(A0h.length())) {
            try {
                AnonymousClass793 A0F = A012.A0F(A0h, str);
                HashMap A1G = AbstractC166987dD.A1G();
                String A0I = A012.A0I(A0F, C05F.A00);
                String valueOf = String.valueOf(A0F.A02);
                A1G.put("tel", A0I);
                A1G.put("tel-country-code", String.valueOf(A0F.A00));
                A1G.put("tel-national", valueOf);
                if (!(!str.equals(A012.A00.A01(A0F.A00)))) {
                    A0I = valueOf;
                }
                telephoneAutofillData = new TelephoneAutofillData(A1G, A0I);
            } catch (C40f unused) {
            }
        }
        if (telephoneAutofillData != null) {
            A1E.add(telephoneAutofillData);
        }
        return A1E;
    }
}
