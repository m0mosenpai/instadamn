package X;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Rect;
import android.os.Handler;
import com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.ValueMapFilterModel;
import com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.gainmap.GainmapFilter;
import com.facebook.cameracore.litecamera.mediapipeline.iglu.transformmatrix.model.TransformMatrixParams;
import com.facebook.proxygen.LigerSamplePolicy;
import com.instagram.common.session.UserSession;
import com.instagram.creation.base.CropInfo;
import com.instagram.creation.photo.edit.surfacecropfilter.SurfaceCropFilter;
import com.instagram.filterkit.filtergroup.model.impl.FilterGroupModelImpl;
import com.instagram.filterkit.filtergroup.model.intf.FilterGroupModel;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.ObK, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C55105ObK {
    public static final C50713MaC A0A = new Object();
    public C54790OJi A00;
    public SurfaceCropFilter A01;
    public File A02;
    public String A03;
    public AnonymousClass840 A04;
    public boolean A05;
    public final UserSession A09;
    public final C50714MaD A07 = new C50714MaD((int) (Runtime.getRuntime().maxMemory() / 10));
    public final Handler A06 = AbstractC167007dF.A0J();
    public final ArrayList A08 = AbstractC166987dD.A1E();

    private final synchronized void A00(Context context) {
        final SurfaceCropFilter surfaceCropFilter = this.A01;
        final String str = this.A03;
        if (str != null && surfaceCropFilter != null && this.A00 == null) {
            final C54790OJi c54790OJi = new C54790OJi(context, this.A09);
            final boolean z = this.A05;
            c54790OJi.A04.post(new Runnable() { // from class: X.PT9
                @Override // java.lang.Runnable
                public final void run() {
                    ValueMapFilterModel A01;
                    C54790OJi c54790OJi2 = C54790OJi.this;
                    String str2 = str;
                    SurfaceCropFilter surfaceCropFilter2 = surfaceCropFilter;
                    boolean z2 = z;
                    C178577wV c178577wV = c54790OJi2.A00;
                    if (c178577wV != null) {
                        c178577wV.A03();
                        C54665OCr c54665OCr = new C54665OCr(c54790OJi2.A02, ((InterfaceC180137z3) c178577wV.A02(InterfaceC180137z3.A00)).AwM(), c54790OJi2.A05);
                        c54790OJi2.A01 = c54665OCr;
                        Context context2 = c54665OCr.A01;
                        c54665OCr.A00 = LBN.A01(context2, z2);
                        FilterGroupModel filterGroupModel = c54665OCr.A04;
                        filterGroupModel.EUT(surfaceCropFilter2.A00, 3);
                        if (z2) {
                            float f = (c54665OCr.A00 * 0.17f) / 2.5f;
                            Integer num = C05F.A00;
                            A01 = AHK.A01(new TransformMatrixParams(num, num, 1.0f, 0.0f, 0.0f, 0.0f, false), "gaussian_blur", null, 46);
                            A01.A00("sigma", f);
                            A01.A00("kernel_size", f * 3.0f);
                            filterGroupModel.EUT(A01, 25);
                        }
                        if (C18U.A06(C06090Tz.A05, c54665OCr.A03, 36329152671924259L)) {
                            GainmapFilter gainmapFilter = new GainmapFilter();
                            gainmapFilter.A09 = 0;
                            gainmapFilter.A01(true);
                            filterGroupModel.EUT(gainmapFilter, 28);
                        }
                        C197368o7 c197368o7 = c54665OCr.A02;
                        c197368o7.A07(((FilterGroupModelImpl) filterGroupModel).A02);
                        C9RG c9rg = new C9RG(null, null, new C197168nm(context2.getContentResolver(), AbstractC08820cl.A03(str2), null), false);
                        c197368o7.A0B(c9rg);
                        c197368o7.A0A(c9rg.A02);
                        int i = c54665OCr.A00;
                        c197368o7.A06(i, i, 0, false, false);
                        int i2 = c54665OCr.A00;
                        c197368o7.A05(i2, i2);
                        int i3 = c54665OCr.A00;
                        c197368o7.A09(null, i3, i3);
                        c54790OJi2.A04.postDelayed(c54790OJi2.A06, LigerSamplePolicy.CERT_DATA_SAMPLE_WEIGHT);
                    }
                }
            });
            this.A00 = c54790OJi;
            ArrayList arrayList = this.A08;
            if (AbstractC25226BEj.A1b(arrayList)) {
                Object clone = arrayList.clone();
                C14360o3.A0C(clone, "null cannot be cast to non-null type java.util.ArrayList<com.instagram.creation.base.bluricons.interfaces.BlurIconRenderRequest>");
                c54790OJi.A00((ArrayList) clone);
                arrayList.clear();
            }
        }
    }

    public final void A01(Context context, Bitmap bitmap, byte[] bArr) {
        int i;
        int i2;
        Bitmap A00;
        C11T.A05("This operation can't be run on UI thread.");
        if (bArr == null) {
            bArr = new byte[0];
        }
        int length = bArr.length;
        if (bitmap != null) {
            i = bitmap.getWidth();
            i2 = bitmap.getHeight();
        } else {
            BitmapFactory.Options options = new BitmapFactory.Options();
            options.inJustDecodeBounds = true;
            C0fL.A00(bArr, 0, length, options);
            i = options.outWidth;
            i2 = options.outHeight;
        }
        int A01 = LBN.A01(context, this.A05);
        int i3 = i;
        if (i > i2) {
            i3 = i2;
        }
        float f = i3 / A01;
        float f2 = 1.0f;
        if (1.0f < f) {
            f2 = f;
        }
        if (bitmap != null) {
            A00 = C0fK.A00(bitmap, (int) (i / f2), (int) (i2 / f2), false);
        } else {
            BitmapFactory.Options options2 = new BitmapFactory.Options();
            options2.inSampleSize = (int) f2;
            A00 = C0fL.A00(bArr, 0, length, options2);
        }
        try {
            File createTempFile = File.createTempFile("downsized_temp_", ".jpg");
            this.A02 = createTempFile;
            C197098ne.A08(A00, this.A09, createTempFile, null);
            A05(context, createTempFile.getAbsolutePath());
        } catch (IOException unused) {
        }
    }

    public final synchronized void A02(Context context, CropInfo cropInfo, int i, boolean z) {
        C14360o3.A0B(context, 0);
        A03(context, cropInfo, null, i, z);
    }

    public final synchronized void A03(Context context, CropInfo cropInfo, String str, int i, boolean z) {
        Rect A00;
        SurfaceCropFilter surfaceCropFilter = new SurfaceCropFilter(false);
        surfaceCropFilter.A0P(z);
        int i2 = cropInfo.A01;
        int i3 = cropInfo.A00;
        Rect A01 = MX2.A01(cropInfo.A02);
        if (str != null && (A00 = C85K.A00(context, this.A09).A00(str)) != null) {
            A01 = MX2.A02(A00, 1.0f, i2, i3, i);
        }
        surfaceCropFilter.A0K(A01, i2, i3, i, false);
        this.A01 = surfaceCropFilter;
        A00(context);
    }

    public final synchronized void A04(Context context, InterfaceC57931Pmb interfaceC57931Pmb, List list) {
        ArrayList A12 = AbstractC166997dE.A12(list, 1);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            int A0B = AbstractC167007dF.A0B(it);
            File A02 = A0A.A02(context, A0B);
            if (A02 != null && !A02.exists()) {
                A12.add(new C54628OBd(interfaceC57931Pmb, MSX.A0h(A02), A0B));
            }
        }
        C54790OJi c54790OJi = this.A00;
        if (c54790OJi != null) {
            c54790OJi.A00(A12);
        } else {
            this.A08.addAll(A12);
        }
    }

    public final synchronized void A05(Context context, String str) {
        C14360o3.A0B(context, 0);
        this.A03 = str;
        A00(context);
    }

    public final synchronized void A06(Context context, List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            O7H o7h = (O7H) it.next();
            C50713MaC c50713MaC = A0A;
            int i = o7h.A00;
            File A02 = c50713MaC.A02(context, i);
            if (A02 != null) {
                A02.delete();
            }
            this.A07.remove(Integer.valueOf(i));
        }
        C54790OJi c54790OJi = this.A00;
        if (c54790OJi != null) {
            synchronized (c54790OJi) {
                Iterator it2 = list.iterator();
                while (it2.hasNext()) {
                    O7H o7h2 = (O7H) it2.next();
                    for (C54628OBd c54628OBd : c54790OJi.A07) {
                        if (o7h2.A00 == c54628OBd.A00) {
                            c54628OBd.A03.set(true);
                        }
                    }
                }
            }
        }
        Iterator it3 = list.iterator();
        while (it3.hasNext()) {
            O7H o7h3 = (O7H) it3.next();
            Iterator A13 = AbstractC166997dE.A13(this.A08);
            while (A13.hasNext()) {
                if (((C54628OBd) AbstractC166997dE.A0l(A13)).A00 == o7h3.A00) {
                    A13.remove();
                }
            }
        }
    }

    public final synchronized void A07(Context context, List list) {
        boolean z;
        ArrayList A12 = AbstractC166997dE.A12(list, 1);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            O7H o7h = (O7H) it.next();
            C50713MaC c50713MaC = A0A;
            int i = o7h.A00;
            File A02 = c50713MaC.A02(context, i);
            if (A02 != null) {
                if (A02.exists()) {
                    C54790OJi c54790OJi = this.A00;
                    if (c54790OJi != null) {
                        synchronized (c54790OJi) {
                            try {
                                Iterator it2 = c54790OJi.A07.iterator();
                                while (true) {
                                    if (it2.hasNext()) {
                                        C54628OBd c54628OBd = (C54628OBd) it2.next();
                                        if (c54628OBd.A00 == i && !c54628OBd.A03.get()) {
                                            z = true;
                                            break;
                                        }
                                    } else {
                                        z = false;
                                        break;
                                    }
                                }
                            } catch (Throwable th) {
                                throw th;
                            }
                        }
                        if (!z) {
                        }
                    }
                    InterfaceC57932Pmc interfaceC57932Pmc = (InterfaceC57932Pmc) o7h.A01.get();
                    if (interfaceC57932Pmc != null) {
                        Bitmap bitmap = (Bitmap) this.A07.get(Integer.valueOf(i));
                        if (bitmap != null) {
                            interfaceC57932Pmc.Czq(i, bitmap);
                        } else {
                            C14120nc.A00().ATO(new C52379NGa(this, o7h, MSX.A0h(A02)));
                        }
                    }
                }
                A12.add(new C54628OBd(new C56219OxS(this, o7h), MSX.A0h(A02), i));
            }
        }
        try {
            C54790OJi c54790OJi2 = this.A00;
            if (c54790OJi2 != null) {
                c54790OJi2.A00(A12);
            } else {
                this.A08.addAll(A12);
            }
        } catch (Throwable th2) {
        }
    }

    public final synchronized void A08(AnonymousClass840 anonymousClass840) {
        this.A04 = anonymousClass840;
    }

    public final synchronized void A09(boolean z) {
        this.A05 = z;
    }

    public C55105ObK(UserSession userSession) {
        this.A09 = userSession;
    }
}
