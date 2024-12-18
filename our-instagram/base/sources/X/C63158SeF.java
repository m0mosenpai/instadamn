package X;

import android.content.Context;
import android.graphics.Bitmap;
import android.view.View;
import androidx.fragment.app.Fragment;

/* renamed from: X.SeF, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C63158SeF {
    public static final C63158SeF A00 = new Object();

    public final Object A01(C6FQ c6fq, C6FW c6fw) {
        Object A03 = c6fw.A03(0);
        C14360o3.A0C(A03, AbstractC43591JPw.A00(1));
        C6FG c6fg = (C6FG) A03;
        InterfaceC103384lE A0t = AbstractC25228BEl.A0t(c6fw.A00, 1);
        Fragment A01 = C6BQ.A01(c6fq);
        Context requireContext = A01.requireContext();
        String A002 = AbstractC43591JPw.A00(2);
        if (!AbstractC23451Ch.A07(requireContext, A002)) {
            AbstractC43592JPx.A1C(A01.requireActivity(), new C64483TFt(3, c6fg, A01, c6fq, A0t), A002);
            return null;
        }
        A00(A01, c6fg, c6fq, A0t);
        return null;
    }

    public static final void A00(Fragment fragment, C6FG c6fg, C6FQ c6fq, InterfaceC103384lE interfaceC103384lE) {
        View requireView = fragment.requireView();
        requireView.setDrawingCacheEnabled(true);
        if (requireView.getDrawingCache() != null) {
            Bitmap drawingCache = requireView.getDrawingCache();
            C0fK.A03(drawingCache);
            Bitmap createBitmap = Bitmap.createBitmap(drawingCache);
            C14360o3.A07(createBitmap);
            requireView.setDrawingCacheEnabled(false);
            C1GJ.A03(new KKA(0, createBitmap, fragment, c6fg, c6fq, interfaceC103384lE));
            return;
        }
        throw AbstractC166997dE.A0g();
    }
}
