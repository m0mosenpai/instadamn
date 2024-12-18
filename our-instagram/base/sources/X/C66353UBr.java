package X;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewOutlineProvider;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.facebook.R;
import java.util.List;

/* renamed from: X.UBr, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C66353UBr extends FrameLayout {
    public static final /* synthetic */ C0YR[] A0E = {new AnonymousClass013(C66353UBr.class, "imageThumbnailUrls", "getImageThumbnailUrls()Ljava/util/List;", 0), new AnonymousClass013(C66353UBr.class, "numItems", "getNumItems()I", 0)};
    public View A00;
    public View A01;
    public View A02;
    public View A03;
    public ImageView A04;
    public ImageView A05;
    public ImageView A06;
    public ImageView A07;
    public ImageView A08;
    public TextView A09;
    public final int A0A;
    public final TypedArray A0B;
    public final InterfaceC16530ry A0C;
    public final InterfaceC16530ry A0D;

    public C66353UBr(Context context) {
        super(context, null, 0);
        String str;
        this.A0A = 5;
        C2FP.A0A();
        int[] iArr = AbstractC55922hc.A0e;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(R.style.FBPayUIListCell_Entity, iArr);
        C14360o3.A07(obtainStyledAttributes);
        this.A0B = obtainStyledAttributes;
        this.A0C = new X6J(53, this, C16930sl.A00);
        this.A0D = new X6J(54, this, 0);
        LayoutInflater.from(context).inflate(R.layout.fbpay_ui_list_cell_left_add_on_multi_image_icon, (ViewGroup) this, true);
        this.A01 = findViewById(R.id.list_cell_left_add_on_multi_image_container);
        this.A04 = (ImageView) findViewById(R.id.list_cell_left_add_on_image_1);
        this.A05 = (ImageView) findViewById(R.id.list_cell_left_add_on_image_2);
        this.A06 = (ImageView) findViewById(R.id.list_cell_left_add_on_image_3);
        this.A07 = (ImageView) findViewById(R.id.list_cell_left_add_on_image_4);
        this.A08 = (ImageView) findViewById(R.id.list_cell_left_add_on_multi_image_outline);
        this.A03 = findViewById(R.id.list_cell_left_add_on_vertical_divider);
        this.A00 = findViewById(R.id.list_cell_left_add_on_horizontal_divider_1);
        this.A02 = findViewById(R.id.list_cell_left_add_on_horizontal_divider_2);
        this.A09 = (TextView) findViewById(R.id.list_cell_left_add_on_badge_icon);
        Context context2 = getContext();
        TypedArray obtainStyledAttributes2 = context2.obtainStyledAttributes(C2FP.A0A().A01(this.A0A), iArr);
        AbstractC70177WFc.A00(obtainStyledAttributes2, this, 18, R.style.FBPayUIListCellElement_AddOnContainer);
        obtainStyledAttributes2.recycle();
        C2FP.A0A();
        int color = context2.getColor(R.color.igds_separator);
        View view = this.A03;
        if (view == null) {
            str = "verticalDivider";
        } else {
            view.setBackgroundColor(color);
            View view2 = this.A00;
            if (view2 == null) {
                str = "leftHalfDivider";
            } else {
                view2.setBackgroundColor(color);
                View view3 = this.A02;
                if (view3 == null) {
                    str = "rightHalfDivider";
                } else {
                    view3.setBackgroundColor(color);
                    Drawable drawable = context2.getDrawable(R.drawable.fbpay_widget_multi_item_thumbnail_border);
                    C14360o3.A0C(drawable, "null cannot be cast to non-null type android.graphics.drawable.GradientDrawable");
                    GradientDrawable gradientDrawable = (GradientDrawable) drawable;
                    gradientDrawable.mutate();
                    gradientDrawable.setStroke(context2.getResources().getDimensionPixelSize(R.dimen.account_recs_header_image_margin), color);
                    ImageView imageView = this.A08;
                    str = "imageViewOutline";
                    if (imageView != null) {
                        TypedArray typedArray = this.A0B;
                        AbstractC70177WFc.A00(typedArray, imageView, 3, R.style.FBPayUIListCellLeftAddOnIconOutline);
                        ImageView imageView2 = this.A08;
                        if (imageView2 != null) {
                            imageView2.setImageDrawable(gradientDrawable);
                            ImageView imageView3 = this.A08;
                            if (imageView3 != null) {
                                imageView3.setVisibility(0);
                                View view4 = this.A01;
                                str = "multiImageContainer";
                                if (view4 != null) {
                                    AbstractC70177WFc.A00(typedArray, view4, 3, R.style.FBPayUIListCellLeftAddOnIconOutline);
                                    View view5 = this.A01;
                                    if (view5 != null) {
                                        view5.setBackgroundResource(R.drawable.fbpay_widget_multi_item_thumbnail_border);
                                        View view6 = this.A01;
                                        if (view6 != null) {
                                            Drawable background = view6.getBackground();
                                            C14360o3.A0C(background, "null cannot be cast to non-null type android.graphics.drawable.GradientDrawable");
                                            GradientDrawable gradientDrawable2 = (GradientDrawable) background;
                                            gradientDrawable2.mutate();
                                            gradientDrawable2.setStroke(AbstractC166997dE.A04(context2, R.dimen.account_recs_header_image_margin), color);
                                            View view7 = this.A01;
                                            if (view7 != null) {
                                                view7.setOutlineProvider(ViewOutlineProvider.BACKGROUND);
                                                View view8 = this.A01;
                                                if (view8 != null) {
                                                    view8.setClipToOutline(true);
                                                    TextView textView = this.A09;
                                                    if (textView != null) {
                                                        AbstractC70177WFc.A05(textView, typedArray.getResourceId(0, R.style.FBPayUIListCellLeftAddOnBadgeIcon), false);
                                                        TextView textView2 = this.A09;
                                                        if (textView2 != null) {
                                                            WF7.A02(textView2, VEP.A07);
                                                            TextView textView3 = this.A09;
                                                            if (textView3 != null) {
                                                                textView3.setBackgroundResource(R.drawable.fbpay_widget_multi_item_badge);
                                                                TextView textView4 = this.A09;
                                                                if (textView4 != null) {
                                                                    Drawable background2 = textView4.getBackground();
                                                                    C14360o3.A0C(background2, "null cannot be cast to non-null type android.graphics.drawable.GradientDrawable");
                                                                    GradientDrawable gradientDrawable3 = (GradientDrawable) background2;
                                                                    gradientDrawable3.mutate();
                                                                    C2FP.A0A();
                                                                    gradientDrawable3.setColor(context2.getColor(R.color.igds_elevated_background));
                                                                    int A04 = AbstractC43594JPz.A04(context2);
                                                                    C2FP.A0A();
                                                                    gradientDrawable3.setStroke(A04, context2.getColor(R.color.igds_separator));
                                                                    return;
                                                                }
                                                            }
                                                        }
                                                    }
                                                    C14360o3.A0F("badgeIcon");
                                                    throw C00O.createAndThrow();
                                                }
                                            }
                                        }
                                    }
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

    public final void setImageThumbnailUrls(List list) {
        C14360o3.A0B(list, 0);
        AbstractC31171DnF.A1S(this, list, this.A0C, A0E, 0);
    }

    public static final void A01(C66353UBr c66353UBr) {
        ImageView imageView = c66353UBr.A04;
        String str = "imageView1";
        if (imageView != null) {
            c66353UBr.setQuarterImageViewStyle(imageView);
            ImageView imageView2 = c66353UBr.A05;
            str = "imageView2";
            if (imageView2 != null) {
                c66353UBr.setQuarterImageViewStyle(imageView2);
                ImageView imageView3 = c66353UBr.A06;
                str = "imageView3";
                if (imageView3 != null) {
                    c66353UBr.setQuarterImageViewStyle(imageView3);
                    ImageView imageView4 = c66353UBr.A07;
                    str = "imageView4";
                    if (imageView4 != null) {
                        c66353UBr.setQuarterImageViewStyle(imageView4);
                        AbstractC65702TsY.A15(imageView, c66353UBr, c66353UBr.getImageThumbnailUrls(), 0);
                        AbstractC65702TsY.A15(imageView2, c66353UBr, c66353UBr.getImageThumbnailUrls(), 1);
                        AbstractC65702TsY.A15(imageView3, c66353UBr, c66353UBr.getImageThumbnailUrls(), 2);
                        AbstractC65702TsY.A15(imageView4, c66353UBr, c66353UBr.getImageThumbnailUrls(), 3);
                        View view = c66353UBr.A03;
                        if (view == null) {
                            str = "verticalDivider";
                        } else {
                            view.setVisibility(0);
                            View view2 = c66353UBr.A02;
                            if (view2 == null) {
                                str = "rightHalfDivider";
                            } else {
                                view2.setVisibility(0);
                                View view3 = c66353UBr.A00;
                                if (view3 == null) {
                                    str = "leftHalfDivider";
                                } else {
                                    view3.setVisibility(0);
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

    public static final void A02(C66353UBr c66353UBr) {
        ImageView imageView = c66353UBr.A04;
        String str = "imageView1";
        if (imageView != null) {
            c66353UBr.setHalfImageViewStyle(imageView);
            ImageView imageView2 = c66353UBr.A05;
            str = "imageView2";
            if (imageView2 != null) {
                c66353UBr.setQuarterImageViewStyle(imageView2);
                ImageView imageView3 = c66353UBr.A06;
                str = "imageView3";
                if (imageView3 != null) {
                    c66353UBr.setQuarterImageViewStyle(imageView3);
                    AbstractC65702TsY.A15(imageView, c66353UBr, c66353UBr.getImageThumbnailUrls(), 0);
                    AbstractC65702TsY.A15(imageView2, c66353UBr, c66353UBr.getImageThumbnailUrls(), 1);
                    AbstractC65702TsY.A15(imageView3, c66353UBr, c66353UBr.getImageThumbnailUrls(), 2);
                    View view = c66353UBr.A03;
                    if (view == null) {
                        str = "verticalDivider";
                    } else {
                        view.setVisibility(0);
                        View view2 = c66353UBr.A02;
                        if (view2 == null) {
                            str = "rightHalfDivider";
                        } else {
                            view2.setVisibility(0);
                            return;
                        }
                    }
                }
            }
        }
        C14360o3.A0F(str);
        throw C00O.createAndThrow();
    }

    public static final void A03(C66353UBr c66353UBr) {
        ImageView imageView = c66353UBr.A04;
        String str = "imageView1";
        if (imageView != null) {
            c66353UBr.setHalfImageViewStyle(imageView);
            ImageView imageView2 = c66353UBr.A05;
            str = "imageView2";
            if (imageView2 != null) {
                c66353UBr.setHalfImageViewStyle(imageView2);
                AbstractC65702TsY.A15(imageView, c66353UBr, c66353UBr.getImageThumbnailUrls(), 0);
                AbstractC65702TsY.A15(imageView2, c66353UBr, c66353UBr.getImageThumbnailUrls(), 1);
                View view = c66353UBr.A03;
                if (view == null) {
                    str = "verticalDivider";
                } else {
                    view.setVisibility(0);
                    return;
                }
            }
        }
        C14360o3.A0F(str);
        throw C00O.createAndThrow();
    }

    private final void setHalfImageViewStyle(ImageView imageView) {
        AbstractC70177WFc.A05(imageView, this.A0B.getResourceId(2, R.style.FBPayUIListCellLeftAddOnHalfIcon), false);
    }

    private final void setQuarterImageViewStyle(ImageView imageView) {
        AbstractC70177WFc.A05(imageView, this.A0B.getResourceId(5, R.style.FBPayUIListCellLeftAddOnQuarterIcon), false);
    }

    public final int getFbpayWidgetStyleType() {
        return this.A0A;
    }

    public final List getImageThumbnailUrls() {
        return (List) this.A0C.CES(this, A0E[0]);
    }

    public final int getNumItems() {
        return ((Number) this.A0D.CES(this, A0E[1])).intValue();
    }

    public final TypedArray getStyle() {
        return this.A0B;
    }

    public final void setNumItems(int i) {
        this.A0D.Egi(this, Integer.valueOf(i), A0E[1]);
    }

    public static final void A00(ImageView imageView, C66353UBr c66353UBr, String str) {
        C69679VtP A0G = C2FP.A0G();
        if (A0G.A01(str)) {
            C60615REa A00 = A0G.A00(str, "ListCell");
            A00.A07 = true;
            A00.A02(imageView);
        } else {
            imageView.setImageDrawable(C2FP.A0A().A04(AbstractC166997dE.A0L(c66353UBr), 34, 33));
        }
        imageView.setVisibility(0);
    }
}
