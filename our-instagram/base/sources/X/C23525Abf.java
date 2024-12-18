package X;

import com.instagram.ui.widget.interactive.InteractiveDrawableContainer;

/* renamed from: X.Abf, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final /* synthetic */ class C23525Abf implements C2n2 {
    public final /* synthetic */ C8TS A00;
    public final /* synthetic */ boolean A01;

    public /* synthetic */ C23525Abf(C8TS c8ts, boolean z) {
        this.A00 = c8ts;
        this.A01 = z;
    }

    @Override // X.C2n2
    public final Object apply(Object obj) {
        C8TS c8ts = this.A00;
        boolean z = this.A01;
        BEd A02 = InteractiveDrawableContainer.A02(c8ts.A08, ((Number) obj).intValue());
        if (A02 != null) {
            ((C9LJ) A02).A0O = z;
            return null;
        }
        return null;
    }
}
