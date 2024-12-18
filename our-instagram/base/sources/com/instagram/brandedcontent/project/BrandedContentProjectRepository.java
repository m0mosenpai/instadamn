package com.instagram.brandedcontent.project;

import X.AbstractC166987dD;
import X.AbstractC166997dE;
import X.AbstractC167007dF;
import X.AbstractC208910l;
import X.AbstractC25225BEi;
import X.AbstractC25226BEj;
import X.AbstractC25235BEs;
import X.AbstractC31171DnF;
import X.AbstractC31174DnI;
import X.AbstractC31581Du9;
import X.AbstractC37304Gc5;
import X.AbstractC43591JPw;
import X.C008002u;
import X.C05A;
import X.C05F;
import X.C0UO;
import X.C2JM;
import X.C2JS;
import X.C40701ud;
import X.C51675Ms6;
import X.C51758Mth;
import X.C55661Onm;
import X.C59112QXs;
import X.C59113QXt;
import X.C59114QXu;
import X.C59115QXv;
import X.C59116QXw;
import X.InterfaceC11380iw;
import X.LL0;
import X.MV7;
import X.QY1;
import X.Ua9;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.facebook.pando.PandoGraphQLRequest;
import com.google.common.collect.ImmutableList;
import com.instagram.common.session.UserSession;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;

/* loaded from: classes9.dex */
public final class BrandedContentProjectRepository implements InterfaceC11380iw {
    public final UserSession A00;
    public final C05A A01;
    public final C0UO A02;
    public final C0UO A03;
    public final C40701ud A04;
    public final C05A A05;

    public final void A02(ImmutableList immutableList, int i) {
        C2JM A0b = AbstractC25225BEi.A0b();
        C2JM A0b2 = AbstractC25225BEi.A0b();
        A0b.A03("profilePicSize", 50);
        A0b.A05("project_states", immutableList);
        A0b.A03("first", Integer.valueOf(i));
        C55661Onm.A00(new MV7(this, 2), new PandoGraphQLRequest(AbstractC25225BEi.A0c(), "GetListOfProjects", A0b.getParamsCopy(), A0b2.getParamsCopy(), QY1.class, false, null, 0, null, "cam_creator_profile", AbstractC166987dD.A1E()), this.A04, this, 1);
    }

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return "BrandedContentProjectRepository";
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object A01(com.google.common.collect.ImmutableList r21, X.InterfaceC23621Ds r22, int r23) {
        /*
            r20 = this;
            r3 = 12
            r6 = r22
            boolean r0 = X.MAG.A01(r6, r3)
            r5 = r20
            if (r0 == 0) goto Lc8
            r4 = r6
            X.MAG r4 = (X.MAG) r4
            int r2 = r4.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto Lc8
            int r2 = r2 - r1
            r4.A00 = r2
        L1a:
            java.lang.Object r1 = r4.A02
            X.1JX r3 = X.C1JX.A02
            int r0 = r4.A00
            r2 = 1
            if (r0 == 0) goto L71
            if (r0 != r2) goto Ldb
            java.lang.Object r4 = r4.A01
            com.instagram.brandedcontent.project.BrandedContentProjectRepository r4 = (com.instagram.brandedcontent.project.BrandedContentProjectRepository) r4
            X.AbstractC09560e7.A00(r1)
        L2c:
            X.3NY r1 = (X.C3NY) r1
            boolean r0 = r1 instanceof X.C3NX
            if (r0 == 0) goto Lcf
            X.2JS r3 = X.AbstractC25232BEp.A18(r1)
            if (r3 == 0) goto Ld8
            java.lang.Class<X.QY0> r2 = X.QY0.class
            java.lang.String r1 = "cam_creator_profile"
            r0 = 265934746(0xfd9d79a, float:2.1480899E-29)
            X.2JS r3 = r3.A03(r2, r1, r0)
            if (r3 == 0) goto Ld8
            java.lang.Class<X.QXz> r2 = X.C59119QXz.class
            java.lang.String r1 = "creator_profile"
            r0 = -1587776802(0xffffffffa15c72de, float:-7.4690925E-19)
            X.2JS r3 = r3.A03(r2, r1, r0)
            if (r3 == 0) goto Ld8
            java.lang.Class<X.QXy> r2 = X.C59118QXy.class
            java.lang.String r1 = "creator_projects(first:$first,query_params:{\"project_states\":$project_states})"
            r0 = 564437363(0x21a4a173, float:1.1155808E-18)
            X.2JS r3 = r3.A03(r2, r1, r0)
            if (r3 == 0) goto Ld8
            java.lang.Class<X.QXx> r2 = X.C59117QXx.class
            java.lang.String r1 = "nodes"
            r0 = -2020547369(0xffffffff8790e4d7, float:-2.1801212E-34)
            com.google.common.collect.ImmutableList r0 = r3.A06(r2, r1, r0)
            if (r0 == 0) goto Ld8
            java.util.ArrayList r0 = A00(r4, r0)
            return r0
        L71:
            X.AbstractC09560e7.A00(r1)
            X.1ud r1 = r5.A04
            r15 = 0
            X.2JM r8 = X.AbstractC25225BEi.A0b()
            X.2JM r7 = X.AbstractC25225BEi.A0b()
            r0 = 50
            java.lang.Integer r6 = X.AbstractC43592JPx.A0r(r0)
            java.lang.String r0 = "profilePicSize"
            r8.A03(r0, r6)
            java.lang.String r0 = "project_states"
            r6 = r21
            r8.A05(r0, r6)
            java.lang.Integer r6 = X.AbstractC43592JPx.A0r(r23)
            java.lang.String r0 = "first"
            r8.A03(r0, r6)
            X.1uJ r9 = X.AbstractC25225BEi.A0c()
            java.util.Map r11 = r8.getParamsCopy()
            java.util.Map r12 = r7.getParamsCopy()
            java.lang.Class<X.QY1> r13 = X.QY1.class
            java.util.ArrayList r19 = X.AbstractC166987dD.A1E()
            java.lang.String r10 = "GetListOfProjects"
            r14 = 0
            java.lang.String r18 = "cam_creator_profile"
            com.facebook.pando.PandoGraphQLRequest r8 = new com.facebook.pando.PandoGraphQLRequest
            r16 = r14
            r17 = r15
            r8.<init>(r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19)
            r4.A01 = r5
            r4.A00 = r2
            java.lang.Object r1 = r1.A04(r8, r4)
            if (r1 != r3) goto Lc5
            return r3
        Lc5:
            r4 = r5
            goto L2c
        Lc8:
            X.MAG r4 = new X.MAG
            r4.<init>(r5, r6, r3)
            goto L1a
        Lcf:
            boolean r0 = r1 instanceof X.C194848jk
            if (r0 != 0) goto Ld8
            X.B4Z r0 = X.B4Z.A00()
            throw r0
        Ld8:
            X.0sl r0 = X.C16930sl.A00
            return r0
        Ldb:
            java.lang.IllegalStateException r0 = X.AbstractC166987dD.A13()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.brandedcontent.project.BrandedContentProjectRepository.A01(com.google.common.collect.ImmutableList, X.1Ds, int):java.lang.Object");
    }

    public BrandedContentProjectRepository(UserSession userSession, C40701ud c40701ud) {
        this.A00 = userSession;
        this.A04 = c40701ud;
        C008002u A1H = AbstractC25225BEi.A1H(new C51758Mth(null, 3, 9, false));
        this.A01 = A1H;
        this.A03 = AbstractC208910l.A02(A1H);
        C008002u A1A = AbstractC25235BEs.A1A(false);
        this.A05 = A1A;
        this.A02 = AbstractC208910l.A02(A1A);
    }

    public static final ArrayList A00(BrandedContentProjectRepository brandedContentProjectRepository, List list) {
        C2JS c2js;
        boolean z;
        String optionalStringField;
        String A08;
        String str;
        String A09;
        String optionalStringField2;
        C2JS optionalTreeField;
        ArrayList A1E = AbstractC166987dD.A1E();
        LinkedHashSet A0l = AbstractC31171DnF.A0l();
        Iterator it = list.iterator();
        boolean z2 = false;
        while (true) {
            String str2 = null;
            if (!it.hasNext()) {
                break;
            }
            C2JS A0l2 = AbstractC25225BEi.A0l(it);
            C2JS optionalTreeField2 = A0l2.getOptionalTreeField(4, "bcp_brand_profile", C59114QXu.class, 745524792);
            if (optionalTreeField2 != null && (optionalTreeField = optionalTreeField2.getOptionalTreeField(0, "brand_owner", C59113QXt.class, 1502601768)) != null) {
                c2js = optionalTreeField.getOptionalTreeField(0, "ig_owner", C59112QXs.class, 1865060896);
            } else {
                c2js = null;
            }
            C2JS optionalTreeField3 = A0l2.getOptionalTreeField(5, "project_beneficiary_brand_ig_user", C59116QXw.class, 615638272);
            String optionalStringField3 = A0l2.getOptionalStringField(0, "strong_id__");
            z2 = true;
            if (optionalStringField3 != null && optionalStringField3.length() != 0) {
                z = false;
            } else {
                A0l.add("project_id");
                z = true;
            }
            String optionalStringField4 = A0l2.getOptionalStringField(1, PublicKeyCredentialControllerUtility.JSON_KEY_NAME);
            if (optionalStringField4 == null || optionalStringField4.length() == 0) {
                A0l.add("project_name");
                z = true;
            }
            if (c2js == null || (optionalStringField2 = c2js.getOptionalStringField(0, "strong_id__")) == null || optionalStringField2.length() == 0) {
                A0l.add("brand_id");
                z = true;
                if (c2js == null) {
                    A0l.add("brand_username");
                }
            }
            String optionalStringField5 = c2js.getOptionalStringField(1, AbstractC31581Du9.A01());
            if (optionalStringField5 != null && optionalStringField5.length() != 0) {
                z2 = z;
                if (!z) {
                    String optionalStringField6 = A0l2.getOptionalStringField(0, "strong_id__");
                    if (optionalStringField6 == null) {
                        optionalStringField6 = "";
                    }
                    String A082 = A0l2.A08(PublicKeyCredentialControllerUtility.JSON_KEY_NAME);
                    if (A082 == null) {
                        A082 = "";
                    }
                    if ((optionalTreeField3 == null || (optionalStringField = optionalTreeField3.getOptionalStringField(0, "strong_id__")) == null) && (optionalStringField = c2js.getOptionalStringField(0, "strong_id__")) == null) {
                        optionalStringField = "";
                    }
                    if ((optionalTreeField3 == null || (A08 = optionalTreeField3.A08(AbstractC31581Du9.A01())) == null) && (A08 = c2js.A08(AbstractC31581Du9.A01())) == null) {
                        A08 = "";
                    }
                    Long valueOf = Long.valueOf(A0l2.getCoercedTimeField(3, "update_time"));
                    Boolean A0o = AbstractC31174DnI.A0o(A0l2, "ads_permission_required", 2);
                    C2JS optionalTreeField4 = A0l2.getOptionalTreeField(6, "bcp_campaign_app_ios_link", Ua9.class, -544627480);
                    if (optionalTreeField4 != null) {
                        str = AbstractC37304Gc5.A0Z(optionalTreeField4, "content_id", 0).toString();
                    } else {
                        str = null;
                    }
                    C2JS optionalTreeField5 = A0l2.getOptionalTreeField(7, "bcp_campaign_app_android_link", C59115QXv.class, -376479384);
                    if (optionalTreeField5 != null) {
                        str2 = optionalTreeField5.getOptionalStringField(0, "package");
                    }
                    if ((optionalTreeField3 == null || (A09 = optionalTreeField3.A09("profile_image_uri(size:$profilePicSize)")) == null) && (A09 = c2js.A09("profile_image_uri(size:$profilePicSize)")) == null) {
                        A09 = "";
                    }
                    A1E.add(new C51675Ms6(A0o, valueOf, optionalStringField6, A082, optionalStringField, A08, str, str2, A09));
                }
            }
            A0l.add("brand_username");
        }
        if (z2) {
            LL0.A05(brandedContentProjectRepository, brandedContentProjectRepository.A00, C05F.A0d, AbstractC167007dF.A0n(AbstractC43591JPw.A00(1178), A0l.toString()));
        }
        brandedContentProjectRepository.A01.Egh(new C51758Mth(A1E, 2, 9, false));
        AbstractC166997dE.A1Y(brandedContentProjectRepository.A05, AbstractC25226BEj.A1b(A1E));
        return A1E;
    }
}
