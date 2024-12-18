package com.instagram.ui.widget.balloonsview;

import X.AbstractC166987dD;
import X.AbstractC166997dE;
import X.AbstractC31172DnG;
import X.AbstractC31173DnH;
import X.AbstractC70163Da;
import X.B4Z;
import X.C14360o3;
import X.C16930sl;
import X.C1OG;
import X.C25821No;
import X.C47716L4x;
import X.C48271LXu;
import X.EnumC46153Kbr;
import X.JQ0;
import X.MPI;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.view.View;
import com.facebook.R;
import com.instagram.common.typedurl.ImageUrl;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes8.dex */
public final class BalloonsView extends View {
    public static final Random A0C = new Random();
    public MPI A00;
    public EnumC46153Kbr A01;
    public boolean A02;
    public boolean A03;
    public float A04;
    public long A05;
    public final Paint A06;
    public final RectF A07;
    public final List A08;
    public final int A09;
    public final int A0A;
    public final ArrayList A0B;

    public final void setBalloonType(EnumC46153Kbr enumC46153Kbr) {
        C14360o3.A0B(enumC46153Kbr, 0);
        if (enumC46153Kbr != this.A01) {
            setupBalloons(enumC46153Kbr);
        }
        this.A01 = enumC46153Kbr;
    }

    public static final void A00(BalloonsView balloonsView) {
        if (!balloonsView.A03) {
            C14360o3.A06(balloonsView.A08);
            if (!r0.isEmpty()) {
                balloonsView.A03 = true;
                balloonsView.postInvalidateOnAnimation();
                balloonsView.A05 = SystemClock.elapsedRealtime();
            }
        }
    }

    private final void setupBalloons(EnumC46153Kbr enumC46153Kbr) {
        ArrayList arrayList = this.A0B;
        arrayList.clear();
        int ordinal = enumC46153Kbr.ordinal();
        int i = 12;
        if (ordinal != 0) {
            if (ordinal != 1 && ordinal != 2) {
                throw B4Z.A00();
            }
        } else {
            i = 24;
        }
        int i2 = 0;
        do {
            arrayList.add(new C47716L4x(enumC46153Kbr, this.A09));
            i2++;
        } while (i2 < i);
    }

    public final boolean getAnimateTopToBottom() {
        return this.A02;
    }

    public final MPI getAnimationListener() {
        return this.A00;
    }

    public final EnumC46153Kbr getBalloonType() {
        return this.A01;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        float f;
        int i;
        C14360o3.A0B(canvas, 0);
        if (this.A03) {
            int height = canvas.getHeight();
            this.A04 = getWidth() / 8;
            ArrayList arrayList = this.A0B;
            int size = arrayList.size();
            boolean z = false;
            for (int i2 = 0; i2 < size; i2++) {
                C47716L4x c47716L4x = (C47716L4x) AbstractC31173DnH.A0i(arrayList, i2);
                if (c47716L4x.A00 == null) {
                    List list = this.A08;
                    c47716L4x.A00 = (Bitmap) list.get(A0C.nextInt(list.size()));
                }
                Bitmap bitmap = c47716L4x.A00;
                if (bitmap != null) {
                    long elapsedRealtime = SystemClock.elapsedRealtime() - this.A05;
                    if (elapsedRealtime >= 0) {
                        float f2 = (float) elapsedRealtime;
                        if (f2 < c47716L4x.A03) {
                            float f3 = f2 / c47716L4x.A03;
                            int height2 = bitmap.getHeight() / 2;
                            if (this.A02) {
                                f = height2 + (height * f3 * 0.5f);
                            } else {
                                f = (height - height2) - ((height * f3) * 0.5f);
                            }
                            float f4 = f + ((float) (c47716L4x.A02 * this.A0A));
                            float f5 = this.A04;
                            float f6 = ((float) (c47716L4x.A01 * f5)) + (f5 * (i2 % 8)) + c47716L4x.A07;
                            double d = f3;
                            double sin = (float) ((Math.sin(((c47716L4x.A05 * 6.0f) * 3.141592653589793d) * d) + 1.0d) / 2.0d);
                            double d2 = c47716L4x.A06;
                            float A03 = f6 + ((float) AbstractC70163Da.A03(sin, -d2, d2));
                            float width = bitmap.getWidth() / 2;
                            float f7 = c47716L4x.A04;
                            if (f3 > 0.9f) {
                                f7 = (float) (f7 * AbstractC70163Da.A04(d, 0.8999999761581421d, 1.0d, 1.0d, 1.5d));
                            }
                            float f8 = width * f7;
                            if (f3 > 0.9f) {
                                i = (int) AbstractC70163Da.A04(d, 0.8999999761581421d, 1.0d, 255.0d, 0.0d);
                            } else {
                                i = 255;
                            }
                            RectF rectF = this.A07;
                            rectF.left = A03 - f8;
                            rectF.right = A03 + f8;
                            rectF.top = f4 - f8;
                            rectF.bottom = f4 + f8;
                            Paint paint = this.A06;
                            paint.setAlpha(i);
                            canvas.drawBitmap(bitmap, (Rect) null, rectF, paint);
                            z = true;
                        }
                    }
                } else {
                    throw AbstractC166997dE.A0g();
                }
            }
            if (z) {
                postInvalidateOnAnimation();
                return;
            }
            setupBalloons(this.A01);
            this.A08.clear();
            this.A03 = false;
            MPI mpi = this.A00;
            if (mpi == null) {
                return;
            }
            mpi.Dd0();
        }
    }

    public final void setAnimateTopToBottom(boolean z) {
        this.A02 = z;
    }

    public final void setAnimating(boolean z) {
        this.A03 = z;
    }

    public final void setAnimationListener(MPI mpi) {
        this.A00 = mpi;
    }

    public /* synthetic */ BalloonsView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, JQ0.A0C(attributeSet, i2), JQ0.A03(i2, i));
    }

    public final void A01(ImageUrl imageUrl) {
        List A1J = AbstractC166987dD.A1J(imageUrl);
        C16930sl c16930sl = C16930sl.A00;
        C14360o3.A0B(c16930sl, 1);
        if (!this.A03) {
            List list = this.A08;
            int A02 = AbstractC31172DnG.A02(A1J, list.size());
            if (A02 > 0) {
                Iterator it = c16930sl.iterator();
                while (it.hasNext()) {
                    list.add(it.next());
                }
                if (AbstractC166987dD.A1b(A1J)) {
                    Iterator it2 = A1J.iterator();
                    while (it2.hasNext()) {
                        C1OG A0J = C25821No.A00().A0J((ImageUrl) it2.next(), null);
                        A0J.A02(new C48271LXu(this, A02, 1));
                        A0J.A01();
                    }
                    return;
                }
                A00(this);
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BalloonsView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C14360o3.A0B(context, 1);
        this.A08 = Collections.synchronizedList(AbstractC166987dD.A1E());
        this.A09 = context.getResources().getDimensionPixelSize(R.dimen.action_sheet_divider_margin_top);
        this.A0A = context.getResources().getDimensionPixelSize(R.dimen.achievements_list_container_height);
        this.A07 = AbstractC166987dD.A0X();
        this.A06 = AbstractC166987dD.A0S(1);
        this.A0B = AbstractC166987dD.A1E();
        EnumC46153Kbr enumC46153Kbr = EnumC46153Kbr.A02;
        this.A01 = enumC46153Kbr;
        setupBalloons(enumC46153Kbr);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public BalloonsView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        C14360o3.A0B(context, 1);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public BalloonsView(Context context) {
        this(context, null, 0);
        C14360o3.A0B(context, 1);
    }
}
