package X;

import android.content.Context;
import android.util.SparseArray;
import com.facebook.graphql.calls.GraphQlCallInput;
import com.facebookpay.logging.LoggingContext;
import com.facebookpay.otc.models.OtcInput;
import com.facebookpay.paymentmethod.model.CreditCard;
import com.facebookpay.paymentmethod.model.PaymentMethod;
import com.google.common.collect.ImmutableList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes10.dex */
public final class T2N implements InterfaceC65504TlY {
    public static final C63287Sgm A05 = new Object();
    public final Context A01;
    public final C62643SKa A02 = new C62643SKa();
    public final SKb A03 = new SKb();
    public String A00 = "LIVE";
    public final C62985Sa9 A04 = new C62985Sa9();

    public static final C58252li A01(C63019Saj c63019Saj, LoggingContext loggingContext, T2N t2n, String str) {
        C70073W1q c70073W1q;
        t2n.A0A(AbstractC62191S1m.A00(c63019Saj));
        Wap A0H = AbstractC43592JPx.A0H();
        List A1J = AbstractC166987dD.A1J(EnumC129485tD.A0D);
        String str2 = c63019Saj.A09;
        boolean A0K = C14360o3.A0K(str2, "PRE_WARM");
        OtcInput otcInput = c63019Saj.A04;
        if (otcInput != null) {
            c70073W1q = AbstractC63060Sbh.A01(otcInput);
        } else {
            c70073W1q = null;
        }
        A0H.A0U(loggingContext, str2, A1J, AbstractC58320PtC.A1B(c70073W1q), A0K);
        c63019Saj.A01(ImmutableList.of((Object) "PAYMENT_METHOD"));
        REQ req = new REQ(C2FP.A06(), c63019Saj, t2n, str, 0);
        AbstractC63144Sdq.A02(req);
        Q8J q8j = ((AbstractC63144Sdq) req).A03;
        C58252li A0J = AbstractC58322PtE.A0J(AbstractC62191S1m.A00(c63019Saj), t2n);
        String str3 = t2n.A00;
        String str4 = c63019Saj.A0B;
        if (!C14360o3.A0K(str3, str4) || (C2FP.A0D().A02() && A0J.A02() == null)) {
            t2n.A00 = str4;
            C63406Sjd.A0D(t2n.A04.A01(C63406Sjd.A03(null), AbstractC62191S1m.A00(c63019Saj)), null);
        }
        C14360o3.A0A(q8j);
        AbstractC63246Sg0.A02(q8j, A0J, new C63626SqY(A0J, c63019Saj, loggingContext, 6));
        return A0J;
    }

    public static final REZ A02(R0L r0l) {
        R1X A0E;
        R0H A0E2;
        R1N A0E3;
        R0O A0F;
        QWW A0L;
        if (r0l == null || (A0E = r0l.A0E()) == null || (A0E2 = A0E.A0E()) == null || (A0E3 = A0E2.A0E()) == null || (A0F = A0E3.A0F()) == null || (A0L = AbstractC58322PtE.A0L(A0F)) == null) {
            return null;
        }
        return AbstractC63238Sfs.A03(A0L);
    }

    public static final C63406Sjd A03(QRL qrl, boolean z) {
        String str;
        String str2;
        String str3;
        if (qrl != null) {
            str = qrl.getTypeName();
        } else {
            str = null;
        }
        if (!C14360o3.A0K(str, "ECPPrewarmCard")) {
            if (qrl != null) {
                str2 = qrl.getTypeName();
            } else {
                str2 = null;
            }
            if (!C14360o3.A0K(str2, "ExternalCreditCard")) {
                if (qrl != null) {
                    str3 = qrl.getTypeName();
                } else {
                    str3 = null;
                }
                if (!C14360o3.A0K(str3, "CreditCard")) {
                    return null;
                }
            }
        }
        return C63406Sjd.A04(new CreditCard(qrl, true, z));
    }

    public final void A08(SparseArray sparseArray, C62735SOb c62735SOb, C63406Sjd c63406Sjd) {
        Object obj;
        PaymentMethod paymentMethod;
        int size;
        C70126W5l c70126W5l;
        boolean A1V = AbstractC167007dF.A1V(c63406Sjd);
        C58252li A0J = AbstractC58322PtE.A0J(c62735SOb, this);
        if (C63406Sjd.A0J(c63406Sjd) && (obj = c63406Sjd.A01) != null && C63406Sjd.A0F(A0J)) {
            obj.getClass();
            R0N A0E = ((R1N) obj).A0E();
            QRL qrl = null;
            if (A0E != null) {
                qrl = A0E.A0E();
            }
            int i = 0;
            C63406Sjd A03 = A03(qrl, false);
            if (A03 != null && (paymentMethod = (PaymentMethod) A03.A01) != null) {
                C70126W5l c70126W5l2 = (C70126W5l) C63406Sjd.A07(A0J);
                List list = c70126W5l2.A02;
                C2J7 c2j7 = C2J8.A04;
                if (C2J8.A06 != null) {
                    c2j7.A02().A02(paymentMethod.AtA(), C63287Sgm.A02(sparseArray), "ECP");
                }
                C63406Sjd A0S = AbstractC58318PtA.A0S(A0J);
                if (A0S != null && (c70126W5l = (C70126W5l) A0S.A01) != null && c70126W5l.A08 == A1V) {
                    Iterator it = list.iterator();
                    size = 0;
                    while (true) {
                        if (it.hasNext()) {
                            Object obj2 = ((C63406Sjd) it.next()).A01;
                            if (obj2 instanceof CreditCard) {
                                C14360o3.A0C(obj2, "null cannot be cast to non-null type com.facebookpay.paymentmethod.model.CreditCard");
                                if (((CreditCard) obj2).A00() == EnumC61212RhC.CREDIT_CARD) {
                                    break;
                                }
                            }
                            size++;
                        } else {
                            size = -1;
                            break;
                        }
                    }
                    if (((CreditCard) paymentMethod).A00() != EnumC61212RhC.DEBIT_CARD) {
                        i = size;
                        size = AbstractC31172DnG.A03(list, size);
                    }
                } else {
                    size = list.size();
                }
                if (size != 0) {
                    i++;
                }
                C63406Sjd.A0C(A0J, C70126W5l.A00(c70126W5l2, paymentMethod.AtA(), AbstractC63058Sbf.A02(A03, list, C65087TdK.A00, i), 990));
            }
        }
    }

    public final synchronized void A0A(C62735SOb c62735SOb) {
        C63406Sjd c63406Sjd;
        C58252li A0J = AbstractC58322PtE.A0J(c62735SOb, this);
        C63406Sjd A0S = AbstractC58318PtA.A0S(A0J);
        if (A0S != null) {
            c63406Sjd = C63406Sjd.A01(C63569Spc.A00, A0S);
        } else {
            c63406Sjd = null;
        }
        A0J.A0B(c63406Sjd);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0042, code lost:
    
        if (r6 == (-1)) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0044, code lost:
    
        r6 = 0;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A0B(X.C62735SOb r12, X.C63406Sjd r13, java.lang.String r14) {
        /*
            r11 = this;
            r8 = 0
            r9 = 1
            X.AbstractC167007dF.A1D(r13, r9, r14)
            X.2li r5 = X.AbstractC58322PtE.A0J(r12, r11)
            java.lang.Object r0 = X.C63406Sjd.A07(r5)
            X.W5l r0 = (X.C70126W5l) r0
            java.util.List r7 = r0.A02
            java.lang.Object r4 = X.C63406Sjd.A07(r5)
            X.W5l r4 = (X.C70126W5l) r4
            X.Sjd r0 = X.AbstractC58318PtA.A0S(r5)
            if (r0 == 0) goto Led
            java.lang.Object r0 = r0.A01
            X.W5l r0 = (X.C70126W5l) r0
            if (r0 == 0) goto Led
            boolean r0 = r0.A08
            if (r0 != r9) goto Led
            java.util.ListIterator r2 = X.AbstractC43592JPx.A14(r7)
        L2b:
            boolean r0 = r2.hasPrevious()
            r1 = -1
            if (r0 == 0) goto L44
            java.lang.Object r0 = r2.previous()
            X.Sjd r0 = (X.C63406Sjd) r0
            java.lang.Object r0 = r0.A01
            boolean r0 = r0 instanceof com.facebookpay.paymentmethod.model.PayPalCredential
            if (r0 == 0) goto L2b
            int r6 = r2.nextIndex()
            if (r6 != r1) goto L45
        L44:
            r6 = 0
        L45:
            boolean r0 = X.C63406Sjd.A0J(r13)
            if (r0 == 0) goto L8a
            java.lang.Object r0 = X.C63406Sjd.A08(r13)
            X.R1N r0 = (X.R1N) r0
            X.R0N r10 = r0.A0E()
            if (r10 == 0) goto L89
            java.lang.Class<X.QWM> r3 = X.QWM.class
            r2 = 3
            java.lang.String r1 = "PAYPaymentPaypalBillingAgreement"
            r0 = -1188209066(0xffffffffb92d5e56, float:-1.6533709E-4)
            X.2JS r3 = r10.reinterpretIfFulfillsType(r2, r1, r3, r0)
            X.QWM r3 = (X.QWM) r3
            if (r3 == 0) goto L89
            r1 = 0
            com.facebookpay.paymentmethod.model.PayPalCredential r0 = new com.facebookpay.paymentmethod.model.PayPalCredential
            r0.<init>(r3, r1, r9)
            X.Sjd r1 = X.C63406Sjd.A04(r0)
            X.DS0 r0 = new X.DS0
            r0.<init>(r14, r8)
            java.util.List r2 = X.AbstractC63058Sbf.A02(r1, r7, r0, r6)
            java.lang.String r0 = "credential_id"
            java.lang.String r1 = r3.getOptionalStringField(r8, r0)
            r0 = 990(0x3de, float:1.387E-42)
        L82:
            X.W5l r0 = X.C70126W5l.A00(r4, r1, r2, r0)
        L86:
            X.C63406Sjd.A0C(r5, r0)
        L89:
            return
        L8a:
            boolean r0 = X.C63406Sjd.A0G(r13)
            if (r0 == 0) goto L9a
            X.TdL r0 = X.C65088TdL.A00
            java.util.List r2 = X.AbstractC63058Sbf.A01(r14, r7, r0)
            r1 = 0
            r0 = 1022(0x3fe, float:1.432E-42)
            goto L82
        L9a:
            boolean r0 = X.C63406Sjd.A0H(r13)
            if (r0 == 0) goto L89
            java.util.Iterator r9 = r7.iterator()
        La4:
            boolean r0 = r9.hasNext()
            r3 = 0
            if (r0 == 0) goto Lca
            java.lang.Object r2 = r9.next()
            r1 = r2
            X.Sjd r1 = (X.C63406Sjd) r1
            boolean r0 = X.C63406Sjd.A0H(r1)
            if (r0 == 0) goto La4
            java.lang.Object r0 = r1.A01
            com.facebookpay.paymentmethod.model.PaymentMethod r0 = (com.facebookpay.paymentmethod.model.PaymentMethod) r0
            if (r0 == 0) goto Lc2
            java.lang.String r3 = r0.AtA()
        Lc2:
            boolean r0 = X.C14360o3.A0K(r3, r14)
            if (r0 == 0) goto La4
            if (r2 != 0) goto L89
        Lca:
            r3 = 0
            com.facebookpay.paymentmethod.model.PayPalCredential r0 = new com.facebookpay.paymentmethod.model.PayPalCredential
            r0.<init>(r3, r14, r8)
            X.Sjd r2 = X.C63406Sjd.A03(r0)
            java.util.ArrayList r1 = X.AbstractC166987dD.A1F(r7)
            int r0 = r7.size()
            if (r6 <= r0) goto Ldf
            r6 = 0
        Ldf:
            r1.add(r6, r2)
            java.util.List r1 = X.AbstractC001800i.A0a(r1)
            r0 = 1022(0x3fe, float:1.432E-42)
            X.W5l r0 = X.C70126W5l.A00(r4, r3, r1, r0)
            goto L86
        Led:
            int r6 = r7.size()
            goto L45
        */
        throw new UnsupportedOperationException("Method not decompiled: X.T2N.A0B(X.SOb, X.Sjd, java.lang.String):void");
    }

    @Override // X.InterfaceC65504TlY
    public final C2GT AOg(SparseArray sparseArray, LoggingContext loggingContext, OtcInput otcInput, OtcInput otcInput2, String str, String str2, String str3, int i) {
        String str4;
        Object obj = sparseArray.get(12);
        if (!(obj instanceof String) || (str4 = (String) obj) == null) {
            str4 = "";
        }
        C58252li A00 = A00(null, loggingContext, otcInput, null, str, str2, str3, "DELETE", str4, null, i);
        C58252li A0J = AbstractC58322PtE.A0J(new C62735SOb(otcInput, str2), this);
        AbstractC58321PtD.A1D(A00, A0J, new MI7(A0J, A00, str4, 5), 26);
        return A00;
    }

    private final C58252li A00(C2JO c2jo, LoggingContext loggingContext, OtcInput otcInput, C62748SOx c62748SOx, String str, String str2, String str3, String str4, String str5, String str6, int i) {
        String str7;
        String str8;
        AbstractC63144Sdq rev;
        C70073W1q c70073W1q = null;
        if (str4.equals("CREATE")) {
            str7 = "pux_checkout";
        } else {
            str7 = null;
        }
        C70199WGm c70199WGm = AbstractC62321S6r.A00;
        C0Zx c0Zx = new C0Zx();
        c0Zx.A01(AbstractC58323PtF.A0L(c0Zx, "credentials", str4), "mutation_type");
        List A1J = AbstractC166987dD.A1J(c0Zx);
        if (otcInput != null) {
            c70073W1q = AbstractC63060Sbh.A01(otcInput);
        }
        c70199WGm.A0F(loggingContext, c70073W1q, str4, str7, A1J, true);
        C04060Jx c04060Jx = GraphQlCallInput.A02;
        C0CA A0T = AbstractC25227BEk.A0T(c04060Jx, str5, "credential_id");
        C0CA.A00(A0T, str4, "mutation_type");
        if (c2jo != null) {
            A0T.A0E(c2jo.A02(), "save_credential_input");
        }
        if (i == 7) {
            if (str4.equals("CREATE") && str6 != null) {
                A0T.A0E(AbstractC25227BEk.A0T(c04060Jx, str6, "ba_token"), "complete_paypal_ba_linking_input");
            }
            str8 = "PAYPAL_BA";
        } else {
            str8 = "CREDIT_CARD";
        }
        C0CA.A00(A0T, str8, "credential_type");
        Be9 A0M = AbstractC58323PtF.A0M(str, str2, str3);
        AbstractC31173DnH.A1M(A0T, A0M, "credential_input");
        AbstractC63060Sbh.A02(A0M, otcInput);
        if (c62748SOx != null) {
            rev = AbstractC62184S1f.A00(this.A01, new C62734SOa(c62748SOx.A01, c62748SOx.A02), new MI7(this, A0M, str2, 4), C65055Tck.A00, new X58(this, 3));
        } else {
            rev = new REV(C2FP.A06(), new C63581Spo(this, 5), new C63582Spp(A0M, this, str2, 4), 1);
        }
        AbstractC63144Sdq.A02(rev);
        return C75M.A01(rev.A03, new C50371MLy(otcInput, loggingContext, str7, str4, 13));
    }

    public final C58252li A06(C63019Saj c63019Saj, LoggingContext loggingContext) {
        String str;
        String str2 = this.A00;
        String str3 = c63019Saj.A0B;
        boolean z = !C14360o3.A0K(str2, str3);
        C62735SOb A00 = AbstractC62191S1m.A00(c63019Saj);
        C62985Sa9 c62985Sa9 = this.A04;
        C58252li A03 = c62985Sa9.A03(A00);
        if (z || A03 == null) {
            if (!C2FP.A0D().A02()) {
                this.A00 = str3;
                C63406Sjd.A0D(c62985Sa9.A01(C63406Sjd.A03(null), A00), null);
            }
            if (A03 != null) {
                if (z) {
                    str = "PERSISTENT_UP_TO_DATE";
                }
            } else {
                str = "NETWORK_ONLY";
            }
            A01(c63019Saj, loggingContext, this, str);
        }
        return A05(A00);
    }

    public final void A09(C62735SOb c62735SOb) {
        C63406Sjd A01;
        OtcInput otcInput = c62735SOb.A00;
        C62985Sa9 c62985Sa9 = this.A04;
        if (otcInput != null) {
            c62985Sa9.A00.remove(c62735SOb);
            return;
        }
        if (!c62985Sa9.A00.containsKey(c62735SOb)) {
            return;
        }
        C58252li A02 = c62985Sa9.A02(c62735SOb);
        if (C63406Sjd.A0G(AbstractC58318PtA.A0S(A02))) {
            A01 = C63406Sjd.A03(null);
        } else {
            if (!C63406Sjd.A0F(A02)) {
                return;
            }
            A01 = C63406Sjd.A01(C63570Spd.A00, AbstractC58318PtA.A0S(A02));
        }
        A02.A0B(A01);
    }

    @Override // X.InterfaceC65504TlY
    public final C58252li ENq(SparseArray sparseArray, LoggingContext loggingContext, OtcInput otcInput, OtcInput otcInput2, String str, String str2, String str3, int i) {
        String str4;
        C62748SOx A03;
        String str5;
        AbstractC167017dG.A1P(str, str2);
        AbstractC167007dF.A1G(str3, 3, loggingContext);
        String A00 = AbstractC62187S1i.A00(sparseArray, 12);
        C63287Sgm c63287Sgm = A05;
        if (A00.length() != 0 && otcInput == null) {
            str4 = "UPDATE";
        } else {
            str4 = "CREATE";
        }
        String valueOf = String.valueOf(AbstractC62320S6q.A00.getAndIncrement());
        C2JO c2jo = null;
        if (i != 3) {
            if (i == 7) {
                str5 = AbstractC62187S1i.A00(sparseArray, 32);
                A03 = null;
            } else {
                throw AbstractC43592JPx.A11();
            }
        } else {
            A03 = c63287Sgm.A03(this.A01, sparseArray, otcInput, str3);
            str5 = null;
            c2jo = A03.A00;
        }
        C58252li A002 = A00(c2jo, loggingContext, otcInput, A03, str, str2, str3, str4, A00, str5, i);
        C62735SOb c62735SOb = new C62735SOb(otcInput, str2);
        C58252li A0J = AbstractC58322PtE.A0J(c62735SOb, this);
        AbstractC58321PtD.A1D(A002, A0J, new C65030TcG(sparseArray, A002, A0J, c62735SOb, otcInput, this, str4, valueOf, i), 26);
        return C75M.A01(A002, C65056Tcl.A00);
    }

    public T2N(Context context) {
        this.A01 = context;
    }

    /* JADX WARN: Removed duplicated region for block: B:47:0x0073 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0043 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.util.ArrayList A04(java.util.List r13) {
        /*
            Method dump skipped, instructions count: 277
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.T2N.A04(java.util.List):java.util.ArrayList");
    }

    public final C58252li A05(C62735SOb c62735SOb) {
        boolean A02 = C2FP.A0D().A02();
        C63406Sjd c63406Sjd = null;
        C62985Sa9 c62985Sa9 = this.A04;
        if (!A02) {
            c63406Sjd = C63406Sjd.A03(null);
        }
        return c62985Sa9.A01(c63406Sjd, c62735SOb);
    }

    public final C63406Sjd A07(C62735SOb c62735SOb) {
        C70126W5l c70126W5l;
        C63406Sjd A0S = AbstractC58318PtA.A0S(A05(c62735SOb));
        if (A0S != null && (c70126W5l = (C70126W5l) A0S.A01) != null) {
            return (C63406Sjd) AbstractC001800i.A0J(c70126W5l.A02);
        }
        return null;
    }

    public final boolean A0C(C62735SOb c62735SOb, VDW vdw) {
        C70126W5l c70126W5l;
        C70126W5l c70126W5l2;
        C63406Sjd A0S = AbstractC58318PtA.A0S(A05(c62735SOb));
        if (vdw == null) {
            if (A0S != null && (c70126W5l2 = (C70126W5l) A0S.A01) != null && AbstractC166987dD.A1b(c70126W5l2.A02)) {
                return true;
            }
            return false;
        }
        if (A0S != null && (c70126W5l = (C70126W5l) A0S.A01) != null) {
            List list = c70126W5l.A02;
            if ((list instanceof Collection) && list.isEmpty()) {
                return false;
            }
            Iterator it = list.iterator();
            while (it.hasNext()) {
                Object obj = ((C63406Sjd) it.next()).A01;
                if (obj != null && AbstractC13230m9.A02(((C0YZ) vdw.A00).A00, obj)) {
                    return true;
                }
            }
            return false;
        }
        return false;
    }
}
