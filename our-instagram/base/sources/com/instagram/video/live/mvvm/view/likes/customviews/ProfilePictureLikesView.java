package com.instagram.video.live.mvvm.view.likes.customviews;

import X.AbstractC13620mo;
import X.AbstractC166987dD;
import X.AbstractC25225BEi;
import X.AbstractC31174DnI;
import X.AbstractC43594JPz;
import X.AbstractC50572MUd;
import X.AbstractC53242c7;
import X.AbstractC54267Nyn;
import X.AbstractC70163Da;
import X.C0f9;
import X.C12550kz;
import X.C14360o3;
import X.C1NJ;
import X.C6RB;
import X.C73053Pg;
import X.JQ0;
import X.OFN;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import android.text.Spannable;
import android.util.AttributeSet;
import android.view.View;
import com.facebook.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.webrtc.CameraVideoCapturer;

/* loaded from: classes9.dex */
public final class ProfilePictureLikesView extends View {
    public C1NJ A00;
    public boolean A01;
    public int A02;
    public long A03;
    public long A04;
    public C12550kz A05;
    public final Bitmap A06;
    public final List A07;
    public final List A08;
    public final List A09;
    public final Map A0A;
    public final Paint A0B;
    public final RectF A0C;
    public final ArrayList A0D;
    public final List A0E;
    public final List A0F;
    public final boolean A0G;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ProfilePictureLikesView(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0);
        C14360o3.A0B(context, 1);
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        int A04;
        float f;
        float width;
        Canvas canvas2;
        OFN ofn;
        ProfilePictureLikesView profilePictureLikesView;
        float width2;
        C14360o3.A0B(canvas, 0);
        int height = canvas.getHeight();
        boolean z = false;
        for (OFN ofn2 : this.A09) {
            long elapsedRealtime = SystemClock.elapsedRealtime() - ofn2.A05;
            if (1 <= elapsedRealtime && elapsedRealtime < 4000) {
                float f2 = ((float) elapsedRealtime) / 4000.0f;
                Bitmap bitmap = this.A06;
                A04(canvas, ofn2, A00(ofn2, f2), (height - (bitmap.getHeight() / 2)) - (height * f2), bitmap.getWidth() / 2, AbstractC54267Nyn.A00(f2, ofn2.A00 + 0.05f));
                z = true;
            }
        }
        for (OFN ofn3 : this.A08) {
            long elapsedRealtime2 = SystemClock.elapsedRealtime() - ofn3.A05;
            if (1 <= elapsedRealtime2 && elapsedRealtime2 < 4000) {
                float f3 = ((float) elapsedRealtime2) / 4000.0f;
                Bitmap bitmap2 = this.A06;
                A04(canvas, ofn3, A00(ofn3, f3), (height - (bitmap2.getHeight() / 2)) - (height * f3), bitmap2.getWidth() / 2, AbstractC54267Nyn.A00(f3, ofn3.A00 + 0.05f));
                z = true;
            }
        }
        for (OFN ofn4 : this.A07) {
            long elapsedRealtime3 = SystemClock.elapsedRealtime() - ofn4.A05;
            if (1 <= elapsedRealtime3 && elapsedRealtime3 < 4000) {
                float f4 = ((float) elapsedRealtime3) / 4000.0f;
                Bitmap bitmap3 = this.A06;
                float height2 = (height - (bitmap3.getHeight() / 2)) - (height * f4);
                float A00 = A00(ofn4, f4);
                float f5 = ofn4.A00;
                float f6 = 0.05f + f5;
                int A002 = AbstractC54267Nyn.A00(f4, f6);
                if (f4 < 0.07f) {
                    width2 = bitmap3.getWidth() / 2.0f;
                } else if (f4 < f5) {
                    width2 = bitmap3.getWidth() / 2.0f;
                    A002 = 255;
                } else {
                    if (f4 < f6) {
                        float A042 = (float) AbstractC70163Da.A04(f4, f5, f6, 0.0d, 1.0d);
                        f = height2;
                        canvas2 = canvas;
                        ofn = ofn4;
                        profilePictureLikesView = this;
                        profilePictureLikesView.A03(canvas2, ofn, A00, f, (int) (((1.0f + (A042 / 2.0f)) * bitmap3.getWidth()) / 2.0f), (int) ((1.0f - A042) * 255.0f));
                        A002 = 255;
                        width = (int) ((A042 * bitmap3.getWidth()) / 2.0f);
                    } else {
                        f = height2;
                        width = bitmap3.getWidth() / 2;
                        canvas2 = canvas;
                        ofn = ofn4;
                        profilePictureLikesView = this;
                    }
                    profilePictureLikesView.A04(canvas2, ofn, A00, f, width, A002);
                    z = true;
                }
                A03(canvas, ofn4, A00, height2, width2, A002);
                z = true;
            }
        }
        for (OFN ofn5 : this.A0F) {
            long elapsedRealtime4 = SystemClock.elapsedRealtime() - ofn5.A05;
            if (elapsedRealtime4 > 0) {
                if (elapsedRealtime4 < ofn5.A01) {
                    float pow = (float) Math.pow(3.0f * (((float) elapsedRealtime4) / r8), 0.6000000238418579d);
                    float f7 = height;
                    A04(canvas, ofn5, getHeartsColumnCenterX() + (ofn5.A04 * ofn5.A02 * pow), f7 - (pow * f7), 0.0f, AbstractC54267Nyn.A00(pow, ofn5.A00 + 0.05f));
                    z = true;
                }
            }
        }
        for (OFN ofn6 : this.A0E) {
            long elapsedRealtime5 = SystemClock.elapsedRealtime() - ofn6.A05;
            if (1 <= elapsedRealtime5 && elapsedRealtime5 < 4000) {
                float f8 = ((float) elapsedRealtime5) / 4000.0f;
                float f9 = height;
                float f10 = f9 - (f8 * f9);
                float A003 = A00(ofn6, f8);
                if (f8 > 0.1f) {
                    A04 = 0;
                } else {
                    A04 = (int) AbstractC70163Da.A04(f8, 0.0d, 0.10000000149011612d, 0.0d, 0.0d);
                }
                A04(canvas, ofn6, A003, f10, A04, AbstractC54267Nyn.A00(f8, ofn6.A00 + 0.05f));
                z = true;
            }
        }
        if (z) {
            postInvalidateOnAnimation();
        }
    }

    private final OFN A01(Bitmap bitmap, String str, long j, boolean z) {
        OFN ofn = (OFN) this.A05.A7H();
        if (ofn == null) {
            ofn = new OFN();
        }
        Paint A0R = AbstractC166987dD.A0R();
        Spannable spannable = C6RB.A0d;
        C6RB c6rb = new C6RB(getContext(), this.A06.getWidth());
        c6rb.A0M(str);
        c6rb.A0A(48.0f);
        Bitmap A00 = AbstractC50572MUd.A00(c6rb);
        Resources resources = getResources();
        C14360o3.A07(resources);
        ofn.A05 = j;
        double random = Math.random();
        int i = 1;
        if (random < 0.5d) {
            i = -1;
        }
        ofn.A04 = i;
        ofn.A00 = 0.1f;
        if (z) {
            ofn.A00 = 0.1f + (ofn.A09.nextFloat() * 0.3f);
        }
        ofn.A01 = CameraVideoCapturer.CameraStatistics.CAMERA_FREEZE_REPORT_TIMOUT_MS;
        int dimensionPixelSize = resources.getDimensionPixelSize(R.dimen.accent_edge_thickness);
        ofn.A03 = ofn.A09.nextInt(dimensionPixelSize * 2) - dimensionPixelSize;
        ofn.A02 = (int) (random * dimensionPixelSize);
        if (bitmap != null) {
            C73053Pg c73053Pg = new C73053Pg(bitmap, false);
            ofn.A08 = c73053Pg;
            c73053Pg.setBounds(0, 0, bitmap.getWidth(), bitmap.getHeight());
        } else {
            ofn.A08 = null;
        }
        ofn.A06 = A00;
        ofn.A07 = A0R;
        return ofn;
    }

    public static final void A02(Bitmap bitmap, ProfilePictureLikesView profilePictureLikesView, String str, boolean z) {
        List list;
        long max;
        Bitmap bitmap2 = bitmap;
        if (bitmap2 != null) {
            list = profilePictureLikesView.A07;
            if (list.size() < 200) {
                long random = (long) (1.0d * (100.0d + (300.0d * Math.random())));
                if (z) {
                    max = SystemClock.elapsedRealtime();
                } else {
                    max = Math.max(SystemClock.elapsedRealtime(), profilePictureLikesView.A03 + random);
                }
                profilePictureLikesView.A03 = max;
            } else {
                return;
            }
        } else {
            list = profilePictureLikesView.A08;
            if (list.size() >= 200) {
                return;
            }
            if (z) {
                max = SystemClock.elapsedRealtime();
            } else {
                max = Math.max(SystemClock.elapsedRealtime(), profilePictureLikesView.A04 + ((long) (1.0d * (100.0d + (300.0d * Math.random())))));
                profilePictureLikesView.A04 = max;
            }
            bitmap2 = null;
        }
        list.add(profilePictureLikesView.A01(bitmap2, str, max, z));
    }

    private final void A04(Canvas canvas, OFN ofn, float f, float f2, float f3, int i) {
        RectF rectF = this.A0C;
        rectF.left = f - f3;
        rectF.right = f + f3;
        rectF.top = f2 - f3;
        rectF.bottom = f2 + f3;
        Paint paint = ofn.A07;
        if (paint != null) {
            paint.setAlpha(i);
        }
        Bitmap bitmap = ofn.A06;
        if (bitmap != null) {
            canvas.drawBitmap(bitmap, (Rect) null, rectF, paint);
        }
    }

    private final int getHeartsColumnCenterX() {
        if (this.A0G) {
            return getLeft() + (this.A02 / 2);
        }
        return getRight() - (this.A02 / 2);
    }

    private final float A00(OFN ofn, float f) {
        float heartsColumnCenterX = getHeartsColumnCenterX() + ofn.A03;
        double sin = (float) ((Math.sin(((ofn.A04 * 6) * 3.141592653589793d) * f) + 1.0d) / 2.0d);
        double d = ofn.A02;
        return heartsColumnCenterX + ((float) AbstractC70163Da.A03(sin, -d, d));
    }

    private final void A03(Canvas canvas, OFN ofn, float f, float f2, float f3, int i) {
        canvas.save();
        canvas.translate(f, f2);
        Paint paint = ofn.A07;
        if (paint != null) {
            this.A0B.setColorFilter(paint.getColorFilter());
        }
        Paint paint2 = this.A0B;
        paint2.setAlpha(i);
        canvas.drawCircle(0.0f, 0.0f, f3, paint2);
        Drawable drawable = ofn.A08;
        if (drawable != null) {
            float intrinsicWidth = (2.0f * f3) / drawable.getIntrinsicWidth();
            float f4 = -f3;
            canvas.translate(f4, f4);
            canvas.scale(intrinsicWidth, intrinsicWidth);
            drawable.setAlpha(i);
            drawable.draw(canvas);
            canvas.restore();
        }
    }

    public static final void A05(ProfilePictureLikesView profilePictureLikesView, List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            OFN ofn = (OFN) it.next();
            if (SystemClock.elapsedRealtime() - ofn.A05 > ofn.A01) {
                it.remove();
                profilePictureLikesView.A05.EE6(ofn);
            }
        }
    }

    @Override // android.view.View
    public final void onAttachedToWindow() {
        int A06 = C0f9.A06(1360959763);
        super.onAttachedToWindow();
        this.A01 = true;
        C0f9.A0D(287862490, A06);
    }

    @Override // android.view.View
    public final void onDetachedFromWindow() {
        int A06 = C0f9.A06(-1871599809);
        super.onDetachedFromWindow();
        this.A01 = false;
        C0f9.A0D(-1546883154, A06);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ProfilePictureLikesView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 0);
        C14360o3.A0B(context, 1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ProfilePictureLikesView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        C14360o3.A0B(context, 1);
        this.A05 = new C12550kz(583);
        this.A09 = AbstractC166987dD.A1E();
        this.A08 = AbstractC166987dD.A1E();
        this.A07 = AbstractC166987dD.A1E();
        this.A0F = AbstractC166987dD.A1E();
        this.A0E = AbstractC166987dD.A1E();
        Resources resources = getResources();
        Bitmap decodeResource = BitmapFactory.decodeResource(resources, R.drawable.live_like);
        C14360o3.A07(decodeResource);
        this.A06 = decodeResource;
        Paint paint = new Paint(1);
        this.A0B = paint;
        this.A0C = AbstractC166987dD.A0X();
        this.A0G = AbstractC13620mo.A02(context);
        ArrayList A1E = AbstractC166987dD.A1E();
        this.A0D = A1E;
        this.A0A = AbstractC166987dD.A1G();
        paint.setStyle(Paint.Style.STROKE);
        paint.setColorFilter(AbstractC31174DnI.A09(context, R.color.fds_white_alpha90));
        paint.setStrokeWidth(AbstractC166987dD.A04(resources, R.dimen.account_recs_header_image_margin));
        this.A02 = AbstractC43594JPz.A03(context);
        int i3 = 0;
        int[] iArr = {AbstractC53242c7.A0H(context, R.attr.igds_color_gradient_red), R.color.activator_card_progress_bad, AbstractC53242c7.A0H(context, R.attr.igds_color_gradient_yellow), R.color.igds_active_badge, AbstractC53242c7.A0H(context, R.attr.igds_color_gradient_blue), AbstractC53242c7.A0H(context, R.attr.igds_color_gradient_purple)};
        ArrayList A17 = AbstractC25225BEi.A17(6);
        do {
            int i4 = iArr[i3];
            Paint paint2 = new Paint(1);
            paint2.setStyle(Paint.Style.FILL);
            paint2.setColorFilter(new PorterDuffColorFilter(getContext().getColor(i4), PorterDuff.Mode.SRC_IN));
            A17.add(paint2);
            i3++;
        } while (i3 < 6);
        A1E.addAll(A17);
    }

    public /* synthetic */ ProfilePictureLikesView(Context context, AttributeSet attributeSet, int i, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, JQ0.A0C(attributeSet, i3), JQ0.A03(i3, i), (i3 & 8) != 0 ? 0 : i2);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ProfilePictureLikesView(Context context) {
        this(context, null, 0, 0);
        C14360o3.A0B(context, 1);
    }
}
