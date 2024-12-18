package X;

import android.os.SystemClock;
import com.facebook.quicklog.MarkerEditor;
import com.facebook.quicklog.PointEditor;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

/* renamed from: X.0kE, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C12100kE extends MarkerEditor implements PointEditor {
    public final int A00;
    public final int A01;
    public final ArrayList A02 = new ArrayList();
    public final C0k1 A03;

    @Override // com.facebook.quicklog.MarkerEditor
    public final boolean isSampled() {
        return true;
    }

    @Override // com.facebook.quicklog.MarkerEditor, com.facebook.quicklog.PointEditor
    public final void markerEditingCompleted() {
        C0k1.A01(this.A03, this, "", TimeUnit.MILLISECONDS, 13, 0, 0, 0L);
    }

    @Override // com.facebook.quicklog.MarkerEditor
    public final MarkerEditor point(String str, String str2, long j) {
        this.A02.add(new C0YD(str2, str, 11, j));
        return this;
    }

    @Override // com.facebook.quicklog.PointEditor
    public final PointEditor pointCustomTimestamp(long j) {
        this.A02.add(new C0YD(null, "", 16, j));
        return this;
    }

    @Override // com.facebook.quicklog.PointEditor
    public final MarkerEditor pointEditingCompleted() {
        this.A02.add(new C0YD("", null, 14));
        return this;
    }

    @Override // com.facebook.quicklog.MarkerEditor
    public final PointEditor pointEditor(String str) {
        this.A02.add(new C0YD(null, str, 13, SystemClock.uptimeMillis()));
        return this;
    }

    @Override // com.facebook.quicklog.PointEditor
    public final PointEditor pointShouldIncludeMetadata(boolean z) {
        this.A02.add(new C0YD("", Boolean.valueOf(z), 15));
        return this;
    }

    @Override // com.facebook.quicklog.MarkerEditor
    public final MarkerEditor pointWithMetadata(String str, String str2, long j) {
        this.A02.add(new C0YD(str2, str, 12, j));
        return this;
    }

    @Override // com.facebook.quicklog.MarkerEditor
    public final MarkerEditor setSurviveUserSwitch(boolean z) {
        this.A02.add(new C0YD("", Boolean.valueOf(z), 29));
        return this;
    }

    @Override // com.facebook.quicklog.MarkerEditor
    public final MarkerEditor withLevel(int i) {
        this.A02.add(new C0YD("", Integer.valueOf(i), 0));
        return this;
    }

    public C12100kE(C0k1 c0k1, int i, int i2) {
        this.A03 = c0k1;
        this.A01 = i;
        this.A00 = i2;
    }

    @Override // com.facebook.quicklog.PointEditor
    public final PointEditor addPointData(String str, double d) {
        this.A02.add(new C0YD(str, Double.valueOf(d), 21));
        return this;
    }

    @Override // com.facebook.quicklog.PointEditor
    public final PointEditor addPointData(String str, float f) {
        this.A02.add(new C0YD(str, Float.valueOf(f), 20));
        return this;
    }

    @Override // com.facebook.quicklog.PointEditor
    public final PointEditor addPointData(String str, int i) {
        this.A02.add(new C0YD(str, Integer.valueOf(i), 18));
        return this;
    }

    @Override // com.facebook.quicklog.PointEditor
    public final PointEditor addPointData(String str, long j) {
        this.A02.add(new C0YD(str, Long.valueOf(j), 19));
        return this;
    }

    @Override // com.facebook.quicklog.PointEditor
    public final PointEditor addPointData(String str, String str2) {
        this.A02.add(new C0YD(str, str2, 17));
        return this;
    }

    @Override // com.facebook.quicklog.PointEditor
    public final PointEditor addPointData(String str, boolean z) {
        this.A02.add(new C0YD(str, Boolean.valueOf(z), 22));
        return this;
    }

    @Override // com.facebook.quicklog.PointEditor
    public final PointEditor addPointData(String str, double[] dArr) {
        this.A02.add(new C0YD(str, dArr, 27));
        return this;
    }

    @Override // com.facebook.quicklog.PointEditor
    public final PointEditor addPointData(String str, float[] fArr) {
        this.A02.add(new C0YD(str, fArr, 26));
        return this;
    }

    @Override // com.facebook.quicklog.PointEditor
    public final PointEditor addPointData(String str, int[] iArr) {
        this.A02.add(new C0YD(str, iArr, 23));
        return this;
    }

    @Override // com.facebook.quicklog.PointEditor
    public final PointEditor addPointData(String str, long[] jArr) {
        this.A02.add(new C0YD(str, jArr, 25));
        return this;
    }

    @Override // com.facebook.quicklog.PointEditor
    public final PointEditor addPointData(String str, String[] strArr) {
        this.A02.add(new C0YD(str, strArr, 24));
        return this;
    }

    @Override // com.facebook.quicklog.PointEditor
    public final PointEditor addPointData(String str, boolean[] zArr) {
        this.A02.add(new C0YD(str, zArr, 28));
        return this;
    }

    @Override // com.facebook.quicklog.MarkerEditor
    public final MarkerEditor annotate(String str, double d) {
        this.A02.add(new C0YD(str, Double.valueOf(d), 4));
        return this;
    }

    @Override // com.facebook.quicklog.MarkerEditor
    public final MarkerEditor annotate(String str, int i) {
        this.A02.add(new C0YD(str, Integer.valueOf(i), 2));
        return this;
    }

    @Override // com.facebook.quicklog.MarkerEditor
    public final MarkerEditor annotate(String str, long j) {
        this.A02.add(new C0YD(str, Long.valueOf(j), 3));
        return this;
    }

    @Override // com.facebook.quicklog.MarkerEditor
    public final MarkerEditor annotate(String str, String str2) {
        this.A02.add(new C0YD(str, str2, 1));
        return this;
    }

    @Override // com.facebook.quicklog.MarkerEditor
    public final MarkerEditor annotate(String str, boolean z) {
        this.A02.add(new C0YD(str, Boolean.valueOf(z), 5));
        return this;
    }

    @Override // com.facebook.quicklog.MarkerEditor
    public final MarkerEditor annotate(String str, double[] dArr) {
        this.A02.add(new C0YD(str, dArr, 9));
        return this;
    }

    @Override // com.facebook.quicklog.MarkerEditor
    public final MarkerEditor annotate(String str, int[] iArr) {
        this.A02.add(new C0YD(str, iArr, 7));
        return this;
    }

    @Override // com.facebook.quicklog.MarkerEditor
    public final MarkerEditor annotate(String str, long[] jArr) {
        this.A02.add(new C0YD(str, jArr, 8));
        return this;
    }

    @Override // com.facebook.quicklog.MarkerEditor
    public final MarkerEditor annotate(String str, String[] strArr) {
        this.A02.add(new C0YD(str, strArr, 6));
        return this;
    }

    @Override // com.facebook.quicklog.MarkerEditor
    public final MarkerEditor annotate(String str, boolean[] zArr) {
        this.A02.add(new C0YD(str, zArr, 10));
        return this;
    }
}
