package X;

import com.instagram.model.direct.DirectThreadKey;
import com.instagram.model.direct.messageid.MessageIdentifier;
import java.util.Comparator;
import java.util.Map;

/* renamed from: X.7Tz, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C163627Tz implements C7U0 {
    public final C163807Uu A00;
    public final C163827Uw A01;
    public final C163827Uw A02;
    public final C163547Tr A03;
    public final C7TP A04;
    public final C7TH A05;
    public final C7TM A06;

    public C163627Tz(C163807Uu c163807Uu, C163827Uw c163827Uw, C163827Uw c163827Uw2, C163547Tr c163547Tr, C7TH c7th, C7TM c7tm, C7TP c7tp) {
        C14360o3.A0B(c7th, 2);
        this.A01 = c163827Uw;
        this.A05 = c7th;
        this.A06 = c7tm;
        this.A02 = c163827Uw2;
        this.A04 = c7tp;
        this.A03 = c163547Tr;
        this.A00 = c163807Uu;
    }

    @Override // X.C7U0
    public final boolean AHB(EnumC2054697t enumC2054697t) {
        C14360o3.A0B(enumC2054697t, 0);
        return this.A02.A0H.A00(enumC2054697t);
    }

    @Override // X.C7U0
    public final C160787Im Bko(String str) {
        return null;
    }

    @Override // X.C7U0
    public final void CMk(String str) {
        C163547Tr c163547Tr = this.A03;
        C160787Im A01 = c163547Tr.A0n.A01(str);
        if (A01 != null && A01.A0P && A01.A0R) {
            A01.A0R = false;
            c163547Tr.A0V(A01);
        }
    }

    @Override // X.C7U0
    public final boolean CYU(String str) {
        return false;
    }

    @Override // X.C7U0
    public final boolean CZj(String str) {
        return false;
    }

    @Override // X.C7U0
    public final void FBQ(L3Q l3q, String str) {
        C14360o3.A0B(str, 0);
        C163827Uw c163827Uw = this.A01;
        C7O4 c7o4 = c163827Uw.A0I;
        if (c7o4 != null) {
            c7o4.A06 = str;
            c7o4.A04 = l3q;
            c7o4.A0D.add(new C7OW(c163827Uw));
            if (c7o4.A03()) {
                c7o4.A02();
            }
        }
        C163547Tr c163547Tr = this.A03;
        C7O4 c7o42 = c163547Tr.A0i;
        if (c7o42 != null) {
            c7o42.A06 = str;
            c7o42.A04 = l3q;
        }
        AbstractC13660ms A0R = c163547Tr.A0R();
        C7VB c7vb = c163547Tr.A0B;
        if (c7vb != null) {
            if (AbstractC13660ms.A00(A0R, c7vb, 4) != -1) {
                AbstractC13660ms A0R2 = c163547Tr.A0R();
                C7VB c7vb2 = c163547Tr.A0B;
                if (c7vb2 != null) {
                    A0R2.A07(c7vb2);
                    return;
                }
            } else {
                return;
            }
        }
        C14360o3.A0F("previousLoadMoreViewModel");
        throw C00O.createAndThrow();
    }

    @Override // X.C7U0
    public final void onCreate() {
    }

    @Override // X.C7U0
    public final void onDestroy() {
    }

    @Override // X.C7U0
    public final void A8d(Map map) {
        map.put("direct_thread_view_infra_type", "open");
    }

    @Override // X.C7U0
    public final InterfaceC163577Tu AkT() {
        return this.A03;
    }

    @Override // X.C7U0
    public final C2EE Aq4() {
        return this.A02.A07;
    }

    @Override // X.C7U0
    public final /* bridge */ /* synthetic */ InterfaceC163857Uz Avk() {
        return this.A01;
    }

    @Override // X.C7U0
    public final /* bridge */ /* synthetic */ InterfaceC163817Uv BDF() {
        return this.A00;
    }

    @Override // X.C7U0
    public final EnumC159397Cz BT4(String str) {
        C160787Im BT7 = this.A01.BT7(str);
        if (BT7 != null) {
            C83403nh c83403nh = BT7.A0e;
            C14360o3.A07(c83403nh);
            return AbstractC1586079v.A00(c83403nh);
        }
        return EnumC159397Cz.A06;
    }

    @Override // X.C7U0
    public final /* bridge */ /* synthetic */ InterfaceC163557Ts BT6() {
        return this.A03;
    }

    @Override // X.C7U0
    public final C7TH Bt9() {
        return this.A05;
    }

    @Override // X.C7U0
    public final C7TM BtA() {
        return this.A06;
    }

    @Override // X.C7U0
    public final /* bridge */ /* synthetic */ C7TQ C78() {
        return this.A04;
    }

    @Override // X.C7U0
    public final /* bridge */ /* synthetic */ InterfaceC163837Ux C7r() {
        return this.A02;
    }

    @Override // X.C7U0
    public final void Cn4(InterfaceC83733oI interfaceC83733oI, int i) {
        boolean z;
        C83403nh A0T;
        C83403nh BM6;
        String str;
        C83403nh c83403nh;
        C2EC c2ec;
        C9CG c9cg;
        int i2 = i;
        C7TP c7tp = this.A04;
        if (i == 0) {
            z = true;
            C2EC c2ec2 = this.A02.A07;
            if (c2ec2 == null) {
                A0T = null;
            } else {
                A0T = c2ec2.BLs();
            }
        } else {
            z = false;
            A0T = this.A03.A0T(i2);
        }
        C206259Bi c206259Bi = null;
        C163827Uw c163827Uw = this.A02;
        C2EC c2ec3 = c163827Uw.A07;
        if (c2ec3 == null) {
            BM6 = null;
        } else {
            BM6 = c2ec3.BM6();
        }
        if (!z) {
            if (BM6 != null && A0T != null) {
                C163547Tr c163547Tr = this.A03;
                MKG mkg = MKG.A00;
                MKH mkh = MKH.A00;
                if (((Boolean) mkg.invoke(A0T)).booleanValue()) {
                    BM6 = A0T;
                } else {
                    BM6 = null;
                    int i3 = c163547Tr.A0R().A01;
                    for (int i4 = 0; i4 < i3; i4++) {
                        C7VC A09 = C163547Tr.A09(c163547Tr, i4);
                        if (A09 instanceof C160787Im) {
                            C83403nh c83403nh2 = ((C160787Im) A09).A0e;
                            C14360o3.A07(c83403nh2);
                            String A0h = A0T.A0h();
                            if (((Boolean) mkh.invoke(c83403nh2)).booleanValue()) {
                                if (A0h != null) {
                                    Comparator comparator = C93404Gt.A01;
                                    String A0h2 = c83403nh2.A0h();
                                    A0h2.getClass();
                                    if (comparator.compare(A0h2, A0h) < 0) {
                                    }
                                }
                                BM6 = c83403nh2;
                                break;
                            }
                            continue;
                        }
                    }
                }
            } else {
                BM6 = null;
            }
        }
        C163547Tr c163547Tr2 = this.A03;
        C80993jT BsB = c163827Uw.BsB(true);
        if (BsB != null && (c9cg = BsB.A01) != null) {
            str = c9cg.A02;
        } else {
            str = null;
        }
        C50679MYx c50679MYx = null;
        if (C18U.A06(C06090Tz.A05, c163547Tr2.A0g, 2342168601358841020L)) {
            int i5 = c163547Tr2.A0R().A01;
            while (i2 < i5) {
                Object A04 = c163547Tr2.A0R().A04(i2);
                C14360o3.A07(A04);
                C7VC c7vc = (C7VC) A04;
                if (c7vc instanceof C160787Im) {
                    c83403nh = ((C160787Im) c7vc).A0e;
                    C14360o3.A07(c83403nh);
                    String A0h3 = c83403nh.A0h();
                    if (A0h3 == null) {
                        continue;
                    } else if (str == null || A0h3.compareTo(str) >= 0) {
                        if (c83403nh.A0a() == C05F.A01) {
                            break;
                        }
                    } else {
                        break;
                    }
                }
                i2++;
            }
        }
        c83403nh = null;
        if (z && (c2ec = c163827Uw.A07) != null) {
            c50679MYx = c2ec.BLU();
        }
        if (A0T == null) {
            if (BM6 == null) {
                if (c83403nh != null) {
                    A0T = c83403nh;
                }
                c7tp.CnG(c206259Bi, interfaceC83733oI, false);
            }
            A0T = BM6;
        }
        if (A0T.A0h() == null) {
            C0w9.A04("mark_message_seen_without_id", AnonymousClass001.A0R("The received message to be marked seen does not have an ID. authorId = ", A0T.A1u), 1);
        } else {
            c206259Bi = new C206259Bi(c50679MYx, A0T, BM6, c83403nh);
        }
        c7tp.CnG(c206259Bi, interfaceC83733oI, false);
    }

    @Override // X.C7U0
    public final C42221xC E5m(MessageIdentifier messageIdentifier) {
        C42221xC c42221xC;
        C83403nh c83403nh;
        C160787Im A01 = this.A03.A0n.A01(messageIdentifier.A01);
        if (A01 != null && (c83403nh = A01.A0e) != null) {
            C2EY c2ey = c83403nh.A10;
            C14360o3.A07(c2ey);
            c42221xC = C42221xC.A09(new LnZ(c83403nh, c2ey, c83403nh.A0W()));
        } else {
            c42221xC = new C42221xC(C137776Lz.A00);
        }
        C14360o3.A0A(c42221xC);
        return c42221xC;
    }

    @Override // X.C7U0
    public final /* bridge */ /* synthetic */ AbstractC46511KiA E5u(String str) {
        C83403nh c83403nh;
        DirectThreadKey directThreadKey;
        C160787Im A01 = this.A03.A0n.A01(str);
        if (A01 == null || (c83403nh = A01.A0e) == null) {
            return null;
        }
        C163827Uw c163827Uw = this.A02;
        C2EC c2ec = c163827Uw.A07;
        if (c2ec != null) {
            directThreadKey = c2ec.BKb();
        } else {
            String str2 = c163827Uw.A09;
            if (str2 == null) {
                return null;
            }
            directThreadKey = new DirectThreadKey(str2, null);
        }
        return new KWh(c83403nh, directThreadKey);
    }

    @Override // X.C7U0
    public final String EL1(String str) {
        C163547Tr c163547Tr = this.A03;
        C160787Im A01 = c163547Tr.A0n.A01(str);
        if (A01 != null) {
            if (A01.A05()) {
                A01.A0Q = true;
                c163547Tr.A0V(A01);
            } else if (A01.A0P && !A01.A0R) {
                A01.A0R = true;
                c163547Tr.A0V(A01);
                Object obj = A01.A0e.A1T;
                if (obj instanceof String) {
                    return (String) obj;
                }
            }
        }
        return null;
    }

    @Override // X.C7U0
    public final boolean CYS(String str) {
        return BT4(str).A01();
    }
}
