package X;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.text.Editable;
import android.text.InputFilter;
import android.text.Spannable;
import android.text.TextWatcher;
import android.text.method.MovementMethod;
import android.view.View;
import android.widget.EditText;
import com.facebook.common.dextricks.JITProfilePQR;
import com.facebook.litho.annotations.Comparable;
import com.facebook.litho.annotations.Prop;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: X.Bps, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C26657Bps extends AbstractC50792Va {

    @Comparable(type = 3)
    @Prop(optional = true, resType = EnumC27347C5c.NONE)
    public int A00;

    @Comparable(type = 3)
    @Prop(optional = true, resType = EnumC27347C5c.NONE)
    public int A01;

    @Comparable(type = 3)
    @Prop(optional = true, resType = EnumC27347C5c.NONE)
    public int A02;

    @Comparable(type = 3)
    @Prop(optional = true, resType = EnumC27347C5c.NONE)
    public int A03;

    @Comparable(type = 3)
    @Prop(optional = true, resType = EnumC27347C5c.NONE)
    public int A04;

    @Comparable(type = 3)
    @Prop(optional = true, resType = EnumC27347C5c.DIMEN_TEXT)
    public int A05;

    @Comparable(type = JITProfilePQR.HEADER_COMPRESSED_SIZE_OFFSET)
    @Prop(optional = true, resType = EnumC27347C5c.NONE)
    public ColorStateList A06;

    @Comparable(type = JITProfilePQR.HEADER_COMPRESSED_SIZE_OFFSET)
    @Prop(optional = true, resType = EnumC27347C5c.NONE)
    public ColorStateList A07;

    @Comparable(type = JITProfilePQR.HEADER_COMPRESSED_SIZE_OFFSET)
    @Prop(optional = true, resType = EnumC27347C5c.NONE)
    public Typeface A08;

    @Comparable(type = JITProfilePQR.HEADER_COMPRESSED_SIZE_OFFSET)
    @Prop(optional = true, resType = EnumC27347C5c.DRAWABLE)
    public Drawable A09;

    @Comparable(type = JITProfilePQR.HEADER_COMPRESSED_SIZE_OFFSET)
    @Prop(optional = true, resType = EnumC27347C5c.NONE)
    public MovementMethod A0A;
    public C2V9 A0B;
    public C51422Xp A0C;
    public C51422Xp A0D;
    public C51422Xp A0E;
    public C51422Xp A0F;
    public C51422Xp A0G;
    public C51422Xp A0H;
    public C51422Xp A0I;
    public C51422Xp A0J;
    public C51422Xp A0K;
    public C51422Xp A0L;
    public C51422Xp A0M;
    public C51422Xp A0N;
    public C51422Xp A0O;

    @Comparable(type = JITProfilePQR.HEADER_COMPRESSED_SIZE_OFFSET)
    @Prop(optional = true, resType = EnumC27347C5c.STRING)
    public CharSequence A0P;

    @Comparable(type = JITProfilePQR.HEADER_COMPRESSED_SIZE_OFFSET)
    @Prop(optional = true, resType = EnumC27347C5c.STRING)
    public CharSequence A0Q;

    @Comparable(type = JITProfilePQR.HEADER_COMPRESSED_SIZE_OFFSET)
    @Prop(optional = true, resType = EnumC27347C5c.COLOR)
    public Integer A0R;

    @Comparable(type = 5)
    @Prop(optional = true, resType = EnumC27347C5c.NONE, varArg = "inputFilter")
    public List A0S;

    @Comparable(type = 5)
    @Prop(optional = true, resType = EnumC27347C5c.NONE, varArg = "textWatcher")
    public List A0T;

    @Comparable(type = 3)
    @Prop(optional = true, resType = EnumC27347C5c.NONE)
    public boolean A0U;

    @Comparable(type = 3)
    @Prop(optional = true, resType = EnumC27347C5c.NONE)
    public boolean A0V;

    @Override // X.AbstractC50812Vc
    public final boolean A0S() {
        return true;
    }

    @Override // X.AbstractC50812Vc
    public final boolean A0T() {
        return true;
    }

    @Override // X.AbstractC50812Vc
    public final boolean A0U() {
        return true;
    }

    @Override // X.AbstractC50792Va
    public final boolean A12() {
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x002f, code lost:
    
        if (r1.equals(r0) == false) goto L18;
     */
    @Override // X.AbstractC50792Va
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean A19(X.AbstractC50812Vc r5, boolean r6) {
        /*
            Method dump skipped, instructions count: 241
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C26657Bps.A19(X.2Vc, boolean):boolean");
    }

    public C26657Bps() {
        super("TextInput");
        this.A0U = true;
        this.A00 = 8388627;
        this.A0P = "";
        this.A06 = COG.A00;
        this.A0Q = "";
        this.A09 = COG.A05;
        this.A0S = Collections.emptyList();
        this.A01 = 1;
        this.A02 = Integer.MAX_VALUE;
        this.A03 = 1;
        this.A0A = COG.A06;
        this.A0V = false;
        this.A04 = 1;
        this.A07 = COG.A01;
        this.A05 = -1;
        this.A0T = Collections.emptyList();
        this.A08 = COG.A03;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [android.widget.TextView, X.BZ6, java.lang.Object, android.widget.TextView$OnEditorActionListener, android.widget.EditText] */
    @Override // X.AbstractC50812Vc
    public final Object A0R(Context context) {
        InputFilter[] inputFilterArr = COG.A09;
        ?? editText = new EditText(context);
        editText.A00 = -1;
        editText.setOnEditorActionListener(editText);
        editText.setEditableFactory(new Editable.Factory());
        return editText;
    }

    /* JADX WARN: Code restructure failed: missing block: B:156:0x01ab, code lost:
    
        if (r9 == null) goto L158;
     */
    @Override // X.AbstractC50812Vc
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean A0V(X.AbstractC50812Vc r60, X.AbstractC50812Vc r61, X.AbstractC50922Vo r62, X.AbstractC50922Vo r63) {
        /*
            Method dump skipped, instructions count: 949
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C26657Bps.A0V(X.2Vc, X.2Vc, X.2Vo, X.2Vo):boolean");
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [X.2Vo, java.lang.Object] */
    @Override // X.AbstractC50792Va
    public final /* bridge */ /* synthetic */ AbstractC50922Vo A0g() {
        return new Object();
    }

    @Override // X.AbstractC50792Va
    public final void A0o(C2XE c2xe) {
        InputFilter[] inputFilterArr = COG.A09;
        TypedArray A02 = c2xe.A02(0, new int[]{R.attr.textColorHighlight});
        try {
            Integer valueOf = Integer.valueOf(A02.getColor(0, 0));
            if (valueOf != null) {
                this.A0R = valueOf;
            }
        } finally {
            A02.recycle();
        }
    }

    @Override // X.AbstractC50792Va
    public final void A0q(C2XE c2xe, C2XM c2xm) {
        AbstractC25230BEn.A1I(c2xe, this.A0K, this, c2xm);
        AbstractC25230BEn.A1I(c2xe, this.A0C, this, c2xm);
        AbstractC25230BEn.A1I(c2xe, this.A0O, this, c2xm);
        AbstractC25230BEn.A1I(c2xe, this.A0H, this, c2xm);
        AbstractC25230BEn.A1I(c2xe, this.A0G, this, c2xm);
        AbstractC25230BEn.A1I(c2xe, this.A0E, this, c2xm);
        AbstractC25230BEn.A1I(c2xe, this.A0N, this, c2xm);
        AbstractC25230BEn.A1I(c2xe, this.A0J, this, c2xm);
        AbstractC25230BEn.A1I(c2xe, this.A0D, this, c2xm);
        AbstractC25230BEn.A1I(c2xe, this.A0L, this, c2xm);
        AbstractC25230BEn.A1I(c2xe, this.A0M, this, c2xm);
        AbstractC25230BEn.A1I(c2xe, this.A0I, this, c2xm);
        AbstractC25230BEn.A1I(c2xe, this.A0F, this, c2xm);
    }

    @Override // X.AbstractC50792Va
    public final void A0r(C2XE c2xe, C2WI c2wi, C2Vj c2Vj, C2W6 c2w6, int i, int i2) {
        int i3;
        InputFilter[] inputFilterArr;
        int min;
        C26665Bq0 c26665Bq0 = (C26665Bq0) AbstractC25233BEq.A0M(c2xe);
        CharSequence charSequence = this.A0P;
        Drawable drawable = this.A09;
        ColorStateList colorStateList = this.A07;
        ColorStateList colorStateList2 = this.A06;
        Integer num = this.A0R;
        int i4 = this.A05;
        Typeface typeface = this.A08;
        int i5 = this.A04;
        int i6 = this.A00;
        boolean z = this.A0U;
        int i7 = this.A01;
        List list = this.A0S;
        boolean z2 = this.A0V;
        int i8 = this.A03;
        int i9 = this.A02;
        AtomicReference atomicReference = c26665Bq0.A02;
        InputFilter[] inputFilterArr2 = COG.A09;
        CharSequence charSequence2 = (CharSequence) atomicReference.get();
        Context context = c2xe.A0C;
        EditText editText = new EditText(context);
        if (charSequence2 instanceof Spannable) {
            charSequence2 = charSequence2.toString();
        }
        Drawable drawable2 = COG.A04;
        if (drawable == drawable2) {
            drawable = editText.getBackground();
        }
        if (drawable == drawable2) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(null, new int[]{R.attr.background}, R.attr.editTextStyle, 0);
            drawable = obtainStyledAttributes.getDrawable(0);
            obtainStyledAttributes.recycle();
        }
        MovementMethod movementMethod = editText.getMovementMethod();
        if (i4 == -1) {
            editText.setTextSize(2, 14.0f);
        } else {
            editText.setTextSize(0, i4);
        }
        if (z2) {
            i3 = i7 | 131073;
            editText.setMinLines(i8);
            editText.setMaxLines(i9);
        } else {
            i3 = i7 & (-131073);
            editText.setLines(1);
        }
        if (!z) {
            i3 = 0;
        }
        if (i3 != editText.getInputType()) {
            editText.setInputType(i3);
        }
        if (list != null) {
            inputFilterArr = (InputFilter[]) list.toArray(new InputFilter[list.size()]);
        } else {
            inputFilterArr = COG.A09;
        }
        editText.setFilters(inputFilterArr);
        editText.setHint(charSequence);
        editText.setBackground(drawable);
        if (drawable == null || !drawable.getPadding(COG.A02)) {
            editText.setPadding(0, 0, 0, 0);
        }
        editText.setShadowLayer(0.0f, 0.0f, 0.0f, -7829368);
        editText.setTypeface(typeface, 0);
        editText.setGravity(i6);
        editText.setImeOptions(0);
        editText.setFocusable(z);
        editText.setFocusableInTouchMode(z);
        editText.setLongClickable(z);
        editText.setCursorVisible(true);
        editText.setTextColor(colorStateList);
        editText.setHintTextColor(colorStateList2);
        if (num != null) {
            editText.setHighlightColor(num.intValue());
        }
        editText.setMovementMethod(movementMethod);
        editText.setError(null, null);
        editText.setEllipsize(null);
        editText.setTextAlignment(i5);
        if (charSequence2 != null && !C02O.A00(AbstractC167007dF.A0g(editText), charSequence2.toString())) {
            editText.setText(charSequence2);
        }
        editText.setImportantForAutofill(0);
        editText.setAutofillHints(null);
        editText.measure(AbstractC85943sO.A00(i), AbstractC85943sO.A00(i2));
        c2Vj.A00 = editText.getMeasuredHeight();
        if (View.MeasureSpec.getMode(i) == 0) {
            min = 0;
        } else {
            min = Math.min(View.MeasureSpec.getSize(i), editText.getMeasuredWidth());
        }
        c2Vj.A01 = min;
    }

    @Override // X.AbstractC50792Va
    public final void A0t(C2XE c2xe, C2WI c2wi, Object obj) {
        C2V9 c2v9;
        TextWatcher c28579CjK;
        BZ6 bz6 = (BZ6) obj;
        List list = this.A0T;
        InputFilter[] inputFilterArr = COG.A09;
        AbstractC50812Vc abstractC50812Vc = c2xe.A01;
        if (abstractC50812Vc == null) {
            c2v9 = null;
        } else {
            c2v9 = ((C26657Bps) abstractC50812Vc).A0B;
        }
        if (list != null && list.size() > 0) {
            if (list.size() == 1) {
                c28579CjK = (TextWatcher) AbstractC166987dD.A16(list);
            } else {
                c28579CjK = new C28579CjK(list);
            }
            bz6.A01 = c28579CjK;
            bz6.addTextChangedListener(c28579CjK);
        }
        bz6.setCustomSelectionActionModeCallback(null);
        bz6.setCustomInsertionActionModeCallback(null);
        bz6.A02 = c2xe;
        bz6.A03 = c2v9;
    }

    @Override // X.AbstractC50792Va
    public final void A0u(C2XE c2xe, C2WI c2wi, Object obj) {
        int i;
        InputFilter[] inputFilterArr;
        C26665Bq0 c26665Bq0 = (C26665Bq0) AbstractC25233BEq.A0M(c2xe);
        BZ6 bz6 = (BZ6) obj;
        CharSequence charSequence = this.A0P;
        Drawable drawable = this.A09;
        ColorStateList colorStateList = this.A07;
        ColorStateList colorStateList2 = this.A06;
        Integer num = this.A0R;
        int i2 = this.A05;
        Typeface typeface = this.A08;
        int i3 = this.A04;
        int i4 = this.A00;
        boolean z = this.A0U;
        int i5 = this.A01;
        List list = this.A0S;
        boolean z2 = this.A0V;
        int i6 = this.A03;
        int i7 = this.A02;
        MovementMethod movementMethod = this.A0A;
        AtomicReference atomicReference = c26665Bq0.A02;
        AtomicReference atomicReference2 = c26665Bq0.A01;
        InputFilter[] inputFilterArr2 = COG.A09;
        atomicReference2.set(bz6);
        if (drawable == COG.A04) {
            TypedArray obtainStyledAttributes = c2xe.A0C.obtainStyledAttributes(null, new int[]{R.attr.background}, R.attr.editTextStyle, 0);
            drawable = obtainStyledAttributes.getDrawable(0);
            obtainStyledAttributes.recycle();
        }
        CharSequence charSequence2 = (CharSequence) atomicReference.get();
        if (i2 == -1) {
            bz6.setTextSize(2, 14.0f);
        } else {
            bz6.setTextSize(0, i2);
        }
        if (z2) {
            i = i5 | 131073;
            bz6.setMinLines(i6);
            bz6.setMaxLines(i7);
        } else {
            i = i5 & (-131073);
            bz6.setLines(1);
        }
        if (!z) {
            i = 0;
        }
        if (i != bz6.getInputType()) {
            bz6.setInputType(i);
        }
        if (list != null) {
            inputFilterArr = (InputFilter[]) list.toArray(new InputFilter[list.size()]);
        } else {
            inputFilterArr = COG.A09;
        }
        bz6.setFilters(inputFilterArr);
        bz6.setHint(charSequence);
        bz6.setBackground(drawable);
        if (drawable == null || !drawable.getPadding(COG.A02)) {
            bz6.setPadding(0, 0, 0, 0);
        }
        bz6.setShadowLayer(0.0f, 0.0f, 0.0f, -7829368);
        bz6.setTypeface(typeface, 0);
        bz6.setGravity(i4);
        bz6.setImeOptions(0);
        bz6.setFocusable(z);
        bz6.setFocusableInTouchMode(z);
        bz6.setLongClickable(z);
        bz6.setCursorVisible(true);
        bz6.setTextColor(colorStateList);
        bz6.setHintTextColor(colorStateList2);
        if (num != null) {
            bz6.setHighlightColor(num.intValue());
        }
        bz6.setMovementMethod(movementMethod);
        bz6.setError(null, null);
        bz6.setEllipsize(null);
        bz6.setTextAlignment(i3);
        if (charSequence2 != null && !C02O.A00(AbstractC167007dF.A0g(bz6), charSequence2.toString())) {
            bz6.setText(charSequence2);
            bz6.setSelection(AbstractC167007dF.A0g(bz6).length());
        }
        bz6.setImportantForAutofill(0);
        bz6.setAutofillHints(null);
        bz6.A04 = atomicReference;
    }

    @Override // X.AbstractC50792Va
    public final void A0v(C2XE c2xe, C2WI c2wi, Object obj) {
        BZ6 bz6 = (BZ6) obj;
        InputFilter[] inputFilterArr = COG.A09;
        TextWatcher textWatcher = bz6.A01;
        if (textWatcher != null) {
            bz6.removeTextChangedListener(textWatcher);
            bz6.A01 = null;
        }
        bz6.A02 = null;
        bz6.A03 = null;
        bz6.setCustomSelectionActionModeCallback(null);
        bz6.setCustomInsertionActionModeCallback(null);
    }

    @Override // X.AbstractC50792Va
    public final void A0x(C2XE c2xe, AbstractC50922Vo abstractC50922Vo) {
        C26665Bq0 c26665Bq0 = (C26665Bq0) abstractC50922Vo;
        CharSequence charSequence = this.A0Q;
        InputFilter[] inputFilterArr = COG.A09;
        AtomicReference atomicReference = new AtomicReference();
        Integer A0p = AbstractC25227BEk.A0p();
        AtomicReference atomicReference2 = new AtomicReference(charSequence);
        c26665Bq0.A01 = atomicReference;
        c26665Bq0.A02 = atomicReference2;
        c26665Bq0.A00 = A0p;
    }

    @Override // X.AbstractC50812Vc
    public final /* bridge */ /* synthetic */ AbstractC50812Vc A0P() {
        return super.A0P();
    }

    @Override // X.AbstractC50812Vc
    public final Integer A0Q() {
        return C05F.A0C;
    }

    @Override // X.AbstractC50792Va
    public final void A0w(C2XE c2xe, C2WI c2wi, Object obj) {
        BZ6 bz6 = (BZ6) obj;
        AtomicReference atomicReference = ((C26665Bq0) AbstractC25233BEq.A0M(c2xe)).A01;
        InputFilter[] inputFilterArr = COG.A09;
        bz6.A04 = null;
        bz6.setPrivateImeOptions(null);
        atomicReference.set(null);
    }
}
