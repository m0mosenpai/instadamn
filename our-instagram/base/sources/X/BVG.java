package X;

import android.os.Bundle;
import com.instagram.common.typedurl.ImageUrl;
import java.util.List;

/* loaded from: classes5.dex */
public final class BVG extends C03E implements InterfaceC16570sA {
    public final int A00;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public BVG(java.lang.Object r8, int r9) {
        /*
            r7 = this;
            r0 = r7
            r7.A00 = r9
            if (r9 == 0) goto L12
            java.lang.Class<X.IdY> r3 = X.C41704IdY.class
            r1 = 6
            java.lang.String r4 = "launchAudioPage"
            java.lang.String r5 = "launchAudioPage(Lcom/instagram/clips/model/metadata/ClipsAudioMetadata;Ljava/util/List;Ljava/lang/String;Lcom/facebook/analytics/structuredlogger/enums/InstagramPivotPageEntryPoint;Lcom/instagram/api/schemas/MidCardInfoV2;Ljava/lang/String;)V"
        Lc:
            r6 = 0
            r2 = r8
            r0.<init>(r1, r2, r3, r4, r5, r6)
            return
        L12:
            java.lang.Class<X.Brg> r3 = X.C26759Brg.class
            r1 = 6
            java.lang.String r4 = "onCreateAiClicked"
            java.lang.String r5 = "onCreateAiClicked(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/instagram/common/typedurl/ImageUrl;Ljava/lang/String;Ljava/lang/String;)V"
            goto Lc
        */
        throw new UnsupportedOperationException("Method not decompiled: X.BVG.<init>(java.lang.Object, int):void");
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x000c. Please report as an issue. */
    @Override // X.InterfaceC16570sA
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6) {
        switch (this.A00) {
            case 0:
                String str = (String) obj;
                String str2 = (String) obj2;
                String str3 = (String) obj3;
                ImageUrl imageUrl = (ImageUrl) obj4;
                String str4 = (String) obj5;
                C14360o3.A0B(str, 0);
                AbstractC167027dH.A0a(1, str2, str3, imageUrl, str4);
                C14360o3.A0B(obj6, 5);
                C26759Brg c26759Brg = (C26759Brg) this.receiver;
                C28484Chc A0q = AbstractC25226BEj.A0q(c26759Brg.A00);
                InterfaceC09390do interfaceC09390do = c26759Brg.A02;
                String A02 = C25879Bce.A02(interfaceC09390do);
                C25531Mh A00 = C28484Chc.A00(A0q);
                if (AbstractC25226BEj.A1Z(A00)) {
                    AbstractC25230BEn.A1E(A00, "creation_template_details_screen_create_ai_clicked", A02);
                }
                AbstractC25226BEj.A0n(interfaceC09390do).A00.A0B.Egh(str2);
                C25879Bce A0n = AbstractC25226BEj.A0n(interfaceC09390do);
                InterfaceC09390do interfaceC09390do2 = c26759Brg.A01;
                A0n.A00.A07(imageUrl, str2, str4, A0n.A02, str, str2, str3, AbstractC28459ChB.A05(AbstractC166987dD.A0r(interfaceC09390do2)));
                Bundle A0b = AbstractC166987dD.A0b();
                A0b.putString("AiStudioArgumentKeys.selected_template_option_id", str4);
                C140966Yy A0j = AbstractC25233BEq.A0j(c26759Brg, interfaceC09390do2);
                C26825Bsn c26825Bsn = new C26825Bsn();
                c26825Bsn.setArguments(A0b);
                AbstractC25229BEm.A18(c26825Bsn, A0j);
                return C0eB.A00;
            case 1:
            case 2:
            case 3:
            case 4:
                InterfaceC88553xD interfaceC88553xD = (InterfaceC88553xD) obj;
                List list = (List) obj2;
                String str5 = (String) obj6;
                AbstractC167017dG.A1N(interfaceC88553xD, list);
                C14360o3.A0B(str5, 5);
                C41704IdY c41704IdY = (C41704IdY) this.receiver;
                c41704IdY.A04((C8JW) obj4, interfaceC88553xD, (String) obj3, str5, list);
                return C0eB.A00;
            default:
                return null;
        }
    }
}
