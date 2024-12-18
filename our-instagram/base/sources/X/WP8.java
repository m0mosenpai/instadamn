package X;

import android.content.Context;
import android.view.View;
import android.view.ViewStub;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.SeekBar;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.widget.reboundviewpager.ReboundViewPager;
import com.instagram.creation.capture.quickcapture.aspectratioutil.NineSixteenLayoutConfigImpl;
import com.instagram.creation.capture.quickcapture.aspectratioutil.TargetViewSizeProvider;
import com.instagram.ui.widget.pageindicator.CirclePageIndicator;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes11.dex */
public final class WP8 implements SeekBar.OnSeekBarChangeListener, View.OnFocusChangeListener, InterfaceC25184BCh, InterfaceC195198kL, InterfaceC25183BCg {
    public int A00;
    public int A01;
    public C69346Vls A02;
    public final Context A03;
    public final View A04;
    public final ViewStub A05;
    public final UserSession A06;
    public final ReboundViewPager A07;
    public final TargetViewSizeProvider A08;
    public final C88W A09;
    public final ChoreographerFrameCallbackC66315U8o A0A;
    public final VBA A0B;
    public final CirclePageIndicator A0C;
    public final ArrayList A0D;
    public final C8O8 A0E;
    public final C8NX A0F;

    private void A00() {
        C69346Vls c69346Vls = this.A02;
        if (c69346Vls != null) {
            C150956qv.A08(new View[]{this.A04, c69346Vls.A01, this.A07, this.A0C, c69346Vls.A04}, false);
            C69346Vls c69346Vls2 = this.A02;
            c69346Vls2.getClass();
            c69346Vls2.A03.clearFocus();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x009b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void A01(X.WP8 r6, int r7) {
        /*
            r6.A00 = r7
            X.Vls r0 = r6.A02
            r0.getClass()
            android.view.View r0 = r0.A00
            android.graphics.drawable.Drawable r1 = r0.getBackground()
            android.graphics.drawable.GradientDrawable r1 = (android.graphics.drawable.GradientDrawable) r1
            if (r1 == 0) goto L16
            int r0 = r6.A00
            r1.setColor(r0)
        L16:
            X.Vls r0 = r6.A02
            r0.getClass()
            android.widget.EditText r2 = r0.A03
            int r1 = r6.A00
            r3 = -1
            if (r1 == r3) goto Ldc
            r0 = 1065353216(0x3f800000, float:1.0)
            int r0 = X.AbstractC13950nL.A08(r1, r0)
        L28:
            r2.setTextColor(r0)
            int r5 = r6.A00
            java.util.ArrayList r1 = r6.A0D
            r4 = 0
            java.lang.Object r0 = r1.get(r4)
            java.lang.Number r0 = (java.lang.Number) r0
            int r0 = r0.intValue()
            r2 = 1
            if (r5 == r0) goto La5
            java.lang.Object r0 = r1.get(r2)
            java.lang.Number r0 = (java.lang.Number) r0
            int r0 = r0.intValue()
            if (r5 == r0) goto La5
            int r1 = X.AbstractC13950nL.A05(r5)
            X.Vls r0 = r6.A02
            r0.getClass()
            android.widget.SeekBar r0 = r0.A05
            android.graphics.drawable.Drawable r0 = r0.getProgressDrawable()
            android.graphics.drawable.LayerDrawable r0 = (android.graphics.drawable.LayerDrawable) r0
            if (r0 == 0) goto L63
            android.graphics.drawable.Drawable r0 = r0.getDrawable(r4)
            r0.setTint(r1)
        L63:
            X.Vls r0 = r6.A02
            r0.getClass()
            android.widget.EditText r0 = r0.A03
            int r0 = r0.getCurrentTextColor()
            r1 = -1
            if (r0 == r3) goto Lc5
            X.Vls r0 = r6.A02
            r0.getClass()
            android.widget.SeekBar r0 = r0.A05
            android.graphics.drawable.Drawable r0 = r0.getProgressDrawable()
            android.graphics.drawable.LayerDrawable r0 = (android.graphics.drawable.LayerDrawable) r0
            if (r0 == 0) goto L88
            android.graphics.drawable.Drawable r1 = r0.getDrawable(r2)
            r0 = 0
            r1.setTintList(r0)
        L88:
            X.Vls r0 = r6.A02
            r0.getClass()
            android.widget.EditText r2 = r0.A03
            int r0 = r6.A00
            if (r0 == r3) goto L9b
            int r0 = X.AbstractC13950nL.A05(r0)
        L97:
            r2.setHintTextColor(r0)
            return
        L9b:
            android.content.Context r1 = r6.A03
            r0 = 2131100049(0x7f060191, float:1.7812468E38)
            int r0 = r1.getColor(r0)
            goto L97
        La5:
            X.Vls r0 = r6.A02
            r0.getClass()
            android.widget.SeekBar r0 = r0.A05
            android.graphics.drawable.Drawable r0 = r0.getProgressDrawable()
            android.graphics.drawable.LayerDrawable r0 = (android.graphics.drawable.LayerDrawable) r0
            if (r0 == 0) goto Lbc
            android.graphics.drawable.Drawable r1 = r0.getDrawable(r4)
            r0 = 0
            r1.setTintList(r0)
        Lbc:
            android.content.Context r1 = r6.A03
            r0 = 2130970196(0x7f040654, float:1.7549095E38)
            int r1 = X.AbstractC167007dF.A09(r1, r0)
        Lc5:
            X.Vls r0 = r6.A02
            r0.getClass()
            android.widget.SeekBar r0 = r0.A05
            android.graphics.drawable.Drawable r0 = r0.getProgressDrawable()
            android.graphics.drawable.LayerDrawable r0 = (android.graphics.drawable.LayerDrawable) r0
            if (r0 == 0) goto L88
            android.graphics.drawable.Drawable r0 = r0.getDrawable(r2)
            r0.setTint(r1)
            goto L88
        Ldc:
            r0 = -16777216(0xffffffffff000000, float:-1.7014118E38)
            goto L28
        */
        throw new UnsupportedOperationException("Method not decompiled: X.WP8.A01(X.WP8, int):void");
    }

    public static void A02(WP8 wp8, String str) {
        C69346Vls c69346Vls = wp8.A02;
        c69346Vls.getClass();
        SeekBar seekBar = c69346Vls.A05;
        Context context = wp8.A03;
        int width = ((NineSixteenLayoutConfigImpl) wp8.A08).A0K.getWidth();
        AbstractC167017dG.A1N(context, str);
        int A04 = AbstractC166997dE.A04(context, R.dimen.slider_sticker_slider_handle_size);
        C6RB c6rb = new C6RB(context, width);
        c6rb.A0M(str);
        c6rb.A0A(A04);
        seekBar.setThumb(c6rb);
        wp8.A0A.A04 = str;
    }

    private void A03(Wm2 wm2) {
        int A0C;
        C69346Vls c69346Vls = this.A02;
        c69346Vls.getClass();
        EditText editText = c69346Vls.A03;
        if (wm2 == null) {
            this.A01 = 0;
            editText.setText("");
            A02(this, "😍");
            A0C = ((Number) this.A0D.get(0)).intValue();
        } else {
            this.A01 = this.A0D.indexOf(Integer.valueOf(AbstractC13950nL.A0C(wm2.A00.A05, 0)));
            editText.setText(wm2.A02());
            AbstractC167017dG.A18(editText);
            String str = wm2.A00.A06;
            if (str == null) {
                str = "😍";
            }
            A02(this, str);
            A0C = AbstractC13950nL.A0C(wm2.A00.A05, 0);
        }
        A01(this, A0C);
    }

    @Override // X.InterfaceC25183BCg
    public final View B0N() {
        C69346Vls c69346Vls = this.A02;
        if (c69346Vls != null) {
            return c69346Vls.A00;
        }
        return null;
    }

    @Override // X.InterfaceC25183BCg
    public final Class C0Y() {
        return V9X.class;
    }

    /* JADX WARN: Type inference failed for: r0v19, types: [java.lang.Object, X.VBC] */
    @Override // X.InterfaceC25184BCh
    public final void DDv(Object obj) {
        if (this.A02 == null) {
            C69346Vls c69346Vls = new C69346Vls(this.A05);
            this.A02 = c69346Vls;
            View view = c69346Vls.A00;
            this.A09.A03(view);
            AbstractC13880nE.A0u(view, new C216009hG(this, 2));
            C69346Vls c69346Vls2 = this.A02;
            c69346Vls2.getClass();
            EditText editText = c69346Vls2.A03;
            editText.setOnFocusChangeListener(this);
            AEZ.A01(editText);
            editText.setLetterSpacing(-0.03f);
            VBA vba = this.A0B;
            C221549qJ c221549qJ = new C221549qJ(editText, 3);
            List list = vba.A00;
            list.add(c221549qJ);
            list.add(new C221519qG(editText));
            Integer num = C05F.A00;
            ?? obj2 = new Object();
            obj2.A00 = editText;
            obj2.A01 = num;
            list.add(obj2);
            C69346Vls c69346Vls3 = this.A02;
            c69346Vls3.getClass();
            c69346Vls3.A05.setOnSeekBarChangeListener(this);
            A02(this, "😍");
            C69346Vls c69346Vls4 = this.A02;
            c69346Vls4.getClass();
            c69346Vls4.A02.setBackground(this.A0A);
            ReboundViewPager reboundViewPager = this.A07;
            reboundViewPager.setAdapter(new C210619Ta(this.A03, this.A06, this.A08, this));
            CirclePageIndicator circlePageIndicator = this.A0C;
            circlePageIndicator.A01(0, 5);
            reboundViewPager.A0P(circlePageIndicator);
            C69346Vls c69346Vls5 = this.A02;
            c69346Vls5.getClass();
            ImageView imageView = c69346Vls5.A04;
            imageView.setImageResource(R.drawable.instagram_icons_exceptions_color_picker_filled_44);
            C3P9 c3p9 = new C3P9(imageView);
            C69346Vls c69346Vls6 = this.A02;
            c69346Vls6.getClass();
            c3p9.A02(imageView, c69346Vls6.A00);
            c3p9.A04 = new C68003V5v(this, 6);
            c3p9.A00();
        }
        View view2 = this.A04;
        C69346Vls c69346Vls7 = this.A02;
        c69346Vls7.getClass();
        View view3 = c69346Vls7.A01;
        ReboundViewPager reboundViewPager2 = this.A07;
        CirclePageIndicator circlePageIndicator2 = this.A0C;
        C69346Vls c69346Vls8 = this.A02;
        c69346Vls8.getClass();
        C150956qv.A09(new View[]{view2, view3, reboundViewPager2, circlePageIndicator2, c69346Vls8.A04}, false);
        C88W c88w = this.A09;
        c88w.A02(c88w.A01);
        C69346Vls c69346Vls9 = this.A02;
        c69346Vls9.getClass();
        c69346Vls9.A05.setProgress(10);
        A03(((C8UZ) obj).A00);
        C69346Vls c69346Vls10 = this.A02;
        c69346Vls10.getClass();
        c69346Vls10.A03.addTextChangedListener(this.A0B);
        this.A0E.Dom("slider_sticker_bundle_id");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v5, types: [X.5NL, X.Wm2, java.lang.Object] */
    @Override // X.InterfaceC25184BCh
    public final void DEy() {
        String str;
        C8NX c8nx = this.A0F;
        C69346Vls c69346Vls = this.A02;
        c69346Vls.getClass();
        C6RB c6rb = (C6RB) c69346Vls.A05.getThumb();
        C69346Vls c69346Vls2 = this.A02;
        c69346Vls2.getClass();
        EditText editText = c69346Vls2.A03;
        if (c6rb != null) {
            str = c6rb.A0F.toString();
        } else {
            str = "😍";
        }
        URN urn = new URN(null, null, null, null, null, AbstractC13950nL.A0F(this.A00), str, AbstractC31177DnL.A0c(editText), null, AbstractC13950nL.A0F(editText.getCurrentTextColor()));
        ?? obj = new Object();
        obj.A00 = urn;
        c8nx.Dog(obj, null);
        C69346Vls c69346Vls3 = this.A02;
        c69346Vls3.getClass();
        c69346Vls3.A03.removeTextChangedListener(this.A0B);
        A03(null);
        A00();
        this.A0E.Doh("slider_sticker_bundle_id");
    }

    @Override // X.InterfaceC195198kL
    public final void DOI() {
        C69346Vls c69346Vls = this.A02;
        c69346Vls.getClass();
        c69346Vls.A03.clearFocus();
        this.A0F.DOI();
    }

    @Override // X.InterfaceC195198kL
    public final void E0p(int i, int i2) {
        float f = (-this.A09.A03.A01) + C1812982h.A00;
        this.A07.setTranslationY(f);
        this.A0C.setTranslationY(f);
    }

    @Override // android.view.View.OnFocusChangeListener
    public final void onFocusChange(View view, boolean z) {
        C88W c88w = this.A09;
        if (z) {
            c88w.A00();
            C14360o3.A0B(view, 0);
            AbstractC13880nE.A0S(view);
        } else {
            c88w.A01();
            C14360o3.A0B(view, 0);
            AbstractC13880nE.A0O(view);
            A00();
        }
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onProgressChanged(SeekBar seekBar, int i, boolean z) {
        if (z) {
            C69346Vls c69346Vls = this.A02;
            c69346Vls.getClass();
            SeekBar seekBar2 = c69346Vls.A05;
            C69346Vls c69346Vls2 = this.A02;
            c69346Vls2.getClass();
            View view = c69346Vls2.A00;
            if (seekBar2.getThumb() != null) {
                float x = view.getX() + view.getPaddingLeft() + seekBar2.getPaddingLeft() + r3.getBounds().left;
                float y = view.getY() + view.getPaddingTop() + seekBar2.getTop() + r3.getBounds().top;
                ChoreographerFrameCallbackC66315U8o choreographerFrameCallbackC66315U8o = this.A0A;
                choreographerFrameCallbackC66315U8o.A01 = x;
                choreographerFrameCallbackC66315U8o.A02 = y;
                C69362Vm8 c69362Vm8 = choreographerFrameCallbackC66315U8o.A03;
                if (c69362Vm8 != null) {
                    c69362Vm8.A03 = x;
                    c69362Vm8.A04 = y;
                }
                choreographerFrameCallbackC66315U8o.invalidateSelf();
                float f = choreographerFrameCallbackC66315U8o.A08 + ((i / 100.0f) * (choreographerFrameCallbackC66315U8o.A07 - r2));
                choreographerFrameCallbackC66315U8o.A00 = f;
                C69362Vm8 c69362Vm82 = choreographerFrameCallbackC66315U8o.A03;
                if (c69362Vm82 != null) {
                    c69362Vm82.A01 = f;
                }
                choreographerFrameCallbackC66315U8o.invalidateSelf();
            }
        }
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onStartTrackingTouch(SeekBar seekBar) {
        this.A0A.A01();
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onStopTrackingTouch(SeekBar seekBar) {
        ChoreographerFrameCallbackC66315U8o choreographerFrameCallbackC66315U8o = this.A0A;
        choreographerFrameCallbackC66315U8o.A09.add(0, choreographerFrameCallbackC66315U8o.A03);
        choreographerFrameCallbackC66315U8o.A03 = null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public WP8(View view, UserSession userSession, C3I9 c3i9, C8O8 c8o8, TargetViewSizeProvider targetViewSizeProvider, C8NX c8nx) {
        this.A06 = userSession;
        Context context = view.getContext();
        this.A03 = context;
        this.A0E = c8o8;
        this.A08 = targetViewSizeProvider;
        this.A09 = new C88W(context, c3i9, this);
        this.A0B = new VBA();
        this.A0F = c8nx;
        this.A04 = view.requireViewById(R.id.text_overlay_edit_text_container);
        this.A05 = (ViewStub) view.requireViewById(R.id.slider_sticker_editor_stub);
        this.A07 = (ReboundViewPager) view.requireViewById(R.id.emoji_palette_pager);
        this.A0C = (CirclePageIndicator) view.requireViewById(R.id.emoji_palette_pager_indicator);
        this.A0A = new ChoreographerFrameCallbackC66315U8o(context);
        X23 x23 = new X23(this);
        this.A0D = x23;
        this.A00 = ((Number) x23.get(0)).intValue();
    }
}
