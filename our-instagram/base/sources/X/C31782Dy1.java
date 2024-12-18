package X;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.view.KeyEvent;
import android.view.accessibility.AccessibilityEvent;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import com.facebook.R;
import com.instagram.ui.widget.searchedittext.SearchWithDeleteEditText;

/* renamed from: X.Dy1, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C31782Dy1 extends C3WF implements InterfaceC37111GWw {
    public GYV A00;
    public boolean A01;
    public boolean A02;
    public final Runnable A03;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C31782Dy1(Context context) {
        super(context, null, R.attr.TokenTextViewPillStyle);
        C14360o3.A0B(context, 1);
        this.A03 = new RunnableC36872GMt(this);
        this.A02 = true;
        A00(AbstractC166997dE.A0L(this));
        A00(context);
    }

    private final void A00(Context context) {
        super.setClickable(true);
        super.setFocusable(true);
        super.setFocusableInTouchMode(true);
        super.setOnTouchListener(new ViewOnTouchListenerC35710Fpk(this, 5));
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(AbstractC55922hc.A2L);
        C14360o3.A07(obtainStyledAttributes);
        this.A02 = obtainStyledAttributes.getBoolean(0, true);
        obtainStyledAttributes.recycle();
    }

    @Override // android.widget.TextView, android.view.View
    public final boolean onCheckIsTextEditor() {
        return true;
    }

    @Override // X.C3WF, android.widget.TextView, android.view.View
    public final InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        C14360o3.A0B(editorInfo, 0);
        editorInfo.inputType = 0;
        return new C31763DxK(new C31762DxJ(this), this);
    }

    @Override // android.widget.TextView, android.view.View, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int i, KeyEvent keyEvent) {
        C14360o3.A0B(keyEvent, 1);
        GYV gyv = this.A00;
        if (gyv != null) {
            if (keyEvent.getKeyCode() == 67) {
                gyv.D9k(this);
            } else {
                C36473G6x c36473G6x = ((GI4) gyv).A00;
                C36473G6x.A01(c36473G6x);
                SearchWithDeleteEditText searchWithDeleteEditText = c36473G6x.A07;
                searchWithDeleteEditText.requestFocus();
                searchWithDeleteEditText.dispatchKeyEvent(keyEvent);
            }
        }
        return super.onKeyDown(i, keyEvent);
    }

    @Override // android.view.View
    public final void onPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        GYV gyv;
        C14360o3.A0B(accessibilityEvent, 0);
        if (accessibilityEvent.getEventType() == 1 && this.A01 && (gyv = this.A00) != null) {
            gyv.D9k(this);
        }
        super.onPopulateAccessibilityEvent(accessibilityEvent);
    }

    @Override // android.widget.TextView, android.view.View
    public final void onFocusChanged(boolean z, int i, Rect rect) {
        int A06 = C0f9.A06(252680800);
        super.onFocusChanged(z, i, rect);
        if (!isLayoutRequested()) {
            this.A03.run();
        }
        C0f9.A0D(-1681938911, A06);
    }

    public final void setOnDeleteKeyListener(GYV gyv) {
        this.A00 = gyv;
    }

    public final void setShouldShowX(boolean z) {
        this.A02 = z;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C31782Dy1(Context context, int i) {
        super(context, null, R.attr.TokenTextViewPillStyleRedesign);
        C14360o3.A0B(context, 1);
        this.A03 = new RunnableC36872GMt(this);
        this.A02 = true;
        A00(AbstractC166997dE.A0L(this));
        A00(context);
    }
}
