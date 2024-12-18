package X;

import android.view.View;
import com.instagram.igds.components.bottombutton.IgdsBottomButtonLayout;

/* renamed from: X.Lty, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C49485Lty implements GZD {
    public final int A00;
    public final Object A01;

    public C49485Lty(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    @Override // X.GZD
    public final void onSearchCleared(String str) {
        switch (this.A00) {
            case 3:
                C48593LeV c48593LeV = (C48593LeV) this.A01;
                if (c48593LeV.A0E) {
                    return;
                }
                View view = c48593LeV.A06;
                if (view != null) {
                    view.setVisibility(4);
                }
                AbstractC167007dF.A0w(c48593LeV.A09);
                return;
            case 4:
            default:
                return;
            case 5:
                ((KD6) this.A01).DjQ("");
                return;
            case 6:
                IgdsBottomButtonLayout igdsBottomButtonLayout = ((KCS) this.A01).A09;
                if (igdsBottomButtonLayout == null) {
                    return;
                }
                AbstractC166997dE.A1L(igdsBottomButtonLayout, true);
                return;
            case 7:
                ((C47974LIk) this.A01).A02();
                return;
        }
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0002. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:41:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x006f  */
    @Override // X.GZD
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onSearchTextChanged(java.lang.String r9) {
        /*
            Method dump skipped, instructions count: 424
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C49485Lty.onSearchTextChanged(java.lang.String):void");
    }
}
