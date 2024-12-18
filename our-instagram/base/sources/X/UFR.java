package X;

import android.util.SparseArray;
import com.facebookpay.form.fragment.model.FormClickEvent;
import com.facebookpay.form.fragment.model.FormParams;
import com.facebookpay.logging.LoggingContext;
import com.google.common.collect.ImmutableList;
import java.util.LinkedHashMap;
import java.util.Map;

/* loaded from: classes11.dex */
public final class UFR extends AbstractC52922bZ {
    public C2GT A00;
    public FormParams A01;
    public UFM A02;
    public LoggingContext A03;
    public UFS A04;
    public String A05;
    public String A06;
    public String A07;
    public final C58252li A08;
    public final C2GS A09;
    public final C2GS A0A;
    public final C2GS A0B;
    public final C2GS A0C;
    public final InterfaceC58362lv A0D;
    public final VKJ A0E;

    public static final EnumC72407Xcu A00(int i) {
        if (i != 3) {
            if (i != 7) {
                return null;
            }
            return EnumC72407Xcu.A08;
        }
        return EnumC72407Xcu.A02;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0020  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.UvM A04(int r4) {
        /*
            r3 = this;
            r2 = 0
            switch(r4) {
                case 5: goto L14;
                case 6: goto L14;
                case 7: goto L14;
                case 8: goto L14;
                case 9: goto L14;
                case 10: goto L4;
                case 11: goto L4;
                case 12: goto L4;
                case 13: goto Ld;
                case 14: goto Ld;
                case 15: goto Ld;
                default: goto L4;
            }
        L4:
            r1 = r2
        L5:
            boolean r0 = r1 instanceof X.UvM
            if (r0 == 0) goto Lc
            r2 = r1
            X.UvM r2 = (X.UvM) r2
        Lc:
            return r2
        Ld:
            X.UFM r1 = r3.A05()
            r0 = 13
            goto L1a
        L14:
            X.UFM r1 = r3.A05()
            r0 = 11
        L1a:
            X.5t5 r0 = r1.A01(r0)
            if (r0 == 0) goto L4
            X.5t5 r1 = r0.A0A(r4)
            goto L5
        */
        throw new UnsupportedOperationException("Method not decompiled: X.UFR.A04(int):X.UvM");
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0023, code lost:
    
        if (r1 != 7) goto L20;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final com.facebookpay.otc.models.OtcInput A01(X.UFR r3, boolean r4) {
        /*
            com.facebookpay.form.fragment.model.FormParams r0 = r3.A01
            r2 = 0
            if (r0 != 0) goto Lf
            java.lang.String r0 = "formParams"
            X.C14360o3.A0F(r0)
            X.00O r0 = X.C00O.createAndThrow()
            throw r0
        Lf:
            int r1 = r0.A04
            if (r1 == 0) goto L37
            r0 = 1
            if (r1 == r0) goto L37
            r0 = 2
            if (r1 == r0) goto L34
            r0 = 3
            if (r1 == r0) goto L31
            r0 = 5
            if (r1 == r0) goto L37
            r0 = 6
            if (r1 == r0) goto L2e
            r0 = 7
            if (r1 == r0) goto L31
        L25:
            X.UFS r0 = r3.A06()
            com.facebookpay.otc.models.OtcInput r0 = r0.A04(r2, r4)
            return r0
        L2e:
            X.5tD r2 = X.EnumC129485tD.A0I
            goto L25
        L31:
            X.5tD r2 = X.EnumC129485tD.A0D
            goto L25
        L34:
            X.5tD r2 = X.EnumC129485tD.A0J
            goto L25
        L37:
            X.5tD r2 = X.EnumC129485tD.A05
            goto L25
        */
        throw new UnsupportedOperationException("Method not decompiled: X.UFR.A01(X.UFR, boolean):com.facebookpay.otc.models.OtcInput");
    }

    public static final void A02(FormClickEvent formClickEvent, UFR ufr) {
        Map linkedHashMap;
        VKJ vkj = ufr.A0E;
        Long l = null;
        if (vkj != null) {
            LoggingContext loggingContext = ufr.A03;
            if (loggingContext != null) {
                FormParams formParams = ufr.A01;
                if (formParams != null) {
                    String str = formParams.A0H;
                    if (str != null) {
                        l = AbstractC25228BEl.A13(str);
                    }
                    vkj.A01(A00(formParams.A04), loggingContext, l, UFS.A01(ufr.A06()));
                    return;
                }
                C14360o3.A0F("formParams");
            }
            C14360o3.A0F("loggingContext");
        } else {
            if (formClickEvent == null) {
                return;
            }
            Wap wap = C2FP.A01().A03;
            String str2 = formClickEvent.A00;
            LoggingContext loggingContext2 = ufr.A03;
            if (loggingContext2 != null) {
                String str3 = formClickEvent.A01;
                FormParams formParams2 = ufr.A01;
                if (formParams2 != null) {
                    String str4 = formParams2.A0H;
                    if (str4 != null) {
                        l = AbstractC25228BEl.A13(str4);
                    }
                    C70073W1q A05 = ufr.A06().A05();
                    FormParams formParams3 = ufr.A01;
                    if (formParams3 != null) {
                        EnumC72407Xcu A00 = A00(formParams3.A04);
                        LinkedHashMap A0o = AbstractC65702TsY.A0o(loggingContext2);
                        AbstractC65703TsZ.A1N(l, "TARGET_NAME", str3, A0o);
                        if (A00 != null) {
                            A0o.put("CREDENTIAL_TYPE", A00);
                        }
                        Object obj = A0o.get("extra_data");
                        if (!(obj instanceof Map) || (((obj instanceof InterfaceC15590qF) && !(obj instanceof InterfaceC16540rz)) || (linkedHashMap = (Map) obj) == null)) {
                            linkedHashMap = new LinkedHashMap();
                        }
                        C70199WGm.A08(A05, linkedHashMap);
                        Wap.A09(wap, "extra_data", linkedHashMap, str2, A0o);
                        return;
                    }
                }
                C14360o3.A0F("formParams");
            }
            C14360o3.A0F("loggingContext");
        }
        throw C00O.createAndThrow();
    }

    public final UFM A05() {
        UFM ufm = this.A02;
        if (ufm != null) {
            return ufm;
        }
        C14360o3.A0F("formViewModel");
        throw C00O.createAndThrow();
    }

    public final UFS A06() {
        UFS ufs = this.A04;
        if (ufs != null) {
            return ufs;
        }
        C14360o3.A0F("otcViewModel");
        throw C00O.createAndThrow();
    }

    public UFR(VKJ vkj) {
        this.A0E = vkj;
        C2GS c2gs = new C2GS();
        this.A0C = c2gs;
        this.A09 = new C2GS();
        this.A0A = new C2GS();
        this.A08 = new C58252li();
        this.A0B = new C2GS();
        this.A0D = new C70302WQh(this, 52);
        c2gs.A09(new C65991Txk(5, new X59(this, 22)));
    }

    public final SparseArray A03() {
        SparseArray A00 = A05().A00();
        FormParams formParams = this.A01;
        String str = "formParams";
        if (formParams != null) {
            A00.put(12, formParams.A0H);
            A00.put(39, formParams.A0C);
            C2GT c2gt = this.A00;
            if (c2gt != null) {
                A00.put(45, Boolean.valueOf(AbstractC31177DnL.A1b(c2gt.A02())));
                return A00;
            }
            str = "isFormValidLiveData";
        }
        C14360o3.A0F(str);
        throw C00O.createAndThrow();
    }

    public final boolean A07() {
        ImmutableList immutableList = A05().A01;
        if (immutableList == null) {
            C14360o3.A0F("cellViewModels");
            throw C00O.createAndThrow();
        }
        C1LC A0I = AbstractC43592JPx.A0I(immutableList);
        while (A0I.hasNext()) {
            if (((AbstractC129435t5) A0I.next()).A0H()) {
                return true;
            }
        }
        return false;
    }
}
