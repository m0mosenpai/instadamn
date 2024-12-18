package X;

import android.content.Context;
import androidx.appcompat.widget.AppCompatSeekBar;

/* renamed from: X.UDb, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C66362UDb extends AppCompatSeekBar {
    public double A00;
    public double A01;
    public double A02;
    public double A03;
    public double A04;

    public C66362UDb(Context context) {
        super(context, null, 16842875);
        this.A01 = 0.0d;
        this.A00 = 0.0d;
        this.A02 = 0.0d;
        this.A03 = 0.0d;
        this.A04 = 0.0d;
    }

    private void A00() {
        if (this.A03 == 0.0d) {
            this.A04 = (this.A00 - this.A01) / 128.0d;
        }
        setMax(getTotalSteps());
        double d = this.A02;
        double d2 = this.A01;
        setProgress((int) Math.round(((d - d2) / (this.A00 - d2)) * getTotalSteps()));
    }

    private double getStepValue() {
        double d = this.A03;
        if (d <= 0.0d) {
            return this.A04;
        }
        return d;
    }

    private int getTotalSteps() {
        return (int) Math.ceil((this.A00 - this.A01) / getStepValue());
    }

    public void setMaxValue(double d) {
        this.A00 = d;
        A00();
    }

    public void setMinValue(double d) {
        this.A01 = d;
        A00();
    }

    public void setStep(double d) {
        this.A03 = d;
        A00();
    }

    public void setValue(double d) {
        this.A02 = d;
        double d2 = this.A01;
        setProgress((int) Math.round(((d - d2) / (this.A00 - d2)) * getTotalSteps()));
    }

    public final double A01(int i) {
        if (i == getMax()) {
            return this.A00;
        }
        return (i * getStepValue()) + this.A01;
    }
}
