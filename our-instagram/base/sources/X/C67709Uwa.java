package X;

import android.os.Bundle;
import com.facebook.R;
import com.google.common.collect.ImmutableList;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: X.Uwa, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C67709Uwa extends UFZ {
    public UWc A00;
    public final C2GS A01 = new C2GS();

    /* JADX WARN: Type inference failed for: r1v6, types: [X.Uw5, X.Vjc] */
    /* JADX WARN: Type inference failed for: r2v0, types: [X.Uw5, X.Vjc] */
    /* JADX WARN: Type inference failed for: r7v0, types: [X.Uw3, X.Vjc] */
    @Override // X.UFZ
    public final void A09(Bundle bundle) {
        String str;
        ImmutableList requiredCompactedTreeListField;
        super.A09(bundle);
        Object A01 = C63368SiU.A01(bundle, MSV.A00(744));
        if (A01 != null) {
            this.A00 = (UWc) A01;
            ImmutableList.Builder builder = new ImmutableList.Builder();
            C67689UwG c67689UwG = new C67689UwG(20);
            ?? abstractC69209Vjc = new AbstractC69209Vjc();
            UWc uWc = this.A00;
            if (uWc != null) {
                str = uWc.A09("balance_text");
            } else {
                str = null;
            }
            Uw5.A03(new Wab(str), abstractC69209Vjc, VEP.A1E);
            c67689UwG.A00(new C67684UwB(abstractC69209Vjc), 1);
            ?? abstractC69209Vjc2 = new AbstractC69209Vjc();
            abstractC69209Vjc2.A02 = new C70515WZw(2, 4, 2, 0);
            abstractC69209Vjc2.A00 = new WNN(this, 27);
            c67689UwG.A06 = new Uw7(abstractC69209Vjc2);
            ((AbstractC69335Vlh) c67689UwG).A00 = R.id.bottom_sheet_header;
            AbstractC70120W4v.A00(c67689UwG, builder);
            C67690UwH.A00(builder);
            UWc uWc2 = this.A00;
            if (uWc2 != null && (requiredCompactedTreeListField = uWc2.getRequiredCompactedTreeListField(3, "balance_tooltip", UWb.class, 579186443)) != null) {
                ArrayList A0i = AbstractC167007dF.A0i(requiredCompactedTreeListField);
                Iterator<E> it = requiredCompactedTreeListField.iterator();
                while (it.hasNext()) {
                    A0i.add(((C2JS) it.next()).reinterpretRequired(0, C67528UnS.class, -1925217936));
                }
                ArrayList A0i2 = AbstractC167007dF.A0i(A0i);
                Iterator it2 = A0i.iterator();
                while (it2.hasNext()) {
                    A0i2.add(new WaZ((C67528UnS) it2.next(), new WbN(this, 3)));
                }
                Iterator it3 = A0i2.iterator();
                while (it3.hasNext()) {
                    InterfaceC72013XFb interfaceC72013XFb = (InterfaceC72013XFb) it3.next();
                    C67689UwG c67689UwG2 = new C67689UwG(1);
                    ?? abstractC69209Vjc3 = new AbstractC69209Vjc();
                    Uw5.A03(interfaceC72013XFb, abstractC69209Vjc3, VEP.A0q);
                    C67684UwB.A01(c67689UwG2, abstractC69209Vjc3, builder);
                }
            }
            this.A01.A0B(builder.build());
            return;
        }
        throw AbstractC166997dE.A0g();
    }
}
