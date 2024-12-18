package com.facebook.smartcapture.ui;

import X.AbstractC166987dD;
import X.AbstractC166997dE;
import X.AbstractC47961LGz;
import X.AbstractC47994LKy;
import X.C14360o3;
import android.content.Context;
import android.content.res.ColorStateList;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.facebook.R;
import com.facebook.smartcapture.logging.IdCaptureLogger;
import java.util.Map;

/* loaded from: classes8.dex */
public final class TextTipView extends FrameLayout {
    public IdCaptureLogger A00;
    public final ImageView A01;
    public final ProgressBar A02;
    public final TextView A03;
    public final TextView A04;
    public final Map A05;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TextTipView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C14360o3.A0B(context, 1);
        View.inflate(context, R.layout.text_tip_view, this);
        AbstractC47961LGz.A00(this, R.id.rl_text_tip_container).setBackgroundTintList(ColorStateList.valueOf(AbstractC47994LKy.A01(AbstractC166997dE.A0L(this), R.attr.sc_always_white)));
        this.A04 = AbstractC47961LGz.A02(this, R.id.tv_tip_title);
        this.A03 = AbstractC47961LGz.A02(this, R.id.tv_tip_description);
        this.A01 = AbstractC47961LGz.A01(this, R.id.iv_tip_icon);
        ProgressBar progressBar = (ProgressBar) AbstractC47961LGz.A00(this, R.id.pb_text_tip);
        this.A02 = progressBar;
        AbstractC47994LKy.A03(context, progressBar, R.attr.sc_accent);
        this.A05 = AbstractC166987dD.A1G();
    }
}
