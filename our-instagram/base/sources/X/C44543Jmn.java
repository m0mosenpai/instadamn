package X;

import com.instagram.avatars.common.AvatarInfo;
import com.instagram.avatars.graphql.AvatarMentionsRepository;
import com.instagram.avatars.store.AvatarStore;
import com.instagram.common.session.UserSession;
import com.instagram.stickersearch.AvatarStickerInteractor;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;

/* renamed from: X.Jmn, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C44543Jmn extends AbstractC52922bZ {
    public int A00;
    public int A01;
    public AvatarInfo A02;
    public AbstractC46382Kg4 A03;
    public AbstractC46386Kg8 A04;
    public String A05;
    public String A06;
    public List A07;
    public List A08;
    public boolean A09;
    public boolean A0A;
    public final C51758Mth A0B;
    public final EnumC143276dS A0C;
    public final EnumC143286dT A0D;
    public final AvatarMentionsRepository A0E;
    public final L39 A0F;
    public final AvatarStore A0G;
    public final C006802i A0H;
    public final UserSession A0I;
    public final C142016bK A0J;
    public final C77A A0K;
    public final C21C A0L;
    public final AvatarStickerInteractor A0M;
    public final AbstractC46518KiH A0N;
    public final Integer A0O;
    public final String A0P;
    public final String A0Q;
    public final ArrayList A0R;
    public final C05A A0S;
    public final C05A A0T;
    public final boolean A0U;

    public /* synthetic */ C44543Jmn(C51758Mth c51758Mth, EnumC143276dS enumC143276dS, EnumC143286dT enumC143286dT, L39 l39, UserSession userSession, C142016bK c142016bK, C77A c77a, AvatarStickerInteractor avatarStickerInteractor, AbstractC46518KiH abstractC46518KiH, Integer num, String str, String str2, boolean z) {
        AvatarMentionsRepository avatarMentionsRepository = new AvatarMentionsRepository(userSession);
        C21C A00 = C21B.A00(userSession);
        AvatarStore A002 = C20Y.A00(userSession);
        AbstractC25234BEr.A0j(2, userSession, c142016bK, enumC143286dT, enumC143276dS);
        AbstractC167007dF.A1I(c77a, 7, abstractC46518KiH);
        AbstractC25234BEr.A1Q(A00, A002, l39);
        this.A0M = avatarStickerInteractor;
        this.A0I = userSession;
        this.A0J = c142016bK;
        this.A0D = enumC143286dT;
        this.A0C = enumC143276dS;
        this.A0Q = str;
        this.A0K = c77a;
        this.A0N = abstractC46518KiH;
        this.A0B = c51758Mth;
        this.A0P = str2;
        this.A0E = avatarMentionsRepository;
        this.A0L = A00;
        this.A0G = A002;
        this.A0F = l39;
        this.A0U = z;
        this.A0O = num;
        this.A09 = true;
        this.A0R = AbstractC166987dD.A1E();
        this.A05 = "";
        this.A01 = 1;
        this.A0H = C006802i.A0p;
        this.A0S = C10E.A00(C45452KAn.A00);
        this.A0T = C10E.A00(C45447KAi.A00);
        C141796aw A003 = AbstractC141776au.A00(this);
        MBq mBq = new MBq(this, null, 19);
        AnonymousClass191 anonymousClass191 = AnonymousClass191.A00;
        AbstractC23641Du.A05(anonymousClass191, new MBq(this, null, 20), AbstractC25235BEs.A0W(this, anonymousClass191, mBq, A003));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.util.List] */
    public final void A02() {
        this.A03 = null;
        C05A c05a = this.A0S;
        ArrayList arrayList = this.A0R;
        boolean isEmpty = arrayList.isEmpty();
        ArrayList arrayList2 = arrayList;
        if (isEmpty) {
            arrayList2 = this.A07;
        }
        c05a.Egh(new C45451KAm(null, null, this.A04, arrayList2));
    }

    public final void A04(String str) {
        if (this.A0A) {
            Pattern pattern = AbstractC13670mt.A06;
            if (str.length() == 1 && ((char) str.codePointAt(0)) == '@') {
                if (this.A05.length() == 0) {
                    AbstractC31179DnN.A1N(AbstractC12220kQ.A02(this.A0I), "avatar_mentions_search_bar_action");
                }
                this.A05 = str;
            }
        }
        if (this.A0A) {
            Pattern pattern2 = AbstractC13670mt.A06;
            if (str.length() > 1 && ((char) str.codePointAt(0)) == '@') {
                String A0z = AbstractC43592JPx.A0z(str, 1);
                this.A0S.Egh(C45455KAq.A00);
                AbstractC23641Du.A05(AbstractC25231BEo.A0e(C12L.A00), new C50120MBu(this, A0z, null, 14), AbstractC141776au.A00(this));
                this.A05 = str;
            }
        }
        if (str.length() > 0) {
            this.A0S.Egh(C45455KAq.A00);
            C50120MBu.A01(this, str, AbstractC141776au.A00(this), 13);
        } else {
            ArrayList arrayList = this.A0R;
            if (arrayList.isEmpty()) {
                this.A09 = true;
                this.A00 = 0;
                arrayList.clear();
                A01();
            } else {
                this.A0S.Egh(new C45451KAm(null, this.A03, this.A04, arrayList));
            }
        }
        this.A05 = str;
    }

    public static final void A00(C44543Jmn c44543Jmn) {
        Object c45451KAm;
        c44543Jmn.A0H.markerEnd(129908197, (short) 3);
        ArrayList arrayList = c44543Jmn.A0R;
        boolean isEmpty = arrayList.isEmpty();
        C05A c05a = c44543Jmn.A0S;
        if (isEmpty) {
            c45451KAm = C45456KAr.A00;
        } else {
            c45451KAm = new C45451KAm(null, c44543Jmn.A03, c44543Jmn.A04, arrayList);
        }
        c05a.Egh(c45451KAm);
    }

    /* JADX WARN: Code restructure failed: missing block: B:38:0x00b9, code lost:
    
        if (X.C18U.A06(X.C06090Tz.A05, r5, 36322989393849151L) == false) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x00f7, code lost:
    
        if (r20.A0P != null) goto L43;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A01() {
        /*
            Method dump skipped, instructions count: 262
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C44543Jmn.A01():void");
    }

    public final void A03(C148286ly c148286ly) {
        EnumC150226pU enumC150226pU;
        String str = c148286ly.A0a;
        C14360o3.A07(str);
        c148286ly.A0S = c148286ly.A0a;
        List A1J = AbstractC166987dD.A1J(c148286ly);
        if (c148286ly.A04() == C05F.A0N) {
            enumC150226pU = EnumC150226pU.A0A;
        } else {
            enumC150226pU = EnumC150226pU.A0C;
        }
        C148276lx c148276lx = new C148276lx(enumC150226pU, str, A1J);
        C142016bK c142016bK = this.A0J;
        c142016bK.A00.put(c148276lx.A0Z, c148276lx);
    }
}
