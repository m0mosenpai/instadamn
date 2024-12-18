package X;

import android.app.Activity;
import android.content.Context;
import android.widget.FrameLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.facebook.R;

/* renamed from: X.86Q, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C86Q {
    public FrameLayout A00;
    public ProgressBar A01;
    public ProgressBar A02;
    public C208659Kz A03;
    public final C86P A04;

    public final void A00() {
        C208659Kz c208659Kz = this.A03;
        if (c208659Kz != null) {
            c208659Kz.A04.setLoadingStatus(MY0.A03);
            C208659Kz c208659Kz2 = this.A03;
            if (c208659Kz2 != null) {
                c208659Kz2.A00.setVisibility(8);
                C208659Kz c208659Kz3 = this.A03;
                if (c208659Kz3 != null) {
                    c208659Kz3.A03.setVisibility(8);
                    C208659Kz c208659Kz4 = this.A03;
                    if (c208659Kz4 != null) {
                        c208659Kz4.A02.setVisibility(8);
                        C208659Kz c208659Kz5 = this.A03;
                        if (c208659Kz5 != null) {
                            c208659Kz5.A01.setVisibility(8);
                            return;
                        }
                    }
                }
            }
            C14360o3.A0F("loadingViewsHolder");
            throw C00O.createAndThrow();
        }
    }

    public final void A01() {
        C208659Kz c208659Kz = this.A03;
        if (c208659Kz != null) {
            c208659Kz.A04.setLoadingStatus(MY0.A02);
            C208659Kz c208659Kz2 = this.A03;
            if (c208659Kz2 == null) {
                C14360o3.A0F("loadingViewsHolder");
                throw C00O.createAndThrow();
            }
            c208659Kz2.A00.setVisibility(0);
        }
    }

    public final void A02() {
        C208659Kz c208659Kz = this.A03;
        if (c208659Kz != null) {
            c208659Kz.A01.setVisibility(0);
            C208659Kz c208659Kz2 = this.A03;
            if (c208659Kz2 == null) {
                C14360o3.A0F("loadingViewsHolder");
                throw C00O.createAndThrow();
            }
            c208659Kz2.A00.setVisibility(0);
        }
    }

    public C86Q(C86P c86p) {
        this.A04 = c86p;
    }

    public final void A03(Context context, Activity activity) {
        if (this.A00 == null) {
            FrameLayout frameLayout = new FrameLayout(context);
            this.A00 = frameLayout;
            frameLayout.setClickable(true);
            ((TextView) activity.getLayoutInflater().inflate(R.layout.layout_spinner_for_processing_video, this.A00).requireViewById(R.id.processing_video_text)).setText(activity.getResources().getText(2131969966));
            activity.addContentView(this.A00, new FrameLayout.LayoutParams(-1, -1));
        }
    }
}
