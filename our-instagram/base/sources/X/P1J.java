package X;

import com.instagram.creation.sharesheet.coverphoto.ClipsCoverPhotoPickerController;
import com.instagram.igtv.uploadflow.upload.IGTVUploadViewModel;

/* loaded from: classes9.dex */
public final class P1J implements InterfaceC57942Pmm {
    public final int A00;
    public final Object A01;

    public P1J(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    @Override // X.InterfaceC57942Pmm
    public final void DqD(String str, int i, int i2) {
        int i3 = this.A00;
        C14360o3.A0B(str, 0);
        switch (i3) {
            case 0:
                ClipsCoverPhotoPickerController clipsCoverPhotoPickerController = (ClipsCoverPhotoPickerController) this.A01;
                C47Z c47z = clipsCoverPhotoPickerController.A0C;
                if (c47z != null) {
                    c47z.A33 = str;
                }
                clipsCoverPhotoPickerController.A0A.A03(str);
                return;
            case 1:
                IGTVUploadViewModel A0b = MSW.A0b(((C45508KCx) this.A01).A0G);
                A0b.ESH(str);
                A0b.ESN(i);
                A0b.ESK(i2);
                return;
            default:
                C11T.A02(new RunnableC56996PQm((NMX) this.A01, str));
                return;
        }
    }
}
