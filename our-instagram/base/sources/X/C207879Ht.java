package X;

import com.facebook.pando.PandoGraphQLRequest;
import com.facebook.shimmer.ShimmerFrameLayout;
import com.google.common.collect.ImmutableList;
import com.instagram.common.gallery.RemoteMedia;
import com.instagram.common.gallery.metadata.MediaUploadMetadata;
import com.instagram.common.gallery.model.GalleryItem;
import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.model.reels.Reel;
import com.instagram.react.modules.base.IgReactQEModule;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* renamed from: X.9Ht, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C207879Ht extends C1P1 {
    public final int A00;
    public final Object A01;

    public C207879Ht(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    @Override // X.C1P1
    public final void onFail(AbstractC115105If abstractC115105If) {
        int A0N;
        int i;
        String str;
        AnonymousClass249 anonymousClass249;
        EnumC114925Hg enumC114925Hg;
        Boolean bool;
        String str2;
        Throwable A01;
        switch (this.A00) {
            case 1:
                A0N = AbstractC167017dG.A0N(abstractC115105If, 1706501563);
                Throwable A012 = abstractC115105If.A01();
                if (A012 != null) {
                    ((AbstractC192798gL) this.A01).A00.A02(new C115095Ie(A012));
                }
                i = 1357178324;
                break;
            case 2:
                A0N = AbstractC167017dG.A0N(abstractC115105If, 854840106);
                Throwable A013 = abstractC115105If.A01();
                if (A013 != null) {
                    ((AbstractC192798gL) this.A01).A00.A02(new C115095Ie(A013));
                    i = -526193919;
                    break;
                } else {
                    C40781ul c40781ul = (C40781ul) abstractC115105If.A00();
                    C192808gM c192808gM = ((AbstractC192798gL) this.A01).A00;
                    if (c40781ul != null) {
                        c192808gM.A02(new C115115Ig(new C9CD(Integer.valueOf(c40781ul.mStatusCode), c40781ul.getErrorMessage(), c40781ul.mErrorTitle, 1, c40781ul.isFeedbackRequired())));
                        i = -141833607;
                        break;
                    } else {
                        c192808gM.A02(C7J2.A00());
                        i = 902492573;
                        break;
                    }
                }
            case 3:
                A0N = AbstractC167017dG.A0N(abstractC115105If, -731255276);
                AbstractC12430kl.A00("Flow fail", new C29899DGn(8, this.A01, abstractC115105If));
                i = -966052522;
                break;
            case 4:
                A0N = AbstractC167017dG.A0N(abstractC115105If, -605118451);
                AbstractC12430kl.A00("LoadingFlow fail", new C29899DGn(10, this.A01, abstractC115105If));
                i = -927297389;
                break;
            case 5:
                A0N = AbstractC167017dG.A0N(abstractC115105If, 471573901);
                C9LN c9ln = (C9LN) this.A01;
                UserSession userSession = c9ln.A18;
                C447324d c447324d = AnonymousClass229.A01(userSession).A01;
                InterfaceC40821up interfaceC40821up = (InterfaceC40821up) abstractC115105If.A00();
                String str3 = null;
                if (interfaceC40821up != null) {
                    str = interfaceC40821up.getLocalizedErrorMessage();
                } else {
                    str = null;
                }
                c447324d.A03 = true;
                C24Q c24q = c447324d.A04;
                c24q.A0C("data_request_failure", c447324d.A00);
                long j = c447324d.A00;
                if (str == null) {
                    str = "data_request_failure";
                }
                c447324d.A00 = c24q.A07(str, "", 17640780, j);
                if (AbstractC166987dD.A10(userSession).A2I() && (c9ln.A19.A08.A00 instanceof C208509Kk) && C18U.A06(C06090Tz.A06, userSession, 36321572054705780L)) {
                    C1816783z c1816783z = c9ln.A1C.A02;
                    if (c1816783z.A01() == EnumC198268pb.A07) {
                        anonymousClass249 = AnonymousClass249.VIDEO;
                    } else {
                        anonymousClass249 = AnonymousClass249.PHOTO;
                    }
                    C22C A014 = AnonymousClass229.A01(userSession);
                    if (c1816783z.A01.A0h == C5JK.A06) {
                        enumC114925Hg = EnumC114925Hg.FEED;
                    } else {
                        enumC114925Hg = null;
                    }
                    C183918Ds c183918Ds = c9ln.A1D;
                    if (c183918Ds != null) {
                        bool = Boolean.valueOf(c183918Ds.A03.A0G);
                    } else {
                        bool = null;
                    }
                    if (interfaceC40821up != null) {
                        str2 = interfaceC40821up.getErrorCode();
                        str3 = interfaceC40821up.getLocalizedErrorMessage();
                    } else {
                        str2 = null;
                    }
                    A014.A0F.A0R(enumC114925Hg, anonymousClass249, bool, "button", str2, str3);
                }
                i = 1895607826;
                break;
            case 6:
            case 8:
            case 9:
            case 10:
            default:
                super.onFail(abstractC115105If);
                return;
            case 7:
                A0N = C0f9.A03(1279535713);
                i = -1926255905;
                break;
            case 11:
                A0N = C0f9.A03(1400752233);
                if (abstractC115105If != null && (A01 = abstractC115105If.A01()) != null) {
                    C0w9.A06(AbstractC111324zv.A00(1689), "LocationUpdateMutation error", A01);
                }
                i = -1809623144;
                break;
            case IgReactQEModule.CONFIG_KEY_OFFSET /* 12 */:
                A0N = C0f9.A03(1313224157);
                C56255Oy2 c56255Oy2 = (C56255Oy2) this.A01;
                c56255Oy2.A06 = C05F.A0C;
                C56255Oy2.A04(c56255Oy2);
                i = 1941704600;
                break;
        }
        C0f9.A0A(i, A0N);
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0002. Please report as an issue. */
    @Override // X.C1P1
    public final void onFinish() {
        int A03;
        int i;
        int A032;
        int i2;
        Reel A0M;
        switch (this.A00) {
            case 1:
                A032 = C0f9.A03(316281361);
                AbstractC192848gQ abstractC192848gQ = ((AbstractC192798gL) this.A01).A00.A00;
                if (abstractC192848gQ != null) {
                    abstractC192848gQ.A01();
                }
                i2 = -875909234;
                C0f9.A0A(i2, A032);
                return;
            case 2:
                A032 = C0f9.A03(295862156);
                AbstractC192848gQ abstractC192848gQ2 = ((AbstractC192798gL) this.A01).A00.A00;
                if (abstractC192848gQ2 != null) {
                    abstractC192848gQ2.A01();
                }
                i2 = 2031004424;
                C0f9.A0A(i2, A032);
                return;
            case 3:
            case 4:
            default:
                super.onFinish();
                return;
            case 5:
                A032 = C0f9.A03(-1645900686);
                ((C9LN) this.A01).A07 = null;
                i2 = -96276591;
                C0f9.A0A(i2, A032);
                return;
            case 6:
                A032 = C0f9.A03(-1728316142);
                C218079kf c218079kf = (C218079kf) this.A01;
                c218079kf.A02 = false;
                C36275FzS c36275FzS = c218079kf.A09;
                String str = c36275FzS.A00;
                if (str != null && (A0M = c36275FzS.A01.A0M(str)) != null) {
                    ArrayList A1F = AbstractC166987dD.A1F(A0M.A0Q());
                    Collections.sort(A1F, new GRJ(0, c36275FzS, A0M.A0K()));
                    C218079kf.A03(c218079kf, A1F, 0);
                }
                i2 = -1781961100;
                C0f9.A0A(i2, A032);
                return;
            case 7:
                A03 = C0f9.A03(1765415487);
                i = 670160121;
                C0f9.A0A(i, A03);
                return;
            case 8:
                A032 = C0f9.A03(-580529283);
                C218099kh c218099kh = (C218099kh) this.A01;
                c218099kh.A05 = false;
                C218099kh.A01(c218099kh);
                i2 = -843065056;
                C0f9.A0A(i2, A032);
                return;
            case 9:
                A03 = C0f9.A03(-2014359911);
                C214939fV c214939fV = (C214939fV) this.A01;
                c214939fV.A04 = false;
                ShimmerFrameLayout shimmerFrameLayout = c214939fV.A00;
                if (shimmerFrameLayout != null) {
                    if (shimmerFrameLayout.getVisibility() == 0) {
                        ShimmerFrameLayout shimmerFrameLayout2 = c214939fV.A00;
                        if (shimmerFrameLayout2 != null) {
                            shimmerFrameLayout2.A03();
                            ShimmerFrameLayout shimmerFrameLayout3 = c214939fV.A00;
                            if (shimmerFrameLayout3 != null) {
                                shimmerFrameLayout3.setVisibility(8);
                            }
                        }
                    }
                    i = 1410781268;
                    C0f9.A0A(i, A03);
                    return;
                }
                C14360o3.A0F("shimmerView");
                throw C00O.createAndThrow();
        }
    }

    @Override // X.C1P1
    public final void onStart() {
        int A03;
        int i;
        switch (this.A00) {
            case 1:
                A03 = C0f9.A03(-1060145335);
                AbstractC192848gQ abstractC192848gQ = ((AbstractC192798gL) this.A01).A00.A00;
                if (abstractC192848gQ != null) {
                    abstractC192848gQ.A02();
                }
                i = -2127945693;
                break;
            case 2:
                A03 = C0f9.A03(-1557404489);
                AbstractC192848gQ abstractC192848gQ2 = ((AbstractC192798gL) this.A01).A00.A00;
                if (abstractC192848gQ2 != null) {
                    abstractC192848gQ2.A02();
                }
                i = 1490504830;
                break;
            case 3:
            case 4:
            case 5:
            case 7:
            default:
                super.onStart();
                return;
            case 6:
                A03 = C0f9.A03(1865493261);
                ((C218079kf) this.A01).A02 = true;
                i = -170147689;
                break;
            case 8:
                A03 = C0f9.A03(-1978537242);
                ((C218099kh) this.A01).A05 = true;
                i = -151735216;
                break;
        }
        C0f9.A0A(i, A03);
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0006. Please report as an issue. */
    @Override // X.C1P1
    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        int A03;
        int i;
        int A032;
        String str;
        int i2;
        Object obj2;
        Object obj3;
        List A00;
        InterfaceC16660sJ interfaceC16660sJ;
        String str2;
        List list;
        switch (this.A00) {
            case 2:
                A03 = C0f9.A03(-57678267);
                final C9QR c9qr = (C9QR) obj;
                int A0N = AbstractC167017dG.A0N(c9qr, -1913552427);
                C1W2 A002 = C1W2.A00();
                final C9QQ c9qq = (C9QQ) this.A01;
                A002.A01(new Runnable() { // from class: X.9QT
                    @Override // java.lang.Runnable
                    public final void run() {
                        try {
                            C9QQ c9qq2 = c9qq;
                            ((AbstractC192798gL) c9qq2).A00.A00(c9qq2.A01(c9qr));
                        } catch (C223529tj e) {
                            ((AbstractC192798gL) c9qq).A00.A02(new C115115Ig(new C9CD(null, e.getMessage(), "ParsingException", 1, false)));
                        }
                    }
                });
                C0f9.A0A(-1736233308, A0N);
                i = 50333933;
                C0f9.A0A(i, A03);
                return;
            case 3:
                A03 = C0f9.A03(1547645607);
                int A0N2 = AbstractC167017dG.A0N(obj, 105740070);
                AbstractC12430kl.A00("Flow success", new C29899DGn(9, this.A01, obj));
                C0f9.A0A(-296020485, A0N2);
                i = 535871952;
                C0f9.A0A(i, A03);
                return;
            case 4:
                A03 = C0f9.A03(202796742);
                int A0N3 = AbstractC167017dG.A0N(obj, 1507357913);
                AbstractC12430kl.A00("LoadingFlow success", new C29899DGn(11, this.A01, obj));
                C0f9.A0A(1971425972, A0N3);
                i = 1582870209;
                C0f9.A0A(i, A03);
                return;
            case 5:
                A032 = C0f9.A03(-451697409);
                C199108rD c199108rD = (C199108rD) obj;
                int A033 = C0f9.A03(-1897143639);
                C14360o3.A0B(c199108rD, 0);
                C9LN c9ln = (C9LN) this.A01;
                UserSession userSession = c9ln.A18;
                C447324d c447324d = AnonymousClass229.A01(userSession).A01;
                Iterator it = c199108rD.A03.iterator();
                int i3 = 0;
                while (it.hasNext()) {
                    i3 += ((C201068un) it.next()).A00().size();
                }
                boolean z = c199108rD.mFromDiskCache;
                c447324d.A03 = true;
                C24Q c24q = c447324d.A04;
                c24q.A0C("data_request_success", c447324d.A00);
                c24q.A09(c447324d.A00, "number_sticker", String.valueOf(i3));
                c24q.A09(c447324d.A00, "cache_response", String.valueOf(z));
                C46016KYe c46016KYe = c9ln.A0M;
                if (c46016KYe != null) {
                    c46016KYe.A0A.A04.clear();
                }
                C44063Jdo c44063Jdo = c9ln.A0B;
                if (c44063Jdo != null) {
                    c44063Jdo.A06.clear();
                }
                C8NZ c8nz = c9ln.A1A;
                C8NW c8nw = (C8NW) c8nz;
                c8nw.A0N = false;
                c8nw.A0M = false;
                if (!AnonymousClass483.A04(c199108rD.A03)) {
                    for (C201068un c201068un : c199108rD.A03) {
                        if (C14360o3.A0K(c201068un.A03, "cutout_stickers")) {
                            C75B A003 = C8KG.A00(userSession);
                            List A004 = c201068un.A00();
                            LinkedHashMap linkedHashMap = new LinkedHashMap();
                            ArrayList<C148276lx> arrayList = new ArrayList();
                            for (Object obj4 : A004) {
                                if (!C14360o3.A0K(((C148276lx) obj4).A0Z, "cut_out_sticker_bundle_id")) {
                                    arrayList.add(obj4);
                                }
                            }
                            for (C148276lx c148276lx : arrayList) {
                                String str3 = c148276lx.A0Z;
                                C206409Bx c206409Bx = (C206409Bx) ((Map) A003.A05.getValue()).get(str3);
                                if (c206409Bx != null) {
                                    str2 = c206409Bx.A01;
                                } else {
                                    str2 = null;
                                }
                                linkedHashMap.put(str3, new C206409Bx(c148276lx, str2));
                            }
                            C05A c05a = A003.A05;
                            for (Map.Entry entry : ((Map) c05a.getValue()).entrySet()) {
                                if (!linkedHashMap.containsKey(entry.getKey())) {
                                    linkedHashMap.put(entry.getKey(), entry.getValue());
                                }
                            }
                            c05a.Egh(linkedHashMap);
                        }
                        C9LN.A0A(c9ln, c201068un.A00());
                    }
                    List list2 = c199108rD.A03;
                    C23031Ai A005 = AbstractC23021Ah.A00(userSession);
                    Iterator it2 = list2.iterator();
                    while (true) {
                        obj2 = null;
                        if (it2.hasNext()) {
                            obj3 = it2.next();
                            if (C14360o3.A0K(((C201068un) obj3).A03, "suggested_pinnables")) {
                            }
                        } else {
                            obj3 = null;
                        }
                    }
                    C201068un c201068un2 = (C201068un) obj3;
                    if (c201068un2 != null) {
                        Iterator it3 = c201068un2.A00().iterator();
                        while (it3.hasNext()) {
                            ((C148276lx) it3.next()).A0Y = true;
                        }
                        if (c8nz.Bvk()) {
                            Iterator it4 = c201068un2.A00().iterator();
                            while (true) {
                                if (it4.hasNext()) {
                                    Object next = it4.next();
                                    if (((C148276lx) next).A00() == EnumC150226pU.A0B) {
                                        obj2 = next;
                                    }
                                }
                            }
                            InterfaceC19630xq interfaceC19630xq = A005.A01;
                            if (interfaceC19630xq.getInt("ay_template_suggested_avatar_sticker_impression_count", 0) < 3 && obj2 != null) {
                                c201068un2.A00().removeIf(new C31424DrU(1, B9I.A00));
                                c201068un2.A00().set(0, obj2);
                                AbstractC167017dG.A0g(interfaceC19630xq, "ay_template_suggested_avatar_sticker_impression_count").apply();
                            }
                            List A006 = c201068un2.A00();
                            if (!(A006 instanceof Collection) || !A006.isEmpty()) {
                                Iterator it5 = A006.iterator();
                                while (true) {
                                    if (it5.hasNext()) {
                                        if (((C148276lx) it5.next()).A00() == EnumC150226pU.A13) {
                                            if (C18U.A06(C06090Tz.A05, userSession, 36319909902360382L)) {
                                                A00 = c201068un2.A00();
                                                interfaceC16660sJ = B9J.A00;
                                            }
                                        }
                                    }
                                }
                                A00.removeIf(new C31424DrU(1, interfaceC16660sJ));
                            }
                            A00 = c201068un2.A00();
                            interfaceC16660sJ = B9K.A00;
                            A00.removeIf(new C31424DrU(1, interfaceC16660sJ));
                        }
                    }
                    List list3 = c199108rD.A03;
                    Iterator it6 = list3.iterator();
                    while (true) {
                        if (it6.hasNext()) {
                            Object next2 = it6.next();
                            if (C14360o3.A0K(((C201068un) next2).A03, "suggested_pinnables")) {
                                if (next2 != null && c8nz.Bvk()) {
                                    list3.remove(next2);
                                    list3.add(0, next2);
                                }
                            }
                        }
                    }
                    C44063Jdo c44063Jdo2 = c9ln.A0B;
                    if (c44063Jdo2 != null) {
                        List list4 = c199108rD.A03;
                        List list5 = c44063Jdo2.A06;
                        list5.clear();
                        list5.addAll(list4);
                        C0fA.A00(c44063Jdo2, 1538285764);
                    }
                } else {
                    C9LN.A0A(c9ln, c199108rD.A02);
                }
                if (c199108rD.mFromDiskCache) {
                    str = "cache";
                } else {
                    str = "network";
                }
                C9LN.A09(c9ln, str, (short) 2);
                C201048ul c201048ul = c199108rD.A00;
                if (c201048ul != null) {
                    String str4 = c201048ul.A02;
                    if (str4 == null) {
                        str4 = "";
                    }
                    C2JM c2jm = new C2JM();
                    C2JM c2jm2 = new C2JM();
                    c2jm.A04("sticker_drop_key", str4);
                    C2JQ c2jq = PandoGraphQLRequest.Companion;
                    AbstractC40691uc.A01(userSession).ATV(null, AY4.A00, new PandoGraphQLRequest(AbstractC40511uK.A00(), "LogStickerSheetImpressionMutation", c2jm.getParamsCopy(), c2jm2.getParamsCopy(), C212929cF.class, true, null, 0, null, "xdt_log_sticker_sheet_impression", AbstractC166987dD.A1E()));
                }
                C0f9.A0A(2045189341, A033);
                i2 = -1840226780;
                C0f9.A0A(i2, A032);
                return;
            case 6:
                A03 = C0f9.A03(1240166487);
                int A034 = C0f9.A03(825566725);
                ((C218079kf) this.A01).A00 = ((C214359eZ) obj).A00;
                C0f9.A0A(728371074, A034);
                i = 896132168;
                C0f9.A0A(i, A03);
                return;
            case 7:
                A03 = C0f9.A03(-1395350852);
                C214479el c214479el = (C214479el) obj;
                int A0N4 = AbstractC167017dG.A0N(c214479el, -935871003);
                C218099kh c218099kh = (C218099kh) this.A01;
                c218099kh.A0C.A00(c214479el);
                C218099kh.A02(c218099kh);
                C0f9.A0A(-1478538414, A0N4);
                i = -1552810012;
                C0f9.A0A(i, A03);
                return;
            case 8:
                A03 = C0f9.A03(-1445366143);
                C214359eZ c214359eZ = (C214359eZ) obj;
                int A0N5 = AbstractC167017dG.A0N(c214359eZ, -595437394);
                ((C218099kh) this.A01).A02 = c214359eZ.A00;
                C0f9.A0A(-685136069, A0N5);
                i = -536263196;
                C0f9.A0A(i, A03);
                return;
            case 9:
                A03 = C0f9.A03(548321576);
                C214429eg c214429eg = (C214429eg) obj;
                int A035 = C0f9.A03(1434643554);
                C14360o3.A0B(c214429eg, 0);
                ImmutableList copyOf = ImmutableList.copyOf((Collection) c214429eg.A01);
                C14360o3.A07(copyOf);
                C1LC it7 = copyOf.iterator();
                C14360o3.A07(it7);
                while (it7.hasNext()) {
                    C38321qM c38321qM = (C38321qM) it7.next();
                    HashMap hashMap = ((C214939fV) this.A01).A09;
                    String id = c38321qM.getId();
                    if (id != null) {
                        hashMap.put(id, c38321qM);
                    } else {
                        IllegalStateException A0g = AbstractC166997dE.A0g();
                        C0f9.A0A(1022405262, A035);
                        throw A0g;
                    }
                }
                C214939fV c214939fV = (C214939fV) this.A01;
                C44559Jnf c44559Jnf = c214939fV.A02;
                if (c44559Jnf == null) {
                    C14360o3.A0F("adapter");
                    throw C00O.createAndThrow();
                }
                List list6 = c44559Jnf.A01;
                int size = list6.size();
                Iterator<E> it8 = copyOf.iterator();
                while (it8.hasNext()) {
                    C38321qM c38321qM2 = (C38321qM) it8.next();
                    String id2 = c38321qM2.getId();
                    if (id2 != null) {
                        ImageUrl A1S = c38321qM2.A1S();
                        if (A1S != null) {
                            list6.add(new GalleryItem(new RemoteMedia(new MediaUploadMetadata(null, null, null, null, null, null, null, null, null, null, null, false), A1S, A1S, null, null, null, id2, A1S.getUrl(), (int) c38321qM2.A1C(), c38321qM2.Cff(), false, false)));
                        } else {
                            throw AbstractC166987dD.A14("Required value was null.");
                        }
                    } else {
                        throw AbstractC166987dD.A14("Required value was null.");
                    }
                }
                c44559Jnf.notifyItemRangeInserted(size, copyOf.size());
                c214939fV.A03 = c214429eg.A00;
                C0f9.A0A(-1459137758, A035);
                i = 1942270997;
                C0f9.A0A(i, A03);
                return;
            case 10:
                A03 = C0f9.A03(1333361064);
                C2044693f c2044693f = (C2044693f) obj;
                int A0N6 = AbstractC167017dG.A0N(c2044693f, -462435767);
                C93W c93w = (C93W) this.A01;
                List list7 = c2044693f.A03;
                if (list7 != null && !list7.isEmpty()) {
                    c93w.A02(c2044693f);
                }
                C0f9.A0A(931201433, A0N6);
                i = 871525265;
                C0f9.A0A(i, A03);
                return;
            case 11:
                A03 = C0f9.A03(1814130928);
                C0f9.A0A(-94768038, C0f9.A03(115601914));
                i = 321617297;
                C0f9.A0A(i, A03);
                return;
            case IgReactQEModule.CONFIG_KEY_OFFSET /* 12 */:
                A032 = C0f9.A03(1933354339);
                C173077nL c173077nL = (C173077nL) obj;
                int A036 = C0f9.A03(792772043);
                C56255Oy2 c56255Oy2 = (C56255Oy2) this.A01;
                UserSession userSession2 = c56255Oy2.A0C;
                C23031Ai A007 = AbstractC23021Ah.A00(userSession2);
                String str5 = c173077nL.A03;
                InterfaceC19610xo A0w = AbstractC166987dD.A0w(A007);
                A0w.E7K("reel_message_prefs", str5);
                A0w.apply();
                Boolean bool = c173077nL.A02;
                if (bool != null) {
                    AbstractC23021Ah.A00(userSession2).A1F(bool.booleanValue());
                }
                List list8 = c173077nL.A00.A00;
                if (list8 == null) {
                    list8 = AbstractC166987dD.A1E();
                }
                c56255Oy2.A00 = list8.size();
                AbstractC166987dD.A10(userSession2).A03.EVn(Boolean.valueOf(AbstractC167007dF.A1O(c56255Oy2.A00)));
                C173917oj c173917oj = c173077nL.A01;
                if (c173917oj == null) {
                    list = Collections.EMPTY_LIST;
                } else {
                    list = c173917oj.A00;
                }
                if (list != null) {
                    c56255Oy2.A01 = list.size();
                }
                c56255Oy2.A06 = C05F.A01;
                AbstractC23021Ah.A00(userSession2).A1D(c173077nL.A04);
                C56255Oy2.A04(c56255Oy2);
                C0f9.A0A(1657682167, A036);
                i2 = 1632618573;
                C0f9.A0A(i2, A032);
                return;
            default:
                super.onSuccess(obj);
                return;
        }
    }

    @Override // X.C1P1
    public final /* bridge */ /* synthetic */ void onSuccessInBackground(Object obj) {
        int A03;
        int i;
        AbstractC907342m A00;
        AbstractC907342m A002;
        AbstractC907342m A003;
        String A05;
        int i2;
        C213109cX c213109cX;
        AbstractC115105If A004;
        switch (this.A00) {
            case 0:
                A03 = C0f9.A03(516884404);
                AnonymousClass435 anonymousClass435 = (AnonymousClass435) obj;
                int A0N = AbstractC167017dG.A0N(anonymousClass435, -644460467);
                Object obj2 = anonymousClass435.A01;
                if (obj2 == null) {
                    C0w9.A03(AbstractC58317Pt9.A00(160), "Error creating Bloks view query response");
                    i = -500653766;
                } else {
                    C62415SAp c62415SAp = (C62415SAp) this.A01;
                    AbstractC907342m abstractC907342m = (AbstractC907342m) obj2;
                    if (abstractC907342m != null && (A00 = abstractC907342m.A00(C9Z0.class, "ig_bloks_iab_autofill_payment_usage_soft_keyboard_view")) != null && (A002 = A00.A00(C211659Yz.class, "component")) != null && (A003 = A002.A00(C211649Yy.class, "bundle")) != null && (A05 = A003.A05("bloks_bundle_tree")) != null) {
                        c62415SAp.A00.A02 = AbstractC192918gX.A00(C63B.A01, A05, "AutofillSoftKeyboardController");
                    }
                    i = -362091804;
                }
                C0f9.A0A(i, A0N);
                i2 = -929442173;
                break;
            case 1:
                A03 = C0f9.A03(1220722502);
                AnonymousClass435 anonymousClass4352 = (AnonymousClass435) obj;
                int A032 = C0f9.A03(1708710049);
                C14360o3.A0B(anonymousClass4352, 0);
                C209919Qd c209919Qd = (C209919Qd) this.A01;
                C2JS c2js = (C2JS) anonymousClass4352.A01;
                if (c2js == null) {
                    A004 = new C115095Ie(new Exception("No result in IGBloksAsyncActionQuery response"));
                } else {
                    C192778gJ c192778gJ = c209919Qd.A00;
                    C2JS optionalTreeField = c2js.getOptionalTreeField(0, "bloks_action(bk_context:$bk_context,params:$params)", C213029cP.class, 749888425);
                    if (optionalTreeField != null) {
                        c213109cX = (C213109cX) optionalTreeField.reinterpretRequired(0, C213109cX.class, 1583155594);
                    } else {
                        c213109cX = null;
                    }
                    A004 = c192778gJ.A00(c213109cX);
                    if (A004 instanceof C115115Ig) {
                        A004 = new C115115Ig(new C209899Qb((C66246U5q) ((C115115Ig) A004).A00, 1, 0L, 0L));
                    } else if (!(A004 instanceof C115095Ie)) {
                        throw B4Z.A00();
                    }
                }
                AbstractC193008gg abstractC193008gg = (AbstractC193008gg) A004.A00();
                if (abstractC193008gg != null) {
                    ((AbstractC192798gL) c209919Qd).A00.A01(abstractC193008gg);
                }
                C1W2.A00().A01(new RunnableC24584Auf(c209919Qd, A004));
                C0f9.A0A(-1685942430, A032);
                i2 = 496468668;
                break;
            case 2:
                A03 = C0f9.A03(101935753);
                C9QR c9qr = (C9QR) obj;
                int A033 = C0f9.A03(664495442);
                C14360o3.A0B(c9qr, 0);
                try {
                    C9QQ c9qq = (C9QQ) this.A01;
                    ((AbstractC192798gL) c9qq).A00.A01(c9qq.A01(c9qr));
                } catch (C223529tj e) {
                    ((AbstractC192798gL) this.A01).A00.A02(new C115115Ig(new C9CD(null, e.getMessage(), "ParsingException", 1, false)));
                }
                C0f9.A0A(382566050, A033);
                i2 = 2136081445;
                break;
            default:
                super.onSuccessInBackground(obj);
                return;
        }
        C0f9.A0A(i2, A03);
    }
}
