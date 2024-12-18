package X;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.ScaleDrawable;
import android.os.Build;
import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.R;
import com.instagram.common.session.UserSession;

/* renamed from: X.DzU, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C31862DzU extends UGO {
    public float A00;
    public boolean A01;
    public boolean A02;
    public boolean A03;
    public boolean A04;
    public boolean A05;
    public final float A06;
    public final float A07;
    public final float A08;
    public final Context A09;
    public final Paint A0A;
    public final Paint A0B;
    public final Drawable A0C;
    public final Drawable A0D;
    public final Drawable A0E;
    public final boolean A0F;
    public final float A0G;
    public final UserSession A0H;
    public final C69453Af A0I;
    public final boolean A0J;

    public C31862DzU(Context context, UserSession userSession, C69453Af c69453Af) {
        super(0, 8);
        Resources resources;
        int i;
        float dimension;
        this.A09 = context;
        this.A0H = userSession;
        this.A0I = c69453Af;
        C06090Tz c06090Tz = C06090Tz.A05;
        this.A0J = C18U.A06(c06090Tz, userSession, 36320279271514372L);
        this.A0F = C18U.A06(c06090Tz, userSession, 36320279271907592L);
        float dimension2 = context.getResources().getDimension(R.dimen.ab_test_media_thumbnail_preview_item_internal_padding);
        this.A06 = dimension2;
        this.A08 = dimension2 / 2.0f;
        Drawable drawable = context.getDrawable(R.drawable.instagram_group_pano_filled_24);
        Drawable drawable2 = null;
        if (drawable != null) {
            AbstractC25231BEo.A0x(context, drawable, AbstractC53242c7.A08(context));
        } else {
            drawable = null;
        }
        this.A0E = drawable;
        Drawable drawable3 = context.getDrawable(R.drawable.instagram_chevron_left_pano_outline_24);
        if (drawable3 != null) {
            AbstractC25231BEo.A0x(context, drawable3, AbstractC53242c7.A08(context));
        } else {
            drawable3 = null;
        }
        this.A0C = drawable3;
        Drawable drawable4 = context.getDrawable(R.drawable.instagram_chevron_right_pano_outline_24);
        if (drawable4 != null) {
            AbstractC25231BEo.A0x(context, drawable4, AbstractC53242c7.A08(context));
            drawable2 = drawable4;
        }
        this.A0D = drawable2;
        Paint paint = new Paint();
        paint.setAntiAlias(true);
        AbstractC166987dD.A1N(context, paint, R.color.context_line_color);
        this.A0A = paint;
        Paint paint2 = new Paint();
        paint2.setAntiAlias(true);
        AbstractC166987dD.A1N(context, paint2, R.color.context_line_color);
        paint2.setStrokeWidth(context.getResources().getDimension(R.dimen.abc_control_corner_material));
        paint2.setStyle(Paint.Style.STROKE);
        this.A0B = paint2;
        float dimension3 = context.getResources().getDimension(R.dimen.abc_button_padding_horizontal_material);
        this.A07 = dimension3;
        if (((int) C18U.A00(c06090Tz, userSession, 37164704202817878L)) > 0) {
            dimension = AbstractC13880nE.A04(context, (int) C18U.A00(c06090Tz, userSession, 37164704202817878L));
        } else {
            if (!this.A02 && this.A0F) {
                resources = this.A09.getResources();
                i = R.dimen.abc_select_dialog_padding_start_material;
            } else {
                resources = this.A09.getResources();
                i = R.dimen.ab_test_media_thumbnail_preview_item_internal_padding;
            }
            dimension = dimension3 + ((dimension2 + resources.getDimension(i)) * 2.0f);
        }
        this.A0G = dimension;
        this.A01 = true;
        this.A05 = true;
    }

    @Override // X.C8S8
    public final void clearView(RecyclerView recyclerView, C3OO c3oo) {
        Integer num;
        String str;
        AbstractC167007dF.A1K(recyclerView, c3oo);
        if (this.A03) {
            boolean z = !this.A02;
            this.A02 = z;
            C69453Af c69453Af = this.A0I;
            c69453Af.A08(z);
            C69623Aw c69623Aw = new C69623Aw(c69453Af, this.A0H);
            if (this.A01) {
                num = C05F.A0j;
            } else {
                num = C05F.A0u;
            }
            String str2 = c69453Af.A03.A04;
            if (this.A02) {
                str = "ig_group_story_tray_swipe_entry";
            } else {
                str = "ig_group_story_tray_swipe_exit";
            }
            c69623Aw.A00(null, num, null, null, null, str2, null, null, null, str);
        }
        this.A03 = false;
        super.clearView(recyclerView, c3oo);
    }

    @Override // X.UGO, X.C8S8
    public final int getMovementFlags(RecyclerView recyclerView, C3OO c3oo) {
        C14360o3.A0B(c3oo, 1);
        if (c3oo.itemView.getTag() instanceof C3OS) {
            Object tag = c3oo.itemView.getTag();
            C14360o3.A0C(tag, "null cannot be cast to non-null type com.instagram.reels.ui.ReelFeedTrayViewBinder.Holder");
            View childAt = ((C3OS) tag).A00.getChildAt(0);
            if (C14360o3.A0K(childAt.getContentDescription(), "reels_tray_container")) {
                LinearLayoutManager A0J = AbstractC31177DnL.A0J((RecyclerView) childAt);
                int i = 0;
                if (A0J.A1c() == 0) {
                    i = (8 << 8) | (8 << 0);
                }
                if (this.A0J && A0J.A1d() == A0J.A0U() - 1) {
                    return i | (4 << 0) | (4 << 8);
                }
                return i;
            }
        }
        return 0;
    }

    @Override // X.C8S8
    public final float getSwipeEscapeVelocity(float f) {
        return 9999.0f;
    }

    @Override // X.C8S8
    public final float getSwipeThreshold(C3OO c3oo) {
        return 9999.0f;
    }

    @Override // X.C8S8
    public final void onChildDraw(Canvas canvas, RecyclerView recyclerView, C3OO c3oo, float f, float f2, int i, boolean z) {
        Context context;
        Resources resources;
        int i2;
        Resources resources2;
        int i3;
        Drawable drawable;
        Drawable drawable2;
        boolean A1b = AbstractC25233BEq.A1b(canvas, recyclerView, c3oo);
        float abs = Math.abs(f);
        this.A00 = abs;
        View A06 = AbstractC31171DnF.A06(c3oo);
        if (Build.VERSION.SDK_INT >= 30) {
            if (this.A00 >= this.A0G) {
                if (this.A05) {
                    A06.performHapticFeedback(16);
                    this.A05 = false;
                }
            } else {
                this.A05 = A1b;
            }
        }
        if (!this.A02 && this.A0F) {
            float f3 = abs / 600.0f;
            float f4 = 1.0f;
            if (1.0f > f3) {
                f4 = f3;
            }
            float f5 = 1.0f - f4;
            RecyclerView recyclerView2 = this.A0I.A0P.A03;
            if (recyclerView2 != null) {
                View childAt = recyclerView2.getChildAt(0);
                if (childAt != null) {
                    childAt.setScaleX(f5);
                    childAt.setScaleY(f5);
                }
                recyclerView2.setTranslationX(f);
            }
        }
        float top = A06.getTop() + (A06.getHeight() / 2.0f);
        float left = A06.getLeft();
        if (!this.A02 && this.A0F) {
            context = this.A09;
            resources = context.getResources();
            i2 = R.dimen.abc_action_bar_elevation_material;
        } else {
            context = this.A09;
            resources = context.getResources();
            i2 = R.dimen.abc_button_padding_horizontal_material;
        }
        float dimension = resources.getDimension(i2);
        if (!this.A02 && this.A0F) {
            resources2 = context.getResources();
            i3 = R.dimen.abc_select_dialog_padding_start_material;
        } else {
            resources2 = context.getResources();
            i3 = R.dimen.ab_test_media_thumbnail_preview_item_internal_padding;
        }
        float dimension2 = resources2.getDimension(i3);
        float f6 = this.A00;
        float f7 = this.A06;
        float f8 = this.A07;
        if (f6 >= ((dimension + f7) * 2.0f) + f8) {
            float f9 = (f6 - f8) / 2.0f;
            float f10 = f7 + dimension2;
            if (f9 > f10) {
                f9 = f10;
            }
            float f11 = left + f8 + f9;
            float f12 = ((f9 - f7) - dimension) / (dimension2 - dimension);
            int i4 = (int) (255.0f * f12);
            boolean z2 = false;
            if (f >= 0.0f) {
                z2 = true;
            }
            this.A01 = z2;
            int i5 = AbstractC167007dF.A0K(context).widthPixels;
            boolean z3 = this.A01;
            if (!z3) {
                f11 = i5 - f11;
            }
            if (f12 == 1.0f) {
                canvas.drawCircle(f11, top, f7, this.A0A);
                if (this.A02) {
                    if (this.A01) {
                        drawable2 = this.A0C;
                    } else {
                        drawable2 = this.A0D;
                    }
                } else {
                    drawable2 = this.A0E;
                }
                if (drawable2 != null) {
                    float f13 = this.A08;
                    drawable2.setBounds((int) (f11 - f13), (int) (top - f13), (int) (f11 + f13), (int) (f13 + top));
                    drawable2.setAlpha(i4);
                } else {
                    throw AbstractC166997dE.A0g();
                }
            } else {
                if (this.A02) {
                    if (z3) {
                        drawable = this.A0C;
                    } else {
                        drawable = this.A0D;
                    }
                } else {
                    drawable = this.A0E;
                }
                if (drawable != null) {
                    drawable2 = new ScaleDrawable(drawable, 17, f12, f12).getDrawable();
                    if (drawable2 != null) {
                        drawable2.setAlpha(i4);
                        float f14 = this.A08 * f12;
                        drawable2.setBounds((int) (f11 - f14), (int) (top - f14), (int) (f11 + f14), (int) (f14 + top));
                    } else {
                        throw AbstractC166997dE.A0g();
                    }
                } else {
                    throw AbstractC166997dE.A0g();
                }
            }
            drawable2.draw(canvas);
            Paint paint = this.A0B;
            paint.setAlpha(i4);
            canvas.drawArc(new RectF(f11 - f7, top - f7, f11 + f7, top + f7), 270.0f, 360.0f * f12, false, paint);
        }
        if (this.A02 || !this.A0F) {
            super.onChildDraw(canvas, recyclerView, c3oo, f, f2, i, z);
        }
    }

    @Override // X.C8S8
    public final boolean onMove(RecyclerView recyclerView, C3OO c3oo, C3OO c3oo2) {
        return false;
    }

    @Override // X.C8S8
    public final void onSelectedChanged(C3OO c3oo, int i) {
        if (i != 0) {
            if (i == 1) {
                this.A04 = true;
                this.A02 = this.A0I.A0A();
                return;
            }
            return;
        }
        if (!this.A04) {
            return;
        }
        this.A03 = this.A00 > this.A0G;
        this.A04 = false;
    }

    @Override // X.C8S8
    public final void onSwiped(C3OO c3oo, int i) {
    }
}
