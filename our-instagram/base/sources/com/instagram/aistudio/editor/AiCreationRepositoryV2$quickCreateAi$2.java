package com.instagram.aistudio.editor;

import X.AbstractC166987dD;
import X.AbstractC23611Dp;
import X.C0eB;
import X.C1Dl;
import X.C27271C1v;
import X.InterfaceC16620sF;
import X.InterfaceC16660sJ;
import X.InterfaceC23621Ds;
import com.instagram.common.typedurl.ImageUrl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.instagram.aistudio.editor.AiCreationRepositoryV2$quickCreateAi$2", f = "AiCreationRepositoryV2.kt", i = {}, l = {295}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes5.dex */
public final class AiCreationRepositoryV2$quickCreateAi$2 extends AbstractC23611Dp implements InterfaceC16620sF {
    public int A00;
    public final /* synthetic */ C1Dl A01;
    public final /* synthetic */ C27271C1v A02;
    public final /* synthetic */ ImageUrl A03;
    public final /* synthetic */ String A04;
    public final /* synthetic */ String A05;
    public final /* synthetic */ String A06;
    public final /* synthetic */ String A07;
    public final /* synthetic */ InterfaceC16660sJ A08;
    public final /* synthetic */ boolean A09;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AiCreationRepositoryV2$quickCreateAi$2(C1Dl c1Dl, C27271C1v c27271C1v, ImageUrl imageUrl, String str, String str2, String str3, String str4, InterfaceC23621Ds interfaceC23621Ds, InterfaceC16660sJ interfaceC16660sJ, boolean z) {
        super(2, interfaceC23621Ds);
        this.A02 = c27271C1v;
        this.A04 = str;
        this.A01 = c1Dl;
        this.A08 = interfaceC16660sJ;
        this.A09 = z;
        this.A06 = str2;
        this.A05 = str3;
        this.A07 = str4;
        this.A03 = imageUrl;
    }

    @Override // X.C1Dr
    public final InterfaceC23621Ds create(Object obj, InterfaceC23621Ds interfaceC23621Ds) {
        C27271C1v c27271C1v = this.A02;
        String str = this.A04;
        C1Dl c1Dl = this.A01;
        InterfaceC16660sJ interfaceC16660sJ = this.A08;
        boolean z = this.A09;
        return new AiCreationRepositoryV2$quickCreateAi$2(c1Dl, c27271C1v, this.A03, str, this.A06, this.A05, this.A07, interfaceC23621Ds, interfaceC16660sJ, z);
    }

    /* JADX WARN: Code restructure failed: missing block: B:115:0x028f, code lost:
    
        if (X.C18U.A06(r4, r5, 36324011599736641L) != false) goto L109;
     */
    /* JADX WARN: Code restructure failed: missing block: B:116:0x0291, code lost:
    
        r10 = r3.getValue();
        r9 = (X.C26083BgC) r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:117:0x0298, code lost:
    
        if (r9 == null) goto L156;
     */
    /* JADX WARN: Code restructure failed: missing block: B:118:0x029a, code lost:
    
        r0 = X.C26083BgC.A00(null, null, r9, X.AbstractC25225BEi.A0t(r17), null, null, null, null, null, null, null, null, null, X.AbstractC25233BEq.A0q(r6.A0c), null, null, null, null, 16760799, false, false);
     */
    /* JADX WARN: Code restructure failed: missing block: B:120:0x02af, code lost:
    
        if (r3.AIi(r10, r0) == false) goto L192;
     */
    /* JADX WARN: Code restructure failed: missing block: B:122:0x02b1, code lost:
    
        r1 = r6.A0E;
        r7 = r6.A0b;
        r1.Egh(r7.getValue());
        r1 = r6.A0X;
        r0 = X.AbstractC25235BEs.A0a(r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:123:0x02c2, code lost:
    
        if (r0 == null) goto L155;
     */
    /* JADX WARN: Code restructure failed: missing block: B:124:0x02c4, code lost:
    
        r0 = r0.A09;
     */
    /* JADX WARN: Code restructure failed: missing block: B:125:0x02c6, code lost:
    
        r1.Egh(java.lang.String.valueOf(r0));
     */
    /* JADX WARN: Code restructure failed: missing block: B:126:0x02cd, code lost:
    
        if (r0 == false) goto L150;
     */
    /* JADX WARN: Code restructure failed: missing block: B:127:0x02cf, code lost:
    
        r9 = X.AbstractC25226BEj.A0s(r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:128:0x02d3, code lost:
    
        if (r9 == null) goto L149;
     */
    /* JADX WARN: Code restructure failed: missing block: B:129:0x02d5, code lost:
    
        if (r21 != null) goto L123;
     */
    /* JADX WARN: Code restructure failed: missing block: B:130:0x02d7, code lost:
    
        r21 = "";
     */
    /* JADX WARN: Code restructure failed: missing block: B:131:0x02d9, code lost:
    
        if (r20 != null) goto L125;
     */
    /* JADX WARN: Code restructure failed: missing block: B:132:0x02db, code lost:
    
        r20 = "";
     */
    /* JADX WARN: Code restructure failed: missing block: B:133:0x02dd, code lost:
    
        if (r19 != null) goto L127;
     */
    /* JADX WARN: Code restructure failed: missing block: B:134:0x02df, code lost:
    
        r19 = "";
     */
    /* JADX WARN: Code restructure failed: missing block: B:135:0x02e1, code lost:
    
        r13 = r8.getOptionalStringField(7, "image_prompt");
     */
    /* JADX WARN: Code restructure failed: missing block: B:136:0x02e8, code lost:
    
        if (r13 != null) goto L130;
     */
    /* JADX WARN: Code restructure failed: missing block: B:137:0x02ea, code lost:
    
        r13 = "";
     */
    /* JADX WARN: Code restructure failed: missing block: B:138:0x02eb, code lost:
    
        r0 = X.C26083BgC.A00(null, null, r9, r0, null, r21, r20, r13, null, r19, null, null, null, null, null, null, null, null, 16776899, false, false);
     */
    /* JADX WARN: Code restructure failed: missing block: B:139:0x02fa, code lost:
    
        r3.Egh(r0);
        r6.A0W.Egh(r3.getValue());
        r0 = X.AbstractC25226BEj.A0r(r0);
        r6 = X.C05F.A00;
        r0.A07(r6);
        r0 = r7.getValue();
     */
    /* JADX WARN: Code restructure failed: missing block: B:140:0x0313, code lost:
    
        if (r0 == null) goto L167;
     */
    /* JADX WARN: Code restructure failed: missing block: B:141:0x0315, code lost:
    
        r0.Egh(new X.C29081Cs8((X.C26083BgC) r0));
        X.AbstractC25226BEj.A0r(r0).A0A("light_weight_quick_creation_completed");
        X.AbstractC25226BEj.A0r(r0).A07(r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:143:0x033a, code lost:
    
        if (X.C18U.A06(r4, r5, 36330101860156095L) == false) goto L141;
     */
    /* JADX WARN: Code restructure failed: missing block: B:144:0x033c, code lost:
    
        r4 = r3.getValue();
        r1 = (X.C26083BgC) r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:145:0x0343, code lost:
    
        if (r1 == null) goto L148;
     */
    /* JADX WARN: Code restructure failed: missing block: B:146:0x0345, code lost:
    
        r0 = X.C26083BgC.A00(null, null, r1, null, null, "", null, null, null, "", "", null, null, null, null, null, null, null, 16776443, false, false);
     */
    /* JADX WARN: Code restructure failed: missing block: B:148:0x0350, code lost:
    
        if (r3.AIi(r4, r0) == false) goto L194;
     */
    /* JADX WARN: Code restructure failed: missing block: B:151:0x0363, code lost:
    
        r0 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:153:0x03c9, code lost:
    
        throw X.AbstractC166987dD.A14("Required value was null.");
     */
    /* JADX WARN: Code restructure failed: missing block: B:154:0x0365, code lost:
    
        r0 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:155:0x0367, code lost:
    
        if (r17 == null) goto L154;
     */
    /* JADX WARN: Code restructure failed: missing block: B:156:0x0369, code lost:
    
        X.AbstractC25226BEj.A0r(r0).A0A("quick_create_image_gen_completed");
        r6.A0W.Egh(r3.getValue());
        X.AbstractC25226BEj.A0r(r0).A07(X.C05F.A00);
        r0 = r7.getValue();
     */
    /* JADX WARN: Code restructure failed: missing block: B:157:0x0388, code lost:
    
        if (r0 == null) goto L169;
     */
    /* JADX WARN: Code restructure failed: missing block: B:158:0x038a, code lost:
    
        r0.Egh(new X.C29081Cs8((X.C26083BgC) r0));
     */
    /* JADX WARN: Code restructure failed: missing block: B:160:0x03ce, code lost:
    
        throw X.AbstractC166987dD.A14("Required value was null.");
     */
    /* JADX WARN: Code restructure failed: missing block: B:161:0x0397, code lost:
    
        X.C27271C1v.A04(r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:162:0x039b, code lost:
    
        r0 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:164:0x039e, code lost:
    
        r0 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:165:0x03a1, code lost:
    
        r7 = r3.getValue();
        r1 = (X.C26083BgC) r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:166:0x03a8, code lost:
    
        if (r1 == null) goto L163;
     */
    /* JADX WARN: Code restructure failed: missing block: B:167:0x03aa, code lost:
    
        r0 = X.C26083BgC.A00(null, null, r1, null, null, null, null, null, null, null, null, null, null, X.AbstractC25233BEq.A0q(r6.A0c), null, null, null, null, 16760831, false, false);
     */
    /* JADX WARN: Code restructure failed: missing block: B:169:0x03b8, code lost:
    
        if (r3.AIi(r7, r0) == false) goto L196;
     */
    /* JADX WARN: Code restructure failed: missing block: B:172:0x03bc, code lost:
    
        r0 = null;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r9v2, types: [X.0sl] */
    /* JADX WARN: Type inference failed for: r9v3 */
    /* JADX WARN: Type inference failed for: r9v7, types: [java.util.AbstractCollection, java.util.ArrayList] */
    @Override // X.C1Dr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r38) {
        /*
            Method dump skipped, instructions count: 975
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.aistudio.editor.AiCreationRepositoryV2$quickCreateAi$2.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // X.InterfaceC16620sF
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((AiCreationRepositoryV2$quickCreateAi$2) AbstractC166987dD.A1M(obj2, obj, this)).invokeSuspend(C0eB.A00);
    }
}
