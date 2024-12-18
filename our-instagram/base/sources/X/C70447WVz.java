package X;

import com.instagram.api.schemas.XFBYPRequestStatus;
import com.instagram.react.modules.product.IgReactPurchaseExperienceBridgeModule;

/* renamed from: X.WVz, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C70447WVz implements InterfaceC48192Ji {
    public final /* synthetic */ C2OS A00;

    public C70447WVz(C2OS c2os) {
        this.A00 = c2os;
    }

    @Override // X.InterfaceC48192Ji
    public final void invoke(AnonymousClass436 anonymousClass436) {
        C2JS c2js;
        C2JS optionalTreeField;
        if (anonymousClass436 != null && (c2js = (C2JS) anonymousClass436.Bos()) != null && (optionalTreeField = c2js.getOptionalTreeField(0, "ig_supervised_user_screen_time_settings_subscribe(data:$input)", C67121Ugr.class, 1694447208)) != null) {
            C2OS c2os = this.A00;
            Integer A0Z = AbstractC37304Gc5.A0Z(optionalTreeField, "screen_time_daily_limit_seconds", 0);
            Integer A0Z2 = AbstractC37304Gc5.A0Z(optionalTreeField, "daily_limit_without_extensions_seconds", 1);
            C2JS optionalTreeField2 = optionalTreeField.getOptionalTreeField(2, "latest_valid_time_limit_extension_request", C67120Ugq.class, 1406016395);
            E8G e8g = null;
            String str = null;
            if (optionalTreeField2 != null) {
                Integer A0Z3 = AbstractC37304Gc5.A0Z(optionalTreeField2, AbstractC111324zv.A00(964), 0);
                String optionalStringField = optionalTreeField2.getOptionalStringField(2, "strong_id__");
                EnumC33435Eq6 enumC33435Eq6 = (EnumC33435Eq6) optionalTreeField2.getOptionalEnumField(3, IgReactPurchaseExperienceBridgeModule.RN_SHOP_PAY_STATUS, EnumC33435Eq6.UNSET_OR_UNRECOGNIZED_ENUM_VALUE);
                if (enumC33435Eq6 != null) {
                    str = enumC33435Eq6.name();
                }
                XFBYPRequestStatus xFBYPRequestStatus = (XFBYPRequestStatus) XFBYPRequestStatus.A01.get(str);
                if (xFBYPRequestStatus == null) {
                    xFBYPRequestStatus = XFBYPRequestStatus.A08;
                }
                e8g = new E8G(xFBYPRequestStatus, A0Z3, optionalTreeField2.getOptionalStringField(1, AbstractC111324zv.A00(866)), optionalStringField);
            }
            C2OS.A00(e8g, c2os, AbstractC31174DnI.A0o(optionalTreeField, "is_daily_limit_enforcement_non_blocking", 3), A0Z, A0Z2);
        }
    }
}
