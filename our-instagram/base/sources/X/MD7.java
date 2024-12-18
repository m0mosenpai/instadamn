package X;

import com.instagram.infocenter.intf.InfoCenterShareInfoIntf;
import com.instagram.infocenter.model.ShareInfo;

/* loaded from: classes8.dex */
public final /* synthetic */ class MD7 extends C03E implements InterfaceC16620sF {
    public static final MD7 A00 = new MD7();

    public MD7() {
        super(2, LJK.class, "generateInfoCenterShareUrl", "generateInfoCenterShareUrl(Lcom/instagram/infocenter/intf/InfoCenterShareInfoIntf;Lcom/instagram/direct/deeplinking/Environment;)Ljava/lang/String;", 1);
    }

    @Override // X.InterfaceC16620sF
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        InfoCenterShareInfoIntf infoCenterShareInfoIntf = (InfoCenterShareInfoIntf) obj;
        AbstractC167017dG.A1N(infoCenterShareInfoIntf, obj2);
        return ((ShareInfo) infoCenterShareInfoIntf).A07;
    }
}
