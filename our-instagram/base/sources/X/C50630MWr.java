package X;

import com.facebook.commonavatarliveediting.CdlProviderImpl;
import com.instagram.pendingmedia.service.upload.ImageUploadUtil;

/* renamed from: X.MWr, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C50630MWr extends C1Dq {
    public int A00;
    public long A01;
    public Object A02;
    public Object A03;
    public Object A04;
    public final int A05;
    public final Object A06;

    @Override // X.C1Dr
    public final Object invokeSuspend(Object obj) {
        int i = this.A05;
        Object A00 = A00(obj, this);
        switch (i) {
            case 0:
                return CdlProviderImpl.A00(null, (CdlProviderImpl) A00, null, null, this, null, 0L);
            case 1:
                return C2043992v.A00((C2043992v) A00, null, null, this);
            case 2:
                return C43612JQv.A00((C43612JQv) A00, null, null, this, 0L);
            case 3:
                return ImageUploadUtil.A02(null, (ImageUploadUtil) A00, this);
            default:
                return C51080Mhe.A00((C51080Mhe) A00, null, this);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C50630MWr(Object obj, InterfaceC23621Ds interfaceC23621Ds, int i) {
        super(interfaceC23621Ds);
        this.A05 = i;
        this.A06 = obj;
    }

    public static Object A00(Object obj, C50630MWr c50630MWr) {
        c50630MWr.A04 = obj;
        c50630MWr.A00 |= Integer.MIN_VALUE;
        return c50630MWr.A06;
    }

    public static boolean A01(Object obj, int i) {
        if ((obj instanceof C50630MWr) && ((C50630MWr) obj).A05 == i) {
            return true;
        }
        return false;
    }
}
