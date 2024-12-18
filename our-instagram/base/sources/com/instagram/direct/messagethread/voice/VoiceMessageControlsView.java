package com.instagram.direct.messagethread.voice;

import X.AbstractC13880nE;
import X.AbstractC148406mA;
import X.AbstractC166987dD;
import X.AbstractC166997dE;
import X.AbstractC167007dF;
import X.AbstractC31171DnF;
import X.AbstractC47570Kzg;
import X.C110964z8;
import X.C14360o3;
import X.C152726u0;
import X.C162817Qs;
import X.C1H4;
import X.C25314BIj;
import X.C3T1;
import X.C45096JxQ;
import X.C51760Mtj;
import X.C74843Xy;
import X.EnumC43692JUb;
import X.InterfaceC56392iX;
import X.JV1;
import X.KVN;
import X.KVO;
import X.KVP;
import X.LQ1;
import X.ViewOnClickListenerC48068LPt;
import android.content.Context;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.drawable.ShapeDrawable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.facebook.R;
import com.facebook.common.stringformat.StringFormatUtil;
import com.instagram.common.ui.base.IgTextView;
import com.instagram.common.ui.widget.imageview.IgImageView;
import com.instagram.ui.widget.spinner.SpinnerImageView;
import java.util.HashMap;
import java.util.Iterator;

/* loaded from: classes8.dex */
public final class VoiceMessageControlsView extends ConstraintLayout {
    public JV1 A00;
    public AbstractC47570Kzg A01;
    public int A02;
    public int A03;
    public IgTextView A04;
    public final C110964z8 A05;
    public final InterfaceC56392iX A06;
    public final InterfaceC56392iX A07;
    public final InterfaceC56392iX A08;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VoiceMessageControlsView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C14360o3.A0B(context, 1);
        C110964z8 c110964z8 = new C110964z8();
        this.A05 = c110964z8;
        this.A03 = -16777216;
        this.A02 = -16777216;
        this.A01 = KVO.A00;
        View.inflate(context, R.layout.voice_message_controls, this);
        this.A06 = AbstractC166997dE.A0X(this, R.id.voice_message_playback_speed_button);
        this.A07 = AbstractC166997dE.A0X(this, R.id.voice_message_transcription_button);
        this.A08 = AbstractC166997dE.A0X(this, R.id.voice_message_transcription_loading_icon);
        c110964z8.A0I(this);
    }

    public final void setupView(C51760Mtj c51760Mtj) {
        C14360o3.A0B(c51760Mtj, 0);
        JV1 jv1 = (JV1) c51760Mtj.A00;
        if (jv1 != null) {
            setupPlaybackSpeed(jv1);
        }
        C25314BIj c25314BIj = (C25314BIj) c51760Mtj.A01;
        if (c25314BIj != null) {
            C110964z8 c110964z8 = this.A05;
            C110964z8.A02(c110964z8, R.id.voice_message_controls_button_container).A05.A03 = 0;
            C110964z8.A02(c110964z8, R.id.message_content_voice_playback_timer).A05.A03 = 0;
            setupTimer(c25314BIj);
        }
        C45096JxQ c45096JxQ = (C45096JxQ) c51760Mtj.A02;
        if (c45096JxQ != null) {
            C110964z8 c110964z82 = this.A05;
            C110964z8.A02(c110964z82, R.id.voice_message_controls_button_container).A05.A03 = 0;
            C110964z8.A02(c110964z82, R.id.voice_message_transcription_button).A05.A03 = 0;
            setupTranscriptionButton(c45096JxQ);
        } else if (jv1 == null) {
            return;
        }
        AbstractC166997dE.A0S(this, R.id.voice_message_controls_button_container).setVisibility(0);
    }

    private final ShapeDrawable A00(Integer num) {
        C74843Xy c74843Xy = new C74843Xy();
        Context A0L = AbstractC166997dE.A0L(this);
        c74843Xy.A06(AbstractC13880nE.A00(A0L, A0L.getResources().getDimension(R.dimen.album_music_sticker_text_vertical_padding)));
        ShapeDrawable shapeDrawable = new ShapeDrawable(new C162817Qs(c74843Xy, 126));
        if (num == null) {
            AbstractC148406mA.A02(Paint.Style.FILL, shapeDrawable, shapeDrawable.getShape(), 0.0f, -16777216);
            shapeDrawable.setAlpha(51);
        } else {
            int intValue = num.intValue();
            AbstractC148406mA.A02(Paint.Style.FILL, shapeDrawable, shapeDrawable.getShape(), 0.0f, intValue);
        }
        shapeDrawable.setIntrinsicWidth(AbstractC31171DnF.A02(A0L.getResources(), R.dimen.ai_sticker_creation_suggested_prompt_pill_height));
        return shapeDrawable;
    }

    private final void A01() {
        JV1 jv1 = this.A00;
        if (jv1 != null) {
            IgImageView igImageView = (IgImageView) this.A06.getView();
            igImageView.setOnClickListener(new ViewOnClickListenerC48068LPt(23, this, jv1, igImageView));
            igImageView.setBackground(A00(Integer.valueOf(jv1.A01)));
            A02(igImageView, (EnumC43692JUb) jv1.A04);
            igImageView.setColorFilter(jv1.A02, PorterDuff.Mode.SRC_IN);
        }
    }

    public static final void A02(IgImageView igImageView, EnumC43692JUb enumC43692JUb) {
        igImageView.setImageResource(enumC43692JUb.A01);
        Context context = igImageView.getContext();
        String A0q = AbstractC166997dE.A0q(context.getResources(), enumC43692JUb.A02);
        igImageView.setContentDescription(AbstractC166997dE.A0r(context.getResources(), A0q, 2131960722));
        igImageView.setTag(A0q);
    }

    public final void setTranscriptionState(AbstractC47570Kzg abstractC47570Kzg) {
        C3T1 c3t1;
        this.A01 = abstractC47570Kzg;
        int i = 0;
        this.A07.getView().setVisibility(AbstractC167007dF.A05(abstractC47570Kzg.A00 ? 1 : 0));
        InterfaceC56392iX interfaceC56392iX = this.A08;
        View view = interfaceC56392iX.getView();
        if (!abstractC47570Kzg.A01) {
            i = 8;
        }
        view.setVisibility(i);
        SpinnerImageView spinnerImageView = (SpinnerImageView) interfaceC56392iX.getView();
        if (abstractC47570Kzg.equals(KVP.A00)) {
            c3t1 = C3T1.LOADING;
        } else {
            c3t1 = C3T1.SUCCESS;
        }
        spinnerImageView.setLoadingStatus(c3t1);
    }

    private final void setupPlaybackSpeed(JV1 jv1) {
        this.A00 = jv1;
        if (this.A06.CWW()) {
            A01();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x000d, code lost:
    
        if (r1 != null) goto L15;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void setupTimer(X.C25314BIj r3) {
        /*
            r2 = this;
            com.instagram.common.ui.base.IgTextView r1 = r2.A04
            if (r1 != 0) goto Lf
            r0 = 2131436246(0x7f0b22d6, float:1.8494357E38)
            com.instagram.common.ui.base.IgTextView r1 = X.AbstractC31172DnG.A0X(r2, r0)
            r2.A04 = r1
            if (r1 == 0) goto L14
        Lf:
            int r0 = r3.A01
            r1.setTextColor(r0)
        L14:
            com.instagram.common.ui.base.IgTextView r0 = r2.A04
            X.AbstractC167007dF.A0w(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.direct.messagethread.voice.VoiceMessageControlsView.setupTimer(X.BIj):void");
    }

    private final void setupTranscriptionButton(C45096JxQ c45096JxQ) {
        int i = c45096JxQ.A03;
        this.A03 = i;
        int i2 = c45096JxQ.A01;
        this.A02 = i2;
        InterfaceC56392iX interfaceC56392iX = this.A07;
        interfaceC56392iX.getView().setOnClickListener(new LQ1(30, this, c45096JxQ));
        setTranscriptionState((AbstractC47570Kzg) c45096JxQ.A05);
        AbstractC47570Kzg abstractC47570Kzg = this.A01;
        KVN kvn = KVN.A00;
        if (!C14360o3.A0K(abstractC47570Kzg, kvn)) {
            i = c45096JxQ.A02;
        }
        if (!C14360o3.A0K(this.A01, kvn)) {
            i2 = c45096JxQ.A00;
        }
        interfaceC56392iX.getView().setBackground(A00(Integer.valueOf(i2)));
        ((ImageView) interfaceC56392iX.getView()).setColorFilter(i, PorterDuff.Mode.SRC_IN);
    }

    public final void A0D() {
        setTranscriptionState(KVN.A00);
        int i = this.A03;
        int i2 = this.A02;
        InterfaceC56392iX interfaceC56392iX = this.A07;
        interfaceC56392iX.getView().setBackground(A00(Integer.valueOf(i2)));
        ((ImageView) interfaceC56392iX.getView()).setColorFilter(i, PorterDuff.Mode.SRC_IN);
    }

    public final void A0E(EnumC43692JUb enumC43692JUb, boolean z) {
        C110964z8 c110964z8;
        if (this.A00 != null) {
            InterfaceC56392iX interfaceC56392iX = this.A06;
            if (!interfaceC56392iX.CWW()) {
                A01();
            }
            interfaceC56392iX.getView().setVisibility(AbstractC167007dF.A05(z ? 1 : 0));
            if (z && enumC43692JUb != null) {
                ((ImageView) interfaceC56392iX.getView()).setImageResource(enumC43692JUb.A01);
                JV1 jv1 = this.A00;
                if (jv1 != null) {
                    ((ImageView) interfaceC56392iX.getView()).setColorFilter(jv1.A02, PorterDuff.Mode.SRC_IN);
                }
            }
        }
        if (this.A06.CWW() && this.A07.CWW()) {
            if (z) {
                c110964z8 = new C110964z8();
                C110964z8 c110964z82 = this.A05;
                HashMap hashMap = c110964z8.A00;
                hashMap.clear();
                HashMap hashMap2 = c110964z82.A00;
                Iterator A0l = AbstractC167007dF.A0l(hashMap2);
                while (A0l.hasNext()) {
                    Object next = A0l.next();
                    C152726u0 c152726u0 = (C152726u0) hashMap2.get(next);
                    if (c152726u0 != null) {
                        hashMap.put(next, c152726u0.clone());
                    }
                }
                Context A0L = AbstractC166997dE.A0L(this);
                c110964z8.A0E(R.id.message_content_voice_playback_timer, 6, R.id.voice_message_controls_button_container, 7, AbstractC166987dD.A0C(A0L, 2));
                c110964z8.A0C(R.id.message_content_voice_playback_timer, 4, 0, 4);
                c110964z8.A0C(R.id.voice_message_controls_button_container, 3, 0, 3);
                c110964z8.A0E(R.id.voice_message_controls_button_container, 7, R.id.message_content_voice_playback_timer, 6, AbstractC166987dD.A0C(A0L, 2));
            } else {
                c110964z8 = this.A05;
            }
            c110964z8.A0G(this);
        }
    }

    public final void setTimerValueMs(long j) {
        int i;
        IgTextView igTextView = this.A04;
        if (igTextView != null) {
            int i2 = 0;
            if (j < 0) {
                i = 0;
            } else {
                int A01 = C1H4.A01(((float) j) / 1000.0f);
                i2 = A01 / 60;
                i = A01 % 60;
            }
            igTextView.setText(StringFormatUtil.formatStrLocaleSafe("%d:%02d", Integer.valueOf(i2), Integer.valueOf(i)));
        }
    }
}
