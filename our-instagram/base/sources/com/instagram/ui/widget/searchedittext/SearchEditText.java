package com.instagram.ui.widget.searchedittext;

import X.AbstractC13620mo;
import X.AbstractC13880nE;
import X.AbstractC14710oj;
import X.AbstractC53242c7;
import X.AbstractC55922hc;
import X.AbstractC72723Nt;
import X.AbstractC87043uM;
import X.AnonymousClass051;
import X.AnonymousClass693;
import X.C05F;
import X.C06090Tz;
import X.C0f9;
import X.C1344265o;
import X.C14360o3;
import X.C1AD;
import X.C2UX;
import X.C36752GHz;
import X.C3DY;
import X.C65911TwI;
import X.C65918TwP;
import X.C66151U1s;
import X.C67993V5i;
import X.C68U;
import X.C71098Wnu;
import X.C71099Wnv;
import X.C88U;
import X.C88V;
import X.GX1;
import X.GX2;
import X.GYU;
import X.InterfaceC693339t;
import X.RunnableC36871GMs;
import X.RunnableC44227JgX;
import X.ViewOnLongClickListenerC70246WNq;
import X.ViewTreeObserverOnGlobalLayoutListenerC35713Fpn;
import X.X2z;
import X.X8U;
import X.X8V;
import X.X8W;
import X.XBR;
import X.YN3;
import X.YN4;
import android.animation.Animator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.text.Editable;
import android.text.method.KeyListener;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeProvider;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import android.widget.TextView;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.R;
import com.facebook.common.dextricks.Constants;
import com.facebook.forker.Process;
import com.instagram.ui.widget.search.SearchController;
import com.instagram.ui.widget.searchedittext.SearchEditText;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes3.dex */
public class SearchEditText extends EditText implements TextView.OnEditorActionListener {
    public Drawable A00;
    public Drawable A01;
    public Drawable A02;
    public LayerDrawable A03;
    public LayerDrawable A04;
    public AnonymousClass693 A05;
    public AnonymousClass693 A06;
    public XBR A07;
    public X8U A08;
    public X8V A09;
    public X8W A0A;
    public GYU A0B;
    public C88U A0C;
    public GX1 A0D;
    public GX2 A0E;
    public C88V A0F;
    public boolean A0G;
    public boolean A0H;
    public boolean A0I;
    public boolean A0J;
    public boolean A0K;
    public boolean A0L;
    public boolean A0M;
    public boolean A0N;
    public boolean A0O;
    public boolean A0P;
    public Drawable A0Q;
    public Drawable A0R;
    public Drawable A0S;
    public InputMethodManager A0T;
    public YN3 A0U;
    public YN4 A0V;
    public C1344265o A0W;
    public boolean A0X;
    public boolean A0Y;
    public boolean A0Z;
    public boolean A0a;
    public boolean A0b;
    public boolean A0c;
    public boolean A0d;
    public boolean A0e;
    public boolean A0f;
    public Drawable[] A0g;
    public final ViewTreeObserver.OnGlobalLayoutListener A0h;
    public final InterfaceC693339t A0i;
    public final boolean A0j;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public SearchEditText(Context context) {
        this(context, null, 0);
        C14360o3.A0B(context, 1);
    }

    @Override // android.view.View
    public final void clearFocus() {
        setFocusableInTouchMode(false);
        super.clearFocus();
        setFocusableInTouchMode(true);
    }

    @Override // android.view.View
    public final boolean dispatchHoverEvent(MotionEvent motionEvent) {
        C14360o3.A0B(motionEvent, 0);
        if ((!this.A0I || !this.A0H || this.A00 == null || !A05(motionEvent)) && !super.dispatchHoverEvent(motionEvent)) {
            return false;
        }
        return true;
    }

    @Override // android.widget.TextView, android.view.View
    public final InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        C14360o3.A0B(editorInfo, 0);
        InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
        if (this.A0b) {
            int i = editorInfo.imeOptions;
            int i2 = i & 255;
            if ((i2 & 3) != 0) {
                int i3 = i2 ^ i;
                editorInfo.imeOptions = i3;
                i = i3 | 3;
                editorInfo.imeOptions = i;
            }
            if ((1073741824 & i) != 0) {
                editorInfo.imeOptions = i & (-1073741825);
            }
        }
        this.A0i.AMO(editorInfo, onCreateInputConnection, this);
        return onCreateInputConnection;
    }

    @Override // android.widget.TextView.OnEditorActionListener
    public final boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
        int keyCode;
        boolean z = false;
        if (i != 3 && i != 5 && i != 6) {
            return false;
        }
        A04();
        C88U c88u = this.A0C;
        if (keyEvent != null && ((keyCode = keyEvent.getKeyCode()) == 23 || keyCode == 66 || keyCode == 160)) {
            z = true;
        }
        if (c88u != null && !z) {
            c88u.onSearchSubmitted(this, getSearchString());
        }
        return true;
    }

    @Override // android.widget.TextView, android.view.View, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        C14360o3.A0B(keyEvent, 1);
        if (keyEvent.getAction() == 0 && (i == 23 || i == 66 || i == 160)) {
            Editable text = getText();
            if (text != null && text.length() != 0) {
                A04();
                C88U c88u = this.A0C;
                if (c88u != null) {
                    c88u.onSearchSubmitted(this, getSearchString());
                }
            }
            GX1 gx1 = this.A0D;
            if (gx1 != null) {
                ((C36752GHz) gx1).A00.A07.A04();
            }
        }
        return super.onKeyDown(i, keyEvent);
    }

    @Override // android.widget.TextView
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        C14360o3.A0B(charSequence, 0);
        super.onTextChanged(charSequence, i, i2, i3);
        C88U c88u = this.A0C;
        if (c88u != null) {
            c88u.onSearchTextChanged(this, charSequence, i, i2, i3);
        }
    }

    public static final LayerDrawable A00(SearchEditText searchEditText, boolean z) {
        Drawable drawable = searchEditText.A00;
        Drawable drawable2 = searchEditText.A02;
        Drawable drawable3 = searchEditText.A01;
        if (drawable != null && drawable2 != null && drawable3 != null) {
            if (!z) {
                drawable3 = drawable2;
            }
            LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{drawable3, drawable});
            int dimensionPixelSize = searchEditText.getResources().getDimensionPixelSize(R.dimen.account_discovery_bottom_gap);
            int intrinsicWidth = drawable.getIntrinsicWidth() + dimensionPixelSize;
            int intrinsicWidth2 = dimensionPixelSize + drawable2.getIntrinsicWidth();
            int intrinsicHeight = (drawable2.getIntrinsicHeight() - drawable.getIntrinsicHeight()) / 2;
            layerDrawable.setLayerInset(0, intrinsicWidth, 0, 0, 0);
            layerDrawable.setLayerInset(1, 0, intrinsicHeight, intrinsicWidth2, intrinsicHeight);
            layerDrawable.setLayerGravity(1, 16);
            return layerDrawable;
        }
        return null;
    }

    private final Drawable getEndDrawable() {
        if (this.A0Y) {
            return this.A0Q;
        }
        if (!this.A0P) {
            if (this.A0O) {
                if (this.A0I) {
                    if (this.A0d) {
                        return this.A03;
                    }
                    return this.A04;
                }
            } else {
                if (this.A0I && this.A0H) {
                    return this.A00;
                }
                if (this.A0c) {
                    return this.A0S;
                }
                return null;
            }
        }
        if (this.A0d) {
            return this.A01;
        }
        return this.A02;
    }

    private final Drawable getStartDrawable() {
        if (this.A0M) {
            return this.A05;
        }
        if (this.A0N) {
            return this.A06;
        }
        if (this.A0L) {
            return this.A0R;
        }
        if (this.A0X) {
            return this.A0g[0];
        }
        return null;
    }

    public final void A03() {
        GYU gyu = this.A0B;
        if (gyu != null) {
            gyu.onSearchCleared(getSearchString());
        }
        setText("");
        requestFocus();
        A06();
    }

    public final void A04() {
        this.A0T.hideSoftInputFromWindow(getWindowToken(), 0);
        this.A0f = false;
        GX2 gx2 = this.A0E;
        if (gx2 != null) {
            ((SearchController) gx2).A06 = false;
        }
    }

    public final void A05() {
        if (!this.A0a) {
            this.A0e = true;
        } else {
            requestFocus();
        }
    }

    public final void A06() {
        if (!this.A0a) {
            this.A0f = true;
            getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserverOnGlobalLayoutListenerC35713Fpn(this));
        } else {
            if (!this.A0T.showSoftInput(this, 0)) {
                post(new RunnableC36871GMs(this));
                return;
            }
            GX2 gx2 = this.A0E;
            if (gx2 == null) {
                return;
            }
            ((SearchController) gx2).A06 = true;
        }
    }

    public final void A07(int i, int i2, boolean z, long j) {
        if (i > 0) {
            this.A0M = z;
        } else {
            this.A0N = z;
        }
        if (z && !this.A0Z) {
            Resources resources = getResources();
            setPadding(resources.getDimensionPixelSize(R.dimen.account_discovery_bottom_gap), 0, resources.getDimensionPixelSize(R.dimen.abc_button_inset_vertical_material), 0);
            this.A0Z = true;
        }
        A01(this);
        if (z) {
            setCompoundDrawablePadding(getResources().getDimensionPixelSize(R.dimen.abc_button_padding_horizontal_material));
            postDelayed(new RunnableC44227JgX(this, i, i2), j);
        }
    }

    public final void A08(boolean z) {
        this.A0L = z;
        if (z && !this.A0Z) {
            Resources resources = getResources();
            setPadding(resources.getDimensionPixelSize(R.dimen.account_discovery_bottom_gap), 0, resources.getDimensionPixelSize(R.dimen.abc_button_inset_vertical_material), 0);
            this.A0Z = true;
        }
        A01(this);
        if (z) {
            setCompoundDrawablePadding(getResources().getDimensionPixelSize(R.dimen.abc_button_padding_horizontal_material));
        }
    }

    public final void A09(boolean z) {
        this.A0c = z;
        if (z) {
            Resources resources = getResources();
            int dimensionPixelSize = resources.getDimensionPixelSize(R.dimen.account_discovery_bottom_gap);
            int dimensionPixelSize2 = resources.getDimensionPixelSize(R.dimen.ad4ad_button_bottom_margin);
            if (this.A0b) {
                AbstractC13880nE.A0i(this, dimensionPixelSize, dimensionPixelSize2);
            } else {
                setPadding(dimensionPixelSize, 0, dimensionPixelSize2, 0);
            }
        }
        A01(this);
    }

    public final boolean A0A(float f) {
        if (this.A0R != null) {
            if (this.A0K) {
                if (f > (getWidth() - getPaddingRight()) - r3.getIntrinsicWidth()) {
                    return true;
                }
                return false;
            }
            if (f < getPaddingLeft() + r3.getIntrinsicWidth()) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final boolean A0B(float f) {
        Drawable drawable = this.A02;
        if (drawable != null) {
            int intrinsicWidth = drawable.getIntrinsicWidth();
            if (this.A0K) {
                if (f < getPaddingLeft() + intrinsicWidth) {
                    return true;
                }
                return false;
            }
            if (f > (getWidth() - getPaddingRight()) - intrinsicWidth) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final boolean A0C(float f) {
        Drawable drawable = this.A0S;
        if (drawable != null) {
            int intrinsicWidth = drawable.getIntrinsicWidth();
            if (this.A0K) {
                if (f < getPaddingLeft() + intrinsicWidth) {
                    return true;
                }
                return false;
            }
            if (f > (getWidth() - getPaddingRight()) - intrinsicWidth) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final boolean A0D(float f) {
        if (this.A00 != null) {
            if (this.A0K) {
                if (f < getPaddingLeft() + r3.getIntrinsicWidth()) {
                    return true;
                }
                return false;
            }
            if (f > (getWidth() - getPaddingRight()) - r3.getIntrinsicWidth()) {
                return true;
            }
            return false;
        }
        return false;
    }

    @Override // android.view.View
    public AccessibilityNodeProvider getAccessibilityNodeProvider() {
        Object obj = ((AnonymousClass051) this.A0W).A00;
        C14360o3.A0C(obj, "null cannot be cast to non-null type android.view.accessibility.AccessibilityNodeProvider");
        return (AccessibilityNodeProvider) obj;
    }

    public final int getClearButtonHeight() {
        Drawable drawable = this.A00;
        if (drawable != null) {
            return drawable.getIntrinsicHeight();
        }
        return 0;
    }

    public final int getClearButtonWidth() {
        Drawable drawable = this.A00;
        if (drawable != null) {
            return drawable.getIntrinsicWidth();
        }
        return 0;
    }

    public final boolean getMetaAIButtonEnabled() {
        return this.A0L;
    }

    public final boolean getMetaAISendButtonEnabled() {
        return this.A0P;
    }

    public final GX2 getOnKeyboardListener() {
        return this.A0E;
    }

    public final void setAllowTextSelection(boolean z) {
        ViewOnLongClickListenerC70246WNq viewOnLongClickListenerC70246WNq;
        this.A0G = z;
        if (z) {
            viewOnLongClickListenerC70246WNq = null;
        } else {
            viewOnLongClickListenerC70246WNq = ViewOnLongClickListenerC70246WNq.A00;
        }
        setOnLongClickListener(viewOnLongClickListenerC70246WNq);
    }

    public final void setClearButtonAlpha(int i) {
        Drawable drawable = this.A00;
        if (drawable != null) {
            drawable.mutate().setAlpha(i);
        }
    }

    public final void setClearButtonColorFilter(ColorFilter colorFilter) {
        Drawable drawable = this.A00;
        if (drawable != null) {
            drawable.mutate().setColorFilter(colorFilter);
        }
    }

    public final void setClearButtonEnabled(boolean z) {
        this.A0H = z;
        A01(this);
    }

    public final void setDisableButtonsForIntegrity(boolean z) {
        this.A0d = z;
        A01(this);
    }

    public final void setEndEmojiButton(String str) {
        if (this.A0Q == null && str != null && str.length() != 0) {
            int dimensionPixelSize = getResources().getDimensionPixelSize(R.dimen.abc_select_dialog_padding_start_material);
            Drawable B1H = this.A0i.B1H(str, dimensionPixelSize);
            this.A0Q = B1H;
            if (B1H != null) {
                B1H.setBounds(0, 0, dimensionPixelSize, dimensionPixelSize);
            }
        }
    }

    public final void setEndEmojiButtonEnabled(boolean z) {
        this.A0Y = z;
        A01(this);
    }

    @Override // android.widget.TextView
    public void setKeyListener(KeyListener keyListener) {
        this.A0i.AMS(keyListener, this);
        super.setKeyListener(keyListener);
    }

    public final void setMetaAIClearButtonEnabled(boolean z) {
        this.A0H = z;
        if (z) {
            Resources resources = getResources();
            int dimensionPixelSize = resources.getDimensionPixelSize(R.dimen.account_discovery_bottom_gap);
            int dimensionPixelSize2 = resources.getDimensionPixelSize(R.dimen.ad4ad_button_bottom_margin);
            if (this.A0b) {
                AbstractC13880nE.A0i(this, dimensionPixelSize, dimensionPixelSize2);
            } else {
                setPadding(dimensionPixelSize, 0, dimensionPixelSize2, 0);
            }
        }
        A01(this);
    }

    public final void setMultiLineSearchBarEnabled(boolean z) {
        this.A0b = z;
        if (z) {
            setSingleLine(false);
            setMaxLines(5);
            setInputType(getInputType() | Constants.LOAD_RESULT_DEX2OAT_TRY_PERIODIC_PGO_COMP);
            getViewTreeObserver().addOnGlobalLayoutListener(this.A0h);
            setMinHeight(getResources().getDimensionPixelSize(R.dimen.add_to_story_dual_destination_share_sheet_avatar_icon_size));
        }
    }

    public final void setSearchIconEnabled(boolean z) {
        this.A0X = z;
        A01(this);
    }

    public static final void A01(SearchEditText searchEditText) {
        Drawable startDrawable = searchEditText.getStartDrawable();
        Drawable[] drawableArr = searchEditText.A0g;
        searchEditText.setCompoundDrawablesRelative(startDrawable, drawableArr[1], searchEditText.getEndDrawable(), drawableArr[3]);
    }

    public static final void A02(SearchEditText searchEditText, boolean z, boolean z2) {
        int i;
        Context context = searchEditText.getContext();
        if (z2) {
            searchEditText.A02 = context.getDrawable(R.drawable.instagram_search_meta_ai_sparkle_send_icon);
            i = R.drawable.instagram_search_meta_ai_sparkle_send_icon_disabled;
        } else {
            searchEditText.A02 = context.getDrawable(R.drawable.instagram_search_meta_ai_send_icon);
            i = R.drawable.instagram_search_meta_ai_send_icon_disabled;
        }
        Drawable drawable = context.getDrawable(i);
        searchEditText.A01 = drawable;
        Drawable drawable2 = searchEditText.A02;
        if (z && drawable2 != null && drawable != null) {
            Resources resources = searchEditText.getResources();
            int dimensionPixelSize = resources.getDimensionPixelSize(R.dimen.container_height);
            int dimensionPixelSize2 = resources.getDimensionPixelSize(R.dimen.ai_sticker_creation_suggested_prompt_pill_height);
            drawable2.setBounds(0, 0, dimensionPixelSize, dimensionPixelSize2);
            drawable.setBounds(0, 0, dimensionPixelSize, dimensionPixelSize2);
        }
    }

    public final String getSearchString() {
        Editable text = getText();
        C14360o3.A07(text);
        String obj = text.toString();
        int length = obj.length() - 1;
        int i = 0;
        boolean z = false;
        while (i <= length) {
            int i2 = length;
            if (!z) {
                i2 = i;
            }
            int A00 = C14360o3.A00(obj.charAt(i2), 32);
            boolean z2 = false;
            if (A00 <= 0) {
                z2 = true;
            }
            if (!z) {
                if (!z2) {
                    z = true;
                } else {
                    i++;
                }
            } else {
                if (!z2) {
                    break;
                }
                length--;
            }
        }
        return obj.subSequence(i, length + 1).toString();
    }

    public final CharSequence getStrippedText() {
        Editable text = getText();
        C14360o3.A07(text);
        if (text.length() != 0) {
            char charAt = text.charAt(0);
            if (charAt == '@' || charAt == '#') {
                return text.subSequence(1, text.length());
            }
            return text;
        }
        return text;
    }

    public final CharSequence getTextForSearch() {
        Editable text = getText();
        if (text != null && text.length() != 0) {
            if (text.length() == 1) {
                char charAt = text.charAt(0);
                if (charAt == '@' || charAt == '#') {
                    return "";
                }
                return text;
            }
            return text;
        }
        C14360o3.A0A(text);
        return text;
    }

    @Override // android.widget.TextView, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        this.A0a = true;
        if (this.A0e) {
            A05();
            this.A0e = false;
        }
        if (this.A0f) {
            this.A0f = false;
            A06();
        }
    }

    @Override // android.widget.TextView, android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        boolean z = false;
        if (getSearchString().length() == 0) {
            z = true;
        }
        if (this.A0I == z) {
            this.A0I = !z;
            A01(this);
            return false;
        }
        return super.onPreDraw();
    }

    @Override // android.widget.TextView
    public final void onSelectionChanged(int i, int i2) {
        super.onSelectionChanged(i, i2);
        C88V c88v = this.A0F;
        if (c88v != null) {
            c88v.DkN(this, i, i2);
        }
    }

    @Override // android.widget.TextView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z;
        int i;
        int i2;
        int A05 = C0f9.A05(-555547317);
        C14360o3.A0B(motionEvent, 0);
        Drawable drawable = this.A00;
        if (this.A0I && this.A0H && drawable != null && A0D(motionEvent.getX())) {
            if (motionEvent.getAction() == 1) {
                A03();
                C1344265o c1344265o = this.A0W;
                AccessibilityManager accessibilityManager = c1344265o.A03;
                accessibilityManager.getClass();
                if (accessibilityManager.isEnabled()) {
                    c1344265o.A02.performAccessibilityAction(64, null);
                }
            }
            i2 = 910530848;
        } else {
            if (this.A0O && this.A0I && drawable != null) {
                float x = motionEvent.getX();
                Drawable drawable2 = this.A02;
                int dimensionPixelSize = getResources().getDimensionPixelSize(R.dimen.account_discovery_bottom_gap);
                if (drawable2 != null && (!this.A0K ? !(x <= (((getWidth() - getPaddingRight()) - drawable2.getIntrinsicWidth()) - dimensionPixelSize) - drawable.getIntrinsicWidth() || x >= ((getWidth() - getPaddingRight()) - drawable2.getIntrinsicWidth()) - dimensionPixelSize) : !(x >= getPaddingLeft() + drawable2.getIntrinsicWidth() + dimensionPixelSize + drawable.getIntrinsicWidth() || x <= getPaddingLeft() + drawable2.getIntrinsicWidth() + dimensionPixelSize))) {
                    if (motionEvent.getAction() == 1) {
                        A03();
                        C1344265o c1344265o2 = this.A0W;
                        AccessibilityManager accessibilityManager2 = c1344265o2.A03;
                        accessibilityManager2.getClass();
                        if (accessibilityManager2.isEnabled()) {
                            c1344265o2.A02.performAccessibilityAction(64, null);
                        }
                    }
                    i2 = -1387543203;
                }
            }
            X8U x8u = this.A08;
            if ((this.A0P || this.A0O) && !this.A0d && x8u != null && A0B(motionEvent.getX())) {
                z = this.A0j;
                if (z) {
                    if (motionEvent.getAction() == 1) {
                        clearFocus();
                    }
                    i = 1153785678;
                }
                C71098Wnu c71098Wnu = (C71098Wnu) x8u;
                C65918TwP.A05(c71098Wnu.A00, c71098Wnu.A01.getSearchString());
                i = 1153785678;
            } else if (this.A0c && A0C(motionEvent.getX())) {
                if (motionEvent.getAction() == 1) {
                    X8V x8v = this.A09;
                    if (x8v != null) {
                        C66151U1s c66151U1s = (C66151U1s) ((C71099Wnv) x8v).A00.A0h.getValue();
                        X2z x2z = new X2z(c66151U1s, 9);
                        if (c66151U1s.A00 == null) {
                            C65911TwI.A04.A00(c66151U1s.A04, new C67993V5i(c66151U1s, x2z), null, 2);
                        } else {
                            x2z.invoke();
                        }
                    }
                    clearFocus();
                }
                i2 = 1239851888;
            } else if (!this.A0G && this.A0J) {
                requestFocus();
                A06();
                i2 = -757782844;
            } else {
                XBR xbr = this.A07;
                if (this.A0L && !this.A0d && xbr != null && A0A(motionEvent.getX())) {
                    z = this.A0j;
                    if (z) {
                        if (motionEvent.getAction() == 1) {
                            clearFocus();
                        }
                        i = -762862784;
                    }
                    xbr.DTS();
                    i = -762862784;
                } else {
                    z = super.onTouchEvent(motionEvent);
                    i = -1874112109;
                }
            }
            C0f9.A0C(i, A05);
            return z;
        }
        C0f9.A0C(i2, A05);
        return true;
    }

    public final void setEndEmojiListener(YN3 yn3) {
        this.A0U = yn3;
    }

    public final void setFocusOnTouchEnabled(boolean z) {
        this.A0J = z;
    }

    public final void setMetaAIButtonListener(XBR xbr) {
        this.A07 = xbr;
    }

    public final void setMetaAISendButtonListener(X8U x8u) {
        this.A08 = x8u;
    }

    public final void setMetaAIVoiceButtonListener(X8V x8v) {
        this.A09 = x8v;
    }

    public final void setOnFilterTextListener(C88U c88u) {
        this.A0C = c88u;
    }

    public final void setOnKeyboardListener(GX2 gx2) {
        this.A0E = gx2;
    }

    public final void setOnSelectionChangedListener(C88V c88v) {
        this.A0F = c88v;
    }

    public final void setSearchBarHeightChangedListener(X8W x8w) {
        this.A0A = x8w;
    }

    public final void setSearchClearListener(GYU gyu) {
        this.A0B = gyu;
    }

    public final void setSearchEnterKeyListener(GX1 gx1) {
        this.A0D = gx1;
    }

    public final void setSearchIconColorStateList(ColorStateList colorStateList) {
        setCompoundDrawableTintList(colorStateList);
    }

    public final void setTextPasteListener(YN4 yn4) {
        this.A0V = yn4;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Type inference failed for: r0v26, types: [X.65o] */
    public SearchEditText(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i, R.style.EditTextStyle);
        boolean z;
        Drawable mutate;
        C14360o3.A0B(context, 1);
        InterfaceC693339t A00 = C2UX.A00();
        C14360o3.A07(A00);
        this.A0i = A00;
        this.A0J = true;
        this.A0X = true;
        this.A0H = true;
        C06090Tz c06090Tz = C06090Tz.A05;
        this.A0j = C1AD.A06(c06090Tz, 18312787067419025L);
        this.A0h = new ViewTreeObserver.OnGlobalLayoutListener() { // from class: X.5jo
            public int A00;

            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public final void onGlobalLayout() {
                RecyclerView recyclerView;
                SearchEditText searchEditText = SearchEditText.this;
                int height = searchEditText.getHeight();
                Resources resources = searchEditText.getResources();
                int dimensionPixelSize = height - resources.getDimensionPixelSize(R.dimen.add_to_story_dual_destination_share_sheet_avatar_icon_size);
                if (this.A00 != dimensionPixelSize) {
                    X8W x8w = searchEditText.A0A;
                    if (x8w != null && (recyclerView = ((C71100Wnw) x8w).A00.A0H().A00) != null) {
                        AbstractC13880nE.A0f(recyclerView, dimensionPixelSize);
                    }
                    this.A00 = dimensionPixelSize;
                }
                int lineCount = searchEditText.getLineCount();
                int i2 = R.dimen.accent_edge_thickness;
                if (lineCount > 1) {
                    i2 = R.dimen.account_discovery_bottom_gap;
                }
                AbstractC13880nE.A0j(searchEditText, resources.getDimensionPixelSize(i2), resources.getDimensionPixelSize(i2));
            }
        };
        KeyListener keyListener = getKeyListener();
        A00.AMS(keyListener, this);
        super.setKeyListener(keyListener);
        Context context2 = getContext();
        this.A0K = AbstractC13620mo.A02(context2);
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context2.obtainStyledAttributes(attributeSet, AbstractC55922hc.A27);
            C14360o3.A07(obtainStyledAttributes);
            int resourceId = obtainStyledAttributes.getResourceId(3, 0);
            if (resourceId != 0) {
                setContentDescription(context.getText(resourceId));
            }
            int resourceId2 = obtainStyledAttributes.getResourceId(1, 0);
            if (resourceId2 != 0) {
                setHint(context.getText(resourceId2));
            }
            int resourceId3 = obtainStyledAttributes.getResourceId(2, 0);
            if (resourceId3 != 0) {
                setImeActionLabel(context.getText(resourceId3), getImeActionId());
            }
            int resourceId4 = obtainStyledAttributes.getResourceId(0, 0);
            if (resourceId4 != 0) {
                setText(context.getText(resourceId4));
            }
            AbstractC14710oj.A07(context, null, this, C05F.A00);
            this.A0H = obtainStyledAttributes.getBoolean(5, true);
            z = obtainStyledAttributes.getBoolean(4, false);
            this.A0J = obtainStyledAttributes.getBoolean(6, this.A0J);
            obtainStyledAttributes.recycle();
        } else {
            z = false;
        }
        setImeOptions(33554432 | getImeOptions());
        setOnEditorActionListener(this);
        Drawable[] compoundDrawablesRelative = getCompoundDrawablesRelative();
        this.A0g = compoundDrawablesRelative;
        Drawable drawable = compoundDrawablesRelative[2];
        if (drawable == null) {
            mutate = null;
        } else {
            mutate = drawable.mutate();
            C14360o3.A07(mutate);
            mutate.setColorFilter(C3DY.A00(context.getColor(AbstractC53242c7.A0H(context, R.attr.igds_color_primary_icon))));
        }
        this.A00 = mutate;
        Drawable drawable2 = context.getDrawable(R.drawable.instagram_icons_exceptions_genai_agent_profile_filled_24);
        this.A0R = drawable2;
        if (drawable2 != null) {
            int dimensionPixelSize = getResources().getDimensionPixelSize(R.dimen.abc_select_dialog_padding_start_material);
            drawable2.setBounds(0, 0, dimensionPixelSize, dimensionPixelSize);
        }
        Resources resources = getResources();
        int dimensionPixelSize2 = resources.getDimensionPixelSize(R.dimen.abc_select_dialog_padding_start_material);
        AnonymousClass693 A002 = C68U.A00(context2, C1AD.A06(c06090Tz, 18315746299888345L) ? R.raw.gen_ai_assets_meta_ai_fast_wink_fade_twist_fade_twist_thick_kf_700 : R.raw.mai_20dp_flip_twist);
        if (A002 != null) {
            this.A05 = A002;
            A002.setBounds(0, 0, dimensionPixelSize2, dimensionPixelSize2);
            AnonymousClass693 anonymousClass693 = this.A05;
            if (anonymousClass693 != null) {
                anonymousClass693.A8x(new Animator.AnimatorListener() { // from class: X.698
                    @Override // android.animation.Animator.AnimatorListener
                    public final void onAnimationCancel(Animator animator) {
                    }

                    @Override // android.animation.Animator.AnimatorListener
                    public final void onAnimationRepeat(Animator animator) {
                    }

                    @Override // android.animation.Animator.AnimatorListener
                    public final void onAnimationStart(Animator animator) {
                    }

                    @Override // android.animation.Animator.AnimatorListener
                    public final void onAnimationEnd(Animator animator) {
                        SearchEditText searchEditText = SearchEditText.this;
                        searchEditText.A0M = false;
                        searchEditText.A0N = true;
                        SearchEditText.A01(searchEditText);
                        AnonymousClass693 anonymousClass6932 = searchEditText.A06;
                        if (anonymousClass6932 != null && !anonymousClass6932.A03.isRunning()) {
                            anonymousClass6932.EH1();
                            anonymousClass6932.E4S();
                        }
                    }
                });
            }
        }
        AnonymousClass693 A003 = C68U.A00(context2, C1AD.A06(c06090Tz, 18315746299888345L) ? R.raw.gen_ai_assets_meta_ai_fast_fade_twist_thick_kf_700 : R.raw.mai_donut_ambient_spin_28dp_kf);
        if (A003 != null) {
            this.A06 = A003;
            A003.setBounds(0, 0, dimensionPixelSize2, dimensionPixelSize2);
            AnonymousClass693 anonymousClass6932 = this.A06;
            if (anonymousClass6932 != null) {
                anonymousClass6932.setVisible(true, true);
            }
        }
        this.A02 = context.getDrawable(R.drawable.instagram_search_meta_ai_send_icon);
        this.A01 = context.getDrawable(R.drawable.instagram_search_meta_ai_send_icon_disabled);
        A01(this);
        this.A0G = z;
        Object systemService = context2.getSystemService("input_method");
        if (systemService != null) {
            this.A0T = (InputMethodManager) systemService;
            this.A0W = new AbstractC87043uM(this) { // from class: X.65o
                public final boolean A00;
                public static final int[] A02 = new int[2];
                public static final Rect A01 = new Rect();

                @Override // X.AbstractC87043uM
                public final void A03(AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
                    C14360o3.A0B(accessibilityNodeInfoCompat, 0);
                    View view = this.A02;
                    SearchEditText searchEditText = (SearchEditText) view;
                    if (searchEditText.A0I && searchEditText.A0H && searchEditText.A00 != null) {
                        accessibilityNodeInfoCompat.mInfo.addChild(view, Process.WAIT_RESULT_STOPPED);
                    }
                }

                @Override // X.AbstractC87043uM
                public final void A04(AccessibilityNodeInfoCompat accessibilityNodeInfoCompat, int i2) {
                    Rect rect;
                    if (i2 == -2147483647) {
                        View view = this.A02;
                        SearchEditText searchEditText = (SearchEditText) view;
                        if (searchEditText.A0I && searchEditText.A0H && searchEditText.A00 != null) {
                            int clearButtonWidth = searchEditText.getClearButtonWidth();
                            int clearButtonHeight = searchEditText.getClearButtonHeight();
                            int[] iArr = A02;
                            searchEditText.getLocationOnScreen(iArr);
                            int height = iArr[1] + ((searchEditText.getHeight() - clearButtonHeight) / 2);
                            boolean z2 = this.A00;
                            int i3 = iArr[0];
                            if (z2) {
                                int paddingLeft = i3 + searchEditText.getPaddingLeft();
                                rect = A01;
                                rect.set(paddingLeft, height, clearButtonWidth + paddingLeft, clearButtonHeight + height);
                            } else {
                                int width = (i3 + searchEditText.getWidth()) - searchEditText.getPaddingRight();
                                rect = A01;
                                rect.set(width - clearButtonWidth, height, width, clearButtonHeight + height);
                            }
                            accessibilityNodeInfoCompat.setParent(view);
                            accessibilityNodeInfoCompat.mInfo.setBoundsInScreen(rect);
                            accessibilityNodeInfoCompat.setContentDescription(searchEditText.getResources().getString(2131955202));
                            accessibilityNodeInfoCompat.setClassName("android.widget.Button");
                            accessibilityNodeInfoCompat.mInfo.setVisibleToUser(true);
                            accessibilityNodeInfoCompat.mInfo.setFocusable(true);
                            accessibilityNodeInfoCompat.setClickable(true);
                            accessibilityNodeInfoCompat.setEnabled(true);
                        }
                    }
                }

                @Override // X.AbstractC87043uM
                public final int A01(float f, float f2) {
                    SearchEditText searchEditText = (SearchEditText) this.A02;
                    if (searchEditText.A0I && searchEditText.A0H && searchEditText.A00 != null && searchEditText.A0D(f)) {
                        return Process.WAIT_RESULT_STOPPED;
                    }
                    return Integer.MIN_VALUE;
                }

                {
                    super(this);
                    this.A00 = AbstractC13620mo.A02(this.getContext());
                }
            };
            Drawable drawable3 = context.getDrawable(R.drawable.instagram_audio_wave_pano_outline_16);
            this.A0S = drawable3;
            if (drawable3 != null) {
                drawable3.setBounds(0, 0, resources.getDimensionPixelSize(R.dimen.abc_select_dialog_padding_start_material), resources.getDimensionPixelSize(R.dimen.abc_select_dialog_padding_start_material));
            }
            if (!AbstractC72723Nt.A00(context)) {
                Drawable drawable4 = this.A0S;
                if (drawable4 != null) {
                    drawable4.setColorFilter(new PorterDuffColorFilter(-16777216, PorterDuff.Mode.SRC_ATOP));
                    return;
                }
                return;
            }
            Drawable drawable5 = this.A0S;
            if (drawable5 == null) {
                return;
            }
            drawable5.setColorFilter(C3DY.A00(context.getColor(AbstractC53242c7.A0H(context, R.attr.igds_color_primary_button_icon))));
            return;
        }
        throw new IllegalStateException("Required value was null.");
    }

    public /* synthetic */ SearchEditText(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public SearchEditText(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        C14360o3.A0B(context, 1);
    }
}
