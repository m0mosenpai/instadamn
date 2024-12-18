package X;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.text.Layout;
import com.facebook.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.8xQ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C202468xQ extends AbstractC130945vi implements C5RR, InterfaceC133125ze {
    public final int A00;
    public final int A01;
    public final int A02;
    public final int A03;
    public final int A04;
    public final int A05;
    public final int A06;
    public final int A07;
    public final Context A08;
    public final Wm4 A09;
    public final C6RB A0A;
    public final boolean A0B;
    public final int A0C;
    public final int A0D;
    public final int A0E;
    public final int A0F;
    public final Drawable A0G;
    public final Drawable A0H;
    public final Drawable A0I;
    public final Drawable A0J;
    public final ArrayList A0K;
    public final List A0L;
    public final List A0M;
    public final List A0N;
    public final List A0O;
    public final List A0P;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v2, types: [X.0sl] */
    /* JADX WARN: Type inference failed for: r3v3, types: [java.util.List, java.util.Collection] */
    /* JADX WARN: Type inference failed for: r3v4, types: [java.util.AbstractCollection, java.util.ArrayList] */
    public C202468xQ(Context context, Wm4 wm4) {
        Drawable drawable;
        C6RB c6rb;
        ?? r3;
        C14360o3.A0B(context, 1);
        C14360o3.A0B(wm4, 2);
        this.A08 = context;
        this.A09 = wm4;
        this.A01 = context.getResources().getDimensionPixelSize(R.dimen.challenge_sticker_button_text_size);
        boolean z = wm4.A08;
        this.A0B = z;
        this.A0N = wm4.A05;
        int dimensionPixelSize = this.A08.getResources().getDimensionPixelSize(R.dimen.before_and_after_media_card_width);
        this.A07 = dimensionPixelSize;
        int dimensionPixelSize2 = this.A08.getResources().getDimensionPixelSize(R.dimen.ab_test_media_thumbnail_preview_item_internal_padding);
        this.A06 = dimensionPixelSize2;
        int dimensionPixelSize3 = this.A08.getResources().getDimensionPixelSize(R.dimen.poll_v2_sticker_title_text_size);
        this.A05 = this.A08.getResources().getDimensionPixelSize(R.dimen.ab_test_media_thumbnail_preview_item_internal_padding);
        this.A04 = this.A08.getResources().getDimensionPixelSize(R.dimen.account_discovery_bottom_gap);
        this.A0D = this.A08.getResources().getDimensionPixelSize(R.dimen.abc_button_padding_horizontal_material);
        this.A0E = this.A08.getResources().getDimensionPixelSize(R.dimen.abc_alert_dialog_button_dimen);
        this.A0F = this.A08.getResources().getDimensionPixelSize(R.dimen.abc_button_padding_horizontal_material);
        this.A00 = this.A08.getResources().getDimensionPixelSize(R.dimen.account_discovery_bottom_gap);
        this.A03 = this.A08.getResources().getDimensionPixelSize(R.dimen.add_to_story_dual_destination_share_sheet_avatar_icon_size);
        this.A02 = this.A08.getResources().getDimensionPixelSize(R.dimen.poll_v2_sticker_result_percentage_text_size);
        boolean z2 = wm4.A04 != null;
        this.A0C = wm4.A06.size();
        Drawable drawable2 = context.getDrawable(R.drawable.poll_v2_sticker_background);
        if (drawable2 != null) {
            this.A0G = drawable2;
            if (z2) {
                drawable = A00(R.drawable.poll_v2_sticker_title_background);
            } else {
                drawable = null;
            }
            this.A0J = drawable;
            if (z2) {
                c6rb = new C6RB(context, dimensionPixelSize - (dimensionPixelSize2 * 2));
                Context context2 = c6rb.A0Z;
                C14360o3.A07(context2);
                AMr.A06(context2, c6rb, dimensionPixelSize3, 0.0f);
                c6rb.A0F(context2.getColor(AbstractC53242c7.A0A(context2)));
                String str = wm4.A04;
                c6rb.A0M(str == null ? "" : str);
            } else {
                c6rb = null;
            }
            this.A0A = c6rb;
            Drawable drawable3 = context.getDrawable(R.drawable.poll_v2_sticker_option_background);
            if (drawable3 != null) {
                this.A0I = drawable3;
                Drawable A00 = z ? A00(R.drawable.poll_v2_sticker_option_background) : null;
                this.A0H = A00;
                List list = this.A09.A06;
                ArrayList arrayList = new ArrayList(AbstractC06950Ym.A1E(list, 10));
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    String str2 = ((C101374gu) it.next()).A02;
                    if (str2 == null) {
                        str2 = "";
                    }
                    arrayList.add(A01(str2, false));
                }
                this.A0O = arrayList;
                if (this.A0B) {
                    List list2 = this.A09.A06;
                    r3 = new ArrayList(AbstractC06950Ym.A1E(list2, 10));
                    Iterator it2 = list2.iterator();
                    while (it2.hasNext()) {
                        String str3 = ((C101374gu) it2.next()).A02;
                        if (str3 == null) {
                            str3 = "";
                        }
                        r3.add(A01(str3, true));
                    }
                } else {
                    r3 = C16930sl.A00;
                }
                this.A0L = r3;
                List A02 = A02(false);
                this.A0P = A02;
                List A022 = A02(true);
                this.A0M = A022;
                ArrayList arrayList2 = new ArrayList();
                this.A0K = arrayList2;
                arrayList2.add(drawable2);
                if (drawable != null) {
                    arrayList2.add(drawable);
                }
                if (c6rb != null) {
                    arrayList2.add(c6rb);
                }
                arrayList2.add(drawable3);
                if (A00 != null) {
                    arrayList2.add(A00);
                }
                arrayList2.addAll(arrayList);
                arrayList2.addAll(r3);
                arrayList2.addAll(A02);
                arrayList2.addAll(A022);
                return;
            }
            throw new IllegalStateException("Required value was null.");
        }
        throw new IllegalStateException("Required value was null.");
    }

    @Override // X.InterfaceC133125ze
    public final String C5K() {
        return AbstractC111324zv.A00(2882);
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        C14360o3.A0B(canvas, 0);
        this.A0G.draw(canvas);
        Drawable drawable = this.A0J;
        if (drawable != null) {
            drawable.draw(canvas);
        }
        C6RB c6rb = this.A0A;
        if (c6rb != null) {
            c6rb.draw(canvas);
        }
        canvas.save();
        int i = this.A0C;
        for (int i2 = 0; i2 < i; i2++) {
            this.A0I.draw(canvas);
            ((Drawable) this.A0O.get(i2)).draw(canvas);
            if (this.A0B) {
                ((Drawable) this.A0P.get(i2)).draw(canvas);
                List list = this.A0N;
                if (list != null) {
                    float intValue = ((Number) list.get(i2)).intValue();
                    Drawable drawable2 = this.A0H;
                    if (drawable2 != null) {
                        Rect bounds = drawable2.getBounds();
                        C14360o3.A07(bounds);
                        int width = bounds.width();
                        float f = bounds.left;
                        float f2 = (width * (intValue / 100.0f)) + f;
                        float f3 = bounds.top;
                        float f4 = bounds.bottom;
                        canvas.save();
                        canvas.clipRect(f, f3, f2, f4);
                        drawable2.draw(canvas);
                        ((Drawable) this.A0L.get(i2)).draw(canvas);
                        ((Drawable) this.A0M.get(i2)).draw(canvas);
                        canvas.restore();
                    } else {
                        throw new IllegalStateException("Required value was null.");
                    }
                } else {
                    throw new IllegalStateException("Required value was null.");
                }
            }
            canvas.translate(0.0f, this.A0E + this.A0F);
        }
        canvas.restore();
    }

    private final Drawable A00(int i) {
        Drawable drawable = this.A08.getDrawable(i);
        if (drawable != null) {
            Drawable mutate = drawable.mutate();
            C14360o3.A0C(mutate, "null cannot be cast to non-null type android.graphics.drawable.GradientDrawable");
            ((GradientDrawable) mutate).setColors(AbstractC209259Nh.A02(this.A09.A00));
            C14360o3.A07(mutate);
            return mutate;
        }
        throw new IllegalStateException("Required value was null.");
    }

    private final C6RB A01(String str, boolean z) {
        Context context = this.A08;
        C6RB c6rb = new C6RB(context, ((this.A07 - (this.A06 * 2)) - this.A00) - this.A03);
        c6rb.A0A(this.A01);
        c6rb.A0K(Layout.Alignment.ALIGN_NORMAL);
        int i = R.attr.igds_color_text_on_white;
        if (z) {
            i = R.attr.igds_color_primary_text_on_media;
        }
        c6rb.A0F(context.getColor(AbstractC53242c7.A0H(context, i)));
        c6rb.A0b.setFakeBoldText(true);
        c6rb.A0M(str);
        return c6rb;
    }

    private final List A02(boolean z) {
        if (this.A0B) {
            List list = this.A0N;
            if (list != null) {
                ArrayList arrayList = new ArrayList(AbstractC06950Ym.A1E(list, 10));
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    int intValue = ((Number) it.next()).intValue();
                    Context context = this.A08;
                    C6RB c6rb = new C6RB(context, this.A03);
                    Context context2 = c6rb.A0Z;
                    C14360o3.A07(context2);
                    AMr.A06(context2, c6rb, this.A02, 0.0f);
                    int i = R.attr.igds_color_text_on_white;
                    if (z) {
                        i = R.attr.igds_color_primary_text_on_media;
                    }
                    c6rb.A0F(context.getColor(AbstractC53242c7.A0H(context, i)));
                    c6rb.A0M(AbstractC13670mt.A06("%d%%", Integer.valueOf(intValue)));
                    arrayList.add(c6rb);
                }
                return arrayList;
            }
            throw new IllegalStateException("Required value was null.");
        }
        return C16930sl.A00;
    }

    private final void A03(Drawable drawable, int i, int i2) {
        int i3 = i - ((int) (this.A03 / 2.0f));
        int i4 = i2 + ((int) (this.A0E / 2.0f));
        drawable.setBounds(i3 - ((int) (drawable.getIntrinsicWidth() / 2.0f)), i4 - ((int) (drawable.getIntrinsicHeight() / 2.0f)), i3 + ((int) (drawable.getIntrinsicWidth() / 2.0f)), i4 + ((int) (drawable.getIntrinsicHeight() / 2.0f)));
    }

    private final void A04(Drawable drawable, int i, int i2, int i3) {
        int i4 = i3 + ((int) (this.A0E / 2.0f));
        drawable.setBounds(i + this.A00, i4 - ((int) (drawable.getIntrinsicHeight() / 2.0f)), i2 - this.A03, i4 + ((int) (drawable.getIntrinsicHeight() / 2.0f)));
    }

    @Override // X.C5RN
    public final List A07() {
        return this.A0K;
    }

    @Override // X.AbstractC130945vi
    public final boolean A0A() {
        return !this.A0B;
    }

    @Override // X.C5RR
    public final C5NL C0T() {
        return this.A09;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        int i;
        C6RB c6rb = this.A0A;
        if (c6rb != null) {
            i = ((this.A05 + this.A04) + c6rb.A06) - c6rb.A08;
        } else {
            i = 0;
        }
        return i + this.A0D + (this.A0C * (this.A0E + this.A0F)) + this.A06;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return this.A07;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setBounds(int i, int i2, int i3, int i4) {
        int i5;
        super.setBounds(i, i2, i3, i4);
        int i6 = (int) ((i + i3) / 2.0f);
        float f = i6;
        float f2 = this.A07 / 2.0f;
        int i7 = (int) (f - f2);
        float f3 = (int) ((i2 + i4) / 2.0f);
        float intrinsicHeight = getIntrinsicHeight() / 2.0f;
        int i8 = (int) (f3 - intrinsicHeight);
        int i9 = (int) (f + f2);
        this.A0G.setBounds(i7, i8, i9, (int) (f3 + intrinsicHeight));
        C6RB c6rb = this.A0A;
        if (c6rb != null) {
            i5 = ((this.A05 + this.A04) + c6rb.A06) - c6rb.A08;
        } else {
            i5 = 0;
        }
        Drawable drawable = this.A0J;
        if (drawable != null) {
            drawable.setBounds(i7, i8, i9, i8 + i5);
        }
        if (c6rb != null) {
            int i10 = c6rb.A08;
            int i11 = (int) (c6rb.A0A / 2.0f);
            c6rb.setBounds(i6 - i11, (this.A05 + i8) - i10, i6 + i11, ((i8 + i5) - this.A04) + i10);
        }
        int i12 = i8 + i5 + this.A0D + this.A0F;
        int i13 = this.A06;
        int i14 = i + i13;
        int i15 = i3 - i13;
        int i16 = this.A0E + i12;
        this.A0I.setBounds(i14, i12, i15, i16);
        Drawable drawable2 = this.A0H;
        if (drawable2 != null) {
            drawable2.setBounds(i14, i12, i15, i16);
        }
        int i17 = this.A0C;
        for (int i18 = 0; i18 < i17; i18++) {
            A04((Drawable) this.A0O.get(i18), i14, i15, i12);
            if (this.A0B) {
                A04((Drawable) this.A0L.get(i18), i14, i15, i12);
                A03((Drawable) this.A0P.get(i18), i15, i12);
                A03((Drawable) this.A0M.get(i18), i15, i12);
            }
        }
    }
}
