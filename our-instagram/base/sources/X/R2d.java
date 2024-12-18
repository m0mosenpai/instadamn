package X;

import android.content.Context;
import android.graphics.Color;
import android.util.SparseArray;
import com.facebook.react.bridge.ReadableMap;

/* loaded from: classes10.dex */
public final class R2d extends AbstractC62966SZj {
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public ReadableMap A04;
    public boolean A05;
    public final R3M A06;
    public final C63347Si4 A07;

    public final void A06(ReadableMap readableMap) {
        if (readableMap != null) {
            this.A03 = readableMap.getInt("r");
            this.A02 = readableMap.getInt("g");
            this.A01 = readableMap.getInt("b");
            this.A00 = readableMap.getInt("a");
            this.A04 = readableMap.getMap("nativeColor");
            this.A05 = false;
            A00();
            return;
        }
        this.A03 = 0;
        this.A02 = 0;
        this.A01 = 0;
        this.A00 = 0;
        this.A04 = null;
        this.A05 = false;
    }

    private final void A00() {
        if (this.A04 != null && !this.A05) {
            Context A01 = this.A06.A01();
            if (A01 == null && (A01 = C62789SRj.A00(this)) == null) {
                return;
            }
            Integer A00 = C63233Sfl.A00(A01, this.A04);
            C63347Si4 c63347Si4 = this.A07;
            int i = this.A03;
            SparseArray sparseArray = c63347Si4.A05;
            R2f r2f = (R2f) ((AbstractC62966SZj) sparseArray.get(i));
            R2f r2f2 = (R2f) ((AbstractC62966SZj) sparseArray.get(this.A02));
            R2f r2f3 = (R2f) ((AbstractC62966SZj) sparseArray.get(this.A01));
            R2f r2f4 = (R2f) ((AbstractC62966SZj) sparseArray.get(this.A00));
            if (r2f != null) {
                C14360o3.A0A(A00);
                r2f.A00 = Color.red(A00.intValue());
            }
            if (r2f2 != null) {
                C14360o3.A0A(A00);
                r2f2.A00 = Color.green(A00.intValue());
            }
            if (r2f3 != null) {
                C14360o3.A0A(A00);
                r2f3.A00 = Color.blue(A00.intValue());
            }
            if (r2f4 != null) {
                C14360o3.A0A(A00);
                r2f4.A00 = Color.alpha(A00.intValue()) / 255.0d;
            }
            this.A05 = true;
        }
    }

    public R2d(C63347Si4 c63347Si4, R3M r3m, ReadableMap readableMap) {
        this.A07 = c63347Si4;
        this.A06 = r3m;
        A06(readableMap);
    }

    @Override // X.AbstractC62966SZj
    public final String A03() {
        StringBuilder A1C = AbstractC166987dD.A1C();
        AbstractC62966SZj.A02(this, "ColorAnimatedNode[", A1C);
        A1C.append("]: r: ");
        A1C.append(this.A03);
        A1C.append("  g: ");
        A1C.append(this.A02);
        A1C.append(" b: ");
        A1C.append(this.A01);
        A1C.append(" a: ");
        return AbstractC58318PtA.A0l(A1C, this.A00);
    }

    public final int A05() {
        double d;
        double d2;
        double d3;
        A00();
        C63347Si4 c63347Si4 = this.A07;
        int i = this.A03;
        SparseArray sparseArray = c63347Si4.A05;
        R2f r2f = (R2f) ((AbstractC62966SZj) sparseArray.get(i));
        R2f r2f2 = (R2f) ((AbstractC62966SZj) sparseArray.get(this.A02));
        R2f r2f3 = (R2f) ((AbstractC62966SZj) sparseArray.get(this.A01));
        R2f r2f4 = (R2f) ((AbstractC62966SZj) sparseArray.get(this.A00));
        double d4 = 0.0d;
        if (r2f != null) {
            d = r2f.A00;
        } else {
            d = 0.0d;
        }
        if (r2f2 != null) {
            d2 = r2f2.A00;
        } else {
            d2 = 0.0d;
        }
        if (r2f3 != null) {
            d3 = r2f3.A00;
        } else {
            d3 = 0.0d;
        }
        if (r2f4 != null) {
            d4 = r2f4.A00;
        }
        return (Math.max(0, Math.min(255, C1H4.A00(d))) << 16) | (Math.max(0, Math.min(255, C1H4.A00(d4 * 255.0d))) << 24) | (Math.max(0, Math.min(255, C1H4.A00(d2))) << 8) | Math.max(0, Math.min(255, C1H4.A00(d3)));
    }
}
