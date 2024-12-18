package X;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.R;
import com.instagram.ui.listview.StickyHeaderListView;

/* renamed from: X.3jp, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C81203jp {
    public static final C81203jp A01 = new Object();
    public static final Rect A02 = new Rect();
    public static final Rect A00 = new Rect();

    public static final int A00(Rect rect, View view, StickyHeaderListView stickyHeaderListView, int i) {
        Rect rect2;
        C14360o3.A0B(rect, 0);
        Rect rect3 = A00;
        if (view.getGlobalVisibleRect(rect3)) {
            if (stickyHeaderListView != null) {
                rect2 = stickyHeaderListView.getTopChromeArea();
            } else {
                rect2 = new Rect();
            }
            int max = Math.max(i, Math.max(Math.max(rect3.top, rect.top), rect2.bottom));
            return Math.max(max, Math.min(rect3.bottom, rect.bottom)) - max;
        }
        return 0;
    }

    public static final C3Y7 A0A(C38321qM c38321qM, Object obj) {
        if (c38321qM == null || !(obj instanceof InterfaceC81443kE)) {
            return null;
        }
        Object BEG = ((InterfaceC81443kE) obj).BEG(c38321qM);
        if (BEG instanceof C3Y7) {
            return (C3Y7) BEG;
        }
        return null;
    }

    public static final int A01(View view, View view2, StickyHeaderListView stickyHeaderListView) {
        Rect rect;
        Rect rect2 = A00;
        if (view2.getGlobalVisibleRect(rect2)) {
            Rect rect3 = A02;
            view.getGlobalVisibleRect(rect3);
            if (stickyHeaderListView != null) {
                rect = stickyHeaderListView.getTopChromeArea();
            } else {
                rect = new Rect();
            }
            int max = Math.max(Math.max(rect2.top, rect3.top), rect.bottom);
            return Math.max(max, Math.min(rect2.bottom, rect3.bottom)) - max;
        }
        return 0;
    }

    public static final int A03(C3FQ c3fq, int i, int i2) {
        EnumC81483kI enumC81483kI = EnumC81483kI.A0L;
        boolean z = false;
        if (A02(enumC81483kI, c3fq) != -1) {
            z = true;
        }
        if (!z) {
            return 0;
        }
        View AnW = c3fq.AnW(A02(enumC81483kI, c3fq));
        if (AnW != null) {
            if (i - AnW.getBottom() > i2) {
                return 0;
            }
            return (AnW.getBottom() - i) + i2;
        }
        throw new IllegalStateException("Required value was null.");
    }

    public static final View A05(C38321qM c38321qM, Object obj) {
        View view;
        if (obj instanceof C80103hz) {
            C79743hP A08 = A08(((C78933fz) obj).A00, c38321qM);
            if (A08 != null) {
                return A08.A06;
            }
            return null;
        }
        if (obj instanceof C3W3) {
            return ((C3W3) obj).A00();
        }
        if (obj instanceof C81303k0) {
            return ((C81303k0) obj).A0N;
        }
        if (obj instanceof C3Y6) {
            return ((C3Y6) obj).A01;
        }
        if (obj instanceof C81473kH) {
            C81473kH c81473kH = (C81473kH) obj;
            if (c38321qM.A4n()) {
                view = c81473kH.A06.A0J;
            } else {
                InterfaceC104804nl Aso = c38321qM.A0C.Aso();
                if (Aso == null || Aso.Bx5() == null) {
                    return null;
                }
                C6QC videoView = c81473kH.A05.getVideoView();
                if (videoView != null) {
                    view = videoView.A00;
                } else {
                    view = null;
                }
            }
            return view;
        }
        return null;
    }

    public static final C79743hP A08(View view, C38321qM c38321qM) {
        View findViewWithTag = view.findViewWithTag("has-litho-media-view-holder");
        if (findViewWithTag != null) {
            Object tag = findViewWithTag.getTag(R.id.litho_media_content);
            if (tag instanceof C79743hP) {
                C79743hP c79743hP = (C79743hP) tag;
                if (c38321qM == null || C14360o3.A0K(c79743hP.A0B, c38321qM.getId())) {
                    return c79743hP;
                }
            }
        }
        return null;
    }

    public static final EnumC81483kI A0C(Object obj) {
        if (obj instanceof C80103hz) {
            return EnumC81483kI.A0A;
        }
        if (obj instanceof C81243ju) {
            return EnumC81483kI.A09;
        }
        if (obj instanceof C81253jv) {
            return EnumC81483kI.A04;
        }
        if (obj instanceof C3W3) {
            return EnumC81483kI.A03;
        }
        if (obj instanceof C81263jw) {
            return EnumC81483kI.A07;
        }
        if (obj instanceof C81273jx) {
            return EnumC81483kI.A08;
        }
        if (obj instanceof C81283jy) {
            return EnumC81483kI.A0E;
        }
        if (obj instanceof C81303k0) {
            return EnumC81483kI.A0C;
        }
        if (obj instanceof C81313k1) {
            return EnumC81483kI.A0H;
        }
        if (obj instanceof C81323k2) {
            return EnumC81483kI.A0D;
        }
        if (obj instanceof C3QT) {
            return EnumC81483kI.A0F;
        }
        if (obj instanceof C81333k3) {
            return EnumC81483kI.A0G;
        }
        if (obj instanceof C73223Px) {
            return EnumC81483kI.A0B;
        }
        C1OU c1ou = C1OU.$redex_init_class;
        if (obj instanceof C3OS) {
            return EnumC81483kI.A0L;
        }
        if (obj instanceof C81343k4) {
            return EnumC81483kI.A0N;
        }
        if (obj instanceof C81353k5) {
            return EnumC81483kI.A0O;
        }
        if (obj instanceof AbstractC81363k6) {
            return EnumC81483kI.A0K;
        }
        if (obj instanceof C81373k7) {
            return EnumC81483kI.A02;
        }
        if (obj instanceof C3Y6) {
            return EnumC81483kI.A05;
        }
        if (!(obj instanceof C81383k8) && !(obj instanceof C81403kA) && !(obj instanceof C81413kB) && !(obj instanceof C81423kC)) {
            if (!(obj instanceof C81433kD) && !(obj instanceof InterfaceC81453kF)) {
                if (obj instanceof C81463kG) {
                    return EnumC81483kI.A06;
                }
                if (obj instanceof C81473kH) {
                    return EnumC81483kI.A0M;
                }
                return EnumC81483kI.A0P;
            }
            return EnumC81483kI.A0J;
        }
        return EnumC81483kI.A0I;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:?, code lost:
    
        return r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0015, code lost:
    
        return -1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:2:0x0008, code lost:
    
        if (r2 <= r1) goto L4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x000e, code lost:
    
        if (A0B(r4, r2) == r3) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0010, code lost:
    
        r0 = r2;
        r2 = r2 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0013, code lost:
    
        if (r0 != r1) goto L12;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final int A02(X.EnumC81483kI r3, X.C3FQ r4) {
        /*
            int r2 = r4.B6q()
            int r1 = r4.BM3()
            if (r2 > r1) goto L15
        La:
            X.3kI r0 = A0B(r4, r2)
            if (r0 == r3) goto L16
            r0 = r2
            int r2 = r2 + 1
            if (r0 != r1) goto La
        L15:
            r2 = -1
        L16:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C81203jp.A02(X.3kI, X.3FQ):int");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0044, code lost:
    
        if (r0 == null) goto L6;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:4:0x0011. Please report as an issue. */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final android.view.View A04(X.C38321qM r4, X.C3FQ r5, int r6) {
        /*
            X.3kI r0 = A0B(r5, r6)
            android.view.View r3 = r5.AnW(r6)
            if (r3 == 0) goto L8c
            int r0 = r0.ordinal()
            java.lang.String r2 = "Required value was null."
            r1 = 0
            switch(r0) {
                case 2: goto L6c;
                case 3: goto L6c;
                case 4: goto L15;
                case 5: goto L14;
                case 6: goto L37;
                case 7: goto L1e;
                case 8: goto L6c;
                case 9: goto L14;
                case 10: goto L14;
                case 11: goto L14;
                case 12: goto L14;
                case 13: goto L53;
                case 14: goto L14;
                case 15: goto L14;
                case 16: goto L14;
                case 17: goto L14;
                case 18: goto L47;
                case 19: goto L14;
                case 20: goto L14;
                case 21: goto L40;
                case 22: goto L6c;
                case 23: goto L76;
                default: goto L14;
            }
        L14:
            return r1
        L15:
            java.lang.Object r0 = r3.getTag()
            X.3Y7 r0 = A0A(r4, r0)
            goto L44
        L1e:
            if (r4 == 0) goto L14
            java.lang.String r0 = r4.getId()
            if (r0 == 0) goto L14
            java.lang.Object r0 = r3.getTag()
            if (r0 == 0) goto L66
            X.3ju r0 = (X.C81243ju) r0
            X.Iu1 r0 = r0.A00()
            if (r0 == 0) goto L14
            com.instagram.feed.widget.IgProgressImageView r1 = r0.A01
            return r1
        L37:
            X.3hP r0 = A08(r3, r4)
            if (r0 == 0) goto L14
            com.instagram.feed.widget.IgProgressImageView r1 = r0.A06
            return r1
        L40:
            X.3k0 r0 = A07(r3)
        L44:
            if (r0 == 0) goto L14
            goto L87
        L47:
            java.lang.Object r0 = r3.getTag()
            r0.getClass()
            X.3Y6 r0 = (X.C3Y6) r0
            com.instagram.feed.widget.IgProgressImageView r1 = r0.A0A
            return r1
        L53:
            java.lang.Object r0 = r3.getTag()
            if (r0 == 0) goto L60
            X.3W3 r0 = (X.C3W3) r0
            android.view.View r1 = r0.A00()
            return r1
        L60:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r2)
            throw r0
        L66:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r2)
            throw r0
        L6c:
            java.lang.Object r0 = r3.getTag()
            r0.getClass()
            X.3Y7 r0 = (X.C3Y7) r0
            goto L87
        L76:
            java.lang.Object r1 = r3.getTag()
            r0 = 1140(0x474, float:1.597E-42)
            java.lang.String r0 = X.AbstractC111324zv.A00(r0)
            X.C14360o3.A0C(r1, r0)
            X.3jv r1 = (X.C81253jv) r1
            X.3Y7 r0 = r1.A00
        L87:
            android.view.View r1 = r0.BGa()
            return r1
        L8c:
            r1 = 0
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C81203jp.A04(X.1qM, X.3FQ, int):android.view.View");
    }

    public static final InterfaceC81443kE A06(ViewGroup viewGroup, C38321qM c38321qM, C81203jp c81203jp) {
        InterfaceC81443kE A06;
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = viewGroup.getChildAt(i);
            if ((childAt.getTag() instanceof InterfaceC81443kE) && A0A(c38321qM, childAt.getTag()) != null) {
                return (InterfaceC81443kE) childAt.getTag();
            }
            if ((childAt instanceof ViewGroup) && (A06 = A06((ViewGroup) childAt, c38321qM, c81203jp)) != null) {
                return A06;
            }
        }
        return null;
    }

    public static final C81303k0 A07(View view) {
        Object tag = view.getTag();
        tag.getClass();
        if (tag instanceof C81463kG) {
            Object tag2 = view.getTag();
            tag2.getClass();
            return ((C81463kG) tag2).A06;
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x004e, code lost:
    
        if (r1 != true) goto L40;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:4:0x0012. Please report as an issue. */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final X.C3Y7 A09(X.C38321qM r5, X.C3FQ r6, int r7) {
        /*
            X.3kI r0 = A0B(r6, r7)
            android.view.View r4 = r6.AnW(r7)
            if (r4 == 0) goto L91
            int r0 = r0.ordinal()
            java.lang.String r1 = "Required value was null."
            r3 = 1
            r2 = 0
            switch(r0) {
                case 2: goto L57;
                case 3: goto L57;
                case 4: goto L88;
                case 5: goto L15;
                case 6: goto L2d;
                case 7: goto L36;
                case 8: goto L57;
                case 9: goto L15;
                case 10: goto L15;
                case 11: goto L15;
                case 12: goto L15;
                case 13: goto L5c;
                case 14: goto L15;
                case 15: goto L15;
                case 16: goto L15;
                case 17: goto L15;
                case 18: goto L7e;
                case 19: goto L15;
                case 20: goto L15;
                case 21: goto L28;
                case 22: goto L57;
                case 23: goto L16;
                default: goto L15;
            }
        L15:
            return r2
        L16:
            java.lang.Object r1 = r4.getTag()
            r0 = 1140(0x474, float:1.597E-42)
            java.lang.String r0 = X.AbstractC111324zv.A00(r0)
            X.C14360o3.A0C(r1, r0)
            X.3jv r1 = (X.C81253jv) r1
            X.3Y7 r2 = r1.A00
            return r2
        L28:
            X.3k0 r2 = A07(r4)
            return r2
        L2d:
            X.3hP r0 = A08(r4, r5)
            if (r0 == 0) goto L85
            boolean r1 = r0.A0C
            goto L4e
        L36:
            if (r5 == 0) goto L85
            java.lang.String r0 = r5.getId()
            if (r0 == 0) goto L85
            java.lang.Object r0 = r4.getTag()
            if (r0 == 0) goto L51
            X.3ju r0 = (X.C81243ju) r0
            X.Iu1 r0 = r0.A00()
            if (r0 == 0) goto L85
            boolean r1 = r0.A04
        L4e:
            if (r1 != r3) goto L85
            goto L84
        L51:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        L57:
            java.lang.Object r0 = r4.getTag()
            goto L84
        L5c:
            java.lang.Object r0 = r4.getTag()
            if (r0 == 0) goto L78
            X.3W3 r0 = (X.C3W3) r0
            com.instagram.common.ui.widget.reboundviewpager.ReboundViewPager r0 = r0.A09
            android.view.View r0 = r0.A0F
            if (r0 == 0) goto L76
            java.lang.Object r1 = r0.getTag()
        L6e:
            boolean r0 = r1 instanceof X.C105184oY
            if (r0 == 0) goto L85
            r2 = r1
            X.4oY r2 = (X.C105184oY) r2
            goto L85
        L76:
            r1 = 0
            goto L6e
        L78:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        L7e:
            java.lang.Object r0 = r4.getTag()
            X.3Y6 r0 = (X.C3Y6) r0
        L84:
            r2 = r0
        L85:
            X.3Y7 r2 = (X.C3Y7) r2
            return r2
        L88:
            java.lang.Object r0 = r4.getTag()
            X.3Y7 r2 = A0A(r5, r0)
            return r2
        L91:
            r2 = 0
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C81203jp.A09(X.1qM, X.3FQ, int):X.3Y7");
    }

    public static final EnumC81483kI A0B(C3FQ c3fq, int i) {
        Object obj;
        View AnW = c3fq.AnW(i);
        if (AnW != null) {
            obj = AnW.getTag();
        } else {
            obj = null;
        }
        return A0C(obj);
    }
}
