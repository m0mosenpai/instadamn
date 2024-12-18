package X;

import android.graphics.Bitmap;
import android.util.SparseArray;
import androidx.fragment.app.FragmentActivity;
import com.instagram.camera.effect.models.CameraAREffect;
import com.instagram.common.session.UserSession;
import com.instagram.creation.capture.quickcapture.aspectratioutil.NineSixteenLayoutConfigImpl;
import com.instagram.creation.capture.quickcapture.aspectratioutil.TargetViewSizeProvider;
import com.instagram.creation.capture.quickcapture.freetransform.transformmatrix.TransformMatrixConfig;
import com.instagram.creation.capture.quickcapture.rulesystem.CaptureRuleSystemState;
import com.instagram.creation.capture.quickcapture.sundial.store.ClipsAudioStore;
import com.instagram.filterkit.filtergroup.model.intf.FilterGroupModel;
import com.instagram.music.common.model.MusicDataSource;
import com.instagram.reels.fragment.model.ReelMoreOptionsModel;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;

/* renamed from: X.8RZ, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C8RZ implements InterfaceC187078Ra, InterfaceC187088Rb {
    public C191038cz A00;
    public boolean A01;
    public boolean A02;
    public boolean A03;
    public boolean A04;
    public boolean A05;
    public C199008r1 A06;
    public final FragmentActivity A07;
    public final UserSession A08;
    public final C187118Re A09;
    public final C8LZ A0A;
    public final C183688Ct A0B;
    public final C185948Mo A0C;
    public final C8NU A0D;
    public final TargetViewSizeProvider A0E;
    public final AnonymousClass840 A0F;
    public final C8MT A0G;
    public final C187108Rd A0H;
    public final C8AD A0I;
    public final String A0J;
    public final Map A0K;
    public final Map A0L;
    public final Queue A0M;
    public final java.util.Set A0N;
    public final boolean A0O;
    public final C8LJ A0P;
    public final AnonymousClass874 A0Q;
    public final C8GE A0R;
    public final Integer A0S;

    public C8RZ(FragmentActivity fragmentActivity, UserSession userSession, C8LJ c8lj, C8LZ c8lz, C183688Ct c183688Ct, C185948Mo c185948Mo, C8NU c8nu, TargetViewSizeProvider targetViewSizeProvider, AnonymousClass874 anonymousClass874, AnonymousClass840 anonymousClass840, C8MT c8mt, C8GE c8ge, C8AD c8ad, Integer num, String str, boolean z) {
        C14360o3.A0B(c8ad, 2);
        C14360o3.A0B(userSession, 4);
        C14360o3.A0B(targetViewSizeProvider, 5);
        this.A0F = anonymousClass840;
        this.A0I = c8ad;
        this.A07 = fragmentActivity;
        this.A08 = userSession;
        this.A0E = targetViewSizeProvider;
        this.A0B = c183688Ct;
        this.A0A = c8lz;
        this.A0C = c185948Mo;
        this.A0D = c8nu;
        this.A0R = c8ge;
        this.A0P = c8lj;
        this.A0Q = anonymousClass874;
        this.A0O = z;
        this.A0J = str;
        this.A0G = c8mt;
        this.A0S = num;
        this.A0H = new C187108Rd();
        this.A0L = new HashMap();
        this.A0N = new HashSet();
        this.A0M = new LinkedList();
        this.A0K = new HashMap();
        C187118Re c187118Re = new C187118Re(this);
        this.A09 = c187118Re;
        c183688Ct.A06 = c187118Re;
    }

    public static final AbstractC24481Hr A00(C8RZ c8rz) {
        Bitmap bitmap = (Bitmap) c8rz.A0M.poll();
        if (bitmap == null) {
            bitmap = ((C8LK) c8rz.A0P.A00.A00()).A01(null, null, null, 1.0f, 1.0f, -1, false, false, false, true);
            if (bitmap == null) {
                throw new IllegalStateException("Decor bitmap should not be null, otherwise we should have returned early");
            }
        } else {
            bitmap.eraseColor(0);
            ((C8LK) c8rz.A0P.A00.A00()).A01(bitmap, null, null, 1.0f, 1.0f, -1, false, false, false, true);
        }
        return AHW.A01(c8rz.A07, bitmap, c8rz.A08, false).A04(new C23659Adu(bitmap, c8rz), C6T2.A01);
    }

    public final C3AY A03(C203248yh c203248yh, C198308pf c198308pf, InterfaceC183728Cx interfaceC183728Cx, List list, boolean z) {
        C199008r1 c199008r1;
        boolean z2;
        if (c203248yh != null) {
            AGZ agz = AGZ.A00;
            FragmentActivity fragmentActivity = this.A07;
            UserSession userSession = this.A08;
            InterfaceC1812882f interfaceC1812882f = ((NineSixteenLayoutConfigImpl) this.A0E).A0K;
            int width = interfaceC1812882f.getWidth();
            int height = interfaceC1812882f.getHeight();
            C09530e4 A00 = agz.A00(fragmentActivity, userSession, A01(this), c203248yh, this, interfaceC183728Cx, this.A0J, list, width, height, z);
            c199008r1 = (C199008r1) A00.A00;
            z2 = ((Boolean) A00.A01).booleanValue();
        } else {
            c199008r1 = null;
            z2 = false;
        }
        return new C3AY(A06(c199008r1, c198308pf), Boolean.valueOf(z2));
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0063, code lost:
    
        if (r3.A0S != false) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x01a1, code lost:
    
        if (r1.A1D != false) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x01b0, code lost:
    
        if (X.AbstractC65993Txo.A01(r4) == false) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x01cc, code lost:
    
        if (r1.A1D != false) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x026f, code lost:
    
        if ((!r0.isEmpty()) != true) goto L76;
     */
    /* JADX WARN: Type inference failed for: r5v2, types: [java.lang.Object, X.A9n] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.C199008r1 A06(X.C199008r1 r40, X.C198308pf r41) {
        /*
            Method dump skipped, instructions count: 726
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C8RZ.A06(X.8r1, X.8pf):X.8r1");
    }

    /* JADX WARN: Code restructure failed: missing block: B:60:0x00a6, code lost:
    
        if (r4 != null) goto L51;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.C199008r1 A07(X.C198308pf r11) {
        /*
            r10 = this;
            r0 = 0
            X.C14360o3.A0B(r11, r0)
            java.lang.String r9 = r11.A06
            X.C14360o3.A07(r9)
            X.8Rd r0 = r10.A0H
            java.util.HashMap r8 = r0.A00
            boolean r0 = r8.containsKey(r9)
            r7 = 0
            if (r0 == 0) goto L22
            java.lang.Object r6 = r8.get(r9)
            if (r6 != 0) goto L5c
            java.lang.String r1 = "Required value was null."
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        L22:
            com.instagram.common.session.UserSession r2 = r10.A08
            X.2pJ r0 = new X.2pJ
            r0.<init>(r2)
            boolean r0 = r0.A00()
            if (r0 == 0) goto La9
            java.lang.Integer r1 = r10.A0S
            if (r1 == 0) goto La9
            X.8Ee r0 = r11.A02
            if (r0 == 0) goto La9
            java.lang.String r0 = r0.A06()
            if (r0 == 0) goto La9
            X.KZD r0 = X.AbstractC46790Kml.A00(r2)
            int r3 = r1.intValue()
            java.util.List r2 = r0.A04
            int r0 = r2.size()
            if (r0 > r3) goto L58
            r0 = 663(0x297, float:9.29E-43)
            java.lang.String r1 = X.AbstractC43591JPw.A00(r0)
            java.lang.String r0 = "Attempting to get index out of bounds mediaEdits"
            X.C0w9.A03(r1, r0)
        L58:
            java.lang.Object r6 = X.AbstractC001800i.A0O(r2, r3)
        L5c:
            X.8r1 r6 = (X.C199008r1) r6
        L5e:
            r5 = 1
            if (r6 == 0) goto L69
            X.8r2 r0 = r6.A03
            if (r0 == 0) goto Lab
            boolean r0 = r6.A00
            if (r0 != 0) goto Lab
        L69:
            X.8lW r1 = r11.A03
            if (r1 == 0) goto Lab
            com.instagram.camera.effect.models.CameraAREffect r4 = r1.A0P
            if (r4 == 0) goto La4
            boolean r0 = r4.A0I()
            if (r0 != 0) goto La4
            r4 = r7
        L78:
            java.util.List r0 = r1.A0u
            if (r0 == 0) goto Lac
            java.util.Iterator r1 = r0.iterator()
            java.lang.String r0 = "null cannot be cast to non-null type kotlin.collections.MutableIterator<com.instagram.camera.effect.models.CameraAREffect>"
            X.C14360o3.A0C(r1, r0)
            java.util.Iterator r2 = X.C15500q5.A01(r1)
        L89:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto Lac
            java.lang.Object r1 = r2.next()
            com.instagram.camera.effect.models.CameraAREffect r1 = (com.instagram.camera.effect.models.CameraAREffect) r1
            if (r1 == 0) goto L89
            boolean r0 = r1.A0I()
            if (r0 != r5) goto L89
            if (r4 != 0) goto La0
            r4 = r1
        La0:
            r2.remove()
            goto L89
        La4:
            r1.A0P = r7
            if (r4 != 0) goto Lac
            goto L78
        La9:
            r6 = r7
            goto L5e
        Lab:
            r4 = r7
        Lac:
            if (r6 != 0) goto Ld9
            X.8r1 r6 = r10.A06(r7, r11)
            X.C14360o3.A0B(r6, r5)
            r8.put(r9, r6)
            com.instagram.common.session.UserSession r3 = r10.A08
            X.8Ee r0 = r11.A02
            if (r0 == 0) goto Lc2
            com.instagram.common.gallery.metadata.MediaUploadMetadata r7 = r0.A01()
        Lc2:
            X.55U r2 = A01(r10)
            X.840 r0 = r10.A0F
            X.83z r0 = r0.A02
            boolean r1 = r0.A0C()
            X.8qw r0 = r6.A01
            X.8qv r0 = r0.A02
            if (r0 == 0) goto Le8
            boolean r0 = r0.A00
        Ld6:
            X.AbstractC199018r3.A00(r7, r3, r2, r1, r0)
        Ld9:
            X.8r2 r1 = r6.A03
            if (r1 == 0) goto Le7
            boolean r0 = r6.A00
            if (r0 != 0) goto Le7
            r6.A00 = r5
            if (r4 == 0) goto Le7
            r1.A00 = r4
        Le7:
            return r6
        Le8:
            r0 = 0
            goto Ld6
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C8RZ.A07(X.8pf):X.8r1");
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0054, code lost:
    
        if (r6 != null) goto L22;
     */
    /* JADX WARN: Removed duplicated region for block: B:30:0x006e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A0B(X.C199008r1 r14) {
        /*
            Method dump skipped, instructions count: 341
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C8RZ.A0B(X.8r1):void");
    }

    public final void A0C(C199008r1 c199008r1, String str) {
        C14360o3.A0B(str, 0);
        C14360o3.A0B(c199008r1, 1);
        this.A0H.A00.put(str, c199008r1);
    }

    public final boolean A0F(C198308pf c198308pf) {
        C195868lW c195868lW;
        String str;
        EnumC198268pb enumC198268pb = c198308pf.A05;
        EnumC198268pb enumC198268pb2 = EnumC198268pb.A07;
        if (enumC198268pb == enumC198268pb2 && (c195868lW = c198308pf.A03) != null && (str = c195868lW.A0p) != null && str.length() != 0) {
            for (C198308pf c198308pf2 : this.A0F.A02.A05()) {
                if (c198308pf2.A05 == enumC198268pb2 && c198308pf2 != c198308pf) {
                    C195868lW c195868lW2 = c198308pf2.A03;
                    String str2 = null;
                    String str3 = c195868lW.A0p;
                    if (str3 != null) {
                        if (c195868lW2 != null) {
                            str2 = c195868lW2.A0p;
                        }
                        if (str3.equals(str2)) {
                            C8r2 c8r2 = A07(c198308pf2).A03;
                            if (c8r2 != null) {
                                C187028Qv c187028Qv = c8r2.A05;
                                if (c187028Qv != null && ((java.util.Set) c187028Qv.A0M.getValue()).contains(EnumC223259tC.A0P)) {
                                    return true;
                                }
                            } else {
                                throw new IllegalStateException("Required value was null.");
                            }
                        } else {
                            continue;
                        }
                    } else {
                        throw new IllegalStateException("Required value was null.");
                    }
                }
            }
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x001a, code lost:
    
        if ((r11 instanceof X.BE6) == false) goto L6;
     */
    @Override // X.InterfaceC187078Ra
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.C9LJ AMR(android.content.Context r10, android.graphics.drawable.Drawable r11, X.C8FC r12, int r13) {
        /*
            r9 = this;
            r0 = 0
            r4 = r11
            X.C14360o3.A0B(r11, r0)
            X.8Ct r0 = r9.A0B
            com.instagram.ui.widget.interactive.InteractiveDrawableContainer r1 = r0.A1t
            com.instagram.common.session.UserSession r5 = r0.A0w
            boolean r7 = X.C138436Oz.A0A(r11)
            X.83z r0 = r0.A15
            boolean r0 = r0.A0A()
            if (r0 == 0) goto L1c
            boolean r0 = r11 instanceof X.BE6
            r8 = 1
            if (r0 != 0) goto L1d
        L1c:
            r8 = 0
        L1d:
            r0 = 2
            X.C14360o3.A0B(r5, r0)
            X.9LJ r2 = new X.9LJ
            r3 = r10
            r6 = r13
            r2.<init>(r3, r4, r5, r6, r7, r8)
            X.5wS r1 = r1.A0q
            r0 = 0
            X.C14360o3.A0B(r1, r0)
            r2.A0C = r1
            X.AHh.A00(r12, r2)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C8RZ.AMR(android.content.Context, android.graphics.drawable.Drawable, X.8FC, int):X.9LJ");
    }

    public static final C55U A01(C8RZ c8rz) {
        C1810981l c1810981l = c8rz.A0F.A02.A01.A0Y;
        if (c1810981l != null) {
            return (C55U) c1810981l.A08.A00;
        }
        throw new IllegalStateException("Required value was null.");
    }

    public static final void A02(C8RZ c8rz) {
        int ordinal = c8rz.A0F.A02.A01().ordinal();
        if (ordinal != 0) {
            if (ordinal == 1) {
                C8NU c8nu = c8rz.A0D;
                ClipsAudioStore clipsAudioStore = c8nu.A07.A0K;
                clipsAudioStore.A0C.clear();
                clipsAudioStore.A0S.Egh(C16930sl.A00);
                C185948Mo c185948Mo = c8nu.A04.A00.A0f;
                C915647m c915647m = new C915647m();
                int i = c915647m.A01;
                C47Z c47z = c185948Mo.A0D;
                if (c47z != null) {
                    c47z.A1i = c915647m;
                }
                C8ME c8me = c185948Mo.A0A;
                if (c8me != null) {
                    c8me.ESb(i);
                }
            } else {
                throw new UnsupportedOperationException("Unknown captured media type");
            }
        }
        c8rz.A0B.A0m(c8rz, true);
        c8rz.A0I.AHl(null);
    }

    public final C199008r1 A04() {
        int ordinal = this.A0F.A02.A01().ordinal();
        if (ordinal != 0) {
            if (ordinal == 1) {
                return new C199008r1(this.A0B.A0R(), null, this.A0D.A00(), this.A0I.ELg(), true);
            }
            throw new UnsupportedOperationException("Unknown captured media type");
        }
        return AbstractC209539Oo.A00(this.A0B.A0R(), this.A0A.A0G(), this.A0I.ELg());
    }

    public final C199008r1 A05() {
        return A07(this.A0F.A02.A00());
    }

    public final C191038cz A08() {
        return new C191038cz(this.A0B.A0R(), this.A0I.ELg(), this.A0R.A00().ANF());
    }

    /* JADX WARN: Type inference failed for: r0v24, types: [java.lang.Object, X.8qv] */
    /* JADX WARN: Type inference failed for: r1v14, types: [X.5QO, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v5, types: [java.lang.Object, X.8qu] */
    public final void A0A() {
        C198908qq c198908qq;
        ArrayList arrayList;
        HashMap hashMap;
        ReelMoreOptionsModel reelMoreOptionsModel;
        C81M c81m;
        C5QL c5ql;
        C198958qv c198958qv;
        C198998qz c198998qz;
        ReelMoreOptionsModel reelMoreOptionsModel2;
        if (this.A05) {
            this.A05 = false;
            A02(this);
        }
        C199008r1 A05 = A05();
        A0B(A05);
        C198908qq c198908qq2 = A05.A04;
        C8r2 c8r2 = null;
        if (c198908qq2 != null) {
            CaptureRuleSystemState captureRuleSystemState = c198908qq2.A00;
            C8B9 c8b9 = captureRuleSystemState.A04;
            EnumC150226pU enumC150226pU = captureRuleSystemState.A03;
            boolean z = captureRuleSystemState.A0T;
            boolean z2 = captureRuleSystemState.A0p;
            boolean z3 = captureRuleSystemState.A0I;
            boolean z4 = captureRuleSystemState.A0Z;
            boolean z5 = captureRuleSystemState.A0K;
            boolean z6 = captureRuleSystemState.A08;
            boolean z7 = captureRuleSystemState.A0d;
            boolean z8 = captureRuleSystemState.A0r;
            boolean z9 = captureRuleSystemState.A06;
            int i = captureRuleSystemState.A00;
            boolean z10 = captureRuleSystemState.A0C;
            boolean z11 = captureRuleSystemState.A0A;
            Boolean bool = captureRuleSystemState.A05;
            boolean z12 = captureRuleSystemState.A0B;
            boolean z13 = captureRuleSystemState.A0a;
            boolean z14 = captureRuleSystemState.A0Y;
            boolean z15 = captureRuleSystemState.A0q;
            boolean z16 = captureRuleSystemState.A0F;
            boolean z17 = captureRuleSystemState.A0n;
            boolean z18 = captureRuleSystemState.A0o;
            boolean z19 = captureRuleSystemState.A0s;
            boolean z20 = captureRuleSystemState.A0f;
            boolean z21 = captureRuleSystemState.A0m;
            boolean z22 = captureRuleSystemState.A0k;
            boolean z23 = captureRuleSystemState.A0l;
            boolean z24 = captureRuleSystemState.A0j;
            boolean z25 = captureRuleSystemState.A0D;
            boolean z26 = captureRuleSystemState.A0P;
            boolean z27 = captureRuleSystemState.A0H;
            boolean z28 = captureRuleSystemState.A0c;
            int i2 = captureRuleSystemState.A02;
            boolean z29 = captureRuleSystemState.A0J;
            boolean z30 = captureRuleSystemState.A0t;
            boolean z31 = captureRuleSystemState.A0b;
            boolean z32 = captureRuleSystemState.A09;
            boolean z33 = captureRuleSystemState.A0i;
            boolean z34 = captureRuleSystemState.A0g;
            boolean z35 = captureRuleSystemState.A0h;
            boolean z36 = captureRuleSystemState.A0Q;
            boolean z37 = captureRuleSystemState.A0R;
            boolean z38 = captureRuleSystemState.A07;
            boolean z39 = captureRuleSystemState.A0E;
            boolean z40 = captureRuleSystemState.A0G;
            boolean z41 = captureRuleSystemState.A0X;
            boolean z42 = captureRuleSystemState.A0W;
            boolean z43 = captureRuleSystemState.A0e;
            boolean z44 = captureRuleSystemState.A0V;
            boolean z45 = captureRuleSystemState.A0U;
            boolean z46 = captureRuleSystemState.A0S;
            boolean z47 = captureRuleSystemState.A0O;
            boolean z48 = captureRuleSystemState.A0M;
            boolean z49 = captureRuleSystemState.A0N;
            boolean z50 = captureRuleSystemState.A0L;
            int i3 = captureRuleSystemState.A01;
            C14360o3.A0B(c8b9, 0);
            c198908qq = new C198908qq(new CaptureRuleSystemState(enumC150226pU, c8b9, bool, i, i2, i3, z, z2, z3, z4, z5, z6, z7, z8, z9, z10, z11, z12, z13, z14, z15, z16, z17, z18, z19, z20, z21, z22, z23, z24, z25, z26, z27, z28, z29, z30, z31, z32, z33, z34, z35, z36, z37, z38, z39, z40, z41, z42, z43, z44, z45, z46, z47, z48, z49, z50));
        } else {
            c198908qq = null;
        }
        C198968qw c198968qw = A05.A01;
        C198928qs c198928qs = c198968qw.A04;
        List list = c198928qs.A04;
        C198938qt c198938qt = null;
        if (list == null) {
            arrayList = null;
        } else {
            arrayList = new ArrayList(list);
        }
        SparseArray sparseArray = c198928qs.A02;
        SparseArray sparseArray2 = new SparseArray();
        C198928qs.A01(sparseArray2, sparseArray);
        Map map = c198928qs.A05;
        if (map == null) {
            hashMap = null;
        } else {
            hashMap = new HashMap(map);
        }
        int i4 = c198928qs.A00;
        C198938qt c198938qt2 = c198928qs.A03;
        if (c198938qt2 != null) {
            int i5 = c198938qt2.A02;
            int i6 = c198938qt2.A01;
            int i7 = c198938qt2.A00;
            C6S5 c6s5 = c198938qt2.A03;
            List list2 = c198938qt2.A07;
            Integer num = c198938qt2.A04;
            List list3 = c198938qt2.A08;
            HashMap hashMap2 = c198938qt2.A09;
            Integer num2 = c198938qt2.A05;
            String str = c198938qt2.A06;
            C14360o3.A0B(c6s5, 3);
            C14360o3.A0B(list2, 4);
            C14360o3.A0B(list3, 6);
            C14360o3.A0B(hashMap2, 7);
            C14360o3.A0B(str, 9);
            c198938qt = new C198938qt(c6s5, num, num2, str, hashMap2, list2, list3, i5, i6, i7);
        }
        C198928qs c198928qs2 = new C198928qs(sparseArray2, c198938qt, arrayList, hashMap, i4);
        C8Q0 c8q0 = c198968qw.A01;
        if (c8q0 != null) {
            C8Q0 c8q02 = new C8Q0(c8q0.A00);
            C9BH c9bh = c198968qw.A00;
            if (c9bh != null && (reelMoreOptionsModel2 = (ReelMoreOptionsModel) c9bh.A00) != null) {
                reelMoreOptionsModel = new C183938Du(reelMoreOptionsModel2).A01();
            } else {
                reelMoreOptionsModel = null;
            }
            C9BH c9bh2 = new C9BH(reelMoreOptionsModel, 5);
            C198948qu c198948qu = c198968qw.A03;
            if (c198948qu != null) {
                String str2 = c198948qu.A03;
                MusicDataSource musicDataSource = c198948qu.A02;
                MusicDataSource musicDataSource2 = null;
                if (musicDataSource != null) {
                    try {
                        musicDataSource2 = new MusicDataSource(musicDataSource.A00, musicDataSource.A01, musicDataSource.A05, musicDataSource.A04, musicDataSource.A03, musicDataSource.A02);
                    } catch (IllegalStateException unused) {
                    }
                }
                int i8 = c198948qu.A01;
                int i9 = c198948qu.A00;
                ?? obj = new Object();
                obj.A03 = str2;
                obj.A02 = musicDataSource2;
                obj.A01 = i8;
                obj.A00 = i9;
                C81M c81m2 = c198968qw.A05;
                if (c81m2 != null) {
                    c81m = c81m2.A05();
                } else {
                    c81m = null;
                }
                C5QL c5ql2 = c198968qw.A06;
                if (c5ql2 != null) {
                    c5ql = new C5QL(c5ql2.A00);
                    for (C5QO c5qo : c5ql2.A01) {
                        int i10 = c5qo.A02;
                        int i11 = c5qo.A00;
                        int i12 = c5qo.A01;
                        Integer A00 = c5qo.A00();
                        String str3 = c5qo.A04;
                        if (str3 != null) {
                            ?? obj2 = new Object();
                            obj2.A02 = i10;
                            obj2.A00 = i11;
                            obj2.A01 = i12;
                            obj2.A03 = A00;
                            obj2.A04 = str3;
                            c5ql.A01.add(obj2);
                        } else {
                            C14360o3.A0F("metadataModelJson");
                            throw C00O.createAndThrow();
                        }
                    }
                } else {
                    c5ql = null;
                }
                C198958qv c198958qv2 = c198968qw.A02;
                if (c198958qv2 != null) {
                    boolean z51 = c198958qv2.A00;
                    ?? obj3 = new Object();
                    obj3.A00 = z51;
                    c198958qv = obj3;
                } else {
                    c198958qv = null;
                }
                C198968qw c198968qw2 = new C198968qw(c9bh2, c8q02, c198958qv, obj, c198928qs2, c81m, c5ql);
                C198998qz c198998qz2 = A05.A02;
                if (c198998qz2 == null) {
                    c198998qz = null;
                } else {
                    C198988qy c198988qy = c198998qz2.A04;
                    int i13 = c198998qz2.A00;
                    CameraAREffect cameraAREffect = c198998qz2.A01;
                    FilterGroupModel filterGroupModel = c198998qz2.A06;
                    c198998qz = new C198998qz(cameraAREffect, c198998qz2.A02, c198998qz2.A03, c198988qy, c198998qz2.A05, filterGroupModel, c198998qz2.A07, c198998qz2.A08, i13, c198998qz2.A0A);
                }
                C8r2 c8r22 = A05.A03;
                if (c8r22 != null) {
                    C915647m c915647m = C8r2.A0E;
                    C198988qy c198988qy2 = c8r22.A04;
                    C22943A9n c22943A9n = c8r22.A02;
                    C915647m c915647m2 = c8r22.A08;
                    boolean z52 = c8r22.A0C;
                    CameraAREffect cameraAREffect2 = c8r22.A00;
                    C187028Qv c187028Qv = c8r22.A05;
                    TransformMatrixConfig transformMatrixConfig = c8r22.A01;
                    boolean z53 = c8r22.A0D;
                    C47v c47v = c8r22.A07;
                    c8r2 = new C8r2(cameraAREffect2, transformMatrixConfig, c22943A9n, c8r22.A03, c198988qy2, c187028Qv, c8r22.A06, new C47v(c47v.A01, c47v.A02, c47v.A03, c47v.A00, c47v.A04), c915647m2, z52, z53);
                }
                this.A06 = new C199008r1(c198968qw2, c198998qz, c8r2, c198908qq, A05.A05);
                return;
            }
            throw new IllegalStateException("Required value was null.");
        }
        throw new IllegalStateException("Required value was null.");
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x001e, code lost:
    
        if (r2.A07() == false) goto L9;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A0D(boolean r4) {
        /*
            r3 = this;
            X.840 r0 = r3.A0F
            X.83z r0 = r0.A02
            X.83h r2 = r0.A01
            java.lang.Integer r1 = r2.A0B
            X.C14360o3.A07(r1)
            java.lang.Integer r0 = X.C05F.A0C
            if (r1 == r0) goto L17
            X.55U r0 = A01(r3)
            boolean r0 = r0 instanceof X.C81V
            if (r0 == 0) goto L24
        L17:
            if (r4 == 0) goto L20
            boolean r1 = r2.A07()
            r0 = 1
            if (r1 != 0) goto L21
        L20:
            r0 = 0
        L21:
            r3.A0E(r0)
        L24:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C8RZ.A0D(boolean):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0037, code lost:
    
        if (r7.A04.A05 != null) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0059, code lost:
    
        if (X.C18U.A06(X.C06090Tz.A05, r10.A08, 36324307948941405L) == false) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x006a, code lost:
    
        r9 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0068, code lost:
    
        if (X.C18U.A06(X.C06090Tz.A05, r10.A08, 36324307948810331L) != false) goto L21;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A0E(boolean r11) {
        /*
            Method dump skipped, instructions count: 321
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C8RZ.A0E(boolean):void");
    }

    @Override // X.InterfaceC187078Ra
    public final int AzO() {
        return this.A0B.A1t.getHeight();
    }

    @Override // X.InterfaceC187078Ra
    public final int AzP() {
        return this.A0B.A1t.getWidth();
    }

    @Override // X.InterfaceC187098Rc
    public final void DCQ() {
        Iterator it = this.A0N.iterator();
        while (it.hasNext()) {
            ((InterfaceC187098Rc) it.next()).DCQ();
        }
    }

    @Override // X.InterfaceC187098Rc
    public final void DCR() {
        Iterator it = this.A0N.iterator();
        while (it.hasNext()) {
            ((InterfaceC187098Rc) it.next()).DCR();
        }
    }

    @Override // X.InterfaceC187078Ra
    public final void DUO() {
        this.A0I.DUN();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:49:0x010f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A09() {
        /*
            Method dump skipped, instructions count: 915
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C8RZ.A09():void");
    }
}
