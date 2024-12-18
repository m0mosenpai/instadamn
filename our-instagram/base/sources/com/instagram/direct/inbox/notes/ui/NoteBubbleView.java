package com.instagram.direct.inbox.notes.ui;

import X.AbstractC13620mo;
import X.AbstractC13690mv;
import X.AbstractC138576Pn;
import X.AbstractC13880nE;
import X.AbstractC20100yh;
import X.AbstractC53242c7;
import X.AbstractC56372iV;
import X.AnonymousClass001;
import X.C00O;
import X.C07T;
import X.C138586Po;
import X.C14360o3;
import X.C152716tz;
import X.C1H6;
import X.C20150ym;
import X.C25565BSc;
import X.C3DY;
import X.C3LQ;
import X.C44342Jih;
import X.C4GL;
import X.C50802Vb;
import X.C74F;
import X.C85973sR;
import X.InterfaceC16820sZ;
import X.InterfaceC56392iX;
import X.InterfaceC65626Tpm;
import X.MHM;
import X.RunnableC49989M5e;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Looper;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.style.StyleSpan;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.facebook.R;
import com.instagram.api.schemas.NoteCustomTheme;
import com.instagram.common.ui.base.IgLinearLayout;
import com.instagram.common.ui.base.IgTextView;
import com.instagram.common.ui.widget.imageview.IgImageView;
import com.instagram.direct.inbox.notes.ui.NoteBubbleView;
import com.instagram.ui.widget.spinner.SpinnerImageView;

/* loaded from: classes3.dex */
public final class NoteBubbleView extends ConstraintLayout {
    public Drawable A00;
    public View A01;
    public CardView A02;
    public CardView A03;
    public CardView A04;
    public C07T A05;
    public IgLinearLayout A06;
    public IgLinearLayout A07;
    public IgLinearLayout A08;
    public IgTextView A09;
    public IgTextView A0A;
    public IgImageView A0B;
    public IgImageView A0C;
    public IgImageView A0D;
    public IgImageView A0E;
    public InterfaceC56392iX A0F;
    public InterfaceC56392iX A0G;
    public C138586Po A0H;
    public SpinnerImageView A0I;
    public boolean A0J;
    public IgTextView A0K;
    public IgTextView A0L;
    public IgTextView A0M;
    public IgTextView A0N;
    public IgTextView A0O;
    public IgTextView A0P;
    public IgTextView A0Q;
    public IgTextView A0R;
    public IgImageView A0S;
    public IgImageView A0T;
    public Integer A0U;
    public Integer A0V;
    public Integer A0W;
    public boolean A0X;
    public boolean A0Y;
    public boolean A0Z;
    public boolean A0a;
    public boolean A0b;
    public final float A0c;
    public final int A0d;
    public final int A0e;
    public final Handler A0f;
    public final InterfaceC65626Tpm A0g;
    public final C74F A0h;
    public final float A0i;
    public final float A0j;
    public final int A0k;
    public final int A0l;
    public final int A0m;
    public final Paint A0n;
    public final Paint A0o;
    public final RectF A0p;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public NoteBubbleView(Context context) {
        this(context, null);
        C14360o3.A0B(context, 1);
    }

    public final void A0G(CharSequence charSequence, String str, String str2, boolean z) {
        int color;
        IgLinearLayout igLinearLayout;
        Integer num = this.A0W;
        if (num != null) {
            color = num.intValue();
        } else {
            color = this.A07.getContext().getColor(AbstractC53242c7.A0H(getContext(), R.attr.igds_color_primary_icon));
        }
        C138586Po A00 = AbstractC138576Pn.A00(1.0f, getResources().getDimensionPixelSize(R.dimen.abc_button_padding_horizontal_material), true);
        A00.A0A.setColor(color);
        this.A0H = A00;
        IgImageView igImageView = this.A0T;
        if (igImageView != null) {
            igImageView.setImageDrawable(A00);
        }
        IgTextView igTextView = this.A09;
        if (igTextView != null) {
            igTextView.setText(str);
        }
        IgTextView igTextView2 = this.A0R;
        if (igTextView2 != null) {
            igTextView2.setText(A01(str2, z));
        }
        C07T c07t = this.A05;
        if (c07t != null) {
            InterfaceC65626Tpm interfaceC65626Tpm = this.A0g;
            c07t.A0A(interfaceC65626Tpm);
            c07t.A09(interfaceC65626Tpm);
            IgTextView igTextView3 = this.A0R;
            if (igTextView3 != null) {
                igTextView3.setSelected(true);
            }
            int length = charSequence.length();
            IgTextView igTextView4 = this.A0Q;
            if (length > 0) {
                if (igTextView4 != null) {
                    igTextView4.setText(charSequence);
                }
                IgTextView igTextView5 = this.A0Q;
                if (igTextView5 != null) {
                    igTextView5.setVisibility(0);
                }
            } else if (igTextView4 != null) {
                igTextView4.setVisibility(8);
            }
            if (this.A0J && (igLinearLayout = this.A06) != null) {
                int i = this.A0l;
                igLinearLayout.setPadding(i, this.A0k, i, i);
            }
            Integer num2 = this.A0W;
            if (num2 != null) {
                int intValue = num2.intValue();
                IgTextView igTextView6 = this.A0Q;
                if (igTextView6 != null) {
                    igTextView6.setTextColor(intValue);
                }
                IgTextView igTextView7 = this.A0R;
                if (igTextView7 != null) {
                    igTextView7.setTextColor(intValue);
                }
                IgTextView igTextView8 = this.A09;
                if (igTextView8 != null) {
                    igTextView8.setTextColor(intValue);
                }
            }
            Context context = getContext();
            C14360o3.A07(context);
            setBubbleBackgroundColor(A00(context));
            return;
        }
        throw new IllegalStateException("Required value was null.");
    }

    public final void A0H(CharSequence charSequence, String str, String str2, boolean z) {
        Context context = getContext();
        C14360o3.A07(context);
        Drawable A05 = C3LQ.A05(context, R.drawable.instagram_headphones_pano_filled_12, context.getColor(AbstractC53242c7.A08(context)));
        IgImageView igImageView = this.A0S;
        if (igImageView != null) {
            igImageView.setImageDrawable(A05);
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        StyleSpan styleSpan = new StyleSpan(1);
        int length = spannableStringBuilder.length();
        spannableStringBuilder.append((CharSequence) A01(str2, z));
        spannableStringBuilder.setSpan(styleSpan, length, spannableStringBuilder.length(), 17);
        SpannableStringBuilder append = spannableStringBuilder.append((CharSequence) " ").append(context.getText(2131965284)).append((CharSequence) " ").append((CharSequence) str);
        IgTextView igTextView = this.A0N;
        if (igTextView != null) {
            igTextView.setText(append);
        }
        IgTextView igTextView2 = this.A0N;
        if (igTextView2 != null) {
            igTextView2.setSelected(true);
        }
        IgTextView igTextView3 = this.A0L;
        if (igTextView3 != null) {
            igTextView3.setVisibility(0);
        }
        IgTextView igTextView4 = this.A0N;
        if (igTextView4 != null) {
            igTextView4.setAlpha(1.0f);
        }
        IgImageView igImageView2 = this.A0S;
        if (igImageView2 != null) {
            igImageView2.setAlpha(1.0f);
        }
        int length2 = charSequence.length();
        IgTextView igTextView5 = this.A0M;
        if (length2 > 0) {
            if (igTextView5 != null) {
                igTextView5.setText(charSequence);
            }
            IgTextView igTextView6 = this.A0M;
            if (igTextView6 != null) {
                igTextView6.setVisibility(0);
                return;
            }
            return;
        }
        if (igTextView5 == null) {
            return;
        }
        igTextView5.setVisibility(8);
    }

    public final void A0I(CharSequence charSequence, boolean z) {
        IgTextView igTextView = this.A0N;
        float f = 1.0f;
        if (igTextView != null) {
            float f2 = 0.3f;
            if (z) {
                f2 = 1.0f;
            }
            igTextView.setAlpha(f2);
        }
        IgImageView igImageView = this.A0S;
        if (igImageView != null) {
            if (!z) {
                f = 0.3f;
            }
            igImageView.setAlpha(f);
        }
        IgTextView igTextView2 = this.A0N;
        if (igTextView2 != null) {
            Context context = getContext();
            int i = 2131965285;
            if (z) {
                i = 2131965287;
            }
            igTextView2.setText(context.getText(i));
        }
        IgTextView igTextView3 = this.A0N;
        boolean z2 = true;
        if (igTextView3 != null) {
            igTextView3.setSelected(true);
        }
        IgTextView igTextView4 = this.A0N;
        if (igTextView4 != null) {
            igTextView4.setTypeface(null, 1);
        }
        if (charSequence.length() <= 0) {
            z2 = false;
        }
        IgTextView igTextView5 = this.A0M;
        if (z2) {
            if (igTextView5 != null) {
                igTextView5.setText(charSequence);
            }
            IgTextView igTextView6 = this.A0M;
            if (igTextView6 != null) {
                igTextView6.setVisibility(0);
            }
        } else if (igTextView5 != null) {
            igTextView5.setVisibility(8);
        }
        IgTextView igTextView7 = this.A0L;
        if (igTextView7 != null) {
            igTextView7.setVisibility(8);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0037, code lost:
    
        if (r12.A0C.getVisibility() == 0) goto L54;
     */
    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void dispatchDraw(android.graphics.Canvas r13) {
        /*
            r12 = this;
            r10 = 0
            r6 = r13
            X.C14360o3.A0B(r13, r10)
            super.dispatchDraw(r13)
            androidx.cardview.widget.CardView r5 = r12.A02
            int r0 = r5.getVisibility()
            if (r0 == 0) goto L39
            X.2iX r0 = r12.A0G
            int r0 = r0.CGb()
            if (r0 == 0) goto L39
            com.instagram.common.ui.widget.imageview.IgImageView r0 = r12.A0B
            int r0 = r0.getVisibility()
            if (r0 == 0) goto L39
            com.instagram.common.ui.widget.imageview.IgImageView r0 = r12.A0E
            int r0 = r0.getVisibility()
            if (r0 == 0) goto L39
            com.instagram.common.ui.widget.imageview.IgImageView r0 = r12.A0D
            int r0 = r0.getVisibility()
            if (r0 == 0) goto L39
            com.instagram.common.ui.widget.imageview.IgImageView r0 = r12.A0C
            int r0 = r0.getVisibility()
            r1 = 0
            if (r0 != 0) goto L3a
        L39:
            r1 = 1
        L3a:
            boolean r0 = r12.A0J
            if (r0 != 0) goto Lbc
            if (r1 == 0) goto Lbc
            com.instagram.common.ui.widget.imageview.IgImageView r3 = r12.A0E
            int r0 = r3.getVisibility()
            if (r0 != 0) goto Ld6
            r4 = 1094713344(0x41400000, float:12.0)
        L4a:
            boolean r2 = r12.A0X
            if (r2 == 0) goto Lc2
            int r1 = r5.getWidth()
            com.instagram.common.ui.base.IgLinearLayout r5 = r12.A07
            int r0 = r5.getPaddingStart()
            int r1 = r1 + r0
            float r1 = (float) r1
            android.content.res.Resources r0 = r12.getResources()
            android.util.DisplayMetrics r0 = r0.getDisplayMetrics()
            float r0 = r0.density
            float r4 = r4 * r0
            float r1 = r1 - r4
        L66:
            int r4 = r12.getHeight()
            int r0 = r5.getPaddingBottom()
            int r4 = r4 - r0
            float r4 = (float) r4
            float r5 = r12.getLargeThoughtBubbleRadius()
            r0 = 1073741824(0x40000000, float:2.0)
            float r5 = r5 / r0
            float r4 = r4 - r5
            r8 = 1097859072(0x41700000, float:15.0)
            r9 = 1127481344(0x43340000, float:180.0)
            float r0 = r0 * r8
            float r9 = r9 - r0
            android.graphics.RectF r7 = r12.A0p
            float r0 = r12.getLargeThoughtBubbleRadius()
            float r0 = r1 - r0
            r7.left = r0
            float r0 = r12.getLargeThoughtBubbleRadius()
            float r0 = r0 + r1
            r7.right = r0
            float r0 = r12.getLargeThoughtBubbleRadius()
            float r0 = r4 - r0
            r7.top = r0
            float r0 = r12.getLargeThoughtBubbleRadius()
            float r0 = r0 + r4
            r7.bottom = r0
            int r0 = r3.getVisibility()
            if (r0 != 0) goto Lbf
            android.graphics.Paint r11 = r12.A0o
        La6:
            r6.drawArc(r7, r8, r9, r10, r11)
            float r0 = r12.getSmallThoughtBubbleXOffset()
            if (r2 == 0) goto Lbd
            float r1 = r1 + r0
        Lb0:
            float r0 = r12.getSmallThoughtBubbleYOffset()
            float r4 = r4 + r0
            float r0 = r12.getSmallThoughtBubbleRadius()
            r13.drawCircle(r1, r4, r0, r11)
        Lbc:
            return
        Lbd:
            float r1 = r1 - r0
            goto Lb0
        Lbf:
            android.graphics.Paint r11 = r12.A0n
            goto La6
        Lc2:
            com.instagram.common.ui.base.IgLinearLayout r5 = r12.A07
            int r0 = r5.getPaddingEnd()
            float r1 = (float) r0
            android.content.res.Resources r0 = r12.getResources()
            android.util.DisplayMetrics r0 = r0.getDisplayMetrics()
            float r0 = r0.density
            float r4 = r4 * r0
            float r1 = r1 + r4
            goto L66
        Ld6:
            com.instagram.common.ui.widget.imageview.IgImageView r0 = r12.A0D
            int r0 = r0.getVisibility()
            r4 = 1099956224(0x41900000, float:18.0)
            if (r0 != 0) goto L4a
            r4 = 1090519040(0x41000000, float:8.0)
            goto L4a
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.direct.inbox.notes.ui.NoteBubbleView.dispatchDraw(android.graphics.Canvas):void");
    }

    public final void setBubbleOnTop(boolean z) {
    }

    public final void setCustomTheme(NoteCustomTheme noteCustomTheme) {
        Integer num;
        Integer num2;
        Integer num3 = null;
        if (noteCustomTheme != null && noteCustomTheme.C6B() != null) {
            num = Integer.valueOf(Color.parseColor(noteCustomTheme.C6B()));
        } else {
            num = null;
        }
        this.A0W = num;
        if (noteCustomTheme != null && noteCustomTheme.Aev() != null) {
            num2 = Integer.valueOf(Color.parseColor(noteCustomTheme.Aev()));
        } else {
            num2 = null;
        }
        this.A0U = num2;
        if (noteCustomTheme != null && noteCustomTheme.C31() != null) {
            num3 = Integer.valueOf(Color.parseColor(noteCustomTheme.C31()));
        }
        this.A0V = num3;
    }

    public final void setLocationContent(String str, CharSequence charSequence, String str2) {
        C85973sR c85973sR;
        Drawable mutate;
        C14360o3.A0B(str, 0);
        C14360o3.A0B(charSequence, 1);
        Context context = getContext();
        Drawable drawable = context.getDrawable(R.drawable.instagram_location_filled_12);
        if (drawable != null && (mutate = drawable.mutate()) != null) {
            mutate.setColorFilter(new PorterDuffColorFilter(context.getColor(R.color.igds_internal_vibrant_pink), PorterDuff.Mode.SRC_IN));
        }
        int dimensionPixelSize = getResources().getDimensionPixelSize(R.dimen.abc_button_padding_horizontal_material);
        if (drawable != null) {
            drawable.setBounds(0, 0, dimensionPixelSize, dimensionPixelSize);
        }
        SpannableString spannableString = new SpannableString(AnonymousClass001.A0D(str, ' '));
        if (drawable != null) {
            c85973sR = new C85973sR(drawable);
            c85973sR.A01 = (int) AbstractC13690mv.A00(context, 4.0f);
        } else {
            c85973sR = null;
        }
        spannableString.setSpan(c85973sR, 0, 1, 33);
        IgTextView igTextView = this.A0P;
        if (igTextView != null) {
            igTextView.setText(spannableString);
            AbstractC13880nE.A0q(igTextView, new RunnableC49989M5e(igTextView, charSequence, str));
        }
    }

    public final void setLyricText(String str) {
        C14360o3.A0B(str, 0);
        Drawable drawable = this.A00;
        if (drawable == null) {
            drawable = getLyricDrawable();
            this.A00 = drawable;
        }
        SpannableString spannableString = new SpannableString(AnonymousClass001.A0D(str, (char) 160));
        C85973sR c85973sR = new C85973sR(drawable);
        Context context = getContext();
        C14360o3.A07(context);
        c85973sR.A01 = (int) AbstractC13690mv.A00(context, 4.0f);
        spannableString.setSpan(c85973sR, 0, 1, 33);
        setText(spannableString, false, "", new MHM(this, 36));
    }

    public final void setMusicContentLayout(C07T c07t) {
        C14360o3.A0B(c07t, 0);
        this.A05 = c07t;
        InterfaceC56392iX interfaceC56392iX = this.A0G;
        this.A06 = (IgLinearLayout) interfaceC56392iX.getView().requireViewById(R.id.pog_music_note_content_container_view);
        this.A09 = (IgTextView) interfaceC56392iX.getView().requireViewById(R.id.pog_music_note_artist_name);
        IgTextView igTextView = (IgTextView) interfaceC56392iX.getView().requireViewById(R.id.pog_music_note_song_title_text);
        igTextView.setTextColor(igTextView.getContext().getColor(R.color.igds_primary_text));
        this.A0R = igTextView;
        this.A0T = (IgImageView) interfaceC56392iX.getView().requireViewById(R.id.pog_music_note_music_icon);
        this.A0Q = (IgTextView) interfaceC56392iX.getView().requireViewById(R.id.pog_music_note_text);
        this.A02.setVisibility(8);
        CardView cardView = this.A03;
        if (cardView != null) {
            cardView.setVisibility(8);
        }
        this.A0F.setVisibility(8);
        CardView cardView2 = this.A04;
        if (cardView2 != null) {
            cardView2.setVisibility(8);
        }
        interfaceC56392iX.setVisibility(0);
        ((CardView) interfaceC56392iX.getView()).setRadius(this.A0i);
        A03(interfaceC56392iX.getView(), false);
        IgLinearLayout igLinearLayout = this.A07;
        int i = this.A0d;
        igLinearLayout.setPadding(i, this.A0e, i, i);
        invalidate();
    }

    public final void setText(CharSequence charSequence, boolean z, String str, InterfaceC16820sZ interfaceC16820sZ) {
        C14360o3.A0B(charSequence, 0);
        C14360o3.A0B(str, 2);
        C14360o3.A0B(interfaceC16820sZ, 3);
        getTextView().setTextSize(this.A0j);
        getTextView().setText(charSequence);
        this.A0K.setText(str);
        C152716tz.A00.A04(getTextView(), interfaceC16820sZ, z, false);
    }

    public final void setTextView(IgTextView igTextView) {
        C14360o3.A0B(igTextView, 0);
        this.A0A = igTextView;
    }

    private final int A00(Context context) {
        int i;
        Integer num = this.A0U;
        if (num != null) {
            return num.intValue();
        }
        if (C1H6.A03()) {
            boolean z = this.A0J;
            i = R.attr.igds_color_elevated_highlight_background;
            if (z) {
                i = R.attr.igds_color_elevated_background;
            }
        } else {
            i = R.attr.igds_color_primary_background;
        }
        return context.getColor(AbstractC53242c7.A0H(context, i));
    }

    private final SpannableStringBuilder A01(String str, boolean z) {
        Drawable drawable;
        if (z) {
            drawable = getContext().getDrawable(R.drawable.music_explicit);
        } else {
            drawable = null;
        }
        Context context = getContext();
        int color = context.getColor(AbstractC53242c7.A0H(context, R.attr.igds_color_secondary_icon));
        int dimensionPixelSize = getResources().getDimensionPixelSize(R.dimen.abc_button_padding_horizontal_material);
        if (drawable != null) {
            drawable.setBounds(0, 0, dimensionPixelSize, dimensionPixelSize);
            Drawable mutate = drawable.mutate();
            if (mutate != null) {
                mutate.setColorFilter(color, PorterDuff.Mode.SRC_IN);
            }
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append((CharSequence) str);
        if (z && drawable != null) {
            C4GL.A02(drawable, spannableStringBuilder, spannableStringBuilder.length(), 12, 12);
        }
        return spannableStringBuilder;
    }

    private final void A02() {
        this.A08.setVisibility(8);
        CardView cardView = this.A02;
        cardView.setVisibility(0);
        cardView.setRadius(this.A0c);
        this.A0G.setVisibility(8);
        CardView cardView2 = this.A03;
        if (cardView2 != null) {
            cardView2.setVisibility(8);
        }
        this.A0F.setVisibility(8);
        CardView cardView3 = this.A04;
        if (cardView3 != null) {
            cardView3.setVisibility(8);
        }
        IgTextView textView = getTextView();
        IgLinearLayout igLinearLayout = this.A07;
        textView.setTextColor(igLinearLayout.getContext().getColor(AbstractC53242c7.A0H(getContext(), R.attr.igds_color_secondary_text)));
        C07T c07t = this.A05;
        if (c07t != null) {
            c07t.A0A(this.A0g);
        }
        A03(igLinearLayout, true);
        invalidate();
    }

    private final void A03(View view, boolean z) {
        int color;
        Drawable c25565BSc;
        Integer num = this.A0V;
        if (num != null) {
            color = num.intValue();
        } else {
            color = getContext().getColor(R.color.cds_white_a20);
        }
        if (this.A0J) {
            boolean z2 = false;
            view.setClipToOutline(false);
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                viewGroup.setClipChildren(false);
                viewGroup.setClipToPadding(false);
            }
            if (this.A0b) {
                this.A07.setLayerType(1, null);
            }
            if (z) {
                IgLinearLayout igLinearLayout = this.A07;
                igLinearLayout.setTranslationY(22.0f);
                igLinearLayout.setTranslationX(8.0f);
                this.A02.setBackground(null);
                view.setPadding(3, 0, 3, 15);
                Context context = getContext();
                C14360o3.A07(context);
                c25565BSc = new C44342Jih(context, A00(context), color);
            } else {
                Context context2 = getContext();
                C14360o3.A07(context2);
                c25565BSc = new C25565BSc(context2, A00(context2), color, 1906, C1H6.A03(), z2, z2, this.A0a);
            }
            view.setBackground(c25565BSc);
        }
    }

    private final float getLargeThoughtBubbleRadius() {
        float f = 5.0f;
        if (this.A0Z) {
            f = 8.0f;
        }
        Context context = getContext();
        C14360o3.A07(context);
        return AbstractC13690mv.A00(context, f);
    }

    private final float getSmallThoughtBubbleRadius() {
        float f = 2.0f;
        if (this.A0Z) {
            f = 2.75f;
        }
        Context context = getContext();
        C14360o3.A07(context);
        return AbstractC13690mv.A00(context, f);
    }

    private final float getSmallThoughtBubbleXOffset() {
        float f = -4.0f;
        if (this.A0Z) {
            f = -6.0f;
        }
        Context context = getContext();
        C14360o3.A07(context);
        return AbstractC13690mv.A00(context, f);
    }

    private final float getSmallThoughtBubbleYOffset() {
        float f = 7.0f;
        if (this.A0Z) {
            f = 11.0f;
        }
        Context context = getContext();
        C14360o3.A07(context);
        return AbstractC13690mv.A00(context, f);
    }

    public static /* synthetic */ void setContentLayout$default(NoteBubbleView noteBubbleView, int i, C07T c07t, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = AbstractC53242c7.A0H(noteBubbleView.getContext(), R.attr.igds_color_primary_text);
        }
        if ((i2 & 2) != 0) {
            c07t = null;
        }
        noteBubbleView.A0F(c07t, i);
    }

    private final void setContentLayoutGeneric(int i) {
        int color;
        IgLinearLayout igLinearLayout = this.A08;
        igLinearLayout.setVisibility(0);
        getTextView().setVisibility(0);
        IgTextView igTextView = this.A0K;
        CharSequence text = igTextView.getText();
        C14360o3.A07(text);
        boolean z = false;
        if (text.length() > 0) {
            z = true;
        }
        int i2 = 8;
        if (z) {
            i2 = 0;
        }
        igTextView.setVisibility(i2);
        this.A0B.setVisibility(8);
        this.A0E.setVisibility(8);
        this.A0D.setVisibility(8);
        this.A0C.setVisibility(8);
        CardView cardView = this.A04;
        if (cardView != null) {
            cardView.setVisibility(8);
        }
        CardView cardView2 = this.A02;
        cardView2.setVisibility(0);
        cardView2.setRadius(this.A0i);
        IgLinearLayout igLinearLayout2 = this.A07;
        int i3 = this.A0d;
        igLinearLayout2.setPadding(i3, this.A0e, i3, i3);
        this.A0G.setVisibility(8);
        CardView cardView3 = this.A03;
        if (cardView3 != null) {
            cardView3.setVisibility(8);
        }
        this.A0F.setVisibility(8);
        C07T c07t = this.A05;
        if (c07t != null) {
            c07t.A0A(this.A0g);
        }
        if (this.A0J) {
            igLinearLayout.setPadding(i3, this.A0k, i3, this.A0m);
        }
        if (this.A0Z) {
            igLinearLayout.setPadding(0, i3, 0, i3);
        } else {
            Context context = getContext();
            C14360o3.A07(context);
            igLinearLayout.setMinimumHeight((int) AbstractC13880nE.A04(context, 40));
        }
        Context context2 = getContext();
        C14360o3.A07(context2);
        setBubbleBackgroundColor(A00(context2));
        Integer num = this.A0W;
        if (num != null) {
            color = num.intValue();
        } else {
            color = context2.getColor(i);
        }
        getTextView().setTextColor(color);
        igTextView.setTextColor(color);
    }

    public static /* synthetic */ void setContentLayoutGeneric$default(NoteBubbleView noteBubbleView, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = AbstractC53242c7.A07(noteBubbleView.getContext());
        }
        noteBubbleView.setContentLayoutGeneric(i);
    }

    public static /* synthetic */ void setContentNoteLayout$default(NoteBubbleView noteBubbleView, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = AbstractC53242c7.A0H(noteBubbleView.getContext(), R.attr.igds_color_primary_text);
        }
        noteBubbleView.setContentNoteLayout(i);
    }

    public static /* synthetic */ void setCreationLayoutForContentNotesShare$default(NoteBubbleView noteBubbleView, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = 0;
        }
        noteBubbleView.setCreationLayoutForContentNotesShare(i);
    }

    public static /* synthetic */ void setCreationLayoutForShareSheet$default(NoteBubbleView noteBubbleView, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = 0;
        }
        noteBubbleView.setCreationLayoutForShareSheet(i);
    }

    public static /* synthetic */ void setCreationLayoutForShareSheetSuggestedGrid$default(NoteBubbleView noteBubbleView, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = 0;
        }
        noteBubbleView.setCreationLayoutForShareSheetSuggestedGrid(i);
    }

    public static /* synthetic */ void setIconicRedesignLayout$default(NoteBubbleView noteBubbleView, View view, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        noteBubbleView.A03(view, z);
    }

    public static /* synthetic */ void setText$default(NoteBubbleView noteBubbleView, CharSequence charSequence, boolean z, String str, InterfaceC16820sZ interfaceC16820sZ, int i, Object obj) {
        if ((i & 4) != 0) {
            str = "";
        }
        noteBubbleView.setText(charSequence, z, str, interfaceC16820sZ);
    }

    public final void A0D() {
        if (this.A03 == null) {
            View inflate = ((ViewStub) this.A01.findViewById(R.id.location_note_bubble_view_layout)).inflate();
            this.A03 = (CardView) inflate.requireViewById(R.id.pog_location_note_card_view);
            this.A0P = (IgTextView) inflate.requireViewById(R.id.pog_location_note_title);
            this.A0O = (IgTextView) inflate.requireViewById(R.id.pog_location_note_text);
        }
        CardView cardView = this.A04;
        if (cardView != null) {
            cardView.setVisibility(8);
        }
        this.A02.setVisibility(8);
        this.A0G.setVisibility(8);
        CardView cardView2 = this.A03;
        if (cardView2 != null) {
            cardView2.setVisibility(0);
        }
        CardView cardView3 = this.A03;
        if (cardView3 != null) {
            cardView3.setRadius(this.A0i);
        }
        IgLinearLayout igLinearLayout = this.A07;
        int i = this.A0d;
        igLinearLayout.setPadding(i, this.A0e, i, i);
        invalidate();
    }

    public final void A0E() {
        InterfaceC56392iX interfaceC56392iX = this.A0F;
        interfaceC56392iX.setVisibility(0);
        this.A0N = (IgTextView) interfaceC56392iX.getView().requireViewById(R.id.listening_now_note_title);
        this.A0L = (IgTextView) interfaceC56392iX.getView().requireViewById(R.id.listening_now_subtitle);
        this.A0S = (IgImageView) interfaceC56392iX.getView().requireViewById(R.id.listening_now_note_icon);
        this.A0M = (IgTextView) interfaceC56392iX.getView().requireViewById(R.id.listening_now_note_text);
        ((CardView) interfaceC56392iX.getView()).setRadius(this.A0i);
        this.A02.setVisibility(8);
        CardView cardView = this.A03;
        if (cardView != null) {
            cardView.setVisibility(8);
        }
        CardView cardView2 = this.A04;
        if (cardView2 != null) {
            cardView2.setVisibility(8);
        }
        this.A0G.setVisibility(8);
        IgLinearLayout igLinearLayout = this.A07;
        int i = this.A0d;
        igLinearLayout.setPadding(i, this.A0e, i, i);
        invalidate();
    }

    public final void A0J(boolean z, boolean z2, boolean z3, boolean z4) {
        this.A0J = z;
        this.A0b = z2;
        this.A0a = z3;
        this.A0Z = z4;
    }

    public final IgTextView getTextView() {
        IgTextView igTextView = this.A0A;
        if (igTextView != null) {
            return igTextView;
        }
        C14360o3.A0F("textView");
        throw C00O.createAndThrow();
    }

    public final void setBubbleBackgroundColor(int i) {
        this.A0n.setColorFilter(C3DY.A00(i));
        this.A02.setCardBackgroundColor(i);
        InterfaceC56392iX interfaceC56392iX = this.A0G;
        if (interfaceC56392iX.CWW()) {
            ((CardView) interfaceC56392iX.getView()).setCardBackgroundColor(i);
        }
    }

    public final void setCreationLayoutForContentNotesShare(int i) {
        if (i != 0) {
            this.A0D.setImageTintList(ColorStateList.valueOf(getContext().getColor(i)));
        }
        this.A0D.setVisibility(0);
        CardView cardView = this.A02;
        cardView.setClipChildren(false);
        cardView.setClipToOutline(false);
        IgLinearLayout igLinearLayout = this.A08;
        igLinearLayout.setClipChildren(false);
        igLinearLayout.setClipToOutline(false);
        A02();
    }

    public final void setCreationLayoutForShareSheet(int i) {
        if (i != 0) {
            this.A0E.setImageTintList(ColorStateList.valueOf(getContext().getColor(i)));
        }
        this.A0E.setVisibility(0);
        CardView cardView = this.A02;
        cardView.setClipChildren(false);
        cardView.setClipToOutline(false);
        IgLinearLayout igLinearLayout = this.A08;
        igLinearLayout.setClipChildren(false);
        igLinearLayout.setClipToOutline(false);
        A02();
    }

    public final void setCreationLayoutForShareSheetSuggestedGrid(int i) {
        if (i != 0) {
            this.A0C.setImageTintList(ColorStateList.valueOf(getContext().getColor(i)));
        }
        this.A0C.setVisibility(0);
        CardView cardView = this.A02;
        cardView.setClipChildren(false);
        cardView.setClipToOutline(false);
        IgLinearLayout igLinearLayout = this.A08;
        igLinearLayout.setClipChildren(false);
        igLinearLayout.setClipToOutline(false);
        A02();
    }

    private final Drawable getLyricDrawable() {
        Context context = getContext();
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(R.dimen.abc_button_padding_horizontal_material);
        C138586Po A00 = AbstractC138576Pn.A00(1.0f, dimensionPixelSize, true);
        A00.A0A.setColor(context.getColor(AbstractC53242c7.A08(context)));
        A00.setBounds(0, 0, dimensionPixelSize, dimensionPixelSize);
        return A00;
    }

    public final void A0F(C07T c07t, int i) {
        setContentLayoutGeneric(i);
        A03(this.A02, false);
        if (c07t != null) {
            this.A05 = c07t;
            InterfaceC65626Tpm interfaceC65626Tpm = this.A0g;
            c07t.A0A(interfaceC65626Tpm);
            c07t.A09(interfaceC65626Tpm);
        }
        invalidate();
    }

    public final void setContentNoteLayout(int i) {
        setContentLayoutGeneric(i);
        A03(this.A02, false);
        getTextView().setMaxLines(3);
        invalidate();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Type inference failed for: r0v23, types: [X.74F] */
    public NoteBubbleView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        int i2;
        C14360o3.A0B(context, 1);
        this.A0i = AbstractC13690mv.A00(context, 16.0f);
        this.A0c = AbstractC13690mv.A00(context, 16.0f);
        this.A0j = 11.0f;
        this.A0p = new RectF();
        this.A0e = context.getResources().getDimensionPixelSize(R.dimen.abc_action_bar_elevation_material);
        this.A0d = context.getResources().getDimensionPixelSize(R.dimen.abc_button_padding_horizontal_material);
        this.A0k = context.getResources().getDimensionPixelSize(R.dimen.account_discovery_bottom_gap);
        this.A0l = context.getResources().getDimensionPixelSize(R.dimen.ab_test_media_thumbnail_preview_item_internal_padding);
        this.A0m = context.getResources().getDimensionPixelSize(R.dimen.abc_dialog_padding_top_material);
        Paint paint = new Paint();
        Paint.Style style = Paint.Style.FILL;
        paint.setStyle(style);
        paint.setColor(context.getColor(R.color.notes_bubble_background));
        this.A0n = paint;
        Paint paint2 = new Paint();
        paint2.setStyle(style);
        if (C1H6.A03()) {
            boolean z = this.A0J;
            i2 = R.attr.igds_color_elevated_highlight_background;
            if (z) {
                i2 = R.attr.igds_color_elevated_background;
            }
        } else {
            i2 = R.attr.igds_color_primary_background;
        }
        paint2.setColor(context.getColor(AbstractC53242c7.A0H(context, i2)));
        this.A0o = paint2;
        this.A0f = new Handler(Looper.getMainLooper());
        this.A0h = new Runnable() { // from class: X.74F
            @Override // java.lang.Runnable
            public final void run() {
                NoteBubbleView noteBubbleView = NoteBubbleView.this;
                noteBubbleView.getTextView().invalidate();
                if (noteBubbleView.A00 != null) {
                    noteBubbleView.A0f.postDelayed(this, 16L);
                }
            }
        };
        this.A0g = new InterfaceC65626Tpm() { // from class: X.74G
            @Override // X.InterfaceC65626Tpm
            public final /* synthetic */ void onCreate(C07X c07x) {
            }

            @Override // X.InterfaceC65626Tpm
            public final /* synthetic */ void onDestroy(C07X c07x) {
            }

            @Override // X.InterfaceC65626Tpm
            public final void onPause(C07X c07x) {
                C14360o3.A0B(c07x, 0);
                NoteBubbleView noteBubbleView = NoteBubbleView.this;
                C138586Po c138586Po = noteBubbleView.A0H;
                if (c138586Po != null) {
                    c138586Po.A05 = false;
                    c138586Po.invalidateSelf();
                }
                SpinnerImageView spinnerImageView = noteBubbleView.A0I;
                if (spinnerImageView != null) {
                    spinnerImageView.setLoadingStatus(C3T1.FAILED);
                }
                if (noteBubbleView.A00 != null) {
                    noteBubbleView.A0f.removeCallbacks(noteBubbleView.A0h);
                }
            }

            @Override // X.InterfaceC65626Tpm
            public final void onResume(C07X c07x) {
                C14360o3.A0B(c07x, 0);
                NoteBubbleView noteBubbleView = NoteBubbleView.this;
                C138586Po c138586Po = noteBubbleView.A0H;
                if (c138586Po != null) {
                    c138586Po.A05 = true;
                    c138586Po.invalidateSelf();
                }
                SpinnerImageView spinnerImageView = noteBubbleView.A0I;
                if (spinnerImageView != null) {
                    spinnerImageView.setLoadingStatus(C3T1.LOADING);
                }
                if (noteBubbleView.A00 != null) {
                    noteBubbleView.A0f.post(noteBubbleView.A0h);
                }
            }

            @Override // X.InterfaceC65626Tpm
            public final /* synthetic */ void onStart(C07X c07x) {
            }

            @Override // X.InterfaceC65626Tpm
            public final /* synthetic */ void onStop(C07X c07x) {
            }
        };
        setWillNotDraw(false);
        if (!this.A0Y) {
            this.A0Y = ((int) C20150ym.A01(AbstractC20100yh.A00(36604880986117259L))) > 0;
        }
        LayoutInflater from = LayoutInflater.from(context);
        C14360o3.A07(from);
        View A00 = C50802Vb.A00(from, null, this, R.layout.cf_hub_pog_note_bubble_view, 0, false, this.A0Y);
        this.A01 = A00;
        this.A07 = (IgLinearLayout) A00.requireViewById(R.id.pog_note_bubble_root_view);
        this.A02 = (CardView) this.A01.requireViewById(R.id.pog_note_bubble_card_view);
        setTextView((IgTextView) this.A01.requireViewById(R.id.pog_bubble_text));
        this.A0B = (IgImageView) this.A01.requireViewById(R.id.pog_bubble_creation_plus);
        this.A0E = (IgImageView) this.A01.requireViewById(R.id.pog_bubble_creation_plus_small);
        this.A0D = (IgImageView) this.A01.requireViewById(R.id.pog_bubble_creation_plus_mini);
        this.A0C = (IgImageView) this.A01.requireViewById(R.id.pog_bubble_creation_plus_medium);
        this.A0G = AbstractC56372iV.A01(this.A01.requireViewById(R.id.music_note_bubble_view_layout), false, false);
        this.A0K = (IgTextView) this.A01.requireViewById(R.id.friend_map_pog_notes_subtitle);
        this.A08 = (IgLinearLayout) this.A01.requireViewById(R.id.pog_bubble_text_container);
        this.A0X = AbstractC13620mo.A02(getContext());
        this.A0F = AbstractC56372iV.A01(this.A01.requireViewById(R.id.listening_now_note_bubble_view_layout), false, false);
        setBubbleBackgroundColor(A00(context));
        addView(this.A01);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public NoteBubbleView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        C14360o3.A0B(context, 1);
    }
}
