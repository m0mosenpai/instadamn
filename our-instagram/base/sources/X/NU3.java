package X;

import android.content.Context;
import android.content.Intent;
import android.graphics.Point;
import android.os.Build;
import android.widget.Toast;
import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.rtc.rsys.models.EngineModel;

/* loaded from: classes9.dex */
public final class NU3 extends AbstractC54988OTw {
    public EngineModel A00;
    public C51873MwH A01;
    public String A02;
    public InterfaceC16820sZ A03;
    public boolean A04;
    public final long A05;
    public final Context A06;
    public final UserSession A07;
    public final InterfaceC58170Pqa A08;
    public final C54612OAn A09;
    public final NU1 A0A;
    public final C56126Ovm A0B;
    public final OWf A0C;
    public final C54457O4l A0D;
    public final C51873MwH A0E;
    public final InterfaceC16820sZ A0F;
    public final C05A A0G;
    public final boolean A0H;
    public final boolean A0I;

    public final void A04(InterfaceC58299Psr interfaceC58299Psr) {
        EnumC53174NfV enumC53174NfV;
        C14360o3.A0B(interfaceC58299Psr, 0);
        if (this.A0H) {
            if (interfaceC58299Psr instanceof PFU) {
                this.A08.Epp();
                if (this.A0I) {
                    C51873MwH c51873MwH = this.A01;
                    EnumC53174NfV enumC53174NfV2 = c51873MwH.A00;
                    if (enumC53174NfV2 == EnumC53174NfV.A07 && c51873MwH.A01 == C05F.A01) {
                        NU1.A01(this.A0A, C05F.A0T, System.currentTimeMillis());
                        return;
                    } else if (enumC53174NfV2 != EnumC53174NfV.A02) {
                        return;
                    } else {
                        enumC53174NfV = EnumC53174NfV.A05;
                    }
                } else {
                    return;
                }
            } else {
                if (interfaceC58299Psr instanceof PFV) {
                    if (this.A0I && A03(this.A01.A00)) {
                        this.A04 = false;
                        A00(this, EnumC53174NfV.A02);
                    }
                    this.A08.APW();
                    return;
                }
                if (interfaceC58299Psr instanceof PFR) {
                    PFR pfr = (PFR) interfaceC58299Psr;
                    Intent intent = pfr.A00;
                    Point point = pfr.A01;
                    if (!this.A0I) {
                        return;
                    }
                    EnumC53174NfV enumC53174NfV3 = EnumC53174NfV.A05;
                    enumC53174NfV = EnumC53174NfV.A02;
                    EnumC53174NfV[] enumC53174NfVArr = {enumC53174NfV3, enumC53174NfV};
                    EnumC53174NfV enumC53174NfV4 = this.A01.A00;
                    if (AbstractC009903n.A0O(enumC53174NfV4, enumC53174NfVArr)) {
                        if (intent != null && !C14360o3.A0K(point, new Point())) {
                            InterfaceC58170Pqa interfaceC58170Pqa = this.A08;
                            interfaceC58170Pqa.DYC();
                            if (Build.VERSION.SDK_INT >= 34) {
                                this.A03 = new C43210J8h(7, this, point, intent);
                                C55188Odt c55188Odt = (C55188Odt) this.A07.A00(C55188Odt.class);
                                if (c55188Odt != null && c55188Odt.A0M && c55188Odt.A05.add(32)) {
                                    OXE.A00.A00("RtcNotificationController", "Added media projection permission to FG Service");
                                    AbstractC53622NnT abstractC53622NnT = c55188Odt.A02;
                                    if (abstractC53622NnT != null) {
                                        C55188Odt.A00(abstractC53622NnT, c55188Odt, false, true);
                                    }
                                }
                                enumC53174NfV = EnumC53174NfV.A04;
                            } else {
                                interfaceC58170Pqa.ARn(intent, point);
                                enumC53174NfV = EnumC53174NfV.A03;
                            }
                        }
                    } else {
                        C0K8.A0P("RtcScreenShareInter", "unexpected state %s: (expected %s)", enumC53174NfV4, AbstractC009903n.A07(", ", "", "", null, enumC53174NfVArr));
                        return;
                    }
                } else if (interfaceC58299Psr instanceof PFS) {
                    if (!this.A0I) {
                        return;
                    }
                    this.A08.FAF(true);
                    return;
                } else {
                    if (interfaceC58299Psr instanceof PFT) {
                        if (!this.A0I) {
                            return;
                        }
                        this.A08.FAF(false);
                        return;
                    }
                    throw B4Z.A00();
                }
            }
            A00(this, enumC53174NfV);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ NU3(Context context, UserSession userSession, InterfaceC58170Pqa interfaceC58170Pqa, NU1 nu1, C54446O4a c54446O4a, OWf oWf, C54457O4l c54457O4l) {
        super(c54446O4a);
        C06090Tz c06090Tz = C06090Tz.A06;
        boolean A06 = C18U.A06(c06090Tz, userSession, 2342157425852811817L);
        boolean A062 = C18U.A06(C06090Tz.A05, userSession, 2342157425853205034L);
        long A01 = C18U.A01(c06090Tz, userSession, 36595891616024852L);
        C57548PgM A012 = C57548PgM.A01(userSession, 27);
        C54612OAn c54612OAn = new C54612OAn(context);
        C56126Ovm c56126Ovm = (C56126Ovm) userSession.A01(C56126Ovm.class, C57419PeH.A00);
        C14360o3.A0B(c56126Ovm, 13);
        this.A06 = context;
        this.A07 = userSession;
        this.A0C = oWf;
        this.A0D = c54457O4l;
        this.A0A = nu1;
        this.A0H = A06;
        this.A0I = A062;
        this.A05 = A01;
        this.A0F = A012;
        this.A09 = c54612OAn;
        this.A0B = c56126Ovm;
        this.A08 = A062 ? interfaceC58170Pqa : new PEQ();
        C51873MwH c51873MwH = new C51873MwH(EnumC53174NfV.A07, C05F.A00, C16910sj.A00);
        this.A0E = c51873MwH;
        this.A0G = AbstractC25225BEi.A1H(c51873MwH);
        this.A01 = c51873MwH;
    }

    public static final void A00(NU3 nu3, EnumC53174NfV enumC53174NfV) {
        C51873MwH c51873MwH = nu3.A01;
        Integer num = C05F.A00;
        java.util.Set set = c51873MwH.A02;
        C14360o3.A0B(set, 1);
        A01(nu3, new C51873MwH(enumC53174NfV, num, set));
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00c6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void A01(X.NU3 r5, X.C51873MwH r6) {
        /*
            X.MwH r0 = r5.A01
            boolean r0 = X.C14360o3.A0K(r0, r6)
            if (r0 != 0) goto Lad
            X.MwH r2 = r5.A01
            X.NfV r1 = r2.A00
            X.NfV r3 = r6.A00
            if (r1 == r3) goto L3a
            X.NfV r0 = X.EnumC53174NfV.A06
            if (r1 == r0) goto Ld3
            if (r3 != r0) goto L1f
            X.OWf r1 = r5.A0C
            X.PAk r0 = X.C56588PAk.A00
        L1a:
            X.PlJ r0 = (X.InterfaceC57853PlJ) r0
            r1.A02(r0)
        L1f:
            boolean r0 = r2.A03
            if (r0 == 0) goto Lc6
            boolean r0 = r6.A03
            if (r0 != 0) goto L3a
            boolean r0 = r5.A04
            if (r0 == 0) goto Lc3
            java.lang.Integer r2 = X.C05F.A00
        L2d:
            X.OWf r1 = r5.A0C
            X.PAu r0 = new X.PAu
            r0.<init>(r2)
            r1.A02(r0)
            r0 = 0
            r5.A04 = r0
        L3a:
            X.MwH r0 = r5.A01
            X.NfV r0 = r0.A00
            boolean r0 = A03(r0)
            if (r0 != 0) goto Lae
            boolean r0 = A03(r3)
            if (r0 == 0) goto L75
            X.OAn r4 = r5.A09
            r0 = 28
            X.PgM r2 = X.C57548PgM.A01(r5, r0)
            X.0QL r0 = r4.A00
            if (r0 != 0) goto L75
            r1 = 3
            X.OpP r0 = new X.OpP
            r0.<init>(r2, r1)
            r4.A01 = r0
            X.0bm[] r0 = new X.InterfaceC08240bm[]{r0}
            X.0QL r3 = new X.0QL
            r3.<init>(r0)
            r4.A00 = r3
            android.content.Context r2 = r4.A02
            java.lang.String r1 = "android.intent.action.SCREEN_ON"
            android.content.IntentFilter r0 = new android.content.IntentFilter
            r0.<init>(r1)
            X.C0DJ.A00(r3, r2, r0)
        L75:
            boolean r0 = r6.A03
            if (r0 != 0) goto L81
            java.util.Set r0 = r6.A02
            boolean r0 = X.AbstractC31171DnF.A1b(r0)
            if (r0 == 0) goto La6
        L81:
            X.O4l r0 = r5.A0D
            X.OW9 r0 = r0.A00
            X.O4T r0 = r0.A0J
            X.OHK r0 = r0.A00
            r0.A00()
            X.OW9 r3 = r0.A00
            X.NU0 r1 = r3.A0R
            X.PF6 r0 = X.PF6.A00
            X.MrL r2 = r1.A01(r0)
            if (r2 == 0) goto L9f
            X.OeK r1 = r3.A0Z
            r0 = 15
            X.C57753Pjg.A01(r1, r2, r0)
        L9f:
            X.NU5 r1 = r3.A0N
            X.PF0 r0 = X.PF0.A00
            r1.A0K(r0)
        La6:
            r5.A01 = r6
            X.05A r0 = r5.A0G
            X.MSY.A1N(r6, r0)
        Lad:
            return
        Lae:
            boolean r0 = A03(r3)
            if (r0 != 0) goto L75
            X.OAn r2 = r5.A09
            X.0QL r1 = r2.A00
            if (r1 == 0) goto Lbf
            android.content.Context r0 = r2.A02
            r0.unregisterReceiver(r1)
        Lbf:
            r0 = 0
            r2.A00 = r0
            goto L75
        Lc3:
            r2 = 0
            goto L2d
        Lc6:
            boolean r0 = r6.A03
            if (r0 == 0) goto L3a
            X.OWf r1 = r5.A0C
            X.PAn r0 = X.C56591PAn.A00
            r1.A02(r0)
            goto L3a
        Ld3:
            if (r3 == r0) goto L1f
            X.OWf r1 = r5.A0C
            X.PAl r0 = X.C56589PAl.A00
            goto L1a
        */
        throw new UnsupportedOperationException("Method not decompiled: X.NU3.A01(X.NU3, X.MwH):void");
    }

    public static final void A02(NU3 nu3, Integer num, String str) {
        int i;
        C56126Ovm c56126Ovm = nu3.A0B;
        C14360o3.A0B(str, 0);
        C51731MtC c51731MtC = (C51731MtC) c56126Ovm.A00.get(str);
        if (c51731MtC != null) {
            int intValue = num.intValue();
            if (intValue != 34) {
                if (intValue != 36) {
                    if (intValue != 37) {
                        C0K8.A0C("RtcScreenShareInter", "Invalid Screen Sharing Message");
                        return;
                    }
                    i = 2131972932;
                } else {
                    i = 2131972931;
                }
            } else {
                i = 2131972936;
            }
            String A0b = AbstractC31177DnL.A0b(nu3.A06, c51731MtC.A06, i);
            NU1 nu1 = nu3.A0A;
            String url = ((ImageUrl) c51731MtC.A03).getUrl();
            long currentTimeMillis = System.currentTimeMillis();
            Integer num2 = C05F.A00;
            C51874MwI c51874MwI = new C51874MwI(num, num2, new String[]{A0b, url}, currentTimeMillis, false);
            C146106i8 A0K = AbstractC31171DnF.A0K();
            A0K.A0D = A0b;
            C14360o3.A07(url);
            if (url.length() > 0) {
                A0K.A09 = AbstractC25225BEi.A0t(url);
                A0K.A0B(EnumC142006bJ.A02);
            }
            A0K.A01 = AbstractC31372Dqc.A00();
            boolean z = true;
            boolean A1X = AbstractC167007dF.A1X(nu1.A00, num2);
            if (!C218914p.A05 || C218914p.A08()) {
                z = false;
            }
            if (A1X) {
                nu1.A02(c51874MwI);
            } else if (z) {
                AbstractC31178DnM.A1S(A0K);
            } else {
                Toast.makeText(nu1.A03, A0b, 1).show();
            }
        }
    }

    public static final boolean A03(EnumC53174NfV enumC53174NfV) {
        int ordinal = enumC53174NfV.ordinal();
        if (ordinal != 1 && ordinal != 0) {
            return true;
        }
        return false;
    }
}
