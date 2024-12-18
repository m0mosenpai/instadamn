package X;

import com.instagram.infocenter.intf.InfoCenterFactShareInfoIntf;
import com.instagram.infocenter.model.InfoCenterFactShareInfo;

/* loaded from: classes8.dex */
public final /* synthetic */ class MD8 extends C03E implements InterfaceC16620sF {
    public static final MD8 A00 = new MD8();

    public MD8() {
        super(2, LJK.class, "generateInfoCenterFactShareUrl", "generateInfoCenterFactShareUrl(Lcom/instagram/infocenter/intf/InfoCenterFactShareInfoIntf;Lcom/instagram/direct/deeplinking/Environment;)Ljava/lang/String;", 1);
    }

    @Override // X.InterfaceC16620sF
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        InfoCenterFactShareInfoIntf infoCenterFactShareInfoIntf = (InfoCenterFactShareInfoIntf) obj;
        AbstractC167017dG.A1N(infoCenterFactShareInfoIntf, obj2);
        return ((InfoCenterFactShareInfo) infoCenterFactShareInfoIntf).A09;
    }
}
