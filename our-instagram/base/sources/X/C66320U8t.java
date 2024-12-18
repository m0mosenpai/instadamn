package X;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.common.typedurl.SimpleImageUrl;
import com.instagram.model.mediasize.SpritesheetInfo;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.U8t, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C66320U8t extends Drawable implements C1NJ {
    public int A00;
    public List A01;
    public Bitmap A02;
    public final SpritesheetInfo A03;
    public final float A04;
    public final int A05;
    public final int A06;
    public final Rect A08;
    public final C69163Vis A0A;
    public final InterfaceC71960XCm A0B;
    public final boolean A0C;
    public final RectF A09 = new RectF();
    public final Paint A07 = new Paint(1);

    public C66320U8t(SpritesheetInfo spritesheetInfo, InterfaceC71960XCm interfaceC71960XCm, float f) {
        float f2;
        int i;
        ImageUrl imageUrl;
        this.A03 = spritesheetInfo;
        this.A04 = f;
        this.A0B = interfaceC71960XCm;
        this.A0A = new C69163Vis(f);
        int A0K = AbstractC167017dG.A0K(spritesheetInfo.BzR());
        int A0K2 = AbstractC167017dG.A0K(spritesheetInfo.BzP());
        int A0K3 = AbstractC167017dG.A0K(spritesheetInfo.C82());
        this.A05 = A0K3;
        int A0K4 = AbstractC167017dG.A0K(spritesheetInfo.C8D());
        this.A06 = A0K4;
        this.A08 = new Rect();
        int min = Math.min(AbstractC167017dG.A0K(spritesheetInfo.C9x()), AbstractC167017dG.A0K(spritesheetInfo.BQ8()));
        Float C80 = spritesheetInfo.C80();
        if (C80 != null) {
            f2 = C80.floatValue();
        } else {
            f2 = 0.0f;
        }
        long A02 = C1H4.A02(f2 * min * 1000.0f);
        int A0K5 = AbstractC167017dG.A0K(spritesheetInfo.C8F());
        if (A0K3 > 0) {
            i = A0K2 / A0K3;
        } else {
            i = 0;
        }
        ArrayList arrayList = new ArrayList();
        for (int i2 = 0; i2 < i; i2++) {
            for (int i3 = 0; i3 < A0K5; i3++) {
                AbstractC166997dE.A1R(Integer.valueOf(i3), Integer.valueOf(i2), arrayList);
            }
        }
        this.A01 = arrayList;
        List BzQ = this.A03.BzQ();
        SimpleImageUrl simpleImageUrl = null;
        if (BzQ != null && (imageUrl = (ImageUrl) AbstractC001800i.A0J(BzQ)) != null) {
            simpleImageUrl = new SimpleImageUrl(imageUrl);
        }
        boolean z = A0K2 > 0 && A0K > 0 && A0K3 > 0 && A0K4 > 0 && min > 0 && A02 > 0 && A0K5 > 0 && i > 0 && (this.A01.isEmpty() ^ true) && simpleImageUrl != null && A0K > A0K2;
        this.A0C = z;
        if (z) {
            C25821No A00 = C25821No.A00();
            if (simpleImageUrl != null) {
                C1OG A0J = A00.A0J(simpleImageUrl, null);
                A0J.A02(this);
                A0J.A01();
                return;
            }
            throw AbstractC166997dE.A0g();
        }
        C0w9.A03("AnimatedThumbnailDrawable", AbstractC167017dG.A0n(simpleImageUrl, "Spritesheet is invalid: ", new StringBuilder()));
    }

    @Override // X.C1NJ
    public final void Cza(InterfaceC59502nt interfaceC59502nt, C73033Pe c73033Pe) {
        C14360o3.A0B(c73033Pe, 1);
        Bitmap bitmap = c73033Pe.A01;
        if (bitmap != null) {
            this.A02 = bitmap;
            InterfaceC71960XCm interfaceC71960XCm = this.A0B;
            if (interfaceC71960XCm != null) {
                interfaceC71960XCm.DLX(this);
            }
        }
    }

    @Override // X.C1NJ
    public final void DLW(InterfaceC59502nt interfaceC59502nt, int i) {
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        C14360o3.A0B(canvas, 0);
        Bitmap bitmap = this.A02;
        if (bitmap != null && this.A0C) {
            List list = this.A01;
            int size = list.size();
            int i = this.A00;
            if (size > i) {
                C09530e4 c09530e4 = (C09530e4) list.get(i);
                int intValue = ((Number) c09530e4.A00).intValue();
                int i2 = this.A06;
                int i3 = intValue * i2;
                int intValue2 = ((Number) c09530e4.A01).intValue();
                int i4 = this.A05;
                int i5 = intValue2 * i4;
                Rect rect = this.A08;
                rect.left = i3;
                rect.top = i5;
                rect.right = i3 + i2;
                rect.bottom = i5 + i4;
                Path path = this.A0A.A01;
                if (path != null) {
                    int save = canvas.save();
                    canvas.clipPath(path);
                    canvas.drawBitmap(bitmap, rect, getBounds(), this.A07);
                    canvas.restoreToCount(save);
                    return;
                }
                canvas.drawBitmap(bitmap, rect, getBounds(), this.A07);
                return;
            }
        }
        RectF rectF = this.A09;
        float f = this.A04;
        canvas.drawRoundRect(rectF, f, f, this.A07);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        C14360o3.A0B(rect, 0);
        super.onBoundsChange(rect);
        this.A09.set(rect);
        C69163Vis c69163Vis = this.A0A;
        RectF rectF = c69163Vis.A02;
        rectF.set(rect);
        Path path = c69163Vis.A01;
        if (path != null) {
            path.rewind();
            float f = c69163Vis.A00;
            path.addRoundRect(rectF, f, f, Path.Direction.CCW);
        }
    }

    @Override // X.C1NJ
    public final void DLP(InterfaceC59502nt interfaceC59502nt, C82183lf c82183lf) {
        InterfaceC71960XCm interfaceC71960XCm = this.A0B;
        if (interfaceC71960XCm != null) {
            interfaceC71960XCm.DE2();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getAlpha() {
        return this.A07.getAlpha();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        this.A07.setAlpha(i);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        this.A07.setColorFilter(colorFilter);
        invalidateSelf();
    }
}
