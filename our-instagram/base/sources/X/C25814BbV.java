package X;

import android.app.Application;
import android.graphics.RectF;
import com.facebook.R;
import com.facebook.common.stringformat.StringFormatUtil;
import com.instagram.api.schemas.CommentGiphyMediaInfo;
import com.instagram.api.schemas.IGCommentSheetMoreInfo;
import com.instagram.api.schemas.TestimonialDict;
import com.instagram.comments.mvvm.data.MediaCommentListRepository;
import com.instagram.comments.mvvm.data.MediaCommentListRepository$postDelayedComment$1;
import com.instagram.comments.mvvm.data.MediaCommentListRepository$updateCommentActionMenu$1;
import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.debug.devoptions.avatars.ImmersiveAvatarViewerDebugFragment;
import com.instagram.fanclub.intf.UserPayFanclubUpsellParams;
import com.instagram.model.mediatype.ProductType;
import com.instagram.model.reels.Reel;
import com.instagram.user.follow.mvvm.data.FollowUserDataSourceImpl;
import com.instagram.user.model.User;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONObject;

/* renamed from: X.BbV, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C25814BbV extends C193578hc {
    public C9BA A00;
    public C167607eG A01;
    public boolean A02;
    public boolean A03;
    public boolean A04;
    public boolean A05;
    public final MUW A06;
    public final C166057bY A07;
    public final C26025BfE A08;
    public final C166017bT A09;
    public final MediaCommentListRepository A0A;
    public final C166027bU A0B;
    public final C166007bS A0C;
    public final C25671My A0D;
    public final UserSession A0E;
    public final C57382kD A0F;
    public final C166257bu A0G;
    public final C166217bp A0H;
    public final String A0I;
    public final InterfaceC09390do A0J;
    public final InterfaceC09390do A0K;
    public final InterfaceC09390do A0L;
    public final InterfaceC09390do A0M;
    public final C05A A0N;
    public final C05A A0O;
    public final C05A A0P;
    public final C05A A0Q;
    public final C05A A0R;
    public final C0UO A0S;
    public final C0UO A0T;
    public final C0UO A0U;
    public final C0UO A0V;
    public final C0UO A0W;
    public final C57582kX A0X;
    public final FollowUserDataSourceImpl A0Y;
    public final C0UO A0Z;
    public final C0UO A0a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C25814BbV(Application application, C166057bY c166057bY, C26025BfE c26025BfE, C166017bT c166017bT, MediaCommentListRepository mediaCommentListRepository, C166027bU c166027bU, C166007bS c166007bS, C25671My c25671My, UserSession userSession, C57582kX c57582kX, FollowUserDataSourceImpl followUserDataSourceImpl, C166257bu c166257bu, C166217bp c166217bp, String str) {
        super(application);
        MUW muw;
        InterfaceC38371qR interfaceC38371qR;
        C14360o3.A0B(userSession, 1);
        C14360o3.A0B(c25671My, 7);
        AbstractC25229BEm.A1L(application, 8, str);
        this.A0E = userSession;
        this.A08 = c26025BfE;
        this.A0C = c166007bS;
        this.A0A = mediaCommentListRepository;
        this.A09 = c166017bT;
        this.A0B = c166027bU;
        this.A0D = c25671My;
        this.A0H = c166217bp;
        this.A0X = c57582kX;
        this.A07 = c166057bY;
        this.A0I = str;
        this.A0Y = followUserDataSourceImpl;
        this.A0G = c166257bu;
        this.A0F = new C57382kD(userSession);
        C008002u A00 = C10E.A00(C166267bv.A00);
        this.A0R = A00;
        C008002u A1H = AbstractC25225BEi.A1H(false);
        this.A0Q = A1H;
        C0UO c0uo = mediaCommentListRepository.A0L;
        C0UO c0uo2 = c166027bU.A03;
        C0UO c0uo3 = mediaCommentListRepository.A0J;
        C0UO c0uo4 = mediaCommentListRepository.A0I;
        C0UO c0uo5 = mediaCommentListRepository.A0K;
        MWG mwg = new MWG(13, this, AbstractC001800i.A0a(AbstractC16960so.A1Q(c0uo, c0uo2, c0uo3, c0uo4, c0uo5, A1H)).toArray(new InterfaceC19390xP[0]));
        C141796aw A002 = AbstractC141776au.A00(this);
        C10H c10h = C10I.A01;
        AnonymousClass059 A01 = AbstractC208910l.A01(A01((C9BH) c0uo4.getValue(), (C206409Bx) c0uo3.getValue(), (C51756Mtf) c0uo5.getValue(), (C166047bW) c0uo2.getValue(), (C166137bh) c0uo.getValue(), this, AbstractC166987dD.A1a(A1H.getValue())), A002, mwg, c10h);
        this.A0a = A01;
        AnonymousClass059 A012 = AbstractC208910l.A01(C16930sl.A00, AbstractC141776au.A00(this), new C50540MSt(A01, 14), c10h);
        this.A0Z = A012;
        this.A0W = AbstractC208910l.A01(A02((InterfaceC166277bw) A00.getValue(), (InterfaceC166347c3) A01.getValue()), AbstractC141776au.A00(this), C10Q.A03(new C57181PaA(this, (InterfaceC23621Ds) null, 3), A01, A00), c10h);
        Integer num = c26025BfE.A04;
        if (AbstractC75103Za.A0R(this.A0B.A00, AbstractC167017dG.A0K(num)) && (interfaceC38371qR = this.A0B.A00) != null) {
            muw = AbstractC27675CIu.A00(AbstractC166987dD.A0O(A0D()), userSession, interfaceC38371qR, AbstractC167017dG.A0K(num));
        } else {
            muw = null;
        }
        this.A06 = muw;
        this.A0U = AbstractC208910l.A01(C166357c4.A00, AbstractC141776au.A00(this), new MWG(14, this, AbstractC001800i.A0a(AbstractC16960so.A1Q(A012, c166017bT.A0A, c166017bT.A0B, c166017bT.A0D, c166017bT.A0C, this.A0B.A03, A1H, c166017bT.A0F)).toArray(new InterfaceC19390xP[0])), c10h);
        this.A0S = AbstractC208910l.A01(C166377c6.A00, AbstractC141776au.A00(this), C10Q.A01(new D5R(this, 0), A012, mediaCommentListRepository.A0M, c0uo2, A1H), c10h);
        C008002u A003 = C10E.A00(C166397c8.A00);
        this.A0O = A003;
        this.A0V = AbstractC208910l.A02(A003);
        C008002u A004 = C10E.A00(C166417cA.A00);
        this.A0N = A004;
        this.A0T = AbstractC208910l.A02(A004);
        this.A00 = new C9BA(true, true, 2);
        this.A0P = AbstractC25225BEi.A1H(false);
        this.A0M = AbstractC09440dt.A01(new J7Q(this, 15));
        this.A0L = AbstractC09440dt.A01(new J7Q(this, 8));
        this.A0J = AbstractC09440dt.A00(EnumC09460dv.A02, new J7Q(this, 6));
        this.A0K = AbstractC09440dt.A01(new J7Q(this, 7));
        AbstractC25232BEp.A1J(this, new B5g(this, null, 3), new AnonymousClass625(c25671My).A00(C166437cC.class));
        AbstractC25232BEp.A1J(this, new PYX(this, null, 3), new AnonymousClass625(c25671My).A00(C166457cE.class));
        AbstractC25232BEp.A1J(this, new B5g(this, null, 4), new AnonymousClass625(c25671My).A00(C3MC.class));
        AbstractC166987dD.A1Z(new MBT(this, null, 24), AbstractC141776au.A00(this));
        this.A05 = true;
        this.A04 = true;
    }

    public static final void A04(C45127Jxw c45127Jxw, C167297di c167297di, C25814BbV c25814BbV, String str, List list, boolean z) {
        C166057bY c166057bY = c25814BbV.A07;
        ConcurrentHashMap concurrentHashMap = c166057bY.A03;
        Number number = (Number) concurrentHashMap.get(str);
        if (number != null) {
            c166057bY.A00.flowMarkPoint(number.longValue(), "request_end");
        }
        C166057bY.A01(c166057bY, str, "successful_comment_post", concurrentHashMap);
        c25814BbV.A0B.A01(new DI0(3, c25814BbV, list, c45127Jxw, c167297di, z));
    }

    public final void A0H(RectF rectF, Reel reel, String str, InterfaceC16820sZ interfaceC16820sZ) {
        C14360o3.A0B(interfaceC16820sZ, 3);
        if (str != null) {
            C3N0.A00(this.A0C.A02).EWt(str);
        }
        C29899DGn A00 = C29899DGn.A00(interfaceC16820sZ, this, 6);
        C05A c05a = this.A0N;
        c05a.Egh(C167157dU.A00);
        c05a.Egh(new C206219Be(rectF, reel, A00));
    }

    public final void A0O(C168497fj c168497fj) {
        C14360o3.A0B(c168497fj, 0);
        String str = c168497fj.A04;
        if (str != null) {
            AbstractC166987dD.A1Z(new MCF(this, str, null, 13), AbstractC141776au.A00(this));
        }
    }

    public final void A0S(C169287h2 c169287h2, String str, String str2) {
        String str3;
        String str4;
        C14360o3.A0B(str, 0);
        C166017bT c166017bT = this.A09;
        C167607eG A00 = c166017bT.A00(str);
        MediaCommentListRepository mediaCommentListRepository = this.A0A;
        if (c169287h2 != null) {
            if (A00 != null) {
                str4 = A00.A04;
            } else {
                str4 = null;
            }
            AbstractC166987dD.A1Z(new MBX(mediaCommentListRepository, str4, str, (InterfaceC23621Ds) null, 6), ((C4A7) mediaCommentListRepository).A01);
            this.A0C.A05(c169287h2);
        } else {
            if (A00 != null) {
                str3 = A00.A04;
            } else {
                str3 = null;
            }
            AbstractC166987dD.A1Z(new MBX(mediaCommentListRepository, str3, str, (InterfaceC23621Ds) null, 7), ((C4A7) mediaCommentListRepository).A01);
        }
        if (A00 != null) {
            c166017bT.A03(A00.A00, A00.A01, A00.A02, A00.A03, A00.A04, A00.A05, A00.A07, A00.A06);
        }
        this.A0O.Egh(new C167497e4(null, str2));
    }

    public final void A0T(EnumC166067ba enumC166067ba, Integer num) {
        AbstractC167017dG.A1N(enumC166067ba, num);
        MediaCommentListRepository mediaCommentListRepository = this.A0A;
        C0UO c0uo = mediaCommentListRepository.A0L;
        if (((C166137bh) c0uo.getValue()).A03.A00.A03 != num || ((C166137bh) c0uo.getValue()).A03.A00.A02 != enumC166067ba) {
            AbstractC166987dD.A1Z(new MC8(enumC166067ba, mediaCommentListRepository, num, null, 20), ((C4A7) mediaCommentListRepository).A01);
        }
    }

    public final void A0U(InterfaceC101404gy interfaceC101404gy, Integer num, String str, String str2, int i) {
        AbstractC140306Wi.A01(A0D(), this.A0E, interfaceC101404gy, num, Integer.valueOf(i), str, this.A08.A0G, str2, "", -1, false);
    }

    public final void A0V(InterfaceC101404gy interfaceC101404gy, String str, String str2, int i) {
        C14360o3.A0B(str, 0);
        AbstractC140306Wi.A01(A0D(), this.A0E, interfaceC101404gy, Integer.valueOf(i), null, str, this.A08.A0G, str2, "", -1, AbstractC167007dF.A1V(interfaceC101404gy));
    }

    public final void A0Y(User user, String str, boolean z) {
        C38321qM BQN;
        AbstractC167017dG.A1N(user, str);
        InterfaceC38371qR interfaceC38371qR = this.A0B.A00;
        if (interfaceC38371qR != null && (BQN = interfaceC38371qR.BQN()) != null) {
            this.A0D.E4s(new C72343Mh(BQN, user, AbstractC111324zv.A00(2163), str, z));
        }
        C3N0.A00(this.A0C.A02).EWt(str);
    }

    public final void A0Z(String str) {
        C38321qM BQN;
        InterfaceC38371qR interfaceC38371qR = this.A0B.A00;
        if (interfaceC38371qR != null && (BQN = interfaceC38371qR.BQN()) != null) {
            C25671My c25671My = this.A0D;
            String lowerCase = str.toLowerCase();
            C14360o3.A07(lowerCase);
            c25671My.E4s(new C72413Mo(null, null, BQN, lowerCase, false));
        }
    }

    public final void A0a(String str) {
        C38321qM BQN;
        InterfaceC38371qR interfaceC38371qR = this.A0B.A00;
        if (interfaceC38371qR != null && (BQN = interfaceC38371qR.BQN()) != null) {
            C25671My c25671My = this.A0D;
            String lowerCase = str.toLowerCase();
            C14360o3.A07(lowerCase);
            c25671My.E4s(new C72393Mm(null, null, BQN, lowerCase, false));
        }
    }

    public final void A0d(String str, String str2) {
        if (AbstractC166327c1.A01(AbstractC25228BEl.A0s(this.A0A), str, str2) != null) {
            this.A0B.A00(C30185DRq.A02(this, 15));
            this.A0N.Egh(new C206339Bq(str, 0));
        }
    }

    public final void A0e(String str, String str2) {
        C05A c05a;
        Object c167537e9;
        C22P c22p;
        C05A c05a2;
        Object obj;
        Object value;
        long A01;
        C167297di A012 = AbstractC166327c1.A01(AbstractC25228BEl.A0s(this.A0A), str, str2);
        if (A012 != null) {
            String str3 = A012.A0N;
            if (str3 == null) {
                str3 = A012.A0K;
            }
            C166027bU c166027bU = this.A0B;
            c166027bU.A00(C30185DRq.A02(this, 17));
            C166017bT c166017bT = this.A09;
            String str4 = A012.A0J;
            User user = A012.A0C;
            c166017bT.A03(user, A012.A0I, str, str4, str3, A012.A0i, AbstractC167007dF.A1W(A012.A03), AbstractC167007dF.A1W(A012.A08));
            if (user.A2D() && !C14360o3.A0K(this.A08.A0C, ((AbstractC166097bd) A012).A00)) {
                c05a2 = this.A0O;
                obj = new C167497e4(null, StringFormatUtil.formatStrLocaleSafe("@%s ", user.getUsername()));
            } else {
                c05a2 = this.A0O;
                obj = C167507e5.A00;
            }
            c05a2.Egh(obj);
            C05A c05a3 = this.A0R;
            do {
                value = c05a3.getValue();
                A01 = C18U.A01(C06090Tz.A05, this.A0E, 36600216648683324L);
                if (A01 == 0) {
                    A01 = 300;
                }
            } while (!c05a3.AIi(value, new C167827ec(str, UUID.randomUUID(), A01, true)));
            Integer num = C05F.A01;
            this.A04 = false;
            c166027bU.A00(new C50371MLy(this, num, str, str2, 16));
        }
        C0UO c0uo = this.A09.A0D;
        C167607eG c167607eG = (C167607eG) c0uo.getValue();
        if (c167607eG != null && !this.A03) {
            UserSession userSession = this.A0E;
            C0UO c0uo2 = this.A0B.A03;
            if (CG4.A00(c167607eG, (C166047bW) c0uo2.getValue(), userSession)) {
                InterfaceC16530ry interfaceC16530ry = AbstractC23021Ah.A00(userSession).A7N;
                C0YR[] c0yrArr = C23031Ai.A8c;
                if (!AbstractC167017dG.A1b(r3, interfaceC16530ry, c0yrArr, 281)) {
                    this.A03 = true;
                    c05a = this.A0N;
                    C167607eG c167607eG2 = (C167607eG) c0uo.getValue();
                    C166047bW c166047bW = (C166047bW) c0uo2.getValue();
                    if (c166047bW != null && c166047bW.A0W) {
                        c22p = C22P.A0u;
                    } else {
                        c22p = C22P.A2k;
                    }
                    c167537e9 = new C166927d6(new DialogInterfaceOnDismissListenerC28568Cj0(this, 0), new DialogInterfaceOnShowListenerC48027LMw(this, 1), c22p, c167607eG2);
                } else {
                    int i = AbstractC166987dD.A0x(userSession).getInt(AbstractC43591JPw.A00(850), 0);
                    C23031Ai A00 = AbstractC23021Ah.A00(userSession);
                    if (!AbstractC167017dG.A1b(A00, A00.A0i, c0yrArr, 283) && i == 0) {
                        this.A03 = true;
                        KYR kyr = new KYR(this, 1);
                        c05a = this.A0O;
                        c167537e9 = new C167537e9(kyr);
                    }
                }
                c05a.Egh(c167537e9);
            }
        }
        A08(false);
    }

    public final void A0h(String str, String str2, boolean z) {
        boolean z2;
        Integer num;
        List list = (List) this.A0Z.getValue();
        if (!(list instanceof Collection) || !list.isEmpty()) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                if (C14360o3.A0K(((C167297di) it.next()).A0K, str)) {
                    z2 = true;
                    break;
                }
            }
        }
        z2 = false;
        boolean A0A = A0A(this);
        if (z2) {
            this.A0A.A0Q(str, str2, false);
            C28238Cci c28238Cci = C28238Cci.A00;
            UserSession userSession = this.A0E;
            int size = list.size() - 1;
            C006802i c006802i = C006802i.A0p;
            C14360o3.A07(c006802i);
            c006802i.markerPoint(309476254, AnonymousClass001.A0O(AbstractC111324zv.A00(5271), size));
            if (list.size() == 1 && !this.A02) {
                c28238Cci.A00(userSession);
                return;
            }
            return;
        }
        int size2 = list.size();
        if (size2 == 0 || (A0A && size2 < 25 && AbstractC166987dD.A1a(this.A0Q.getValue()))) {
            if (list.isEmpty()) {
                if (z) {
                    num = C05F.A01;
                } else {
                    num = C05F.A00;
                }
                Integer num2 = C05F.A01;
                C28238Cci.A00.A02(this.A0E, num, num2, num2, A0A);
            }
            int size3 = list.size() + 1;
            C006802i c006802i2 = C006802i.A0p;
            C14360o3.A07(c006802i2);
            c006802i2.markerPoint(309476254, AnonymousClass001.A0O(AbstractC111324zv.A00(3058), size3));
            if (A09(this) && !AbstractC166987dD.A1a(this.A0Q.getValue())) {
                this.A02 = false;
                MediaCommentListRepository mediaCommentListRepository = this.A0A;
                List A03 = A03((C166047bW) this.A0B.A03.getValue(), this, str, str2);
                AbstractC166987dD.A1Z(new MediaCommentListRepository$updateCommentActionMenu$1(mediaCommentListRepository, str, str2, A03, null, true), ((C4A7) mediaCommentListRepository).A01);
                return;
            }
            this.A0A.A0Q(str, str2, true);
            return;
        }
        if (list.size() != 1) {
            return;
        }
        this.A0N.Egh(new C9BK(C29127Css.A00));
    }

    public final void A0i(String str, String str2, boolean z) {
        this.A0B.A01(new C29926DHo(this, str, str2, 2, z));
        A08(true);
    }

    public final void A0j(String str, String str2, boolean z, String str3) {
        C38321qM BQN;
        C14360o3.A0B(str, 0);
        AbstractC167017dG.A1Q(str2, str3);
        A08(false);
        InterfaceC38371qR interfaceC38371qR = this.A0B.A00;
        if (interfaceC38371qR != null && (BQN = interfaceC38371qR.BQN()) != null) {
            this.A0D.E4s(new C72433Mq(this.A0E, BQN, A0E(BQN), str3, str, str2, z));
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:118:0x01d0, code lost:
    
        if (r17 != false) goto L126;
     */
    /* JADX WARN: Code restructure failed: missing block: B:129:0x01f4, code lost:
    
        if (r12 == false) goto L140;
     */
    /* JADX WARN: Code restructure failed: missing block: B:146:0x03eb, code lost:
    
        if (X.C18U.A06(r8, r2, 36318810391255554L) == false) goto L262;
     */
    /* JADX WARN: Code restructure failed: missing block: B:210:0x0367, code lost:
    
        if (r53.A0f != true) goto L217;
     */
    /* JADX WARN: Code restructure failed: missing block: B:211:0x036d, code lost:
    
        r4 = r53.A0A;
     */
    /* JADX WARN: Code restructure failed: missing block: B:212:0x036f, code lost:
    
        if (r4 == null) goto L247;
     */
    /* JADX WARN: Code restructure failed: missing block: B:213:0x0371, code lost:
    
        r4 = r4.A03.B4O();
     */
    /* JADX WARN: Code restructure failed: missing block: B:214:0x0377, code lost:
    
        if (r4 == null) goto L247;
     */
    /* JADX WARN: Code restructure failed: missing block: B:216:0x037d, code lost:
    
        if (r4.getFanClubId() == null) goto L247;
     */
    /* JADX WARN: Code restructure failed: missing block: B:217:0x037f, code lost:
    
        r12 = X.AbstractC166987dD.A1E();
        r11 = X.EnumC27402C7f.A05;
        r12.add(r11);
        r10 = X.EnumC27402C7f.A07;
        r12.add(r10);
     */
    /* JADX WARN: Code restructure failed: missing block: B:218:0x0396, code lost:
    
        if (X.C18U.A06(r8, r2, 36320360874189205L) == false) goto L228;
     */
    /* JADX WARN: Code restructure failed: missing block: B:219:0x0398, code lost:
    
        r12.add(X.EnumC27402C7f.A06);
     */
    /* JADX WARN: Code restructure failed: missing block: B:220:0x039d, code lost:
    
        if (r17 == false) goto L231;
     */
    /* JADX WARN: Code restructure failed: missing block: B:221:0x039f, code lost:
    
        if (r18 == false) goto L231;
     */
    /* JADX WARN: Code restructure failed: missing block: B:222:0x03a1, code lost:
    
        r12.add(X.EnumC27402C7f.A0A);
     */
    /* JADX WARN: Code restructure failed: missing block: B:223:0x03a6, code lost:
    
        X.AbstractC25230BEn.A15(1, r13, r14);
     */
    /* JADX WARN: Code restructure failed: missing block: B:224:0x03ab, code lost:
    
        if (r14 != X.EnumC166067ba.A04) goto L242;
     */
    /* JADX WARN: Code restructure failed: missing block: B:226:0x03af, code lost:
    
        if (r13 == r22) goto L238;
     */
    /* JADX WARN: Code restructure failed: missing block: B:228:0x03b3, code lost:
    
        if (r13 != r27) goto L239;
     */
    /* JADX WARN: Code restructure failed: missing block: B:229:0x03b5, code lost:
    
        r11 = r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:231:0x03bf, code lost:
    
        if (r13 != X.C05F.A0C) goto L242;
     */
    /* JADX WARN: Code restructure failed: missing block: B:232:0x03c1, code lost:
    
        r11 = X.EnumC27402C7f.A06;
     */
    /* JADX WARN: Code restructure failed: missing block: B:233:0x03b6, code lost:
    
        r2 = new X.C169547hU(r11, r12);
     */
    /* JADX WARN: Code restructure failed: missing block: B:235:0x03c6, code lost:
    
        if (r14 != X.EnumC166067ba.A05) goto L238;
     */
    /* JADX WARN: Code restructure failed: missing block: B:237:0x03ca, code lost:
    
        if (r13 != r22) goto L238;
     */
    /* JADX WARN: Code restructure failed: missing block: B:238:0x03cc, code lost:
    
        r11 = X.EnumC27402C7f.A0A;
     */
    /* JADX WARN: Code restructure failed: missing block: B:239:0x03cf, code lost:
    
        r18 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:241:0x036b, code lost:
    
        if (r53 != null) goto L219;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0044, code lost:
    
        if (r28 != false) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0059, code lost:
    
        if (r1 == false) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:384:0x03d2, code lost:
    
        if (r53 != null) goto L150;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x007f, code lost:
    
        if (r24 != null) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x00c4, code lost:
    
        if (X.C18U.A06(X.C06090Tz.A05, r2, 36329376010223924L) != false) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x00eb, code lost:
    
        if (X.C18U.A06(r8, r2, 36330522766492560L) == false) goto L67;
     */
    /* JADX WARN: Removed duplicated region for block: B:126:0x01ec  */
    /* JADX WARN: Removed duplicated region for block: B:266:0x04d7  */
    /* JADX WARN: Removed duplicated region for block: B:306:0x0573  */
    /* JADX WARN: Removed duplicated region for block: B:318:0x0594  */
    /* JADX WARN: Removed duplicated region for block: B:321:0x05a5  */
    /* JADX WARN: Removed duplicated region for block: B:324:0x05bb  */
    /* JADX WARN: Removed duplicated region for block: B:327:0x05df  */
    /* JADX WARN: Removed duplicated region for block: B:329:0x061e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final X.InterfaceC166347c3 A01(X.C9BH r50, X.C206409Bx r51, X.C51756Mtf r52, X.C166047bW r53, X.C166137bh r54, X.C25814BbV r55, boolean r56) {
        /*
            Method dump skipped, instructions count: 1569
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C25814BbV.A01(X.9BH, X.9Bx, X.Mtf, X.7bW, X.7bh, X.BbV, boolean):X.7c3");
    }

    public static final InterfaceC166347c3 A02(InterfaceC166277bw interfaceC166277bw, InterfaceC166347c3 interfaceC166347c3) {
        if (!(interfaceC166347c3 instanceof C166337c2) || C14360o3.A0K(interfaceC166277bw, C166267bv.A00)) {
            return interfaceC166347c3;
        }
        C166337c2 c166337c2 = (C166337c2) interfaceC166347c3;
        List list = c166337c2.A08;
        C51756Mtf c51756Mtf = c166337c2.A01;
        List list2 = c166337c2.A09;
        C166047bW c166047bW = c166337c2.A02;
        C25314BIj c25314BIj = c166337c2.A00;
        String str = c166337c2.A05;
        Integer num = c166337c2.A04;
        boolean z = c166337c2.A0F;
        boolean z2 = c166337c2.A0D;
        String str2 = c166337c2.A07;
        boolean z3 = c166337c2.A0E;
        boolean z4 = c166337c2.A0B;
        boolean z5 = c166337c2.A0C;
        boolean z6 = c166337c2.A0G;
        String str3 = c166337c2.A06;
        boolean z7 = c166337c2.A0A;
        AbstractC25233BEq.A0v(0, list, interfaceC166277bw, list2);
        return new C166337c2(c25314BIj, c51756Mtf, c166047bW, interfaceC166277bw, num, str, str2, str3, list, list2, z, z2, z3, z4, z5, z6, z7);
    }

    public static final List A03(C166047bW c166047bW, C25814BbV c25814BbV, String str, String str2) {
        boolean z;
        boolean z2;
        boolean z3;
        CS7 cs7;
        C167297di A01 = AbstractC166327c1.A01(AbstractC25228BEl.A0s(c25814BbV.A0A), str, str2);
        C3YU c3yu = null;
        if (A01 == null) {
            return null;
        }
        C167807ea c167807ea = C167807ea.A00;
        if (c166047bW != null) {
            z = c166047bW.A0f;
            z2 = c166047bW.A0e;
            z3 = c166047bW.A0c;
            c3yu = c166047bW.A06;
        } else {
            z = false;
            z2 = false;
            z3 = false;
        }
        boolean A1X = AbstractC167007dF.A1X(c3yu, C3YU.A04);
        boolean z4 = c25814BbV.A08.A0c;
        C166007bS c166007bS = c25814BbV.A0C;
        UserSession userSession = c25814BbV.A0E;
        ArrayList A02 = c167807ea.A02(A01, c166047bW, c166007bS, userSession, AbstractC166987dD.A10(userSession), z, z2, z3, A1X, z4, true);
        ArrayList A1E = AbstractC166987dD.A1E();
        Iterator it = A02.iterator();
        while (it.hasNext()) {
            InterfaceC30799Dga interfaceC30799Dga = (InterfaceC30799Dga) it.next();
            C29899DGn A00 = C29899DGn.A00(interfaceC30799Dga, c25814BbV, 5);
            if (C9B6.A00(interfaceC30799Dga, 0)) {
                C27814COd c27814COd = new C27814COd(2131956428);
                cs7 = new CS7(C26931BuY.A00, new C27813COc(R.drawable.instagram_block_pano_outline_24), c27814COd, A00);
            } else {
                if (!C14360o3.A0K(interfaceC30799Dga, C29118Csj.A00)) {
                    if (C14360o3.A0K(interfaceC30799Dga, C29119Csk.A00)) {
                        continue;
                    } else if (C14360o3.A0K(interfaceC30799Dga, C29120Csl.A00)) {
                        C27814COd c27814COd2 = new C27814COd(2131956430);
                        cs7 = new CS7(C26931BuY.A00, new C27813COc(R.drawable.instagram_delete_pano_outline_24), c27814COd2, A00);
                    } else if (interfaceC30799Dga instanceof C26162Bhn) {
                        if (((C26162Bhn) interfaceC30799Dga).A03) {
                            C27814COd c27814COd3 = new C27814COd(2131956436);
                            cs7 = new CS7(C26932BuZ.A00, new C27813COc(R.drawable.instagram_pin_pano_filled_24), c27814COd3, A00);
                        } else {
                            C27814COd c27814COd4 = new C27814COd(2131956431);
                            cs7 = new CS7(C26932BuZ.A00, new C27813COc(R.drawable.instagram_pin_pano_outline_24), c27814COd4, A00);
                        }
                    } else if (C14360o3.A0K(interfaceC30799Dga, C29123Cso.A00)) {
                        C27814COd c27814COd5 = new C27814COd(2131956435);
                        cs7 = new CS7(C26932BuZ.A00, new C27813COc(R.drawable.instagram_user_unfollow_pano_outline_24), c27814COd5, A00);
                    } else if (C9B6.A00(interfaceC30799Dga, 1)) {
                        C27814COd c27814COd6 = new C27814COd(2131956432);
                        cs7 = new CS7(C26931BuY.A00, new C27813COc(R.drawable.instagram_report_pano_outline_24), c27814COd6, A00);
                    } else if (C14360o3.A0K(interfaceC30799Dga, C29122Csn.A00)) {
                        C27814COd c27814COd7 = new C27814COd(2131956427);
                        cs7 = new CS7(C26932BuZ.A00, new C27813COc(R.drawable.instagram_new_story_pano_outline_24), c27814COd7, A00);
                    } else if (C26163Bho.A00(interfaceC30799Dga, 1)) {
                        C27814COd c27814COd8 = new C27814COd(2131966348);
                        cs7 = new CS7(C26932BuZ.A00, new C27813COc(R.drawable.instagram_app_messenger_pano_outline_24), c27814COd8, A00);
                    } else if (!C14360o3.A0K(interfaceC30799Dga, C29121Csm.A00)) {
                        if (C14360o3.A0K(interfaceC30799Dga, C29124Csp.A00)) {
                            C27814COd c27814COd9 = new C27814COd(2131956437);
                            cs7 = new CS7(C26932BuZ.A00, new C27813COc(R.drawable.instagram_restrict_pano_outline_24), c27814COd9, A00);
                        } else if (interfaceC30799Dga instanceof C26161Bhm) {
                            C27814COd c27814COd10 = new C27814COd(2131972995);
                            cs7 = new CS7(C26932BuZ.A00, new C27813COc(R.drawable.instagram_user_pano_outline_20), c27814COd10, A00);
                        } else if (C26163Bho.A00(interfaceC30799Dga, 0)) {
                            C27814COd c27814COd11 = new C27814COd(2131956443);
                            cs7 = new CS7(C26932BuZ.A00, new C27813COc(R.drawable.instagram_app_threads_pano_outline_24), c27814COd11, A00);
                        } else {
                            throw B4Z.A00();
                        }
                    }
                }
                C27814COd c27814COd12 = new C27814COd(2131956433);
                cs7 = new CS7(C26932BuZ.A00, new C27813COc(R.drawable.instagram_restrict_pano_outline_24), c27814COd12, A00);
            }
            A1E.add(cs7);
        }
        return AbstractC001800i.A0a(A1E);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x019e  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x01bc  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void A05(X.C51618MrB r22, X.C25814BbV r23, X.InterfaceC38371qR r24) {
        /*
            Method dump skipped, instructions count: 582
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C25814BbV.A05(X.MrB, X.BbV, X.1qR):void");
    }

    public static final void A06(C25814BbV c25814BbV) {
        String str;
        C166047bW c166047bW;
        User user;
        C166027bU c166027bU = c25814BbV.A0B;
        C0UO c0uo = c166027bU.A03;
        C166047bW c166047bW2 = (C166047bW) c0uo.getValue();
        if (c166047bW2 != null && (user = c166047bW2.A0A) != null) {
            str = user.getUsername();
        } else {
            str = "";
        }
        C05A c05a = c166027bU.A02;
        C166047bW c166047bW3 = (C166047bW) c0uo.getValue();
        if (c166047bW3 != null) {
            Integer num = c166047bW3.A0B;
            boolean z = c166047bW3.A0Y;
            String str2 = c166047bW3.A0H;
            boolean z2 = c166047bW3.A0T;
            boolean z3 = c166047bW3.A0W;
            boolean z4 = c166047bW3.A0Z;
            boolean z5 = c166047bW3.A0U;
            boolean z6 = c166047bW3.A0g;
            boolean z7 = c166047bW3.A0a;
            boolean z8 = c166047bW3.A0b;
            boolean z9 = c166047bW3.A0c;
            boolean z10 = c166047bW3.A0d;
            boolean z11 = c166047bW3.A0e;
            boolean z12 = c166047bW3.A0f;
            User user2 = c166047bW3.A0A;
            String str3 = c166047bW3.A0I;
            EnumC40111tc enumC40111tc = c166047bW3.A05;
            String str4 = c166047bW3.A0J;
            String str5 = c166047bW3.A0K;
            ProductType productType = c166047bW3.A07;
            String str6 = c166047bW3.A0L;
            String str7 = c166047bW3.A0O;
            String str8 = c166047bW3.A0P;
            String str9 = c166047bW3.A0D;
            boolean z13 = c166047bW3.A0h;
            String str10 = c166047bW3.A0E;
            Long l = c166047bW3.A0C;
            String str11 = c166047bW3.A0F;
            boolean z14 = c166047bW3.A0V;
            C3YU c3yu = c166047bW3.A06;
            InterfaceC101404gy interfaceC101404gy = c166047bW3.A09;
            InterfaceC101404gy interfaceC101404gy2 = c166047bW3.A08;
            EnumC76383bi enumC76383bi = c166047bW3.A04;
            int i = c166047bW3.A00;
            boolean z15 = c166047bW3.A0R;
            Map map = c166047bW3.A0Q;
            ImageUrl imageUrl = c166047bW3.A03;
            boolean z16 = c166047bW3.A0X;
            String str12 = c166047bW3.A0G;
            String str13 = c166047bW3.A0M;
            String str14 = c166047bW3.A0N;
            TestimonialDict testimonialDict = c166047bW3.A02;
            IGCommentSheetMoreInfo iGCommentSheetMoreInfo = c166047bW3.A01;
            C14360o3.A0B(str3, 16);
            C14360o3.A0B(enumC40111tc, 17);
            C14360o3.A0B(str5, 19);
            C14360o3.A0B(c3yu, 30);
            C14360o3.A0B(enumC76383bi, 33);
            c166047bW = new C166047bW(iGCommentSheetMoreInfo, testimonialDict, imageUrl, enumC76383bi, enumC40111tc, c3yu, productType, interfaceC101404gy, interfaceC101404gy2, user2, num, l, str2, str3, str4, str5, str6, str7, str8, str9, str10, str11, str12, str13, str14, map, i, true, z, z2, z3, z4, z5, z6, z7, z8, z9, z10, z11, z12, z13, z14, z15, z16);
        } else {
            c166047bW = null;
        }
        c05a.Egh(c166047bW);
        c25814BbV.A0N.Egh(new C206339Bq(str, 1));
    }

    public static final void A07(C25814BbV c25814BbV, Integer num, String str, String str2, String str3, String str4, List list, boolean z) {
        if (z) {
            A06(c25814BbV);
        } else if (list != null && !list.isEmpty()) {
            c25814BbV.A0O.Egh(new C23584Ace(num, str, str2, list));
        }
        C166057bY c166057bY = c25814BbV.A07;
        ConcurrentHashMap concurrentHashMap = c166057bY.A03;
        Number number = (Number) concurrentHashMap.get(str);
        if (number != null) {
            c166057bY.A00.flowMarkPoint(number.longValue(), "request_end");
        }
        C166057bY.A00(c166057bY, str, "post_comment_fail", str3, str4, concurrentHashMap);
    }

    private final void A08(boolean z) {
        this.A0N.Egh(new C9B4(z, 1));
    }

    public static final boolean A09(C25814BbV c25814BbV) {
        C26025BfE c26025BfE = c25814BbV.A08;
        if (!c26025BfE.A0e && !c26025BfE.A0f) {
            UserSession userSession = c25814BbV.A0E;
            C06090Tz c06090Tz = C06090Tz.A05;
            if (!C18U.A06(c06090Tz, userSession, 36319012254260099L) && !C18U.A06(c06090Tz, userSession, 36322967919667996L)) {
                return false;
            }
        }
        return true;
    }

    public static final boolean A0A(C25814BbV c25814BbV) {
        User user;
        C166047bW c166047bW = (C166047bW) c25814BbV.A0B.A03.getValue();
        if (c166047bW != null && (user = c166047bW.A0A) != null) {
            return C14360o3.A0K(C17060sy.A01.A01(c25814BbV.A0E), user);
        }
        return false;
    }

    public final void A0F() {
        AbstractC166987dD.A0f(this.A0C.A01, "tap_on_avatar_comment").Cht();
        if (C14360o3.A0K(C20Y.A00(this.A0E).A01.A00, C125535lz.A00)) {
            A0l(true);
        } else {
            this.A0N.Egh(new C9BK(new C48240LWp(this, 2), 4));
        }
    }

    public final void A0G() {
        MediaCommentListRepository mediaCommentListRepository = this.A0A;
        mediaCommentListRepository.A0W(new J7Q(this, 9));
        if (AbstractC25228BEl.A0s(mediaCommentListRepository).A09) {
            C26025BfE c26025BfE = this.A08;
            if (c26025BfE.A0f && c26025BfE.A0P) {
                mediaCommentListRepository.A0E();
            }
        }
    }

    public final void A0I(CommentGiphyMediaInfo commentGiphyMediaInfo) {
        InterfaceC38371qR interfaceC38371qR = this.A0B.A00;
        if (interfaceC38371qR != null) {
            String A0j = AbstractC167017dG.A0j();
            C166057bY c166057bY = this.A07;
            String str = this.A0I;
            C0UO c0uo = this.A09.A0D;
            boolean A1W = AbstractC167007dF.A1W(c0uo.getValue());
            C26025BfE c26025BfE = this.A08;
            c166057bY.A02(c26025BfE.A01, interfaceC38371qR.BQN().BRp(), str, A0j, c26025BfE.A00, 0L, A1W);
            MediaCommentListRepository mediaCommentListRepository = this.A0A;
            String str2 = null;
            C51618MrB c51618MrB = new C51618MrB(null, A0j, "", 0, 0L, false);
            C167607eG c167607eG = (C167607eG) c0uo.getValue();
            if (c167607eG != null) {
                str2 = c167607eG.A02;
            }
            mediaCommentListRepository.A0G(commentGiphyMediaInfo, new C29116Csh(this, 1), new C29117Csi(this, 1), c51618MrB, null, null, interfaceC38371qR, str2);
            c166057bY.A03(A0j);
            return;
        }
        throw AbstractC166997dE.A0g();
    }

    public final void A0J(C51618MrB c51618MrB, long j, boolean z) {
        C166027bU c166027bU = this.A0B;
        InterfaceC38371qR interfaceC38371qR = c166027bU.A00;
        if (interfaceC38371qR != null) {
            UserSession userSession = this.A0E;
            String A00 = CZ1.A00(userSession);
            if (A00 == null) {
                A00 = AbstractC167017dG.A0j();
                CZ1.A01(userSession, A00);
            }
            C167607eG A002 = this.A09.A00(c51618MrB.A04);
            MediaCommentListRepository mediaCommentListRepository = this.A0A;
            InterfaceC38371qR interfaceC38371qR2 = c166027bU.A00;
            if (interfaceC38371qR2 != null) {
                C167987et c167987et = c51618MrB.A02;
                String str = null;
                if (c167987et != null) {
                    c167987et.A00();
                }
                if (A002 != null) {
                    str = A002.A04;
                }
                ME5 me5 = new ME5(5, c51618MrB, this, interfaceC38371qR);
                C50365MLr c50365MLr = new C50365MLr(c51618MrB, this, A002, A00, 25);
                C29117Csi c29117Csi = new C29117Csi(this, 3);
                C29116Csh c29116Csh = new C29116Csh(this, 3);
                AbstractC166987dD.A1Z(new MediaCommentListRepository$postDelayedComment$1(null, c29116Csh, c29117Csi, mediaCommentListRepository, c51618MrB, null, null, interfaceC38371qR2, A00, str, null, me5, c50365MLr, j, z), ((C4A7) mediaCommentListRepository).A01);
                return;
            }
            throw AbstractC166987dD.A14("Required value was null.");
        }
        throw AbstractC166987dD.A14("Required value was null.");
    }

    public final void A0K(C169207gt c169207gt) {
        this.A0B.A00(new C50369MLw(45, this, c169207gt));
        MediaCommentListRepository mediaCommentListRepository = this.A0A;
        String str = c169207gt.A06;
        mediaCommentListRepository.A0L(c169207gt.A03, Integer.valueOf(c169207gt.A00), str, c169207gt.A05);
    }

    public final void A0L(EnumC168507fk enumC168507fk, C38891rO c38891rO, String str, String str2) {
        this.A0N.Egh(new C9CE(enumC168507fk, c38891rO, str, str2));
        A08(false);
    }

    public final void A0M(EnumC166167bk enumC166167bk, String str) {
        C05A c05a;
        InterfaceC38371qR interfaceC38371qR;
        C38321qM BQN;
        EnumC166167bk enumC166167bk2 = EnumC166167bk.A04;
        if (enumC166167bk == enumC166167bk2 && (interfaceC38371qR = this.A0B.A00) != null && (BQN = interfaceC38371qR.BQN()) != null) {
            C166007bS c166007bS = this.A0C;
            C26025BfE c26025BfE = this.A08;
            c166007bS.A06(BQN, c26025BfE.A04, c26025BfE.A06, c26025BfE.A05);
        }
        if (str != null) {
            MediaCommentListRepository mediaCommentListRepository = this.A0A;
            C206409Bx c206409Bx = (C206409Bx) mediaCommentListRepository.A0J.getValue();
            if (enumC166167bk == enumC166167bk2) {
                if (c206409Bx.A01 != null) {
                    c05a = mediaCommentListRepository.A0G;
                } else {
                    AbstractC166987dD.A1Z(new MC9(mediaCommentListRepository, c206409Bx, str, (InterfaceC23621Ds) null, 16), ((C4A7) mediaCommentListRepository).A01);
                    return;
                }
            } else {
                c05a = mediaCommentListRepository.A0G;
                enumC166167bk = EnumC166167bk.A03;
            }
            c05a.Egh(new C206409Bx(enumC166167bk, c206409Bx.A01));
        }
    }

    public final void A0N(EnumC166167bk enumC166167bk, String str, String str2) {
        InterfaceC38371qR interfaceC38371qR;
        C38321qM BQN;
        if (enumC166167bk == EnumC166167bk.A04 && (interfaceC38371qR = this.A0B.A00) != null && (BQN = interfaceC38371qR.BQN()) != null) {
            C166007bS c166007bS = this.A0C;
            C26025BfE c26025BfE = this.A08;
            c166007bS.A06(BQN, c26025BfE.A04, c26025BfE.A06, c26025BfE.A05);
        }
        MediaCommentListRepository mediaCommentListRepository = this.A0A;
        AbstractC166987dD.A1Z(new C206749Df(mediaCommentListRepository, enumC166167bk, str, str2, null), ((C4A7) mediaCommentListRepository).A01);
    }

    public final void A0P(InterfaceC30799Dga interfaceC30799Dga) {
        Object c167187dX;
        Object c167127dR;
        Long A0k;
        C38321qM c38321qM;
        String str;
        Object c167077dM;
        Object c9bz;
        Object c166967dA;
        EnumC65855TvH enumC65855TvH;
        VG2 vg2;
        C14360o3.A0B(interfaceC30799Dga, 0);
        C28355CfF c28355CfF = (C28355CfF) this.A0K.getValue();
        C05A c05a = this.A0N;
        C05A c05a2 = this.A0O;
        C141796aw A00 = AbstractC141776au.A00(this);
        C166007bS c166007bS = this.A0C;
        C25344BJn c25344BJn = new C25344BJn(this, 20);
        C14360o3.A0B(c05a, 1);
        AbstractC167007dF.A1F(c05a2, 2, c166007bS);
        MediaCommentListRepository mediaCommentListRepository = c28355CfF.A01;
        C166137bh A0s = AbstractC25228BEl.A0s(mediaCommentListRepository);
        C14360o3.A0B(A0s, 0);
        ArrayList A0A = AbstractC166327c1.A0A(A0s, DMP.A00);
        if (A0A.isEmpty()) {
            c166967dA = new C9BK(new C26166Bhr(BHS.A00(new Object[0], 2131956456)));
        } else {
            if (interfaceC30799Dga.equals(C29120Csl.A00)) {
                C006802i c006802i = C006802i.A0p;
                C14360o3.A07(c006802i);
                c006802i.markerPoint(309476254, "select_comment_screen_delete_comments_tap");
                c28355CfF.A03.A01(c166007bS, A00, c05a);
                return;
            }
            if (C9B6.A00(interfaceC30799Dga, 1)) {
                if (!AbstractC25226BEj.A1b(A0A)) {
                    return;
                }
                C167297di c167297di = (C167297di) AbstractC001800i.A0I(A0A);
                C51760Mtj A002 = AbstractC166327c1.A00(A0A);
                String str2 = c167297di.A0K;
                User user = c167297di.A0C;
                user.getId();
                int size = A0A.size();
                UserSession userSession = c166007bS.A02;
                C006802i c006802i2 = C006802i.A0p;
                C14360o3.A07(c006802i2);
                c006802i2.markerPoint(309476254, "select_comment_screen_self_remediation_actions_icon_tap");
                c166007bS.A0B("comments_bulk_report_tapped", size);
                userSession.A01(VgT.class, new C50168MDv(43, userSession, false));
                boolean z = ((C9B6) interfaceC30799Dga).A01;
                if (z && C28355CfF.A01(c28355CfF, user)) {
                    c28355CfF.A02.A00(new C50369MLw(43, c167297di, c166007bS));
                }
                C39456Hbi c39456Hbi = new C39456Hbi(0, c28355CfF, c05a, A002);
                C168497fj c168497fj = c167297di.A07;
                String str3 = c168497fj.A04;
                boolean z2 = c168497fj.A05;
                if (!z2 || str3 == null) {
                    str3 = str2;
                }
                if (z2) {
                    enumC65855TvH = EnumC65855TvH.A0F;
                    vg2 = VG2.A0d;
                } else {
                    enumC65855TvH = EnumC65855TvH.A0J;
                    vg2 = VG2.A07;
                }
                c167077dM = new C166947d8(user, enumC65855TvH, vg2, c39456Hbi, new C29417Cxo((C167297di) AbstractC001800i.A0I(A0A), c166007bS, c28355CfF, c25344BJn), str3, str2, c167297di.A0N, c28355CfF.A00.A0F, C28355CfF.A00(AbstractC166987dD.A1J(c167297di)), C28355CfF.A01(c28355CfF, user), z);
            } else {
                if (interfaceC30799Dga instanceof C26162Bhn) {
                    C28238Cci c28238Cci = C28238Cci.A00;
                    UserSession userSession2 = c28355CfF.A04;
                    C26162Bhn c26162Bhn = (C26162Bhn) interfaceC30799Dga;
                    boolean z3 = c26162Bhn.A03;
                    boolean z4 = !z3;
                    C006802i c006802i3 = C006802i.A0p;
                    if (z4) {
                        C14360o3.A07(c006802i3);
                        c006802i3.markerPoint(309476254, "select_comment_screen_pin_comment_tap");
                        c28238Cci.A01(userSession2);
                    } else {
                        C14360o3.A07(c006802i3);
                        c006802i3.markerPoint(309476254, "select_comment_screen_unpin_comment_tap");
                    }
                    String str4 = c26162Bhn.A00;
                    String str5 = c26162Bhn.A01;
                    boolean z5 = c26162Bhn.A02;
                    C14360o3.A0B(str4, 0);
                    if (z3) {
                        C14360o3.A0B(str5, 1);
                        c9bz = new C206219Be(new DialogInterfaceOnCancelListenerC28534CiS(this, str4, str5, z5), new DialogInterfaceOnClickListenerC28541CiZ(this, str4, str5, 1, z5), new DialogInterfaceOnClickListenerC28541CiZ(this, str4, str5, 0, z5));
                    } else {
                        C14360o3.A0B(str5, 1);
                        c166007bS.A0D("pin_comment", str4, str5, z5);
                        c05a.Egh(C167037dI.A00);
                        J7Q j7q = new J7Q(this, 11);
                        J7Q j7q2 = new J7Q(this, 10);
                        MediaCommentListRepository mediaCommentListRepository2 = ((C27816COf) this.A0M.getValue()).A00;
                        C0UO c0uo = mediaCommentListRepository2.A0L;
                        int i = 3;
                        if (((C166137bh) c0uo.getValue()).A08) {
                            i = 4;
                        }
                        if (((C166137bh) c0uo.getValue()).A00 >= i) {
                            c9bz = C166977dB.A00;
                        } else {
                            AbstractC166987dD.A1Z(new C57161PZf(j7q, j7q2, mediaCommentListRepository2, str4, (InterfaceC23621Ds) null, 6), ((C4A7) mediaCommentListRepository2).A01);
                            return;
                        }
                    }
                } else {
                    if (C9B6.A00(interfaceC30799Dga, 0)) {
                        ArrayList A0i = AbstractC167007dF.A0i(A0A);
                        Iterator it = A0A.iterator();
                        while (it.hasNext()) {
                            A0i.add(((C167297di) it.next()).A0K);
                        }
                        String A04 = c166007bS.A04();
                        C006802i c006802i4 = C006802i.A0p;
                        C14360o3.A07(c006802i4);
                        c006802i4.markerPoint(309476254, "select_comment_screen_block_comments_tap");
                        C006802i c006802i5 = C006802i.A0p;
                        C14360o3.A07(c006802i5);
                        c006802i5.markerPoint(309476254, AbstractC111324zv.A00(1987));
                        C166007bS.A02(c166007bS, "bulk_block_button", A04, A0i);
                        if (((C9B6) interfaceC30799Dga).A01) {
                            c166967dA = new C166967dA(((C167297di) AbstractC001800i.A0I(A0A)).A0C, (String) AbstractC001800i.A0I(A0i));
                        } else {
                            ArrayList A1E = AbstractC166987dD.A1E();
                            Iterator it2 = A0A.iterator();
                            while (it2.hasNext()) {
                                Object next = it2.next();
                                AbstractC25232BEp.A1Q(((C167297di) next).A0C, C17060sy.A01.A01(c28355CfF.A04), next, A1E);
                            }
                            ArrayList A0i2 = AbstractC167007dF.A0i(A1E);
                            Iterator it3 = A1E.iterator();
                            while (it3.hasNext()) {
                                A0i2.add(((C167297di) it3.next()).A0C.getId());
                            }
                            java.util.Set A0k2 = AbstractC001800i.A0k(A0i2);
                            c167187dX = new C9BZ(new C29719D8p(c166007bS, c28355CfF, A04, A0i, A0A, A0k2, c05a), new MI7(A0i, c166007bS, A04, 17), A0k2.size(), 0);
                        }
                    } else {
                        if (interfaceC30799Dga.equals(C29123Cso.A00)) {
                            C28238Cci c28238Cci2 = C28238Cci.A00;
                            UserSession userSession3 = c28355CfF.A04;
                            C006802i c006802i6 = C006802i.A0p;
                            C14360o3.A07(c006802i6);
                            c006802i6.markerPoint(309476254, "unfollow_account_click");
                            c28238Cci2.A01(userSession3);
                            c167127dR = new C166897d2(((C167297di) AbstractC001800i.A0I(A0A)).A0C);
                        } else if (interfaceC30799Dga.equals(C29118Csj.A00)) {
                            ArrayList A1E2 = AbstractC166987dD.A1E();
                            Iterator it4 = A0A.iterator();
                            while (it4.hasNext()) {
                                Object next2 = it4.next();
                                AbstractC25232BEp.A1Q(((C167297di) next2).A0C, C17060sy.A01.A01(c28355CfF.A04), next2, A1E2);
                            }
                            ArrayList A0i3 = AbstractC167007dF.A0i(A1E2);
                            Iterator it5 = A1E2.iterator();
                            while (it5.hasNext()) {
                                A0i3.add(((C167297di) it5.next()).A0C.getId());
                            }
                            java.util.Set A0k3 = AbstractC001800i.A0k(A0i3);
                            ArrayList A0i4 = AbstractC167007dF.A0i(A0A);
                            Iterator it6 = A0A.iterator();
                            while (it6.hasNext()) {
                                A0i4.add(((C167297di) it6.next()).A0K);
                            }
                            String A042 = c166007bS.A04();
                            C006802i c006802i7 = C006802i.A0p;
                            C14360o3.A07(c006802i7);
                            c006802i7.markerPoint(309476254, "select_comment_screen_restrict_comments_tap");
                            C166007bS.A02(c166007bS, "bulk_block_button", A042, A0i4);
                            C006802i c006802i8 = C006802i.A0p;
                            C14360o3.A07(c006802i8);
                            c006802i8.markerPoint(309476254, AbstractC111324zv.A00(3024));
                            c9bz = new C9BZ(new MEC(c166007bS, A0k3, A0i4, c05a, A042, 2), new MI7(A0i4, c166007bS, A042, 18), A0k3.size(), 1);
                        } else {
                            String str6 = "";
                            String str7 = null;
                            if (C26163Bho.A00(interfaceC30799Dga, 1)) {
                                if (((C26163Bho) interfaceC30799Dga).A01 != C05F.A00) {
                                    return;
                                }
                                C167297di c167297di2 = (C167297di) AbstractC001800i.A0I(A0A);
                                C166027bU c166027bU = c28355CfF.A02;
                                InterfaceC38371qR interfaceC38371qR = c166027bU.A00;
                                if (interfaceC38371qR != null) {
                                    c38321qM = interfaceC38371qR.BQN();
                                } else {
                                    c38321qM = null;
                                }
                                mediaCommentListRepository.A0D();
                                c166027bU.A00(new C30172DRc(13, c166007bS, c167297di2, c28355CfF));
                                if (c38321qM != null) {
                                    str = c38321qM.A0P;
                                    str7 = c38321qM.A0Q;
                                } else {
                                    str = null;
                                }
                                String str8 = c167297di2.A0K;
                                String str9 = c167297di2.A0J;
                                if (str9 == null) {
                                    str9 = "";
                                }
                                c167077dM = new C167077dM(c38321qM, c167297di2.A0C, str, str7, str8, str9);
                            } else {
                                if (interfaceC30799Dga.equals(C29122Csn.A00)) {
                                    if (!AbstractC25226BEj.A1b(A0A)) {
                                        return;
                                    }
                                    C167297di c167297di3 = (C167297di) AbstractC001800i.A0I(A0A);
                                    C28238Cci c28238Cci3 = C28238Cci.A00;
                                    UserSession userSession4 = c28355CfF.A04;
                                    C006802i c006802i9 = C006802i.A0p;
                                    C14360o3.A07(c006802i9);
                                    c006802i9.markerPoint(309476254, "comment_share_click");
                                    c28238Cci3.A01(userSession4);
                                    String str10 = c167297di3.A0K;
                                    String str11 = c167297di3.A0J;
                                    if (str11 != null) {
                                        str6 = str11;
                                    }
                                    User user2 = c167297di3.A0C;
                                    c05a.Egh(new C9CC(user2, str10, str6));
                                    String id = user2.getId();
                                    C166047bW c166047bW = (C166047bW) c28355CfF.A02.A03.getValue();
                                    if (c166047bW != null) {
                                        str7 = c166047bW.A0K;
                                    }
                                    InterfaceC02590Ai A0f = AbstractC166987dD.A0f(c166007bS.A01, AbstractC111324zv.A00(4587));
                                    A0f.AAP("event", "click");
                                    A0f.A8R(EnumC33488ErN.COMMENTS, "screen");
                                    A0f.AAP(ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY, AbstractC111324zv.A00(2158));
                                    A0f.A8R(C8d.SHARE_COMMENT_TO_STORY, "project");
                                    String str12 = c166007bS.A02.userId;
                                    C14360o3.A0B(str12, 0);
                                    A0f.A9K(AbstractC111324zv.A00(343), AbstractC003100w.A0k(10, str12));
                                    Long A0k4 = AbstractC003100w.A0k(10, id);
                                    if (A0k4 != null) {
                                        A0f.A9K(AbstractC111324zv.A00(1327), A0k4);
                                    }
                                    if (str7 != null && (A0k = AbstractC003100w.A0k(10, str7)) != null) {
                                        A0f.A9K("media_igid", A0k);
                                    }
                                    A0f.AAP("extra", new JSONObject(AbstractC167007dF.A0n("comment_id", str10)).toString());
                                    A0f.Cht();
                                    return;
                                }
                                if (interfaceC30799Dga.equals(C29119Csk.A00)) {
                                    mediaCommentListRepository.A0D();
                                    return;
                                }
                                if (interfaceC30799Dga.equals(C29121Csm.A00)) {
                                    C167297di c167297di4 = (C167297di) AbstractC001800i.A0I(A0A);
                                    c167127dR = new C167127dR(c167297di4.A0C, new C29417Cxo((C167297di) AbstractC001800i.A0I(A0A), c166007bS, c28355CfF, c25344BJn), c167297di4.A0K, c167297di4.A0N, C28355CfF.A00(AbstractC166987dD.A1J(c167297di4)));
                                } else {
                                    if (interfaceC30799Dga.equals(C29124Csp.A00)) {
                                        C167297di c167297di5 = (C167297di) AbstractC001800i.A0I(A0A);
                                        c28355CfF.A02.A00(new C50369MLw(44, c167297di5, c166007bS));
                                        String str13 = c167297di5.A0K;
                                        String str14 = c167297di5.A0N;
                                        User user3 = c167297di5.A0C;
                                        C14360o3.A0B(str13, 0);
                                        A0W(user3, str13, str14);
                                        return;
                                    }
                                    if (interfaceC30799Dga instanceof C26161Bhm) {
                                        c05a2.Egh(new C206399Bw(EnumC46186KcO.A06, ((C26161Bhm) interfaceC30799Dga).A00));
                                        return;
                                    } else if (C26163Bho.A00(interfaceC30799Dga, 0)) {
                                        C167297di c167297di6 = (C167297di) AbstractC001800i.A0I(A0A);
                                        String str15 = c167297di6.A0J;
                                        if (str15 == null) {
                                            str15 = "";
                                        }
                                        c167187dX = new C167187dX((ProductType) ((C26163Bho) interfaceC30799Dga).A01, str15, c167297di6.A0M, c167297di6.A0L, c167297di6.A0K, c167297di6.A0C.getId());
                                    } else {
                                        throw B4Z.A00();
                                    }
                                }
                            }
                        }
                        c05a.Egh(c167127dR);
                        return;
                    }
                    c05a.Egh(c167187dX);
                    return;
                }
                c05a.Egh(c9bz);
                return;
            }
            c05a.Egh(c167077dM);
            return;
        }
        c05a.Egh(c166967dA);
    }

    public final void A0Q(C38891rO c38891rO, String str, String str2) {
        this.A0A.A0N(str, str2);
        this.A0N.Egh(new C9CC(c38891rO, str, str2));
        A08(false);
    }

    public final void A0W(User user, String str, String str2) {
        MediaCommentListRepository mediaCommentListRepository = this.A0A;
        C50369MLw c50369MLw = new C50369MLw(46, this, user);
        J7Q j7q = new J7Q(this, 14);
        AbstractC166987dD.A1Z(new JZ1(c50369MLw, j7q, mediaCommentListRepository, str, str2, null, 0), ((C4A7) mediaCommentListRepository).A01);
    }

    public final void A0X(User user, String str, boolean z) {
        User user2;
        C38321qM BQN;
        C65 c65;
        C166027bU c166027bU = this.A0B;
        InterfaceC38371qR interfaceC38371qR = c166027bU.A00;
        UserPayFanclubUpsellParams userPayFanclubUpsellParams = null;
        if (interfaceC38371qR != null && (BQN = interfaceC38371qR.BQN()) != null && str != null) {
            C166007bS c166007bS = this.A0C;
            UserSession userSession = c166007bS.A02;
            C3N0.A00(userSession).EWt(str);
            InterfaceC60442pS interfaceC60442pS = c166007bS.A03;
            C5SE c5se = new C5SE(userSession, BQN);
            int i = -1;
            if (BQN.A5M()) {
                i = 0;
            }
            c5se.A00 = i;
            boolean A2N = user.A2N();
            if (user.equals(BQN.A2E(userSession))) {
                c65 = C65.BRAND;
            } else {
                c65 = C65.USER;
            }
            C32U.A0K(userSession, c5se, c65, BQN, interfaceC60442pS, null, null, null, A2N);
        }
        C166047bW c166047bW = (C166047bW) c166027bU.A03.getValue();
        if (c166047bW != null) {
            user2 = c166047bW.A0A;
        } else {
            user2 = null;
        }
        if (z && user2 != null) {
            userPayFanclubUpsellParams = AbstractC35234FgS.A00(this.A0E, user2);
        }
        this.A0N.Egh(new C9CC(userPayFanclubUpsellParams, user.getId(), str));
    }

    public final void A0b(String str, String str2) {
        MediaCommentListRepository mediaCommentListRepository = this.A0A;
        AbstractC166987dD.A1Z(new C50125MBz(mediaCommentListRepository, str, str2, (InterfaceC23621Ds) null, 3), ((C4A7) mediaCommentListRepository).A01);
    }

    public final void A0c(String str, String str2) {
        MediaCommentListRepository mediaCommentListRepository = this.A0A;
        AbstractC166987dD.A1Z(new MBX(mediaCommentListRepository, str2, str, (InterfaceC23621Ds) null, 3), ((C4A7) mediaCommentListRepository).A01);
    }

    public final void A0f(String str, String str2) {
        this.A0C.A0C(str2, this.A08.A0F, str, null);
    }

    public final void A0g(String str, String str2) {
        InterfaceC38371qR interfaceC38371qR = this.A0B.A00;
        if (interfaceC38371qR != null) {
            C166057bY c166057bY = this.A07;
            String str3 = this.A0I;
            boolean A1W = AbstractC167007dF.A1W(this.A09.A0D.getValue());
            C26025BfE c26025BfE = this.A08;
            int i = c26025BfE.A00;
            c166057bY.A02(c26025BfE.A01, interfaceC38371qR.BQN().BRp(), str3, str, i, 0L, A1W);
            c166057bY.A03(str);
            this.A0A.A0H(new C29116Csh(this, 4), new C29117Csi(this, 4), interfaceC38371qR, str, str2);
            return;
        }
        throw AbstractC166997dE.A0g();
    }

    public final void A0k(UUID uuid) {
        UUID uuid2;
        C05A c05a = this.A0R;
        InterfaceC166277bw interfaceC166277bw = (InterfaceC166277bw) c05a.getValue();
        if (interfaceC166277bw instanceof C167827ec) {
            uuid2 = ((C167827ec) interfaceC166277bw).A02;
        } else if (interfaceC166277bw instanceof C167837ed) {
            uuid2 = ((C167837ed) interfaceC166277bw).A00;
        } else {
            if (interfaceC166277bw instanceof C166267bv) {
                this.A0A.A0V(uuid);
                return;
            }
            throw B4Z.A00();
        }
        if (C14360o3.A0K(uuid2, uuid)) {
            c05a.Egh(C166267bv.A00);
        }
    }

    public final void A0l(boolean z) {
        C38321qM c38321qM;
        C05A c05a = this.A0O;
        C166027bU c166027bU = this.A0B;
        InterfaceC38371qR interfaceC38371qR = c166027bU.A00;
        if (interfaceC38371qR != null) {
            c38321qM = interfaceC38371qR.BQN();
        } else {
            c38321qM = null;
        }
        c05a.Egh(new C7e6(c38321qM, z, false));
        c166027bU.A00(C30185DRq.A02(this, 18));
    }

    public final void A0m(boolean z) {
        C22P c22p;
        InterfaceC38371qR interfaceC38371qR = this.A0B.A00;
        if (interfaceC38371qR != null) {
            C05A c05a = this.A0O;
            C167607eG c167607eG = (C167607eG) this.A09.A0D.getValue();
            boolean A5P = interfaceC38371qR.BQN().A5P();
            if (z) {
                c22p = C22P.A5V;
            } else if (A5P) {
                c22p = C22P.A0u;
            } else {
                c22p = C22P.A2k;
            }
            c05a.Egh(new C167527e8(c22p, c167607eG));
            return;
        }
        throw AbstractC166997dE.A0g();
    }

    @Override // X.AbstractC52922bZ
    public final void onCleared() {
        MediaCommentListRepository mediaCommentListRepository = this.A0A;
        AbstractC166987dD.A1Z(new C206629Ct(mediaCommentListRepository, null, 12), ((C4A7) mediaCommentListRepository).A01);
        InterfaceC09390do interfaceC09390do = this.A0L;
        if (interfaceC09390do.CWa()) {
            C28212CcA c28212CcA = (C28212CcA) interfaceC09390do.getValue();
            Map map = c28212CcA.A02;
            Iterator it = map.keySet().iterator();
            while (it.hasNext()) {
                C28212CcA.A00((C51760Mtj) it.next(), c28212CcA, C30745Dfi.A00);
            }
            map.clear();
        }
        if (!this.A02) {
            C28238Cci.A00.A00(this.A0E);
        }
        C166017bT c166017bT = this.A09;
        if (((String) c166017bT.A0A.getValue()).length() > 0) {
            c166017bT.A0D.getValue();
            this.A0B.A00(C30185DRq.A02(this, 13));
            c166017bT.A04(this.A08.A0F);
        } else {
            String str = this.A08.A0F;
            C14360o3.A0B(str, 0);
            c166017bT.A00.A00.remove(str);
        }
    }

    public static int A00(List list, List list2, int i) {
        AbstractC166307bz.A02((C9BW) list.get(i), EnumC168507fk.A04, list2);
        return i + 1;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0038, code lost:
    
        if (r4.CdW() != false) goto L12;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.C75113Zb A0E(X.C38321qM r4) {
        /*
            r3 = this;
            int r1 = r4.A0p()
            boolean r0 = r4.A4w()
            X.3Zb r2 = new X.3Zb
            r2.<init>(r1, r0)
            X.341 r1 = X.AnonymousClass341.A08
            r0 = 0
            X.C14360o3.A0B(r1, r0)
            r2.A0o = r1
            X.BfE r1 = r3.A08
            java.lang.Integer r0 = r1.A06
            if (r0 == 0) goto L22
            int r0 = r0.intValue()
            r2.A0D(r0)
        L22:
            java.lang.Integer r0 = r1.A04
            if (r0 == 0) goto L2d
            int r0 = r0.intValue()
            r2.A0B(r0)
        L2d:
            int r0 = r4.A0x()
            if (r0 == 0) goto L3a
            boolean r1 = r4.CdW()
            r0 = 1
            if (r1 == 0) goto L3b
        L3a:
            r0 = 0
        L3b:
            r2.A2U = r0
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C25814BbV.A0E(X.1qM):X.3Zb");
    }

    public final void A0R(C169287h2 c169287h2, String str) {
        AbstractC167017dG.A1N(c169287h2, str);
        this.A0C.A05(c169287h2);
        this.A0O.Egh(new C167497e4(null, str));
    }
}
