package X;

import com.instagram.igds.components.checkbox.IgdsCheckBox;

/* renamed from: X.PQr, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class RunnableC57001PQr implements Runnable {
    public final /* synthetic */ IgdsCheckBox A00;
    public final /* synthetic */ boolean A01;

    public RunnableC57001PQr(IgdsCheckBox igdsCheckBox, boolean z) {
        this.A00 = igdsCheckBox;
        this.A01 = z;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.A00.setChecked(this.A01);
    }
}
