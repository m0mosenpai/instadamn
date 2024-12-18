package X;

import com.instagram.creation.capture.quickcapture.cameratoolmenu.CameraToolMenuItem;
import java.util.LinkedHashMap;

/* renamed from: X.AdZ, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C23640AdZ implements AnonymousClass822 {
    public final /* synthetic */ C81W A00;
    public final /* synthetic */ C172287lx A01;
    public final /* synthetic */ LinkedHashMap A02;

    public C23640AdZ(C81W c81w, C172287lx c172287lx, LinkedHashMap linkedHashMap) {
        this.A01 = c172287lx;
        this.A00 = c81w;
        this.A02 = linkedHashMap;
    }

    @Override // X.AnonymousClass822
    public final /* bridge */ /* synthetic */ void onChanged(Object obj) {
        CameraToolMenuItem cameraToolMenuItem;
        A56 a56 = (A56) obj;
        C14360o3.A0B(a56, 0);
        float f = a56.A00;
        float f2 = (f - (f % 10.0f)) / 100.0f;
        C172287lx c172287lx = this.A01;
        C81W c81w = this.A00;
        boolean z = true;
        if (!C8GX.A06(c81w) || f2 == (255.0f - (255.0f % 10.0f)) / 100.0f) {
            z = false;
        }
        LinkedHashMap linkedHashMap = this.A02;
        if (linkedHashMap.containsKey(c81w) && (cameraToolMenuItem = (CameraToolMenuItem) linkedHashMap.get(c81w)) != null) {
            cameraToolMenuItem.setSelected(z);
            StringBuilder A1C = AbstractC166987dD.A1C();
            A1C.append(f2);
            cameraToolMenuItem.setDrawableWithLabel(AbstractC166997dE.A0x(AbstractC166997dE.A0L(c172287lx.A05).getString(2131963715), A1C));
            cameraToolMenuItem.postInvalidate();
        }
    }
}
