package X;

import android.graphics.RectF;
import android.widget.ImageView;
import android.widget.SeekBar;
import android.widget.TextView;
import com.facebook.R;
import com.instagram.api.schemas.MediaCroppingCoordinates;
import com.instagram.common.ui.widget.videopreviewview.VideoPreviewView;

/* loaded from: classes9.dex */
public final class NG2 extends AbstractC48552Ldp {
    public final int A00;
    public final Object A01;

    public NG2(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    @Override // X.InterfaceC58181Pql
    public final void DPY(VideoPreviewView videoPreviewView, int i, int i2) {
        if (this.A00 != 0) {
            C52163N6p.A01((C52163N6p) this.A01);
            return;
        }
        C52165N6r c52165N6r = (C52165N6r) this.A01;
        MediaCroppingCoordinates mediaCroppingCoordinates = MSY.A0Q(c52165N6r.A0E).A09;
        if (mediaCroppingCoordinates != null) {
            VideoPreviewView videoPreviewView2 = c52165N6r.A08;
            String str = "videoPreviewView";
            if (videoPreviewView2 != null) {
                float A08 = AbstractC166987dD.A08(videoPreviewView2);
                RectF rectF = c52165N6r.A02;
                if (rectF == null) {
                    str = "punchHoleRectF";
                } else {
                    float f = rectF.top;
                    if (c52165N6r.A08 != null) {
                        float top = (f - r0.getTop()) - (mediaCroppingCoordinates.A03 * A08);
                        VideoPreviewView videoPreviewView3 = c52165N6r.A08;
                        if (videoPreviewView3 != null) {
                            videoPreviewView3.setTranslationY(top);
                        }
                    }
                }
            }
            C14360o3.A0F(str);
            throw C00O.createAndThrow();
        }
        C52165N6r.A00(c52165N6r);
    }

    @Override // X.AbstractC48552Ldp, X.InterfaceC58181Pql
    public final void Dbw(int i, int i2) {
        String str;
        if (this.A00 != 0) {
            C52163N6p c52163N6p = (C52163N6p) this.A01;
            SeekBar seekBar = c52163N6p.A01;
            str = "seekBar";
            if (seekBar != null) {
                seekBar.setProgress(i);
                SeekBar seekBar2 = c52163N6p.A01;
                if (seekBar2 != null) {
                    seekBar2.setMax(i2);
                    TextView textView = c52163N6p.A02;
                    if (textView != null) {
                        textView.setText(C23831Eq.A02(i));
                        return;
                    }
                    str = "videoTimer";
                }
            }
            C14360o3.A0F(str);
            throw C00O.createAndThrow();
        }
        C52165N6r c52165N6r = (C52165N6r) this.A01;
        SeekBar seekBar3 = c52165N6r.A04;
        if (seekBar3 == null) {
            str = "seekBar";
        } else {
            seekBar3.setProgress(i);
            TextView textView2 = c52165N6r.A05;
            if (textView2 != null) {
                textView2.setText(C23831Eq.A02(i));
                if (i < c52165N6r.A01) {
                    return;
                }
                VideoPreviewView videoPreviewView = c52165N6r.A08;
                if (videoPreviewView == null) {
                    str = "videoPreviewView";
                } else {
                    videoPreviewView.A04();
                    ImageView imageView = c52165N6r.A03;
                    if (imageView == null) {
                        str = "scrubberButton";
                    } else {
                        imageView.setImageResource(R.drawable.instagram_arrow_cw_pano_filled_16);
                        return;
                    }
                }
            }
            str = "videoTimer";
        }
        C14360o3.A0F(str);
        throw C00O.createAndThrow();
    }
}
