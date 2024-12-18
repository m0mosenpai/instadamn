package X;

import android.content.res.Resources;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewConfiguration;
import androidx.fragment.app.FragmentActivity;
import com.facebook.R;
import com.facebook.common.stringformat.StringFormatUtil;
import com.instagram.clips.intf.ClipsViewerConfig;
import com.instagram.common.session.UserSession;
import com.instagram.ui.simplevideolayout.SimpleVideoLayout;

/* renamed from: X.GkR, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C37812GkR implements InterfaceC1119253e {
    public C37582Ggd A00;
    public boolean A01;
    public final FragmentActivity A02;
    public final ClipsViewerConfig A03;
    public final UserSession A04;
    public final ILF A05;
    public final C37576GgX A06;
    public final C37556GgC A07;

    public C37812GkR(FragmentActivity fragmentActivity, ClipsViewerConfig clipsViewerConfig, UserSession userSession, ILF ilf, C37576GgX c37576GgX, C37556GgC c37556GgC) {
        C14360o3.A0B(userSession, 1);
        AbstractC167017dG.A1T(clipsViewerConfig, ilf);
        this.A04 = userSession;
        this.A02 = fragmentActivity;
        this.A07 = c37556GgC;
        this.A06 = c37576GgX;
        this.A03 = clipsViewerConfig;
        this.A05 = ilf;
    }

    @Override // X.InterfaceC1119253e
    public final boolean DBd(GestureDetectorOnGestureListenerC148016lX gestureDetectorOnGestureListenerC148016lX, float f, float f2) {
        C14360o3.A0B(gestureDetectorOnGestureListenerC148016lX, 0);
        return gestureDetectorOnGestureListenerC148016lX.A04();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v17, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v20, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v25, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v10, types: [X.30d] */
    /* JADX WARN: Type inference failed for: r1v17 */
    /* JADX WARN: Type inference failed for: r1v18 */
    @Override // X.InterfaceC1119253e
    public final void DC2(GestureDetectorOnGestureListenerC148016lX gestureDetectorOnGestureListenerC148016lX, float f, float f2, float f3, float f4, float f5) {
        float pivotX;
        H8G h8g;
        H8G h8g2;
        H8I h8i;
        ?? r1;
        SimpleVideoLayout A01;
        SimpleVideoLayout A012;
        C14360o3.A0B(gestureDetectorOnGestureListenerC148016lX, 0);
        this.A01 = false;
        if (Math.abs(f2) < AbstractC13880nE.A04(this.A02, 60)) {
            A06(new D8I(3, gestureDetectorOnGestureListenerC148016lX, this), f, f2, 0.0f, 0.0f);
            return;
        }
        View A00 = A00();
        if (A00 == null) {
            pivotX = 0.0f;
        } else {
            ClipsViewerConfig clipsViewerConfig = this.A03;
            pivotX = (clipsViewerConfig.A04 + (clipsViewerConfig.A06 / 2.0f)) - A00.getPivotX();
        }
        float f6 = 0.0f;
        if (A00() != null && (A012 = A01()) != null) {
            ClipsViewerConfig clipsViewerConfig2 = this.A03;
            f6 = ((clipsViewerConfig2.A05 + (clipsViewerConfig2.A03 / 2.0f)) - A012.getPivotY()) + ((r1.getHeight() - A012.getHeight()) / 4.0f);
        }
        A06(new J72(this, 3), f, f2, pivotX, f6);
        ClipsViewerConfig clipsViewerConfig3 = this.A03;
        float f7 = clipsViewerConfig3.A04;
        SimpleVideoLayout A013 = A01();
        if (f7 == 0.0f) {
            if (A013 != null) {
                float height = (A013.getHeight() - clipsViewerConfig3.A03) / 2.0f;
                View A002 = A00();
                if (A002 != null && (A01 = A01()) != null) {
                    int height2 = A01.getHeight();
                    A002.setClipBounds(new Rect(0, 0, A01.getWidth(), height2));
                    r1 = new H8H(height2, 1, A002, A01);
                } else {
                    r1 = new Object();
                }
                A03(r1, 0.0f, height);
            }
        } else if (A013 != null) {
            float width = clipsViewerConfig3.A06 / A013.getWidth();
            float height3 = clipsViewerConfig3.A03 / A013.getHeight();
            if (!AbstractC167007dF.A1N((width > 0.0f ? 1 : (width == 0.0f ? 0 : -1)))) {
                View A003 = A00();
                if (A003 == null) {
                    h8g2 = new Object();
                } else {
                    h8g2 = new H8G(A003, true);
                }
                A03(h8g2, 1.0f, width);
            }
            if (height3 != 0.0f) {
                View A004 = A00();
                if (A004 == null) {
                    h8g = new Object();
                } else {
                    h8g = new H8G(A004, false);
                }
                A03(h8g, 1.0f, height3);
            }
        }
        if (!C18U.A06(C06090Tz.A05, this.A04, 36330393917735774L)) {
            return;
        }
        View A005 = A00();
        if (A005 == null) {
            h8i = new Object();
        } else {
            h8i = new H8I(A005, 3);
        }
        A03(h8i, 1.0f, 0.2f);
    }

    @Override // X.InterfaceC1119253e
    public final boolean Dmo(GestureDetectorOnGestureListenerC148016lX gestureDetectorOnGestureListenerC148016lX, float f, float f2) {
        return false;
    }

    @Override // X.InterfaceC1119253e
    public final void Dwn(GestureDetectorOnGestureListenerC148016lX gestureDetectorOnGestureListenerC148016lX) {
    }

    public static final C37658Ghr A02(C37812GkR c37812GkR) {
        Object obj;
        C37556GgC c37556GgC = c37812GkR.A07;
        View A07 = c37556GgC.A07(c37556GgC.A03());
        if (A07 != null) {
            obj = A07.getTag();
        } else {
            obj = null;
        }
        if (!(obj instanceof C37658Ghr)) {
            return null;
        }
        return (C37658Ghr) obj;
    }

    public static final void A05(C37812GkR c37812GkR, boolean z) {
        FragmentActivity fragmentActivity = c37812GkR.A02;
        int A09 = AbstractC167007dF.A09(fragmentActivity, R.attr.igds_color_clips_tab_bar_background);
        int color = fragmentActivity.getColor(AbstractC53242c7.A0D(fragmentActivity));
        if (z) {
            if (!c37812GkR.A03.A1l) {
                A09 = color;
            } else {
                A09 = AbstractC13950nL.A06(A09, 0.5f);
            }
        }
        View findViewById = fragmentActivity.findViewById(R.id.root_clips_layout);
        Resources resources = fragmentActivity.getResources();
        AbstractC05810Sj.A00(resources);
        if (findViewById != null) {
            findViewById.setBackgroundColor(A09);
            AbstractC56402iY.A02(fragmentActivity, A09);
            AbstractC56402iY.A06(fragmentActivity, z);
            return;
        }
        throw AbstractC166987dD.A14(StringFormatUtil.formatStrLocaleSafe("Required view with ID %s not found. Either your layout is missing the ID you requested, or you want to use getOptionalView. Only use getOptionalView if you're sure that you need logic that depends on whether a particular child view exists.", resources.getResourceEntryName(R.id.root_clips_layout)));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v0, types: [X.0pQ, java.lang.Object] */
    private final void A06(InterfaceC16820sZ interfaceC16820sZ, float f, float f2, float f3, float f4) {
        H8J h8j;
        H8J h8j2;
        ?? obj = new Object();
        obj.A00 = 2;
        C43214J8l c43214J8l = new C43214J8l(interfaceC16820sZ, obj, f, f3, f2, f4);
        View A00 = A00();
        if (A00 == null) {
            h8j = new Object();
        } else {
            h8j = new H8J(A00, c43214J8l, true);
        }
        A03(h8j, f, f3);
        View A002 = A00();
        if (A002 == null) {
            h8j2 = new Object();
        } else {
            h8j2 = new H8J(A002, c43214J8l, false);
        }
        A03(h8j2, f2, f4);
    }

    @Override // X.InterfaceC1119253e
    public final void DBv(GestureDetectorOnGestureListenerC148016lX gestureDetectorOnGestureListenerC148016lX, float f, float f2, float f3, boolean z) {
        if (this.A01) {
            View A00 = A00();
            if (A00 != null) {
                A00.setTranslationY(f2);
            }
            View A002 = A00();
            if (A002 != null) {
                A002.setTranslationX(f);
            }
        }
    }

    @Override // X.InterfaceC1119253e
    public final boolean DC9(GestureDetectorOnGestureListenerC148016lX gestureDetectorOnGestureListenerC148016lX, float f, float f2, float f3, float f4, boolean z) {
        float f5;
        C25370BKn c25370BKn;
        if (this.A07.A03() == 0) {
            FragmentActivity fragmentActivity = this.A02;
            if (ViewConfiguration.get(fragmentActivity).getScaledTouchSlop() * (-1.0f) >= f2) {
                this.A01 = true;
                this.A06.A01(null, null, null, A02(this));
                C37582Ggd c37582Ggd = this.A00;
                if (c37582Ggd != null) {
                    C11T.A02(new BST(c37582Ggd, 8));
                }
                int dimensionPixelOffset = fragmentActivity.getResources().getDimensionPixelOffset(R.dimen.ab_test_media_thumbnail_preview_item_internal_padding);
                C37658Ghr A02 = A02(this);
                if (A02 != null && (c25370BKn = A02.A07) != null) {
                    c25370BKn.A02().setVisibility(4);
                }
                A04(this, dimensionPixelOffset);
                A05(this, true);
                View A00 = A00();
                if (A00 != null) {
                    SimpleVideoLayout A01 = A01();
                    if (A01 != null) {
                        f5 = A01.getPivotY();
                    } else {
                        f5 = 0.0f;
                    }
                    A00.setPivotY(f5);
                }
                return true;
            }
        }
        return false;
    }

    private final View A00() {
        C25370BKn c25370BKn;
        C37658Ghr A02 = A02(this);
        if (A02 != null && (c25370BKn = A02.A07) != null) {
            return c25370BKn.A08;
        }
        return null;
    }

    private final SimpleVideoLayout A01() {
        C25370BKn c25370BKn;
        C37658Ghr A02 = A02(this);
        if (A02 != null && (c25370BKn = A02.A07) != null) {
            return c25370BKn.A03();
        }
        return null;
    }

    public static final void A03(C668630d c668630d, float f, float f2) {
        C55982hj A02 = C55952hg.A00().A02();
        A02.A06 = true;
        A02.A05(f);
        A02.A0A(c668630d);
        A02.A09(C55942hf.A04(35.0d, 6.0d));
        A02.A06(f2);
    }

    public static final void A04(C37812GkR c37812GkR, float f) {
        SimpleVideoLayout A01 = c37812GkR.A01();
        if (A01 != null) {
            A01.setClipToOutline(true);
        }
        SimpleVideoLayout A012 = c37812GkR.A01();
        if (A012 != null) {
            A012.setOutlineProvider(new C50794McB(f, 2));
        }
        SimpleVideoLayout A013 = c37812GkR.A01();
        if (A013 != null) {
            A013.invalidateOutline();
        }
    }
}
