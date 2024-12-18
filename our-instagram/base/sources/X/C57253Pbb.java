package X;

import android.content.Context;
import androidx.fragment.app.Fragment;
import com.facebook.catalyst.modules.cameraroll.CameraRollManager;
import com.facebook.forker.Process;
import com.instagram.common.session.UserSession;

/* renamed from: X.Pbb, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C57253Pbb extends C0YY implements InterfaceC16820sZ {
    public final int A00;
    public final Object A01;
    public final Object A02;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C57253Pbb(int i, Object obj, Object obj2) {
        super(0);
        this.A00 = i;
        this.A01 = obj;
        this.A02 = obj2;
    }

    @Override // X.InterfaceC16820sZ
    public final /* bridge */ /* synthetic */ Object invoke() {
        Object invoke;
        C07N c07n;
        InterfaceC52932ba defaultViewModelProviderFactory;
        C07N c07n2;
        Object invoke2;
        switch (this.A00) {
            case 4:
                return new C25I((Context) this.A01, (UserSession) this.A02);
            case 5:
                return ((InterfaceC449925e) this.A02).getContentInBackground((Context) this.A01);
            case 6:
                C54762OHr c54762OHr = (C54762OHr) this.A01;
                AnonymousClass266 anonymousClass266 = (AnonymousClass266) this.A02;
                return c54762OHr.A00(anonymousClass266.getFilenamePrefix(), anonymousClass266.getFilenameSuffix());
            case 7:
                return new YE3((InterfaceC11380iw) this.A01, (UserSession) this.A02);
            case 11:
            case 14:
                InterfaceC018407e A0i = AbstractC25228BEl.A0i(this.A01);
                if ((A0i instanceof C07N) && (c07n = (C07N) A0i) != null && (defaultViewModelProviderFactory = c07n.getDefaultViewModelProviderFactory()) != null) {
                    return defaultViewModelProviderFactory;
                }
                return ((Fragment) this.A02).getDefaultViewModelProviderFactory();
            case Process.SIGTERM /* 15 */:
            case 16:
            case Process.SIGSTOP /* 19 */:
            case 21:
            case 25:
            case 27:
            case 28:
            case CameraRollManager.IMAGES_MEDIA_LATITUDE_LONGITUDE_DEPRECATED_API_LEVEL /* 29 */:
            case 30:
            case 31:
                InterfaceC16820sZ interfaceC16820sZ = (InterfaceC16820sZ) this.A01;
                if (interfaceC16820sZ != null && (invoke = interfaceC16820sZ.invoke()) != null) {
                    return invoke;
                }
                return AbstractC25231BEo.A0V(this.A02);
            case 47:
                AbstractC25651Mw.A00((AbstractC12990ll) this.A02).E4s(new C55981OtE((C38321qM) this.A01));
                break;
            case 48:
                UserSession userSession = (UserSession) this.A02;
                C25671My A00 = AbstractC25651Mw.A00(userSession);
                C38321qM c38321qM = (C38321qM) this.A01;
                A00.E4s(new C55981OtE(c38321qM));
                c38321qM.A0C.ES4(null);
                AbstractC37301Gc2.A1O(userSession, c38321qM);
                break;
            case 49:
                ((C1821385x) this.A02).A00.A07((C83L) this.A01);
                break;
            default:
                InterfaceC16820sZ interfaceC16820sZ2 = (InterfaceC16820sZ) this.A01;
                if (interfaceC16820sZ2 == null || (invoke2 = interfaceC16820sZ2.invoke()) == null) {
                    InterfaceC018407e A0i2 = AbstractC25228BEl.A0i(this.A02);
                    if ((A0i2 instanceof C07N) && (c07n2 = (C07N) A0i2) != null) {
                        return c07n2.getDefaultViewModelCreationExtras();
                    }
                    return C52962bd.A00;
                }
                return invoke2;
        }
        return C0eB.A00;
    }
}
