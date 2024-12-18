package com.instagram.ui.widget.gallery;

import X.AbstractC018607g;
import X.AbstractC10360h2;
import X.AbstractC13320mI;
import X.AbstractC166987dD;
import X.AbstractC166997dE;
import X.AbstractC167007dF;
import X.AbstractC31171DnF;
import X.AbstractC31172DnG;
import X.AbstractC31173DnH;
import X.AbstractC43594JPz;
import X.AbstractC46674Kkr;
import X.AbstractC47033Kqq;
import X.AbstractC55922hc;
import X.AbstractC93174Ft;
import X.C0fA;
import X.C14360o3;
import X.C189088Yy;
import X.C195838lR;
import X.C2AH;
import X.C44325JiI;
import X.C44420JkF;
import X.C44503Jm9;
import X.C48263LXm;
import X.EnumC188968Ym;
import X.InterfaceC16820sZ;
import X.InterfaceC23471Cj;
import X.InterfaceC56392iX;
import X.L0R;
import X.MPK;
import X.MQI;
import X.ViewOnClickListenerC48073LPy;
import X.ViewOnTouchListenerC195698lA;
import android.app.Activity;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.GridView;
import android.widget.TextView;
import androidx.core.app.ComponentActivity;
import androidx.fragment.app.FragmentActivity;
import com.facebook.R;
import com.instagram.common.gallery.Medium;
import com.instagram.common.gallery.RemoteMedia;
import com.instagram.common.gallery.model.GalleryItem;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.base.IgFrameLayout;
import com.instagram.ui.inlinegallerysendbutton.InlineGallerySendButton;
import com.instagram.ui.widget.mediapicker.MediaPickerItemView;
import java.util.LinkedHashSet;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes8.dex */
public final class GalleryView extends FrameLayout {
    public float A00;
    public int A01;
    public int A02;
    public int A03;
    public AbstractC018607g A04;
    public EnumC188968Ym A05;
    public C189088Yy A06;
    public UserSession A07;
    public C2AH A08;
    public C48263LXm A09;
    public C195838lR A0A;
    public ViewOnTouchListenerC195698lA A0B;
    public C44420JkF A0C;
    public C44503Jm9 A0D;
    public MPK A0E;
    public MQI A0F;
    public InterfaceC16820sZ A0G;
    public boolean A0H;
    public boolean A0I;
    public boolean A0J;
    public boolean A0K;
    public boolean A0L;
    public boolean A0M;
    public boolean A0N;
    public boolean A0O;
    public int A0P;
    public boolean A0Q;
    public boolean A0R;
    public boolean A0S;
    public final GridView A0T;
    public final IgFrameLayout A0U;
    public final IgFrameLayout A0V;
    public final InterfaceC56392iX A0W;
    public final InlineGallerySendButton A0X;
    public final LinkedHashSet A0Y;
    public final TextView A0Z;
    public final InterfaceC23471Cj A0a;
    public final L0R A0b;

    public final void setPermissionRequestSuccessCallback(InterfaceC16820sZ interfaceC16820sZ) {
        C14360o3.A0B(interfaceC16820sZ, 0);
        this.A0G = interfaceC16820sZ;
    }

    public /* synthetic */ GalleryView(UserSession userSession, Context context, AttributeSet attributeSet, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(userSession, context, (i & 4) != 0 ? null : attributeSet);
    }

    /* JADX WARN: Code restructure failed: missing block: B:44:0x0141, code lost:
    
        if (X.C18U.A06(X.C06090Tz.A05, r9, 36316645727343164L) == false) goto L47;
     */
    /* JADX WARN: Type inference failed for: r16v2, types: [java.lang.Object, X.2pF] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void A01() {
        /*
            Method dump skipped, instructions count: 402
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.ui.widget.gallery.GalleryView.A01():void");
    }

    private final void A02(int i) {
        GridView gridView = this.A0T;
        int firstVisiblePosition = gridView.getFirstVisiblePosition();
        int lastVisiblePosition = gridView.getLastVisiblePosition();
        if (gridView.getChildCount() > 0 && i >= firstVisiblePosition && i <= lastVisiblePosition) {
            View childAt = gridView.getChildAt(i - firstVisiblePosition);
            C14360o3.A0C(childAt, "null cannot be cast to non-null type com.instagram.ui.widget.mediapicker.MediaPickerItemView");
            MediaPickerItemView mediaPickerItemView = (MediaPickerItemView) childAt;
            if (mediaPickerItemView != null) {
                mediaPickerItemView.A01();
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:101:0x0124, code lost:
    
        if (r11.A06() == false) goto L72;
     */
    /* JADX WARN: Code restructure failed: missing block: B:111:0x0103, code lost:
    
        if (r11.A06() == false) goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x019e, code lost:
    
        if (r1 == null) goto L110;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void A03(com.instagram.common.gallery.model.GalleryItem r11, com.instagram.ui.widget.gallery.GalleryView r12, java.lang.Integer r13) {
        /*
            Method dump skipped, instructions count: 435
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.ui.widget.gallery.GalleryView.A03(com.instagram.common.gallery.model.GalleryItem, com.instagram.ui.widget.gallery.GalleryView, java.lang.Integer):void");
    }

    public static final void A04(GalleryView galleryView) {
        if (AbstractC47033Kqq.A00(galleryView.A07)) {
            if (galleryView.A09 == null) {
                galleryView.A01();
            }
            C48263LXm c48263LXm = galleryView.A09;
            if (c48263LXm != null) {
                c48263LXm.A03();
                return;
            }
            return;
        }
        C189088Yy c189088Yy = galleryView.A06;
        if (c189088Yy != null) {
            c189088Yy.A01(null);
            return;
        }
        throw AbstractC166997dE.A0g();
    }

    public static final void A05(GalleryView galleryView) {
        ViewOnClickListenerC48073LPy viewOnClickListenerC48073LPy = new ViewOnClickListenerC48073LPy(galleryView, 55);
        C195838lR permissionEmptyStateController = galleryView.getPermissionEmptyStateController();
        Context context = galleryView.getContext();
        permissionEmptyStateController.A05(context.getString(2131959515));
        permissionEmptyStateController.A04(context.getString(2131959514));
        permissionEmptyStateController.A02(2131959516);
        permissionEmptyStateController.A03(viewOnClickListenerC48073LPy);
    }

    public static final void A07(GalleryView galleryView) {
        int i;
        InterfaceC56392iX interfaceC56392iX;
        Boolean bool;
        C44503Jm9 c44503Jm9 = galleryView.A0D;
        if (c44503Jm9 == null || (bool = (Boolean) c44503Jm9.A01.A02()) == null || !bool.booleanValue()) {
            C44420JkF c44420JkF = galleryView.A0C;
            i = 0;
            if (c44420JkF != null && c44420JkF.getCount() == 0) {
                interfaceC56392iX = galleryView.A0W;
                interfaceC56392iX.setVisibility(i);
            }
        }
        interfaceC56392iX = galleryView.A0W;
        i = 8;
        interfaceC56392iX.setVisibility(i);
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x0018, code lost:
    
        if (r1 != true) goto L10;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void A08(com.instagram.ui.widget.gallery.GalleryView r4) {
        /*
            com.instagram.common.ui.base.IgFrameLayout r3 = r4.A0V
            if (r3 == 0) goto L1f
            X.Jm9 r0 = r4.A0D
            r2 = 1
            if (r0 == 0) goto L1a
            X.2GT r0 = r0.A01
            java.lang.Object r0 = r0.A02()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            if (r0 == 0) goto L1a
            boolean r1 = r0.booleanValue()
            r0 = 0
            if (r1 == r2) goto L1c
        L1a:
            r0 = 8
        L1c:
            r3.setVisibility(r0)
        L1f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.ui.widget.gallery.GalleryView.A08(com.instagram.ui.widget.gallery.GalleryView):void");
    }

    public static final boolean A0A(GalleryView galleryView) {
        Object obj;
        if (AbstractC47033Kqq.A00(galleryView.A07)) {
            obj = galleryView.A09;
        } else {
            obj = galleryView.A06;
        }
        if (obj != null) {
            return true;
        }
        return false;
    }

    private final C195838lR getPermissionEmptyStateController() {
        C195838lR c195838lR = this.A0A;
        if (c195838lR == null) {
            C195838lR c195838lR2 = new C195838lR(this, R.layout.gallery_permissions_view);
            this.A0A = c195838lR2;
            return c195838lR2;
        }
        return c195838lR;
    }

    public final void A0B() {
        MQI mqi;
        LinkedHashSet linkedHashSet = this.A0Y;
        int size = linkedHashSet.size();
        GridView gridView = this.A0T;
        int childCount = gridView.getChildCount();
        if (childCount != 0) {
            for (int i = 0; i < childCount; i++) {
                View childAt = gridView.getChildAt(i);
                if (childAt instanceof MediaPickerItemView) {
                    ((MediaPickerItemView) childAt).A01();
                }
            }
        }
        linkedHashSet.clear();
        this.A0X.setVisibility(8);
        this.A0Z.setVisibility(8);
        if (size > 0 && (mqi = this.A0F) != null) {
            mqi.DU8(0, size, false);
        }
    }

    public final AbstractC018607g getLoaderManager() {
        ComponentActivity componentActivity;
        if (this.A04 == null) {
            try {
                if (this.A0J) {
                    this.A04 = AbstractC018607g.A00(AbstractC10360h2.A01(this));
                }
            } catch (IllegalStateException unused) {
            }
            if (this.A04 == null && (componentActivity = (ComponentActivity) AbstractC13320mI.A00(getContext(), FragmentActivity.class)) != null) {
                this.A04 = AbstractC018607g.A00(componentActivity);
            }
        }
        return this.A04;
    }

    public final int getMaxMultiSelectCount() {
        return this.A02;
    }

    public final int getMaxMultiVideoCount() {
        return this.A03;
    }

    public final List getSelectedItems() {
        return AbstractC166987dD.A1F(this.A0Y);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        if (this.A0S) {
            i = AbstractC46674Kkr.A00(i, i2);
            i2 = i;
        }
        super.onMeasure(i, i2);
    }

    public final void setAspectRatio(float f) {
        this.A00 = f;
    }

    public final void setColumnCount(int i) {
        this.A01 = i;
    }

    public final void setFastScrollerEnabled(boolean z) {
        this.A0L = z;
    }

    public final void setGalleryDataLoadedListener(MPK mpk) {
        this.A0E = mpk;
    }

    public final void setGalleryLoadCallback(C2AH c2ah) {
        this.A08 = c2ah;
    }

    public final void setIsCaptureButtonEnabled(boolean z) {
        this.A0H = z;
    }

    public final void setIsCheckmarksEnabled(boolean z) {
        this.A0K = z;
    }

    public final void setKeepSelectionOnFolderChange(boolean z) {
        this.A0N = z;
    }

    public final void setLeftAlignCheckBoxes(boolean z) {
        C44420JkF c44420JkF;
        if (this.A0I != z) {
            this.A0I = z;
            if (A0A(this) && (c44420JkF = this.A0C) != null) {
                C0fA.A00(c44420JkF, -598885812);
            }
        }
    }

    public final void setLoaderManager(AbstractC018607g abstractC018607g) {
        this.A04 = abstractC018607g;
    }

    public final void setMaxMultiSelectCount(int i) {
        C44420JkF c44420JkF;
        if (i >= 0) {
            if (this.A02 != i) {
                this.A02 = i;
                this.A0Z.setText(AbstractC43594JPz.A0t(getResources(), i, 2131973246));
                if (A0A(this) && (c44420JkF = this.A0C) != null) {
                    C0fA.A00(c44420JkF, -136868782);
                    return;
                }
                return;
            }
            return;
        }
        throw AbstractC31172DnG.A0u();
    }

    public final void setMaxMultiVideoCount(int i) {
        C44420JkF c44420JkF;
        if (i >= 0) {
            if (this.A03 != i) {
                this.A03 = i;
                this.A0Z.setText(AbstractC43594JPz.A0t(getResources(), i, 2131973249));
                if (A0A(this) && (c44420JkF = this.A0C) != null) {
                    C0fA.A00(c44420JkF, 1827317484);
                    return;
                }
                return;
            }
            return;
        }
        throw AbstractC31172DnG.A0u();
    }

    public final void setMode(EnumC188968Ym enumC188968Ym) {
        this.A05 = enumC188968Ym;
    }

    public final void setRemoteMediaEnabled(boolean z) {
        this.A0O = z;
        C44503Jm9 c44503Jm9 = this.A0D;
        if (c44503Jm9 != null) {
            AbstractC166997dE.A1Y(c44503Jm9.A04, z);
        }
    }

    public final void setUserActionListener(MQI mqi) {
        this.A0F = mqi;
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0019, code lost:
    
        if (X.C18U.A06(r2, r4, 36311560487305837L) == false) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void setUserSession(com.instagram.common.session.UserSession r4) {
        /*
            r3 = this;
            r3.A07 = r4
            X.0Tz r2 = X.C06090Tz.A06
            r0 = 36311560486191708(0x81012c0005025c, double:3.0269152941611327E-306)
            boolean r0 = X.C18U.A06(r2, r4, r0)
            if (r0 == 0) goto L1b
            r0 = 36311560487305837(0x81012c0016026d, double:3.0269152948657123E-306)
            boolean r1 = X.C18U.A06(r2, r4, r0)
            r0 = 1
            if (r1 != 0) goto L1c
        L1b:
            r0 = 0
        L1c:
            r3.A0J = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.ui.widget.gallery.GalleryView.setUserSession(com.instagram.common.session.UserSession):void");
    }

    public static final void A06(GalleryView galleryView) {
        Activity rootActivity = galleryView.getRootActivity();
        if (rootActivity != null) {
            AbstractC93174Ft.A01(rootActivity, galleryView.A0a);
        }
    }

    public static final boolean A09(GalleryItem galleryItem) {
        int i;
        if (galleryItem.A02()) {
            Medium medium = galleryItem.A00;
            if (medium != null) {
                i = medium.A03;
            } else {
                throw AbstractC166987dD.A14("Required value was null.");
            }
        } else if (galleryItem.A04()) {
            RemoteMedia remoteMedia = galleryItem.A04;
            if (remoteMedia != null) {
                i = remoteMedia.A01;
            } else {
                throw AbstractC166987dD.A14("Required value was null.");
            }
        } else {
            return false;
        }
        return AbstractC167007dF.A1O((i > 90000L ? 1 : (i == 90000L ? 0 : -1)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Activity getRootActivity() {
        Activity activity = (Activity) AbstractC13320mI.A00(getContext(), Activity.class);
        if (activity != null) {
            Activity parent = activity.getParent();
            if (parent != null) {
                return parent;
            }
            return activity;
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00bc  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A0C() {
        /*
            r9 = this;
            r9.A0B()
            boolean r0 = A0A(r9)
            if (r0 != 0) goto Lc
            r9.A01()
        Lc:
            com.instagram.common.session.UserSession r4 = r9.A07
            if (r4 == 0) goto Lb5
            android.content.Context r3 = X.AbstractC166997dE.A0L(r9)
            boolean r0 = X.AbstractC193398hK.A00(r3, r4)
            if (r0 == 0) goto Lb5
            r2 = 0
            X.KKF r1 = new X.KKF
            r1.<init>(r3)
            r0 = 1
            X.AbstractC46687Kl4.A00(r3, r4, r1, r0, r2)
            com.instagram.common.ui.base.IgFrameLayout r0 = r9.A0U
            r0.addView(r1)
        L29:
            com.instagram.common.session.UserSession r8 = r9.A07
            com.instagram.common.ui.base.IgFrameLayout r6 = r9.A0V
            if (r6 == 0) goto L76
            if (r8 == 0) goto L76
            X.0Tz r7 = X.C06090Tz.A05
            r0 = 36316645727146553(0x8105cc00001239, double:3.0301312210175984E-306)
            boolean r0 = X.AbstractC31178DnM.A1X(r7, r8, r0)
            if (r0 == 0) goto L76
            android.content.Context r5 = X.AbstractC166997dE.A0L(r9)
            r4 = 1
            X.LFH r0 = X.AbstractC47184KtJ.A00
            java.lang.String r3 = r0.A01(r5, r8)
            r0 = 2131963088(0x7f132cd0, float:1.956292E38)
            java.lang.String r2 = r5.getString(r0)
            r0 = 36882653697278411(0x830894000001cb, double:3.388076940460145E-306)
            java.lang.String r0 = X.C18U.A04(r7, r8, r0)
            android.text.SpannableStringBuilder r1 = X.LFH.A00(r5, r8, r3, r2, r0)
            r0 = 2131442641(0x7f0b3bd1, float:1.8507328E38)
            android.widget.TextView r0 = X.AbstractC25230BEn.A0Q(r6, r0)
            r0.setClickable(r4)
            r0.setLinksClickable(r4)
            X.AbstractC25227BEk.A11(r0)
            if (r1 != 0) goto L71
            java.lang.String r1 = ""
        L71:
            java.lang.CharSequence r1 = (java.lang.CharSequence) r1
            r0.setText(r1)
        L76:
            A08(r9)
            android.content.Context r0 = X.AbstractC166997dE.A0L(r9)
            boolean r0 = X.AbstractC93174Ft.A03(r0)
            if (r0 == 0) goto Lbc
            A04(r9)
            android.widget.GridView r1 = r9.A0T
            int r0 = r1.getVisibility()
            r5 = 1
            if (r0 == 0) goto Lb2
            X.2hf r0 = X.C150956qv.A02
            r4 = 0
            X.5le r0 = X.AbstractC43592JPx.A0o(r1, r4)
            X.5le r3 = r0.A0F(r5)
            float r2 = X.AbstractC166987dD.A08(r1)
            int r0 = r1.getNumColumns()
            float r0 = (float) r0
            r1 = 1065353216(0x3f800000, float:1.0)
            float r0 = r1 / r0
            float r0 = r0 + r1
            float r2 = r2 * r0
            r0 = 0
            r3.A0T(r2, r0)
            r3.A04 = r4
            r3.A0H()
        Lb2:
            r9.A0M = r5
            return
        Lb5:
            com.instagram.common.ui.base.IgFrameLayout r0 = r9.A0U
            r0.removeAllViews()
            goto L29
        Lbc:
            A06(r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.ui.widget.gallery.GalleryView.A0C():void");
    }

    @Override // android.view.View
    public void setNestedScrollingEnabled(boolean z) {
        super.setNestedScrollingEnabled(z);
        this.A0T.setNestedScrollingEnabled(isNestedScrollingEnabled());
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public GalleryView(UserSession userSession, Context context, AttributeSet attributeSet) {
        this(userSession, context, attributeSet, 0);
        C14360o3.A0B(context, 2);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GalleryView(UserSession userSession, Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C14360o3.A0B(context, 2);
        this.A07 = userSession;
        this.A0Y = AbstractC31171DnF.A0l();
        this.A00 = 1.0f;
        this.A0O = true;
        this.A0a = new C44325JiI(this, 7);
        this.A0b = new L0R(context, this);
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, AbstractC55922hc.A0s, 0, 0);
        C14360o3.A07(obtainStyledAttributes);
        try {
            this.A0S = obtainStyledAttributes.getBoolean(6, true);
            this.A0R = obtainStyledAttributes.getBoolean(5, true);
            this.A0I = obtainStyledAttributes.getBoolean(2, false);
            this.A0Q = obtainStyledAttributes.getBoolean(4, true);
            this.A02 = obtainStyledAttributes.getInteger(3, 10);
            this.A01 = obtainStyledAttributes.getInt(0, 3);
            this.A0H = obtainStyledAttributes.getBoolean(1, false);
            obtainStyledAttributes.recycle();
            addView(LayoutInflater.from(context).inflate(R.layout.composer_layout, (ViewGroup) this, false));
            this.A0X = (InlineGallerySendButton) requireViewById(R.id.inline_gallery_send_button);
            GridView gridView = (GridView) requireViewById(R.id.gallery_grid);
            this.A0T = gridView;
            gridView.setNestedScrollingEnabled(isNestedScrollingEnabled());
            this.A0V = (IgFrameLayout) findViewById(R.id.info_panel);
            TextView A0T = AbstractC166997dE.A0T(this, R.id.max_limit_view);
            this.A0Z = A0T;
            A0T.setText(AbstractC43594JPz.A0t(getResources(), this.A02, 2131973246));
            this.A0W = AbstractC31173DnH.A0U(this, R.id.inline_gallery_empty_view_stub);
            this.A0U = (IgFrameLayout) requireViewById(R.id.gallery_partial_permission_container);
            setClipChildren(false);
        } catch (Throwable th) {
            obtainStyledAttributes.recycle();
            throw th;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public GalleryView(UserSession userSession, Context context) {
        this(userSession, context, null);
        C14360o3.A0B(context, 2);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public GalleryView(Context context, AttributeSet attributeSet) {
        this(null, context, attributeSet, 0);
        C14360o3.A0B(context, 1);
    }
}
