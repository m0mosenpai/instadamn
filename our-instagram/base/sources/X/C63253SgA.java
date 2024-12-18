package X;

import android.content.Context;
import android.os.Bundle;
import android.util.Pair;
import android.view.ViewStructure;
import android.view.autofill.AutofillManager;
import android.view.autofill.AutofillValue;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import kotlin.enums.EnumEntries;

/* renamed from: X.SgA, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C63253SgA {
    public static final C63253SgA A00 = new Object();

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v5, types: [java.util.AbstractCollection, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r8v6, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r8v7, types: [X.0sl] */
    public static final void A00(Context context, Bundle bundle, Q4Z q4z, C5G6 c5g6, boolean z) {
        boolean z2;
        boolean z3;
        int length;
        CharSequence charSequence;
        QIq qIq;
        java.util.Set set;
        ?? A1E;
        int length2;
        java.util.Set set2 = C63269SgT.A0B;
        C43031yW c43031yW = c5g6.A04;
        LinkedHashMap A01 = AbstractC63087ScA.A01(q4z, c43031yW, set2);
        LinkedHashMap A04 = AbstractC06930Yk.A04(AbstractC63087ScA.A01(q4z, c43031yW, C63269SgT.A0H), A01);
        C62620SJd c62620SJd = c5g6.A00;
        C14360o3.A0B(c62620SJd, 0);
        c62620SJd.A04.A00 = A04;
        if (A04.containsKey("cc-exp") || (A04.containsKey("cc-exp-month") && A04.containsKey("cc-exp-year"))) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (A04.containsKey("cc-number") && z2 && A04.containsKey("cc-csc")) {
            z3 = AbstractC63348Si5.A03(AbstractC63348Si5.A01(AbstractC31171DnF.A0h("cc-number", A04), AbstractC31171DnF.A0h("cc-csc", A04), AbstractC31171DnF.A0h("cc-exp", A04), AbstractC31171DnF.A0h("cc-exp-month", A04), AbstractC31171DnF.A0h("cc-exp-year", A04)));
        } else {
            z3 = false;
        }
        C14360o3.A0B(c43031yW, 0);
        if (AbstractC61728Rsj.A00(c62620SJd, c43031yW) && (qIq = (QIq) c62620SJd.A04.A01) != null && qIq.A00.size() < 100) {
            Map map = (Map) c62620SJd.A06.A02;
            C14360o3.A0B(map, 0);
            EnumEntries<EnumC33326EoL> enumEntries = EnumC33326EoL.A00;
            ArrayList A0q = AbstractC167017dG.A0q(enumEntries);
            for (EnumC33326EoL enumC33326EoL : enumEntries) {
                long currentTimeMillis = System.currentTimeMillis();
                if (A04.isEmpty()) {
                    A1E = C16930sl.A00;
                } else {
                    int ordinal = enumC33326EoL.ordinal();
                    if (ordinal != 2) {
                        if (ordinal != 1) {
                            if (ordinal == 0) {
                                set = C63269SgT.A09;
                            } else {
                                throw B4Z.A00();
                            }
                        } else {
                            set = C63269SgT.A04;
                        }
                    } else {
                        set = set2;
                    }
                    A1E = AbstractC166987dD.A1E();
                    for (Object obj : set) {
                        String A1A = AbstractC166987dD.A1A(obj, map);
                        String A0h = AbstractC31171DnF.A0h(obj, A04);
                        if (A0h != null && A0h.length() != 0 && (A1A == null || (length2 = A1A.length()) == 0 || (length2 > 0 && !A1A.equals(A0h)))) {
                            A1E.add(obj);
                        }
                    }
                }
                A0q.add(new C31230DoD(enumC33326EoL, (List) A1E, currentTimeMillis));
            }
            ArrayList A1E2 = AbstractC166987dD.A1E();
            for (Object obj2 : A0q) {
                if (((List) ((C31230DoD) obj2).A03).size() >= 2) {
                    A1E2.add(obj2);
                }
            }
            if (!A1E2.isEmpty()) {
                ArrayList A1F = AbstractC166987dD.A1F(A1E2);
                A1F.addAll(qIq.A00);
                c62620SJd.A04.A01 = new QIq(A1F, z3);
            }
        }
        c62620SJd.A06.A01 = new QIj(AbstractC58319PtB.A0v("cc-number", A01), AbstractC58319PtB.A0v("cc-csc", A01), AbstractC58319PtB.A0v("cc-exp-month", A01), AbstractC58319PtB.A0v("cc-exp-year", A01), AbstractC58319PtB.A0v("cc-exp", A01), 0);
        c62620SJd.A06.A03 = new QIj(AbstractC58319PtB.A0v("cc-number", A01), AbstractC58319PtB.A0v("ml-cc-csc", A01), AbstractC58319PtB.A0v("ml-cc-exp-month", A01), AbstractC58319PtB.A0v("ml-cc-exp-year", A01), AbstractC58319PtB.A0v("ml-cc-exp", A01), 0);
        c62620SJd.A06.A04 = new QIj(AbstractC58319PtB.A0v("raw-cc-number", A01), AbstractC58319PtB.A0v("raw-cc-csc", A01), AbstractC58319PtB.A0v("raw-cc-exp-month", A01), AbstractC58319PtB.A0v("raw-cc-exp-year", A01), AbstractC58319PtB.A0v("raw-cc-exp", A01), 0);
        QIy qIy = c62620SJd.A06;
        String A0h2 = AbstractC31171DnF.A0h("given-name", A01);
        String A0h3 = AbstractC31171DnF.A0h("family-name", A01);
        String A0h4 = AbstractC31171DnF.A0h(PublicKeyCredentialControllerUtility.JSON_KEY_NAME, A01);
        if ((A0h2 == null || A0h2.length() == 0) && (A0h3 == null || A0h3.length() == 0)) {
            if (A0h4 != null && (length = A0h4.length()) != 0) {
                A0h2 = A0h4;
                int A05 = AbstractC001900j.A05(A0h4, ' ', length - 1);
                if (A05 > 0) {
                    A0h2 = AbstractC25227BEk.A0w(A0h4, 0, A05);
                    A0h3 = AbstractC43592JPx.A0z(A0h4, A05 + 1);
                } else {
                    A0h3 = null;
                }
            }
        } else {
            String str = A0h2;
            String str2 = A0h3;
            if (A0h2 == null) {
                str = "";
            }
            if (A0h3 == null) {
                str2 = "";
            }
            A0h4 = AbstractC25228BEl.A1A(AnonymousClass001.A0T(str, str2, ' '));
        }
        qIy.A00 = new QIp(AbstractC58319PtB.A0v("email", A01), A0h2, A0h3, A0h4, AbstractC58319PtB.A0v("address-line1", A01), AbstractC58319PtB.A0v("address-line2", A01), AbstractC58319PtB.A0v("address-line3", A01), AbstractC58319PtB.A0v("address-level1", A01), AbstractC58319PtB.A0v("address-level2", A01), AbstractC58319PtB.A0v("address-level3", A01), AbstractC58319PtB.A0v("address-level4", A01), AbstractC58319PtB.A0v("postal-code", A01), AbstractC58319PtB.A0v("street-address", A01), AbstractC58319PtB.A0v("tel", A01), AbstractC58319PtB.A0v("tel-area-code", A01), AbstractC58319PtB.A0v("tel-country-code", A01), AbstractC58319PtB.A0v("tel-local", A01), AbstractC58319PtB.A0v("tel-local-prefix", A01), AbstractC58319PtB.A0v("tel-local-suffix", A01), AbstractC58319PtB.A0v("tel-national", A01), AbstractC58319PtB.A0v("country", A01), AbstractC58319PtB.A0v("country-name", A01), 1);
        QIy qIy2 = c62620SJd.A06;
        String str3 = qIy2.A05;
        String str4 = qIy2.A06;
        QIj qIj = (QIj) qIy2.A01;
        QIj qIj2 = (QIj) qIy2.A04;
        QIj qIj3 = (QIj) qIy2.A03;
        QIp qIp = (QIp) qIy2.A00;
        Map map2 = (Map) qIy2.A02;
        AbstractC25229BEm.A1I(str3, 0, map2);
        c62620SJd.A05 = new QIy(qIp, qIj, qIj2, qIj3, str3, str4, map2);
        QIy qIy3 = c62620SJd.A06;
        qIy3.A02 = AbstractC06930Yk.A04((Map) qIy3.A02, A04);
        C63024Sau c63024Sau = c5g6.A01;
        AbstractC167007dF.A1E(context, 0, c63024Sau);
        if (AbstractC61728Rsj.A00(c62620SJd, c43031yW)) {
            Map map3 = (Map) c62620SJd.A06.A02;
            CharSequence charSequence2 = (CharSequence) map3.get("raw-cc-number");
            if ((charSequence2 != null && charSequence2.length() != 0) || ((charSequence = (CharSequence) map3.get("cc-number")) != null && charSequence.length() != 0)) {
                ((AutofillManager) context.getSystemService(AutofillManager.class)).cancel();
                c63024Sau.A01(bundle, new C26061Bfo((Integer) null, (Integer) null, (Long) null, (Long) null, (String) null, (String) null, (String) null, (String) null, (Map) null, 1023, false), C05F.A0Y, "AUTOFILL_MANAGER_CANCEL_SUCCESS");
            }
        }
        if (z) {
            A01.get("cc-number");
        }
    }

    /* JADX WARN: Type inference failed for: r3v3, types: [X.SJZ, java.lang.Object] */
    public static final void A01(Q4Z q4z, C5G6 c5g6) {
        LinkedHashMap A1I;
        String str;
        String str2;
        int length;
        QIl qIl = c5g6.A00.A00;
        C43031yW c43031yW = c5g6.A04;
        java.util.Set set = AbstractC63087ScA.A00;
        C14360o3.A0B(c43031yW, 1);
        if (q4z == null) {
            A1I = null;
        } else {
            boolean z = false;
            A1I = AbstractC166987dD.A1I();
            Iterator A13 = AbstractC31174DnI.A13(q4z.A0A);
            while (A13.hasNext()) {
                Q4Z q4z2 = (Q4Z) A13.next();
                AutofillValue autofillValue = q4z2.A04;
                String A002 = STE.A00(q4z2, c43031yW, C63269SgT.A0B, null);
                if (q4z2.A00 > 0) {
                    int i = q4z2.A01;
                    String str3 = null;
                    boolean z2 = false;
                    boolean z3 = false;
                    int i2 = 0;
                    if (A002 != null) {
                        str3 = A002;
                    }
                    String str4 = null;
                    ViewStructure.HtmlInfo htmlInfo = q4z2.A03;
                    if (htmlInfo != null) {
                        HashMap A1G = AbstractC166987dD.A1G();
                        List<Pair<String, String>> attributes = htmlInfo.getAttributes();
                        if (attributes != null) {
                            for (Pair<String, String> pair : attributes) {
                                A1G.put(pair.first, pair.second);
                            }
                        }
                        if (!A1G.isEmpty()) {
                            String[] strArr = q4z2.A09;
                            if (strArr != null && (length = strArr.length) > 0) {
                                str = (String) AbstractC16960so.A1Q(Arrays.copyOf(strArr, length)).stream().collect(Collectors.joining(" "));
                            } else {
                                str = null;
                            }
                            CharSequence charSequence = q4z2.A05;
                            if (charSequence != null) {
                                str4 = charSequence.toString();
                            }
                            String A0h = AbstractC31171DnF.A0h("label", A1G);
                            String A0h2 = AbstractC31171DnF.A0h(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, A1G);
                            String A0h3 = AbstractC31171DnF.A0h(PublicKeyCredentialControllerUtility.JSON_KEY_ID, A1G);
                            String A0h4 = AbstractC31171DnF.A0h(PublicKeyCredentialControllerUtility.JSON_KEY_NAME, A1G);
                            String A0h5 = AbstractC31171DnF.A0h("ua-autofill-hints", A1G);
                            if (A0h5 != null && A0h5.length() != 0) {
                                str2 = "Succeeded";
                            } else {
                                str2 = "Failed";
                            }
                            AutofillValue autofillValue2 = q4z2.A04;
                            if (autofillValue2 != null && autofillValue2.isText()) {
                                CharSequence textValue = autofillValue2.getTextValue();
                                C14360o3.A07(textValue);
                                if (textValue.length() != 0) {
                                    int length2 = textValue.length();
                                    int i3 = 0;
                                    while (true) {
                                        if (i3 < length2) {
                                            if (!Character.isDigit(textValue.charAt(i3)) && textValue.charAt(i3) != ' ') {
                                                break;
                                            } else {
                                                i3++;
                                            }
                                        } else {
                                            z2 = true;
                                            break;
                                        }
                                    }
                                    i2 = textValue.length();
                                }
                                if (SSH.A01(new C11L(" ").A00(textValue.toString(), ""))) {
                                    z3 = true;
                                }
                            }
                            ?? obj = new Object();
                            obj.A04 = str;
                            obj.A0A = str4;
                            obj.A03 = str2;
                            obj.A09 = null;
                            obj.A07 = A0h2;
                            obj.A05 = A0h3;
                            obj.A06 = A0h4;
                            obj.A01 = A0h5;
                            obj.A08 = A0h;
                            obj.A0D = z3;
                            obj.A00 = i2;
                            obj.A0B = z2;
                            obj.A0C = z3;
                            obj.A02 = str3;
                            A1I.putIfAbsent(Integer.valueOf(i), obj);
                        }
                    }
                    if (autofillValue != null && autofillValue.isText() && SSH.A01(AbstractC58322PtE.A0r(autofillValue.getTextValue().toString()))) {
                        z = true;
                    }
                }
            }
            if (!z || !MSW.A1b(A1I)) {
                A1I = null;
            }
        }
        qIl.A02 = A1I;
    }
}
