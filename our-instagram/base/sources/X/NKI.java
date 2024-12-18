package X;

import com.instagram.common.session.UserSession;
import com.instagram.creation.base.MediaSession;
import com.instagram.shopping.model.taggingfeed.ProductCollectionFeedTaggingMeta;
import com.instagram.tagging.activity.mediaTaggingInfo.MediaTaggingInfo;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes9.dex */
public final class NKI extends OX6 {
    public boolean A00;
    public final UserSession A01;
    public final AnonymousClass841 A02;
    public final C52458NJc A03;
    public final String A04;
    public final C19L A05;
    public final InterfaceC06180Ui A06;
    public final C05A A07;
    public final InterfaceC15070pN A08;
    public final C0UO A09;

    private final C51695MsQ A00(ProductCollectionFeedTaggingMeta productCollectionFeedTaggingMeta, MediaTaggingInfo mediaTaggingInfo) {
        List list;
        ProductCollectionFeedTaggingMeta productCollectionFeedTaggingMeta2;
        ProductCollectionFeedTaggingMeta productCollectionFeedTaggingMeta3 = productCollectionFeedTaggingMeta;
        ArrayList arrayList = mediaTaggingInfo.A0D;
        C51695MsQ c51695MsQ = A04().A0B;
        if (c51695MsQ != null) {
            list = c51695MsQ.A04;
        } else {
            list = null;
        }
        C51695MsQ c51695MsQ2 = A04().A0B;
        if (c51695MsQ2 != null) {
            productCollectionFeedTaggingMeta2 = c51695MsQ2.A00;
        } else {
            productCollectionFeedTaggingMeta2 = null;
        }
        if (A04().A0B == null) {
            return null;
        }
        ArrayList arrayList2 = mediaTaggingInfo.A0C;
        if (arrayList != null) {
            list = AbstractC54236NyH.A00(arrayList);
        }
        List list2 = mediaTaggingInfo.A0F;
        if (AbstractC25226BEj.A1b(arrayList2)) {
            C6WI.A01().A08 = arrayList2.size();
        } else {
            productCollectionFeedTaggingMeta3 = productCollectionFeedTaggingMeta2;
        }
        C14360o3.A0B(list2, 3);
        return new C51695MsQ(productCollectionFeedTaggingMeta3, arrayList2, arrayList, list, list2);
    }

    public final void A08(InterfaceC11380iw interfaceC11380iw, C47Z c47z, ODM odm, List list, List list2) {
        C51754Mtd A00;
        C55067OaN c55067OaN;
        ArrayList arrayList;
        ArrayList A12 = AbstractC166997dE.A12(list, 1);
        ArrayList A1E = AbstractC166987dD.A1E();
        AnonymousClass841 anonymousClass841 = this.A02;
        if (anonymousClass841.CPp()) {
            Iterator A0n = MSX.A0n(anonymousClass841);
            while (A0n.hasNext()) {
                MediaSession A0R = MSW.A0R(A0n);
                if (A0R.Btq() == C05F.A00) {
                    String BcD = A0R.BcD();
                    C14360o3.A0A(BcD);
                    A12.add(BcD);
                    A1E.add(A0R.B6E());
                }
            }
        } else {
            A12.add(c47z.A3t);
            if (c47z.A0p()) {
                String str = c47z.A33;
                C14360o3.A0A(str);
                A1E.add(str);
            }
        }
        UserSession userSession = this.A01;
        if (AbstractC199308rX.A03(userSession)) {
            String str2 = this.A04;
            if (C55183Odo.A00(anonymousClass841, true) <= 3) {
                arrayList = AbstractC55229Oez.A05(A1E);
                C14360o3.A0C(arrayList, "null cannot be cast to non-null type java.util.ArrayList<kotlin.String>");
            } else {
                arrayList = null;
            }
            c55067OaN = new C55067OaN(userSession, A12, str2, arrayList, "feed", interfaceC11380iw);
        } else {
            if (anonymousClass841.CPp()) {
                List A0K = this.A03.A04().A0K();
                ArrayList A122 = AbstractC166997dE.A12(A0K, 0);
                for (Object obj : A0K) {
                    if (((C47Z) obj).A1G == EnumC40111tc.A0Q) {
                        A122.add(obj);
                    }
                }
                Iterator it = A122.iterator();
                while (it.hasNext()) {
                    AbstractC43592JPx.A0l(it).A43 = AbstractC166987dD.A1E();
                }
            }
            C51695MsQ c51695MsQ = A04().A0B;
            if (c51695MsQ == null) {
                c51695MsQ = new C51695MsQ(null, AbstractC166987dD.A1E(), null, null, AbstractC166987dD.A1E());
            }
            ArrayList A1E2 = AbstractC166987dD.A1E();
            ArrayList arrayList2 = c51695MsQ.A01;
            List list3 = c51695MsQ.A04;
            List list4 = c51695MsQ.A03;
            ProductCollectionFeedTaggingMeta productCollectionFeedTaggingMeta = c51695MsQ.A00;
            AbstractC167007dF.A1E(arrayList2, 0, list4);
            A00 = C51754Mtd.A00(null, null, null, null, null, null, null, null, null, null, null, new C51695MsQ(productCollectionFeedTaggingMeta, arrayList2, A1E2, list3, list4), A04(), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -2049, 262143, false, false, false, false, false, false, false, false, false, false, false, false, false);
            A07(A00);
            ArrayList A0q = AbstractC167017dG.A0q(list);
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                AbstractC167017dG.A1V(A0q, it2);
            }
            C14360o3.A0B(A0q, 0);
            ArrayList A1F = AbstractC166987dD.A1F(list2);
            Iterator it3 = A0q.iterator();
            while (it3.hasNext()) {
                MSZ.A1P(it3.next(), A1F);
            }
            ArrayList A1F2 = AbstractC166987dD.A1F(A1F);
            if (A1F2.isEmpty()) {
                return;
            }
            String str3 = this.A04;
            ArrayList A05 = AbstractC55229Oez.A05(A1E);
            C14360o3.A0C(A05, "null cannot be cast to non-null type java.util.ArrayList<kotlin.String>");
            c55067OaN = new C55067OaN(interfaceC11380iw, userSession, str3, "feed", A05, A1F2);
        }
        C006802i c006802i = odm.A01;
        C14360o3.A06(c006802i);
        java.util.Set set = odm.A03;
        C14360o3.A0B(set, 2);
        if (set.contains(37370567)) {
            c006802i.markerEnd(37370567, (short) 111);
        }
        set.add(37370567);
        c006802i.markerStart(37370567);
        c006802i.markerAnnotate(37370567, "input_type", odm.A02);
        c006802i.markerAnnotate(37370567, "media_count", odm.A00);
        c55067OaN.A01();
    }

    public final void A09(ProductCollectionFeedTaggingMeta productCollectionFeedTaggingMeta, List list, boolean z) {
        C51754Mtd A00;
        C51754Mtd c51754Mtd;
        C51754Mtd A002;
        Object obj;
        this.A00 = z;
        if (!list.isEmpty()) {
            if (list.size() == 1) {
                A00 = C51754Mtd.A00(null, null, null, null, null, null, null, null, null, null, null, A00(productCollectionFeedTaggingMeta, (MediaTaggingInfo) list.get(0)), A04(), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -2049, 262143, false, false, false, false, false, false, false, false, false, false, false, false, false);
            } else {
                ArrayList A1E = AbstractC166987dD.A1E();
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    MediaTaggingInfo mediaTaggingInfo = (MediaTaggingInfo) it.next();
                    List list2 = A04().A0S;
                    if (list2 != null) {
                        Iterator it2 = list2.iterator();
                        while (true) {
                            if (it2.hasNext()) {
                                obj = it2.next();
                                if (C14360o3.A0K(mediaTaggingInfo.A06, ((C51754Mtd) obj).A0N)) {
                                    break;
                                }
                            } else {
                                obj = null;
                                break;
                            }
                        }
                        c51754Mtd = (C51754Mtd) obj;
                        if (c51754Mtd != null) {
                            A002 = C51754Mtd.A00(null, null, null, null, null, null, null, null, null, null, null, A00(productCollectionFeedTaggingMeta, mediaTaggingInfo), c51754Mtd, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -2049, 262143, false, false, false, false, false, false, false, false, false, false, false, false, false);
                            A1E.add(A002);
                        }
                    }
                    c51754Mtd = new C51754Mtd(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, mediaTaggingInfo.A06, "", null, null, null, null, null, null, null, null, null, null, null, null, null, null, 0, true, false, false, false, false, false, false, false, false, true, false, false, true, true);
                    A002 = C51754Mtd.A00(null, null, null, null, null, null, null, null, null, null, null, A00(productCollectionFeedTaggingMeta, mediaTaggingInfo), c51754Mtd, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -2049, 262143, false, false, false, false, false, false, false, false, false, false, false, false, false);
                    A1E.add(A002);
                }
                A00 = C51754Mtd.A00(null, null, null, null, null, null, null, null, null, null, null, null, A04(), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, A1E, null, null, -67108865, 262143, false, false, false, false, false, false, false, false, false, false, false, false, false);
            }
            A07(A00);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ NKI(UserSession userSession, AnonymousClass841 anonymousClass841, C52458NJc c52458NJc, String str) {
        super(c52458NJc);
        C19K A02 = AnonymousClass194.A02(new C12M().A04);
        JQ0.A1O(userSession, c52458NJc, anonymousClass841, str, A02);
        this.A01 = userSession;
        this.A03 = c52458NJc;
        this.A02 = anonymousClass841;
        this.A04 = str;
        this.A05 = A02;
        C008002u A1H = AbstractC25225BEi.A1H(new C51691MsM(null, null, false));
        this.A07 = A1H;
        this.A09 = AbstractC208910l.A02(A1H);
        AnonymousClass057 A00 = C10M.A00(C05F.A00, 0, 0);
        this.A06 = A00;
        this.A08 = new C06160Ug(null, A00);
    }
}
