package X;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.R;
import com.google.android.material.appbar.AppBarLayout;
import com.instagram.common.session.UserSession;
import com.instagram.creation.capture.quickcapture.gallery.gallerygrid.BlockableCoordinatorLayout;
import com.instagram.creation.capture.quickcapture.gallery.gallerygrid.viewmodel.GalleryMemoriesViewModel;
import com.instagram.music.common.model.MusicAssetModel;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.8iK, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C193998iK {
    public RecyclerView A00;
    public MusicAssetModel A01;
    public InterfaceC56392iX A02;
    public final Activity A03;
    public final Context A04;
    public final UserSession A05;
    public final C1810981l A06;
    public final InterfaceC189658ak A07;
    public final C193988iJ A08;
    public final C194048iP A09;
    public final C8YY A0A;
    public final GalleryMemoriesViewModel A0B;
    public final Map A0C;
    public final InterfaceC09390do A0D;
    public final View A0E;
    public final ViewGroup A0F;
    public final BlockableCoordinatorLayout A0G;
    public final InterfaceC16820sZ A0H;

    public C193998iK(Activity activity, ViewGroup viewGroup, ViewGroup viewGroup2, UserSession userSession, C1810981l c1810981l, InterfaceC189658ak interfaceC189658ak, C193988iJ c193988iJ, C8YY c8yy, GalleryMemoriesViewModel galleryMemoriesViewModel, InterfaceC09390do interfaceC09390do, InterfaceC16820sZ interfaceC16820sZ) {
        C14360o3.A0B(viewGroup2, 7);
        this.A03 = activity;
        this.A05 = userSession;
        this.A06 = c1810981l;
        this.A08 = c193988iJ;
        this.A0D = interfaceC09390do;
        this.A0F = viewGroup2;
        this.A0A = c8yy;
        this.A07 = interfaceC189658ak;
        this.A0B = galleryMemoriesViewModel;
        this.A0H = interfaceC16820sZ;
        Context applicationContext = activity.getApplicationContext();
        C14360o3.A07(applicationContext);
        this.A04 = applicationContext;
        View requireViewById = viewGroup.requireViewById(R.id.gallery_destination_bar);
        C14360o3.A07(requireViewById);
        this.A00 = (RecyclerView) requireViewById;
        this.A02 = AbstractC56372iV.A01(viewGroup.requireViewById(R.id.redesigned_gallery_destination_bar_stub), false, false);
        this.A09 = new C194048iP(applicationContext, userSession, new C194008iL(this), new C194018iM(this), new C194028iN(this), new C194038iO(this));
        View requireViewById2 = viewGroup.requireViewById(R.id.gallery_container);
        C14360o3.A07(requireViewById2);
        this.A0E = requireViewById2;
        View requireViewById3 = viewGroup.requireViewById(R.id.gallery_container_coordinator);
        C14360o3.A07(requireViewById3);
        this.A0G = (BlockableCoordinatorLayout) requireViewById3;
        this.A0C = new LinkedHashMap();
    }

    /* JADX WARN: Removed duplicated region for block: B:185:0x0631  */
    /* JADX WARN: Type inference failed for: r10v1, types: [java.lang.Object, X.7zY, X.9l9] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.ArrayList A00() {
        /*
            Method dump skipped, instructions count: 1935
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C193998iK.A00():java.util.ArrayList");
    }

    public final void A01() {
        boolean z = !(this.A08.A03.A08.A00 instanceof C81R);
        ViewGroup viewGroup = this.A0F;
        int i = 8;
        if (z) {
            i = 0;
        }
        viewGroup.setVisibility(i);
        View view = this.A0E;
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams != null) {
            C56292iI c56292iI = (C56292iI) layoutParams;
            AppBarLayout.ScrollingViewBehavior scrollingViewBehavior = new AppBarLayout.ScrollingViewBehavior();
            if (!z) {
                scrollingViewBehavior = null;
            }
            c56292iI.A00(scrollingViewBehavior);
            view.setLayoutParams(c56292iI);
            this.A0G.requestLayout();
            return;
        }
        throw new NullPointerException(AbstractC111324zv.A00(2777));
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x0020, code lost:
    
        if (X.C18U.A06(X.C06090Tz.A05, r18.A05, 36327297246312934L) != false) goto L8;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00fd  */
    /* JADX WARN: Type inference failed for: r0v22, types: [android.view.ViewGroup$LayoutParams, android.widget.LinearLayout$LayoutParams, X.65g] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A02() {
        /*
            Method dump skipped, instructions count: 280
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C193998iK.A02():void");
    }

    public final void A03() {
        if (this.A08.A04()) {
            ArrayList A00 = A00();
            C2UU c2uu = this.A00.A0A;
            if (c2uu != null) {
                ((C180607zo) c2uu).A00(A00);
            }
        }
    }
}
