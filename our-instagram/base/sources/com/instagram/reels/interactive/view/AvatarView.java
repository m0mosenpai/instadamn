package com.instagram.reels.interactive.view;

import X.AbstractC55922hc;
import X.C0f9;
import X.C17N;
import X.C9SG;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import com.instagram.common.typedurl.ImageUrl;

/* loaded from: classes4.dex */
public class AvatarView extends View {
    public final C9SG A00;

    public AvatarView(Context context) {
        this(context, null);
    }

    public void setAvatarSecondaryStrokeColor(int i) {
        C9SG c9sg = this.A00;
        c9sg.A04.setColor(i);
        c9sg.invalidateSelf();
    }

    public void setAvatarSecondaryStrokeWidth(int i) {
        C9SG c9sg = this.A00;
        c9sg.A00 = i;
        c9sg.invalidateSelf();
    }

    public void setAvatarUrl(ImageUrl imageUrl) {
        this.A00.A00(imageUrl);
    }

    public void setAvatarUser(C17N c17n) {
        this.A00.A00(c17n.Bhu());
    }

    public void setStrokeColor(int i) {
        C9SG c9sg = this.A00;
        c9sg.A05.setColor(i);
        c9sg.invalidateSelf();
    }

    public void setStrokeWidth(int i) {
        C9SG c9sg = this.A00;
        c9sg.A01 = i;
        c9sg.invalidateSelf();
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        int A03 = C0f9.A03(-2059590778);
        super.draw(canvas);
        this.A00.draw(canvas);
        C0f9.A0A(84522386, A03);
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        int A06 = C0f9.A06(-823627433);
        super.onSizeChanged(i, i2, i3, i4);
        this.A00.setBounds(0, 0, i, i2);
        C0f9.A0D(-1084320302, A06);
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        if (!super.verifyDrawable(drawable) && drawable != this.A00) {
            return false;
        }
        return true;
    }

    public AvatarView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C9SG c9sg = new C9SG(context);
        this.A00 = c9sg;
        c9sg.setCallback(this);
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, AbstractC55922hc.A03);
        setStrokeColor(obtainStyledAttributes.getColor(0, 0));
        setStrokeWidth(obtainStyledAttributes.getDimensionPixelSize(1, 0));
        obtainStyledAttributes.recycle();
    }

    public AvatarView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }
}
