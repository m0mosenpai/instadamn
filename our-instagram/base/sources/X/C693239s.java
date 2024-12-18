package X;

import android.content.Context;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.text.Editable;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.method.KeyListener;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.EditText;
import com.facebook.ui.emoji.FacebookTypefaceEmojiSpan;

/* renamed from: X.39s, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C693239s implements InterfaceC693339t {
    public final boolean A01(Spannable spannable, int i, int i2, int i3) {
        boolean z = false;
        while (i2 < i3) {
            C46y c46y = C46x.A00;
            if (c46y != null) {
                int i4 = -1;
                int i5 = i2;
                while (true) {
                    i5 = c46y.A02(spannable, c46y.A01, 0, c46y.A00, i5, i3);
                    if (i5 < 0) {
                        break;
                    }
                    i4 = i5;
                }
                if (i4 != -1) {
                    FacebookTypefaceEmojiSpan facebookTypefaceEmojiSpan = new FacebookTypefaceEmojiSpan(AnonymousClass561.A00);
                    if (i4 <= i) {
                        spannable.setSpan(facebookTypefaceEmojiSpan, i2, i4, 33);
                        z = true;
                    }
                    i2 = i4;
                }
            }
            i2++;
        }
        return z;
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0011, code lost:
    
        if (A01(r11, r6, 0, r6) == false) goto L6;
     */
    @Override // X.InterfaceC693339t
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean A8N(android.text.Spannable r11, int r12) {
        /*
            r10 = this;
            r7 = 0
            int r6 = r11.length()
            boolean r0 = A00(r11, r7, r6)
            r9 = 1
            if (r0 == 0) goto L13
            boolean r0 = r10.A01(r11, r6, r7, r6)
            r8 = 1
            if (r0 != 0) goto L14
        L13:
            r8 = 0
        L14:
            r1 = 0
        L15:
            r3 = 1
        L16:
            if (r1 >= r6) goto L75
            int r2 = java.lang.Character.codePointAt(r11, r1)
            boolean r0 = java.lang.Character.isWhitespace(r2)
            if (r0 == 0) goto L28
            int r0 = java.lang.Character.charCount(r2)
            int r1 = r1 + r0
            goto L15
        L28:
            if (r3 != 0) goto L30
            int r0 = java.lang.Character.charCount(r2)
            int r1 = r1 + r0
            goto L16
        L30:
            X.46y r0 = X.C6RI.A00
            int r5 = r0.A01(r11, r1, r6)
            if (r5 > r1) goto L3f
            int r0 = java.lang.Character.charCount(r2)
            int r1 = r1 + r0
        L3d:
            r3 = 0
            goto L16
        L3f:
            if (r5 >= r6) goto L51
            int r4 = java.lang.Character.codePointAt(r11, r5)
        L45:
            boolean r0 = java.lang.Character.isWhitespace(r4)
            if (r0 != 0) goto L54
            int r1 = java.lang.Character.charCount(r4)
            int r1 = r1 + r5
            goto L3d
        L51:
            r4 = 32
            goto L45
        L54:
            X.0kz r3 = com.facebook.ui.emoji.model.Emoji.A00
            java.lang.Object r2 = r3.A7H()
            char[] r2 = (char[]) r2
            if (r2 != 0) goto L62
            r0 = 19
            char[] r2 = new char[r0]
        L62:
            android.text.TextUtils.getChars(r11, r1, r5, r2, r7)
            int r1 = r5 - r1
            java.lang.String r0 = new java.lang.String
            r0.<init>(r2, r7, r1)
            r3.EE6(r2)
            int r1 = java.lang.Character.charCount(r4)
            int r1 = r1 + r5
            goto L15
        L75:
            if (r8 != 0) goto L78
            r9 = 0
        L78:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C693239s.A8N(android.text.Spannable, int):boolean");
    }

    @Override // X.InterfaceC693339t
    public final boolean A8P(Spannable spannable, int i, boolean z) {
        int length = spannable.length();
        if (A00(spannable, 0, length) && A01(spannable, length, 0, length)) {
            return true;
        }
        return false;
    }

    @Override // X.InterfaceC693339t
    public final CharSequence Cny(int i, CharSequence charSequence) {
        if ((charSequence instanceof Spannable) && !(charSequence instanceof Editable)) {
            Spannable spannable = (Spannable) charSequence;
            int length = spannable.length();
            if (A00(spannable, 0, length)) {
                A01(spannable, length, 0, length);
            }
        } else {
            int length2 = charSequence.length();
            if (A00(charSequence, 0, length2)) {
                SpannableString spannableString = new SpannableString(charSequence);
                if (spannableString.length() != length2) {
                    C0K8.A0B(C693239s.class, "Background modification: %d -> %d", Integer.valueOf(length2), Integer.valueOf(spannableString.length()));
                    length2 = spannableString.length();
                }
                A01(spannableString, length2, 0, length2);
                return spannableString;
            }
        }
        return charSequence;
    }

    @Override // X.InterfaceC693339t
    public final Typeface B7d(String str) {
        C46y c46y = C46x.A00;
        if (c46y != null) {
            int length = str.length();
            if (c46y.A01(str, 0, length) == length) {
                return AnonymousClass561.A00;
            }
            return null;
        }
        return null;
    }

    @Override // X.InterfaceC693339t
    public final boolean CTj() {
        C46y c46y = C46x.A00;
        boolean z = false;
        if (c46y == null) {
            z = true;
        }
        if (z || (c46y != null && AnonymousClass561.A00 != null)) {
            return true;
        }
        return false;
    }

    public static boolean A00(CharSequence charSequence, int i, int i2) {
        int i3;
        int length = charSequence.length();
        if (i2 > length) {
            C0K8.A0Q("TypefaceEmojiUtilBase", "Invalid start: %d and stop value: %d passed for text: %s", Integer.valueOf(i), Integer.valueOf(i2), charSequence);
        }
        if (i2 > length) {
            i2 = length;
        }
        while (i < i2) {
            int codePointAt = Character.codePointAt(charSequence, i);
            if (codePointAt >= 169) {
                if (codePointAt < 8252) {
                    if (codePointAt == 169 || codePointAt == 174) {
                        return true;
                    }
                } else {
                    if (codePointAt < 126980) {
                        i3 = 12953;
                    } else {
                        i3 = 983042;
                        if (codePointAt < 983040) {
                            i3 = 129791;
                        }
                    }
                    if (codePointAt <= i3) {
                        return true;
                    }
                }
            }
            i += Character.charCount(codePointAt);
        }
        return false;
    }

    @Override // X.InterfaceC693339t
    public final boolean A8O(Spannable spannable, int i, int i2, int i3) {
        int length = spannable.length();
        int i4 = i3 + i2;
        if (i3 == -1) {
            i4 = length;
        }
        if (A00(spannable, i2, i4) && A01(spannable, length, i2, i4)) {
            return true;
        }
        return false;
    }

    @Override // X.InterfaceC693339t
    public final InputConnection AMO(EditorInfo editorInfo, InputConnection inputConnection, EditText editText) {
        if (CTj()) {
            editText.addTextChangedListener(new C140266We(this));
        }
        return inputConnection;
    }

    @Override // X.InterfaceC693339t
    public final KeyListener AMS(KeyListener keyListener, EditText editText) {
        if (CTj()) {
            editText.addTextChangedListener(new C140266We(this));
        }
        return keyListener;
    }

    @Override // X.InterfaceC693339t
    public final Drawable B1H(String str, int i) {
        Typeface typeface = null;
        if (!AbstractC168797gD.A02(str)) {
            return null;
        }
        int length = str.length();
        C46y c46y = C46x.A00;
        if (c46y != null && c46y.A01(str, 0, length) == length) {
            typeface = AnonymousClass561.A00;
        }
        return new Q2J(typeface, str, i);
    }

    @Override // X.InterfaceC693339t
    public final void CNc(Context context, AbstractC12990ll abstractC12990ll, int i) {
        AnonymousClass561.A00(context);
    }
}
