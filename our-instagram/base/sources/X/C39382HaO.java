package X;

import android.content.Context;
import android.graphics.PointF;
import android.view.MotionEvent;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.text.TightTextView;

/* renamed from: X.HaO, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C39382HaO extends AbstractC50789Mc6 {
    public ViewGroup A00;
    public ImageView A01;
    public ImageView A02;
    public TextView A03;
    public final Context A04;
    public final UserSession A05;
    public final C38321qM A06;
    public final boolean A07;
    public final C25671My A08;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C39382HaO(Context context, PointF pointF, UserSession userSession, C38321qM c38321qM, boolean z) {
        super(context);
        AbstractC167017dG.A1P(context, userSession);
        this.A04 = context;
        this.A05 = userSession;
        this.A06 = c38321qM;
        this.A07 = z;
        this.A08 = AbstractC25651Mw.A00(userSession);
        Context context2 = this.A04;
        FrameLayout frameLayout = new FrameLayout(context2);
        this.A00 = frameLayout;
        AbstractC41736Ie8.A00(frameLayout, this.A05, this.A06, Boolean.valueOf(this.A07));
        this.A03 = new TightTextView(context2);
        ImageView imageView = new ImageView(context2);
        this.A02 = imageView;
        AbstractC41736Ie8.A01(imageView, true);
        ImageView imageView2 = new ImageView(context2);
        this.A01 = imageView2;
        AbstractC41736Ie8.A01(imageView2, false);
        TextView textView = this.A03;
        String str = "bubbleText";
        if (textView != null) {
            AbstractC41736Ie8.A02(textView);
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
            layoutParams.gravity = 17;
            ViewGroup viewGroup = this.A00;
            if (viewGroup == null) {
                str = "bubble";
            } else {
                TextView textView2 = this.A03;
                if (textView2 != null) {
                    viewGroup.addView(textView2, layoutParams);
                    ViewGroup.LayoutParams layoutParams2 = new ViewGroup.LayoutParams(-2, -2);
                    ViewGroup viewGroup2 = this.A00;
                    if (viewGroup2 != null) {
                        addView(viewGroup2, layoutParams2);
                        ImageView imageView3 = this.A02;
                        if (imageView3 != null) {
                            addView(imageView3, layoutParams2);
                            ImageView imageView4 = this.A01;
                            String str2 = "downArrow";
                            if (imageView4 != null) {
                                addView(imageView4, layoutParams2);
                                ViewGroup viewGroup3 = this.A00;
                                if (viewGroup3 != null) {
                                    TextView textView3 = this.A03;
                                    if (textView3 == null) {
                                        str2 = "bubbleText";
                                    } else {
                                        ImageView imageView5 = this.A02;
                                        if (imageView5 != null) {
                                            ImageView imageView6 = this.A01;
                                            if (imageView6 != null) {
                                                super.A02 = new OXO(pointF, viewGroup3, imageView5, imageView6, textView3, userSession, c38321qM, this, 0, 0, false);
                                                return;
                                            }
                                        }
                                    }
                                }
                            }
                            C14360o3.A0F(str2);
                            throw C00O.createAndThrow();
                        }
                        C14360o3.A0F("upArrow");
                        throw C00O.createAndThrow();
                    }
                    C14360o3.A0F("bubble");
                    throw C00O.createAndThrow();
                }
            }
        }
        C14360o3.A0F(str);
        throw C00O.createAndThrow();
    }

    @Override // X.AbstractC50789Mc6
    public String getTaggedId() {
        return "";
    }

    @Override // X.AbstractC50789Mc6
    public C57482kN getTextLayoutParams() {
        return null;
    }

    @Override // X.AbstractC50789Mc6
    public int getTextLineHeight() {
        return 0;
    }

    @Override // X.AbstractC50789Mc6
    public CharSequence getText() {
        return "";
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        C38321qM media;
        int A05 = C0f9.A05(-23517504);
        if (motionEvent != null && motionEvent.getAction() == 1 && super.A01 != null && (media = getMedia()) != null) {
            this.A08.E4s(new C72443Mr(media.A1g(this.A05)));
        }
        C0f9.A0C(-378115834, A05);
        return true;
    }
}
