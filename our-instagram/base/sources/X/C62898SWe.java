package X;

import com.facebook.android.instantexperiences.autofill.model.BrowserExtensionsAutofillData;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;

/* renamed from: X.SWe, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C62898SWe {
    public final C63971Swx A00;
    public final SPX A01;
    public final Executor A02;
    public final Executor A03;

    public C62898SWe(C63971Swx c63971Swx, SPX spx, Executor executor, Executor executor2) {
        AbstractC167017dG.A1P(executor, executor2);
        this.A03 = executor;
        this.A02 = executor2;
        this.A01 = spx;
        this.A00 = c63971Swx;
    }

    public static final ArrayList A00(C62898SWe c62898SWe, String str, List list) {
        ArrayList A00;
        ArrayList A1E = AbstractC166987dD.A1E();
        ArrayList A1E2 = AbstractC166987dD.A1E();
        ArrayList A1E3 = AbstractC166987dD.A1E();
        A1E.addAll(list);
        switch (str.hashCode()) {
            case -1978111884:
                if (str.equals("email-autofill-data")) {
                    A00 = c62898SWe.A01.A01();
                    A1E2.addAll(A00);
                    break;
                }
                break;
            case 1001998627:
                if (str.equals("name-autofill-data")) {
                    A00 = c62898SWe.A01.A02();
                    A1E2.addAll(A00);
                    break;
                }
                break;
            case 1246886620:
                if (str.equals("telephone-autofill-data")) {
                    A00 = c62898SWe.A01.A03();
                    A1E2.addAll(A00);
                    break;
                }
                break;
            case 1540243148:
                if (str.equals("address-autofill-data")) {
                    A00 = c62898SWe.A01.A00();
                    A1E2.addAll(A00);
                    break;
                }
                break;
        }
        ArrayList A1E4 = AbstractC166987dD.A1E();
        A1E3.addAll(A1E2);
        Iterator it = A1E.iterator();
        while (it.hasNext()) {
            BrowserExtensionsAutofillData browserExtensionsAutofillData = (BrowserExtensionsAutofillData) it.next();
            Iterator it2 = A1E2.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                if (browserExtensionsAutofillData.Cdx((BrowserExtensionsAutofillData) it2.next())) {
                    A1E4.add(browserExtensionsAutofillData);
                }
            }
        }
        A1E.removeAll(A1E4);
        A1E3.addAll(A1E);
        return A1E3;
    }
}
