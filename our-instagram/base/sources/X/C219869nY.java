package X;

import android.graphics.Bitmap;
import android.view.View;
import com.instagram.common.gallery.Medium;

/* renamed from: X.9nY, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C219869nY extends C9V0 implements InterfaceC193488hT {
    public C193498hU A00;
    public Medium A01;
    public final C8SG A02;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C219869nY(View view, C8SB c8sb, C8SG c8sg, InterfaceC187328Rz interfaceC187328Rz) {
        super(view, c8sb, interfaceC187328Rz);
        C14360o3.A0B(c8sg, 2);
        this.A02 = c8sg;
    }

    @Override // X.InterfaceC193488hT
    public final boolean CXZ(Medium medium) {
        C14360o3.A0B(medium, 0);
        return medium.equals(this.A01);
    }

    @Override // X.InterfaceC193488hT
    public final void DN1(Medium medium, String str) {
    }

    @Override // X.InterfaceC193488hT
    public final void Dt1(Bitmap bitmap, Medium medium, boolean z) {
        C14360o3.A0B(bitmap, 2);
        this.A0A.setImageBitmap(bitmap);
    }
}
