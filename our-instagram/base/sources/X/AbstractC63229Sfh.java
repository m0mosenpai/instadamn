package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.facebook.browser.lite.extensions.autofill.model.AutofillData;
import com.fbpay.w3c.CardDetails;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: X.Sfh, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public abstract class AbstractC63229Sfh {
    public static CardDetails A01(CardDetails cardDetails, List list) {
        Object obj;
        if (list == null || list.isEmpty()) {
            return null;
        }
        Iterator it = list.iterator();
        it.getClass();
        while (true) {
            if (it.hasNext()) {
                obj = it.next();
                CardDetails cardDetails2 = (CardDetails) obj;
                if (AbstractC50102Ry.A00(cardDetails2.A0A, cardDetails.A0A) && AbstractC50102Ry.A00(cardDetails2.A04, cardDetails.A04) && AbstractC50102Ry.A00(cardDetails2.A03, cardDetails.A03)) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        return (CardDetails) obj;
    }

    public static AutofillData A00(AutofillData autofillData, java.util.Set set) {
        RRj rRj;
        Map unmodifiableMap = Collections.unmodifiableMap(autofillData.A00);
        C35880Fsu c35880Fsu = new C35880Fsu(set, 0);
        if (unmodifiableMap instanceof RRw) {
            RRw rRw = (RRw) unmodifiableMap;
            rRj = new RRj(S30.A00(rRw.A00, c35880Fsu), rRw.A01);
        } else {
            unmodifiableMap.getClass();
            rRj = new RRj(c35880Fsu, unmodifiableMap);
        }
        return new AutofillData(rRj);
    }

    public static ArrayList A02(List list, java.util.Set set) {
        ArrayList A1E = AbstractC166987dD.A1E();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            AutofillData autofillData = (AutofillData) it.next();
            Iterator A12 = AbstractC43593JPy.A12(Collections.unmodifiableMap(autofillData.A00));
            A12.getClass();
            while (true) {
                if (A12.hasNext()) {
                    Object next = A12.next();
                    if (A03((String) next, set)) {
                        if (next != null) {
                            A1E.add(autofillData);
                        }
                    }
                }
            }
        }
        return A1E;
    }

    public static boolean A03(String str, java.util.Set set) {
        if (!set.contains(str)) {
            if (!PublicKeyCredentialControllerUtility.JSON_KEY_NAME.equals(str) || !set.contains("cc-name")) {
                if (!"family-name".equals(str) || !set.contains("cc-family-name")) {
                    if ("given-name".equals(str) && set.contains("cc-given-name")) {
                        return true;
                    }
                    return false;
                }
                return true;
            }
            return true;
        }
        return true;
    }
}
