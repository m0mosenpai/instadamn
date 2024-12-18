package X;

import android.view.animation.Interpolator;
import android.widget.OverScroller;
import androidx.recyclerview.widget.RecyclerView;
import java.util.Arrays;
import org.webrtc.CameraVideoCapturer;

/* renamed from: X.3F2, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C3F2 implements Runnable {
    public Interpolator A00;
    public OverScroller A01;
    public int A02;
    public int A03;
    public boolean A04;
    public boolean A05;
    public final /* synthetic */ RecyclerView A06;

    public final void A02(Interpolator interpolator, int i, int i2, int i3) {
        int height;
        int i4 = i3;
        if (i3 == Integer.MIN_VALUE) {
            int abs = Math.abs(i);
            int abs2 = Math.abs(i2);
            boolean z = false;
            if (abs > abs2) {
                z = true;
            }
            RecyclerView recyclerView = this.A06;
            if (z) {
                height = recyclerView.getWidth();
            } else {
                height = recyclerView.getHeight();
                abs = abs2;
            }
            i4 = Math.min((int) (((abs / height) + 1.0f) * 300.0f), CameraVideoCapturer.CameraStatistics.CAMERA_OBSERVER_PERIOD_MS);
        }
        if (interpolator == null) {
            interpolator = RecyclerView.A1F;
        }
        if (this.A00 != interpolator) {
            this.A00 = interpolator;
            this.A01 = new OverScroller(this.A06.getContext(), interpolator);
        }
        this.A03 = 0;
        this.A02 = 0;
        this.A06.setScrollState(2);
        this.A01.startScroll(0, 0, i, i2, i4);
        A00();
    }

    public C3F2(RecyclerView recyclerView) {
        this.A06 = recyclerView;
        Interpolator interpolator = RecyclerView.A1F;
        this.A00 = interpolator;
        this.A04 = false;
        this.A05 = false;
        this.A01 = new OverScroller(recyclerView.getContext(), interpolator);
    }

    public final void A00() {
        if (this.A04) {
            this.A05 = true;
            return;
        }
        RecyclerView recyclerView = this.A06;
        recyclerView.removeCallbacks(this);
        recyclerView.postOnAnimation(this);
    }

    public final void A01(int i, int i2) {
        RecyclerView recyclerView = this.A06;
        recyclerView.setScrollState(2);
        this.A03 = 0;
        this.A02 = 0;
        Interpolator interpolator = this.A00;
        Interpolator interpolator2 = RecyclerView.A1F;
        if (interpolator != interpolator2) {
            this.A00 = interpolator2;
            this.A01 = new OverScroller(recyclerView.getContext(), interpolator2);
        }
        this.A01.fling(0, 0, i, i2, Integer.MIN_VALUE, Integer.MAX_VALUE, Integer.MIN_VALUE, Integer.MAX_VALUE);
        A00();
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i;
        int i2;
        int i3;
        boolean awakenScrollBars;
        boolean z;
        int i4;
        int A03 = C0f9.A03(-365608472);
        RecyclerView recyclerView = this.A06;
        if (recyclerView.A0D == null) {
            recyclerView.removeCallbacks(this);
            this.A01.abortAnimation();
            i = 185966960;
        } else {
            this.A05 = false;
            this.A04 = true;
            recyclerView.A0b();
            OverScroller overScroller = this.A01;
            if (overScroller.computeScrollOffset()) {
                int currX = overScroller.getCurrX();
                int currY = overScroller.getCurrY();
                int i5 = currX - this.A02;
                int i6 = currY - this.A03;
                this.A02 = currX;
                this.A03 = currY;
                int A04 = RecyclerView.A04(recyclerView.A04, recyclerView.A05, i5, recyclerView.getWidth());
                int A042 = RecyclerView.A04(recyclerView.A06, recyclerView.A03, i6, recyclerView.getHeight());
                int[] iArr = recyclerView.A16;
                iArr[0] = 0;
                iArr[1] = 0;
                if (recyclerView.A1G(iArr, null, A04, A042, 1)) {
                    A04 -= iArr[0];
                    A042 -= iArr[1];
                }
                if (recyclerView.getOverScrollMode() != 2) {
                    recyclerView.A0q(A04, A042);
                }
                if (recyclerView.A0A != null) {
                    iArr[0] = 0;
                    iArr[1] = 0;
                    recyclerView.A0w(A04, iArr, A042);
                    i2 = iArr[0];
                    i3 = iArr[1];
                    A04 -= i2;
                    A042 -= i3;
                    AbstractC110824yu abstractC110824yu = recyclerView.A0D.A06;
                    if (abstractC110824yu != null && !abstractC110824yu.A04 && abstractC110824yu.A05) {
                        int A00 = recyclerView.mState.A00();
                        if (A00 == 0) {
                            abstractC110824yu.A01();
                        } else {
                            if (abstractC110824yu.A00 >= A00) {
                                abstractC110824yu.A00 = A00 - 1;
                            }
                            abstractC110824yu.A03(i2, i3);
                        }
                    }
                } else {
                    i2 = 0;
                    i3 = 0;
                }
                if (!recyclerView.A12.isEmpty()) {
                    recyclerView.invalidate();
                }
                iArr[0] = 0;
                iArr[1] = 0;
                int i7 = i3;
                int i8 = i2;
                recyclerView.A1A(null, iArr, i8, i7, A04, A042, 1);
                int i9 = A04 - iArr[0];
                int i10 = A042 - iArr[1];
                if (i2 != 0 || i3 != 0) {
                    recyclerView.A0s(i2, i3);
                }
                awakenScrollBars = recyclerView.awakenScrollBars();
                if (!awakenScrollBars) {
                    recyclerView.invalidate();
                }
                boolean z2 = false;
                if (overScroller.getCurrX() == overScroller.getFinalX()) {
                    z2 = true;
                }
                boolean z3 = false;
                if (overScroller.getCurrY() == overScroller.getFinalY()) {
                    z3 = true;
                }
                if (overScroller.isFinished() || ((z2 || i9 != 0) && (z3 || i10 != 0))) {
                    z = true;
                } else {
                    z = false;
                }
                AbstractC110824yu abstractC110824yu2 = recyclerView.A0D.A06;
                if ((abstractC110824yu2 != null && abstractC110824yu2.A04) || !z) {
                    A00();
                    RunnableC72643Nl runnableC72643Nl = recyclerView.mGapWorker;
                    if (runnableC72643Nl != null) {
                        runnableC72643Nl.A01(recyclerView, i2, i3);
                    }
                } else {
                    if (recyclerView.getOverScrollMode() != 2) {
                        int currVelocity = (int) overScroller.getCurrVelocity();
                        if (i9 < 0) {
                            i4 = -currVelocity;
                        } else {
                            i4 = 0;
                            if (i9 > 0) {
                                i4 = currVelocity;
                            }
                        }
                        if (i10 < 0) {
                            currVelocity = -currVelocity;
                        } else if (i10 <= 0) {
                            currVelocity = 0;
                        }
                        if (i4 < 0) {
                            recyclerView.A0e();
                            if (recyclerView.A04.isFinished()) {
                                recyclerView.A04.onAbsorb(-i4);
                            }
                        } else if (i4 > 0) {
                            recyclerView.A0f();
                            if (recyclerView.A05.isFinished()) {
                                recyclerView.A05.onAbsorb(i4);
                            }
                        }
                        if (currVelocity < 0) {
                            recyclerView.A0g();
                            if (recyclerView.A06.isFinished()) {
                                recyclerView.A06.onAbsorb(-currVelocity);
                            }
                        } else if (currVelocity > 0) {
                            recyclerView.A0d();
                            if (recyclerView.A03.isFinished()) {
                                recyclerView.A03.onAbsorb(currVelocity);
                            }
                        }
                        if (i4 != 0 || currVelocity != 0) {
                            recyclerView.postInvalidateOnAnimation();
                        }
                    }
                    C3F3 c3f3 = recyclerView.A09;
                    int[] iArr2 = c3f3.A03;
                    if (iArr2 != null) {
                        Arrays.fill(iArr2, -1);
                    }
                    c3f3.A00 = 0;
                }
            }
            AbstractC110824yu abstractC110824yu3 = recyclerView.A0D.A06;
            if (abstractC110824yu3 != null && abstractC110824yu3.A04) {
                abstractC110824yu3.A03(0, 0);
            }
            this.A04 = false;
            if (this.A05) {
                recyclerView.removeCallbacks(this);
                recyclerView.postOnAnimation(this);
            } else {
                recyclerView.setScrollState(0);
                recyclerView.A0p(1);
            }
            i = 809759386;
        }
        C0f9.A0A(i, A03);
    }
}
