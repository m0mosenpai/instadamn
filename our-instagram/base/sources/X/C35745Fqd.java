package X;

import android.widget.CompoundButton;
import com.instagram.igds.components.textcell.IgdsListCell;

/* renamed from: X.Fqd, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C35745Fqd implements CompoundButton.OnCheckedChangeListener {
    public final int A00;
    public final Object A01;

    public C35745Fqd(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public static C31796DyG A00(C35745Fqd c35745Fqd) {
        return (C31796DyG) ((C32238EHw) c35745Fqd.A01).A03.getValue();
    }

    public static void A01(CompoundButton compoundButton, Object obj, int i) {
        compoundButton.setOnCheckedChangeListener(new C35745Fqd(obj, i));
    }

    public static void A02(IgdsListCell igdsListCell, Object obj, int i) {
        igdsListCell.A0D(new C35745Fqd(obj, i));
    }

    /* JADX WARN: Code restructure failed: missing block: B:122:0x0287, code lost:
    
        if (X.AbstractC31177DnL.A1Z(X.AbstractC47132Ef.A00(r4.A0g).A0E) != false) goto L103;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0008. Please report as an issue. */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:306:0x090e  */
    /* JADX WARN: Removed duplicated region for block: B:315:0x0995  */
    /* JADX WARN: Removed duplicated region for block: B:321:0x0964  */
    /* JADX WARN: Removed duplicated region for block: B:323:0x0980  */
    /* JADX WARN: Type inference failed for: r0v122, types: [X.1lV, X.1OW] */
    /* JADX WARN: Type inference failed for: r0v294, types: [X.1OW, X.1ld] */
    /* JADX WARN: Type inference failed for: r0v317, types: [X.1g3, X.1OW] */
    @Override // android.widget.CompoundButton.OnCheckedChangeListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onCheckedChanged(android.widget.CompoundButton r21, boolean r22) {
        /*
            Method dump skipped, instructions count: 2848
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C35745Fqd.onCheckedChanged(android.widget.CompoundButton, boolean):void");
    }
}
