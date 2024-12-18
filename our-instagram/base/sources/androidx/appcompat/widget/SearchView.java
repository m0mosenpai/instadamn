package androidx.appcompat.widget;

import X.AbstractC010103p;
import X.AbstractC166987dD;
import X.AbstractC167007dF;
import X.AbstractC167017dG;
import X.AbstractC31171DnF;
import X.AbstractC31175DnJ;
import X.AbstractC31177DnL;
import X.AbstractC50523MSb;
import X.AbstractC53402cO;
import X.AbstractC58318PtA;
import X.AbstractC58319PtB;
import X.AbstractC69803Vvp;
import X.AnonymousClass001;
import X.C0f9;
import X.C53122bu;
import X.C63467Sl7;
import X.C63480Snt;
import X.C63536Sp3;
import X.C70256WOb;
import X.C70259WOe;
import X.InterfaceC65174TfI;
import X.InterfaceC65175TfJ;
import X.InterfaceC65176TfK;
import X.InterfaceC71932XBh;
import X.LQ9;
import X.Q4J;
import X.Q51;
import X.Q7G;
import X.RunnableC71214Wq5;
import X.SWJ;
import X.TJ4;
import X.TJ5;
import X.UB7;
import X.ViewOnClickListenerC63508Sob;
import X.ViewOnKeyListenerC70238WNb;
import X.WNY;
import android.app.SearchableInfo;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.database.Cursor;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.Editable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.text.style.ImageSpan;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputMethodManager;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.customview.view.AbsSavedState;
import com.facebook.R;
import com.facebook.common.dextricks.Constants;
import java.lang.reflect.Method;
import java.util.WeakHashMap;

/* loaded from: classes10.dex */
public class SearchView extends LinearLayoutCompat implements InterfaceC71932XBh {
    public static final SWJ A0o;
    public SearchableInfo A00;
    public Bundle A01;
    public View.OnFocusChangeListener A02;
    public View.OnKeyListener A03;
    public InterfaceC65175TfJ A04;
    public Q51 A05;
    public CharSequence A06;
    public CharSequence A07;
    public boolean A08;
    public boolean A09;
    public boolean A0A;
    public boolean A0B;
    public boolean A0C;
    public int[] A0D;
    public int[] A0E;
    public int A0F;
    public int A0G;
    public Rect A0H;
    public Rect A0I;
    public TextWatcher A0J;
    public View.OnClickListener A0K;
    public InterfaceC65174TfI A0L;
    public InterfaceC65176TfK A0M;
    public Q4J A0N;
    public CharSequence A0O;
    public Runnable A0P;
    public boolean A0Q;
    public boolean A0R;
    public final int A0S;
    public final int A0T;
    public final Intent A0U;
    public final Intent A0V;
    public final Drawable A0W;
    public final View A0X;
    public final View A0Y;
    public final ImageView A0Z;
    public final ImageView A0a;
    public final ImageView A0b;
    public final ImageView A0c;
    public final SearchAutoComplete A0d;
    public final Runnable A0e;
    public final WeakHashMap A0f;
    public final View.OnClickListener A0g;
    public final View A0h;
    public final View A0i;
    public final AdapterView.OnItemClickListener A0j;
    public final AdapterView.OnItemSelectedListener A0k;
    public final ImageView A0l;
    public final TextView.OnEditorActionListener A0m;
    public final CharSequence A0n;

    /* loaded from: classes11.dex */
    public class SearchAutoComplete extends UB7 {
        public SearchView A00;
        public boolean A01;
        public int A02;
        public final Runnable A03;

        @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
        public final boolean onKeyPreIme(int i, KeyEvent keyEvent) {
            if (i == 4) {
                if (keyEvent.getAction() == 0 && keyEvent.getRepeatCount() == 0) {
                    KeyEvent.DispatcherState keyDispatcherState = getKeyDispatcherState();
                    if (keyDispatcherState != null) {
                        keyDispatcherState.startTracking(keyEvent, this);
                    }
                    return true;
                }
                if (keyEvent.getAction() == 1) {
                    KeyEvent.DispatcherState keyDispatcherState2 = getKeyDispatcherState();
                    if (keyDispatcherState2 != null) {
                        keyDispatcherState2.handleUpEvent(keyEvent);
                    }
                    if (keyEvent.isTracking() && !keyEvent.isCanceled()) {
                        this.A00.clearFocus();
                        setImeVisibility(false);
                        return true;
                    }
                }
            }
            return super.onKeyPreIme(i, keyEvent);
        }

        @Override // android.widget.AutoCompleteTextView
        public final void performCompletion() {
        }

        @Override // android.widget.AutoCompleteTextView
        public final void replaceText(CharSequence charSequence) {
        }

        public final void A00() {
            if (Build.VERSION.SDK_INT >= 29) {
                AbstractC69803Vvp.A01(this);
                if (enoughToFilter()) {
                    showDropDown();
                    return;
                }
                return;
            }
            SWJ swj = SearchView.A0o;
            SWJ.A00();
            Method method = swj.A02;
            if (method == null) {
                return;
            }
            try {
                method.invoke(this, true);
            } catch (Exception unused) {
            }
        }

        @Override // android.widget.AutoCompleteTextView
        public final boolean enoughToFilter() {
            if (this.A02 > 0 && !super.enoughToFilter()) {
                return false;
            }
            return true;
        }

        public SearchAutoComplete(Context context, AttributeSet attributeSet, int i) {
            super(context, attributeSet, i);
            this.A03 = new RunnableC71214Wq5(this);
            this.A02 = getThreshold();
        }

        private int getSearchViewTextMinWidthDp() {
            Configuration configuration = getResources().getConfiguration();
            int i = configuration.screenWidthDp;
            int i2 = configuration.screenHeightDp;
            if (i >= 960) {
                if (i2 >= 720 && configuration.orientation == 2) {
                    return 256;
                }
            } else if (i < 600) {
                return 160;
            }
            return 192;
        }

        @Override // X.UB7, android.widget.TextView, android.view.View
        public final InputConnection onCreateInputConnection(EditorInfo editorInfo) {
            InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
            if (this.A01) {
                Runnable runnable = this.A03;
                removeCallbacks(runnable);
                post(runnable);
            }
            return onCreateInputConnection;
        }

        @Override // android.view.View
        public final void onFinishInflate() {
            int A06 = C0f9.A06(-1147866047);
            super.onFinishInflate();
            setMinWidth((int) TypedValue.applyDimension(1, getSearchViewTextMinWidthDp(), getResources().getDisplayMetrics()));
            C0f9.A0D(-1089760421, A06);
        }

        @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
        public final void onFocusChanged(boolean z, int i, Rect rect) {
            int A06 = C0f9.A06(-1522809998);
            super.onFocusChanged(z, i, rect);
            SearchView searchView = this.A00;
            SearchView.A04(searchView, searchView.A08);
            searchView.post(searchView.A0e);
            if (searchView.A0d.hasFocus()) {
                searchView.A08();
            }
            C0f9.A0D(1905687993, A06);
        }

        @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
        public final void onWindowFocusChanged(boolean z) {
            int A06 = C0f9.A06(1982325531);
            super.onWindowFocusChanged(z);
            if (z && this.A00.hasFocus() && getVisibility() == 0) {
                this.A01 = true;
                Context context = getContext();
                SWJ swj = SearchView.A0o;
                if (AbstractC58319PtB.A08(context).orientation == 2) {
                    A00();
                }
            }
            C0f9.A0D(1323365746, A06);
        }

        public void setImeVisibility(boolean z) {
            InputMethodManager inputMethodManager = (InputMethodManager) getContext().getSystemService("input_method");
            if (!z) {
                this.A01 = false;
                removeCallbacks(this.A03);
                inputMethodManager.hideSoftInputFromWindow(getWindowToken(), 0);
            } else {
                if (inputMethodManager.isActive(this)) {
                    this.A01 = false;
                    removeCallbacks(this.A03);
                    inputMethodManager.showSoftInput(this, 0);
                    return;
                }
                this.A01 = true;
            }
        }

        public void setSearchView(SearchView searchView) {
            this.A00 = searchView;
        }

        @Override // android.widget.AutoCompleteTextView
        public void setThreshold(int i) {
            super.setThreshold(i);
            this.A02 = i;
        }

        public SearchAutoComplete(Context context, AttributeSet attributeSet) {
            this(context, attributeSet, R.attr.autoCompleteTextViewStyle);
        }

        public SearchAutoComplete(Context context) {
            this(context, null);
        }
    }

    public final void A0A() {
        A04(this, false);
        SearchAutoComplete searchAutoComplete = this.A0d;
        searchAutoComplete.requestFocus();
        searchAutoComplete.setImeVisibility(true);
        View.OnClickListener onClickListener = this.A0K;
        if (onClickListener != null) {
            onClickListener.onClick(this);
        }
    }

    public final void A0D(int i) {
        int i2;
        String A01;
        Cursor cursor = this.A05.A02;
        if (cursor != null && cursor.moveToPosition(i)) {
            Uri uri = null;
            try {
                String A012 = Q7G.A01(cursor, cursor.getColumnIndex("suggest_intent_action"));
                if (A012 == null) {
                    A012 = this.A00.getSuggestIntentAction();
                }
                if (A012 == null) {
                    A012 = "android.intent.action.SEARCH";
                }
                String A013 = Q7G.A01(cursor, cursor.getColumnIndex("suggest_intent_data"));
                if (A013 == null) {
                    A013 = this.A00.getSuggestIntentData();
                }
                if (A013 != null && ((A01 = Q7G.A01(cursor, cursor.getColumnIndex("suggest_intent_data_id"))) == null || (A013 = AnonymousClass001.A0g(A013, "/", Uri.encode(A01))) != null)) {
                    uri = Uri.parse(A013);
                }
                String A014 = Q7G.A01(cursor, cursor.getColumnIndex("suggest_intent_query"));
                String A015 = Q7G.A01(cursor, cursor.getColumnIndex("suggest_intent_extra_data"));
                Intent A08 = AbstractC31177DnL.A08(A012);
                if (uri != null) {
                    A08.setData(uri);
                }
                A08.putExtra("user_query", this.A07);
                if (A014 != null) {
                    A08.putExtra("query", A014);
                }
                if (A015 != null) {
                    A08.putExtra("intent_extra_data_key", A015);
                }
                Bundle bundle = this.A01;
                if (bundle != null) {
                    A08.putExtra("app_data", bundle);
                }
                A08.setComponent(this.A00.getSearchActivity());
                try {
                    getContext().startActivity(A08);
                } catch (RuntimeException e) {
                    Log.e("SearchView", AbstractC167017dG.A0n(A08, "Failed launch activity: ", AbstractC166987dD.A1C()), e);
                }
            } catch (RuntimeException e2) {
                try {
                    i2 = cursor.getPosition();
                } catch (RuntimeException unused) {
                    i2 = -1;
                }
                Log.w("SearchView", AnonymousClass001.A0c("Search suggestions cursor at row ", " returned exception.", i2), e2);
            }
        }
        SearchAutoComplete searchAutoComplete = this.A0d;
        searchAutoComplete.setImeVisibility(false);
        searchAutoComplete.dismissDropDown();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void clearFocus() {
        this.A0Q = true;
        super.clearFocus();
        SearchAutoComplete searchAutoComplete = this.A0d;
        searchAutoComplete.clearFocus();
        searchAutoComplete.setImeVisibility(false);
        this.A0Q = false;
    }

    /* loaded from: classes10.dex */
    public class SavedState extends AbsSavedState {
        public static final Parcelable.Creator CREATOR = new C63467Sl7(0);
        public boolean A00;

        public final String toString() {
            StringBuilder A1C = AbstractC166987dD.A1C();
            A1C.append("SearchView.SavedState{");
            AbstractC58318PtA.A1T(A1C, System.identityHashCode(this));
            A1C.append(" isIconified=");
            return AbstractC50523MSb.A0X(A1C, this.A00);
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeValue(Boolean.valueOf(this.A00));
        }
    }

    static {
        SWJ swj;
        if (Build.VERSION.SDK_INT < 29) {
            swj = new SWJ();
        } else {
            swj = null;
        }
        A0o = swj;
    }

    public static void A01(SearchView searchView) {
        int[] iArr;
        boolean z = true;
        boolean z2 = !TextUtils.isEmpty(searchView.A0d.getText());
        int i = 0;
        if (!z2 && (!searchView.A09 || searchView.A0R)) {
            z = false;
        }
        ImageView imageView = searchView.A0Z;
        if (!z) {
            i = 8;
        }
        imageView.setVisibility(i);
        Drawable drawable = imageView.getDrawable();
        if (drawable != null) {
            if (z2) {
                iArr = View.ENABLED_STATE_SET;
            } else {
                iArr = View.EMPTY_STATE_SET;
            }
            drawable.setState(iArr);
        }
    }

    public static void A02(SearchView searchView) {
        int i;
        if ((searchView.A0B || searchView.A0C) && !searchView.A08 && (searchView.A0a.getVisibility() == 0 || searchView.A0c.getVisibility() == 0)) {
            i = 0;
        } else {
            i = 8;
        }
        searchView.A0i.setVisibility(i);
    }

    public static void A03(SearchView searchView, boolean z) {
        int i;
        if (searchView.A0B && !searchView.A08 && searchView.hasFocus() && (z || !searchView.A0C)) {
            i = 0;
        } else {
            i = 8;
        }
        searchView.A0a.setVisibility(i);
    }

    public static void A04(SearchView searchView, boolean z) {
        searchView.A08 = z;
        int i = 0;
        int A05 = AbstractC167007dF.A05(z ? 1 : 0);
        boolean A1X = AbstractC31171DnF.A1X(searchView.A0d.getText());
        searchView.A0b.setVisibility(A05);
        A03(searchView, A1X);
        searchView.A0h.setVisibility(AbstractC31175DnJ.A01(z ? 1 : 0));
        ImageView imageView = searchView.A0l;
        if (imageView.getDrawable() == null || searchView.A09) {
            i = 8;
        }
        imageView.setVisibility(i);
        A01(searchView);
        boolean z2 = !A1X;
        int i2 = 8;
        if (searchView.A0C && !searchView.A08 && z2) {
            searchView.A0a.setVisibility(8);
            i2 = 0;
        }
        searchView.A0c.setVisibility(i2);
        A02(searchView);
    }

    private void setQuery(CharSequence charSequence) {
        int length;
        SearchAutoComplete searchAutoComplete = this.A0d;
        searchAutoComplete.setText(charSequence);
        if (TextUtils.isEmpty(charSequence)) {
            length = 0;
        } else {
            length = charSequence.length();
        }
        searchAutoComplete.setSelection(length);
    }

    public final void A08() {
        if (Build.VERSION.SDK_INT >= 29) {
            AbstractC69803Vvp.A00(this.A0d);
            return;
        }
        SWJ swj = A0o;
        SearchAutoComplete searchAutoComplete = this.A0d;
        SWJ.A00();
        Method method = swj.A01;
        if (method != null) {
            try {
                method.invoke(searchAutoComplete, new Object[0]);
            } catch (Exception unused) {
            }
        }
        SWJ.A00();
        Method method2 = swj.A00;
        if (method2 == null) {
            return;
        }
        try {
            method2.invoke(searchAutoComplete, new Object[0]);
        } catch (Exception unused2) {
        }
    }

    public final void A09() {
        SearchAutoComplete searchAutoComplete = this.A0d;
        if (TextUtils.isEmpty(searchAutoComplete.getText())) {
            if (this.A09) {
                clearFocus();
                A04(this, true);
                return;
            }
            return;
        }
        searchAutoComplete.setText("");
        searchAutoComplete.requestFocus();
        searchAutoComplete.setImeVisibility(true);
    }

    public final void A0B() {
        SearchAutoComplete searchAutoComplete = this.A0d;
        Editable text = searchAutoComplete.getText();
        if (text != null && TextUtils.getTrimmedLength(text) > 0) {
            if (this.A04 != null) {
                text.toString();
            }
            if (this.A00 != null) {
                A0G(text.toString());
            }
            searchAutoComplete.setImeVisibility(false);
            searchAutoComplete.dismissDropDown();
        }
    }

    public final void A0C() {
        int[] iArr;
        if (this.A0d.hasFocus()) {
            iArr = View.FOCUSED_STATE_SET;
        } else {
            iArr = View.EMPTY_STATE_SET;
        }
        Drawable background = this.A0Y.getBackground();
        if (background != null) {
            background.setState(iArr);
        }
        Drawable background2 = this.A0i.getBackground();
        if (background2 != null) {
            background2.setState(iArr);
        }
        invalidate();
    }

    public final void A0E(int i) {
        CharSequence AKA;
        Editable text = this.A0d.getText();
        Cursor cursor = this.A05.A02;
        if (cursor != null) {
            if (cursor.moveToPosition(i) && (AKA = this.A05.AKA(cursor)) != null) {
                setQuery(AKA);
            } else {
                setQuery(text);
            }
        }
    }

    public final void A0G(String str) {
        Intent A08 = AbstractC31177DnL.A08("android.intent.action.SEARCH");
        A08.putExtra("user_query", this.A07);
        if (str != null) {
            A08.putExtra("query", str);
        }
        Bundle bundle = this.A01;
        if (bundle != null) {
            A08.putExtra("app_data", bundle);
        }
        A08.setComponent(this.A00.getSearchActivity());
        getContext().startActivity(A08);
    }

    public int getImeOptions() {
        return this.A0d.getImeOptions();
    }

    public int getInputType() {
        return this.A0d.getInputType();
    }

    public int getMaxWidth() {
        return this.A0G;
    }

    public CharSequence getQuery() {
        return this.A0d.getText();
    }

    public CharSequence getQueryHint() {
        CharSequence charSequence = this.A0O;
        if (charSequence == null) {
            SearchableInfo searchableInfo = this.A00;
            if (searchableInfo != null && searchableInfo.getHintId() != 0) {
                return getContext().getText(this.A00.getHintId());
            }
            return this.A0n;
        }
        return charSequence;
    }

    public int getSuggestionCommitIconResId() {
        return this.A0S;
    }

    public int getSuggestionRowLayout() {
        return this.A0T;
    }

    public Q51 getSuggestionsAdapter() {
        return this.A05;
    }

    @Override // X.InterfaceC71932XBh
    public final void onActionViewCollapsed() {
        SearchAutoComplete searchAutoComplete = this.A0d;
        searchAutoComplete.setText("");
        searchAutoComplete.setSelection(searchAutoComplete.length());
        this.A07 = "";
        clearFocus();
        A04(this, true);
        searchAutoComplete.setImeOptions(this.A0F);
        this.A0R = false;
    }

    @Override // X.InterfaceC71932XBh
    public final void onActionViewExpanded() {
        if (!this.A0R) {
            this.A0R = true;
            SearchAutoComplete searchAutoComplete = this.A0d;
            int imeOptions = searchAutoComplete.getImeOptions();
            this.A0F = imeOptions;
            searchAutoComplete.setImeOptions(imeOptions | 33554432);
            searchAutoComplete.setText("");
            A0A();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x0018, code lost:
    
        if (r0 > 0) goto L10;
     */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0028  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x003a  */
    @Override // androidx.appcompat.widget.LinearLayoutCompat, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onMeasure(int r6, int r7) {
        /*
            r5 = this;
            boolean r0 = r5.A08
            if (r0 != 0) goto L36
            int r0 = android.view.View.MeasureSpec.getMode(r6)
            int r4 = android.view.View.MeasureSpec.getSize(r6)
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r2 = 1073741824(0x40000000, float:2.0)
            if (r0 == r3) goto L4c
            if (r0 == 0) goto L43
            if (r0 != r2) goto L1e
            int r0 = r5.A0G
            if (r0 <= 0) goto L1e
        L1a:
            int r4 = java.lang.Math.min(r0, r4)
        L1e:
            int r0 = android.view.View.MeasureSpec.getMode(r7)
            int r1 = android.view.View.MeasureSpec.getSize(r7)
            if (r0 == r3) goto L3a
            if (r0 != 0) goto L2e
            int r1 = r5.getPreferredHeight()
        L2e:
            int r6 = android.view.View.MeasureSpec.makeMeasureSpec(r4, r2)
            int r7 = android.view.View.MeasureSpec.makeMeasureSpec(r1, r2)
        L36:
            super.onMeasure(r6, r7)
            return
        L3a:
            int r0 = r5.getPreferredHeight()
            int r1 = java.lang.Math.min(r0, r1)
            goto L2e
        L43:
            int r4 = r5.A0G
            if (r4 > 0) goto L1e
            int r4 = r5.getPreferredWidth()
            goto L1e
        L4c:
            int r0 = r5.A0G
            if (r0 > 0) goto L1a
            int r0 = r5.getPreferredWidth()
            goto L1a
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.SearchView.onMeasure(int, int):void");
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(((AbsSavedState) savedState).A00);
        A04(this, savedState.A00);
        requestLayout();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean requestFocus(int i, Rect rect) {
        if (this.A0Q || !isFocusable()) {
            return false;
        }
        if (!this.A08) {
            boolean requestFocus = this.A0d.requestFocus(i, rect);
            if (requestFocus) {
                A04(this, false);
            }
            return requestFocus;
        }
        return super.requestFocus(i, rect);
    }

    public void setIconified(boolean z) {
        if (z) {
            A09();
        } else {
            A0A();
        }
    }

    public void setIconifiedByDefault(boolean z) {
        if (this.A09 != z) {
            this.A09 = z;
            A04(this, z);
            A00();
        }
    }

    public void setImeOptions(int i) {
        this.A0d.setImeOptions(i);
    }

    public void setInputType(int i) {
        this.A0d.setInputType(i);
    }

    public void setMaxWidth(int i) {
        this.A0G = i;
        requestLayout();
    }

    public void setQueryHint(CharSequence charSequence) {
        this.A0O = charSequence;
        A00();
    }

    public void setQueryRefinementEnabled(boolean z) {
        this.A0A = z;
        Q51 q51 = this.A05;
        if (q51 instanceof Q7G) {
            Q7G q7g = (Q7G) q51;
            int i = 1;
            if (z) {
                i = 2;
            }
            q7g.A03 = i;
        }
    }

    public void setSearchableInfo(SearchableInfo searchableInfo) {
        Intent intent;
        this.A00 = searchableInfo;
        if (searchableInfo != null) {
            SearchAutoComplete searchAutoComplete = this.A0d;
            searchAutoComplete.setThreshold(searchableInfo.getSuggestThreshold());
            searchAutoComplete.setImeOptions(this.A00.getImeOptions());
            int inputType = this.A00.getInputType();
            int i = 1;
            if ((inputType & 15) == 1) {
                inputType &= -65537;
                if (this.A00.getSuggestAuthority() != null) {
                    inputType = inputType | Constants.LOAD_RESULT_PGO_ATTEMPTED | Constants.LOAD_RESULT_WITH_VDEX_ODEX;
                }
            }
            searchAutoComplete.setInputType(inputType);
            Q51 q51 = this.A05;
            if (q51 != null) {
                q51.AGs(null);
            }
            if (this.A00.getSuggestAuthority() != null) {
                Q7G q7g = new Q7G(this.A00, getContext(), this, this.A0f);
                this.A05 = q7g;
                searchAutoComplete.setAdapter(q7g);
                Q7G q7g2 = (Q7G) this.A05;
                if (this.A0A) {
                    i = 2;
                }
                q7g2.A03 = i;
            }
            A00();
        }
        SearchableInfo searchableInfo2 = this.A00;
        boolean z = false;
        if (searchableInfo2 != null && searchableInfo2.getVoiceSearchEnabled()) {
            if (this.A00.getVoiceSearchLaunchWebSearch()) {
                intent = this.A0V;
            } else if (this.A00.getVoiceSearchLaunchRecognizer()) {
                intent = this.A0U;
            }
            if (intent != null && getContext().getPackageManager().resolveActivity(intent, Constants.LOAD_RESULT_PGO_ATTEMPTED) != null) {
                z = true;
            }
        }
        this.A0C = z;
        if (z) {
            this.A0d.setPrivateImeOptions("nm");
        }
        A04(this, this.A08);
    }

    public void setSubmitButtonEnabled(boolean z) {
        this.A0B = z;
        A04(this, this.A08);
    }

    public void setSuggestionsAdapter(Q51 q51) {
        this.A05 = q51;
        this.A0d.setAdapter(q51);
    }

    public SearchView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.searchViewStyle);
    }

    private void A00() {
        Drawable drawable;
        CharSequence queryHint = getQueryHint();
        SearchAutoComplete searchAutoComplete = this.A0d;
        if (queryHint == null) {
            queryHint = "";
        }
        if (this.A09 && (drawable = this.A0W) != null) {
            int textSize = (int) (searchAutoComplete.getTextSize() * 1.25d);
            drawable.setBounds(0, 0, textSize, textSize);
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("   ");
            spannableStringBuilder.setSpan(new ImageSpan(drawable), 1, 2, 33);
            spannableStringBuilder.append(queryHint);
            queryHint = spannableStringBuilder;
        }
        searchAutoComplete.setHint(queryHint);
    }

    private int getPreferredHeight() {
        return getContext().getResources().getDimensionPixelSize(R.dimen.abc_alert_dialog_button_dimen);
    }

    private int getPreferredWidth() {
        return getContext().getResources().getDimensionPixelSize(R.dimen.abc_search_view_preferred_width);
    }

    public final void A0F(CharSequence charSequence) {
        setQuery(charSequence);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        int A06 = C0f9.A06(333466634);
        removeCallbacks(this.A0e);
        post(this.A0P);
        super.onDetachedFromWindow();
        C0f9.A0D(512637819, A06);
    }

    @Override // androidx.appcompat.widget.LinearLayoutCompat, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (z) {
            SearchAutoComplete searchAutoComplete = this.A0d;
            Rect rect = this.A0H;
            int[] iArr = this.A0D;
            searchAutoComplete.getLocationInWindow(iArr);
            int[] iArr2 = this.A0E;
            getLocationInWindow(iArr2);
            int i5 = iArr[1] - iArr2[1];
            int i6 = iArr[0] - iArr2[0];
            rect.set(i6, i5, searchAutoComplete.getWidth() + i6, searchAutoComplete.getHeight() + i5);
            Rect rect2 = this.A0I;
            rect2.set(rect.left, 0, rect.right, i4 - i2);
            Q4J q4j = this.A0N;
            if (q4j == null) {
                Q4J q4j2 = new Q4J(rect2, rect, searchAutoComplete);
                this.A0N = q4j2;
                setTouchDelegate(q4j2);
            } else {
                q4j.A04.set(rect2);
                Rect rect3 = q4j.A03;
                rect3.set(rect2);
                int i7 = -q4j.A01;
                rect3.inset(i7, i7);
                q4j.A02.set(rect);
            }
        }
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [android.os.Parcelable, androidx.customview.view.AbsSavedState, androidx.appcompat.widget.SearchView$SavedState] */
    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        ?? absSavedState = new AbsSavedState(super.onSaveInstanceState());
        absSavedState.A00 = this.A08;
        return absSavedState;
    }

    @Override // android.view.View
    public final void onWindowFocusChanged(boolean z) {
        int A06 = C0f9.A06(-747092472);
        super.onWindowFocusChanged(z);
        post(this.A0e);
        C0f9.A0D(1559626855, A06);
    }

    public void setAppSearchData(Bundle bundle) {
        this.A01 = bundle;
    }

    public void setOnCloseListener(InterfaceC65174TfI interfaceC65174TfI) {
        this.A0L = interfaceC65174TfI;
    }

    public void setOnQueryTextFocusChangeListener(View.OnFocusChangeListener onFocusChangeListener) {
        this.A02 = onFocusChangeListener;
    }

    public void setOnQueryTextListener(InterfaceC65175TfJ interfaceC65175TfJ) {
        this.A04 = interfaceC65175TfJ;
    }

    public void setOnSearchClickListener(View.OnClickListener onClickListener) {
        this.A0K = onClickListener;
    }

    public void setOnSuggestionListener(InterfaceC65176TfK interfaceC65176TfK) {
        this.A0M = interfaceC65176TfK;
    }

    public SearchView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.A0H = AbstractC166987dD.A0U();
        this.A0I = AbstractC166987dD.A0U();
        this.A0D = new int[2];
        this.A0E = new int[2];
        this.A0e = new TJ4(this);
        this.A0P = new TJ5(this);
        this.A0f = new WeakHashMap();
        ViewOnClickListenerC63508Sob A00 = ViewOnClickListenerC63508Sob.A00(this, 0);
        this.A0g = A00;
        this.A03 = new ViewOnKeyListenerC70238WNb(this, 0);
        C63536Sp3 c63536Sp3 = new C63536Sp3(this, 0);
        this.A0m = c63536Sp3;
        C70256WOb c70256WOb = new C70256WOb(this, 0);
        this.A0j = c70256WOb;
        C70259WOe c70259WOe = new C70259WOe(this, 1);
        this.A0k = c70259WOe;
        this.A0J = new C63480Snt(this, 0);
        int[] iArr = AbstractC53402cO.A0K;
        C53122bu A002 = C53122bu.A00(context, attributeSet, iArr, i, 0);
        TypedArray typedArray = A002.A02;
        AbstractC010103p.A06(context, typedArray, attributeSet, this, iArr, i, 0);
        LayoutInflater.from(context).inflate(typedArray.getResourceId(9, R.layout.abc_search_view), (ViewGroup) this, true);
        SearchAutoComplete searchAutoComplete = (SearchAutoComplete) findViewById(R.id.search_src_text);
        this.A0d = searchAutoComplete;
        searchAutoComplete.A00 = this;
        this.A0h = findViewById(R.id.search_edit_frame);
        View findViewById = findViewById(R.id.search_plate);
        this.A0Y = findViewById;
        View findViewById2 = findViewById(R.id.submit_area);
        this.A0i = findViewById2;
        ImageView A08 = AbstractC31171DnF.A08(this, R.id.search_button);
        this.A0b = A08;
        ImageView A082 = AbstractC31171DnF.A08(this, R.id.search_go_btn);
        this.A0a = A082;
        ImageView A083 = AbstractC31171DnF.A08(this, R.id.search_close_btn);
        this.A0Z = A083;
        ImageView A084 = AbstractC31171DnF.A08(this, R.id.search_voice_btn);
        this.A0c = A084;
        ImageView A085 = AbstractC31171DnF.A08(this, R.id.search_mag_icon);
        this.A0l = A085;
        findViewById.setBackground(A002.A02(10));
        findViewById2.setBackground(A002.A02(14));
        A08.setImageDrawable(A002.A02(13));
        A082.setImageDrawable(A002.A02(7));
        A083.setImageDrawable(A002.A02(4));
        A084.setImageDrawable(A002.A02(16));
        A085.setImageDrawable(A002.A02(13));
        this.A0W = A002.A02(12);
        A08.setTooltipText(getResources().getString(2131951983));
        this.A0T = typedArray.getResourceId(15, R.layout.abc_search_dropdown_item_icons_2line);
        this.A0S = typedArray.getResourceId(5, 0);
        A08.setOnClickListener(A00);
        A083.setOnClickListener(A00);
        A082.setOnClickListener(A00);
        A084.setOnClickListener(A00);
        searchAutoComplete.setOnClickListener(A00);
        searchAutoComplete.addTextChangedListener(this.A0J);
        searchAutoComplete.setOnEditorActionListener(c63536Sp3);
        searchAutoComplete.setOnItemClickListener(c70256WOb);
        searchAutoComplete.setOnItemSelectedListener(c70259WOe);
        searchAutoComplete.setOnKeyListener(this.A03);
        searchAutoComplete.setOnFocusChangeListener(new WNY(this, 0));
        setIconifiedByDefault(typedArray.getBoolean(8, true));
        int dimensionPixelSize = typedArray.getDimensionPixelSize(1, -1);
        if (dimensionPixelSize != -1) {
            setMaxWidth(dimensionPixelSize);
        }
        this.A0n = typedArray.getText(6);
        this.A0O = typedArray.getText(11);
        int i2 = typedArray.getInt(3, -1);
        if (i2 != -1) {
            setImeOptions(i2);
        }
        int i3 = typedArray.getInt(2, -1);
        if (i3 != -1) {
            setInputType(i3);
        }
        setFocusable(typedArray.getBoolean(0, true));
        typedArray.recycle();
        Intent A0E = AbstractC58318PtA.A0E("android.speech.action.WEB_SEARCH");
        this.A0V = A0E;
        A0E.addFlags(268435456);
        A0E.putExtra("android.speech.extra.LANGUAGE_MODEL", "web_search");
        Intent A0E2 = AbstractC58318PtA.A0E("android.speech.action.RECOGNIZE_SPEECH");
        this.A0U = A0E2;
        A0E2.addFlags(268435456);
        View findViewById3 = findViewById(searchAutoComplete.getDropDownAnchor());
        this.A0X = findViewById3;
        if (findViewById3 != null) {
            findViewById3.addOnLayoutChangeListener(new LQ9(this, 0));
        }
        A04(this, this.A09);
        A00();
    }

    public SearchView(Context context) {
        this(context, null);
    }
}
