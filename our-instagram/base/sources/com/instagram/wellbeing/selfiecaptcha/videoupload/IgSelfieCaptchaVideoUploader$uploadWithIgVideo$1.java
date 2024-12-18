package com.instagram.wellbeing.selfiecaptcha.videoupload;

import X.AbstractC09560e7;
import X.AbstractC166987dD;
import X.AbstractC23611Dp;
import X.AbstractC53512Nle;
import X.B4Z;
import X.C05F;
import X.C0eB;
import X.C1JX;
import X.C55654Onf;
import X.EnumC40111tc;
import X.InterfaceC16620sF;
import X.InterfaceC23621Ds;
import X.InterfaceC58100PpP;
import X.NRT;
import X.NRU;
import X.NRV;
import X.O8O;
import X.OY5;
import X.SXD;
import X.TM0;
import X.TM1;
import X.TPF;
import android.os.Handler;
import com.facebook.smartcapture.logging.AuthenticityUploadMedium;
import com.instagram.common.session.UserSession;
import com.instagram.pendingmedia.service.upload.FbUploaderUtil;
import java.util.LinkedHashMap;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.instagram.wellbeing.selfiecaptcha.videoupload.IgSelfieCaptchaVideoUploader$uploadWithIgVideo$1", f = "IgSelfieCaptchaVideoUploader.kt", i = {}, l = {178}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes10.dex */
public final class IgSelfieCaptchaVideoUploader$uploadWithIgVideo$1 extends AbstractC23611Dp implements InterfaceC16620sF {
    public int A00;
    public final /* synthetic */ InterfaceC58100PpP A01;
    public final /* synthetic */ UserSession A02;
    public final /* synthetic */ EnumC40111tc A03;
    public final /* synthetic */ SXD A04;
    public final /* synthetic */ Integer A05;
    public final /* synthetic */ String A06;
    public final /* synthetic */ String A07;
    public final /* synthetic */ boolean A08;
    public final /* synthetic */ boolean A09;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IgSelfieCaptchaVideoUploader$uploadWithIgVideo$1(InterfaceC58100PpP interfaceC58100PpP, UserSession userSession, EnumC40111tc enumC40111tc, SXD sxd, Integer num, String str, String str2, InterfaceC23621Ds interfaceC23621Ds, boolean z, boolean z2) {
        super(2, interfaceC23621Ds);
        this.A03 = enumC40111tc;
        this.A07 = str;
        this.A04 = sxd;
        this.A02 = userSession;
        this.A08 = z;
        this.A01 = interfaceC58100PpP;
        this.A06 = str2;
        this.A09 = z2;
        this.A05 = num;
    }

    @Override // X.C1Dr
    public final InterfaceC23621Ds create(Object obj, InterfaceC23621Ds interfaceC23621Ds) {
        EnumC40111tc enumC40111tc = this.A03;
        String str = this.A07;
        SXD sxd = this.A04;
        UserSession userSession = this.A02;
        boolean z = this.A08;
        return new IgSelfieCaptchaVideoUploader$uploadWithIgVideo$1(this.A01, userSession, enumC40111tc, sxd, this.A05, str, this.A06, interfaceC23621Ds, z, this.A09);
    }

    @Override // X.InterfaceC16620sF
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((IgSelfieCaptchaVideoUploader$uploadWithIgVideo$1) create(obj, (InterfaceC23621Ds) obj2)).invokeSuspend(C0eB.A00);
    }

    @Override // X.C1Dr
    public final Object invokeSuspend(Object obj) {
        String str;
        String str2;
        Handler handler;
        Runnable tpf;
        Runnable tm1;
        Object obj2 = obj;
        C1JX c1jx = C1JX.A02;
        if (this.A00 != 0) {
            AbstractC09560e7.A00(obj2);
        } else {
            AbstractC09560e7.A00(obj2);
            LinkedHashMap A1I = AbstractC166987dD.A1I();
            EnumC40111tc enumC40111tc = this.A03;
            A1I.put("media_type", String.valueOf(enumC40111tc.A00));
            String str3 = this.A07;
            A1I.put("upload_id", str3);
            SXD sxd = this.A04;
            A1I.put("challenge_id", sxd.A03);
            String str4 = sxd.A05;
            if (str4 != null) {
                A1I.put("entity_id", str4);
            }
            A1I.put("ig_user_id", this.A02.userId);
            String str5 = sxd.A04;
            if (str5 != null) {
                A1I.put("product", str5);
            }
            boolean z = this.A08;
            if (z) {
                str = AuthenticityUploadMedium.SELFIE_VIDEO_NATIVE.getValue();
            } else {
                str = "UNKNOWN";
            }
            A1I.put("upload_medium", str);
            if (!z) {
                A1I.put("document_type", "6");
            }
            FbUploaderUtil fbUploaderUtil = FbUploaderUtil.A00;
            InterfaceC58100PpP interfaceC58100PpP = this.A01;
            if (z) {
                str2 = sxd.A07;
            } else {
                str2 = sxd.A06;
            }
            C55654Onf c55654Onf = new C55654Onf();
            O8O A02 = OY5.A02(enumC40111tc, this.A06, A1I);
            this.A00 = 1;
            obj2 = fbUploaderUtil.A04(interfaceC58100PpP, c55654Onf, A02, str2, str3, "", this, 0);
            if (obj2 == c1jx) {
                return c1jx;
            }
        }
        AbstractC53512Nle abstractC53512Nle = (AbstractC53512Nle) obj2;
        if (abstractC53512Nle instanceof NRT) {
            SXD sxd2 = this.A04;
            handler = sxd2.A01;
            tm1 = new TM0(sxd2);
        } else if (abstractC53512Nle instanceof NRU) {
            SXD sxd3 = this.A04;
            handler = sxd3.A01;
            tm1 = new TM1(sxd3);
        } else {
            if (abstractC53512Nle instanceof NRV) {
                if (this.A09 && this.A05 == C05F.A00) {
                    SXD.A00(this.A02, this.A04, C05F.A01);
                    return C0eB.A00;
                }
                SXD sxd4 = this.A04;
                handler = sxd4.A01;
                tpf = new TPF(abstractC53512Nle, sxd4);
                handler.post(tpf);
                return C0eB.A00;
            }
            throw B4Z.A00();
        }
        tpf = tm1;
        handler.post(tpf);
        return C0eB.A00;
    }
}
