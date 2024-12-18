package X;

import X.AbstractC001800i;
import X.AbstractC166987dD;
import X.AbstractC166997dE;
import X.AbstractC54196Nxa;
import X.AbstractC55145Od4;
import X.AnonymousClass016;
import X.C14360o3;
import X.GGY;
import X.InterfaceC37109GWu;
import com.facebook.R;
import com.instagram.api.schemas.RemoteBooleanSettingId;
import com.instagram.api.schemas.RemoteStringSettingId;
import com.instagram.realtimeclient.RealtimeSubscription;
import com.instagram.settings2.core.model.AndValue;
import com.instagram.settings2.core.model.BloksNavigationRowDestinationValue;
import com.instagram.settings2.core.model.EqualsValue;
import com.instagram.settings2.core.model.FbtLinkTokenValue;
import com.instagram.settings2.core.model.FbtLiteralValue;
import com.instagram.settings2.core.model.FbtWithTokensValue;
import com.instagram.settings2.core.model.FrictionValue$ConfirmationValue;
import com.instagram.settings2.core.model.IfValue;
import com.instagram.settings2.core.model.ModalActionValue$Navigate;
import com.instagram.settings2.core.model.ModalBodyItemValue;
import com.instagram.settings2.core.model.ModalButtonValue;
import com.instagram.settings2.core.model.ModalValue;
import com.instagram.settings2.core.model.NotValue;
import com.instagram.settings2.core.model.OrValue;
import com.instagram.settings2.core.model.ServerValue;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes12.dex */
public final class YLC extends C0YY implements InterfaceC16820sZ {
    public static final YLC A00 = new YLC();

    public YLC() {
        super(0);
    }

    public static FrictionValue$ConfirmationValue A01(AbstractC55145Od4 abstractC55145Od4, AbstractC55145Od4 abstractC55145Od42, InterfaceC57989PnZ interfaceC57989PnZ, List list) {
        return new FrictionValue$ConfirmationValue(new ModalValue(abstractC55145Od42, null, new ModalButtonValue(abstractC55145Od4, new C52737NVa(interfaceC57989PnZ)), null, null, list));
    }

    public static MWT A00(AbstractC55145Od4 abstractC55145Od4, AbstractC55145Od4 abstractC55145Od42, AbstractC55145Od4 abstractC55145Od43, String str, List list) {
        return new MWT(abstractC55145Od4, abstractC55145Od42, abstractC55145Od43, str, list);
    }

    public static ModalBodyItemValue A02(AbstractC55145Od4 abstractC55145Od4, AbstractC55145Od4 abstractC55145Od42, Object obj) {
        return new ModalBodyItemValue(abstractC55145Od4, abstractC55145Od42, new NVA(obj));
    }

    public static ModalBodyItemValue A03(AbstractC55145Od4 abstractC55145Od4, Object obj, Object obj2) {
        return new ModalBodyItemValue(abstractC55145Od4, new NVA(obj), new NVA(obj2));
    }

    @Override // X.InterfaceC16820sZ
    public final /* bridge */ /* synthetic */ Object invoke() {
        C09530e4[] c09530e4Arr = new C09530e4[44];
        EnumC72442Xdm enumC72442Xdm = EnumC72442Xdm.A02;
        C33160Ek5 c33160Ek5 = new C33160Ek5(AbstractC20100yh.A00(2342161673575995786L), true);
        NVA A0O = AbstractC72046XLm.A0O(true);
        List A1Q = AbstractC16960so.A1Q(C51759Mti.A02(2131973349), new FbtWithTokensValue(2131973350, AbstractC166987dD.A1J(new FbtLinkTokenValue(AbstractC72046XLm.A0O("https://help.instagram.com/116024195217477"), C51759Mti.A02(2131973351), "learn_more"))));
        RemoteBooleanSettingId remoteBooleanSettingId = RemoteBooleanSettingId.A04;
        XVa A002 = XVa.A00(remoteBooleanSettingId);
        C72252Xa8 c72252Xa8 = C72252Xa8.A00;
        C51757Mtg A04 = AbstractC72046XLm.A04(c72252Xa8, A002, "account_privacy_setting");
        NVA A02 = C51759Mti.A02(2131973364);
        NVG nvg = new NVG(enumC72442Xdm, AbstractC25225BEi.A1D(Boolean.class));
        NVA A022 = C51759Mti.A02(2131973363);
        NVA A023 = C51759Mti.A02(2131973358);
        NVA A0O2 = AbstractC72046XLm.A0O(true);
        Integer valueOf = Integer.valueOf(R.drawable.instagram_reels_pano_outline_24);
        ModalBodyItemValue A024 = A02(A023, A0O2, valueOf);
        NVA A025 = C51759Mti.A02(2131973359);
        NVA A0O3 = AbstractC72046XLm.A0O(true);
        Integer valueOf2 = Integer.valueOf(R.drawable.instagram_story_mention_pano_outline_24);
        ModalBodyItemValue A026 = A02(A025, A0O3, valueOf2);
        ModalBodyItemValue modalBodyItemValue = new ModalBodyItemValue(C51759Mti.A02(2131973360), AbstractC72046XLm.A0K("should_restrict_message_settings", AbstractC25225BEi.A1D(Boolean.class)), AbstractC72046XLm.A0L(R.drawable.instagram_direct_pano_outline_24));
        NVA A027 = C51759Mti.A02(2131973361);
        NVA A0O4 = AbstractC72046XLm.A0O(true);
        Integer valueOf3 = Integer.valueOf(R.drawable.instagram_remix_pano_outline_24);
        IfValue A0D = AbstractC72046XLm.A0D(nvg, A01(AbstractC72046XLm.A0O(new C51759Mti(new C51918Mx0(2131973362))), A022, enumC72442Xdm, AbstractC16960so.A1Q(A024, A026, modalBodyItemValue, A02(A027, A0O4, valueOf3))), A01(C51759Mti.A02(2131973356), C51759Mti.A02(2131973357), enumC72442Xdm, AbstractC16960so.A1Q(A03(C51759Mti.A02(2131973352), true, valueOf), A03(C51759Mti.A02(2131973353), true, valueOf2), A03(C51759Mti.A02(2131973354), true, valueOf3), new ModalBodyItemValue(C51759Mti.A02(2131973355), AbstractC72046XLm.A0O(true), AbstractC72046XLm.A0L(R.drawable.instagram_settings_pano_outline_24)))));
        NVI A028 = XVa.A02(new C51718Msv(remoteBooleanSettingId), c72252Xa8, Boolean.class, "account_privacy_setting");
        ServerValue A0J = AbstractC72046XLm.A0J(Boolean.class, "should_restrict_message_settings");
        final BloksNavigationRowDestinationValue A0B = AbstractC72046XLm.A0B(C51759Mti.A02(2131973368), AbstractC72046XLm.A0O(true), null, AbstractC111324zv.A00(2143));
        AbstractC33159Ek2 abstractC33159Ek2 = new AbstractC33159Ek2(A0B) { // from class: com.instagram.settings2.core.model.PostCommitValue$Navigate
            public final AbstractC55145Od4 A00;

            @Override // X.AbstractC55145Od4
            public final boolean equals(Object obj) {
                return this == obj || ((obj instanceof PostCommitValue$Navigate) && C14360o3.A0K(this.A00, ((PostCommitValue$Navigate) obj).A00));
            }

            @Override // X.AbstractC55145Od4
            public final int hashCode() {
                return this.A00.hashCode();
            }

            /* JADX WARN: Removed duplicated region for block: B:15:0x002c  */
            /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
            @Override // X.AbstractC55145Od4
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object A07(com.instagram.common.session.UserSession r6, com.instagram.settings2.core.session.AbstractValueResolverImpl r7, X.InterfaceC23621Ds r8) {
                /*
                    r5 = this;
                    r3 = 40
                    boolean r0 = X.PXC.A03(r8, r3)
                    if (r0 == 0) goto L3a
                    r4 = r8
                    X.PXC r4 = (X.PXC) r4
                    int r2 = r4.A00
                    r1 = -2147483648(0xffffffff80000000, float:-0.0)
                    r0 = r2 & r1
                    if (r0 == 0) goto L3a
                    int r2 = r2 - r1
                    r4.A00 = r2
                L16:
                    java.lang.Object r3 = r4.A01
                    X.1JX r2 = X.C1JX.A02
                    int r0 = r4.A00
                    r1 = 1
                    if (r0 == 0) goto L2c
                    if (r0 != r1) goto L42
                    X.AbstractC09560e7.A00(r3)
                L24:
                    X.GWv r3 = (X.InterfaceC37110GWv) r3
                    X.E6m r0 = new X.E6m
                    r0.<init>(r3)
                    return r0
                L2c:
                    X.AbstractC09560e7.A00(r3)
                    X.Od4 r0 = r5.A00
                    r4.A00 = r1
                    java.lang.Object r3 = r7.A01(r0, r4)
                    if (r3 != r2) goto L24
                    return r2
                L3a:
                    r0 = 42
                    X.PXC r4 = new X.PXC
                    r4.<init>(r5, r8, r3, r0)
                    goto L16
                L42:
                    java.lang.IllegalStateException r0 = X.AbstractC166987dD.A13()
                    throw r0
                */
                throw new UnsupportedOperationException("Method not decompiled: com.instagram.settings2.core.model.PostCommitValue$Navigate.A07(com.instagram.common.session.UserSession, com.instagram.settings2.core.session.AbstractValueResolverImpl, X.1Ds):java.lang.Object");
            }

            @Override // X.AbstractC55145Od4
            public final List A08() {
                List A1J = AbstractC166987dD.A1J(this.A00);
                ArrayList A1E = AbstractC166987dD.A1E();
                Iterator it = A1J.iterator();
                while (it.hasNext()) {
                    AnonymousClass016.A16(AbstractC54196Nxa.A00((AbstractC55145Od4) it.next()), A1E);
                }
                return AbstractC001800i.A0W(A1E);
            }

            {
                this.A00 = A0B;
            }

            @Override // X.AbstractC55145Od4
            public final InterfaceC37109GWu A05() {
                return GGY.A00;
            }

            @Override // X.AbstractC55145Od4
            public final String toString() {
                StringBuilder A1C = AbstractC166987dD.A1C();
                A1C.append(super.toString());
                A1C.append(": { ");
                A1C.append(this.A00);
                return AbstractC166997dE.A0x(" }", A1C);
            }
        };
        ServerValue A0K = AbstractC72046XLm.A0K("should_show_review_followers_dialog", AbstractC25225BEi.A1D(Boolean.class));
        final ModalValue modalValue = new ModalValue(C51759Mti.A02(2131973367), null, new ModalButtonValue(C51759Mti.A02(2131973366), new ModalActionValue$Navigate(new C33161Ek6(AbstractC111324zv.A00(4474)))), null, null, ModalBodyItemValue.A00(C51759Mti.A02(2131973365), true));
        C09530e4 A1L = AbstractC166987dD.A1L(enumC72442Xdm, new C51922Mx4(A04, c33160Ek5, A0O, A0D, AbstractC72046XLm.A0E(A028, AbstractC72046XLm.A0D(A0J, abstractC33159Ek2, AbstractC72046XLm.A0E(A0K, new AbstractC33159Ek2(modalValue) { // from class: com.instagram.settings2.core.model.PostCommitValue$ShowModal
            public final AbstractC55145Od4 A00;

            @Override // X.AbstractC55145Od4
            public final boolean equals(Object obj) {
                return this == obj || ((obj instanceof PostCommitValue$ShowModal) && C14360o3.A0K(this.A00, ((PostCommitValue$ShowModal) obj).A00));
            }

            @Override // X.AbstractC55145Od4
            public final int hashCode() {
                return this.A00.hashCode();
            }

            /* JADX WARN: Removed duplicated region for block: B:15:0x002c  */
            /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
            @Override // X.AbstractC55145Od4
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object A07(com.instagram.common.session.UserSession r6, com.instagram.settings2.core.session.AbstractValueResolverImpl r7, X.InterfaceC23621Ds r8) {
                /*
                    r5 = this;
                    r3 = 41
                    boolean r0 = X.PXC.A03(r8, r3)
                    if (r0 == 0) goto L3a
                    r4 = r8
                    X.PXC r4 = (X.PXC) r4
                    int r2 = r4.A00
                    r1 = -2147483648(0xffffffff80000000, float:-0.0)
                    r0 = r2 & r1
                    if (r0 == 0) goto L3a
                    int r2 = r2 - r1
                    r4.A00 = r2
                L16:
                    java.lang.Object r3 = r4.A01
                    X.1JX r2 = X.C1JX.A02
                    int r0 = r4.A00
                    r1 = 1
                    if (r0 == 0) goto L2c
                    if (r0 != r1) goto L42
                    X.AbstractC09560e7.A00(r3)
                L24:
                    X.MtY r3 = (X.C51749MtY) r3
                    X.E6m r0 = new X.E6m
                    r0.<init>(r3)
                    return r0
                L2c:
                    X.AbstractC09560e7.A00(r3)
                    X.Od4 r0 = r5.A00
                    r4.A00 = r1
                    java.lang.Object r3 = r7.A01(r0, r4)
                    if (r3 != r2) goto L24
                    return r2
                L3a:
                    r0 = 42
                    X.PXC r4 = new X.PXC
                    r4.<init>(r5, r8, r3, r0)
                    goto L16
                L42:
                    java.lang.IllegalStateException r0 = X.AbstractC166987dD.A13()
                    throw r0
                */
                throw new UnsupportedOperationException("Method not decompiled: com.instagram.settings2.core.model.PostCommitValue$ShowModal.A07(com.instagram.common.session.UserSession, com.instagram.settings2.core.session.AbstractValueResolverImpl, X.1Ds):java.lang.Object");
            }

            @Override // X.AbstractC55145Od4
            public final List A08() {
                List A1J = AbstractC166987dD.A1J(this.A00);
                ArrayList A1E = AbstractC166987dD.A1E();
                Iterator it = A1J.iterator();
                while (it.hasNext()) {
                    AnonymousClass016.A16(AbstractC54196Nxa.A00((AbstractC55145Od4) it.next()), A1E);
                }
                return AbstractC001800i.A0W(A1E);
            }

            {
                this.A00 = modalValue;
            }

            @Override // X.AbstractC55145Od4
            public final InterfaceC37109GWu A05() {
                return GGY.A00;
            }

            @Override // X.AbstractC55145Od4
            public final String toString() {
                StringBuilder A1C = AbstractC166987dD.A1C();
                A1C.append(super.toString());
                A1C.append(": { ");
                A1C.append(this.A00);
                return AbstractC166997dE.A0x(" }", A1C);
            }
        }, null)), null), A02, enumC72442Xdm, A1Q));
        EnumC72443Xdn enumC72443Xdn = EnumC72443Xdn.A02;
        AndValue A0A = AbstractC72048XLo.A0A(AbstractC72046XLm.A0K("is_user_account_nido", AbstractC25225BEi.A1D(Boolean.class)), 36318664362957202L);
        NVA A0O5 = AbstractC72046XLm.A0O(true);
        C16930sl c16930sl = C16930sl.A00;
        XVa A01 = XVa.A01(RemoteStringSettingId.A04);
        C72253Xa9 c72253Xa9 = C72253Xa9.A00;
        C09530e4 A1L2 = AbstractC166987dD.A1L(enumC72443Xdn, new C51924Mx6(AbstractC72046XLm.A04(c72253Xa9, A01, "account_screen_header"), A0A, A0O5, AbstractC72046XLm.A0D(AbstractC72046XLm.A0C(AbstractC72046XLm.A0K("nido_account_header_body_variant", AbstractC25225BEi.A1D(String.class)), "add_supervision"), AbstractC72048XLo.A0C(AbstractC72046XLm.A0O("instagram://bloks?app_id=com.bloks.www.ig_age.explainer_screen_controller&bloks_screen_options=%7B%22hides_tab_bar%22%3Atrue%7D"), 2131973549, 2131973548), AbstractC72046XLm.A0D(AbstractC72046XLm.A0C(AbstractC72046XLm.A0J(String.class, "nido_account_header_body_variant"), "can_change"), AbstractC72048XLo.A0C(AbstractC72046XLm.A0O("instagram://bloks?app_id=com.bloks.www.ig_age.explainer_screen_controller&bloks_screen_options=%7B%22hides_tab_bar%22%3Atrue%7D"), 2131973547, 2131973546), AbstractC72048XLo.A0C(AbstractC72046XLm.A0O("instagram://bloks?app_id=com.bloks.www.ig_age.explainer_screen_controller&bloks_screen_options=%7B%22hides_tab_bar%22%3Atrue%7D"), 2131973545, 2131973544))), new FbtLiteralValue(AbstractC72046XLm.A0K("viewer_username", AbstractC25225BEi.A1D(String.class))), AbstractC72046XLm.A0K("viewer_profile_pic_url", AbstractC25225BEi.A1D(String.class)), enumC72443Xdn, c16930sl, AbstractC166987dD.A1J(new FbtLiteralValue(AbstractC72046XLm.A0K("viewer_name", AbstractC25225BEi.A1D(String.class))))));
        EnumC72442Xdm enumC72442Xdm2 = EnumC72442Xdm.A03;
        C09530e4 A1L3 = AbstractC166987dD.A1L(enumC72442Xdm2, new C51922Mx4(AbstractC72046XLm.A04(c72252Xa8, XVa.A00(RemoteBooleanSettingId.A05), "allow_notes_on_posts_and_reels"), AbstractC72046XLm.A0F(2342161673575930249L, true), AbstractC72046XLm.A0O(true), null, null, AbstractC72048XLo.A0D(XjX.A00(), C51759Mti.A02(2131973449), 2131973448), enumC72442Xdm2, AbstractC166987dD.A1J(C51759Mti.A02(2131973447))));
        EnumC72441Xdl enumC72441Xdl = EnumC72441Xdl.A02;
        C09530e4 A1L4 = AbstractC166987dD.A1L(enumC72441Xdl, new C51922Mx4(AbstractC72046XLm.A04(c72252Xa8, new C51925Mx7("allow_story_mention_sharing"), "allow_others_to_share_stories_if_mentioned"), AbstractC72047XLn.A02(AbstractC72046XLm.A0F(2342161673575930249L, true), new NotValue(AbstractC72046XLm.A0K("is_account_public", AbstractC25225BEi.A1D(Boolean.class)))), AbstractC72046XLm.A0O(true), null, null, AbstractC72048XLo.A0D(XjX.A00(), C51759Mti.A02(2131973444), 2131973443), enumC72441Xdl, AbstractC166987dD.A1J(AbstractC72048XLo.A0D(XjX.A00(), C51759Mti.A02(2131973442), 2131973441))));
        EnumC72442Xdm enumC72442Xdm3 = EnumC72442Xdm.A04;
        C09530e4 A1L5 = AbstractC166987dD.A1L(enumC72442Xdm3, new C51922Mx4(AbstractC72046XLm.A04(c72252Xa8, XVa.A00(RemoteBooleanSettingId.A06), "allow_people_to_download_your_reels"), new AndValue(AbstractC72048XLo.A0O("is_account_public", 2342161673575930249L)), AbstractC72046XLm.A0O(true), null, null, AbstractC72048XLo.A0D(XjX.A00(), C51759Mti.A02(2131973491), 2131973490), enumC72442Xdm3, AbstractC166987dD.A1J(AbstractC72048XLo.A0C(AbstractC72046XLm.A0O(MSV.A00(466)), 2131973489, 2131973488))));
        EnumC72442Xdm enumC72442Xdm4 = EnumC72442Xdm.A06;
        AndValue A029 = AbstractC72047XLn.A02(AbstractC72046XLm.A0F(2342161673575930249L, true), AbstractC72047XLn.A02(AbstractC72046XLm.A0J(Boolean.class, "is_account_public"), new NotValue(XjX.A00())));
        NVA A0O6 = AbstractC72046XLm.A0O(true);
        List A1J = AbstractC166987dD.A1J(AbstractC72048XLo.A0D(AbstractC72046XLm.A0F(36326107540174488L, true), C51759Mti.A02(2131973435), 2131973434));
        RemoteBooleanSettingId remoteBooleanSettingId2 = RemoteBooleanSettingId.A08;
        C09530e4 A1L6 = AbstractC166987dD.A1L(enumC72442Xdm4, new C51922Mx4(AbstractC72046XLm.A04(c72252Xa8, XVa.A00(remoteBooleanSettingId2), "allow_post_and_reel_sharing_to_stories"), A029, A0O6, null, null, AbstractC72048XLo.A0D(AbstractC72046XLm.A0F(36326107540174488L, true), C51759Mti.A02(2131973437), 2131973436), enumC72442Xdm4, A1J));
        EnumC72442Xdm enumC72442Xdm5 = EnumC72442Xdm.A05;
        C09530e4 A1L7 = AbstractC166987dD.A1L(enumC72442Xdm5, new C51922Mx4(AbstractC72046XLm.A04(c72252Xa8, XVa.A00(RemoteBooleanSettingId.A07), "allow_posts_to_be_visible_in_collections_shared_with_others"), AbstractC72047XLn.A02(AbstractC72046XLm.A0F(2342161673575930249L, true), AbstractC72047XLn.A02(AbstractC72046XLm.A0K("enable_disallow_add_to_public_collection", AbstractC25225BEi.A1D(Boolean.class)), new NotValue(new C33160Ek5(AbstractC20100yh.A00(36326107540436636L), true)))), AbstractC72046XLm.A0O(true), null, null, C51759Mti.A02(2131973452), enumC72442Xdm5, AbstractC166987dD.A1J(AbstractC72048XLo.A0C(AbstractC72046XLm.A0O("https://help.instagram.com/1046081749796707"), 2131973451, 2131973450))));
        EnumC72442Xdm enumC72442Xdm6 = EnumC72442Xdm.A07;
        C09530e4 A1L8 = AbstractC166987dD.A1L(enumC72442Xdm6, new C51922Mx4(AbstractC72046XLm.A04(c72252Xa8, XVa.A00(RemoteBooleanSettingId.A09), "allow_profile_picture_expansion"), AbstractC72048XLo.A0B(AbstractC72046XLm.A0F(2342161673575995786L, true), 36315378712186030L), AbstractC72046XLm.A0O(true), null, null, C51759Mti.A02(2131973483), enumC72442Xdm6, AbstractC166987dD.A1J(AbstractC72048XLo.A0C(AbstractC72046XLm.A0O("https://help.instagram.com/557544397610546"), 2131973482, 2131973481))));
        EnumC72442Xdm enumC72442Xdm7 = EnumC72442Xdm.A08;
        AndValue A0210 = AbstractC72047XLn.A02(AbstractC72046XLm.A0F(2342161673575930249L, true), AbstractC72047XLn.A02(AbstractC72046XLm.A0F(36326107540240025L, true), new NotValue(XjX.A00())));
        NVA A0O7 = AbstractC72046XLm.A0O(true);
        List A1J2 = AbstractC166987dD.A1J(AbstractC72048XLo.A0C(AbstractC72046XLm.A0O("https://help.instagram.com/260845561919807"), 2131973462, 2131973461));
        RemoteBooleanSettingId remoteBooleanSettingId3 = RemoteBooleanSettingId.A0A;
        C09530e4 A1L9 = AbstractC166987dD.A1L(enumC72442Xdm7, new C51922Mx4(AbstractC72046XLm.A04(c72252Xa8, XVa.A00(remoteBooleanSettingId3), "allow_requests_to_feature_your_posts_in_shops"), A0210, A0O7, null, null, C51759Mti.A02(2131973463), enumC72442Xdm7, A1J2));
        EnumC72442Xdm enumC72442Xdm8 = EnumC72442Xdm.A09;
        C09530e4 A1L10 = AbstractC166987dD.A1L(enumC72442Xdm8, new C51922Mx4(AbstractC72046XLm.A04(c72252Xa8, XVa.A00(RemoteBooleanSettingId.A0B), "allow_reuse_of_feed_videos"), AbstractC72047XLn.A02(AbstractC72046XLm.A0F(2342161673575930249L, true), AbstractC72047XLn.A02(AbstractC72046XLm.A0J(Boolean.class, "is_account_public"), new NotValue(XjX.A00()))), AbstractC72046XLm.A0O(true), null, null, C51759Mti.A02(2131973478), enumC72442Xdm8, c16930sl));
        EnumC72442Xdm enumC72442Xdm9 = EnumC72442Xdm.A0A;
        C09530e4 A1L11 = AbstractC166987dD.A1L(enumC72442Xdm9, new C51922Mx4(AbstractC72046XLm.A04(c72252Xa8, XVa.A00(RemoteBooleanSettingId.A0C), "allow_reuse_of_posts"), new AndValue(AbstractC72048XLo.A0O("is_account_public", 2342161673575930249L)), AbstractC72046XLm.A0O(true), null, null, AbstractC72048XLo.A0D(XjX.A00(), C51759Mti.A02(2131973480), 2131973479), enumC72442Xdm9, c16930sl));
        EnumC72442Xdm enumC72442Xdm10 = EnumC72442Xdm.A0B;
        C09530e4 A1L12 = AbstractC166987dD.A1L(enumC72442Xdm10, new C51922Mx4(AbstractC72046XLm.A04(c72252Xa8, XVa.A00(RemoteBooleanSettingId.A0D), "allow_reuse_of_reels"), new AndValue(AbstractC72048XLo.A0O("is_account_public", 2342161673575930249L)), AbstractC72046XLm.A0O(true), null, null, AbstractC72048XLo.A0D(XjX.A00(), C51759Mti.A02(2131973477), 2131973476), enumC72442Xdm10, c16930sl));
        EnumC72442Xdm enumC72442Xdm11 = EnumC72442Xdm.A0C;
        AndValue A0211 = AbstractC72047XLn.A02(AbstractC72046XLm.A0F(2342161673575930249L, true), new NotValue(XjX.A00()));
        NVA A0O8 = AbstractC72046XLm.A0O(true);
        List A1J3 = AbstractC166987dD.A1J(C51759Mti.A02(2131973445));
        RemoteBooleanSettingId remoteBooleanSettingId4 = RemoteBooleanSettingId.A0E;
        C09530e4 A1L13 = AbstractC166987dD.A1L(enumC72442Xdm11, new C51922Mx4(AbstractC72046XLm.A04(c72252Xa8, XVa.A00(remoteBooleanSettingId4), "allow_story_sharing_in_messages"), A0211, A0O8, null, null, C51759Mti.A02(2131973446), enumC72442Xdm11, A1J3));
        EnumC72443Xdn enumC72443Xdn2 = EnumC72443Xdn.A03;
        AndValue andValue = new AndValue(AbstractC72048XLo.A0O("is_account_public", 2342161673575930249L));
        NVA A0O9 = AbstractC72046XLm.A0O(true);
        List A1J4 = AbstractC166987dD.A1J(AbstractC72048XLo.A0C(AbstractC72046XLm.A0O("https://help.instagram.com/620154495870484"), 2131973456, 2131973455));
        C09530e4 A1L14 = AbstractC166987dD.A1L(enumC72443Xdn2, new C51923Mx5(AbstractC72046XLm.A04(c72253Xa9, XVa.A01(RemoteStringSettingId.A05), "allow_website_embeds"), andValue, A0O9, null, AbstractC72046XLm.A0Q(new MWT[]{A00(AbstractC72046XLm.A0O(true), C51759Mti.A02(2131973459), null, RealtimeSubscription.GRAPHQL_MQTT_VERSION, c16930sl), A00(AbstractC72046XLm.A0O(true), C51759Mti.A02(2131973460), null, "2", AbstractC166987dD.A1J("0"))}), AbstractC72048XLo.A0D(XjX.A00(), C51759Mti.A02(2131973458), 2131973457), AbstractC72048XLo.A0D(XjX.A00(), C51759Mti.A02(2131973454), 2131973453), enumC72443Xdn2, A1J4));
        EnumC72442Xdm enumC72442Xdm12 = EnumC72442Xdm.A0D;
        C09530e4 A1L15 = AbstractC166987dD.A1L(enumC72442Xdm12, new C51922Mx4(AbstractC72046XLm.A04(c72252Xa8, XVa.A00(RemoteBooleanSettingId.A0F), "archiving_save_live_to_archive"), AbstractC72046XLm.A0O(true), AbstractC72046XLm.A0O(true), null, null, C51759Mti.A02(2131973551), enumC72442Xdm12, AbstractC166987dD.A1J(C51759Mti.A02(2131973550))));
        EnumC72441Xdl enumC72441Xdl2 = EnumC72441Xdl.A03;
        C09530e4 A1L16 = AbstractC166987dD.A1L(enumC72441Xdl2, new C51922Mx4(AbstractC72046XLm.A04(c72252Xa8, new C51925Mx7("save_original_photos"), "archiving_save_original_photos"), AbstractC72046XLm.A0O(true), AbstractC72046XLm.A0O(true), null, null, C51759Mti.A02(2131973553), enumC72441Xdl2, AbstractC166987dD.A1J(C51759Mti.A02(2131973552))));
        EnumC72442Xdm enumC72442Xdm13 = EnumC72442Xdm.A0E;
        C09530e4 A1L17 = AbstractC166987dD.A1L(enumC72442Xdm13, new C51922Mx4(AbstractC72046XLm.A04(c72252Xa8, XVa.A00(RemoteBooleanSettingId.A0G), "archiving_save_story_to_archive"), new NotValue(AbstractC72046XLm.A0F(36319068088703905L, true)), AbstractC72046XLm.A0O(true), null, null, C51759Mti.A02(2131973525), enumC72442Xdm13, AbstractC166987dD.A1J(C51759Mti.A02(2131973524))));
        EnumC72442Xdm enumC72442Xdm14 = EnumC72442Xdm.A0F;
        C09530e4 A1L18 = AbstractC166987dD.A1L(enumC72442Xdm14, new C51922Mx4(AbstractC72046XLm.A04(c72252Xa8, new XVa(C05F.A00), "archiving_save_story_to_camera_gallery"), AbstractC72046XLm.A0O(true), AbstractC72046XLm.A0O(true), null, null, C51759Mti.A02(2131973555), enumC72442Xdm14, AbstractC166987dD.A1J(C51759Mti.A02(2131973554))));
        EnumC72442Xdm enumC72442Xdm15 = EnumC72442Xdm.A0G;
        C09530e4 A1L19 = AbstractC166987dD.A1L(enumC72442Xdm15, new C51922Mx4(AbstractC72046XLm.A04(c72252Xa8, XVa.A00(RemoteBooleanSettingId.A0J), "custom_words_hide_comments"), new OrValue(AbstractC72048XLo.A0O("is_user_account_nido", 36318664362760593L)), AbstractC72046XLm.A0O(true), null, null, C51759Mti.A02(2131973374), enumC72442Xdm15, AbstractC16960so.A1Q(C51759Mti.A02(2131973372), AbstractC72046XLm.A0E(AbstractC72046XLm.A0K("has_threads_account", AbstractC25225BEi.A1D(Boolean.class)), C51759Mti.A02(2131973373), null))));
        EnumC72442Xdm enumC72442Xdm16 = EnumC72442Xdm.A0H;
        C09530e4 A1L20 = AbstractC166987dD.A1L(enumC72442Xdm16, new C51922Mx4(AbstractC72046XLm.A04(c72252Xa8, XVa.A00(RemoteBooleanSettingId.A0K), "custom_words_hide_message_requests"), new OrValue(AbstractC72048XLo.A0O("is_user_account_nido", 36318664362760593L)), AbstractC72046XLm.A0O(true), null, null, C51759Mti.A02(2131973377), enumC72442Xdm16, AbstractC166987dD.A1J(AbstractC72048XLo.A0D(AbstractC72046XLm.A0F(2342170302164777441L, true), C51759Mti.A02(2131973376), 2131973375))));
        EnumC72443Xdn enumC72443Xdn3 = EnumC72443Xdn.A04;
        OrValue orValue = new OrValue(AbstractC72048XLo.A0O("is_user_account_nido", 2342161673576389008L));
        NVA A0O10 = AbstractC72046XLm.A0O(true);
        RemoteStringSettingId remoteStringSettingId = RemoteStringSettingId.A06;
        C09530e4 A1L21 = AbstractC166987dD.A1L(enumC72443Xdn3, new C51923Mx5(AbstractC72046XLm.A04(c72253Xa9, XVa.A01(remoteStringSettingId), "daily_limit"), orValue, A0O10, null, AbstractC72046XLm.A0Q(new MWT[]{A00(new C33160Ek5(AbstractC20100yh.A00(36321825457842014L), true), C51759Mti.A02(2131973556), null, "120", c16930sl), A00(AbstractC72046XLm.A0O(true), C51759Mti.A02(2131973557), null, "900", c16930sl), A00(AbstractC72046XLm.A0O(true), C51759Mti.A02(2131973558), null, "1800", c16930sl), A00(AbstractC72046XLm.A0O(true), C51759Mti.A02(2131973559), null, "2700", c16930sl), A00(AbstractC72046XLm.A0O(true), C51759Mti.A02(2131973560), null, "3600", c16930sl), A00(AbstractC72046XLm.A0O(true), C51759Mti.A02(2131973561), null, "7200", c16930sl), A00(AbstractC72046XLm.A0O(true), C51759Mti.A02(2131973562), null, "0", c16930sl), A00(AbstractC72046XLm.A0C(new NVI(AbstractC72046XLm.A04(c72253Xa9, XVa.A01(remoteStringSettingId), "daily_limit"), AbstractC25225BEi.A1D(Integer.class)), 86400), new FbtLiteralValue(AbstractC72046XLm.A0K("legacy_daily_limit_string", AbstractC25225BEi.A1D(String.class))), null, "86400", c16930sl)}), new FbtLiteralValue(AbstractC72046XLm.A0O("")), null, enumC72443Xdn3, c16930sl));
        EnumC72442Xdm enumC72442Xdm17 = EnumC72442Xdm.A0I;
        C09530e4 A1L22 = AbstractC166987dD.A1L(enumC72442Xdm17, new C51922Mx4(AbstractC72046XLm.A04(c72252Xa8, XVa.A00(remoteBooleanSettingId3), "allow_requests_to_feature_your_posts_in_shops"), AbstractC72047XLn.A02(XjX.A00(), AbstractC72047XLn.A02(AbstractC72046XLm.A0F(36326107540240025L, true), new NotValue(XVa.A02(new C51718Msv(remoteBooleanSettingId), c72252Xa8, Boolean.class, "account_privacy_setting")))), AbstractC72046XLm.A0O(true), null, null, C51759Mti.A02(2131973498), enumC72442Xdm17, AbstractC166987dD.A1J(AbstractC72048XLo.A0C(AbstractC72046XLm.A0O("https://help.instagram.com/260845561919807"), 2131973497, 2131973496))));
        EnumC72442Xdm enumC72442Xdm18 = EnumC72442Xdm.A0J;
        RemoteBooleanSettingId remoteBooleanSettingId5 = RemoteBooleanSettingId.A0N;
        C09530e4 A1L23 = AbstractC166987dD.A1L(enumC72442Xdm18, new C51922Mx4(AbstractC72046XLm.A04(c72252Xa8, XVa.A00(RemoteBooleanSettingId.A0L), "hidden_words_advanced_comment_filtering"), AbstractC72047XLn.A02(AbstractC72047XLn.A05(c72252Xa8, XVa.A00(remoteBooleanSettingId5), Boolean.class, "hidden_words_hide_comments"), new OrValue(AbstractC72048XLo.A0O("is_user_account_nido", 36318664362760593L))), AbstractC72046XLm.A0O(true), null, null, C51759Mti.A02(2131973568), enumC72442Xdm18, AbstractC166987dD.A1J(C51759Mti.A02(2131973567))));
        EnumC72442Xdm enumC72442Xdm19 = EnumC72442Xdm.A0K;
        C09530e4 A1L24 = AbstractC166987dD.A1L(enumC72442Xdm19, new C51922Mx4(AbstractC72046XLm.A04(c72252Xa8, XVa.A00(remoteBooleanSettingId5), "hidden_words_hide_comments"), new OrValue(AbstractC72048XLo.A0O("is_user_account_nido", 36318664362760593L)), AbstractC72046XLm.A0O(true), null, null, C51759Mti.A02(2131973566), enumC72442Xdm19, AbstractC16960so.A1Q(AbstractC72048XLo.A0C(AbstractC72046XLm.A0O(AbstractC43591JPw.A00(380)), 2131973564, 2131973563), AbstractC72046XLm.A0E(AbstractC72046XLm.A0J(Boolean.class, "has_threads_account"), C51759Mti.A02(2131973565), null))));
        EnumC72442Xdm enumC72442Xdm20 = EnumC72442Xdm.A0L;
        C09530e4 A1L25 = AbstractC166987dD.A1L(enumC72442Xdm20, new C51922Mx4(AbstractC72046XLm.A04(c72252Xa8, XVa.A00(RemoteBooleanSettingId.A0O), "hidden_words_hide_message_requests"), new OrValue(AbstractC72048XLo.A0O("is_user_account_nido", 36318664362760593L)), AbstractC72046XLm.A0O(true), null, null, C51759Mti.A02(2131973371), enumC72442Xdm20, AbstractC166987dD.A1J(AbstractC72048XLo.A0D(AbstractC72046XLm.A0F(2342170302164777441L, true), C51759Mti.A02(2131973370), 2131973369))));
        EnumC72442Xdm enumC72442Xdm21 = EnumC72442Xdm.A0M;
        OrValue orValue2 = new OrValue(AbstractC72048XLo.A0O("is_user_account_nido", 2342161673576257934L));
        NVA A0O11 = AbstractC72046XLm.A0O(true);
        List A1J5 = AbstractC166987dD.A1J(AbstractC72046XLm.A0D(AbstractC72046XLm.A0F(2342170134661052729L, true), AbstractC72048XLo.A0D(AbstractC72046XLm.A0K("is_supervision_sleep_mode_non_blocking", AbstractC25225BEi.A1D(Boolean.class)), C51759Mti.A02(2131973502), 2131973501), AbstractC72048XLo.A0D(AbstractC72046XLm.A0J(Boolean.class, "is_supervision_sleep_mode_non_blocking"), C51759Mti.A02(2131973500), 2131973499)));
        RemoteBooleanSettingId remoteBooleanSettingId6 = RemoteBooleanSettingId.A0P;
        C09530e4 A1L26 = AbstractC166987dD.A1L(enumC72442Xdm21, new C51922Mx4(AbstractC72046XLm.A04(c72252Xa8, XVa.A00(remoteBooleanSettingId6), "is_sleep_mode_enabled"), orValue2, A0O11, null, null, AbstractC72048XLo.A0D(AbstractC72046XLm.A0F(2342170134661052729L, true), C51759Mti.A02(2131973504), 2131973503), enumC72442Xdm21, A1J5));
        EnumC72443Xdn enumC72443Xdn4 = EnumC72443Xdn.A05;
        System.arraycopy(new C09530e4[]{A1L, A1L2, A1L3, A1L4, A1L5, A1L6, A1L7, A1L8, A1L9, A1L10, A1L11, A1L12, A1L13, A1L14, A1L15, A1L16, A1L17, A1L18, A1L19, A1L20, A1L21, A1L22, A1L23, A1L24, A1L25, A1L26, AbstractC166987dD.A1L(enumC72443Xdn4, new C51923Mx5(AbstractC72046XLm.A04(c72253Xa9, XVa.A01(RemoteStringSettingId.A07), "message_reachability_group_message"), AbstractC72046XLm.A0F(2342161673576061323L, true), AbstractC72046XLm.A0O(true), null, AbstractC72046XLm.A0Q(new MWT[]{A00(AbstractC72046XLm.A0O(true), C51759Mti.A02(2131973394), C51759Mti.A02(2131973393), "everyone", c16930sl), A00(AbstractC72046XLm.A0O(true), C51759Mti.A02(2131973396), C51759Mti.A02(2131973395), "people_i_follow", c16930sl)}), C51759Mti.A02(2131973392), null, enumC72443Xdn4, c16930sl))}, 0, c09530e4Arr, 0, 27);
        EnumC72443Xdn enumC72443Xdn5 = EnumC72443Xdn.A06;
        C33160Ek5 A0F = AbstractC72046XLm.A0F(2342161673576061323L, true);
        RemoteStringSettingId remoteStringSettingId2 = RemoteStringSettingId.A08;
        C09530e4 A1L27 = AbstractC166987dD.A1L(enumC72443Xdn5, new C51923Mx5(AbstractC72046XLm.A04(c72253Xa9, XVa.A01(remoteStringSettingId2), "message_reachability_ig_verified"), AbstractC72047XLn.A02(A0F, AbstractC72046XLm.A0H(new NotValue(AbstractC72046XLm.A0C(AbstractC72047XLn.A05(c72253Xa9, XVa.A01(remoteStringSettingId2), Integer.class, "message_reachability_ig_verified"), 0)), AbstractC72046XLm.A0F(36318664362498445L, true))), AbstractC72046XLm.A0O(true), null, AbstractC72046XLm.A0Q(new MWT[]{A00(AbstractC72046XLm.A0O(true), C51759Mti.A02(2131973399), null, "4", c16930sl), A00(AbstractC72046XLm.A0O(true), C51759Mti.A02(2131973400), null, "5", c16930sl)}), C51759Mti.A02(2131973398), null, enumC72443Xdn5, AbstractC166987dD.A1J(C51759Mti.A02(2131973397))));
        EnumC72442Xdm enumC72442Xdm22 = EnumC72442Xdm.A0N;
        C09530e4 A1L28 = AbstractC166987dD.A1L(enumC72442Xdm22, new C51922Mx4(AbstractC72046XLm.A04(c72252Xa8, XVa.A00(RemoteBooleanSettingId.A0Q), "message_reachability_linked_page_direct_message"), AbstractC72047XLn.A02(AbstractC72046XLm.A0F(2342161673576061323L, true), AbstractC72048XLo.A0A(AbstractC72046XLm.A0K("is_linked_page_direct_message_access_enabled", AbstractC25225BEi.A1D(Boolean.class)), 36311878313444137L)), AbstractC72046XLm.A0O(true), null, null, C51759Mti.A02(2131973401), enumC72442Xdm22, c16930sl));
        EnumC72443Xdn enumC72443Xdn6 = EnumC72443Xdn.A07;
        C33160Ek5 A0F2 = AbstractC72046XLm.A0F(2342161673576061323L, true);
        NVA A0O12 = AbstractC72046XLm.A0O(true);
        List A1J6 = AbstractC166987dD.A1J(C51759Mti.A02(2131973385));
        RemoteStringSettingId remoteStringSettingId3 = RemoteStringSettingId.A09;
        C09530e4 A1L29 = AbstractC166987dD.A1L(enumC72443Xdn6, new C51923Mx5(AbstractC72046XLm.A04(c72253Xa9, XVa.A01(remoteStringSettingId3), "message_reachability_one_on_one_message"), A0F2, A0O12, AbstractC72046XLm.A0E(new AndValue(AbstractC16960so.A1Q(AbstractC72046XLm.A0C(new NVG(enumC72443Xdn6, AbstractC25225BEi.A1D(String.class)), "everyone"), AbstractC72046XLm.A0C(XVa.A02(new C51718Msv(remoteStringSettingId3), c72253Xa9, String.class, "message_reachability_one_on_one_message"), "nobody"))), A01(C51759Mti.A02(2131973387), C51759Mti.A02(2131973388), enumC72443Xdn6, ModalBodyItemValue.A00(C51759Mti.A02(2131973386), true)), null), AbstractC72046XLm.A0Q(new MWT[]{A00(AbstractC72046XLm.A0O(true), C51759Mti.A02(2131973390), null, "everyone", c16930sl), A00(AbstractC72046XLm.A0O(true), C51759Mti.A02(2131973391), null, "people_i_may_know", AbstractC16960so.A1Q("nobody", "people_i_follow"))}), C51759Mti.A02(2131973389), null, enumC72443Xdn6, A1J6));
        EnumC72443Xdn enumC72443Xdn7 = EnumC72443Xdn.A08;
        C33160Ek5 A0F3 = AbstractC72046XLm.A0F(2342161673576061323L, true);
        NVA A0O13 = AbstractC72046XLm.A0O(true);
        List A1J7 = AbstractC166987dD.A1J(C51759Mti.A02(2131973378));
        C09530e4 A1L30 = AbstractC166987dD.A1L(enumC72443Xdn7, new C51923Mx5(AbstractC72046XLm.A04(c72253Xa9, XVa.A01(remoteStringSettingId3), "message_reachability_one_on_one_message"), A0F3, A0O13, AbstractC72046XLm.A0E(new AndValue(AbstractC16960so.A1Q(AbstractC72046XLm.A0C(new NVG(enumC72443Xdn7, AbstractC25225BEi.A1D(String.class)), "nobody"), AbstractC72046XLm.A0C(XVa.A02(new C51718Msv(remoteStringSettingId3), c72253Xa9, String.class, "message_reachability_one_on_one_message"), "everyone"))), A01(C51759Mti.A02(2131973380), C51759Mti.A02(2131973381), enumC72443Xdn7, ModalBodyItemValue.A00(C51759Mti.A02(2131973379), true)), null), AbstractC72046XLm.A0Q(new MWT[]{A00(AbstractC72046XLm.A0O(true), C51759Mti.A02(2131973383), null, "people_i_may_know", AbstractC166987dD.A1J("everyone")), A00(AbstractC72046XLm.A0O(true), C51759Mti.A02(2131973384), null, "nobody", AbstractC166987dD.A1J("people_i_follow"))}), C51759Mti.A02(2131973382), null, enumC72443Xdn7, A1J7));
        EnumC72442Xdm enumC72442Xdm23 = EnumC72442Xdm.A0O;
        C09530e4 A1L31 = AbstractC166987dD.A1L(enumC72442Xdm23, new C51922Mx4(AbstractC72046XLm.A04(c72252Xa8, XVa.A00(remoteBooleanSettingId2), "allow_post_and_reel_sharing_to_stories"), AbstractC72047XLn.A02(AbstractC72046XLm.A0J(Boolean.class, "is_account_public"), XjX.A00()), AbstractC72046XLm.A0O(true), null, null, AbstractC72048XLo.A0D(AbstractC72046XLm.A0F(36326107540174488L, true), C51759Mti.A02(2131973493), 2131973492), enumC72442Xdm23, c16930sl));
        EnumC72443Xdn enumC72443Xdn8 = EnumC72443Xdn.A09;
        C33160Ek5 A0F4 = AbstractC72046XLm.A0F(2342161673576126860L, true);
        NVA A0O14 = AbstractC72046XLm.A0O(true);
        List A1Q2 = AbstractC16960so.A1Q(C51759Mti.A02(2131973403), AbstractC72046XLm.A0D(AbstractC72046XLm.A0J(Boolean.class, "has_threads_account"), C51759Mti.A02(2131973404), new FbtLiteralValue(AbstractC72046XLm.A0O(""))));
        C51757Mtg A042 = AbstractC72046XLm.A04(c72253Xa9, XVa.A01(RemoteStringSettingId.A0A), "sensitive_content_control");
        IfValue A0E = AbstractC72046XLm.A0E(AbstractC72046XLm.A0K("enable_sensitive_content_control_more_option", AbstractC25225BEi.A1D(Boolean.class)), AbstractC72046XLm.A0Q(new MWT[]{A00(AbstractC72046XLm.A0O(true), C51759Mti.A02(2131973429), C51759Mti.A02(2131973428), "2", c16930sl), A00(AbstractC72046XLm.A0O(true), C51759Mti.A02(2131973431), C51759Mti.A02(2131973430), RealtimeSubscription.GRAPHQL_MQTT_VERSION, c16930sl), A00(AbstractC72046XLm.A0O(true), C51759Mti.A02(2131973433), C51759Mti.A02(2131973432), "0", c16930sl)}), AbstractC16960so.A1Q(A00(AbstractC72046XLm.A0O(true), C51759Mti.A02(2131973425), C51759Mti.A02(2131973424), "2", c16930sl), A00(AbstractC72046XLm.A0O(true), C51759Mti.A02(2131973427), C51759Mti.A02(2131973426), RealtimeSubscription.GRAPHQL_MQTT_VERSION, c16930sl)));
        NVA A0212 = C51759Mti.A02(2131973423);
        NVA A0213 = C51759Mti.A02(2131973402);
        EqualsValue A0C = AbstractC72046XLm.A0C(new NVG(enumC72443Xdn8, AbstractC25225BEi.A1D(String.class)), "2");
        NVA A0214 = C51759Mti.A02(2131973422);
        NVA A0215 = C51759Mti.A02(2131973417);
        NVA A0O15 = AbstractC72046XLm.A0O(true);
        Integer valueOf4 = Integer.valueOf(R.drawable.instagram_eye_off_pano_outline_24);
        ModalBodyItemValue A0216 = A02(A0215, A0O15, valueOf4);
        NVA A0217 = C51759Mti.A02(2131973418);
        NVA A0O16 = AbstractC72046XLm.A0O(true);
        Integer valueOf5 = Integer.valueOf(R.drawable.instagram_media_pano_outline_24);
        ModalBodyItemValue A0218 = A02(A0217, A0O16, valueOf5);
        NVA A0219 = C51759Mti.A02(2131973419);
        NVA A0O17 = AbstractC72046XLm.A0O(true);
        Integer valueOf6 = Integer.valueOf(R.drawable.instagram_users_pano_outline_24);
        ModalBodyItemValue A0220 = A02(A0219, A0O17, valueOf6);
        NVA A0221 = C51759Mti.A02(2131973420);
        NVA A0O18 = AbstractC72046XLm.A0O(true);
        Integer valueOf7 = Integer.valueOf(R.drawable.instagram_no_photo_pano_outline_24);
        C09530e4 A1L32 = AbstractC166987dD.A1L(enumC72443Xdn8, new C51923Mx5(A042, A0F4, A0O14, AbstractC72046XLm.A0D(A0C, A01(C51759Mti.A02(2131973421), A0214, enumC72443Xdn8, AbstractC16960so.A1Q(A0216, A0218, A0220, A02(A0221, A0O18, valueOf7))), AbstractC72046XLm.A0D(AbstractC72046XLm.A0C(new NVG(enumC72443Xdn8, AbstractC25225BEi.A1D(String.class)), RealtimeSubscription.GRAPHQL_MQTT_VERSION), A01(C51759Mti.A02(2131973415), C51759Mti.A02(2131973416), enumC72443Xdn8, AbstractC16960so.A1Q(A03(C51759Mti.A02(2131973411), true, valueOf4), A03(C51759Mti.A02(2131973412), true, valueOf5), A03(C51759Mti.A02(2131973413), true, valueOf6), A03(C51759Mti.A02(2131973414), true, valueOf7))), A01(C51759Mti.A02(2131973409), C51759Mti.A02(2131973410), enumC72443Xdn8, AbstractC16960so.A1Q(A03(C51759Mti.A02(2131973405), true, valueOf4), A03(C51759Mti.A02(2131973406), true, valueOf5), A03(C51759Mti.A02(2131973407), true, valueOf6), A03(C51759Mti.A02(2131973408), true, valueOf7))))), A0E, A0212, A0213, enumC72443Xdn8, A1Q2));
        EnumC72442Xdm enumC72442Xdm24 = EnumC72442Xdm.A0P;
        C09530e4 A1L33 = AbstractC166987dD.A1L(enumC72442Xdm24, new C51922Mx4(AbstractC72046XLm.A04(c72252Xa8, XVa.A00(RemoteBooleanSettingId.A0S), "seo_indexing_opt_out"), AbstractC72047XLn.A02(AbstractC72046XLm.A0F(2342161673575995786L, true), AbstractC72048XLo.A0A(new NotValue(XVa.A02(new C51718Msv(remoteBooleanSettingId), c72252Xa8, Boolean.class, "account_privacy_setting")), 36314064451996046L)), AbstractC72046XLm.A0O(true), null, null, C51759Mti.A02(2131973440), enumC72442Xdm24, AbstractC166987dD.A1J(AbstractC72048XLo.A0C(AbstractC72046XLm.A0O("https://help.instagram.com/147542625391305"), 2131973439, 2131973438))));
        EnumC72443Xdn enumC72443Xdn9 = EnumC72443Xdn.A0A;
        AndValue A0222 = AbstractC72047XLn.A02(AbstractC72046XLm.A0F(2342161673575930249L, true), AbstractC72046XLm.A0K("should_show_share_story_to_facebook_setting", AbstractC25225BEi.A1D(Boolean.class)));
        NVA A0O19 = AbstractC72046XLm.A0O(true);
        C09530e4 A1L34 = AbstractC166987dD.A1L(enumC72443Xdn9, new C51923Mx5(AbstractC72046XLm.A04(c72253Xa9, XVa.A01(RemoteStringSettingId.A0C), "share_story_to_facebook"), A0222, A0O19, null, AbstractC72046XLm.A0Q(new MWT[]{A00(AbstractC72046XLm.A0O(true), C51759Mti.A02(2131973486), null, "2", c16930sl), A00(AbstractC72046XLm.A0O(true), C51759Mti.A02(2131973487), null, RealtimeSubscription.GRAPHQL_MQTT_VERSION, AbstractC16960so.A1Q("0", "3"))}), C51759Mti.A02(2131973485), C51759Mti.A02(2131973484), enumC72443Xdn9, c16930sl));
        EnumC72443Xdn enumC72443Xdn10 = EnumC72443Xdn.A0B;
        C09530e4 A1L35 = AbstractC166987dD.A1L(enumC72443Xdn10, new C51921Mx3(AbstractC72046XLm.A04(c72253Xa9, XVa.A01(RemoteStringSettingId.A0D), "sleep_mode_window"), new OrValue(AbstractC72048XLo.A0O("is_user_account_nido", 2342161673576257934L)), XVa.A02(new C51718Msv(remoteBooleanSettingId6), c72252Xa8, Boolean.class, "is_sleep_mode_enabled"), enumC72442Xdm21, enumC72443Xdn10, c16930sl));
        EnumC72442Xdm enumC72442Xdm25 = EnumC72442Xdm.A0Q;
        C09530e4 A1L36 = AbstractC166987dD.A1L(enumC72442Xdm25, new C51922Mx4(AbstractC72046XLm.A04(c72252Xa8, XVa.A00(remoteBooleanSettingId4), "allow_story_sharing_in_messages"), XjX.A00(), AbstractC72046XLm.A0O(true), null, null, C51759Mti.A02(2131973495), enumC72442Xdm25, AbstractC166987dD.A1J(AbstractC72046XLm.A0E(XVa.A02(new C51718Msv(remoteBooleanSettingId), c72252Xa8, Boolean.class, "account_privacy_setting"), C51759Mti.A02(2131973494), null))));
        EnumC72442Xdm enumC72442Xdm26 = EnumC72442Xdm.A0R;
        C09530e4 A1L37 = AbstractC166987dD.A1L(enumC72442Xdm26, new C51922Mx4(AbstractC72046XLm.A04(c72252Xa8, XVa.A00(RemoteBooleanSettingId.A0U), "tags_mentions_how_you_manage_boosts_reshare_media"), AbstractC72046XLm.A0F(36325690928280849L, true), AbstractC72046XLm.A0O(true), null, null, C51759Mti.A02(2131973541), enumC72442Xdm26, AbstractC166987dD.A1J(C51759Mti.A02(2131973540))));
        EnumC72442Xdm enumC72442Xdm27 = EnumC72442Xdm.A0S;
        NVA A0O20 = AbstractC72046XLm.A0O(true);
        NVA A0O21 = AbstractC72046XLm.A0O(true);
        C09530e4 A1L38 = AbstractC166987dD.A1L(enumC72442Xdm27, new C51922Mx4(AbstractC72046XLm.A04(c72252Xa8, new XVa(C05F.A01), "tags_mentions_manually_approve_tags"), A0O20, A0O21, AbstractC72046XLm.A0D(new NVG(enumC72442Xdm27, AbstractC25225BEi.A1D(Boolean.class)), A01(C51759Mti.A02(2131973521), C51759Mti.A02(2131973522), enumC72442Xdm27, ModalBodyItemValue.A00(C51759Mti.A02(2131973520), true)), A01(C51759Mti.A02(2131973518), C51759Mti.A02(2131973519), enumC72442Xdm27, ModalBodyItemValue.A00(C51759Mti.A02(2131973517), true))), null, C51759Mti.A02(2131973523), enumC72442Xdm27, c16930sl));
        EnumC72442Xdm enumC72442Xdm28 = EnumC72442Xdm.A0T;
        C09530e4 A1L39 = AbstractC166987dD.A1L(enumC72442Xdm28, new C51922Mx4(AbstractC72046XLm.A04(c72252Xa8, XVa.A00(RemoteBooleanSettingId.A0V), "tags_mentions_who_can_boost"), AbstractC72046XLm.A0F(36321881292285819L, true), AbstractC72046XLm.A0O(true), null, null, C51759Mti.A02(2131973539), enumC72442Xdm28, AbstractC166987dD.A1J(C51759Mti.A02(2131973538))));
        EnumC72443Xdn enumC72443Xdn11 = EnumC72443Xdn.A0C;
        NVA A0O22 = AbstractC72046XLm.A0O(true);
        NVA A0O23 = AbstractC72046XLm.A0O(true);
        List A1J8 = AbstractC166987dD.A1J(AbstractC72048XLo.A0D(AbstractC72046XLm.A0F(36316053022445485L, true), C51759Mti.A02(2131973529), 2131973528));
        C51757Mtg A043 = AbstractC72046XLm.A04(c72253Xa9, XVa.A01(RemoteStringSettingId.A0E), "tags_mentions_who_can_mention");
        MWT A003 = A00(AbstractC72046XLm.A0O(true), AbstractC72048XLo.A0D(AbstractC72046XLm.A0F(36318664362039686L, true), C51759Mti.A02(2131973533), 2131973532), null, "everyone", c16930sl);
        NVA A0O24 = AbstractC72046XLm.A0O(true);
        IfValue A0D2 = AbstractC72048XLo.A0D(AbstractC72046XLm.A0F(36318664362039686L, true), C51759Mti.A02(2131973535), 2131973534);
        String A004 = MSV.A00(247);
        C09530e4 A1L40 = AbstractC166987dD.A1L(enumC72443Xdn11, new C51923Mx5(A043, A0O22, A0O23, null, AbstractC72046XLm.A0Q(new MWT[]{A003, A00(A0O24, A0D2, null, A004, c16930sl), A00(AbstractC72046XLm.A0O(true), AbstractC72048XLo.A0D(AbstractC72046XLm.A0F(36318664362039686L, true), C51759Mti.A02(2131973537), 2131973536), null, "off", c16930sl)}), AbstractC72048XLo.A0D(AbstractC72046XLm.A0F(36318664362039686L, true), C51759Mti.A02(2131973531), 2131973530), AbstractC72048XLo.A0D(AbstractC72046XLm.A0F(36318664362039686L, true), C51759Mti.A02(2131973527), 2131973526), enumC72443Xdn11, A1J8));
        EnumC72443Xdn enumC72443Xdn12 = EnumC72443Xdn.A0D;
        C09530e4 A1L41 = AbstractC166987dD.A1L(enumC72443Xdn12, new C51923Mx5(AbstractC72046XLm.A04(c72253Xa9, XVa.A01(RemoteStringSettingId.A0F), "tags_mentions_who_can_tag"), AbstractC72046XLm.A0O(true), AbstractC72046XLm.A0O(true), null, AbstractC72046XLm.A0Q(new MWT[]{A00(AbstractC72046XLm.A0O(true), AbstractC72048XLo.A0D(AbstractC72046XLm.A0F(36318664362039686L, true), C51759Mti.A02(2131973512), 2131973511), null, "everyone", c16930sl), A00(AbstractC72046XLm.A0O(true), AbstractC72048XLo.A0D(AbstractC72046XLm.A0F(36318664362039686L, true), C51759Mti.A02(2131973514), 2131973513), null, A004, c16930sl), A00(AbstractC72046XLm.A0O(true), AbstractC72048XLo.A0D(AbstractC72046XLm.A0F(36318664362039686L, true), C51759Mti.A02(2131973516), 2131973515), null, "off", c16930sl)}), AbstractC72048XLo.A0D(AbstractC72046XLm.A0F(36318664362039686L, true), C51759Mti.A02(2131973510), 2131973509), AbstractC72048XLo.A0D(AbstractC72046XLm.A0F(36318664362039686L, true), C51759Mti.A02(2131973506), 2131973505), enumC72443Xdn12, AbstractC166987dD.A1J(AbstractC72048XLo.A0D(AbstractC72046XLm.A0F(36318664362039686L, true), C51759Mti.A02(2131973508), 2131973507))));
        EnumC72442Xdm enumC72442Xdm29 = EnumC72442Xdm.A0U;
        C09530e4 A1L42 = AbstractC166987dD.A1L(enumC72442Xdm29, new C51922Mx4(AbstractC72046XLm.A04(c72252Xa8, XVa.A00(RemoteBooleanSettingId.A0W), "tags_mentions_who_can_tag_on_other_apps"), AbstractC72046XLm.A0F(36318664362039686L, true), AbstractC72046XLm.A0O(true), null, null, C51759Mti.A02(2131973543), enumC72442Xdm29, AbstractC166987dD.A1J(C51759Mti.A02(2131973542))));
        EnumC72443Xdn enumC72443Xdn13 = EnumC72443Xdn.A0E;
        AndValue A0223 = AbstractC72047XLn.A02(AbstractC72046XLm.A0F(2342161673575930249L, true), AbstractC72046XLm.A0K("enable_remix_reuse_setting", AbstractC25225BEi.A1D(Boolean.class)));
        NVA A0O25 = AbstractC72046XLm.A0O(true);
        List A1J9 = AbstractC166987dD.A1J(AbstractC72048XLo.A0C(AbstractC72046XLm.A0O(MSV.A00(51)), 2131973467, 2131973466));
        System.arraycopy(new C09530e4[]{A1L27, A1L28, A1L29, A1L30, A1L31, A1L32, A1L33, A1L34, A1L35, A1L36, A1L37, A1L38, A1L39, A1L40, A1L41, A1L42, AbstractC166987dD.A1L(enumC72443Xdn13, new C51923Mx5(AbstractC72046XLm.A04(c72253Xa9, XVa.A01(RemoteStringSettingId.A0H), "who_can_remix_or_reuse_your_content"), A0223, A0O25, null, AbstractC72046XLm.A0E(XjX.A00(), AbstractC72046XLm.A0Q(new MWT[]{A00(AbstractC72046XLm.A0O(true), C51759Mti.A02(2131973473), null, RealtimeSubscription.GRAPHQL_MQTT_VERSION, c16930sl), A00(AbstractC72046XLm.A0O(true), C51759Mti.A02(2131973474), new FbtLiteralValue(AbstractC72046XLm.A0K("following_count_text", AbstractC25225BEi.A1D(String.class))), "3", AbstractC166987dD.A1J("2")), A00(AbstractC72046XLm.A0O(true), C51759Mti.A02(2131973475), null, "4", AbstractC166987dD.A1J("0"))}), AbstractC16960so.A1Q(A00(AbstractC72046XLm.A0O(true), C51759Mti.A02(2131973470), null, RealtimeSubscription.GRAPHQL_MQTT_VERSION, c16930sl), A00(AbstractC72046XLm.A0O(true), C51759Mti.A02(2131973471), new FbtLiteralValue(AbstractC72046XLm.A0J(String.class, "following_count_text")), "3", AbstractC166987dD.A1J("2")), A00(AbstractC72046XLm.A0O(true), C51759Mti.A02(2131973472), null, "4", AbstractC166987dD.A1J("0")))), AbstractC72048XLo.A0D(XjX.A00(), C51759Mti.A02(2131973469), 2131973468), AbstractC72048XLo.A0D(XjX.A00(), C51759Mti.A02(2131973465), 2131973464), enumC72443Xdn13, A1J9))}, 0, c09530e4Arr, 27, 17);
        return AbstractC06930Yk.A06(c09530e4Arr);
    }
}
