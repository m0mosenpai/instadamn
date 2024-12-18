package X;

import android.app.ActivityManager;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.graphics.RectF;
import android.widget.ImageView;
import androidx.fragment.app.FragmentActivity;
import com.instagram.creation.photo.crop.CropImageView;
import com.instagram.creation.photo.util.ExifImageData;
import java.io.IOException;

/* loaded from: classes8.dex */
public final class M0D implements Runnable {
    public final /* synthetic */ C45490KCf A00;

    public M0D(C45490KCf c45490KCf) {
        this.A00 = c45490KCf;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ExifImageData exifImageData;
        InterfaceC197178nn interfaceC197178nn;
        Bitmap bitmap;
        ExifImageData exifImageData2;
        CropImageView cropImageView;
        Number number;
        Matrix matrix;
        final String str;
        CropImageView cropImageView2;
        final C45490KCf c45490KCf = this.A00;
        C18240vB c18240vB = C45490KCf.A0O;
        C6WQ c6wq = c45490KCf.A09;
        if (c6wq != null) {
            c6wq.dismiss();
        }
        AnonymousClass840 anonymousClass840 = null;
        c45490KCf.A09 = null;
        Bitmap bitmap2 = c45490KCf.A01;
        int i = 0;
        if (bitmap2 == null) {
            C9GR.A01(c45490KCf.getActivity(), "unable_to_load_image", 2131976043, 0);
            InterfaceC50451MPf interfaceC50451MPf = c45490KCf.A05;
            if (interfaceC50451MPf != null) {
                interfaceC50451MPf.D1r();
            }
        } else {
            FragmentActivity activity = c45490KCf.getActivity();
            boolean z = true;
            if (activity != null && !activity.isFinishing() && (exifImageData = c45490KCf.A07) != null) {
                CropImageView cropImageView3 = c45490KCf.A06;
                if (cropImageView3 != null) {
                    cropImageView3.setImageRotateBitmapResetBase(new C44264JhA(bitmap2, exifImageData.A00), c45490KCf.A0D, null);
                }
                CropImageView cropImageView4 = c45490KCf.A06;
                if ((cropImageView4 == null || cropImageView4.A04 == null) && (interfaceC197178nn = c45490KCf.A0A) != null && (bitmap = c45490KCf.A01) != null && (exifImageData2 = c45490KCf.A07) != null && cropImageView4 != null) {
                    C82P c82p = new C82P(cropImageView4, null, null);
                    int width = bitmap.getWidth();
                    int height = bitmap.getHeight();
                    int min = Math.min(width, height);
                    RectF rectF = new RectF((width - min) / 2, (height - min) / 2, r3 + min, r0 + min);
                    c45490KCf.A02 = rectF;
                    RectF A0X = AbstractC166987dD.A0X();
                    CropImageView cropImageView5 = c45490KCf.A06;
                    if (cropImageView5 != null && (matrix = ((AbstractC43828JZr) cropImageView5).A07) != null) {
                        matrix.mapRect(A0X, rectF);
                    }
                    boolean z2 = true;
                    c82p.A01(A0X, c45490KCf.A0B, true);
                    CropImageView cropImageView6 = c45490KCf.A06;
                    if (cropImageView6 != null) {
                        cropImageView6.setHighlightView(c82p);
                    }
                    CropImageView cropImageView7 = c45490KCf.A06;
                    if (cropImageView7 != null) {
                        cropImageView7.A00 = new RectF(0.0f, 0.0f, width, height);
                    }
                    C3AY A01 = AbstractC44263Jh9.A01(bitmap, Math.min(interfaceC197178nn.getWidth(), interfaceC197178nn.getHeight()), exifImageData2.A00);
                    CropImageView cropImageView8 = c45490KCf.A06;
                    if (cropImageView8 != null) {
                        if (c45490KCf.A0B) {
                            number = AbstractC25227BEk.A0m();
                        } else {
                            number = (Number) A01.A00;
                        }
                        C14360o3.A0A(number);
                        float floatValue = number.floatValue();
                        Object obj = A01.A01;
                        C14360o3.A06(obj);
                        cropImageView8.A0L(rectF, floatValue, AbstractC166987dD.A09(obj));
                    }
                    InterfaceC189608af interfaceC189608af = (InterfaceC189608af) c45490KCf.getContextAs(InterfaceC189608af.class);
                    if (interfaceC189608af != null && (cropImageView = c45490KCf.A06) != null) {
                        C5L6 c5l6 = AbstractC43593JPy.A0R(interfaceC189608af.Ak4()).A06;
                        c5l6.getClass();
                        if (c5l6 != C5L6.A08) {
                            z2 = false;
                        }
                        cropImageView.A0N(z2);
                    }
                }
                if (!c45490KCf.A0B && (cropImageView2 = c45490KCf.A06) != null) {
                    cropImageView2.A03 = c45490KCf;
                }
                CropImageView cropImageView9 = c45490KCf.A06;
                if (cropImageView9 != null) {
                    cropImageView9.A0O();
                }
                Object context = c45490KCf.getContext();
                if (context instanceof InterfaceC189608af) {
                    InterfaceC189608af interfaceC189608af2 = (InterfaceC189608af) context;
                    if (interfaceC189608af2 != null) {
                        anonymousClass840 = interfaceC189608af2.Ak4();
                    }
                    C50713MaC.A00(AbstractC166987dD.A0r(c45490KCf.A0N)).A08(anonymousClass840);
                }
                InterfaceC197178nn interfaceC197178nn2 = c45490KCf.A0A;
                if (interfaceC197178nn2 != null) {
                    str = interfaceC197178nn2.Avl();
                } else {
                    str = null;
                }
                C45490KCf.A0O.ATO(new AbstractRunnableC14200nk() { // from class: X.9is
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(497, 3, false, false);
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        ActivityManager activityManager;
                        C45490KCf c45490KCf2 = C45490KCf.this;
                        Context context2 = c45490KCf2.getContext();
                        if (context2 != null) {
                            C18240vB c18240vB2 = C45490KCf.A0O;
                            if (c45490KCf2.A01 != null) {
                                InterfaceC09390do interfaceC09390do = c45490KCf2.A0N;
                                C50713MaC.A00(AbstractC166987dD.A0r(interfaceC09390do)).A01(context2, c45490KCf2.A01, null);
                                C197568oS.A02(context2, AbstractC166987dD.A0r(interfaceC09390do));
                                String str2 = str;
                                if (str2 == null) {
                                    return;
                                }
                                try {
                                    AbstractC197538oP.A00.A00(null, AbstractC166987dD.A0r(interfaceC09390do), null, str2);
                                } catch (IOException unused) {
                                } catch (NullPointerException e) {
                                    C0f5 AEp = C18950wb.A01.AEp(C45490KCf.class.toString(), 817893068);
                                    ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
                                    Object systemService = c45490KCf2.requireContext().getSystemService("activity");
                                    if ((systemService instanceof ActivityManager) && (activityManager = (ActivityManager) systemService) != null) {
                                        activityManager.getMemoryInfo(memoryInfo);
                                    }
                                    AEp.ABV("availableMemory", memoryInfo.availMem);
                                    AEp.ERI(e);
                                    AEp.report();
                                    throw e;
                                }
                            }
                        }
                    }
                });
                if (bitmap2.getWidth() != bitmap2.getHeight()) {
                    z = false;
                }
                c45490KCf.A0C = z;
                if (c45490KCf.A0B || z) {
                    i = 8;
                }
                ImageView imageView = c45490KCf.A04;
                if (imageView != null) {
                    imageView.setVisibility(i);
                }
            }
        }
        InterfaceC189608af interfaceC189608af3 = (InterfaceC189608af) c45490KCf.getContextAs(InterfaceC189608af.class);
        if (interfaceC189608af3 != null && interfaceC189608af3.Ak4() != null && interfaceC189608af3.Ak4().A01 == C22P.A2d) {
            if (C18U.A06(C06090Tz.A05, AbstractC31178DnM.A0M(c45490KCf.A0N), 36323848387767950L)) {
                C45490KCf.A01(c45490KCf);
            }
        }
    }
}
