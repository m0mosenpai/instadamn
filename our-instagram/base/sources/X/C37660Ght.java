package X;

import android.content.Context;
import com.facebook.proxygen.TraceFieldType;
import com.facebook.react.modules.dialog.DialogModule;
import com.instagram.common.session.UserSession;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;

/* renamed from: X.Ght, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C37660Ght extends AbstractC116895Qv implements JIK, C38Y {
    public Integer A00;
    public int A01;
    public int A02;
    public Integer A03;
    public boolean A04;
    public final Map A05;
    public final Context A06;
    public final UserSession A07;
    public final C56144Ow8 A08;
    public final InterfaceC60232p6 A09;
    public final String A0A;
    public final InterfaceC16820sZ A0B;

    public C37660Ght(Context context, UserSession userSession, InterfaceC60232p6 interfaceC60232p6, String str, InterfaceC16820sZ interfaceC16820sZ) {
        C14360o3.A0B(str, 4);
        this.A07 = userSession;
        this.A06 = context;
        this.A0B = interfaceC16820sZ;
        this.A0A = str;
        this.A09 = interfaceC60232p6;
        this.A08 = (C56144Ow8) userSession.A01(C56144Ow8.class, new C57515Pfp(userSession, 45));
        this.A05 = AbstractC166987dD.A1I();
        this.A04 = true;
        this.A01 = -1;
        this.A02 = -1;
        this.A03 = C05F.A00;
    }

    @Override // X.AbstractC116895Qv, X.InterfaceC116905Qw
    public final void D5E(C38971HDz c38971HDz) {
        C37884Gle c37884Gle;
        C69613Av c69613Av;
        Integer num = this.A00;
        if (num != null && (c37884Gle = (C37884Gle) this.A05.get(num)) != null && (c69613Av = c37884Gle.A01) != null) {
            c69613Av.A01();
        }
        this.A00 = null;
    }

    @Override // X.AbstractC116895Qv, X.InterfaceC116905Qw
    public final void D5H(C37818GkY c37818GkY) {
        C37884Gle c37884Gle;
        C69613Av c69613Av;
        C14360o3.A0B(c37818GkY, 0);
        if (!C1LE.A03(this.A07) || c37818GkY.A0C) {
            Integer num = this.A00;
            if (num != null && (c37884Gle = (C37884Gle) this.A05.get(num)) != null && (c69613Av = c37884Gle.A01) != null) {
                c69613Av.A05();
            }
            this.A00 = null;
        }
    }

    @Override // X.JIK
    public final void DCS(int i) {
    }

    @Override // X.C38Y
    public final /* synthetic */ void DXR(int i) {
    }

    @Override // X.C38Y
    public final /* synthetic */ void DXS(int i) {
    }

    @Override // X.C38Y
    public final /* synthetic */ void DXa(int i, int i2) {
    }

    @Override // X.C38Y
    public final /* synthetic */ void DY0() {
    }

    @Override // X.C38Y
    public final void Dim(float f, float f2) {
    }

    @Override // X.C38Y
    public final void Dj0(Integer num) {
        Integer num2;
        EnumC129395t1 enumC129395t1;
        C14360o3.A0B(num, 0);
        this.A03 = num;
        int i = this.A01;
        if (i != -1) {
            boolean z = true;
            int i2 = i + 1;
            C37546Gg2 c37546Gg2 = (C37546Gg2) this.A0B.invoke();
            if (this.A04 && num == (num2 = C05F.A01)) {
                this.A08.A00 = false;
                Map map = this.A05;
                Integer valueOf = Integer.valueOf(i2);
                if (map.containsKey(valueOf)) {
                    C0f5 AEp = C18950wb.A01.AEp("ClipsViewerTransitionLogger", 817902720);
                    AEp.ABW(DialogModule.KEY_MESSAGE, "Did not cleanup position based transition logger when user swiped out");
                    AEp.report();
                    map.remove(valueOf);
                }
                C37884Gle c37884Gle = new C37884Gle(this.A06, this.A07, new C37885Glf(map, i2));
                map.put(valueOf, c37884Gle);
                this.A04 = false;
                this.A02 = this.A01;
                AbstractC37552Gg8 abstractC37552Gg8 = c37546Gg2.A0A;
                if (i2 >= abstractC37552Gg8.A0B()) {
                    c37884Gle.A0M();
                    C69613Av A02 = c37884Gle.A02("network_request");
                    c37884Gle.A01 = A02;
                    A02.A04();
                    c37884Gle.A0K("is_at_end_of_feed", true);
                    c37884Gle.A0G("page", i2);
                    c37884Gle.A0J("clips_viewer_source", this.A0A);
                    return;
                }
                ArrayList A1E = AbstractC166987dD.A1E();
                int ordinal = abstractC37552Gg8.A0F(i2).A01.ordinal();
                if (ordinal != 8) {
                    if (ordinal == 0) {
                        C69613Av A022 = c37884Gle.A02("media_load");
                        c37884Gle.A00 = A022;
                        A1E.add(A022);
                    }
                } else {
                    C69613Av A023 = c37884Gle.A02("network_request");
                    c37884Gle.A01 = A023;
                    A1E.add(A023);
                    this.A00 = valueOf;
                }
                c37884Gle.A0M();
                Iterator A13 = AbstractC166997dE.A13(A1E);
                while (A13.hasNext()) {
                    Object next = A13.next();
                    C14360o3.A07(next);
                    ((C69613Av) next).A08(null);
                }
                c37884Gle.A0G("page", i2);
                c37884Gle.A0J("clips_viewer_source", this.A0A);
                c37884Gle.A0K("is_waiting_for_network_response", AbstractC167007dF.A1X(abstractC37552Gg8.A0F(i2).A01, EnumC129395t1.A08));
                if (abstractC37552Gg8.A0F(i2).A03 != num2) {
                    z = false;
                }
                c37884Gle.A0K("is_from_flash_cache", z);
                C120985dq A0F = abstractC37552Gg8.A0F(i2);
                if (A0F == null || (enumC129395t1 = A0F.A01) == null) {
                    return;
                }
                c37884Gle.A0J(TraceFieldType.ContentType, AbstractC37719Giu.A00(enumC129395t1));
                return;
            }
            if (num != C05F.A00) {
                return;
            }
            if (this.A02 == this.A01) {
                int A00 = C37546Gg2.A00(c37546Gg2);
                Map map2 = this.A05;
                if (i2 >= A00) {
                    C37884Gle c37884Gle2 = (C37884Gle) AbstractC166997dE.A0m(map2, i2);
                    if (c37884Gle2 != null) {
                        c37884Gle2.A0J(TraceFieldType.FailureReason, "End of feed");
                        C69613Av c69613Av = c37884Gle2.A01;
                        if (c69613Av != null) {
                            c69613Av.A01();
                        }
                    }
                } else {
                    Integer valueOf2 = Integer.valueOf(i2);
                    C37884Gle c37884Gle3 = (C37884Gle) map2.get(valueOf2);
                    if (c37884Gle3 != null && !c37884Gle3.A02) {
                        AbstractC69603Au abstractC69603Au = (AbstractC69603Au) map2.get(valueOf2);
                        if (abstractC69603Au != null) {
                            abstractC69603Au.A06();
                        }
                        map2.remove(valueOf2);
                    }
                }
            }
            this.A04 = true;
        }
    }

    @Override // X.C38Y
    public final /* synthetic */ void DrV() {
    }

    @Override // X.C38Y
    public final /* synthetic */ void DrY(C120985dq c120985dq, int i) {
    }

    @Override // X.JIK
    public final void DzM(C120985dq c120985dq, int i) {
    }

    @Override // X.JIK
    public final void DzN(int i, boolean z) {
    }

    @Override // X.JIK
    public final void DzU(int i) {
    }

    @Override // X.JIK
    public final void DzV(int i, boolean z) {
    }

    @Override // X.JIK
    public final void DzW(int i) {
    }

    @Override // X.JIK
    public final void E0A(C206199Bc c206199Bc, int i) {
        this.A08.A00 = true;
        C37884Gle c37884Gle = (C37884Gle) AbstractC166997dE.A0m(this.A05, i);
        if (c37884Gle != null) {
            c37884Gle.A0K("is_video_cached", c206199Bc.A03);
            c37884Gle.A0J("is_video_init_segment_cached", ((EnumC92424Bx) c206199Bc.A02).name());
            c37884Gle.A0J("is_video_first_data_segment_cached", ((EnumC92424Bx) c206199Bc.A01).name());
            c37884Gle.A0K("is_video_player_warmed", c206199Bc.A04);
            C69613Av c69613Av = c37884Gle.A00;
            if (c69613Av != null) {
                c69613Av.A05();
            }
            c37884Gle.A00 = null;
        }
    }

    @Override // X.JIK
    public final void E0C(int i) {
    }

    @Override // X.JIK
    public final void E0D(int i) {
    }

    @Override // X.JIK
    public final void E0E(int i) {
    }

    @Override // X.JIK
    public final void E0F(int i, String str) {
    }

    @Override // X.JIK
    public final void E0G(int i) {
    }

    @Override // X.C38Y
    public final void DXc(int i, int i2) {
        Map map;
        Integer num;
        AbstractC149616oE abstractC149616oE;
        if (i != i2) {
            this.A01 = i;
            if (i == this.A02 + 1 && (abstractC149616oE = (AbstractC149616oE) AbstractC166997dE.A0m(this.A05, i)) != null) {
                abstractC149616oE.A0L();
            }
            if (this.A03 != C05F.A00) {
                if (this.A09.CXH() && (num = this.A00) != null && i2 == num.intValue()) {
                    map = this.A05;
                    C37884Gle c37884Gle = (C37884Gle) map.get(num);
                    if (c37884Gle != null) {
                        c37884Gle.A0J(TraceFieldType.FailureReason, "Last item and network request failed");
                        C69613Av c69613Av = c37884Gle.A01;
                        if (c69613Av != null) {
                            c69613Av.A01();
                        }
                    }
                    this.A00 = null;
                } else {
                    map = this.A05;
                    Integer valueOf = Integer.valueOf(i2);
                    AbstractC69603Au abstractC69603Au = (AbstractC69603Au) map.get(valueOf);
                    if (abstractC69603Au != null) {
                        abstractC69603Au.A07();
                    }
                    map.remove(valueOf);
                }
                if (i == i2 - 1) {
                    Integer valueOf2 = Integer.valueOf(i2 + 1);
                    AbstractC69603Au abstractC69603Au2 = (AbstractC69603Au) map.get(valueOf2);
                    if (abstractC69603Au2 != null) {
                        abstractC69603Au2.A06();
                    }
                    map.remove(valueOf2);
                }
            }
            this.A04 = true;
        }
    }

    @Override // X.JIK
    public final void DZE(int i, String str) {
        Map map = this.A05;
        Integer valueOf = Integer.valueOf(i);
        C37884Gle c37884Gle = (C37884Gle) map.get(valueOf);
        if (c37884Gle != null) {
            if (str == null) {
                str = "Missing video player failure reason";
            }
            c37884Gle.A0J(TraceFieldType.FailureReason, str);
            C69613Av c69613Av = c37884Gle.A00;
            if (c69613Av != null) {
                c69613Av.A01();
            }
            c37884Gle.A00 = null;
        }
        map.remove(valueOf);
    }

    @Override // X.JIK
    public final void E02(int i) {
        C37884Gle c37884Gle = (C37884Gle) AbstractC166997dE.A0m(this.A05, i);
        if (c37884Gle != null && !c37884Gle.A03 && ((AbstractC69603Au) c37884Gle).A01) {
            C69613Av c69613Av = c37884Gle.A00;
            if (c69613Av != null) {
                c69613Av.A04();
            }
            c37884Gle.A03 = true;
        }
    }
}
