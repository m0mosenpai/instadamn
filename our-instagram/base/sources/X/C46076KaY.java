package X;

import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.facebook.R;
import com.instagram.common.ui.base.IgTextView;
import com.instagram.common.ui.widget.imageview.CircularImageView;
import com.instagram.common.ui.widget.imageview.ConstrainedImageView;
import com.instagram.igds.components.imagebutton.IgMultiImageButton;
import com.instagram.ui.widget.framelayout.MediaFrameLayout;

/* renamed from: X.KaY, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C46076KaY extends MediaFrameLayout {
    public MOB A00;
    public C44440Jl4 A01;
    public IgMultiImageButton A02;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v0, types: [X.Jl4, androidx.constraintlayout.widget.ConstraintLayout, android.view.View, android.view.ViewGroup] */
    public C46076KaY(Context context) {
        super(context, null, 0);
        ?? constraintLayout = new ConstraintLayout(context);
        View inflate = LayoutInflater.from(context).inflate(R.layout.insights_media_overlay_view, (ViewGroup) constraintLayout);
        constraintLayout.A00 = inflate;
        if (inflate != null) {
            constraintLayout.A02 = (CircularImageView) inflate.findViewById(R.id.media_owner_image);
            View view = constraintLayout.A00;
            if (view != null) {
                IgTextView A0X = AbstractC31172DnG.A0X(view, R.id.media_metric_value);
                constraintLayout.A01 = A0X;
                String str = "metricText";
                if (A0X != null) {
                    A0X.setTextColor(-1);
                    IgTextView igTextView = constraintLayout.A01;
                    if (igTextView != null) {
                        igTextView.setGravity(17);
                        IgTextView igTextView2 = constraintLayout.A01;
                        if (igTextView2 != null) {
                            igTextView2.setMaxLines(1);
                            GradientDrawable gradientDrawable = new GradientDrawable();
                            gradientDrawable.setShape(0);
                            gradientDrawable.setColor(context.getColor(R.color.grey_9_10_transparent));
                            int dimensionPixelSize = context.getResources().getDimensionPixelSize(R.dimen.abc_button_padding_horizontal_material);
                            IgTextView igTextView3 = constraintLayout.A01;
                            if (igTextView3 != null) {
                                gradientDrawable.setCornerRadius(AbstractC166987dD.A02(igTextView3.getLineHeight() + (dimensionPixelSize * 2)));
                                View view2 = constraintLayout.A00;
                                if (view2 != null) {
                                    view2.setBackground(gradientDrawable);
                                    constraintLayout.setImportantForAccessibility(2);
                                    IgTextView igTextView4 = constraintLayout.A01;
                                    if (igTextView4 != null) {
                                        igTextView4.setImportantForAccessibility(2);
                                        this.A01 = constraintLayout;
                                        setupImageButton(context);
                                        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2, 81);
                                        ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin = JQ0.A07(this, R.dimen.abc_button_padding_horizontal_material);
                                        View view3 = this.A01;
                                        if (view3 == null) {
                                            str = "overlayView";
                                        } else {
                                            addView(view3, layoutParams);
                                            return;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                C14360o3.A0F(str);
                throw C00O.createAndThrow();
            }
        }
        C14360o3.A0F("view");
        throw C00O.createAndThrow();
    }

    private final void setupImageButton(Context context) {
        IgMultiImageButton igMultiImageButton = new IgMultiImageButton(context, null, 0);
        this.A02 = igMultiImageButton;
        igMultiImageButton.setScaleType(ImageView.ScaleType.CENTER_CROP);
        IgMultiImageButton igMultiImageButton2 = this.A02;
        if (igMultiImageButton2 != null) {
            igMultiImageButton2.setPlaceHolderColor(context.getColor(AbstractC53242c7.A04(context)));
            IgMultiImageButton igMultiImageButton3 = this.A02;
            if (igMultiImageButton3 != null) {
                addView(igMultiImageButton3, new FrameLayout.LayoutParams(-1, -1));
                return;
            }
        }
        C14360o3.A0F("imageButton");
        throw C00O.createAndThrow();
    }

    public final void setAspect(float f) {
        ((MediaFrameLayout) this).A00 = f;
        IgMultiImageButton igMultiImageButton = this.A02;
        if (igMultiImageButton == null) {
            C14360o3.A0F("imageButton");
            throw C00O.createAndThrow();
        }
        ((ConstrainedImageView) igMultiImageButton).A00 = f;
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0037  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void setData(java.lang.String r6, com.instagram.common.typedurl.ImageUrl r7, X.VDG r8, java.lang.String r9, boolean r10, boolean r11, X.InterfaceC11380iw r12, com.instagram.common.typedurl.ImageUrl r13) {
        /*
            r5 = this;
            java.lang.String r2 = "Required value was null."
            java.lang.String r4 = "imageButton"
            if (r7 == 0) goto Lf
            com.instagram.igds.components.imagebutton.IgMultiImageButton r0 = r5.A02
            if (r0 == 0) goto L8c
            if (r12 == 0) goto L95
            r0.setUrl(r7, r12)
        Lf:
            if (r8 == 0) goto L84
            int r1 = r8.ordinal()
            r0 = 3
            if (r1 == r0) goto L7d
            r0 = 9
            if (r1 == r0) goto L76
            r0 = 12
            if (r1 != r0) goto L84
            com.instagram.igds.components.imagebutton.IgMultiImageButton r1 = r5.A02
            if (r1 == 0) goto L8c
            X.6vG r0 = X.EnumC153466vG.A0L
        L26:
            r1.setIcon(r0)
        L29:
            X.Jl4 r3 = r5.A01
            java.lang.String r0 = "overlayView"
            if (r3 != 0) goto L37
            X.C14360o3.A0F(r0)
        L32:
            X.00O r0 = X.C00O.createAndThrow()
            throw r0
        L37:
            r1 = 0
            r3.setVisibility(r1)
            if (r11 == 0) goto L6c
            if (r13 == 0) goto L6c
            if (r12 == 0) goto L90
            r3.setWithAvatarImage(r12, r13, r9)
        L44:
            com.instagram.igds.components.imagebutton.IgMultiImageButton r0 = r5.A02
            if (r0 == 0) goto L8c
            r0.setVisibility(r1)
            com.instagram.igds.components.imagebutton.IgMultiImageButton r2 = r5.A02
            if (r2 == 0) goto L8c
            r1 = 2
            X.LP0 r0 = new X.LP0
            r0.<init>(r6, r5, r1)
            r2.setOnClickListener(r0)
            com.instagram.igds.components.imagebutton.IgMultiImageButton r0 = r5.A02
            if (r0 == 0) goto L8c
            r0.setContentDescription(r9)
            com.instagram.igds.components.imagebutton.IgMultiImageButton r1 = r5.A02
            if (r1 == 0) goto L8c
            java.lang.Integer r0 = X.C05F.A00
            X.AbstractC56952jT.A04(r1, r0)
            X.AbstractC56952jT.A04(r3, r0)
            return
        L6c:
            if (r10 == 0) goto L72
            r3.setWithEyeIcon(r9)
            goto L44
        L72:
            r3.setMetricOnly(r9)
            goto L44
        L76:
            com.instagram.igds.components.imagebutton.IgMultiImageButton r1 = r5.A02
            if (r1 == 0) goto L8c
            X.6vG r0 = X.EnumC153466vG.A08
            goto L26
        L7d:
            com.instagram.igds.components.imagebutton.IgMultiImageButton r1 = r5.A02
            if (r1 == 0) goto L8c
            X.6vG r0 = X.EnumC153466vG.A0N
            goto L26
        L84:
            com.instagram.igds.components.imagebutton.IgMultiImageButton r0 = r5.A02
            if (r0 == 0) goto L8c
            r0.A0H()
            goto L29
        L8c:
            X.C14360o3.A0F(r4)
            goto L32
        L90:
            java.lang.IllegalStateException r0 = X.AbstractC166987dD.A14(r2)
            throw r0
        L95:
            java.lang.IllegalStateException r0 = X.AbstractC166987dD.A14(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C46076KaY.setData(java.lang.String, com.instagram.common.typedurl.ImageUrl, X.VDG, java.lang.String, boolean, boolean, X.0iw, com.instagram.common.typedurl.ImageUrl):void");
    }

    public final void setDelegate(MOB mob) {
        this.A00 = mob;
    }
}
