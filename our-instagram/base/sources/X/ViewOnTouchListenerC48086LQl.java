package X;

import android.app.Activity;
import android.content.Context;
import android.graphics.Rect;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.cardview.widget.CardView;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.ui.simplevideolayout.SimpleVideoLayout;
import com.instagram.ui.widget.spinner.SpinnerImageView;
import java.util.List;

/* renamed from: X.LQl, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class ViewOnTouchListenerC48086LQl implements View.OnTouchListener, C6C3, InterfaceC55932he {
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public View A04;
    public InterfaceC56002hn A05;
    public String A06;
    public boolean A07;
    public boolean A08;
    public boolean A09;
    public final int A0A;
    public final Activity A0B;
    public final Rect A0C;
    public final ViewGroup A0D;
    public final ViewGroup A0E;
    public final ImageView A0F;
    public final C55982hj A0G;
    public final SimpleVideoLayout A0H;
    public final SpinnerImageView A0I;
    public final C5TA A0J;
    public final Context A0K;
    public final CardView A0L;
    public final InterfaceC16820sZ A0M;

    public ViewOnTouchListenerC48086LQl(Activity activity, ViewGroup viewGroup, UserSession userSession, InterfaceC16820sZ interfaceC16820sZ) {
        AbstractC167007dF.A1D(userSession, 1, viewGroup);
        this.A0E = viewGroup;
        this.A0B = activity;
        this.A0M = interfaceC16820sZ;
        Context A0L = AbstractC166997dE.A0L(viewGroup);
        this.A0K = A0L;
        ViewGroup viewGroup2 = (ViewGroup) AbstractC31175DnJ.A07(LayoutInflater.from(A0L), viewGroup, R.layout.giphy_peek_view, false);
        this.A0D = viewGroup2;
        this.A0C = AbstractC166987dD.A0U();
        this.A0A = AbstractC43594JPz.A07(A0L);
        AbstractC124845kp.A01(viewGroup).addView(viewGroup2);
        this.A0H = (SimpleVideoLayout) viewGroup2.requireViewById(R.id.giphy_peek_video);
        this.A0F = AbstractC31173DnH.A0I(viewGroup2, R.id.giphy_peek_image);
        this.A0I = AbstractC31180DnO.A0V(viewGroup2);
        this.A0L = (CardView) viewGroup2.requireViewById(R.id.giphy_card_view);
        this.A0J = new C5TA(A0L, userSession, null, this, "giphy_peek_video_player");
        C55982hj A0R = AbstractC167007dF.A0R();
        A0R.A09(C55942hf.A03(8.0d, 13.0d));
        A0R.A06 = true;
        A0R.A0A(this);
        this.A0G = A0R;
    }

    public final void A00() {
        this.A08 = false;
        if (!this.A07) {
            this.A0J.A09("end_peek");
        }
        this.A0G.A04();
        InterfaceC56002hn interfaceC56002hn = this.A05;
        if (interfaceC56002hn != null) {
            interfaceC56002hn.COs(null);
        }
        this.A0M.invoke();
    }

    @Override // X.InterfaceC55932he
    public final void Dnj(C55982hj c55982hj) {
    }

    @Override // X.InterfaceC55932he
    public final void Dnk(C55982hj c55982hj) {
    }

    @Override // X.InterfaceC55932he
    public final void Dnl(C55982hj c55982hj) {
    }

    @Override // X.InterfaceC55932he
    public final void Dnm(C55982hj c55982hj) {
        C14360o3.A0B(c55982hj, 0);
        float f = (float) c55982hj.A09.A00;
        this.A0D.setVisibility(JQ0.A02((f > 0.0f ? 1 : (f == 0.0f ? 0 : -1))));
        this.A0L.setAlpha(f);
        float f2 = this.A03;
        float f3 = 1.0f - 0.0f;
        int A01 = C1H4.A01((AbstractC43592JPx.A00((f3 > 0.0f ? 1 : (f3 == 0.0f ? 0 : -1)), f, 0.0f, f3) * (this.A01 - f2)) + f2);
        float f4 = this.A02;
        int A012 = C1H4.A01((AbstractC43592JPx.A00((f3 > 0.0f ? 1 : (f3 == 0.0f ? 0 : -1)), f, 0.0f, f3) * (this.A00 - f4)) + f4);
        ImageView imageView = this.A0F;
        AbstractC13880nE.A0g(imageView, A01);
        AbstractC13880nE.A0W(imageView, A012);
        SimpleVideoLayout simpleVideoLayout = this.A0H;
        AbstractC13880nE.A0g(simpleVideoLayout, A01);
        AbstractC13880nE.A0W(simpleVideoLayout, A012);
    }

    @Override // X.C6C3
    public final void Dz8(C4S7 c4s7) {
    }

    @Override // X.C6C3
    public final void Dza(C4S7 c4s7) {
    }

    @Override // X.C6C3
    public final void E0M(int i, int i2) {
    }

    @Override // X.C6C3
    public final void onCompletion() {
    }

    @Override // X.C6C3
    public final void onCues(List list) {
    }

    @Override // X.C6C3
    public final void onLoop(int i) {
    }

    @Override // X.C6C3
    public final void onPrepare(C4S7 c4s7) {
    }

    @Override // X.C6C3
    public final void onProgressStateChanged(boolean z) {
    }

    @Override // X.C6C3
    public final void onProgressUpdate(int i, int i2, boolean z) {
    }

    @Override // X.C6C3
    public final void onStopVideo(String str, boolean z) {
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        C14360o3.A0B(motionEvent, 1);
        if (motionEvent.getActionMasked() == 0) {
            this.A09 = true;
        } else if (this.A09 && motionEvent.getActionMasked() == 1) {
            A00();
            this.A09 = false;
            return true;
        }
        return true;
    }

    @Override // X.C6C3
    public final void onVideoDownloading(C4S7 c4s7) {
    }

    @Override // X.C6C3
    public final void onVideoPlayerError(C4S7 c4s7, String str) {
    }

    @Override // X.C6C3
    public final /* synthetic */ void onVideoStartedPlaying(C4S7 c4s7) {
    }

    @Override // X.C6C3
    public final void Dzb(C4S7 c4s7) {
        this.A0F.setVisibility(8);
        this.A0I.setVisibility(8);
    }

    @Override // X.C6C3
    public final void onVideoViewPrepared(C4S7 c4s7) {
        if (!this.A08 && !this.A07) {
            this.A0J.A09("end_peek");
        }
    }
}
