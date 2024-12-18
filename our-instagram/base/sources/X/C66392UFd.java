package X;

import android.os.Bundle;
import android.util.SparseArray;
import android.view.ContextThemeWrapper;
import androidx.fragment.app.Fragment;
import com.facebook.react.modules.dialog.DialogModule;
import com.facebookpay.common.recyclerview.adapteritems.BaseCheckoutItem;
import com.facebookpay.common.recyclerview.adapteritems.InlineFormItem;
import com.facebookpay.common.recyclerview.adapteritems.PuxPaymentMethodItem;
import com.facebookpay.common.recyclerview.adapteritems.SelectionActionViewItem;
import com.facebookpay.common.recyclerview.adapteritems.SelectionHeaderItem;
import com.facebookpay.common.recyclerview.adapteritems.SelectionPaymentMethodItem;
import com.facebookpay.expresscheckout.models.CheckoutConfiguration;
import com.facebookpay.expresscheckout.models.ECPPaymentRequest;
import com.facebookpay.expresscheckout.models.PaymentReceiverInfo;
import com.facebookpay.form.fragment.model.FormParams;
import com.facebookpay.logging.LoggingContext;
import com.facebookpay.otc.models.OtcInput;
import com.facebookpay.paymentmethod.model.CreditCard;
import com.facebookpay.paymentmethod.model.PaymentMethod;
import com.facebookpay.paymentmethod.model.TokenizedCard;
import com.facebookpay.shippingaddress.model.ShippingAddress;
import com.google.common.collect.ImmutableMap;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* renamed from: X.UFd, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C66392UFd extends AbstractC52922bZ implements InterfaceC71988XEb {
    public static final EnumC68138VCz A0N = EnumC68138VCz.A05;
    public SparseArray A00;
    public C62735SOb A01;
    public ECPPaymentRequest A02;
    public LoggingContext A03;
    public String A04;
    public String A05;
    public boolean A06;
    public boolean A07;
    public final C58252li A08;
    public final C58252li A09;
    public final C2GS A0A;
    public final C2GS A0B;
    public final C2GS A0C;
    public final C2GS A0E;
    public final InterfaceC58362lv A0F;
    public final UFS A0G;
    public final Map A0I;
    public final Map A0J;
    public final C2GS A0L;
    public final InterfaceC58362lv A0M;
    public final T2N A0H = C2FP.A01().A0D;
    public final InterfaceC09390do A0K = AbstractC09440dt.A01(X4A.A00);
    public final C2GS A0D = new C2GS();

    /* JADX WARN: Code restructure failed: missing block: B:39:0x007c, code lost:
    
        if (r13.A0G.A0A() == false) goto L31;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.util.ArrayList A02(java.lang.String r14, java.util.List r15, boolean r16) {
        /*
            Method dump skipped, instructions count: 383
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C66392UFd.A02(java.lang.String, java.util.List, boolean):java.util.ArrayList");
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final List A03(Boolean bool, String str, List list, List list2, List list3) {
        String A0C;
        Integer num;
        int i;
        String str2;
        ArrayList A02 = A02(str, list, true);
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        if ((!A0B() || !this.A0G.A0A()) && list3 != null) {
            C63406Sjd.A0C(this.A0A, AbstractC63239Sft.A01(list3));
            Iterator it = list3.iterator();
            while (it.hasNext()) {
                R1R r1r = (R1R) it.next();
                if (r1r.A0E() != null) {
                    QVX A0E = r1r.A0E();
                    if (A0E != null) {
                        A0C = A0E.A0C(DialogModule.KEY_TITLE);
                        if (A0C != null) {
                            num = null;
                            i = 3;
                        } else {
                            throw new IllegalStateException("Required value was null.");
                        }
                    } else {
                        throw new IllegalStateException("Required value was null.");
                    }
                } else if (r1r.A0F() == null) {
                    continue;
                } else {
                    QVZ A0F = r1r.A0F();
                    if (A0F != null) {
                        A0C = A0F.A0A(DialogModule.KEY_TITLE);
                        if (A0C != null) {
                            num = null;
                            i = 7;
                        } else {
                            throw new IllegalStateException("Required value was null.");
                        }
                    } else {
                        throw new IllegalStateException("Required value was null.");
                    }
                }
                AbstractC65702TsY.A1S(new SelectionActionViewItem(VG3.A0n, Integer.valueOf(i), num, num, A0C), arrayList2);
            }
        }
        String str3 = null;
        if (A0C() && A02.isEmpty()) {
            FormParams A00 = A00(this, true);
            ECPPaymentRequest eCPPaymentRequest = this.A02;
            if (eCPPaymentRequest == null) {
                C14360o3.A0F("ecpPaymentRequest");
                throw C00O.createAndThrow();
            }
            PaymentReceiverInfo paymentReceiverInfo = eCPPaymentRequest.A05;
            if (paymentReceiverInfo != null && ((str2 = paymentReceiverInfo.A00) != null || (str2 = paymentReceiverInfo.A02) != null)) {
                AbstractC65702TsY.A1S(new InlineFormItem(VG3.A05, A00, str2), arrayList);
                return arrayList;
            }
            throw AbstractC166997dE.A0g();
        }
        this.A00 = new SparseArray();
        OtcInput A04 = this.A0G.A04(EnumC129485tD.A0D, true);
        if (A04 != null) {
            str3 = A04.A01;
        }
        if (A02.size() == 1 && str3 != null && !str3.equals("CARD")) {
            return arrayList;
        }
        ArrayList A022 = A02(str, list2, false);
        if (A0B()) {
            AbstractC65702TsY.A1S(new SelectionHeaderItem(VG3.A0p, 2131961360, C05F.A0C, null, null), arrayList);
        }
        if (AbstractC166997dE.A1Z(bool, true)) {
            arrayList.addAll(arrayList2);
            A0A(arrayList, A02, A022);
        } else {
            A0A(arrayList, A02, A022);
            arrayList.addAll(arrayList2);
        }
        return AbstractC001800i.A0a(arrayList);
    }

    public static final void A09(C66392UFd c66392UFd, C63406Sjd c63406Sjd) {
        List list;
        List list2;
        List list3;
        String str;
        Boolean bool;
        Object A05;
        List list4;
        List list5;
        List list6;
        String str2;
        Boolean bool2;
        Object obj;
        String str3;
        String str4;
        C2GS c2gs = c66392UFd.A0D;
        c2gs.A0B(C63406Sjd.A00(WQ8.A00, c63406Sjd));
        C2GS c2gs2 = c66392UFd.A0E;
        Object obj2 = null;
        if (C63406Sjd.A0J(c63406Sjd)) {
            c66392UFd.A0B.A0B(C63406Sjd.A01(WQ9.A00, c63406Sjd));
            c66392UFd.A0L.A0B(C63406Sjd.A01(WQA.A00, c63406Sjd));
            C58252li c58252li = c66392UFd.A09;
            C63406Sjd c63406Sjd2 = (C63406Sjd) c2gs.A02();
            if (c63406Sjd2 != null) {
                list4 = (List) c63406Sjd2.A01;
            } else {
                list4 = null;
            }
            Object obj3 = c63406Sjd.A01;
            C70126W5l c70126W5l = (C70126W5l) obj3;
            if (c70126W5l != null) {
                list5 = c70126W5l.A04;
                list6 = c70126W5l.A03;
                str2 = c70126W5l.A06;
                bool2 = Boolean.valueOf(c70126W5l.A09);
            } else {
                list5 = null;
                list6 = null;
                str2 = null;
                bool2 = null;
            }
            C63406Sjd.A0C(c58252li, c66392UFd.A03(bool2, str2, list4, list5, list6));
            obj3.getClass();
            Iterator it = c70126W5l.A02.iterator();
            while (true) {
                if (it.hasNext()) {
                    obj = it.next();
                    Object obj4 = ((C63406Sjd) obj).A01;
                    if (obj4 != null) {
                        PaymentMethod paymentMethod = (PaymentMethod) obj4;
                        if (paymentMethod != null) {
                            str3 = paymentMethod.AtA();
                        } else {
                            str3 = null;
                        }
                        if (C14360o3.A0K(str3, c70126W5l.A05)) {
                            break;
                        }
                        if (paymentMethod != null) {
                            str4 = paymentMethod.AtA();
                        } else {
                            str4 = null;
                        }
                        if (C14360o3.A0K(str4, c66392UFd.A04)) {
                            break;
                        }
                    }
                } else {
                    obj = null;
                    break;
                }
            }
            C63406Sjd c63406Sjd3 = (C63406Sjd) obj;
            if (c63406Sjd3 != null) {
                c66392UFd.A04 = null;
                T2N t2n = c66392UFd.A0H;
                String str5 = c66392UFd.A05;
                if (str5 == null) {
                    C14360o3.A0F("productId");
                    throw C00O.createAndThrow();
                }
                t2n.A0A(UFS.A00(EnumC129485tD.A0D, c66392UFd.A0G, str5));
                Object obj5 = c63406Sjd3.A01;
                obj5.getClass();
                A05 = C63406Sjd.A04(new C69074VhP(C05F.A00, obj5, c70126W5l.A06));
            }
            A05 = c2gs2.A02();
        } else if (C63406Sjd.A0G(c63406Sjd)) {
            C58252li c58252li2 = c66392UFd.A09;
            Throwable th = c63406Sjd.A02;
            C63406Sjd c63406Sjd4 = (C63406Sjd) c2gs.A02();
            if (c63406Sjd4 != null) {
                list = (List) c63406Sjd4.A01;
            } else {
                list = null;
            }
            C70126W5l c70126W5l2 = (C70126W5l) c63406Sjd.A01;
            if (c70126W5l2 != null) {
                list2 = c70126W5l2.A04;
                list3 = c70126W5l2.A03;
                str = c70126W5l2.A06;
                bool = Boolean.valueOf(c70126W5l2.A09);
            } else {
                list2 = null;
                list3 = null;
                str = null;
                bool = null;
            }
            c58252li2.A0B(C63406Sjd.A05(c66392UFd.A03(bool, str, list, list2, list3), th));
            C63406Sjd c63406Sjd5 = (C63406Sjd) c2gs2.A02();
            if (c63406Sjd5 != null) {
                obj2 = c63406Sjd5.A01;
            }
            A05 = C63406Sjd.A05(obj2, th);
        } else {
            C63406Sjd.A0D(c66392UFd.A09, null);
            A05 = c2gs2.A02();
        }
        c2gs2.A0B(A05);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0023, code lost:
    
        if (r2.contains(X.EnumC68185VFd.ADDRESS) != false) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x002b, code lost:
    
        if (r2.contains(X.EnumC68185VFd.ZIP) != false) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x004e, code lost:
    
        if (r2.contains(X.EnumC68185VFd.ADDRESS) == false) goto L15;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final boolean A0D(com.facebookpay.paymentmethod.model.CreditCard r6, java.lang.Integer r7) {
        /*
            r5 = this;
            r4 = 0
            if (r6 == 0) goto L45
            X.UWg r2 = r6.A01
            if (r2 == 0) goto L45
            X.VFd r1 = X.EnumC68185VFd.UNSET_OR_UNRECOGNIZED_ENUM_VALUE
            r3 = 1
            java.lang.String r0 = "fields_to_verify"
            com.google.common.collect.ImmutableList r2 = r2.getRequiredCompactedEnumListField(r3, r0, r1)
            if (r2 == 0) goto L45
            int r1 = r2.size()
            if (r1 == 0) goto L2d
            if (r1 == r3) goto L48
            r0 = 2
            if (r1 != r0) goto L46
            X.VFd r0 = X.EnumC68185VFd.ADDRESS
            boolean r0 = r2.contains(r0)
            if (r0 == 0) goto L46
        L25:
            X.VFd r0 = X.EnumC68185VFd.ZIP
            boolean r0 = r2.contains(r0)
            if (r0 == 0) goto L46
        L2d:
            r2 = 1
        L2e:
            java.util.Map r1 = r5.A0J
            java.lang.String r0 = r6.AtA()
            boolean r0 = r1.containsKey(r0)
            if (r0 == 0) goto L45
            if (r2 == 0) goto L45
            if (r7 == 0) goto L44
            int r0 = r7.intValue()
            if (r0 != 0) goto L45
        L44:
            r4 = 1
        L45:
            return r4
        L46:
            r2 = 0
            goto L2e
        L48:
            X.VFd r0 = X.EnumC68185VFd.ADDRESS
            boolean r0 = r2.contains(r0)
            if (r0 != 0) goto L2d
            goto L25
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C66392UFd.A0D(com.facebookpay.paymentmethod.model.CreditCard, java.lang.Integer):boolean");
    }

    public final void A0L(XJm xJm, PaymentMethod paymentMethod) {
        CreditCard creditCard;
        Integer num;
        C69074VhP c69074VhP;
        C69074VhP c69074VhP2;
        C14360o3.A0B(xJm, 0);
        String str = null;
        if ((paymentMethod instanceof CreditCard) && (creditCard = (CreditCard) paymentMethod) != null) {
            CreditCard creditCard2 = new CreditCard(creditCard.A02, creditCard.A04(), creditCard.A03());
            creditCard2.A00 = xJm;
            this.A0J.put(creditCard2.AtA(), xJm);
            if (A0D(creditCard2, A0J(creditCard2))) {
                this.A0I.put(creditCard2.AtA(), null);
            }
            C58252li c58252li = this.A08;
            C63406Sjd c63406Sjd = (C63406Sjd) c58252li.A02();
            if (c63406Sjd != null && (c69074VhP2 = (C69074VhP) c63406Sjd.A01) != null) {
                num = c69074VhP2.A00;
            } else {
                num = null;
            }
            C63406Sjd c63406Sjd2 = (C63406Sjd) c58252li.A02();
            if (c63406Sjd2 != null && (c69074VhP = (C69074VhP) c63406Sjd2.A01) != null) {
                str = c69074VhP.A02;
            }
            C63406Sjd.A0C(c58252li, new C69074VhP(num, creditCard2, str));
            if (A0C() && paymentMethod != null) {
                C63406Sjd.A0C(this.A0E, new C69074VhP(C05F.A01, paymentMethod, A01(this)));
                A0K();
            }
        }
    }

    public final boolean A0O(CreditCard creditCard, boolean z) {
        UXS uxs;
        if (creditCard != null && ((!z || !this.A0J.containsKey(creditCard.AtA())) && this.A06)) {
            XJm xJm = creditCard.A00;
            C63406Sjd c63406Sjd = (C63406Sjd) this.A0B.A02();
            if (c63406Sjd != null && (uxs = (UXS) c63406Sjd.A01) != null) {
                if (!AbstractC68345VNf.A00(uxs, xJm, creditCard.A03)) {
                    return true;
                }
            } else {
                throw AbstractC166997dE.A0g();
            }
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:58:0x01b9, code lost:
    
        if (r39.A0G.A0A() == false) goto L51;
     */
    @Override // X.InterfaceC71988XEb
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void D6l(android.os.Bundle r40, android.view.ContextThemeWrapper r41, androidx.fragment.app.Fragment r42, X.C63406Sjd r43) {
        /*
            Method dump skipped, instructions count: 464
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C66392UFd.D6l(android.os.Bundle, android.view.ContextThemeWrapper, androidx.fragment.app.Fragment, X.Sjd):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x01a4, code lost:
    
        if (r51 != false) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:102:0x019e, code lost:
    
        if (r51 != false) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:104:0x0198, code lost:
    
        if (r51 != false) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:106:0x0192, code lost:
    
        if (r51 != false) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:108:0x018c, code lost:
    
        if (r51 != false) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00ac, code lost:
    
        if ((!r13.isEmpty()) == false) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x01b9, code lost:
    
        if (r51 != false) goto L60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x01b4, code lost:
    
        if (r51 != false) goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x01af, code lost:
    
        if (r51 != false) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x01aa, code lost:
    
        if (r51 != false) goto L51;
     */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0170  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0183  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x01bf  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0187  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final com.facebookpay.form.fragment.model.FormParams A00(X.C66392UFd r50, boolean r51) {
        /*
            Method dump skipped, instructions count: 543
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C66392UFd.A00(X.UFd, boolean):com.facebookpay.form.fragment.model.FormParams");
    }

    public static final String A01(C66392UFd c66392UFd) {
        C70126W5l c70126W5l;
        C69074VhP c69074VhP;
        String str;
        C69074VhP c69074VhP2;
        C2GS c2gs = c66392UFd.A0E;
        C63406Sjd c63406Sjd = (C63406Sjd) c2gs.A02();
        if (c63406Sjd != null && (c69074VhP = (C69074VhP) c63406Sjd.A01) != null && (str = c69074VhP.A02) != null && !AbstractC001900j.A0T(str)) {
            C63406Sjd c63406Sjd2 = (C63406Sjd) c2gs.A02();
            if (c63406Sjd2 == null || (c69074VhP2 = (C69074VhP) c63406Sjd2.A01) == null) {
                return null;
            }
            return c69074VhP2.A02;
        }
        T2N t2n = c66392UFd.A0H;
        String str2 = c66392UFd.A05;
        if (str2 == null) {
            C14360o3.A0F("productId");
            throw C00O.createAndThrow();
        }
        C63406Sjd c63406Sjd3 = (C63406Sjd) t2n.A05(UFS.A00(EnumC129485tD.A0D, c66392UFd.A0G, str2)).A02();
        if (c63406Sjd3 == null || (c70126W5l = (C70126W5l) c63406Sjd3.A01) == null) {
            return null;
        }
        return c70126W5l.A06;
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x00a4, code lost:
    
        if (r46.A0G.A0B() != false) goto L10;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void A04(android.os.Bundle r47, androidx.fragment.app.Fragment r48, com.facebookpay.common.recyclerview.adapteritems.SelectionPaymentMethodItem r49) {
        /*
            Method dump skipped, instructions count: 259
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C66392UFd.A04(android.os.Bundle, androidx.fragment.app.Fragment, com.facebookpay.common.recyclerview.adapteritems.SelectionPaymentMethodItem):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void A05(X.UWg r11, X.EnumC72407Xcu r12, long r13, boolean r15) {
        /*
            r10 = this;
            X.2GS r0 = r10.A0C
            java.lang.Object r5 = r0.A02()
            X.VCz r3 = X.EnumC68138VCz.A03
            r0 = 0
            r1 = 140(0x8c, float:1.96E-43)
            java.lang.String r4 = X.AbstractC58317Pt9.A00(r1)
            java.lang.String r2 = "edit_card"
            if (r5 == r3) goto L2e
            if (r15 != 0) goto L2e
            java.lang.String r4 = "user_click_credential_atomic"
            java.lang.String r2 = "select_existing_credential "
        L19:
            r7 = r0
        L1a:
            X.SPR r1 = X.C2FP.A01()
            X.Wap r5 = r1.A03
            com.facebookpay.logging.LoggingContext r9 = r10.A03
            if (r9 != 0) goto L46
            java.lang.String r0 = "loggingContext"
            X.C14360o3.A0F(r0)
            X.00O r0 = X.C00O.createAndThrow()
            throw r0
        L2e:
            r5 = 1
            if (r11 == 0) goto L19
            X.VFd r3 = X.EnumC68185VFd.UNSET_OR_UNRECOGNIZED_ENUM_VALUE
            java.lang.String r1 = "fields_to_verify"
            com.google.common.collect.ImmutableList r1 = r11.getRequiredCompactedEnumListField(r5, r1, r3)
            if (r1 == 0) goto L19
            boolean r1 = r1.isEmpty()
            r1 = r1 ^ 1
            if (r1 != r5) goto L19
            java.lang.String r7 = "need_verification"
            goto L1a
        L46:
            X.UFS r1 = r10.A0G
            X.W1q r8 = r1.A05()
            if (r11 == 0) goto L57
            X.VFd r3 = X.EnumC68185VFd.UNSET_OR_UNRECOGNIZED_ENUM_VALUE
            r1 = 1
            java.lang.String r0 = "fields_to_verify"
            com.google.common.collect.ImmutableList r0 = r11.getRequiredCompactedEnumListField(r1, r0, r3)
        L57:
            java.lang.String r6 = java.lang.String.valueOf(r0)
            java.lang.Long r1 = java.lang.Long.valueOf(r13)
            java.util.LinkedHashMap r3 = X.AbstractC65702TsY.A0o(r9)
            java.lang.String r0 = "TARGET_NAME"
            r3.put(r0, r2)
            if (r1 == 0) goto L6f
            java.lang.String r0 = "component_data_id"
            r3.put(r0, r1)
        L6f:
            java.lang.String r0 = "CREDENTIAL_TYPE"
            r3.put(r0, r12)
            java.lang.String r2 = "extra_data"
            java.lang.Object r1 = r3.get(r2)
            boolean r0 = r1 instanceof java.util.Map
            if (r0 == 0) goto L8a
            boolean r0 = r1 instanceof X.InterfaceC15590qF
            if (r0 == 0) goto L86
            boolean r0 = r1 instanceof X.InterfaceC16540rz
            if (r0 == 0) goto L8a
        L86:
            java.util.Map r1 = (java.util.Map) r1
            if (r1 != 0) goto L8f
        L8a:
            java.util.LinkedHashMap r1 = new java.util.LinkedHashMap
            r1.<init>()
        L8f:
            X.C70199WGm.A08(r8, r1)
            r3.put(r2, r1)
            if (r7 == 0) goto La0
            r0 = 462(0x1ce, float:6.47E-43)
            java.lang.String r0 = X.AbstractC43591JPw.A00(r0)
            X.C70199WGm.A0A(r7, r0, r3)
        La0:
            if (r6 == 0) goto La7
            java.lang.String r0 = "fields_to_verify"
            X.C70199WGm.A0A(r6, r0, r3)
        La7:
            com.google.common.collect.ImmutableMap r0 = com.google.common.collect.ImmutableMap.copyOf(r3)
            X.C14360o3.A07(r0)
            r5.Chz(r4, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C66392UFd.A05(X.UWg, X.Xcu, long, boolean):void");
    }

    public static final void A06(SelectionPaymentMethodItem selectionPaymentMethodItem, C66392UFd c66392UFd) {
        String str;
        Integer num;
        Integer num2;
        String A07;
        C69074VhP c69074VhP;
        PaymentMethod paymentMethod;
        EnumC68138VCz enumC68138VCz = (EnumC68138VCz) c66392UFd.A0C.A02();
        if (enumC68138VCz != null) {
            boolean z = true;
            if (enumC68138VCz.ordinal() == 1) {
                selectionPaymentMethodItem.Eda(C05F.A01);
                return;
            }
            C63406Sjd c63406Sjd = (C63406Sjd) c66392UFd.A08.A02();
            if (c63406Sjd != null && (c69074VhP = (C69074VhP) c63406Sjd.A01) != null && (paymentMethod = (PaymentMethod) c69074VhP.A01) != null) {
                str = paymentMethod.AtA();
            } else {
                str = null;
            }
            UWg uWg = selectionPaymentMethodItem.A00;
            if ((uWg == null || (A07 = uWg.A07("error_msg")) == null || !(!AbstractC001900j.A0T(A07))) && (((num = selectionPaymentMethodItem.A02) == null || num.intValue() != 2131961484) && (A0E(c66392UFd) || (num2 = selectionPaymentMethodItem.A02) == null || num2.intValue() != 2131961483))) {
                z = false;
            }
            VND.A00(selectionPaymentMethodItem, str, z);
        }
    }

    public static final void A08(C66392UFd c66392UFd) {
        PaymentMethod paymentMethod;
        CreditCard creditCard;
        X1s x1s;
        Integer num;
        C63406Sjd A04;
        C69074VhP c69074VhP;
        C69074VhP c69074VhP2;
        Integer num2;
        C69074VhP c69074VhP3;
        C69074VhP c69074VhP4;
        String optionalStringField;
        C63406Sjd c63406Sjd;
        C69074VhP c69074VhP5;
        PaymentMethod paymentMethod2;
        SelectionPaymentMethodItem selectionPaymentMethodItem;
        CreditCard creditCard2;
        List list;
        Object obj;
        String str;
        SelectionPaymentMethodItem selectionPaymentMethodItem2;
        C69074VhP c69074VhP6;
        C58252li c58252li = c66392UFd.A08;
        C63406Sjd c63406Sjd2 = (C63406Sjd) c58252li.A02();
        String str2 = null;
        if (c63406Sjd2 != null && (c69074VhP6 = (C69074VhP) c63406Sjd2.A01) != null) {
            paymentMethod = (PaymentMethod) c69074VhP6.A01;
        } else {
            paymentMethod = null;
        }
        if ((paymentMethod instanceof CreditCard) && (creditCard = (CreditCard) paymentMethod) != null) {
            c66392UFd.A0J.remove(creditCard.AtA());
            if (A0E(c66392UFd) && (c63406Sjd = (C63406Sjd) c58252li.A02()) != null && (c69074VhP5 = (C69074VhP) c63406Sjd.A01) != null && (paymentMethod2 = (PaymentMethod) c69074VhP5.A01) != null) {
                C63406Sjd c63406Sjd3 = (C63406Sjd) c66392UFd.A09.A02();
                BaseCheckoutItem baseCheckoutItem = null;
                if (c63406Sjd3 != null && (list = (List) c63406Sjd3.A01) != null) {
                    Iterator it = list.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            obj = it.next();
                            Object obj2 = ((C63406Sjd) obj).A01;
                            if ((obj2 instanceof SelectionPaymentMethodItem) && (selectionPaymentMethodItem2 = (SelectionPaymentMethodItem) obj2) != null) {
                                str = selectionPaymentMethodItem2.A0F;
                            } else {
                                str = null;
                            }
                            if (C14360o3.A0K(str, paymentMethod2.AtA())) {
                                break;
                            }
                        } else {
                            obj = null;
                            break;
                        }
                    }
                    C63406Sjd c63406Sjd4 = (C63406Sjd) obj;
                    if (c63406Sjd4 != null) {
                        baseCheckoutItem = (BaseCheckoutItem) c63406Sjd4.A01;
                    }
                }
                if ((baseCheckoutItem instanceof SelectionPaymentMethodItem) && (selectionPaymentMethodItem = (SelectionPaymentMethodItem) baseCheckoutItem) != null) {
                    selectionPaymentMethodItem.A07 = false;
                    XJm xJm = selectionPaymentMethodItem.A08;
                    if (xJm != null && (paymentMethod2 instanceof CreditCard) && (creditCard2 = (CreditCard) paymentMethod2) != null) {
                        creditCard2.A00 = xJm;
                    }
                    selectionPaymentMethodItem.A02 = c66392UFd.A0J(paymentMethod2);
                }
            }
            Integer A0J = c66392UFd.A0J(creditCard);
            UWg uWg = creditCard.A01;
            boolean z = false;
            if (uWg != null && (optionalStringField = uWg.getOptionalStringField(0, "error_msg")) != null && (!AbstractC001900j.A0T(optionalStringField))) {
                z = true;
            }
            if ((A0J == null || A0J.intValue() == 0) && !z) {
                x1s = null;
            } else {
                x1s = new X1s(A0J, null, null);
            }
            c66392UFd.A0I.put(creditCard.AtA(), x1s);
            C63406Sjd c63406Sjd5 = (C63406Sjd) c58252li.A02();
            if (x1s != null) {
                if (c63406Sjd5 != null && (c69074VhP4 = (C69074VhP) c63406Sjd5.A01) != null) {
                    num2 = c69074VhP4.A00;
                } else {
                    num2 = null;
                }
                C63406Sjd c63406Sjd6 = (C63406Sjd) c58252li.A02();
                if (c63406Sjd6 != null && (c69074VhP3 = (C69074VhP) c63406Sjd6.A01) != null) {
                    str2 = c69074VhP3.A02;
                }
                A04 = C63406Sjd.A05(new C69074VhP(num2, creditCard, str2), x1s);
            } else {
                if (c63406Sjd5 != null && (c69074VhP2 = (C69074VhP) c63406Sjd5.A01) != null) {
                    num = c69074VhP2.A00;
                } else {
                    num = null;
                }
                C63406Sjd c63406Sjd7 = (C63406Sjd) c58252li.A02();
                if (c63406Sjd7 != null && (c69074VhP = (C69074VhP) c63406Sjd7.A01) != null) {
                    str2 = c69074VhP.A02;
                }
                A04 = C63406Sjd.A04(new C69074VhP(num, creditCard, str2));
            }
            c58252li.A0B(A04);
        }
    }

    private final boolean A0B() {
        ECPPaymentRequest eCPPaymentRequest = this.A02;
        if (eCPPaymentRequest == null) {
            C14360o3.A0F("ecpPaymentRequest");
            throw C00O.createAndThrow();
        }
        CheckoutConfiguration checkoutConfiguration = eCPPaymentRequest.A01;
        if (checkoutConfiguration != null) {
            return AbstractC31177DnL.A1b(checkoutConfiguration.A09);
        }
        return false;
    }

    private final boolean A0C() {
        ECPPaymentRequest eCPPaymentRequest = this.A02;
        if (eCPPaymentRequest == null) {
            C14360o3.A0F("ecpPaymentRequest");
            throw C00O.createAndThrow();
        }
        CheckoutConfiguration checkoutConfiguration = eCPPaymentRequest.A01;
        if (checkoutConfiguration != null) {
            return AbstractC31177DnL.A1b(checkoutConfiguration.A0A);
        }
        return false;
    }

    public static final boolean A0E(C66392UFd c66392UFd) {
        ECPPaymentRequest eCPPaymentRequest = c66392UFd.A02;
        if (eCPPaymentRequest == null) {
            C14360o3.A0F("ecpPaymentRequest");
            throw C00O.createAndThrow();
        }
        CheckoutConfiguration checkoutConfiguration = eCPPaymentRequest.A01;
        if (checkoutConfiguration != null) {
            return AbstractC31177DnL.A1b(checkoutConfiguration.A07);
        }
        return false;
    }

    public final ShippingAddress A0F() {
        PaymentMethod paymentMethod;
        CreditCard creditCard;
        XJm xJm;
        C69074VhP c69074VhP;
        C63406Sjd c63406Sjd = (C63406Sjd) this.A08.A02();
        if (c63406Sjd != null && (c69074VhP = (C69074VhP) c63406Sjd.A01) != null) {
            paymentMethod = (PaymentMethod) c69074VhP.A01;
        } else {
            paymentMethod = null;
        }
        if (!(paymentMethod instanceof CreditCard) || (creditCard = (CreditCard) paymentMethod) == null || (xJm = creditCard.A00) == null) {
            return null;
        }
        String str = creditCard.A03;
        if (str == null) {
            str = "";
        }
        return new ShippingAddress(null, null, str, xJm.C2e(), xJm.C2f(), xJm.AZn(), xJm.AZp(), xJm.As9(), xJm.CIk(), null, true, true, false, false, true);
    }

    public final C63406Sjd A0G() {
        boolean z;
        PaymentMethod paymentMethod;
        Object obj;
        C69074VhP c69074VhP;
        PaymentMethod paymentMethod2;
        Throwable x1s;
        List list;
        PuxPaymentMethodItem puxPaymentMethodItem;
        UWg uWg;
        String optionalStringField;
        VEP vep;
        C69074VhP c69074VhP2;
        List list2;
        C63406Sjd c63406Sjd = (C63406Sjd) this.A09.A02();
        if (c63406Sjd != null && (list2 = (List) c63406Sjd.A01) != null) {
            z = list2.isEmpty();
        } else {
            z = true;
        }
        C58252li c58252li = this.A08;
        C63406Sjd c63406Sjd2 = (C63406Sjd) c58252li.A02();
        C69074VhP c69074VhP3 = (C69074VhP) c63406Sjd2.A01;
        if (c69074VhP3 != null) {
            paymentMethod = (PaymentMethod) c69074VhP3.A01;
        } else {
            paymentMethod = null;
        }
        VG3 vg3 = VG3.A0h;
        C63406Sjd A02 = C63406Sjd.A02(c63406Sjd2, new PuxPaymentMethodItem(vg3, paymentMethod, null, false, !z));
        if (!C63406Sjd.A0H((C63406Sjd) c58252li.A02())) {
            C63406Sjd c63406Sjd3 = (C63406Sjd) c58252li.A02();
            CreditCard creditCard = null;
            Throwable th = null;
            if (c63406Sjd3 != null && (c69074VhP2 = (C69074VhP) c63406Sjd3.A01) != null) {
                obj = c69074VhP2.A01;
            } else {
                obj = null;
            }
            C63406Sjd c63406Sjd4 = (C63406Sjd) c58252li.A02();
            if (obj == null) {
                if (c63406Sjd4 != null) {
                    th = c63406Sjd4.A02;
                }
                if (!(th instanceof X1n)) {
                    int i = 2131961364;
                    if (A0C()) {
                        i = 2131961377;
                    }
                    if (A0C()) {
                        vep = VEP.A1F;
                    } else {
                        vep = VEP.A0Y;
                    }
                    x1s = new X1p(vep, i);
                    puxPaymentMethodItem = new PuxPaymentMethodItem(vg3, null, 3, false, true);
                    A02 = C63406Sjd.A05(puxPaymentMethodItem, x1s);
                }
            } else if (c63406Sjd4 != null && (c69074VhP = (C69074VhP) c63406Sjd4.A01) != null && (paymentMethod2 = (PaymentMethod) c69074VhP.A01) != null) {
                Integer A0J = A0J(paymentMethod2);
                boolean z2 = paymentMethod2 instanceof CreditCard;
                if (z2) {
                    creditCard = (CreditCard) paymentMethod2;
                }
                if (A0D(creditCard, A0J)) {
                    A02 = C63406Sjd.A04(new PuxPaymentMethodItem(vg3, paymentMethod2, null, false, true));
                } else {
                    if (z2 && (uWg = ((CreditCard) paymentMethod2).A01) != null && (optionalStringField = uWg.getOptionalStringField(0, "error_msg")) != null && (!AbstractC001900j.A0T(optionalStringField))) {
                        x1s = new X1s(2131961396, null, null);
                    } else if (A0J != null && A0J.intValue() != 0) {
                        C63406Sjd c63406Sjd5 = (C63406Sjd) this.A0D.A02();
                        if (c63406Sjd5 != null && (list = (List) c63406Sjd5.A01) != null && list.size() == 1) {
                            x1s = new X1s(A0J, null, null);
                        } else {
                            x1s = new X1s(2131961396, null, null);
                        }
                    }
                    puxPaymentMethodItem = new PuxPaymentMethodItem(vg3, paymentMethod2, 3, false, true);
                    A02 = C63406Sjd.A05(puxPaymentMethodItem, x1s);
                }
            } else {
                throw AbstractC166997dE.A0g();
            }
        }
        C14360o3.A0A(A02);
        return A02;
    }

    public final Boolean A0H() {
        Object obj = this.A00.get(45);
        if (obj instanceof Boolean) {
            return (Boolean) obj;
        }
        return null;
    }

    public final Boolean A0I() {
        Object obj = this.A00.get(29);
        if (obj instanceof Boolean) {
            return (Boolean) obj;
        }
        return null;
    }

    public final Integer A0J(PaymentMethod paymentMethod) {
        int i;
        if (paymentMethod instanceof CreditCard) {
            if ((paymentMethod instanceof TokenizedCard) && ((TokenizedCard) paymentMethod).A01.getOptionalEnumField(0, "token_status", EnumC61211RhB.UNSET_OR_UNRECOGNIZED_ENUM_VALUE) == EnumC61211RhB.SUSPENDED) {
                i = 2131961484;
            } else if (A0O((CreditCard) paymentMethod, true)) {
                i = 2131961483;
            }
            return Integer.valueOf(i);
        }
        return null;
    }

    public final void A0K() {
        List<C63406Sjd> list;
        BaseCheckoutItem baseCheckoutItem;
        C58252li c58252li = this.A09;
        C63406Sjd c63406Sjd = (C63406Sjd) c58252li.A02();
        if (c63406Sjd != null && (list = (List) c63406Sjd.A01) != null) {
            ArrayList A0q = AbstractC167017dG.A0q(list);
            for (C63406Sjd c63406Sjd2 : list) {
                Object obj = c63406Sjd2.A01;
                if (obj != null) {
                    baseCheckoutItem = (BaseCheckoutItem) obj;
                    C14360o3.A0B(baseCheckoutItem, 0);
                    if (baseCheckoutItem instanceof SelectionPaymentMethodItem) {
                        SelectionPaymentMethodItem selectionPaymentMethodItem = (SelectionPaymentMethodItem) baseCheckoutItem;
                        if (this.A0I.get(selectionPaymentMethodItem.A0F) == null) {
                            selectionPaymentMethodItem.A02 = null;
                        }
                        A06(selectionPaymentMethodItem, this);
                    }
                } else {
                    baseCheckoutItem = null;
                }
                A0q.add(C63406Sjd.A02(c63406Sjd2, baseCheckoutItem));
            }
            Object A02 = c58252li.A02();
            if (A02 != null) {
                c58252li.A0B(C63406Sjd.A02((C63406Sjd) A02, A0q));
                return;
            }
            throw AbstractC166997dE.A0g();
        }
    }

    public final void A0M(PaymentMethod paymentMethod) {
        SelectionPaymentMethodItem selectionPaymentMethodItem;
        List list;
        Object obj;
        String str;
        String str2;
        SelectionPaymentMethodItem selectionPaymentMethodItem2;
        C63406Sjd c63406Sjd = (C63406Sjd) this.A09.A02();
        BaseCheckoutItem baseCheckoutItem = null;
        if (c63406Sjd != null && (list = (List) c63406Sjd.A01) != null) {
            Iterator it = list.iterator();
            while (true) {
                if (it.hasNext()) {
                    obj = it.next();
                    Object obj2 = ((C63406Sjd) obj).A01;
                    if ((obj2 instanceof SelectionPaymentMethodItem) && (selectionPaymentMethodItem2 = (SelectionPaymentMethodItem) obj2) != null) {
                        str = selectionPaymentMethodItem2.A0F;
                    } else {
                        str = null;
                    }
                    if (paymentMethod != null) {
                        str2 = paymentMethod.AtA();
                    } else {
                        str2 = null;
                    }
                    if (C14360o3.A0K(str, str2)) {
                        break;
                    }
                } else {
                    obj = null;
                    break;
                }
            }
            C63406Sjd c63406Sjd2 = (C63406Sjd) obj;
            if (c63406Sjd2 != null) {
                baseCheckoutItem = (BaseCheckoutItem) c63406Sjd2.A01;
            }
        }
        if ((baseCheckoutItem instanceof SelectionPaymentMethodItem) && (selectionPaymentMethodItem = (SelectionPaymentMethodItem) baseCheckoutItem) != null) {
            selectionPaymentMethodItem.A07 = true;
        }
    }

    public final boolean A0N() {
        PaymentMethod paymentMethod;
        CreditCard creditCard;
        C69074VhP c69074VhP;
        Map map = this.A0J;
        C63406Sjd c63406Sjd = (C63406Sjd) this.A08.A02();
        String str = null;
        if (c63406Sjd != null && (c69074VhP = (C69074VhP) c63406Sjd.A01) != null) {
            paymentMethod = (PaymentMethod) c69074VhP.A01;
        } else {
            paymentMethod = null;
        }
        if ((paymentMethod instanceof CreditCard) && (creditCard = (CreditCard) paymentMethod) != null) {
            str = creditCard.AtA();
        }
        return AbstractC167007dF.A1W(map.get(str));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0054  */
    @Override // X.InterfaceC71988XEb
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void AGw(android.os.Bundle r19, android.view.ContextThemeWrapper r20, androidx.fragment.app.Fragment r21, X.C63406Sjd r22) {
        /*
            Method dump skipped, instructions count: 318
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C66392UFd.AGw(android.os.Bundle, android.view.ContextThemeWrapper, androidx.fragment.app.Fragment, X.Sjd):void");
    }

    @Override // X.InterfaceC71988XEb
    public final void ARF(Bundle bundle, ContextThemeWrapper contextThemeWrapper, Fragment fragment, C63406Sjd c63406Sjd) {
        BaseCheckoutItem baseCheckoutItem = (BaseCheckoutItem) c63406Sjd.A01;
        if (baseCheckoutItem != null) {
            A04(bundle, fragment, (SelectionPaymentMethodItem) baseCheckoutItem);
        }
    }

    @Override // X.InterfaceC71988XEb
    public final C2GS Aup() {
        return this.A0C;
    }

    @Override // X.InterfaceC71988XEb
    public final void EJu() {
        C2GS c2gs = this.A0C;
        if (c2gs.A02() != EnumC68138VCz.A04) {
            c2gs.A0B(A0N);
            A0K();
        }
    }

    @Override // X.InterfaceC71988XEb
    public final C2GT EMy() {
        return this.A09;
    }

    @Override // X.InterfaceC71988XEb
    public final boolean EiA() {
        C69074VhP c69074VhP;
        PaymentMethod paymentMethod;
        String AtA;
        SelectionPaymentMethodItem selectionPaymentMethodItem;
        List list;
        Object obj;
        String str;
        SelectionPaymentMethodItem selectionPaymentMethodItem2;
        C63406Sjd c63406Sjd = (C63406Sjd) this.A0E.A02();
        if (c63406Sjd == null || (c69074VhP = (C69074VhP) c63406Sjd.A01) == null || (paymentMethod = (PaymentMethod) c69074VhP.A01) == null || (AtA = paymentMethod.AtA()) == null) {
            return true;
        }
        C63406Sjd c63406Sjd2 = (C63406Sjd) this.A09.A02();
        BaseCheckoutItem baseCheckoutItem = null;
        if (c63406Sjd2 != null && (list = (List) c63406Sjd2.A01) != null) {
            Iterator it = list.iterator();
            while (true) {
                if (it.hasNext()) {
                    obj = it.next();
                    Object obj2 = ((C63406Sjd) obj).A01;
                    if ((obj2 instanceof SelectionPaymentMethodItem) && (selectionPaymentMethodItem2 = (SelectionPaymentMethodItem) obj2) != null) {
                        str = selectionPaymentMethodItem2.A0F;
                    } else {
                        str = null;
                    }
                    if (C14360o3.A0K(str, AtA)) {
                        break;
                    }
                } else {
                    obj = null;
                    break;
                }
            }
            C63406Sjd c63406Sjd3 = (C63406Sjd) obj;
            if (c63406Sjd3 != null) {
                baseCheckoutItem = (BaseCheckoutItem) c63406Sjd3.A01;
            }
        }
        if (!(baseCheckoutItem instanceof SelectionPaymentMethodItem) || (selectionPaymentMethodItem = (SelectionPaymentMethodItem) baseCheckoutItem) == null || !selectionPaymentMethodItem.A07 || this.A0J.containsKey(AtA)) {
            return true;
        }
        return false;
    }

    @Override // X.InterfaceC71988XEb
    public final void Epg() {
        C2GS c2gs = this.A0C;
        EnumC68138VCz enumC68138VCz = (EnumC68138VCz) c2gs.A02();
        if (enumC68138VCz != null) {
            int ordinal = enumC68138VCz.ordinal();
            if (ordinal != 1) {
                if (ordinal == 2) {
                    enumC68138VCz = EnumC68138VCz.A03;
                }
            } else {
                enumC68138VCz = EnumC68138VCz.A05;
            }
            c2gs.A0B(enumC68138VCz);
        }
        A0K();
    }

    @Override // X.InterfaceC71988XEb
    public final void FBD(SparseArray sparseArray) {
        if (sparseArray != null) {
            this.A00 = sparseArray;
        }
    }

    /* JADX WARN: Type inference failed for: r0v10, types: [X.2GT, X.2GS] */
    public C66392UFd(UFS ufs) {
        this.A0G = ufs;
        C2GS c2gs = new C2GS();
        this.A0E = c2gs;
        C58252li c58252li = new C58252li();
        this.A09 = c58252li;
        this.A0B = new C2GS();
        this.A0L = new C2GS();
        this.A0A = new C2GS();
        this.A0I = new LinkedHashMap();
        C58252li c58252li2 = new C58252li();
        C63406Sjd.A0D(c58252li2, null);
        this.A08 = c58252li2;
        this.A0C = new C2GT(A0N);
        this.A0F = new C70303WQi(this, 12);
        C70303WQi c70303WQi = new C70303WQi(this, 13);
        this.A0M = c70303WQi;
        this.A0J = new LinkedHashMap();
        this.A00 = new SparseArray();
        c58252li2.A0E(c2gs, c70303WQi);
        c58252li.A0E(c2gs, c70303WQi);
    }

    private final void A07(EnumC72407Xcu enumC72407Xcu, String str) {
        Map linkedHashMap;
        Wap wap = C2FP.A01().A03;
        LoggingContext loggingContext = this.A03;
        if (loggingContext == null) {
            C14360o3.A0F("loggingContext");
            throw C00O.createAndThrow();
        }
        C70073W1q A05 = this.A0G.A05();
        LinkedHashMap A0o = AbstractC65702TsY.A0o(loggingContext);
        A0o.put("TARGET_NAME", str);
        A0o.put("CREDENTIAL_TYPE", enumC72407Xcu);
        Object obj = A0o.get("extra_data");
        if (!(obj instanceof Map) || (((obj instanceof InterfaceC15590qF) && !(obj instanceof InterfaceC16540rz)) || (linkedHashMap = (Map) obj) == null)) {
            linkedHashMap = new LinkedHashMap();
        }
        C70199WGm.A08(A05, linkedHashMap);
        A0o.put("extra_data", linkedHashMap);
        ImmutableMap copyOf = ImmutableMap.copyOf((Map) A0o);
        C14360o3.A07(copyOf);
        wap.Chz(AbstractC58317Pt9.A00(385), copyOf);
    }

    private final void A0A(List list, List list2, List list3) {
        if (list3.isEmpty()) {
            list.addAll(list2);
            return;
        }
        Integer num = C05F.A00;
        VG3 vg3 = VG3.A0p;
        list.add(C63406Sjd.A04(new SelectionHeaderItem(vg3, 2131961324, num, null, null)));
        list.addAll(list2);
        list.add(C63406Sjd.A04(new SelectionHeaderItem(vg3, 2131961557, num, null, null)));
        list.addAll(list3);
    }
}
