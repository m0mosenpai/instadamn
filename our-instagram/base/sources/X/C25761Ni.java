package X;

import android.graphics.Bitmap;
import com.instagram.common.graphics.IgBitmapReferenceFactory;
import com.instagram.common.typedurl.ImageCacheKey;
import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.Semaphore;
import java.util.regex.Pattern;

/* renamed from: X.1Ni, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C25761Ni implements InterfaceC220315d {
    public static int A06 = -1;
    public static boolean A07 = true;
    public static boolean A08;
    public static final C1NF A09;
    public static final Pattern A0A = Pattern.compile(".*\\.(jpg|JPG|jpeg|JPEG).*");
    public Semaphore A00;
    public boolean A01;
    public C0f6 A02;
    public final C25891Nw A03;
    public final C1O0 A04;
    public final AbstractC25921Nz A05;

    public final C61292qr A03(ImageCacheKey imageCacheKey, float f, int i) {
        return A04(imageCacheKey, null, f, i, -1);
    }

    static {
        IgBitmapReferenceFactory.A00();
        A09 = new C1NF(new C1N8() { // from class: X.1Nk
            @Override // X.C1N8
            public final Object apply(Object obj) {
                boolean z = C25761Ni.A07;
                return obj;
            }
        }, new C1N8() { // from class: X.1Nl
            @Override // X.C1N8
            public final Object apply(Object obj) {
                boolean z = C25761Ni.A07;
                return 5000000L;
            }
        }, new InterfaceC216113n() { // from class: X.1Nj
            @Override // X.InterfaceC216113n
            public final Object get() {
                boolean z = C25761Ni.A07;
                return false;
            }
        }, 1, 350, 3, false, false, false);
    }

    private void A00(Bitmap bitmap, AbstractC59422nl abstractC59422nl, final String str) {
        C1O0 c1o0 = this.A04;
        if (c1o0 != null) {
            Callable callable = new Callable() { // from class: X.2qq
                @Override // java.util.concurrent.Callable
                public final /* bridge */ /* synthetic */ Object call() {
                    C25761Ni c25761Ni = C25761Ni.this;
                    boolean z = C25761Ni.A08;
                    boolean z2 = false;
                    if (c25761Ni.A03.A00(str) != null) {
                        z2 = true;
                    }
                    return Boolean.valueOf(z2);
                }
            };
            synchronized (c1o0) {
                ReferenceQueue referenceQueue = c1o0.A00;
                WeakReference weakReference = new WeakReference(bitmap, referenceQueue);
                Map map = c1o0.A01;
                map.put(weakReference, callable);
                Reference poll = referenceQueue.poll();
                if (poll instanceof WeakReference) {
                    WeakReference weakReference2 = (WeakReference) poll;
                    while (weakReference2 != null) {
                        Callable callable2 = (Callable) C15500q5.A04(map).remove(weakReference2);
                        if (callable2 != null) {
                            try {
                                callable2.call();
                            } catch (Exception e) {
                                C0K8.A0K("ObjectReferenceCleaner", "Exception while running cleanup op", e);
                            }
                        }
                        Reference poll2 = referenceQueue.poll();
                        if (!(poll2 instanceof WeakReference)) {
                            break;
                        } else {
                            weakReference2 = (WeakReference) poll2;
                        }
                    }
                }
            }
        }
        C25891Nw c25891Nw = this.A03;
        C14360o3.A0B(str, 0);
        c25891Nw.A00.A06(str, abstractC59422nl);
    }

    public final C61292qr A01(C206409Bx c206409Bx, String str, String str2, String str3, String str4, byte[] bArr, int[] iArr, int i, int i2, int i3, boolean z) {
        C0f6 c0f6 = this.A02;
        try {
            return A02(c206409Bx, str, str2, str3, str4, bArr, iArr, i, i2, i3, z);
        } catch (Error | Exception e) {
            String simpleName = e.getClass().getSimpleName();
            C14360o3.A0B(simpleName, 3);
            AbstractC107914ta.A00(c0f6, "ERROR_DECODING_FAILED", new C57564Pgc(i3, "InMemoryBitmapCache::decodeAndMaybeAdd", simpleName));
            throw e;
        }
    }

    public final C61292qr A02(C206409Bx c206409Bx, String str, String str2, String str3, String str4, byte[] bArr, int[] iArr, int i, int i2, int i3, boolean z) {
        int i4;
        C61262qo A00;
        try {
            Semaphore semaphore = this.A00;
            C61292qr c61292qr = null;
            if (this.A01 && semaphore != null) {
                try {
                    semaphore.acquire();
                    A00 = this.A05.A00(c206409Bx, str2, str3, str4, bArr, -1.0f, i, i2, i3, z);
                } catch (InterruptedException unused) {
                }
                if (A00 != null) {
                    Bitmap bitmap = A00.A00;
                    if (bitmap == null) {
                        bitmap = A00.A01.A00();
                    }
                    if (iArr != null) {
                        bitmap.getClass();
                        bitmap = C1NC.A0B(bitmap, iArr[0], iArr[1], false);
                    }
                    bitmap.getClass();
                    AbstractC59422nl abstractC59422nl = A00.A01;
                    A00(bitmap, abstractC59422nl, str);
                    semaphore.release();
                    return new C61292qr(bitmap, abstractC59422nl.A06, abstractC59422nl.A07, abstractC59422nl.A05, i2);
                }
                semaphore.release();
                return null;
            }
            synchronized (C25761Ni.class) {
                C61262qo A002 = this.A05.A00(c206409Bx, str2, str3, str4, bArr, -1.0f, i, i2, i3, z);
                if (A002 != null) {
                    Bitmap bitmap2 = A002.A00;
                    if (bitmap2 == null) {
                        bitmap2 = A002.A01.A00();
                    }
                    if (iArr != null) {
                        bitmap2.getClass();
                        bitmap2 = C1NC.A0B(bitmap2, iArr[0], iArr[1], false);
                    }
                    bitmap2.getClass();
                    AbstractC59422nl abstractC59422nl2 = A002.A01;
                    A00(bitmap2, abstractC59422nl2, str);
                    Bitmap bitmap3 = bitmap2;
                    c61292qr = new C61292qr(bitmap3, abstractC59422nl2.A06, abstractC59422nl2.A07, abstractC59422nl2.A05, i2);
                }
            }
            return c61292qr;
        } catch (OutOfMemoryError e) {
            C25901Nx c25901Nx = this.A03.A00;
            int i5 = 0;
            for (Object obj : c25901Nx.A04().keySet()) {
                C14360o3.A0B(obj, 0);
                AbstractC59422nl abstractC59422nl3 = (AbstractC59422nl) c25901Nx.A02(obj);
                if (abstractC59422nl3 != null) {
                    i4 = abstractC59422nl3.A02;
                } else {
                    i4 = 0;
                }
                i5 += i4;
            }
            float f = (i5 / 1024.0f) / 1024.0f;
            C0w9.A01.EmP("image_ram_cache_oom", AnonymousClass001.A0N("cached mb: ", f), e);
            C0K8.A0L("InMemoryBitmapCache", "OOM decoding bitmap sourceModule:%s, total cache mb: %s, assetUrl: %s", e, str3, Float.valueOf(f), str4);
            throw e;
        }
    }

    public final C61292qr A04(ImageCacheKey imageCacheKey, ImageCacheKey imageCacheKey2, float f, int i, int i2) {
        final int i3;
        Bitmap A00;
        C25891Nw c25891Nw = this.A03;
        String str = imageCacheKey.A03;
        C14360o3.A0B(str, 0);
        AbstractC59422nl abstractC59422nl = (AbstractC59422nl) c25891Nw.A00.A02(str);
        final Bitmap bitmap = null;
        if (abstractC59422nl != null && (i3 = abstractC59422nl.A04) <= i) {
            final float f2 = abstractC59422nl.A01;
            if ((f2 == -1.0f || Math.abs(f2 - f) < 0.01f) && (A00 = abstractC59422nl.A00()) != null) {
                if (i2 > 0) {
                    A00 = C1NC.A0B(A00, i2, (A00.getHeight() * i2) / A00.getWidth(), false);
                    if (imageCacheKey2 != null) {
                        Bitmap bitmap2 = A00;
                        if (A08) {
                            bitmap2 = null;
                        }
                        final WeakReference weakReference = new WeakReference(bitmap2);
                        final int i4 = abstractC59422nl.A03;
                        final int byteCount = A00.getByteCount();
                        final int i5 = abstractC59422nl.A05;
                        final String str2 = abstractC59422nl.A07;
                        final C206409Bx c206409Bx = abstractC59422nl.A06;
                        if (A08) {
                            bitmap = A00;
                        }
                        A00(A00, new AbstractC59422nl(bitmap, c206409Bx, str2, f2, i3, i4, byteCount, i5) { // from class: X.9gW
                            @Override // X.AbstractC59422nl
                            public final Bitmap A00() {
                                if (C25761Ni.A08) {
                                    return super.A00;
                                }
                                return (Bitmap) weakReference.get();
                            }
                        }, imageCacheKey2.A03);
                    }
                }
                return new C61292qr(A00, abstractC59422nl.A06, abstractC59422nl.A07, abstractC59422nl.A05, abstractC59422nl.A03);
            }
        }
        return null;
    }

    @Override // X.InterfaceC220315d
    public final void F8d(C1KJ c1kj) {
        if (Arrays.asList(C1KJ.A09, C1KJ.A06, C1KJ.A07, C1KJ.A08).contains(c1kj)) {
            A07 = false;
        }
    }

    public C25761Ni(C0f6 c0f6, C25891Nw c25891Nw, AbstractC25921Nz abstractC25921Nz, C1O0 c1o0) {
        this.A03 = c25891Nw;
        this.A05 = abstractC25921Nz;
        this.A04 = c1o0;
        this.A02 = c0f6;
        AbstractC25061Kk.A00().EDS(this);
    }

    public final void finalize() {
        AbstractC25061Kk.A00().A09(this);
    }
}
