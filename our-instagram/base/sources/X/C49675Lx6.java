package X;

import android.content.Context;
import android.view.GestureDetector;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.R;
import com.instagram.direct.visual.DirectVisualMessageViewerController;
import java.util.List;
import java.util.ListIterator;
import java.util.concurrent.TimeUnit;

/* renamed from: X.Lx6, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C49675Lx6 implements InterfaceC1119053c {
    public float A00;
    public int A01;
    public Integer A02;
    public List A03;
    public boolean A04;
    public boolean A05;
    public final Context A06;
    public final View A07;
    public final C110814yt A08;
    public final RecyclerView A09;
    public final C47425KxG A0A;
    public final L6U A0B;
    public final C47427KxI A0C;
    public final C110814yt A0D;
    public final C110814yt A0E;
    public final L6T A0F;

    public C49675Lx6(Context context, View view, RecyclerView recyclerView, C47425KxG c47425KxG, L6T l6t, L6U l6u, C47427KxI c47427KxI) {
        AbstractC25234BEr.A0k(4, l6u, c47427KxI, l6t, c47425KxG);
        this.A06 = context;
        this.A09 = recyclerView;
        this.A07 = view;
        this.A0B = l6u;
        this.A0C = c47427KxI;
        this.A0F = l6t;
        this.A0A = c47425KxG;
        this.A01 = -1;
        this.A03 = AbstractC166987dD.A1E();
        int A07 = (AbstractC13880nE.A07(context) / 2) - AbstractC167017dG.A04(context);
        float millis = ((float) TimeUnit.SECONDS.toMillis(5L)) / AbstractC166987dD.A04(context.getResources(), R.dimen.add_to_story_dual_destination_share_sheet_story_row_height);
        this.A0E = new JnU(context, 25.0f, A07);
        this.A0D = new JnU(context, millis * AbstractC13880nE.A0I(context).densityDpi, A07);
        this.A08 = new JnU(context, 25.0f, A07 - (AbstractC43594JPz.A06(context) / 2));
        C44220JgP.A00(recyclerView, this, 9);
        recyclerView.A12(new C44326JiO(this, 0));
        ViewOnTouchListenerC48084LQj.A01(recyclerView, 18, new GestureDetector(recyclerView.getContext(), new C44907JuL(this, 0)));
    }

    private final int A00(int i) {
        int width;
        View view;
        View view2;
        RecyclerView recyclerView = this.A09;
        C3OO A0V = recyclerView.A0V(i);
        if (A0V != null && (view2 = A0V.itemView) != null) {
            view2.getWidth();
        } else {
            this.A06.getResources().getDimensionPixelSize(R.dimen.add_to_story_dual_destination_share_sheet_story_row_height);
        }
        int[] iArr = new int[2];
        C3OO A0V2 = recyclerView.A0V(i);
        if (A0V2 != null && (view = A0V2.itemView) != null) {
            view.getLocationOnScreen(iArr);
        }
        Integer num = this.A02;
        if (num != null) {
            width = num.intValue();
        } else {
            int[] iArr2 = new int[2];
            View view3 = this.A07;
            view3.getLocationOnScreen(iArr2);
            width = iArr2[0] + (view3.getWidth() / 2);
            this.A02 = Integer.valueOf(width);
        }
        return width - iArr[0];
    }

    private final int A01(C45093JxN c45093JxN) {
        C45197Jzd c45197Jzd;
        int i = 0;
        for (InterfaceC66482zP interfaceC66482zP : this.A03) {
            String str = null;
            if ((interfaceC66482zP instanceof C45197Jzd) && (c45197Jzd = (C45197Jzd) interfaceC66482zP) != null) {
                str = c45197Jzd.A01;
            }
            if (!C14360o3.A0K(str, c45093JxN.A01())) {
                i++;
            } else {
                return i;
            }
        }
        return -1;
    }

    private final void A02(int i) {
        C110814yt c110814yt;
        if (i == this.A01 + 1 && this.A00 > 0.7f) {
            c110814yt = this.A0D;
        } else {
            c110814yt = this.A0E;
        }
        ((AbstractC110824yu) c110814yt).A00 = i;
        AbstractC70663Fe abstractC70663Fe = this.A09.A0D;
        if (abstractC70663Fe != null) {
            abstractC70663Fe.A10(c110814yt);
        }
        this.A01 = i;
        this.A00 = 0.0f;
    }

    public static final void A03(C49675Lx6 c49675Lx6) {
        int width;
        int A02;
        int dimensionPixelSize;
        DirectVisualMessageViewerController directVisualMessageViewerController;
        View view;
        Integer num = c49675Lx6.A02;
        if (num != null) {
            width = num.intValue();
        } else {
            int[] iArr = new int[2];
            View view2 = c49675Lx6.A07;
            view2.getLocationOnScreen(iArr);
            width = iArr[0] + (view2.getWidth() / 2);
            c49675Lx6.A02 = Integer.valueOf(width);
        }
        RecyclerView recyclerView = c49675Lx6.A09;
        AbstractC70663Fe abstractC70663Fe = recyclerView.A0D;
        if (abstractC70663Fe != null) {
            int[] iArr2 = new int[2];
            int A0T = abstractC70663Fe.A0T();
            for (int i = 0; i < A0T; i++) {
                View A0e = abstractC70663Fe.A0e(i);
                if (A0e != null) {
                    A0e.getLocationOnScreen(iArr2);
                    int width2 = A0e.getWidth();
                    int i2 = iArr2[0];
                    if (i2 <= width && i2 + width2 > width && (A02 = RecyclerView.A02(A0e)) != -1) {
                        if (A02 < c49675Lx6.A03.size() && (c49675Lx6.A03.get(A02) instanceof C45197Jzd)) {
                            C3OO A0V = recyclerView.A0V(A02);
                            if (A0V != null && (view = A0V.itemView) != null) {
                                dimensionPixelSize = view.getWidth();
                            } else {
                                dimensionPixelSize = c49675Lx6.A06.getResources().getDimensionPixelSize(R.dimen.add_to_story_dual_destination_share_sheet_story_row_height);
                            }
                            float A00 = c49675Lx6.A00(A02) / dimensionPixelSize;
                            if (A02 != c49675Lx6.A01) {
                                c49675Lx6.A01 = A02;
                                Object obj = c49675Lx6.A03.get(A02);
                                C14360o3.A0C(obj, "null cannot be cast to non-null type com.instagram.direct.visual.timeline.view.DirectVisualTimelineMessageViewModel");
                                c49675Lx6.A0F.A00(((C45197Jzd) obj).A01);
                            }
                            KBV kbv = c49675Lx6.A0B.A00;
                            KCV kcv = (KCV) kbv.getChildFragmentManager().A0Q(kbv.A06);
                            if (kcv != null && kcv.isResumed() && (directVisualMessageViewerController = kcv.A01) != null) {
                                C45093JxN A022 = DirectVisualMessageViewerController.A02(directVisualMessageViewerController);
                                if (A022 != null && AbstractC167007dF.A1X(A022.A0B, EnumC40111tc.A0a)) {
                                    C49685LxG c49685LxG = directVisualMessageViewerController.videoPlayer;
                                    if (c49685LxG != null) {
                                        c49685LxG.A00(A00);
                                    }
                                } else {
                                    C147326kI c147326kI = directVisualMessageViewerController.photoTimerController;
                                    if (c147326kI != null) {
                                        c147326kI.A00 = A00;
                                    }
                                }
                            }
                            c49675Lx6.A00 = A00;
                            return;
                        }
                        if ((A02 < c49675Lx6.A03.size() && !(c49675Lx6.A03.get(A02) instanceof C45656KIt) && !(c49675Lx6.A03.get(A02) instanceof C45639KIc)) || c49675Lx6.A01 == -1) {
                            return;
                        }
                        KBV.A00(c49675Lx6.A0A.A00);
                        return;
                    }
                }
            }
        }
    }

    @Override // X.InterfaceC1119053c
    public final /* bridge */ /* synthetic */ void Dbs(Object obj) {
        int i;
        C45093JxN c45093JxN = (C45093JxN) obj;
        C14360o3.A0B(c45093JxN, 0);
        int A01 = A01(c45093JxN);
        int i2 = -1;
        if (A01 != -1 && (i = A01 + 1) < this.A03.size()) {
            if (A01 == this.A01 && (this.A03.get(i) instanceof C45197Jzd)) {
                A02(i);
                return;
            }
            if (!this.A05 || this.A04) {
                return;
            }
            ListIterator A14 = AbstractC43592JPx.A14(this.A03);
            while (true) {
                if (!A14.hasPrevious()) {
                    break;
                } else if (A14.previous() instanceof C45197Jzd) {
                    i2 = A14.nextIndex();
                    break;
                }
            }
            if (A01 != i2) {
                return;
            }
            KBV.A01(this.A0B.A00);
            KBV.A00(this.A0A.A00);
        }
    }

    @Override // X.InterfaceC1119053c
    public final /* bridge */ /* synthetic */ void Dbu(Object obj) {
        C45093JxN c45093JxN = (C45093JxN) obj;
        C14360o3.A0B(c45093JxN, 0);
        int A01 = A01(c45093JxN);
        if (A01 != -1 && this.A01 != A01) {
            A02(A01);
        }
    }

    @Override // X.InterfaceC1119053c
    public final /* bridge */ /* synthetic */ void Dbz(Object obj, float f) {
        int dimensionPixelSize;
        View view;
        C45093JxN c45093JxN = (C45093JxN) obj;
        C14360o3.A0B(c45093JxN, 0);
        int A01 = A01(c45093JxN);
        if (A01 != -1) {
            RecyclerView recyclerView = this.A09;
            C3OO A0V = recyclerView.A0V(A01);
            if (A0V != null && (view = A0V.itemView) != null) {
                dimensionPixelSize = view.getWidth();
            } else {
                dimensionPixelSize = this.A06.getResources().getDimensionPixelSize(R.dimen.add_to_story_dual_destination_share_sheet_story_row_height);
            }
            int A00 = ((int) (dimensionPixelSize * f)) - A00(this.A01);
            AbstractC70663Fe abstractC70663Fe = recyclerView.A0D;
            if (abstractC70663Fe != null) {
                AbstractC110824yu abstractC110824yu = abstractC70663Fe.A06;
                if ((abstractC110824yu != null && abstractC110824yu.A05) || this.A04) {
                    return;
                }
                this.A00 = f;
                recyclerView.scrollBy(A00, 0);
            }
        }
    }
}
