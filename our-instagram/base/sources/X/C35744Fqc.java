package X;

import android.widget.CompoundButton;
import com.instagram.common.ui.base.IgTextView;
import com.instagram.igds.components.textcell.IgdsListCell;

/* renamed from: X.Fqc, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C35744Fqc implements CompoundButton.OnCheckedChangeListener {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;

    public C35744Fqc(IgTextView igTextView, EL4 el4, IgdsListCell igdsListCell, int i) {
        this.A00 = i;
        if (2 - i != 0) {
            this.A02 = igTextView;
            this.A03 = el4;
            this.A01 = igdsListCell;
        } else {
            this.A01 = igTextView;
            this.A03 = el4;
            this.A02 = igdsListCell;
        }
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0004. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:98:0x01cc  */
    @Override // android.widget.CompoundButton.OnCheckedChangeListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onCheckedChanged(android.widget.CompoundButton r15, boolean r16) {
        /*
            Method dump skipped, instructions count: 596
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C35744Fqc.onCheckedChanged(android.widget.CompoundButton, boolean):void");
    }

    public C35744Fqc(int i, Object obj, Object obj2, Object obj3) {
        this.A00 = i;
        this.A03 = obj2;
        this.A01 = obj;
        this.A02 = obj3;
    }
}
