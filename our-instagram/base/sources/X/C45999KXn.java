package X;

import android.app.Activity;
import android.location.Location;
import com.facebook.android.maps.model.LatLng;
import com.instagram.common.session.UserSession;
import com.instagram.direct.inbox.notes.models.NoteAudience;
import com.instagram.direct.inbox.notes.models.NoteCreationSource;
import com.instagram.direct.inbox.notes.models.NoteStyle;
import com.instagram.friendmap.configs.FriendMapLaunchConfig;
import com.instagram.friendmap.configs.PagerSheetLaunchConfig;
import com.instagram.friendmap.data.FriendMapRepository;
import com.instagram.user.model.User;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.KXn, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C45999KXn extends JQC implements InterfaceC65626Tpm {
    public Runnable A00;
    public AnonymousClass195 A01;
    public final UserSession A02;
    public final LLR A03;
    public final FriendMapLaunchConfig A04;
    public final FriendMapRepository A05;
    public final LJ4 A06;
    public final L58 A07;
    public final C1VW A08;

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Type inference failed for: r2v1, types: [X.L58, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C45999KXn(com.instagram.common.session.UserSession r29, X.LLR r30, com.instagram.friendmap.configs.FriendMapLaunchConfig r31, com.instagram.friendmap.data.FriendMapRepository r32, X.LJ4 r33) {
        /*
            r28 = this;
            r13 = 1
            r8 = r29
            r7 = r30
            r6 = r32
            r3 = r33
            X.AbstractC167027dH.A0a(r13, r8, r6, r3, r7)
            r11 = 0
            X.0sj r2 = X.C16910sj.A00
            X.0sl r1 = X.C16930sl.A00
            r12 = 0
            com.instagram.direct.inbox.notes.models.NoteAudience r10 = com.instagram.direct.inbox.notes.models.NoteAudience.A07
            X.JxW r9 = new X.JxW
            r14 = r12
            r15 = r12
            r16 = r13
            r17 = r12
            r18 = r12
            r19 = r13
            r20 = r12
            r21 = r12
            r22 = r12
            r23 = r13
            r24 = r12
            r25 = r13
            r26 = r12
            r27 = r12
            r9.<init>(r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27)
            X.KXs r5 = X.C46004KXs.A00
            X.K2v r0 = new X.K2v
            r0.<init>(r5, r9, r1, r2)
            r4 = r28
            r4.<init>(r0)
            r4.A02 = r8
            r4.A05 = r6
            r4.A06 = r3
            r4.A03 = r7
            r0 = r31
            r4.A04 = r0
            X.1VW r0 = X.C1VW.A00
            r4.A08 = r0
            r0 = -1
            X.L58 r2 = new X.L58
            r2.<init>()
            r2.A09 = r12
            r2.A05 = r11
            r2.A08 = r13
            r2.A02 = r11
            r2.A06 = r11
            r2.A04 = r11
            r2.A00 = r0
            r2.A07 = r12
            r2.A01 = r11
            r2.A03 = r11
            r4.A07 = r2
            X.6aw r2 = X.AbstractC141776au.A00(r4)
            r1 = 46
            X.MBp r0 = new X.MBp
            r0.<init>(r4, r11, r1)
            X.191 r3 = X.AnonymousClass191.A00
            X.6aw r2 = X.AbstractC25235BEs.A0W(r4, r3, r0, r2)
            r1 = 48
            X.MBp r0 = new X.MBp
            r0.<init>(r4, r11, r1)
            X.AbstractC23641Du.A05(r3, r0, r2)
            java.lang.Integer r1 = X.C05F.A01
            X.MGv r0 = X.C50240MGv.A00
            A08(r11, r4, r1, r0, r12)
            A0C(r5, r4)
            X.6aw r2 = X.AbstractC141776au.A00(r4)
            r1 = 42
            X.MC4 r0 = new X.MC4
            r0.<init>(r4, r11, r1)
            X.AbstractC23641Du.A05(r3, r0, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C45999KXn.<init>(com.instagram.common.session.UserSession, X.LLR, com.instagram.friendmap.configs.FriendMapLaunchConfig, com.instagram.friendmap.data.FriendMapRepository, X.LJ4):void");
    }

    public static final L5X A02(Location location, C4F5 c4f5) {
        C6C9 c6c9;
        Double d;
        List list;
        InterfaceC50424MOe interfaceC50424MOe;
        C6C9 BXJ;
        C67s c67s;
        Double d2 = null;
        if (c4f5 != null && (list = c4f5.A0J) != null && (interfaceC50424MOe = (InterfaceC50424MOe) AbstractC001800i.A0J(list)) != null && (BXJ = interfaceC50424MOe.BXJ()) != null) {
            C67s c67s2 = BXJ.A0A;
            if (c67s2 != null) {
                c67s = new C67s(c67s2.A00, c67s2.A01, c67s2.A02, c67s2.A03, c67s2.A04, c67s2.A05, c67s2.A06, c67s2.A07, c67s2.A08, null, c67s2.A0A, c67s2.A0B, c67s2.A0C);
            } else {
                c67s = null;
            }
            ING ing = new ING(BXJ);
            ing.A0A = c67s;
            c6c9 = ing.A01();
        } else {
            c6c9 = null;
        }
        if (location != null) {
            d = Double.valueOf(location.getLatitude());
            d2 = Double.valueOf(location.getLongitude());
        } else {
            d = null;
        }
        return LKX.A02(null, c6c9, d, d2);
    }

    public static final void A06(EnumC46298KeU enumC46298KeU, C45999KXn c45999KXn, Integer num, InterfaceC16820sZ interfaceC16820sZ) {
        String str;
        String str2;
        LJ4 lj4 = c45999KXn.A06;
        C50634MWv A02 = lj4.A02(num);
        if (A02.A00) {
            C29901DGp c29901DGp = new C29901DGp(12, num, interfaceC16820sZ, c45999KXn, enumC46298KeU);
            Activity activity = lj4.A00;
            EnumC172127lh A00 = AbstractC23451Ch.A00(activity, "android.permission.ACCESS_FINE_LOCATION");
            C14360o3.A07(A00);
            if (!A00.A00) {
                C23031Ai A10 = AbstractC25226BEj.A10(lj4.A03);
                if (!AbstractC167017dG.A1b(A10, A10.A1M, C23031Ai.A8c, 497)) {
                    ME1 me1 = new ME1(19, c29901DGp, lj4);
                    C50158MDl c50158MDl = new C50158MDl(c29901DGp, 18);
                    UserSession userSession = lj4.A01;
                    if (C3LA.A03(userSession)) {
                        str = "friend_map_location_sharing_device_permissions";
                    } else {
                        str = "location_device_permission";
                    }
                    boolean equals = str.equals("friend_map_location_sharing_device_permissions");
                    if (equals) {
                        LLR.A02(EnumC46289KeL.PRE_LOCATION_PERMISSIONS_NUX, lj4.A02, "NUX_WINDOW", "IMPRESSION");
                    }
                    OKB A002 = AbstractC61813Ru7.A00(userSession);
                    int intValue = num.intValue();
                    if (intValue != 0) {
                        if (intValue != 3) {
                            if (intValue != 1) {
                                str2 = "ig_friend_map_center";
                            } else {
                                str2 = "ig_friend_map_launch";
                            }
                        } else {
                            str2 = "";
                        }
                    } else {
                        str2 = "ig_friend_map_note_create";
                    }
                    A002.A00(activity, new C45335K4n(lj4, me1, c50158MDl, equals), str, str2, null);
                    return;
                }
            }
            LJ4.A00(lj4, c29901DGp);
            return;
        }
        if (A02.A01) {
            interfaceC16820sZ.invoke();
        } else {
            if (!A02.A02) {
                return;
            }
            c45999KXn.A09(enumC46298KeU, num, interfaceC16820sZ);
        }
    }

    public static final void A08(EnumC46298KeU enumC46298KeU, C45999KXn c45999KXn, Integer num, InterfaceC16820sZ interfaceC16820sZ, boolean z) {
        c45999KXn.A00 = null;
        LJ4 lj4 = c45999KXn.A06;
        if (lj4.A02(num).A01) {
            c45999KXn.A0I(new BQB(16, c45999KXn, interfaceC16820sZ, z), z);
        } else if (lj4.A02(num).A02) {
            c45999KXn.A09(enumC46298KeU, num, interfaceC16820sZ);
        } else {
            if (num != C05F.A01) {
                return;
            }
            c45999KXn.A0M(C49453LtR.A00);
        }
    }

    private final void A09(EnumC46298KeU enumC46298KeU, Integer num, InterfaceC16820sZ interfaceC16820sZ) {
        Integer num2;
        InterfaceC16820sZ c29901DGp;
        long j;
        boolean z;
        InterfaceC16820sZ interfaceC16820sZ2;
        int intValue = num.intValue();
        EnumC46298KeU enumC46298KeU2 = enumC46298KeU;
        if (intValue != 0) {
            if (intValue != 3) {
                LJ4 lj4 = this.A06;
                C29900DGo c29900DGo = new C29900DGo(14, num, this, interfaceC16820sZ);
                Activity activity = lj4.A00;
                if (!activity.isFinishing()) {
                    WGH.A04(activity, null, new C60974Rcx(c29900DGo, 0), null, null, null, null, 2131965675, lj4.A02(C05F.A01).A01, false);
                    return;
                }
                return;
            }
            num2 = C05F.A0C;
            c29901DGp = new C50152MDf(this, 9);
            interfaceC16820sZ2 = new C50152MDf(this, 10);
            j = 0;
            z = true;
        } else {
            num2 = C05F.A01;
            c29901DGp = new C29901DGp(13, num, interfaceC16820sZ, this, enumC46298KeU);
            enumC46298KeU2 = EnumC46298KeU.NOTE_CREATE_BUTTON;
            j = 0;
            z = true;
            interfaceC16820sZ2 = C50241MGw.A00;
        }
        A07(enumC46298KeU2, this, num2, c29901DGp, interfaceC16820sZ2, j, z);
    }

    public static final void A0A(LatLng latLng, C45999KXn c45999KXn) {
        InterfaceC16660sJ bqb;
        LatLng A0L;
        AbstractC47449Kxe A00 = C45293K2v.A00(c45999KXn);
        if (A00 instanceof C46003KXr) {
            Location A01 = A01(c45999KXn);
            if (A01 != null && (A0L = AbstractC43594JPz.A0L(A01)) != null) {
                double A002 = A0L.A00(latLng);
                UserSession userSession = c45999KXn.A02;
                C06090Tz c06090Tz = C06090Tz.A05;
                if (C18U.A06(c06090Tz, userSession, 2342164731594942215L) && A002 > C18U.A00(c06090Tz, userSession, 37166147311239596L)) {
                    C45128JyU c45128JyU = ((C46003KXr) A00).A02;
                    c45999KXn.A0M(new C49448LtM(c45128JyU.A04, 15.0f, false, true));
                    c45999KXn.A0M(new C49438LtC(c45128JyU));
                    c45999KXn.A0M(C49458LtW.A00);
                    return;
                }
                bqb = new MIF(16, latLng, A00, c45999KXn, true);
            } else {
                return;
            }
        } else if (!(A00 instanceof C46001KXp)) {
            return;
        } else {
            bqb = new BQB(17, A00, latLng, true);
        }
        c45999KXn.A0O(bqb);
    }

    public static final void A0B(C45119Jxo c45119Jxo, C45999KXn c45999KXn, String str, boolean z) {
        long j;
        MNV c49460LtY;
        LatLng A0L;
        UserSession userSession = c45999KXn.A02;
        Jx8 A03 = LLE.A03(c45119Jxo, userSession);
        if (A03 != null) {
            C45128JyU A02 = LLE.A02(A03);
            AbstractC47449Kxe A00 = C45293K2v.A00(c45999KXn);
            L58 l58 = c45999KXn.A07;
            l58.A00 = System.currentTimeMillis();
            if (A00 instanceof C46003KXr) {
                c45999KXn.A0O(new C50275MIe(c45119Jxo, c45999KXn, true, A02.A05, A00, null, str, 0));
                return;
            }
            C06090Tz c06090Tz = C06090Tz.A05;
            A0C(new C46003KXr(c45119Jxo, A02, str, c45999KXn.A00(), C18U.A06(c06090Tz, userSession, 2342164731594942215L), true, z), c45999KXn);
            if (A00 instanceof C46000KXo) {
                c49460LtY = C49453LtR.A00;
                j = 150;
            } else {
                j = 150;
                c49460LtY = new C49460LtY(true, C50239MGu.A00);
            }
            c45999KXn.A0N(c49460LtY, j);
            Location A01 = A01(c45999KXn);
            if (A01 == null || (A0L = AbstractC43594JPz.A0L(A01)) == null) {
                return;
            }
            l58.A02 = null;
            if (C18U.A06(c06090Tz, userSession, 2342164731594942215L)) {
                A05(A01(c45999KXn), c45999KXn, c45999KXn.A00(), 0L, false, false, false);
                c45999KXn.A0N(new C49441LtF(A0L, C18U.A00(c06090Tz, userSession, 37166147311239596L)), 0L);
            } else {
                A05(A01(c45999KXn), c45999KXn, 15.0f, 0L, true, false, false);
            }
        }
    }

    public static final void A0F(C45999KXn c45999KXn, long j) {
        AbstractC47032Kqp.A00(c45999KXn, new MC2(c45999KXn, null, 45), j);
    }

    public final void A0W(String str) {
        C46003KXr c46003KXr;
        AbstractC47449Kxe A00 = C45293K2v.A00(this);
        C4F5 c4f5 = null;
        if ((A00 instanceof C46003KXr) && (c46003KXr = (C46003KXr) A00) != null) {
            C45119Jxo c45119Jxo = c46003KXr.A01;
            NoteAudience noteAudience = (NoteAudience) c45119Jxo.A01;
            NoteStyle noteStyle = (NoteStyle) c45119Jxo.A05;
            NoteCreationSource noteCreationSource = (NoteCreationSource) c45119Jxo.A03;
            C45099JxT c45099JxT = (C45099JxT) c45119Jxo.A02;
            List list = (List) c45119Jxo.A04;
            AbstractC25233BEq.A0v(1, noteAudience, noteStyle, noteCreationSource);
            C14360o3.A0B(list, 5);
            C45119Jxo c45119Jxo2 = new C45119Jxo(noteAudience, c45099JxT, noteCreationSource, noteStyle, str, list, true);
            Jx8 A03 = LLE.A03(c45119Jxo2, this.A02);
            if (A03 != null) {
                c4f5 = LLE.A02(A03).A05;
            }
            A0O(new C50275MIe(c45119Jxo2, this, false, c4f5, c46003KXr, null, null, 0));
        }
    }

    public final void A0X(String str) {
        Object obj;
        MNV c49443LtH;
        C14360o3.A0B(str, 0);
        Iterator A03 = C45293K2v.A03(this);
        do {
            obj = null;
            if (!A03.hasNext()) {
                break;
            } else {
                obj = A03.next();
            }
        } while (!C14360o3.A0K(((C45128JyU) obj).A0B, str));
        C45128JyU c45128JyU = (C45128JyU) obj;
        if (c45128JyU != null) {
            if (c45128JyU.A05 != null) {
                c49443LtH = new C49460LtY(true, new ME1(49, c45128JyU, this));
            } else {
                boolean z = c45128JyU.A0J;
                LLR llr = this.A03;
                User user = c45128JyU.A06;
                String id = user.getId();
                if (z) {
                    llr.A0D(id);
                    A0T(EnumC46298KeU.SELF_LOCATION_POG, false);
                    return;
                } else {
                    llr.A0D(id);
                    String str2 = c45128JyU.A0A;
                    if (str2 == null) {
                        str2 = user.getId();
                    }
                    c49443LtH = new C49443LtH(str, str2);
                }
            }
            A0M(c49443LtH);
        }
    }

    @Override // X.InterfaceC65626Tpm
    public final /* synthetic */ void onCreate(C07X c07x) {
    }

    @Override // X.InterfaceC65626Tpm
    public final /* synthetic */ void onDestroy(C07X c07x) {
    }

    @Override // X.InterfaceC65626Tpm
    public final void onResume(C07X c07x) {
        C14360o3.A0B(c07x, 0);
        L58 l58 = this.A07;
        boolean z = l58.A09;
        l58.A09 = false;
        if (z) {
            AbstractC47032Kqp.A00(this, new MC2(this, null, 46), 400L);
            if (!AbstractC166997dE.A1Z(l58.A05, false) && AbstractC31171DnF.A1b(C45293K2v.A04(this))) {
                A0D(this);
            }
        }
        C69021Vfx c69021Vfx = l58.A02;
        if (c69021Vfx != null) {
            l58.A02 = null;
            Location location = new Location("friend_map_coordinate");
            C69020Vfw c69020Vfw = c69021Vfx.A01;
            location.setLatitude(c69020Vfw.A00);
            location.setLongitude(c69020Vfw.A01);
            A05(location, this, c69021Vfx.A00, 0L, false, false, false);
        }
        if ((C45293K2v.A00(this) instanceof C46004KXs) && this.A06.A02(C05F.A00).A01) {
            A0O(new C50355MLh(this, 49));
        }
        A0Y(null);
        FriendMapRepository friendMapRepository = this.A05;
        if (C3LA.A04(friendMapRepository.A06)) {
            friendMapRepository.A03 = AbstractC25226BEj.A1L(new MBs(friendMapRepository, null, 19), ((C4A7) friendMapRepository).A01);
        }
    }

    @Override // X.InterfaceC65626Tpm
    public final /* synthetic */ void onStart(C07X c07x) {
    }

    @Override // X.InterfaceC65626Tpm
    public final void onStop(C07X c07x) {
        C14360o3.A0B(c07x, 0);
        L58 l58 = this.A07;
        l58.A02 = l58.A01;
    }

    private final int A00() {
        UserSession userSession = this.A02;
        C06090Tz c06090Tz = C06090Tz.A05;
        if (C18U.A06(c06090Tz, userSession, 36321722383148832L)) {
            return 3;
        }
        return (int) (18.0d - (Math.log((3.0d * C18U.A00(c06090Tz, userSession, 37166147311239596L)) / 1000.0d) / Math.log(2.0d)));
    }

    public static final Location A01(C45999KXn c45999KXn) {
        C1VW c1vw = c45999KXn.A08;
        if (c1vw != null) {
            return c1vw.getLastLocation(c45999KXn.A02, "FriendMapViewModel");
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x003b, code lost:
    
        if (X.C3LA.A03(r17.A02) == false) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x00a4, code lost:
    
        if (X.C3LA.A03(r5) == false) goto L23;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final X.C45102JxW A04(X.AbstractC47449Kxe r16, X.C45999KXn r17, int r18, boolean r19, boolean r20) {
        /*
            Method dump skipped, instructions count: 213
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C45999KXn.A04(X.Kxe, X.KXn, int, boolean, boolean):X.JxW");
    }

    public static final void A05(Location location, C45999KXn c45999KXn, float f, long j, boolean z, boolean z2, boolean z3) {
        boolean z4;
        if (location != null && c45999KXn.A07.A02 == null) {
            AbstractC47449Kxe A00 = C45293K2v.A00(c45999KXn);
            if (z2 || ((A00 instanceof C46003KXr) && ((C46003KXr) A00).A06)) {
                z4 = true;
            } else {
                z4 = false;
            }
            c45999KXn.A0N(new C49448LtM(AbstractC43594JPz.A0L(location), f, z, z4), j);
            if (z3) {
                LJ4 lj4 = c45999KXn.A06;
                if (!lj4.A05() && lj4.A04() && C3LA.A03(c45999KXn.A02)) {
                    A07(EnumC46298KeU.SELF_LOCATION_POG, c45999KXn, C05F.A0N, new MHN(c45999KXn, 43), new MHN(c45999KXn, 44), 0L, true);
                }
            }
        }
    }

    public static final void A07(EnumC46298KeU enumC46298KeU, C45999KXn c45999KXn, Integer num, InterfaceC16820sZ interfaceC16820sZ, InterfaceC16820sZ interfaceC16820sZ2, long j, boolean z) {
        if (AbstractC47862LCi.A01(c45999KXn.A02, num)) {
            PagerSheetLaunchConfig pagerSheetLaunchConfig = new PagerSheetLaunchConfig(num);
            pagerSheetLaunchConfig.A01 = new C57251PbZ(0, interfaceC16820sZ2, c45999KXn);
            pagerSheetLaunchConfig.A02 = interfaceC16820sZ;
            pagerSheetLaunchConfig.A03 = z;
            pagerSheetLaunchConfig.A00 = enumC46298KeU;
            c45999KXn.A0N(new C49432Lt6(pagerSheetLaunchConfig), j);
        }
    }

    public static final void A0C(AbstractC47449Kxe abstractC47449Kxe, C45999KXn c45999KXn) {
        c45999KXn.A0O(new C50362MLo(10, abstractC47449Kxe, c45999KXn));
    }

    public static final void A0D(C45999KXn c45999KXn) {
        if (AbstractC31177DnL.A1b(c45999KXn.A07.A05) && !C45293K2v.A04(c45999KXn).isEmpty()) {
            c45999KXn.A0I(new C50355MLh(c45999KXn, 46), false);
        }
    }

    public static final void A0E(C45999KXn c45999KXn, int i) {
        String id;
        C45128JyU c45128JyU = (C45128JyU) AbstractC001800i.A0O(((C45293K2v) c45999KXn.A0L()).A02, i);
        if (c45128JyU != null) {
            LLR llr = c45999KXn.A03;
            String str = c45128JyU.A0A;
            if (str != null && str.length() != 0) {
                id = String.valueOf(str);
            } else {
                id = c45128JyU.A06.getId();
            }
            LLR.A00(null, null, null, null, llr, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, Integer.valueOf(i), Integer.valueOf(AbstractC31172DnG.A03(((C45293K2v) c45999KXn.A0L()).A02, 1)), null, null, "INTERACTION_CARD_VIEW", "TAP", null, id, null, null, null, null, null, null, null);
        }
    }

    public static final void A0H(C45999KXn c45999KXn, InterfaceC16820sZ interfaceC16820sZ) {
        UserSession userSession = c45999KXn.A02;
        C23031Ai A00 = AbstractC23021Ah.A00(userSession);
        EnumC92974Es enumC92974Es = ((C92984Et) c45999KXn.A05.A0N.getValue()).A04;
        if (enumC92974Es != EnumC92974Es.A0A && enumC92974Es != EnumC92974Es.A09) {
            InterfaceC16530ry interfaceC16530ry = A00.A1O;
            C0YR[] c0yrArr = C23031Ai.A8c;
            if (AbstractC43594JPz.A0B(A00, interfaceC16530ry, c0yrArr, 500) < 1 && C18U.A06(C06090Tz.A05, userSession, 36321722379413234L)) {
                c45999KXn.A0M(new C49447LtL(new ME1(47, interfaceC16820sZ, c45999KXn), new MHN(c45999KXn, 48), new MHN(c45999KXn, 49)));
                AbstractC167027dH.A16(A00, interfaceC16530ry, c0yrArr, 500);
                return;
            }
        }
        interfaceC16820sZ.invoke();
    }

    private final void A0I(InterfaceC16660sJ interfaceC16660sJ, boolean z) {
        Location lastLocation;
        C1VW c1vw = C1VW.A00;
        if (c1vw == null) {
            lastLocation = null;
        } else {
            UserSession userSession = this.A02;
            lastLocation = c1vw.getLastLocation(userSession, "FriendMapViewModel");
            if (z || lastLocation == null || !AbstractC103794ly.A00(lastLocation)) {
                c1vw.requestLocationUpdates(userSession, new C56448P4j(interfaceC16660sJ, 2), "FRIEND_MAP", true);
                return;
            }
        }
        interfaceC16660sJ.invoke(lastLocation);
    }

    private final boolean A0J() {
        boolean A1X = AbstractC167007dF.A1X(((C92984Et) this.A05.A0N.getValue()).A04, EnumC92974Es.A09);
        boolean z = !this.A06.A02(C05F.A00).A01;
        if ((A1X || z || A0P() != null) && C3LA.A03(this.A02)) {
            return true;
        }
        return false;
    }

    public final void A0Q() {
        A0C(C46004KXs.A00, this);
        A0M(C49454LtS.A00);
        A0F(this, 400L);
    }

    public final void A0R() {
        Object obj;
        A0N(C49454LtS.A00, 0L);
        Iterator A03 = C45293K2v.A03(this);
        while (true) {
            if (A03.hasNext()) {
                obj = A03.next();
                if (C14360o3.A0K(((C45128JyU) obj).A0B, this.A07.A06)) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        C45128JyU c45128JyU = (C45128JyU) obj;
        if (c45128JyU != null) {
            c45128JyU.A00 = false;
            this.A07.A06 = null;
            A0N(new C49427Lt1(c45128JyU), 0L);
            A05(c45128JyU.A03, this, 15.0f, 0L, true, true, false);
        }
    }

    public final void A0T(EnumC46298KeU enumC46298KeU, boolean z) {
        if (C18U.A06(C06090Tz.A05, this.A02, 36321722379347697L)) {
            A0U(enumC46298KeU, z, false);
        }
    }

    public final void A0U(EnumC46298KeU enumC46298KeU, boolean z, boolean z2) {
        M6W m6w = new M6W(enumC46298KeU, this, z, z2);
        if (z) {
            m6w.run();
        } else {
            A06(enumC46298KeU, this, C05F.A0N, new C50152MDf(m6w, 6));
        }
    }

    public final void A0V(C45044JwZ c45044JwZ) {
        LatLng A0L;
        Number valueOf;
        if (c45044JwZ != null) {
            A0L = new LatLng(c45044JwZ.A00, c45044JwZ.A01);
        } else {
            Location A01 = A01(this);
            if (A01 == null || (A0L = AbstractC43594JPz.A0L(A01)) == null) {
                return;
            }
        }
        UserSession userSession = this.A02;
        User A02 = AnonymousClass189.A00(userSession).A02(userSession.userId);
        if (A02 != null) {
            if (c45044JwZ != null) {
                valueOf = Integer.valueOf(c45044JwZ.A02);
            } else {
                valueOf = Float.valueOf(250.0f);
            }
            A0C(new C46001KXp(new C45128JyU(A0L, null, A02, C05F.A0C, "0", null, null, null, Integer.MAX_VALUE, 0L, false, false, false, true, false, false, false, false, false, true)), this);
            A0N(new C49441LtF(A0L, valueOf.doubleValue()), 0L);
            A0M(new C49448LtM(new LatLng(A0L.A00, A0L.A01), 15.8f, true, false));
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x002d, code lost:
    
        if (r9 != null) goto L13;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A0Y(java.util.List r9) {
        /*
            r8 = this;
            com.instagram.common.session.UserSession r5 = r8.A02
            r6 = 0
            X.0Tz r4 = X.C06090Tz.A05
            r0 = 36321722378954476(0x810a6a000726ec, double:3.033341716062965E-306)
            boolean r0 = X.C18U.A06(r4, r5, r0)
            if (r0 == 0) goto L51
            X.Kxe r0 = X.C45293K2v.A00(r8)
            boolean r0 = r0 instanceof X.C46004KXs
            if (r0 == 0) goto L51
            X.L58 r7 = r8.A07
            boolean r0 = r7.A08
            r3 = 1
            if (r0 == 0) goto L6b
            java.util.Set r1 = X.C45293K2v.A04(r8)
            boolean r0 = r1 instanceof java.util.Collection
            if (r0 == 0) goto L52
            boolean r0 = r1.isEmpty()
            if (r0 == 0) goto L52
        L2d:
            if (r9 == 0) goto L6b
        L2f:
            r7.A08 = r6
            r0 = 48
            X.MLh r2 = new X.MLh
            r2.<init>(r8, r0)
            r0 = 36321722382296853(0x810a6a003a2715, double:3.0333417181766976E-306)
            X.C18U.A06(r4, r5, r0)
            X.LtI r0 = new X.LtI
            r0.<init>(r2, r3)
            r8.A0M(r0)
            if (r3 == 0) goto L51
            X.LtQ r2 = X.C49452LtQ.A00
            r0 = 2000(0x7d0, double:9.88E-321)
            r8.A0N(r2, r0)
        L51:
            return
        L52:
            java.util.Iterator r2 = r1.iterator()
        L56:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L2d
            X.JyU r1 = X.AbstractC43592JPx.A0j(r2)
            boolean r0 = r1.A06(r5)
            if (r0 != 0) goto L56
            boolean r0 = r1.A0G
            if (r0 == 0) goto L56
            goto L2f
        L6b:
            r3 = 0
            goto L2f
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C45999KXn.A0Y(java.util.List):void");
    }

    public final void A0Z(boolean z, String str) {
        this.A07.A00 = -1L;
        A0C(C46004KXs.A00, this);
        A0M(C49454LtS.A00);
        if (C18U.A06(C06090Tz.A05, this.A02, 36321722382296853L) && z) {
            A0M(new C49433Lt7(str));
        }
        A0Y(null);
    }

    @Override // X.AbstractC52922bZ
    public final void onCleared() {
        L58 l58 = this.A07;
        l58.A09 = false;
        l58.A05 = null;
        l58.A08 = false;
        l58.A02 = null;
        l58.A04 = null;
        l58.A00 = -1L;
    }

    @Override // X.InterfaceC65626Tpm
    public final void onPause(C07X c07x) {
        this.A07.A09 = true;
        AbstractC25229BEm.A1R(this.A05.A03);
    }

    public static final EnumC92974Es A03(C45999KXn c45999KXn) {
        if (!c45999KXn.A0J() && (C45293K2v.A00(c45999KXn) instanceof C46004KXs)) {
            L58 l58 = c45999KXn.A07;
            if ((AbstractC31177DnL.A1b(l58.A03) || l58.A03 == null) && C3LA.A03(c45999KXn.A02)) {
                l58.A03 = AbstractC166997dE.A0a();
                return ((C92984Et) c45999KXn.A05.A0N.getValue()).A04;
            }
            return null;
        }
        return null;
    }

    public static final void A0G(C45999KXn c45999KXn, String str) {
        java.util.Set A04 = C45293K2v.A04(c45999KXn);
        ArrayList A1E = AbstractC166987dD.A1E();
        for (Object obj : A04) {
            C14360o3.A0B(str, 0);
            if (str.equals(C45128JyU.A00((C45128JyU) obj))) {
                A1E.add(obj);
            }
        }
        java.util.Set A0k = AbstractC001800i.A0k(A1E);
        Iterator it = ((C45293K2v) c45999KXn.A0L()).A02.iterator();
        int i = 0;
        while (true) {
            if (it.hasNext()) {
                if (C14360o3.A0K(C45128JyU.A01(it.next()), str)) {
                    break;
                } else {
                    i++;
                }
            } else {
                i = -1;
                break;
            }
        }
        AbstractC47449Kxe A00 = C45293K2v.A00(c45999KXn);
        if (A00 instanceof C46002KXq) {
            String str2 = ((C46002KXq) A00).A02;
            if (str2 == null || str2.length() == 0) {
                A0E(c45999KXn, i);
            }
            c45999KXn.A0O(new C43815JZc(A00, A0k, str, i, 4));
        } else {
            c45999KXn.A0M(new C49460LtY(false, C50239MGu.A00));
            A0C(new C46002KXq(A01(c45999KXn), str, str, A0k, i), c45999KXn);
        }
        ArrayList A0q = AbstractC167017dG.A0q(A0k);
        Iterator it2 = A0k.iterator();
        while (it2.hasNext()) {
            A0q.add(AbstractC43592JPx.A0j(it2).A04);
        }
        c45999KXn.A0M(new C49439LtD(A0q));
    }

    public static final boolean A0K(C45999KXn c45999KXn, java.util.Set set) {
        ArrayList A1E = AbstractC166987dD.A1E();
        for (Object obj : set) {
            if (((C45128JyU) obj).A0J) {
                A1E.add(obj);
            }
        }
        if (!A1E.isEmpty()) {
            if (C18U.A06(C06090Tz.A05, c45999KXn.A02, 36321722382100242L)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final C45044JwZ A0P() {
        LatLng latLng;
        Location A01 = A01(this);
        if (A01 != null) {
            latLng = AbstractC43594JPz.A0L(A01);
        } else {
            latLng = null;
        }
        Object obj = null;
        if (latLng == null) {
            return null;
        }
        Iterator it = ((C92984Et) this.A05.A0N.getValue()).A05.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            C45044JwZ c45044JwZ = (C45044JwZ) next;
            if (latLng.A00(new LatLng(c45044JwZ.A00, c45044JwZ.A01)) <= c45044JwZ.A02) {
                obj = next;
                break;
            }
        }
        return (C45044JwZ) obj;
    }

    public final void A0S(Location location) {
        AbstractC166987dD.A1Z(new MC4(location, this, null, 47), AbstractC141776au.A00(this));
    }
}
