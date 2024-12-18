package X;

import android.widget.LinearLayout;
import com.facebook.R;
import com.instagram.common.ui.base.IgTextView;
import com.instagram.common.ui.widget.imageview.IgImageView;

/* renamed from: X.Gsw, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C38310Gsw extends LinearLayout {
    public IgTextView A00;
    public IgTextView A01;
    public IgTextView A02;
    public IgImageView A03;
    public boolean A04;

    public final void setLanguageName(String str) {
        C14360o3.A0B(str, 0);
        IgTextView igTextView = this.A00;
        if (igTextView != null) {
            igTextView.setText(str);
        }
    }

    public final boolean getIsPlaying() {
        return this.A04;
    }

    public final void setIconPadding(int i) {
        IgImageView igImageView = this.A03;
        if (igImageView != null) {
            igImageView.setPadding(i, i, i, i);
        }
    }

    public final void setIsPlaying(boolean z) {
        IgImageView igImageView;
        int i;
        IgTextView igTextView = this.A02;
        if (z) {
            if (igTextView != null) {
                igTextView.setVisibility(0);
            }
            IgTextView igTextView2 = this.A01;
            if (igTextView2 != null) {
                igTextView2.setVisibility(0);
            }
            igImageView = this.A03;
            if (igImageView != null) {
                i = R.drawable.instagram_auto_play_pano_filled_24;
                igImageView.setImageResource(i);
            }
        } else {
            if (igTextView != null) {
                igTextView.setVisibility(8);
            }
            IgTextView igTextView3 = this.A01;
            if (igTextView3 != null) {
                igTextView3.setVisibility(8);
            }
            igImageView = this.A03;
            if (igImageView != null) {
                i = R.drawable.instagram_auto_play_pano_outline_24;
                igImageView.setImageResource(i);
            }
        }
        this.A04 = z;
    }
}
