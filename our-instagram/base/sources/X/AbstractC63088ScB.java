package X;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import java.io.File;
import java.io.IOException;

/* renamed from: X.ScB, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public abstract class AbstractC63088ScB {
    public static boolean A00;

    public static final void A02(Context context, C6FQ c6fq, C6FW c6fw) {
        A00 = false;
        Intent putExtra = AbstractC58318PtA.A0E("android.intent.action.GET_CONTENT").addCategory("android.intent.category.OPENABLE").setType("image/*").putExtra("android.intent.extra.ALLOW_MULTIPLE", false);
        C14360o3.A07(putExtra);
        C60929Rbj c60929Rbj = new C60929Rbj(0, context, c6fq, c6fw);
        try {
            C6BQ.A0K(c6fq, c60929Rbj);
            C12260kU.A07(C6BQ.A01(c6fq), putExtra, 2);
        } catch (ActivityNotFoundException e) {
            e.printStackTrace();
            C6BQ.A0L(c6fq, c60929Rbj);
        }
    }

    public static final String A00(Context context) {
        if (Build.VERSION.SDK_INT >= 33 && context.getApplicationInfo().targetSdkVersion >= 33) {
            return "android.permission.READ_MEDIA_IMAGES";
        }
        return "android.permission.READ_EXTERNAL_STORAGE";
    }

    public static final void A01(Context context, C6FQ c6fq, C6FW c6fw) {
        File A04 = AbstractC13530mf.A04(context);
        C14360o3.A07(A04);
        try {
            C54846OMr c54846OMr = new C54846OMr();
            c54846OMr.A03 = A04;
            android.net.Uri A01 = new N0P().A01(context, c54846OMr.A00());
            C14360o3.A07(A01);
            Intent A0E = AbstractC58318PtA.A0E("android.media.action.IMAGE_CAPTURE");
            A0E.putExtra("output", A01);
            C64475TFl c64475TFl = new C64475TFl(0, c6fq, A04, c6fw);
            try {
                C6BQ.A0K(c6fq, c64475TFl);
                C12260kU.A07(C6BQ.A01(c6fq), A0E, 1);
            } catch (ActivityNotFoundException e) {
                e.printStackTrace();
                C6BQ.A0L(c6fq, c64475TFl);
                A04.delete();
            }
        } catch (IOException e2) {
            e2.printStackTrace();
            A04.delete();
        }
    }
}
