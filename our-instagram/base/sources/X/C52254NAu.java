package X;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Point;
import android.graphics.PointF;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.os.Bundle;
import android.os.Looper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.TranslateAnimation;
import android.widget.FrameLayout;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.R;
import com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.basic.SurfaceCropFilterModel;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.base.IgSimpleImageView;
import com.instagram.creation.activity.MediaCaptureActivity;
import com.instagram.creation.album.AlbumPostCapCropToggleButton;
import com.instagram.creation.base.CreationSession;
import com.instagram.creation.base.CropInfo;
import com.instagram.creation.base.MediaSession;
import com.instagram.creation.base.PhotoSession;
import com.instagram.creation.base.VideoSession;
import com.instagram.creation.base.ui.grid.GridLinesView;
import com.instagram.creation.fragment.AlbumEditFragment;
import com.instagram.creation.photo.edit.surfacecropfilter.SurfaceCropFilter;
import com.instagram.filterkit.filtergroup.model.impl.FilterGroupModelImpl;
import com.instagram.filterkit.filtergroup.model.intf.FilterGroupModel;
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: X.NAu, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C52254NAu extends AbstractC60592pi implements InterfaceC60072op, InterfaceC55932he, InterfaceC58030PoG, InterfaceC58141Pq6 {
    public static final C55942hf A0d = C55942hf.A04(80.0d, 9.0d);
    public float A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public int A05;
    public View A06;
    public View A07;
    public FrameLayout A08;
    public IgSimpleImageView A09;
    public C54392O1y A0A;
    public TextureViewSurfaceTextureListenerC56204OxD A0B;
    public ViewOnTouchListenerC55481Oka A0C;
    public C5L6 A0D;
    public List A0E;
    public AtomicInteger A0F;
    public boolean A0G;
    public boolean A0H;
    public boolean A0I;
    public int A0J;
    public View A0K;
    public ViewOnTouchListenerC51201Mjl A0L;
    public final int A0M;
    public final Context A0N;
    public final FragmentActivity A0O;
    public final UserSession A0P;
    public final MbI A0Q = new MbI(Looper.getMainLooper(), this);
    public final InterfaceC58203Pr9 A0R;
    public final CreationSession A0S;
    public final AlbumEditFragment A0T;
    public final AlbumEditFragment A0U;
    public final O2M A0V;
    public final InterfaceC58286Pse A0W;
    public final InterfaceC189598ae A0X;
    public final C55982hj A0Y;
    public final InterfaceC57810Pkc A0Z;
    public final C51202Mjm A0a;
    public final AnonymousClass840 A0b;
    public final Map A0c;

    public static TextureViewSurfaceTextureListenerC56204OxD A01(View view, C52254NAu c52254NAu, MediaSession mediaSession, C47Z c47z) {
        String valueOf;
        SurfaceCropFilter surfaceCropFilter = new SurfaceCropFilter(true);
        int i = c47z.A0H;
        int i2 = c47z.A0G;
        float f = c52254NAu.A0S.A00;
        if (f == 0.0f) {
            f = 1.0f;
        }
        Rect A00 = MX2.A00(f, i, i2, 0, false);
        surfaceCropFilter.A0K(A00, c47z.A0H, c47z.A0G, 0, true);
        UserSession userSession = c52254NAu.A0P;
        if (!C18U.A06(C06090Tz.A05, userSession, 36328465477156396L) || mediaSession.B6P() == null) {
            FilterGroupModelImpl A002 = C9OA.A00();
            A002.EUT(surfaceCropFilter.A00, 3);
            mediaSession.EUW(A002);
            c47z.A1D = A002;
            mediaSession.ESU(new CropInfo(A00, c47z.A0H, c47z.A0G));
        }
        String str = c47z.A33;
        if (str == null) {
            valueOf = "_empty_file";
        } else {
            valueOf = String.valueOf(str.hashCode());
        }
        String A0g = AnonymousClass001.A0g(mediaSession.BcD(), "_", valueOf);
        if (str == null) {
            str = c52254NAu.A02(c47z, c52254NAu.A03, c52254NAu.A02);
            c47z.A33 = str;
        }
        MXA mxa = ((MediaCaptureActivity) c52254NAu.A0Z).A08;
        mxa.getClass();
        C14360o3.A0B(A0g, 0);
        InterfaceC58165PqV ALt = mxa.A07.ALt(A0g, str);
        if (ALt == null) {
            Object obj = mxa.A09.get(A0g);
            if (obj != null) {
                ALt = (InterfaceC58165PqV) obj;
            } else {
                throw AbstractC166997dE.A0g();
            }
        }
        return new TextureViewSurfaceTextureListenerC56204OxD(view, userSession, ALt, mediaSession.B6P(), c47z, c52254NAu.A03, c52254NAu.A02);
    }

    public static void A03(Context context, UserSession userSession, C52254NAu c52254NAu, TextureViewSurfaceTextureListenerC56204OxD textureViewSurfaceTextureListenerC56204OxD, FilterGroupModel filterGroupModel) {
        C9KJ c9kj;
        C9KW c9kw;
        C14360o3.A0B(userSession, 0);
        textureViewSurfaceTextureListenerC56204OxD.A03(new C9KK(context, userSession, filterGroupModel, "feed_post_cap_preview", false, C18U.A06(C06090Tz.A05, userSession, 36318157557864416L)));
        if (c52254NAu.A0G && (c9kj = textureViewSurfaceTextureListenerC56204OxD.A01) != null && (c9kw = c9kj.A08) != null) {
            c9kw.A09();
        }
    }

    public static void A0B(C52254NAu c52254NAu, InterfaceC58195Pr1 interfaceC58195Pr1) {
        FilterGroupModel filterGroupModel = null;
        if (interfaceC58195Pr1 != null && interfaceC58195Pr1.Cff()) {
            TextureViewSurfaceTextureListenerC56204OxD textureViewSurfaceTextureListenerC56204OxD = c52254NAu.A0B;
            if (textureViewSurfaceTextureListenerC56204OxD != null && textureViewSurfaceTextureListenerC56204OxD.equals(interfaceC58195Pr1)) {
                TextureViewSurfaceTextureListenerC56204OxD textureViewSurfaceTextureListenerC56204OxD2 = (TextureViewSurfaceTextureListenerC56204OxD) interfaceC58195Pr1;
                if (textureViewSurfaceTextureListenerC56204OxD2.A02) {
                    textureViewSurfaceTextureListenerC56204OxD2.A02 = false;
                    C9KJ c9kj = textureViewSurfaceTextureListenerC56204OxD2.A01;
                    if (c9kj != null) {
                        c9kj.A03();
                    }
                    textureViewSurfaceTextureListenerC56204OxD2.A03 = true;
                    return;
                }
                return;
            }
            TextureViewSurfaceTextureListenerC56204OxD textureViewSurfaceTextureListenerC56204OxD3 = c52254NAu.A0B;
            if (textureViewSurfaceTextureListenerC56204OxD3 != null) {
                TextureViewSurfaceTextureListenerC56204OxD.A01(textureViewSurfaceTextureListenerC56204OxD3);
            }
            TextureViewSurfaceTextureListenerC56204OxD textureViewSurfaceTextureListenerC56204OxD4 = (TextureViewSurfaceTextureListenerC56204OxD) interfaceC58195Pr1;
            c52254NAu.A0B = textureViewSurfaceTextureListenerC56204OxD4;
            FilterGroupModel filterGroupModel2 = textureViewSurfaceTextureListenerC56204OxD4.A07;
            if (filterGroupModel2 == null) {
                filterGroupModel2 = ((MediaSession) Collections.unmodifiableList(c52254NAu.A0S.A0E).get(c52254NAu.A0R.AuK())).B6P();
            }
            if (filterGroupModel2 != null && ((FilterGroupModelImpl) filterGroupModel2).A04) {
                filterGroupModel = filterGroupModel2;
            }
            A03(c52254NAu.A0N, c52254NAu.A0P, c52254NAu, textureViewSurfaceTextureListenerC56204OxD4, filterGroupModel);
            return;
        }
        TextureViewSurfaceTextureListenerC56204OxD textureViewSurfaceTextureListenerC56204OxD5 = c52254NAu.A0B;
        if (textureViewSurfaceTextureListenerC56204OxD5 == null) {
            return;
        }
        TextureViewSurfaceTextureListenerC56204OxD.A01(textureViewSurfaceTextureListenerC56204OxD5);
        c52254NAu.A0B = null;
    }

    @Override // X.InterfaceC55932he
    public final void Dnk(C55982hj c55982hj) {
    }

    @Override // X.InterfaceC55932he
    public final void Dnl(C55982hj c55982hj) {
    }

    public static C50727MaS A00(View view, C52254NAu c52254NAu, MediaSession mediaSession) {
        InterfaceC58286Pse interfaceC58286Pse = c52254NAu.A0W;
        InterfaceC197218ns Bmb = interfaceC58286Pse.Bmb(mediaSession.B6E());
        UserSession userSession = c52254NAu.A0P;
        FilterGroupModel B6P = mediaSession.B6P();
        AnonymousClass840 anonymousClass840 = c52254NAu.A0b;
        MXB mxb = ((MediaCaptureActivity) interfaceC58286Pse).A07;
        mxb.getClass();
        C50727MaS c50727MaS = new C50727MaS(view, userSession, mediaSession, mxb, anonymousClass840, Bmb, B6P);
        if (Bmb.CVj()) {
            Bmb.Ecn(new O7G(c52254NAu, c50727MaS));
        }
        return c50727MaS;
    }

    public static void A04(View view, C52254NAu c52254NAu, boolean z) {
        int indexOfChild;
        C5L6 c5l6;
        C5L6 c5l62;
        UserSession userSession = c52254NAu.A0P;
        if (OOP.A00(userSession).booleanValue()) {
            InterfaceC58203Pr9 interfaceC58203Pr9 = c52254NAu.A0R;
            indexOfChild = interfaceC58203Pr9.indexOfChild(view);
            if (indexOfChild != -1 && !c52254NAu.A0H(indexOfChild)) {
                CreationSession creationSession = c52254NAu.A0S;
                creationSession.A0E.remove(indexOfChild);
                creationSession.A0H = true;
                C43878Jai A00 = AbstractC43847JaB.A00(userSession);
                if (indexOfChild >= 0) {
                    List list = A00.A03;
                    if (indexOfChild < list.size()) {
                        list.remove(indexOfChild);
                    }
                }
                interfaceC58203Pr9.removeItem(indexOfChild);
                View view2 = c52254NAu.A06;
                if (view2 != null) {
                    view2.setVisibility(0);
                    c52254NAu.A06 = null;
                }
                c52254NAu.A0U.A0P();
                A06(c52254NAu);
                C6WI.A01().A01++;
                AnonymousClass229.A01(userSession).A26(z);
                A08(c52254NAu);
                c5l6 = c52254NAu.A0D;
                c5l62 = C5L6.A0B;
                if (c5l6 != c5l62 && c52254NAu.A0I) {
                    int i = c52254NAu.A05;
                    if (i == indexOfChild) {
                        A0C(c52254NAu, c5l62);
                        return;
                    } else {
                        if (indexOfChild >= i) {
                            return;
                        }
                        c52254NAu.A05 = i - 1;
                        return;
                    }
                }
                return;
            }
            A0G(c52254NAu, Collections.unmodifiableList(c52254NAu.A0S.A0E), false);
        }
        InterfaceC58203Pr9 interfaceC58203Pr92 = c52254NAu.A0R;
        indexOfChild = interfaceC58203Pr92.indexOfChild(view);
        if (indexOfChild != -1) {
            List list2 = c52254NAu.A0E;
            if (indexOfChild != list2.size()) {
                CreationSession creationSession2 = c52254NAu.A0S;
                List list3 = creationSession2.A0E;
                list3.remove(indexOfChild);
                creationSession2.A0H = true;
                C43878Jai A002 = AbstractC43847JaB.A00(userSession);
                if (indexOfChild >= 0) {
                    List list4 = A002.A03;
                    if (indexOfChild < list4.size()) {
                        list4.remove(indexOfChild);
                    }
                }
                list2.remove(indexOfChild);
                interfaceC58203Pr92.removeView(view);
                int AnZ = interfaceC58203Pr92.AnZ() - 1;
                if (indexOfChild < AnZ) {
                    View AnU = interfaceC58203Pr92.AnU(indexOfChild);
                    if (AnU != null) {
                        TranslateAnimation translateAnimation = new TranslateAnimation(AbstractC166987dD.A07(AnU), 0.0f, 0.0f, 0.0f);
                        translateAnimation.setDuration(400L);
                        AnU.startAnimation(translateAnimation);
                        if (indexOfChild < AnZ - 1) {
                            int i2 = indexOfChild + 1;
                            if (interfaceC58203Pr92.AnU(i2) != null) {
                                interfaceC58203Pr92.AnU(i2).startAnimation(translateAnimation);
                            }
                        }
                    } else {
                        interfaceC58203Pr92.requestLayout();
                    }
                } else {
                    interfaceC58203Pr92.EMS(interfaceC58203Pr92.CEh());
                }
                View view3 = c52254NAu.A06;
                if (view3 != null) {
                    view3.setVisibility(0);
                    c52254NAu.A06 = null;
                }
                c52254NAu.A0U.A0P();
                A06(c52254NAu);
                C6WI.A01().A01++;
                AnonymousClass229.A01(userSession).A26(z);
                if (Collections.unmodifiableList(list3).size() <= 2 && C18U.A06(C06090Tz.A05, userSession, 36324015891033929L)) {
                    for (int i3 = 0; i3 < Collections.unmodifiableList(list3).size(); i3++) {
                        View AnU2 = interfaceC58203Pr92.AnU(i3);
                        AnU2.getClass();
                        AbstractC31176DnK.A1D(AnU2, R.id.filter_delete_view);
                    }
                }
                A08(c52254NAu);
                c5l6 = c52254NAu.A0D;
                c5l62 = C5L6.A0B;
                if (c5l6 != c5l62) {
                    return;
                } else {
                    return;
                }
            }
        }
        A0G(c52254NAu, Collections.unmodifiableList(c52254NAu.A0S.A0E), false);
    }

    public static void A07(C52254NAu c52254NAu) {
        if (c52254NAu.A06 != null) {
            int i = c52254NAu.A01;
            InterfaceC58203Pr9 interfaceC58203Pr9 = c52254NAu.A0R;
            View AnU = interfaceC58203Pr9.AnU(i);
            int indexOfChild = interfaceC58203Pr9.indexOfChild(c52254NAu.A06);
            if (AnU != null && AnU != c52254NAu.A06 && !c52254NAu.A0H(i) && indexOfChild >= 0) {
                int width = AnU.getWidth();
                if (indexOfChild > i) {
                    width = -width;
                }
                TranslateAnimation translateAnimation = new TranslateAnimation(width, 0.0f, 0.0f, 0.0f);
                translateAnimation.setDuration(400L);
                AnU.startAnimation(translateAnimation);
                View view = c52254NAu.A06;
                interfaceC58203Pr9.removeView(view);
                interfaceC58203Pr9.addView(view, i);
                interfaceC58203Pr9.requestLayout();
                List list = c52254NAu.A0E;
                list.add(i, list.remove(indexOfChild));
                CreationSession creationSession = c52254NAu.A0S;
                List list2 = creationSession.A0E;
                list2.add(i, list2.remove(indexOfChild));
                creationSession.A0H = true;
                AbstractC43847JaB.A00(c52254NAu.A0P).A00(indexOfChild, i);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x00a9  */
    /* JADX WARN: Type inference failed for: r3v0, types: [boolean] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void A08(X.C52254NAu r12) {
        /*
            com.instagram.common.ui.base.IgSimpleImageView r5 = r12.A09
            if (r5 == 0) goto Ld3
            boolean r0 = r5 instanceof com.instagram.creation.album.AlbumPostCapCropToggleButton
            r4 = 0
            if (r0 == 0) goto Lab
            r7 = r5
            com.instagram.creation.album.AlbumPostCapCropToggleButton r7 = (com.instagram.creation.album.AlbumPostCapCropToggleButton) r7
            com.instagram.creation.base.CreationSession r0 = r12.A0S
            java.util.List r0 = r0.A0E
            java.util.List r0 = java.util.Collections.unmodifiableList(r0)
            X.5L6 r6 = r12.A0D
            com.instagram.common.session.UserSession r8 = r12.A0P
            boolean r3 = X.AbstractC25233BEq.A1b(r0, r6, r8)
            java.util.ArrayList r9 = X.AbstractC167017dG.A0q(r0)
            java.util.Iterator r11 = r0.iterator()
        L24:
            boolean r0 = r11.hasNext()
            if (r0 == 0) goto L58
            com.instagram.creation.base.MediaSession r2 = X.MSW.A0R(r11)
            com.instagram.creation.base.CropInfo r0 = r2.AtF()
            if (r0 != 0) goto L3c
            X.5L6 r0 = X.C5L6.A0E
            float r0 = r0.A00
        L38:
            X.MSX.A1Q(r9, r0)
            goto L24
        L3c:
            int r10 = r0.A01
            int r1 = r0.A00
            X.PmZ r0 = r2.B2v()
            int r0 = r0.getValue()
            int r2 = r0 % 180
            float r1 = (float) r1
            r12 = r1
            float r0 = (float) r10
            if (r2 != 0) goto L51
            r1 = r0
            r0 = r12
        L51:
            float r1 = r1 / r0
            r0 = 0
            float r0 = X.AbstractC54248NyT.A00(r8, r0, r1)
            goto L38
        L58:
            X.0Tz r2 = X.C06090Tz.A06
            r0 = 36325154057892652(0x810d890008332c, double:3.0355119236417294E-306)
            boolean r10 = X.C18U.A06(r2, r8, r0)
            java.lang.Object r0 = X.AbstractC001800i.A0J(r9)
            java.lang.Number r0 = (java.lang.Number) r0
            if (r0 == 0) goto Lce
            float r0 = r0.floatValue()
        L6f:
            java.util.ArrayList r8 = X.AbstractC166987dD.A1E()
            X.5L6 r1 = X.AbstractC53886NsI.A00(r0)
            X.5L6 r2 = X.C5L6.A0E
            if (r1 == r2) goto L86
            float r1 = r2.A00
            int r1 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r1 <= 0) goto Lcb
            X.5L6 r1 = X.C5L6.A09
        L83:
            r8.add(r1)
        L86:
            r8.add(r2)
            if (r10 != 0) goto Lc5
            java.util.List r2 = X.AbstractC001800i.A0c(r9, r3)
            boolean r1 = r2 instanceof java.util.Collection
            if (r1 == 0) goto Laf
            boolean r1 = r2.isEmpty()
            if (r1 == 0) goto Laf
        L99:
            X.OTR r0 = new X.OTR
            r0.<init>(r6, r8)
            r7.setUiState(r0)
            java.util.List r0 = r0.A01
            int r0 = r0.size()
            if (r0 > r3) goto Lab
            r4 = 8
        Lab:
            r5.setVisibility(r4)
            return
        Laf:
            java.util.Iterator r2 = r2.iterator()
        Lb3:
            boolean r1 = r2.hasNext()
            if (r1 == 0) goto L99
            java.lang.Object r1 = r2.next()
            float r1 = X.AbstractC166987dD.A09(r1)
            int r1 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r1 <= 0) goto Lb3
        Lc5:
            X.5L6 r0 = X.C5L6.A0B
            r8.add(r0)
            goto L99
        Lcb:
            X.5L6 r1 = X.C5L6.A0C
            goto L83
        Lce:
            X.5L6 r0 = X.C5L6.A0E
            float r0 = r0.A00
            goto L6f
        Ld3:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C52254NAu.A08(X.NAu):void");
    }

    public static void A09(C52254NAu c52254NAu) {
        CreationSession creationSession = c52254NAu.A0S;
        Iterator A13 = AbstractC31174DnI.A13(creationSession.A0E);
        while (A13.hasNext()) {
            if (MSW.A0R(A13).Btq() == C05F.A00) {
                PhotoSession A02 = creationSession.A02();
                A02.getClass();
                FilterGroupModel filterGroupModel = A02.A07;
                filterGroupModel.getClass();
                SurfaceCropFilter A00 = A0R.A00(filterGroupModel, "AlbumRenderViewController_updateScaleInfo()");
                C53613NnK c53613NnK = (C53613NnK) creationSession.A0R.get(A02.A0B);
                if (A00 != null && c53613NnK != null) {
                    c53613NnK.A00 = A00.A00.A06.A06;
                }
            }
        }
    }

    public static void A0A(C52254NAu c52254NAu, int i) {
        if (c52254NAu.A06 != null) {
            InterfaceC58203Pr9 interfaceC58203Pr9 = c52254NAu.A0R;
            View AnU = interfaceC58203Pr9.AnU(i);
            int indexOfChild = interfaceC58203Pr9.indexOfChild(c52254NAu.A06);
            if (AnU != null && AnU != c52254NAu.A06 && !c52254NAu.A0H(i) && indexOfChild >= 0) {
                interfaceC58203Pr9.Epb(indexOfChild, i);
                interfaceC58203Pr9.EMN(i);
                CreationSession creationSession = c52254NAu.A0S;
                List list = creationSession.A0E;
                list.add(i, list.remove(indexOfChild));
                creationSession.A0H = true;
                AbstractC43847JaB.A00(c52254NAu.A0P).A00(indexOfChild, i);
                c52254NAu.A01 = i;
            }
        }
    }

    public static void A0C(C52254NAu c52254NAu, C5L6 c5l6) {
        String str;
        String A02;
        float f;
        c52254NAu.A0D = c5l6;
        float f2 = c5l6.A00;
        CreationSession creationSession = c52254NAu.A0S;
        List list = creationSession.A0E;
        if (!Collections.unmodifiableList(list).isEmpty()) {
            MediaSession mediaSession = (MediaSession) AbstractC166987dD.A16(Collections.unmodifiableList(list));
            C47Z BcC = c52254NAu.A0X.BcC(creationSession.A0C);
            if (c5l6 == C5L6.A0B && BcC != null) {
                if (c52254NAu.A0I) {
                    BcC.A04 = 2;
                    UserSession userSession = c52254NAu.A0P;
                    Iterator it = list.iterator();
                    MediaSession mediaSession2 = null;
                    float f3 = Float.MAX_VALUE;
                    while (it.hasNext()) {
                        MediaSession A0R = MSW.A0R(it);
                        CropInfo AtF = A0R.AtF();
                        if (AtF != null) {
                            int i = AtF.A01;
                            float f4 = AtF.A00;
                            float f5 = i;
                            if (A0R.B2v().getValue() % 180 == 0) {
                                f4 = f5;
                                f5 = f4;
                            }
                            f = AbstractC54248NyT.A00(userSession, null, f4 / f5);
                        } else {
                            f = Float.MAX_VALUE;
                        }
                        if (f < f3) {
                            mediaSession2 = A0R;
                            f3 = f;
                        }
                        if (f3 == 0.8f) {
                            break;
                        }
                    }
                    if (mediaSession2 != null) {
                        c52254NAu.A05 = Collections.unmodifiableList(list).indexOf(mediaSession2);
                        mediaSession = mediaSession2;
                    }
                } else {
                    BcC.A04 = 1;
                }
            }
            CropInfo AtF2 = mediaSession.AtF();
            if (c5l6.A04 && AtF2 != null) {
                UserSession userSession2 = c52254NAu.A0P;
                int i2 = AtF2.A01;
                float f6 = AtF2.A00;
                float f7 = i2;
                if (mediaSession.B2v().getValue() % 180 == 0) {
                    f6 = f7;
                    f7 = f6;
                }
                f2 = AbstractC54248NyT.A00(userSession2, null, f6 / f7);
            }
        }
        int i3 = c52254NAu.A0M;
        if (f2 < 1.0f) {
            c52254NAu.A03 = (int) (i3 * f2);
        } else {
            c52254NAu.A03 = i3;
            i3 = (int) (i3 / f2);
        }
        c52254NAu.A02 = i3;
        creationSession.A00 = f2;
        Iterator A13 = AbstractC31174DnI.A13(list);
        while (A13.hasNext()) {
            MediaSession A0R2 = MSW.A0R(A13);
            if (A0R2.Btq().intValue() != 0) {
                ((VideoSession) A0R2).A00 = f2;
                C47Z A0U = MSY.A0U(A0R2, c52254NAu.A0X);
                if (A0U != null) {
                    A0U.A02 = f2;
                    A0U.A1N.A00 = f2;
                    String BcD = A0R2.BcD();
                    int ordinal = c52254NAu.A0D.ordinal();
                    if (ordinal != 0) {
                        if (ordinal != 1) {
                            str = "_ninesixteen";
                        } else {
                            str = "_fourfive";
                        }
                    } else {
                        str = "_square";
                    }
                    String A0R3 = AnonymousClass001.A0R(BcD, str);
                    Map map = c52254NAu.A0c;
                    if (map.containsKey(A0R3)) {
                        A02 = AbstractC166987dD.A1A(A0R3, map);
                    } else {
                        A02 = c52254NAu.A02(A0U, c52254NAu.A03, c52254NAu.A02);
                        map.put(A0R3, A02);
                    }
                    A0U.A33 = A02;
                }
            } else {
                PhotoSession A03 = creationSession.A03(A0R2.B6E());
                if (A03 != null) {
                    A0E(c52254NAu, c5l6, A03, true);
                }
            }
        }
        creationSession.A05 = c52254NAu.A0D;
        A0G(c52254NAu, Collections.unmodifiableList(list), true);
        c52254NAu.A0L();
        c52254NAu.A0K();
        c52254NAu.A0U.A0Q();
    }

    public static void A0D(C52254NAu c52254NAu, C5L6 c5l6, MediaSession mediaSession, C47Z c47z) {
        String str;
        int i = c52254NAu.A0M;
        String A02 = c52254NAu.A02(c47z, (int) (i * c5l6.A00), i);
        String BcD = mediaSession.BcD();
        int ordinal = c5l6.ordinal();
        if (ordinal != 0) {
            if (ordinal != 1) {
                str = "_ninesixteen";
            } else {
                str = "_fourfive";
            }
        } else {
            str = "_square";
        }
        c52254NAu.A0c.put(AnonymousClass001.A0R(BcD, str), A02);
    }

    /* JADX WARN: Type inference failed for: r0v41, types: [java.lang.Object, X.NnK] */
    public static void A0E(C52254NAu c52254NAu, C5L6 c5l6, PhotoSession photoSession, boolean z) {
        Rect A00;
        InterfaceC197218ns Bmb = c52254NAu.A0W.Bmb(photoSession.A0B);
        UserSession userSession = c52254NAu.A0P;
        if (C2J9.A03(userSession)) {
            if (!z && Bmb.CS5()) {
                CreationSession creationSession = c52254NAu.A0S;
                String str = photoSession.A0B;
                Map map = creationSession.A0R;
                if (map.get(str) != null) {
                    FilterGroupModel filterGroupModel = photoSession.A07;
                    filterGroupModel.getClass();
                    SurfaceCropFilter A002 = A0R.A00(filterGroupModel, "AlbumRenderViewController_initRenderViews()");
                    if (A002 != null) {
                        SurfaceCropFilterModel.FitTransformParams fitTransformParams = new SurfaceCropFilterModel.FitTransformParams();
                        A002.A0L(fitTransformParams);
                        String str2 = photoSession.A0B;
                        PointF pointF = new PointF(fitTransformParams.A00, fitTransformParams.A01);
                        float f = fitTransformParams.A02;
                        ?? obj = new Object();
                        obj.A01 = pointF;
                        obj.A00 = f;
                        map.put(str2, obj);
                        return;
                    }
                    return;
                }
                return;
            }
        } else if (!z) {
            float f2 = c52254NAu.A0D.A00;
            float f3 = c52254NAu.A0S.A00;
            if (f3 == 0.0f) {
                f3 = 1.0f;
            }
            if (f2 == f3 && Bmb.CS5()) {
                return;
            }
        }
        float f4 = c52254NAu.A0D.A00;
        if (c5l6.A04 || C2J9.A00) {
            f4 = c52254NAu.A0S.A00;
            if (f4 == 0.0f) {
                f4 = 1.0f;
            }
        }
        FilterGroupModel filterGroupModel2 = photoSession.A07;
        filterGroupModel2.getClass();
        InterfaceC57929PmZ interfaceC57929PmZ = photoSession.A0D;
        int value = interfaceC57929PmZ.getValue();
        CropInfo cropInfo = photoSession.A05;
        if (cropInfo == null) {
            return;
        }
        int i = cropInfo.A01;
        int i2 = cropInfo.A00;
        Context context = c52254NAu.A0N;
        C85L A003 = C85K.A00(context, userSession);
        CropInfo cropInfo2 = photoSession.A05;
        int i3 = cropInfo2.A01;
        int i4 = cropInfo2.A00;
        int value2 = interfaceC57929PmZ.getValue();
        String str3 = photoSession.A0B;
        C14360o3.A0B(str3, 3);
        A003.A01(str3, C50700MZv.A00, i3, i4, value2);
        Rect A004 = C85K.A00(context, userSession).A00(photoSession.A0B);
        if (c52254NAu.A0D == C5L6.A0B && c52254NAu.A0H) {
            int i5 = photoSession.A01;
            Float valueOf = Float.valueOf(f4);
            int i6 = i5 % 180;
            float f5 = i2;
            float f6 = i;
            if (i6 == 0) {
                f5 = f6;
                f6 = f5;
            }
            f4 = AbstractC54248NyT.A00(userSession, valueOf, f5 / f6);
        }
        if (A004 != null && !c5l6.A03) {
            A00 = MX2.A02(A004, f4, i, i2, value);
        } else {
            A00 = MX2.A00(f4, i, i2, value, false);
        }
        CropInfo cropInfo3 = photoSession.A05;
        CropInfo cropInfo4 = new CropInfo(A00, cropInfo3.A01, cropInfo3.A00);
        photoSession.A05 = cropInfo4;
        Bmb.ESU(new CropInfo(A00, cropInfo4.A01, cropInfo4.A00));
        SurfaceCropFilter A005 = A0R.A00(filterGroupModel2, "AlbumRenderViewController_initRenderViews()");
        if (A005 == null) {
            return;
        }
        A005.A0K(A00, i, i2, value, z);
        CreationSession creationSession2 = c52254NAu.A0S;
        String str4 = photoSession.A0B;
        Map map2 = creationSession2.A0R;
        C53613NnK c53613NnK = (C53613NnK) map2.get(str4);
        if (c53613NnK == null) {
            return;
        }
        boolean A02 = C2J9.A02(userSession);
        float f7 = c53613NnK.A00;
        PointF pointF2 = c53613NnK.A01;
        if (A02) {
            A005.A0J(pointF2, f7);
            return;
        }
        synchronized (A005) {
            SurfaceCropFilterModel surfaceCropFilterModel = A005.A00;
            SurfaceCropFilterModel.FullTransform fullTransform = surfaceCropFilterModel.A06;
            float f8 = fullTransform.A06;
            if (f7 != f8) {
                if (surfaceCropFilterModel.A0D) {
                    fullTransform.A06 = f7;
                } else {
                    fullTransform.A06 = f8 * f7;
                }
            }
            SurfaceCropFilter.A09(A005, pointF2.x, pointF2.y);
            SurfaceCropFilter.A08(A005);
        }
        String str5 = photoSession.A0B;
        if (!map2.containsKey(str5)) {
            return;
        }
        map2.remove(str5);
    }

    public static void A0G(C52254NAu c52254NAu, List list, boolean z) {
        Object A00;
        PhotoSession A03;
        UserSession userSession = c52254NAu.A0P;
        if (OOP.A00(userSession).booleanValue()) {
            C54390O1w c54390O1w = new C54390O1w(c52254NAu);
            InterfaceC58203Pr9 interfaceC58203Pr9 = c52254NAu.A0R;
            interfaceC58203Pr9.COM(c54390O1w, list, c52254NAu.A03, c52254NAu.A02, z);
            interfaceC58203Pr9.EWk(new C54391O1x(c52254NAu));
            return;
        }
        InterfaceC58203Pr9 interfaceC58203Pr92 = c52254NAu.A0R;
        interfaceC58203Pr92.EF0();
        List list2 = c52254NAu.A0E;
        list2.clear();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            MediaSession A0R = MSW.A0R(it);
            Context context = c52254NAu.A0N;
            View inflate = LayoutInflater.from(context).inflate(R.layout.album_preview_view, (ViewGroup) interfaceC58203Pr92.Br3(), false);
            View requireViewById = inflate.requireViewById(R.id.album_filter_view_container);
            requireViewById.getLayoutParams().width = c52254NAu.A03;
            requireViewById.getLayoutParams().height = c52254NAu.A02;
            O2M o2m = c52254NAu.A0V;
            GridLinesView gridLinesView = (GridLinesView) inflate.requireViewById(R.id.straighten_grid_overlay_3);
            int color = context.getResources().getColor(AbstractC53242c7.A0H(context, R.attr.igds_color_separator_or_stroke_on_media));
            int i = c52254NAu.A03;
            int i2 = c52254NAu.A02;
            C14360o3.A0B(gridLinesView, 0);
            AbstractC43592JPx.A1G(gridLinesView, i);
            AbstractC43592JPx.A1F(gridLinesView, i2);
            gridLinesView.setInnerStrokeColor(color);
            o2m.A00.put(requireViewById, gridLinesView);
            ViewOnClickListenerC55464OkJ.A01(requireViewById, 24, A0R, c52254NAu);
            interfaceC58203Pr92.AAl(inflate);
            C47Z A0U = MSY.A0U(A0R, c52254NAu.A0X);
            if (A0R.Btq().intValue() != 0) {
                if (A0U == null) {
                    AbstractC12120kG.A01("AlbumRenderViewController", AnonymousClass001.A0u("pendingMedia is null and path for media type video mediasession, ", A0R.B6E(), "pendingMediakey value ", A0R.BcD()));
                } else {
                    A00 = A01(inflate, c52254NAu, A0R, A0U);
                }
            } else {
                A00 = A00(inflate, c52254NAu, A0R);
                if (C2J9.A02(userSession) && (A03 = c52254NAu.A0S.A03(A0R.B6E())) != null) {
                    A0E(c52254NAu, c52254NAu.A0D, A03, false);
                }
            }
            requireViewById.setOnLongClickListener(new ViewOnLongClickListenerC55479OkY(0, inflate, c52254NAu, A00));
            list2.add(A00);
            if (Collections.unmodifiableList(c52254NAu.A0S.A0E).size() > 2 && C18U.A06(C06090Tz.A05, userSession, 36324015891033929L)) {
                View requireViewById2 = inflate.requireViewById(R.id.filter_delete_view);
                requireViewById2.setVisibility(0);
                ViewOnClickListenerC55459OkE.A01(requireViewById2, c52254NAu, A0R, inflate, 6);
            }
        }
    }

    public static boolean A0I(Bitmap bitmap, View view, C52254NAu c52254NAu) {
        OXL oxl = AbstractC54340Nzy.A00;
        if (oxl.A06() || c52254NAu.A0T.A0S()) {
            return false;
        }
        view.getGlobalVisibleRect(AbstractC166987dD.A0U(), new Point());
        if (OOP.A01(c52254NAu)) {
            bitmap = C0fK.A00(bitmap, c52254NAu.A03, c52254NAu.A02, false);
        }
        oxl.A04(new C52376NFs(bitmap, view, r2.x, r2.y));
        return true;
    }

    public final void A0K() {
        UserSession userSession = this.A0P;
        if (OOP.A00(userSession).booleanValue()) {
            A0B(this, this.A0R.AuV());
            return;
        }
        if (this.A06 != null) {
            return;
        }
        if (this.A0R.CEh() < 500.0f) {
            int i = this.A01;
            List list = this.A0E;
            FilterGroupModel filterGroupModel = null;
            if (i < list.size() && ((InterfaceC58195Pr1) list.get(this.A01)).Cff()) {
                TextureViewSurfaceTextureListenerC56204OxD textureViewSurfaceTextureListenerC56204OxD = (TextureViewSurfaceTextureListenerC56204OxD) list.get(this.A01);
                TextureViewSurfaceTextureListenerC56204OxD textureViewSurfaceTextureListenerC56204OxD2 = this.A0B;
                if (textureViewSurfaceTextureListenerC56204OxD2 != null && textureViewSurfaceTextureListenerC56204OxD2.equals(textureViewSurfaceTextureListenerC56204OxD)) {
                    if (!textureViewSurfaceTextureListenerC56204OxD.A02) {
                        return;
                    }
                    textureViewSurfaceTextureListenerC56204OxD.A02 = false;
                    C9KJ c9kj = textureViewSurfaceTextureListenerC56204OxD.A01;
                    if (c9kj != null) {
                        c9kj.A03();
                    }
                    textureViewSurfaceTextureListenerC56204OxD.A03 = true;
                    return;
                }
                TextureViewSurfaceTextureListenerC56204OxD textureViewSurfaceTextureListenerC56204OxD3 = this.A0B;
                if (textureViewSurfaceTextureListenerC56204OxD3 != null) {
                    TextureViewSurfaceTextureListenerC56204OxD.A01(textureViewSurfaceTextureListenerC56204OxD3);
                }
                this.A0B = textureViewSurfaceTextureListenerC56204OxD;
                FilterGroupModel B6P = ((MediaSession) Collections.unmodifiableList(this.A0S.A0E).get(this.A01)).B6P();
                if (B6P != null && ((FilterGroupModelImpl) B6P).A04) {
                    filterGroupModel = B6P;
                }
                A03(this.A0N, userSession, this, textureViewSurfaceTextureListenerC56204OxD, filterGroupModel);
                return;
            }
            TextureViewSurfaceTextureListenerC56204OxD textureViewSurfaceTextureListenerC56204OxD4 = this.A0B;
            if (textureViewSurfaceTextureListenerC56204OxD4 == null) {
                return;
            }
            TextureViewSurfaceTextureListenerC56204OxD.A01(textureViewSurfaceTextureListenerC56204OxD4);
            this.A0B = null;
            return;
        }
        MbI mbI = this.A0Q;
        if (mbI.hasMessages(1)) {
            return;
        }
        mbI.sendEmptyMessageDelayed(1, 100L);
    }

    public final void A0M(boolean z, int i) {
        if (this.A0A == null) {
            this.A0A = new C54392O1y(this);
        }
        ViewOnTouchListenerC51201Mjl viewOnTouchListenerC51201Mjl = this.A0L;
        if (viewOnTouchListenerC51201Mjl == null) {
            UserSession userSession = this.A0P;
            Context context = this.A0N;
            View findViewById = this.A0O.findViewById(R.id.layout_container_main);
            findViewById.getClass();
            C54392O1y c54392O1y = this.A0A;
            c54392O1y.getClass();
            viewOnTouchListenerC51201Mjl = new ViewOnTouchListenerC51201Mjl(context, (ViewGroup) findViewById, userSession, c54392O1y);
            this.A0L = viewOnTouchListenerC51201Mjl;
        }
        List list = this.A0E;
        ViewOnTouchListenerC55481Oka viewOnTouchListenerC55481Oka = this.A0C;
        C14360o3.A0B(list, 0);
        ViewGroup viewGroup = viewOnTouchListenerC51201Mjl.A0C;
        View view = viewOnTouchListenerC51201Mjl.A0B;
        viewGroup.addView(view);
        view.setAlpha(0.0f);
        AbstractC43594JPz.A0H(view).setDuration(200L).setListener(null);
        viewOnTouchListenerC51201Mjl.A07 = z;
        if (z) {
            viewOnTouchListenerC51201Mjl.A01 = i;
            viewOnTouchListenerC51201Mjl.A02 = viewOnTouchListenerC55481Oka;
            if (viewOnTouchListenerC55481Oka != null) {
                RecyclerView recyclerView = viewOnTouchListenerC51201Mjl.A0E;
                C14360o3.A0B(recyclerView, 0);
                viewOnTouchListenerC55481Oka.A00.add(recyclerView);
            }
        }
        if (list.size() <= 2) {
            viewOnTouchListenerC51201Mjl.A0A.setVisibility(8);
        }
        C51156Miz c51156Miz = viewOnTouchListenerC51201Mjl.A03;
        if (c51156Miz == null) {
            AbstractC31171DnF.A0t();
            throw C00O.createAndThrow();
        }
        c51156Miz.A00 = new C54597O9y(viewOnTouchListenerC51201Mjl, list);
        c51156Miz.notifyDataSetChanged();
        int size = list.size();
        RecyclerView recyclerView2 = viewOnTouchListenerC51201Mjl.A0E;
        Resources resources = recyclerView2.getResources();
        int A01 = (resources.getDisplayMetrics().widthPixels / (c51156Miz.A01() + resources.getDimensionPixelSize(R.dimen.abc_edit_text_inset_top_material))) / 2;
        if (1 <= i && i <= size - A01) {
            int dimensionPixelSize = resources.getDimensionPixelSize(R.dimen.abc_edit_text_inset_top_material);
            AbstractC31177DnL.A0J(recyclerView2).A1p(i, (c51156Miz.A01() + dimensionPixelSize) * A01);
        } else {
            recyclerView2.A0n(i);
        }
        C52254NAu c52254NAu = viewOnTouchListenerC51201Mjl.A0G.A00;
        c52254NAu.A0W.BQj().setVisibility(8);
        c52254NAu.A0R.setVisibility(4);
    }

    @Override // X.InterfaceC58030PoG
    public final void AGm() {
        AtomicInteger atomicInteger = this.A0F;
        atomicInteger.getClass();
        if (atomicInteger.decrementAndGet() == 0) {
            this.A0U.A0N();
        }
    }

    @Override // X.InterfaceC58030PoG
    public final void AGo() {
        this.A0U.A0O();
    }

    @Override // X.InterfaceC58141Pq6
    public final void DC0(View view, boolean z) {
        this.A0Y.A0B(this);
        if (this.A0K != null) {
            this.A0K = null;
        }
        FrameLayout frameLayout = this.A08;
        if (frameLayout != null) {
            frameLayout.setVisibility(8);
            AbstractC31172DnG.A1J(this.A0W.BQj(), R.id.creation_secondary_actions, 0);
        }
        View view2 = this.A06;
        if (view2 != null) {
            view2.setVisibility(0);
            this.A06 = null;
        }
        this.A0Q.removeCallbacksAndMessages(null);
        A0K();
        C5L6 c5l6 = this.A0D;
        C5L6 c5l62 = C5L6.A0B;
        if (c5l6 == c5l62 && !this.A0I && !OOP.A01(this)) {
            A0C(this, c5l62);
        }
        A08(this);
    }

    @Override // X.InterfaceC58141Pq6
    public final void DCB() {
        View view = this.A0K;
        if (view != null && this.A0Y.A01 == 0.0d) {
            view.setVisibility(4);
            View view2 = this.A07;
            view2.getClass();
            view2.setScaleX(1.0f);
            this.A07.setScaleY(1.0f);
            View view3 = this.A06;
            view3.getClass();
            A04(view3, this, true);
        } else {
            View view4 = this.A06;
            if (view4 != null && this.A0J != this.A0R.indexOfChild(view4)) {
                C6WI.A01().A09++;
            }
        }
        this.A0Q.removeCallbacksAndMessages(null);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0028  */
    /* JADX WARN: Removed duplicated region for block: B:15:? A[RETURN, SYNTHETIC] */
    @Override // X.InterfaceC58141Pq6
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void DCC(android.view.View r4, float r5, float r6, boolean r7, boolean r8) {
        /*
            r3 = this;
            r3.A00 = r5
            r3.A0K = r4
            X.2hj r2 = r3.A0Y
            if (r8 == 0) goto L4c
            r0 = 0
            r2.A06 = r0
            r0 = 0
        Ld:
            r2.A06(r0)
            boolean r0 = A0J(r3, r5)
            if (r0 == 0) goto L2c
            X.MbI r2 = r3.A0Q
            r1 = 2
        L19:
            boolean r0 = r2.hasMessages(r1)
            if (r0 != 0) goto L22
            r2.sendEmptyMessage(r1)
        L22:
            boolean r0 = X.OOP.A01(r3)
            if (r0 != 0) goto L2b
            A07(r3)
        L2b:
            return
        L2c:
            boolean r0 = X.OOP.A01(r3)
            if (r0 == 0) goto L49
            X.Pr9 r0 = r3.A0R
            int r1 = r0.AuK()
        L38:
            int r0 = r3.A0M
            int r0 = r0 / 2
            float r0 = (float) r0
            float r5 = r5 - r0
            r0 = 0
            int r0 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
            if (r0 >= 0) goto L22
            if (r1 <= 0) goto L22
            X.MbI r2 = r3.A0Q
            r1 = 3
            goto L19
        L49:
            int r1 = r3.A01
            goto L38
        L4c:
            r0 = 1
            r2.A06 = r0
            r0 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            goto Ld
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C52254NAu.DCC(android.view.View, float, float, boolean, boolean):void");
    }

    @Override // X.InterfaceC55932he
    public final void Dnj(C55982hj c55982hj) {
        if (c55982hj.A01 == 0.0d) {
            int[] iArr = new int[2];
            int[] iArr2 = new int[2];
            FrameLayout frameLayout = this.A08;
            frameLayout.getClass();
            frameLayout.getLocationInWindow(iArr);
            View view = this.A0K;
            view.getClass();
            view.getLocationInWindow(iArr2);
            float measuredWidth = iArr[0] + (this.A08.getMeasuredWidth() / 2);
            float measuredHeight = iArr[1] + (this.A08.getMeasuredHeight() / 2);
            float measuredWidth2 = iArr2[0] + (this.A0K.getMeasuredWidth() / 2);
            float measuredHeight2 = iArr2[1] + (this.A0K.getMeasuredHeight() / 2);
            this.A0K.setPivotX((r1.getMeasuredWidth() / 2) + (measuredWidth - measuredWidth2));
            this.A0K.setPivotY((r1.getMeasuredHeight() / 2) + (measuredHeight - measuredHeight2));
            C2UY.A01.A05(20L);
        }
    }

    @Override // X.InterfaceC55932he
    public final void Dnm(C55982hj c55982hj) {
        View view = this.A0K;
        if (view != null) {
            C55992hk c55992hk = c55982hj.A09;
            float A03 = (float) AbstractC70163Da.A03(c55992hk.A00, 0.5d, 1.0d);
            view.setScaleY(A03);
            view.setScaleX(A03);
            float A032 = (float) AbstractC70163Da.A03(1.0d - c55992hk.A00, 1.0d, 1.5d);
            View view2 = this.A07;
            view2.getClass();
            view2.setScaleX(A032);
            this.A07.setScaleY(A032);
        }
    }

    @Override // X.InterfaceC60072op
    public final boolean onBackPressed() {
        ViewOnTouchListenerC51201Mjl viewOnTouchListenerC51201Mjl = this.A0L;
        if (viewOnTouchListenerC51201Mjl != null) {
            return ViewOnTouchListenerC51201Mjl.A00(viewOnTouchListenerC51201Mjl, true);
        }
        return false;
    }

    @Override // X.AbstractC60592pi, X.InterfaceC60602pj
    public final void onDestroyView() {
        this.A0R.EFd(this.A0a);
        TextureViewSurfaceTextureListenerC56204OxD textureViewSurfaceTextureListenerC56204OxD = this.A0B;
        if (textureViewSurfaceTextureListenerC56204OxD != null) {
            TextureViewSurfaceTextureListenerC56204OxD.A01(textureViewSurfaceTextureListenerC56204OxD);
            textureViewSurfaceTextureListenerC56204OxD.A02 = false;
            this.A0B = null;
        }
    }

    @Override // X.AbstractC60592pi, X.InterfaceC60602pj
    public final void onPause() {
        TextureViewSurfaceTextureListenerC56204OxD textureViewSurfaceTextureListenerC56204OxD = this.A0B;
        if (textureViewSurfaceTextureListenerC56204OxD != null) {
            textureViewSurfaceTextureListenerC56204OxD.A02();
        }
        FrameLayout frameLayout = this.A08;
        if (frameLayout != null) {
            frameLayout.removeAllViews();
            this.A07 = null;
            this.A08 = null;
        }
        AbstractC54340Nzy.A00.A03(this, C52376NFs.class);
    }

    @Override // X.AbstractC60592pi, X.InterfaceC60602pj
    public final void onStop() {
        ViewOnTouchListenerC51201Mjl viewOnTouchListenerC51201Mjl = this.A0L;
        if (viewOnTouchListenerC51201Mjl != null) {
            ViewOnTouchListenerC51201Mjl.A00(viewOnTouchListenerC51201Mjl, false);
        }
    }

    public C52254NAu(Context context, View view, FragmentActivity fragmentActivity, InterfaceC57810Pkc interfaceC57810Pkc, InterfaceC58203Pr9 interfaceC58203Pr9, CreationSession creationSession, AnonymousClass840 anonymousClass840, AlbumEditFragment albumEditFragment, AlbumEditFragment albumEditFragment2, InterfaceC58286Pse interfaceC58286Pse, InterfaceC189598ae interfaceC189598ae) {
        List list;
        C47Z A0U;
        C5L6 c5l6 = C5L6.A0E;
        this.A0D = c5l6;
        this.A0c = AbstractC166987dD.A1G();
        this.A0G = false;
        this.A0V = new O2M();
        this.A05 = -1;
        this.A0O = fragmentActivity;
        Bundle A0A = AbstractC31173DnH.A0A(fragmentActivity);
        A0A.getClass();
        UserSession A0G = AbstractC31171DnF.A0G(A0A);
        this.A0P = A0G;
        this.A0N = context;
        C06090Tz c06090Tz = C06090Tz.A05;
        this.A0H = C18U.A06(c06090Tz, A0G, 36325154057368356L);
        this.A0W = interfaceC58286Pse;
        this.A0X = interfaceC189598ae;
        this.A0b = anonymousClass840;
        this.A0S = creationSession;
        this.A0U = albumEditFragment;
        this.A0T = albumEditFragment2;
        this.A0E = AbstractC166987dD.A1E();
        this.A0Z = interfaceC57810Pkc;
        C55982hj A0R = AbstractC167007dF.A0R();
        A0R.A09(A0d);
        this.A0Y = A0R;
        C51202Mjm c51202Mjm = new C51202Mjm(this);
        this.A0a = c51202Mjm;
        this.A0R = interfaceC58203Pr9;
        interfaceC58203Pr9.A9C(c51202Mjm);
        this.A01 = interfaceC58203Pr9.AuK();
        ViewGroup.LayoutParams BMZ = interfaceC58203Pr9.BMZ();
        BMZ.height = AbstractC13890nF.A01(context);
        interfaceC58203Pr9.EY5(BMZ);
        interfaceC58203Pr9.Ed2(true);
        int i = (int) (AbstractC13880nE.A0I(context).widthPixels * 0.8f);
        this.A0M = i;
        float f = creationSession.A00;
        f = f == 0.0f ? 1.0f : f;
        if (f < 1.0f) {
            this.A03 = (int) (i * f);
        } else {
            this.A03 = i;
            i = (int) (i / f);
        }
        this.A02 = i;
        C5L6 c5l62 = creationSession.A05;
        C5L6 c5l63 = c5l62;
        if (!(c5l62 == null ? c5l6 : c5l62).A04) {
            if (this.A0H) {
                c5l63 = AbstractC53886NsI.A00(f);
            } else {
                c5l63 = f != 1.0f ? C5L6.A08 : c5l63;
            }
            creationSession.A05 = c5l63;
        }
        this.A0D = c5l63 == null ? c5l6 : c5l63;
        Iterator A13 = AbstractC31174DnI.A13(creationSession.A0E);
        while (A13.hasNext()) {
            MediaSession A0R2 = MSW.A0R(A13);
            if (A0R2.Btq() == C05F.A01 && (A0U = MSY.A0U(A0R2, interfaceC189598ae)) != null) {
                C14120nc.A00().ATO(new NGZ(this, A0R2, A0U));
            }
        }
        if (this.A09 == null) {
            if (AbstractC50722MaN.A00(this.A0P)) {
                Iterator A132 = AbstractC31174DnI.A13(this.A0S.A0E);
                while (A132.hasNext()) {
                    C5QB BtT = MSW.A0R(A132).BtT();
                    if (BtT != null && (list = BtT.A02) != null && list.size() > 0) {
                        break;
                    }
                }
            }
            if (this.A0H) {
                AlbumPostCapCropToggleButton albumPostCapCropToggleButton = (AlbumPostCapCropToggleButton) view.requireViewById(R.id.album_post_capture_crop_toggle_button_v2);
                Context context2 = this.A0N;
                albumPostCapCropToggleButton.setColorFilter(context2.getColor(AbstractC53242c7.A0E(context2)), PorterDuff.Mode.SRC_IN);
                AbstractC13880nE.A0o(albumPostCapCropToggleButton, view, R.dimen.account_discovery_bottom_gap);
                UserSession userSession = this.A0P;
                JWS jws = new JWS(this, 1);
                ViewOnClickListenerC55457OkB A00 = ViewOnClickListenerC55457OkB.A00(this, 4);
                C14360o3.A0B(userSession, 0);
                albumPostCapCropToggleButton.A01 = jws;
                albumPostCapCropToggleButton.setOnClickListener(ViewOnClickListenerC55459OkE.A00(A00, userSession, albumPostCapCropToggleButton, 5));
                this.A09 = albumPostCapCropToggleButton;
                if (this.A0D == C5L6.A0B) {
                    boolean A06 = C18U.A06(c06090Tz, userSession, 36325154057892652L);
                    this.A0I = A06;
                    if (A06) {
                        A0C(this, this.A0D);
                    }
                }
            } else {
                IgSimpleImageView A0I = MSX.A0I(view, R.id.album_post_capture_crop_toggle_button);
                Context context3 = this.A0N;
                A0I.setColorFilter(context3.getColor(AbstractC53242c7.A0E(context3)), PorterDuff.Mode.SRC_IN);
                AbstractC13880nE.A0o(A0I, view, R.dimen.account_discovery_bottom_gap);
                ViewOnClickListenerC55457OkB.A01(A0I, 3, this);
                this.A09 = A0I;
            }
            A08(this);
        }
        A0G(this, Collections.unmodifiableList(this.A0S.A0E), false);
        A0L();
        if (!OOP.A01(this) && this.A0R.AnZ() > 0) {
            View AnU = this.A0R.AnU(0);
            AnU.getClass();
            UserSession userSession2 = this.A0P;
            C23031Ai A002 = AbstractC23021Ah.A00(userSession2);
            InterfaceC16530ry interfaceC16530ry = A002.A3N;
            C0YR[] c0yrArr = C23031Ai.A8c;
            if (!AbstractC167017dG.A1b(A002, interfaceC16530ry, c0yrArr, 479) && C18U.A06(c06090Tz, userSession2, 36324582826848505L)) {
                ViewGroup viewGroup = (ViewGroup) AnU;
                View inflate = LayoutInflater.from(this.A0N).inflate(R.layout.album_preview_nux_view, viewGroup, false);
                inflate.setOnTouchListener(new ViewOnTouchListenerC50553MTk(inflate, 0));
                viewGroup.addView(inflate);
                C23031Ai A003 = AbstractC23021Ah.A00(userSession2);
                AbstractC167007dF.A1L(A003, A003.A3N, c0yrArr, 479, true);
            }
        }
        if (this.A09 != null) {
            UserSession userSession3 = this.A0P;
            C23031Ai A004 = AbstractC23021Ah.A00(userSession3);
            if (!AbstractC167017dG.A1b(A004, A004.A5S, C23031Ai.A8c, 329)) {
                if (this.A0D == C5L6.A0B && C18U.A06(c06090Tz, userSession3, 36325154057564967L)) {
                    AbstractC167007dF.A0J().post(new Runnable() { // from class: X.PLX
                        @Override // java.lang.Runnable
                        public final void run() {
                            C52254NAu c52254NAu = C52254NAu.this;
                            C193328hC A0H = AbstractC31171DnF.A0H(c52254NAu.A0O);
                            Context context4 = c52254NAu.A0N;
                            A0H.A0k(context4.getDrawable(R.drawable.ig_illustrations_illo_aspect_ratio_refresh));
                            AbstractC31172DnG.A1C(context4, A0H, 2131962496);
                            AbstractC31173DnH.A16(context4, A0H, 2131962495);
                            A0H.A0Z(null, EnumC193348hE.A03, context4.getString(2131968948), true);
                            DialogInterfaceOnDismissListenerC55324Ogm.A00(A0H, c52254NAu, 2);
                            A0H.A0t(true);
                            AbstractC166987dD.A1W(A0H);
                            AbstractC23021Ah.A00(c52254NAu.A0P).A1a(true);
                        }
                    });
                } else {
                    if (!C18U.A06(c06090Tz, userSession3, 36325154057761578L)) {
                        return;
                    }
                    this.A09.post(new Runnable() { // from class: X.PLY
                        @Override // java.lang.Runnable
                        public final void run() {
                            C52254NAu c52254NAu = C52254NAu.this;
                            IgSimpleImageView igSimpleImageView = c52254NAu.A09;
                            if (igSimpleImageView != null) {
                                igSimpleImageView.callOnClick();
                                AbstractC23021Ah.A00(c52254NAu.A0P).A1a(true);
                            }
                        }
                    });
                }
            }
        }
    }

    private String A02(C47Z c47z, int i, int i2) {
        File A01 = AbstractC916948n.A01();
        UserSession userSession = this.A0P;
        int A07 = AbstractC25225BEi.A07(AbstractC166997dE.A0U(userSession), userSession, 36609287619286904L);
        if (A07 == 0) {
            A07 = C55187Ods.A00(this.A03);
        }
        C55201OeB.A02(c47z, A01, i, i2, A07);
        return A01.getPath();
    }

    public static void A05(C52254NAu c52254NAu) {
        int width;
        int height;
        ArrayList A1E = AbstractC166987dD.A1E();
        ArrayList A1E2 = AbstractC166987dD.A1E();
        CreationSession creationSession = c52254NAu.A0S;
        Iterator A13 = AbstractC31174DnI.A13(creationSession.A0E);
        while (A13.hasNext()) {
            MediaSession A0R = MSW.A0R(A13);
            ArrayList A1E3 = AbstractC166987dD.A1E();
            ArrayList A1E4 = AbstractC166987dD.A1E();
            if (A0R.Btq().intValue() != 0) {
                if (MSY.A0U(A0R, c52254NAu.A0X) != null) {
                    A1E3 = AbstractC166987dD.A1E();
                    AbstractC166997dE.A1X(A1E3, r7.A0G);
                    AbstractC166997dE.A1X(A1E3, r7.A0H);
                    A1E4 = AbstractC166987dD.A1E();
                    AbstractC166997dE.A1X(A1E4, r7.A0B);
                    AbstractC166997dE.A1X(A1E4, r7.A0C);
                }
            } else {
                PhotoSession A02 = creationSession.A02();
                A02.getClass();
                int value = A02.A0D.getValue();
                CropInfo cropInfo = A02.A05;
                if (cropInfo == null) {
                    AbstractC12120kG.A01("AlbumRenderViewController", "Null cropInfo when logging crop button tap.");
                } else {
                    int i = cropInfo.A01;
                    int i2 = cropInfo.A00;
                    Rect rect = cropInfo.A02;
                    int i3 = value % 180;
                    int i4 = i;
                    if (i3 == 0) {
                        i4 = i2;
                    }
                    AbstractC166997dE.A1X(A1E3, i4);
                    if (i3 != 0) {
                        i = i2;
                    }
                    AbstractC166997dE.A1X(A1E3, i);
                    if (i3 == 0) {
                        width = rect.height();
                    } else {
                        width = rect.width();
                    }
                    AbstractC166997dE.A1X(A1E4, width);
                    if (i3 == 0) {
                        height = rect.width();
                    } else {
                        height = rect.height();
                    }
                    AbstractC166997dE.A1X(A1E4, height);
                }
            }
            A1E.add(A1E3);
            A1E2.add(A1E4);
        }
        C448124l A0S = MSW.A0S(c52254NAu.A0P);
        C25531Mh A0G = MSW.A0G(A0S);
        if (AbstractC25226BEj.A1Z(A0G)) {
            MSW.A1W(A0G);
            MSZ.A1H(A0G, A0S, "TOGGLE_ASPECT_RATIO");
            C22M c22m = A0S.A04;
            AbstractC167007dF.A14(A0G, c22m);
            A0G.A0U();
            AbstractC167007dF.A13(A0G);
            A0G.A0c(c22m.A0A);
            A0G.A0S("original_height_width", A1E);
            A0G.A0S("height_width", A1E2);
            AbstractC167017dG.A1D(A0G);
        }
    }

    public static void A06(C52254NAu c52254NAu) {
        if (OOP.A01(c52254NAu)) {
            c52254NAu.A0R.EGv();
            return;
        }
        List list = c52254NAu.A0E;
        int min = Math.min(AbstractC25226BEj.A05(list), c52254NAu.A01 + 1);
        for (int max = Math.max(0, c52254NAu.A01 - 1); max <= min; max++) {
            ((InterfaceC58195Pr1) list.get(max)).CoJ();
        }
    }

    public static void A0F(C52254NAu c52254NAu, Iterator it) {
        if (!it.hasNext() || !((InterfaceC58195Pr1) it.next()).E48(new C56210OxJ(c52254NAu, it))) {
            c52254NAu.A0U.A0N();
        }
    }

    private boolean A0H(int i) {
        int size;
        if (OOP.A01(this)) {
            size = this.A0R.AnZ();
        } else {
            size = this.A0E.size();
        }
        if (i >= size) {
            return true;
        }
        return false;
    }

    public static boolean A0J(C52254NAu c52254NAu, float f) {
        int i;
        if (OOP.A01(c52254NAu)) {
            i = c52254NAu.A0R.AuK();
        } else {
            i = c52254NAu.A01;
        }
        if (f + (c52254NAu.A0M / 2) > c52254NAu.A0R.getWidth() && !c52254NAu.A0H(i)) {
            return true;
        }
        return false;
    }

    public final void A0L() {
        if (!OOP.A01(this)) {
            Iterator it = this.A0E.iterator();
            while (it.hasNext()) {
                ((InterfaceC58195Pr1) it.next()).EZa();
            }
        }
        A06(this);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC58141Pq6
    public final void DC7(View view, float f, float f2) {
        int i;
        if (OOP.A01(this)) {
            i = this.A0R.indexOfChild(view);
        } else {
            i = this.A01;
        }
        this.A0J = i;
        this.A06 = view;
        view.setVisibility(4);
        if (Collections.unmodifiableList(this.A0S.A0E).size() > 2) {
            if (this.A08 == null) {
                FragmentActivity fragmentActivity = this.A0O;
                View findViewById = fragmentActivity.findViewById(R.id.view_drag_overlay);
                findViewById.getClass();
                this.A08 = (FrameLayout) findViewById;
                int height = ((MOM) fragmentActivity).BQj().getHeight();
                AbstractC43592JPx.A1F(this.A08, height);
                AbstractC43592JPx.A1G(this.A08, height);
                this.A08.setVisibility(0);
                this.A08.setClipChildren(false);
                LayoutInflater.from(this.A0N).inflate(R.layout.drag_delete_trash_can, this.A08);
                this.A07 = this.A08.findViewById(R.id.album_trash_can);
            }
            FrameLayout frameLayout = this.A08;
            frameLayout.getClass();
            frameLayout.setVisibility(0);
            AbstractC31172DnG.A1J(this.A0W.BQj(), R.id.creation_secondary_actions, 4);
            C55982hj c55982hj = this.A0Y;
            c55982hj.A0A(this);
            c55982hj.A02();
        }
        TextureViewSurfaceTextureListenerC56204OxD textureViewSurfaceTextureListenerC56204OxD = this.A0B;
        if (textureViewSurfaceTextureListenerC56204OxD != null) {
            TextureViewSurfaceTextureListenerC56204OxD.A01(textureViewSurfaceTextureListenerC56204OxD);
            this.A0B = null;
        }
    }

    @Override // X.AbstractC60592pi, X.InterfaceC60602pj
    public final void onResume() {
        A0L();
        A0K();
        AbstractC54340Nzy.A00.A02(this, C52376NFs.class);
    }
}
