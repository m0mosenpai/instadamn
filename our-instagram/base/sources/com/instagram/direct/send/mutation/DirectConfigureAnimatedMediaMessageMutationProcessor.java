package com.instagram.direct.send.mutation;

import X.AbstractC001800i;
import X.AbstractC159387Cy;
import X.AbstractC16850sd;
import X.AbstractC23641Du;
import X.AbstractC29011ae;
import X.AbstractC47202Ktb;
import X.AbstractC47995LLh;
import X.AnonymousClass001;
import X.AnonymousClass191;
import X.AnonymousClass194;
import X.C09530e4;
import X.C0KV;
import X.C12L;
import X.C14360o3;
import X.C19260xA;
import X.C19K;
import X.C1GJ;
import X.C1ON;
import X.C1OW;
import X.C25621Ms;
import X.C25A;
import X.C2DS;
import X.C31071eB;
import X.C31101eF;
import X.C32207EDg;
import X.C32226EDz;
import X.C34793FUv;
import X.C45376K6j;
import X.C45377K6k;
import X.C45380K6n;
import X.C45537KEc;
import X.C47587Kzx;
import X.C47977LIp;
import X.C47Z;
import X.C49240Lpv;
import X.C7Q4;
import X.EnumC159397Cz;
import X.EnumC40111tc;
import X.InterfaceC09390do;
import X.InterfaceC23621Ds;
import X.InterfaceC29301b7;
import X.InterfaceC31091eE;
import X.InterfaceC37261GbE;
import X.JTa;
import X.K6O;
import X.LCX;
import X.LGK;
import X.LLT;
import X.MCR;
import X.MNP;
import X.RYn;
import com.instagram.common.gallery.metadata.MediaUploadMetadata;
import com.instagram.common.session.UserSession;
import com.instagram.direct.armadilloexpress.transportpayload.AddMessageContent;
import com.instagram.direct.armadilloexpress.transportpayload.CommonMediaTransport;
import com.instagram.direct.armadilloexpress.transportpayload.Gif;
import com.instagram.direct.armadilloexpress.transportpayload.Media;
import com.instagram.direct.armadilloexpress.transportpayload.TransportPayload;
import com.instagram.model.direct.DirectThreadKey;
import com.instagram.model.direct.gifs.DirectAnimatedMedia;
import com.instagram.model.mediasize.GifUrlImpl;
import java.util.List;

/* loaded from: classes.dex */
public final class DirectConfigureAnimatedMediaMessageMutationProcessor implements InterfaceC29301b7, InterfaceC31091eE {
    public static final C0KV A05 = C31101eF.A00;
    public final UserSession A00;
    public final C2DS A01;
    public final InterfaceC09390do A02;
    public final InterfaceC09390do A03;
    public final InterfaceC09390do A04;

    public DirectConfigureAnimatedMediaMessageMutationProcessor(UserSession userSession, C2DS c2ds, InterfaceC09390do interfaceC09390do, InterfaceC09390do interfaceC09390do2, InterfaceC09390do interfaceC09390do3) {
        C14360o3.A0B(c2ds, 2);
        this.A00 = userSession;
        this.A01 = c2ds;
        this.A03 = interfaceC09390do;
        this.A04 = interfaceC09390do2;
        this.A02 = interfaceC09390do3;
    }

    @Override // X.InterfaceC29301b7
    public final /* bridge */ /* synthetic */ void ENr(C19260xA c19260xA, InterfaceC37261GbE interfaceC37261GbE, C1OW c1ow) {
        AbstractC29011ae abstractC29011ae = (AbstractC29011ae) c1ow;
        C14360o3.A0B(abstractC29011ae, 0);
        C14360o3.A0B(c19260xA, 1);
        C14360o3.A0B(interfaceC37261GbE, 2);
        List C7R = abstractC29011ae.C7R();
        C14360o3.A07(C7R);
        if (C7R.size() == 1) {
            DirectThreadKey directThreadKey = (DirectThreadKey) C7R.get(0);
            UserSession userSession = this.A00;
            C14360o3.A0A(directThreadKey);
            EnumC159397Cz A00 = AbstractC159387Cy.A00(userSession, abstractC29011ae, directThreadKey);
            C19K A02 = AnonymousClass194.A02(C12L.A00.CPG(319, 3));
            AbstractC23641Du.A05(AnonymousClass191.A00, new MCR(directThreadKey, abstractC29011ae, interfaceC37261GbE, c19260xA, this, A00, (InterfaceC23621Ds) null, 17), A02);
            return;
        }
        throw new IllegalStateException("Check failed.");
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object A00(com.instagram.direct.send.mutation.DirectConfigureAnimatedMediaMessageMutationProcessor r11, X.C31071eB r12, X.InterfaceC23621Ds r13) {
        /*
            r4 = 15
            boolean r0 = X.MAP.A02(r13, r4)
            if (r0 == 0) goto L9e
            r3 = r13
            X.MAP r3 = (X.MAP) r3
            int r2 = r3.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L9e
            int r2 = r2 - r1
            r3.A00 = r2
        L16:
            java.lang.Object r8 = r3.A05
            X.1JX r5 = X.C1JX.A02
            int r0 = r3.A00
            r1 = 1
            if (r0 == 0) goto L61
            if (r0 != r1) goto Lb1
            java.lang.Object r6 = r3.A04
            android.content.Context r6 = (android.content.Context) r6
            java.lang.Object r4 = r3.A03
            com.instagram.model.direct.gifs.DirectAnimatedMedia r4 = (com.instagram.model.direct.gifs.DirectAnimatedMedia) r4
            java.lang.Object r12 = r3.A02
            X.1eB r12 = (X.C31071eB) r12
            java.lang.Object r11 = r3.A01
            com.instagram.direct.send.mutation.DirectConfigureAnimatedMediaMessageMutationProcessor r11 = (com.instagram.direct.send.mutation.DirectConfigureAnimatedMediaMessageMutationProcessor) r11
            X.AbstractC09560e7.A00(r8)
        L34:
            java.lang.String r8 = (java.lang.String) r8
            com.instagram.common.session.UserSession r7 = r11.A00
            java.lang.String r2 = "Required value was null."
            if (r8 == 0) goto Lab
            com.instagram.model.mediasize.GifUrlImpl r1 = r4.A02
            java.lang.Float r0 = r1.A03
            float r0 = r0.floatValue()
            int r9 = (int) r0
            java.lang.Float r0 = r1.A02
            float r0 = r0.floatValue()
            int r10 = (int) r0
            boolean r11 = r4.A06
            X.47Z r0 = X.LLY.A06(r6, r7, r8, r9, r10, r11)
            X.7Q4 r1 = X.AbstractC47064KrL.A00(r0)
            java.lang.String r0 = r1.A06
            if (r0 == 0) goto La5
            r12.A04 = r0
            r12.A02 = r1
            X.0eB r0 = X.C0eB.A00
            return r0
        L61:
            X.AbstractC09560e7.A00(r8)
            com.instagram.model.direct.gifs.DirectAnimatedMedia r4 = r12.A05()
            com.instagram.common.session.UserSession r0 = r11.A00
            X.0vz r0 = r0.deviceSession
            android.content.Context r6 = r0.A06()
            r3.A01 = r11
            r3.A02 = r12
            r3.A03 = r4
            r3.A04 = r6
            r3.A00 = r1
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = X.C89563yw.A01
            X.1Ds r0 = X.C1E2.A02(r3)
            X.3yw r3 = new X.3yw
            r3.<init>(r0)
            X.7UR r0 = X.C7UR.A0A
            X.7UR r2 = X.C7US.A00(r6)
            com.instagram.model.mediasize.GifUrlImpl r0 = r4.A02
            java.lang.String r1 = r0.A09
            X.Ltf r0 = new X.Ltf
            r0.<init>(r3)
            r2.A05(r0, r1)
            java.lang.Object r8 = r3.A00()
            if (r8 != r5) goto L34
            return r5
        L9e:
            X.MAP r3 = new X.MAP
            r3.<init>(r11, r13, r4)
            goto L16
        La5:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r0.<init>(r2)
            throw r0
        Lab:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r0.<init>(r2)
            throw r0
        Lb1:
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.direct.send.mutation.DirectConfigureAnimatedMediaMessageMutationProcessor.A00(com.instagram.direct.send.mutation.DirectConfigureAnimatedMediaMessageMutationProcessor, X.1eB, X.1Ds):java.lang.Object");
    }

    @Override // X.InterfaceC31091eE
    public final /* bridge */ /* synthetic */ void AJE(InterfaceC37261GbE interfaceC37261GbE, C1OW c1ow, C47Z c47z) {
        String str;
        CommonMediaTransport A03;
        C31071eB c31071eB = (C31071eB) c1ow;
        C14360o3.A0B(c31071eB, 0);
        C14360o3.A0B(c47z, 1);
        C14360o3.A0B(interfaceC37261GbE, 2);
        String str2 = c47z.A3t;
        EnumC40111tc enumC40111tc = c47z.A1G;
        String str3 = c47z.A3v;
        Long l = c47z.A2I;
        List C7R = c31071eB.C7R();
        C14360o3.A07(C7R);
        if (C7R.size() == 1) {
            DirectThreadKey directThreadKey = (DirectThreadKey) C7R.get(0);
            String A06 = c31071eB.A06();
            UserSession userSession = this.A00;
            if (AbstractC159387Cy.A01(userSession, c31071eB).A00()) {
                C47587Kzx c47587Kzx = (C47587Kzx) this.A02.getValue();
                String str4 = c31071eB.A04;
                UserSession userSession2 = c47587Kzx.A00;
                C47Z A032 = C25A.A00(userSession2).A03(str4);
                if (A032 != null && (str = A032.A2N) != null && (A03 = LLT.A03(str)) != null) {
                    C45377K6k A00 = CommonMediaTransport.A00(A03);
                    A00.A06("image/gif");
                    CommonMediaTransport commonMediaTransport = (CommonMediaTransport) A00.A02();
                    K6O k6o = (K6O) Gif.DEFAULT_INSTANCE.A0I();
                    k6o.A04();
                    Gif gif = (Gif) k6o.A00;
                    commonMediaTransport.getClass();
                    gif.mediaTransport_ = commonMediaTransport;
                    gif.bitField0_ |= 1;
                    boolean z = c31071eB.A05().A06;
                    k6o.A04();
                    Gif gif2 = (Gif) k6o.A00;
                    gif2.bitField0_ |= 8;
                    gif2.isSticker_ = z;
                    int i = A032.A0H;
                    k6o.A04();
                    Gif gif3 = (Gif) k6o.A00;
                    gif3.bitField0_ |= 4;
                    gif3.width_ = i;
                    int i2 = A032.A0G;
                    k6o.A04();
                    Gif gif4 = (Gif) k6o.A00;
                    gif4.bitField0_ |= 2;
                    gif4.height_ = i2;
                    if (AbstractC159387Cy.A01(userSession2, c31071eB) == EnumC159397Cz.A05) {
                        DirectAnimatedMedia A052 = c31071eB.A05();
                        String str5 = A052.A05;
                        k6o.A04();
                        Gif gif5 = (Gif) k6o.A00;
                        str5.getClass();
                        gif5.bitField0_ |= 16;
                        gif5.stickerId_ = str5;
                        GifUrlImpl gifUrlImpl = A052.A02;
                        String str6 = gifUrlImpl.A09;
                        k6o.A04();
                        Gif gif6 = (Gif) k6o.A00;
                        str6.getClass();
                        gif6.bitField0_ |= 32;
                        gif6.gifUrl_ = str6;
                        Integer num = gifUrlImpl.A05;
                        if (num != null) {
                            int intValue = num.intValue();
                            k6o.A04();
                            Gif gif7 = (Gif) k6o.A00;
                            gif7.bitField0_ |= 64;
                            gif7.gifSize_ = intValue;
                        }
                        Boolean bool = A052.A04;
                        if (bool != null) {
                            boolean booleanValue = bool.booleanValue();
                            k6o.A04();
                            Gif gif8 = (Gif) k6o.A00;
                            gif8.bitField0_ |= 128;
                            gif8.isRandom_ = booleanValue;
                        }
                    }
                    LGK lgk = LGK.A00;
                    C45376K6j A002 = AddMessageContent.A00();
                    C45380K6n c45380K6n = (C45380K6n) Media.DEFAULT_INSTANCE.A0I();
                    c45380K6n.A07(k6o);
                    A002.A06(c45380K6n);
                    RYn A02 = A002.A02();
                    C14360o3.A07(A02);
                    TransportPayload A01 = lgk.A01(userSession2, (AddMessageContent) A02, c31071eB.A00, null, c31071eB);
                    C7Q4 c7q4 = c31071eB.A02;
                    if (c7q4 != null) {
                        C47Z A033 = C25A.A00(userSession2).A03(c7q4.A06);
                        if (A033 != null) {
                            C49240Lpv c49240Lpv = new C49240Lpv(userSession2, interfaceC37261GbE, A033, AbstractC16850sd.A0M(new C09530e4(c7q4.A02(), commonMediaTransport)));
                            C47977LIp c47977LIp = c47587Kzx.A01;
                            List C7R2 = c31071eB.C7R();
                            C14360o3.A07(C7R2);
                            Object A0I = AbstractC001800i.A0I(C7R2);
                            C14360o3.A07(A0I);
                            c47977LIp.A02(A01, c49240Lpv, c31071eB, (DirectThreadKey) A0I, 5);
                            return;
                        }
                        throw new IllegalStateException(AnonymousClass001.A0R("Cannot find pending media for key ", c7q4.A06));
                    }
                    throw new IllegalArgumentException("Required value was null.");
                }
                interfaceC37261GbE.DUq(AbstractC47202Ktb.A00, null);
                return;
            }
            C45537KEc c45537KEc = new C45537KEc(this, c31071eB);
            JTa jTa = ((C1OW) c31071eB).A02;
            if (l == null) {
                return;
            }
            C25621Ms A003 = AbstractC47995LLh.A00(null, null, new MediaUploadMetadata(null, null, null, null, null, null, null, null, null, null, null, false), userSession, jTa.A00, null, directThreadKey, enumC40111tc, null, null, l, str2, str3, A06, c31071eB.A05, jTa.A04, null, null, null, null, "", null, null, jTa.A09, jTa.A07, false, jTa.A0A, false);
            A003.A0P(null, C32207EDg.class, C34793FUv.class, false);
            C1ON A0N = A003.A0N();
            A0N.A00 = new C32226EDz(c45537KEc, userSession, interfaceC37261GbE);
            C1GJ.A03(A0N);
            return;
        }
        throw new IllegalStateException("Check failed.");
    }

    @Override // X.InterfaceC29301b7
    public final /* bridge */ /* synthetic */ boolean CfR(C1OW c1ow, MNP mnp) {
        C31071eB c31071eB = (C31071eB) c1ow;
        C14360o3.A0B(c31071eB, 0);
        C14360o3.A0B(mnp, 1);
        c31071eB.A05();
        return LCX.A01(mnp, c31071eB, this.A01);
    }
}
