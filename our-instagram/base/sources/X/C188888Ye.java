package X;

import android.app.Activity;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.R;
import com.instagram.common.gallery.Medium;
import com.instagram.common.session.UserSession;
import java.io.IOException;
import java.io.StringWriter;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: X.8Ye, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C188888Ye {
    public Medium A00;
    public C203238yg A01;
    public WeakReference A02;
    public final int A03;
    public final int A04;
    public final int A05;
    public final Activity A06;
    public final Drawable A07;
    public final C8SF A08;
    public final UserSession A09;
    public final AnonymousClass835 A0A;
    public final C188918Yh A0B;
    public final C188858Yb A0C;
    public final C188898Yf A0D;
    public final Map A0E;
    public final boolean A0F;
    public final View A0G;
    public final AnonymousClass856 A0H;
    public final BB7 galleryButtonDraftThumbnailLoaderListener;
    public InterfaceC193488hT galleryButtonMediumThumbnailLoaderListener;
    public BDL storyDraftThumbnailLoaderListener;

    public C188888Ye(Activity activity, View view, ViewGroup viewGroup, C8SF c8sf, UserSession userSession, AnonymousClass835 anonymousClass835, C188858Yb c188858Yb, AnonymousClass856 anonymousClass856) {
        C14360o3.A0B(viewGroup, 4);
        this.A06 = activity;
        this.A09 = userSession;
        this.A0C = c188858Yb;
        this.A0A = anonymousClass835;
        this.A08 = c8sf;
        this.A0H = anonymousClass856;
        this.A0G = view;
        int A04 = (int) AbstractC13880nE.A04(activity, 34);
        this.A05 = A04;
        this.A03 = (int) AbstractC13880nE.A04(activity, 2);
        this.A04 = activity.getResources().getDimensionPixelSize(R.dimen.abc_button_padding_horizontal_material);
        this.A0F = AbstractC53242c7.A0L(activity, R.attr.quickCaptureControllerGalleryButtonCircular, false);
        this.A07 = activity.getDrawable(R.drawable.instagram_photo_filled_44);
        this.A0D = new C188898Yf(userSession, A04, A04);
        this.A0B = new C188918Yh(viewGroup, anonymousClass835, this);
        this.A0E = new HashMap();
    }

    public final void A01(List list) {
        if (list.isEmpty()) {
            this.A0A.EW1(this.A07);
            this.A00 = null;
            return;
        }
        Medium medium = (Medium) list.get(0);
        this.A00 = medium;
        InterfaceC193488hT interfaceC193488hT = new InterfaceC193488hT() { // from class: X.8hS
            @Override // X.InterfaceC193488hT
            public final boolean CXZ(Medium medium2) {
                C14360o3.A0B(medium2, 0);
                return C14360o3.A0K(C188888Ye.this.A00, medium2);
            }

            @Override // X.InterfaceC193488hT
            public final void Dt1(Bitmap bitmap, Medium medium2, boolean z) {
                C14360o3.A0B(medium2, 0);
                C14360o3.A0B(bitmap, 2);
                C188888Ye c188888Ye = C188888Ye.this;
                c188888Ye.galleryButtonMediumThumbnailLoaderListener = null;
                C193568hb c193568hb = new C193568hb(c188888Ye.A06, bitmap, c188888Ye.A03, c188888Ye.A04, c188888Ye.A05, medium2.A07, c188888Ye.A0F);
                c188888Ye.A02 = new WeakReference(c193568hb);
                c188888Ye.A0A.EW1(c193568hb);
                Iterator it = c188888Ye.A0E.values().iterator();
                if (it.hasNext()) {
                    it.next();
                    throw new NullPointerException("onDrawableUpdate");
                }
                String str = medium2.A0a;
                if (str != null && str.length() != 0 && !C14360o3.A0K(C8IQ.A00, str)) {
                    InterfaceC19630xq A00 = C8IQ.A00();
                    C14360o3.A0A(A00);
                    InterfaceC19610xo ARD = A00.ARD();
                    try {
                        StringWriter stringWriter = new StringWriter();
                        C17z A0A = AbstractC221915u.A00.A0A(stringWriter);
                        C8IR.A00(A0A, medium2);
                        A0A.close();
                        ARD.E7K("GalleryThumbnailMedium", stringWriter.toString());
                        ARD.apply();
                        C8IQ.A00 = str;
                    } catch (IOException e) {
                        StringBuilder sb = new StringBuilder();
                        sb.append("failed to serialize medium: ");
                        sb.append(medium2);
                        AbstractC12120kG.A0A("GalleryThumbnailCacheUtil", sb.toString(), e);
                    }
                }
            }

            @Override // X.InterfaceC193488hT
            public final void DN1(Medium medium2, String str) {
                C188888Ye c188888Ye = C188888Ye.this;
                c188888Ye.galleryButtonMediumThumbnailLoaderListener = null;
                c188888Ye.A0A.EW1(c188888Ye.A07);
                Iterator it = c188888Ye.A0E.values().iterator();
                if (it.hasNext()) {
                    it.next();
                    throw new NullPointerException("onDrawableUpdate");
                }
            }
        };
        this.galleryButtonMediumThumbnailLoaderListener = interfaceC193488hT;
        C8SF c8sf = this.A08;
        if (medium != null) {
            c8sf.A04(medium, interfaceC193488hT);
            return;
        }
        throw new IllegalStateException("Required value was null.");
    }

    public final void A00() {
        AnonymousClass834 anonymousClass834 = (AnonymousClass834) this.A0A;
        View view = anonymousClass834.getView();
        if (view.getVisibility() == 0) {
            Activity activity = this.A06;
            String string = activity.getString(2131961168);
            C14360o3.A07(string);
            C5SU c5su = new C5SU(activity, new C149686oL(string));
            c5su.A06(EnumC58132lV.A02);
            view.post(new RunnableC24624AvK(anonymousClass834, c5su));
        }
    }
}
