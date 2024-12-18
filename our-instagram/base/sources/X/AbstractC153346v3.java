package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.instagram.common.session.UserSession;
import com.instagram.model.reels.Reel;
import com.instagram.user.model.User;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: X.6v3, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC153346v3 {
    public static final C153376v6 A00(final InterfaceC11380iw interfaceC11380iw, final UserSession userSession, C57112jm c57112jm, final InterfaceC60442pS interfaceC60442pS, final EnumC125765mR enumC125765mR, final C38U c38u, final User user, final java.util.Set set, final java.util.Set set2) {
        C14360o3.A0B(userSession, 2);
        C14360o3.A0B(c57112jm, 4);
        C14360o3.A0B(c38u, 5);
        C14360o3.A0B(set, 6);
        C14360o3.A0B(set2, 7);
        C14360o3.A0B(enumC125765mR, 8);
        ArrayList arrayList = new ArrayList();
        arrayList.add(new InterfaceC43071ya(interfaceC11380iw, userSession, interfaceC60442pS, enumC125765mR, c38u, user, set) { // from class: X.6v4
            public final InterfaceC11380iw A00;
            public final UserSession A01;
            public final InterfaceC60442pS A02;
            public final EnumC125765mR A03;
            public final C38U A04;
            public final User A05;
            public final java.util.Set A06;

            @Override // X.InterfaceC43071ya
            public final void ATP(C59062n7 c59062n7, InterfaceC57162jr interfaceC57162jr) {
                C19260xA c19260xA;
                ArrayList arrayList2;
                Long l;
                String Bnr;
                Integer Bdm;
                C14360o3.A0B(c59062n7, 0);
                C14360o3.A0B(interfaceC57162jr, 1);
                if (interfaceC57162jr.CFq(c59062n7) == C05F.A00) {
                    C38321qM c38321qM = (C38321qM) c59062n7.A03;
                    Number number = (Number) c59062n7.A04;
                    java.util.Set set3 = this.A06;
                    String id = c38321qM.getId();
                    if (id != null) {
                        if (set3.add(id)) {
                            InterfaceC60442pS interfaceC60442pS2 = this.A02;
                            if (interfaceC60442pS2 instanceof AnonymousClass309) {
                                c19260xA = ((AnonymousClass309) interfaceC60442pS2).E6Q(c38321qM).A00();
                            } else {
                                c19260xA = null;
                            }
                            UserSession userSession2 = this.A01;
                            InterfaceC11380iw interfaceC11380iw2 = this.A00;
                            User user2 = this.A05;
                            C14360o3.A0A(number);
                            int intValue = number.intValue();
                            int i = intValue / 3;
                            int i2 = intValue % 3;
                            EnumC125765mR enumC125765mR2 = this.A03;
                            C18920wW A01 = AbstractC12220kQ.A01(interfaceC11380iw2, userSession2);
                            InterfaceC02590Ai A00 = A01.A00(A01.A00, "instagram_thumbnail_impression");
                            if (A00.isSampled()) {
                                A00.AAP(PublicKeyCredentialControllerUtility.JSON_KEY_ID, c38321qM.getId());
                                A00.AAP("m_pk", c38321qM.getId());
                                A00.AAP("position", AbstractC154266wb.A01(i, i2));
                                A00.A8R(c38321qM.BRp().A00(), "media_type");
                                A00.AAP("entity_type", PublicKeyCredentialControllerUtility.JSON_KEY_USER);
                                A00.AAk("product_ids", c38321qM.A3o());
                                ArrayList A3K = c38321qM.A3K();
                                Long l2 = null;
                                if (A3K != null) {
                                    arrayList2 = new ArrayList(AbstractC06950Ym.A1E(A3K, 10));
                                    Iterator it = A3K.iterator();
                                    while (it.hasNext()) {
                                        arrayList2.add(((C4SX) it.next()).A00);
                                    }
                                } else {
                                    arrayList2 = null;
                                }
                                A00.AAk("merchant_ids", arrayList2);
                                A00.AAP("ranking_info_token", c38321qM.A0C.getLoggingInfoToken());
                                if (c38321qM.A0C.Bdm() != null && (Bdm = c38321qM.A0C.Bdm()) != null) {
                                    l = Long.valueOf(Bdm.intValue());
                                } else {
                                    l = null;
                                }
                                A00.A9K("play_count", l);
                                if (user2 != null) {
                                    A00.A9K("entity_id", AbstractC003100w.A0k(10, user2.getId()));
                                    A00.AAP("entity_name", user2.getUsername());
                                }
                                if (c19260xA != null) {
                                    A00.AAP("media_thumbnail_section", c19260xA.A05("media_thumbnail_section"));
                                    A00.A9K("entity_page_id", c19260xA.A04("entity_page_id"));
                                    A00.AAP("entity_page_name", c19260xA.A05("entity_page_name"));
                                }
                                if (enumC125765mR2 == EnumC125765mR.A0C && c38321qM.A0C.Bns() != null) {
                                    JML Bns = c38321qM.A0C.Bns();
                                    if (Bns != null && (Bnr = Bns.Bnr()) != null) {
                                        l2 = AbstractC003100w.A0k(10, Bnr);
                                    }
                                    A00.A9K("repost_id", l2);
                                }
                                A00.AAP("canonical_nav_chain", AbstractC25041Ki.A00);
                                A00.AAP("device_aspect_ratio_category", AbstractC82663mU.A00);
                                A00.AAP("device_fold_orientation", AbstractC82673mV.A00);
                                A00.AAP("device_fold_state", AbstractC82683mW.A00);
                                A00.A7v("device_is_in_multi_window_mode", AbstractC82693mX.A00);
                                A00.Cht();
                                return;
                            }
                            return;
                        }
                        return;
                    }
                    throw new IllegalStateException("Required value was null.");
                }
            }

            {
                this.A00 = interfaceC11380iw;
                this.A02 = interfaceC60442pS;
                this.A01 = userSession;
                this.A05 = user;
                this.A04 = c38u;
                this.A06 = set;
                this.A03 = enumC125765mR;
            }
        });
        ArrayList arrayList2 = new ArrayList();
        arrayList2.add(new InterfaceC43071ya(interfaceC11380iw, userSession, interfaceC60442pS, c38u, user, set2) { // from class: X.6v5
            public final InterfaceC11380iw A00;
            public final UserSession A01;
            public final InterfaceC60442pS A02;
            public final C38U A03;
            public final User A04;
            public final java.util.Set A05;

            @Override // X.InterfaceC43071ya
            public final void ATP(C59062n7 c59062n7, InterfaceC57162jr interfaceC57162jr) {
                C19260xA c19260xA;
                Long l;
                String str;
                C14360o3.A0B(c59062n7, 0);
                C14360o3.A0B(interfaceC57162jr, 1);
                if (interfaceC57162jr.CFq(c59062n7) == C05F.A00) {
                    Reel reel = (Reel) c59062n7.A03;
                    Number number = (Number) c59062n7.A04;
                    java.util.Set set3 = this.A05;
                    String id = reel.getId();
                    C14360o3.A07(id);
                    if (set3.add(id)) {
                        InterfaceC60442pS interfaceC60442pS2 = this.A02;
                        if (interfaceC60442pS2 instanceof AnonymousClass309) {
                            c19260xA = ((AnonymousClass309) interfaceC60442pS2).E6P().A00();
                        } else {
                            c19260xA = null;
                        }
                        UserSession userSession2 = this.A01;
                        InterfaceC11380iw interfaceC11380iw2 = this.A00;
                        User user2 = this.A04;
                        C14360o3.A0A(number);
                        int intValue = number.intValue();
                        int i = intValue / 3;
                        int i2 = intValue % 3;
                        C18920wW A01 = AbstractC12220kQ.A01(interfaceC11380iw2, userSession2);
                        InterfaceC02590Ai A00 = A01.A00(A01.A00, "instagram_thumbnail_impression");
                        if (A00.isSampled()) {
                            String id2 = reel.getId();
                            if (id2 != null && (str = (String) AbstractC001900j.A0R(id2, new String[]{"highlight:"}, 0).get(1)) != null) {
                                l = AbstractC003100w.A0k(10, str);
                            } else {
                                l = null;
                            }
                            A00.AAP(PublicKeyCredentialControllerUtility.JSON_KEY_ID, reel.getId());
                            A00.AAP("position", AbstractC154266wb.A01(i, i2));
                            A00.AAP("entity_type", PublicKeyCredentialControllerUtility.JSON_KEY_USER);
                            A00.A9K("highlight_id", l);
                            if (user2 != null) {
                                A00.A9K("entity_id", AbstractC003100w.A0k(10, user2.getId()));
                                A00.AAP("entity_name", user2.getUsername());
                            }
                            if (c19260xA != null) {
                                A00.AAP("media_thumbnail_section", c19260xA.A05("media_thumbnail_section"));
                                A00.A9K("entity_page_id", c19260xA.A04("entity_page_id"));
                                A00.AAP("entity_page_name", c19260xA.A05("entity_page_name"));
                            }
                            A00.AAP("canonical_nav_chain", AbstractC25041Ki.A00);
                            A00.AAP("device_aspect_ratio_category", AbstractC82663mU.A00);
                            A00.AAP("device_fold_orientation", AbstractC82673mV.A00);
                            A00.AAP("device_fold_state", AbstractC82683mW.A00);
                            A00.A7v("device_is_in_multi_window_mode", AbstractC82693mX.A00);
                            A00.Cht();
                        }
                    }
                }
            }

            {
                this.A00 = interfaceC11380iw;
                this.A02 = interfaceC60442pS;
                this.A01 = userSession;
                this.A04 = user;
                this.A03 = c38u;
                this.A05 = set2;
            }
        });
        return new C153376v6(c57112jm, new C63622uj(), arrayList, arrayList2);
    }
}
