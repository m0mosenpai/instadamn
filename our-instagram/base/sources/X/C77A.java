package X;

import com.facebook.pando.PandoGraphQLRequest;
import com.google.common.collect.ImmutableList;
import com.instagram.common.session.UserSession;
import com.instagram.model.mediasize.ExtendedImageUrl;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.77A, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C77A {
    public InterfaceC16660sJ A00;
    public final C25671My A01;
    public final UserSession A02;
    public final C77D A03;
    public final C77B A04;
    public final C7FJ A05;

    public final void A00(AbstractC46416Kgc abstractC46416Kgc) {
        C7FJ c7fj = this.A05;
        if (!c7fj.A00()) {
            if (C18U.A06(C06090Tz.A05, c7fj.A00, 36318505448184039L)) {
                C77B c77b = this.A04;
                C50370MLx c50370MLx = new C50370MLx(22, abstractC46416Kgc, this);
                C9BD c9bd = c77b.A00;
                if (c9bd != null) {
                    c50370MLx.invoke(c9bd);
                    return;
                }
                C77C c77c = c77b.A02;
                C50370MLx c50370MLx2 = new C50370MLx(24, c50370MLx, c77b);
                C2JM c2jm = new C2JM();
                C2JM c2jm2 = new C2JM();
                C2JQ c2jq = PandoGraphQLRequest.Companion;
                PandoGraphQLRequest pandoGraphQLRequest = new PandoGraphQLRequest(AbstractC40511uK.A00(), "IGSocialAvatarStickersDisclaimerInfoQuery", c2jm.getParamsCopy(), c2jm2.getParamsCopy(), C67051Ufc.class, false, null, 0, null, "xfb_social_avatar_stickers_disclaimer_info", new ArrayList());
                c77c.A00.ATV(C23362AXl.A00, new C70445WVx(c50370MLx2), pandoGraphQLRequest);
            }
        }
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [X.77D] */
    public /* synthetic */ C77A(UserSession userSession) {
        C7FJ c7fj = new C7FJ(userSession);
        C14360o3.A0B(userSession, 0);
        C77B c77b = (C77B) userSession.A01(C77B.class, new MHS(userSession, 41));
        C25671My A00 = AbstractC25651Mw.A00(userSession);
        C14360o3.A0B(c77b, 3);
        C14360o3.A0B(A00, 4);
        this.A02 = userSession;
        this.A05 = c7fj;
        this.A04 = c77b;
        this.A01 = A00;
        this.A03 = new InterfaceC42271xH() { // from class: X.77D
            @Override // X.InterfaceC42271xH
            public final /* bridge */ /* synthetic */ boolean A79(Object obj) {
                C2Io c2Io = (C2Io) obj;
                C14360o3.A0B(c2Io, 0);
                List list = c2Io.A02;
                if (list == null || list.isEmpty()) {
                    List list2 = c2Io.A04;
                    if (list2 == null || list2.isEmpty()) {
                        return false;
                    }
                    return true;
                }
                return true;
            }

            @Override // X.InterfaceC41501vz
            public final /* bridge */ /* synthetic */ void onEvent(Object obj) {
                String str;
                Object obj2;
                C910143t c910143t;
                ExtendedImageUrl extendedImageUrl;
                C910143t c910143t2;
                Integer num;
                int A03 = C0f9.A03(-1512334265);
                C2Io c2Io = (C2Io) obj;
                int A032 = C0f9.A03(-903739544);
                C14360o3.A0B(c2Io, 0);
                C77A c77a = C77A.this;
                Collection collection = c2Io.A02;
                if (collection == null) {
                    collection = C16930sl.A00;
                }
                Iterable iterable = c2Io.A04;
                if (iterable == null) {
                    iterable = C16930sl.A00;
                }
                ArrayList A0S = AbstractC001800i.A0S(iterable, collection);
                C9BD c9bd = c77a.A04.A00;
                if (c9bd == null || !c9bd.A01) {
                    C7FJ c7fj2 = c77a.A05;
                    if (!c7fj2.A00()) {
                        if (C18U.A06(C06090Tz.A05, c7fj2.A00, 36318505448184039L)) {
                            ArrayList arrayList = new ArrayList();
                            Iterator it = A0S.iterator();
                            while (it.hasNext()) {
                                Object next = it.next();
                                C83403nh c83403nh = (C83403nh) next;
                                C2EY c2ey = c83403nh.A10;
                                if (c2ey == C2EY.A0O || c2ey == C2EY.A0J) {
                                    if (!C14360o3.A0K(c83403nh.A1u, c77a.A02.userId)) {
                                        arrayList.add(next);
                                    }
                                }
                            }
                            Iterator it2 = AbstractC001800i.A0g(arrayList, new M7U()).iterator();
                            while (true) {
                                str = null;
                                if (it2.hasNext()) {
                                    obj2 = it2.next();
                                    ImmutableList A0H = ((C83403nh) obj2).A0H();
                                    if (A0H != null && (c910143t2 = (C910143t) AbstractC001800i.A0J(A0H)) != null && (num = c910143t2.A0f) != null && num.intValue() == 1) {
                                        break;
                                    }
                                } else {
                                    obj2 = null;
                                    break;
                                }
                            }
                            C83403nh c83403nh2 = (C83403nh) obj2;
                            if (c83403nh2 != null) {
                                ImmutableList A0H2 = c83403nh2.A0H();
                                if (A0H2 != null && (c910143t = (C910143t) AbstractC001800i.A0J(A0H2)) != null && (extendedImageUrl = c910143t.A0X) != null) {
                                    str = extendedImageUrl.A0A;
                                }
                                c77a.A00(new KOO(str));
                            }
                        }
                    }
                }
                C0f9.A0A(-978936553, A032);
                C0f9.A0A(555008712, A03);
            }
        };
    }
}
