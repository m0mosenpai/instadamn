package com.instagram.clips.animatedthumbnail;

import X.AbstractC001800i;
import X.C09530e4;
import X.C0f9;
import X.C0w9;
import X.C14360o3;
import X.C35290FhP;
import X.InterfaceC11380iw;
import X.InterfaceC59142nF;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.animation.LinearInterpolator;
import android.widget.ImageView;
import com.instagram.clips.animatedthumbnail.AnimatedThumbnailView;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.common.typedurl.SimpleImageUrl;
import com.instagram.common.ui.widget.imageview.IgImageView;
import com.instagram.igds.components.imagebutton.IgImageButton;
import com.instagram.model.mediasize.SpritesheetInfo;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes3.dex */
public final class AnimatedThumbnailView extends IgImageButton {
    public int A00;
    public float A01;
    public float A02;
    public float A03;
    public int A04;
    public int A05;
    public int A06;
    public ValueAnimator A07;
    public SpritesheetInfo A08;
    public ArrayList A09;
    public boolean A0A;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public AnimatedThumbnailView(Context context) {
        this(context, null);
        C14360o3.A0B(context, 1);
    }

    public static /* synthetic */ void setSpriteSheetInfo$default(AnimatedThumbnailView animatedThumbnailView, SpritesheetInfo spritesheetInfo, InterfaceC11380iw interfaceC11380iw, double d, long j, boolean z, int i, Object obj) {
        boolean z2 = z;
        if ((i & 16) != 0) {
            z2 = false;
        }
        animatedThumbnailView.A0I(interfaceC11380iw, spritesheetInfo, d, j, z2);
    }

    public final void A0I(InterfaceC11380iw interfaceC11380iw, SpritesheetInfo spritesheetInfo, double d, long j, boolean z) {
        C14360o3.A0B(spritesheetInfo, 0);
        C14360o3.A0B(interfaceC11380iw, 1);
        this.A08 = spritesheetInfo;
        this.A01 = (float) d;
        this.A05 = (int) j;
        this.A0A = z;
        Integer C8F = spritesheetInfo.C8F();
        if (C8F != null) {
            this.A04 = C8F.intValue();
            ImageUrl spriteImageUrl = getSpriteImageUrl();
            if (spriteImageUrl != null) {
                setUrl(spriteImageUrl, interfaceC11380iw);
            }
        }
    }

    @Override // com.instagram.igds.components.imagebutton.IgImageButton, com.instagram.common.ui.widget.imageview.IgImageView, android.widget.ImageView, android.view.View
    public final void onDraw(Canvas canvas) {
        SpritesheetInfo spritesheetInfo;
        Integer BzR;
        Integer BzP;
        C14360o3.A0B(canvas, 0);
        if (this.A06 > 0 && getHeight() > 0 && this.A09.size() > this.A00 && (spritesheetInfo = this.A08) != null && (BzR = spritesheetInfo.BzR()) != null) {
            int intValue = BzR.intValue();
            SpritesheetInfo spritesheetInfo2 = this.A08;
            if (spritesheetInfo2 != null && (BzP = spritesheetInfo2.BzP()) != null) {
                if (intValue > BzP.intValue()) {
                    float height = this.A02 * getHeight();
                    float height2 = getHeight() / this.A06;
                    float f = height / this.A04;
                    Object obj = this.A09.get(this.A00);
                    C14360o3.A07(obj);
                    C09530e4 c09530e4 = (C09530e4) obj;
                    float floatValue = (((Number) c09530e4.A00).floatValue() * f) + ((height - getWidth()) / 2.0f);
                    float floatValue2 = (((Number) c09530e4.A01).floatValue() * height2) + 0.0f;
                    canvas.save();
                    float f2 = this.A03;
                    canvas.scale(f2, f2);
                    canvas.translate(floatValue, floatValue2);
                    super.onDraw(canvas);
                    canvas.restore();
                    return;
                }
                C0w9.A03("AnimatedThumbnailView", "sprite sheet dimension is not supported");
            }
        }
    }

    /* JADX WARN: Type inference failed for: r1v3, types: [X.0pQ, java.lang.Object] */
    public static final void A01(AnimatedThumbnailView animatedThumbnailView) {
        Float C80;
        ValueAnimator valueAnimator = animatedThumbnailView.A07;
        int i = 1;
        if (valueAnimator != null && valueAnimator.isRunning()) {
            return;
        }
        ValueAnimator valueAnimator2 = animatedThumbnailView.A07;
        if (valueAnimator2 != null && valueAnimator2.isStarted()) {
            return;
        }
        int totalAnimationFrames = animatedThumbnailView.getTotalAnimationFrames();
        if (animatedThumbnailView.getTotalAnimationFrames() <= 0) {
            return;
        }
        float f = animatedThumbnailView.A01;
        if (f == 0.0f) {
            SpritesheetInfo spritesheetInfo = animatedThumbnailView.A08;
            if (spritesheetInfo != null && (C80 = spritesheetInfo.C80()) != null) {
                f = C80.floatValue() * totalAnimationFrames;
            } else {
                f = 0.0f;
            }
        }
        ValueAnimator ofInt = ValueAnimator.ofInt(0, totalAnimationFrames - 1);
        if (ofInt != null) {
            ofInt.setInterpolator(new LinearInterpolator());
            ofInt.setDuration(f * 1000.0f);
            if (!animatedThumbnailView.A0A) {
                i = 2;
            }
            ofInt.setRepeatMode(i);
            ofInt.setRepeatCount(-1);
            ofInt.addUpdateListener(new C35290FhP(animatedThumbnailView, new Object()));
            ofInt.start();
        } else {
            ofInt = null;
        }
        animatedThumbnailView.A07 = ofInt;
    }

    private final ArrayList getListOfCoordinates() {
        ArrayList arrayList = new ArrayList();
        int i = this.A06;
        for (int i2 = 0; i2 < i; i2++) {
            int i3 = this.A04;
            for (int i4 = 0; i4 < i3; i4++) {
                arrayList.add(new C09530e4(Integer.valueOf(-i4), Integer.valueOf(-i2)));
            }
        }
        return arrayList;
    }

    private final ImageUrl getSpriteImageUrl() {
        List BzQ;
        ImageUrl imageUrl;
        SpritesheetInfo spritesheetInfo = this.A08;
        if (spritesheetInfo == null || (BzQ = spritesheetInfo.BzQ()) == null || (imageUrl = (ImageUrl) AbstractC001800i.A0O(BzQ, 0)) == null) {
            return null;
        }
        return new SimpleImageUrl(imageUrl);
    }

    private final int getTotalAnimationFrames() {
        int i;
        Integer BQ8;
        Integer C9x;
        SpritesheetInfo spritesheetInfo = this.A08;
        int i2 = 0;
        if (spritesheetInfo != null && (C9x = spritesheetInfo.C9x()) != null) {
            i = C9x.intValue();
        } else {
            i = 0;
        }
        SpritesheetInfo spritesheetInfo2 = this.A08;
        if (spritesheetInfo2 != null && (BQ8 = spritesheetInfo2.BQ8()) != null) {
            i2 = BQ8.intValue();
        }
        int min = Math.min(i, i2);
        int i3 = this.A05;
        if (i3 != 0) {
            return Math.min(i3, min);
        }
        return min;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setUpThumbnailDimensions(Bitmap bitmap) {
        Integer BzR;
        Integer C82;
        Integer C8D;
        Integer BzP;
        SpritesheetInfo spritesheetInfo = this.A08;
        if (spritesheetInfo != null && (BzR = spritesheetInfo.BzR()) != null) {
            float intValue = BzR.intValue() / bitmap.getWidth();
            SpritesheetInfo spritesheetInfo2 = this.A08;
            if (spritesheetInfo2 != null && (C82 = spritesheetInfo2.C82()) != null) {
                int intValue2 = C82.intValue();
                SpritesheetInfo spritesheetInfo3 = this.A08;
                if (spritesheetInfo3 != null && (C8D = spritesheetInfo3.C8D()) != null) {
                    float width = bitmap.getWidth() / (C8D.intValue() / intValue);
                    float height = bitmap.getHeight() / (intValue2 / intValue);
                    SpritesheetInfo spritesheetInfo4 = this.A08;
                    if (spritesheetInfo4 != null && (BzP = spritesheetInfo4.BzP()) != null) {
                        this.A06 = BzP.intValue() / intValue2;
                        this.A02 = bitmap.getWidth() / bitmap.getHeight();
                        if (width > height) {
                            width = height;
                        }
                        this.A03 = width;
                        this.A09 = getListOfCoordinates();
                    }
                }
            }
        }
    }

    @Override // com.instagram.common.ui.widget.imageview.IgImageView, android.widget.ImageView, android.view.View
    public final void onAttachedToWindow() {
        int A06 = C0f9.A06(1257573375);
        super.onAttachedToWindow();
        if (this.A07 == null) {
            A01(this);
        }
        C0f9.A0D(-2079346015, A06);
    }

    @Override // com.instagram.common.ui.widget.imageview.IgImageView, android.widget.ImageView, android.view.View
    public final void onDetachedFromWindow() {
        int A06 = C0f9.A06(500263684);
        super.onDetachedFromWindow();
        ValueAnimator valueAnimator = this.A07;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        this.A07 = null;
        C0f9.A0D(2019929606, A06);
    }

    public /* synthetic */ AnimatedThumbnailView(Context context, AttributeSet attributeSet, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i & 2) != 0 ? null : attributeSet);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AnimatedThumbnailView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        C14360o3.A0B(context, 1);
        this.A03 = 1.0f;
        this.A09 = new ArrayList();
        this.A02 = 1.0f;
        setScaleType(ImageView.ScaleType.CENTER_CROP);
        ((IgImageView) this).A0I = new InterfaceC59142nF() { // from class: X.5ug
            @Override // X.InterfaceC59142nF
            public final Bitmap renderImage(Bitmap bitmap) {
                C14360o3.A0B(bitmap, 0);
                AnimatedThumbnailView animatedThumbnailView = AnimatedThumbnailView.this;
                animatedThumbnailView.setUpThumbnailDimensions(bitmap);
                AnimatedThumbnailView.A01(animatedThumbnailView);
                return bitmap;
            }
        };
    }
}
