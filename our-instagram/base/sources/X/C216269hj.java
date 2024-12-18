package X;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.reels.question.model.QuestionResponseReshareModel;
import com.instagram.reels.questionv2.model.QuestionMediaResponseModelIntf;
import java.util.List;

/* renamed from: X.9hj, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C216269hj extends C5RN implements InterfaceC25171BBr, BCC {
    public int A00;
    public Drawable A01;
    public final int A02;
    public final Context A03;
    public final C221159pd A04;
    public final Float A05;
    public final QuestionResponseReshareModel A06;

    @Override // X.C5RN
    public final List A07() {
        return AbstractC16960so.A1N(this.A01, this.A04);
    }

    public final int A08() {
        QuestionMediaResponseModelIntf questionMediaResponseModelIntf = this.A06.A04;
        if (questionMediaResponseModelIntf != null) {
            Integer BRq = questionMediaResponseModelIntf.BRq();
            if (BRq != null) {
                return BRq.intValue();
            }
            throw AbstractC166987dD.A14("Required value was null.");
        }
        throw AbstractC166987dD.A14("Required value was null.");
    }

    @Override // X.InterfaceC25171BBr
    public final Drawable Ad0() {
        return this.A01;
    }

    @Override // X.BCC
    public final C22932A9c Bjc() {
        return this.A06.A02;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        int i;
        Drawable drawable = this.A01;
        if (drawable != null) {
            i = drawable.getIntrinsicHeight();
        } else {
            i = 0;
        }
        return i + this.A04.A01;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return this.A02;
    }

    public C216269hj(Context context, Drawable drawable, ImageUrl imageUrl, QuestionResponseReshareModel questionResponseReshareModel, C221159pd c221159pd, Float f, int i, int i2) {
        this.A03 = context;
        this.A01 = drawable;
        this.A04 = c221159pd;
        this.A06 = questionResponseReshareModel;
        this.A02 = i;
        this.A00 = i2;
        this.A05 = f;
        if (imageUrl != null) {
            C1OG A0J = C25821No.A00().A0J(imageUrl, null);
            A0J.A02(new C23596Acq(this, 6));
            A0J.A01();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        AbstractC167007dF.A0r(canvas);
        AbstractC167007dF.A0s(canvas, AbstractC166987dD.A0W(this));
        this.A04.draw(canvas);
        canvas.translate(0.0f, r0.A01);
        Drawable drawable = this.A01;
        if (drawable != null) {
            drawable.draw(canvas);
        }
        canvas.restore();
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        invalidateSelf();
    }
}
