package X;

import android.view.View;
import com.facebook.R;

/* renamed from: X.0uX, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C17940uX extends AbstractC008603a {
    @Override // X.AbstractC008603a
    public final /* bridge */ /* synthetic */ void A03(View view, Object obj) {
        view.setScreenReaderFocusable(((Boolean) obj).booleanValue());
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x000c, code lost:
    
        if (r5.booleanValue() == false) goto L6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0016, code lost:
    
        if (r6.booleanValue() == false) goto L10;
     */
    @Override // X.AbstractC008603a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final /* bridge */ /* synthetic */ boolean A04(java.lang.Object r5, java.lang.Object r6) {
        /*
            r4 = this;
            java.lang.Boolean r5 = (java.lang.Boolean) r5
            java.lang.Boolean r6 = (java.lang.Boolean) r6
            r3 = 1
            if (r5 == 0) goto Le
            boolean r0 = r5.booleanValue()
            r2 = 1
            if (r0 != 0) goto Lf
        Le:
            r2 = 0
        Lf:
            if (r6 == 0) goto L18
            boolean r1 = r6.booleanValue()
            r0 = 1
            if (r1 != 0) goto L19
        L18:
            r0 = 0
        L19:
            if (r2 == r0) goto L1c
            r3 = 0
        L1c:
            r0 = r3 ^ 1
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C17940uX.A04(java.lang.Object, java.lang.Object):boolean");
    }

    public C17940uX() {
        super(Boolean.class, R.id.tag_screen_reader_focusable, 0, 28);
    }

    @Override // X.AbstractC008603a
    public final /* bridge */ /* synthetic */ Object A01(View view) {
        return Boolean.valueOf(view.isScreenReaderFocusable());
    }
}
