package X;

import android.app.ActivityManager;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Rect;
import android.graphics.RectF;
import android.location.Location;
import android.os.Handler;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.gallery.metadata.MediaUploadMetadata;
import com.instagram.common.session.UserSession;
import com.instagram.creation.base.CreationSession;
import com.instagram.creation.base.CropInfo;
import com.instagram.creation.photo.crop.CropImageView;
import com.instagram.creation.photo.util.ExifImageData;
import com.instagram.model.creation.MediaCaptureConfig;
import java.io.IOException;

/* renamed from: X.JaY, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C43868JaY {
    public static final int A0D = AbstractC62402sf.A00.getAndIncrement();
    public Bitmap A00;
    public RectF A01;
    public CropInfo A02;
    public C43869JaZ A03;
    public ExifImageData A04;
    public InterfaceC197178nn A05;
    public boolean A06;
    public boolean A07;
    public boolean A08;
    public final Context A09;
    public final Handler A0A = new Handler();
    public final UserSession A0B;
    public final C18240vB A0C;

    public final void A02(Context context, MediaUploadMetadata mediaUploadMetadata) {
        C43869JaZ c43869JaZ;
        CropImageView cropImageView;
        RectF rectF;
        ExifImageData exifImageData;
        boolean z;
        FragmentActivity fragmentActivity;
        FragmentActivity fragmentActivity2;
        C43869JaZ c43869JaZ2;
        ExifImageData exifImageData2;
        InterfaceC189608af interfaceC189608af;
        AnonymousClass840 Ak4;
        final String Avl;
        C1UC c1uc;
        AnonymousClass840 anonymousClass840;
        InterfaceC189608af interfaceC189608af2;
        InterfaceC197178nn interfaceC197178nn = this.A05;
        if (interfaceC197178nn != null && !this.A07 && (c43869JaZ = this.A03) != null && (cropImageView = c43869JaZ.A05) != null && cropImageView.A04 != null) {
            cropImageView.A0H();
            Bitmap bitmap = this.A00;
            if (bitmap != null && (rectF = this.A01) != null && (exifImageData = this.A04) != null) {
                int width = interfaceC197178nn.getWidth();
                int height = interfaceC197178nn.getHeight();
                int width2 = bitmap.getWidth();
                int height2 = bitmap.getHeight();
                int i = exifImageData.A00;
                C43869JaZ c43869JaZ3 = this.A03;
                if (c43869JaZ3 != null) {
                    z = c43869JaZ3.A09;
                } else {
                    z = false;
                }
                if (((AbstractC43828JZr) cropImageView).A0G.A01 != null || !z) {
                    rectF = AbstractC44263Jh9.A00(rectF, cropImageView, width2, height2, i);
                }
                Rect A04 = MX2.A04(rectF);
                Rect A01 = MX2.A01(A04);
                Rect A05 = MX2.A05(rectF, width, height, width2, height2);
                if (A04.width() == A04.height() && A05.width() != A05.height()) {
                    A05 = MX2.A01(A05);
                    A04 = A01;
                }
                if (AbstractC47840LBe.A01(A05, A04, i)) {
                    this.A07 = true;
                    C43869JaZ c43869JaZ4 = this.A03;
                    C1UC c1uc2 = null;
                    if (c43869JaZ4 != null) {
                        fragmentActivity = c43869JaZ4.A03;
                    } else {
                        fragmentActivity = null;
                    }
                    if (fragmentActivity instanceof InterfaceC189608af) {
                        if (c43869JaZ4 != null) {
                            c1uc = c43869JaZ4.A03;
                        } else {
                            c1uc = null;
                        }
                        if ((c1uc instanceof InterfaceC189608af) && (interfaceC189608af2 = (InterfaceC189608af) c1uc) != null) {
                            anonymousClass840 = interfaceC189608af2.Ak4();
                        } else {
                            anonymousClass840 = null;
                        }
                        C50713MaC.A00(this.A0B).A08(anonymousClass840);
                    }
                    InterfaceC197178nn interfaceC197178nn2 = this.A05;
                    if (interfaceC197178nn2 != null && (Avl = interfaceC197178nn2.Avl()) != null) {
                        this.A0C.ATO(new AbstractRunnableC14200nk() { // from class: X.9it
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(495, 3, false, false);
                            }

                            @Override // java.lang.Runnable
                            public final void run() {
                                FragmentActivity fragmentActivity3;
                                ActivityManager activityManager;
                                C43868JaY c43868JaY = C43868JaY.this;
                                C43869JaZ c43869JaZ5 = c43868JaY.A03;
                                if (c43869JaZ5 != null) {
                                    fragmentActivity3 = c43869JaZ5.A03;
                                } else {
                                    fragmentActivity3 = null;
                                }
                                if (fragmentActivity3 != null) {
                                    UserSession userSession = c43868JaY.A0B;
                                    C50713MaC.A00(userSession).A01(fragmentActivity3, c43868JaY.A00, null);
                                    try {
                                        C197568oS.A02(fragmentActivity3, userSession);
                                    } catch (C80D e) {
                                        AbstractC12120kG.A0I("crop_image_controller", e, AbstractC06930Yk.A0E());
                                    }
                                }
                                try {
                                    AbstractC197538oP.A00.A00(null, c43868JaY.A0B, null, Avl);
                                } catch (IOException unused) {
                                } catch (NullPointerException e2) {
                                    C0f5 AEp = C18950wb.A01.AEp("CropImageController", 817893068);
                                    ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
                                    Object systemService = c43868JaY.A09.getSystemService("activity");
                                    if ((systemService instanceof ActivityManager) && (activityManager = (ActivityManager) systemService) != null) {
                                        activityManager.getMemoryInfo(memoryInfo);
                                    }
                                    AEp.ABV("availableMemory", memoryInfo.availMem);
                                    AEp.ERI(e2);
                                    AEp.report();
                                    throw e2;
                                }
                            }
                        });
                    }
                    U7F u7f = cropImageView.A01;
                    if (u7f != null) {
                        u7f.A02();
                        cropImageView.setOnTouchListener(null);
                        cropImageView.A01 = null;
                    }
                    cropImageView.A04 = null;
                    C50713MaC.A00(this.A0B).A03(context, new CropInfo(A01, bitmap.getWidth(), bitmap.getHeight()), interfaceC197178nn.Avl(), exifImageData.A00, false);
                    this.A02 = new CropInfo(A05, interfaceC197178nn.getWidth(), interfaceC197178nn.getHeight());
                    C43869JaZ c43869JaZ5 = this.A03;
                    if (c43869JaZ5 != null) {
                        fragmentActivity2 = c43869JaZ5.A03;
                    } else {
                        fragmentActivity2 = null;
                    }
                    if (fragmentActivity2 instanceof InterfaceC189628ah) {
                        if (c43869JaZ5 != null) {
                            c1uc2 = c43869JaZ5.A03;
                        }
                        if ((c1uc2 instanceof InterfaceC189608af) && (interfaceC189608af = (InterfaceC189608af) c1uc2) != null && (Ak4 = interfaceC189608af.Ak4()) != null) {
                            CreationSession A0R = AbstractC43593JPy.A0R(Ak4);
                            A0R.A03 = bitmap;
                            A0R.A04 = A04;
                        }
                    }
                    String Avl2 = interfaceC197178nn.Avl();
                    if (Avl2 != null && (c43869JaZ2 = this.A03) != null && (exifImageData2 = this.A04) != null && c43869JaZ2.A04 != null) {
                        Location location = null;
                        Double d = exifImageData2.A01;
                        Double d2 = exifImageData2.A02;
                        if (d != null && d2 != null) {
                            location = new Location("photo");
                            location.setLatitude(d.doubleValue());
                            location.setLongitude(d2.doubleValue());
                        }
                        MQT mqt = c43869JaZ2.A04;
                        if (mqt != null) {
                            mqt.DH8(location, c43869JaZ2.A01, mediaUploadMetadata, this.A02, Avl2, c43869JaZ2.A08, exifImageData2.A03, exifImageData2.A00, c43869JaZ2.A00);
                        }
                    }
                }
            }
        }
    }

    public final CropInfo A00() {
        InterfaceC197178nn interfaceC197178nn;
        C43869JaZ c43869JaZ;
        CropImageView cropImageView;
        ExifImageData exifImageData;
        boolean z;
        Bitmap bitmap = this.A00;
        if (bitmap == null || (interfaceC197178nn = this.A05) == null || (c43869JaZ = this.A03) == null || (cropImageView = c43869JaZ.A05) == null) {
            return null;
        }
        cropImageView.A0H();
        int width = interfaceC197178nn.getWidth();
        int height = interfaceC197178nn.getHeight();
        int width2 = bitmap.getWidth();
        int height2 = bitmap.getHeight();
        RectF rectF = this.A01;
        if (rectF == null || (exifImageData = this.A04) == null) {
            return null;
        }
        int i = exifImageData.A00;
        C43869JaZ c43869JaZ2 = this.A03;
        if (c43869JaZ2 != null) {
            z = c43869JaZ2.A09;
        } else {
            z = false;
        }
        if (((AbstractC43828JZr) cropImageView).A0G.A01 != null || !z) {
            rectF = AbstractC44263Jh9.A00(rectF, cropImageView, width2, height2, i);
        }
        Rect A04 = MX2.A04(rectF);
        MX2.A01(A04);
        Rect A05 = MX2.A05(rectF, width, height, width2, height2);
        if (A04.width() == A04.height() && A05.width() != A05.height()) {
            A05 = MX2.A01(A05);
        }
        return new CropInfo(A05, interfaceC197178nn.getWidth(), interfaceC197178nn.getHeight());
    }

    public final void A01() {
        FragmentActivity fragmentActivity;
        InterfaceC189608af interfaceC189608af;
        AnonymousClass840 Ak4;
        MediaCaptureConfig mediaCaptureConfig;
        C43869JaZ c43869JaZ = this.A03;
        boolean z = false;
        if (c43869JaZ != null) {
            C1UC c1uc = c43869JaZ.A03;
            if ((c1uc instanceof AnonymousClass841) && (c1uc instanceof InterfaceC189608af) && (interfaceC189608af = (InterfaceC189608af) c1uc) != null && (Ak4 = interfaceC189608af.Ak4()) != null && (mediaCaptureConfig = ((MX5) Ak4.A00()).A01.A09) != null && mediaCaptureConfig.A0B) {
                z = true;
            }
        }
        this.A08 = z;
        this.A06 = false;
        C44090JeF c44090JeF = new C44090JeF(this);
        C43869JaZ c43869JaZ2 = this.A03;
        if (c43869JaZ2 != null && (fragmentActivity = c43869JaZ2.A03) != null) {
            AbstractC018607g.A00(fragmentActivity).A04(c44090JeF, A0D);
        }
    }

    public C43868JaY(Context context, UserSession userSession) {
        this.A09 = context;
        this.A0B = userSession;
        C0o0 A00 = AbstractC14350nz.A00();
        A00.A01 = "cropImageExecutor";
        this.A0C = new C18240vB(A00);
    }
}
