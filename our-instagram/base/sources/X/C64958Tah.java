package X;

import android.os.Build;
import android.util.DisplayMetrics;
import android.view.WindowManager;

/* renamed from: X.Tah, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C64958Tah extends C0YY implements InterfaceC16820sZ {
    public final /* synthetic */ PCE A00;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C64958Tah(PCE pce) {
        super(0);
        this.A00 = pce;
    }

    @Override // X.InterfaceC16820sZ
    public final /* bridge */ /* synthetic */ Object invoke() {
        int i;
        if (Build.VERSION.SDK_INT >= 30) {
            i = ((WindowManager) this.A00.A01.getSystemService(WindowManager.class)).getCurrentWindowMetrics().getBounds().width();
        } else {
            DisplayMetrics displayMetrics = new DisplayMetrics();
            this.A00.A01.getWindowManager().getDefaultDisplay().getRealMetrics(displayMetrics);
            i = displayMetrics.widthPixels;
        }
        return Integer.valueOf(i);
    }
}
