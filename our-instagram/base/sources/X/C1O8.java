package X;

import com.instagram.common.typedurl.ImageCacheKey;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

/* renamed from: X.1O8, reason: invalid class name */
/* loaded from: classes.dex */
public final class C1O8 {
    public static final C1O8 A04 = new C1O8(1, 1, false, false);
    public final C223016j A00;
    public final C223016j A01;
    public final boolean A02;
    public final boolean A03;

    public static final void A03(C1O8 c1o8) {
        if (c1o8.A03) {
            C0w9.A03("ImageCacheKeysHelper", "Trying to use logical similarity for cached images in direct similarity mode");
        }
    }

    public C1O8(int i, int i2, boolean z, boolean z2) {
        this.A02 = z;
        this.A03 = z2;
        this.A01 = new C223016j(i);
        this.A00 = new C223016j(i2);
    }

    public static final ImageCacheKey A00(C223016j c223016j, C1O8 c1o8, ImageCacheKey imageCacheKey) {
        int i;
        A03(c1o8);
        int i2 = imageCacheKey.A01;
        ImageCacheKey imageCacheKey2 = null;
        if (i2 > 0 && (i = imageCacheKey.A00) > 0) {
            float f = i2 / i;
            List<ImageCacheKey> list = (List) c223016j.A02(imageCacheKey.A02);
            if (list != null) {
                synchronized (list) {
                    for (ImageCacheKey imageCacheKey3 : list) {
                        if (!C14360o3.A0K(imageCacheKey3, imageCacheKey)) {
                            int i3 = imageCacheKey3.A01;
                            if (Math.abs((i3 / imageCacheKey3.A00) - f) < 0.01f && i3 >= i2 && (imageCacheKey2 == null || imageCacheKey2.A01 > i3)) {
                                imageCacheKey2 = imageCacheKey3;
                            }
                        }
                    }
                }
                return imageCacheKey2;
            }
        }
        return null;
    }

    public static final ImageCacheKey A01(C1O8 c1o8, String str) {
        List list;
        A03(c1o8);
        List A03 = new C11L("_").A03(str);
        if (!A03.isEmpty()) {
            ListIterator listIterator = A03.listIterator(A03.size());
            while (listIterator.hasPrevious()) {
                if (((String) listIterator.previous()).length() != 0) {
                    list = AbstractC001800i.A0d(A03, listIterator.nextIndex() + 1);
                    break;
                }
            }
        }
        list = C16930sl.A00;
        String[] strArr = (String[]) list.toArray(new String[0]);
        if (strArr.length != 3) {
            return null;
        }
        try {
            return new ImageCacheKey(str, strArr[0], Integer.parseInt(strArr[1]), Integer.parseInt(strArr[2]));
        } catch (NumberFormatException unused) {
            return null;
        }
    }

    public static final void A02(C223016j c223016j, C1O8 c1o8, ImageCacheKey imageCacheKey) {
        A03(c1o8);
        if (imageCacheKey.A01 > 0 && imageCacheKey.A00 > 0) {
            String str = imageCacheKey.A02;
            Object A02 = c223016j.A02(str);
            if (A02 == null) {
                A02 = new LinkedList();
                c223016j.A06(str, A02);
            }
            synchronized (A02) {
                List list = (List) A02;
                if (!list.contains(imageCacheKey)) {
                    list.add(imageCacheKey);
                }
            }
        }
    }
}
