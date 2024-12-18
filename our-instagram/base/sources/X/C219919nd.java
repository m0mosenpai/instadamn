package X;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.os.Handler;
import android.view.Surface;
import com.facebook.common.math.matrix.Matrix4;
import com.facebook.videolite.transcoder.base.composition.MediaComposition;
import com.instagram.common.session.UserSession;
import com.instagram.pendingmedia.model.ClipInfo;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: X.9nd, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C219919nd extends C9KW implements InterfaceC58028PoE {
    public float A00;
    public int A01;
    public long A02;
    public SurfaceTexture A03;
    public Surface A04;
    public C55208OeM A05;
    public C219909nc A06;
    public boolean A07;
    public boolean A08;
    public boolean A09;
    public boolean A0A;
    public final Context A0B;
    public final Handler A0C;
    public final C8NS A0D;
    public final UserSession A0E;
    public final C22840A5j A0F;
    public final String A0G;
    public final AtomicBoolean A0H;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C219919nd(Context context, C8NS c8ns, UserSession userSession, InterfaceC25217BDq interfaceC25217BDq, C22840A5j c22840A5j, C23105AGr c23105AGr, RunnableC208819Lp runnableC208819Lp, C208719Lf c208719Lf, String str, boolean z, boolean z2) {
        super(userSession, interfaceC25217BDq, c23105AGr);
        AbstractC167007dF.A1H(context, 1, userSession);
        this.A0B = context;
        this.A07 = z;
        this.A0E = userSession;
        this.A0F = c22840A5j;
        this.A0G = str;
        this.A0D = c8ns;
        this.A0C = AbstractC167007dF.A0J();
        this.A06 = new C219909nc(this, runnableC208819Lp, c208719Lf);
        this.A00 = z2 ? 1.0f : 0.0f;
        this.A01 = A07();
        this.A0H = AbstractC166997dE.A17();
    }

    @Override // X.C9KW
    public final void A0J(UserSession userSession, C47Z c47z, int i) {
        MediaComposition mediaComposition;
        boolean A1R = AbstractC167007dF.A1R(0, userSession, c47z);
        super.A0J(userSession, c47z, i);
        C47Z c47z2 = super.A09;
        if (c47z2 != null && (mediaComposition = c47z2.A0r) != null) {
            C55208OeM c55208OeM = this.A05;
            if (c55208OeM != null) {
                ClipInfo clipInfo = c47z2.A1N;
                if (clipInfo != null) {
                    int i2 = clipInfo.A09;
                    int i3 = clipInfo.A06;
                    C9KJ c9kj = this.A0F.A00;
                    Matrix4 matrix4 = C9KJ.A0R;
                    c55208OeM.A0A(mediaComposition, i2, i3, c9kj.A03, c9kj.A02, i, A1R);
                } else {
                    throw AbstractC166987dD.A14("Required value was null.");
                }
            }
            boolean z = this.A07;
            C55208OeM c55208OeM2 = this.A05;
            if (z) {
                if (c55208OeM2 != null) {
                    c55208OeM2.A06();
                }
            } else {
                if (c55208OeM2 == null) {
                    return;
                }
                c55208OeM2.A09(0);
            }
        }
    }

    @Override // X.InterfaceC58028PoE
    public final void DZ5(long j) {
    }

    @Override // X.InterfaceC58028PoE
    public final void DZC(EnumC222789sJ enumC222789sJ, EnumC222789sJ enumC222789sJ2) {
        InterfaceC25217BDq interfaceC25217BDq;
        InterfaceC25217BDq interfaceC25217BDq2;
        InterfaceC58201Pr7 interfaceC58201Pr7;
        C9OB c9ob;
        InterfaceC25215BDn interfaceC25215BDn;
        C55208OeM c55208OeM;
        long j;
        C14360o3.A0B(enumC222789sJ2, 1);
        if (enumC222789sJ2 != EnumC222789sJ.ERROR) {
            EnumC222789sJ enumC222789sJ3 = EnumC222789sJ.PLAYING;
            if (enumC222789sJ == enumC222789sJ3) {
                if (enumC222789sJ2 == EnumC222789sJ.SEEKING && (c55208OeM = this.A05) != null) {
                    TimeUnit timeUnit = TimeUnit.NANOSECONDS;
                    InterfaceC58201Pr7 interfaceC58201Pr72 = c55208OeM.A04;
                    if (interfaceC58201Pr72 != null) {
                        j = interfaceC58201Pr72.Aui();
                    } else {
                        j = 0;
                    }
                    if (timeUnit.toMillis(j) == 0) {
                        C9PR c9pr = super.A06;
                        if (c9pr != null) {
                            c9pr.A00.run();
                        }
                    }
                }
                if (enumC222789sJ2 == EnumC222789sJ.PLAYBACK_COMPLETE && (interfaceC25215BDn = super.A04) != null) {
                    interfaceC25215BDn.E0B();
                }
            }
            if (enumC222789sJ == EnumC222789sJ.SEEKING && enumC222789sJ2 == enumC222789sJ3 && (c9ob = super.A02) != null) {
                c9ob.A00();
            }
            C55208OeM c55208OeM2 = this.A05;
            if (c55208OeM2 != null && (interfaceC58201Pr7 = c55208OeM2.A04) != null && interfaceC58201Pr7.isPlaying() && enumC222789sJ2 == enumC222789sJ3) {
                this.A0A = false;
            }
            if (enumC222789sJ2 == EnumC222789sJ.PREPARING) {
                if (!this.A0H.get() && (interfaceC25217BDq2 = super.A05) != null) {
                    interfaceC25217BDq2.DyS();
                }
                InterfaceC25215BDn interfaceC25215BDn2 = super.A04;
                if (interfaceC25215BDn2 != null) {
                    interfaceC25215BDn2.Dzd();
                }
            }
            if (enumC222789sJ2 == EnumC222789sJ.READY) {
                if (!this.A0H.get() && (interfaceC25217BDq = super.A05) != null) {
                    interfaceC25217BDq.DyT();
                }
                InterfaceC25215BDn interfaceC25215BDn3 = super.A04;
                if (interfaceC25215BDn3 != null) {
                    interfaceC25215BDn3.Dzf();
                }
            }
        }
    }

    @Override // android.graphics.SurfaceTexture.OnFrameAvailableListener
    public final void onFrameAvailable(SurfaceTexture surfaceTexture) {
        C219909nc c219909nc = this.A06;
        c219909nc.A00 = 3;
        ((AbstractC208809Lo) c219909nc).A00.A03(null);
    }
}
