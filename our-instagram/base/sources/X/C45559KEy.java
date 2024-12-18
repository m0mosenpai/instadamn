package X;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import java.io.IOException;

/* renamed from: X.KEy, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C45559KEy extends U7H {
    public final Context A00;
    public final C47324KvZ A01;

    @Override // X.U7H
    public final /* bridge */ /* synthetic */ Object A03(Object[] objArr) {
        float height;
        int width;
        String[] strArr = (String[]) objArr;
        C14360o3.A0B(strArr, 0);
        try {
            String str = strArr[0];
            if (str != null) {
                C60782q2 c60782q2 = new C60782q2(str);
                BitmapFactory.Options options = new BitmapFactory.Options();
                Context context = this.A00;
                options.inSampleSize = C1NC.A01(str, AbstractC13880nE.A07(context), AbstractC13880nE.A06(context));
                Bitmap decodeFile = BitmapFactory.decodeFile(str, options);
                if (decodeFile != null) {
                    decodeFile.prepareToDraw();
                    int A0M = c60782q2.A0M("Orientation", 0);
                    if (A0M == 6 || A0M == 8) {
                        height = decodeFile.getHeight();
                        width = decodeFile.getWidth();
                    } else {
                        height = decodeFile.getWidth();
                        width = decodeFile.getHeight();
                    }
                    return new L1J(decodeFile, height / width, A0M);
                }
            }
        } catch (IOException e) {
            C0w9.A06("DirectMediaViewerBitmapLoaderTask", "Failed to decode bitmap from disk.", e);
        }
        return null;
    }

    @Override // X.U7H
    public final /* bridge */ /* synthetic */ void A05(Object obj) {
        if (obj != null) {
            C1346766r c1346766r = this.A01.A00;
            c1346766r.A02(obj);
            c1346766r.A00();
        }
    }

    public C45559KEy(Context context, C47324KvZ c47324KvZ) {
        this.A00 = context;
        this.A01 = c47324KvZ;
    }
}
