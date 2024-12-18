package com.instagram.direct.messagethread.voice.transcription;

import X.AbstractC166987dD;
import X.AbstractC166997dE;
import X.AbstractC31171DnF;
import X.AbstractC43592JPx;
import X.AbstractC46454KhE;
import X.C14360o3;
import X.InterfaceC09390do;
import X.InterfaceC16660sJ;
import X.KVS;
import X.MHH;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.facebook.R;
import com.instagram.common.ui.base.IgTextView;
import com.instagram.direct.messagethread.util.text.ExpandableTextView;

/* loaded from: classes8.dex */
public final class VoiceMessageTranscriptionTextView extends LinearLayout {
    public int A00;
    public int A01;
    public AbstractC46454KhE A02;
    public final String A03;
    public final InterfaceC09390do A04;
    public final InterfaceC09390do A05;
    public final InterfaceC09390do A06;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VoiceMessageTranscriptionTextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C14360o3.A0B(context, 1);
        this.A02 = KVS.A00;
        this.A01 = -16777216;
        this.A00 = -16777216;
        this.A06 = MHH.A00(this, 19);
        this.A04 = MHH.A00(this, 17);
        this.A05 = MHH.A00(this, 18);
        this.A03 = AbstractC166997dE.A0p(context, 2131960730);
        View.inflate(context, R.layout.voice_message_transcription_text_view, this);
        setTranscribedMessageTextColor(-16777216);
    }

    private final void setTranscriptionTextAndHandleLoadMore(String str, String str2, InterfaceC16660sJ interfaceC16660sJ) {
        int width;
        int i;
        if (str != null && str.length() != 0) {
            View view = null;
            if (getParent() instanceof View) {
                Object parent = getParent();
                if (parent instanceof View) {
                    view = (View) parent;
                }
            }
            if (getWidth() == 0 && view != null) {
                int width2 = view.getWidth();
                ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
                if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                    i = ((ViewGroup.MarginLayoutParams) layoutParams).getMarginStart();
                } else {
                    i = 0;
                }
                ViewGroup.LayoutParams layoutParams2 = view.getLayoutParams();
                width = width2 - (i + (layoutParams2 instanceof ViewGroup.MarginLayoutParams ? ((ViewGroup.MarginLayoutParams) layoutParams2).getMarginEnd() : 0));
            } else {
                width = getWidth();
            }
            getTranscriptionResultTextView().setText(AbstractC43592JPx.A07(str), str2, this.A00, 10, Integer.valueOf(width), interfaceC16660sJ);
            return;
        }
        AbstractC31171DnF.A14(getTranscriptionResultTextView());
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0044, code lost:
    
        if (r3.length() == 0) goto L12;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void setStatus(X.AbstractC46454KhE r6) {
        /*
            r5 = this;
            r1 = 0
            X.C14360o3.A0B(r6, r1)
            r5.A02 = r6
            boolean r0 = r6 instanceof X.KVS
            r2 = 8
            if (r0 == 0) goto L35
            r5.setVisibility(r2)
            com.instagram.common.ui.base.IgTextView r0 = r5.getErrorMessageTextView()
            java.lang.String r1 = ""
            r0.setText(r1)
            com.instagram.direct.messagethread.util.text.ExpandableTextView r0 = r5.getTranscriptionResultTextView()
            r0.setText(r1)
            com.instagram.common.ui.base.IgTextView r0 = r5.getErrorMessageTextView()
            r0.setVisibility(r2)
            com.instagram.direct.messagethread.util.text.ExpandableTextView r0 = r5.getTranscriptionResultTextView()
            r0.setVisibility(r2)
            com.instagram.common.ui.base.IgTextView r0 = r5.getLowConfidenceMessageTextView()
            r0.setVisibility(r2)
            return
        L35:
            boolean r0 = r6 instanceof X.KVR
            if (r0 == 0) goto L87
            X.KVR r6 = (X.KVR) r6
            java.lang.String r3 = r6.A01
            if (r3 == 0) goto L46
            int r1 = r3.length()
            r0 = 0
            if (r1 != 0) goto L47
        L46:
            r0 = 1
        L47:
            r4 = r0 ^ 1
            int r0 = X.AbstractC167007dF.A05(r4)
            r5.setVisibility(r0)
            com.instagram.direct.messagethread.util.text.ExpandableTextView r1 = r5.getTranscriptionResultTextView()
            int r0 = X.AbstractC167007dF.A05(r4)
            r1.setVisibility(r0)
            com.instagram.common.ui.base.IgTextView r1 = r5.getErrorMessageTextView()
            java.lang.String r0 = r5.A03
            r1.setText(r0)
            com.instagram.common.ui.base.IgTextView r1 = r5.getErrorMessageTextView()
            r0 = r4 ^ 1
            int r0 = X.AbstractC167007dF.A05(r0)
            r1.setVisibility(r0)
            com.instagram.common.ui.base.IgTextView r1 = r5.getLowConfidenceMessageTextView()
            if (r4 == 0) goto L7c
            boolean r0 = r6.A03
            if (r0 == 0) goto L7c
            r2 = 0
        L7c:
            r1.setVisibility(r2)
            java.lang.String r1 = r6.A00
            X.0sJ r0 = r6.A02
            r5.setTranscriptionTextAndHandleLoadMore(r3, r1, r0)
            return
        L87:
            boolean r0 = r6 instanceof X.KVQ
            if (r0 == 0) goto Lad
            r5.setVisibility(r1)
            com.instagram.common.ui.base.IgTextView r0 = r5.getLowConfidenceMessageTextView()
            r0.setVisibility(r2)
            com.instagram.direct.messagethread.util.text.ExpandableTextView r0 = r5.getTranscriptionResultTextView()
            r0.setVisibility(r2)
            com.instagram.common.ui.base.IgTextView r0 = r5.getErrorMessageTextView()
            r0.setVisibility(r1)
            com.instagram.common.ui.base.IgTextView r1 = r5.getErrorMessageTextView()
            java.lang.String r0 = r5.A03
            r1.setText(r0)
            return
        Lad:
            X.B4Z r0 = X.B4Z.A00()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.direct.messagethread.voice.transcription.VoiceMessageTranscriptionTextView.setStatus(X.KhE):void");
    }

    private final IgTextView getErrorMessageTextView() {
        return (IgTextView) AbstractC166987dD.A17(this.A04);
    }

    private final IgTextView getLowConfidenceMessageTextView() {
        return (IgTextView) AbstractC166987dD.A17(this.A05);
    }

    private final ExpandableTextView getTranscriptionResultTextView() {
        return (ExpandableTextView) AbstractC166987dD.A17(this.A06);
    }

    public final int getContextMessageTextColor() {
        return this.A00;
    }

    public final AbstractC46454KhE getStatus() {
        return this.A02;
    }

    public final int getTranscribedMessageTextColor() {
        return this.A01;
    }

    public final void setContextMessageTextColor(int i) {
        getErrorMessageTextView().setTextColor(i);
        getLowConfidenceMessageTextView().setTextColor(i);
        this.A00 = i;
    }

    public final void setTranscribedMessageTextColor(int i) {
        getTranscriptionResultTextView().setTextColor(i);
        this.A01 = i;
    }
}
