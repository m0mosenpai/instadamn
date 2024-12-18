package com.instagram.creation.capture.gallery.ui.preview;

import X.AbstractC001800i;
import X.AbstractC146246iN;
import X.AbstractC166987dD;
import X.AbstractC166997dE;
import X.AbstractC167007dF;
import X.AbstractC167017dG;
import X.AbstractC195408kg;
import X.AbstractC43592JPx;
import X.C0fA;
import X.C14360o3;
import X.C16930sl;
import X.C42E;
import X.C45073Jx2;
import X.C47293Kv4;
import X.C47691L3y;
import X.C48549Ldm;
import X.C50260MHp;
import X.C5L6;
import X.EnumC74213Va;
import X.JQ0;
import X.KL2;
import X.KLB;
import X.M3I;
import X.MN6;
import android.content.Context;
import android.graphics.Bitmap;
import android.util.AttributeSet;
import android.widget.Adapter;
import com.facebook.R;
import com.instagram.common.gallery.Medium;
import com.instagram.common.gallery.RemoteMedia;
import com.instagram.common.gallery.model.GalleryItem;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.widget.reboundviewpager.ReboundViewPager;
import com.instagram.creation.photo.util.ExifImageData;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes8.dex */
public final class GalleryPreviewMultiselectPager extends ReboundViewPager {
    public MN6 A00;
    public Integer A01;
    public List A02;
    public final KL2 A03;
    public final C47691L3y A04;

    public final void setGalleryItems(List list) {
        C14360o3.A0B(list, 0);
        A01(null, this, list);
    }

    public final void setPrerenderedImageData(GalleryItem galleryItem, Bitmap bitmap) {
        Integer num;
        Object obj;
        Integer num2;
        int i;
        C14360o3.A0B(galleryItem, 0);
        Iterator it = this.A02.iterator();
        while (true) {
            num = null;
            if (it.hasNext()) {
                obj = it.next();
                if (C14360o3.A0K(((C45073Jx2) obj).A0B.A0A, galleryItem.A0A)) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        C45073Jx2 c45073Jx2 = (C45073Jx2) obj;
        if (c45073Jx2 != null) {
            Bitmap bitmap2 = c45073Jx2.A02;
            if (bitmap2 != null && bitmap2.sameAs(bitmap)) {
                return;
            }
            Bitmap bitmap3 = c45073Jx2.A02;
            if (bitmap3 != null) {
                bitmap3.recycle();
            }
            c45073Jx2.A02 = bitmap;
            if (bitmap != null) {
                num = Integer.valueOf(bitmap.getWidth());
                num2 = Integer.valueOf(bitmap.getHeight());
            } else {
                num2 = null;
            }
            if (!C14360o3.A0K(this.A01, num) && num != null && num2 != null) {
                int dimensionPixelSize = getResources().getDimensionPixelSize(R.dimen.abc_dialog_padding_material) * 2;
                int intValue = num.intValue();
                int intValue2 = num2.intValue();
                if (intValue <= intValue2) {
                    i = (int) (((intValue2 - dimensionPixelSize) / intValue2) * intValue);
                } else {
                    i = intValue - dimensionPixelSize;
                }
                this.A0C = i;
                this.A0J = new C42E(i, (int) super.A00, 1.0f);
                this.A03.A00 = i;
                this.A01 = num;
            }
            A01(null, this, null);
        }
    }

    public final void setVideoCropType(C5L6 c5l6) {
        C14360o3.A0B(c5l6, 0);
        C47691L3y c47691L3y = this.A04;
        if (c47691L3y.A01 != c5l6) {
            c47691L3y.A01 = c5l6;
            A01(null, this, null);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.util.List, java.lang.Iterable] */
    /* JADX WARN: Type inference failed for: r2v5, types: [java.util.AbstractCollection, java.util.ArrayList] */
    private final List A00(UserSession userSession, List list) {
        Boolean bool;
        Object obj;
        Medium medium;
        ExifImageData exifImageData;
        Bitmap bitmap;
        Bitmap bitmap2;
        float[] fArr;
        ?? r2 = list;
        if (list == null) {
            List list2 = this.A02;
            r2 = AbstractC167007dF.A0i(list2);
            Iterator it = list2.iterator();
            while (it.hasNext()) {
                r2.add(((C45073Jx2) it.next()).A0B);
            }
        }
        ArrayList A0i = AbstractC167007dF.A0i(r2);
        for (GalleryItem galleryItem : r2) {
            Iterator it2 = this.A02.iterator();
            while (true) {
                bool = null;
                if (it2.hasNext()) {
                    obj = it2.next();
                    if (C14360o3.A0K(((C45073Jx2) obj).A0B.A0A, galleryItem.A0A)) {
                        break;
                    }
                } else {
                    obj = null;
                    break;
                }
            }
            C45073Jx2 c45073Jx2 = (C45073Jx2) obj;
            if (userSession != null) {
                RemoteMedia remoteMedia = galleryItem.A04;
                if (remoteMedia != null) {
                    medium = AbstractC195408kg.A00(userSession).A01(remoteMedia);
                } else {
                    medium = null;
                }
            } else {
                medium = null;
            }
            C47691L3y c47691L3y = this.A04;
            boolean z = c47691L3y.A04;
            float f = c47691L3y.A00;
            Float f2 = c47691L3y.A03;
            if (f2 == null || !galleryItem.A06()) {
                f2 = null;
            }
            Float f3 = c47691L3y.A02;
            C5L6 c5l6 = c47691L3y.A01;
            if (c5l6 == null || !galleryItem.A06()) {
                c5l6 = null;
            }
            if (c45073Jx2 != null) {
                bool = c45073Jx2.A05;
                exifImageData = c45073Jx2.A04;
                bitmap = c45073Jx2.A01;
                bitmap2 = c45073Jx2.A02;
                fArr = c45073Jx2.A09;
            } else {
                exifImageData = null;
                bitmap = null;
                bitmap2 = null;
                fArr = null;
            }
            C5L6 c5l62 = c5l6;
            A0i.add(new C45073Jx2(bitmap, bitmap2, medium, galleryItem, c5l62, exifImageData, bool, f2, f3, fArr, f, z));
        }
        return A0i;
    }

    public static final void A01(UserSession userSession, GalleryPreviewMultiselectPager galleryPreviewMultiselectPager, List list) {
        KL2 kl2 = galleryPreviewMultiselectPager.A03;
        kl2.A03 = AbstractC001800i.A0U(galleryPreviewMultiselectPager.A00(userSession, list));
        C0fA.A00(kl2, -726944241);
        galleryPreviewMultiselectPager.A02 = galleryPreviewMultiselectPager.A00(userSession, list);
    }

    public static /* synthetic */ void setGalleryItems$default(GalleryPreviewMultiselectPager galleryPreviewMultiselectPager, List list, GalleryItem galleryItem, UserSession userSession, int i, Object obj) {
        if ((i & 2) != 0) {
            galleryItem = null;
        }
        if ((i & 4) != 0) {
            userSession = null;
        }
        galleryPreviewMultiselectPager.setGalleryItems(list, galleryItem, userSession);
    }

    public final C45073Jx2 getCurrentPreviewItemModel() {
        KL2 kl2 = this.A03;
        return (C45073Jx2) kl2.A03.get(getCurrentDataIndex());
    }

    public final void setCropImageAspectRatio(float f) {
        C47691L3y c47691L3y = this.A04;
        if (c47691L3y.A00 != f) {
            c47691L3y.A00 = f;
            A01(null, this, null);
        }
    }

    public final void setForcedMinZoom(Float f) {
        C47691L3y c47691L3y = this.A04;
        if (!C14360o3.A0J(c47691L3y.A02, f)) {
            c47691L3y.A02 = f;
            A01(null, this, null);
        }
    }

    public final void setListener(MN6 mn6) {
        this.A00 = mn6;
    }

    public final void setVideoPreviewAspectRatio(float f) {
        C47691L3y c47691L3y = this.A04;
        if (!C14360o3.A0I(c47691L3y.A03, f)) {
            c47691L3y.A03 = Float.valueOf(f);
            c47691L3y.A00 = f;
            A01(null, this, null);
        }
    }

    public /* synthetic */ GalleryPreviewMultiselectPager(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, JQ0.A0C(attributeSet, i2), JQ0.A03(i2, i));
    }

    public final void setPlaceholderMediumForGalleryItem(GalleryItem galleryItem, Medium medium) {
        AbstractC167017dG.A1N(galleryItem, medium);
        KL2 kl2 = this.A03;
        for (C45073Jx2 c45073Jx2 : kl2.A03) {
            if (C14360o3.A0K(c45073Jx2.A0B, galleryItem)) {
                c45073Jx2.A03 = medium;
            }
        }
        C0fA.A00(kl2, -396151704);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [android.widget.Adapter, X.KL2, X.6iN] */
    public GalleryPreviewMultiselectPager(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C14360o3.A0B(context, 1);
        this.A04 = new C47691L3y(this);
        C16930sl c16930sl = C16930sl.A00;
        this.A02 = c16930sl;
        C47293Kv4 c47293Kv4 = new C47293Kv4(this);
        KLB klb = new KLB(this, 0);
        ?? abstractC146246iN = new AbstractC146246iN();
        abstractC146246iN.A02 = c47293Kv4;
        abstractC146246iN.A01 = klb;
        abstractC146246iN.A00 = -1;
        abstractC146246iN.A03 = c16930sl;
        this.A03 = abstractC146246iN;
        setAdapter((Adapter) abstractC146246iN);
        setScrollMode(EnumC74213Va.A04);
        setPageSpacing(AbstractC166997dE.A0A(getResources()));
        A0M(10, false);
        A0P(new C48549Ldm(this, 1));
    }

    public final void setGalleryItems(List list, GalleryItem galleryItem, UserSession userSession) {
        C14360o3.A0B(list, 0);
        A01(userSession, this, list);
        if (galleryItem != null) {
            KL2 kl2 = this.A03;
            C50260MHp c50260MHp = new C50260MHp(galleryItem, 48);
            ListIterator A14 = AbstractC43592JPx.A14(kl2.A03);
            while (A14.hasPrevious()) {
                if (AbstractC166987dD.A1a(c50260MHp.invoke(A14.previous()))) {
                    int nextIndex = A14.nextIndex();
                    if (nextIndex >= 0 && nextIndex < kl2.getCount()) {
                        getHandler().post(new M3I(this, nextIndex));
                        return;
                    }
                    return;
                }
            }
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public GalleryPreviewMultiselectPager(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        C14360o3.A0B(context, 1);
    }

    public final void setGalleryItems(List list, GalleryItem galleryItem) {
        C14360o3.A0B(list, 0);
        setGalleryItems(list, galleryItem, null);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public GalleryPreviewMultiselectPager(Context context) {
        this(context, null, 0);
        C14360o3.A0B(context, 1);
    }
}
