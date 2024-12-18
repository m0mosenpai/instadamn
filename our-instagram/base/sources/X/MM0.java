package X;

import android.content.Context;
import android.widget.TextView;
import com.facebook.R;
import java.util.AbstractCollection;

/* loaded from: classes8.dex */
public final class MM0 extends C0YY implements InterfaceC16660sJ {
    public final int A00;
    public final Object A01;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MM0(Object obj, int i) {
        super(1);
        this.A00 = i;
        this.A01 = obj;
    }

    public static GHY A02(Context context, Object obj, int i, int i2) {
        return new GHY(context, new ViewOnClickListenerC48071LPw(obj, i), i2);
    }

    public static void A03(Context context, Object obj, AbstractCollection abstractCollection, int i, int i2) {
        abstractCollection.add(new GHY(context, new ViewOnClickListenerC48071LPw(obj, i), i2));
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:370:0x0b01, code lost:
    
        if (r0 != 0) goto L478;
     */
    /* JADX WARN: Code restructure failed: missing block: B:598:0x13a5, code lost:
    
        if (r2 != null) goto L572;
     */
    /* JADX WARN: Code restructure failed: missing block: B:600:0x13e3, code lost:
    
        return X.C42221xC.A09(r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:614:0x13dd, code lost:
    
        if (X.AbstractC31172DnG.A1Z(r1, r2) == false) goto L572;
     */
    /* JADX WARN: Code restructure failed: missing block: B:622:0x142e, code lost:
    
        if (X.AbstractC167007dF.A1Z(r1.A0G) != false) goto L584;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0006. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:347:0x0a16. Please report as an issue. */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00ff  */
    /* JADX WARN: Type inference failed for: r0v304, types: [android.widget.TextView] */
    /* JADX WARN: Type inference failed for: r0v321, types: [android.widget.TextView] */
    /* JADX WARN: Type inference failed for: r15v26, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r15v29, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r1v113, types: [X.FHl] */
    /* JADX WARN: Type inference failed for: r1v210, types: [java.lang.Object, X.Faq] */
    /* JADX WARN: Type inference failed for: r4v24, types: [X.Ka9, X.ElU, androidx.fragment.app.Fragment, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v18, types: [java.util.AbstractCollection, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r6v19, types: [java.util.Collection] */
    /* JADX WARN: Type inference failed for: r6v20, types: [java.util.AbstractCollection, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r6v21, types: [java.util.AbstractCollection] */
    /* JADX WARN: Type inference failed for: r6v23, types: [java.util.AbstractCollection, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r6v25, types: [X.0sl] */
    /* JADX WARN: Type inference failed for: r6v27 */
    /* JADX WARN: Type inference failed for: r6v28 */
    @Override // X.InterfaceC16660sJ
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object r21) {
        /*
            Method dump skipped, instructions count: 5360
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.MM0.invoke(java.lang.Object):java.lang.Object");
    }

    public static TextView A00(C45816KPv c45816KPv) {
        C45816KPv.A0B(c45816KPv).setText("");
        return (TextView) c45816KPv.A04.A02();
    }

    public static C44101JeQ A01(C46054Ka9 c46054Ka9, AbstractCollection abstractCollection, InterfaceC09390do interfaceC09390do) {
        abstractCollection.add(new C34940FaQ(R.drawable.large_separator));
        C35246Fgf c35246Fgf = new C35246Fgf(2131966649);
        c35246Fgf.A01 = R.style.igds_emphasized_body_1;
        c35246Fgf.A03 = R.dimen.action_bar_item_spacing_right;
        abstractCollection.add(c35246Fgf);
        abstractCollection.add(C46054Ka9.A01(c46054Ka9));
        C35246Fgf c35246Fgf2 = new C35246Fgf(2131966648);
        c35246Fgf2.A01 = R.style.PrivacyTextStyle;
        abstractCollection.add(c35246Fgf2);
        return (C44101JeQ) interfaceC09390do.getValue();
    }
}
