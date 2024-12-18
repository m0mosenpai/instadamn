package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.hardware.Sensor;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.os.Handler;
import com.instagram.ui.widget.interactive.InteractiveDrawableContainer;

/* renamed from: X.AnY, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C24149AnY implements InterfaceC1829489p {
    public float A00;
    public float A01;
    public int A02;
    public int A03;
    public C202478xR A04;
    public BEd A05;
    public boolean A06;
    public final InteractiveDrawableContainer A07;
    public final int A08;
    public final int A09;
    public final Context A0A;
    public final Sensor A0B;
    public final SensorEventListener A0C;
    public final SensorManager A0D;
    public final Handler A0E;

    public C24149AnY(InteractiveDrawableContainer interactiveDrawableContainer) {
        SensorManager sensorManager;
        this.A07 = interactiveDrawableContainer;
        Context A0L = AbstractC166997dE.A0L(interactiveDrawableContainer);
        this.A0A = A0L;
        this.A09 = interactiveDrawableContainer.getWidth();
        this.A08 = interactiveDrawableContainer.getHeight();
        this.A0E = AbstractC167007dF.A0J();
        Object systemService = A0L.getSystemService("sensor");
        if (systemService instanceof SensorManager) {
            sensorManager = (SensorManager) systemService;
        } else {
            sensorManager = null;
        }
        this.A0D = sensorManager;
        this.A0B = sensorManager != null ? sensorManager.getDefaultSensor(1) : null;
        this.A0C = new WIO(this, 2);
    }

    public final void A01() {
        this.A04 = null;
        this.A05 = null;
        this.A03 = 0;
        this.A02 = 0;
        this.A00 = 0.0f;
        this.A06 = false;
        this.A01 = 0.0f;
        SensorManager sensorManager = this.A0D;
        if (sensorManager != null) {
            C0fX.A00(this.A0C, sensorManager);
        }
        this.A07.A0w(this);
        this.A0E.removeCallbacksAndMessages(null);
    }

    @Override // X.InterfaceC1829489p
    public final void Cud(Drawable drawable) {
        C14360o3.A0B(drawable, 0);
        if (drawable instanceof C202478xR) {
            this.A06 = true;
        }
    }

    @Override // X.InterfaceC1829489p
    public final void Cuq() {
        this.A06 = false;
    }

    @Override // X.InterfaceC1829489p
    public final /* synthetic */ void Cur() {
    }

    @Override // X.InterfaceC1829489p
    public final void Cvp(Drawable drawable, int i) {
        C14360o3.A0B(drawable, 1);
        if (drawable instanceof C202478xR) {
            C202478xR c202478xR = (C202478xR) drawable;
            this.A04 = c202478xR;
            this.A05 = this.A07.A0N(i);
            int i2 = c202478xR.A01;
            this.A03 = i2;
            this.A02 = i2;
            SensorManager sensorManager = this.A0D;
            if (sensorManager != null) {
                C0fX.A01(this.A0B, this.A0C, sensorManager, 3);
            }
            A00(this);
        }
    }

    @Override // X.InterfaceC1829489p
    public final /* synthetic */ void DCJ(Drawable drawable, int i) {
    }

    @Override // X.InterfaceC1829489p
    public final /* synthetic */ void DCK(float f, float f2) {
    }

    @Override // X.InterfaceC1829489p
    public final /* synthetic */ void DCL(Drawable drawable) {
    }

    @Override // X.InterfaceC1829489p
    public final /* synthetic */ void DQa(Drawable drawable, int i, float f, float f2) {
    }

    @Override // X.InterfaceC1829489p
    public final /* synthetic */ void DQk() {
    }

    @Override // X.InterfaceC1829489p
    public final void Dep(Drawable drawable, int i, boolean z) {
        C14360o3.A0B(drawable, 1);
        if (drawable instanceof C202478xR) {
            A01();
        }
    }

    @Override // X.InterfaceC1829489p
    public final /* synthetic */ void Din(Drawable drawable, float f, float f2, float f3, float f4) {
    }

    @Override // X.InterfaceC1829489p
    public final /* synthetic */ void Dmk(Drawable drawable, int i, float f, float f2) {
    }

    @Override // X.InterfaceC1829489p
    public final /* synthetic */ void Dmm(Drawable drawable, float f, float f2, float f3, float f4, int i) {
    }

    @Override // X.InterfaceC1829489p
    public final /* synthetic */ void DuD() {
    }

    /* JADX WARN: Removed duplicated region for block: B:62:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0117  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x011c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void A00(X.C24149AnY r14) {
        /*
            Method dump skipped, instructions count: 319
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C24149AnY.A00(X.AnY):void");
    }
}
