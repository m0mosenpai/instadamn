package X;

import android.content.res.TypedArray;
import android.text.method.KeyListener;
import android.text.method.NumberKeyListener;
import android.util.AttributeSet;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.EditText;
import java.util.concurrent.locks.ReadWriteLock;

/* loaded from: classes10.dex */
public final class SPY {
    public final EditText A00;
    public final SAC A01;

    public final KeyListener A00(KeyListener keyListener) {
        boolean z = keyListener instanceof NumberKeyListener;
        if (!z) {
            if (keyListener instanceof C63486So0) {
                return keyListener;
            }
            if (keyListener == null) {
                return null;
            }
            if (z) {
                return keyListener;
            }
            return new C63486So0(keyListener);
        }
        return keyListener;
    }

    public final InputConnection A01(EditorInfo editorInfo, InputConnection inputConnection) {
        SAC sac = this.A01;
        if (inputConnection == null) {
            return null;
        }
        C62893SVy c62893SVy = sac.A00;
        if (inputConnection instanceof Q4c) {
            return inputConnection;
        }
        return new Q4c(editorInfo, inputConnection, c62893SVy.A00);
    }

    public final void A02(AttributeSet attributeSet, int i) {
        TypedArray obtainStyledAttributes = this.A00.getContext().obtainStyledAttributes(attributeSet, AbstractC53402cO.A08, i, 0);
        try {
            boolean z = true;
            if (obtainStyledAttributes.hasValue(14)) {
                z = obtainStyledAttributes.getBoolean(14, true);
            }
            obtainStyledAttributes.recycle();
            A03(z);
        } catch (Throwable th) {
            obtainStyledAttributes.recycle();
            throw th;
        }
    }

    public final void A03(boolean z) {
        Snw snw = this.A01.A00.A01;
        if (snw.A01 != z) {
            if (snw.A00 != null) {
                C58341Ptc A00 = C58341Ptc.A00();
                AbstractC106884rp abstractC106884rp = snw.A00;
                C02R.A03(abstractC106884rp, "initCallback cannot be null");
                ReadWriteLock readWriteLock = A00.A06;
                readWriteLock.writeLock().lock();
                try {
                    A00.A05.remove(abstractC106884rp);
                } finally {
                    AbstractC58318PtA.A1Y(readWriteLock);
                }
            }
            snw.A01 = z;
            if (z) {
                Snw.A00(snw.A02, C58341Ptc.A00().A01());
            }
        }
    }

    public SPY(EditText editText) {
        this.A00 = editText;
        this.A01 = new SAC(editText);
    }
}
