package X;

import android.content.Context;
import android.graphics.Bitmap;

/* renamed from: X.SxO, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C63991SxO implements InterfaceC65485Tl2 {
    @Override // X.InterfaceC65485Tl2
    public final void Czb(Context context, Bitmap bitmap, String str) {
        if ("LOAD_PROPIC_FOR_PREVIEW".equals(str)) {
            Q5A q5a = SUT.A01;
            if (q5a != null) {
                q5a.setImageBitmap(bitmap);
                SUT.A01.invalidate();
            }
            SUY.A01("ON_LOCAL_MEDIA_FETCH_SUCCESS");
            SUT.A01(context, "LOAD_FRAME");
            return;
        }
        if (!"LOAD_FRAME".equals(str)) {
            return;
        }
        SUT.A00 = bitmap;
        SUT.A00(context, bitmap);
    }

    @Override // X.InterfaceC65485Tl2
    public final void DPl(String str, Throwable th) {
        th.printStackTrace();
        if ("LOAD_PROPIC_FOR_PREVIEW".equals(str)) {
            SUY.A01("ON_LOCAL_MEDIA_FETCH_ERROR");
        }
    }
}
