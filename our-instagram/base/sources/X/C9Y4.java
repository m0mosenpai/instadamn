package X;

/* renamed from: X.9Y4, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C9Y4 extends AbstractC203838zs {
    public final String A00;
    public final String A01;
    public final boolean A02;
    public static final C203848zt A04 = new C203848zt(EnumC150506pz.A15, "com.facebook.cameracore.mediapipeline.dataproviders.segmentation.implementation.SegmentationDataProviderModule");
    public static final C203848zt A03 = new C203848zt(EnumC150506pz.A0a, "com.facebook.cameracore.mediapipeline.dataproviders.hairsegmentation.implementation.HairSegmentationDataProviderModule");

    public C9Y4(String str, String str2, boolean z) {
        if (str.length() == 0) {
            throw AbstractC166987dD.A12(AnonymousClass001.A0i("Invalid segmentation config, ", "initNetPath", str, '='));
        }
        if (str2.length() == 0) {
            throw AbstractC166987dD.A12(AnonymousClass001.A0i("Invalid segmentation config, ", "predictNetPath", str2, '='));
        }
        this.A00 = str;
        this.A01 = str2;
        this.A02 = z;
    }
}
