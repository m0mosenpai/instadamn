package X;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.view.ActionMode;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.CheckedTextView;

/* loaded from: classes11.dex */
public class UBK extends CheckedTextView {
    public C3WJ A00;
    public final C3WT A01;
    public final C69613VsG A02;
    public final C3WU A03;

    private C3WJ getEmojiTextViewHelper() {
        C3WJ c3wj = this.A00;
        if (c3wj == null) {
            C3WJ c3wj2 = new C3WJ(this);
            this.A00 = c3wj2;
            return c3wj2;
        }
        return c3wj;
    }

    public ColorStateList getSupportBackgroundTintList() {
        C3WT c3wt = this.A01;
        if (c3wt != null) {
            return c3wt.A00();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C3WT c3wt = this.A01;
        if (c3wt != null) {
            return c3wt.A01();
        }
        return null;
    }

    public ColorStateList getSupportCheckMarkTintList() {
        C69613VsG c69613VsG = this.A02;
        if (c69613VsG != null) {
            return c69613VsG.A00;
        }
        return null;
    }

    public PorterDuff.Mode getSupportCheckMarkTintMode() {
        C69613VsG c69613VsG = this.A02;
        if (c69613VsG != null) {
            return c69613VsG.A01;
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        C69182VjB c69182VjB = this.A03.A08;
        if (c69182VjB != null) {
            return c69182VjB.A00;
        }
        return null;
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        C69182VjB c69182VjB = this.A03.A08;
        if (c69182VjB != null) {
            return c69182VjB.A01;
        }
        return null;
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C3WT c3wt = this.A01;
        if (c3wt != null) {
            c3wt.A05(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C3WT c3wt = this.A01;
        if (c3wt != null) {
            c3wt.A06(mode);
        }
    }

    public void setSupportCheckMarkTintList(ColorStateList colorStateList) {
        C69613VsG c69613VsG = this.A02;
        if (c69613VsG != null) {
            c69613VsG.A00 = colorStateList;
            c69613VsG.A02 = true;
            c69613VsG.A00();
        }
    }

    public void setSupportCheckMarkTintMode(PorterDuff.Mode mode) {
        C69613VsG c69613VsG = this.A02;
        if (c69613VsG != null) {
            c69613VsG.A01 = mode;
            c69613VsG.A03 = true;
            c69613VsG.A00();
        }
    }

    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        C3WU c3wu = this.A03;
        c3wu.A06(colorStateList);
        c3wu.A04();
    }

    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        C3WU c3wu = this.A03;
        c3wu.A07(mode);
        c3wu.A04();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0073 A[Catch: all -> 0x0099, TryCatch #1 {all -> 0x0099, blocks: (B:3:0x0045, B:5:0x004b, B:8:0x0051, B:9:0x006c, B:11:0x0073, B:12:0x007a, B:14:0x0081, B:21:0x0059, B:23:0x005f, B:25:0x0065), top: B:2:0x0045 }] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0081 A[Catch: all -> 0x0099, TRY_LEAVE, TryCatch #1 {all -> 0x0099, blocks: (B:3:0x0045, B:5:0x004b, B:8:0x0051, B:9:0x006c, B:11:0x0073, B:12:0x007a, B:14:0x0081, B:21:0x0059, B:23:0x005f, B:25:0x0065), top: B:2:0x0045 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public UBK(android.content.Context r11, android.util.AttributeSet r12) {
        /*
            r10 = this;
            r8 = 2130969023(0x7f0401bf, float:1.7546716E38)
            r11.getResources()
            r11.getResources()
            r5 = r12
            r10.<init>(r11, r12, r8)
            android.content.Context r0 = r10.getContext()
            X.C3WR.A03(r10, r0)
            X.3WU r0 = new X.3WU
            r0.<init>(r10)
            r10.A03 = r0
            r0.A08(r12, r8)
            r0.A04()
            X.3WT r0 = new X.3WT
            r0.<init>(r10)
            r10.A01 = r0
            r0.A07(r12, r8)
            X.VsG r0 = new X.VsG
            r0.<init>(r10)
            r10.A02 = r0
            android.widget.CheckedTextView r6 = r0.A05
            android.content.Context r3 = r6.getContext()
            int[] r7 = X.AbstractC53402cO.A0B
            r9 = 0
            X.2bu r2 = X.C53122bu.A00(r3, r12, r7, r8, r9)
            android.content.res.TypedArray r4 = r2.A02
            X.AbstractC010103p.A06(r3, r4, r5, r6, r7, r8, r9)
            r1 = 1
            boolean r0 = r4.hasValue(r1)     // Catch: java.lang.Throwable -> L99
            if (r0 == 0) goto L59
            int r0 = r4.getResourceId(r1, r9)     // Catch: java.lang.Throwable -> L99
            if (r0 == 0) goto L59
            android.graphics.drawable.Drawable r0 = X.C71x.A00(r3, r0)     // Catch: android.content.res.Resources.NotFoundException -> L59 java.lang.Throwable -> L99
            r6.setCheckMarkDrawable(r0)     // Catch: android.content.res.Resources.NotFoundException -> L59 java.lang.Throwable -> L99
            goto L6c
        L59:
            boolean r0 = r4.hasValue(r9)     // Catch: java.lang.Throwable -> L99
            if (r0 == 0) goto L6c
            int r0 = r4.getResourceId(r9, r9)     // Catch: java.lang.Throwable -> L99
            if (r0 == 0) goto L6c
            android.graphics.drawable.Drawable r0 = X.C71x.A00(r3, r0)     // Catch: java.lang.Throwable -> L99
            r6.setCheckMarkDrawable(r0)     // Catch: java.lang.Throwable -> L99
        L6c:
            r1 = 2
            boolean r0 = r4.hasValue(r1)     // Catch: java.lang.Throwable -> L99
            if (r0 == 0) goto L7a
            android.content.res.ColorStateList r0 = r2.A01(r1)     // Catch: java.lang.Throwable -> L99
            r6.setCheckMarkTintList(r0)     // Catch: java.lang.Throwable -> L99
        L7a:
            r1 = 3
            boolean r0 = r4.hasValue(r1)     // Catch: java.lang.Throwable -> L99
            if (r0 == 0) goto L8e
            r0 = -1
            int r1 = r4.getInt(r1, r0)     // Catch: java.lang.Throwable -> L99
            r0 = 0
            android.graphics.PorterDuff$Mode r0 = X.AbstractC55852hR.A00(r0, r1)     // Catch: java.lang.Throwable -> L99
            r6.setCheckMarkTintMode(r0)     // Catch: java.lang.Throwable -> L99
        L8e:
            r4.recycle()
            X.3WJ r0 = r10.getEmojiTextViewHelper()
            r0.A00(r12, r8)
            return
        L99:
            r0 = move-exception
            r4.recycle()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.UBK.<init>(android.content.Context, android.util.AttributeSet):void");
    }

    @Override // android.widget.CheckedTextView, android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        C3WU c3wu = this.A03;
        if (c3wu != null) {
            c3wu.A04();
        }
        C3WT c3wt = this.A01;
        if (c3wt != null) {
            c3wt.A02();
        }
        C69613VsG c69613VsG = this.A02;
        if (c69613VsG != null) {
            c69613VsG.A00();
        }
    }

    @Override // android.widget.TextView
    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        return super.getCustomSelectionActionModeCallback();
    }

    @Override // android.widget.TextView, android.view.View
    public final InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
        VKN.A00(this, editorInfo, onCreateInputConnection);
        return onCreateInputConnection;
    }

    @Override // android.widget.TextView
    public void setAllCaps(boolean z) {
        super.setAllCaps(z);
        getEmojiTextViewHelper().A01(z);
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C3WT c3wt = this.A01;
        if (c3wt != null) {
            c3wt.A03();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        C3WT c3wt = this.A01;
        if (c3wt != null) {
            c3wt.A04(i);
        }
    }

    @Override // android.widget.CheckedTextView
    public void setCheckMarkDrawable(Drawable drawable) {
        super.setCheckMarkDrawable(drawable);
        C69613VsG c69613VsG = this.A02;
        if (c69613VsG != null) {
            if (c69613VsG.A04) {
                c69613VsG.A04 = false;
            } else {
                c69613VsG.A04 = true;
                c69613VsG.A00();
            }
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        C3WU c3wu = this.A03;
        if (c3wu != null) {
            c3wu.A04();
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        C3WU c3wu = this.A03;
        if (c3wu != null) {
            c3wu.A04();
        }
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(callback);
    }

    public void setEmojiCompatEnabled(boolean z) {
        getEmojiTextViewHelper().A02(z);
    }

    @Override // android.widget.TextView
    public final void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        C3WU c3wu = this.A03;
        if (c3wu != null) {
            c3wu.A05(context, i);
        }
    }

    @Override // android.widget.CheckedTextView
    public void setCheckMarkDrawable(int i) {
        setCheckMarkDrawable(C71x.A00(getContext(), i));
    }
}
