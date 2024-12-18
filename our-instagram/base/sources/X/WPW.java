package X;

import android.content.Context;
import android.content.res.TypedArray;
import android.database.DataSetObserver;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Handler;
import android.util.AttributeSet;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import android.widget.PopupWindow;
import java.lang.reflect.Method;

/* loaded from: classes11.dex */
public class WPW implements XDX {
    public static Method A0N;
    public static Method A0O;
    public int A01;
    public int A02;
    public Context A04;
    public Rect A05;
    public View A06;
    public AdapterView.OnItemClickListener A07;
    public ListAdapter A08;
    public PopupWindow A09;
    public C66360UCh A0A;
    public Runnable A0B;
    public boolean A0C;
    public boolean A0D;
    public boolean A0E;
    public boolean A0F;
    public DataSetObserver A0G;
    public final Handler A0I;
    public int A03 = -2;
    public int A00 = 0;
    public final RunnableC71213Wq4 A0K = new RunnableC71213Wq4(this);
    public final ViewOnTouchListenerC70248WNs A0M = new ViewOnTouchListenerC70248WNs(this);
    public final C70255WOa A0J = new C70255WOa(this);
    public final RunnableC71212Wq3 A0L = new RunnableC71212Wq3(this);
    public final Rect A0H = new Rect();

    static {
        if (Build.VERSION.SDK_INT <= 28) {
            try {
                A0N = PopupWindow.class.getDeclaredMethod("setClipToScreenEnabled", Boolean.TYPE);
            } catch (NoSuchMethodException unused) {
            }
            try {
                A0O = PopupWindow.class.getDeclaredMethod("setEpicenterBounds", Rect.class);
            } catch (NoSuchMethodException unused2) {
            }
        }
    }

    public final void A00(int i) {
        Drawable background = this.A09.getBackground();
        if (background != null) {
            Rect rect = this.A0H;
            background.getPadding(rect);
            this.A03 = rect.left + rect.right + i;
            return;
        }
        this.A03 = i;
    }

    public final Drawable Aes() {
        return this.A09.getBackground();
    }

    public final int BEJ() {
        return this.A01;
    }

    @Override // X.XDX
    public final C66360UCh BNm() {
        return this.A0A;
    }

    public final int CEs() {
        if (!this.A0C) {
            return 0;
        }
        return this.A02;
    }

    @Override // X.XDX
    public final boolean CdI() {
        return this.A09.isShowing();
    }

    public void EPH(ListAdapter listAdapter) {
        DataSetObserver dataSetObserver = this.A0G;
        if (dataSetObserver == null) {
            this.A0G = new U8D(this);
        } else {
            ListAdapter listAdapter2 = this.A08;
            if (listAdapter2 != null) {
                listAdapter2.unregisterDataSetObserver(dataSetObserver);
            }
        }
        this.A08 = listAdapter;
        if (listAdapter != null) {
            listAdapter.registerDataSetObserver(this.A0G);
        }
        C66360UCh c66360UCh = this.A0A;
        if (c66360UCh != null) {
            c66360UCh.setAdapter(this.A08);
        }
    }

    public final void EQC(Drawable drawable) {
        this.A09.setBackgroundDrawable(drawable);
    }

    public final void Egm(int i) {
        this.A02 = i;
        this.A0C = true;
    }

    @Override // X.XDX
    public final void dismiss() {
        PopupWindow popupWindow = this.A09;
        popupWindow.dismiss();
        popupWindow.setContentView(null);
        this.A0A = null;
        this.A0I.removeCallbacks(this.A0K);
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0086, code lost:
    
        if (r2 != (-1)) goto L20;
     */
    @Override // X.XDX
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void show() {
        /*
            Method dump skipped, instructions count: 401
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.WPW.show():void");
    }

    public WPW(Context context, AttributeSet attributeSet, int i, int i2) {
        this.A04 = context;
        this.A0I = new Handler(context.getMainLooper());
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC53402cO.A0E, i, i2);
        this.A01 = obtainStyledAttributes.getDimensionPixelOffset(0, 0);
        int dimensionPixelOffset = obtainStyledAttributes.getDimensionPixelOffset(1, 0);
        this.A02 = dimensionPixelOffset;
        if (dimensionPixelOffset != 0) {
            this.A0C = true;
        }
        obtainStyledAttributes.recycle();
        PopupWindow popupWindow = new PopupWindow(context, attributeSet, i, i2);
        C53122bu A00 = C53122bu.A00(context, attributeSet, AbstractC53402cO.A0I, i, i2);
        TypedArray typedArray = A00.A02;
        if (typedArray.hasValue(2)) {
            popupWindow.setOverlapAnchor(typedArray.getBoolean(2, false));
        }
        popupWindow.setBackgroundDrawable(A00.A02(0));
        typedArray.recycle();
        this.A09 = popupWindow;
        popupWindow.setInputMethodMode(1);
    }

    public final void EVp(int i) {
        this.A01 = i;
    }
}
