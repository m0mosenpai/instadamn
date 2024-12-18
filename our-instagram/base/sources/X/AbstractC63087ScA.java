package X;

import android.view.autofill.AutofillValue;
import com.facebook.common.stringformat.StringFormatUtil;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;

/* renamed from: X.ScA, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public abstract class AbstractC63087ScA {
    public static final java.util.Set A00;

    /* JADX WARN: Code restructure failed: missing block: B:62:0x010b, code lost:
    
        if (r14 == r15.intValue()) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x0103, code lost:
    
        if (r1.equals(r15) == false) goto L58;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final android.util.SparseArray A00(X.Q4Z r17, X.C43031yW r18, java.util.Map r19, java.util.Set r20, java.util.Set r21) {
        /*
            Method dump skipped, instructions count: 421
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC63087ScA.A00(X.Q4Z, X.1yW, java.util.Map, java.util.Set, java.util.Set):android.util.SparseArray");
    }

    public static final LinkedHashMap A01(Q4Z q4z, C43031yW c43031yW, java.util.Set set) {
        String obj;
        Object obj2;
        Object obj3;
        String valueOf;
        String str;
        Object obj4;
        Object obj5;
        C14360o3.A0B(c43031yW, 2);
        LinkedHashMap A1I = AbstractC166987dD.A1I();
        if (q4z != null) {
            Iterator A13 = AbstractC31174DnI.A13(q4z.A0A);
            while (A13.hasNext()) {
                Q4Z q4z2 = (Q4Z) A13.next();
                AutofillValue autofillValue = q4z2.A04;
                String A002 = STE.A00(q4z2, c43031yW, set, null);
                if (A002 != null && autofillValue != null) {
                    if (autofillValue.isText()) {
                        if (C63269SgT.A0C.contains(A002) && (obj4 = C63269SgT.A01.get(A002)) != null) {
                            A1I.put(obj4, autofillValue.getTextValue().toString());
                        }
                        CharSequence textValue = autofillValue.getTextValue();
                        C14360o3.A07(textValue);
                        if (textValue.length() != 0) {
                            C09530e4 A03 = AbstractC63230Sfi.A03(autofillValue.getTextValue().toString());
                            if (A03 != null && (obj2 = A03.A00) != null && (obj3 = A03.A01) != null) {
                                if ("cc-exp".equals(A002)) {
                                    A1I.put("cc-exp-month", String.valueOf(AbstractC166987dD.A0H(obj2)));
                                    valueOf = String.valueOf(obj3);
                                    str = "cc-exp-year";
                                } else if ("ml-cc-exp".equals(A002)) {
                                    A1I.put("ml-cc-exp-month", String.valueOf(AbstractC166987dD.A0H(obj2)));
                                    valueOf = String.valueOf(obj3);
                                    str = "ml-cc-exp-year";
                                }
                                A1I.put(str, valueOf);
                            }
                            if (AbstractC63230Sfi.A02(A002, autofillValue.getTextValue().toString()) != null) {
                                obj = autofillValue.getTextValue().toString();
                                A1I.put(A002, obj);
                            }
                        }
                    } else if (autofillValue.isList()) {
                        int listValue = autofillValue.getListValue();
                        CharSequence[] charSequenceArr = q4z2.A08;
                        if (charSequenceArr != null && listValue < charSequenceArr.length) {
                            if (C63269SgT.A0C.contains(A002) && (obj5 = C63269SgT.A01.get(A002)) != null) {
                                A1I.put(obj5, charSequenceArr[listValue].toString());
                            }
                            obj = AbstractC63230Sfi.A02(A002, charSequenceArr[listValue].toString());
                            if (obj == null) {
                                if ("cc-exp-month".equals(A002) && listValue > 0 && listValue <= 12 && (obj = StringFormatUtil.formatStrLocaleSafe("%02d", Integer.valueOf(listValue))) != null) {
                                }
                            }
                            A1I.put(A002, obj);
                        }
                    }
                }
            }
            String A0h = AbstractC31171DnF.A0h("cc-number", A1I);
            if (AbstractC001800i.A0u(A00, q4z.A06) && A0h != null) {
                A1I.put("cc-number", AbstractC61722Rsd.A00(A0h));
            }
        }
        return A1I;
    }

    static {
        java.util.Set unmodifiableSet = Collections.unmodifiableSet(AbstractC31171DnF.A0k(AbstractC16960so.A1N("https://checkout.us.shopifycs.com/", "https://checkout.shopifycs.com/")));
        C14360o3.A07(unmodifiableSet);
        A00 = unmodifiableSet;
    }
}
