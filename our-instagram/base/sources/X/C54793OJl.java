package X;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Handler;
import com.instagram.common.gallery.Medium;
import com.instagram.common.gallery.metadata.MediaUploadMetadata;
import com.instagram.common.session.UserSession;
import com.instagram.pendingmedia.model.ClipInfo;
import com.instagram.pendingmedia.model.constants.ShareType;
import java.io.File;
import java.io.IOException;
import java.util.List;

/* renamed from: X.OJl, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C54793OJl {
    public final /* synthetic */ float A00;
    public final /* synthetic */ Context A01;
    public final /* synthetic */ UserSession A02;
    public final /* synthetic */ Integer A03;
    public final /* synthetic */ String A04;
    public final /* synthetic */ String A05;
    public final /* synthetic */ String A06;
    public final /* synthetic */ boolean A07;
    public final /* synthetic */ boolean A08;

    public C54793OJl(Context context, UserSession userSession, Integer num, String str, String str2, String str3, float f, boolean z, boolean z2) {
        this.A01 = context;
        this.A08 = z;
        this.A02 = userSession;
        this.A05 = str;
        this.A06 = str2;
        this.A00 = f;
        this.A07 = z2;
        this.A03 = num;
        this.A04 = str3;
    }

    public final void A00(Rect rect, List list) {
        C22P c22p;
        String str;
        int i;
        C45029JwK c45029JwK = (C45029JwK) AbstractC001800i.A0O(list, 0);
        if (c45029JwK != null) {
            Context context = this.A01;
            boolean z = this.A08;
            UserSession userSession = this.A02;
            String str2 = this.A05;
            String str3 = this.A06;
            float f = this.A00;
            boolean z2 = this.A07;
            Integer num = this.A03;
            String str4 = this.A04;
            Medium medium = c45029JwK.A00;
            if (medium.Cff()) {
                if (medium.A03 > 61500) {
                    i = 2131969163;
                } else if (z) {
                    i = 2131969128;
                }
                IQU.A00(context, i);
                return;
            }
            new C55101ObE(userSession, context).A07(false, str2);
            String A0x = AbstractC43593JPy.A0x();
            int intValue = num.intValue();
            if (intValue != 1) {
                if (intValue != 0) {
                    if (intValue == 2) {
                        c22p = C22P.A3i;
                    } else {
                        throw B4Z.A00();
                    }
                } else {
                    c22p = C22P.A3j;
                }
            } else {
                c22p = C22P.A3h;
            }
            if (medium.Cff()) {
                File A05 = AbstractC13530mf.A05(context);
                C14360o3.A07(A05);
                String canonicalPath = A05.getCanonicalPath();
                C47Z A02 = AbstractC209399Nx.A02(A0x);
                A02.A0g(canonicalPath);
                A02.A33 = medium.A0a;
                A02.A3L = medium.A0X;
                A02.A02 = f;
                A02.A3Z = canonicalPath;
                A02.A0c(ShareType.A0H);
                A02.A3D = str3;
                int i2 = 8;
                if (z2) {
                    i2 = 16;
                }
                A02.A0N = i2;
                A02.A5e = false;
                A02.A0Y(new C40321u0());
                A02.A2g = str4;
                A02.A0i = c22p;
                C44059Jdk A0W = MSY.A0W(medium, 0);
                String str5 = A0W.A07;
                C14360o3.A07(str5);
                long j = A0W.A03;
                ClipInfo A03 = MY3.A03(userSession, str5, j, j);
                float f2 = A03.A09;
                float f3 = A03.A06;
                float f4 = f2 / f3;
                if (f4 > f) {
                    A03.A09 = (int) (f3 * f);
                } else if (f4 < f) {
                    A03.A06 = (int) (f2 / f);
                }
                MY3.A04(A03, A02);
                if (A02.A33 == null) {
                    File A01 = AbstractC916948n.A01();
                    C55201OeB.A01(A03, A01, A03.A09, A03.A06, 100, 0L, true);
                    A02.A33 = A01.getCanonicalPath();
                }
                A02.A0k(true);
                C55119Obe.A01(context, userSession, A02, z2);
                new Handler(C1CG.A00()).post(new RunnableC57083PTw(context, rect, medium, userSession, A02, canonicalPath, f4, f));
                return;
            }
            try {
                int i3 = medium.A0B;
                boolean z3 = true;
                if (i3 == 0 || medium.A04 == 0) {
                    String A022 = AnonymousClass001.A02(i3, medium.A04, "Selected media size corrupted. width = ", ", height = ");
                    BitmapFactory.Options options = new BitmapFactory.Options();
                    options.inJustDecodeBounds = true;
                    try {
                        BitmapFactory.decodeFile(medium.A0X, options);
                        int i4 = options.outWidth;
                        int i5 = options.outHeight;
                        medium.A0B = i4;
                        medium.A04 = i5;
                        if (i4 == 0 || i5 == 0) {
                            throw MSW.A0y(A022);
                        }
                    } catch (RuntimeException unused) {
                        throw MSY.A0X("Failed decoding file.", A022);
                    }
                }
                File A04 = AbstractC13530mf.A04(context);
                C14360o3.A07(A04);
                int A00 = C1NC.A00(medium.A0X);
                boolean z4 = false;
                Bitmap A0F = C1NC.A0F(medium.A0X, medium.A0B, medium.A04, A00);
                if (rect != null && A0F != null) {
                    float f5 = medium.A0B;
                    float f6 = medium.A04;
                    float f7 = f5 / f6;
                    if (A00 == 90 || A00 == 270) {
                        z4 = true;
                    }
                    if (z4) {
                        f7 = 1.0f / f7;
                    }
                    float f8 = f5 * 1.0f;
                    float f9 = f6 * 1.0f;
                    if ((f7 < f && !z4) || (f7 > f && z4)) {
                        f9 = f8 / f;
                    } else {
                        f8 = f9 * f;
                    }
                    int i6 = (int) f8;
                    int i7 = (int) f9;
                    RectF rectF = new RectF(rect);
                    Matrix matrix = new Matrix();
                    matrix.setRectToRect(rectF, new RectF(0.0f, 0.0f, i6, i7), Matrix.ScaleToFit.CENTER);
                    Bitmap.Config config = A0F.getConfig();
                    C14360o3.A0A(config);
                    Bitmap createBitmap = Bitmap.createBitmap(i6, i7, config);
                    AbstractC43592JPx.A06(createBitmap).drawBitmap(A0F, matrix, new Paint(3));
                    A0F = createBitmap;
                }
                if (A04.exists() && A0F != null) {
                    C1NC.A0M(A0F, A04);
                    try {
                        String canonicalPath2 = A04.getCanonicalPath();
                        if (canonicalPath2 == null) {
                            canonicalPath2 = medium.A0X;
                        }
                        C47Z A012 = AbstractC209399Nx.A01(A0x);
                        A012.A33 = canonicalPath2;
                        A012.A3L = canonicalPath2;
                        A012.A02 = f;
                        A012.A0c(ShareType.A0H);
                        A012.A3D = str3;
                        int i8 = 8;
                        if (z2) {
                            i8 = 16;
                        }
                        A012.A0N = i8;
                        MediaUploadMetadata mediaUploadMetadata = medium.A0G;
                        C14360o3.A0B(mediaUploadMetadata, 0);
                        A012.A13 = mediaUploadMetadata;
                        A012.A5e = false;
                        A012.A0Y(new C40321u0());
                        A012.A2g = str4;
                        A012.A0i = c22p;
                        C55119Obe.A00(context, userSession, A012);
                        C55119Obe.A01(context, userSession, A012, z2);
                        return;
                    } catch (IOException e) {
                        e = e;
                        str = "Error getting image file path";
                        C0w9.A06("open_carousel_submission_uploader", str, e);
                        EnumC141996bI enumC141996bI = EnumC141996bI.A05;
                        C146106i8 A0K = AbstractC31171DnF.A0K();
                        AbstractC25226BEj.A1N(context, A0K, 2131969147);
                        A0K.A0C = enumC141996bI;
                        AbstractC31178DnM.A1S(A0K);
                        return;
                    }
                }
                boolean exists = A04.exists();
                if (A0F == null) {
                    z3 = false;
                }
            } catch (IOException | Exception e2) {
                e = e2;
                str = "Error cropping or rotate image";
            }
        }
    }
}
