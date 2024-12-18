package com.meta.metaai.imagine.creation.impl.data;

import X.AbstractC001800i;
import X.AbstractC09440dt;
import X.AbstractC166987dD;
import X.AbstractC208910l;
import X.AbstractC25227BEk;
import X.AnonymousClass195;
import X.BUS;
import X.C008002u;
import X.C05A;
import X.C05F;
import X.C0UO;
import X.C10E;
import X.C19L;
import X.C28002CVz;
import X.C28266CdB;
import X.C28283CdV;
import X.C29511CzP;
import X.C7N;
import X.CWM;
import X.ComponentCallbacks2C28532CiQ;
import X.DEN;
import X.DQI;
import X.EnumC09460dv;
import X.InterfaceC09390do;
import android.app.Application;
import com.meta.metaai.imagine.service.ImagineNetworkService;
import com.meta.metaai.shared.feedback.data.MetaAIFeedbackNetworkService;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes5.dex */
public final class ImagineGenerationImageRepository {
    public boolean A00;
    public AnonymousClass195 A01;
    public final Application A02;
    public final C28283CdV A03;
    public final ComponentCallbacks2C28532CiQ A04;
    public final C7N A05;
    public final ImagineNetworkService A06;
    public final Integer A07;
    public final String A08;
    public final List A09;
    public final List A0A;
    public final InterfaceC09390do A0B = AbstractC09440dt.A00(EnumC09460dv.A02, DEN.A00);
    public final C05A A0C;
    public final C05A A0D;
    public final C0UO A0E;
    public final C0UO A0F;
    public final boolean A0G;
    public final boolean A0H;
    public final MetaAIFeedbackNetworkService A0I;
    public final C19L A0J;

    /* JADX WARN: Code restructure failed: missing block: B:4:0x000e, code lost:
    
        if (r0.isActive() != true) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A03(X.C28266CdB r18, java.lang.String r19, java.lang.String r20, X.InterfaceC16660sJ r21, int r22, boolean r23, boolean r24, boolean r25, boolean r26, boolean r27, boolean r28) {
        /*
            Method dump skipped, instructions count: 240
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meta.metaai.imagine.creation.impl.data.ImagineGenerationImageRepository.A03(X.CdB, java.lang.String, java.lang.String, X.0sJ, int, boolean, boolean, boolean, boolean, boolean, boolean):void");
    }

    public ImagineGenerationImageRepository(Application application, C28283CdV c28283CdV, C7N c7n, ImagineNetworkService imagineNetworkService, MetaAIFeedbackNetworkService metaAIFeedbackNetworkService, Integer num, String str, C19L c19l, boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
        C28002CVz c28002CVz;
        Object value;
        String str2;
        CWM cwm;
        this.A02 = application;
        this.A06 = imagineNetworkService;
        this.A0J = c19l;
        this.A05 = c7n;
        this.A07 = num;
        this.A03 = c28283CdV;
        this.A0I = metaAIFeedbackNetworkService;
        this.A0G = z;
        this.A0H = z2;
        this.A08 = str;
        ComponentCallbacks2C28532CiQ componentCallbacks2C28532CiQ = new ComponentCallbacks2C28532CiQ();
        this.A04 = componentCallbacks2C28532CiQ;
        C008002u A0z = AbstractC25227BEk.A0z();
        this.A0C = A0z;
        this.A0E = AbstractC208910l.A02(A0z);
        this.A0A = AbstractC166987dD.A1E();
        this.A09 = AbstractC166987dD.A1E();
        C008002u A00 = C10E.A00(C29511CzP.A00);
        this.A0D = A00;
        this.A0F = AbstractC208910l.A02(A00);
        application.registerComponentCallbacks(componentCallbacks2C28532CiQ);
        if (this.A0H && (c28002CVz = ((BUS) this.A0B.getValue()).A01) != null) {
            List list = c28002CVz.A02;
            ArrayList A1E = AbstractC166987dD.A1E();
            for (Object obj : list) {
                if (((C28266CdB) obj).A02 == C05F.A01) {
                    A1E.add(obj);
                }
            }
            C05A c05a = this.A0C;
            do {
                value = c05a.getValue();
                str2 = c28002CVz.A01;
            } while (!c05a.AIi(value, new C28002CVz(str2, A1E, c28002CVz.A00, c28002CVz.A03)));
            C28266CdB c28266CdB = (C28266CdB) AbstractC001800i.A0J(A1E);
            if (c28266CdB != null) {
                cwm = c28266CdB.A01;
            } else {
                cwm = null;
            }
            List list2 = c28002CVz.A02;
            ArrayList A1E2 = AbstractC166987dD.A1E();
            for (Object obj2 : list2) {
                if (((C28266CdB) obj2).A02 == C05F.A00) {
                    A1E2.add(obj2);
                }
            }
            if (AbstractC166987dD.A1b(A1E2)) {
                A03(null, str2, cwm != null ? cwm.A03 : null, DQI.A00, A1E2.size(), false, z3, z4, false, z5, true);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object A00(com.meta.metaai.imagine.creation.impl.data.ImagineGenerationImageRepository r14, java.lang.Integer r15, java.lang.String r16, java.lang.String r17, java.lang.String r18, X.InterfaceC23621Ds r19, boolean r20) {
        /*
            r3 = 39
            r5 = r19
            boolean r0 = X.C57146PWy.A01(r5, r3)
            if (r0 == 0) goto L6f
            r4 = r5
            X.PWy r4 = (X.C57146PWy) r4
            int r2 = r4.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L6f
            int r2 = r2 - r1
            r4.A00 = r2
        L18:
            java.lang.Object r2 = r4.A02
            X.1JX r3 = X.C1JX.A02
            int r1 = r4.A00
            r0 = 1
            if (r1 == 0) goto L4c
            if (r1 != r0) goto L8f
            java.lang.Object r14 = r4.A01
            com.meta.metaai.imagine.creation.impl.data.ImagineGenerationImageRepository r14 = (com.meta.metaai.imagine.creation.impl.data.ImagineGenerationImageRepository) r14
            X.AbstractC09560e7.A00(r2)
        L2a:
            X.3NY r2 = (X.C3NY) r2
            boolean r0 = r2 instanceof X.C3NX
            if (r0 == 0) goto L75
            X.CdV r3 = r14.A03
            X.3NX r2 = (X.C3NX) r2
            java.lang.Object r2 = r2.A00
            X.CWM r2 = (X.CWM) r2
            java.lang.String r1 = r2.A07
            java.lang.String r0 = "request_id"
            r3.A07(r0, r1)
            java.lang.String r1 = r2.A08
            java.lang.String r0 = "response_id"
            r3.A07(r0, r1)
            X.C4b r3 = new X.C4b
            r3.<init>(r2)
            return r3
        L4c:
            X.AbstractC09560e7.A00(r2)
            com.meta.metaai.imagine.service.ImagineNetworkService r7 = r14.A06
            X.C7N r6 = r14.A05
            r4.A01 = r14
            r4.A00 = r0
            r12 = 0
            X.D4t r5 = new X.D4t
            r8 = r15
            r9 = r16
            r10 = r17
            r11 = r18
            r13 = r20
            r5.<init>(r6, r7, r8, r9, r10, r11, r12, r13)
            r0 = 30000(0x7530, double:1.4822E-319)
            java.lang.Object r2 = com.meta.metaai.imagine.service.ImagineNetworkServiceKt.A03(r4, r5, r0)
            if (r2 != r3) goto L2a
            return r3
        L6f:
            X.PWy r4 = new X.PWy
            r4.<init>(r14, r5, r3)
            goto L18
        L75:
            boolean r0 = r2 instanceof X.C194848jk
            if (r0 == 0) goto L8a
            X.CdV r1 = r14.A03
            X.8jk r2 = (X.C194848jk) r2
            java.lang.Object r0 = r2.A00
            X.CAZ r0 = (X.CAZ) r0
            r1.A02(r0)
            X.C4a r3 = new X.C4a
            r3.<init>(r0)
            return r3
        L8a:
            X.B4Z r0 = X.B4Z.A00()
            throw r0
        L8f:
            java.lang.IllegalStateException r0 = X.AbstractC166987dD.A13()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meta.metaai.imagine.creation.impl.data.ImagineGenerationImageRepository.A00(com.meta.metaai.imagine.creation.impl.data.ImagineGenerationImageRepository, java.lang.Integer, java.lang.String, java.lang.String, java.lang.String, X.1Ds, boolean):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x002a  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object A01(X.C7D r12, java.lang.String r13, java.lang.String r14, X.InterfaceC23621Ds r15) {
        /*
            r11 = this;
            r3 = 9
            boolean r0 = X.C29631D3m.A03(r15, r3)
            if (r0 == 0) goto L7e
            r10 = r15
            X.D3m r10 = (X.C29631D3m) r10
            int r2 = r10.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L7e
            int r2 = r2 - r1
            r10.A00 = r2
        L16:
            java.lang.Object r2 = r10.A01
            X.1JX r1 = X.C1JX.A02
            int r0 = r10.A00
            r3 = 1
            if (r0 == 0) goto L62
            if (r0 != r3) goto L91
            X.AbstractC09560e7.A00(r2)
        L24:
            X.3NY r2 = (X.C3NY) r2
            boolean r0 = r2 instanceof X.C3NX
            if (r0 == 0) goto L59
            X.3NX r2 = (X.C3NX) r2
            java.lang.Object r5 = r2.A00
            X.2JS r5 = (X.C2JS) r5
            java.lang.Class<X.QUw> r4 = X.C59038QUw.class
            r2 = 0
            r0 = 147(0x93, float:2.06E-43)
            java.lang.String r1 = X.AbstractC58317Pt9.A00(r0)
            r0 = 1882557464(0x70358c18, float:2.247446E29)
            X.2JS r1 = r5.getOptionalTreeField(r2, r1, r4, r0)
            if (r1 == 0) goto L57
            java.lang.String r0 = "submitted"
            boolean r0 = r1.getCoercedBooleanField(r2, r0)
            if (r0 != r3) goto L57
        L4a:
            X.3NX r2 = X.AbstractC25235BEs.A0f(r3)
        L4e:
            boolean r0 = r2 instanceof X.C3NX
            if (r0 == 0) goto L83
            X.3NX r2 = (X.C3NX) r2
            java.lang.Object r0 = r2.A00
            return r0
        L57:
            r3 = 0
            goto L4a
        L59:
            boolean r0 = r2 instanceof X.C194848jk
            if (r0 != 0) goto L4e
            X.B4Z r0 = X.B4Z.A00()
            throw r0
        L62:
            X.AbstractC09560e7.A00(r2)
            r5 = r13
            if (r13 == 0) goto L96
            r6 = r14
            if (r14 == 0) goto L96
            com.meta.metaai.shared.feedback.data.MetaAIFeedbackNetworkService r4 = r11.A0I
            java.lang.String r7 = X.AbstractC47125KsK.A00(r12)
            r10.A00 = r3
            java.lang.String r8 = "IMAGINE"
            java.lang.String r9 = "FOA_INTENTS"
            java.lang.Object r2 = r4.A00(r5, r6, r7, r8, r9, r10)
            if (r2 != r1) goto L24
            return r1
        L7e:
            X.D3m r10 = X.C29631D3m.A00(r11, r15, r3)
            goto L16
        L83:
            boolean r0 = r2 instanceof X.C194848jk
            if (r0 == 0) goto L8c
            java.lang.Boolean r0 = X.AbstractC166997dE.A0a()
            return r0
        L8c:
            X.B4Z r0 = X.B4Z.A00()
            throw r0
        L91:
            java.lang.IllegalStateException r0 = X.AbstractC166987dD.A13()
            throw r0
        L96:
            java.lang.Boolean r0 = X.AbstractC166997dE.A0a()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meta.metaai.imagine.creation.impl.data.ImagineGenerationImageRepository.A01(X.C7D, java.lang.String, java.lang.String, X.1Ds):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object A02(java.lang.String r6, X.InterfaceC23621Ds r7) {
        /*
            r5 = this;
            r3 = 38
            boolean r0 = X.C57146PWy.A01(r7, r3)
            if (r0 == 0) goto L51
            r4 = r7
            X.PWy r4 = (X.C57146PWy) r4
            int r2 = r4.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L51
            int r2 = r2 - r1
            r4.A00 = r2
        L16:
            java.lang.Object r3 = r4.A02
            X.1JX r2 = X.C1JX.A02
            int r0 = r4.A00
            r1 = 1
            if (r0 == 0) goto L3f
            if (r0 != r1) goto L57
            java.lang.Object r1 = r4.A01
            com.meta.metaai.imagine.creation.impl.data.ImagineGenerationImageRepository r1 = (com.meta.metaai.imagine.creation.impl.data.ImagineGenerationImageRepository) r1
            X.AbstractC09560e7.A00(r3)
        L28:
            X.3NY r3 = (X.C3NY) r3
            boolean r0 = r3 instanceof X.C3NX
            if (r0 == 0) goto L3d
            X.3NX r3 = (X.C3NX) r3
            java.lang.Object r0 = r3.A00
            boolean r0 = X.AbstractC166987dD.A1a(r0)
        L36:
            r1.A00 = r0
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            return r0
        L3d:
            r0 = 0
            goto L36
        L3f:
            X.AbstractC09560e7.A00(r3)
            com.meta.metaai.imagine.service.ImagineNetworkService r0 = r5.A06
            r4.A01 = r5
            r4.A00 = r1
            java.lang.Object r3 = r0.A09(r6, r4)
            if (r3 != r2) goto L4f
            return r2
        L4f:
            r1 = r5
            goto L28
        L51:
            X.PWy r4 = new X.PWy
            r4.<init>(r5, r7, r3)
            goto L16
        L57:
            java.lang.IllegalStateException r0 = X.AbstractC166987dD.A13()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meta.metaai.imagine.creation.impl.data.ImagineGenerationImageRepository.A02(java.lang.String, X.1Ds):java.lang.Object");
    }
}
