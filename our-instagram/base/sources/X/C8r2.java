package X;

import com.instagram.camera.effect.models.CameraAREffect;
import com.instagram.creation.capture.quickcapture.freetransform.transformmatrix.TransformMatrixConfig;
import com.instagram.filterkit.filtergroup.model.intf.FilterGroupModel;
import java.util.List;

/* renamed from: X.8r2, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C8r2 {
    public static final C915647m A0E;
    public CameraAREffect A00;
    public TransformMatrixConfig A01;
    public C22943A9n A02;
    public C9IV A03;
    public C198988qy A04;
    public C187028Qv A05;
    public FilterGroupModel A06;
    public C47v A07;
    public C915647m A08;

    @Deprecated
    public String A09;
    public List A0A;

    @Deprecated
    public List A0B;
    public boolean A0C;
    public boolean A0D;

    static {
        C915647m c915647m = new C915647m();
        c915647m.A01 = 0;
        c915647m.A00 = 100;
        A0E = c915647m;
    }

    public C8r2(CameraAREffect cameraAREffect, TransformMatrixConfig transformMatrixConfig, C22943A9n c22943A9n, C9IV c9iv, C198988qy c198988qy, C187028Qv c187028Qv, FilterGroupModel filterGroupModel, C47v c47v, C915647m c915647m, boolean z, boolean z2) {
        this.A07 = new C47v();
        this.A03 = new C9IV(false);
        this.A0A = null;
        this.A04 = c198988qy;
        this.A08 = c915647m;
        this.A0C = z;
        this.A02 = c22943A9n;
        this.A00 = cameraAREffect;
        this.A09 = cameraAREffect != null ? cameraAREffect.A0K : null;
        this.A05 = c187028Qv;
        this.A01 = transformMatrixConfig;
        this.A0D = z2;
        this.A07 = c47v;
        this.A03 = c9iv;
        this.A06 = filterGroupModel;
    }

    public C8r2() {
        this.A07 = new C47v();
        this.A03 = new C9IV(false);
        this.A0A = null;
    }
}
