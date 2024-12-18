package X;

import android.R;
import android.app.Activity;
import android.app.LoaderManager;
import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.graphics.Rect;
import android.location.Location;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewStub;
import android.widget.FrameLayout;
import android.widget.HorizontalScrollView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.core.app.ComponentActivity;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.shimmer.ShimmerFrameLayout;
import com.google.android.material.appbar.AppBarLayout;
import com.instagram.common.gallery.Draft;
import com.instagram.common.gallery.Medium;
import com.instagram.common.gallery.RemoteMedia;
import com.instagram.common.gallery.metadata.MediaUploadMetadata;
import com.instagram.common.gallery.model.GalleryItem;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.base.IgFrameLayout;
import com.instagram.common.ui.widget.imageview.PunchedOverlayView;
import com.instagram.creation.base.CreationSession;
import com.instagram.creation.base.CropInfo;
import com.instagram.creation.base.ui.ConstrainedTextureView;
import com.instagram.creation.capture.gallery.GalleryPreviewInfo;
import com.instagram.creation.capture.gallery.ui.CropTypeToggleButton;
import com.instagram.creation.capture.gallery.ui.GalleryPickerCoordinatorLayout;
import com.instagram.creation.capture.gallery.ui.GalleryPickerView$SavedState;
import com.instagram.creation.capture.gallery.ui.preview.GalleryPreviewMultiselectPager;
import com.instagram.creation.capture.video.view.IgCaptureVideoPreviewView;
import com.instagram.creation.photo.crop.CropImageView;
import com.instagram.creation.photo.util.ExifImageData;
import com.instagram.debug.devoptions.avatars.ImmersiveAvatarViewerDebugFragment;
import com.instagram.debug.devoptions.section.xme.WearableMediaDownloadManager;
import com.instagram.modal.ModalActivity;
import com.instagram.model.creation.MediaCaptureConfig;
import com.instagram.pendingmedia.model.ClipInfo;
import com.instagram.pendingmedia.model.constants.ShareType;
import com.instagram.ui.widget.mediapicker.Folder;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.webrtc.MediaStreamTrack;

/* renamed from: X.JZs, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class GestureDetectorOnGestureListenerC43829JZs extends LinearLayout implements InterfaceC187288Rv, InterfaceC55932he, InterfaceC195648l5, GestureDetector.OnGestureListener, MQT, MQK, MQQ, GestureDetector.OnDoubleTapListener, MQU, InterfaceC189658ak {
    public float A00;
    public float A01;
    public float A02;
    public float A03;
    public float A04;
    public int A05;
    public int A06;
    public View A07;
    public View A08;
    public C51737MtK A09;
    public AppBarLayout A0A;
    public GalleryItem A0B;
    public ConstrainedTextureView A0C;
    public C44313Ji4 A0D;
    public GalleryPickerCoordinatorLayout A0E;
    public BB6 A0F;
    public L12 A0G;
    public InterfaceC189638ai A0H;
    public GalleryPreviewMultiselectPager A0I;
    public IgCaptureVideoPreviewView A0J;
    public Integer A0K;
    public boolean A0L;
    public boolean A0M;
    public boolean A0N;
    public boolean A0O;
    public boolean A0P;
    public boolean A0Q;
    public boolean A0R;
    public boolean A0S;
    public boolean A0T;
    public boolean A0U;
    public boolean A0V;
    public boolean A0W;
    public boolean A0X;
    public boolean A0Y;
    public float A0Z;
    public int A0a;
    public View A0b;
    public HorizontalScrollView A0c;
    public String A0d;
    public boolean A0e;
    public boolean A0f;
    public boolean A0g;
    public boolean A0h;
    public boolean A0i;
    public boolean A0j;
    public boolean A0k;
    public float[] A0l;
    public final View A0m;
    public final ViewGroup A0n;
    public final FrameLayout A0o;
    public final ImageView A0p;
    public final C22P A0q;
    public final C55982hj A0r;
    public final C55982hj A0s;
    public final C55982hj A0t;
    public final C55982hj A0u;
    public final C55982hj A0v;
    public final C55982hj A0w;
    public final AbstractC59962oe A0x;
    public final C25671My A0y;
    public final UserSession A0z;
    public final C8IY A10;
    public final C43848JaC A11;
    public final C43870Jaa A12;
    public final CropTypeToggleButton A13;
    public final C43830JZt A14;
    public final C47292Kv3 A15;
    public final C43851JaF A16;
    public final InterfaceC189618ag A17;
    public final AnonymousClass840 A18;
    public final AnonymousClass841 A19;
    public final C195398kf A1A;
    public final C43869JaZ A1B;
    public final C43868JaY A1C;
    public final CropImageView A1D;
    public final C9KJ A1E;
    public final C9KK A1F;
    public final C195428ki A1G;
    public final List A1H;
    public final Map A1I;
    public final Map A1J;
    public final java.util.Set A1K;
    public final boolean A1L;
    public final boolean A1M;
    public final boolean A1N;
    public final boolean A1O;
    public final Rect A1P;
    public final GestureDetector A1Q;
    public final ShimmerFrameLayout A1R;
    public final IgFrameLayout A1S;
    public final C43871Jab A1T;
    public final String A1U;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x02c0, code lost:
    
        if (X.C18U.A06(r10, r49, 36324995143709321L) != false) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x0097, code lost:
    
        if (r0.A03 != true) goto L6;
     */
    /* JADX WARN: Type inference failed for: r0v10, types: [java.lang.Object, X.Kv3] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public GestureDetectorOnGestureListenerC43829JZs(android.content.Context r46, X.C22P r47, X.AbstractC59962oe r48, com.instagram.common.session.UserSession r49, X.InterfaceC189618ag r50, X.AnonymousClass840 r51, java.lang.String r52, int r53, boolean r54) {
        /*
            Method dump skipped, instructions count: 1361
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.GestureDetectorOnGestureListenerC43829JZs.<init>(android.content.Context, X.22P, X.2oe, com.instagram.common.session.UserSession, X.8ag, X.840, java.lang.String, int, boolean):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0039, code lost:
    
        if (r5 != null) goto L14;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void A09(com.instagram.common.gallery.model.GalleryItem r14, X.GestureDetectorOnGestureListenerC43829JZs r15, boolean r16, boolean r17) {
        /*
            Method dump skipped, instructions count: 319
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.GestureDetectorOnGestureListenerC43829JZs.A09(com.instagram.common.gallery.model.GalleryItem, X.JZs, boolean, boolean):void");
    }

    /* JADX WARN: Type inference failed for: r1v3, types: [X.2pI, java.lang.Object] */
    public static final void A0K(GestureDetectorOnGestureListenerC43829JZs gestureDetectorOnGestureListenerC43829JZs, List list, List list2) {
        String str;
        int size = gestureDetectorOnGestureListenerC43829JZs.A14.A0M.A06().size();
        C006802i c006802i = C006802i.A0p;
        c006802i.markerAnnotate(R.xml.audio_assets, "gallery_size", size);
        c006802i.markerEnd(R.xml.audio_assets, (short) 2);
        if (A0S(gestureDetectorOnGestureListenerC43829JZs) && !gestureDetectorOnGestureListenerC43829JZs.A1O) {
            Iterator it = gestureDetectorOnGestureListenerC43829JZs.getFolders().iterator();
            while (it.hasNext() && ((str = ((Folder) it.next()).A03) == null || (!str.equals(WearableMediaDownloadManager.MODEL_FIELD_STELLA_PHOTO) && !str.equals("Meta View")))) {
            }
        }
        View folderMenuTooltipAnchor = gestureDetectorOnGestureListenerC43829JZs.getFolderMenuTooltipAnchor();
        if (A0S(gestureDetectorOnGestureListenerC43829JZs)) {
            List folders = gestureDetectorOnGestureListenerC43829JZs.getFolders();
            if (!(folders instanceof Collection) || !folders.isEmpty()) {
                Iterator it2 = folders.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        break;
                    }
                    if (((Folder) it2.next()).A07) {
                        if (new Object().A01(gestureDetectorOnGestureListenerC43829JZs.A0z, true)) {
                            ComponentActivity componentActivity = (ComponentActivity) AbstractC13320mI.A01(gestureDetectorOnGestureListenerC43829JZs.getContext(), FragmentActivity.class);
                            AbstractC23641Du.A05(AbstractC43592JPx.A0W(C12L.A00, 281480192), new MC7(folderMenuTooltipAnchor, componentActivity, gestureDetectorOnGestureListenerC43829JZs, null, 30), C07Y.A00(componentActivity));
                        }
                    }
                }
            }
        }
        InterfaceC189638ai interfaceC189638ai = gestureDetectorOnGestureListenerC43829JZs.A0H;
        if (interfaceC189638ai != null) {
            interfaceC189638ai.DS2(gestureDetectorOnGestureListenerC43829JZs, list, list2);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x004a, code lost:
    
        if (X.C43830JZt.A08(r2) != false) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A0V() {
        /*
            r3 = this;
            r0 = 1
            r3.A0f = r0
            r3.A05()
            X.JZt r2 = r3.A14
            com.instagram.common.session.UserSession r0 = r2.A0C
            boolean r0 = X.AbstractC193398hK.A01(r0)
            if (r0 == 0) goto L3a
            android.content.Context r0 = r2.A08
            boolean r0 = X.AbstractC93174Ft.A03(r0)
            if (r0 == 0) goto L3a
        L18:
            r0 = 0
            X.C43830JZt.A0U = r0
        L1b:
            r2.A0E()
        L1e:
            X.JaK r0 = r2.A0G
            androidx.recyclerview.widget.RecyclerView r1 = r0.A00
            X.2tR r0 = r2.A0J
            r1.A14(r0)
            X.8Yv r0 = r2.A0M
            r0.A09()
            A0G(r3)
            X.Jaf r2 = new X.Jaf
            r2.<init>(r3)
            r0 = 1000(0x3e8, double:4.94E-321)
            X.C11T.A04(r2, r0)
            return
        L3a:
            boolean r0 = r2.A0P
            if (r0 != 0) goto L1b
            android.content.Context r0 = r2.A08
            boolean r0 = X.AbstractC93174Ft.A03(r0)
            if (r0 == 0) goto L1e
            boolean r0 = X.C43830JZt.A08(r2)
            if (r0 == 0) goto L1e
            goto L18
        */
        throw new UnsupportedOperationException("Method not decompiled: X.GestureDetectorOnGestureListenerC43829JZs.A0V():void");
    }

    public final void A0X(A5B a5b, ArrayList arrayList, boolean z) {
        Medium A01;
        int i;
        UserSession userSession = this.A0z;
        AbstractC43847JaB.A00(userSession).A02 = true;
        C22P c22p = this.A0q;
        if (c22p != C22P.A37 && (arrayList.size() != 1 || (((GalleryItem) arrayList.get(0)).A09 != C05F.A01 && !((GalleryItem) arrayList.get(0)).A06()))) {
            MX1.A01(userSession).A06(c22p, arrayList.size(), false);
        }
        C43835JZy c43835JZy = this.A14.A0D;
        if (c43835JZy.A07) {
            LIL.A00.A01(EnumC114925Hg.FEED, userSession, arrayList, this.A1J, z);
        } else if (AbstractC25226BEj.A1b(arrayList)) {
            LIL.A00(EnumC114925Hg.FEED, (GalleryItem) AbstractC001800i.A0I(arrayList), userSession, getGalleryPreviewInfoFromCropController(), z, false);
        }
        if (arrayList.size() > 1) {
            ((C22F) AnonymousClass229.A01(userSession)).A04.A0A = AnonymousClass249.ALBUM;
        }
        ArrayList A1E = AbstractC166987dD.A1E();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            A1E.add(((GalleryItem) it.next()).A0A);
        }
        Map map = this.A1I;
        Iterator A12 = AbstractC43593JPy.A12(map);
        while (A12.hasNext()) {
            Object next = A12.next();
            if (!this.A1K.contains(next) && !AbstractC001800i.A0u(A1E, next)) {
                Object obj = map.get(next);
                if (obj != null) {
                    C47Z c47z = (C47Z) obj;
                    String str = c47z.A35;
                    boolean A11 = c47z.A11();
                    if (A11) {
                        ClipInfo clipInfo = c47z.A1N;
                        i = clipInfo.A05 - clipInfo.A07;
                    } else {
                        i = 0;
                    }
                    Draft draft = new Draft(null, str, c47z.A33, null, i, A11, false, false, !AbstractC167007dF.A1X(c47z.A0D(), ShareType.A09));
                    C14360o3.A0B(draft, 1);
                    GalleryItem galleryItem = new GalleryItem(draft, null, null, null, null, null, null, null, C05F.A01, draft.A04, -1);
                    C47Z BcC = ((InterfaceC189598ae) AbstractC13320mI.A01(getContext(), InterfaceC189598ae.class)).BcC(c47z.A3O);
                    if (BcC != null) {
                        try {
                            arrayList.add(BcC.A0L().indexOf(c47z.A35), galleryItem);
                        } catch (IndexOutOfBoundsException unused) {
                            arrayList.add(galleryItem);
                        }
                        A0M(c47z, c47z.A35);
                    } else {
                        throw AbstractC166987dD.A14("Required value was null.");
                    }
                } else {
                    throw AbstractC166987dD.A14("Required value was null.");
                }
            }
        }
        if (arrayList.size() > 1) {
            this.A1T.A05(EnumC114925Hg.FEED, a5b, getCurrentFolderIdForSave(), arrayList, this.A1J, map, getAlbumAspectRatio(), this.A1O, this.A0R, z);
            return;
        }
        A0I(this);
        GalleryItem galleryItem2 = this.A0B;
        if (galleryItem2 == null) {
            MX1.A01(userSession).A0B(false, "No preview item set");
            return;
        }
        int intValue = galleryItem2.A09.intValue();
        if (intValue != 2) {
            if (intValue != 0) {
                if (intValue != 1) {
                    return;
                }
                C47Z A03 = C25A.A00(userSession).A03(galleryItem2.A0A);
                if (A03 != null) {
                    if (galleryItem2.A01()) {
                        OOR.A01(userSession, A03);
                    }
                    AnonymousClass840 anonymousClass840 = this.A18;
                    OOR.A00(this.A0x, userSession, anonymousClass840, A03, "gallery");
                    boolean A1X = AbstractC167007dF.A1X(A03.A0D(), ShareType.A09);
                    if (!((MX5) this.A19).A01.A0M || A1X) {
                        return;
                    }
                    LBU.A01((Activity) AbstractC13320mI.A01(getContext(), Activity.class), c22p, userSession, anonymousClass840, 10001);
                    return;
                }
                throw AbstractC166987dD.A14("Required value was null.");
            }
            A01 = galleryItem2.A00;
            if (A01 == null) {
                throw AbstractC166987dD.A14("Required value was null.");
            }
        } else {
            RemoteMedia remoteMedia = galleryItem2.A04;
            if (remoteMedia != null) {
                A01 = this.A1G.A01(remoteMedia);
                if (A01 == null) {
                    AbstractC208329Jr.A04(this.A0x, remoteMedia, userSession, "posts", getResources().getString(2131963095), AbstractC31172DnG.A19(c43835JZy.A0V));
                    C9GR.A01(AbstractC166997dE.A0L(this), "gallery_meta_gallery_failed_to_load", 2131963095, 0);
                    return;
                }
                if (this.A0K == C05F.A00 && !A0d()) {
                    this.A0G = new L12(A01, remoteMedia, this);
                    return;
                }
            } else {
                throw AbstractC166987dD.A14("Required value was null.");
            }
        }
        A08(A01, this);
    }

    public final void A0Z(Integer num, List list, int i) {
        C14360o3.A0B(list, 1);
        C189058Yv c189058Yv = this.A14.A0M;
        RunnableC44307Jhy runnableC44307Jhy = new RunnableC44307Jhy(this, num, list, i);
        if (c189058Yv.A04) {
            runnableC44307Jhy.run();
        } else {
            c189058Yv.A02 = runnableC44307Jhy;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0009, code lost:
    
        if (r10 != X.C05F.A0Y) goto L6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0013, code lost:
    
        if (r10 == X.C05F.A0C) goto L11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A0a(java.lang.Integer r10, boolean r11) {
        /*
            r9 = this;
            r1 = 0
            java.lang.Integer r0 = r9.A0K
            r3 = 1
            if (r0 != r10) goto Lb
            java.lang.Integer r0 = X.C05F.A0Y
            r8 = 1
            if (r10 == r0) goto Lc
        Lb:
            r8 = 0
        Lc:
            java.lang.Integer r0 = X.C05F.A0N
            if (r10 == r0) goto L15
            java.lang.Integer r0 = X.C05F.A0C
            r7 = 0
            if (r10 != r0) goto L16
        L15:
            r7 = 1
        L16:
            r9.A0K = r10
            java.lang.Integer r0 = X.C05F.A0u
            if (r10 != r0) goto L99
            com.facebook.shimmer.ShimmerFrameLayout r0 = r9.A1R
            r0.A06(r3)
            com.instagram.common.ui.base.IgFrameLayout r0 = r9.A1S
            r0.setVisibility(r1)
        L26:
            int r1 = r10.intValue()
            r0 = 1065353216(0x3f800000, float:1.0)
            r6 = 0
            switch(r1) {
                case 2: goto L8c;
                case 3: goto L8a;
                case 4: goto L91;
                case 5: goto L94;
                default: goto L30;
            }
        L30:
            r5 = 0
        L31:
            r0 = 0
        L32:
            r4 = 0
        L33:
            X.2hj r2 = r9.A0t
            double r0 = (double) r0
            if (r11 == 0) goto L74
            r2.A06(r0)
            X.2hj r2 = r9.A0w
            double r0 = (double) r6
            r2.A06(r0)
            if (r8 == 0) goto L4a
            X.2hj r2 = r9.A0r
            r0 = 0
            r2.A08(r0, r3)
        L4a:
            X.2hj r2 = r9.A0r
            double r0 = (double) r5
            r2.A06(r0)
            X.2hj r2 = r9.A0s
            double r0 = (double) r4
            r2.A06(r0)
        L56:
            r9.A05()
            X.L12 r3 = r9.A0G
            if (r7 == 0) goto L73
            if (r3 == 0) goto L73
            X.JZs r2 = r3.A02
            r0 = 0
            r2.A0G = r0
            com.instagram.common.gallery.model.GalleryItem r0 = r2.A0B
            if (r0 == 0) goto L73
            com.instagram.common.gallery.RemoteMedia r1 = r0.A04
            com.instagram.common.gallery.RemoteMedia r0 = r3.A01
            if (r1 != r0) goto L73
            com.instagram.common.gallery.Medium r0 = r3.A00
            A08(r0, r2)
        L73:
            return
        L74:
            r2.A08(r0, r3)
            X.2hj r2 = r9.A0w
            double r0 = (double) r6
            r2.A08(r0, r3)
            X.2hj r2 = r9.A0r
            double r0 = (double) r5
            r2.A08(r0, r3)
            X.2hj r2 = r9.A0s
            double r0 = (double) r4
            r2.A08(r0, r3)
            goto L56
        L8a:
            r5 = 0
            goto L32
        L8c:
            r5 = 0
            r0 = 0
            r6 = 1065353216(0x3f800000, float:1.0)
            goto L32
        L91:
            r5 = 1065353216(0x3f800000, float:1.0)
            goto L31
        L94:
            r5 = 0
            r0 = 0
            r4 = 1065353216(0x3f800000, float:1.0)
            goto L33
        L99:
            com.facebook.shimmer.ShimmerFrameLayout r0 = r9.A1R
            r0.A05()
            com.instagram.common.ui.base.IgFrameLayout r1 = r9.A1S
            r0 = 8
            r1.setVisibility(r0)
            goto L26
        */
        throw new UnsupportedOperationException("Method not decompiled: X.GestureDetectorOnGestureListenerC43829JZs.A0a(java.lang.Integer, boolean):void");
    }

    @Override // X.InterfaceC187288Rv
    public final /* synthetic */ void D54(Integer num) {
    }

    @Override // X.MQU
    public final /* synthetic */ void DCF(boolean z) {
    }

    @Override // X.InterfaceC187288Rv
    public final /* synthetic */ void DCd(int i) {
    }

    @Override // X.MQU
    public final void DJF(CropImageView cropImageView) {
        ViewParent parent = cropImageView.getParent();
        if (parent != null) {
            parent.requestDisallowInterceptTouchEvent(false);
        }
        C50699MZu.A04(AbstractC50666MYj.A00(this.A0z), "touch");
    }

    @Override // X.MQK
    public final void DSA(GalleryItem galleryItem, boolean z) {
        C14360o3.A0B(galleryItem, 0);
        A0B(galleryItem, this, z, true, true);
    }

    @Override // X.MQK
    public final void DSB(GalleryItem galleryItem, boolean z) {
        this.A0B = null;
        this.A1J.remove(galleryItem.A0A);
        A0a(C05F.A00, true);
        C43835JZy c43835JZy = this.A14.A0D;
        if (c43835JZy.A07) {
            List list = c43835JZy.A0V;
            if (!AbstractC31172DnG.A19(list).isEmpty()) {
                A0B((GalleryItem) AbstractC31172DnG.A19(list).get(AbstractC31172DnG.A03(AbstractC31172DnG.A19(list), 1)), this, false, false, true);
            }
        }
    }

    @Override // X.InterfaceC189658ak
    public final void DTe(C8Z4 c8z4) {
        C14360o3.A0B(c8z4, 0);
        C43830JZt c43830JZt = this.A14;
        C8Z4 A0B = c43830JZt.A0B();
        Integer CBv = A0B.CBv();
        Integer CBv2 = c8z4.CBv();
        if (CBv != CBv2 || A0B.BF3() != c8z4.BF3()) {
            if (CBv2 == C05F.A00) {
                this.A17.DYa((Folder) c8z4);
                c43830JZt.A0I(c8z4);
            } else {
                if (CBv2 != C05F.A01) {
                    return;
                }
                this.A17.DYb((C24164Ann) c8z4);
            }
        }
    }

    @Override // X.InterfaceC187288Rv
    public final /* synthetic */ void DkG() {
    }

    @Override // X.InterfaceC55932he
    public final void Dnj(C55982hj c55982hj) {
        View view;
        C14360o3.A0B(c55982hj, 0);
        if (c55982hj == this.A0v) {
            setChildViewTranslationY((int) c55982hj.A09.A00);
            return;
        }
        if (c55982hj == this.A0t) {
            if (c55982hj.A01 != 1.0d) {
                return;
            } else {
                view = this.A1D;
            }
        } else if (c55982hj == this.A0w) {
            if (c55982hj.A01 != 1.0d) {
                return;
            }
            IgCaptureVideoPreviewView igCaptureVideoPreviewView = this.A0J;
            if (igCaptureVideoPreviewView != null) {
                igCaptureVideoPreviewView.setVisibility(0);
            }
            view = this.A08;
            if (view == null) {
                return;
            }
        } else if (c55982hj == this.A0r) {
            if (c55982hj.A01 != 1.0d) {
                return;
            } else {
                view = this.A0p;
            }
        } else if (c55982hj != this.A0s || c55982hj.A01 != 1.0d) {
            return;
        } else {
            view = this.A0o;
        }
        view.setVisibility(0);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:26:? A[RETURN, SYNTHETIC] */
    @Override // X.InterfaceC55932he
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void Dnk(X.C55982hj r10) {
        /*
            r9 = this;
            r6 = 0
            X.C14360o3.A0B(r10, r6)
            X.2hj r7 = r9.A0v
            if (r10 != r7) goto L11
            X.2hk r0 = r10.A09
            double r1 = r0.A00
            int r0 = (int) r1
            r9.setChildViewTranslationY(r0)
        L10:
            return
        L11:
            X.2hj r0 = r9.A0t
            r2 = 0
            r8 = 8
            if (r10 != r0) goto L25
            double r0 = r10.A01
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 != 0) goto L65
            com.instagram.creation.photo.crop.CropImageView r0 = r9.A1D
        L21:
            r0.setVisibility(r8)
            return
        L25:
            X.2hj r0 = r9.A0w
            if (r10 != r0) goto L3b
            double r0 = r10.A01
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 != 0) goto L65
            com.instagram.creation.capture.video.view.IgCaptureVideoPreviewView r0 = r9.A0J
            if (r0 == 0) goto L36
            r0.setVisibility(r8)
        L36:
            android.view.View r0 = r9.A08
            if (r0 == 0) goto L10
            goto L21
        L3b:
            X.2hj r0 = r9.A0r
            if (r10 != r0) goto L48
            double r4 = r10.A01
            int r0 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r0 != 0) goto L65
            android.widget.ImageView r0 = r9.A0p
            goto L21
        L48:
            X.2hj r0 = r9.A0s
            if (r10 != r0) goto L10
            double r4 = r10.A01
            int r0 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r0 != 0) goto L65
            android.widget.FrameLayout r1 = r9.A0o
            r1.setVisibility(r8)
            X.9KJ r0 = r9.A1E
            r0.A00()
            com.instagram.creation.base.ui.ConstrainedTextureView r0 = r9.A0C
            r1.removeView(r0)
            r0 = 0
            r9.A0C = r0
            return
        L65:
            X.8ai r0 = r9.A0H
            if (r0 == 0) goto L6c
            r0.DJ1(r9)
        L6c:
            boolean r0 = r9.A0Y
            if (r0 == 0) goto L10
            r4 = 1
            boolean r0 = r9.A1M
            if (r0 == 0) goto L88
            com.google.android.material.appbar.AppBarLayout r1 = r9.A0A
            if (r1 == 0) goto L88
            r0 = 13
            r1.A03 = r0
            r1.requestLayout()
            r9.A0Q = r4
        L82:
            r9.A05()
            r9.A0Y = r6
            return
        L88:
            r9.A0U = r4
            r9.A06()
            r7.A06(r2)
            goto L82
        */
        throw new UnsupportedOperationException("Method not decompiled: X.GestureDetectorOnGestureListenerC43829JZs.Dnk(X.2hj):void");
    }

    @Override // X.InterfaceC55932he
    public final void Dnl(C55982hj c55982hj) {
    }

    @Override // X.InterfaceC55932he
    public final void Dnm(C55982hj c55982hj) {
        View view;
        C14360o3.A0B(c55982hj, 0);
        if (c55982hj == this.A0u) {
            A07(c55982hj);
            return;
        }
        if (c55982hj == this.A0v) {
            setChildViewTranslationY((int) c55982hj.A09.A00);
            A07(c55982hj);
            A0E(this);
            return;
        }
        if (c55982hj == this.A0t) {
            view = this.A1D;
        } else if (c55982hj == this.A0w) {
            view = this.A0J;
            if (view == null) {
                return;
            }
        } else if (c55982hj == this.A0r) {
            view = this.A0p;
        } else if (c55982hj != this.A0s) {
            return;
        } else {
            view = this.A0o;
        }
        view.setAlpha((float) c55982hj.A09.A00);
    }

    @Override // X.MQQ
    public final /* synthetic */ void Drj(float f, float f2) {
    }

    @Override // X.MQQ
    public final /* synthetic */ void Drl(com.instagram.creation.base.ui.mediatabbar.Tab tab) {
    }

    @Override // X.InterfaceC187288Rv
    public final /* synthetic */ void Dve(C26086BgF c26086BgF) {
    }

    @Override // X.InterfaceC187288Rv
    public final /* synthetic */ void Dvh() {
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0042, code lost:
    
        if (r1 != 5) goto L16;
     */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0039  */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean dispatchTouchEvent(android.view.MotionEvent r10) {
        /*
            Method dump skipped, instructions count: 252
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.GestureDetectorOnGestureListenerC43829JZs.dispatchTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override // android.view.GestureDetector.OnDoubleTapListener
    public final boolean onDoubleTap(MotionEvent motionEvent) {
        return false;
    }

    @Override // android.view.GestureDetector.OnDoubleTapListener
    public final boolean onDoubleTapEvent(MotionEvent motionEvent) {
        return false;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final boolean onDown(MotionEvent motionEvent) {
        C14360o3.A0B(motionEvent, 0);
        this.A03 = 0.0f;
        this.A0L = false;
        this.A0M = false;
        this.A01 = motionEvent.getRawY();
        this.A0Z = 0.0f;
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0029, code lost:
    
        if (r5.A14.A0A() != 0) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0043, code lost:
    
        if (r5.A0W == false) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0037, code lost:
    
        if (r5.A0j != false) goto L18;
     */
    @Override // android.view.ViewGroup
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onInterceptTouchEvent(android.view.MotionEvent r6) {
        /*
            r5 = this;
            r1 = 0
            X.C14360o3.A0B(r6, r1)
            android.view.GestureDetector r0 = r5.A1Q
            r0.onTouchEvent(r6)
            boolean r0 = r5.A1M
            r4 = 0
            if (r0 == 0) goto Lf
            return r1
        Lf:
            A0E(r5)
            boolean r0 = r5.A0b()
            if (r0 == 0) goto L2b
            float r1 = r6.getRawY()
            float r0 = r5.A01
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 <= 0) goto L2b
            X.JZt r0 = r5.A14
            int r0 = r0.A0A()
            r3 = 1
            if (r0 == 0) goto L2c
        L2b:
            r3 = 0
        L2c:
            boolean r0 = r5.A0V
            if (r0 == 0) goto L34
            boolean r0 = r5.A0k
            if (r0 != 0) goto L39
        L34:
            boolean r0 = r5.A0j
            r2 = 0
            if (r0 == 0) goto L3a
        L39:
            r2 = 1
        L3a:
            boolean r0 = r5.A0b()
            if (r0 == 0) goto L45
            boolean r0 = r5.A0W
            r1 = 1
            if (r0 != 0) goto L46
        L45:
            r1 = 0
        L46:
            boolean r0 = r5.A0M
            if (r0 == 0) goto L4e
            if (r3 != 0) goto L50
            if (r2 != 0) goto L50
        L4e:
            if (r1 == 0) goto L51
        L50:
            r4 = 1
        L51:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: X.GestureDetectorOnGestureListenerC43829JZs.onInterceptTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final void onLongPress(MotionEvent motionEvent) {
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        C14360o3.A0B(motionEvent2, 1);
        float scaledTouchSlop = ViewConfiguration.get(getContext()).getScaledTouchSlop();
        C14360o3.A0A(motionEvent);
        float A00 = (float) AbstractC43594JPz.A00(AbstractC166987dD.A01(motionEvent.getRawX(), motionEvent2.getRawX()), AbstractC166987dD.A01(motionEvent.getRawY(), motionEvent2.getRawY()));
        float degrees = (float) Math.toDegrees(Math.asin(r2 / A00));
        if (A00 > scaledTouchSlop && !this.A0L && !this.A0M) {
            if (degrees > 45.0f) {
                this.A0M = true;
            } else {
                this.A0L = true;
            }
        }
        this.A0Z = f2;
        return false;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final void onShowPress(MotionEvent motionEvent) {
    }

    @Override // android.view.GestureDetector.OnDoubleTapListener
    public final boolean onSingleTapConfirmed(MotionEvent motionEvent) {
        return false;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final boolean onSingleTapUp(MotionEvent motionEvent) {
        AppBarLayout appBarLayout;
        C14360o3.A0B(motionEvent, 0);
        ViewGroup viewGroup = this.A0n;
        Rect rect = this.A1P;
        viewGroup.getHitRect(rect);
        if (!AbstractC43594JPz.A1V(rect, motionEvent)) {
            return false;
        }
        if (this.A1M && (appBarLayout = this.A0A) != null) {
            appBarLayout.A03 = 13;
            appBarLayout.requestLayout();
            this.A0Q = true;
            return true;
        }
        this.A0U = false;
        A06();
        this.A0v.A04();
        return true;
    }

    private final C47Z A01(GalleryItem galleryItem) {
        if (galleryItem != null) {
            Map map = this.A1I;
            String str = galleryItem.A0A;
            if (map.containsKey(str)) {
                return (C47Z) map.get(str);
            }
            if (galleryItem.A09 == C05F.A01) {
                return AbstractC43593JPy.A0h(this.A0z, str);
            }
            return null;
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x003b, code lost:
    
        if (r3.A00() == r0.A01()) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x0010, code lost:
    
        if (r4.A14.A0D.A07 != false) goto L6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0012, code lost:
    
        r0 = android.widget.ImageView.ScaleType.CENTER_CROP;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x003d, code lost:
    
        r0 = android.widget.ImageView.ScaleType.FIT_CENTER;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void A02() {
        /*
            r4 = this;
            X.Jaa r3 = r4.A12
            java.lang.Integer r1 = r3.A03
            java.lang.Integer r0 = X.C05F.A0C
            if (r1 != r0) goto L18
            android.widget.ImageView r2 = r4.A0p
            X.JZt r0 = r4.A14
            X.JZy r0 = r0.A0D
            boolean r0 = r0.A07
            if (r0 == 0) goto L3d
        L12:
            android.widget.ImageView$ScaleType r0 = android.widget.ImageView.ScaleType.CENTER_CROP
        L14:
            r2.setScaleType(r0)
        L17:
            return
        L18:
            com.instagram.common.gallery.model.GalleryItem r0 = r4.A0B
            if (r0 == 0) goto L17
            com.instagram.common.session.UserSession r0 = r4.A0z
            com.instagram.pendingmedia.store.PendingMediaStore r1 = X.C25A.A00(r0)
            com.instagram.common.gallery.model.GalleryItem r0 = r4.A0B
            X.C14360o3.A0A(r0)
            java.lang.String r0 = r0.A0A
            X.47Z r0 = r1.A03(r0)
            if (r0 == 0) goto L40
            android.widget.ImageView r2 = r4.A0p
            float r1 = r3.A00()
            float r0 = r0.A01()
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 != 0) goto L12
        L3d:
            android.widget.ImageView$ScaleType r0 = android.widget.ImageView.ScaleType.FIT_CENTER
            goto L14
        L40:
            java.lang.String r2 = "draft_media_not_found"
            java.lang.String r1 = "GalleryPickerView.maybeCropDraftPhoto() draftMedia is null"
            r0 = 0
            X.AbstractC12120kG.A0A(r2, r1, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.GestureDetectorOnGestureListenerC43829JZs.A02():void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x002e, code lost:
    
        if (r0 == false) goto L12;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void A03() {
        /*
            r5 = this;
            com.instagram.common.gallery.model.GalleryItem r0 = r5.A0B
            if (r0 == 0) goto L5f
            com.instagram.creation.base.ui.ConstrainedTextureView r0 = r5.A0C
            if (r0 == 0) goto L5f
            com.instagram.common.session.UserSession r3 = r5.A0z
            com.instagram.pendingmedia.store.PendingMediaStore r1 = X.C25A.A00(r3)
            com.instagram.common.gallery.model.GalleryItem r0 = r5.A0B
            X.C14360o3.A0A(r0)
            java.lang.String r0 = r0.A0A
            X.47Z r0 = r1.A03(r0)
            if (r0 == 0) goto L6b
            float r4 = r0.A02
            r0 = 0
            int r0 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r0 != 0) goto L30
            X.0Tz r2 = X.C06090Tz.A05
            r0 = 36318393779361921(0x81076300081881, double:3.0312366962774384E-306)
            boolean r0 = X.C18U.A06(r2, r3, r0)
            r3 = 1
            if (r0 != 0) goto L31
        L30:
            r3 = 0
        L31:
            X.Jaa r2 = r5.A12
            java.lang.Integer r1 = r2.A03
            java.lang.Integer r0 = X.C05F.A0C
            boolean r0 = X.AbstractC167007dF.A1X(r1, r0)
            r1 = 1065353216(0x3f800000, float:1.0)
            if (r0 == 0) goto L60
            X.JZt r0 = r5.A14
            X.JZy r0 = r0.A0D
            boolean r0 = r0.A07
            if (r0 == 0) goto L68
        L47:
            if (r3 != 0) goto L68
            int r0 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
            if (r0 > 0) goto L4f
            float r4 = r1 / r4
        L4f:
            com.instagram.creation.base.ui.ConstrainedTextureView r0 = r5.A0C
            X.C14360o3.A0A(r0)
            r0.setScaleX(r4)
            com.instagram.creation.base.ui.ConstrainedTextureView r0 = r5.A0C
            X.C14360o3.A0A(r0)
            r0.setScaleY(r4)
        L5f:
            return
        L60:
            float r0 = r2.A00()
            int r0 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r0 != 0) goto L47
        L68:
            r4 = 1065353216(0x3f800000, float:1.0)
            goto L4f
        L6b:
            java.lang.IllegalStateException r0 = X.AbstractC166997dE.A0g()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.GestureDetectorOnGestureListenerC43829JZs.A03():void");
    }

    private final void A04() {
        View inflate;
        if (this.A19.AGq() == EnumC69983Ch.A05) {
            UserSession userSession = this.A0z;
            if (C18U.A06(AbstractC166997dE.A0U(userSession), userSession, 36328053160623170L)) {
                ViewGroup viewGroup = this.A0n;
                ViewStub A07 = AbstractC31171DnF.A07(viewGroup, com.facebook.R.id.punched_overlay_stub);
                if (A07 == null) {
                    inflate = AbstractC166997dE.A0R(viewGroup, com.facebook.R.id.punched_overlay_view);
                } else {
                    inflate = A07.inflate();
                    C14360o3.A0C(inflate, "null cannot be cast to non-null type com.instagram.common.ui.widget.imageview.PunchedOverlayView");
                }
                PunchedOverlayView punchedOverlayView = (PunchedOverlayView) inflate;
                punchedOverlayView.A01 = AbstractC167007dF.A09(getContext(), com.facebook.R.attr.profileHighlightThumbnailEditBackground);
                punchedOverlayView.post(new M05(punchedOverlayView));
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x003a, code lost:
    
        if (r0 == false) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x006c, code lost:
    
        r8 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x000a, code lost:
    
        if (r0.A06() == false) goto L6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x0023, code lost:
    
        if (r1 != X.C05F.A0j) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0018, code lost:
    
        if (A0b() == false) goto L11;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:19:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0042 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x007a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void A05() {
        /*
            r9 = this;
            com.instagram.common.gallery.model.GalleryItem r0 = r9.A0B
            r8 = 1
            if (r0 == 0) goto Lc
            boolean r0 = r0.A06()
            r7 = 1
            if (r0 != 0) goto Ld
        Lc:
            r7 = 0
        Ld:
            java.lang.Integer r1 = r9.A0K
            java.lang.Integer r5 = X.C05F.A01
            if (r1 != r5) goto L1a
            boolean r0 = r9.A0b()
            r6 = 1
            if (r0 != 0) goto L25
        L1a:
            r6 = 0
            if (r1 == r5) goto L25
            java.lang.Integer r0 = X.C05F.A0C
            if (r1 == r0) goto L25
            java.lang.Integer r0 = X.C05F.A0j
            if (r1 != r0) goto L6c
        L25:
            boolean r0 = r9.A1M
            if (r0 == 0) goto L63
            boolean r0 = r9.A0P
            if (r0 != 0) goto L61
            boolean r0 = r9.A0Q
            if (r0 != 0) goto L61
            boolean r4 = r9.A0b()
        L35:
            if (r4 == 0) goto L61
            r0 = 0
        L38:
            if (r6 != 0) goto L3c
            if (r0 == 0) goto L6c
        L3c:
            boolean r0 = A0S(r9)
            if (r0 == 0) goto L76
            if (r7 == 0) goto L76
            if (r8 == 0) goto L76
            boolean r0 = r9.A0d()
            if (r0 != 0) goto L76
            com.instagram.common.gallery.model.GalleryItem r0 = r9.A0B
            if (r0 == 0) goto L6e
            java.lang.Integer r0 = r0.A09
            if (r0 != r5) goto L6e
            X.9KJ r0 = r9.A1E
            r0.A03()
            com.instagram.creation.capture.video.view.IgCaptureVideoPreviewView r0 = r9.A0J
            if (r0 == 0) goto L60
            r0.A04()
        L60:
            return
        L61:
            r0 = 1
            goto L38
        L63:
            X.2hj r0 = r9.A0v
            double r2 = r0.A01
            r0 = 0
            int r4 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            goto L35
        L6c:
            r8 = 0
            goto L3c
        L6e:
            com.instagram.creation.capture.video.view.IgCaptureVideoPreviewView r0 = r9.A0J
            if (r0 == 0) goto L7d
            r0.A06()
            goto L7d
        L76:
            com.instagram.creation.capture.video.view.IgCaptureVideoPreviewView r0 = r9.A0J
            if (r0 == 0) goto L7d
            r0.A04()
        L7d:
            X.9KJ r0 = r9.A1E
            r0.A01()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.GestureDetectorOnGestureListenerC43829JZs.A05():void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x0024, code lost:
    
        if (r3.A04() != false) goto L10;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void A06() {
        /*
            r9 = this;
            com.instagram.common.gallery.model.GalleryItem r3 = r9.A0B
            if (r3 == 0) goto L52
            X.JZt r8 = r9.A14
            X.JZy r2 = r8.A0D
            int r7 = r2.A04(r3)
            r0 = 0
            if (r7 < 0) goto L44
            androidx.recyclerview.widget.GridLayoutManager r1 = r8.A09
            int r6 = r1.A00
            java.util.List r0 = r2.A0R
            boolean r5 = X.AbstractC166987dD.A1b(r0)
            boolean r0 = r3.A02()
            if (r0 != 0) goto L26
            boolean r0 = r3.A04()
            r4 = 0
            if (r0 == 0) goto L27
        L26:
            r4 = 1
        L27:
            X.6wP r0 = r1.A01
            X.C14360o3.A07(r0)
            int r3 = r8.A06
            int r2 = r8.A05
            int r1 = r8.A07
            int r0 = r0.A02(r7, r6)
            if (r5 == 0) goto L50
            int r3 = r3 + r2
            int r0 = r0 + (-1)
            if (r4 == 0) goto L40
            int r3 = r3 + r3
            int r0 = r0 + (-1)
        L40:
            int r1 = r1 + r2
            int r0 = r0 * r1
            int r0 = r0 + r3
            int r0 = r0 + r2
        L44:
            r9.A05 = r0
            X.JZt r0 = r9.A14
            int r0 = r0.A0A()
            float r0 = (float) r0
            r9.A02 = r0
            return
        L50:
            r3 = 0
            goto L40
        L52:
            r0 = 0
            goto L44
        */
        throw new UnsupportedOperationException("Method not decompiled: X.GestureDetectorOnGestureListenerC43829JZs.A06():void");
    }

    private final void A07(C55982hj c55982hj) {
        if (!this.A0X) {
            double d = c55982hj.A03;
            double d2 = c55982hj.A01;
            if (d != d2) {
                if (this.A1M) {
                    if (!this.A0P) {
                        return;
                    }
                } else if (this.A0v.A01 != 0.0d) {
                    return;
                }
                if (!this.A0M && this.A0U) {
                    int floor = (int) Math.floor(AbstractC70163Da.A04(c55982hj.A09.A00, d, d2, this.A02, this.A05));
                    C43830JZt c43830JZt = this.A14;
                    c43830JZt.A0G.A00.scrollBy(0, floor - c43830JZt.A0A());
                }
            }
        }
    }

    public static final void A0A(GalleryItem galleryItem, GestureDetectorOnGestureListenerC43829JZs gestureDetectorOnGestureListenerC43829JZs, boolean z, boolean z2, boolean z3) {
        String str;
        MediaUploadMetadata mediaUploadMetadata;
        MediaUploadMetadata A00;
        android.net.Uri A03;
        Medium medium = galleryItem.A00;
        if (medium != null) {
            gestureDetectorOnGestureListenerC43829JZs.A0Y = z;
            gestureDetectorOnGestureListenerC43829JZs.A0a(C05F.A00, true);
            IgCaptureVideoPreviewView igCaptureVideoPreviewView = gestureDetectorOnGestureListenerC43829JZs.A0J;
            if (igCaptureVideoPreviewView != null) {
                igCaptureVideoPreviewView.A04();
            }
            if (!z2 && z3) {
                gestureDetectorOnGestureListenerC43829JZs.A0C(galleryItem, z);
            }
            MediaUploadMetadata mediaUploadMetadata2 = medium.A0G;
            C43830JZt c43830JZt = gestureDetectorOnGestureListenerC43829JZs.A14;
            mediaUploadMetadata2.A01 = c43830JZt.A0B().getName();
            UserSession userSession = gestureDetectorOnGestureListenerC43829JZs.A0z;
            MYZ A01 = MX1.A01(userSession);
            C43835JZy c43835JZy = c43830JZt.A0D;
            boolean z4 = c43835JZy.A07;
            boolean A06 = galleryItem.A06();
            C22P c22p = gestureDetectorOnGestureListenerC43829JZs.A0q;
            C24Q c24q = A01.A0B;
            float[] fArr = null;
            long A032 = c24q.A03(288429634, 15000L);
            A01.A04 = A032;
            if (z4) {
                str = "multi-media";
            } else if (A06) {
                str = MediaStreamTrack.VIDEO_TRACK_KIND;
            } else {
                str = "image";
            }
            c24q.A0A(A032, "media_type", str);
            c24q.A0A(A01.A04, "camera_destination", "feed");
            if (c22p != null) {
                c24q.A0A(A01.A04, ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY, c22p.name());
            }
            int i = medium.A08;
            if (i == 1) {
                if (C18U.A06(C06090Tz.A05, userSession, 36326094655207053L)) {
                    C14120nc.A00().ATO(new C44097JeM(medium, gestureDetectorOnGestureListenerC43829JZs));
                } else {
                    mediaUploadMetadata = medium.A0G;
                    A00 = C9L8.A03(userSession, medium.A0X);
                    mediaUploadMetadata.A00(A00);
                }
            } else if (i == 3) {
                mediaUploadMetadata = medium.A0G;
                A00 = C9L8.A00(AbstractC166997dE.A0L(gestureDetectorOnGestureListenerC43829JZs), medium.A02(), userSession, medium.A0X);
                mediaUploadMetadata.A00(A00);
            }
            MediaUploadMetadata mediaUploadMetadata3 = medium.A0G;
            if (mediaUploadMetadata3.A0B) {
                O00.A00.put(medium.A0X, mediaUploadMetadata3);
            }
            if (medium.A08 == 1) {
                C43869JaZ c43869JaZ = gestureDetectorOnGestureListenerC43829JZs.A1B;
                android.net.Uri uri = c43869JaZ.A01;
                if (uri != null && uri != medium.A02()) {
                    c43869JaZ.A0A = null;
                }
                c43869JaZ.A01 = medium.A02();
                c43869JaZ.A08 = medium.A0X;
                Map map = gestureDetectorOnGestureListenerC43829JZs.A1J;
                String str2 = galleryItem.A0A;
                GalleryPreviewInfo galleryPreviewInfo = (GalleryPreviewInfo) map.get(str2);
                if (galleryPreviewInfo == null) {
                    A03 = android.net.Uri.fromFile(AbstractC13530mf.A04(gestureDetectorOnGestureListenerC43829JZs.getContext()));
                } else {
                    String str3 = galleryPreviewInfo.A02;
                    if (str3 != null) {
                        A03 = AbstractC08820cl.A03(str3);
                    } else {
                        throw AbstractC166987dD.A14("Required value was null.");
                    }
                }
                c43869JaZ.A02 = A03;
                if (gestureDetectorOnGestureListenerC43829JZs.A0l != null && C14360o3.A0K(str2, gestureDetectorOnGestureListenerC43829JZs.A0d)) {
                    c43869JaZ.A0A = gestureDetectorOnGestureListenerC43829JZs.A0l;
                    gestureDetectorOnGestureListenerC43829JZs.A0l = null;
                    gestureDetectorOnGestureListenerC43829JZs.A0d = null;
                } else {
                    if (c43835JZy.A07 && map.containsKey(str2)) {
                        Object obj = map.get(str2);
                        if (obj != null) {
                            fArr = ((GalleryPreviewInfo) obj).A03;
                        } else {
                            throw AbstractC166987dD.A14("Required value was null.");
                        }
                    }
                    c43869JaZ.A0A = fArr;
                }
                int i2 = 0;
                if (z2) {
                    i2 = 54;
                }
                c43869JaZ.A00 = i2;
                C43868JaY c43868JaY = gestureDetectorOnGestureListenerC43829JZs.A1C;
                c43868JaY.A03 = c43869JaZ;
                c43868JaY.A01();
                InterfaceC197178nn interfaceC197178nn = c43868JaY.A05;
                boolean z5 = false;
                if (interfaceC197178nn != null && interfaceC197178nn.getWidth() == interfaceC197178nn.getHeight()) {
                    z5 = true;
                }
                gestureDetectorOnGestureListenerC43829JZs.A0T = z5;
                return;
            }
            if (A0Q(gestureDetectorOnGestureListenerC43829JZs) || igCaptureVideoPreviewView == null) {
                return;
            }
            igCaptureVideoPreviewView.setVideoMedium(medium, new C44301Jhs(gestureDetectorOnGestureListenerC43829JZs));
            return;
        }
        throw AbstractC166987dD.A14("Required value was null.");
    }

    public static final void A0B(GalleryItem galleryItem, GestureDetectorOnGestureListenerC43829JZs gestureDetectorOnGestureListenerC43829JZs, boolean z, boolean z2, boolean z3) {
        if (galleryItem != null) {
            GalleryItem galleryItem2 = gestureDetectorOnGestureListenerC43829JZs.A0B;
            if (galleryItem2 != null && galleryItem2.equals(galleryItem)) {
                return;
            }
            C43835JZy c43835JZy = gestureDetectorOnGestureListenerC43829JZs.A14.A0D;
            if (c43835JZy.A07) {
                gestureDetectorOnGestureListenerC43829JZs.A0N(z3);
            }
            gestureDetectorOnGestureListenerC43829JZs.A0B = galleryItem;
            c43835JZy.A02 = galleryItem;
            C43869JaZ c43869JaZ = gestureDetectorOnGestureListenerC43829JZs.A1B;
            c43869JaZ.A01 = null;
            c43869JaZ.A02 = null;
            c43869JaZ.A08 = null;
            c43869JaZ.A00 = -1;
            A09(galleryItem, gestureDetectorOnGestureListenerC43829JZs, z, z2);
            gestureDetectorOnGestureListenerC43829JZs.A13.setVisibility(AbstractC167007dF.A05(A0P(gestureDetectorOnGestureListenerC43829JZs) ? 1 : 0));
        }
    }

    private final void A0C(GalleryItem galleryItem, boolean z) {
        boolean z2 = this.A1M;
        if (z2 || this.A0v.A01 == 0.0d) {
            C43830JZt c43830JZt = this.A14;
            if (!c43830JZt.A03) {
                if (z) {
                    int i = 1;
                    this.A0U = true;
                    A06();
                    C55982hj c55982hj = this.A0u;
                    if (c55982hj.A01 != 0.0d) {
                        i = 0;
                    }
                    c55982hj.A06(i);
                    return;
                }
                if (z2) {
                    A06();
                    c43830JZt.A0G.A00.scrollBy(0, (int) (this.A05 - this.A02));
                    return;
                }
                c43830JZt.A0G.A00.A0n(c43830JZt.A0D.A04(galleryItem));
            }
        }
    }

    public static final void A0D(C5L6 c5l6, GestureDetectorOnGestureListenerC43829JZs gestureDetectorOnGestureListenerC43829JZs, boolean z) {
        CreationSession creationSession = ((MX5) gestureDetectorOnGestureListenerC43829JZs.A19).A01;
        creationSession.A05 = c5l6;
        GalleryPreviewMultiselectPager galleryPreviewMultiselectPager = gestureDetectorOnGestureListenerC43829JZs.A0I;
        if (galleryPreviewMultiselectPager != null) {
            galleryPreviewMultiselectPager.setVideoCropType(c5l6);
        }
        if (z) {
            if (gestureDetectorOnGestureListenerC43829JZs.A0K == C05F.A0C && !gestureDetectorOnGestureListenerC43829JZs.A0d()) {
                IgCaptureVideoPreviewView igCaptureVideoPreviewView = gestureDetectorOnGestureListenerC43829JZs.A0J;
                if (igCaptureVideoPreviewView != null && igCaptureVideoPreviewView.getVisibility() == 0) {
                    igCaptureVideoPreviewView.requestLayout();
                }
            } else {
                Integer num = gestureDetectorOnGestureListenerC43829JZs.A0K;
                if (num == C05F.A0j) {
                    gestureDetectorOnGestureListenerC43829JZs.A03();
                } else if (num == C05F.A0Y) {
                    gestureDetectorOnGestureListenerC43829JZs.A02();
                } else {
                    CropImageView cropImageView = gestureDetectorOnGestureListenerC43829JZs.A1D;
                    cropImageView.A0I();
                    cropImageView.A0N(AbstractC25229BEm.A1a(c5l6, C5L6.A0E));
                }
            }
            creationSession.A06 = c5l6;
        }
        if (A0P(gestureDetectorOnGestureListenerC43829JZs) && A0T(gestureDetectorOnGestureListenerC43829JZs)) {
            gestureDetectorOnGestureListenerC43829JZs.A13.setCropType(c5l6);
        }
    }

    public static final void A0E(GestureDetectorOnGestureListenerC43829JZs gestureDetectorOnGestureListenerC43829JZs) {
        if (!gestureDetectorOnGestureListenerC43829JZs.A0X && gestureDetectorOnGestureListenerC43829JZs.A0b()) {
            C55982hj c55982hj = gestureDetectorOnGestureListenerC43829JZs.A0v;
            if (c55982hj.A01 != gestureDetectorOnGestureListenerC43829JZs.getTopDockPosition()) {
                gestureDetectorOnGestureListenerC43829JZs.A06();
                c55982hj.A06(gestureDetectorOnGestureListenerC43829JZs.getTopDockPosition());
                gestureDetectorOnGestureListenerC43829JZs.A05();
            }
        }
    }

    public static final void A0F(GestureDetectorOnGestureListenerC43829JZs gestureDetectorOnGestureListenerC43829JZs) {
        String str = gestureDetectorOnGestureListenerC43829JZs.A1U;
        if (str != null && gestureDetectorOnGestureListenerC43829JZs.A0N && !gestureDetectorOnGestureListenerC43829JZs.A0g) {
            C195448kk A00 = AbstractC195438kj.A00(gestureDetectorOnGestureListenerC43829JZs.A0z);
            C14360o3.A0B(A00, 0);
            for (C24164Ann c24164Ann : C9KQ.A01((List) A00.A06.getValue())) {
                if (C14360o3.A0K(c24164Ann.A01, str)) {
                    gestureDetectorOnGestureListenerC43829JZs.A0g = true;
                    gestureDetectorOnGestureListenerC43829JZs.DTe(c24164Ann);
                }
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x0026, code lost:
    
        if (X.C18U.A06(X.C06090Tz.A05, r6.A0z, 36328736060358398L) == false) goto L10;
     */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0041  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void A0G(X.GestureDetectorOnGestureListenerC43829JZs r6) {
        /*
            X.Ji4 r5 = r6.A0D
            if (r5 == 0) goto L75
            X.JZt r0 = r6.A14
            X.JZy r1 = r0.A0D
            boolean r0 = r1.A07
            if (r0 == 0) goto L6d
            java.util.List r4 = r1.A0V
            java.util.List r0 = X.AbstractC31172DnG.A19(r4)
            int r1 = r0.size()
            r0 = 1
            if (r1 > r0) goto L28
            com.instagram.common.session.UserSession r3 = r6.A0z
            X.0Tz r2 = X.C06090Tz.A05
            r0 = 36328736060358398(0x8110cb00043efe, double:3.0377771964246334E-306)
            boolean r0 = X.C18U.A06(r2, r3, r0)
            if (r0 != 0) goto L6d
        L28:
            java.util.List r1 = X.AbstractC31172DnG.A19(r4)
        L2c:
            X.AbstractC167007dF.A1C(r1)
            X.8Ry r0 = r5.A01
            X.7Dc r6 = r0.A0R
            java.util.ArrayList r5 = X.AbstractC166987dD.A1E()
            java.util.Iterator r4 = r1.iterator()
        L3b:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L72
            java.lang.Object r1 = r4.next()
            com.instagram.common.gallery.model.GalleryItem r1 = (com.instagram.common.gallery.model.GalleryItem) r1
            boolean r0 = r1.A02()
            r3 = 0
            if (r0 == 0) goto L66
            com.instagram.common.gallery.Medium r2 = r1.A00
            if (r2 == 0) goto L3b
            int r0 = r2.A05
            java.lang.String r0 = java.lang.String.valueOf(r0)
            com.instagram.common.gallery.model.GalleryItem$LocalGalleryMedium r1 = new com.instagram.common.gallery.model.GalleryItem$LocalGalleryMedium
            r1.<init>(r2, r0)
        L5d:
            X.9NH r0 = new X.9NH
            r0.<init>(r1, r3)
            r5.add(r0)
            goto L3b
        L66:
            boolean r0 = r1.A04()
            if (r0 == 0) goto L3b
            goto L5d
        L6d:
            java.util.List r1 = java.util.Collections.emptyList()
            goto L2c
        L72:
            r6.EWl(r5)
        L75:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.GestureDetectorOnGestureListenerC43829JZs.A0G(X.JZs):void");
    }

    public static final void A0H(GestureDetectorOnGestureListenerC43829JZs gestureDetectorOnGestureListenerC43829JZs) {
        float f;
        float A00;
        Bitmap createBitmap;
        GalleryItem galleryItem = gestureDetectorOnGestureListenerC43829JZs.A0B;
        GalleryPreviewMultiselectPager galleryPreviewMultiselectPager = gestureDetectorOnGestureListenerC43829JZs.A0I;
        if (galleryPreviewMultiselectPager != null && galleryItem != null) {
            CropImageView cropImageView = gestureDetectorOnGestureListenerC43829JZs.A1D;
            int width = cropImageView.getWidth();
            int height = cropImageView.getHeight();
            if (width > 0 && height > 0) {
                cropImageView.A0P(false, false);
                Bitmap A0F = AbstractC167007dF.A0F(width, height);
                cropImageView.draw(AbstractC43592JPx.A06(A0F));
                C43870Jaa c43870Jaa = gestureDetectorOnGestureListenerC43829JZs.A12;
                if (c43870Jaa.A00() != 1.0f) {
                    int width2 = A0F.getWidth();
                    int height2 = A0F.getHeight();
                    Integer num = c43870Jaa.A03;
                    Integer num2 = C05F.A00;
                    if (num == num2) {
                        f = width2;
                        A00 = height2 * c43870Jaa.A00();
                    } else {
                        f = height2;
                        A00 = width2 / c43870Jaa.A00();
                    }
                    int i = ((int) (f - A00)) / 2;
                    if (num == C05F.A01) {
                        int height3 = A0F.getHeight() - (i * 2);
                        int width3 = A0F.getWidth();
                        C0fK.A03(A0F);
                        createBitmap = Bitmap.createBitmap(A0F, 0, i, width3, height3);
                    } else if (num == num2) {
                        int width4 = A0F.getWidth() - (i * 2);
                        int height4 = A0F.getHeight();
                        C0fK.A03(A0F);
                        createBitmap = Bitmap.createBitmap(A0F, i, 0, width4, height4);
                    }
                    A0F.recycle();
                    if (createBitmap != null) {
                        A0F = createBitmap;
                    }
                }
                galleryPreviewMultiselectPager.setPrerenderedImageData(galleryItem, A0F);
            }
        }
    }

    public static final void A0I(GestureDetectorOnGestureListenerC43829JZs gestureDetectorOnGestureListenerC43829JZs) {
        ArrayList A1F = AbstractC166987dD.A1F(AbstractC31172DnG.A19(gestureDetectorOnGestureListenerC43829JZs.A14.A0D.A0V));
        C43878Jai A00 = AbstractC43847JaB.A00(gestureDetectorOnGestureListenerC43829JZs.A0z);
        ArrayList A1E = AbstractC166987dD.A1E();
        Iterator it = A1F.iterator();
        while (it.hasNext()) {
            A1E.add(((GalleryItem) it.next()).A0A);
        }
        A00.A01 = gestureDetectorOnGestureListenerC43829JZs.getCurrentFolderIdForSave();
        List list = A00.A03;
        list.clear();
        list.addAll(A1E);
    }

    public static final void A0J(GestureDetectorOnGestureListenerC43829JZs gestureDetectorOnGestureListenerC43829JZs) {
        Float f;
        C43870Jaa c43870Jaa;
        C43835JZy c43835JZy = gestureDetectorOnGestureListenerC43829JZs.A14.A0D;
        GalleryItem galleryItem = (GalleryItem) AbstractC001800i.A0J(c43835JZy.A0V);
        if (galleryItem != null) {
            AnonymousClass841 anonymousClass841 = gestureDetectorOnGestureListenerC43829JZs.A19;
            C5L6 ANZ = anonymousClass841.ANZ();
            C5L6 c5l6 = C5L6.A0B;
            if (!AbstractC167007dF.A1X(ANZ, c5l6) && c43835JZy.A07) {
                if (gestureDetectorOnGestureListenerC43829JZs.A0O(galleryItem)) {
                    c43870Jaa = gestureDetectorOnGestureListenerC43829JZs.A12;
                    AbstractC167007dF.A0x(c43870Jaa.A01);
                    c43870Jaa.A03 = C05F.A0C;
                    gestureDetectorOnGestureListenerC43829JZs.setCropImageAspectRatio(1.0f);
                    A0D(anonymousClass841.ANZ(), gestureDetectorOnGestureListenerC43829JZs, true);
                } else {
                    float A00 = A00(galleryItem, gestureDetectorOnGestureListenerC43829JZs);
                    if (A00 < 0.8f) {
                        A00 = 0.8f;
                    }
                    c43870Jaa = gestureDetectorOnGestureListenerC43829JZs.A12;
                    ViewGroup viewGroup = gestureDetectorOnGestureListenerC43829JZs.A0n;
                    c43870Jaa.A01(viewGroup.getWidth(), viewGroup.getHeight(), A00);
                    gestureDetectorOnGestureListenerC43829JZs.setCropImageAspectRatio(A00);
                }
                gestureDetectorOnGestureListenerC43829JZs.setVideoAspectRatio(c43870Jaa.A00());
                gestureDetectorOnGestureListenerC43829JZs.A04 = c43870Jaa.A00();
            } else {
                C43870Jaa c43870Jaa2 = gestureDetectorOnGestureListenerC43829JZs.A12;
                AbstractC167007dF.A0x(c43870Jaa2.A01);
                c43870Jaa2.A03 = C05F.A0C;
                gestureDetectorOnGestureListenerC43829JZs.setCropImageAspectRatio(1.0f);
                gestureDetectorOnGestureListenerC43829JZs.setVideoAspectRatio(c43870Jaa2.A00());
                A0D(anonymousClass841.ANZ(), gestureDetectorOnGestureListenerC43829JZs, true);
            }
            if (anonymousClass841.ANZ() != c5l6 && c43835JZy.A07) {
                float f2 = 1.0f;
                if (!gestureDetectorOnGestureListenerC43829JZs.A0O(galleryItem)) {
                    if (gestureDetectorOnGestureListenerC43829JZs.A1C.A06) {
                        f2 = gestureDetectorOnGestureListenerC43829JZs.A1D.getCurrentScale();
                    } else {
                        f2 = A00(galleryItem, gestureDetectorOnGestureListenerC43829JZs);
                        if (f2 >= 1.0f) {
                            f2 = 1.0f / f2;
                        }
                    }
                }
                gestureDetectorOnGestureListenerC43829JZs.A00 = f2;
                f = Float.valueOf(f2);
            } else {
                f = null;
            }
            gestureDetectorOnGestureListenerC43829JZs.setForcedMinZoom(f);
            if (galleryItem.A09 == C05F.A01) {
                if (galleryItem.A06()) {
                    gestureDetectorOnGestureListenerC43829JZs.A03();
                } else {
                    gestureDetectorOnGestureListenerC43829JZs.A02();
                }
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x0058, code lost:
    
        if (r2 != false) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0010, code lost:
    
        if (r5.A0d() != false) goto L8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void A0L(X.GestureDetectorOnGestureListenerC43829JZs r5, boolean r6) {
        /*
            com.instagram.creation.capture.gallery.ui.preview.GalleryPreviewMultiselectPager r3 = r5.A0I
            r4 = 0
            if (r6 == 0) goto L12
            int r0 = r5.getSelectedMediaCount()
            if (r0 <= 0) goto L12
            boolean r0 = r5.A0d()
            r2 = 1
            if (r0 == 0) goto L13
        L12:
            r2 = 0
        L13:
            if (r3 == 0) goto L3a
            r1 = 8
            if (r2 != 0) goto L4c
            boolean r0 = r5.A0d()
            if (r0 != 0) goto L4c
            com.instagram.common.gallery.model.GalleryItem r0 = r5.A0B
            if (r0 == 0) goto L3b
            boolean r0 = r0.A06()
            if (r0 == 0) goto L3b
            com.instagram.creation.capture.video.view.IgCaptureVideoPreviewView r0 = r5.A0J
            if (r0 == 0) goto L30
            r0.setVisibility(r4)
        L30:
            com.instagram.creation.photo.crop.CropImageView r0 = r5.A1D
            r0.setVisibility(r1)
        L35:
            r4 = 8
        L37:
            r3.setVisibility(r4)
        L3a:
            return
        L3b:
            com.instagram.common.gallery.model.GalleryItem r0 = r5.A0B
            if (r0 == 0) goto L35
            com.instagram.creation.capture.video.view.IgCaptureVideoPreviewView r0 = r5.A0J
            if (r0 == 0) goto L46
            r0.setVisibility(r1)
        L46:
            com.instagram.creation.photo.crop.CropImageView r0 = r5.A1D
            r0.setVisibility(r4)
            goto L35
        L4c:
            com.instagram.creation.capture.video.view.IgCaptureVideoPreviewView r0 = r5.A0J
            if (r0 == 0) goto L53
            r0.setVisibility(r1)
        L53:
            com.instagram.creation.photo.crop.CropImageView r0 = r5.A1D
            r0.setVisibility(r1)
            if (r2 == 0) goto L35
            goto L37
        */
        throw new UnsupportedOperationException("Method not decompiled: X.GestureDetectorOnGestureListenerC43829JZs.A0L(X.JZs, boolean):void");
    }

    private final void A0N(boolean z) {
        C47Z A0h;
        RemoteMedia remoteMedia;
        Medium A01;
        GalleryItem galleryItem = this.A0B;
        if (galleryItem != null && !galleryItem.A06()) {
            Map map = this.A1I;
            String str = galleryItem.A0A;
            if (AbstractC167007dF.A1M(map.containsKey(str) ? 1 : 0)) {
                A0h = A01(galleryItem);
                if (A0h == null) {
                    throw AbstractC166987dD.A14("Required value was null.");
                }
            } else {
                Integer num = galleryItem.A09;
                if (num == C05F.A00) {
                    GalleryPreviewInfo galleryPreviewInfoFromCropController = getGalleryPreviewInfoFromCropController();
                    if (galleryPreviewInfoFromCropController != null) {
                        this.A1J.put(str, galleryPreviewInfoFromCropController);
                        if (this.A19.ANZ() != C5L6.A0B && z) {
                            A0H(this);
                            return;
                        }
                        return;
                    }
                    return;
                }
                if (num == C05F.A0C) {
                    GalleryPreviewInfo galleryPreviewInfoFromCropController2 = getGalleryPreviewInfoFromCropController();
                    if (galleryPreviewInfoFromCropController2 != null && (remoteMedia = galleryItem.A04) != null && (A01 = this.A1G.A01(remoteMedia)) != null) {
                        this.A1J.put(String.valueOf(A01.A05), galleryPreviewInfoFromCropController2);
                        return;
                    }
                    return;
                }
                if (num == C05F.A01) {
                    A0h = AbstractC43593JPy.A0h(this.A0z, str);
                    if (A0h == null) {
                        throw AbstractC166987dD.A14("Required value was null.");
                    }
                } else {
                    return;
                }
            }
            A0M(A0h, str);
        }
    }

    public static final boolean A0P(GestureDetectorOnGestureListenerC43829JZs gestureDetectorOnGestureListenerC43829JZs) {
        Integer num;
        GalleryItem galleryItem;
        AnonymousClass841 anonymousClass841 = gestureDetectorOnGestureListenerC43829JZs.A19;
        boolean A1X = AbstractC167007dF.A1X(anonymousClass841.AGq(), EnumC69983Ch.A05);
        boolean A1X2 = AbstractC167007dF.A1X(anonymousClass841.AGq(), EnumC69983Ch.A03);
        boolean z = gestureDetectorOnGestureListenerC43829JZs.A14.A0D.A07;
        if (A1X || z || (num = gestureDetectorOnGestureListenerC43829JZs.A0K) == C05F.A0Y || num == C05F.A0j || ((galleryItem = gestureDetectorOnGestureListenerC43829JZs.A0B) != null && galleryItem.A06())) {
            return false;
        }
        if (!gestureDetectorOnGestureListenerC43829JZs.A0T || A1X2) {
            return true;
        }
        return false;
    }

    public static final boolean A0Q(GestureDetectorOnGestureListenerC43829JZs gestureDetectorOnGestureListenerC43829JZs) {
        if (gestureDetectorOnGestureListenerC43829JZs.A14.A0D.A07 && gestureDetectorOnGestureListenerC43829JZs.A0I != null) {
            return true;
        }
        return false;
    }

    public static final boolean A0R(GestureDetectorOnGestureListenerC43829JZs gestureDetectorOnGestureListenerC43829JZs) {
        if (!((MX5) gestureDetectorOnGestureListenerC43829JZs.A19).A01.A0M && !gestureDetectorOnGestureListenerC43829JZs.A1O) {
            return false;
        }
        return true;
    }

    public static final boolean A0S(GestureDetectorOnGestureListenerC43829JZs gestureDetectorOnGestureListenerC43829JZs) {
        if (gestureDetectorOnGestureListenerC43829JZs.A0f && gestureDetectorOnGestureListenerC43829JZs.isAttachedToWindow()) {
            if (gestureDetectorOnGestureListenerC43829JZs.A1O || C14360o3.A0K(gestureDetectorOnGestureListenerC43829JZs.A14.A01, AbstractC43884Jap.A00)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public static final boolean A0T(GestureDetectorOnGestureListenerC43829JZs gestureDetectorOnGestureListenerC43829JZs) {
        if (gestureDetectorOnGestureListenerC43829JZs.A19.AGq() == EnumC69983Ch.A02) {
            if (C18U.A06(C06090Tz.A05, gestureDetectorOnGestureListenerC43829JZs.A0z, 36325154057499430L)) {
                return true;
            }
        }
        return false;
    }

    private final float getAlbumAspectRatio() {
        Medium medium;
        AnonymousClass841 anonymousClass841 = this.A19;
        C5L6 ANZ = anonymousClass841.ANZ();
        GalleryItem galleryItem = (GalleryItem) AbstractC001800i.A0J(this.A14.A0D.A0V);
        if (galleryItem != null) {
            medium = galleryItem.A00;
        } else {
            medium = null;
        }
        if (ANZ == C5L6.A0B) {
            if (medium != null && !this.A1O) {
                return medium.A00();
            }
            return anonymousClass841.AB3();
        }
        if (A0T(this)) {
            return ANZ.A00;
        }
        return this.A12.A00();
    }

    private final int getCameraOptionsHolderBottomPadding() {
        HorizontalScrollView horizontalScrollView = this.A0c;
        if (horizontalScrollView != null) {
            return horizontalScrollView.getHeight();
        }
        return 0;
    }

    private final View getFolderMenuTooltipAnchor() {
        View view = this.A14.A0G.A02.A03.A01;
        if (view == null) {
            view = this.A11.A01;
        }
        return view;
    }

    /* JADX WARN: Type inference failed for: r1v5, types: [com.instagram.creation.capture.gallery.GalleryPreviewInfo, java.lang.Object] */
    private final GalleryPreviewInfo getGalleryPreviewInfoFromCropController() {
        String str;
        String str2;
        C43869JaZ c43869JaZ = this.A1B;
        android.net.Uri uri = c43869JaZ.A02;
        if (uri != null && uri.getPath() != null) {
            android.net.Uri uri2 = c43869JaZ.A02;
            C14360o3.A0A(uri2);
            String path = uri2.getPath();
            C43868JaY c43868JaY = this.A1C;
            InterfaceC197178nn interfaceC197178nn = c43868JaY.A05;
            if (interfaceC197178nn != null) {
                str = interfaceC197178nn.Avl();
            } else {
                str = null;
            }
            if (C14360o3.A0K(path, str)) {
                ?? obj = new Object();
                obj.A03 = null;
                obj.A02 = null;
                obj.A00 = null;
                obj.A01 = null;
                obj.A03 = this.A1D.getCropMatrixValues();
                obj.A00 = c43868JaY.A00();
                InterfaceC197178nn interfaceC197178nn2 = c43868JaY.A05;
                if (interfaceC197178nn2 != null) {
                    str2 = interfaceC197178nn2.Avl();
                } else {
                    str2 = null;
                }
                obj.A02 = str2;
                obj.A01 = c43868JaY.A04;
                return obj;
            }
            return null;
        }
        return null;
    }

    private final float getTargetPosition() {
        float A08 = AbstractC166987dD.A08(this.A1D);
        float f = this.A03;
        if (f == 0.0f) {
            if (this.A0v.A09.A00 <= A08 / 2.0f) {
                return 0.0f;
            }
        } else if (f >= 0.0f) {
            return 0.0f;
        }
        return getTopDockPosition();
    }

    private final float getTopDockPosition() {
        float A08;
        int height = this.A0n.getHeight();
        if (C18U.A06(C06090Tz.A05, this.A0z, 36321022299677757L)) {
            float f = height;
            if (!this.A1O) {
                return f + this.A06;
            }
            return f;
        }
        RecyclerView recyclerView = this.A14.A0G.A00;
        if (recyclerView.getChildCount() == 0) {
            A08 = 0.0f;
        } else {
            View childAt = recyclerView.getChildAt(recyclerView.getChildCount() - 1);
            float top = childAt.getTop() + childAt.getHeight();
            A08 = AbstractC166987dD.A08(recyclerView);
            if (A08 > top) {
                A08 = top;
            }
        }
        float f2 = height;
        float f3 = A08 + f2;
        if (!this.A1O) {
            f3 += this.A06;
        }
        return Math.min(Math.max(f3 - (getHeight() - this.A0a), 0.0f), f2);
    }

    private final void setChildViewTranslationY(int i) {
        if (!this.A1M && !A0d()) {
            InterfaceC189638ai interfaceC189638ai = this.A0H;
            if (interfaceC189638ai != null) {
                interfaceC189638ai.DJ0(this, -i);
            }
            int i2 = -i;
            float f = i2;
            this.A0n.setTranslationY(f);
            setUnifiedCameraOptionsHolderTranslationY(i2);
            this.A09 = new C51737MtK(i2, this.A09.A00, 10);
            if (C18U.A06(C06090Tz.A05, this.A0z, 36321022299677757L)) {
                View view = this.A0m;
                view.setTranslationY(this.A09.A01);
                C51737MtK c51737MtK = this.A09;
                AbstractC13880nE.A0Y(view, Math.max(c51737MtK.A00 + c51737MtK.A01, 0));
                return;
            }
            this.A0m.setTranslationY(f);
        }
    }

    private final void setCropImageAspectRatio(float f) {
        ((AbstractC43828JZr) this.A1D).A00 = f;
        GalleryPreviewMultiselectPager galleryPreviewMultiselectPager = this.A0I;
        if (A0Q(this) && galleryPreviewMultiselectPager != null) {
            galleryPreviewMultiselectPager.setCropImageAspectRatio(f);
        }
    }

    public static /* synthetic */ void setCropType$default(GestureDetectorOnGestureListenerC43829JZs gestureDetectorOnGestureListenerC43829JZs, C5L6 c5l6, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = true;
        }
        A0D(c5l6, gestureDetectorOnGestureListenerC43829JZs, z);
    }

    public static /* synthetic */ void setCurrentFolderAndSelectedItems$default(GestureDetectorOnGestureListenerC43829JZs gestureDetectorOnGestureListenerC43829JZs, int i, List list, Integer num, int i2, Object obj) {
        if ((i2 & 4) != 0) {
            num = null;
        }
        gestureDetectorOnGestureListenerC43829JZs.A0Z(num, list, i);
    }

    private final void setForcedMinZoom(Float f) {
        if (f == null) {
            this.A1D.A0I();
        } else {
            this.A1D.setForcedMinZoom(f.floatValue());
        }
    }

    private final void setScrollFlag(int i) {
        ViewGroup.LayoutParams layoutParams = this.A0n.getLayoutParams();
        C14360o3.A0C(layoutParams, "null cannot be cast to non-null type com.google.android.material.appbar.AppBarLayout.LayoutParams");
        ((C1343765g) layoutParams).A00 = i | 1 | 16;
    }

    private final void setUnifiedCameraOptionsHolderTranslationY(int i) {
        HorizontalScrollView horizontalScrollView = this.A0c;
        if (horizontalScrollView != null) {
            horizontalScrollView.setTranslationY(i);
        }
    }

    private final void setVideoAspectRatio(float f) {
        IgCaptureVideoPreviewView igCaptureVideoPreviewView = this.A0J;
        if (igCaptureVideoPreviewView != null) {
            igCaptureVideoPreviewView.setAspectRatio(f);
        }
        GalleryPreviewMultiselectPager galleryPreviewMultiselectPager = this.A0I;
        if (A0Q(this) && galleryPreviewMultiselectPager != null) {
            galleryPreviewMultiselectPager.setVideoPreviewAspectRatio(f);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0068, code lost:
    
        if (X.C18U.A06(r2, r3, 36331188486489295L) == false) goto L21;
     */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A0U() {
        /*
            r5 = this;
            com.instagram.common.session.UserSession r3 = r5.A0z
            X.Jai r0 = X.AbstractC43847JaB.A00(r3)
            boolean r0 = r0.A02
            r4 = 0
            if (r0 != 0) goto L76
            boolean r0 = r5.A0h
            if (r0 == 0) goto L4c
            r5.A0h = r4
        L11:
            r5.A0f = r4
            r5.A05()
            X.JaF r2 = r5.A16
            java.lang.Runnable r1 = r2.A01
            if (r1 == 0) goto L21
            android.os.Handler r0 = r2.A03
            r0.removeCallbacks(r1)
        L21:
            X.5SW r0 = r2.A00
            if (r0 == 0) goto L28
            r0.A08(r4)
        L28:
            X.JZt r2 = r5.A14
            X.JaK r0 = r2.A0G
            androidx.recyclerview.widget.RecyclerView r1 = r0.A00
            X.2tR r0 = r2.A0J
            r1.A15(r0)
            X.8Yv r0 = r2.A0M
            r0.A08()
            X.Jai r1 = X.AbstractC43847JaB.A00(r3)
            X.Jaa r0 = r5.A12
            float r0 = r0.A00()
            r1.A00 = r0
            X.22C r0 = X.AnonymousClass229.A01(r3)
            r0.A0X()
            return
        L4c:
            boolean r0 = r5.A1O
            if (r0 == 0) goto L6a
            X.0Tz r2 = X.AbstractC25225BEi.A0j(r3, r4)
            r0 = 36320390939353525(0x810934000b21b5, double:3.0324997082980466E-306)
            boolean r0 = X.C18U.A06(r2, r3, r0)
            if (r0 != 0) goto L11
            r0 = 36331188486489295(0x811306000144cf, double:3.03932812058494E-306)
            boolean r0 = X.C18U.A06(r2, r3, r0)
            if (r0 != 0) goto L11
        L6a:
            X.Jai r1 = X.AbstractC43847JaB.A00(r3)
            java.util.List r0 = r1.A03
            r0.clear()
            r0 = 0
            r1.A01 = r0
        L76:
            X.Jai r0 = X.AbstractC43847JaB.A00(r3)
            r0.A02 = r4
            goto L11
        */
        throw new UnsupportedOperationException("Method not decompiled: X.GestureDetectorOnGestureListenerC43829JZs.A0U():void");
    }

    public final void A0W(A5B a5b) {
        String str;
        C43830JZt c43830JZt = this.A14;
        Integer num = c43830JZt.A02;
        Integer num2 = C05F.A01;
        if (num == num2) {
            List A19 = AbstractC31172DnG.A19(c43830JZt.A0D.A0V);
            if (!A19.isEmpty() && !((GalleryItem) A19.get(0)).A06()) {
                MYZ A01 = MX1.A01(this.A0z);
                C22P c22p = this.A0q;
                C24Q c24q = A01.A0B;
                long A03 = c24q.A03(288425357, 15000L);
                A01.A02 = A03;
                c24q.A0A(A03, "camera_destination", "feed");
                if (c22p != null) {
                    c24q.A0A(A01.A02, ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY, c22p.name());
                }
            }
            C75L.A00((Activity) AbstractC13320mI.A01(getContext(), FragmentActivity.class), this.A0z).A0L();
        }
        if (this.A0B == null || (this.A0K == C05F.A00 && !A0d())) {
            if (c43830JZt.A02 == num2) {
                MYZ A012 = MX1.A01(this.A0z);
                if (this.A0B == null) {
                    str = "Preview item does not exist";
                } else {
                    str = "PreviewState not set";
                }
                A012.A07(str);
                return;
            }
            return;
        }
        C43835JZy c43835JZy = c43830JZt.A0D;
        if (c43835JZy.A07) {
            A0N(true);
        }
        ArrayList A1F = AbstractC166987dD.A1F(AbstractC31172DnG.A19(c43835JZy.A0V));
        List A00 = LIH.A00(A1F);
        if (!A00.isEmpty()) {
            A0H.A00(AbstractC166997dE.A0L(this), this.A1A, A00, new B61(15, A1F, this));
        } else {
            A0X(a5b, A1F, false);
        }
    }

    public final boolean A0b() {
        if (this.A1M) {
            return this.A0O;
        }
        if (this.A0v.A01 != 0.0d) {
            return true;
        }
        return false;
    }

    public final boolean A0e() {
        if (this.A1O) {
            C6WI A01 = C6WI.A01();
            A01.A0M = false;
            A01.A0R = false;
            A01.A0J = false;
            A01.A0I = false;
            A01.A0P = false;
            A01.A0K = false;
            A01.A06 = 0;
            A01.A05 = 0;
        }
        InterfaceC08430c6 A0Q = ((FragmentActivity) AbstractC13320mI.A01(getContext(), FragmentActivity.class)).getSupportFragmentManager().A0Q(KCQ.__redex_internal_original_name);
        if (A0Q != null && ((InterfaceC60072op) A0Q).onBackPressed()) {
            return true;
        }
        return false;
    }

    @Override // X.InterfaceC187288Rv
    public final /* synthetic */ boolean Ceo() {
        return false;
    }

    @Override // X.MQT
    public final void D1r() {
        AbstractC44261Jh7.A00(false, "photo");
        MX1.A01(this.A0z).A09("CropImageController failed to load image");
    }

    @Override // X.MQT
    public final void DH8(Location location, android.net.Uri uri, MediaUploadMetadata mediaUploadMetadata, CropInfo cropInfo, String str, String str2, HashMap hashMap, int i, int i2) {
        Context context = getContext();
        MQT mqt = (MQT) AbstractC13320mI.A00(context, MQT.class);
        if (mqt != null) {
            mqt.DH8(location, uri, mediaUploadMetadata, cropInfo, str, str2, hashMap, i, i2);
            return;
        }
        CreationSession creationSession = ((MX5) this.A19).A01;
        if (!creationSession.A0M) {
            return;
        }
        this.A1C.A07 = false;
        LBU.A00((Activity) AbstractC13320mI.A01(context, Activity.class), location, uri, this.A0q, mediaUploadMetadata, this.A0z, cropInfo, this.A18, creationSession.A09, creationSession.A0B, str, str2, i, i2, false, creationSession.A0L);
    }

    @Override // X.MQQ
    public final void Drk(com.instagram.creation.base.ui.mediatabbar.Tab tab, com.instagram.creation.base.ui.mediatabbar.Tab tab2) {
        if (C14360o3.A0K(tab2, AbstractC43884Jap.A00)) {
            MYZ A01 = MX1.A01(this.A0z);
            C24Q c24q = A01.A0B;
            long A03 = c24q.A03(288439403, 10000L);
            A01.A03 = A03;
            c24q.A0A(A03, "camera_destination", "feed");
        }
        C43830JZt c43830JZt = this.A14;
        c43830JZt.A01 = tab2;
        A05();
        c43830JZt.A0E();
    }

    @Override // X.InterfaceC187288Rv
    public final /* synthetic */ boolean Ejf() {
        return false;
    }

    @Override // X.InterfaceC187288Rv
    public /* synthetic */ boolean getCanHaveEmptySegments() {
        return false;
    }

    public final List getCombinedFolders() {
        return this.A14.A0C();
    }

    @Override // X.InterfaceC195648l5
    public Folder getCurrentFolder() {
        return this.A14.A0M.A01;
    }

    public final C8Z4 getCurrentMixedFolder() {
        return this.A14.A0B();
    }

    public final C43848JaC getFolderPickerHelper() {
        return this.A11;
    }

    @Override // X.InterfaceC195648l5
    public List getFolders() {
        C43830JZt c43830JZt = this.A14;
        ArrayList A1E = AbstractC166987dD.A1E();
        A1E.addAll(C43830JZt.A00(c43830JZt));
        A1E.addAll(C43830JZt.A00(c43830JZt));
        List A0a = AbstractC001800i.A0a(c43830JZt.A0M.A03.values());
        ArrayList A1E2 = AbstractC166987dD.A1E();
        for (Object obj : A0a) {
            if (((Folder) obj).A07) {
                A1E2.add(obj);
            }
        }
        A1E.addAll(A1E2);
        return A1E;
    }

    public int getSelectedMediaCount() {
        List list = this.A14.A0D.A0V;
        ArrayList A0q = AbstractC167017dG.A0q(list);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            A0q.add(((GalleryItem) it.next()).A0A);
        }
        return A0q.size();
    }

    public final List getSelectedMediaItems() {
        return this.A1H;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        this.A03 = f2;
        return false;
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        String[] strArr;
        GalleryPickerView$SavedState galleryPickerView$SavedState = (GalleryPickerView$SavedState) parcelable;
        if (galleryPickerView$SavedState != null) {
            super.onRestoreInstanceState(galleryPickerView$SavedState.getSuperState());
            List list = AbstractC43847JaB.A00(this.A0z).A03;
            if (list.isEmpty() && (strArr = galleryPickerView$SavedState.A07) != null) {
                if (strArr.length == 0 && galleryPickerView$SavedState.A05) {
                    String str = galleryPickerView$SavedState.A02;
                    if (str != null) {
                        list = Collections.singletonList(str);
                    } else {
                        list = Collections.emptyList();
                    }
                    C14360o3.A07(list);
                } else {
                    list = AbstractC009903n.A0J(strArr);
                }
            }
            A0Z(null, list, galleryPickerView$SavedState.A00);
            this.A0d = galleryPickerView$SavedState.A02;
            this.A0l = galleryPickerView$SavedState.A06;
            Map map = this.A1J;
            if (map.isEmpty()) {
                Iterator A15 = AbstractC166997dE.A15(galleryPickerView$SavedState.A03);
                while (A15.hasNext()) {
                    Map.Entry A1K = AbstractC166987dD.A1K(A15);
                    Object key = A1K.getKey();
                    Object value = A1K.getValue();
                    if (key != null && value != null) {
                        map.put(key, value);
                    }
                }
                return;
            }
            return;
        }
        throw AbstractC166987dD.A14("Required value was null.");
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestDisallowInterceptTouchEvent(boolean z) {
        if (!this.A0V) {
            if (A0b() && this.A0W) {
                return;
            }
            super.requestDisallowInterceptTouchEvent(z);
        }
    }

    public void setCurrentFolderById(int i) {
        C189058Yv c189058Yv = this.A14.A0M;
        M3G m3g = new M3G(this, i);
        if (c189058Yv.A04) {
            m3g.run();
        } else {
            c189058Yv.A02 = m3g;
        }
    }

    public void setCurrentFolderByIdAndSelectFirstItem(int i) {
        C189058Yv c189058Yv = this.A14.A0M;
        boolean z = c189058Yv.A04;
        RunnableC43877Jah runnableC43877Jah = new RunnableC43877Jah(this, i, z);
        if (z) {
            runnableC43877Jah.run();
        } else {
            c189058Yv.A02 = runnableC43877Jah;
        }
    }

    public final void setCurrentRemoteFolder(C24164Ann c24164Ann) {
        C43830JZt c43830JZt = this.A14;
        C14360o3.A0A(c24164Ann);
        if (C43830JZt.A07(c43830JZt)) {
            c43830JZt.A0D.A09("", AbstractC166987dD.A1E(), C43885Jaq.A00);
        }
        c43830JZt.A0D.A08(c24164Ann);
    }

    public final void setFastScrollControllerListener(BBG bbg) {
        C43830JZt c43830JZt = this.A14;
        if (bbg != null) {
            c43830JZt.A0L.A03 = bbg;
        }
    }

    public final void setListener(InterfaceC189638ai interfaceC189638ai) {
        this.A0H = interfaceC189638ai;
    }

    public final void setOnMultiSelectModeChangedCallback(BB6 bb6) {
        this.A0F = bb6;
    }

    public void setTabBarHeight(int i) {
        this.A06 = i;
    }

    public void setTopOffset(int i) {
        if (this.A0a != i) {
            this.A0a = i;
            ViewGroup viewGroup = this.A0n;
            ViewGroup.LayoutParams layoutParams = viewGroup.getLayoutParams();
            C14360o3.A0C(layoutParams, "null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams");
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            Context A0L = AbstractC166997dE.A0L(this);
            if (AbstractC43841Ja4.A01(A0L) == C05F.A0N) {
                ((ViewGroup.LayoutParams) marginLayoutParams).height = (AbstractC13880nE.A09(A0L) - this.A0a) - getResources().getDimensionPixelSize(com.facebook.R.dimen.canvas_colour_wheel_offset_y);
                AbstractC31174DnI.A1C(this, AbstractC53242c7.A0F(A0L, com.facebook.R.attr.creationTertiaryBackground));
            }
            viewGroup.setLayoutParams(marginLayoutParams);
            marginLayoutParams.setMargins(0, this.A0a, 0, 0);
            requestLayout();
        }
    }

    public static final float A00(GalleryItem galleryItem, GestureDetectorOnGestureListenerC43829JZs gestureDetectorOnGestureListenerC43829JZs) {
        CropInfo cropInfo;
        ExifImageData exifImageData;
        int i;
        int width;
        int height;
        C47Z A01 = gestureDetectorOnGestureListenerC43829JZs.A01(galleryItem);
        boolean A06 = galleryItem.A06();
        if (A01 != null) {
            if (A06) {
                return A01.A02;
            }
            width = A01.A06().width();
            height = A01.A06().height();
            i = A01.A08;
        } else {
            if (A06) {
                return gestureDetectorOnGestureListenerC43829JZs.A04;
            }
            C43868JaY c43868JaY = gestureDetectorOnGestureListenerC43829JZs.A1C;
            if (c43868JaY.A06) {
                CropInfo A00 = c43868JaY.A00();
                if (A00 != null) {
                    Rect rect = A00.A02;
                    ExifImageData exifImageData2 = c43868JaY.A04;
                    if (exifImageData2 != null) {
                        i = exifImageData2.A00;
                        width = rect.width();
                        height = rect.height();
                    } else {
                        throw AbstractC166987dD.A14("Required value was null.");
                    }
                } else {
                    throw AbstractC166987dD.A14("Required value was null.");
                }
            } else {
                GalleryPreviewInfo galleryPreviewInfo = (GalleryPreviewInfo) gestureDetectorOnGestureListenerC43829JZs.A1J.get(galleryItem.A0A);
                if (galleryPreviewInfo != null && (cropInfo = galleryPreviewInfo.A00) != null && (exifImageData = galleryPreviewInfo.A01) != null) {
                    Rect rect2 = cropInfo.A02;
                    i = exifImageData.A00;
                    width = rect2.width();
                    height = rect2.height();
                } else {
                    return 1.0f;
                }
            }
        }
        float f = height;
        float f2 = width;
        if (i % 180 == 0) {
            f = f2;
            f2 = f;
        }
        return f / f2;
    }

    public static final void A08(Medium medium, GestureDetectorOnGestureListenerC43829JZs gestureDetectorOnGestureListenerC43829JZs) {
        String A00;
        C6WI A01 = C6WI.A01();
        UserSession userSession = gestureDetectorOnGestureListenerC43829JZs.A0z;
        C14360o3.A0A(medium);
        if (medium.Cff()) {
            A00 = "edit_video";
        } else {
            A00 = MSV.A00(437);
        }
        A01.A05(userSession, A00);
        if (!TextUtils.isEmpty(medium.A0O)) {
            ((MX5) gestureDetectorOnGestureListenerC43829JZs.A19).A01.A0D = medium.A0O;
        }
        medium.A0G.A01 = gestureDetectorOnGestureListenerC43829JZs.A14.A0B().getName();
        if (medium.A08 == 1) {
            gestureDetectorOnGestureListenerC43829JZs.A1C.A02(AbstractC166997dE.A0L(gestureDetectorOnGestureListenerC43829JZs), medium.A0G);
            return;
        }
        MediaCaptureConfig mediaCaptureConfig = ((MX5) gestureDetectorOnGestureListenerC43829JZs.A19).A01.A09;
        if (mediaCaptureConfig != null && mediaCaptureConfig.A0F) {
            C193328hC A0I = AbstractC31171DnF.A0I(gestureDetectorOnGestureListenerC43829JZs.getContext());
            A0I.A0t(true);
            A0I.A0A(2131952459);
            A0I.A09(2131952456);
            A0I.A0J(new DialogInterfaceOnClickListenerC48021LMq(6, medium, gestureDetectorOnGestureListenerC43829JZs), 2131952458);
            AbstractC31176DnK.A16(null, A0I, 2131952457);
            return;
        }
        C8IY c8iy = gestureDetectorOnGestureListenerC43829JZs.A10;
        c8iy.A00 = medium;
        c8iy.A04.A0A(new C8A8(EnumC46190KcS.A04));
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0082, code lost:
    
        r1 = (r2.height() - ((int) (r2.width() * r1))) / 2;
        r2.top += r1;
        r2.bottom -= r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x007f, code lost:
    
        if ((r6 % 180) == 0) goto L10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0048, code lost:
    
        if ((r6 % 180) != 0) goto L10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x004a, code lost:
    
        r1 = (r2.width() - ((int) (r2.height() * r1))) / 2;
        r2.left += r1;
        r2.right -= r1;
     */
    /* JADX WARN: Type inference failed for: r3v0, types: [com.instagram.creation.capture.gallery.GalleryPreviewInfo, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void A0M(X.C47Z r8, java.lang.String r9) {
        /*
            r7 = this;
            boolean r0 = r8.A11()
            if (r0 != 0) goto L78
            com.instagram.creation.photo.util.ExifImageData r4 = new com.instagram.creation.photo.util.ExifImageData
            r4.<init>()
            double r0 = r8.A01
            java.lang.Double r0 = java.lang.Double.valueOf(r0)
            r4.A02 = r0
            double r0 = r8.A00
            java.lang.Double r0 = java.lang.Double.valueOf(r0)
            r4.A01 = r0
            int r6 = r8.A08
            r4.A00 = r6
            r0 = 0
            com.instagram.creation.capture.gallery.GalleryPreviewInfo r3 = new com.instagram.creation.capture.gallery.GalleryPreviewInfo
            r3.<init>()
            r3.A03 = r0
            r3.A02 = r0
            r3.A00 = r0
            r3.A01 = r0
            android.graphics.Rect r2 = r8.A06()
            X.Jaa r5 = r7.A12
            java.lang.Integer r0 = r5.A03
            int r1 = r0.intValue()
            r0 = 2
            if (r1 == r0) goto L9b
            r0 = 0
            if (r1 == r0) goto L79
            r1 = 1065353216(0x3f800000, float:1.0)
            float r0 = r5.A00()
            float r1 = r1 / r0
            int r0 = r6 % 180
            if (r0 == 0) goto L82
        L4a:
            int r0 = r2.height()
            float r0 = (float) r0
            float r0 = r0 * r1
            int r1 = (int) r0
            int r0 = r2.width()
            int r0 = r0 - r1
            int r1 = r0 / 2
            int r0 = r2.left
            int r0 = r0 + r1
            r2.left = r0
            int r0 = r2.right
            int r0 = r0 - r1
            r2.right = r0
        L62:
            int r5 = r8.A0H
            int r1 = r8.A0G
            com.instagram.creation.base.CropInfo r0 = new com.instagram.creation.base.CropInfo
            r0.<init>(r2, r5, r1)
            r3.A00 = r0
            java.lang.String r0 = r8.A3Z
            r3.A02 = r0
            r3.A01 = r4
            java.util.Map r0 = r7.A1J
            r0.put(r9, r3)
        L78:
            return
        L79:
            float r1 = r5.A00()
            int r0 = r6 % 180
            if (r0 != 0) goto L82
            goto L4a
        L82:
            int r0 = r2.width()
            float r0 = (float) r0
            float r0 = r0 * r1
            int r1 = (int) r0
            int r0 = r2.height()
            int r0 = r0 - r1
            int r1 = r0 / 2
            int r0 = r2.top
            int r0 = r0 + r1
            r2.top = r0
            int r0 = r2.bottom
            int r0 = r0 - r1
            r2.bottom = r0
            goto L62
        L9b:
            boolean r0 = r8.A5U
            if (r0 == 0) goto L62
            X.JZt r0 = r7.A14
            X.JZy r0 = r0.A0D
            boolean r0 = r0.A07
            if (r0 == 0) goto L62
            android.graphics.Rect r2 = X.MX2.A01(r2)
            goto L62
        */
        throw new UnsupportedOperationException("Method not decompiled: X.GestureDetectorOnGestureListenerC43829JZs.A0M(X.47Z, java.lang.String):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:13:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:9:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final boolean A0O(com.instagram.common.gallery.model.GalleryItem r6) {
        /*
            r5 = this;
            X.47Z r4 = r5.A01(r6)
            r1 = 1065353216(0x3f800000, float:1.0)
            r3 = 0
            r2 = 1
            boolean r0 = r6.A06()
            if (r4 == 0) goto L18
            if (r0 == 0) goto L48
            float r0 = r4.A02
        L12:
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto L17
        L16:
            r3 = 1
        L17:
            return r3
        L18:
            if (r0 == 0) goto L1d
            float r0 = r5.A04
            goto L12
        L1d:
            X.JaY r1 = r5.A1C
            boolean r0 = r1.A06
            if (r0 == 0) goto L37
            com.instagram.creation.base.CropInfo r0 = r1.A00()
            if (r0 == 0) goto L37
            com.instagram.creation.base.CropInfo r0 = r1.A00()
            X.C14360o3.A0A(r0)
        L30:
            android.graphics.Rect r0 = r0.A02
            int r1 = r0.width()
            goto L54
        L37:
            java.util.Map r1 = r5.A1J
            java.lang.String r0 = r6.A0A
            java.lang.Object r0 = r1.get(r0)
            com.instagram.creation.capture.gallery.GalleryPreviewInfo r0 = (com.instagram.creation.capture.gallery.GalleryPreviewInfo) r0
            if (r0 == 0) goto L47
            com.instagram.creation.base.CropInfo r0 = r0.A00
            if (r0 != 0) goto L30
        L47:
            return r2
        L48:
            android.graphics.Rect r0 = r4.A06()
            int r1 = r0.width()
            android.graphics.Rect r0 = r4.A06()
        L54:
            int r0 = r0.height()
            if (r1 != r0) goto L17
            goto L16
        */
        throw new UnsupportedOperationException("Method not decompiled: X.GestureDetectorOnGestureListenerC43829JZs.A0O(com.instagram.common.gallery.model.GalleryItem):boolean");
    }

    private final Integer getCurrentFolderIdForSave() {
        if (A0R(this)) {
            UserSession userSession = this.A0z;
            C06090Tz c06090Tz = C06090Tz.A05;
            if (C18U.A06(c06090Tz, userSession, 36331188486423758L) || C18U.A06(c06090Tz, userSession, 36328736060489472L)) {
                return Integer.valueOf(this.A14.A0M.A01.A02);
            }
            return null;
        }
        return null;
    }

    public final void A0Y(Integer num) {
        C43835JZy c43835JZy;
        Integer num2;
        C6WI.A01().A0P = true;
        int intValue = num.intValue();
        if (intValue != 1) {
            if (intValue != 2) {
                if (intValue == 3) {
                    c43835JZy = this.A14.A0D;
                    num2 = C05F.A0C;
                } else {
                    throw AbstractC166987dD.A14("Invalid ManageButtonState");
                }
            } else {
                c43835JZy = this.A14.A0D;
                num2 = C05F.A0N;
            }
            c43835JZy.A0O.A00(num2);
            c43835JZy.A07();
            return;
        }
        if (((MX5) this.A19).A01.A0M) {
            Bundle A0b = AbstractC166987dD.A0b();
            AnonymousClass840 anonymousClass840 = this.A18;
            C14360o3.A0B(anonymousClass840, 1);
            A0b.putParcelable("previousCreationSession", AbstractC43593JPy.A0R(anonymousClass840));
            UserSession userSession = this.A0z;
            Context context = getContext();
            new C6XJ((Activity) AbstractC13320mI.A01(context, Activity.class), A0b, userSession, ModalActivity.class, AbstractC111324zv.A00(2691)).A0C(context);
            return;
        }
        C50695MZq.A00(this.A0z, new C45757KNk());
    }

    public final boolean A0c() {
        if (A0R(this)) {
            if (C18U.A06(C06090Tz.A05, this.A0z, 36328736060227324L)) {
                return true;
            }
        }
        return false;
    }

    public final boolean A0d() {
        if (A0R(this)) {
            if (C18U.A06(C06090Tz.A05, this.A0z, 36328736060161787L)) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x0140  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0174  */
    @Override // X.MQT
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void D8k(int r16, int r17) {
        /*
            Method dump skipped, instructions count: 484
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.GestureDetectorOnGestureListenerC43829JZs.D8k(int, int):void");
    }

    @Override // X.MQU
    public final void DJJ(CropImageView cropImageView) {
        ViewParent parent = cropImageView.getParent();
        if (parent != null) {
            parent.requestDisallowInterceptTouchEvent(true);
            if (!this.A0e) {
                this.A0e = true;
            }
        }
    }

    public final AnonymousClass249 getMediaType() {
        if (getSelectedMediaCount() > 1) {
            return AnonymousClass249.ALBUM;
        }
        GalleryItem galleryItem = (GalleryItem) AbstractC001800i.A0J(this.A14.A0D.A0V);
        if (galleryItem != null) {
            if (galleryItem.A06()) {
                return AnonymousClass249.VIDEO;
            }
            return AnonymousClass249.PHOTO;
        }
        return AnonymousClass249.NONE;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        int A06 = C0f9.A06(1955087710);
        super.onAttachedToWindow();
        C43830JZt c43830JZt = this.A14;
        c43830JZt.A0G.A00.A14(c43830JZt.A0A);
        this.A1D.A03 = this;
        this.A0t.A0A(this);
        this.A0w.A0A(this);
        this.A0r.A0A(this);
        this.A0s.A0A(this);
        if (!this.A1M) {
            if (!A0d()) {
                this.A0v.A0A(this);
            }
            this.A0u.A0A(this);
        }
        A05();
        C0f9.A0D(-1010026313, A06);
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        A0I(this);
        this.A0h = true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        FragmentActivity fragmentActivity;
        LoaderManager loaderManager;
        int A06 = C0f9.A06(-497321273);
        super.onDetachedFromWindow();
        C43869JaZ c43869JaZ = this.A1C.A03;
        if (c43869JaZ != null && (fragmentActivity = c43869JaZ.A03) != null && (loaderManager = fragmentActivity.getLoaderManager()) != null) {
            loaderManager.destroyLoader(C43868JaY.A0D);
        }
        A05();
        C43869JaZ c43869JaZ2 = this.A1B;
        c43869JaZ2.A05 = null;
        c43869JaZ2.A04 = null;
        this.A1D.A03 = null;
        C43830JZt c43830JZt = this.A14;
        c43830JZt.A0G.A00.A15(c43830JZt.A0A);
        this.A0t.A0B(this);
        this.A0w.A0B(this);
        this.A0r.A0B(this);
        this.A0s.A0B(this);
        if (!this.A1M) {
            if (!A0d()) {
                this.A0v.A0B(this);
            }
            this.A0u.A0B(this);
        }
        this.A07 = null;
        C0f9.A0D(-2094514347, A06);
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        View view;
        super.onMeasure(i, i2);
        if (!this.A1M) {
            int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredHeight() - this.A0a, AbstractC63123SdR.MAX_SIGNED_POWER_OF_TWO);
            View view2 = this.A0m;
            view2.measure(i, makeMeasureSpec);
            int height = this.A0n.getHeight() + getCameraOptionsHolderBottomPadding();
            boolean z = this.A1O;
            if (!z) {
                height += this.A06;
            }
            this.A09 = new C51737MtK(this.A09.A01, height, 10);
            if (C18U.A06(C06090Tz.A05, this.A0z, 36321022299677757L)) {
                view2.setTranslationY(this.A09.A01);
                C51737MtK c51737MtK = this.A09;
                AbstractC13880nE.A0Y(view2, Math.max(c51737MtK.A00 + c51737MtK.A01, 0));
                return;
            }
            C43830JZt c43830JZt = this.A14;
            int i3 = this.A09.A00;
            c43830JZt.A0D.A00 = i3;
            AbstractC13880nE.A0Y(c43830JZt.A0L.A0A, i3);
            if (z || !A0c() || (view = this.A07) == null) {
                return;
            }
            view.setPadding(0, 0, 0, height);
        }
    }

    /* JADX WARN: Type inference failed for: r3v0, types: [android.view.View$BaseSavedState, android.os.Parcelable, com.instagram.creation.capture.gallery.ui.GalleryPickerView$SavedState] */
    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        Parcelable onSaveInstanceState = super.onSaveInstanceState();
        if (onSaveInstanceState != null) {
            ?? baseSavedState = new View.BaseSavedState(onSaveInstanceState);
            baseSavedState.A06 = new float[9];
            baseSavedState.A03 = AbstractC166987dD.A1G();
            C43830JZt c43830JZt = this.A14;
            Folder folder = c43830JZt.A0M.A01;
            if (folder != null) {
                baseSavedState.A00 = folder.A02;
                baseSavedState.A01 = folder.A03;
            }
            C43835JZy c43835JZy = c43830JZt.A0D;
            List list = c43835JZy.A0V;
            ArrayList A0q = AbstractC167017dG.A0q(list);
            Iterator it = list.iterator();
            while (it.hasNext()) {
                A0q.add(((GalleryItem) it.next()).A0A);
            }
            baseSavedState.A07 = AbstractC31173DnH.A1b(A0q, 0);
            baseSavedState.A05 = c43835JZy.A07;
            GalleryItem galleryItem = this.A0B;
            if (galleryItem != null) {
                baseSavedState.A02 = galleryItem.A0A;
                boolean z = false;
                if (galleryItem.A09 == C05F.A01) {
                    z = true;
                }
                baseSavedState.A04 = z;
            }
            baseSavedState.A06 = this.A1D.getCropMatrixValues();
            Map map = baseSavedState.A03;
            map.clear();
            map.putAll(this.A1J);
            return baseSavedState;
        }
        throw AbstractC166997dE.A0g();
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x0017, code lost:
    
        if (r1 != 3) goto L8;
     */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onTouchEvent(android.view.MotionEvent r9) {
        /*
            r8 = this;
            r0 = -1617841267(0xffffffff9f91b38d, float:-6.170693E-20)
            int r6 = X.AbstractC43593JPy.A03(r9, r0)
            android.view.GestureDetector r0 = r8.A1Q
            r0.onTouchEvent(r9)
            int r1 = r9.getAction()
            r7 = 1
            if (r1 == r7) goto L32
            r0 = 2
            if (r1 == r0) goto L20
            r0 = 3
            if (r1 == r0) goto L32
        L19:
            r0 = -227618370(0xfffffffff26ed1be, float:-4.7303037E30)
            X.C0f9.A0C(r0, r6)
            return r7
        L20:
            boolean r0 = r8.A0M
            if (r0 == 0) goto L19
            float r1 = r8.A0Z
            X.2hj r4 = r8.A0v
            X.2hk r0 = r4.A09
            double r2 = r0.A00
            double r0 = (double) r1
            double r2 = r2 + r0
            r4.A08(r2, r7)
            goto L19
        L32:
            boolean r0 = r8.A0M
            if (r0 == 0) goto L19
            float r1 = r8.A0Z
            float r5 = r8.getTargetPosition()
            X.2hj r4 = r8.A0v
            X.2hk r0 = r4.A09
            double r2 = r0.A00
            double r0 = (double) r1
            double r2 = r2 + r0
            r4.A08(r2, r7)
            r1 = -1082130432(0xffffffffbf800000, float:-1.0)
            float r0 = r8.A03
            float r1 = r1 * r0
            double r0 = (double) r1
            r4.A07(r0)
            double r0 = (double) r5
            r4.A06(r0)
            r8.A05()
            goto L19
        */
        throw new UnsupportedOperationException("Method not decompiled: X.GestureDetectorOnGestureListenerC43829JZs.onTouchEvent(android.view.MotionEvent):boolean");
    }
}
