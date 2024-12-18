package com.instagram.igds.components.faceswarm;

import X.AbstractC001800i;
import X.AbstractC13880nE;
import X.AbstractC166987dD;
import X.AbstractC166997dE;
import X.AbstractC167017dG;
import X.AbstractC25225BEi;
import X.AbstractC25229BEm;
import X.BR8;
import X.C09530e4;
import X.C14360o3;
import X.C25547BRj;
import X.C3PZ;
import X.C7I;
import X.C7Y;
import X.C89533yt;
import X.C9C2;
import X.InterfaceC11380iw;
import X.XNN;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import com.instagram.common.typedurl.ImageUrl;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes5.dex */
public final class IgdsFaceSwarmDrawable extends Drawable implements Drawable.Callback {
    public final InterfaceC11380iw analyticsModule;
    public final Paint bitmapPaint;
    public Bitmap cachedBitmap;
    public final Context context;
    public float customFaceSwarmSizeDp;
    public final ArrayList drawables;
    public float faceSwarmScaleRatio;
    public List items;
    public int maxFaceSwarmItems;
    public int preferredFourItemTemplateIndex;
    public int preferredThreeItemTemplateIndex;
    public int size;
    public C25547BRj template;

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        C14360o3.A0B(canvas, 0);
        C25547BRj c25547BRj = this.template;
        if (c25547BRj != null) {
            Bitmap bitmap = this.cachedBitmap;
            if (bitmap == null) {
                bitmap = Bitmap.createBitmap(getBounds().width(), getBounds().height(), Bitmap.Config.ARGB_8888);
                this.cachedBitmap = bitmap;
                if (bitmap == null) {
                    throw AbstractC166987dD.A14("Required value was null.");
                }
            }
            bitmap.eraseColor(0);
            Canvas canvas2 = new Canvas(bitmap);
            int size = this.drawables.size();
            int i = this.maxFaceSwarmItems;
            if (size > i) {
                size = i;
            }
            for (int i2 = 0; i2 < size; i2++) {
                canvas2.save();
                Object obj = this.drawables.get(i2);
                C14360o3.A07(obj);
                BR8 br8 = (BR8) AbstractC25225BEi.A13(c25547BRj.A01, i2);
                Context context = this.context;
                Point point = br8.A02;
                canvas2.translate(AbstractC13880nE.A04(context, point.x), AbstractC13880nE.A04(this.context, point.y));
                ((Drawable) obj).draw(canvas2);
                canvas2.restore();
            }
            canvas.drawBitmap(bitmap, getBounds().left, getBounds().top, this.bitmapPaint);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public void onBoundsChange(Rect rect) {
        C14360o3.A0B(rect, 0);
        int width = rect.width();
        int height = rect.height();
        if (width > height) {
            width = height;
        }
        if (width != this.size) {
            this.size = width;
            this.faceSwarmScaleRatio = (this.size * 1.0f) / ((int) AbstractC13880nE.A00(this.context, 72.0f));
            setup();
        }
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
    }

    public final void setCustomSizeDp(int i) {
        this.customFaceSwarmSizeDp = i;
    }

    public final void setFaceSwarmItems(List list, InterfaceC11380iw interfaceC11380iw) {
        C14360o3.A0B(list, 0);
        this.items = list;
        setup();
    }

    public final void setPreferredFourItemTemplate(C7Y c7y) {
        C14360o3.A0B(c7y, 0);
        this.preferredFourItemTemplateIndex = c7y.A00;
    }

    public final void setPreferredThreeItemTemplate(C7I c7i) {
        C14360o3.A0B(c7i, 0);
        this.preferredThreeItemTemplateIndex = c7i.A00;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void unscheduleDrawable(Drawable drawable, Runnable runnable) {
    }

    private final void setup() {
        Drawable drawable;
        C09530e4 A00 = C3PZ.A00(this.customFaceSwarmSizeDp, false, false);
        this.faceSwarmScaleRatio = AbstractC166987dD.A09(A00.A00);
        this.maxFaceSwarmItems = AbstractC25229BEm.A0A(A00);
        this.drawables.clear();
        if (AbstractC166987dD.A1b(this.items) && this.size > -1) {
            this.template = XNN.A00(this.faceSwarmScaleRatio, AbstractC001800i.A0d(this.items, this.maxFaceSwarmItems).size(), this.preferredThreeItemTemplateIndex, this.preferredFourItemTemplateIndex, 0);
            int size = this.items.size();
            int i = this.maxFaceSwarmItems;
            if (size > i) {
                size = i;
            }
            for (int i2 = 0; i2 < size; i2++) {
                C9C2 c9c2 = (C9C2) this.items.get(i2);
                Context context = this.context;
                C25547BRj c25547BRj = this.template;
                if (c25547BRj != null) {
                    int A0C = AbstractC166987dD.A0C(context, (int) ((BR8) AbstractC25225BEi.A13(c25547BRj.A01, i2)).A00);
                    ImageUrl imageUrl = (ImageUrl) c9c2.A01;
                    if (imageUrl != null) {
                        drawable = new C89533yt(imageUrl, this.analyticsModule.getModuleName(), A0C, 0, 0, 0);
                        drawable.setCallback(this);
                    } else {
                        drawable = (Drawable) c9c2.A00;
                        if (drawable != null) {
                            drawable.setCallback(this);
                            drawable.setBounds(0, 0, A0C, this.size);
                        }
                    }
                    this.drawables.add(drawable);
                } else {
                    throw AbstractC166997dE.A0g();
                }
            }
        }
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i) {
        Iterator it = this.drawables.iterator();
        C14360o3.A07(it);
        while (it.hasNext()) {
            Object next = it.next();
            C14360o3.A07(next);
            ((Drawable) next).setAlpha(i);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        Iterator it = this.drawables.iterator();
        C14360o3.A07(it);
        while (it.hasNext()) {
            Object next = it.next();
            C14360o3.A07(next);
            ((Drawable) next).setColorFilter(colorFilter);
        }
    }

    public IgdsFaceSwarmDrawable(Context context, InterfaceC11380iw interfaceC11380iw) {
        AbstractC167017dG.A1P(context, interfaceC11380iw);
        this.context = context;
        this.analyticsModule = interfaceC11380iw;
        this.size = -1;
        this.maxFaceSwarmItems = 4;
        this.customFaceSwarmSizeDp = 72.0f;
        this.faceSwarmScaleRatio = 1.0f;
        this.items = AbstractC166987dD.A1E();
        this.drawables = AbstractC166987dD.A1E();
        this.bitmapPaint = AbstractC166997dE.A0Q();
    }

    public final InterfaceC11380iw getAnalyticsModule() {
        return this.analyticsModule;
    }

    public final Context getContext() {
        return this.context;
    }

    public final void setImageUrls(List list, InterfaceC11380iw interfaceC11380iw) {
        AbstractC167017dG.A1N(list, interfaceC11380iw);
        ArrayList A0q = AbstractC167017dG.A0q(list);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            A0q.add(new C9C2((Drawable) null, (ImageUrl) it.next(), (String) null, 6));
        }
        setFaceSwarmItems(A0q, interfaceC11380iw);
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void invalidateDrawable(Drawable drawable) {
        invalidateSelf();
    }
}
