package X;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.text.Editable;
import android.text.Spannable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.text.method.KeyListener;
import android.text.method.QwertyKeyListener;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.inputmethod.InputMethodManager;
import com.facebook.R;
import com.facebook.common.dextricks.Constants;
import com.facebook.react.uimanager.UIManagerHelper;
import com.facebook.react.uimanager.UIManagerModule;
import com.facebook.react.views.text.internal.span.ReactAbsoluteSizeSpan;
import com.facebook.react.views.text.internal.span.ReactBackgroundColorSpan;
import com.facebook.react.views.text.internal.span.ReactForegroundColorSpan;
import com.facebook.react.views.text.internal.span.ReactStrikethroughSpan;
import com.facebook.react.views.text.internal.span.ReactUnderlineSpan;
import java.util.ArrayList;
import org.webrtc.ScreenCapturerAndroid;

/* loaded from: classes11.dex */
public final class UDV extends C74443Wa {
    public static final KeyListener A0V = QwertyKeyListener.getInstanceForFullKeyboard();
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public InterfaceC65225TgH A04;
    public X9J A05;
    public C69787VvS A06;
    public InterfaceC71844X7c A07;
    public InterfaceC71845X7d A08;
    public X9L A09;
    public String A0A;
    public String A0B;
    public ArrayList A0C;
    public boolean A0D;
    public boolean A0E;
    public boolean A0F;
    public boolean A0G;
    public boolean A0H;
    public boolean A0I;
    public WKg A0J;
    public WKb A0K;
    public Integer A0L;
    public String A0M;
    public String A0N;
    public boolean A0O;
    public boolean A0P;
    public boolean A0Q;
    public boolean A0R;
    public final InputMethodManager A0S;
    public final int A0T;
    public final int A0U;

    public UDV(Context context) {
        super(context, null, R.attr.editTextStyle);
        this.A0B = null;
        this.A0O = false;
        this.A0H = false;
        this.A0I = false;
        this.A0A = null;
        this.A01 = -1;
        this.A00 = -1;
        this.A0D = false;
        this.A0E = false;
        this.A0P = false;
        this.A0R = false;
        this.A0M = null;
        this.A0L = C05F.A00;
        this.A04 = null;
        this.A0F = false;
        setFocusableInTouchMode(false);
        Object systemService = context.getSystemService("input_method");
        AbstractC05810Sj.A00(systemService);
        this.A0S = (InputMethodManager) systemService;
        this.A0T = getGravity() & 8388615;
        this.A0U = getGravity() & 112;
        this.A02 = 0;
        this.A0G = false;
        this.A0Q = false;
        this.A0C = null;
        this.A0K = null;
        this.A03 = getInputType();
        if (this.A0J == null) {
            this.A0J = new WKg();
        }
        this.A08 = null;
        this.A06 = new C69787VvS();
        A03();
        int i = C66375UEj.A05;
        AbstractC010103p.A0B(this, new UsX(this, this, getImportantForAccessibility(), isFocusable()));
        WKk wKk = new WKk(this);
        setCustomSelectionActionModeCallback(wKk);
        setCustomInsertionActionModeCallback(wKk);
    }

    public static boolean A02(UDV udv) {
        udv.setFocusableInTouchMode(true);
        boolean requestFocus = super.requestFocus(130, null);
        if (udv.getShowSoftInputOnFocus()) {
            udv.A0S.showSoftInput(udv, 0);
        }
        return requestFocus;
    }

    @Override // android.view.View
    public final void clearFocus() {
        setFocusableInTouchMode(false);
        super.clearFocus();
        this.A0S.hideSoftInputFromWindow(getWindowToken(), 0);
    }

    @Override // android.view.View
    public final boolean isLayoutRequested() {
        return false;
    }

    public void setBorderRadius(float f) {
        C63011Saa c63011Saa;
        if (Float.isNaN(f)) {
            c63011Saa = null;
        } else {
            c63011Saa = new C63011Saa(C05F.A00, WF1.A00(f));
        }
        C63403SjY.A08(this, c63011Saa, VDC.values()[0]);
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x0046, code lost:
    
        if (r0 != false) goto L7;
     */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0011  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void A00() {
        /*
            r3 = this;
            java.lang.String r2 = r3.A0N
            r1 = 5
            if (r2 == 0) goto Lc
            int r0 = r2.hashCode()
            switch(r0) {
                case -1273775369: goto L20;
                case -906336856: goto L28;
                case 3304: goto L30;
                case 3377907: goto L38;
                case 3387192: goto L3f;
                case 3526536: goto L18;
                default: goto Lc;
            }
        Lc:
            r1 = 6
        Ld:
            boolean r0 = r3.A0Q
            if (r0 == 0) goto L49
            r0 = 33554432(0x2000000, float:9.403955E-38)
            r0 = r0 | r1
            r3.setImeOptions(r0)
            return
        L18:
            java.lang.String r0 = "send"
            boolean r0 = r2.equals(r0)
            r1 = 4
            goto L46
        L20:
            java.lang.String r0 = "previous"
            boolean r0 = r2.equals(r0)
            r1 = 7
            goto L46
        L28:
            java.lang.String r0 = "search"
            boolean r0 = r2.equals(r0)
            r1 = 3
            goto L46
        L30:
            java.lang.String r0 = "go"
            boolean r0 = r2.equals(r0)
            r1 = 2
            goto L46
        L38:
            java.lang.String r0 = "next"
            boolean r0 = r2.equals(r0)
            goto L46
        L3f:
            java.lang.String r0 = "none"
            boolean r0 = r2.equals(r0)
            r1 = 1
        L46:
            if (r0 != 0) goto Ld
            goto Lc
        L49:
            r3.setImeOptions(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.UDV.A00():void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v7, types: [X.Usg, X.Sb5] */
    public static void A01(UDV udv) {
        WXV wxv;
        X9J x9j;
        InterfaceC71844X7c interfaceC71844X7c = udv.A07;
        if (interfaceC71844X7c != null && (x9j = (wxv = (WXV) interfaceC71844X7c).A03) != 0) {
            UDV udv2 = wxv.A04;
            int width = udv2.getWidth();
            int height = udv2.getHeight();
            if (udv2.getLayout() != null) {
                width = udv2.getCompoundPaddingLeft() + udv2.getLayout().getWidth() + udv2.getCompoundPaddingRight();
                height = udv2.getCompoundPaddingTop() + udv2.getLayout().getHeight() + udv2.getCompoundPaddingBottom();
            }
            if (width != wxv.A01 || height != wxv.A00) {
                wxv.A00 = height;
                wxv.A01 = width;
                int i = wxv.A02;
                int id = udv2.getId();
                float A00 = WF1.A00(width);
                float A002 = WF1.A00(height);
                ?? sb5 = new Sb5(i, id);
                sb5.A01 = A00;
                sb5.A00 = A002;
                x9j.APn(sb5);
            }
        }
        Q21 A02 = UIManagerHelper.A02(udv);
        if (!A02.A0I()) {
            C69376VmM c69376VmM = new C69376VmM(udv);
            UIManagerModule uIManagerModule = (UIManagerModule) A02.A04(UIManagerModule.class);
            if (uIManagerModule != null) {
                uIManagerModule.setViewLocalData(udv.getId(), c69376VmM);
            }
        }
    }

    private WKb getTextWatcherDelegator() {
        WKb wKb = this.A0K;
        if (wKb == null) {
            WKb wKb2 = new WKb(this);
            this.A0K = wKb2;
            return wKb2;
        }
        return wKb;
    }

    public final void A03() {
        C69787VvS c69787VvS = this.A06;
        setTextSize(0, c69787VvS.A02());
        float A00 = c69787VvS.A00();
        if (!Float.isNaN(A00)) {
            setLetterSpacing(A00);
        }
    }

    public final void A04(int i, int i2, int i3) {
        int length;
        int length2;
        if (i >= this.A02 && i2 != -1 && i3 != -1) {
            if (getText() == null) {
                length = 0;
            } else {
                length = getText().length();
            }
            int max = Math.max(0, Math.min(i2, length));
            if (getText() == null) {
                length2 = 0;
            } else {
                length2 = getText().length();
            }
            setSelection(max, Math.max(0, Math.min(i3, length2)));
        }
    }

    @Override // android.widget.TextView
    public final void addTextChangedListener(TextWatcher textWatcher) {
        if (this.A0C == null) {
            this.A0C = new ArrayList();
            super.addTextChangedListener(getTextWatcherDelegator());
        }
        this.A0C.add(textWatcher);
    }

    public boolean getDisableFullscreenUI() {
        return this.A0Q;
    }

    public String getReturnKeyType() {
        return this.A0N;
    }

    public int getStagedInputType() {
        return this.A03;
    }

    public InterfaceC65225TgH getStateWrapper() {
        return null;
    }

    public String getSubmitBehavior() {
        return this.A0B;
    }

    @Override // android.widget.TextView, android.view.View
    public final void onDraw(Canvas canvas) {
        if (this.A0L != C05F.A00) {
            C63403SjY.A03(canvas, this);
        }
        super.onDraw(canvas);
    }

    @Override // android.widget.TextView, android.view.View, android.view.KeyEvent.Callback
    public final boolean onKeyUp(int i, KeyEvent keyEvent) {
        if (i == 66 && !A06()) {
            this.A0S.hideSoftInputFromWindow(getWindowToken(), 0);
            return true;
        }
        return super.onKeyUp(i, keyEvent);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v3, types: [X.Sb5] */
    @Override // android.widget.TextView, android.view.View
    public final void onScrollChanged(int i, int i2, int i3, int i4) {
        super.onScrollChanged(i, i2, i3, i4);
        InterfaceC71845X7d interfaceC71845X7d = this.A08;
        if (interfaceC71845X7d != null) {
            WXW wxw = (WXW) interfaceC71845X7d;
            if (wxw.A00 != i || wxw.A01 != i2) {
                int i5 = wxw.A02;
                UDV udv = wxw.A04;
                int id = udv.getId();
                Integer num = C05F.A0C;
                float f = i;
                float f2 = i2;
                int width = udv.getWidth();
                int height = udv.getHeight();
                C67623Usu c67623Usu = (C67623Usu) C67623Usu.A09.A7H();
                C67623Usu c67623Usu2 = c67623Usu;
                if (c67623Usu == null) {
                    c67623Usu2 = new Sb5();
                }
                c67623Usu2.A08(i5, id);
                c67623Usu2.A08 = num;
                c67623Usu2.A00 = f;
                c67623Usu2.A01 = f2;
                c67623Usu2.A02 = 0.0f;
                c67623Usu2.A03 = 0.0f;
                c67623Usu2.A05 = 0;
                c67623Usu2.A04 = 0;
                c67623Usu2.A07 = width;
                c67623Usu2.A06 = height;
                wxw.A03.APn(c67623Usu2);
                wxw.A00 = i;
                wxw.A01 = i2;
            }
        }
    }

    @Override // android.widget.TextView
    public final void removeTextChangedListener(TextWatcher textWatcher) {
        ArrayList arrayList = this.A0C;
        if (arrayList != null) {
            arrayList.remove(textWatcher);
            if (this.A0C.isEmpty()) {
                this.A0C = null;
                super.removeTextChangedListener(getTextWatcherDelegator());
            }
        }
    }

    public void setAllowFontScaling(boolean z) {
        C69787VvS c69787VvS = this.A06;
        if (c69787VvS.A06 != z) {
            c69787VvS.A06 = z;
            A03();
        }
    }

    public void setBorderStyle(String str) {
        Integer A00;
        if (str == null) {
            A00 = null;
        } else {
            A00 = C69829VwF.A00(str);
        }
        C63403SjY.A0C(this, A00);
    }

    public void setDisableFullscreenUI(boolean z) {
        this.A0Q = z;
        A00();
    }

    public void setFontFamily(String str) {
        this.A0A = str;
        this.A0I = true;
    }

    public void setFontSize(float f) {
        this.A06.A00 = f;
        A03();
    }

    public void setGravityHorizontal(int i) {
        if (i == 0) {
            i = this.A0T;
        }
        setGravity(i | (getGravity() & (-8) & (-8388616)));
    }

    public void setGravityVertical(int i) {
        if (i == 0) {
            i = this.A0U;
        }
        setGravity(i | (getGravity() & (-113)));
    }

    public void setLetterSpacingPt(float f) {
        this.A06.A02 = f;
        A03();
    }

    @Override // android.widget.TextView
    public void setLineHeight(int i) {
        this.A06.A03 = i;
    }

    public void setMaxFontSizeMultiplier(float f) {
        C69787VvS c69787VvS = this.A06;
        if (f != c69787VvS.A04) {
            if (f != 0.0f && f < 1.0f) {
                C0I2.A04("ReactNative", "maxFontSizeMultiplier must be NaN, 0, or >= 1");
                f = Float.NaN;
            }
            c69787VvS.A04 = f;
            A03();
        }
    }

    public void setOverflow(String str) {
        Integer num;
        if (str == null || (num = C69830VwG.A00(str)) == null) {
            num = C05F.A00;
        }
        this.A0L = num;
        invalidate();
    }

    public void setPlaceholder(String str) {
        if (!C2I7.A00(str, this.A0M)) {
            this.A0M = str;
            setHint(str);
        }
    }

    public void setReturnKeyType(String str) {
        this.A0N = str;
        A00();
    }

    public final void A05(C69418Vn3 c69418Vn3) {
        Integer num;
        Q2R q2r;
        Q2N q2n;
        if (((getInputType() & 144) != 0 && TextUtils.equals(getText(), c69418Vn3.A08)) || c69418Vn3.A04 < this.A02) {
            return;
        }
        Spannable spannable = c69418Vn3.A08;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(spannable);
        for (Object obj : getText().getSpans(0, length(), Object.class)) {
            int spanFlags = getText().getSpanFlags(obj);
            boolean A1P = AbstractC167007dF.A1P(spanFlags & 33, 33);
            if (obj instanceof InterfaceC71843X7b) {
                getText().removeSpan(obj);
            }
            if (A1P) {
                int spanStart = getText().getSpanStart(obj);
                int spanEnd = getText().getSpanEnd(obj);
                getText().removeSpan(obj);
                Editable text = getText();
                int i = spanStart;
                if (spanStart <= spannableStringBuilder.length() && spanEnd <= spannableStringBuilder.length()) {
                    while (true) {
                        if (i < spanEnd) {
                            if (text.charAt(i) == spannableStringBuilder.charAt(i)) {
                                i++;
                            }
                        } else {
                            spannableStringBuilder.setSpan(obj, spanStart, spanEnd, spanFlags);
                            break;
                        }
                    }
                }
            }
        }
        for (Object obj2 : spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), ReactAbsoluteSizeSpan.class)) {
            if (((AbsoluteSizeSpan) obj2).getSize() == this.A06.A02()) {
                spannableStringBuilder.removeSpan(obj2);
            }
        }
        for (Object obj3 : spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), ReactBackgroundColorSpan.class)) {
            Integer valueOf = Integer.valueOf(((BackgroundColorSpan) obj3).getBackgroundColor());
            Drawable background = getBackground();
            if ((background instanceof Q2R) && (q2r = (Q2R) background) != null && (q2n = q2r.A03) != null) {
                num = Integer.valueOf(q2n.A01);
            } else {
                num = null;
            }
            if (C2I7.A00(valueOf, num)) {
                spannableStringBuilder.removeSpan(obj3);
            }
        }
        for (Object obj4 : spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), ReactForegroundColorSpan.class)) {
            if (((ForegroundColorSpan) obj4).getForegroundColor() == getCurrentTextColor()) {
                spannableStringBuilder.removeSpan(obj4);
            }
        }
        for (Object obj5 : spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), ReactStrikethroughSpan.class)) {
            if ((getPaintFlags() & 16) != 0) {
                spannableStringBuilder.removeSpan(obj5);
            }
        }
        for (Object obj6 : spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), ReactUnderlineSpan.class)) {
            if ((getPaintFlags() & 8) != 0) {
                spannableStringBuilder.removeSpan(obj6);
            }
        }
        for (Object obj7 : spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), C66333U9k.class)) {
            if (((C66333U9k) obj7).A00 == this.A06.A00()) {
                spannableStringBuilder.removeSpan(obj7);
            }
        }
        for (Object obj8 : spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), U9l.class)) {
            U9l u9l = (U9l) obj8;
            int i2 = u9l.A00;
            if (i2 == -1) {
                i2 = 0;
            }
            if (i2 == this.A00 && C2I7.A00(u9l.A02, this.A0A)) {
                int i3 = u9l.A01;
                if (i3 == -1) {
                    i3 = ScreenCapturerAndroid.VIRTUAL_DISPLAY_DPI;
                }
                if (i3 == this.A01 && C2I7.A00(u9l.A03, getFontFeatureSettings())) {
                    spannableStringBuilder.removeSpan(obj8);
                }
            }
        }
        this.A0F = true;
        if (spannable.length() == 0) {
            setText((CharSequence) null);
        } else {
            getText().replace(0, length(), spannableStringBuilder);
        }
        this.A0F = false;
        int breakStrategy = getBreakStrategy();
        int i4 = c69418Vn3.A07;
        if (breakStrategy == i4) {
            return;
        }
        setBreakStrategy(i4);
    }

    public final boolean A06() {
        return AbstractC167007dF.A1M(getInputType() & Constants.LOAD_RESULT_DEX2OAT_TRY_PERIODIC_PGO_COMP);
    }

    public final void finalize() {
        WGL.A01.remove(Integer.valueOf(getId()));
    }

    public int getGravityHorizontal() {
        return getGravity() & 8388615;
    }

    @Override // android.widget.TextView, android.view.View, android.graphics.drawable.Drawable.Callback
    public final void invalidateDrawable(Drawable drawable) {
        super.invalidateDrawable(drawable);
    }

    @Override // android.widget.TextView, android.view.View
    public final void onAttachedToWindow() {
        int A06 = C0f9.A06(-1536873527);
        super.onAttachedToWindow();
        super.setTextIsSelectable(true);
        if (this.A0D && !this.A0P) {
            A02(this);
        }
        this.A0P = true;
        C0f9.A0D(1112628646, A06);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x003e, code lost:
    
        r1 = r4.A0B;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0040, code lost:
    
        if (r1 != null) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0046, code lost:
    
        if (A06() != false) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x004f, code lost:
    
        if (r1.equals("submit") != false) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0057, code lost:
    
        if (r1.equals("blurAndSubmit") == false) goto L14;
     */
    /* JADX WARN: Type inference failed for: r1v4, types: [X.UB2, android.view.inputmethod.InputConnectionWrapper] */
    @Override // X.C74443Wa, android.widget.TextView, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.view.inputmethod.InputConnection onCreateInputConnection(android.view.inputmethod.EditorInfo r5) {
        /*
            r4 = this;
            com.facebook.react.uimanager.UIManagerHelper.A02(r4)
            android.view.inputmethod.InputConnection r2 = super.onCreateInputConnection(r5)
            if (r2 == 0) goto L1d
            boolean r0 = r4.A0H
            if (r0 == 0) goto L1d
            X.X9J r3 = r4.A05
            r0 = 0
            X.UB2 r1 = new X.UB2
            r1.<init>(r2, r0)
            r0 = 0
            r1.A02 = r0
            r1.A00 = r3
            r1.A01 = r4
            r2 = r1
        L1d:
            boolean r0 = r4.A06()
            if (r0 == 0) goto L35
            java.lang.String r1 = r4.A0B
            if (r1 != 0) goto L36
            boolean r0 = r4.A06()
            if (r0 != 0) goto L3e
        L2d:
            int r1 = r5.imeOptions
            r0 = -1073741825(0xffffffffbfffffff, float:-1.9999999)
            r1 = r1 & r0
            r5.imeOptions = r1
        L35:
            return r2
        L36:
            java.lang.String r0 = "blurAndSubmit"
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L2d
        L3e:
            java.lang.String r1 = r4.A0B
            if (r1 != 0) goto L49
            boolean r0 = r4.A06()
            if (r0 != 0) goto L35
            goto L2d
        L49:
            java.lang.String r0 = "submit"
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L2d
            java.lang.String r0 = "blurAndSubmit"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L35
            goto L2d
        */
        throw new UnsupportedOperationException("Method not decompiled: X.UDV.onCreateInputConnection(android.view.inputmethod.EditorInfo):android.view.inputmethod.InputConnection");
    }

    @Override // X.C74443Wa, android.view.View
    public final void onDetachedFromWindow() {
        int A06 = C0f9.A06(-722712408);
        super.onDetachedFromWindow();
        C0f9.A0D(-776997778, A06);
    }

    @Override // android.view.View
    public final void onFinishTemporaryDetach() {
        super.onFinishTemporaryDetach();
    }

    @Override // android.widget.TextView, android.view.View
    public final void onFocusChanged(boolean z, int i, Rect rect) {
        X9L x9l;
        int A06 = C0f9.A06(-1637399900);
        super.onFocusChanged(z, i, rect);
        if (z && (x9l = this.A09) != null) {
            x9l.DkL(getSelectionStart(), getSelectionEnd());
        }
        C0f9.A0D(1883698654, A06);
    }

    @Override // android.widget.TextView, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        A01(this);
        if (this.A0R && isFocused()) {
            selectAll();
            this.A0R = false;
        }
    }

    @Override // android.widget.TextView
    public final void onSelectionChanged(int i, int i2) {
        super.onSelectionChanged(i, i2);
        if (this.A09 != null && hasFocus()) {
            this.A09.DkL(i, i2);
        }
    }

    @Override // android.view.View
    public final void onStartTemporaryDetach() {
        super.onStartTemporaryDetach();
    }

    @Override // X.C74443Wa, android.widget.EditText, android.widget.TextView
    public final boolean onTextContextMenuItem(int i) {
        if (i == 16908322) {
            i = android.R.id.pasteAsPlainText;
        }
        return super.onTextContextMenuItem(i);
    }

    @Override // android.widget.TextView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int A05 = C0f9.A05(1309634459);
        int action = motionEvent.getAction();
        if (action != 0) {
            if (action == 2 && this.A0O) {
                if (!canScrollVertically(-1) && !canScrollVertically(1) && !canScrollHorizontally(-1) && !canScrollHorizontally(1)) {
                    getParent().requestDisallowInterceptTouchEvent(false);
                }
                this.A0O = false;
            }
        } else {
            this.A0O = true;
            getParent().requestDisallowInterceptTouchEvent(true);
        }
        boolean onTouchEvent = super.onTouchEvent(motionEvent);
        C0f9.A0C(456844790, A05);
        return onTouchEvent;
    }

    @Override // android.view.View
    public final boolean requestFocus(int i, Rect rect) {
        return isFocused();
    }

    public void setAutoFocus(boolean z) {
        this.A0D = z;
    }

    @Override // android.view.View
    public void setBackgroundColor(int i) {
        C63403SjY.A0B(this, Integer.valueOf(i));
    }

    public void setContentSizeWatcher(InterfaceC71844X7c interfaceC71844X7c) {
        this.A07 = interfaceC71844X7c;
    }

    public void setContextMenuHidden(boolean z) {
        this.A0E = z;
    }

    public void setEventDispatcher(X9J x9j) {
        this.A05 = x9j;
    }

    @Override // android.widget.TextView
    public void setFontFeatureSettings(String str) {
        if (!C2I7.A00(str, getFontFeatureSettings())) {
            super.setFontFeatureSettings(str);
            this.A0I = true;
        }
    }

    public void setFontStyle(String str) {
        int A00 = WF2.A00(str);
        if (A00 != this.A00) {
            this.A00 = A00;
            this.A0I = true;
        }
    }

    public void setFontWeight(String str) {
        int A01 = WF2.A01(str);
        if (A01 != this.A01) {
            this.A01 = A01;
            this.A0I = true;
        }
    }

    @Override // android.widget.TextView
    public void setInputType(int i) {
        Typeface typeface = super.getTypeface();
        super.setInputType(i);
        this.A03 = i;
        super.setTypeface(typeface);
        if (A06()) {
            setSingleLine(false);
        }
        WKg wKg = this.A0J;
        if (wKg == null) {
            wKg = new WKg();
            this.A0J = wKg;
        }
        wKg.A00 = i;
        setKeyListener(wKg);
    }

    public void setOnKeyPress(boolean z) {
        this.A0H = z;
    }

    public void setScrollWatcher(InterfaceC71845X7d interfaceC71845X7d) {
        this.A08 = interfaceC71845X7d;
    }

    public void setSelectTextOnFocus(boolean z) {
        super.setSelectAllOnFocus(z);
        this.A0R = z;
    }

    public void setSelectionWatcher(X9L x9l) {
        this.A09 = x9l;
    }

    public void setStagedInputType(int i) {
        this.A03 = i;
    }

    public void setStateWrapper(InterfaceC65225TgH interfaceC65225TgH) {
        this.A04 = interfaceC65225TgH;
    }

    public void setSubmitBehavior(String str) {
        this.A0B = str;
    }

    @Override // android.widget.TextView, android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable);
    }
}
