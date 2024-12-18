package X;

import android.os.Bundle;
import com.facebookpay.msc.logging.LoggingData;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.Uwb, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public abstract class AbstractC67710Uwb extends UFZ {
    public int A00;
    public LoggingData A01;
    public List A02;
    public final C58252li A03;
    public final C152406tQ A04;

    public AbstractC67710Uwb(C152406tQ c152406tQ) {
        C14360o3.A0B(c152406tQ, 1);
        this.A04 = c152406tQ;
        this.A03 = new C58252li();
        this.A00 = -1;
        c152406tQ.A04.put("list_selection_fe_selector_financial_entity", new WT4(this, 1));
    }

    public boolean A0C(Bundle bundle, Integer num) {
        int i;
        C2JS c2js = (C2JS) C63368SiU.A01(bundle, "financial_entity");
        LoggingData loggingData = (LoggingData) bundle.getParcelable("logging_data");
        if (loggingData != null) {
            this.A01 = loggingData;
            if (c2js != null) {
                C58252li c58252li = this.A03;
                if (!C14360o3.A0K(c58252li.A02(), c2js)) {
                    String optionalStringField = c2js.getOptionalStringField(0, "financial_id");
                    if (optionalStringField != null) {
                        int i2 = this.A00;
                        if (i2 != 0) {
                            if (i2 != 5) {
                                if (i2 == 8) {
                                    i = 667758015;
                                }
                                c58252li.A0B(c2js);
                                return true;
                            }
                            i = 667754853;
                        } else {
                            i = 667749724;
                        }
                        Integer valueOf = Integer.valueOf(i);
                        if (valueOf != null) {
                            int intValue = valueOf.intValue();
                            C2FP.A02();
                            AbstractC70159WDv.A02(intValue, 0, (short) 615);
                            C2FP.A02();
                            AbstractC70159WDv.A03(optionalStringField, "financial_entity", null, null, null, null, null, null, null, intValue, 0);
                        }
                        c58252li.A0B(c2js);
                        return true;
                    }
                    throw AbstractC166997dE.A0g();
                }
                return false;
            }
            return false;
        }
        throw AbstractC166997dE.A0g();
    }

    public final LoggingData A0B() {
        LoggingData loggingData = this.A01;
        if (loggingData != null) {
            return loggingData;
        }
        C14360o3.A0F("loggingData");
        throw C00O.createAndThrow();
    }

    @Override // X.UFZ
    public void A09(Bundle bundle) {
        LoggingData loggingData;
        super.A09(bundle);
        Integer num = null;
        if (bundle != null) {
            num = AbstractC31179DnN.A0X(bundle, "viewmodel_class");
        }
        if (num != null) {
            this.A00 = num.intValue();
            if (bundle != null && (loggingData = (LoggingData) bundle.getParcelable("logging_data")) != null) {
                this.A01 = loggingData;
                ArrayList A03 = C63368SiU.A03(bundle);
                if (A03 != null) {
                    this.A02 = A03;
                    Bundle bundle2 = (Bundle) this.A04.A00("list_selection_fe_selector_financial_entity");
                    if (bundle2 != null) {
                        bundle = bundle2;
                    }
                    C58252li c58252li = this.A03;
                    if (c58252li.A02() == null) {
                        Object A01 = C63368SiU.A01(bundle, "financial_entity");
                        if (A01 == null) {
                            List list = this.A02;
                            if (list == null) {
                                C14360o3.A0F("financialEntities");
                                throw C00O.createAndThrow();
                            }
                            A01 = AbstractC001800i.A0I(list);
                        }
                        c58252li.A0B(A01);
                        return;
                    }
                    return;
                }
                throw new IllegalStateException("Required value was null.");
            }
            throw new IllegalStateException("Required value was null.");
        }
        throw new IllegalStateException("Required value was null.");
    }

    /* JADX WARN: Type inference failed for: r4v0, types: [X.Uw0, X.Vjc] */
    public final C67689UwG A0A() {
        String str;
        C2FP.A02().A08();
        C67689UwG c67689UwG = new C67689UwG(13);
        ?? abstractC69209Vjc = new AbstractC69209Vjc();
        C2JS c2js = (C2JS) this.A03.A02();
        if (c2js != null) {
            str = c2js.A08("company_name");
        } else {
            str = null;
        }
        abstractC69209Vjc.A00 = new C69753Vuo(null, new Wab(str), VEP.A14);
        abstractC69209Vjc.A00 = new WNN(this, 24);
        WDT wdt = new WDT(null, null, C05F.A00, false, false, false);
        wdt.A04 = true;
        wdt.A00 = new Waa(new Object[0], 2131962358);
        wdt.A02 = C05F.A01;
        abstractC69209Vjc.A01 = new W4A(wdt);
        c67689UwG.A00(new Uw8(abstractC69209Vjc), 1);
        return c67689UwG;
    }
}
