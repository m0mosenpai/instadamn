package X;

import android.widget.CompoundButton;
import com.instagram.igds.components.textcell.IgdsListCell;

/* renamed from: X.OlD, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C55519OlD implements CompoundButton.OnCheckedChangeListener {
    public final int A00;
    public final Object A01;

    public C55519OlD(C56255Oy2 c56255Oy2, int i) {
        this.A00 = i;
        switch (i) {
            case 53:
            case 54:
            case 55:
            case 56:
                this.A01 = c56255Oy2;
                return;
            default:
                this.A01 = c56255Oy2;
                return;
        }
    }

    public static C36731GHa A00(Object obj, int i, int i2, boolean z) {
        return new C36731GHa(new C55519OlD(obj, i), i2, z);
    }

    public static void A01(CompoundButton compoundButton, Object obj, int i) {
        compoundButton.setOnCheckedChangeListener(new C55519OlD(obj, i));
    }

    public static void A02(IgdsListCell igdsListCell, Object obj, int i) {
        igdsListCell.A0D(new C55519OlD(obj, i));
    }

    /* JADX WARN: Code restructure failed: missing block: B:200:0x0656, code lost:
    
        if (((X.C50634MWv) r4.getValue()).A00 == false) goto L157;
     */
    /* JADX WARN: Code restructure failed: missing block: B:201:0x0658, code lost:
    
        r3 = r4.getValue();
     */
    /* JADX WARN: Code restructure failed: missing block: B:202:0x0667, code lost:
    
        if (X.C50634MWv.A00(r3, r4, true, ((X.C50634MWv) r3).A00, false) == false) goto L278;
     */
    /* JADX WARN: Code restructure failed: missing block: B:208:0x0671, code lost:
    
        r3 = r4.getValue();
        r0 = (X.C50634MWv) r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:209:0x0681, code lost:
    
        if (X.C50634MWv.A00(r3, r4, r0.A01, r0.A00, false) == false) goto L280;
     */
    /* JADX WARN: Code restructure failed: missing block: B:219:0x06ae, code lost:
    
        if (((X.C50634MWv) r4.getValue()).A02 == false) goto L170;
     */
    /* JADX WARN: Code restructure failed: missing block: B:220:0x06b0, code lost:
    
        r3 = r4.getValue();
     */
    /* JADX WARN: Code restructure failed: missing block: B:221:0x06bf, code lost:
    
        if (X.C50634MWv.A00(r3, r4, true, false, ((X.C50634MWv) r3).A02) == false) goto L284;
     */
    /* JADX WARN: Code restructure failed: missing block: B:225:0x06c9, code lost:
    
        r3 = r4.getValue();
        r0 = (X.C50634MWv) r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:226:0x06d9, code lost:
    
        if (X.C50634MWv.A00(r3, r4, r0.A01, false, r0.A02) == false) goto L286;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0008. Please report as an issue. */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:131:0x04b4  */
    /* JADX WARN: Removed duplicated region for block: B:138:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r0v339, types: [X.Mqf, java.lang.Object] */
    @Override // android.widget.CompoundButton.OnCheckedChangeListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onCheckedChanged(android.widget.CompoundButton r35, boolean r36) {
        /*
            Method dump skipped, instructions count: 2728
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C55519OlD.onCheckedChanged(android.widget.CompoundButton, boolean):void");
    }

    public C55519OlD(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }
}
