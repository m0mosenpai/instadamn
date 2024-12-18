package X;

import android.content.Context;
import android.database.DataSetObserver;
import android.text.TextUtils;
import android.util.AttributeSet;
import androidx.viewpager.widget.ViewPager;
import java.util.Locale;
import java.util.Map;

/* loaded from: classes11.dex */
public abstract class UKI extends ViewPager {
    public DataSetObserver A00;
    public boolean A01;
    public final Map A02;

    private void setCurrentItemWithoutNotification(int i) {
        this.A01 = true;
        A0I(i, false);
        this.A01 = false;
    }

    private int A00(int i) {
        if (i >= 0 && TextUtils.getLayoutDirectionFromLocale(Locale.getDefault()) == 1) {
            if (getAdapter() == null) {
                return 0;
            }
            return (r0.getCount() - i) - 1;
        }
        return i;
    }

    @Override // androidx.viewpager.widget.ViewPager
    public AbstractC021208i getAdapter() {
        AbstractC021208i abstractC021208i = this.A08;
        if (abstractC021208i instanceof X2D) {
            return ((UKH) abstractC021208i).A01;
        }
        return abstractC021208i;
    }

    @Override // androidx.viewpager.widget.ViewPager
    public int getCurrentItem() {
        return A00(super.A02);
    }

    @Override // androidx.viewpager.widget.ViewPager
    public void setAdapter(AbstractC021208i abstractC021208i) {
        boolean z;
        DataSetObserver dataSetObserver;
        AbstractC021208i abstractC021208i2 = this.A08;
        if ((abstractC021208i2 instanceof X2D) && (dataSetObserver = this.A00) != null) {
            abstractC021208i2.unregisterDataSetObserver(dataSetObserver);
            this.A00 = null;
        }
        if (abstractC021208i != null && TextUtils.getLayoutDirectionFromLocale(Locale.getDefault()) == 1) {
            z = true;
            X2D x2d = new X2D(abstractC021208i, this);
            if (this.A00 == null) {
                U8C u8c = new U8C(x2d);
                this.A00 = u8c;
                x2d.registerDataSetObserver(u8c);
            }
            abstractC021208i = x2d;
        } else {
            z = false;
        }
        super.setAdapter(abstractC021208i);
        if (z) {
            setCurrentItemWithoutNotification(0);
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [X.01p, java.util.Map] */
    public UKI(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.A02 = new C005001p(1);
    }

    @Override // androidx.viewpager.widget.ViewPager
    public final void A0I(int i, boolean z) {
        super.A0I(A00(i), z);
    }

    @Override // androidx.viewpager.widget.ViewPager, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        int A06 = C0f9.A06(-1090516285);
        super.onAttachedToWindow();
        AbstractC021208i abstractC021208i = this.A08;
        if ((abstractC021208i instanceof X2D) && this.A00 == null) {
            U8C u8c = new U8C((X2D) abstractC021208i);
            this.A00 = u8c;
            abstractC021208i.registerDataSetObserver(u8c);
        }
        C0f9.A0D(1486287263, A06);
    }

    @Override // androidx.viewpager.widget.ViewPager, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        DataSetObserver dataSetObserver;
        int A06 = C0f9.A06(1732774538);
        AbstractC021208i abstractC021208i = this.A08;
        if ((abstractC021208i instanceof X2D) && (dataSetObserver = this.A00) != null) {
            abstractC021208i.unregisterDataSetObserver(dataSetObserver);
            this.A00 = null;
        }
        super.onDetachedFromWindow();
        C0f9.A0D(477393206, A06);
    }

    @Override // androidx.viewpager.widget.ViewPager
    public void setCurrentItem(int i) {
        super.setCurrentItem(A00(i));
    }

    @Override // androidx.viewpager.widget.ViewPager
    public void setOnPageChangeListener(InterfaceC021908q interfaceC021908q) {
        if (TextUtils.getLayoutDirectionFromLocale(Locale.getDefault()) == 1) {
            WTC wtc = new WTC(interfaceC021908q, this);
            this.A02.put(interfaceC021908q, wtc);
            interfaceC021908q = wtc;
        }
        this.A09 = interfaceC021908q;
    }
}
