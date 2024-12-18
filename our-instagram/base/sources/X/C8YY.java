package X;

import android.app.Activity;
import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.FragmentActivity;
import com.facebook.R;
import com.instagram.common.gallery.Medium;
import com.instagram.common.gallery.model.GalleryItem;
import com.instagram.common.session.UserSession;
import com.instagram.creation.capture.quickcapture.aspectratioutil.TargetViewSizeProvider;
import com.instagram.creation.capture.quickcapture.assethub.viewmodel.ClipsAssetHubViewModel;
import com.instagram.creation.capture.quickcapture.gallery.gallerygrid.viewmodel.GalleryMemoriesViewModel;
import com.instagram.creation.capture.quickcapture.storydrafts.StoryDraftsCreationViewModel;
import com.instagram.creation.capture.quickcapture.sundial.viewmodel.ClipsCreationViewModel;
import com.instagram.creation.capture.quickcapture.sundial.viewmodel.drafts.ClipsCreationDraftViewModel;
import com.instagram.debug.devoptions.avatars.ImmersiveAvatarViewerDebugFragment;
import com.instagram.modal.ModalActivity;
import com.instagram.model.direct.DirectShareTarget;
import com.instagram.model.direct.camera.DirectCameraViewModel;
import com.instagram.ui.widget.mediapicker.Folder;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.TreeMap;

/* renamed from: X.8YY, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C8YY {
    public C48625Lf1 A00;
    public C194648jP A01;
    public C193838i4 A02;
    public C189058Yv A03;
    public boolean A04;
    public C8SF A05;
    public C188888Ye A06;
    public boolean A07;
    public final Activity A08;
    public final View A09;
    public final ViewGroup A0A;
    public final AbstractC59962oe A0B;
    public final C1815283f A0C;
    public final InterfaceC11380iw A0D;
    public final UserSession A0E;
    public final C1810981l A0F;
    public final C187198Rm A0G;
    public final TargetViewSizeProvider A0H;
    public final AnonymousClass874 A0I;
    public final C8HI A0J;
    public final C8XV A0K;
    public final C184328Fw A0L;
    public final AnonymousClass840 A0M;
    public final C81J A0N;
    public final C1813582n A0O;
    public final C188598Wy A0P;
    public final InterfaceC188718Xl A0Q;
    public final C8XA A0R;
    public final C1814582x A0S;
    public final C172057la A0T;
    public final C188748Xp A0U;
    public final C86S A0V;
    public final C188688Xi A0W;
    public final C8GE A0X;
    public final InterfaceC1810081c A0Y;
    public final C8JU A0Z;
    public final ClipsCreationViewModel A0a;
    public final C8A7 A0b;
    public final C89P A0c;
    public final ClipsCreationDraftViewModel A0d;
    public final C187338Sb A0e;
    public final C187058Qy A0f;
    public final AnonymousClass825 A0g;
    public final C75E A0h;
    public final C8CS A0i;
    public final InterfaceC09390do A0j;
    public final InterfaceC09390do A0k;
    public final InterfaceC09390do A0l;
    public final InterfaceC09390do A0m;
    public final InterfaceC09390do A0n;
    public final boolean A0o;
    public final ViewGroup A0p;
    public final AnonymousClass858 A0q;
    public final C85E A0r;
    public final C8TT A0s;
    public final C8RZ A0t;
    public final C8TN A0u;
    public final ClipsAssetHubViewModel A0v;
    public final C83C A0w;
    public final C8FG A0x;
    public final GalleryMemoriesViewModel A0y;
    public final AnonymousClass851 A0z;
    public final C8TI A10;
    public final C1813982r A11;
    public final InterfaceC1818984z A12;
    public final C1814382v A13;
    public final StoryDraftsCreationViewModel A14;
    public final C184108Ez A15;
    public final C5JK A16;
    public final AnonymousClass856 A17;
    public final ViewOnTouchListenerC1829389o A18;
    public final C8MX A19;
    public final DirectShareTarget A1A;
    public final DirectCameraViewModel A1B;

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0013, code lost:
    
        if (r6 == X.C81T.A00) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A0E(com.instagram.common.gallery.Medium r18, final X.InterfaceC193848i5 r19, final boolean r20) {
        /*
            r17 = this;
            r12 = 0
            r5 = 1
            r2 = r17
            X.81l r0 = r2.A0F
            X.81v r4 = r0.A08
            java.lang.Object r6 = r4.A00
            X.9Kk r1 = X.C208509Kk.A00
            r14 = r18
            if (r6 == r1) goto L15
            X.81T r0 = X.C81T.A00
            r3 = 0
            if (r6 != r0) goto L38
        L15:
            r3 = 1
            com.instagram.common.session.UserSession r6 = r2.A0E
            X.8ps r7 = X.AbstractC198428pr.A00(r6)
            X.82n r0 = r2.A0O
            X.81Z r0 = r0.A00
            X.22P r8 = r0.A01
            java.lang.Object r9 = r4.A00
            X.55U r9 = (X.C55U) r9
            java.util.List r11 = java.util.Collections.singletonList(r14)
            X.C14360o3.A07(r11)
            X.22C r0 = X.AnonymousClass229.A01(r6)
            java.lang.String r10 = r0.A0R()
            r7.A00(r8, r9, r10, r11, r12)
        L38:
            X.8XA r0 = r2.A0R
            X.8XB r0 = r0.A00()
            int r0 = r0.A02
            if (r0 != r5) goto L52
            if (r3 == 0) goto L51
            com.instagram.common.session.UserSession r0 = r2.A0E
            X.8ps r2 = X.AbstractC198428pr.A00(r0)
            java.lang.String r1 = "system_cancelled"
            java.lang.String r0 = "Camera is fully hidden."
            r2.A02(r1, r0)
        L51:
            return
        L52:
            X.840 r0 = r2.A0M
            X.83z r0 = r0.A02
            java.lang.Integer r6 = X.C05F.A01
            r0.A08(r6)
            java.lang.Object r0 = r4.A00
            boolean r0 = X.C14360o3.A0K(r0, r1)
            if (r0 == 0) goto L6b
            com.instagram.common.session.UserSession r0 = r2.A0E
            boolean r0 = X.AbstractC1822686m.A01(r0)
            if (r0 != 0) goto L6e
        L6b:
            r2.A0L(r12)
        L6e:
            java.lang.String r1 = r14.A0X
            android.app.Activity r13 = r2.A08
            java.io.File r0 = r13.getCacheDir()
            java.lang.String r0 = r0.getAbsolutePath()
            X.C14360o3.A07(r0)
            boolean r0 = X.AbstractC002300n.A0h(r1, r0, r12)
            r5 = r19
            r4 = r20
            if (r0 == 0) goto L96
            if (r20 != 0) goto L96
            int r3 = r14.A0B
            int r1 = r14.A04
            X.8Ee r0 = new X.8Ee
            r0.<init>(r14, r3, r1)
            A04(r2, r5, r0, r4)
            return
        L96:
            android.content.ContentResolver r12 = r13.getContentResolver()
            X.C14360o3.A07(r12)
            com.instagram.common.session.UserSession r15 = r2.A0E
            X.9MV r11 = new X.9MV
            r16 = r6
            r11.<init>(r12, r13, r14, r15, r16)
            r0 = 457(0x1c9, float:6.4E-43)
            X.5eQ r1 = new X.5eQ
            r1.<init>(r11, r0)
            X.9PJ r0 = new X.9PJ
            r0.<init>()
            r1.A00 = r0
            X.C1GJ.A03(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C8YY.A0E(com.instagram.common.gallery.Medium, X.8i5, boolean):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x002f, code lost:
    
        if (r1 == X.C81T.A00) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A0F(com.instagram.common.gallery.Medium r13, final X.InterfaceC193848i5 r14, final boolean r15) {
        /*
            r12 = this;
            r11 = 0
            r5 = 1
            X.AGy r2 = X.AGy.A00
            X.02i r0 = X.C006802i.A0p
            X.C14360o3.A07(r0)
            r3 = 51249153(0x30e0001, float:4.1730054E-37)
            r0.markerStart(r3)
            java.lang.String r1 = "source"
            java.lang.String r0 = "gallery"
            r2.A01(r1, r0)
            int r2 = r13.A03
            java.lang.String r1 = "video_duration"
            X.02i r0 = X.C006802i.A0p
            X.C14360o3.A07(r0)
            r0.markerAnnotate(r3, r1, r2)
            X.81l r0 = r12.A0F
            X.81v r2 = r0.A08
            java.lang.Object r1 = r2.A00
            X.9Kk r0 = X.C208509Kk.A00
            if (r1 == r0) goto L31
            X.81T r0 = X.C81T.A00
            r3 = 0
            if (r1 != r0) goto L54
        L31:
            r3 = 1
            com.instagram.common.session.UserSession r1 = r12.A0E
            X.8ps r6 = X.AbstractC198428pr.A00(r1)
            X.82n r0 = r12.A0O
            X.81Z r0 = r0.A00
            X.22P r7 = r0.A01
            java.lang.Object r8 = r2.A00
            X.55U r8 = (X.C55U) r8
            java.util.List r10 = java.util.Collections.singletonList(r13)
            X.C14360o3.A07(r10)
            X.22C r0 = X.AnonymousClass229.A01(r1)
            java.lang.String r9 = r0.A0R()
            r6.A00(r7, r8, r9, r10, r11)
        L54:
            X.8XA r0 = r12.A0R
            X.8XB r0 = r0.A00()
            int r0 = r0.A02
            if (r0 != r5) goto L6e
            if (r3 == 0) goto L6d
            com.instagram.common.session.UserSession r0 = r12.A0E
            X.8ps r2 = X.AbstractC198428pr.A00(r0)
            java.lang.String r1 = "system_cancelled"
            java.lang.String r0 = "Camera is fully hidden."
            r2.A02(r1, r0)
        L6d:
            return
        L6e:
            X.840 r0 = r12.A0M
            X.83z r1 = r0.A02
            java.lang.Integer r0 = X.C05F.A01
            r1.A08(r0)
            boolean r0 = r14.CWE()
            if (r0 != 0) goto L88
            com.instagram.common.session.UserSession r0 = r12.A0E
            boolean r0 = X.AbstractC1822686m.A01(r0)
            if (r0 != 0) goto L88
            r12.A0L(r11)
        L88:
            r4 = 458(0x1ca, float:6.42E-43)
            android.app.Activity r2 = r12.A08
            com.instagram.common.session.UserSession r1 = r12.A0E
            X.9Oe r0 = new X.9Oe
            r0.<init>(r2, r13, r1, r5)
            X.5eQ r1 = new X.5eQ
            r1.<init>(r0, r4)
            X.9h6 r0 = new X.9h6
            r0.<init>()
            r1.A00 = r0
            X.C1GJ.A03(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C8YY.A0F(com.instagram.common.gallery.Medium, X.8i5, boolean):void");
    }

    public final void A0H(InterfaceC193848i5 interfaceC193848i5, C203238yg c203238yg, C183978Ee c183978Ee) {
        if (this.A0R.A00().A02 != 1) {
            this.A0M.A02.A08(C05F.A01);
            c183978Ee.A13 = true;
            if (!C14360o3.A0K(this.A0F.A08.A00, C208509Kk.A00) || !AbstractC1822686m.A01(this.A0E)) {
                A0L(false);
            }
            if (c203238yg != null) {
                A07(new C198308pf(c183978Ee), c203238yg, c183978Ee.A0h);
            }
            A04(this, interfaceC193848i5, c183978Ee, false);
        }
    }

    public final void A0I(InterfaceC193848i5 interfaceC193848i5, C203238yg c203238yg, C195868lW c195868lW) {
        if (this.A0R.A00().A02 != 1) {
            this.A0M.A02.A08(C05F.A01);
            c195868lW.A18 = true;
            if (!C14360o3.A0K(this.A0F.A08.A00, C208509Kk.A00) || !AbstractC1822686m.A01(this.A0E)) {
                A0L(false);
            }
            if (c203238yg != null) {
                A07(new C198308pf(c195868lW), c203238yg, c195868lW.A07());
            }
            A05(this, interfaceC193848i5, c195868lW, false);
        }
    }

    public final void A0J(InterfaceC193848i5 interfaceC193848i5, List list, int i, boolean z, boolean z2, final boolean z3) {
        C121275eQ c121275eQ;
        C2AH c2ah;
        C198308pf c198308pf;
        C14360o3.A0B(list, 1);
        if (this.A0R.A00().A02 != 1) {
            if (list.size() == 1 && !z2) {
                GalleryItem galleryItem = (GalleryItem) list.get(0);
                int intValue = galleryItem.A09.intValue();
                if (intValue != 0) {
                    if (intValue != 5) {
                        if (intValue == 6) {
                            C195868lW c195868lW = galleryItem.A08;
                            if (c195868lW != null) {
                                A0I(interfaceC193848i5, null, c195868lW);
                                return;
                            }
                            throw new IllegalStateException("Required value was null.");
                        }
                        return;
                    }
                    C183978Ee c183978Ee = galleryItem.A07;
                    if (c183978Ee != null) {
                        A0H(interfaceC193848i5, null, c183978Ee);
                        return;
                    }
                    throw new IllegalStateException("Required value was null.");
                }
                Medium medium = galleryItem.A00;
                if (medium != null) {
                    if (medium.A05()) {
                        A0E(medium, interfaceC193848i5, z);
                        return;
                    } else {
                        A0F(medium, interfaceC193848i5, z);
                        return;
                    }
                }
                throw new IllegalStateException("Required value was null.");
            }
            C1811981v c1811981v = this.A0F.A08;
            Object obj = c1811981v.A00;
            if (obj == C208509Kk.A00 || obj == C81T.A00) {
                UserSession userSession = this.A0E;
                C198438ps A00 = AbstractC198428pr.A00(userSession);
                C22P c22p = this.A0O.A00.A01;
                C55U c55u = (C55U) c1811981v.A00;
                ArrayList arrayList = new ArrayList(AbstractC06950Ym.A1E(list, 10));
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    arrayList.add(((GalleryItem) it.next()).A00);
                }
                A00.A00(c22p, c55u, AnonymousClass229.A01(userSession).A0R(), arrayList, false);
            }
            A0L(false);
            final C187198Rm c187198Rm = this.A0G;
            c187198Rm.A0Q.A02.A08(C05F.A01);
            c187198Rm.A00 = list.size();
            final TreeMap treeMap = new TreeMap();
            for (final int i2 = 0; i2 < c187198Rm.A00; i2++) {
                GalleryItem galleryItem2 = (GalleryItem) list.get(i2);
                int intValue2 = galleryItem2.A09.intValue();
                if (intValue2 != 2 && intValue2 != 0) {
                    if (intValue2 != 5) {
                        if (intValue2 == 6) {
                            C195868lW c195868lW2 = galleryItem2.A08;
                            c195868lW2.getClass();
                            c198308pf = new C198308pf(c195868lW2);
                        }
                    } else {
                        C183978Ee c183978Ee2 = galleryItem2.A07;
                        c183978Ee2.getClass();
                        c198308pf = new C198308pf(c183978Ee2);
                    }
                    C187198Rm.A03(c187198Rm, c198308pf, treeMap, i2);
                } else {
                    Medium medium2 = galleryItem2.A00;
                    medium2.getClass();
                    boolean Cff = medium2.Cff();
                    UserSession userSession2 = c187198Rm.A0G;
                    C449124v c449124v = AnonymousClass229.A01(userSession2).A0A;
                    EnumC193318hB enumC193318hB = EnumC193318hB.A04;
                    int i3 = medium2.A0B;
                    int i4 = medium2.A04;
                    Long valueOf = Long.valueOf(medium2.A01());
                    String str = medium2.A0X;
                    Double valueOf2 = Double.valueOf(medium2.A03 / 1000.0d);
                    Boolean valueOf3 = Boolean.valueOf(z);
                    long j = medium2.A0C;
                    if (Cff) {
                        if (j <= 0) {
                            j = medium2.A0D;
                        }
                        c449124v.A0W(null, enumC193318hB, true, valueOf3, valueOf2, valueOf, null, str, 2, i3, i4, j, false);
                        c121275eQ = new C121275eQ(new CallableC209459Oe(c187198Rm.A0A, medium2, userSession2, true), 462);
                        c2ah = new C2AH() { // from class: X.9h3
                            @Override // X.C2AH
                            public final void onFail(Exception exc) {
                                C187198Rm c187198Rm2 = C187198Rm.this;
                                c187198Rm2.A00--;
                                C0K8.A0F(C187198Rm.__redex_internal_original_name, "Failed to initialize video", exc);
                                C187198Rm.A06(c187198Rm2, treeMap);
                            }

                            @Override // X.C2AH
                            public final /* bridge */ /* synthetic */ void onSuccess(Object obj2) {
                                r3.A00--;
                                C187198Rm.A03(C187198Rm.this, new C198308pf((C195868lW) obj2), treeMap, i2);
                            }
                        };
                    } else {
                        if (j <= 0) {
                            j = medium2.A0D;
                        }
                        c449124v.A0W(null, enumC193318hB, true, valueOf3, valueOf2, valueOf, null, str, 1, i3, i4, j, false);
                        Activity activity = c187198Rm.A0A;
                        c121275eQ = new C121275eQ(new C9MV(activity.getContentResolver(), activity, medium2, userSession2, C05F.A0C), 463);
                        c2ah = new C2AH() { // from class: X.9h5
                            @Override // X.C2AH
                            public final void onFail(Exception exc) {
                                C187198Rm c187198Rm2 = C187198Rm.this;
                                c187198Rm2.A00--;
                                C0K8.A0F(C187198Rm.__redex_internal_original_name, "Failed to initialize photo", exc);
                                C187198Rm.A06(c187198Rm2, treeMap);
                            }

                            @Override // X.C2AH
                            public final /* bridge */ /* synthetic */ void onSuccess(Object obj2) {
                                C183978Ee c183978Ee3 = (C183978Ee) obj2;
                                r5.A00--;
                                C187198Rm.A03(C187198Rm.this, new C198308pf(null, c183978Ee3, c183978Ee3.A0h, z3), treeMap, i2);
                            }
                        };
                    }
                    c121275eQ.A00 = c2ah;
                    C1GJ.A03(c121275eQ);
                }
            }
            c187198Rm.A01 = i;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0041, code lost:
    
        if (X.C18U.A06(X.C06090Tz.A05, r17.A0E, 36321718083725028L) != false) goto L14;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A0K(java.util.List r18, boolean r19) {
        /*
            Method dump skipped, instructions count: 464
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C8YY.A0K(java.util.List, boolean):void");
    }

    private final C8SF A00() {
        C8SF c8sf = this.A05;
        if (c8sf == null) {
            UserSession userSession = this.A0E;
            Activity activity = this.A08;
            C8SF c8sf2 = new C8SF(activity, userSession, C05F.A01, AbstractC188868Yc.A01(activity), AbstractC188868Yc.A00(activity), false);
            this.A05 = c8sf2;
            return c8sf2;
        }
        return c8sf;
    }

    /* JADX WARN: Type inference failed for: r0v21, types: [X.2pI, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v3, types: [java.lang.Object, X.2pF] */
    public static final C189058Yv A01(final C8YY c8yy) {
        C189058Yv c189058Yv = c8yy.A03;
        if (c189058Yv == null) {
            C188958Yl c188958Yl = new C188958Yl(AbstractC018607g.A00(c8yy.A0B), c8yy.A00());
            UserSession userSession = c8yy.A0E;
            c188958Yl.A04 = userSession;
            c188958Yl.A07 = new InterfaceC188988Yo() { // from class: X.8Yn
                public boolean A00;
                public boolean A01;

                @Override // X.InterfaceC188988Yo
                public final void DEP(Exception exc) {
                    C193838i4 c193838i4;
                    C14360o3.A0B(exc, 0);
                    C8YY c8yy2 = C8YY.this;
                    if (!c8yy2.A0o && (c193838i4 = c8yy2.A02) != null) {
                        c193838i4.A0r.DEP(exc);
                    }
                }

                /* JADX WARN: Removed duplicated region for block: B:16:0x0048  */
                /* JADX WARN: Removed duplicated region for block: B:20:0x005e  */
                /* JADX WARN: Removed duplicated region for block: B:30:0x00c6  */
                /* JADX WARN: Removed duplicated region for block: B:35:0x00e9  */
                /* JADX WARN: Removed duplicated region for block: B:40:0x00f4 A[SYNTHETIC] */
                /* JADX WARN: Removed duplicated region for block: B:44:0x00fe  */
                /* JADX WARN: Removed duplicated region for block: B:50:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
                /* JADX WARN: Removed duplicated region for block: B:51:0x006f  */
                @Override // X.InterfaceC188988Yo
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final void DS1(X.C189058Yv r10, java.util.List r11, java.util.List r12, int r13) {
                    /*
                        Method dump skipped, instructions count: 278
                        To view this dump add '--comments-level debug' option
                    */
                    throw new UnsupportedOperationException("Method not decompiled: X.C188978Yn.DS1(X.8Yv, java.util.List, java.util.List, int):void");
                }
            };
            if (!c8yy.A0o) {
                ?? obj = new Object();
                c188958Yl.A09 = true;
                c188958Yl.A0B = true;
                c188958Yl.A0D = true;
                c188958Yl.A05 = new C188998Yp(c8yy.A08);
                c188958Yl.A06 = obj;
                c188958Yl.A0C = new Object().A00(userSession);
                c188958Yl.A08 = new InterfaceC189018Yr() { // from class: X.8Yq
                    @Override // X.InterfaceC189018Yr
                    public final boolean AFb(Folder folder, List list) {
                        C14360o3.A0B(list, 0);
                        C14360o3.A0B(folder, 1);
                        C193838i4 c193838i4 = C8YY.this.A02;
                        if (c193838i4 != null) {
                            List A02 = C15500q5.A02(list);
                            C14360o3.A0B(A02, 0);
                            if (c193838i4.A0r.AFb(folder, A02)) {
                                return true;
                            }
                            return false;
                        }
                        return false;
                    }

                    @Override // X.InterfaceC189018Yr
                    public final List C3y(Integer num) {
                        List C3y;
                        C193838i4 c193838i4 = C8YY.this.A02;
                        if (c193838i4 == null || (C3y = c193838i4.A0r.C3y(num)) == null) {
                            return C16930sl.A00;
                        }
                        return C3y;
                    }

                    @Override // X.InterfaceC189018Yr
                    public final void Dr0(List list) {
                        C193838i4 c193838i4 = C8YY.this.A02;
                        if (c193838i4 != null) {
                            c193838i4.A0r.Dr0(list);
                        }
                    }
                };
            }
            C1810981l c1810981l = c8yy.A0F;
            if (c1810981l.A08().A02) {
                c188958Yl.A03 = EnumC188968Ym.A04;
            }
            C1811981v c1811981v = c1810981l.A08;
            if ((c1811981v.A00 instanceof C81V) && C18U.A06(C06090Tz.A05, userSession, 36326043115599441L)) {
                c188958Yl.A02 = new InterfaceC189048Yu() { // from class: X.9LG
                    @Override // X.InterfaceC189048Yu
                    public final boolean CfT(Medium medium) {
                        if (new File(medium.A0X).length() <= 0) {
                            return false;
                        }
                        return true;
                    }
                };
            }
            if ((c1811981v.A00 instanceof C208509Kk) && C18U.A06(C06090Tz.A05, userSession, 36323766783127132L)) {
                c188958Yl.A02 = new C23621AdG();
            }
            C189058Yv c189058Yv2 = new C189058Yv(c8yy.A08, null, null, new C189028Ys(c188958Yl));
            c8yy.A03 = c189058Yv2;
            return c189058Yv2;
        }
        return c189058Yv;
    }

    public static final void A02(Medium medium, C8YY c8yy, int i, boolean z, boolean z2) {
        C449124v c449124v = AnonymousClass229.A01(c8yy.A0E).A0A;
        EnumC193318hB enumC193318hB = EnumC193318hB.A04;
        int i2 = medium.A0B;
        int i3 = medium.A04;
        Long valueOf = Long.valueOf(medium.A01());
        String str = medium.A0X;
        Double valueOf2 = Double.valueOf(medium.A03 / 1000.0d);
        EnumC223419tY Aju = c8yy.A0Z.Aju();
        Boolean valueOf3 = Boolean.valueOf(z2);
        long j = medium.A0C;
        if (j <= 0) {
            j = medium.A0D;
        }
        c449124v.A0W(Aju, enumC193318hB, false, valueOf3, valueOf2, valueOf, null, str, i, i2, i3, j, z);
    }

    public static final void A03(C8YY c8yy) {
        View view;
        c8yy.A0v.A01 = null;
        C48625Lf1 c48625Lf1 = c8yy.A00;
        if (c48625Lf1 == null) {
            UserSession userSession = c8yy.A0E;
            AbstractC59962oe abstractC59962oe = c8yy.A0B;
            Context requireContext = abstractC59962oe.requireContext();
            Activity activity = c8yy.A08;
            C14360o3.A0C(activity, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
            AbstractC10360h2 childFragmentManager = abstractC59962oe.getChildFragmentManager();
            C14360o3.A07(childFragmentManager);
            c8yy.A00 = new C48625Lf1(requireContext, (FragmentActivity) activity, childFragmentManager, userSession, null, new B8T(c8yy, 31), false);
        } else {
            if (c48625Lf1.A00(null).getParent() != null) {
                ViewGroup viewGroup = c8yy.A0A;
                C48625Lf1 c48625Lf12 = c8yy.A00;
                if (c48625Lf12 != null) {
                    view = c48625Lf12.A00(null);
                } else {
                    view = null;
                }
                viewGroup.removeView(view);
            }
            C48625Lf1 c48625Lf13 = c8yy.A00;
            if (c48625Lf13 != null) {
                c48625Lf13.A02();
            }
        }
        C48625Lf1 c48625Lf14 = c8yy.A00;
        if (c48625Lf14 != null) {
            c8yy.A0A.addView(c48625Lf14.A00(null));
        }
    }

    public static final void A04(C8YY c8yy, InterfaceC193848i5 interfaceC193848i5, C183978Ee c183978Ee, boolean z) {
        AbstractC58242lg.A00(AnonymousClass191.A00, new C9DH(c183978Ee, (InterfaceC23621Ds) null, c8yy.A0U, 22)).A06(c8yy.A0B, new C194638jO(new B8Y(c8yy, interfaceC193848i5, c183978Ee, z)));
    }

    /* JADX WARN: Code restructure failed: missing block: B:110:0x01fd, code lost:
    
        if (r4 == X.C81T.A00) goto L81;
     */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0298  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x02c0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void A05(X.C8YY r23, X.InterfaceC193848i5 r24, X.C195868lW r25, boolean r26) {
        /*
            Method dump skipped, instructions count: 793
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C8YY.A05(X.8YY, X.8i5, X.8lW, boolean):void");
    }

    public static final void A06(C8YY c8yy, String str) {
        UserSession userSession = c8yy.A0E;
        C57312k6 A00 = C07Y.A00(c8yy.A0B);
        Activity activity = c8yy.A08;
        C14360o3.A0C(activity, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
        FragmentActivity fragmentActivity = (FragmentActivity) activity;
        EnumC27378C6h enumC27378C6h = EnumC27378C6h.A02;
        Integer num = C05F.A0u;
        B8T b8t = new B8T(c8yy, 29);
        B8T b8t2 = new B8T(c8yy, 30);
        C25033B6g c25033B6g = C25033B6g.A00;
        String str2 = c8yy.A0M.A02.A01.A0F;
        C14360o3.A07(str2);
        boolean z = false;
        if (str != null) {
            z = true;
        }
        LBW.A00(fragmentActivity, userSession, enumC27378C6h, null, num, str2, str, null, b8t, b8t2, c25033B6g, A00, true, z);
    }

    private final void A07(C198308pf c198308pf, C203238yg c203238yg, String str) {
        C8RZ c8rz = this.A0t;
        C3AY A03 = c8rz.A03(c203238yg.A04, c198308pf, new C183738Cy(), null, false);
        Object obj = A03.A00;
        if (obj != null) {
            c8rz.A0C((C199008r1) obj, str);
            C1816783z c1816783z = this.A0M.A02;
            String str2 = c203238yg.A05;
            C1815483h c1815483h = c1816783z.A01;
            c1815483h.A0E = str2;
            c1815483h.A0G = c203238yg.A07;
            Object obj2 = A03.A01;
            if (obj2 != null) {
                if (((Boolean) obj2).booleanValue()) {
                    Activity activity = this.A08;
                    Drawable drawable = activity.getDrawable(R.drawable.instagram_sticker_pano_filled_24);
                    if (drawable != null) {
                        drawable.setColorFilter(activity.getColor(AbstractC53242c7.A05(activity)), PorterDuff.Mode.SRC_IN);
                        C146106i8 c146106i8 = new C146106i8();
                        c146106i8.A02 = -1;
                        c146106i8.A0D = activity.getResources().getString(2131974614);
                        c146106i8.A0N = true;
                        c146106i8.A0I = activity.getResources().getString(2131974615);
                        c146106i8.A04 = drawable;
                        c146106i8.A02();
                        c146106i8.A06();
                        C41451vu.A01.E4s(new C3KD(c146106i8.A00()));
                        return;
                    }
                    throw new IllegalStateException("Required value was null.");
                }
                AnonymousClass229.A01(this.A0E).A1t(c203238yg.A05);
                return;
            }
            throw new IllegalStateException("Required value was null.");
        }
        throw new IllegalStateException("Required value was null.");
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x016f, code lost:
    
        if (r4.A00 != 9) goto L28;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.C193838i4 A08() {
        /*
            Method dump skipped, instructions count: 722
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C8YY.A08():X.8i4");
    }

    public final C188888Ye A09() {
        C188888Ye c188888Ye = this.A06;
        if (c188888Ye == null) {
            Activity activity = this.A08;
            UserSession userSession = this.A0E;
            C188858Yb c188858Yb = new C188858Yb(this);
            View requireViewById = this.A0p.requireViewById(R.id.dial_ar_effect_picker_left_side_button_container);
            C14360o3.A07(requireViewById);
            ViewGroup viewGroup = (ViewGroup) requireViewById;
            AnonymousClass835 B9P = this.A13.A00().B9P();
            if (B9P != null) {
                C188888Ye c188888Ye2 = new C188888Ye(activity, this.A09, viewGroup, A00(), userSession, B9P, c188858Yb, this.A17);
                this.A06 = c188888Ye2;
                return c188888Ye2;
            }
            throw new IllegalStateException("Required value was null.");
        }
        return c188888Ye;
    }

    public final void A0A() {
        if (!this.A07) {
            final C188888Ye A09 = A09();
            C184708Hl Csh = A09.A0A.Csh();
            Csh.A00 = new InterfaceC184728Hn() { // from class: X.8Yj
                @Override // X.InterfaceC184728Hn
                public final boolean D3S() {
                    C8YY c8yy = C188888Ye.this.A0C.A00;
                    C193718hr c193718hr = (C193718hr) c8yy.A0k.getValue();
                    if (c193718hr != null) {
                        c193718hr.A00("camera_gallery_icon_tap");
                    }
                    c8yy.A08().A0k(false);
                    return true;
                }
            };
            Csh.A01 = new C8QQ() { // from class: X.8Yk
                @Override // X.C8QQ
                public final void DQR() {
                    C188888Ye c188888Ye = C188888Ye.this;
                    Medium medium = c188888Ye.A00;
                    if (medium != null && medium.isValid()) {
                        C8YY c8yy = c188888Ye.A0C.A00;
                        if (!((InterfaceC184358Fz) c8yy.A0L.A00.A00()).DIq()) {
                            C193838i4 A08 = c8yy.A08();
                            C1810981l c1810981l = A08.A0f;
                            if (!(c1810981l.A08.A00 instanceof C81V) && !c1810981l.A0W(C81W.A0T)) {
                                if (medium.A05()) {
                                    A08.A0w.A0E(medium, A08, false);
                                } else {
                                    if (!medium.Cff()) {
                                        return;
                                    }
                                    A08.A0w.A0F(medium, A08, false);
                                }
                            }
                        }
                    }
                }
            };
            Csh.A00();
            A01(this).A0A(1);
            this.A07 = true;
        }
    }

    public final void A0B() {
        this.A0Y.E4u(C8WJ.A00);
        C448724r c448724r = AnonymousClass229.A01(this.A0E).A0F;
        C18920wW c18920wW = c448724r.A01;
        InterfaceC02590Ai A00 = c18920wW.A00(c18920wW.A00, "ig_camera_ui_tool_click");
        if (A00.isSampled()) {
            A00.A8R(C81X.A1d, "tool_type");
            A00.AAP("legacy_falco_event_name", "IG_CAMERA_ENTITY_TAP");
            C22M c22m = c448724r.A04;
            String str = c22m.A0L;
            if (str == null) {
                str = "";
            }
            A00.AAP("camera_session_id", str);
            A00.A8R(EnumC114925Hg.STORY, "camera_destination");
            A00.A8R(c22m.A09, ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY);
            int i = 2;
            A00.A8p("event_type", 2);
            A00.AAP("module", C22F.A08.getModuleName());
            if (c22m.A01 != 2) {
                i = 1;
            }
            A00.A8p("camera_position", Integer.valueOf(i));
            A00.A8R(EnumC50631MWs.A0J, "surface");
            A00.A7v("is_panavision", false);
            A00.AAP("nav_chain", C1QM.A00.A02.A00);
            A00.AAQ(AbstractC449424y.A07(c448724r.A00, c448724r.A03), "system_info");
            A00.Cht();
        }
    }

    public final void A0C() {
        UserSession userSession = this.A0E;
        new C6XJ(this.A0B.requireActivity(), new Bundle(), userSession, ModalActivity.class, AbstractC111324zv.A00(3175)).A0C(this.A08);
        C448724r c448724r = AnonymousClass229.A01(userSession).A0F;
        C18920wW c18920wW = c448724r.A01;
        InterfaceC02590Ai A00 = c18920wW.A00(c18920wW.A00, "ig_camera_ui_tool_click");
        if (A00.isSampled()) {
            A00.A8R(C81X.A07, "tool_type");
            A00.AAP("legacy_falco_event_name", "IG_CAMERA_ENTITY_TAP");
            C22M c22m = c448724r.A04;
            String str = c22m.A0L;
            if (str == null) {
                str = "";
            }
            A00.AAP("camera_session_id", str);
            A00.A8R(EnumC114925Hg.STORY, "camera_destination");
            A00.A8R(c22m.A09, ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY);
            int i = 2;
            A00.A8p("event_type", 2);
            A00.AAP("module", C22F.A08.getModuleName());
            if (c22m.A01 != 2) {
                i = 1;
            }
            A00.A8p("camera_position", Integer.valueOf(i));
            A00.A8R(EnumC50631MWs.A0J, "surface");
            A00.A7v("is_panavision", false);
            A00.AAP("nav_chain", C1QM.A00.A02.A00);
            A00.AAQ(AbstractC449424y.A07(c448724r.A00, c448724r.A03), "system_info");
            A00.Cht();
        }
    }

    public final void A0D() {
        if (this.A0R.A00().A02 != 1) {
            C8HI c8hi = this.A0J;
            if (!c8hi.A0I) {
                c8hi.onResume();
                return;
            }
            return;
        }
        C8HI c8hi2 = this.A0J;
        if (!c8hi2.A0I) {
            return;
        }
        c8hi2.onPause();
    }

    public final void A0G(C81W c81w) {
        C1810981l c1810981l = this.A0F;
        c1810981l.A0L(c81w);
        A0M(true);
        C22C A01 = AnonymousClass229.A01(this.A0E);
        A01.A0F.A0S(((C55U) c1810981l.A08.A00).A00, EnumC203578zI.GALLERY_DESTINATION_BAR, c81w, null, 0, 0);
    }

    public final void A0L(boolean z) {
        C194648jP c194648jP = this.A01;
        if (c194648jP != null) {
            c194648jP.A01(z);
        }
        C174757qB c174757qB = this.A0J.A06;
        if (c174757qB != null) {
            c174757qB.A0B();
        }
        this.A0c.A0F();
        this.A0K.A0M.DIx();
        A0D();
    }

    public final void A0N(boolean z) {
        String str;
        C193718hr c193718hr = (C193718hr) this.A0k.getValue();
        if (c193718hr != null) {
            c193718hr.A00("show_gallery");
        }
        A08();
        C194648jP c194648jP = this.A01;
        if (c194648jP != null) {
            c194648jP.A02(z);
            C193838i4 c193838i4 = this.A02;
            if (c193838i4 != null) {
                DirectCameraViewModel directCameraViewModel = this.A1B;
                if (directCameraViewModel != null) {
                    str = directCameraViewModel.A06;
                } else {
                    str = null;
                }
                c193838i4.A08 = str;
                C193838i4.A0G(c193838i4);
            }
            C8HI c8hi = this.A0J;
            if (c8hi.A0I) {
                c8hi.onPause();
            }
            C1808480m c1808480m = (C1808480m) this.A0E.A01(C1808480m.class, C1808380l.A00);
            String str2 = c1808480m.A00;
            if (str2 != null) {
                A06(this, str2);
                c1808480m.A00 = null;
                return;
            }
            return;
        }
        throw new IllegalStateException("Required value was null.");
    }

    public final void A0O(boolean z, boolean z2, boolean z3) {
        C193838i4 c193838i4 = this.A02;
        if (c193838i4 != null) {
            c193838i4.A0v.A00 = new C51u(Boolean.valueOf(z), Boolean.valueOf(z2), Boolean.valueOf(z3));
            if (z2) {
                c193838i4.A0Z();
                return;
            }
            if (!C18U.A06(C06090Tz.A05, c193838i4.A0c, 36328469772189230L)) {
                return;
            }
            C193838i4.A0C(c193838i4);
        }
    }

    public final boolean A0P() {
        C48625Lf1 c48625Lf1 = this.A00;
        if (c48625Lf1 != null) {
            c48625Lf1.A01();
        }
        C48625Lf1 c48625Lf12 = this.A00;
        if (c48625Lf12 != null) {
            c48625Lf12.A07.A0w(AbstractC43591JPw.A00(328));
        }
        C48625Lf1 c48625Lf13 = this.A00;
        if (c48625Lf13 != null) {
            View view = null;
            if (c48625Lf13.A00(null).getParent() != null) {
                ViewGroup viewGroup = this.A0A;
                C48625Lf1 c48625Lf14 = this.A00;
                if (c48625Lf14 != null) {
                    view = c48625Lf14.A00(null);
                }
                viewGroup.removeView(view);
                return true;
            }
            return false;
        }
        return false;
    }

    public final boolean A0Q() {
        Object obj = ((C1809981b) this.A0Y).A02.A00.second;
        if (obj instanceof C188478Wm) {
            C14360o3.A0C(obj, "null cannot be cast to non-null type com.instagram.creation.capture.quickcapture.event.CaptureStateEvent.EnterPreCapture");
            return ((C188478Wm) obj).A01 instanceof C180397zT;
        }
        return false;
    }

    public final void A0M(boolean z) {
        A0L(z);
        Context applicationContext = this.A08.getApplicationContext();
        C14360o3.A07(applicationContext);
        if (!AbstractC184448Gi.A00(applicationContext)) {
            C8HI c8hi = this.A0J;
            c8hi.A17.A04(new C23785Afw(this));
        }
        C8HI c8hi2 = this.A0J;
        if (!c8hi2.A0I) {
            c8hi2.onResume();
        }
    }

    public C8YY(Activity activity, View view, ViewGroup viewGroup, ViewGroup viewGroup2, AnonymousClass858 anonymousClass858, AbstractC59962oe abstractC59962oe, C1815283f c1815283f, C85E c85e, InterfaceC11380iw interfaceC11380iw, UserSession userSession, C1810981l c1810981l, C8TT c8tt, C8RZ c8rz, C187198Rm c187198Rm, C8TN c8tn, TargetViewSizeProvider targetViewSizeProvider, ClipsAssetHubViewModel clipsAssetHubViewModel, AnonymousClass874 anonymousClass874, C8HI c8hi, C8XV c8xv, C184328Fw c184328Fw, AnonymousClass840 anonymousClass840, C83C c83c, C81J c81j, C1813582n c1813582n, C188598Wy c188598Wy, InterfaceC188718Xl interfaceC188718Xl, C8XA c8xa, C8FG c8fg, C1814582x c1814582x, GalleryMemoriesViewModel galleryMemoriesViewModel, C188748Xp c188748Xp, C86S c86s, C8TI c8ti, C1813982r c1813982r, C188688Xi c188688Xi, C8GE c8ge, InterfaceC1818984z interfaceC1818984z, C1814382v c1814382v, InterfaceC1810081c interfaceC1810081c, StoryDraftsCreationViewModel storyDraftsCreationViewModel, C8JU c8ju, ClipsCreationViewModel clipsCreationViewModel, C8A7 c8a7, C89P c89p, C184108Ez c184108Ez, ClipsCreationDraftViewModel clipsCreationDraftViewModel, C5JK c5jk, AnonymousClass856 anonymousClass856, C187058Qy c187058Qy, AnonymousClass825 anonymousClass825, ViewOnTouchListenerC1829389o viewOnTouchListenerC1829389o, C75E c75e, C8CS c8cs, C8MX c8mx, DirectShareTarget directShareTarget, DirectCameraViewModel directCameraViewModel) {
        C172057la c172057la;
        C14360o3.A0B(interfaceC1810081c, 2);
        C14360o3.A0B(c8xv, 3);
        C14360o3.A0B(c184328Fw, 4);
        C14360o3.A0B(c1813982r, 5);
        C14360o3.A0B(c1814382v, 6);
        C14360o3.A0B(anonymousClass840, 8);
        C14360o3.A0B(interfaceC1818984z, 18);
        C14360o3.A0B(c8hi, 19);
        C14360o3.A0B(c188598Wy, 25);
        C14360o3.A0B(c8xa, 26);
        C14360o3.A0B(c1815283f, 27);
        C14360o3.A0B(c8ge, 28);
        C14360o3.A0B(c1813582n, 30);
        C14360o3.A0B(c1814582x, 31);
        C14360o3.A0B(anonymousClass874, 33);
        C14360o3.A0B(c8ju, 39);
        C14360o3.A0B(anonymousClass856, 44);
        C14360o3.A0B(c188688Xi, 47);
        this.A0E = userSession;
        this.A0Y = interfaceC1810081c;
        this.A0K = c8xv;
        this.A0L = c184328Fw;
        this.A11 = c1813982r;
        this.A13 = c1814382v;
        this.A0N = c81j;
        this.A0M = anonymousClass840;
        this.A08 = activity;
        this.A0A = viewGroup;
        this.A09 = view;
        this.A0p = viewGroup2;
        this.A0F = c1810981l;
        this.A10 = c8ti;
        this.A0B = abstractC59962oe;
        this.A0D = interfaceC11380iw;
        this.A0u = c8tn;
        this.A12 = interfaceC1818984z;
        this.A0J = c8hi;
        this.A0w = c83c;
        this.A0x = c8fg;
        this.A18 = viewOnTouchListenerC1829389o;
        this.A0r = c85e;
        this.A0s = c8tt;
        this.A0P = c188598Wy;
        this.A0R = c8xa;
        this.A0C = c1815283f;
        this.A0X = c8ge;
        this.A0t = c8rz;
        this.A0O = c1813582n;
        this.A0S = c1814582x;
        this.A0f = c187058Qy;
        this.A0I = anonymousClass874;
        this.A0G = c187198Rm;
        this.A0g = anonymousClass825;
        this.A0b = c8a7;
        this.A0V = c86s;
        this.A14 = storyDraftsCreationViewModel;
        this.A0Z = c8ju;
        this.A0q = anonymousClass858;
        this.A0a = clipsCreationViewModel;
        this.A0d = clipsCreationDraftViewModel;
        this.A0i = c8cs;
        this.A17 = anonymousClass856;
        this.A0U = c188748Xp;
        this.A19 = c8mx;
        this.A0W = c188688Xi;
        this.A0H = targetViewSizeProvider;
        this.A15 = c184108Ez;
        this.A0h = c75e;
        this.A0c = c89p;
        this.A1B = directCameraViewModel;
        this.A0v = clipsAssetHubViewModel;
        this.A0y = galleryMemoriesViewModel;
        this.A16 = c5jk;
        this.A0Q = interfaceC188718Xl;
        this.A1A = directShareTarget;
        this.A0e = new C187338Sb(abstractC59962oe, userSession);
        InterfaceC25175BBx interfaceC25175BBx = c81j.A0r;
        if (interfaceC25175BBx != null) {
            c172057la = new C172057la(interfaceC25175BBx);
        } else {
            c172057la = null;
        }
        this.A0T = c172057la;
        this.A0z = new AnonymousClass851() { // from class: X.8YZ
            @Override // X.AnonymousClass851
            public final void DJ2(float f, float f2) {
                C171057jw c171057jw;
                C8YY c8yy = C8YY.this;
                C86S c86s2 = c8yy.A0V;
                boolean z = false;
                if (f > 0.5d) {
                    z = true;
                }
                c86s2.A07.Egh(Boolean.valueOf(z));
                C81J c81j2 = c8yy.A0N;
                if (c81j2.A3h && f2 < 0.0f) {
                    float f3 = 0.5f * f2;
                    double abs = Math.abs(f3);
                    ViewGroup viewGroup3 = c8yy.A0A;
                    float A04 = (float) AbstractC70163Da.A04(abs, 0.0d, viewGroup3.getHeight(), 1.0d, 0.75d);
                    viewGroup3.setTranslationY(-f3);
                    if (c81j2.A3h) {
                        viewGroup3.setScaleX(A04);
                        viewGroup3.setScaleY(A04);
                    }
                    View requireViewById = c8yy.A09.requireViewById(R.id.pre_capture_controls_container);
                    C14360o3.A07(requireViewById);
                    requireViewById.setTranslationY(0.0f);
                    c8yy.A0Q.Cz0(1.0f - Math.abs(f3 / viewGroup3.getHeight()), -16777216);
                }
                C172057la c172057la2 = c8yy.A0T;
                if (c172057la2 != null) {
                    c172057la2.DJ2(f, f2);
                }
                if (f == 1.0f && (c171057jw = c81j2.A0m) != null) {
                    c171057jw.A00.A05();
                }
            }
        };
        EnumC09460dv enumC09460dv = EnumC09460dv.A02;
        this.A0j = AbstractC09440dt.A00(enumC09460dv, new C9E4(this, 2));
        this.A0o = C18U.A06(C06090Tz.A05, userSession, 36321022299939905L);
        this.A0k = AbstractC09440dt.A00(enumC09460dv, new C9E4(this, 4));
        AbstractC18560vj.A03(C07Y.A00(abstractC59962oe), new C15340po(new C9D0(this, null, 28), c184108Ez.A01));
        this.A0l = AbstractC09440dt.A01(new C9E4(this, 5));
        this.A0n = AbstractC09440dt.A01(new C9E4(this, 8));
        this.A0m = new C60842q8(new C9E4(abstractC59962oe, 6), new C9E4(this, 7), new C9F5(9, null, abstractC59962oe), new C0YZ(C188848Ya.class));
    }
}
