package X;

import android.content.Context;
import androidx.compose.ui.Modifier;
import com.facebook.react.modules.dialog.DialogModule;
import com.facebook.rtc.notification.instagram.IgRtcNotificationBroadcastReceiver;
import com.instagram.common.session.UserSession;
import com.instagram.model.rtc.RtcCallKey;
import com.instagram.model.rtc.RtcIgNotification;
import com.instagram.rtc.signaling.models.RtcConnectionEntity;
import java.util.List;

/* renamed from: X.DSz, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C30220DSz extends C0YY implements InterfaceC16620sF {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;
    public final boolean A04;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C30220DSz(int i, Object obj, Object obj2, Object obj3, boolean z) {
        super(2);
        this.A00 = i;
        this.A01 = obj;
        this.A02 = obj2;
        this.A03 = obj3;
        this.A04 = z;
    }

    @Override // X.InterfaceC16620sF
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        String str;
        RtcConnectionEntity A00;
        String str2;
        if (this.A00 != 0) {
            C5Tl c5Tl = (C5Tl) obj;
            if (AbstractC25228BEl.A0B(obj2) == 2 && c5Tl.Bxj()) {
                c5Tl.Em9();
            } else {
                if (C0fH.A02()) {
                    C0fH.A01(1468371022, "com.instagram.creation.genai.magicmod.tools.backdrop.ui.BackdropNineSixteenLayout.<anonymous> (BackdropNineSixteenLayout.kt:187)");
                }
                C77 c77 = ((C26197BiN) this.A01).A02;
                if (c77 == C77.A04) {
                    c5Tl.Eno(1097189059);
                    C26058Bfl c26058Bfl = (C26058Bfl) this.A02;
                    C28224CcU c28224CcU = (C28224CcU) c26058Bfl.A02;
                    if (c28224CcU != null) {
                        str2 = c28224CcU.A04;
                    } else {
                        str2 = null;
                    }
                    List list = (List) c26058Bfl.A01;
                    c5Tl.Eno(-380242271);
                    Object obj3 = this.A03;
                    boolean AH4 = c5Tl.AH4(obj3);
                    Object EEc = c5Tl.EEc();
                    if (AH4 || EEc == C5UI.A00) {
                        EEc = AbstractC25230BEn.A0w(c5Tl, obj3, 18);
                    }
                    AbstractC25225BEi.A1V(c5Tl, false);
                    AbstractC28306Cds.A01(c5Tl, str2, list, (InterfaceC16660sJ) EEc, 0);
                } else if (c77 == C77.A03 && this.A04) {
                    Modifier A03 = AbstractC118175Wb.A03(AbstractC25225BEi.A0N(c5Tl, 1097536228));
                    InterfaceC1127857k A0b = AbstractC25226BEj.A0b(false);
                    int A002 = C5X2.A00(c5Tl);
                    C117505Tk c117505Tk = (C117505Tk) c5Tl;
                    C59P A04 = C117505Tk.A04(c117505Tk);
                    Modifier A01 = C5X3.A01(c5Tl, A03);
                    AbstractC25233BEq.A11(c5Tl, c117505Tk);
                    AbstractC25231BEo.A12(c5Tl, A0b, A04);
                    InterfaceC16620sF interfaceC16620sF = C5X8.A02;
                    if (c117505Tk.A0K || !AbstractC25231BEo.A1O(c5Tl, A002)) {
                        AbstractC25231BEo.A15(c5Tl, interfaceC16620sF, A002);
                    }
                    AbstractC25225BEi.A1K(c5Tl, A01);
                    CHE.A00(c5Tl, 2131965952, 0);
                    c5Tl.ASW();
                } else {
                    c5Tl.Eno(1097677495);
                }
                if (AbstractC25230BEn.A1Z(c5Tl, false)) {
                    C0fH.A00(-531721856);
                }
            }
        } else {
            UserSession userSession = (UserSession) obj;
            InterfaceC16820sZ interfaceC16820sZ = (InterfaceC16820sZ) obj2;
            boolean A1a = AbstractC167017dG.A1a(userSession, interfaceC16820sZ);
            RtcConnectionEntity rtcConnectionEntity = (RtcConnectionEntity) this.A01;
            RtcIgNotification Bpo = rtcConnectionEntity.Bpo();
            if (Bpo != null) {
                C19280xC A02 = C1W4.A02(Bpo, ((C27661Vu) ((IgRtcNotificationBroadcastReceiver) this.A03).A00).A01, C05F.A0N, null, rtcConnectionEntity.Ajm().A00, rtcConnectionEntity.C7I(), null, null);
                if (A02 != null) {
                    A02.A0C("reason", DialogModule.ACTION_DISMISSED);
                    AbstractC11060iN.A00(userSession).EHW(A02);
                }
            } else if (rtcConnectionEntity instanceof RtcConnectionEntity.RtcCallConnectionEntity) {
                RtcConnectionEntity.RtcCallConnectionEntity rtcCallConnectionEntity = (RtcConnectionEntity.RtcCallConnectionEntity) rtcConnectionEntity;
                String str3 = null;
                if (!AbstractC25229BEm.A1a(rtcCallConnectionEntity.A01, EnumC53137Neq.A03)) {
                    str = rtcCallConnectionEntity.A0J;
                } else {
                    str = null;
                    str3 = rtcCallConnectionEntity.A0E;
                }
                IgRtcNotificationBroadcastReceiver igRtcNotificationBroadcastReceiver = (IgRtcNotificationBroadcastReceiver) this.A03;
                C7T3 c7t3 = C7T3.A0M;
                String str4 = rtcCallConnectionEntity.A0G;
                RtcCallKey rtcCallKey = rtcCallConnectionEntity.A03;
                String A003 = rtcCallConnectionEntity.A00();
                String str5 = rtcCallKey.A00;
                C1W4 c1w4 = ((C27661Vu) igRtcNotificationBroadcastReceiver.A00).A01;
                C14360o3.A0B(str4, A1a ? 1 : 0);
                C19280xC A012 = C1W4.A01(c7t3, c1w4, C05F.A0N, str4, null, str5, A003, str, str3, null);
                A012.A0C("push_type", "mqtt");
                A012.A0C("reason", DialogModule.ACTION_DISMISSED);
                C1W5.A00(A012, str4);
            }
            if (this.A04) {
                IgRtcNotificationBroadcastReceiver igRtcNotificationBroadcastReceiver2 = (IgRtcNotificationBroadcastReceiver) this.A03;
                Context context = (Context) this.A02;
                C57549PgN c57549PgN = new C57549PgN(interfaceC16820sZ, 24);
                C3ES A004 = igRtcNotificationBroadcastReceiver2.A00.A00(context, userSession);
                if (rtcConnectionEntity.C01() == EnumC53186Nfi.A04) {
                    if (rtcConnectionEntity instanceof RtcConnectionEntity.RtcCallConnectionEntity) {
                        A004.A07((RtcConnectionEntity.RtcCallConnectionEntity) rtcConnectionEntity, "handleDeclineCall", c57549PgN);
                    } else if (rtcConnectionEntity instanceof RtcConnectionEntity.EndCallConnectionEntity) {
                        c57549PgN.invoke();
                    } else {
                        new OLI(C18950wb.A01).A01(AnonymousClass001.A0R("Unsuccessfully casting connectionEntity as RtcCallConnectionEntity, the type is: ", rtcConnectionEntity.getTag()));
                    }
                } else {
                    A004.A0A(c57549PgN);
                }
                String A005 = OPw.A00(rtcConnectionEntity);
                EnumC53186Nfi enumC53186Nfi = EnumC53186Nfi.A03;
                C55051Oa2 c55051Oa2 = C55051Oa2.A00;
                RtcConnectionEntity A006 = C55051Oa2.A00(A005);
                if (A006 != null && (A00 = AES.A00(enumC53186Nfi, A006, A006.BXN())) != null) {
                    c55051Oa2.A01(null, A00);
                }
            } else {
                interfaceC16820sZ.invoke();
            }
        }
        return C0eB.A00;
    }
}
