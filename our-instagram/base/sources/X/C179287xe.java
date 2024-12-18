package X;

import android.media.Image;
import android.media.ImageReader;
import android.os.ConditionVariable;
import android.os.Handler;
import java.nio.ByteBuffer;

/* renamed from: X.7xe, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C179287xe implements ImageReader.OnImageAvailableListener {
    public int A00;
    public int A01;
    public int A02;
    public ImageReader A03;
    public C176507t8 A04;
    public boolean A05;
    public boolean A06;
    public final Handler A08;
    public final C179277xd A0D;
    public volatile boolean A0G;
    public volatile boolean A0H;
    public final C179297xf[] A0F = new C179297xf[1];
    public final C179297xf A0C = new Object();
    public final ConditionVariable A07 = new ConditionVariable();
    public final C179327xi A0E = new C179327xi(new InterfaceC179317xh() { // from class: X.7xg
        @Override // X.InterfaceC179317xh
        public final /* bridge */ /* synthetic */ AGQ AL7() {
            return new AGQ();
        }

        @Override // X.InterfaceC179317xh
        public final /* bridge */ /* synthetic */ void Dee(Object obj) {
            AGQ agq = (AGQ) obj;
            AGQ.A00(agq);
            agq.A0A = null;
            agq.A0C = null;
        }
    });
    public final Runnable A09 = new Runnable() { // from class: X.7xk
        @Override // java.lang.Runnable
        public final void run() {
            C179287xe c179287xe = C179287xe.this;
            C179287xe.A00(c179287xe);
            if (c179287xe.A05) {
                c179287xe.A07.open();
            }
        }
    };
    public final Runnable A0A = new Runnable() { // from class: X.7xl
        @Override // java.lang.Runnable
        public final void run() {
            C179287xe.A01(C179287xe.this);
        }
    };
    public final Runnable A0B = new Runnable() { // from class: X.7xm
        @Override // java.lang.Runnable
        public final void run() {
            C179287xe c179287xe = C179287xe.this;
            ImageReader imageReader = c179287xe.A03;
            if (imageReader == null || imageReader.getWidth() != c179287xe.A02 || c179287xe.A03.getHeight() != c179287xe.A01) {
                C179287xe.A01(c179287xe);
                C179287xe.A00(c179287xe);
            }
            if (c179287xe.A06) {
                c179287xe.A07.open();
            }
        }
    };

    public static void A00(C179287xe c179287xe) {
        if (c179287xe.A03 == null && c179287xe.A02 > 0 && c179287xe.A01 > 0) {
            AbstractC09790fc.A01("AddImageReader", -649315303);
            ImageReader newInstance = ImageReader.newInstance(c179287xe.A02, c179287xe.A01, 1, 1);
            c179287xe.A03 = newInstance;
            newInstance.setOnImageAvailableListener(c179287xe, null);
            C176507t8 c176507t8 = new C176507t8(c179287xe.A03.getSurface(), true);
            c179287xe.A04 = c176507t8;
            c176507t8.A0E = true;
            C179277xd c179277xd = c179287xe.A0D;
            C176507t8 c176507t82 = c179287xe.A04;
            C14360o3.A0B(c176507t82, 0);
            c179277xd.A00 = c176507t82;
            C176507t8 c176507t83 = c179277xd.A00;
            c179277xd.A00 = null;
            if (c176507t83 != null) {
                C179267xc c179267xc = c179277xd.A01;
                C179377xn c179377xn = c179267xc.A08;
                c179377xn.A02(c179377xn.A01, new C176517t9(c179267xc.A07, c176507t83));
            }
            AbstractC09790fc.A00(1573309466);
        }
    }

    public static void A01(C179287xe c179287xe) {
        AbstractC09790fc.A01("RemoveImageReader", 1505685985);
        C176507t8 c176507t8 = c179287xe.A04;
        if (c176507t8 != null) {
            C179277xd c179277xd = c179287xe.A0D;
            c179277xd.A00 = c176507t8;
            C179267xc c179267xc = c179277xd.A01;
            C176507t8 c176507t82 = c179277xd.A00;
            c179277xd.A00 = null;
            if (c176507t82 != null) {
                c179267xc.A08.A04(c176507t82);
            }
            c179287xe.A04 = null;
        }
        ImageReader imageReader = c179287xe.A03;
        if (imageReader != null) {
            imageReader.close();
            c179287xe.A03 = null;
        }
        AbstractC09790fc.A00(445636234);
    }

    @Override // android.media.ImageReader.OnImageAvailableListener
    public final void onImageAvailable(ImageReader imageReader) {
        Image image;
        AXC axc;
        int i;
        if (this.A0G) {
            if (this.A04 != null && this.A0H) {
                this.A04.A0D = false;
            }
            AbstractC09790fc.A01("OnImageAvailable", 969544692);
            try {
                image = imageReader.acquireNextImage();
                if (image == null) {
                    C179297xf c179297xf = this.A0C;
                    c179297xf.A02 = null;
                    c179297xf.A00 = 0;
                    c179297xf.A01 = 0;
                    i = -1243039377;
                } else {
                    try {
                        axc = this.A0E.A00();
                    } catch (Throwable unused) {
                        axc = null;
                    }
                    try {
                        AGQ agq = (AGQ) axc.get();
                        Image.Plane[] planes = image.getPlanes();
                        if (planes != null && planes.length != 0) {
                            Image.Plane plane = planes[0];
                            if (plane != null) {
                                C179297xf c179297xf2 = this.A0C;
                                ByteBuffer buffer = plane.getBuffer();
                                int pixelStride = plane.getPixelStride();
                                int rowStride = plane.getRowStride();
                                c179297xf2.A02 = buffer;
                                c179297xf2.A00 = pixelStride;
                                c179297xf2.A01 = rowStride;
                                C179297xf[] c179297xfArr = this.A0F;
                                c179297xfArr[0] = c179297xf2;
                                long timestamp = image.getTimestamp();
                                int width = image.getWidth();
                                int height = image.getHeight();
                                int i2 = this.A00;
                                AGQ.A00(agq);
                                agq.A0C = c179297xfArr;
                                agq.A03 = 1;
                                agq.A07 = timestamp;
                                agq.A09 = false;
                                agq.A04 = width;
                                agq.A02 = height;
                                agq.A01 = i2;
                                if (this.A0G) {
                                    C179107xM c179107xM = this.A0D.A01.A06.A00;
                                    C179237xZ c179237xZ = c179107xM.A0O;
                                    c179237xZ.A00 = axc;
                                    c179107xM.A0K.E6I(c179237xZ, null);
                                    ConditionVariable conditionVariable = c179107xM.A0J;
                                    if (conditionVariable != null) {
                                        conditionVariable.open();
                                    }
                                }
                                c179297xf2.A02 = null;
                                c179297xf2.A00 = 0;
                                c179297xf2.A01 = 0;
                                axc.release();
                                image.close();
                                i = 332150018;
                            } else {
                                C179297xf c179297xf3 = this.A0C;
                                c179297xf3.A02 = null;
                                c179297xf3.A00 = 0;
                                c179297xf3.A01 = 0;
                                axc.release();
                                image.close();
                                i = 1301566386;
                            }
                        } else {
                            C179297xf c179297xf4 = this.A0C;
                            c179297xf4.A02 = null;
                            c179297xf4.A00 = 0;
                            c179297xf4.A01 = 0;
                            axc.release();
                            image.close();
                            i = -1605340081;
                        }
                    } catch (Throwable unused2) {
                        C179297xf c179297xf5 = this.A0C;
                        c179297xf5.A02 = null;
                        c179297xf5.A00 = 0;
                        c179297xf5.A01 = 0;
                        if (axc != null) {
                            axc.release();
                        }
                        if (image != null) {
                            image.close();
                        }
                        i = -97136543;
                        AbstractC09790fc.A00(i);
                    }
                }
            } catch (Throwable unused3) {
                image = null;
                axc = null;
            }
            AbstractC09790fc.A00(i);
        }
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [X.7xf, java.lang.Object] */
    public C179287xe(Handler handler, C179277xd c179277xd, boolean z, boolean z2) {
        this.A0D = c179277xd;
        this.A08 = handler;
        this.A05 = z;
        this.A06 = z2;
    }
}
