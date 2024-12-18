package X;

import android.content.Context;
import com.facebook.common.util.TriState;
import com.instagram.arp.api.AvatarEffectsApiController;
import com.instagram.camera.effect.models.CameraAREffect;
import com.instagram.common.session.UserSession;

/* renamed from: X.NTy, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C52713NTy extends AbstractC54988OTw {
    public TriState A00;
    public CameraAREffect A01;
    public Integer A02;
    public boolean A03;
    public final AvatarEffectsApiController A04;
    public final C54823OLg A05;
    public final NU1 A06;
    public final OWf A07;
    public final C54448O4c A08;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C52713NTy(Context context, UserSession userSession, NU1 nu1, C54446O4a c54446O4a, OWf oWf, C54448O4c c54448O4c) {
        super(c54446O4a);
        C54823OLg c54823OLg = new C54823OLg(userSession);
        AvatarEffectsApiController avatarEffectsApiController = new AvatarEffectsApiController(AbstractC142256bi.A00(context, userSession), userSession);
        this.A07 = oWf;
        this.A06 = nu1;
        this.A08 = c54448O4c;
        this.A05 = c54823OLg;
        this.A04 = avatarEffectsApiController;
        this.A02 = C05F.A00;
        this.A00 = TriState.UNSET;
        if (c54823OLg.A00() instanceof NUJ) {
            avatarEffectsApiController.A02 = new C57753Pjg(this, 5);
            avatarEffectsApiController.A01 = new C57753Pjg(this, 6);
            avatarEffectsApiController.A00 = C57548PgM.A01(this, 20);
        }
    }

    public static final void A00(C52713NTy c52713NTy, Integer num) {
        C51887MwV A00;
        C55035OZg c55035OZg;
        if (c52713NTy.A02 != num) {
            c52713NTy.A02 = num;
            C54448O4c c54448O4c = c52713NTy.A08;
            CameraAREffect cameraAREffect = c52713NTy.A01;
            NU5 nu5 = c54448O4c.A00.A0N;
            if (C14360o3.A0K(nu5.A03, cameraAREffect) && nu5.A08 == num) {
                return;
            }
            A00 = C51887MwV.A00(null, null, null, null, null, null, NU5.A00(nu5), num, null, null, null, null, null, null, null, null, null, null, null, 0.0f, -9, false, false, false, false, false, false, false, false, false, false, false, false, false);
            NU5.A0A(nu5, A00);
            nu5.A03 = cameraAREffect;
            nu5.A08 = num;
            if (cameraAREffect != null && num == C05F.A0j) {
                C05A c05a = nu5.A0X;
                if (c05a.getValue() == EnumC53154Nf9.A04) {
                    if (nu5.A0F.A02() && (c55035OZg = nu5.A05) != null) {
                        c55035OZg.A03 = false;
                        C55035OZg.A01(c55035OZg, 5);
                        C55035OZg.A00(c55035OZg, 5, 10000);
                    }
                    NU5.A0B(nu5, C05F.A0u);
                    return;
                }
                if (c05a.getValue() == EnumC53154Nf9.A03) {
                    return;
                }
                c05a.F8m(EnumC53154Nf9.A02);
                return;
            }
            if (num != C05F.A01 || nu5.A0X.getValue() != EnumC53154Nf9.A04) {
                return;
            }
            NU5.A0H(nu5, true, true);
        }
    }
}
