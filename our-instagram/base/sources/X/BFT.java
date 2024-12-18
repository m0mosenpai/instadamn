package X;

import android.content.Context;
import android.graphics.Point;
import android.graphics.Rect;
import android.view.View;
import java.lang.ref.WeakReference;

/* loaded from: classes5.dex */
public final class BFT implements JI7, InterfaceC58972mv {
    public C4E5 A00;
    public final WeakReference A01;
    public final String A02;
    public final String A03;
    public final String A04;

    @Override // X.JI7
    public final InterfaceC58972mv BXB() {
        return this;
    }

    @Override // X.InterfaceC58972mv
    public final boolean CGl(Rect rect, Rect rect2, Rect rect3) {
        C14360o3.A0B(rect, 0);
        C14360o3.A0B(rect2, 1);
        C14360o3.A0B(rect3, 2);
        View view = (View) this.A01.get();
        if (view != null) {
            Point point = new Point();
            if (!view.isShown()) {
                rect.setEmpty();
                rect2.setEmpty();
            } else {
                if (view.getGlobalVisibleRect(rect, point) && rect.intersect(rect3)) {
                    int i = point.x;
                    rect2.set(i, point.y, i + view.getWidth(), point.y + view.getHeight());
                    return true;
                }
                rect2.setEmpty();
                rect.setEmpty();
                return false;
            }
        }
        return false;
    }

    @Override // X.InterfaceC58972mv
    public final Context getContext() {
        View view = (View) this.A01.get();
        if (view != null) {
            return view.getContext();
        }
        return null;
    }

    public BFT(View view, C4E5 c4e5, String str, String str2, String str3) {
        AbstractC167017dG.A1S(str2, str3);
        this.A00 = c4e5;
        this.A03 = str;
        this.A04 = str2;
        this.A02 = str3;
        this.A01 = AbstractC25225BEi.A16(view);
    }

    @Override // X.JI7
    public final String Aq2() {
        return this.A02;
    }

    @Override // X.JI7
    public final C4E5 Aq8() {
        return this.A00;
    }

    @Override // X.JI7
    public final String BAV() {
        return this.A02;
    }

    @Override // X.JI7
    public final String BSb() {
        return this.A03;
    }

    @Override // X.JI7
    public final String getModuleName() {
        return this.A04;
    }
}
