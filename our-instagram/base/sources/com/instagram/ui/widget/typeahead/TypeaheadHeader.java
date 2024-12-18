package com.instagram.ui.widget.typeahead;

import X.AbstractC167017dG;
import X.AbstractC25228BEl;
import X.AbstractC31572Dty;
import X.C00O;
import X.C14360o3;
import X.C31571Dtx;
import X.C31703Dw8;
import X.C36749GHw;
import X.GX4;
import X.GYW;
import X.GZS;
import X.ViewOnFocusChangeListenerC35694FpU;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.facebook.R;
import com.instagram.ui.widget.searchedittext.SearchEditText;

/* loaded from: classes6.dex */
public final class TypeaheadHeader extends LinearLayout {
    public SearchEditText A00;
    public GZS A01;
    public GYW A02;
    public GX4 A03;
    public final C31571Dtx A04;

    public final void A03(String str) {
        C14360o3.A0B(str, 0);
        SearchEditText searchEditText = this.A00;
        if (searchEditText == null) {
            C14360o3.A0F("searchEditText");
            throw C00O.createAndThrow();
        }
        searchEditText.setHint(str);
    }

    public final void A04(String str) {
        C14360o3.A0B(str, 0);
        SearchEditText searchEditText = this.A00;
        if (searchEditText == null) {
            C14360o3.A0F("searchEditText");
            throw C00O.createAndThrow();
        }
        searchEditText.setText(str);
    }

    public final void setDelegate(GZS gzs) {
        C14360o3.A0B(gzs, 0);
        this.A01 = gzs;
    }

    public final void setOnSearchEditTextFocusChangeListener(View.OnFocusChangeListener onFocusChangeListener) {
        C14360o3.A0B(onFocusChangeListener, 0);
        SearchEditText searchEditText = this.A00;
        if (searchEditText == null) {
            C14360o3.A0F("searchEditText");
            throw C00O.createAndThrow();
        }
        searchEditText.setOnFocusChangeListener(onFocusChangeListener);
    }

    public final void setSearchClearListener(GYW gyw) {
        C14360o3.A0B(gyw, 0);
        this.A02 = gyw;
    }

    public final void setSearchFocusListener(GX4 gx4) {
        C14360o3.A0B(gx4, 0);
        this.A03 = gx4;
    }

    public final void A01() {
        SearchEditText searchEditText = this.A00;
        if (searchEditText != null) {
            searchEditText.clearFocus();
            SearchEditText searchEditText2 = this.A00;
            if (searchEditText2 != null) {
                searchEditText2.A04();
                return;
            }
        }
        C14360o3.A0F("searchEditText");
        throw C00O.createAndThrow();
    }

    public final void A02() {
        SearchEditText searchEditText = this.A00;
        if (searchEditText == null) {
            C14360o3.A0F("searchEditText");
            throw C00O.createAndThrow();
        }
        AbstractC167017dG.A18(searchEditText);
    }

    public final String getSearchString() {
        SearchEditText searchEditText = this.A00;
        if (searchEditText == null) {
            C14360o3.A0F("searchEditText");
            throw C00O.createAndThrow();
        }
        return searchEditText.getSearchString();
    }

    public final void setAllowTextSelection(boolean z) {
        SearchEditText searchEditText = this.A00;
        if (searchEditText == null) {
            C14360o3.A0F("searchEditText");
            throw C00O.createAndThrow();
        }
        searchEditText.setAllowTextSelection(z);
    }

    public final void setClearButtonEnabled(boolean z) {
        SearchEditText searchEditText = this.A00;
        if (searchEditText == null) {
            C14360o3.A0F("searchEditText");
            throw C00O.createAndThrow();
        }
        searchEditText.setClearButtonEnabled(z);
    }

    public final void setEditTextBackground(Drawable drawable) {
        SearchEditText searchEditText = this.A00;
        if (searchEditText == null) {
            C14360o3.A0F("searchEditText");
            throw C00O.createAndThrow();
        }
        searchEditText.setBackground(drawable);
    }

    public final void setFocusOnTouchEnabled(boolean z) {
        SearchEditText searchEditText = this.A00;
        if (searchEditText == null) {
            C14360o3.A0F("searchEditText");
            throw C00O.createAndThrow();
        }
        searchEditText.A0J = z;
    }

    public final void setSearchIconPadding(int i) {
        SearchEditText searchEditText = this.A00;
        if (searchEditText == null) {
            C14360o3.A0F("searchEditText");
            throw C00O.createAndThrow();
        }
        searchEditText.setCompoundDrawablePadding(i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TypeaheadHeader(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        AbstractC167017dG.A1P(context, attributeSet);
        this.A04 = new C31571Dtx(this);
        A00();
    }

    private final void A00() {
        AbstractC25228BEl.A0P(this).inflate(R.layout.typeahead_header, (ViewGroup) this, true);
        SearchEditText searchEditText = (SearchEditText) requireViewById(R.id.row_search_edit_text);
        this.A00 = searchEditText;
        if (searchEditText != null) {
            C31703Dw8.A00(searchEditText, this, 11);
            searchEditText.A0B = new C36749GHw(this, 2);
            ViewOnFocusChangeListenerC35694FpU.A00(searchEditText, 23, this);
            SearchEditText searchEditText2 = this.A00;
            if (searchEditText2 != null) {
                AbstractC31572Dty.A00(searchEditText2);
                SearchEditText searchEditText3 = this.A00;
                if (searchEditText3 != null) {
                    AbstractC31572Dty.A01(searchEditText3);
                    SearchEditText searchEditText4 = this.A00;
                    if (searchEditText4 != null) {
                        AbstractC31572Dty.A00(searchEditText4);
                        SearchEditText searchEditText5 = this.A00;
                        if (searchEditText5 != null) {
                            AbstractC31572Dty.A01(searchEditText5);
                            GZS gzs = this.A01;
                            if (gzs != null) {
                                SearchEditText searchEditText6 = this.A00;
                                if (searchEditText6 != null) {
                                    gzs.registerTextViewLogging(searchEditText6);
                                    return;
                                }
                            } else {
                                return;
                            }
                        }
                    }
                }
            }
        }
        C14360o3.A0F("searchEditText");
        throw C00O.createAndThrow();
    }

    public final C31571Dtx getScrollDelegate() {
        return this.A04;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TypeaheadHeader(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        AbstractC167017dG.A1P(context, attributeSet);
        this.A04 = new C31571Dtx(this);
        A00();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TypeaheadHeader(Context context) {
        super(context);
        C14360o3.A0B(context, 1);
        this.A04 = new C31571Dtx(this);
        A00();
    }
}
