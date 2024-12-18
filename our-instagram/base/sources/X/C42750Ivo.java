package X;

import android.content.Context;
import com.instagram.api.schemas.ProfileGridItemTypeEnum;
import com.instagram.common.session.UserSession;
import java.util.List;

/* renamed from: X.Ivo, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C42750Ivo implements InterfaceC61732ra {
    public final /* synthetic */ EnumC125765mR A00;

    public C42750Ivo(EnumC125765mR enumC125765mR) {
        this.A00 = enumC125765mR;
    }

    @Override // X.InterfaceC61732ra
    public final /* bridge */ /* synthetic */ List AMo(Context context, InterfaceC11380iw interfaceC11380iw, UserSession userSession, Object obj, int i) {
        C38321qM c38321qM;
        IM8 im8 = (IM8) obj;
        C14360o3.A0B(im8, 4);
        int i2 = i % 3;
        int i3 = i / 3;
        if (im8.A01 == ProfileGridItemTypeEnum.A05 && (c38321qM = im8.A02) != null) {
            return AbstractC166987dD.A1J(new C9BP(AbstractC153326v1.A00(context, interfaceC11380iw, userSession, c38321qM, this.A00, null, i3, i2), i, i2));
        }
        return AbstractC166987dD.A1E();
    }
}
