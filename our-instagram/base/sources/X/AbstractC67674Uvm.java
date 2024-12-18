package X;

import com.facebookpay.form.cell.logging.FormCellLoggingEvents;
import com.facebookpay.form.view.FormLayout;
import com.facebookpay.logging.LoggingContext;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;

/* renamed from: X.Uvm, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public abstract class AbstractC67674Uvm extends AbstractC68233VIt {
    public List A00 = C16930sl.A00;

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0021, code lost:
    
        if (r3 != null) goto L12;
     */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0025  */
    /* JADX WARN: Type inference failed for: r3v3, types: [java.lang.Object, X.Uvl] */
    /* JADX WARN: Type inference failed for: r3v5, types: [X.Uvm, X.Uvj] */
    /* JADX WARN: Type inference failed for: r3v9, types: [X.Uvm, X.Uvi] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void A00(android.view.View r5, java.util.List r6) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof X.Uvq
            if (r0 == 0) goto L44
            r2 = r5
            X.Uvq r2 = (X.Uvq) r2
            X.5t8 r1 = r2.A00
            boolean r0 = r1 instanceof X.UvP
            if (r0 == 0) goto L2e
            boolean r0 = r4 instanceof X.C67672Uvk
            if (r0 == 0) goto L42
            X.Uvi r3 = new X.Uvi
            r3.<init>()
            java.util.Map r0 = X.C67672Uvk.A02
            r3.A00 = r2
            r3.A01 = r0
        L1c:
            r3.A03(r2)
        L1f:
            X.5t8 r1 = r2.A00
            if (r3 == 0) goto Lbf
        L23:
            if (r1 == 0) goto Lbf
            X.0e4 r0 = new X.0e4
            r0.<init>(r3, r1)
            r6.add(r0)
        L2d:
            return
        L2e:
            boolean r0 = r1 instanceof X.UvO
            if (r0 == 0) goto L44
            boolean r0 = r4 instanceof X.C67672Uvk
            if (r0 == 0) goto L42
            X.Uvj r3 = new X.Uvj
            r3.<init>()
            java.util.List r0 = X.C67672Uvk.A01
            r3.A00 = r2
            r3.A01 = r0
            goto L1c
        L42:
            r3 = 0
            goto L1f
        L44:
            boolean r0 = r5 instanceof X.C67677Uvp
            if (r0 == 0) goto Lbf
            r2 = r5
            X.Uvp r2 = (X.C67677Uvp) r2
            r3 = r4
            boolean r0 = r4 instanceof X.C67672Uvk
            if (r0 == 0) goto L66
            r0 = 0
            X.C14360o3.A0B(r2, r0)
        L54:
            X.Uvl r3 = new X.Uvl
            r3.<init>()
            r3.A00 = r2
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r3.A01 = r0
            X.UvM r1 = r2.getViewModel()
            goto L23
        L66:
            boolean r0 = r4 instanceof X.C67671Uvj
            if (r0 == 0) goto L7e
            X.Uvj r3 = (X.C67671Uvj) r3
            r0 = 0
            X.C14360o3.A0B(r2, r0)
            java.util.List r1 = r3.A01
            if (r1 != 0) goto L9f
            java.lang.String r0 = "autoFocusFields"
        L76:
            X.C14360o3.A0F(r0)
            X.00O r0 = X.C00O.createAndThrow()
            throw r0
        L7e:
            X.Uvi r3 = (X.C67670Uvi) r3
            r0 = 0
            X.C14360o3.A0B(r2, r0)
            X.Uvq r0 = r3.A00
            if (r0 != 0) goto L8b
            java.lang.String r0 = "view"
            goto L76
        L8b:
            X.5t8 r1 = r0.A00
            java.lang.String r0 = "null cannot be cast to non-null type com.facebookpay.form.cell.address.AddressCellViewModel"
            X.C14360o3.A0C(r1, r0)
            X.UvP r1 = (X.UvP) r1
            com.facebook.common.locale.Country r1 = r1.A0M()
            java.util.Map r0 = r3.A01
            if (r0 != 0) goto Laa
            java.lang.String r0 = "autoFocusFieldsByCountry"
            goto L76
        L9f:
            X.UvM r0 = r2.getViewModel()
            int r0 = r0.A02
            boolean r0 = X.AbstractC31175DnJ.A1U(r0, r1)
            goto L54
        Laa:
            java.lang.Object r1 = r0.get(r1)
            java.util.List r1 = (java.util.List) r1
            if (r1 == 0) goto Lbd
            X.UvM r0 = r2.getViewModel()
            int r0 = r0.A02
            boolean r0 = X.AbstractC31175DnJ.A1U(r0, r1)
            goto L54
        Lbd:
            r0 = 0
            goto L54
        Lbf:
            boolean r0 = r5 instanceof android.view.ViewGroup
            if (r0 == 0) goto L2d
            r2 = 0
            android.view.ViewGroup r5 = (android.view.ViewGroup) r5
            int r1 = r5.getChildCount()
        Lca:
            if (r2 >= r1) goto L2d
            android.view.View r0 = r5.getChildAt(r2)
            r4.A00(r0, r6)
            int r2 = r2 + 1
            goto Lca
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC67674Uvm.A00(android.view.View, java.util.List):void");
    }

    public static final void A01(AbstractC67674Uvm abstractC67674Uvm, FormLayout formLayout) {
        C67677Uvp c67677Uvp;
        Iterator it = abstractC67674Uvm.A00.iterator();
        while (it.hasNext()) {
            AbstractC68233VIt abstractC68233VIt = (AbstractC68233VIt) ((C09530e4) it.next()).A00;
            if (abstractC68233VIt instanceof C67673Uvl) {
                C67673Uvl c67673Uvl = (C67673Uvl) abstractC68233VIt;
                c67673Uvl.A02 = null;
                AbstractC31177DnL.A1b(c67673Uvl.A01);
            } else {
                abstractC68233VIt.A00 = null;
            }
        }
        ArrayList arrayList = new ArrayList();
        abstractC67674Uvm.A00(formLayout, arrayList);
        List A0a = AbstractC001800i.A0a(arrayList);
        abstractC67674Uvm.A00 = A0a;
        int size = A0a.size();
        for (int i = 0; i < size; i++) {
            AbstractC68233VIt abstractC68233VIt2 = (AbstractC68233VIt) ((C09530e4) abstractC67674Uvm.A00.get(i)).A00;
            DHO dho = new DHO(i, 5, abstractC67674Uvm);
            if (abstractC68233VIt2 instanceof C67673Uvl) {
                C67673Uvl c67673Uvl2 = (C67673Uvl) abstractC68233VIt2;
                c67673Uvl2.A02 = dho;
                if (AbstractC31177DnL.A1b(c67673Uvl2.A01) && (c67677Uvp = c67673Uvl2.A00) != null) {
                    c67677Uvp.getViewModel().A01 = dho;
                }
            } else {
                abstractC68233VIt2.A00 = dho;
            }
        }
    }

    public static final void A02(AbstractC67674Uvm abstractC67674Uvm, String str, int i) {
        W4G w4g;
        if (i < abstractC67674Uvm.A00.size()) {
            C09530e4 c09530e4 = (C09530e4) abstractC67674Uvm.A00.get(i);
            AbstractC68233VIt abstractC68233VIt = (AbstractC68233VIt) c09530e4.A00;
            if (((AbstractC129435t5) c09530e4.A01).A0E()) {
                if (abstractC68233VIt instanceof C67673Uvl) {
                    C67677Uvp c67677Uvp = ((C67673Uvl) abstractC68233VIt).A00;
                    if (c67677Uvp != null) {
                        UvM viewModel = c67677Uvp.getViewModel();
                        MSX.A1B(viewModel.A0A, true);
                        FormCellLoggingEvents formCellLoggingEvents = ((AbstractC129435t5) viewModel).A01;
                        if (formCellLoggingEvents != null && (w4g = ((AbstractC129435t5) viewModel).A00) != null) {
                            String str2 = formCellLoggingEvents.A00.A03;
                            Wap wap = C2FP.A01().A04;
                            LoggingContext loggingContext = w4g.A00;
                            LinkedHashMap A01 = UFS.A01(w4g.A01);
                            C14360o3.A0B(loggingContext, 0);
                            Wap.A03(new C25531Mh(MSY.A0H(wap.A00, "client_focus_autoadvance_atomic"), 41), loggingContext, new C50371MLy(loggingContext, A01, str, str2, 5));
                            return;
                        }
                        return;
                    }
                    return;
                }
                A02((AbstractC67674Uvm) abstractC68233VIt, str, 0);
                return;
            }
            return;
        }
        InterfaceC16660sJ interfaceC16660sJ = ((AbstractC68233VIt) abstractC67674Uvm).A00;
        if (interfaceC16660sJ == null) {
            return;
        }
        interfaceC16660sJ.invoke(str);
    }

    public final void A03(FormLayout formLayout) {
        formLayout.setOnRebuild(new C57533Pg7(38, formLayout, this));
        A01(this, formLayout);
    }
}
