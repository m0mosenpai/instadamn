package X;

import java.util.Map;

/* renamed from: X.8G2, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C8G2 extends C8FA {
    public final Integer A00;
    public final Map A01;

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C8G2(final android.content.Context r18, final com.instagram.common.session.UserSession r19, X.C183688Ct r20, X.C1816683y r21, java.lang.String r22) {
        /*
            r17 = this;
            r5 = 0
            r15 = 0
            r7 = 111(0x6f, float:1.56E-43)
            r2 = r17
            r4 = r20
            r6 = r5
            r8 = r15
            r9 = r15
            r3 = r2
            r3.<init>(r4, r5, r6, r7, r8, r9)
            java.lang.Integer r0 = X.C05F.A0K
            r2.A00 = r0
            java.util.LinkedHashMap r0 = new java.util.LinkedHashMap
            r0.<init>()
            r2.A01 = r0
            r3 = r21
            java.util.List r0 = r3.A03
            java.util.Iterator r9 = r0.iterator()
        L22:
            boolean r0 = r9.hasNext()
            r10 = r18
            r11 = r19
            r13 = r22
            if (r0 == 0) goto Lb5
            java.lang.Object r8 = r9.next()
            X.AA2 r8 = (X.AA2) r8
            X.5NL r5 = r8.A06
            boolean r7 = r5 instanceof X.BEZ
            if (r7 == 0) goto L90
            r1 = r5
            X.BEZ r1 = (X.BEZ) r1
            boolean r0 = r3.A04
            r0 = r0 ^ 1
            r1.EaH(r0)
        L44:
            X.6pc r0 = r4.A1h
            if (r0 == 0) goto L4b
            r0.get()
        L4b:
            android.graphics.drawable.Drawable r6 = X.AMH.A01(r10, r11, r5, r13)
            boolean r0 = r6 instanceof X.C194808jg
            if (r0 == 0) goto L60
            r1 = r6
            X.8jg r1 = (X.C194808jg) r1
            if (r1 == 0) goto L60
            X.9jz r0 = new X.9jz
            r0.<init>(r10, r11, r1)
            r1.A0C(r0)
        L60:
            java.lang.String r0 = "stories_template_sticker_bundle_id"
            java.util.List r1 = java.util.Collections.singletonList(r0)
            X.C14360o3.A07(r1)
            java.util.Map r0 = r2.A01
            r0.put(r6, r1)
            java.util.Map r5 = r2.A04
            X.AGw r1 = X.AbstractC23125AKj.A00(r8)
            if (r7 == 0) goto L8d
            r0 = 7
            r1.A05 = r0
            r0 = 1
            r1.A0R = r0
            r1.A0M = r15
            r1.A0J = r15
            r1.A0L = r15
            r1.A0K = r15
        L84:
            X.8FC r0 = new X.8FC
            r0.<init>(r1)
            r5.put(r6, r0)
            goto L22
        L8d:
            r1.A05 = r15
            goto L84
        L90:
            boolean r0 = r5 instanceof X.Al6
            if (r0 != 0) goto L44
            boolean r0 = r5 instanceof X.C217849kH
            if (r0 != 0) goto L44
            boolean r0 = r5 instanceof X.C8GD
            if (r0 != 0) goto L44
            java.lang.String r1 = "Unsupported Sticker Model of Type: "
            java.lang.Integer r0 = r5.CBq()
            if (r0 == 0) goto Lb2
            java.lang.String r0 = X.VW6.A00(r0)
        La8:
            java.lang.String r1 = X.AnonymousClass001.A0R(r1, r0)
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r0.<init>(r1)
            throw r0
        Lb2:
            java.lang.String r0 = "null"
            goto La8
        Lb5:
            com.instagram.reels.prompt.model.PromptStickerModel r12 = r3.A01
            if (r12 == 0) goto Ld9
            r14 = 112(0x70, float:1.57E-43)
            X.8P7 r9 = new X.8P7
            r16 = r15
            r9.<init>(r10, r11, r12, r13, r14, r15, r16)
            java.util.Map r1 = r2.A01
            java.lang.String r0 = "prompt_sticker_bundle_id"
            java.util.List r0 = java.util.Collections.singletonList(r0)
            X.C14360o3.A07(r0)
            r1.put(r9, r0)
            X.8FC r1 = r3.A02
            if (r1 == 0) goto Ld9
            java.util.Map r0 = r2.A04
            r0.put(r9, r1)
        Ld9:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C8G2.<init>(android.content.Context, com.instagram.common.session.UserSession, X.8Ct, X.83y, java.lang.String):void");
    }
}
