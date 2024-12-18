package X;

import com.instagram.api.schemas.FeedItemType;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* renamed from: X.I2m, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract /* synthetic */ class AbstractC40706I2m {
    public static Map A00(InterfaceC38671qy interfaceC38671qy) {
        LinkedHashMap A1I = AbstractC166987dD.A1I();
        if (interfaceC38671qy.AYe() != null) {
            A1I.put("action_text", interfaceC38671qy.AYe());
        }
        interfaceC38671qy.getDuration();
        A1I.put("duration", Integer.valueOf(interfaceC38671qy.getDuration()));
        interfaceC38671qy.B05();
        A1I.put("dynamic_width_enabled", Boolean.valueOf(interfaceC38671qy.B05()));
        interfaceC38671qy.BAE();
        A1I.put("gradient_animation_enabled", Boolean.valueOf(interfaceC38671qy.BAE()));
        interfaceC38671qy.BF4();
        AbstractC37300Gc1.A12(Long.valueOf(interfaceC38671qy.BF4()), A1I);
        interfaceC38671qy.Cf1();
        A1I.put("is_unit_dismissable", Boolean.valueOf(interfaceC38671qy.Cf1()));
        interfaceC38671qy.BL8();
        A1I.put("large_profile_pictures_enabled", Boolean.valueOf(interfaceC38671qy.BL8()));
        interfaceC38671qy.BOA();
        A1I.put("load_animation_enabled", Boolean.valueOf(interfaceC38671qy.BOA()));
        interfaceC38671qy.BVQ();
        A1I.put("multiple_gradients_enabled", Boolean.valueOf(interfaceC38671qy.BVQ()));
        if (interfaceC38671qy.BWc() != null) {
            FeedItemType BWc = interfaceC38671qy.BWc();
            C14360o3.A0B(BWc, 0);
            A1I.put("netego_type", BWc.A00);
        }
        interfaceC38671qy.BXA();
        A1I.put("no_follow_confirmation", Boolean.valueOf(interfaceC38671qy.BXA()));
        if (interfaceC38671qy.BkC() != null) {
            A1I.put(AbstractC111324zv.A00(1203), interfaceC38671qy.BkC());
        }
        interfaceC38671qy.Bx9();
        A1I.put("shuffle_enabled", Boolean.valueOf(interfaceC38671qy.Bx9()));
        interfaceC38671qy.Bxq();
        A1I.put("smaller_follow_tap_target_enabled", Boolean.valueOf(interfaceC38671qy.Bxq()));
        if (interfaceC38671qy.C3x() != null) {
            List<C47H> C3x = interfaceC38671qy.C3x();
            ArrayList A1E = AbstractC166987dD.A1E();
            for (C47H c47h : C3x) {
                if (c47h != null) {
                    A1E.add(c47h.F7o());
                }
            }
            A1I.put("suggestions", A1E);
        }
        if (interfaceC38671qy.getTitle() != null) {
            AbstractC37300Gc1.A17(interfaceC38671qy.getTitle(), A1I);
        }
        if (interfaceC38671qy.CAR() != null) {
            A1I.put("tracking_token", interfaceC38671qy.CAR());
        }
        return AbstractC06930Yk.A0B(A1I);
    }
}
