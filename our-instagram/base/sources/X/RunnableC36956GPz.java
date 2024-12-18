package X;

import com.facebook.R;
import com.instagram.common.ui.base.IgTextView;
import com.instagram.common.ui.widget.imageview.IgImageView;

/* renamed from: X.GPz, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class RunnableC36956GPz implements Runnable {
    public final /* synthetic */ IgTextView A00;
    public final /* synthetic */ IgImageView A01;
    public final /* synthetic */ String A02;

    public RunnableC36956GPz(IgTextView igTextView, IgImageView igImageView, String str) {
        this.A01 = igImageView;
        this.A02 = str;
        this.A00 = igTextView;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.A01.setImageResource(R.drawable.instagram_link_pano_outline_24);
        if (this.A02 == null) {
            this.A00.setText(2131960172);
        }
    }
}
