package com.instagram.genai.imageservice.api;

import X.AbstractC25232BEp;
import X.AbstractC43592JPx;
import X.AbstractC58317Pt9;
import X.B4Z;
import X.C115095Ie;
import X.C194848jk;
import X.C2JS;
import X.C3NX;
import X.C3NY;
import X.C46346KfU;
import X.C59895Qqf;
import X.C59896Qqg;
import X.EnumC46233Kd9;
import com.facebook.proxygen.TraceFieldType;
import com.instagram.react.modules.product.IgReactPurchaseExperienceBridgeModule;

/* loaded from: classes8.dex */
public final class GenAIImageQueryGraphQLApi {
    public static final GenAIImageQueryGraphQLApi A00 = new Object();

    public static final C3NY A00(C3NY c3ny) {
        C2JS c2js;
        String str;
        String str2;
        C2JS A03;
        if (c3ny instanceof C3NX) {
            C2JS A18 = AbstractC25232BEp.A18(c3ny);
            String str3 = null;
            if (A18 != null && (A03 = A18.A03(C59896Qqg.class, "xig_ig_genai_image_query(params:$params)", -166495565)) != null) {
                c2js = A03.getOptionalTreeField(1, IgReactPurchaseExperienceBridgeModule.RN_SHOP_PAY_STATUS, C59895Qqf.class, -11976301);
                if (c2js != null) {
                    if (!c2js.getCoercedBooleanField(0, "success")) {
                        Enum optionalEnumField = c2js.getOptionalEnumField(1, TraceFieldType.ErrorCode, EnumC46233Kd9.UNSET_OR_UNRECOGNIZED_ENUM_VALUE);
                        if (optionalEnumField != null) {
                            str = optionalEnumField.toString();
                            str2 = c2js.A09(AbstractC58317Pt9.A00(24));
                            str3 = c2js.A0A(AbstractC58317Pt9.A00(22));
                            return AbstractC43592JPx.A0p(new C115095Ie(new C46346KfU(str, str2, str3)));
                        }
                    } else {
                        return c3ny;
                    }
                }
            } else {
                c2js = null;
            }
            str = null;
            if (c2js == null) {
                str2 = null;
                return AbstractC43592JPx.A0p(new C115095Ie(new C46346KfU(str, str2, str3)));
            }
            str2 = c2js.A09(AbstractC58317Pt9.A00(24));
            str3 = c2js.A0A(AbstractC58317Pt9.A00(22));
            return AbstractC43592JPx.A0p(new C115095Ie(new C46346KfU(str, str2, str3)));
        }
        if (c3ny instanceof C194848jk) {
            return c3ny;
        }
        throw B4Z.A00();
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object A01(com.instagram.common.session.UserSession r19, java.lang.String r20, java.lang.String r21, java.lang.String r22, java.lang.String r23, java.lang.String r24, java.lang.String r25, java.lang.String r26, X.InterfaceC23621Ds r27, int r28, int r29) {
        /*
            r18 = this;
            r5 = 26
            r6 = r27
            boolean r0 = X.MAH.A01(r6, r5)
            r4 = r18
            if (r0 == 0) goto Lc0
            r3 = r6
            X.MAH r3 = (X.MAH) r3
            int r2 = r3.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto Lc0
            int r2 = r2 - r1
            r3.A00 = r2
        L1a:
            java.lang.Object r5 = r3.A02
            X.1JX r2 = X.C1JX.A02
            int r0 = r3.A00
            r1 = 1
            if (r0 == 0) goto L2f
            if (r0 != r1) goto Lc7
            X.AbstractC09560e7.A00(r5)
        L28:
            X.3NY r5 = (X.C3NY) r5
            X.3NY r0 = A00(r5)
            return r0
        L2f:
            X.AbstractC09560e7.A00(r5)
            java.lang.Integer r8 = X.AbstractC43592JPx.A0r(r28)
            java.lang.Integer r9 = X.AbstractC43592JPx.A0r(r29)
            r13 = 0
            X.0Jx r7 = com.facebook.graphql.calls.GraphQlCallInput.A02
            java.lang.String r0 = "src_client_id"
            r5 = r23
            X.0CA r6 = X.AbstractC25227BEk.A0T(r7, r5, r0)
            java.lang.String r0 = "src_opaque_token_handle"
            r5 = r24
            X.C0CA.A00(r6, r5, r0)
            java.lang.String r0 = "mask_client_id"
            r5 = r25
            X.C0CA.A00(r6, r5, r0)
            java.lang.String r0 = "mask_opaque_token_handle"
            r5 = r26
            X.C0CA.A00(r6, r5, r0)
            X.2JO r5 = new X.2JO
            r5.<init>()
            java.lang.String r0 = "points"
            r5.A05(r0, r13)
            java.lang.String r0 = "prompt"
            r5 = r22
            X.0CA r7 = X.AbstractC25227BEk.A0T(r7, r5, r0)
            java.lang.String r0 = "num_of_images"
            X.C0CA.A00(r7, r9, r0)
            java.lang.String r0 = "variant_starting_offset"
            X.C0CA.A00(r7, r8, r0)
            java.lang.String r0 = "type"
            r5 = r20
            X.C0CA.A00(r7, r5, r0)
            java.lang.String r0 = "src_image"
            r7.A0E(r6, r0)
            java.lang.String r0 = "client_session_id"
            r5 = r21
            X.C0CA.A00(r7, r5, r0)
            X.2JM r6 = X.AbstractC25225BEi.A0b()
            X.2JM r5 = X.AbstractC25225BEi.A0b()
            java.lang.String r0 = "params"
            X.1uJ r7 = X.AbstractC25233BEq.A0H(r7, r6, r0)
            java.util.Map r9 = r6.getParamsCopy()
            java.util.Map r10 = r5.getParamsCopy()
            java.lang.Class<X.Qqh> r11 = X.C59897Qqh.class
            java.util.ArrayList r17 = X.AbstractC166987dD.A1E()
            java.lang.String r8 = "IGSharingGenAIImageQuery"
            r12 = 0
            java.lang.String r16 = "xig_ig_genai_image_query"
            com.facebook.pando.PandoGraphQLRequest r6 = new com.facebook.pando.PandoGraphQLRequest
            r14 = r12
            r15 = r13
            r6.<init>(r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17)
            X.1ud r0 = X.AbstractC40691uc.A01(r19)
            r3.A01 = r4
            r3.A00 = r1
            java.lang.Object r5 = r0.A04(r6, r3)
            if (r5 != r2) goto L28
            return r2
        Lc0:
            X.MAH r3 = new X.MAH
            r3.<init>(r4, r6, r5)
            goto L1a
        Lc7:
            java.lang.IllegalStateException r0 = X.AbstractC166987dD.A13()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.genai.imageservice.api.GenAIImageQueryGraphQLApi.A01(com.instagram.common.session.UserSession, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, X.1Ds, int, int):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object A02(com.instagram.common.session.UserSession r19, java.lang.String r20, java.lang.String r21, java.lang.String r22, X.InterfaceC23621Ds r23) {
        /*
            r18 = this;
            r5 = 27
            r6 = r23
            boolean r0 = X.MAH.A01(r6, r5)
            r4 = r18
            if (r0 == 0) goto Lb2
            r3 = r6
            X.MAH r3 = (X.MAH) r3
            int r2 = r3.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto Lb2
            int r2 = r2 - r1
            r3.A00 = r2
        L1a:
            java.lang.Object r5 = r3.A02
            X.1JX r2 = X.C1JX.A02
            int r0 = r3.A00
            r1 = 1
            if (r0 == 0) goto L2f
            if (r0 != r1) goto Lb9
            X.AbstractC09560e7.A00(r5)
        L28:
            X.3NY r5 = (X.C3NY) r5
            X.3NY r0 = A00(r5)
            return r0
        L2f:
            X.AbstractC09560e7.A00(r5)
            r13 = 0
            java.lang.String r8 = "SEMANTIC_SEGMENTATION"
            X.0Jx r7 = com.facebook.graphql.calls.GraphQlCallInput.A02
            java.lang.String r0 = "src_client_id"
            r5 = r20
            X.0CA r6 = X.AbstractC25227BEk.A0T(r7, r5, r0)
            java.lang.String r0 = "src_opaque_token_handle"
            r5 = r21
            X.C0CA.A00(r6, r5, r0)
            java.lang.String r0 = "mask_client_id"
            X.C0CA.A00(r6, r13, r0)
            java.lang.String r0 = "mask_opaque_token_handle"
            X.C0CA.A00(r6, r13, r0)
            X.2JO r5 = new X.2JO
            r5.<init>()
            java.lang.String r0 = "points"
            r5.A05(r0, r13)
            java.lang.String r0 = "prompt"
            X.0CA r7 = X.AbstractC25227BEk.A0T(r7, r13, r0)
            java.lang.String r0 = "num_of_images"
            X.C0CA.A00(r7, r13, r0)
            java.lang.String r0 = "variant_starting_offset"
            X.C0CA.A00(r7, r13, r0)
            java.lang.String r0 = "type"
            X.C0CA.A00(r7, r8, r0)
            java.lang.String r0 = "src_image"
            r7.A0E(r6, r0)
            java.lang.String r0 = "client_session_id"
            r5 = r22
            X.C0CA.A00(r7, r5, r0)
            X.2JM r6 = X.AbstractC25225BEi.A0b()
            X.2JM r5 = X.AbstractC25225BEi.A0b()
            java.lang.String r0 = "params"
            X.1uJ r7 = X.AbstractC25233BEq.A0H(r7, r6, r0)
            java.util.Map r9 = r6.getParamsCopy()
            java.util.Map r10 = r5.getParamsCopy()
            java.lang.Class<X.Qqh> r11 = X.C59897Qqh.class
            java.util.ArrayList r17 = X.AbstractC166987dD.A1E()
            java.lang.String r8 = "IGSharingGenAIImageQuery"
            r12 = 0
            java.lang.String r16 = "xig_ig_genai_image_query"
            com.facebook.pando.PandoGraphQLRequest r6 = new com.facebook.pando.PandoGraphQLRequest
            r14 = r12
            r15 = r13
            r6.<init>(r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17)
            X.1ud r0 = X.AbstractC40691uc.A01(r19)
            r3.A01 = r4
            r3.A00 = r1
            java.lang.Object r5 = r0.A04(r6, r3)
            if (r5 != r2) goto L28
            return r2
        Lb2:
            X.MAH r3 = new X.MAH
            r3.<init>(r4, r6, r5)
            goto L1a
        Lb9:
            java.lang.IllegalStateException r0 = X.AbstractC166987dD.A13()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.genai.imageservice.api.GenAIImageQueryGraphQLApi.A02(com.instagram.common.session.UserSession, java.lang.String, java.lang.String, java.lang.String, X.1Ds):java.lang.Object");
    }
}
