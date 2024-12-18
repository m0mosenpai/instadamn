package com.instagram.ui.mediaactions;

import X.AbstractC111324zv;
import X.AbstractC166987dD;
import X.AbstractC166997dE;
import X.AbstractC167017dG;
import X.AbstractC25228BEl;
import X.AbstractC55922hc;
import X.C006802i;
import X.C14360o3;
import X.C23831Eq;
import X.C2CF;
import X.C2CG;
import X.C37582Ggd;
import X.C41584IaX;
import X.C75363a3;
import X.InterfaceC43394JFj;
import X.J13;
import X.JHW;
import X.JLC;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.facebook.R;
import com.instagram.common.ui.base.IgTextView;
import com.instagram.ui.videothumbnail.ThumbView;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes7.dex */
public class ScrubberPreviewThumbnailView extends FrameLayout implements JHW {
    public View A00;
    public ViewGroup A01;
    public TextView A02;
    public InterfaceC43394JFj A03;
    public ThumbView A04;

    public ScrubberPreviewThumbnailView(Context context) {
        this(context, null);
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0053, code lost:
    
        if ((r7 - r4) >= 2) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0059, code lost:
    
        if (r5 >= r8.size()) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x005d, code lost:
    
        if ((r5 - r7) >= 2) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x005f, code lost:
    
        if (r4 < 0) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0077, code lost:
    
        if (r5 >= r8.size()) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0079, code lost:
    
        X.C25821No.A00().A0O(null, (com.instagram.common.typedurl.ImageUrl) r8.get(r5), "VideoThumbnailController");
        r5 = r5 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x008b, code lost:
    
        if (r4 < 0) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0055, code lost:
    
        if (r4 < 0) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0061, code lost:
    
        X.C25821No.A00().A0O(null, (com.instagram.common.typedurl.ImageUrl) r8.get(r4), "VideoThumbnailController");
        r4 = r4 - 1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A00(int r19, int r20) {
        /*
            r18 = this;
            r0 = r18
            com.instagram.ui.videothumbnail.ThumbView r0 = r0.A04
            if (r0 == 0) goto Ld0
            X.IaX r10 = r0.A04
            if (r10 == 0) goto Ld0
            X.3a3 r2 = r10.A01
            X.3xH r11 = r2.A0A
            r13 = r19
            r14 = r20
            if (r11 == 0) goto Lb6
            java.util.List r9 = r11.A05
            boolean r0 = r9.isEmpty()
            if (r0 != 0) goto Lb6
            long r16 = android.os.SystemClock.elapsedRealtime()
            boolean r0 = r10.A02
            if (r0 == 0) goto L37
            X.02i r3 = X.C006802i.A0p
            X.C14360o3.A07(r3)
            java.lang.String r0 = r2.A0G
            int r2 = r0.hashCode()
            r1 = 1900591(0x1d002f, float:2.663295E-39)
            java.lang.String r0 = "thumbnail_requested"
            r3.markerPoint(r1, r2, r0)
        L37:
            float r2 = (float) r13
            float r1 = r11.A00
            r0 = 1148846080(0x447a0000, float:1000.0)
            float r1 = r1 * r0
            float r2 = r2 / r1
            int r15 = (int) r2
            int r0 = r11.A01
            int r7 = r15 / r0
            if (r7 < 0) goto Lb2
            java.util.List r8 = r11.A05
            int r0 = X.AbstractC25226BEj.A05(r8)
            if (r7 > r0) goto Lb2
            r6 = 2
            int r5 = r7 + 1
            r4 = r7
        L51:
            int r0 = r7 - r4
            if (r0 < r6) goto L61
        L55:
            int r0 = r8.size()
            if (r5 >= r0) goto L8e
            int r0 = r5 - r7
            if (r0 >= r6) goto L8e
            if (r4 < 0) goto L73
        L61:
            java.lang.Object r3 = r8.get(r4)
            com.instagram.common.typedurl.ImageUrl r3 = (com.instagram.common.typedurl.ImageUrl) r3
            X.1No r2 = X.C25821No.A00()
            java.lang.String r1 = "VideoThumbnailController"
            r0 = 0
            r2.A0O(r0, r3, r1)
            int r4 = r4 + (-1)
        L73:
            int r0 = r8.size()
            if (r5 >= r0) goto L8b
            java.lang.Object r3 = r8.get(r5)
            com.instagram.common.typedurl.ImageUrl r3 = (com.instagram.common.typedurl.ImageUrl) r3
            X.1No r2 = X.C25821No.A00()
            java.lang.String r1 = "VideoThumbnailController"
            r0 = 0
            r2.A0O(r0, r3, r1)
            int r5 = r5 + 1
        L8b:
            if (r4 < 0) goto L55
            goto L51
        L8e:
            r0 = -1
            if (r15 == r0) goto Lb2
            r1 = 1
            boolean[] r12 = new boolean[r1]
            r0 = 0
            r12[r0] = r1
            X.1No r2 = X.C25821No.A00()
            java.lang.Object r1 = r9.get(r7)
            com.instagram.common.typedurl.ImageUrl r1 = (com.instagram.common.typedurl.ImageUrl) r1
            r0 = 0
            X.1OG r0 = r2.A0J(r1, r0)
            X.InB r9 = new X.InB
            r9.<init>(r10, r11, r12, r13, r14, r15, r16)
            r0.A02(r9)
            r0.A01()
            return
        Lb2:
            X.C41584IaX.A00(r10, r13, r14)
            return
        Lb6:
            X.C41584IaX.A00(r10, r13, r14)
            if (r11 == 0) goto Ld0
            java.util.List r0 = r11.A05
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto Ld0
            java.lang.String r1 = "Thumbnail info missing sprite URL. videoId: "
            java.lang.String r0 = r2.A0G
            java.lang.String r1 = X.AnonymousClass001.A0R(r1, r0)
            java.lang.String r0 = "VideoThumbnailController"
            X.C0w9.A03(r0, r1)
        Ld0:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.ui.mediaactions.ScrubberPreviewThumbnailView.A00(int, int):void");
    }

    public final void A01(C75363a3 c75363a3) {
        ThumbView thumbView = this.A04;
        if (thumbView != null) {
            C41584IaX c41584IaX = thumbView.A04;
            if (c41584IaX != null) {
                if (!c41584IaX.A01.A0G.equals(c75363a3.A0G)) {
                    ThumbView.A00(thumbView);
                    thumbView.A04 = null;
                    thumbView.A02 = null;
                    thumbView.A03 = null;
                    thumbView.A05 = false;
                    thumbView.invalidate();
                }
                c41584IaX.A03.add(thumbView);
                C006802i c006802i = C006802i.A0p;
                C14360o3.A07(c006802i);
                String str = c75363a3.A0G;
                C2CG c2cg = C2CF.A0D;
                int hashCode = str.hashCode();
                c006802i.markerStart(1900591, hashCode);
                HashMap A1G = AbstractC166987dD.A1G();
                A1G.put(AbstractC111324zv.A00(3292), str);
                c2cg.A03(1900591, hashCode, A1G);
                thumbView.setScrubberThumbnailCallback(this);
            }
            c41584IaX = new C41584IaX(c75363a3);
            thumbView.A04 = c41584IaX;
            c41584IaX.A03.add(thumbView);
            C006802i c006802i2 = C006802i.A0p;
            C14360o3.A07(c006802i2);
            String str2 = c75363a3.A0G;
            C2CG c2cg2 = C2CF.A0D;
            int hashCode2 = str2.hashCode();
            c006802i2.markerStart(1900591, hashCode2);
            HashMap A1G2 = AbstractC166987dD.A1G();
            A1G2.put(AbstractC111324zv.A00(3292), str2);
            c2cg2.A03(1900591, hashCode2, A1G2);
            thumbView.setScrubberThumbnailCallback(this);
        }
    }

    @Override // X.JHW
    public final void Dsz(int i, int i2) {
        this.A01.setVisibility(8);
    }

    @Override // X.JHW
    public final void Elm(Bitmap bitmap, Rect rect, double d, int i, int i2) {
        int i3;
        ThumbView thumbView = this.A04;
        ViewGroup.LayoutParams layoutParams = thumbView.getLayoutParams();
        layoutParams.height = (int) Math.round(layoutParams.width / d);
        int measuredWidth = getMeasuredWidth();
        int i4 = layoutParams.width / 2;
        int i5 = (int) (measuredWidth * ((i * 1.0d) / i2));
        if (i5 < i4) {
            i3 = 0;
        } else {
            i3 = i5 - i4;
            if (i5 >= measuredWidth - i4) {
                i3 = measuredWidth - (i4 * 2);
            }
        }
        this.A00.setLayoutParams(layoutParams);
        ViewGroup viewGroup = this.A01;
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(viewGroup.getLayoutParams());
        layoutParams2.gravity = 8388691;
        ((ViewGroup.MarginLayoutParams) layoutParams2).leftMargin = i3;
        viewGroup.setLayoutParams(layoutParams2);
        this.A02.setText(C23831Eq.A02(i));
        viewGroup.setVisibility(0);
        C41584IaX c41584IaX = thumbView.A04;
        if (c41584IaX != null && !thumbView.A05) {
            C006802i c006802i = C006802i.A0p;
            C14360o3.A07(c006802i);
            c006802i.markerPoint(1900591, c41584IaX.A01.A0G.hashCode(), "thumbnail_drawn");
            thumbView.A05 = true;
        }
        InterfaceC43394JFj interfaceC43394JFj = this.A03;
        if (interfaceC43394JFj != null) {
            int measuredHeight = viewGroup.getMeasuredHeight();
            C37582Ggd c37582Ggd = ((J13) interfaceC43394JFj).A00;
            IgTextView igTextView = c37582Ggd.A04;
            if (igTextView != null) {
                List list = c37582Ggd.A07;
                String str = null;
                if (list != null) {
                    Iterator it = list.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        JLC jlc = (JLC) it.next();
                        Integer Bzr = jlc.Bzr();
                        if (Bzr != null) {
                            int intValue = Bzr.intValue();
                            Integer B2B = jlc.B2B();
                            if (B2B != null) {
                                int intValue2 = B2B.intValue();
                                String BE7 = jlc.BE7();
                                if (BE7 != null && intValue <= i && i <= intValue2) {
                                    str = BE7;
                                    break;
                                }
                            } else {
                                continue;
                            }
                        }
                    }
                }
                igTextView.setText(str);
                FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams(-2, -2);
                layoutParams3.gravity = 8388691;
                ((ViewGroup.MarginLayoutParams) layoutParams3).leftMargin = i3;
                ((ViewGroup.MarginLayoutParams) layoutParams3).bottomMargin = measuredHeight + AbstractC167017dG.A03(igTextView.getContext());
                igTextView.setLayoutParams(layoutParams3);
            }
        }
    }

    public void setScrubberThumbnailPositionListener(InterfaceC43394JFj interfaceC43394JFj) {
        this.A03 = interfaceC43394JFj;
    }

    public ScrubberPreviewThumbnailView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.A03 = null;
        int i2 = R.layout.scrubber_preview_thumbnail_view;
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, AbstractC55922hc.A26, 0, 0);
            try {
                i2 = obtainStyledAttributes.getBoolean(0, false) ? R.layout.scrubber_preview_timestamp_within_thumbnail_view : i2;
            } finally {
                obtainStyledAttributes.recycle();
            }
        }
        View inflate = AbstractC25228BEl.A0P(this).inflate(i2, this);
        this.A01 = (ViewGroup) inflate.requireViewById(R.id.preview_container);
        this.A04 = (ThumbView) inflate.requireViewById(R.id.preview_thumbnail);
        this.A00 = inflate.requireViewById(R.id.preview_thumbnail_border);
        this.A02 = AbstractC166997dE.A0T(inflate, R.id.scrubber_timer_text);
        this.A04.A00 = 30;
    }

    public ScrubberPreviewThumbnailView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }
}
