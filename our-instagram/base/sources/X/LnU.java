package X;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.view.Window;
import com.facebook.catalyst.modules.netinfo.NetInfoModule;
import com.instagram.common.session.UserSession;
import com.instagram.direct.messagethread.interaction.longpressaction.LongPressActionData;
import com.instagram.direct.messagethread.messageactions.model.MessageActionsViewModel;
import com.meta.foa.performancelogging.lss.LocalSendSpeedMessageTypes;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: classes8.dex */
public final class LnU implements MRL {
    public final /* synthetic */ int A00;
    public final /* synthetic */ Activity A01;
    public final /* synthetic */ View A02;
    public final /* synthetic */ UserSession A03;
    public final /* synthetic */ C47556KzR A04;
    public final /* synthetic */ L4A A05;
    public final /* synthetic */ L4A A06;
    public final /* synthetic */ L4A A07;
    public final /* synthetic */ L4A A08;
    public final /* synthetic */ L4A A09;
    public final /* synthetic */ L4A A0A;
    public final /* synthetic */ L4A A0B;
    public final /* synthetic */ InterfaceC129525tH A0C;
    public final /* synthetic */ InterfaceC165257aE A0D;
    public final /* synthetic */ InterfaceC165557ai A0E;
    public final /* synthetic */ InterfaceC165577ak A0F;
    public final /* synthetic */ InterfaceC164937Zi A0G;
    public final /* synthetic */ InterfaceC164877Za A0H;
    public final /* synthetic */ C7W6 A0I;
    public final /* synthetic */ InterfaceC165097Zy A0J;
    public final /* synthetic */ InterfaceC164907Zd A0K;
    public final /* synthetic */ C7Ze A0L;
    public final /* synthetic */ InterfaceC165017Zq A0M;
    public final /* synthetic */ InterfaceC165427aV A0N;
    public final /* synthetic */ InterfaceC165767b3 A0O;
    public final /* synthetic */ InterfaceC164347Wx A0P;
    public final /* synthetic */ C7W7 A0Q;
    public final /* synthetic */ InterfaceC165477aa A0R;
    public final /* synthetic */ InterfaceC165127a1 A0S;
    public final /* synthetic */ InterfaceC165777b4 A0T;
    public final /* synthetic */ InterfaceC50433MOn A0U;
    public final /* synthetic */ InterfaceC165787b5 A0V;
    public final /* synthetic */ InterfaceC165797b6 A0W;
    public final /* synthetic */ InterfaceC165807b7 A0X;
    public final /* synthetic */ C7b9 A0Y;
    public final /* synthetic */ InterfaceC165177a6 A0Z;
    public final /* synthetic */ C7XS A0a;
    public final /* synthetic */ InterfaceC165137a2 A0b;
    public final /* synthetic */ InterfaceC165087Zx A0c;
    public final /* synthetic */ InterfaceC165207a9 A0d;
    public final /* synthetic */ InterfaceC163877Vb A0e;
    public final /* synthetic */ InterfaceC165217aA A0f;
    public final /* synthetic */ InterfaceC165227aB A0g;
    public final /* synthetic */ InterfaceC164997Zo A0h;
    public final /* synthetic */ C44995Jvl A0i;
    public final /* synthetic */ C47651L2k A0j;
    public final /* synthetic */ C47568Kze A0k;
    public final /* synthetic */ L3U A0l;
    public final /* synthetic */ C159497Dk A0m;
    public final /* synthetic */ C159497Dk A0n;
    public final /* synthetic */ L3V A0o;
    public final /* synthetic */ MessageActionsViewModel A0p;
    public final /* synthetic */ C83403nh A0q;
    public final /* synthetic */ C3o9 A0r;
    public final /* synthetic */ InterfaceC1119153d A0s;
    public final /* synthetic */ List A0t;
    public final /* synthetic */ InterfaceC16820sZ A0u;
    public final /* synthetic */ boolean A0v;
    public final /* synthetic */ boolean A0w;
    public final /* synthetic */ boolean A0x;

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.MRL
    public final void CJF(Integer num, String str, boolean z) {
        GXV gxv;
        C14360o3.A0B(num, 0);
        LKl lKl = LKl.A00;
        InterfaceC129525tH interfaceC129525tH = this.A0C;
        Activity activity = this.A01;
        UserSession userSession = this.A03;
        C3o9 c3o9 = this.A0r;
        int i = this.A00;
        List list = this.A0t;
        C83403nh c83403nh = this.A0q;
        boolean z2 = this.A0w;
        MessageActionsViewModel messageActionsViewModel = this.A0p;
        View view = this.A02;
        InterfaceC164997Zo interfaceC164997Zo = this.A0h;
        InterfaceC165807b7 interfaceC165807b7 = this.A0X;
        InterfaceC165777b4 interfaceC165777b4 = this.A0T;
        InterfaceC165557ai interfaceC165557ai = this.A0E;
        InterfaceC165797b6 interfaceC165797b6 = this.A0W;
        L4A l4a = this.A08;
        L4A l4a2 = this.A0A;
        L4A l4a3 = this.A07;
        InterfaceC165227aB interfaceC165227aB = this.A0g;
        InterfaceC165017Zq interfaceC165017Zq = this.A0M;
        C7b9 c7b9 = this.A0Y;
        InterfaceC165137a2 interfaceC165137a2 = this.A0b;
        InterfaceC165477aa interfaceC165477aa = this.A0R;
        InterfaceC165127a1 interfaceC165127a1 = this.A0S;
        InterfaceC165177a6 interfaceC165177a6 = this.A0Z;
        C159497Dk c159497Dk = this.A0m;
        C159497Dk c159497Dk2 = this.A0n;
        InterfaceC165207a9 interfaceC165207a9 = this.A0d;
        InterfaceC165257aE interfaceC165257aE = this.A0D;
        InterfaceC165097Zy interfaceC165097Zy = this.A0J;
        C47651L2k c47651L2k = this.A0j;
        InterfaceC163877Vb interfaceC163877Vb = this.A0e;
        C7XS c7xs = this.A0a;
        InterfaceC165087Zx interfaceC165087Zx = this.A0c;
        InterfaceC164907Zd interfaceC164907Zd = this.A0K;
        L4A l4a4 = this.A06;
        InterfaceC164937Zi interfaceC164937Zi = this.A0G;
        InterfaceC165217aA interfaceC165217aA = this.A0f;
        L3U l3u = this.A0l;
        InterfaceC165577ak interfaceC165577ak = this.A0F;
        InterfaceC50433MOn interfaceC50433MOn = this.A0U;
        C47568Kze c47568Kze = this.A0k;
        InterfaceC165427aV interfaceC165427aV = this.A0N;
        L4A l4a5 = this.A09;
        C44995Jvl c44995Jvl = this.A0i;
        C7Ze c7Ze = this.A0L;
        C47556KzR c47556KzR = this.A04;
        L3V l3v = this.A0o;
        InterfaceC16820sZ interfaceC16820sZ = this.A0u;
        L4A l4a6 = this.A0B;
        L4A l4a7 = this.A05;
        InterfaceC165767b3 interfaceC165767b3 = this.A0O;
        if (num == C05F.A0V) {
            C50674MYs c50674MYs = new C50674MYs(activity, userSession);
            C47794L9b c47794L9b = new C47794L9b(userSession);
            c50674MYs.A05 = true;
            c50674MYs.A07(messageActionsViewModel.A0K);
            for (LongPressActionData longPressActionData : messageActionsViewModel.A0O) {
                LPW lpw = new LPW(activity, view, userSession, c47794L9b, c47556KzR, l4a, l4a2, l4a4, l4a5, l4a6, l4a7, interfaceC129525tH, interfaceC165257aE, interfaceC165557ai, interfaceC165577ak, interfaceC164937Zi, interfaceC165097Zy, interfaceC164907Zd, c7Ze, interfaceC165017Zq, interfaceC165427aV, interfaceC165767b3, interfaceC165477aa, interfaceC165127a1, interfaceC165777b4, interfaceC165797b6, interfaceC165807b7, c7b9, interfaceC165177a6, interfaceC165137a2, interfaceC165087Zx, interfaceC165207a9, interfaceC165217aA, interfaceC165227aB, interfaceC164997Zo, c44995Jvl, longPressActionData, c47651L2k, c47568Kze, l3u, c159497Dk, c159497Dk2, l3v, messageActionsViewModel, c83403nh, c3o9, str, list, interfaceC16820sZ, i, z2);
                boolean A1X = AbstractC167007dF.A1X(longPressActionData.A01, EnumC46221Kcx.A07);
                String str2 = longPressActionData.A04;
                if (A1X) {
                    c50674MYs.A09(str2, lpw);
                } else {
                    c50674MYs.A0B(str2, lpw);
                }
            }
            c50674MYs.A03 = new C49478Ltr(c7xs, 1);
            C3DN c3dn = null;
            if ((activity instanceof GXV) && (gxv = (GXV) activity) != null) {
                c3dn = gxv.Ahc();
            }
            C31727DwY c31727DwY = new C31727DwY(c50674MYs);
            C189478aR c189478aR = c31727DwY.A02;
            Context context = c31727DwY.A03.A00;
            C32245EIe c32245EIe = c31727DwY.A04;
            C14360o3.A0B(c32245EIe, 2);
            C189478aR.A00(activity, context, c32245EIe, c189478aR, c3dn);
            C31727DwY.A03(c31727DwY);
            interfaceC163877Vb.CMc();
            c7xs.D0E();
            return;
        }
        lKl.A04(activity, view, userSession, c47556KzR, l4a, l4a2, l4a3, l4a4, l4a5, l4a6, l4a7, interfaceC129525tH, interfaceC165257aE, interfaceC165557ai, interfaceC165577ak, interfaceC164937Zi, interfaceC165097Zy, interfaceC164907Zd, c7Ze, interfaceC165017Zq, interfaceC165427aV, interfaceC165767b3, interfaceC165477aa, interfaceC165127a1, interfaceC165777b4, interfaceC50433MOn, interfaceC165797b6, interfaceC165807b7, c7b9, interfaceC165177a6, interfaceC165137a2, interfaceC165087Zx, interfaceC165207a9, interfaceC165217aA, interfaceC165227aB, interfaceC164997Zo, c44995Jvl, c47651L2k, c47568Kze, l3u, c159497Dk, c159497Dk2, l3v, c83403nh, messageActionsViewModel.A07, messageActionsViewModel.A08, c3o9, num, messageActionsViewModel.A0F, str, messageActionsViewModel.A0H, list, interfaceC16820sZ, i, messageActionsViewModel.A03, z2);
    }

    @Override // X.MRL
    public final void CJp(InterfaceC83713oG interfaceC83713oG, C3o9 c3o9, String str, String str2, String str3, Map map, Map map2, boolean z) {
        EnumC92794Ds enumC92794Ds;
        C14360o3.A0B(str, 0);
        MessageActionsViewModel messageActionsViewModel = this.A0p;
        List list = messageActionsViewModel.A0N;
        if (list != null) {
            Iterator it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Object next = it.next();
                if (C14360o3.A0K(next, str)) {
                    if (next != null && C14360o3.A0K(str2, NetInfoModule.CONNECTION_TYPE_NONE)) {
                        this.A0H.Dd3(messageActionsViewModel.A07, messageActionsViewModel.A08, str, str3, messageActionsViewModel.A03);
                        return;
                    }
                }
            }
        }
        Boolean bool = messageActionsViewModel.A09;
        if (AbstractC166997dE.A1Z(bool, true)) {
            enumC92794Ds = EnumC92794Ds.A04;
        } else if (AbstractC166997dE.A1Z(bool, false) || c3o9 == null || (enumC92794Ds = JRE.A00(c3o9)) == null) {
            enumC92794Ds = EnumC92794Ds.A05;
        }
        String A0w = AbstractC43593JPy.A0w();
        UserSession userSession = this.A03;
        String str4 = null;
        C7X2.A00(userSession).A00(enumC92794Ds, interfaceC83713oG, Boolean.valueOf(z), null, C05F.A0Y, Integer.valueOf(messageActionsViewModel.A02), A0w, map, map2);
        String str5 = null;
        C46103Kb3 A01 = C7R5.A01(userSession, A0w.hashCode());
        if (A01 != null) {
            A01.onStartFlow(z);
            A01.onLogDataProcessingStart();
            A01.onLogTransportMessageStart();
            A01.annotateLocalDataId(A0w);
            A01.annotateMessageType(LocalSendSpeedMessageTypes.REACTION);
            int i = messageActionsViewModel.A02;
            A01.annotateThreadType(i, C4GR.A00(i));
            if (interfaceC83713oG != null) {
                str4 = AbstractC92784Dr.A02(interfaceC83713oG);
            }
            A01.annotateOpenThreadId(str4);
            C2EY c2ey = messageActionsViewModel.A07;
            if (c2ey != null) {
                str5 = c2ey.A00;
            }
            A01.annotateReactToType(str5);
            A01.annotateTransportType(enumC92794Ds.A00);
        }
        this.A0H.DTC(messageActionsViewModel.A07, messageActionsViewModel.A08, str, str2, str3, A0w, messageActionsViewModel.A03, false, true);
    }

    @Override // X.MRL
    public final void D0E() {
        this.A0a.Czt();
    }

    @Override // X.MRL
    public final void DAl() {
        if (this.A0v) {
            this.A0V.EL0();
        }
        InterfaceC1119153d interfaceC1119153d = this.A0s;
        if (interfaceC1119153d != null) {
            interfaceC1119153d.D00();
        }
    }

    @Override // X.MRL
    public final void DB6() {
        Window window = this.A01.getWindow();
        if (window != null) {
            window.setSoftInputMode(48);
        }
        this.A0I.ARo(true);
        this.A0P.EKo();
        this.A0a.D01();
        InterfaceC1119153d interfaceC1119153d = this.A0s;
        if (interfaceC1119153d != null) {
            interfaceC1119153d.Czx();
        }
        InterfaceC165087Zx interfaceC165087Zx = this.A0c;
        if (interfaceC165087Zx != null) {
            interfaceC165087Zx.Czy(this.A02);
        }
        InterfaceC164937Zi interfaceC164937Zi = this.A0G;
        if (interfaceC164937Zi != null) {
            interfaceC164937Zi.DSy();
        }
    }

    @Override // X.MRL
    public final void DBP() {
        this.A0H.DBP();
    }

    @Override // X.MRL
    public final void DDn() {
        this.A0Q.E3l(true);
        if (this.A0x) {
            this.A0e.CMc();
        }
    }

    @Override // X.MRL
    public final void DEq() {
        this.A0Q.E3l(false);
        if (this.A0x) {
            this.A0e.El2();
        }
    }

    @Override // X.MRL
    public final void DXN() {
        this.A0a.D0E();
    }

    public LnU(Activity activity, View view, UserSession userSession, C47556KzR c47556KzR, L4A l4a, L4A l4a2, L4A l4a3, L4A l4a4, L4A l4a5, L4A l4a6, L4A l4a7, InterfaceC129525tH interfaceC129525tH, InterfaceC165257aE interfaceC165257aE, InterfaceC165557ai interfaceC165557ai, InterfaceC165577ak interfaceC165577ak, InterfaceC164937Zi interfaceC164937Zi, InterfaceC164877Za interfaceC164877Za, C7W6 c7w6, InterfaceC165097Zy interfaceC165097Zy, InterfaceC164907Zd interfaceC164907Zd, C7Ze c7Ze, InterfaceC165017Zq interfaceC165017Zq, InterfaceC165427aV interfaceC165427aV, InterfaceC165767b3 interfaceC165767b3, InterfaceC164347Wx interfaceC164347Wx, C7W7 c7w7, InterfaceC165477aa interfaceC165477aa, InterfaceC165127a1 interfaceC165127a1, InterfaceC165777b4 interfaceC165777b4, InterfaceC50433MOn interfaceC50433MOn, InterfaceC165787b5 interfaceC165787b5, InterfaceC165797b6 interfaceC165797b6, InterfaceC165807b7 interfaceC165807b7, C7b9 c7b9, InterfaceC165177a6 interfaceC165177a6, C7XS c7xs, InterfaceC165137a2 interfaceC165137a2, InterfaceC165087Zx interfaceC165087Zx, InterfaceC165207a9 interfaceC165207a9, InterfaceC163877Vb interfaceC163877Vb, InterfaceC165217aA interfaceC165217aA, InterfaceC165227aB interfaceC165227aB, InterfaceC164997Zo interfaceC164997Zo, C44995Jvl c44995Jvl, C47651L2k c47651L2k, C47568Kze c47568Kze, L3U l3u, C159497Dk c159497Dk, C159497Dk c159497Dk2, L3V l3v, MessageActionsViewModel messageActionsViewModel, C83403nh c83403nh, C3o9 c3o9, InterfaceC1119153d interfaceC1119153d, List list, InterfaceC16820sZ interfaceC16820sZ, int i, boolean z, boolean z2, boolean z3) {
        this.A0C = interfaceC129525tH;
        this.A01 = activity;
        this.A03 = userSession;
        this.A0r = c3o9;
        this.A00 = i;
        this.A0t = list;
        this.A0q = c83403nh;
        this.A0w = z;
        this.A0p = messageActionsViewModel;
        this.A02 = view;
        this.A0h = interfaceC164997Zo;
        this.A0X = interfaceC165807b7;
        this.A0T = interfaceC165777b4;
        this.A0E = interfaceC165557ai;
        this.A0W = interfaceC165797b6;
        this.A08 = l4a;
        this.A0A = l4a2;
        this.A07 = l4a3;
        this.A0g = interfaceC165227aB;
        this.A0M = interfaceC165017Zq;
        this.A0Y = c7b9;
        this.A0b = interfaceC165137a2;
        this.A0R = interfaceC165477aa;
        this.A0S = interfaceC165127a1;
        this.A0Z = interfaceC165177a6;
        this.A0m = c159497Dk;
        this.A0n = c159497Dk2;
        this.A0d = interfaceC165207a9;
        this.A0D = interfaceC165257aE;
        this.A0J = interfaceC165097Zy;
        this.A0j = c47651L2k;
        this.A0e = interfaceC163877Vb;
        this.A0a = c7xs;
        this.A0c = interfaceC165087Zx;
        this.A0K = interfaceC164907Zd;
        this.A06 = l4a4;
        this.A0G = interfaceC164937Zi;
        this.A0f = interfaceC165217aA;
        this.A0l = l3u;
        this.A0F = interfaceC165577ak;
        this.A0U = interfaceC50433MOn;
        this.A0k = c47568Kze;
        this.A0N = interfaceC165427aV;
        this.A09 = l4a5;
        this.A0i = c44995Jvl;
        this.A0L = c7Ze;
        this.A04 = c47556KzR;
        this.A0o = l3v;
        this.A0u = interfaceC16820sZ;
        this.A0B = l4a6;
        this.A05 = l4a7;
        this.A0O = interfaceC165767b3;
        this.A0H = interfaceC164877Za;
        this.A0I = c7w6;
        this.A0P = interfaceC164347Wx;
        this.A0s = interfaceC1119153d;
        this.A0Q = c7w7;
        this.A0x = z2;
        this.A0v = z3;
        this.A0V = interfaceC165787b5;
    }
}
