package X;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcelable;
import android.os.SystemClock;
import android.util.Base64;
import com.facebook.rsys.transport.gen.SignalingMessageIncomingStats;
import com.instagram.common.session.UserSession;
import com.instagram.foa.session.IgMetaSessionImpl;
import com.instagram.model.rtc.RtcCallKey;
import com.instagram.model.rtc.RtcCallSource;
import com.instagram.model.rtc.RtcCreateCallArgs;
import com.instagram.model.rtc.RtcEnterCallArgs;
import com.instagram.model.rtc.RtcJoinCallArgs;
import com.instagram.rtc.signaling.models.RtcConnectionEntity;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* renamed from: X.3ES, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C3ES implements C1WF, InterfaceC13050lr {
    public int A00;
    public InterfaceC16820sZ A01;
    public boolean A02;
    public boolean A03;
    public final Context A04;
    public final C12N A05;
    public final UserSession A06;
    public final C1W6 A07;
    public final C27701Vy A08;
    public final C1WB A09;
    public final HashMap A0A;
    public final InterfaceC09390do A0B;
    public final InterfaceC09390do A0C;
    public final C05A A0D;
    public final HashMap A0E;

    public C3ES(Context context, UserSession userSession, C1W6 c1w6, C27701Vy c27701Vy, C1WB c1wb) {
        C14360o3.A0B(context, 1);
        C14360o3.A0B(userSession, 2);
        C14360o3.A0B(c1w6, 3);
        C14360o3.A0B(c27701Vy, 4);
        C14360o3.A0B(c1wb, 5);
        this.A04 = context;
        this.A06 = userSession;
        this.A07 = c1w6;
        this.A08 = c27701Vy;
        this.A09 = c1wb;
        InterfaceC09390do A00 = AbstractC09440dt.A00(EnumC09460dv.A02, new C9EU(this, 35));
        this.A0B = A00;
        if (((Boolean) A00.getValue()).booleanValue()) {
            Context applicationContext = context.getApplicationContext();
            C14360o3.A07(applicationContext);
            userSession.A04(C55188Odt.class, new C55188Odt(applicationContext, new C55093Ob4(context, userSession), new IgMetaSessionImpl(userSession)));
        }
        c1w6.A01.add(this);
        c1w6.A02.add(this);
        this.A0C = AbstractC09440dt.A01(new C9EU(this, 36));
        this.A0A = new HashMap();
        this.A0E = new HashMap();
        this.A0D = new C008002u(new C3ET(null, null, false, true, false, true, true));
        this.A05 = C12L.A00;
    }

    public final void A06(RtcEnterCallArgs rtcEnterCallArgs, InterfaceC16820sZ interfaceC16820sZ) {
        RtcCallKey rtcCallKey;
        C14360o3.A0B(rtcEnterCallArgs, 0);
        this.A01 = interfaceC16820sZ;
        String str = null;
        if (rtcEnterCallArgs instanceof RtcJoinCallArgs) {
            rtcCallKey = ((RtcJoinCallArgs) rtcEnterCallArgs).A02;
            if (rtcCallKey != null) {
                str = AnonymousClass001.A0T(this.A06.userId, rtcCallKey.A00, '_');
            }
        } else {
            rtcCallKey = null;
        }
        C1W6 c1w6 = this.A07;
        UserSession userSession = this.A06;
        if (str == null) {
            str = MSV.A00(1467);
        }
        c1w6.A03.containsKey(str);
        A03(rtcCallKey, rtcEnterCallArgs.Bye(), this);
        if (rtcEnterCallArgs instanceof RtcCreateCallArgs) {
            RtcCreateCallArgs rtcCreateCallArgs = (RtcCreateCallArgs) rtcEnterCallArgs;
            if (!rtcCreateCallArgs.A0B && C18U.A06(C06090Tz.A05, userSession, 36314828956044106L)) {
                C56139Ovz A00 = MWJ.A00(this.A04, userSession);
                A00.A06(rtcCreateCallArgs);
                A00.A06.A02(PBH.A00);
                A04(this);
            }
        }
        Context context = this.A04;
        C12260kU.A0C(context, AbstractC54147Nwj.A00(context, userSession, rtcEnterCallArgs));
        A04(this);
    }

    public final void A07(RtcConnectionEntity.RtcCallConnectionEntity rtcCallConnectionEntity, String str, InterfaceC16820sZ interfaceC16820sZ) {
        C54819OKw c54819OKw;
        InterfaceC16660sJ c57753Pjg;
        C14360o3.A0B(rtcCallConnectionEntity, 0);
        A04(this);
        C56139Ovz A00 = MWJ.A00(this.A04, this.A06);
        RtcCallKey rtcCallKey = rtcCallConnectionEntity.A03;
        if (A00.A0A(rtcCallKey)) {
            C19K A002 = A00();
            C9DG c9dg = new C9DG(interfaceC16820sZ, A00, A002, null, 9);
            AbstractC23641Du.A03(C05F.A00, AnonymousClass191.A00, c9dg, A002);
            A00.A05(rtcCallKey, str);
            c54819OKw = (C54819OKw) this.A0C.getValue();
            c57753Pjg = BA2.A00;
        } else {
            c54819OKw = (C54819OKw) this.A0C.getValue();
            c57753Pjg = new C57753Pjg(interfaceC16820sZ, 32);
        }
        c54819OKw.A00(rtcCallConnectionEntity, str, c57753Pjg);
    }

    public final void A09(String str) {
        C14360o3.A0B(str, 0);
        this.A07.A05(str, true, false);
    }

    public final void A0B(byte[] bArr, int i, int i2, boolean z) {
        Context context;
        UserSession userSession = this.A06;
        if (C18U.A06(C06090Tz.A05, userSession, 36317470361261248L)) {
            A04(this);
            context = this.A04;
            C55144Od3 c55144Od3 = new C55144Od3(new OX7(context).A03(bArr), null);
            Integer A03 = c55144Od3.A03();
            if (A03 != null && A03.intValue() == 4) {
                InterfaceC09390do interfaceC09390do = c55144Od3.A02;
                String str = (String) interfaceC09390do.getValue();
                if (str != null && str.length() != 0) {
                    A02(userSession, this, c55144Od3.A05(), (String) interfaceC09390do.getValue(), c55144Od3.A04(), Base64.encodeToString(bArr, 0));
                    return;
                }
            } else {
                C56139Ovz A01 = MWJ.A01(userSession);
                if (A01 != null) {
                    Integer A032 = c55144Od3.A03();
                    if (A032 != null && A032.intValue() == 5) {
                        A08(c55144Od3);
                    }
                    OW9 ow9 = A01.A09;
                    C55207OeK.A04(ow9.A0Z, new C30171DRb(i, 10, bArr, new SignalingMessageIncomingStats(i2)), z, false);
                    Integer num = ((C51881MwP) ow9.A0K.A00.A00).A01;
                    if (num != C05F.A0N && num != C05F.A0Y) {
                        return;
                    }
                }
                A05(this, c55144Od3);
                return;
            }
        } else {
            context = this.A04;
        }
        C55207OeK.A04(MWJ.A00(context, userSession).A09.A0Z, new C30171DRb(i, 10, bArr, new SignalingMessageIncomingStats(i2)), z, false);
    }

    @Override // X.C1WF
    public final void Cwp(Bundle bundle, UserSession userSession, String str) {
        C14360o3.A0B(bundle, 2);
        String A00 = MSV.A00(850);
        Parcelable parcelable = bundle.getParcelable("com.instagram.rtc.stack.impl.enter_args");
        if (parcelable != null) {
            if (parcelable instanceof RtcCreateCallArgs) {
                RtcCreateCallArgs rtcCreateCallArgs = (RtcCreateCallArgs) parcelable;
                if (rtcCreateCallArgs.A09) {
                    MWJ.A00(this.A04, userSession).A06(rtcCreateCallArgs);
                    return;
                }
            } else if (!(parcelable instanceof RtcJoinCallArgs)) {
                C0K8.A0C(A00, "Unable to handle provided args");
                return;
            }
            A06((RtcEnterCallArgs) parcelable, B83.A00);
        }
    }

    @Override // X.C1WF
    public final void DAZ(Bundle bundle, UserSession userSession, String str) {
        C14360o3.A0B(bundle, 2);
        A0A(B84.A00);
    }

    @Override // X.C1WF
    public final void DeU(Bundle bundle, UserSession userSession, String str) {
        StringBuilder sb;
        C14360o3.A0B(bundle, 2);
        Parcelable parcelable = bundle.getParcelable("com.instagram.rtc.stack.impl.enter_args");
        if (parcelable != null && (parcelable instanceof RtcJoinCallArgs)) {
            RtcCallKey rtcCallKey = ((RtcJoinCallArgs) parcelable).A02;
            String str2 = userSession.userId;
            String str3 = rtcCallKey.A00;
            RtcConnectionEntity A00 = C55051Oa2.A00(AnonymousClass001.A0T(str2, str3, '_'));
            if (A00 instanceof RtcConnectionEntity.RtcCallConnectionEntity) {
                A07((RtcConnectionEntity.RtcCallConnectionEntity) A00, "ConnectionService: onReject", new C37016GSx(userSession, 13));
                return;
            }
            OLI oli = new OLI(C18950wb.A01);
            if (A00 != null) {
                sb = new StringBuilder();
                sb.append("Unexpected connectionEntity type: ");
                sb.append(A00.getTag());
            } else {
                sb = new StringBuilder();
                sb.append("Can't find connectionEntity given ");
                sb.append(str3);
            }
            sb.append(" when reject call from call stack");
            oli.A01(sb.toString());
        }
    }

    @Override // X.C1WF
    public final void Dm0(Bundle bundle, UserSession userSession, String str) {
        C14360o3.A0B(bundle, 2);
        Cwp(bundle, userSession, str);
    }

    @Override // X.InterfaceC13050lr
    public final void onUserSessionWillEnd(boolean z) {
    }

    private final C19K A00() {
        return AnonymousClass194.A02(AnonymousClass190.A02(((C12M) this.A05).A04, new AnonymousClass197(null)));
    }

    private final void A01() {
        Iterator it = this.A0E.entrySet().iterator();
        while (it.hasNext()) {
            if (SystemClock.elapsedRealtime() - ((Number) ((Map.Entry) it.next()).getValue()).longValue() > 300000) {
                it.remove();
            }
        }
    }

    public static final void A03(RtcCallKey rtcCallKey, RtcCallSource rtcCallSource, C3ES c3es) {
        String str;
        if (rtcCallKey != null && (str = rtcCallKey.A00) != null) {
            if (!C18U.A06(C06090Tz.A05, c3es.A06, 36311624910373509L)) {
                c3es.A0A.put(str, rtcCallSource.A02.A02);
            }
        }
    }

    public static final void A04(C3ES c3es) {
        if (!c3es.A03) {
            C56139Ovz A00 = MWJ.A00(c3es.A04, c3es.A06);
            if (!c3es.A03) {
                C218914p c218914p = C218914p.A08;
                C218914p.A03(EnumC220415e.A03, new C56054OuV(c3es));
                C19K A002 = c3es.A00();
                C9D4 c9d4 = new C9D4(A00, c3es, (InterfaceC23621Ds) null, 33);
                AbstractC23641Du.A03(C05F.A00, AnonymousClass191.A00, c9d4, A002);
            }
            InterfaceC19390xP A003 = C0ST.A00(C57763Pjq.A00, A00.A09.A0i);
            C19K A004 = c3es.A00();
            C9D4 c9d42 = new C9D4(A003, c3es, (InterfaceC23621Ds) null, 31);
            AnonymousClass191 anonymousClass191 = AnonymousClass191.A00;
            Integer num = C05F.A00;
            AbstractC23641Du.A03(num, anonymousClass191, c9d42, A004);
            AbstractC23641Du.A03(num, anonymousClass191, new C9D4(A00, c3es, (InterfaceC23621Ds) null, 32), c3es.A00());
            c3es.A03 = true;
        }
    }

    public final void A08(C55144Od3 c55144Od3) {
        String str;
        C56139Ovz A01 = MWJ.A01(this.A06);
        if (A01 != null) {
            RtcCallKey rtcCallKey = new RtcCallKey(c55144Od3.A04());
            OW9 ow9 = A01.A09;
            C55135Oc3 c55135Oc3 = ow9.A0K;
            C51881MwP c51881MwP = (C51881MwP) c55135Oc3.A00.A00;
            if (C14360o3.A0K(c51881MwP.A00, rtcCallKey) && c51881MwP.A01 == C05F.A01) {
                c55135Oc3.A03();
                return;
            }
            if (c51881MwP.A01 != C05F.A0C) {
                return;
            }
            String str2 = rtcCallKey.A00;
            C52710NTv c52710NTv = ow9.A0T;
            if (!C14360o3.A0K(str2, c52710NTv.A01.A01) || (str = c52710NTv.A01.A01) == null) {
                return;
            }
            HashMap hashMap = c52710NTv.A08;
            String str3 = (String) hashMap.get(str);
            if (str3 == null) {
                return;
            }
            c52710NTv.A00.E4s(new NYE(str3));
            hashMap.remove(str);
        }
    }

    public final void A0A(InterfaceC16820sZ interfaceC16820sZ) {
        Integer num;
        C51881MwP c51881MwP;
        UserSession userSession = this.A06;
        C56139Ovz A01 = MWJ.A01(userSession);
        C56139Ovz A012 = MWJ.A01(userSession);
        if (A012 != null && (c51881MwP = (C51881MwP) A012.A09.A0K.A00.A00) != null) {
            num = c51881MwP.A01;
        } else {
            num = null;
        }
        int i = 0;
        if (num == C05F.A01) {
            i = 1;
        }
        int i2 = i ^ 1;
        A04(this);
        if (A01 != null) {
            C19K A00 = A00();
            AbstractC23641Du.A05(AnonymousClass191.A00, new C57165PZj(A01, A00, interfaceC16820sZ, null, 47), A00);
            A01.A01(i2, true);
            return;
        }
        interfaceC16820sZ.invoke();
    }

    public static final void A02(UserSession userSession, C3ES c3es, String str, String str2, String str3, String str4) {
        c3es.A01();
        HashMap hashMap = c3es.A0E;
        if (!hashMap.containsKey(str)) {
            hashMap.put(String.valueOf(str), Long.valueOf(SystemClock.elapsedRealtime()));
            if (str2 != null && str2.length() != 0 && str4 != null) {
                C4M5.A00().A00(c3es.A04, userSession, str2, str3, str4);
            }
        }
    }

    public static final void A05(C3ES c3es, C55144Od3 c55144Od3) {
        c3es.A01();
        HashMap hashMap = c3es.A0E;
        if (hashMap.containsKey(c55144Od3.A05())) {
            c55144Od3.A04();
            return;
        }
        Integer A03 = c55144Od3.A03();
        if (A03 == null || A03.intValue() != 5 || C37021nz.A01 == null) {
            return;
        }
        Number number = (Number) c55144Od3.A07.getValue();
        Object value = c55144Od3.A06.getValue();
        if (number == null || value == null) {
            return;
        }
        C4M5.A00();
        UserSession userSession = c3es.A06;
        Integer A00 = A17.A00(number.intValue());
        String A04 = c55144Od3.A04();
        C14360o3.A0B(A00, 1);
        AbstractC25651Mw.A00(userSession).E4s(new NYM(A04));
        hashMap.put(String.valueOf(c55144Od3.A05()), Long.valueOf(SystemClock.elapsedRealtime()));
    }
}
