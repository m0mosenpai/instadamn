package X;

import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.SparseArray;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.R;
import java.util.LinkedHashMap;

/* loaded from: classes10.dex */
public class Q83 extends Fragment implements InterfaceC65384TjH, InterfaceC65382TjF, InterfaceC65387TjK {
    public static final SparseArray A06;
    public Dialog A00;
    public Context A01;
    public View A02;
    public Q9U A03;
    public Q8X A04;
    public boolean A05;

    @Override // X.InterfaceC65387TjK
    public final SOB C8u() {
        boolean z;
        String str;
        if (this.A04.A02() != 0) {
            z = true;
            str = requireContext().getString(this.A04.A02());
        } else {
            z = false;
            str = null;
        }
        if (this.A04 instanceof REK) {
            C2FP.A0E().A06();
        }
        return new SOB(null, null, null, str, 0, 0, false, false, z);
    }

    public void A00() {
        C2GT c2gt;
        Q8X q8x = this.A04;
        if (q8x instanceof REG) {
            c2gt = ((REG) q8x).A01;
        } else if (q8x instanceof REJ) {
            c2gt = ((REJ) q8x).A04;
        } else if (q8x instanceof REK) {
            c2gt = ((REK) q8x).A06;
        } else if (q8x instanceof REC) {
            c2gt = ((REC) q8x).A01;
        } else if (q8x instanceof REI) {
            c2gt = ((REI) q8x).A01;
        } else if (q8x instanceof REM) {
            c2gt = ((REM) q8x).A03;
        } else if (q8x instanceof REH) {
            c2gt = ((REH) q8x).A03;
        } else if (q8x instanceof RED) {
            c2gt = ((RED) q8x).A01;
        } else if (q8x instanceof REE) {
            c2gt = ((REE) q8x).A01;
        } else if (q8x instanceof REL) {
            c2gt = ((REL) q8x).A02;
        } else {
            c2gt = ((REF) q8x).A02;
        }
        C63627SqZ.A00(this, c2gt, 26);
        if (!this.A05) {
            C63627SqZ.A00(this, this.A04.A03, 27);
        }
        C63627SqZ.A00(this, this.A04.A06, 28);
        C63627SqZ.A00(this, this.A04.A07, 29);
        C63627SqZ.A00(this, this.A04.A09, 30);
        C63627SqZ.A00(this, this.A04.A05, 31);
        C63627SqZ.A00(this, this.A04.A04, 32);
        C63627SqZ.A01(this, this.A04.A0A, new C63627SqZ(this, 33), 44);
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x001e, code lost:
    
        if (r3.mParentFragment == null) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void A01() {
        /*
            r3 = this;
            android.os.Bundle r1 = r3.mArguments
            r1.getClass()
            java.lang.String r0 = "viewmodel_class"
            java.io.Serializable r2 = r1.getSerializable(r0)
            r2.getClass()
            java.lang.Class r2 = (java.lang.Class) r2
            android.os.Bundle r1 = r3.mArguments
            java.lang.String r0 = "has_container_fragment"
            boolean r0 = r1.getBoolean(r0)
            if (r0 == 0) goto L20
            androidx.fragment.app.Fragment r1 = r3.mParentFragment
            r0 = 1
            if (r1 != 0) goto L21
        L20:
            r0 = 0
        L21:
            r3.A05 = r0
            if (r0 == 0) goto L44
            androidx.fragment.app.Fragment r0 = r3.requireParentFragment()
        L29:
            X.2bb r0 = X.C63307ShD.A00(r0)
            X.2bZ r1 = r0.A00(r2)
            boolean r0 = r1 instanceof X.Q8X
            X.C18C.A0E(r0)
            X.Q8X r1 = (X.Q8X) r1
            r3.A04 = r1
            boolean r0 = r1.A01
            if (r0 != 0) goto L43
            android.os.Bundle r0 = r3.mArguments
            r1.A05(r0)
        L43:
            return
        L44:
            r0 = r3
            goto L29
        */
        throw new UnsupportedOperationException("Method not decompiled: X.Q83.A01():void");
    }

    @Override // X.InterfaceC65384TjH
    public boolean DIB(Bundle bundle, int i, boolean z) {
        return this.A04.A04(bundle, i, z);
    }

    @Override // X.InterfaceC65382TjF
    public final boolean onBackPressed() {
        Q8X q8x = this.A04;
        if (q8x instanceof REH) {
            REH reh = (REH) q8x;
            LinkedHashMap A08 = AbstractC58442PvL.A08(reh.A01);
            AbstractC58320PtC.A1Q(reh.A02.A00, A08);
            reh.A04.Chz("fbpay_edit_paypal_cancel", A08);
            return false;
        }
        return false;
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        this.A03 = new Q9U(A06);
        RecyclerView recyclerView = (RecyclerView) view.requireViewById(R.id.list);
        recyclerView.setAdapter(this.A03);
        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
        recyclerView.setOverScrollMode(2);
        recyclerView.A14(new E0L(this, 0));
        this.A02 = view.requireViewById(R.id.progress_bar);
        A00();
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [X.TjJ, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v11, types: [X.TjJ, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v14, types: [X.TjJ, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v15, types: [X.TjJ, java.lang.Object] */
    static {
        SparseArray A0G = AbstractC58318PtA.A0G();
        A06 = A0G;
        if (C2FP.A05().A01) {
            C2FP.A0E();
            A0G.put(0, new T3H(new Object(), R.style.Ig4aFbPay_PaymentMethodItem));
            C2FP.A0E();
            A0G.put(1, new T3G(R.style.Ig4aFbPay));
            C2FP.A0E();
            A0G.put(14, new T3G(R.style.Ig4aFbPay_ContentHeader));
            C2FP.A0E();
            A0G.put(15, new T3G(R.style.Ig4aFbPay_Body));
            A0G.put(2, new T3I());
            C2FP.A0E();
            A0G.put(12, new T3I(R.style.Ig4aFbPay_PrimaryButton));
            C2FP.A0E();
            A0G.put(13, new T3I(R.style.Ig4aFbPay_SecondaryButton));
            A0G.put(3, new Object());
            A0G.put(9, new Object());
            C2FP.A0E();
            A0G.put(10, new T3F(R.style.Ig4aFbPay_Divider));
            C2FP.A0E();
            A0G.put(11, new T3F(R.style.Ig4aFbPay_FullDivider));
            C2FP.A0E();
            A0G.put(4, new T3H(new Object(), R.style.Ig4aFbPay_OrderItem));
            A0G.put(5, new Object());
            A0G.put(7, new Object());
            C2FP.A0E();
            A0G.put(6, new T3H(new Object(), R.style.Ig4aFbPay_TransactionItem));
            C2FP.A0E();
            A0G.put(8, new T3H(new Object(), R.style.Ig4aFbPay_TransactionV1Item));
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onActivityResult(int i, int i2, Intent intent) {
        Bundle extras;
        super.onActivityResult(i, i2, intent);
        Q8X q8x = this.A04;
        boolean A1P = AbstractC167007dF.A1P(i2, -1);
        if (intent == null) {
            extras = null;
        } else {
            extras = intent.getExtras();
        }
        q8x.A04(extras, i, A1P);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        int i;
        int A02 = C0f9.A02(620876420);
        super.onCreate(bundle);
        if (!C2FP.A05().A01) {
            i = -714945341;
        } else {
            A01();
            if (bundle == null) {
                Q8X q8x = this.A04;
                if (q8x instanceof REK) {
                    REK rek = (REK) q8x;
                    if (!rek.A04) {
                        rek.A08.Chz("client_load_paymentactivity_init", AbstractC58442PvL.A08(rek.A01));
                    }
                }
            }
            i = 552140841;
        }
        C0f9.A09(i, A02);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(1227001454);
        FragmentActivity activity = getActivity();
        C2FP.A0E();
        ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(activity, R.style.Ig4aFbPay);
        this.A01 = contextThemeWrapper;
        View A0A = AbstractC31172DnG.A0A(layoutInflater.cloneInContext(contextThemeWrapper), viewGroup, R.layout.fragment_hub_section);
        C0f9.A09(-678201396, A02);
        return A0A;
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroyView() {
        int A02 = C0f9.A02(1640811665);
        super.onDestroyView();
        Dialog dialog = this.A00;
        if (dialog != null) {
            dialog.dismiss();
        }
        Q8X q8x = this.A04;
        if (q8x instanceof REJ) {
            REJ rej = (REJ) q8x;
            if (!rej.A03) {
                REJ.A00(rej);
            }
        }
        C0f9.A09(-249630717, A02);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onResume() {
        int A02 = C0f9.A02(1006619521);
        super.onResume();
        Q8X q8x = this.A04;
        if (q8x instanceof REK) {
            REK rek = (REK) q8x;
            C58252li c58252li = rek.A07;
            SE9 se9 = rek.A09;
            boolean z = rek.A04;
            Q8J A00 = REU.A00(new C63547SpF(se9, null, z), se9.A00);
            C14360o3.A07(A00);
            C63627SqZ.A02(A00, c58252li, rek, 37);
        } else if (q8x instanceof REE) {
            C62580SHf c62580SHf = ((REE) q8x).A03;
            C63628Sqa.A03(REU.A00(new C63581Spo(c62580SHf, 9), c62580SHf.A02), c62580SHf.A01, c62580SHf, 67);
        } else if (q8x instanceof REL) {
            C62580SHf c62580SHf2 = ((REL) q8x).A01;
            C63628Sqa.A03(REU.A00(new C63581Spo(c62580SHf2, 8), c62580SHf2.A02), c62580SHf2.A00, c62580SHf2, 66);
        } else if (q8x instanceof REF) {
            SGD sgd = ((REF) q8x).A04;
            C63628Sqa.A03(REU.A00(new C63581Spo(sgd, 7), sgd.A01), sgd.A00, sgd, 64);
        }
        C0f9.A09(717294946, A02);
    }
}
