package com.instagram.common.ui.widget.recyclerview;

import X.C0f9;
import X.C3F5;
import X.C70593Ew;
import android.content.Context;
import android.util.AttributeSet;
import androidx.recyclerview.widget.LinearLayoutManager;

/* loaded from: classes2.dex */
public class LinearLayoutManagerCompat extends LinearLayoutManager {
    public int A00;
    public int A01;
    public boolean A02;

    @Override // androidx.recyclerview.widget.LinearLayoutManager, X.AbstractC70663Fe
    public final int A1L(C70593Ew c70593Ew, C3F5 c3f5, int i) {
        this.A00 = -1;
        this.A01 = -1;
        return super.A1L(c70593Ew, c3f5, i);
    }

    public LinearLayoutManagerCompat(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.A00 = -1;
        this.A01 = -1;
        this.A02 = false;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, X.AbstractC70663Fe
    public void A1R(C70593Ew c70593Ew, C3F5 c3f5) {
        int A03 = C0f9.A03(1132530470);
        this.A00 = -1;
        this.A01 = -1;
        super.A1R(c70593Ew, c3f5);
        C0f9.A0A(-1557554311, A03);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public final int A1a() {
        int i;
        int i2;
        int A03 = C0f9.A03(-1136396328);
        if (!this.A02) {
            i = super.A1a();
            i2 = 1558381145;
        } else {
            i = this.A00;
            if (i == -1) {
                i = super.A1a();
                this.A00 = i;
            }
            i2 = -792683111;
        }
        C0f9.A0A(i2, A03);
        return i;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public final int A1b() {
        int i;
        int i2;
        int A03 = C0f9.A03(-489409562);
        if (!this.A02) {
            i = super.A1b();
            i2 = -567197391;
        } else {
            i = this.A01;
            if (i == -1) {
                i = super.A1b();
                this.A01 = i;
            }
            i2 = 1158809412;
        }
        C0f9.A0A(i2, A03);
        return i;
    }

    public LinearLayoutManagerCompat(Context context) {
        super(context);
        this.A00 = -1;
        this.A01 = -1;
        this.A02 = false;
    }
}
