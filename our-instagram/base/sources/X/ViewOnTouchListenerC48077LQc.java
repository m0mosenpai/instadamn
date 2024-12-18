package X;

import android.content.Context;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.blur.BlurUtil;
import com.instagram.common.ui.widget.imageview.IgImageView;

/* renamed from: X.LQc, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class ViewOnTouchListenerC48077LQc implements View.OnTouchListener {
    public boolean A00 = false;
    public final /* synthetic */ C47257KuU A01;
    public final /* synthetic */ C6FG A02;
    public final /* synthetic */ C102884kP A03;
    public final /* synthetic */ C102884kP A04;

    public ViewOnTouchListenerC48077LQc(C47257KuU c47257KuU, C6FG c6fg, C102884kP c102884kP, C102884kP c102884kP2) {
        this.A01 = c47257KuU;
        this.A02 = c6fg;
        this.A04 = c102884kP;
        this.A03 = c102884kP2;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        C25671My A00;
        C42238InO c42238InO;
        boolean z = false;
        if (motionEvent.getAction() == 0) {
            C51622Yk c51622Yk = this.A01.A00;
            if (c51622Yk != null && c51622Yk.isShowing()) {
                z = true;
            }
            this.A00 = z;
            return true;
        }
        if (motionEvent.getAction() == 1) {
            if (this.A00) {
                A00 = AbstractC25651Mw.A00(C6BQ.A0A(this.A02));
                c42238InO = new C42238InO(false);
            } else {
                Fragment A01 = AbstractC10360h2.A01(view);
                View rootView = view.getRootView();
                float rawX = motionEvent.getRawX();
                float rawY = motionEvent.getRawY();
                C102884kP A08 = this.A04.A08(38);
                if (A08 == null) {
                    AbstractC25241Le.A02("BKStoryViewerTooltipExtensionBinder", "tooltipData is null");
                    return false;
                }
                String str = "";
                String A0G = A08.A0G();
                if (A0G != null) {
                    str = A0G;
                }
                boolean A0S = A08.A0S(35, false);
                String A0L = A08.A0L(38);
                Bundle bundle = A01.mArguments;
                bundle.getClass();
                UserSession A06 = C023409i.A0A.A06(bundle);
                Integer num = C05F.A01;
                L5J l5j = new L5J(rootView, A06, num, num);
                l5j.A02 = EnumC46122KbM.A01;
                l5j.A06 = true;
                l5j.A05 = false;
                l5j.A07 = false;
                C51622Yk c51622Yk2 = new C51622Yk(l5j);
                this.A01.A00 = c51622Yk2;
                View contentView = c51622Yk2.getContentView();
                if (contentView != null) {
                    TextView A0T = AbstractC166997dE.A0T(contentView, R.id.reel_tagging_bubble_title);
                    if (!TextUtils.isEmpty(str)) {
                        A0T.setText(str);
                    } else {
                        AbstractC25241Le.A02("BKStoryViewerTooltipExtensionBinder", "title is empty/null");
                    }
                    if (A0S) {
                        A0T.setCompoundDrawablesWithIntrinsicBounds(0, 0, R.drawable.reel_tagging_chevron, 0);
                    }
                    IgImageView A0Z = AbstractC31172DnG.A0Z(contentView, R.id.reel_tagging_bubble_image);
                    if (!TextUtils.isEmpty(A0L)) {
                        A0Z.setUrl(AbstractC25225BEi.A0t(A0L), C6BQ.A07(this.A02));
                        A0Z.setVisibility(0);
                    } else {
                        A0Z.setVisibility(8);
                        C0w9.A03("BKStoryViewerTooltipExtensionComponent", "profile_url is empty/null");
                    }
                    Bitmap createBitmap = Bitmap.createBitmap(rootView.getWidth() / 10, rootView.getHeight() / 10, Bitmap.Config.ARGB_8888);
                    if (rootView instanceof FrameLayout) {
                        rootView.setDrawingCacheEnabled(true);
                        rootView.draw(AbstractC43592JPx.A06(createBitmap));
                        rootView.setDrawingCacheEnabled(false);
                    }
                    BlurUtil.blurInPlace(createBitmap, 20);
                    C6FG c6fg = this.A02;
                    Context context = c6fg.A00;
                    c51622Yk2.A01(createBitmap, (AbstractC13880nE.A0A(context) * 1.0f) / createBitmap.getWidth());
                    c51622Yk2.A03 = new C49667Lwy(this);
                    int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
                    contentView.measure(makeMeasureSpec, makeMeasureSpec);
                    int A0C = AbstractC166987dD.A0C(context, 40);
                    boolean A1P = AbstractC25230BEn.A1P(((rawY - A0C) > contentView.getMeasuredHeight() ? 1 : ((rawY - A0C) == contentView.getMeasuredHeight() ? 0 : -1)));
                    float A082 = AbstractC166987dD.A08(rootView);
                    if (!A1P) {
                        A0C = -A0C;
                    }
                    c51622Yk2.A02(rootView, ((int) rawX) - (rootView.getWidth() / 2), ((int) Math.min(A082, Math.max(0.0f, rawY + A0C))) - (rootView.getHeight() / 2), A1P);
                    A00 = AbstractC25651Mw.A00(C6BQ.A0A(c6fg));
                    c42238InO = new C42238InO(true);
                }
            }
            A00.E4s(c42238InO);
        }
        return false;
    }
}
