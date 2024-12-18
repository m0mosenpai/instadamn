package X;

import com.instagram.camera.effect.models.CameraAREffect;
import com.instagram.creation.base.CropInfo;
import com.instagram.creation.capture.quickcapture.freetransform.transformmatrix.TransformMatrixConfig;
import com.instagram.filterkit.filtergroup.model.intf.FilterGroupModel;
import java.util.LinkedHashMap;
import java.util.List;

/* renamed from: X.8qz, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C198998qz {
    public int A00;
    public CameraAREffect A01;
    public CropInfo A02;
    public TransformMatrixConfig A03;
    public C198988qy A04;
    public C187028Qv A05;
    public FilterGroupModel A06;
    public LinkedHashMap A07;
    public List A08;

    @Deprecated
    public List A09;
    public boolean A0A;

    public C198998qz(CameraAREffect cameraAREffect, CropInfo cropInfo, TransformMatrixConfig transformMatrixConfig, C198988qy c198988qy, C187028Qv c187028Qv, FilterGroupModel filterGroupModel, LinkedHashMap linkedHashMap, List list, int i, boolean z) {
        this.A04 = c198988qy;
        this.A00 = i;
        this.A01 = cameraAREffect;
        this.A06 = filterGroupModel;
        this.A05 = c187028Qv;
        this.A03 = transformMatrixConfig;
        this.A07 = linkedHashMap;
        this.A02 = cropInfo;
        this.A0A = z;
        this.A08 = list;
    }

    public C198998qz() {
    }
}
