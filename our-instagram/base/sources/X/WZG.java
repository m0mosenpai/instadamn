package X;

import android.content.Context;
import com.facebook.common.time.AwakeTimeSinceBootClock;
import com.facebook.quicklog.reliability.UserFlowLogger;
import com.facebook.videolite.transcoder.base.composition.MediaComposition;
import com.facebook.videolite.transcoder.base.composition.MediaEffect;
import java.io.File;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/* loaded from: classes11.dex */
public final class WZG implements InterfaceC58201Pr7, InterfaceC71893X9a {
    public WZF A00;
    public InterfaceC71893X9a A01;
    public InterfaceC71894X9b A02;
    public C54386O1s A03;
    public String A04;
    public Map A05;
    public long A06;
    public long A07;
    public C69464Vnn A08;
    public final Map A09;
    public final long A0A;
    public final long A0B;
    public final Context A0C;
    public final C0JO A0D;
    public final XC1 A0E;
    public final XC9 A0F;
    public final C58647PzK A0G;
    public final X9S A0H;
    public final C69063VhE A0I;
    public final X9T A0J;
    public final InterfaceC58019Po5 A0K;
    public final X9V A0L;
    public final InterfaceC58105PpU A0M;
    public final InterfaceC71972XDf A0N;
    public final ACM A0O;
    public final InterfaceC71895X9c A0P;
    public final File A0Q;
    public final String A0R;

    public WZG(Context context, XC1 xc1, XC9 xc9, C58647PzK c58647PzK, X9S x9s, X9T x9t, InterfaceC58019Po5 interfaceC58019Po5, X9V x9v, InterfaceC58105PpU interfaceC58105PpU, InterfaceC71972XDf interfaceC71972XDf, ACM acm, C69464Vnn c69464Vnn, InterfaceC71895X9c interfaceC71895X9c, File file, String str, String str2, Map map, long j, long j2) {
        C14360o3.A0B(c58647PzK, 9);
        C14360o3.A0B(xc9, 16);
        this.A0C = context;
        this.A0R = str;
        this.A0O = acm;
        this.A0K = interfaceC58019Po5;
        this.A0L = x9v;
        this.A0M = interfaceC58105PpU;
        this.A0P = interfaceC71895X9c;
        this.A08 = c69464Vnn;
        this.A0G = c58647PzK;
        this.A0Q = file;
        this.A0N = interfaceC71972XDf;
        this.A0J = x9t;
        this.A0E = xc1;
        this.A05 = map;
        this.A0F = xc9;
        this.A0H = x9s;
        this.A04 = str2;
        this.A0A = j;
        this.A0B = j2;
        AwakeTimeSinceBootClock awakeTimeSinceBootClock = AwakeTimeSinceBootClock.INSTANCE;
        C14360o3.A07(awakeTimeSinceBootClock);
        this.A0D = awakeTimeSinceBootClock;
        C69063VhE c69063VhE = new C69063VhE(this.A08.A06, str, this.A05);
        this.A0I = c69063VhE;
        Long l = c69063VhE.A00;
        if (l != null) {
            long longValue = l.longValue();
            C68920VeK c68920VeK = c69063VhE.A01;
            if (c68920VeK != null) {
                c68920VeK.A01.flowStart(longValue, "", false);
            }
        }
        this.A00 = A00();
        this.A09 = new HashMap();
    }

    private final WZF A00() {
        Context context = this.A0C;
        String str = this.A0R;
        ACM acm = this.A0O;
        InterfaceC58019Po5 interfaceC58019Po5 = this.A0K;
        X9V x9v = this.A0L;
        InterfaceC58105PpU interfaceC58105PpU = this.A0M;
        InterfaceC71895X9c interfaceC71895X9c = this.A0P;
        C69464Vnn c69464Vnn = this.A08;
        C58647PzK c58647PzK = this.A0G;
        File file = this.A0Q;
        InterfaceC71972XDf interfaceC71972XDf = this.A0N;
        X9T x9t = this.A0J;
        return new WZF(context, this.A0E, this.A0F, c58647PzK, this.A0H, x9t, interfaceC58019Po5, x9v, interfaceC58105PpU, interfaceC71972XDf, acm, c69464Vnn, interfaceC71895X9c, file, str, this.A04, this.A05);
    }

    @Override // X.InterfaceC58201Pr7
    public final void APT() {
        this.A00.A0Y = true;
    }

    @Override // X.InterfaceC58201Pr7
    public final long Aui() {
        return this.A00.Aui();
    }

    @Override // X.InterfaceC71893X9a
    public final void DZ2(EnumC222789sJ enumC222789sJ, String str, String str2, Throwable th) {
        Object obj;
        AbstractC167017dG.A1N(enumC222789sJ, str);
        C14360o3.A0B(th, 2);
        long Aui = this.A00.Aui();
        long now = this.A0D.now();
        if (now - this.A06 > this.A0B) {
            long j = this.A07;
            if (j < this.A0A) {
                this.A06 = now;
                this.A07 = j + 1;
                WZF wzf = this.A00;
                String str3 = wzf.A0T;
                boolean z = wzf.A10;
                WZF wzf2 = this.A00;
                C1125456i c1125456i = wzf2.A0J;
                MediaComposition mediaComposition = wzf2.A0P.A08;
                if (mediaComposition != null) {
                    long j2 = wzf2.A06;
                    C69464Vnn c69464Vnn = this.A08;
                    int i = c69464Vnn.A05;
                    int i2 = c69464Vnn.A04;
                    U7W u7w = c69464Vnn.A0C;
                    int i3 = c69464Vnn.A01;
                    int i4 = c69464Vnn.A03;
                    boolean z2 = c69464Vnn.A0D;
                    int i5 = c69464Vnn.A02;
                    C70124W5f c70124W5f = c69464Vnn.A08;
                    XES xes = c69464Vnn.A07;
                    boolean z3 = c69464Vnn.A0E;
                    this.A08 = new C69464Vnn(c69464Vnn.A06, xes, c70124W5f, mediaComposition, c69464Vnn.A0A, c69464Vnn.A0B, u7w, c69464Vnn.A00, i3, i5, i4, i2, i, z3, z2);
                    WZF.A08(wzf2, "releaseWithoutListening", new Object[0]);
                    wzf2.A0O = null;
                    wzf2.A0R = null;
                    wzf2.A0N = null;
                    try {
                        wzf2.release();
                    } catch (Exception e) {
                        WZF.A09(wzf2, e);
                    }
                    C69063VhE c69063VhE = this.A0I;
                    Long l = c69063VhE.A00;
                    if (l != null) {
                        long longValue = l.longValue();
                        C68920VeK c68920VeK = c69063VhE.A01;
                        if (c68920VeK != null) {
                            String stackTraceString = android.util.Log.getStackTraceString(th);
                            C14360o3.A0A(stackTraceString);
                            C14360o3.A0B(stackTraceString, 2);
                            c68920VeK.A01.flowAnnotate(longValue, "error_trace", stackTraceString);
                        }
                    }
                    long j3 = this.A07;
                    this.A04 = str;
                    Map map = this.A05;
                    Object obj2 = "";
                    if (map != null && (obj = map.get("source_type")) != null) {
                        obj2 = obj;
                    }
                    LinkedHashMap A07 = AbstractC06930Yk.A07(AbstractC25230BEn.A1b("source_type", obj2));
                    A07.put("reason", "retry");
                    A07.put("retry_attempt_number", String.valueOf(j3));
                    A07.put("retry_position_ns", String.valueOf(Aui));
                    this.A05 = A07;
                    this.A00 = A00();
                    if (str3 != null) {
                        ET1(str3);
                    }
                    Ee0(z);
                    InterfaceC71894X9b interfaceC71894X9b = this.A02;
                    if (interfaceC71894X9b != null) {
                        Eb3(interfaceC71894X9b);
                    }
                    InterfaceC71893X9a interfaceC71893X9a = this.A01;
                    if (interfaceC71893X9a != null) {
                        Eay(interfaceC71893X9a);
                    }
                    C54386O1s c54386O1s = this.A03;
                    if (c54386O1s != null) {
                        Eb0(c54386O1s, j2);
                    }
                    E5Z(Aui);
                    Iterator A15 = AbstractC166997dE.A15(this.A09);
                    while (A15.hasNext()) {
                        C51u c51u = (C51u) AbstractC31176DnK.A0j(A15);
                        Object obj3 = c51u.A00;
                        Object obj4 = c51u.A01;
                        Object obj5 = c51u.A02;
                        WZF wzf3 = this.A00;
                        WZF.A0F(wzf3);
                        wzf3.A0G(VDF.SEND_RENDERER_EVENT, new Object[]{obj3, obj4, obj5}, 0L);
                    }
                    if (c1125456i != null) {
                        Eaw(c1125456i);
                    }
                    if (enumC222789sJ == EnumC222789sJ.PLAYING) {
                        E4S();
                        return;
                    }
                    return;
                }
                throw AbstractC166997dE.A0g();
            }
        }
        InterfaceC71894X9b interfaceC71894X9b2 = this.A02;
        if (interfaceC71894X9b2 != null) {
            interfaceC71894X9b2.DZC(enumC222789sJ, EnumC222789sJ.ERROR);
        }
        InterfaceC71893X9a interfaceC71893X9a2 = this.A01;
        if (interfaceC71893X9a2 != null) {
            String stackTraceString2 = android.util.Log.getStackTraceString(th);
            C14360o3.A0A(stackTraceString2);
            interfaceC71893X9a2.DZ2(enumC222789sJ, str, stackTraceString2, th);
        }
        C69063VhE c69063VhE2 = this.A0I;
        Long l2 = c69063VhE2.A00;
        if (l2 != null) {
            long longValue2 = l2.longValue();
            c69063VhE2.A00 = null;
            C68920VeK c68920VeK2 = c69063VhE2.A01;
            if (c68920VeK2 != null) {
                String stackTraceString3 = android.util.Log.getStackTraceString(th);
                C14360o3.A0A(stackTraceString3);
                C14360o3.A0B(stackTraceString3, 2);
                UserFlowLogger userFlowLogger = c68920VeK2.A01;
                userFlowLogger.flowAnnotate(longValue2, "error_trace", stackTraceString3);
                String obj6 = th.toString();
                C14360o3.A0B(obj6, 1);
                userFlowLogger.flowEndFail(longValue2, obj6, null);
            }
        }
    }

    @Override // X.InterfaceC58201Pr7
    public final void E4S() {
        this.A00.E4S();
    }

    @Override // X.InterfaceC58201Pr7
    public final void E5P() {
        this.A00.E5Z(0L);
    }

    @Override // X.InterfaceC58201Pr7
    public final void E5Z(long j) {
        this.A00.E5Z(j);
    }

    @Override // X.InterfaceC58201Pr7
    public final void EMh(long j) {
        this.A00.EMh(j);
    }

    @Override // X.InterfaceC58201Pr7
    public final void ET1(String str) {
        this.A00.A0T = str;
    }

    @Override // X.InterfaceC58201Pr7
    public final void Eaw(C1125456i c1125456i) {
        this.A00.Eaw(c1125456i);
    }

    @Override // X.InterfaceC58201Pr7
    public final void Eay(InterfaceC71893X9a interfaceC71893X9a) {
        this.A01 = interfaceC71893X9a;
        this.A00.Eay(this);
    }

    @Override // X.InterfaceC58201Pr7
    public final void Eb0(C54386O1s c54386O1s, long j) {
        this.A03 = c54386O1s;
        this.A00.Eb0(c54386O1s, j);
    }

    @Override // X.InterfaceC58201Pr7
    public final void Eb3(InterfaceC71894X9b interfaceC71894X9b) {
        this.A02 = interfaceC71894X9b;
        this.A00.Eb3(new WZP(this));
    }

    @Override // X.InterfaceC58201Pr7
    public final void Ee0(boolean z) {
        this.A00.Ee0(z);
    }

    @Override // X.InterfaceC58201Pr7
    public final void FBM(MediaComposition mediaComposition) {
        this.A00.FBM(mediaComposition);
    }

    @Override // X.InterfaceC58201Pr7
    public final void FBN(MediaComposition mediaComposition, long j) {
        this.A00.FBN(mediaComposition, j);
    }

    @Override // X.InterfaceC58201Pr7
    public final void FCk(C1125456i c1125456i, String str) {
        this.A00.FCk(c1125456i, str);
    }

    @Override // X.InterfaceC58201Pr7
    public final boolean isPlaying() {
        return this.A00.isPlaying();
    }

    @Override // X.InterfaceC58201Pr7
    public final void pause() {
        this.A00.pause();
    }

    @Override // X.InterfaceC58201Pr7
    public final void release() {
        this.A00.release();
        C69063VhE c69063VhE = this.A0I;
        Long l = c69063VhE.A00;
        if (l != null) {
            long longValue = l.longValue();
            c69063VhE.A00 = null;
            C68920VeK c68920VeK = c69063VhE.A01;
            if (c68920VeK != null) {
                c68920VeK.A01.flowEndSuccess(longValue);
            }
        }
    }

    @Override // X.InterfaceC58201Pr7
    public final boolean FAr(EnumC1125356h enumC1125356h, MediaEffect mediaEffect, String str) {
        AbstractC167017dG.A1O(enumC1125356h, str);
        return this.A00.FAr(enumC1125356h, mediaEffect, str);
    }
}
