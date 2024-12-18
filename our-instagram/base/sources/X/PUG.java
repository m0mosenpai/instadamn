package X;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import com.instagram.common.session.UserSession;
import instagram.features.clips.edit.ClipsEditMetadataController;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.concurrent.Callable;

/* loaded from: classes9.dex */
public final class PUG implements Callable {
    public final int A00;
    public final Object A01;

    public PUG(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    @Override // java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ Object call() {
        switch (this.A00) {
            case 0:
                OIG oig = (OIG) this.A01;
                C26371Ps c26371Ps = new C26371Ps((C1JP) null);
                c26371Ps.A01(C05F.A0N);
                c26371Ps.A02 = AbstractC166987dD.A19(oig.A02);
                C1QW A00 = c26371Ps.A00();
                C1QX c1qx = new C1QX();
                c1qx.A04 = EnumC23341Bw.Video;
                c1qx.A03 = C1Ef.OnScreen;
                c1qx.A0A = "FetchOilWebpReques";
                return new C26461Qb(A00, c1qx.A00());
            case 1:
                C23311Bt.A00().A01(new C26461Qb(((C26371Ps) this.A01).A00(), new C1QX().A00()));
                return new C40791um();
            case 2:
                return AbstractC25226BEj.A1C(this.A01);
            case 3:
                return this.A01;
            case 4:
                EIx eIx = (EIx) this.A01;
                Bitmap bitmap = eIx.A00;
                if (bitmap != null) {
                    int width = bitmap.getWidth();
                    File A04 = AbstractC13530mf.A04(eIx.requireContext());
                    C14360o3.A07(A04);
                    Bitmap bitmap2 = eIx.A00;
                    if (bitmap2 != null) {
                        C1NC.A0M(bitmap2, A04);
                        eIx.A01 = android.net.Uri.fromFile(A04);
                        String A0Q = AnonymousClass001.A0Q("", System.currentTimeMillis());
                        OY4.A01(AbstractC166987dD.A0r(eIx.A0N), A0Q, MSX.A0i(A04), width);
                        return A0Q;
                    }
                }
                C14360o3.A0F("birthdaySelfieBitmap");
                throw C00O.createAndThrow();
            default:
                ClipsEditMetadataController clipsEditMetadataController = (ClipsEditMetadataController) this.A01;
                Context context = clipsEditMetadataController.A0n;
                UserSession userSession = clipsEditMetadataController.A0s;
                String str = (String) ((C50887MeI) clipsEditMetadataController.A1B.getValue()).A00.A02();
                if (MSY.A1Z(str)) {
                    Bitmap decodeFile = BitmapFactory.decodeFile(str);
                    if (decodeFile != null) {
                        File A042 = AbstractC13530mf.A04(context);
                        C14360o3.A07(A042);
                        if (A042.exists()) {
                            C1NC.A0M(decodeFile, A042);
                            String A0x = AbstractC43593JPy.A0x();
                            OY4.A01(userSession, A0x, AbstractC43592JPx.A0x(A042), decodeFile.getWidth());
                            return A0x;
                        }
                        throw new FileNotFoundException("Unable to create temp file");
                    }
                    throw MSW.A0y(AbstractC43591JPw.A00(281));
                }
                throw new FileNotFoundException();
        }
    }
}
