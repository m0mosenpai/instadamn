package X;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.ImageDecoder;
import android.widget.ImageView;

/* renamed from: X.DbB, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C30466DbB extends C0YY implements InterfaceC16620sF {
    public static final C30466DbB A00 = new C30466DbB();

    public C30466DbB() {
        super(2);
    }

    @Override // X.InterfaceC16620sF
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        android.net.Uri uri;
        C168937gS c168937gS = (C168937gS) obj;
        C27991CVo c27991CVo = (C27991CVo) obj2;
        boolean A1R = AbstractC167007dF.A1R(0, c168937gS, c27991CVo);
        String str = c27991CVo.A02;
        if (str != null && str.length() != 0) {
            uri = AbstractC08820cl.A03(str);
        } else {
            uri = c27991CVo.A00;
        }
        C14360o3.A0A(uri);
        Context A002 = AbstractC77363dM.A00(c168937gS);
        C14360o3.A0B(uri, A1R ? 1 : 0);
        Bitmap decodeBitmap = ImageDecoder.decodeBitmap(ImageDecoder.createSource(A002.getContentResolver(), uri));
        C14360o3.A0A(decodeBitmap);
        C14360o3.A0B(decodeBitmap, 0);
        C59412nk c59412nk = new C59412nk(decodeBitmap);
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER_CROP;
        C75933ay c75933ay = C51722Yv.A02;
        return new C26620BpH(null, null, scaleType, null, null, c59412nk, null, C9CU.A00(AbstractC25234BEr.A0L(null, C05F.A00, 0, Double.doubleToRawLongBits(50.0d)), C05F.A06, 0, AbstractC25230BEn.A0M()), "MEmuPickedImagesButtonBarComponent", 0);
    }
}
