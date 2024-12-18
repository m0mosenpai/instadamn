package X;

import android.content.Context;
import android.view.Surface;
import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.FrameLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.creation.capture.quickcapture.aspectratioutil.TargetViewSizeProvider;
import com.instagram.creation.capture.quickcapture.cameraspec.CameraSpec;
import java.io.File;

/* renamed from: X.8Qy, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C187058Qy {
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public Surface A04;
    public TextureView A05;
    public FrameLayout A06;
    public C115475Kh A07;
    public C95334Qt A08;
    public boolean A09;
    public final int A0A;
    public final Context A0B;
    public final ViewGroup A0C;
    public final Fragment A0D;
    public final InterfaceC08100bW A0E;
    public final UserSession A0F;
    public final TargetViewSizeProvider A0G;
    public final C184418Gf A0H;
    public final C1814582x A0I;
    public final C1814382v A0J;
    public final C8RR A0K;
    public final C8RQ A0L;
    public final AnonymousClass825 A0M;
    public final Runnable A0N;
    public final ViewStub A0O;
    public final C8R0 A0P;
    public final C49602Pt A0Q;

    /* JADX WARN: Multi-variable type inference failed */
    public C187058Qy(Context context, View view, Fragment fragment, UserSession userSession, TargetViewSizeProvider targetViewSizeProvider, C184418Gf c184418Gf, C1814582x c1814582x, C1814382v c1814382v, AnonymousClass825 anonymousClass825) {
        C14360o3.A0B(context, 1);
        C14360o3.A0B(fragment, 2);
        C14360o3.A0B(userSession, 3);
        C14360o3.A0B(targetViewSizeProvider, 6);
        C14360o3.A0B(anonymousClass825, 8);
        this.A0B = context;
        this.A0D = fragment;
        this.A0F = userSession;
        this.A0J = c1814382v;
        this.A0H = c184418Gf;
        this.A0G = targetViewSizeProvider;
        this.A0I = c1814582x;
        this.A0M = anonymousClass825;
        C8R0 c8r0 = new C8R0() { // from class: X.8Qz
            @Override // X.C8R0
            public final Integer BQ9() {
                return null;
            }

            @Override // X.C8R0
            public final int BmJ() {
                return 60000;
            }

            @Override // X.C8R0
            public final void DUH() {
            }

            @Override // X.C8R0
            public final C115475Kh CFQ() {
                return C187058Qy.this.A07;
            }

            @Override // X.C8R0
            public final void D1v() {
                C187058Qy.A00(C187058Qy.this, false);
            }

            @Override // X.C8R0
            public final void D6z() {
                C187058Qy c187058Qy = C187058Qy.this;
                int i = c187058Qy.A01;
                int i2 = c187058Qy.A00;
                if (i == i2) {
                    C9GR.A07(c187058Qy.A0B, 2131975755);
                    return;
                }
                C8RR c8rr = c187058Qy.A0K;
                if (c8rr.A02 != C05F.A00) {
                    C115475Kh c115475Kh = c187058Qy.A07;
                    if (c115475Kh != null) {
                        C115525Km c115525Km = c115475Kh.A0G;
                        boolean z = c8rr.A04;
                        File file = new File(c115525Km.A0F);
                        CameraSpec A00 = c187058Qy.A0M.A00();
                        int i3 = A00.A03;
                        int i4 = A00.A02;
                        C14140ne c14140ne = new C14140ne(70, 3, false, true);
                        C55775Opk c55775Opk = new C55775Opk();
                        C23887Ahg c23887Ahg = new C23887Ahg(c187058Qy);
                        Context context2 = c187058Qy.A0B;
                        WDI A002 = AbstractC53758NqA.A00(context2, file, false);
                        if (A002 == null) {
                            c23887Ahg.Dv5(new Exception("metadata corrupt"), true);
                        } else {
                            AbstractC55147OdA.A03(A002, A00.A04, null, i3, i4, true);
                            C14120nc.A00().ATO(new C52394NGp(A002, c55775Opk, c23887Ahg, c115525Km, c187058Qy, file, c14140ne, i2, i, i3, i4, z));
                        }
                        FragmentActivity requireActivity = c187058Qy.A0D.requireActivity();
                        FrameLayout frameLayout = new FrameLayout(context2);
                        c187058Qy.A06 = frameLayout;
                        frameLayout.setClickable(true);
                        requireActivity.getLayoutInflater().inflate(R.layout.layout_spinner_for_processing_video, c187058Qy.A06);
                        requireActivity.addContentView(c187058Qy.A06, new FrameLayout.LayoutParams(-1, -1));
                        return;
                    }
                    throw new IllegalStateException("Required value was null.");
                }
                C187058Qy.A00(c187058Qy, true);
            }

            @Override // X.C8R0
            public final void DGx() {
                C187058Qy c187058Qy = C187058Qy.this;
                C95334Qt c95334Qt = c187058Qy.A08;
                if (c95334Qt != null) {
                    c95334Qt.seekTo(c187058Qy.A01);
                    C95334Qt c95334Qt2 = c187058Qy.A08;
                    if (c95334Qt2 != null) {
                        c95334Qt2.start();
                        return;
                    }
                    return;
                }
                throw new IllegalStateException("Required value was null.");
            }

            @Override // X.C8R0
            public final void DGy() {
                C95334Qt c95334Qt = C187058Qy.this.A08;
                if (c95334Qt != null) {
                    c95334Qt.pause();
                    return;
                }
                throw new IllegalStateException("Required value was null.");
            }

            @Override // X.C8R0
            public final void DiM() {
                C187058Qy c187058Qy = C187058Qy.this;
                int i = c187058Qy.A03;
                int i2 = c187058Qy.A02;
                boolean z = c187058Qy.A0K.A04;
                if (c187058Qy.A05 != null) {
                    AbstractC13880nE.A0q(c187058Qy.A0C, new RunnableC24844Az4(c187058Qy, i, i2, z));
                    return;
                }
                throw new IllegalStateException("Required value was null.");
            }

            @Override // X.C8R0
            public final void Djz(int i) {
                C95334Qt c95334Qt = C187058Qy.this.A08;
                if (c95334Qt != null) {
                    c95334Qt.seekTo(i);
                    return;
                }
                throw new IllegalStateException("Required value was null.");
            }

            @Override // X.C8R0
            public final void Dvq(int i) {
                C187058Qy c187058Qy = C187058Qy.this;
                C95334Qt c95334Qt = c187058Qy.A08;
                if (c95334Qt != null) {
                    c187058Qy.A00 = i;
                    c95334Qt.seekTo(i);
                    return;
                }
                throw new IllegalStateException("Required value was null.");
            }

            @Override // X.C8R0
            public final void Dvs(int i) {
                C187058Qy c187058Qy = C187058Qy.this;
                C95334Qt c95334Qt = c187058Qy.A08;
                if (c95334Qt != null) {
                    c187058Qy.A01 = i;
                    c95334Qt.seekTo(i);
                    return;
                }
                throw new IllegalStateException("Required value was null.");
            }
        };
        this.A0P = c8r0;
        this.A0N = new Runnable() { // from class: X.8R1
            @Override // java.lang.Runnable
            public final void run() {
                C187058Qy c187058Qy = C187058Qy.this;
                if (c187058Qy.A09) {
                    C95334Qt c95334Qt = c187058Qy.A08;
                    if (c95334Qt != null) {
                        int currentPosition = c95334Qt.getCurrentPosition();
                        if (currentPosition <= 0) {
                            currentPosition = -1;
                        }
                        if (currentPosition >= c187058Qy.A00) {
                            C95334Qt c95334Qt2 = c187058Qy.A08;
                            if (c95334Qt2 != null) {
                                c95334Qt2.seekTo(c187058Qy.A01);
                            } else {
                                throw new IllegalStateException("Required value was null.");
                            }
                        } else {
                            c187058Qy.A0K.DzG(currentPosition, 0, 0);
                        }
                        c187058Qy.A0C.postOnAnimation(c187058Qy.A0N);
                        return;
                    }
                    throw new IllegalStateException("Required value was null.");
                }
            }
        };
        View findViewById = view.findViewById(R.id.video_review_container_stub);
        C14360o3.A07(findViewById);
        ViewStub viewStub = (ViewStub) findViewById;
        this.A0O = viewStub;
        View inflate = viewStub.inflate();
        C14360o3.A0C(inflate, "null cannot be cast to non-null type android.view.ViewGroup");
        ViewGroup viewGroup = (ViewGroup) inflate;
        this.A0C = viewGroup;
        this.A0A = context.getResources().getInteger(android.R.integer.config_shortAnimTime);
        C49602Pt A00 = C2Ps.A00(context, userSession);
        this.A0Q = A00;
        this.A0L = (C8RQ) new C52942bb((InterfaceC018407e) context).A00(C8RQ.class);
        this.A0E = new C1QF("IgSecureUriParser").A00;
        this.A00 = Integer.MAX_VALUE;
        View findViewById2 = viewGroup.findViewById(R.id.video_review_trim_mode);
        C14360o3.A07(findViewById2);
        this.A0K = new C8RR((ConstraintLayout) findViewById2, fragment, userSession, c8r0, null, A00);
    }

    public static final void A00(C187058Qy c187058Qy, boolean z) {
        c187058Qy.A09 = false;
        C95334Qt c95334Qt = c187058Qy.A08;
        if (c95334Qt != null) {
            c95334Qt.EE5(false);
        }
        c187058Qy.A08 = null;
        TextureView textureView = c187058Qy.A05;
        if (textureView != null) {
            c187058Qy.A0C.removeView(textureView);
            c187058Qy.A05 = null;
        }
        ViewGroup viewGroup = c187058Qy.A0C;
        viewGroup.setVisibility(8);
        AbstractC125325le A0C = AbstractC125325le.A01(viewGroup, 1).A0C(c187058Qy.A0A);
        A0C.A0M(0.0f, 1.0f);
        A0C.A05 = new C24080AmO(c187058Qy);
        A0C.A0H();
        c187058Qy.A0J.A00().Ekh();
        c187058Qy.A0H.A00.Egh(true);
        viewGroup.removeCallbacks(c187058Qy.A0N);
        c187058Qy.A0K.CMH(false);
        C8RQ c8rq = c187058Qy.A0L;
        c8rq.A04.Egh(false);
        c8rq.A03.Egh(Boolean.valueOf(!z));
    }
}
