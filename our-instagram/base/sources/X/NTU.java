package X;

import android.app.Activity;
import android.app.KeyguardManager;
import android.app.PictureInPictureParams;
import android.graphics.Rect;
import android.os.Build;
import android.os.Handler;
import android.util.Rational;
import com.instagram.common.session.UserSession;

/* loaded from: classes9.dex */
public final class NTU extends AbstractC55206OeJ {
    public int A00;
    public Rect A01;
    public Rational A02;
    public InterfaceC57858PlO A03;
    public C56625PBv A04;
    public boolean A05;
    public boolean A06;
    public final Activity A07;
    public final Handler A08;
    public final UserSession A09;
    public final OI6 A0A;
    public final PCL A0B;
    public final C55177Odh A0C;
    public final InterfaceC09390do A0D;
    public final InterfaceC09390do A0E;
    public final InterfaceC09390do A0F;
    public final InterfaceC09390do A0G;

    public static final void A00(Rect rect, Rational rational, NTU ntu) {
        float numerator;
        try {
            OVG ovg = OVG.A00;
            UserSession userSession = ntu.A09;
            Activity activity = ntu.A07;
            if (AbstractC166987dD.A1a(ovg.A00(activity, userSession, true).A00)) {
                PictureInPictureParams.Builder builder = new PictureInPictureParams.Builder();
                if (rational.isInfinite()) {
                    numerator = 0.0f;
                } else {
                    numerator = rational.getNumerator() / rational.getDenominator();
                }
                rational.getNumerator();
                rational.getDenominator();
                double d = numerator;
                if (d > 2.38d) {
                    rational = O13.A00;
                } else if (d < 0.42d) {
                    rational = O13.A01;
                }
                PictureInPictureParams.Builder aspectRatio = builder.setAspectRatio(rational);
                if (Build.VERSION.SDK_INT > 30) {
                    if (rect != null) {
                        aspectRatio.setSourceRectHint(rect);
                    }
                    aspectRatio.setAutoEnterEnabled(true);
                }
                activity.setPictureInPictureParams(aspectRatio.build());
            }
        } catch (Exception e) {
            C0w9.A06("RtcCallPipPresenter", "Failed to update PIP params", e);
        }
    }

    public static final boolean A01(NTU ntu, Integer num) {
        Integer num2;
        OI6 oi6;
        InterfaceC57853PlJ pa8;
        int ordinal;
        C56625PBv c56625PBv = ntu.A04;
        boolean z = false;
        if (c56625PBv != null && !c56625PBv.A01 && c56625PBv.A00) {
            if (num != C05F.A01) {
                ntu.A07.finish();
                oi6 = ntu.A0A;
                pa8 = PBH.A00;
            }
            return false;
        }
        OVG ovg = OVG.A00;
        UserSession userSession = ntu.A09;
        Activity activity = ntu.A07;
        C09530e4 A00 = ovg.A00(activity, userSession, false);
        if (!AbstractC166987dD.A1a(A00.A00)) {
            EnumC53141Neu enumC53141Neu = (EnumC53141Neu) A00.A01;
            if (enumC53141Neu != null && (ordinal = enumC53141Neu.ordinal()) != -1) {
                if (ordinal != 0) {
                    if (ordinal != 1) {
                        if (ordinal == 2) {
                            num2 = C05F.A0C;
                        } else {
                            throw B4Z.A00();
                        }
                    } else {
                        num2 = C05F.A01;
                    }
                } else {
                    num2 = C05F.A00;
                }
            } else {
                num2 = null;
            }
            oi6 = ntu.A0A;
            pa8 = new PA8(num, num2, false);
        } else {
            C55177Odh c55177Odh = ntu.A0C;
            c55177Odh.A05(C56666PDk.A00);
            try {
                Rational rational = ntu.A02;
                if (rational == null) {
                    rational = new Rational(AbstractC13880nE.A0A(activity), AbstractC13880nE.A09(activity));
                }
                z = activity.enterPictureInPictureMode(new PictureInPictureParams.Builder().setAspectRatio(rational).build());
            } catch (Exception e) {
                C0w9.A06("RtcCallPipPresenter", "Failed to enter PIP mode", e);
            }
            if (z && !((KeyguardManager) ntu.A0F.getValue()).isDeviceLocked()) {
                c55177Odh.A05(C56678PDw.A00);
            }
            ntu.A0A.A00(new PA8(num, null, z));
            return z;
        }
        oi6.A00(pa8);
        return false;
    }

    @Override // X.AbstractC55206OeJ
    public final boolean A0L(InterfaceC57857PlN interfaceC57857PlN) {
        Integer num;
        if (interfaceC57857PlN instanceof PCX) {
            boolean z = ((PCX) interfaceC57857PlN).A00;
            if (!z || !this.A05) {
                this.A0C.A05(new PDF(z));
            }
            return true;
        }
        if (interfaceC57857PlN instanceof PCW) {
            if (Build.VERSION.SDK_INT > 30) {
                return false;
            }
            num = C05F.A01;
        } else {
            if (!(interfaceC57857PlN instanceof PCV)) {
                return false;
            }
            num = C05F.A00;
        }
        return A01(this, num);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ NTU(Activity activity, UserSession userSession, OI6 oi6, C55177Odh c55177Odh) {
        super(AbstractC25225BEi.A1D(C56625PBv.class));
        Handler A0J = AbstractC167007dF.A0J();
        int A07 = AbstractC25230BEn.A07(2, c55177Odh, oi6);
        this.A09 = userSession;
        this.A0C = c55177Odh;
        this.A0A = oi6;
        this.A07 = activity;
        this.A08 = A0J;
        this.A0B = PCL.A00;
        this.A0D = C57543PgH.A01(this, 2);
        this.A0G = C1XM.A00(C57445Peh.A00);
        this.A0F = C57543PgH.A01(this, A07);
        this.A0E = C1XM.A00(C57444Peg.A00);
    }
}
