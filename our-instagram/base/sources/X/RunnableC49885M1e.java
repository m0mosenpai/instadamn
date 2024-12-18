package X;

import android.graphics.RectF;
import android.view.View;
import com.facebook.R;
import com.instagram.common.ui.widget.imageview.CircularImageView;
import com.instagram.direct.visual.DirectVisualMessageViewerController;
import com.instagram.ui.widget.roundedcornerlayout.RoundedCornerMediaFrameLayout;
import com.instagram.user.model.User;

/* renamed from: X.M1e, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class RunnableC49885M1e implements Runnable {
    public final /* synthetic */ DirectVisualMessageViewerController A00;

    public RunnableC49885M1e(DirectVisualMessageViewerController directVisualMessageViewerController) {
        this.A00 = directVisualMessageViewerController;
    }

    @Override // java.lang.Runnable
    public final void run() {
        float f;
        float f2;
        float centerX;
        float centerY;
        AbstractC125325le A04;
        InterfaceC150976qx c49608Lw1;
        C45093JxN A00;
        User user;
        int i;
        DirectVisualMessageViewerController directVisualMessageViewerController = this.A00;
        if (directVisualMessageViewerController.contentHolder != null) {
            L22 l22 = directVisualMessageViewerController.reelViewerShadowAnimator;
            if (l22 != null) {
                C141946bD c141946bD = l22.A02;
                View view = l22.A01;
                c141946bD.A00 = -16777216;
                c141946bD.A01 = -16777216;
                view.setBackgroundColor(-16777216);
            }
            if (directVisualMessageViewerController.A1D) {
                View view2 = directVisualMessageViewerController.contentView;
                if (view2 != null) {
                    view2.setVisibility(0);
                    DirectVisualMessageViewerController.A0G(directVisualMessageViewerController);
                    return;
                }
                throw AbstractC166997dE.A0g();
            }
            RectF rectF = directVisualMessageViewerController.A0d;
            if (rectF == null) {
                DirectVisualMessageViewerController.A0N(directVisualMessageViewerController, true);
                int i2 = directVisualMessageViewerController.A0c;
                View view3 = directVisualMessageViewerController.contentView;
                if (i2 == 1) {
                    if (view3 != null) {
                        i = view3.getHeight();
                    } else {
                        throw AbstractC166987dD.A14("Required value was null.");
                    }
                } else if (view3 != null) {
                    i = -view3.getHeight();
                } else {
                    throw AbstractC166987dD.A14("Required value was null.");
                }
                A04 = DirectVisualMessageViewerController.A04(directVisualMessageViewerController);
                A04.A0T(i, 0.0f);
            } else {
                C47946LGa c47946LGa = directVisualMessageViewerController.A0G;
                if (c47946LGa != null && (A00 = c47946LGa.A00()) != null && (user = A00.A0C) != null) {
                    CircularImageView circularImageView = directVisualMessageViewerController.A0A;
                    if (circularImageView != null) {
                        circularImageView.setUrl(user.Bhu(), directVisualMessageViewerController.A0v);
                    }
                } else {
                    CircularImageView circularImageView2 = directVisualMessageViewerController.A0A;
                    if (circularImageView2 != null) {
                        circularImageView2.A09();
                    }
                }
                DirectVisualMessageViewerController.A0N(directVisualMessageViewerController, true);
                boolean z = directVisualMessageViewerController.A1F;
                if (z) {
                    float width = rectF.width();
                    L5Y l5y = directVisualMessageViewerController.contentHolder;
                    if (l5y != null) {
                        f = width / AbstractC166987dD.A07(l5y.A0J);
                        float height = rectF.height();
                        L5Y l5y2 = directVisualMessageViewerController.contentHolder;
                        if (l5y2 != null) {
                            f2 = height / AbstractC166987dD.A08(l5y2.A0J);
                            centerX = 0.0f;
                            centerY = 0.0f;
                        } else {
                            throw AbstractC166987dD.A14("Required value was null.");
                        }
                    } else {
                        throw AbstractC166987dD.A14("Required value was null.");
                    }
                } else {
                    f = 0.0f;
                    f2 = 0.0f;
                    centerX = rectF.centerX();
                    centerY = rectF.centerY() - AbstractC13440mV.A00();
                }
                A04 = DirectVisualMessageViewerController.A04(directVisualMessageViewerController);
                A04.A0U(f, 1.0f, centerX);
                A04.A0V(f2, 1.0f, centerY);
                if (z) {
                    View view4 = directVisualMessageViewerController.itemView;
                    if (view4 != null) {
                        RoundedCornerMediaFrameLayout roundedCornerMediaFrameLayout = (RoundedCornerMediaFrameLayout) AbstractC166997dE.A0R(view4, R.id.viewer_media_view_container);
                        DirectVisualMessageViewerController.A0J(directVisualMessageViewerController, 0.0f);
                        float f3 = rectF.left;
                        if (directVisualMessageViewerController.contentHolder != null) {
                            A04.A0S(f3 - (r0.A0T.getPaddingLeft() * f), 0.0f);
                            float A002 = rectF.top - AbstractC13440mV.A00();
                            if (directVisualMessageViewerController.contentHolder != null) {
                                A04.A0T(A002 - (r0.A0T.getPaddingTop() * f2), 0.0f);
                                c49608Lw1 = new C49613Lw6(directVisualMessageViewerController, roundedCornerMediaFrameLayout, 1);
                            } else {
                                throw AbstractC166987dD.A14("Required value was null.");
                            }
                        } else {
                            throw AbstractC166987dD.A14("Required value was null.");
                        }
                    } else {
                        throw AbstractC166987dD.A14("Required value was null.");
                    }
                } else {
                    c49608Lw1 = new C49608Lw1(directVisualMessageViewerController, 5);
                }
                A04.A06 = c49608Lw1;
            }
            A04.A0H();
        }
    }
}
