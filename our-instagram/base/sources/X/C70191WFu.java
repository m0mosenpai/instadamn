package X;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.PointF;
import android.graphics.Rect;
import android.view.LayoutInflater;
import android.view.View;
import android.view.Window;
import android.widget.LinearLayout;
import android.widget.PopupWindow;
import android.widget.TextView;
import com.facebook.R;
import com.instagram.common.ui.widget.imageview.IgImageView;
import com.instagram.model.mediasize.SpritesheetInfo;

/* renamed from: X.WFu, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C70191WFu {
    public IgImageView A00;
    public C66320U8t A01;
    public float A02;
    public int A03;
    public int A04;
    public int A05;
    public boolean A06;
    public final PopupWindow A07;
    public final C69431VnG A08;
    public final C66352UBo A09;
    public final int A0A;
    public final int A0B;
    public final int A0C;
    public final int A0D;
    public final int A0E;
    public final Context A0F;
    public final View A0G;
    public final TextView A0H;
    public final TextView A0I;
    public final TextView A0J;
    public final boolean A0K;

    public C70191WFu(Context context, C69431VnG c69431VnG, C66352UBo c66352UBo, int i) {
        int i2;
        this.A0F = context;
        this.A08 = c69431VnG;
        this.A09 = c66352UBo;
        View A0R = AbstractC25226BEj.A0R(LayoutInflater.from(context), new LinearLayout(context), R.layout.insights_line_chart_tooltip_layout, false);
        this.A0G = A0R;
        this.A03 = -1;
        this.A02 = -1.0f;
        boolean z = c69431VnG.A05;
        this.A0K = z;
        this.A04 = -1;
        SpritesheetInfo spritesheetInfo = c69431VnG.A03;
        if (spritesheetInfo != null) {
            this.A00 = (IgImageView) A0R.findViewById(R.id.insights_line_chart_tooltip_thumbnail_view);
            this.A01 = new C66320U8t(spritesheetInfo, new C71036Wmr(this), AbstractC167017dG.A04(context));
        }
        float[] fArr = c69431VnG.A08;
        this.A02 = fArr[0];
        TextView textView = (TextView) A0R.findViewById(R.id.insights_line_chart_tooltip_primary_text);
        this.A0I = textView;
        this.A0H = (TextView) A0R.findViewById(R.id.insights_line_chart_tooltip_benchmark_text);
        TextView textView2 = (TextView) A0R.findViewById(R.id.insights_line_chart_tooltip_timestamp_text);
        this.A0J = textView2;
        A02(fArr[i]);
        textView.setTextAppearance(R.style.igds_emphasized_body_1);
        AbstractC31177DnL.A0z(textView, context);
        textView2.setTextAppearance(R.style.PrivacyTextStyle);
        A03(c69431VnG.A07[i]);
        A04(i);
        this.A0A = context.getResources().getDimensionPixelSize(R.dimen.ab_test_media_thumbnail_preview_item_internal_padding) + AbstractC167017dG.A0E(context);
        this.A0B = AbstractC167017dG.A09(context) + AbstractC166997dE.A04(context, R.dimen.ab_test_media_thumbnail_preview_item_internal_padding);
        this.A0C = AbstractC167017dG.A04(context);
        Resources resources = context.getResources();
        if (z) {
            i2 = R.dimen.achievements_list_container_height;
        } else {
            boolean z2 = c69431VnG.A06;
            i2 = R.dimen.insights_line_retention_chart_tooltip_container_width;
            if (z2) {
                i2 = R.dimen.ai_agent_embodiment_video_container_size;
            }
        }
        int dimensionPixelSize = resources.getDimensionPixelSize(i2);
        this.A0E = dimensionPixelSize;
        context.getResources().getDimensionPixelSize(R.dimen.avatar_reel_ring_size_extra_large);
        this.A0D = AbstractC167017dG.A0A(context);
        Rect rect = new Rect();
        Activity activity = (Activity) context;
        Window window = activity.getWindow();
        if (window != null) {
            window.getDecorView().getWindowVisibleDisplayFrame(rect);
            this.A05 += rect.top;
        }
        this.A05 += C56352iT.A0t.A03(activity).AYS();
        PopupWindow popupWindow = new PopupWindow(A0R, dimensionPixelSize, -2, false);
        this.A07 = popupWindow;
        popupWindow.setOutsideTouchable(true);
        A05(i);
    }

    private final int A00() {
        int[] iArr = new int[2];
        this.A09.getLocationOnScreen(iArr);
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(this.A0E, Integer.MIN_VALUE);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(0, 0);
        View view = this.A0G;
        view.measure(makeMeasureSpec, makeMeasureSpec2);
        int measuredHeight = view.getMeasuredHeight();
        if (this.A04 != measuredHeight) {
            this.A06 = true;
        }
        this.A04 = measuredHeight;
        int i = iArr[1];
        int i2 = (i - measuredHeight) + (this.A0D * 2);
        int i3 = this.A05;
        if (i < i3) {
            return -1;
        }
        if (i2 >= i3) {
            return i2;
        }
        return i3;
    }

    private final int A01(int i) {
        float f;
        int measuredWidth = this.A09.getMeasuredWidth() - this.A0A;
        int i2 = this.A0B;
        int i3 = measuredWidth - i2;
        C69431VnG c69431VnG = this.A08;
        float f2 = c69431VnG.A07[r1.length - 1];
        float f3 = c69431VnG.A01;
        float f4 = c69431VnG.A00;
        if (f4 < f3) {
            f = 0.0f;
        } else {
            f = i3 * (((f2 - f3) * 1.0f) / (f4 - f3));
        }
        int i4 = ((int) f) - this.A0C;
        int i5 = c69431VnG.A02;
        float f5 = (i4 * 1.0f) / (i5 - 1);
        float[] fArr = new float[i5];
        for (int i6 = 0; i6 < i5; i6++) {
            fArr[i6] = i6 * f5;
        }
        return (int) ((fArr[i] + i2) - (this.A0E / 2.0f));
    }

    private final void A02(float f) {
        TextView textView;
        String A0r;
        if (this.A0K) {
            int i = (int) f;
            Integer valueOf = Integer.valueOf(i);
            Context context = this.A0F;
            Resources resources = context.getResources();
            C14360o3.A07(resources);
            String A04 = C84963qk.A04(resources, valueOf, 10000, false, false);
            textView = this.A0I;
            if (textView != null) {
                A0r = AbstractC31175DnJ.A0W(context.getResources(), A04, R.plurals.distribution_chart_views_text, i);
            } else {
                return;
            }
        } else {
            int i2 = (int) ((f / this.A02) * 100.0f);
            textView = this.A0I;
            if (textView == null) {
                return;
            } else {
                A0r = AbstractC166997dE.A0r(this.A0F.getResources(), String.valueOf(i2), 2131972566);
            }
        }
        textView.setText(A0r);
    }

    private final void A03(float f) {
        String valueOf;
        if (this.A0K) {
            AbstractC167007dF.A0x(this.A0J);
            return;
        }
        int i = (int) (f / 1000.0f);
        int i2 = i / 60;
        int i3 = i % 60;
        String valueOf2 = String.valueOf(i2);
        if (i3 < 10) {
            valueOf = AnonymousClass001.A00('0', i3);
        } else {
            valueOf = String.valueOf(i3);
        }
        TextView textView = this.A0J;
        if (textView == null) {
            return;
        }
        textView.setVisibility(0);
        textView.setText(this.A0F.getResources().getString(2131972567, valueOf2, valueOf));
    }

    private final void A04(int i) {
        Resources resources;
        int i2;
        String valueOf;
        Resources resources2;
        int i3;
        String A0r;
        TextView textView = this.A0H;
        if (textView != null) {
            textView.setText("");
            textView.setVisibility(8);
        }
        C69431VnG c69431VnG = this.A08;
        for (PointF pointF : c69431VnG.A04) {
            if (((int) c69431VnG.A07[i]) == ((int) pointF.x)) {
                float f = pointF.y;
                if (f > 1000000.0f) {
                    if (textView != null) {
                        resources = this.A0F.getResources();
                        i2 = 2131961004;
                    } else {
                        return;
                    }
                } else {
                    if (f > 0.0f) {
                        valueOf = String.valueOf((int) Math.rint(f * 100.0f));
                        if (textView == null) {
                            return;
                        }
                        resources2 = this.A0F.getResources();
                        i3 = 2131961003;
                    } else if (f < 0.0f) {
                        valueOf = String.valueOf((int) Math.abs((float) Math.rint(f * 100.0f)));
                        if (textView == null) {
                            return;
                        }
                        resources2 = this.A0F.getResources();
                        i3 = 2131961005;
                    } else {
                        if (textView == null) {
                            return;
                        }
                        resources = this.A0F.getResources();
                        i2 = 2131961002;
                    }
                    A0r = AbstractC166997dE.A0r(resources2, valueOf, i3);
                    textView.setText(A0r);
                    textView.setVisibility(0);
                    return;
                }
                A0r = resources.getString(i2);
                textView.setText(A0r);
                textView.setVisibility(0);
                return;
            }
        }
    }

    public final void A05(int i) {
        C68945Vej[] c68945VejArr;
        Rect rect = new Rect();
        C66352UBo c66352UBo = this.A09;
        c66352UBo.getGlobalVisibleRect(rect);
        PopupWindow popupWindow = this.A07;
        popupWindow.setTouchInterceptor(new ViewOnTouchListenerC70251WNw(3, rect, this));
        if (this.A03 != i) {
            C69431VnG c69431VnG = this.A08;
            if (c69431VnG.A06 && (c68945VejArr = c69431VnG.A09) != null && AbstractC009903n.A06(c68945VejArr, i) != null) {
                C68945Vej c68945Vej = c68945VejArr[i];
                TextView textView = this.A0I;
                if (textView != null) {
                    textView.setText(c68945Vej.A00);
                }
                TextView textView2 = this.A0J;
                if (textView2 != null) {
                    textView2.setText(c68945Vej.A01);
                }
            } else {
                A02(c69431VnG.A08[i]);
                A03(c69431VnG.A07[i]);
                A04(i);
                C66320U8t c66320U8t = this.A01;
                if (c66320U8t != null) {
                    c66320U8t.A00 = (int) (c66320U8t.A01.size() * (i / r3.length));
                    c66320U8t.invalidateSelf();
                }
            }
            this.A03 = i;
        }
        if (A00() == -1) {
            popupWindow.dismiss();
            return;
        }
        if (!popupWindow.isShowing()) {
            popupWindow.showAtLocation(c66352UBo, 0, A01(i), A00());
        } else {
            if (this.A06) {
                popupWindow.dismiss();
                popupWindow.showAtLocation(c66352UBo, 0, A01(i), A00());
                this.A06 = false;
                return;
            }
            popupWindow.update(A01(i), A00(), this.A0E, -2);
        }
    }
}
