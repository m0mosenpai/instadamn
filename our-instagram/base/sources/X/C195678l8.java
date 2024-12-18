package X;

import android.view.View;
import android.view.ViewGroup;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: X.8l8, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C195678l8 implements InterfaceC195688l9 {
    public int A00;
    public final AbstractC195668l7 A01;
    public final List A02 = new ArrayList();
    public final InterfaceC195558kv A03;
    public final InterfaceC195538kt A04;

    private final void A00() {
        this.A00 = 0;
        List list = this.A02;
        list.clear();
        int Bph = this.A04.Bph();
        for (int i = 0; i < Bph; i++) {
            list.add(Integer.valueOf(this.A00));
            this.A00 += this.A03.BDU(i);
        }
    }

    @Override // X.InterfaceC195688l9
    public final int BYc(int i, float f) {
        int i2 = (int) (f * this.A00);
        List list = this.A02;
        int size = list.size() - 1;
        if (i > size) {
            i = size;
        }
        if (i < 0) {
            return 0;
        }
        return ((Number) list.get(i)).intValue() - i2;
    }

    @Override // X.InterfaceC195688l9
    public final int Bpj(float f) {
        int binarySearch = Collections.binarySearch(this.A02, Integer.valueOf((int) (f * this.A00)));
        if (binarySearch < 0) {
            binarySearch ^= -1;
        }
        int i = binarySearch - 1;
        if (i < 0) {
            return 0;
        }
        return i;
    }

    @Override // X.InterfaceC195688l9
    public final float Br1(int i) {
        View childAt = this.A01.A00.getChildAt(0);
        C14360o3.A07(childAt);
        int i2 = -childAt.getTop();
        int size = this.A02.size() - 1;
        if (i > size) {
            i = size;
        }
        if (i < 0) {
            return 0.0f;
        }
        return AbstractC13600mm.A00(BigDecimal.valueOf((((Number) r1.get(i)).intValue() + i2) / (this.A00 - r4.getHeight())).setScale(5, RoundingMode.HALF_UP).floatValue(), 0.0f, 1.0f);
    }

    @Override // X.InterfaceC195688l9
    public final int Brk(float f) {
        int binarySearch = Collections.binarySearch(this.A02, Integer.valueOf((int) (f * this.A00)));
        if (binarySearch < 0) {
            binarySearch ^= -1;
        }
        int i = binarySearch - 1;
        if (i < 0) {
            return 0;
        }
        return i;
    }

    @Override // X.InterfaceC195688l9
    public final boolean CcU() {
        int i = this.A00;
        ViewGroup viewGroup = this.A01.A00;
        if (i > viewGroup.getHeight() && viewGroup.getChildCount() > 0) {
            return true;
        }
        return false;
    }

    public C195678l8(InterfaceC195558kv interfaceC195558kv, AbstractC195668l7 abstractC195668l7, InterfaceC195538kt interfaceC195538kt) {
        this.A01 = abstractC195668l7;
        this.A04 = interfaceC195538kt;
        this.A03 = interfaceC195558kv;
        A00();
    }

    @Override // X.InterfaceC195688l9
    public final void DPF() {
        A00();
    }
}
