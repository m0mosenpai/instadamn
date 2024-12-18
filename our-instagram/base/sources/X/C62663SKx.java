package X;

import android.graphics.Typeface;
import android.os.Handler;

/* renamed from: X.SKx, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C62663SKx {
    public final Handler A00;
    public final AbstractC2051896j A01;

    public final void A00(C62891SVw c62891SVw) {
        Handler handler;
        Runnable tpl;
        int i = c62891SVw.A00;
        if (i == 0) {
            Typeface typeface = c62891SVw.A01;
            AbstractC2051896j abstractC2051896j = this.A01;
            handler = this.A00;
            tpl = new TPK(typeface, this, abstractC2051896j);
        } else {
            AbstractC2051896j abstractC2051896j2 = this.A01;
            handler = this.A00;
            tpl = new TPL(this, abstractC2051896j2, i);
        }
        handler.post(tpl);
    }

    public C62663SKx(Handler handler, AbstractC2051896j abstractC2051896j) {
        this.A01 = abstractC2051896j;
        this.A00 = handler;
    }
}
