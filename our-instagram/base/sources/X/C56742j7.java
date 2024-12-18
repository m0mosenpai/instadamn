package X;

import android.graphics.Path;
import android.graphics.PathMeasure;

/* renamed from: X.2j7, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C56742j7 {
    public Path A00;
    public PathMeasure A01;
    public float[] A02;
    public final AbstractC56612iu A03;
    public final C56682j1 A04;

    public C56742j7(AbstractC56612iu abstractC56612iu, C56682j1 c56682j1) {
        this.A03 = abstractC56612iu;
        this.A04 = c56682j1;
        if (abstractC56612iu.A0b != null) {
            Path path = new Path();
            this.A00 = path;
            this.A01 = new PathMeasure(path, false);
            this.A02 = new float[((C56562ip[]) abstractC56612iu.A0b.A00)[0].A02.length];
        }
    }
}
