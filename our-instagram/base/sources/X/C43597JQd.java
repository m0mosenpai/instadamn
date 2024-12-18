package X;

import android.content.Context;
import android.os.Parcelable;
import android.os.SystemClock;
import android.text.SpannableString;
import com.facebook.catalyst.modules.cameraroll.CameraRollManager;
import com.facebook.common.dextricks.JITProfilePQR;
import com.facebook.common.dextricks.StringTreeSet;
import com.facebook.forker.Process;
import com.facebook.msys.mca.Mailbox;
import com.facebook.msys.mca.MailboxCallback;
import com.facebook.msys.mca.MailboxFutureImpl;
import com.facebook.msys.mci.PlatformLogger;
import com.facebook.msys.mci.TraceInfo;
import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.SimpleImageUrl;
import com.instagram.debug.devoptions.direct.burner.BurnerSendSettingsHelper;
import com.instagram.direct.capabilities.Capabilities;
import com.instagram.direct.lockedchat.LockedChatKillSwitch;
import com.instagram.direct.visual.DirectVisualMessageViewerController;
import com.instagram.model.reels.Reel;
import com.instagram.react.modules.base.IgReactQEModule;
import com.instagram.user.model.User;
import go.Seq;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.function.Consumer;

/* renamed from: X.JQd, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C43597JQd implements C6D2 {
    public final int A00;
    public final Object A01;

    public C43597JQd(Long l, int i) {
        this.A00 = i;
        switch (i) {
            case 45:
            case JITProfilePQR.MEGA_ZIP_NAME_PREFIX_LEN /* 46 */:
            case BurnerSendSettingsHelper.MESSAGE_SEND_BATCH_SIZE /* 50 */:
            case 51:
                this.A01 = l;
                return;
            case 47:
            case 48:
            case 49:
            default:
                this.A01 = l;
                return;
        }
    }

    public static C42221xC A00(C42221xC c42221xC, Object obj, int i) {
        return c42221xC.A0K(new C43597JQd(obj, i));
    }

    public static C42221xC A01(C42221xC c42221xC, InterfaceC16660sJ interfaceC16660sJ, int i) {
        return c42221xC.A0L(new C43597JQd(i, interfaceC16660sJ));
    }

    public static C42221xC A02(C42221xC c42221xC, InterfaceC16660sJ interfaceC16660sJ, int i) {
        return c42221xC.A0J(new C43597JQd(i, interfaceC16660sJ));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v6, types: [java.util.AbstractCollection, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r5v7, types: [java.util.AbstractCollection, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r5v8, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r5v9, types: [X.0sl] */
    /* JADX WARN: Type inference failed for: r6v0, types: [X.L36, java.lang.Object] */
    @Override // X.C6D2
    public final /* bridge */ /* synthetic */ Object apply(Object obj) {
        LK0 A00;
        int i;
        Exception exc;
        Object c44826Jt0;
        AbstractC135836Cl abstractC135836Cl;
        Object obj2;
        ?? arrayList;
        Boolean bool;
        int i2;
        Long l;
        C49172Lop c49172Lop;
        long j;
        int i3;
        String ByF;
        String BLb;
        Long BLc;
        int i4;
        C2EY c2ey;
        switch (this.A00) {
            case 0:
                UserSession userSession = (UserSession) this.A01;
                C006802i c006802i = C006802i.A0p;
                C47214Ktn c47214Ktn = new C47214Ktn(new MHL(userSession, 28));
                boolean A02 = C6CB.A02(C6CE.A00(userSession).A00, 36315928473112343L);
                C137266Jf c137266Jf = new C137266Jf((Mailbox) obj);
                ?? obj3 = new Object();
                C47311KvM c47311KvM = new C47311KvM(userSession);
                C14360o3.A0A(c006802i);
                return new LAI(obj3, c47214Ktn, c137266Jf, c006802i, c47311KvM, A02);
            case 1:
                LAI lai = (LAI) obj;
                UserSession userSession2 = (UserSession) this.A01;
                C006802i c006802i2 = C006802i.A0p;
                C14360o3.A07(c006802i2);
                C14360o3.A0A(lai);
                ExecutorService newSingleThreadExecutor = Executors.newSingleThreadExecutor();
                C14360o3.A07(newSingleThreadExecutor);
                return new LID(lai, AbstractC40691uc.A01(userSession2), c006802i2, C05F.A01, newSingleThreadExecutor);
            case 2:
                LAI lai2 = (LAI) obj;
                lai2.A04(EnumC46206Kci.A0E).A04(new LSD(14, this.A01, lai2));
                return C0eB.A00;
            case 3:
                A00 = ((LAI) obj).A00();
                i = 16;
                obj2 = this.A01;
                break;
            case 4:
                return LFN.A00.A00(((C44546Jmq) this.A01).A05).thenAccept((Consumer) new M8M(4, new MM0(obj, 31)));
            case 5:
                C47967LIb c47967LIb = ((LAI) obj).A00;
                A00 = new LK0();
                K3W k3w = c47967LIb.A02;
                C44176Jff c44176Jff = new C44176Jff(c47967LIb, A00, 5);
                InterfaceExecutorC135866Co ASj = k3w.mMailboxApiHandleMetaProvider.ASj(2);
                MailboxFutureImpl mailboxFutureImpl = new MailboxFutureImpl(ASj);
                mailboxFutureImpl.Ecq(c44176Jff);
                if (!ASj.ELJ(new C44176Jff(k3w, mailboxFutureImpl, 25))) {
                    mailboxFutureImpl.cancel(false);
                }
                i = 17;
                obj2 = this.A01;
                break;
            case 6:
                A00 = ((LAI) obj).A03();
                i = 18;
                obj2 = this.A01;
                break;
            case 7:
                A00 = ((LAI) obj).A06(C05F.A01);
                i = 19;
                obj2 = this.A01;
                break;
            case 8:
                LFN lfn = LFN.A00;
                C44546Jmq c44546Jmq = (C44546Jmq) this.A01;
                return lfn.A00(c44546Jmq.A05).thenAccept((Consumer) new M8M(4, new C50370MLx(32, obj, c44546Jmq)));
            case 9:
                LFN lfn2 = LFN.A00;
                C44458JlQ c44458JlQ = (C44458JlQ) this.A01;
                return lfn2.A00(c44458JlQ.A04).thenAccept((Consumer) new M8M(9, new C50370MLx(35, obj, c44458JlQ)));
            case 10:
                C14360o3.A0B(obj, 0);
                C44460JlS c44460JlS = (C44460JlS) this.A01;
                c44460JlS.A07.A03();
                c44460JlS.A09.A04 = true;
                LFN.A00.A00(c44460JlS.A05).thenAccept((Consumer) new M8M(11, new C50370MLx(36, obj, c44460JlS)));
                return C0eB.A00;
            case 11:
                C48519LdH c48519LdH = (C48519LdH) this.A01;
                ((AbstractC2056898s) c48519LdH.A09.getValue()).A05("MAILBOX_API_READY");
                A00 = ((LAI) obj).A01();
                i = 28;
                obj2 = c48519LdH;
                break;
            case IgReactQEModule.CONFIG_KEY_OFFSET /* 12 */:
                LAI lai3 = (LAI) obj;
                if (lai3.A04) {
                    LLH llh = lai3.A01;
                    A00 = new LK0();
                    if (!AbstractC25231BEo.A1b(llh.A01.A00)) {
                        exc = new Exception();
                    } else {
                        L36 l36 = llh.A00;
                        if (l36.A03) {
                            c44826Jt0 = new C44826Jt0(Boolean.valueOf(l36.A04));
                            A00.A05(c44826Jt0);
                        } else {
                            exc = new Exception();
                        }
                    }
                    c44826Jt0 = new C44827Jt1(exc);
                    A00.A05(c44826Jt0);
                } else {
                    C47967LIb c47967LIb2 = lai3.A00;
                    A00 = new LK0();
                    if (!AbstractC25231BEo.A1b(c47967LIb2.A01.A00)) {
                        C47967LIb.A01(A00);
                    } else {
                        K3W k3w2 = c47967LIb2.A02;
                        JRS jrs = new JRS(A00, 6);
                        InterfaceExecutorC135866Co ASj2 = k3w2.mMailboxApiHandleMetaProvider.ASj(2);
                        MailboxFutureImpl mailboxFutureImpl2 = new MailboxFutureImpl(ASj2);
                        mailboxFutureImpl2.Ecq(jrs);
                        if (!ASj2.ELJ(new C44176Jff(k3w2, mailboxFutureImpl2, 19))) {
                            mailboxFutureImpl2.cancel(false);
                        }
                    }
                }
                i = 29;
                obj2 = this.A01;
                break;
            case JITProfilePQR.HEADER_COMPRESSED_SIZE_OFFSET /* 13 */:
                C47967LIb c47967LIb3 = ((LAI) obj).A00;
                InterfaceC41521w1 interfaceC41521w1 = c47967LIb3.A00;
                if (interfaceC41521w1 != null) {
                    InterfaceC135846Cm interfaceC135846Cm = c47967LIb3.A02.mMailboxApiHandleMetaProvider;
                    if (interfaceC135846Cm instanceof AbstractC135836Cl) {
                        abstractC135836Cl = (AbstractC135836Cl) interfaceC135846Cm;
                    } else {
                        abstractC135836Cl = null;
                    }
                    C14360o3.A0A(abstractC135836Cl);
                    abstractC135836Cl.A04(new JRS(interfaceC41521w1, 13));
                }
                ((C48519LdH) this.A01).A01 = false;
                return C0eB.A00;
            case 14:
                A00 = new LK0();
                K3W k3w3 = ((L8V) obj).A00;
                JRS jrs2 = new JRS(A00, 18);
                InterfaceExecutorC135866Co ASj3 = k3w3.mMailboxApiHandleMetaProvider.ASj(2);
                MailboxFutureImpl mailboxFutureImpl3 = new MailboxFutureImpl(ASj3);
                mailboxFutureImpl3.Ecq(jrs2);
                if (!ASj3.ELJ(new C44176Jff(k3w3, mailboxFutureImpl3, 24))) {
                    mailboxFutureImpl3.cancel(false);
                }
                i = 30;
                obj2 = this.A01;
                break;
            case Process.SIGTERM /* 15 */:
                A00 = ((LAI) obj).A02();
                i = 31;
                obj2 = this.A01;
                break;
            case 16:
                A00 = ((LAI) obj).A00();
                i = 32;
                obj2 = this.A01;
                break;
            case 17:
                C47967LIb c47967LIb4 = ((LAI) obj).A00;
                A00 = new LK0();
                if (!AbstractC25231BEo.A1b(c47967LIb4.A01.A00)) {
                    C47967LIb.A01(A00);
                } else {
                    K3W k3w4 = c47967LIb4.A02;
                    C44176Jff c44176Jff2 = new C44176Jff(c47967LIb4, A00, 4);
                    InterfaceExecutorC135866Co ASj4 = k3w4.mMailboxApiHandleMetaProvider.ASj(2);
                    MailboxFutureImpl mailboxFutureImpl4 = new MailboxFutureImpl(ASj4);
                    mailboxFutureImpl4.Ecq(c44176Jff2);
                    if (!ASj4.ELJ(new C44176Jff(k3w4, mailboxFutureImpl4, 21))) {
                        mailboxFutureImpl4.cancel(false);
                    }
                }
                i = 33;
                obj2 = this.A01;
                break;
            case 18:
                LAI lai4 = (LAI) obj;
                lai4.A02().A04(new LSD(18, this.A01, lai4));
                return C0eB.A00;
            case Process.SIGSTOP /* 19 */:
                A00 = ((LAI) obj).A03();
                i = 35;
                obj2 = this.A01;
                break;
            case 20:
                LAI lai5 = (LAI) obj;
                C14360o3.A0B(lai5, 0);
                C47967LIb c47967LIb5 = lai5.A00;
                A00 = new LK0();
                K3W k3w5 = c47967LIb5.A02;
                InterfaceExecutorC135866Co ASj5 = k3w5.mMailboxApiHandleMetaProvider.ASj(2);
                MailboxFutureImpl mailboxFutureImpl5 = new MailboxFutureImpl(ASj5);
                if (!ASj5.ELJ(new C44176Jff(k3w5, mailboxFutureImpl5, 16))) {
                    mailboxFutureImpl5.cancel(false);
                }
                mailboxFutureImpl5.addResultCallback(new JRS(A00, 11));
                i = 36;
                obj2 = this.A01;
                break;
            case 21:
            case 22:
            case 23:
            case 24:
            case 31:
            case 33:
            case 34:
            case 38:
            case 39:
            case 40:
            case Seq.NULL_REFNUM /* 41 */:
            case Seq.RefTracker.REF_OFFSET /* 42 */:
            case 43:
            case 44:
            case 52:
            case 53:
            case 54:
            case 56:
            case 58:
            case 59:
            case 62:
            case StringTreeSet.PAYLOAD_MASK /* 63 */:
            case 65:
            case 66:
            case 67:
            case 68:
            case 69:
            default:
                return ((InterfaceC16660sJ) this.A01).invoke(obj);
            case 25:
                InterfaceC132965zL interfaceC132965zL = (InterfaceC132965zL) obj;
                C14360o3.A0A(interfaceC132965zL);
                C43634JRs c43634JRs = (C43634JRs) this.A01;
                return new JRp(interfaceC132965zL, c43634JRs.A01, c43634JRs.A03, c43634JRs.A05);
            case 26:
                List list = (List) obj;
                C14360o3.A0A(list);
                boolean z = !list.isEmpty();
                UserSession userSession3 = ((C43787JYa) this.A01).A05;
                int size = list.size();
                int i5 = 0;
                for (int i6 = 0; i6 < size; i6++) {
                    if (((C2EH) list.get(i6)).Cf8(userSession3)) {
                        i5++;
                    }
                }
                return new C51729Mt8(i5, z, 2);
            case 27:
                JSO jso = (JSO) obj;
                C43787JYa c43787JYa = (C43787JYa) this.A01;
                C14360o3.A0A(jso);
                C27F c27f = c43787JYa.A06;
                AbstractC46972Dl abstractC46972Dl = jso.A00;
                c27f.A02 = abstractC46972Dl.A04;
                List list2 = jso.A03;
                c27f.A07 = list2;
                int i7 = abstractC46972Dl.A00;
                c27f.A04 = AbstractC31239DoM.A00(Integer.valueOf(i7));
                C46922Dg c46922Dg = ((C2DU) c43787JYa.A0B).A0C;
                C4I3 c4i3 = jso.A01;
                C14360o3.A06(c4i3);
                c27f.A05 = c46922Dg.A0B(abstractC46972Dl, c4i3).toString();
                c27f.A03 = c4i3.name();
                Boolean bool2 = jso.A02;
                c27f.A01 = bool2;
                if (bool2.booleanValue()) {
                    arrayList = C16930sl.A00;
                } else {
                    int i8 = 0;
                    if (c4i3 == C4I3.A03 && i7 == -1) {
                        arrayList = new ArrayList();
                        int size2 = list2.size();
                        while (i8 < size2) {
                            C2EC c2ec = (C2EC) list2.get(i8);
                            UserSession userSession4 = c43787JYa.A05;
                            C14360o3.A0A(c2ec);
                            if (!AbstractC1121354g.A02(userSession4, c2ec, i7)) {
                                arrayList.add(c2ec);
                            }
                            i8++;
                        }
                    } else {
                        arrayList = new ArrayList();
                        int size3 = list2.size();
                        while (i8 < size3) {
                            C2EC c2ec2 = (C2EC) list2.get(i8);
                            C14360o3.A0A(c2ec2);
                            UserSession userSession5 = c43787JYa.A05;
                            if (c4i3.A00(userSession5, c2ec2)) {
                                C14360o3.A0B(c2ec2, 4);
                                C2E4 A0B = c46922Dg.A0B(abstractC46972Dl, c4i3);
                                long BLF = c2ec2.BLF();
                                String C7q = c2ec2.C7q();
                                int ceil = (int) Math.ceil(BLF / 1000000.0d);
                                if (C7q == null) {
                                    C7q = (String) C2E1.A00.A01;
                                }
                                if (C2Dz.A00.A02.compare(A0B, new C2E4(ceil, C7q)) < 1 && abstractC46972Dl.A00(userSession5, c2ec2)) {
                                    arrayList.add(c2ec2);
                                }
                            }
                            i8++;
                        }
                    }
                }
                c27f.A06 = arrayList;
                return new JSO(abstractC46972Dl, c4i3, bool2, arrayList);
            case 28:
                JSO jso2 = (JSO) obj;
                if (LockedChatKillSwitch.isLockedChatEnabled(((C43787JYa) this.A01).A05, false)) {
                    AbstractC46972Dl abstractC46972Dl2 = jso2.A00;
                    C44037JdO c44037JdO = C44037JdO.A00;
                    boolean A0K = C14360o3.A0K(abstractC46972Dl2, c44037JdO);
                    List list3 = jso2.A03;
                    C14360o3.A06(list3);
                    ArrayList arrayList2 = new ArrayList();
                    Iterator it = list3.iterator();
                    if (A0K) {
                        while (it.hasNext()) {
                            Object next = it.next();
                            if (((C2EF) next).BOU() == 1) {
                                arrayList2.add(next);
                            }
                        }
                    } else {
                        while (it.hasNext()) {
                            Object next2 = it.next();
                            if (((C2EF) next2).BOU() != 1) {
                                arrayList2.add(next2);
                            }
                        }
                    }
                    if (C14360o3.A0K(abstractC46972Dl2, c44037JdO)) {
                        bool = Boolean.valueOf(list3.isEmpty());
                    } else {
                        bool = jso2.A02;
                    }
                    return new JSO(abstractC46972Dl2, jso2.A01, bool, arrayList2);
                }
                return jso2;
            case CameraRollManager.IMAGES_MEDIA_LATITUDE_LONGITUDE_DEPRECATED_API_LEVEL /* 29 */:
                JRW jrw = (JRW) obj;
                C14360o3.A0B(jrw, 0);
                return JRX.A00(jrw, (JRX) this.A01);
            case 30:
                JRW jrw2 = (JRW) obj;
                JRX jrx = (JRX) this.A01;
                C14360o3.A0A(jrw2);
                C46h A002 = JRX.A00(jrw2, jrx);
                Integer num = jrw2.A02;
                C14360o3.A06(num);
                int intValue = num.intValue();
                C4I3 c4i32 = jrw2.A01;
                C14360o3.A06(c4i32);
                InterfaceC50517MRu interfaceC50517MRu = (InterfaceC50517MRu) A002.A04();
                if (interfaceC50517MRu != null) {
                    i2 = interfaceC50517MRu.getCount();
                    if (interfaceC50517MRu.getCount() > 0) {
                        l = Long.valueOf(interfaceC50517MRu.BLH(interfaceC50517MRu.getCount() - 1));
                        return new C65782Tu0(c4i32, l, C16910sj.A00, intValue, i2);
                    }
                } else {
                    i2 = 0;
                }
                l = null;
                return new C65782Tu0(c4i32, l, C16910sj.A00, intValue, i2);
            case 32:
                JRO jro = (JRO) obj;
                C14360o3.A0B(jro, 0);
                C44043JdU c44043JdU = ((JTM) this.A01).A0B;
                InterfaceC50517MRu interfaceC50517MRu2 = jro.A01;
                AbstractC46972Dl abstractC46972Dl3 = jro.A00;
                boolean z2 = jro.A03;
                boolean z3 = jro.A06;
                boolean z4 = jro.A04;
                boolean z5 = jro.A05;
                C3o9 c3o9 = jro.A02;
                if (interfaceC50517MRu2 != null) {
                    C69613Av c69613Av = c44043JdU.A05.A00;
                    if (c69613Av != null) {
                        c69613Av.A04();
                    }
                    C17u A0C = C17s.A0C(0, interfaceC50517MRu2.getCount());
                    ArrayList<C09530e4> arrayList3 = new ArrayList();
                    Iterator it2 = A0C.iterator();
                    while (it2.hasNext()) {
                        int A003 = ((AbstractC16880sg) it2).A00();
                        C49173Loq A004 = C49173Loq.A0W.A00(c44043JdU.A01, interfaceC50517MRu2, A003);
                        if (!A004.A0A) {
                            arrayList3.add(new C09530e4(Integer.valueOf(A003), A004));
                        }
                    }
                    ArrayList arrayList4 = new ArrayList(AbstractC06950Ym.A1E(arrayList3, 10));
                    for (C09530e4 c09530e4 : arrayList3) {
                        C49173Loq c49173Loq = (C49173Loq) c09530e4.A01;
                        int intValue2 = ((Number) c09530e4.A00).intValue();
                        UserSession userSession6 = c44043JdU.A01;
                        User A01 = C17060sy.A01.A01(userSession6);
                        C31229DoC c31229DoC = null;
                        if (intValue2 >= 0 && intValue2 <= interfaceC50517MRu2.getCount() - 1 && (ByF = interfaceC50517MRu2.ByF(intValue2)) != null && (BLb = interfaceC50517MRu2.BLb(intValue2)) != null && (BLc = interfaceC50517MRu2.BLc(intValue2)) != null) {
                            long longValue = BLc.longValue();
                            boolean CfX = interfaceC50517MRu2.CfX(intValue2);
                            String BLa = interfaceC50517MRu2.BLa(intValue2);
                            Integer BV2 = interfaceC50517MRu2.BV2(intValue2);
                            if (BV2 != null) {
                                i4 = BV2.intValue();
                            } else {
                                i4 = 0;
                            }
                            if (AbstractC85433rY.A07("").isEmpty()) {
                                c2ey = C2EY.A1i;
                            } else {
                                c2ey = C2EY.A19;
                            }
                            List BsI = interfaceC50517MRu2.BsI(intValue2);
                            ArrayList arrayList5 = new ArrayList(AbstractC06950Ym.A1E(BsI, 10));
                            Iterator it3 = BsI.iterator();
                            while (it3.hasNext()) {
                                arrayList5.add(((C47615L1a) it3.next()).A02);
                            }
                            c49172Lop = new C49172Lop(c2ey, A01, ByF, BLa, BLb, arrayList5, i4, longValue, CfX);
                        } else {
                            c49172Lop = null;
                        }
                        boolean A22 = AbstractC23021Ah.A00(userSession6).A22();
                        List A005 = AbstractC43637JRv.A00(c49173Loq, c44043JdU.A06, A22);
                        long[] jArr = new long[2];
                        Long AlX = interfaceC50517MRu2.AlX(intValue2);
                        long j2 = 0;
                        if (AlX != null) {
                            j = AlX.longValue();
                        } else {
                            j = 0;
                        }
                        jArr[0] = j;
                        Long AlY = interfaceC50517MRu2.AlY(intValue2);
                        if (AlY != null) {
                            j2 = AlY.longValue();
                        }
                        jArr[1] = j2;
                        Parcelable.Creator creator = Capabilities.CREATOR;
                        AbstractC2054797v.A01(jArr);
                        Capabilities A006 = AbstractC209129Mu.A00(userSession6);
                        SpannableString AzD = interfaceC50517MRu2.AzD(intValue2);
                        Context context = c44043JdU.A00;
                        C43929Jbe c43929Jbe = c44043JdU.A03;
                        boolean z6 = A22;
                        C14360o3.A0B(A006, 1);
                        EnumC2054697t enumC2054697t = EnumC2054697t.A12;
                        if (A006.A00(enumC2054697t) && !((Boolean) c43929Jbe.A02.getValue()).booleanValue()) {
                            z6 = false;
                        }
                        C41891wf c41891wf = c44043JdU.A07;
                        C14360o3.A0B(c49173Loq, 0);
                        AbstractC167017dG.A1Q(A006, A005);
                        boolean z7 = false;
                        if ((!A006.A00(enumC2054697t) || AbstractC167007dF.A1Z(c43929Jbe.A02)) && A22 && (c41891wf.A0D(A005) || c49173Loq.CPo())) {
                            z7 = true;
                        }
                        InterfaceC50463MPr interfaceC50463MPr = c44043JdU.A02;
                        C9BW C1w = interfaceC50463MPr.C1w(null);
                        if (!LCG.A00(c49173Loq.A01)) {
                            if (c49173Loq.Bl6().size() == 1) {
                                AnonymousClass172 anonymousClass172 = (AnonymousClass172) c49173Loq.Bl6().get(0);
                                C18A A007 = AnonymousClass189.A00(userSession6);
                                SimpleImageUrl simpleImageUrl = User.A08;
                                c31229DoC = new C31229DoC(A007.A01(new User(anonymousClass172.getId(), anonymousClass172.getUsername()), false, false));
                            } else {
                                C0w9.A03("msys_thread_row_get_reel", "no members in 1:1 thread");
                            }
                        }
                        Reel Blq = interfaceC50463MPr.Blq(c31229DoC);
                        String valueOf = String.valueOf(interfaceC50517MRu2.C7B(intValue2));
                        Integer CC0 = interfaceC50517MRu2.CC0(intValue2);
                        if (CC0 != null) {
                            i3 = CC0.intValue();
                        } else {
                            i3 = 0;
                        }
                        String CC1 = interfaceC50517MRu2.CC1(intValue2);
                        if (CC1 == null) {
                            CC1 = "";
                        }
                        C44079Je4 c44079Je4 = new C44079Je4(new C6C2(null, valueOf), new C93834Jr(), CC1, i3);
                        String AZm = interfaceC50517MRu2.AZm(intValue2);
                        if (AZm == null || !C18U.A06(C06090Tz.A05, userSession6, 36313209753831239L)) {
                            AZm = null;
                        }
                        arrayList4.add(AbstractC43639JRx.A00(context, AzD, C1w, userSession6, A006, null, c43929Jbe, c44043JdU.A04, abstractC46972Dl3, c49172Lop, c49173Loq, c44079Je4, null, Blq, null, AZm, A005, intValue2, z6, z7, false, false, z2, z3, z4, z5, false, C14360o3.A0K(c3o9, c49173Loq.A04)));
                    }
                    if (c69613Av == null) {
                        return arrayList4;
                    }
                    c69613Av.A05();
                    return arrayList4;
                }
                return C16930sl.A00;
            case 35:
            case 36:
                return new C132955zK(new C09530e4(this.A01, obj));
            case 37:
                C49098Lnb c49098Lnb = (C49098Lnb) this.A01;
                C45279K2h c45279K2h = (C45279K2h) obj;
                c49098Lnb.A01 = c45279K2h;
                c49098Lnb.A02 = Integer.valueOf(c45279K2h.A00);
                c49098Lnb.A04 = c45279K2h.A0I;
                List A008 = c45279K2h.A0D.A00();
                C45120Jxp c45120Jxp = c45279K2h.A09;
                if (c45120Jxp != null && c45120Jxp.A03 != null) {
                    ArrayList arrayList6 = new ArrayList();
                    Object obj4 = A008.get(0);
                    if (obj4 != null && (obj4 instanceof C7M0)) {
                        A008.remove(0);
                        if (c45120Jxp.A06) {
                            arrayList6.add(obj4);
                        }
                    }
                    arrayList6.addAll((Collection) c45120Jxp.A00);
                    arrayList6.addAll(A008);
                    A008 = arrayList6;
                }
                Collections.reverse(A008);
                return new C51760Mtj(13, c45279K2h.A0G, c45279K2h.A07, Collections.unmodifiableList(A008));
            case 45:
                final Long l2 = (Long) this.A01;
                final K3a k3a = (K3a) obj;
                C137766Ly c137766Ly = C137766Ly.A0L;
                return C42221xC.A07(new InterfaceC1345866i() { // from class: X.Lbp
                    @Override // X.InterfaceC1345866i
                    public final void EpD(final C1346766r c1346766r) {
                        K3a k3a2 = K3a.this;
                        Long l3 = l2;
                        C137766Ly c137766Ly2 = C137766Ly.A0L;
                        final String A0o = AbstractC166997dE.A0o();
                        long longValue2 = l3.longValue();
                        MailboxCallback mailboxCallback = new MailboxCallback() { // from class: X.LU1
                            @Override // com.facebook.msys.mca.MailboxCallback
                            public final void onCompletion(Object obj5) {
                                C1346766r c1346766r2 = C1346766r.this;
                                String str = A0o;
                                C137766Ly c137766Ly3 = C137766Ly.A0L;
                                c1346766r2.A02(str);
                                c1346766r2.A00();
                            }
                        };
                        InterfaceExecutorC135866Co ASj6 = k3a2.mMailboxApiHandleMetaProvider.ASj(0);
                        MailboxFutureImpl A0D = AbstractC43592JPx.A0D(ASj6);
                        int A009 = AbstractC1346866s.A00(A0D);
                        TraceInfo A0F = AbstractC43592JPx.A0F(mailboxCallback, A0D, "MailboxTam", "runTamClientThreadSessionInsert");
                        if (!ASj6.ELJ(new LVI(A0D, k3a2, A0o, A009, 2, longValue2))) {
                            A0D.cancel(false);
                            AbstractC1346866s.A02(A009);
                            AbstractC1346866s.A03(A0F, "MailboxTam", "runTamClientThreadSessionInsert");
                        }
                        PlatformLogger.platformEventLog(5);
                    }
                }, AbstractC137146It.A00("insert_thread_session"));
            case JITProfilePQR.MEGA_ZIP_NAME_PREFIX_LEN /* 46 */:
                Long l3 = (Long) this.A01;
                C137766Ly c137766Ly2 = C137766Ly.A0L;
                return C42221xC.A07(new C44091JeG((K3a) obj, l3, 8), AbstractC137146It.A00("accept_message_request"));
            case 47:
                Object obj5 = this.A01;
                C137766Ly c137766Ly3 = C137766Ly.A0L;
                return C42221xC.A07(new C44091JeG(7, obj5, obj), AbstractC137146It.A00("dismiss_proactive_warnings_thread_banner"));
            case 48:
                Object obj6 = this.A01;
                C137766Ly c137766Ly4 = C137766Ly.A0L;
                return C42221xC.A07(new C44091JeG(9, obj6, obj), AbstractC137146It.A00("runTamClientSpamMessageFetch"));
            case 49:
                Object obj7 = this.A01;
                C137766Ly c137766Ly5 = C137766Ly.A0L;
                return C42221xC.A07(new C44091JeG(11, obj7, obj), AbstractC137146It.A00("load_secure_message_poll_list"));
            case BurnerSendSettingsHelper.MESSAGE_SEND_BATCH_SIZE /* 50 */:
                return C42221xC.A07(new C44091JeG((K3a) obj, (Long) this.A01, 15), AbstractC137146It.A00("rxmailbox_delete_message"));
            case 51:
                return C42221xC.A07(new C44091JeG((K3a) obj, (Long) this.A01, 13), AbstractC137146It.A00("rxmailbox_retry_message"));
            case 55:
            case 57:
                return this.A01;
            case 60:
                return ((AbstractC46516KiF) this.A01).A01().cast(obj);
            case 61:
                List list4 = (List) obj;
                String str = ((KZT) this.A01).A03.userId;
                C14360o3.A0A(list4);
                ArrayList arrayList7 = new ArrayList();
                for (Object obj8 : list4) {
                    JRL jrl = (JRL) obj8;
                    if (jrl.A04 != 29 || !str.equals(jrl.A0P)) {
                        arrayList7.add(obj8);
                    }
                }
                return arrayList7;
            case 64:
                C47700L4h c47700L4h = (C47700L4h) obj;
                C14360o3.A0B(c47700L4h, 0);
                K4D k4d = c47700L4h.A01;
                if (k4d != null) {
                    return new C49203LpK(k4d, AnonymousClass618.A00(((DirectVisualMessageViewerController) this.A01).A0m), new HashMap());
                }
                return null;
            case 70:
                C94054Kp c94054Kp = ((C45703KLg) this.A01).A00;
                c94054Kp.A00 = SystemClock.elapsedRealtime();
                C47909LEd c47909LEd = AbstractC46874KoH.A00(c94054Kp.A03).A00;
                c47909LEd.getClass();
                return c47909LEd.A01.A0L(new C43597JQd(59, new C50367MLu(c47909LEd, 26)));
        }
        A00.A04(new LS9(obj2, i));
        return C0eB.A00;
    }

    public C43597JQd(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public C43597JQd(int i, InterfaceC16660sJ interfaceC16660sJ) {
        this.A00 = i;
        switch (i) {
            case 21:
            case 23:
            case 24:
            case 31:
            case 33:
            case 34:
            case 38:
            case 39:
            case 40:
            case Seq.NULL_REFNUM /* 41 */:
            case Seq.RefTracker.REF_OFFSET /* 42 */:
            case 43:
            case 44:
            case 52:
            case 53:
            case 54:
            case 58:
            case 59:
            case 62:
            case StringTreeSet.PAYLOAD_MASK /* 63 */:
            case 65:
            case 66:
            case 67:
            case 68:
            case 69:
                break;
            case 22:
            case 25:
            case 26:
            case 27:
            case 28:
            case CameraRollManager.IMAGES_MEDIA_LATITUDE_LONGITUDE_DEPRECATED_API_LEVEL /* 29 */:
            case 30:
            case 32:
            case 35:
            case 36:
            case 37:
            case 45:
            case JITProfilePQR.MEGA_ZIP_NAME_PREFIX_LEN /* 46 */:
            case 47:
            case 48:
            case 49:
            case BurnerSendSettingsHelper.MESSAGE_SEND_BATCH_SIZE /* 50 */:
            case 51:
            case 55:
            case 56:
            case 57:
            case 60:
            case 61:
            case 64:
            default:
                C14360o3.A0B(interfaceC16660sJ, 1);
                break;
        }
        this.A01 = interfaceC16660sJ;
    }
}
