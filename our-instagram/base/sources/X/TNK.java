package X;

import android.content.Context;
import android.view.ViewStub;
import android.widget.FrameLayout;
import com.facebook.browser.lite.BrowserLiteFragment;

/* loaded from: classes10.dex */
public final class TNK implements Runnable {
    public final /* synthetic */ SHI A00;
    public final /* synthetic */ String A01;

    public TNK(SHI shi, String str) {
        this.A00 = shi;
        this.A01 = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Context context;
        C3O0 c3o0;
        SHI shi = this.A00;
        if (shi != null) {
            String str = this.A01;
            C31349DqE c31349DqE = shi.A00;
            if (c31349DqE != null && (c3o0 = shi.A01) != null) {
                c3o0.A09(c31349DqE);
            }
            if (shi.A01 == null && (context = shi.A02) != null) {
                ViewStub viewStub = new ViewStub(context);
                FrameLayout frameLayout = ((BrowserLiteFragment) shi.A03).A0D;
                if (frameLayout != null) {
                    frameLayout.addView(viewStub);
                }
                C3O0 c3o02 = new C3O0(viewStub, false);
                shi.A01 = c3o02;
                c3o02.A06(80);
            }
            C146106i8 c146106i8 = new C146106i8();
            c146106i8.A04();
            c146106i8.A0D = str;
            c146106i8.A01 = 5000;
            C31349DqE A00 = c146106i8.A00();
            shi.A00 = A00;
            C3O0 c3o03 = shi.A01;
            if (c3o03 != null) {
                c3o03.A0A(A00);
            }
        }
    }
}
