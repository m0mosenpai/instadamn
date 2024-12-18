package com.instagram.authenticity.uploader;

import X.AbstractC09560e7;
import X.AbstractC166987dD;
import X.AbstractC23611Dp;
import X.AbstractC53512Nle;
import X.B4Z;
import X.C0eB;
import X.C14360o3;
import X.C1JX;
import X.C55654Onf;
import X.C64446TEg;
import X.EnumC40111tc;
import X.InterfaceC16620sF;
import X.InterfaceC23621Ds;
import X.InterfaceC58100PpP;
import X.NRT;
import X.NRU;
import X.NRV;
import X.O8O;
import X.OY5;
import X.RunnableC64665TOw;
import X.SO9;
import X.TLV;
import X.TRA;
import android.os.Handler;
import com.facebook.smartcapture.logging.AuthenticityUploadMedium;
import com.instagram.pendingmedia.service.upload.FbUploaderUtil;
import java.io.File;
import java.util.LinkedHashMap;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.instagram.authenticity.uploader.AuthenticityMediaServiceUploader$upload$2", f = "AuthenticityMediaServiceUploader.kt", i = {}, l = {70}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes10.dex */
public final class AuthenticityMediaServiceUploader$upload$2 extends AbstractC23611Dp implements InterfaceC16620sF {
    public int A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ InterfaceC58100PpP A02;
    public final /* synthetic */ C64446TEg A03;
    public final /* synthetic */ SO9 A04;
    public final /* synthetic */ EnumC40111tc A05;
    public final /* synthetic */ File A06;
    public final /* synthetic */ String A07;
    public final /* synthetic */ String A08;
    public final /* synthetic */ String A09;
    public final /* synthetic */ String A0A;
    public final /* synthetic */ String A0B;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AuthenticityMediaServiceUploader$upload$2(InterfaceC58100PpP interfaceC58100PpP, C64446TEg c64446TEg, SO9 so9, EnumC40111tc enumC40111tc, File file, String str, String str2, String str3, String str4, String str5, InterfaceC23621Ds interfaceC23621Ds, int i) {
        super(2, interfaceC23621Ds);
        this.A05 = enumC40111tc;
        this.A0A = str;
        this.A03 = c64446TEg;
        this.A09 = str2;
        this.A0B = str3;
        this.A02 = interfaceC58100PpP;
        this.A06 = file;
        this.A07 = str4;
        this.A04 = so9;
        this.A08 = str5;
        this.A01 = i;
    }

    @Override // X.C1Dr
    public final InterfaceC23621Ds create(Object obj, InterfaceC23621Ds interfaceC23621Ds) {
        EnumC40111tc enumC40111tc = this.A05;
        String str = this.A0A;
        C64446TEg c64446TEg = this.A03;
        String str2 = this.A09;
        String str3 = this.A0B;
        return new AuthenticityMediaServiceUploader$upload$2(this.A02, c64446TEg, this.A04, enumC40111tc, this.A06, str, str2, str3, this.A07, this.A08, interfaceC23621Ds, this.A01);
    }

    @Override // X.C1Dr
    public final Object invokeSuspend(Object obj) {
        Handler handler;
        Runnable tra;
        Runnable runnableC64665TOw;
        Object obj2 = obj;
        C1JX c1jx = C1JX.A02;
        if (this.A00 != 0) {
            AbstractC09560e7.A00(obj);
        } else {
            AbstractC09560e7.A00(obj);
            LinkedHashMap A1I = AbstractC166987dD.A1I();
            EnumC40111tc enumC40111tc = this.A05;
            A1I.put("media_type", String.valueOf(enumC40111tc.A00));
            String str = this.A0A;
            A1I.put("upload_id", str);
            A1I.put("ig_user_id", this.A03.A02.userId);
            A1I.put("product", this.A09);
            String str2 = this.A0B;
            A1I.put("upload_medium", str2);
            if (!C14360o3.A0K(str2, AuthenticityUploadMedium.SELFIE_VIDEO_NATIVE.getValue())) {
                A1I.put("document_type", "6");
            }
            FbUploaderUtil fbUploaderUtil = FbUploaderUtil.A00;
            InterfaceC58100PpP interfaceC58100PpP = this.A02;
            String canonicalPath = this.A06.getCanonicalPath();
            C55654Onf c55654Onf = new C55654Onf();
            O8O A02 = OY5.A02(enumC40111tc, this.A07, A1I);
            this.A00 = 1;
            obj2 = fbUploaderUtil.A04(interfaceC58100PpP, c55654Onf, A02, canonicalPath, str, "", this, 0);
            if (obj2 == c1jx) {
                return c1jx;
            }
        }
        AbstractC53512Nle abstractC53512Nle = (AbstractC53512Nle) obj2;
        if (abstractC53512Nle instanceof NRT) {
            handler = this.A03.A01;
            tra = new TLV(this.A04);
        } else {
            if (abstractC53512Nle instanceof NRU) {
                C64446TEg c64446TEg = this.A03;
                SO9 so9 = this.A04;
                handler = c64446TEg.A01;
                runnableC64665TOw = new RunnableC64665TOw(c64446TEg, so9);
                handler.post(runnableC64665TOw);
                return C0eB.A00;
            }
            if (abstractC53512Nle instanceof NRV) {
                C64446TEg c64446TEg2 = this.A03;
                handler = c64446TEg2.A01;
                tra = new TRA(c64446TEg2, this.A04, abstractC53512Nle, this.A08, this.A01);
            } else {
                throw B4Z.A00();
            }
        }
        runnableC64665TOw = tra;
        handler.post(runnableC64665TOw);
        return C0eB.A00;
    }

    @Override // X.InterfaceC16620sF
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((AuthenticityMediaServiceUploader$upload$2) create(obj, (InterfaceC23621Ds) obj2)).invokeSuspend(C0eB.A00);
    }
}
