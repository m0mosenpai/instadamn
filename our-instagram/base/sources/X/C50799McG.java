package X;

import android.view.animation.Animation;
import android.view.animation.Transformation;

/* renamed from: X.McG, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C50799McG extends Animation {
    public final /* synthetic */ float A00;
    public final /* synthetic */ float A01;
    public final /* synthetic */ float A02;
    public final /* synthetic */ float A03;
    public final /* synthetic */ C56302iJ A04;
    public final /* synthetic */ C56302iJ A05;
    public final /* synthetic */ C51380Mmf A06;

    public C50799McG(C56302iJ c56302iJ, C56302iJ c56302iJ2, C51380Mmf c51380Mmf, float f, float f2, float f3, float f4) {
        this.A05 = c56302iJ;
        this.A02 = f;
        this.A03 = f2;
        this.A04 = c56302iJ2;
        this.A01 = f3;
        this.A00 = f4;
        this.A06 = c51380Mmf;
    }

    @Override // android.view.animation.Animation
    public final void applyTransformation(float f, Transformation transformation) {
        C56302iJ c56302iJ = this.A05;
        float f2 = this.A02;
        c56302iJ.A02 = f2 + ((this.A03 - f2) * f);
        C56302iJ c56302iJ2 = this.A04;
        float f3 = this.A01;
        c56302iJ2.A02 = f3 + ((this.A00 - f3) * f);
        C51380Mmf c51380Mmf = this.A06;
        int i = C3OO.FLAG_ADAPTER_FULLUPDATE;
        AbstractC166987dD.A0d(c51380Mmf.A0C).setLayoutParams(c56302iJ);
        AbstractC166987dD.A0d(c51380Mmf.A0B).setLayoutParams(c56302iJ2);
    }
}
