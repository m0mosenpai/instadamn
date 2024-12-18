package X;

import android.content.Context;
import android.graphics.Bitmap;
import com.meta.foa.session.FoaUserSession;
import java.io.File;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* renamed from: X.NzO, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public abstract class AbstractC54304NzO {
    public static final Object A00(Context context, Bitmap bitmap, FoaUserSession foaUserSession, OWt oWt, InterfaceC23621Ds interfaceC23621Ds) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = C24891Jo.A04;
        C24891Jo c24891Jo = new C24891Jo(1, C1E2.A02(interfaceC23621Ds));
        c24891Jo.A0I();
        WVG A00 = OVd.A00(AbstractC28057CYl.A00(foaUserSession));
        AbstractC167017dG.A1R(bitmap, oWt);
        File A04 = AbstractC13530mf.A04(context);
        C14360o3.A07(A04);
        C1NC.A0L(Bitmap.CompressFormat.JPEG, bitmap, A04, oWt.A00);
        C55191Odx c55191Odx = new C55191Odx(A04, AbstractC13570mj.A00(A04.getPath()), AbstractC166997dE.A0o());
        int width = bitmap.getWidth();
        File file = c55191Odx.A01;
        if (file != null) {
            String path = file.getPath();
            C14360o3.A0B(path, 2);
            C54993OUc A002 = AbstractC54105Nw3.A00(AbstractC28057CYl.A00(foaUserSession), AbstractC25231BEo.A0p(), oWt.A01.A01, path, width, true);
            C15370ps A1F = AbstractC25225BEi.A1F();
            A1F.A00 = A00.En2(A002, c55191Odx, new C55650Onb(A00, A1F, c24891Jo, 1));
            c24891Jo.CPA(new C57751Pje(44, A1F, A00));
            return c24891Jo.A0E();
        }
        throw AbstractC166997dE.A0g();
    }
}
