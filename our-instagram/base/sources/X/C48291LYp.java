package X;

import android.app.Activity;
import android.content.Context;
import androidx.fragment.app.Fragment;
import com.instagram.common.session.UserSession;
import java.util.Map;
import java.util.concurrent.Callable;

/* renamed from: X.LYp, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C48291LYp implements InterfaceC23471Cj {
    public final int A00;
    public final Object A01;
    public final Object A02;

    public C48291LYp(int i, Object obj, Object obj2) {
        this.A00 = i;
        this.A02 = obj2;
        this.A01 = obj;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:3:0x0002. Please report as an issue. */
    @Override // X.InterfaceC23471Cj
    public final void DYE(Map map) {
        Context context;
        String str;
        int i;
        Context context2;
        int i2;
        Context context3;
        int i3;
        String str2;
        Object obj;
        C3DN A0r;
        String str3;
        try {
            switch (this.A00) {
                case 0:
                    Object obj2 = map.get("android.permission.WRITE_EXTERNAL_STORAGE");
                    if (obj2 == EnumC172127lh.A05) {
                        ((Callable) this.A01).call();
                        return;
                    }
                    if (obj2 == EnumC172127lh.A04) {
                        context2 = ((L8D) this.A02).A03;
                        C14360o3.A0C(context2, "null cannot be cast to non-null type android.app.Activity");
                        WGH.A01((Activity) context2);
                        return;
                    } else {
                        if (obj2 != EnumC172127lh.A03) {
                            return;
                        }
                        context = ((L8D) this.A02).A03;
                        str = "qr_code_save_permission_denied";
                        i = 2131968168;
                        C9GR.A0F(context, str, i);
                        return;
                    }
                case 1:
                    C14360o3.A0B(map, 0);
                    EnumC172127lh enumC172127lh = (EnumC172127lh) map.get("android.permission.WRITE_EXTERNAL_STORAGE");
                    if (enumC172127lh == null) {
                        return;
                    }
                    int ordinal = enumC172127lh.ordinal();
                    i2 = 1;
                    if (ordinal != 2) {
                        if (ordinal != 0) {
                            return;
                        }
                        obj = this.A02;
                        AbstractC166987dD.A1Y(obj);
                        return;
                    }
                    context3 = (Context) this.A01;
                    i3 = 2131972760;
                    str2 = "ify_save_media_permission_failure_toast";
                    C9GR.A01(context3, str2, i3, i2);
                    return;
                case 2:
                    C14360o3.A0B(map, 0);
                    EnumC172127lh enumC172127lh2 = (EnumC172127lh) map.get("android.permission.WRITE_EXTERNAL_STORAGE");
                    if (enumC172127lh2 == null) {
                        return;
                    }
                    int ordinal2 = enumC172127lh2.ordinal();
                    if (ordinal2 != 0) {
                        if (ordinal2 != 1 && ordinal2 != 2) {
                            return;
                        }
                        obj = this.A01;
                        AbstractC166987dD.A1Y(obj);
                        return;
                    }
                    obj = this.A02;
                    AbstractC166987dD.A1Y(obj);
                    return;
                case 3:
                    Fragment fragment = (Fragment) this.A02;
                    if (fragment == null || (A0r = AbstractC31172DnG.A0r((Activity) this.A01)) == null) {
                        return;
                    }
                    A0r.A0K(fragment);
                    return;
                case 4:
                    C14360o3.A0B(map, 0);
                    if (AbstractC93174Ft.A00(map) != EnumC172127lh.A05 && !AbstractC93174Ft.A03((Context) this.A01)) {
                        return;
                    }
                    obj = this.A02;
                    AbstractC166987dD.A1Y(obj);
                    return;
                case 5:
                    C14360o3.A0B(map, 0);
                    EnumC172127lh enumC172127lh3 = (EnumC172127lh) map.get("android.permission.WRITE_EXTERNAL_STORAGE");
                    if (enumC172127lh3 == null) {
                        return;
                    }
                    int ordinal3 = enumC172127lh3.ordinal();
                    i2 = 1;
                    if (ordinal3 != 2) {
                        if (ordinal3 != 0) {
                            return;
                        }
                        obj = this.A01;
                        AbstractC166987dD.A1Y(obj);
                        return;
                    }
                    context3 = ((C48261LXk) this.A02).A00;
                    i3 = 2131960387;
                    str2 = "direct_save_fail_external_storage_permission_toast";
                    C9GR.A01(context3, str2, i3, i2);
                    return;
                case 6:
                    Object obj3 = map.get("android.permission.WRITE_EXTERNAL_STORAGE");
                    if (obj3 == EnumC172127lh.A05) {
                        ((Callable) this.A01).call();
                        return;
                    }
                    if (obj3 == EnumC172127lh.A04) {
                        context2 = ((C47773L7v) this.A02).A01;
                        C14360o3.A0C(context2, "null cannot be cast to non-null type android.app.Activity");
                        WGH.A01((Activity) context2);
                        return;
                    } else {
                        if (obj3 != EnumC172127lh.A03) {
                            return;
                        }
                        context = ((C47773L7v) this.A02).A01;
                        str = "profile_card_save_permission_denied";
                        i = 2131970098;
                        C9GR.A0F(context, str, i);
                        return;
                    }
                case 7:
                    Object obj4 = map.get("android.permission.WRITE_EXTERNAL_STORAGE");
                    if (obj4 == EnumC172127lh.A05) {
                        ((Callable) this.A01).call();
                        return;
                    }
                    if (obj4 == EnumC172127lh.A04) {
                        context2 = ((LLI) this.A02).A04;
                        if (!(context2 instanceof Activity)) {
                            return;
                        }
                        WGH.A01((Activity) context2);
                        return;
                    }
                    if (obj4 != EnumC172127lh.A03) {
                        return;
                    }
                    C9GR.A0F(((LLI) this.A02).A04, "qr_code_save_permission_denied", 2131968168);
                    return;
                default:
                    C62918SWz c62918SWz = (C62918SWz) this.A01;
                    UserSession userSession = (UserSession) this.A02;
                    Object obj5 = map.get("android.permission.CAMERA");
                    EnumC172127lh enumC172127lh4 = EnumC172127lh.A05;
                    if (obj5 == enumC172127lh4) {
                        C62918SWz.A00(c62918SWz);
                    }
                    if (obj5 == EnumC172127lh.A04) {
                        WGH.A02((Activity) c62918SWz.A03, 2131954587);
                    }
                    Object obj6 = map.get("android.permission.CAMERA");
                    if (obj6 != null) {
                        if (obj6.equals(enumC172127lh4)) {
                            str3 = "app_permission_grant";
                        } else {
                            str3 = "app_permission_deny";
                        }
                        AbstractC43594JPz.A1N(new C4I7(new C48251LXa(c62918SWz), userSession), C4I8.A00(userSession), str3, "VERIFICATION_REQUEST_TAKE_PHOTO_HELPER", AbstractC166987dD.A1J(C4I9.UNKNOWN));
                        return;
                    }
                    return;
            }
        } catch (Exception unused) {
        }
    }
}
