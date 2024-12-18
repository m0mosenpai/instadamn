package X;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.RectF;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.TextView;
import com.facebook.R;
import com.instagram.arlink.ui.CoachMarkOverlay;

/* loaded from: classes8.dex */
public final class LIC {
    public static final C55942hf A0C = C55942hf.A01();
    public View A00;
    public View A01;
    public View A02;
    public ViewGroup A03;
    public TextView A04;
    public TextView A05;
    public CoachMarkOverlay A06;
    public Integer A07;
    public final ViewGroup A08;
    public final ViewStub A09;
    public final C55982hj A0A;
    public final C55982hj A0B;

    public static void A00(final LIC lic, final Integer num) {
        int i;
        boolean z;
        int i2;
        int i3;
        boolean z2;
        int i4;
        PorterDuffColorFilter porterDuffColorFilter;
        if (lic.A07 != num) {
            lic.A07 = num;
            ViewGroup viewGroup = lic.A08;
            int intValue = num.intValue();
            switch (intValue) {
                case 0:
                    i = R.id.card_view;
                    break;
                case 1:
                    i = R.id.background_mode_button;
                    break;
                default:
                    i = R.id.profile_share_card;
                    break;
            }
            final View requireViewById = viewGroup.requireViewById(i);
            CoachMarkOverlay coachMarkOverlay = lic.A06;
            coachMarkOverlay.getClass();
            if (1 != intValue) {
                z = false;
            } else {
                z = true;
            }
            requireViewById.setDrawingCacheEnabled(true);
            requireViewById.buildDrawingCache();
            Bitmap drawingCache = requireViewById.getDrawingCache();
            if (drawingCache != null) {
                C0fK.A03(drawingCache);
                coachMarkOverlay.A01 = Bitmap.createBitmap(drawingCache);
                Paint paint = coachMarkOverlay.A02;
                if (z) {
                    porterDuffColorFilter = new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN);
                } else {
                    porterDuffColorFilter = null;
                }
                paint.setColorFilter(porterDuffColorFilter);
            }
            requireViewById.destroyDrawingCache();
            requireViewById.setDrawingCacheEnabled(false);
            AbstractC13880nE.A0M(coachMarkOverlay.A03, requireViewById);
            coachMarkOverlay.invalidate();
            TextView textView = lic.A05;
            textView.getClass();
            switch (intValue) {
                case 0:
                    i2 = 2131971212;
                    break;
                case 1:
                    i2 = 2131971213;
                    break;
                default:
                    i2 = 2131971214;
                    break;
            }
            textView.setText(i2);
            TextView textView2 = lic.A04;
            textView2.getClass();
            Resources resources = viewGroup.getResources();
            switch (intValue) {
                case 0:
                    i3 = 1;
                    break;
                case 1:
                    i3 = 2;
                    break;
                default:
                    i3 = 3;
                    break;
            }
            int i5 = 0;
            textView2.setText(resources.getString(2131975818, AbstractC25228BEl.A1Z(Integer.valueOf(i3), C05F.A00(3).length)));
            View view = lic.A01;
            view.getClass();
            if (intValue != 0) {
                z2 = true;
                i4 = 0;
            } else {
                z2 = false;
                i4 = 8;
            }
            view.setVisibility(i4);
            View view2 = lic.A00;
            view2.getClass();
            if (z2) {
                i5 = 8;
            }
            view2.setVisibility(i5);
            View view3 = lic.A02;
            view3.getClass();
            view3.post(new Runnable() { // from class: X.M4y
                @Override // java.lang.Runnable
                public final void run() {
                    int height;
                    LIC lic2 = lic;
                    View view4 = requireViewById;
                    Integer num2 = num;
                    int A06 = AbstractC166997dE.A06(lic2.A08.getResources());
                    RectF A0G = AbstractC13880nE.A0G(view4);
                    View view5 = lic2.A02;
                    view5.getClass();
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view5.getLayoutParams();
                    if (num2.intValue() != 0) {
                        height = ((int) A0G.bottom) + A06;
                    } else {
                        height = (((int) A0G.top) - lic2.A02.getHeight()) - A06;
                    }
                    marginLayoutParams.topMargin = height;
                    lic2.A02.setLayoutParams(marginLayoutParams);
                    lic2.A02.setVisibility(0);
                    CoachMarkOverlay coachMarkOverlay2 = lic2.A06;
                    coachMarkOverlay2.getClass();
                    coachMarkOverlay2.setVisibility(0);
                }
            });
        }
    }

    public LIC(ViewGroup viewGroup) {
        this.A08 = viewGroup;
        this.A09 = AbstractC31173DnH.A0G(viewGroup, R.id.coach_mark_stub);
        C55952hg A00 = AbstractC13560mi.A00();
        C55982hj A02 = A00.A02();
        C55942hf c55942hf = A0C;
        A02.A09(c55942hf);
        A02.A06 = true;
        A02.A0A(new C45340K4t(this, 0));
        this.A0A = A02;
        C55982hj A022 = A00.A02();
        A022.A09(c55942hf);
        A022.A06 = true;
        A022.A0A(new C45340K4t(this, 1));
        this.A0B = A022;
    }
}
