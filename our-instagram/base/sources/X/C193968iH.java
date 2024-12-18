package X;

import android.R;
import android.content.Context;
import android.widget.TextView;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import com.instagram.ui.widget.mediapicker.Folder;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

/* renamed from: X.8iH, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C193968iH implements InterfaceC189018Yr, InterfaceC188988Yo, InterfaceC189658ak {
    public int A00;
    public int A01;
    public int A02;
    public C9B2 A03;
    public C193838i4 A04;
    public C24164Ann A05;
    public Integer A06;
    public String A07;
    public List A08;
    public boolean A09;
    public boolean A0A;
    public boolean A0B;
    public boolean A0C;
    public boolean A0D;
    public boolean A0E;
    public final int A0F;
    public final Context A0G;
    public final AbstractC59962oe A0H;
    public final InterfaceC11380iw A0I;
    public final UserSession A0J;
    public final C1810981l A0K;
    public final C195448kk A0L;
    public final C8J0 A0M;
    public final C193958iG A0N;
    public final C5JK A0O;
    public final C60322pF A0P;
    public final InterfaceC09390do A0Q;
    public final InterfaceC09390do A0R;
    public final InterfaceC09390do A0S;
    public volatile Integer A0T;

    @Override // X.InterfaceC188988Yo
    public final void DEP(Exception exc) {
        C14360o3.A0B(exc, 0);
        C8J0 c8j0 = this.A0M;
        String obj = exc.toString();
        C14360o3.A0B(obj, 0);
        c8j0.A03.A07(obj, "", 518928411, c8j0.A01);
        UserSession userSession = this.A0J;
        C006802i c006802i = C006802i.A0p;
        c006802i.markerAnnotate(R.bool.config_sip_wifi_only, "is_current_folder_empty", true);
        c006802i.markerEnd(R.bool.config_sip_wifi_only, (short) 3);
        String str = "";
        if (this.A0K.A08.A00 instanceof C81V) {
            C22C A01 = AnonymousClass229.A01(userSession);
            String message = exc.getMessage();
            if (message == null) {
                message = "";
            }
            C22M c22m = ((C22F) A01).A04;
            c22m.A04 = A01.A00.A07(message, "", 838604704, c22m.A04);
        }
        if (this.A06 != null) {
            C49632Pw A00 = AbstractC49622Pv.A00(userSession);
            String message2 = exc.getMessage();
            if (message2 != null) {
                str = message2;
            }
            A00.A01 = A00.A04.A07(str, "", 17638606, A00.A01);
            this.A06 = null;
        }
        this.A0T = null;
        C447724h c447724h = AnonymousClass229.A01(userSession).A0J;
        C5JK c5jk = this.A0O;
        String message3 = exc.getMessage();
        if (message3 == null) {
            message3 = "error loading media";
        }
        if (c447724h.A05.Ajy() == EnumC114925Hg.CLIPS && c5jk == C5JK.A05) {
            c447724h.A00 = c447724h.A04.A07(message3, "", 585177795, c447724h.A00);
        }
        this.A01 = Integer.MIN_VALUE;
        C193838i4 A03 = A03();
        A03.A0R.postDelayed(A03.A1G, 300L);
    }

    /* JADX WARN: Code restructure failed: missing block: B:159:0x037e, code lost:
    
        if (r7 != null) goto L135;
     */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0230  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x024b  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x03a5  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x03c3 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:115:0x025b  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0272  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x02a2  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x0313  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x0346  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x035b  */
    /* JADX WARN: Removed duplicated region for block: B:162:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x010c  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x019b  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x01d6 A[LOOP:4: B:96:0x01d0->B:98:0x01d6, LOOP_END] */
    @Override // X.InterfaceC188988Yo
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void DS1(X.C189058Yv r12, java.util.List r13, java.util.List r14, int r15) {
        /*
            Method dump skipped, instructions count: 966
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C193968iH.DS1(X.8Yv, java.util.List, java.util.List, int):void");
    }

    @Override // X.InterfaceC189658ak
    public final void DTe(C8Z4 c8z4) {
        C9B2 c9b2;
        C14360o3.A0B(c8z4, 0);
        Folder ACa = c8z4.ACa();
        if (ACa != null) {
            A02(ACa);
        }
        C24164Ann ACh = c8z4.ACh();
        if (ACh != null && !ACh.equals(this.A05)) {
            this.A05 = ACh;
            C193838i4 A03 = A03();
            A03.A0m.A00 = new C9R7(A03);
            String str = ACh.A02;
            String str2 = ACh.A01;
            this.A07 = str;
            C189058Yv c189058Yv = (C189058Yv) this.A0R.getValue();
            c189058Yv.A05 = true;
            InterfaceC189068Yw interfaceC189068Yw = c189058Yv.A00;
            if (interfaceC189068Yw != null) {
                interfaceC189068Yw.EYj(new ArrayList(), "META_GALLERY");
            }
            this.A0B = true;
            this.A0L.A05(str2, AbstractC208329Jr.A00((C55U) this.A0K.A08.A00), new B8U(this, 14));
            this.A0N.A0J.Egh(str2);
            A03().A0e(str);
        }
        if (C18U.A06(C06090Tz.A05, this.A0J, 36330295133291299L)) {
            Object obj = this.A0K.A08.A00;
            if (obj instanceof C81V) {
                C9B2 c9b22 = this.A03;
                c9b2 = new C9B2(c9b22.A01, c8z4.BF3(), 1);
            } else if (obj instanceof C208509Kk) {
                c9b2 = new C9B2(c8z4.BF3(), this.A03.A00, 1);
            } else {
                c9b2 = this.A03;
            }
            this.A03 = c9b2;
        }
    }

    @Override // X.InterfaceC189018Yr
    public final void Dr0(List list) {
        this.A08 = list;
        C17280tP A00 = C17280tP.A4E.A00();
        if (((Boolean) A00.A2h.CES(A00, C17280tP.A4G[116])).booleanValue()) {
            Context context = this.A0G;
            UserSession userSession = this.A0J;
            A92 a92 = (A92) userSession.A01(A92.class, new C57535Pg9(49, context.getApplicationContext(), userSession));
            String A0I = AnonymousClass001.A0I("[AMG] #Suggestion found:", '\n', list.size());
            C14360o3.A0B(A0I, 0);
            StringBuilder sb = a92.A01;
            sb.append(A0I);
            StringBuilder sb2 = new StringBuilder();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                C9ZK c9zk = (C9ZK) it.next();
                sb2.append("[AMG] ");
                sb2.append(c9zk.A02);
                sb2.append(" ");
                sb2.append(c9zk.A05.size());
                sb2.append("\n");
            }
            String obj = sb2.toString();
            C14360o3.A07(obj);
            sb.append(obj);
            TextView textView = a92.A00;
            if (textView != null) {
                textView.setText(sb.toString());
            }
            sb.setLength(0);
        }
        if ((!list.isEmpty()) && (this.A0K.A08.A00 instanceof C81V)) {
            C60322pF c60322pF = this.A0P;
            UserSession userSession2 = this.A0J;
            if (c60322pF.A01(userSession2)) {
                list.size();
                AbstractC226399yw.A00(userSession2, list);
            }
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, X.2pF] */
    public /* synthetic */ C193968iH(Context context, AbstractC59962oe abstractC59962oe, InterfaceC11380iw interfaceC11380iw, UserSession userSession, C1810981l c1810981l, C8J0 c8j0, C193958iG c193958iG, C5JK c5jk, C189058Yv c189058Yv) {
        ?? obj = new Object();
        this.A0G = context;
        this.A0H = abstractC59962oe;
        this.A0J = userSession;
        this.A0K = c1810981l;
        this.A0I = interfaceC11380iw;
        this.A0N = c193958iG;
        this.A0M = c8j0;
        this.A0P = obj;
        this.A0O = c5jk;
        this.A0R = AbstractC09440dt.A01(new C9F5(8, c189058Yv, this));
        this.A0Q = AbstractC09440dt.A01(new C9ET(this, 48));
        this.A0L = AbstractC195438kj.A00(userSession);
        this.A07 = "";
        this.A0C = this.A0H.requireArguments().getString("META_GALLERY_ALBUM_TYPE") != null;
        this.A01 = Integer.MIN_VALUE;
        this.A0S = AbstractC09440dt.A00(EnumC09460dv.A02, new C9ET(this, 49));
        this.A00 = (int) (System.currentTimeMillis() / 1000);
        this.A0F = 100;
        this.A03 = new C9B2();
    }

    private final void A00() {
        if (!this.A0D) {
            C18920wW c18920wW = ((C22F) AnonymousClass229.A01(this.A0J)).A01;
            InterfaceC02590Ai A00 = c18920wW.A00(c18920wW.A00, "ig_wearable_empty_meta_view_album");
            if (A00.isSampled()) {
                A00.Cht();
            }
        }
        this.A0D = true;
    }

    public static final void A01(C193968iH c193968iH) {
        if (!c193968iH.A0E) {
            int ordinal = c193968iH.A03().A03.ordinal();
            if (ordinal != 524) {
                if (ordinal == 509) {
                    c193968iH.A0E = true;
                    AbstractC208329Jr.A06(c193968iH.A0I, c193968iH.A0J, C05F.A0N);
                    return;
                }
                return;
            }
            c193968iH.A0E = true;
            UserSession userSession = c193968iH.A0J;
            AbstractC208329Jr.A09(c193968iH.A0I, userSession, AbstractC111324zv.A00(2767), AbstractC208329Jr.A00((C55U) c193968iH.A0K.A08.A00), AbstractC16850sd.A0M(new C09530e4(AbstractC111324zv.A00(2768), "album_load_successful")));
        }
    }

    private final void A02(Folder folder) {
        this.A07 = "";
        this.A0N.A0J.Egh(null);
        this.A05 = null;
        int i = folder.A02;
        if (i == -5) {
            LJR.A03(A03().A0w.A0B, null, 4921);
            return;
        }
        this.A0T = Integer.valueOf(new Random().nextInt());
        UserSession userSession = this.A0J;
        AnonymousClass229.A01(userSession).A0J.A02(this.A0O, "folder_selected");
        InterfaceC09390do interfaceC09390do = this.A0R;
        if (((C189058Yv) interfaceC09390do.getValue()).A01.A02 == i) {
            C193838i4 A03 = A03();
            A03.A0m.A00 = new C9R7(A03);
        }
        this.A02 = 0;
        this.A00 = (int) (System.currentTimeMillis() / 1000);
        ((C189058Yv) interfaceC09390do.getValue()).A0C(i);
        if (i == -1 && C18U.A06(C06090Tz.A05, userSession, 36316645727670848L)) {
            C195448kk c195448kk = this.A0L;
            C14360o3.A0B(c195448kk, 0);
            A03().A0g(AbstractC001800i.A0a(((C195478kn) c195448kk.A07.getValue()).A02), B9L.A00, true);
            c195448kk.A04(AbstractC208329Jr.A00((C55U) this.A0K.A08.A00));
        } else {
            A03().A0g(C16930sl.A00, B9M.A00, true);
        }
        A03().A0b();
        C193838i4 A032 = A03();
        String str = folder.A03;
        if (str == null) {
            str = "";
        }
        A032.A0e(str);
        if (((C189058Yv) interfaceC09390do.getValue()).A06().size() > this.A0F) {
            return;
        }
        A05();
    }

    public final C193838i4 A03() {
        C193838i4 c193838i4 = this.A04;
        if (c193838i4 != null) {
            return c193838i4;
        }
        C14360o3.A0F("delegate");
        throw C00O.createAndThrow();
    }

    public final String A04() {
        if (!AbstractC001900j.A0T(this.A07)) {
            return this.A07;
        }
        String str = ((C194478j8) this.A0Q.getValue()).A03.A01.A03;
        if (str != null) {
            return str;
        }
        return "";
    }

    /* JADX WARN: Code restructure failed: missing block: B:44:0x0157, code lost:
    
        if (r3 > 2) goto L42;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A05() {
        /*
            Method dump skipped, instructions count: 349
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C193968iH.A05():void");
    }

    public final boolean A06() {
        if (this.A0N.A0K.getValue() == null) {
            return false;
        }
        return true;
    }

    @Override // X.InterfaceC189018Yr
    public final boolean AFb(Folder folder, List list) {
        if (!((Boolean) this.A0S.getValue()).booleanValue()) {
            if (A03().A00 > 0.0f && A03().A07 == C05F.A00 && ((C194478j8) this.A0Q.getValue()).A03.A01.A02 == -1) {
                return true;
            }
            return false;
        }
        return true;
    }

    @Override // X.InterfaceC189018Yr
    public final List C3y(Integer num) {
        EnumC222729sD enumC222729sD;
        ArrayList arrayList = new ArrayList();
        if (num == C05F.A01) {
            enumC222729sD = EnumC222729sD.A02;
        } else {
            enumC222729sD = EnumC222729sD.A04;
        }
        arrayList.add(enumC222729sD);
        if (((Boolean) this.A0S.getValue()).booleanValue()) {
            arrayList.add(EnumC222729sD.A05);
        }
        C43901JbB A00 = AbstractC43895Jb5.A00(this.A0G, this.A0J, this.A0P);
        C51755Mte c51755Mte = new C51755Mte((List) arrayList, 27);
        AbstractC59962oe abstractC59962oe = this.A0H;
        FragmentActivity activity = abstractC59962oe.getActivity();
        if (activity != null) {
            C07Y.A00(activity);
        } else {
            C07Y.A00(abstractC59962oe);
        }
        return A00.A00(c51755Mte);
    }
}
