package X;

import com.facebook.react.modules.dialog.DialogModule;

/* renamed from: X.Wxc, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class RunnableC71630Wxc implements Runnable {
    public final /* synthetic */ C1573774t A00;
    public final /* synthetic */ C7UR A01;
    public final /* synthetic */ String A02;
    public final /* synthetic */ String A03;
    public final /* synthetic */ boolean A04;
    public final /* synthetic */ boolean A05;
    public final /* synthetic */ boolean A06;

    public RunnableC71630Wxc(C1573774t c1573774t, C7UR c7ur, String str, String str2, boolean z, boolean z2, boolean z3) {
        this.A04 = z;
        this.A05 = z2;
        this.A01 = c7ur;
        this.A00 = c1573774t;
        this.A02 = str;
        this.A03 = str2;
        this.A06 = z3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            if (!this.A04 && this.A05) {
                C7UR.A03(this.A01, this.A00.A01, this.A02);
            }
        } catch (Exception e) {
            AbstractC167007dF.A15(C18950wb.A01.AEp("GifCache", 817892340), DialogModule.KEY_MESSAGE, "Exception while extracting audio data from file", e);
        }
        C11T.A02(new RunnableC71612WxI(this.A00, this.A01, this.A03, this.A02, this.A06));
    }
}
