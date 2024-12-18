package X;

import android.text.Editable;
import android.text.SpannableStringBuilder;
import java.lang.reflect.Array;
import java.util.List;

/* renamed from: X.Q3y, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C58709Q3y extends SpannableStringBuilder {
    public final Class A00;
    public final List A01;

    private C63483Snx A00(Object obj) {
        int i = 0;
        while (true) {
            List list = this.A01;
            if (i < list.size()) {
                C63483Snx c63483Snx = (C63483Snx) list.get(i);
                if (c63483Snx.A00 != obj) {
                    i++;
                } else {
                    return c63483Snx;
                }
            } else {
                return null;
            }
        }
    }

    private void A01() {
        int i = 0;
        while (true) {
            List list = this.A01;
            if (i < list.size()) {
                ((C63483Snx) list.get(i)).A01.decrementAndGet();
                i++;
            } else {
                return;
            }
        }
    }

    public static void A02(C58709Q3y c58709Q3y) {
        int i = 0;
        while (true) {
            List list = c58709Q3y.A01;
            if (i < list.size()) {
                ((C63483Snx) list.get(i)).A01.incrementAndGet();
                i++;
            } else {
                return;
            }
        }
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spanned
    public final int getSpanEnd(Object obj) {
        C63483Snx A00;
        if (obj != null) {
            if (this.A00 == obj.getClass() && (A00 = A00(obj)) != null) {
                obj = A00;
            }
        }
        return super.getSpanEnd(obj);
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spanned
    public final int getSpanFlags(Object obj) {
        C63483Snx A00;
        if (obj != null) {
            if (this.A00 == obj.getClass() && (A00 = A00(obj)) != null) {
                obj = A00;
            }
        }
        return super.getSpanFlags(obj);
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spanned
    public final int getSpanStart(Object obj) {
        C63483Snx A00;
        if (obj != null) {
            if (this.A00 == obj.getClass() && (A00 = A00(obj)) != null) {
                obj = A00;
            }
        }
        return super.getSpanStart(obj);
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spanned
    public final Object[] getSpans(int i, int i2, Class cls) {
        if (this.A00 == cls) {
            C63483Snx[] c63483SnxArr = (C63483Snx[]) super.getSpans(i, i2, C63483Snx.class);
            int length = c63483SnxArr.length;
            Object[] objArr = (Object[]) Array.newInstance((Class<?>) cls, length);
            for (int i3 = 0; i3 < length; i3++) {
                objArr[i3] = c63483SnxArr[i3].A00;
            }
            return objArr;
        }
        return super.getSpans(i, i2, cls);
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spanned
    public final int nextSpanTransition(int i, int i2, Class cls) {
        if (this.A00 == cls) {
            cls = C63483Snx.class;
        }
        return super.nextSpanTransition(i, i2, cls);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0016  */
    @Override // android.text.SpannableStringBuilder, android.text.Spannable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void removeSpan(java.lang.Object r3) {
        /*
            r2 = this;
            if (r3 == 0) goto L1c
            java.lang.Class r1 = r3.getClass()
            java.lang.Class r0 = r2.A00
            if (r0 != r1) goto L1c
            X.Snx r1 = r2.A00(r3)
            if (r1 == 0) goto L11
            r3 = r1
        L11:
            super.removeSpan(r3)
            if (r1 == 0) goto L1b
            java.util.List r0 = r2.A01
            r0.remove(r1)
        L1b:
            return
        L1c:
            r1 = 0
            goto L11
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C58709Q3y.removeSpan(java.lang.Object):void");
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spannable
    public final void setSpan(Object obj, int i, int i2, int i3) {
        if (obj != null) {
            if (this.A00 == obj.getClass()) {
                C63483Snx c63483Snx = new C63483Snx(obj);
                this.A01.add(c63483Snx);
                obj = c63483Snx;
            }
        }
        super.setSpan(obj, i, i2, i3);
    }

    @Override // android.text.SpannableStringBuilder, java.lang.CharSequence
    public final CharSequence subSequence(int i, int i2) {
        return new C58709Q3y(this, this.A00, i, i2);
    }

    public C58709Q3y(CharSequence charSequence, Class cls) {
        super(charSequence);
        this.A01 = AbstractC166987dD.A1E();
        this.A00 = cls;
    }

    public final void A03() {
        A01();
        int i = 0;
        while (true) {
            List list = this.A01;
            if (i < list.size()) {
                ((C63483Snx) list.get(i)).onTextChanged(this, 0, length(), length());
                i++;
            } else {
                return;
            }
        }
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public final SpannableStringBuilder replace(int i, int i2, CharSequence charSequence) {
        A02(this);
        super.replace(i, i2, charSequence);
        A01();
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public final /* bridge */ /* synthetic */ Editable delete(int i, int i2) {
        delete(i, i2);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public final /* bridge */ /* synthetic */ Editable insert(int i, CharSequence charSequence) {
        insert(i, charSequence);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    public final SpannableStringBuilder append(char c) {
        super.append(c);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    public final SpannableStringBuilder append(CharSequence charSequence) {
        super.append(charSequence);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    public final /* bridge */ /* synthetic */ Editable append(char c) {
        append(c);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    public final /* bridge */ /* synthetic */ Editable append(CharSequence charSequence) {
        append(charSequence);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    public final /* bridge */ /* synthetic */ Appendable append(char c) {
        append(c);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    public final /* bridge */ /* synthetic */ Appendable append(CharSequence charSequence) {
        append(charSequence);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    public final /* bridge */ /* synthetic */ Editable append(CharSequence charSequence, int i, int i2) {
        append(charSequence, i, i2);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    public final /* bridge */ /* synthetic */ Appendable append(CharSequence charSequence, int i, int i2) {
        append(charSequence, i, i2);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    public final SpannableStringBuilder append(CharSequence charSequence, int i, int i2) {
        super.append(charSequence, i, i2);
        return this;
    }

    @Override // android.text.SpannableStringBuilder
    public final SpannableStringBuilder append(CharSequence charSequence, Object obj, int i) {
        super.append(charSequence, obj, i);
        return this;
    }

    public C58709Q3y(CharSequence charSequence, Class cls, int i, int i2) {
        super(charSequence, i, i2);
        this.A01 = AbstractC166987dD.A1E();
        C02R.A03(cls, "watcherClass cannot be null");
        this.A00 = cls;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public final SpannableStringBuilder delete(int i, int i2) {
        super.delete(i, i2);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public final /* bridge */ /* synthetic */ Editable insert(int i, CharSequence charSequence, int i2, int i3) {
        insert(i, charSequence, i2, i3);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public final /* bridge */ /* synthetic */ Editable replace(int i, int i2, CharSequence charSequence) {
        replace(i, i2, charSequence);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public final SpannableStringBuilder insert(int i, CharSequence charSequence, int i2, int i3) {
        super.insert(i, charSequence, i2, i3);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public final SpannableStringBuilder replace(int i, int i2, CharSequence charSequence, int i3, int i4) {
        A02(this);
        super.replace(i, i2, charSequence, i3, i4);
        A01();
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public final SpannableStringBuilder insert(int i, CharSequence charSequence) {
        super.insert(i, charSequence);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public final /* bridge */ /* synthetic */ Editable replace(int i, int i2, CharSequence charSequence, int i3, int i4) {
        replace(i, i2, charSequence, i3, i4);
        return this;
    }
}
