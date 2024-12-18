package com.instagram.maps.raster;

import X.AbstractC167007dF;
import X.AbstractC167017dG;
import X.C14360o3;
import X.C66356UBx;
import X.C69271Vkf;
import X.C70388WTq;
import X.ULU;
import X.W3L;
import X.W55;
import X.WWl;
import X.XC2;
import android.content.Context;
import android.util.AttributeSet;

/* loaded from: classes11.dex */
public final class IgRasterMapView extends C66356UBx implements XC2 {
    public ULU A00;
    public W55 A01;
    public C69271Vkf A02;
    public boolean A03;

    public void setMapReporterLauncher(W55 w55) {
        this.A01 = w55;
        ULU ulu = this.A00;
        if (ulu != null) {
            ulu.A01 = w55;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IgRasterMapView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        AbstractC167017dG.A1P(context, attributeSet);
        this.A03 = true;
        A0F(new C70388WTq(new WWl(this, 0), this));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IgRasterMapView(Context context, W3L w3l) {
        super(context, w3l);
        AbstractC167017dG.A1P(context, w3l);
        this.A03 = true;
        A0F(new C70388WTq(new WWl(this, 0), this));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IgRasterMapView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        AbstractC167007dF.A1D(context, 1, attributeSet);
        this.A03 = true;
        A0F(new C70388WTq(new WWl(this, 0), this));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IgRasterMapView(Context context) {
        super(context);
        C14360o3.A0B(context, 1);
        this.A03 = true;
        A0F(new C70388WTq(new WWl(this, 0), this));
    }
}
